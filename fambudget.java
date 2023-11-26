import java.util.ArrayList;
import java.util.Scanner;

class fambudget {
    private String name;
    private ArrayList<BudgetItem> items;

    public FamilyMember(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public void addBudgetItem(BudgetItem item) {
        items.add(item);
    }

    public ArrayList<BudgetItem> getItems() {
        return items;
    }

    public String getName() {
        return name;
    }
}

class BudgetItem {
    private String description;
    private double amount;
    private boolean isIncome;

    public BudgetItem(String description, double amount, boolean isIncome) {
        this.description = description;
        this.amount = amount;
        this.isIncome = isIncome;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isIncome() {
        return isIncome;
    }
}

class FamilyBudget {
    private ArrayList<FamilyMember> members;

    public FamilyBudget() {
        this.members = new ArrayList<>();
    }

    public void addFamilyMember(FamilyMember member) {
        members.add(member);
    }

    public void displayBudgetSummary() {
        double totalIncome = 0;
        double totalExpenses = 0;

        for (FamilyMember member : members) {
            System.out.println("Budget for " + member.getName() + ":");
            for (BudgetItem item : member.getItems()) {
                if (item.isIncome()) {
                    totalIncome += item.getAmount();
                    System.out.println("Income: " + item.getAmount());
                } else {
                    totalExpenses += item.getAmount();
                    System.out.println("Expense: " + item.getAmount());
                }
            }
            System.out.println();
        }

        System.out.println("Total Income: " + totalIncome);
        System.out.println("Total Expenses: " + totalExpenses);
        System.out.println("Net Income: " + (totalIncome - totalExpenses));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FamilyBudget budget = new FamilyBudget();

        System.out.println("Enter number of family members:");
        int memberCount = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < memberCount; i++) {
            System.out.println("Enter the name of family member:");
            String name = scanner.nextLine();
            FamilyMember member = new FamilyMember(name);

            System.out.println("Enter number of income and expense items for " + name + ":");
            int itemCount = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            for (int j = 0; j < itemCount; j++) {
                System.out.println("Enter description:");
                String description = scanner.nextLine();

                System.out.println("Enter amount:");
                double amount = scanner.nextDouble();

                System.out.println("Is this income? (true/false)");
                boolean isIncome = scanner.nextBoolean();
                scanner.nextLine(); // Consume newline

                member.addBudgetItem(new BudgetItem(description, amount, isIncome));
            }

            budget.addFamilyMember(member);
        }

        budget.displayBudgetSummary();
    }
}

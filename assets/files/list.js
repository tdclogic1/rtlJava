import { list } from 'aws-amplify/storage';

try {
  const result = await list({
    prefix: 'photos/'
  });
} catch (error) {
  console.log(error);
}
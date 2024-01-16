import { remove } from 'aws-amplify/storage';

try {
  await remove({ key: filename });
} catch (error) {
  console.log('Error ', error);
}
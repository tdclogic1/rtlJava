import { getUrl } from 'aws-amplify/storage';

const getUrlResult = await getUrl({
  key: filename,
});
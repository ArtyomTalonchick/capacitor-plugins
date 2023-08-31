import { registerPlugin } from '@capacitor/core';

import type { UserAgentPlugin } from './definitions';

const UserAgent = registerPlugin<UserAgentPlugin>('UserAgent', {
  web: () => import('./web').then(m => new m.UserAgentPluginWeb()),
});

export * from './definitions';
export { UserAgent };

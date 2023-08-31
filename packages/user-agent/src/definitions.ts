export interface UserAgentPlugin {
  set(options: {userAgent: string}): Promise<{ userAgent: string }>;
  get(): Promise<{ userAgent: string }>;
  reset(): Promise<void>;
}

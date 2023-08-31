#import <Foundation/Foundation.h>
#import <Capacitor/Capacitor.h>

// Define the plugin using the CAP_PLUGIN Macro, and
// each method the plugin supports using the CAP_PLUGIN_METHOD macro.
CAP_PLUGIN(UserAgentPlugin, "UserAgent",
           CAP_PLUGIN_METHOD(get, CAPPluginReturnPromise);
           CAP_PLUGIN_METHOD(set, CAPPluginReturnNone);
           CAP_PLUGIN_METHOD(reset, CAPPluginReturnNone);
)

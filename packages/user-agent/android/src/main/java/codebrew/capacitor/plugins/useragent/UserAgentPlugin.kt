package codebrew.capacitor.plugins.useragent

import android.webkit.WebSettings
import com.getcapacitor.JSObject
import com.getcapacitor.Plugin
import com.getcapacitor.PluginCall
import com.getcapacitor.PluginMethod
import com.getcapacitor.annotation.CapacitorPlugin


@CapacitorPlugin(name = "UserAgent")
class UserAgentPlugin : Plugin() {
    private var settings: WebSettings? = null
    override fun load() {
        settings = bridge.webView.settings
    }

    @PluginMethod
    fun get(call: PluginCall) {
        val ret = JSObject()
        val userAgent = settings?.userAgentString
        ret.put("userAgent", userAgent)
        call.resolve(ret)
    }

    @PluginMethod
    fun set(call: PluginCall) {
        val value = call.getString("userAgent", null)
        settings?.userAgentString = value
        val ret = JSObject()
        ret.put("userAgent", settings?.userAgentString)
        call.resolve(ret)
    }

    @PluginMethod
    fun reset(call: PluginCall) {
        settings!!.userAgentString = null
        val ret = JSObject()

        call.resolve()
    }
}


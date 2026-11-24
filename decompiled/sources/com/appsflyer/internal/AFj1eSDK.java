package com.appsflyer.internal;

import a.a8z;
import a.maz;
import a.xp20;
import com.appsflyer.share.platform_extension.Plugin;
import com.appsflyer.share.platform_extension.PluginInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1eSDK implements AFj1cSDK {
    private final a8z AFKeystoreWrapper = maz.b(new com.appsflyer.c(5));
    private PluginInfo AFLogger;

    /* JADX INFO: Access modifiers changed from: private */
    public static final PluginInfo AFKeystoreWrapper() {
        return new PluginInfo(Plugin.NATIVE, "7.0.1", null, 4, null);
    }

    @Override // com.appsflyer.internal.AFj1cSDK
    public final Map<String, Object> AFLogger() {
        PluginInfo pluginInfo = this.AFLogger;
        if (pluginInfo == null) {
            pluginInfo = (PluginInfo) this.AFKeystoreWrapper.getValue();
        }
        Pair pair = new Pair("platform", pluginInfo.getPlugin().getPluginName());
        PluginInfo pluginInfo2 = this.AFLogger;
        if (pluginInfo2 == null) {
            pluginInfo2 = (PluginInfo) this.AFKeystoreWrapper.getValue();
        }
        LinkedHashMap linkedHashMapH = xp20.h(pair, new Pair("version", pluginInfo2.getVersion()));
        PluginInfo pluginInfo3 = this.AFLogger;
        if (pluginInfo3 == null) {
            pluginInfo3 = (PluginInfo) this.AFKeystoreWrapper.getValue();
        }
        if (!pluginInfo3.getAdditionalParams().isEmpty()) {
            PluginInfo pluginInfo4 = this.AFLogger;
            if (pluginInfo4 == null) {
                pluginInfo4 = (PluginInfo) this.AFKeystoreWrapper.getValue();
            }
            linkedHashMapH.put("extras", pluginInfo4.getAdditionalParams());
        }
        return linkedHashMapH;
    }

    @Override // com.appsflyer.internal.AFj1cSDK
    public final void registerClient(PluginInfo pluginInfo) {
        pluginInfo.getClass();
        this.AFLogger = pluginInfo;
    }

    @Override // com.appsflyer.internal.AFj1cSDK
    public final String unregisterClient() {
        PluginInfo pluginInfo = this.AFLogger;
        if (pluginInfo == null) {
            pluginInfo = (PluginInfo) this.AFKeystoreWrapper.getValue();
        }
        return pluginInfo.getPlugin().getPluginName();
    }
}

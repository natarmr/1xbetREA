package okhttp3.internal.publicsuffix;

import a.emk0;
import a.ohq;
import a.w9x;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import okhttp3.internal.platform.ContextAwarePlatform;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/publicsuffix/AssetPublicSuffixList;", "Lokhttp3/internal/publicsuffix/BasePublicSuffixList;", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AssetPublicSuffixList extends BasePublicSuffixList {
    public final String f = "PublicSuffixDatabase.list";

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/publicsuffix/AssetPublicSuffixList$Companion;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    public final emk0 b() throws IOException {
        Platform platform = Platform.f46208a;
        Object obj = Platform.f46208a;
        ContextAwarePlatform contextAwarePlatform = obj != null ? (ContextAwarePlatform) obj : null;
        Context c = contextAwarePlatform != null ? contextAwarePlatform.getC() : null;
        AssetManager assets = c != null ? c.getAssets() : null;
        if (assets != null) {
            InputStream inputStreamOpen = assets.open(this.f);
            inputStreamOpen.getClass();
            return w9x.L(inputStreamOpen);
        }
        if (Build.FINGERPRINT == null) {
            ohq.l("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            return null;
        }
        ohq.l("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        return null;
    }
}

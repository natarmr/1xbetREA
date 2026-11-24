package a;

import android.os.Bundle;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class utu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f36273a;
    public final Bundle b;
    public final Set c;
    public final String d;

    public utu(String str) {
        Bundle bundleY0 = dub.y0(str);
        Bundle bundleY1 = dub.y0(str);
        xun xunVar = xun.f41520a;
        xunVar.getClass();
        this.f36273a = bundleY0;
        this.b = bundleY1;
        this.c = xunVar;
        bundleY0.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", true);
        bundleY1.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", true);
        bundleY0.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 2000);
        bundleY1.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 2000);
        this.d = str;
        if (str.length() > 0) {
            return;
        }
        jf4.o("serverClientId should not be empty");
        throw null;
    }
}

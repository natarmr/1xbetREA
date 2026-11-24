package a;

import android.content.pm.PackageInfo;
import android.gov.nist.core.Separators;
import android.net.Uri;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class v4v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f36801a;

    static {
        Uri.parse(Separators.STAR);
        Uri.parse("");
        f36801a = new WeakHashMap();
    }

    public static PackageInfo a() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }
}

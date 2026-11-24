package a;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class x4v0 extends ta3 {
    public final Pattern d;

    public x4v0() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.d = Pattern.compile("\\A\\d+");
    }

    @Override // a.ta3
    public final boolean b() {
        int i;
        PackageInfo packageInfoA;
        boolean zB = super.b();
        if (!zB || (i = Build.VERSION.SDK_INT) >= 29) {
            return zB;
        }
        WeakHashMap weakHashMap = v4v0.f36801a;
        if (i >= 26) {
            packageInfoA = WebView.getCurrentWebViewPackage();
        } else {
            try {
                packageInfoA = v4v0.a();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfoA = null;
            }
        }
        if (packageInfoA == null) {
            return false;
        }
        Matcher matcher = this.d.matcher(packageInfoA.versionName);
        return matcher.find() && Integer.parseInt(packageInfoA.versionName.substring(matcher.start(), matcher.end())) >= 105;
    }
}

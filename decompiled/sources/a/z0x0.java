package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z0x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gx3 f43591a = new gx3(0);

    public static synchronized Uri a() {
        gx3 gx3Var = f43591a;
        Uri uri = (Uri) gx3Var.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        gx3Var.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }

    public static String b(Context context, String str) {
        if (str.contains(Separators.POUND)) {
            jf4.o("The passed in package cannot already have a subpackage: ".concat(str));
            return null;
        }
        String packageName = context.getPackageName();
        return rw2.o(new StringBuilder(str.length() + 1 + String.valueOf(packageName).length()), str, Separators.POUND, packageName);
    }
}

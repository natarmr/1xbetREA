package a;

import android.content.pm.PackageManager;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class jeg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f16373a;

    public jeg0(us00 us00Var) {
        this.f16373a = us00Var;
    }

    public static boolean a(String str) {
        boolean z = false;
        for (String str2 : j47.y0()) {
            String strN = ohs0.n(str2, str);
            if (new File(str2, str).exists()) {
                Log.v("RootBeer", vdx.N().concat(strN.concat(" binary detected!")));
                z = true;
            }
        }
        return z;
    }

    public final boolean b(ArrayList arrayList) {
        PackageManager packageManager = this.f16373a.getPackageManager();
        Iterator it = arrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                packageManager.getPackageInfo(str, 0);
                vdx.H(str + " ROOT management app detected!");
                z = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z;
    }
}

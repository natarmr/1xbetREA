package a;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class abw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zz2 f599a = new zz2("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        bbw0.t(context).u();
        Set set = j9w0.b;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            sav.a();
        } else {
            ((j9w0) it.next()).getClass();
            e9d0.b();
        }
    }
}

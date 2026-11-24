package a;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class p8f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ywq0 f26550a;

    public p8f(ywq0 ywq0Var) {
        this.f26550a = ywq0Var;
    }

    public final void a(x45 x45Var) {
        ywq0 ywq0Var = this.f26550a;
        HashSet<hdg0> hashSet = x45Var.f40248a;
        ArrayList arrayList = new ArrayList(r3d.q(hashSet, 10));
        for (hdg0 hdg0Var : hashSet) {
            String str = ((v45) hdg0Var).b;
            v45 v45Var = (v45) hdg0Var;
            String str2 = v45Var.d;
            String strSubstring = v45Var.e;
            String str3 = v45Var.c;
            long j = v45Var.f;
            g2v g2vVar = idg0.f14585a;
            if (strSubstring.length() > 256) {
                strSubstring = strSubstring.substring(0, 256);
            }
            arrayList.add(new w45(str, str2, strSubstring, str3, j));
        }
        synchronized (((jdg0) ywq0Var.f)) {
            try {
                if (((jdg0) ywq0Var.f).d(arrayList)) {
                    ((aaf) ((cu) ywq0Var.b).c).a(new qaq0(ywq0Var, ((jdg0) ywq0Var.f).c(), (byte) 8));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Updated Crashlytics Rollout State", null);
        }
    }
}

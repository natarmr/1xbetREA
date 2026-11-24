package a;

import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public abstract class huw implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wgi0 f13700a = x2x.F("android.os.IBinder", new ugi0[0]);

    public static IBinder a(rkj rkjVar) {
        if (!(rkjVar instanceof tzg0)) {
            c99.s(h8x.E(f13700a.f39119a, rkjVar));
            return null;
        }
        tzg0 tzg0Var = (tzg0) rkjVar;
        Bundle bundle = tzg0Var.l;
        String str = tzg0Var.n;
        str.getClass();
        IBinder binder = bundle.getBinder(str);
        if (binder != null) {
            return binder;
        }
        g8x.O(str);
        throw null;
    }
}

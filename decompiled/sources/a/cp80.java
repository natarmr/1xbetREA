package a;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class cp80 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wgi0 f4733a = x2x.F("kotlin.Array<android.os.Parcelable>", new ugi0[0]);

    public static Parcelable[] a(rkj rkjVar) {
        if (!(rkjVar instanceof tzg0)) {
            c99.s(h8x.E(f4733a.f39119a, rkjVar));
            return null;
        }
        tzg0 tzg0Var = (tzg0) rkjVar;
        Bundle bundle = tzg0Var.l;
        String str = tzg0Var.n;
        sgy sgyVarB = sre0.f32672a.b(Parcelable.class);
        str.getClass();
        Parcelable[] parcelableArray = Build.VERSION.SDK_INT >= 34 ? (Parcelable[]) f7.f(bundle, str, azw.G(sgyVarB)) : bundle.getParcelableArray(str);
        if (parcelableArray == null) {
            parcelableArray = null;
        }
        if (parcelableArray != null) {
            return parcelableArray;
        }
        g8x.O(str);
        throw null;
    }
}

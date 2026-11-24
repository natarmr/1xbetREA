package a;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class knk0 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final knk0 f18590a = new knk0();
    public static final wgi0 b = x2x.F("android.util.SparseArray<android.os.Parcelable>", new ugi0[0]);

    @Override // a.jiy
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final SparseArray deserialize(rkj rkjVar) {
        if (!(rkjVar instanceof tzg0)) {
            c99.s(h8x.E(b.f39119a, rkjVar));
            return null;
        }
        tzg0 tzg0Var = (tzg0) rkjVar;
        Bundle bundle = tzg0Var.l;
        String str = tzg0Var.n;
        sgy sgyVarB = sre0.f32672a.b(Parcelable.class);
        str.getClass();
        SparseArray sparseArrayM = Build.VERSION.SDK_INT >= 34 ? f7.m(bundle, str, azw.G(sgyVarB)) : bundle.getSparseParcelableArray(str);
        if (sparseArrayM != null) {
            return sparseArrayM;
        }
        g8x.O(str);
        throw null;
    }

    @Override // a.jiy
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void serialize(bwn bwnVar, SparseArray sparseArray) {
        sparseArray.getClass();
        if (!(bwnVar instanceof uzg0)) {
            c99.s(h8x.G(b.f39119a, bwnVar));
            return;
        }
        uzg0 uzg0Var = (uzg0) bwnVar;
        Bundle bundle = uzg0Var.u;
        String str = uzg0Var.w;
        str.getClass();
        bundle.putSparseParcelableArray(str, sparseArray);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }
}

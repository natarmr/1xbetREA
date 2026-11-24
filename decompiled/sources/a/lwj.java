package a;

import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class lwj implements jiy {
    public static final lwj b = new lwj();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wgi0 f20767a = x2x.F("android.os.Parcelable", new ugi0[0]);

    @Override // a.jiy
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Parcelable deserialize(rkj rkjVar) {
        if (!(rkjVar instanceof tzg0)) {
            c99.s(h8x.E(this.f20767a.f39119a, rkjVar));
            return null;
        }
        tzg0 tzg0Var = (tzg0) rkjVar;
        Bundle bundle = tzg0Var.l;
        String str = tzg0Var.n;
        sgy sgyVarB = sre0.f32672a.b(Parcelable.class);
        str.getClass();
        Parcelable parcelable = (Parcelable) knx.P(bundle, str, azw.G(sgyVarB));
        if (parcelable != null) {
            return parcelable;
        }
        g8x.O(str);
        throw null;
    }

    @Override // a.jiy
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void serialize(bwn bwnVar, Parcelable parcelable) {
        parcelable.getClass();
        if (!(bwnVar instanceof uzg0)) {
            c99.s(h8x.G(this.f20767a.f39119a, bwnVar));
            return;
        }
        uzg0 uzg0Var = (uzg0) bwnVar;
        Bundle bundle = uzg0Var.u;
        String str = uzg0Var.w;
        str.getClass();
        bundle.putParcelable(str, parcelable);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return this.f20767a;
    }
}

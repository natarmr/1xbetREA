package a;

import android.os.Build;
import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class lvj implements jiy {
    public static final lvj b = new lvj();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wgi0 f20717a = x2x.F("java.io.Serializable", new ugi0[0]);

    @Override // a.jiy
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Serializable deserialize(rkj rkjVar) {
        Serializable serializable;
        if (!(rkjVar instanceof tzg0)) {
            c99.s(h8x.E(this.f20717a.f39119a, rkjVar));
            return null;
        }
        tzg0 tzg0Var = (tzg0) rkjVar;
        Bundle bundle = tzg0Var.l;
        String str = tzg0Var.n;
        sgy sgyVarB = sre0.f32672a.b(Serializable.class);
        str.getClass();
        Class clsG = azw.G(sgyVarB);
        if (Build.VERSION.SDK_INT >= 34) {
            serializable = f7.k(bundle, str, clsG);
        } else {
            serializable = bundle.getSerializable(str);
            if (!clsG.isInstance(serializable)) {
                serializable = null;
            }
        }
        if (serializable != null) {
            return serializable;
        }
        g8x.O(str);
        throw null;
    }

    @Override // a.jiy
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void serialize(bwn bwnVar, Serializable serializable) {
        serializable.getClass();
        if (!(bwnVar instanceof uzg0)) {
            c99.s(h8x.G(this.f20717a.f39119a, bwnVar));
            return;
        }
        uzg0 uzg0Var = (uzg0) bwnVar;
        Bundle bundle = uzg0Var.u;
        String str = uzg0Var.w;
        str.getClass();
        bundle.putSerializable(str, serializable);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return this.f20717a;
    }
}

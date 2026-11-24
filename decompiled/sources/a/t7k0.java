package a;

import android.os.Bundle;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class t7k0 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t7k0 f33472a = new t7k0();
    public static final wgi0 b = x2x.F("android.util.Size", new ugi0[0]);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        if (!(rkjVar instanceof tzg0)) {
            c99.s(h8x.E(b.f39119a, rkjVar));
            return null;
        }
        tzg0 tzg0Var = (tzg0) rkjVar;
        Bundle bundle = tzg0Var.l;
        String str = tzg0Var.n;
        str.getClass();
        Size size = bundle.getSize(str);
        if (size != null) {
            return size;
        }
        g8x.O(str);
        throw null;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        Size size = (Size) obj;
        size.getClass();
        if (!(bwnVar instanceof uzg0)) {
            c99.s(h8x.G(b.f39119a, bwnVar));
            return;
        }
        uzg0 uzg0Var = (uzg0) bwnVar;
        Bundle bundle = uzg0Var.u;
        String str = uzg0Var.w;
        str.getClass();
        bundle.putSize(str, size);
    }
}

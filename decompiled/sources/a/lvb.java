package a;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class lvb implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lvb f20706a = new lvb();
    public static final wgi0 b = x2x.F("kotlin.CharSequence", new ugi0[0]);

    public static CharSequence a(rkj rkjVar) {
        if (!(rkjVar instanceof tzg0)) {
            c99.s(h8x.E(b.f39119a, rkjVar));
            return null;
        }
        tzg0 tzg0Var = (tzg0) rkjVar;
        Bundle bundle = tzg0Var.l;
        String str = tzg0Var.n;
        str.getClass();
        CharSequence charSequence = bundle.getCharSequence(str);
        if (charSequence != null) {
            return charSequence;
        }
        g8x.O(str);
        throw null;
    }

    public static void b(bwn bwnVar, CharSequence charSequence) {
        charSequence.getClass();
        if (!(bwnVar instanceof uzg0)) {
            c99.s(h8x.G(b.f39119a, bwnVar));
            return;
        }
        uzg0 uzg0Var = (uzg0) bwnVar;
        Bundle bundle = uzg0Var.u;
        String str = uzg0Var.w;
        str.getClass();
        bundle.putCharSequence(str, charSequence);
    }

    @Override // a.jiy
    public final /* bridge */ /* synthetic */ Object deserialize(rkj rkjVar) {
        return a(rkjVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final /* bridge */ /* synthetic */ void serialize(bwn bwnVar, Object obj) {
        b(bwnVar, (CharSequence) obj);
    }
}

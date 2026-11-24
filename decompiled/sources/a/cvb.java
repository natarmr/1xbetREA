package a;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class cvb implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wgi0 f5021a = x2x.F("kotlin.Array<kotlin.CharSequence>", new ugi0[0]);

    public static CharSequence[] a(rkj rkjVar) {
        if (!(rkjVar instanceof tzg0)) {
            c99.s(h8x.E(f5021a.f39119a, rkjVar));
            return null;
        }
        tzg0 tzg0Var = (tzg0) rkjVar;
        Bundle bundle = tzg0Var.l;
        String str = tzg0Var.n;
        str.getClass();
        CharSequence[] charSequenceArray = bundle.getCharSequenceArray(str);
        if (charSequenceArray != null) {
            return charSequenceArray;
        }
        g8x.O(str);
        throw null;
    }
}

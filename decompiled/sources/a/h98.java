package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class h98 implements jr20 {
    @Override // a.jr20
    public final List a(k810 k810Var, y78 y78Var, mr20 mr20Var) {
        Character chQ;
        mr20Var.getClass();
        v9d v9dVar = mr20Var.f22248a;
        v9d v9dVar2 = mr20Var.b;
        if (k810Var.b != idx.x(v9dVar, k810Var.d)) {
            return iun.f15405a;
        }
        return (Intrinsics.d(v9dVar2, v9dVar) || (chQ = tx3.Q(v9dVar2.b)) == null || chQ.charValue() != '>') ? iun.f15405a : kotlin.collections.a.c(new e98(v9dVar2, new y78(y78Var), (byte) 0));
    }

    @Override // a.jr20
    public final boolean b(v9d v9dVar, k810 k810Var) {
        return false;
    }
}

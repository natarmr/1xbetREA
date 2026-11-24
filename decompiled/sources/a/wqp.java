package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class wqp implements uto {
    @Override // a.uto
    public final int a(kp9 kp9Var, kp9 kp9Var2, wm40 wm40Var) {
        kp9Var.getClass();
        kp9Var2.getClass();
        if (!(kp9Var2 instanceof d0d0) || !(kp9Var instanceof d0d0)) {
            return 3;
        }
        d0d0 d0d0Var = (d0d0) kp9Var2;
        d0d0 d0d0Var2 = (d0d0) kp9Var;
        if (!Intrinsics.d(d0d0Var.getName(), d0d0Var2.getName())) {
            return 3;
        }
        if (gfx.J(d0d0Var) && gfx.J(d0d0Var2)) {
            return 1;
        }
        return (gfx.J(d0d0Var) || gfx.J(d0d0Var2)) ? 2 : 3;
    }

    @Override // a.uto
    public final int b() {
        return 3;
    }
}

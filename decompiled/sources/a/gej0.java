package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public interface gej0 extends hej0 {
    boolean a0();

    int b();

    @Override // a.hej0
    default void d(ArrayList arrayList, p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof gej0) && (p6t0Var2 instanceof gej0)) {
            gej0 gej0Var = (gej0) p6t0Var;
            gej0 gej0Var2 = (gej0) p6t0Var2;
            k9x.G(arrayList, new dej0(gej0Var.j0()), new dej0(gej0Var2.j0()));
            k9x.G(arrayList, new cej0(gej0Var.a0()), new cej0(gej0Var2.a0()));
        }
    }

    String getTitle();

    boolean j0();
}

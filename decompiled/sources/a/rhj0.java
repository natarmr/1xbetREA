package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public interface rhj0 extends hej0 {
    int b();

    @Override // a.hej0
    default void d(ArrayList arrayList, p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof rhj0) && (p6t0Var2 instanceof rhj0)) {
            rhj0 rhj0Var = (rhj0) p6t0Var;
            rhj0 rhj0Var2 = (rhj0) p6t0Var2;
            k9x.G(arrayList, new lhj0(rhj0Var.d0()), new lhj0(rhj0Var2.d0()));
            k9x.G(arrayList, new nhj0(rhj0Var.u0()), new nhj0(rhj0Var2.u0()));
            k9x.G(arrayList, new mhj0(rhj0Var.v0()), new mhj0(rhj0Var2.v0()));
            k9x.G(arrayList, new khj0(rhj0Var.q0()), new khj0(rhj0Var2.q0()));
        }
    }

    String d0();

    String getTitle();

    boolean k();

    boolean q0();

    String u0();

    i8m0 v0();
}

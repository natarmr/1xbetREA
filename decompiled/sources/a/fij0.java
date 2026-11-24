package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public interface fij0 extends hej0 {
    boolean G();

    int b();

    @Override // a.hej0
    default void d(ArrayList arrayList, p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof fij0) && (p6t0Var2 instanceof fij0)) {
            fij0 fij0Var = (fij0) p6t0Var;
            fij0 fij0Var2 = (fij0) p6t0Var2;
            k9x.G(arrayList, new bij0(fij0Var.r0()), new bij0(fij0Var2.r0()));
            k9x.G(arrayList, new cij0(fij0Var.l0()), new cij0(fij0Var2.l0()));
            k9x.G(arrayList, new aij0(fij0Var.G()), new aij0(fij0Var2.G()));
        }
    }

    String getTitle();

    boolean k();

    String l0();

    String r0();
}

package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public interface z9j0 extends hej0 {
    boolean M();

    int b();

    @Override // a.hej0
    default void d(ArrayList arrayList, p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof z9j0) && (p6t0Var2 instanceof z9j0)) {
            z9j0 z9j0Var = (z9j0) p6t0Var;
            z9j0 z9j0Var2 = (z9j0) p6t0Var2;
            k9x.G(arrayList, new k9j0(z9j0Var.s0()), new k9j0(z9j0Var2.s0()));
            k9x.G(arrayList, new j9j0(z9j0Var.M()), new j9j0(z9j0Var2.M()));
        }
    }

    String getTitle();

    boolean k();

    String s0();
}

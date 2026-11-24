package a;

import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
public interface sq90 extends p6t0 {
    @Override // a.p6t0
    default boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return axq.f(p6t0Var, p6t0Var2).equals(p6t0Var2.getClass());
    }

    int getId();

    @Override // a.p6t0
    default boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof sq90) && (p6t0Var2 instanceof sq90) && ((sq90) p6t0Var).getId() == ((sq90) p6t0Var2).getId();
    }

    @Override // a.p6t0
    default Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return null;
    }
}

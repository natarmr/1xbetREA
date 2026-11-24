package a;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public interface p6t0 {
    default boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return axq.f(p6t0Var, p6t0Var2).equals(p6t0Var2.getClass());
    }

    default String getKey() {
        String strV = sre0.f32672a.b(getClass()).v();
        return strV == null ? "" : strV;
    }

    default boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    default Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return null;
    }
}

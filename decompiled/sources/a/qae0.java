package a;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface qae0 extends drd {
    drd a();

    @Override // a.drd
    default Set b(u15 u15Var) {
        return a().b(u15Var);
    }

    @Override // a.drd
    default Set c() {
        return a().c();
    }

    @Override // a.drd
    default Object d(u15 u15Var) {
        return a().d(u15Var);
    }

    @Override // a.drd
    default Object e(u15 u15Var, Object obj) {
        return a().e(u15Var, obj);
    }

    @Override // a.drd
    default boolean f(u15 u15Var) {
        return a().f(u15Var);
    }

    @Override // a.drd
    default crd g(u15 u15Var) {
        return a().g(u15Var);
    }

    @Override // a.drd
    default Object h(u15 u15Var, crd crdVar) {
        return a().h(u15Var, crdVar);
    }

    @Override // a.drd
    default void i(uq uqVar) {
        a().i(uqVar);
    }
}

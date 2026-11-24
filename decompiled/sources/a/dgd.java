package a;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public interface dgd {
    default Object a(Class cls) {
        return e(jkd0.a(cls));
    }

    default Object e(jkd0 jkd0Var) {
        p5d0 p5d0VarL = l(jkd0Var);
        if (p5d0VarL == null) {
            return null;
        }
        return p5d0VarL.get();
    }

    default p5d0 j(Class cls) {
        return l(jkd0.a(cls));
    }

    p5d0 l(jkd0 jkd0Var);

    default Set m(jkd0 jkd0Var) {
        return (Set) o(jkd0Var).get();
    }

    p5d0 o(jkd0 jkd0Var);

    y680 q(jkd0 jkd0Var);
}

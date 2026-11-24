package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rsa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i4 f31022a;

    static {
        f4n f4nVar = f4n.f8923a;
        f31022a = dyb.g0(f4nVar, f4nVar);
    }

    public static final List a(nsa0 nsa0Var) {
        List list;
        nsa0Var.getClass();
        pn00 pn00Var = nsa0Var.c;
        in00 in00Var = pn00Var instanceof in00 ? (in00) pn00Var : null;
        return (in00Var == null || (list = (List) in00Var.f15051a) == null) ? iun.f15405a : list;
    }

    public static final l9s b(nsa0 nsa0Var) {
        nsa0Var.getClass();
        pn00 pn00Var = nsa0Var.b;
        in00 in00Var = pn00Var instanceof in00 ? (in00) pn00Var : null;
        if (in00Var != null) {
            return (l9s) in00Var.f15051a;
        }
        return null;
    }
}

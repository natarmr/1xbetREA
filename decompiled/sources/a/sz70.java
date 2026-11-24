package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class sz70 extends mjq {
    public static final sz70 d = new sz70(0, 1, 1);

    @Override // a.mjq
    public final void d(hu5 hu5Var, bv3 bv3Var, t9k0 t9k0Var, pwi pwiVar, s080 s080Var) {
        xz40 xz40Var;
        yfe0 yfe0Var = (yfe0) hu5Var.g(0);
        hz40 hz40Var = (hz40) pwiVar.e;
        if (hz40Var == null || ((i390) hz40Var.g(yfe0Var)) == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) pwiVar.j;
        if (arrayList != null && (xz40Var = (xz40) hne.k(1, arrayList)) != null) {
            pwiVar.g = xz40Var;
        }
        hz40Var.l(yfe0Var);
    }
}

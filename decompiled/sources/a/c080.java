package a;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c080 extends mjq {
    public static final c080 d = new c080(0, 1, 1);

    @Override // a.mjq
    public final void d(hu5 hu5Var, bv3 bv3Var, t9k0 t9k0Var, pwi pwiVar, s080 s080Var) {
        yfe0 yfe0Var = (yfe0) hu5Var.g(0);
        Set set = (Set) pwiVar.h;
        if (set == null) {
            return;
        }
        i390 i390Var = new i390(set);
        hz40 hz40Var = (hz40) pwiVar.e;
        if (hz40Var == null) {
            long[] jArr = u1h0.f34903a;
            hz40Var = new hz40();
            pwiVar.e = hz40Var;
        }
        hz40Var.n(yfe0Var, i390Var);
        ((xz40) pwiVar.g).b(new jet(i390Var, -1));
    }
}

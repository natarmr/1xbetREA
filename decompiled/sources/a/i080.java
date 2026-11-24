package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i080 extends mjq {
    public static final i080 d = new i080(0, 1, 1);

    @Override // a.mjq
    public final void d(hu5 hu5Var, bv3 bv3Var, t9k0 t9k0Var, pwi pwiVar, s080 s080Var) {
        yfe0 yfe0Var = (yfe0) hu5Var.g(0);
        hz40 hz40Var = (hz40) pwiVar.e;
        i390 i390Var = hz40Var != null ? (i390) hz40Var.g(yfe0Var) : null;
        if (i390Var != null) {
            ArrayList arrayList = (ArrayList) pwiVar.j;
            if (arrayList == null) {
                arrayList = new ArrayList();
                pwiVar.j = arrayList;
            }
            arrayList.add((xz40) pwiVar.g);
            pwiVar.g = i390Var.b;
        }
    }
}

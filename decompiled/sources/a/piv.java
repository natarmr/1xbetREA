package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public abstract class piv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0o0 f27060a = maz.b(new ldv((byte) 4));
    public static final n0o0 b = maz.b(new ldv((byte) 5));

    public static ArrayList a(tln0 tln0Var, tln0 tln0Var2) {
        ArrayList arrayList = new ArrayList();
        sln0 sln0Var = new sln0();
        urm0 urm0Var = wln0.e;
        vln0 vln0Var = vln0.f37634a;
        urm0 urm0Var2 = wln0.e;
        sln0Var.a(y2m0.a(vln0Var, tln0Var, urm0Var2));
        sln0Var.a(y2m0.a(vln0.c, tln0Var2, urm0Var2));
        arrayList.add(sln0Var);
        sln0 sln0Var2 = new sln0();
        sln0Var2.a(y2m0.a(vln0Var, tln0Var, urm0Var2));
        sln0Var2.a(y2m0.a(vln0.d, tln0Var2, urm0Var2));
        arrayList.add(sln0Var2);
        return arrayList;
    }
}

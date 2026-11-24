package a;

import java.util.ArrayList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class m64 extends w46 {
    public final ctf0 b;
    public final boolean c;
    public final p7m0 d;
    public final p7m0 e;

    public m64(boolean z, pek pekVar, tqt tqtVar, pru pruVar, rpt rptVar, ctf0 ctf0Var) {
        ctf0Var.getClass();
        this.b = ctf0Var;
        sff0 sff0VarA = pruVar.a();
        this.c = ((xr) rptVar.f30901a).i() == rl40.GMS;
        f3c0 f3c0Var = sff0VarA.k;
        lc00 lc00VarF = z ? tqt.f(f3c0Var) : pek.o(f3c0Var, sff0VarA.N);
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = lc00VarF.listIterator(0);
        while (true) {
            paw pawVar = (paw) listIterator;
            if (!pawVar.hasNext()) {
                this.d = q7m0.a(new g64(arrayList));
                this.e = q7m0.a(d64.f5535a);
                return;
            }
            Object next = pawVar.next();
            u54 u54Var = (u54) next;
            t54 t54Var = u54Var instanceof t54 ? (t54) u54Var : null;
            if (t54Var == null || t54Var.f33350a != 11 || this.c) {
                arrayList.add(next);
            }
        }
    }
}

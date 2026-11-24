package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ad00 extends cd00 {
    @Override // a.cd00
    public final void a(Object obj, long j) {
        n4 n4Var = (n4) ((amx) ift0.j(obj, j));
        if (n4Var.f22873a) {
            n4Var.f22873a = false;
        }
    }

    @Override // a.cd00
    public final void b(Object obj, long j, Object obj2) {
        amx amxVarN = (amx) ift0.j(obj, j);
        amx amxVar = (amx) ift0.j(obj2, j);
        int size = amxVarN.size();
        int size2 = amxVar.size();
        if (size > 0 && size2 > 0) {
            if (!((n4) amxVarN).f22873a) {
                amxVarN = amxVarN.n(size2 + size);
            }
            amxVarN.addAll(amxVar);
        }
        if (size > 0) {
            amxVar = amxVarN;
        }
        ift0.p(obj, j, amxVar);
    }
}

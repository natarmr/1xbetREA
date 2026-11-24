package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bd00 extends dd00 {
    @Override // a.dd00
    public final void a(Object obj, long j) {
        ((m4) ((zlx) hft0.j(obj, j))).f21141a = false;
    }

    @Override // a.dd00
    public final void b(Object obj, long j, Object obj2) {
        zlx zlxVarN = (zlx) hft0.j(obj, j);
        zlx zlxVar = (zlx) hft0.j(obj2, j);
        int size = zlxVarN.size();
        int size2 = zlxVar.size();
        if (size > 0 && size2 > 0) {
            if (!((m4) zlxVarN).f21141a) {
                zlxVarN = zlxVarN.n(size2 + size);
            }
            zlxVarN.addAll(zlxVar);
        }
        if (size > 0) {
            zlxVar = zlxVarN;
        }
        hft0.q(obj, j, zlxVar);
    }

    @Override // a.dd00
    public final List c(Object obj, long j) {
        zlx zlxVar = (zlx) hft0.j(obj, j);
        if (((m4) zlxVar).f21141a) {
            return zlxVar;
        }
        int size = zlxVar.size();
        zlx zlxVarN = zlxVar.n(size == 0 ? 10 : size * 2);
        hft0.q(obj, j, zlxVarN);
        return zlxVarN;
    }
}

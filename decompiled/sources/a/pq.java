package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class pq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final es f27394a;

    public /* synthetic */ pq(es esVar) {
        this.f27394a = esVar;
    }

    public boolean a(ob7 ob7Var) {
        List<pln> listI = this.f27394a.i();
        if (listI != null && listI.isEmpty()) {
            return false;
        }
        for (pln plnVar : listI) {
            if (plnVar.c == ob7Var.f24963a && plnVar.b == ob7Var.c && plnVar.e == ob7Var.e && plnVar.f == ob7Var.f) {
                return true;
            }
        }
        return false;
    }
}

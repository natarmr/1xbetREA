package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class uai0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nai0 f35330a;
    public final fy40 b;

    public uai0(tai0 tai0Var, gkx gkxVar) {
        this.f35330a = tai0Var.d;
        List listI = tai0Var.i((4 & 1) != 0 ? !tai0Var.b : false, (4 & 2) == 0);
        this.b = new fy40(listI.size());
        int size = listI.size();
        for (int i = 0; i < size; i++) {
            tai0 tai0Var2 = (tai0) listI.get(i);
            if (gkxVar.a(tai0Var2.f)) {
                this.b.a(tai0Var2.f);
            }
        }
    }
}

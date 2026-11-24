package a;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class k3d implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nyq0 f17610a;
    public final /* synthetic */ agk0 b;
    public final /* synthetic */ agk0 c;

    public k3d(nyq0 nyq0Var, agk0 agk0Var, agk0 agk0Var2) {
        this.f17610a = nyq0Var;
        this.b = agk0Var;
        this.c = agk0Var2;
    }

    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        long j2;
        pu90 pu90VarS;
        oyq0 state;
        list.getClass();
        pj30 pj30Var = (pj30) CollectionsKt.firstOrNull(list);
        if (pj30Var != null) {
            j2 = j;
            pu90VarS = pj30Var.S(p4e.b(j2, 0, 0, 0, 0, 14));
        } else {
            j2 = j;
            pu90VarS = null;
        }
        float f = (pu90VarS != null ? pu90VarS.b : 0.0f) * (-1.0f);
        this.b.m(f);
        nyq0 nyq0Var = this.f17610a;
        float fL = (nyq0Var == null || (state = nyq0Var.getState()) == null) ? 0.0f : state.c.l();
        this.c.m(f == 0.0f ? 0.0f : l1e0.c(fL / f, 0.0f, 1.0f));
        int iB = si30.b((pu90VarS != null ? pu90VarS.b : 0.0f) + fL);
        if (iB < 0) {
            iB = 0;
        }
        return vj30.x(vj30Var, p4e.i(j2), iB, new j3d(pu90VarS, fL, (byte) 0));
    }
}

package a;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class dkw implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f6253a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;

    public dkw(boolean z, l7m0 l7m0Var, float f, float f2, float f3) {
        this.f6253a = z;
        this.b = l7m0Var;
        this.c = f;
        this.d = f2;
        this.e = f3;
    }

    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        pu90 pu90VarS;
        Object next;
        Object next2;
        Object next3;
        list.getClass();
        int iT = vj30Var.T(l7x.O(this.c, this.d, this.f6253a ? ((Number) this.b.getValue()).floatValue() : 0.0f));
        int iT2 = vj30Var.T(this.e) + iT;
        Iterator it = list.iterator();
        do {
            pu90VarS = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (mrv.i0((pj30) next) != jwq0.f17266a);
        pj30 pj30Var = (pj30) next;
        Iterator it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (mrv.i0((pj30) next2) != jwq0.b);
        pj30 pj30Var2 = (pj30) next2;
        Iterator it3 = list.iterator();
        do {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
        } while (mrv.i0((pj30) next3) != jwq0.c);
        pj30 pj30Var3 = (pj30) next3;
        pu90 pu90VarS2 = pj30Var != null ? pj30Var.S(p4e.b(j, 0, 0, iT2, iT2, 3)) : null;
        pu90 pu90VarS3 = pj30Var2 != null ? pj30Var2.S(j) : null;
        if (pj30Var3 != null) {
            zcl zclVar = qmk.f28987a;
            pu90VarS = pj30Var3.S(p4e.b(j, 0, 0, 0, vj30Var.T(240.0f), 3));
        }
        return vj30.x(vj30Var, p4e.i(j), iT2, new ec3(pu90VarS2, pu90VarS3, pu90VarS, iT, (byte) 8));
    }
}

package a;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jxs0 implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f17325a;
    public final /* synthetic */ agk0 b;
    public final /* synthetic */ pz40 c;
    public final /* synthetic */ t33 d;

    public jxs0(float f, agk0 agk0Var, pz40 pz40Var, t33 t33Var) {
        this.f17325a = f;
        this.b = agk0Var;
        this.c = pz40Var;
        this.d = t33Var;
    }

    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        Object next;
        long j2;
        pu90 pu90VarS;
        Object next2;
        Object next3;
        list.getClass();
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(mrv.i0((pj30) next), "lineups"));
        pj30 pj30Var = (pj30) next;
        if (pj30Var != null) {
            j2 = j;
            pu90VarS = pj30Var.S(p4e.b(j2, 0, 0, 0, Integer.MAX_VALUE, 3));
        } else {
            j2 = j;
            pu90VarS = null;
        }
        Iterator it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!Intrinsics.d(mrv.i0((pj30) next2), "navBar"));
        pj30 pj30Var2 = (pj30) next2;
        pu90 pu90VarS2 = pj30Var2 != null ? pj30Var2.S(p4e.b(j2, 0, 0, 0, 0, 11)) : null;
        Iterator it3 = list.iterator();
        do {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
        } while (!Intrinsics.d(mrv.i0((pj30) next3), "sheet"));
        pj30 pj30Var3 = (pj30) next3;
        pu90 pu90VarS3 = pj30Var3 != null ? pj30Var3.S(p4e.b(j2, 0, 0, p4e.h(j2), p4e.h(j2), 3)) : null;
        float fL = pu90VarS != null ? pu90VarS.b : 0.0f;
        agk0 agk0Var = this.b;
        if (fL > 0.0f) {
            agk0Var.m(fL);
        }
        if (fL <= 0.0f) {
            fL = agk0Var.l();
        }
        float f = fL - this.f17325a;
        float f2 = f >= 0.0f ? f : 0.0f;
        pz40 pz40Var = this.c;
        if (!Intrinsics.b(f2, (Float) pz40Var.getValue())) {
            pz40Var.setValue(Float.valueOf(f2));
        }
        return vj30.x(vj30Var, p4e.i(j2), p4e.h(j2), new l0i0(pu90VarS, pu90VarS2, pu90VarS3, this.d, (byte) 12));
    }
}

package a;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jwx implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17274a;

    public jwx(boolean z) {
        this.f17274a = z;
    }

    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        pu90 pu90VarS;
        Object next;
        Object next2;
        pu90 pu90VarS2;
        int iT;
        list.getClass();
        Iterator it = list.iterator();
        do {
            pu90VarS = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(mrv.i0((pj30) next), "ICON_BUILDER"));
        pj30 pj30Var = (pj30) next;
        Iterator it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!Intrinsics.d(mrv.i0((pj30) next2), "COLUMN_BUILDER"));
        pj30 pj30Var2 = (pj30) next2;
        int i = p4e.i(j);
        if (pj30Var != null) {
            zcl zclVar = qmk.f28987a;
            int iT2 = vj30Var.T(16.0f);
            int iT3 = vj30Var.T(16.0f);
            if (!((iT3 >= 0) & (iT2 >= 0))) {
                zcx.a("width and height must be >= 0");
            }
            pu90VarS2 = pj30Var.S(r4e.h(iT2, iT2, iT3, iT3));
        } else {
            pu90VarS2 = null;
        }
        if (this.f17274a) {
            iT = 0;
        } else {
            zcl zclVar2 = qmk.f28987a;
            iT = vj30Var.T(8.0f) + vj30Var.T(16.0f);
        }
        int i2 = i - iT;
        if (i2 < 0) {
            i2 = 0;
        }
        if (pj30Var2 != null) {
            if (i2 < 0) {
                zcx.a("width must be >= 0");
            }
            pu90VarS = pj30Var2.S(r4e.h(i2, i2, 0, Integer.MAX_VALUE));
        }
        int iMax = Math.max(pu90VarS2 != null ? pu90VarS2.b : 0, pu90VarS != null ? pu90VarS.b : 0);
        return vj30.x(vj30Var, i, iMax, new d4i(pu90VarS2, iMax, pu90VarS, iT));
    }
}

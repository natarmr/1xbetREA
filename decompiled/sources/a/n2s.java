package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n2s implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t33 f22818a;
    public final /* synthetic */ t33 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ agk0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ float g;
    public final /* synthetic */ l7m0 h;

    public n2s(t33 t33Var, t33 t33Var2, l7m0 l7m0Var, agk0 agk0Var, int i, int i2, float f, l7m0 l7m0Var2) {
        this.f22818a = t33Var;
        this.b = t33Var2;
        this.c = l7m0Var;
        this.d = agk0Var;
        this.e = i;
        this.f = i2;
        this.g = f;
        this.h = l7m0Var2;
    }

    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        float f;
        Object next;
        int i;
        float f2;
        Object next2;
        int iRound;
        pu90 pu90VarS;
        list.getClass();
        int i2 = p4e.i(j);
        zcl zclVar = qmk.f28987a;
        int iT = vj30Var.T(4.0f);
        int iT2 = vj30Var.T(8.0f);
        t33 t33Var = this.f22818a;
        float f3 = 0.0f;
        float f4 = 1.0f;
        float fC = 1.0f - l1e0.c(((Number) t33Var.d()).floatValue(), 0.0f, 1.0f);
        int iRound2 = Math.round(iT * fC);
        int iRound3 = Math.round(iT2 * fC);
        int iT3 = vj30Var.T(56.0f);
        int iT4 = vj30Var.T(8.0f);
        int iT5 = vj30Var.T(42.0f);
        int iT6 = vj30Var.T(46.0f);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                f = f3;
                next = null;
                break;
            }
            next = it.next();
            Object objN = ((pj30) next).n();
            f = f3;
            coc cocVar = objN instanceof coc ? (coc) objN : null;
            if (Intrinsics.d(cocVar != null ? cocVar.b : null, "SIMULATION")) {
                break;
            }
            f3 = f;
        }
        pj30 pj30Var = (pj30) next;
        pu90 pu90VarS2 = pj30Var != null ? pj30Var.S(p4e.a(i2, i2, 0, p4e.h(j))) : null;
        int i3 = pu90VarS2 != null ? pu90VarS2.b : 0;
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                i = iT4;
                f2 = f4;
                next2 = null;
                break;
            }
            next2 = it2.next();
            f2 = f4;
            Object objN2 = ((pj30) next2).n();
            i = iT4;
            coc cocVar2 = objN2 instanceof coc ? (coc) objN2 : null;
            if (Intrinsics.d(cocVar2 != null ? cocVar2.b : null, "TAB_ID")) {
                break;
            }
            iT4 = i;
            f4 = f2;
        }
        pj30 pj30Var2 = (pj30) next2;
        int iB = pj30Var2 != null ? pj30Var2.b(i2) : 0;
        float fFloatValue = ((Number) t33Var.d()).floatValue();
        t33 t33Var2 = this.b;
        if (fFloatValue == f) {
            iB = Math.round(l1e0.c(f2 - ((Number) t33Var2.d()).floatValue(), f, f2) * iB);
        }
        zcl zclVar2 = qmk.f28987a;
        int iT7 = vj30Var.T(4.0f) * 2;
        float fT = ((Boolean) this.c.getValue()).booleanValue() ? ((i2 - iT7) / 1.7777778f) + iT7 : vj30Var.T(168.0f);
        agk0 agk0Var = this.d;
        if (agk0Var.l() != fT) {
            agk0Var.m(fT);
        }
        float fH = ((((p4e.h(j) - this.e) - iT3) - this.f) - iT5) - iT6;
        if (fH < fT) {
            fH = fT;
        }
        if (((Number) t33Var.d()).floatValue() == 0.0f) {
            iRound = Math.round((((Number) t33Var2.d()).floatValue() * (fH - fT)) + fT);
        } else {
            iRound = Math.round((1.0f - ((Number) t33Var.d()).floatValue()) * fT);
        }
        int iRound4 = Math.round(((Number) t33Var.d()).floatValue() * this.g);
        int i4 = iB + iRound + iRound4;
        ArrayList arrayList = new ArrayList();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            pj30 pj30Var3 = (pj30) it3.next();
            pu90 pu90Var = pu90VarS2;
            Object objN3 = pj30Var3.n();
            int i5 = i3;
            coc cocVar3 = objN3 instanceof coc ? (coc) objN3 : null;
            String str = cocVar3 != null ? cocVar3.b : null;
            if (str != null) {
                switch (str) {
                    case "TAB_ID":
                        pu90VarS = pj30Var3.S(p4e.a(i2, i2, iB, iB));
                        break;
                    case "COMPRESSED_CARD_ID":
                        pu90VarS = pj30Var3.S(p4e.a(i2, i2, iRound4, iRound4));
                        break;
                    case "SIMULATION":
                        pu90VarS = pu90Var;
                        break;
                    case "INDICATOR_ID":
                        pu90VarS = pj30Var3.S(p4e.a(i2, i2, iRound2, iRound2));
                        break;
                    case "CARD_BACKGROUND_ID":
                        pu90VarS = pj30Var3.S(p4e.a(i2, i2, i4, i4));
                        break;
                    case "CARDS_ID":
                        pu90VarS = pj30Var3.S(p4e.a(i2, i2, iRound, iRound));
                        break;
                    default:
                        pu90VarS = null;
                        break;
                }
            } else {
                pu90VarS = null;
            }
            if (pu90VarS != null) {
                arrayList.add(pu90VarS);
            }
            pu90VarS2 = pu90Var;
            i3 = i5;
        }
        int i6 = i3;
        int i7 = i6 > 0 ? i : 0;
        l7m0 l7m0Var = this.h;
        return vj30.x(vj30Var, p4e.i(j), ((Number) l7m0Var.getValue()).intValue() + i4 + iRound2 + iRound3 + i6 + i7, new inr(arrayList, l7m0Var, iRound3));
    }
}

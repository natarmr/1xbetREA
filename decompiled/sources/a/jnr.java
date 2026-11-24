package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jnr implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f16824a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ int d;

    public jnr(Function1 function1, l7m0 l7m0Var, l7m0 l7m0Var2, int i) {
        this.f16824a = function1;
        this.b = l7m0Var;
        this.c = l7m0Var2;
        this.d = i;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0186  */
    /* JADX WARN: Code duplicated, block: B:76:0x0189 A[SYNTHETIC] */
    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        Object next;
        int i;
        pu90 pu90VarS;
        s40 s40Var;
        list.getClass();
        int iIntValue = ((Number) this.f16824a.invoke(Integer.valueOf(p4e.h(j)))).intValue();
        l7m0 l7m0Var = this.b;
        int iIntValue2 = ((Number) l7m0Var.getValue()).intValue() + iIntValue;
        int i2 = p4e.i(j);
        zcl zclVar = qmk.f28987a;
        int iT = vj30Var.T(56.0f);
        int iT2 = vj30Var.T(2.0f);
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Object objN = ((pj30) next).n();
            s40Var = objN instanceof s40 ? (s40) objN : null;
        } while (!Intrinsics.d(s40Var != null ? s40Var.b : null, "SIMULATION"));
        pj30 pj30Var = (pj30) next;
        pu90 pu90VarS2 = pj30Var != null ? pj30Var.S(p4e.a(i2, i2, 0, p4e.h(j))) : null;
        int i3 = pu90VarS2 != null ? pu90VarS2.b : 0;
        int iH = (p4e.h(j) - iT) - iIntValue2;
        l7m0 l7m0Var2 = this.c;
        int iIntValue3 = iH - ((Number) l7m0Var2.getValue()).intValue();
        int i4 = this.d;
        int iMax = Math.max(0, (iIntValue3 - i4) - i3);
        zcl zclVar2 = qmk.f28987a;
        int iIntValue4 = ((Number) l7m0Var2.getValue()).intValue() + i4 + iT + iIntValue2 + vj30Var.T(40.0f) + vj30Var.T(48.0f) + i3;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            pj30 pj30Var2 = (pj30) it2.next();
            Object objN2 = pj30Var2.n();
            l7m0 l7m0Var3 = l7m0Var;
            s40 s40Var2 = objN2 instanceof s40 ? (s40) objN2 : null;
            String str = s40Var2 != null ? s40Var2.b : null;
            if (str != null) {
                switch (str.hashCode()) {
                    case -1115846164:
                        i = i4;
                        if (str.equals("COMPRESSED_CARD_ID")) {
                            pu90VarS = pj30Var2.S(p4e.a(i2, i2, ((Number) l7m0Var3.getValue()).intValue(), ((Number) l7m0Var3.getValue()).intValue()));
                            break;
                        }
                        break;
                    case -806678009:
                        i = i4;
                        if (str.equals("SIMULATION")) {
                            pu90VarS = pu90VarS2;
                            break;
                        }
                        break;
                    case -473046405:
                        i = i4;
                        if (str.equals("BETTING_ID")) {
                            pu90VarS = pj30Var2.S(p4e.a(i2, i2, iMax, iMax));
                            break;
                        }
                        break;
                    case -325638805:
                        i = i4;
                        if (str.equals("INDICATOR_ID")) {
                            pu90VarS = pj30Var2.S(p4e.a(i2, i2, iT2, iT2));
                            break;
                        }
                        break;
                    case 543708287:
                        i = i4;
                        if (str.equals("TOOLBAR_ID")) {
                            pu90VarS = pj30Var2.S(p4e.a(i2, i2, iT, iT));
                            break;
                        }
                        break;
                    case 775328663:
                        i = i4;
                        if (str.equals("CARDS_ID")) {
                            pu90VarS = pj30Var2.S(p4e.a(i2, i2, iIntValue, iIntValue));
                            break;
                        }
                        break;
                    case 1222669772:
                        if (!str.equals("BACKGROUND_ID")) {
                            i = i4;
                        } else {
                            i = i4;
                            pu90VarS = pj30Var2.S(p4e.a(i2, i2, iIntValue4, iIntValue4));
                        }
                        break;
                    default:
                        i = i4;
                        break;
                }
                if (pu90VarS != null) {
                    arrayList.add(pu90VarS);
                }
                i4 = i;
                l7m0Var = l7m0Var3;
            } else {
                i = i4;
            }
            pu90VarS = null;
            if (pu90VarS != null) {
                arrayList.add(pu90VarS);
            }
            i4 = i;
            l7m0Var = l7m0Var3;
        }
        return vj30.x(vj30Var, p4e.i(j), p4e.h(j), new inr(i4, arrayList, l7m0Var2));
    }
}

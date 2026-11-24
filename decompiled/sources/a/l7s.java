package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class l7s implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f19575a;
    public final /* synthetic */ rv2 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ cgk0 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    public l7s(Function1 function1, rv2 rv2Var, int i, int i2, int i3, cgk0 cgk0Var, int i4, int i5) {
        this.f19575a = function1;
        this.b = rv2Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = cgk0Var;
        this.g = i4;
        this.h = i5;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        int iF;
        int i;
        list.getClass();
        int i2 = p4e.i(j);
        int iH = p4e.h(j);
        this.f19575a.invoke(Integer.valueOf(iH));
        rv2 rv2Var = this.b;
        float fD = rv2Var.d().d(py20.f27786a);
        int i3 = this.d;
        int i4 = this.c;
        if (fD <= 0.0f ? (iF = i4 - i3) < 0 : (iF = (int) rv2Var.f()) < 0) {
            iF = 0;
        }
        float fD2 = rv2Var.d().d(rv2Var.e.getValue());
        if (Float.isNaN(fD2) || fD <= 0.0f ? (i = i4 - i3) < 0 : (i = (int) fD2) < 0) {
            i = 0;
        }
        int iD = l1e0.d(i4 - iF, i3, i4);
        int iD2 = l1e0.d(i4 - i, i3, i4);
        int i5 = this.e;
        cgk0 cgk0Var = this.f;
        int iL = ((iH - i5) - cgk0Var.l()) - iD;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pj30 pj30Var = (pj30) it.next();
            Object objN = pj30Var.n();
            pu90 pu90VarS = null;
            iaj iajVar = objN instanceof iaj ? (iaj) objN : null;
            String str = iajVar != null ? iajVar.b : null;
            if (str != null) {
                switch (str.hashCode()) {
                    case 543708287:
                        if (str.equals("TOOLBAR_ID")) {
                            pu90VarS = pj30Var.S(p4e.a(i2, i2, i5, i5));
                        }
                        break;
                    case 749675201:
                        if (str.equals("CONTENT_ID")) {
                            pu90VarS = pj30Var.S(p4e.a(i2, i2, iL < 0 ? 0 : iL, iL < 0 ? 0 : iL));
                        }
                        break;
                    case 1222669772:
                        if (str.equals("BACKGROUND_ID")) {
                            int i6 = this.g;
                            pu90VarS = pj30Var.S(p4e.a(i2, i2, i6, i6));
                        }
                        break;
                    case 1603285699:
                        if (str.equals("MARKETS_ID")) {
                            int iMax = Math.max(iD2, iD) + this.h;
                            pu90VarS = pj30Var.S(p4e.a(i2, i2, iMax, iMax));
                        }
                        break;
                }
            }
            if (pu90VarS != null) {
                arrayList.add(pu90VarS);
            }
        }
        return vj30.x(vj30Var, i2, iH, new lw7(cgk0Var, arrayList, iH, iD2, this.h, (byte) 9));
    }
}

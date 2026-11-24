package a;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class v8u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v4u f37004a;
    public final gmt b;
    public final pbt c;

    public v8u(v4u v4uVar, gmt gmtVar, pbt pbtVar) {
        v4uVar.getClass();
        gmtVar.getClass();
        this.f37004a = v4uVar;
        this.b = gmtVar;
        this.c = pbtVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    public final double a(gxo gxoVar) {
        double dDoubleValue;
        Double dI;
        Double dI2;
        Double dI3;
        gxoVar.getClass();
        ql5 ql5VarA = this.b.a();
        long j = ql5VarA != null ? ql5VarA.f28916a : -1L;
        int iOrdinal = gxoVar.ordinal();
        pbt pbtVar = this.c;
        if (iOrdinal == 0) {
            j5t j5tVar = pbtVar.f26724a;
            Double d = (Double) j5tVar.h.get(Long.valueOf(j));
            if ((d != null ? d.doubleValue() : 0.0d) == 0.0d) {
                String string = ((SharedPreferences) pbtVar.b.f20589a).getString("firstFastBet" + j, "");
                j5tVar.b((string == null || (dI = kotlin.text.b.i(string)) == null) ? 0.0d : dI.doubleValue(), j);
            }
            Double d2 = (Double) j5tVar.h.get(Long.valueOf(j));
            if (d2 != null) {
                dDoubleValue = d2.doubleValue();
            } else {
                dDoubleValue = 0.0d;
            }
        } else if (iOrdinal == 1) {
            j5t j5tVar2 = pbtVar.f26724a;
            Double d3 = (Double) j5tVar2.i.get(Long.valueOf(j));
            if ((d3 != null ? d3.doubleValue() : 0.0d) == 0.0d) {
                String string2 = ((SharedPreferences) pbtVar.b.f20589a).getString("secondFastBet" + j, "");
                j5tVar2.c((string2 == null || (dI2 = kotlin.text.b.i(string2)) == null) ? 0.0d : dI2.doubleValue(), j);
            }
            Double d4 = (Double) j5tVar2.i.get(Long.valueOf(j));
            if (d4 != null) {
                dDoubleValue = d4.doubleValue();
            } else {
                dDoubleValue = 0.0d;
            }
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return 0.0d;
            }
            j5t j5tVar3 = pbtVar.f26724a;
            Double d5 = (Double) j5tVar3.j.get(Long.valueOf(j));
            if ((d5 != null ? d5.doubleValue() : 0.0d) == 0.0d) {
                String string3 = ((SharedPreferences) pbtVar.b.f20589a).getString("thirdFastBet" + j, "");
                j5tVar3.d((string3 == null || (dI3 = kotlin.text.b.i(string3)) == null) ? 0.0d : dI3.doubleValue(), j);
            }
            Double d6 = (Double) j5tVar3.j.get(Long.valueOf(j));
            if (d6 != null) {
                dDoubleValue = d6.doubleValue();
            } else {
                dDoubleValue = 0.0d;
            }
        }
        return dDoubleValue == 0.0d ? this.f37004a.a(gxoVar) : dDoubleValue;
    }
}

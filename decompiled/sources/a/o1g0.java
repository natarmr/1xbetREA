package a;

import android.gov.nist.core.Separators;
import java.util.Set;
import kotlin.Pair;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o1g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Regex f24479a = new Regex("\\d+[:-]\\d+|\\d+ - \\d+");
    public static final Regex b = new Regex("(\\d+(?:\\.\\d+)?)");
    public static final Regex c = new Regex("(\\s[:-]\\s(\\d+(?:\\.\\d+)?))");
    public static final Set d = tx3.l0(new Long[]{Long.valueOf(csg.d.b), Long.valueOf(rtg.d.b)});

    public static final a2m a(long j, String str) {
        str.getClass();
        Pair pairD = d(j, str);
        c2m c2mVar = c2m.f3631a;
        return pairD == null ? new z1m(c2mVar) : new y1m(c2mVar, new x1m(), (String) pairD.f46059a, (String) pairD.b, false, false);
    }

    public static final mpm b(long j, String str) {
        str.getClass();
        Pair pairD = d(j, str);
        opm opmVar = opm.f25648a;
        return pairD == null ? new lpm(opmVar, new hpm(0L, 3)) : new kpm(opmVar, new hpm(0L, 3), d5c.O((String) pairD.f46059a, (String) pairD.b, false, false, new hpm(0L, 3)));
    }

    public static final Pair c(long j, String str) {
        str.getClass();
        Pair pairD = d(j, str);
        return pairD == null ? new Pair("", "") : pairD;
    }

    public static final Pair d(long j, String str) {
        bh30 bh30VarB;
        String value;
        if (j == jwg.d.b) {
            bh30 bh30VarB2 = b.b(str);
            String value2 = bh30VarB2 != null ? bh30VarB2.getValue() : null;
            bh30 bh30VarB3 = c.b(str);
            String value3 = bh30VarB3 != null ? bh30VarB3.getValue() : null;
            String strN = ohs0.n(value2, value3);
            if (value2 == null || value3 == null) {
                strN = null;
            }
            if (strN != null) {
                return e(strN);
            }
        } else if (!d.contains(Long.valueOf(j)) && (bh30VarB = f24479a.b(str)) != null && (value = bh30VarB.getValue()) != null) {
            return e(value);
        }
        return null;
    }

    public static final Pair e(String str) {
        String str2 = StringsKt.P(str, '-') ? "-" : Separators.COLON;
        return new Pair(StringsKt.u0(StringsKt.r0(str, str2)).toString(), StringsKt.u0(StringsKt.m0(str, str2, str)).toString());
    }
}

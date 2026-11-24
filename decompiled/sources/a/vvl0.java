package a;

import android.text.SpannableString;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes.dex */
public final class vvl0 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38106a;
    public final /* synthetic */ List b;
    public final /* synthetic */ a4x c;
    public final /* synthetic */ u23 d;

    public /* synthetic */ vvl0(List list, a4x a4xVar, u23 u23Var, byte b) {
        this.f38106a = b;
        this.b = list;
        this.c = a4xVar;
        this.d = u23Var;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        float f;
        float f2;
        byte b = this.f38106a;
        a4x a4xVar = this.c;
        cl5 cl5Var = ukd.f35823a;
        List list = this.b;
        u23 u23Var = this.d;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i = (iIntValue2 & 6) == 0 ? iIntValue2 | (fetVar.g(g9zVar) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar.e(iIntValue) ? 32 : 16;
                }
                if (fetVar.U(i & 1, (i & 147) != 146)) {
                    pwl0 pwl0Var = (pwl0) list.get(iIntValue);
                    fetVar.e0(-432032200);
                    fetVar.e0(1787179180);
                    h83 h83Var = new h83();
                    int iG = h83Var.g(new smk0(0L, 0L, psq.f, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 65531));
                    try {
                        h83Var.c(pwl0Var.f27716a);
                        h83Var.c(": ");
                        h83Var.d(iG);
                        String str = pwl0Var.b;
                        zfn zfnVar = m8m0.f21378a;
                        long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU();
                        long jM81getDarkBlue0d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m81getDarkBlue0d7_KjU();
                        boolean zI = fetVar.i(h83Var) | fetVar.i(u23Var);
                        Object objP = fetVar.P();
                        if (zI || objP == cl5Var) {
                            objP = new uvl0(h83Var, u23Var, (byte) 0);
                            fetVar.o0(objP);
                        }
                        Function1 function1 = (Function1) objP;
                        SpannableString spannableString = new SpannableString(str);
                        Linkify.addLinks(spannableString, 1);
                        Object[] spans = spannableString.getSpans(0, spannableString.length(), URLSpan.class);
                        spans.getClass();
                        int spanEnd = 0;
                        for (URLSpan uRLSpan : tx3.Y(spans, new wvl0(spannableString, (byte) 0))) {
                            qrq qrqVar = j1t0.c;
                            int iG2 = h83Var.g(new smk0(jM123getWhite0d7_KjU, 0L, null, null, null, qrqVar, null, 0L, null, null, null, 0L, null, null, null, 65502));
                            try {
                                h83Var.c(spannableString.subSequence(spanEnd, spannableString.getSpanStart(uRLSpan)).toString());
                                h83Var.d(iG2);
                                String url = uRLSpan.getURL();
                                url.getClass();
                                long j = jM81getDarkBlue0d7_KjU;
                                jb00 jb00Var = new jb00(url, new f9q0(new smk0(j, 0L, null, null, null, qrqVar, null, 0L, null, null, null, 0L, k5q0.c, null, null, 61406), null, null, null), new sa4(function1, (byte) 6));
                                String string = spannableString.subSequence(spannableString.getSpanStart(uRLSpan), spannableString.getSpanEnd(uRLSpan)).toString();
                                int iE = h83Var.e(jb00Var);
                                try {
                                    h83Var.c(string);
                                    h83Var.d(iE);
                                    spanEnd = spannableString.getSpanEnd(uRLSpan);
                                    jM81getDarkBlue0d7_KjU = j;
                                } catch (Throwable th) {
                                    h83Var.d(iE);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                h83Var.d(iG2);
                                throw th2;
                            }
                        }
                        if (spanEnd < spannableString.length()) {
                            int iG3 = h83Var.g(new smk0(jM123getWhite0d7_KjU, 0L, null, null, null, j1t0.c, null, 0L, null, null, null, 0L, null, null, null, 65502));
                            try {
                                h83Var.c(spannableString.subSequence(spanEnd, spannableString.length()).toString());
                                h83Var.d(iG3);
                            } catch (Throwable th3) {
                                h83Var.d(iG3);
                                throw th3;
                            }
                        }
                        j83 j83VarH = h83Var.h();
                        fetVar.r(false);
                        if (iIntValue < q3d.i(a4xVar)) {
                            zcl zclVar = qmk.f28987a;
                            f = 4.0f;
                        } else {
                            zcl zclVar2 = qmk.f28987a;
                            f = 0.0f;
                        }
                        v8q0.b(j83VarH, s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, f, 7), ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 0, 262136);
                        fetVar.r(false);
                    } catch (Throwable th4) {
                        h83Var.d(iG);
                        throw th4;
                    }
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            default:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i2 = (iIntValue4 & 6) == 0 ? iIntValue4 | (fetVar2.g(g9zVar2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar2.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
                    swl0 swl0Var = (swl0) list.get(iIntValue3);
                    fetVar2.e0(-952552546);
                    fetVar2.e0(-1554747770);
                    h83 h83Var2 = new h83();
                    int iG4 = h83Var2.g(new smk0(0L, 0L, psq.f, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 65531));
                    try {
                        h83Var2.c(swl0Var.f32927a);
                        h83Var2.c(": ");
                        h83Var2.d(iG4);
                        String str2 = swl0Var.b;
                        zfn zfnVar2 = m8m0.f21378a;
                        long jM131getWhite800d7_KjU = ((StaticColors) fetVar2.k(zfnVar2)).m131getWhite800d7_KjU();
                        long jM81getDarkBlue0d7_KjU2 = ((StaticColors) fetVar2.k(zfnVar2)).m81getDarkBlue0d7_KjU();
                        boolean zI2 = fetVar2.i(h83Var2) | fetVar2.i(u23Var);
                        Object objP2 = fetVar2.P();
                        if (zI2 || objP2 == cl5Var) {
                            objP2 = new uvl0(h83Var2, u23Var, (byte) 1);
                            fetVar2.o0(objP2);
                        }
                        Function1 function2 = (Function1) objP2;
                        SpannableString spannableString2 = new SpannableString(str2);
                        Linkify.addLinks(spannableString2, 1);
                        Object[] spans2 = spannableString2.getSpans(0, spannableString2.length(), URLSpan.class);
                        spans2.getClass();
                        int spanEnd2 = 0;
                        for (URLSpan uRLSpan2 : tx3.Y(spans2, new wvl0(spannableString2, (byte) 3))) {
                            qrq qrqVar2 = j1t0.c;
                            int iG5 = h83Var2.g(new smk0(jM131getWhite800d7_KjU, 0L, null, null, null, qrqVar2, null, 0L, null, null, null, 0L, null, null, null, 65502));
                            try {
                                h83Var2.c(spannableString2.subSequence(spanEnd2, spannableString2.getSpanStart(uRLSpan2)).toString());
                                h83Var2.d(iG5);
                                String url2 = uRLSpan2.getURL();
                                url2.getClass();
                                long j2 = jM81getDarkBlue0d7_KjU2;
                                jb00 jb00Var2 = new jb00(url2, new f9q0(new smk0(j2, 0L, null, null, null, qrqVar2, null, 0L, null, null, null, 0L, k5q0.c, null, null, 61406), null, null, null), new sa4(function2, (byte) 7));
                                String string2 = spannableString2.subSequence(spannableString2.getSpanStart(uRLSpan2), spannableString2.getSpanEnd(uRLSpan2)).toString();
                                int iE2 = h83Var2.e(jb00Var2);
                                try {
                                    h83Var2.c(string2);
                                    h83Var2.d(iE2);
                                    spanEnd2 = spannableString2.getSpanEnd(uRLSpan2);
                                    jM81getDarkBlue0d7_KjU2 = j2;
                                } catch (Throwable th5) {
                                    h83Var2.d(iE2);
                                    throw th5;
                                }
                            } catch (Throwable th6) {
                                h83Var2.d(iG5);
                                throw th6;
                            }
                        }
                        if (spanEnd2 < spannableString2.length()) {
                            int iG6 = h83Var2.g(new smk0(jM131getWhite800d7_KjU, 0L, null, null, null, j1t0.c, null, 0L, null, null, null, 0L, null, null, null, 65502));
                            try {
                                h83Var2.c(spannableString2.subSequence(spanEnd2, spannableString2.length()).toString());
                                h83Var2.d(iG6);
                            } catch (Throwable th7) {
                                h83Var2.d(iG6);
                                throw th7;
                            }
                        }
                        j83 j83VarH2 = h83Var2.h();
                        fetVar2.r(false);
                        if (iIntValue3 < q3d.i(a4xVar)) {
                            zcl zclVar3 = qmk.f28987a;
                            f2 = 4.0f;
                        } else {
                            zcl zclVar4 = qmk.f28987a;
                            f2 = 0.0f;
                        }
                        v8q0.b(j83VarH2, s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, f2, 7), ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar2, 0, 0, 262136);
                        fetVar2.r(false);
                    } catch (Throwable th8) {
                        h83Var2.d(iG4);
                        throw th8;
                    }
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
        }
    }
}

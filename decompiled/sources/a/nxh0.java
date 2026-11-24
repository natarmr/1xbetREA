package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Date;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.section.api.presentation.CyberMainDisciplinesParams;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class nxh0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24284a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nxh0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f24284a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        rz10 rz10Var;
        switch (this.f24284a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                c5h c5hVar = (c5h) this.receiver;
                CyberGamesPage cyberGamesPage = (CyberGamesPage) CollectionsKt.W(iIntValue, (List) c5hVar.s.getValue());
                if (cyberGamesPage != null) {
                    zr1 zr1Var = c5hVar.o;
                    String strA = org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage);
                    zr1Var.getClass();
                    b1j.v(strA, zr1Var.f44833a, 3349L);
                    ih5 ih5Var = ((uzg) c5hVar.d).c;
                    if (cyberGamesPage.equals(CyberGamesPage.Real.INSTANCE)) {
                        ih5Var.d("real");
                    } else if (cyberGamesPage.equals(CyberGamesPage.Virtual.INSTANCE)) {
                        ih5Var.d("virtual");
                    } else {
                        if (!cyberGamesPage.equals(CyberGamesPage.OneXCyber.INSTANCE)) {
                            t9f.b();
                            return null;
                        }
                        ih5Var.d("1XCyber");
                    }
                    p7m0 p7m0Var = c5hVar.q;
                    p7m0Var.o(null, l120.a((l120) p7m0Var.getValue(), null, false, false, false, (cyberGamesPage instanceof CyberGamesPage.Real) && !(c5hVar.b instanceof CyberMainDisciplinesParams.Disciplines), 127));
                    p7m0 p7m0Var2 = c5hVar.t;
                    do {
                        value = p7m0Var2.getValue();
                        rz10Var = (rz10) value;
                    } while (!p7m0Var2.m(value, new rz10(rz10Var.f31337a, rz10Var.b, iIntValue)));
                }
                return Unit.f46060a;
            case 1:
                szh0 szh0Var = (szh0) obj;
                szh0Var.getClass();
                izh0 izh0Var = (izh0) this.receiver;
                lme0 lme0Var = izh0.S1;
                if (szh0Var instanceof rzh0) {
                    rzh0 rzh0Var = (rzh0) szh0Var;
                    m0k0 m0k0Var = rzh0Var.f31361a;
                    m97 m97Var = rzh0Var.b;
                    nq2 nq2Var = rzh0Var.c;
                    e720 e720Var = izh0Var.M1;
                    if (e720Var == null) {
                        Intrinsics.h("makeBetBottomSheetProvider");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC = izh0Var.C();
                    eVarC.getClass();
                    e720Var.b(eVarC, m97Var, m0k0Var, nq2Var);
                } else if (szh0Var instanceof pzh0) {
                    vq vqVar = izh0Var.N1;
                    if (vqVar == null) {
                        Intrinsics.h("addEventToCouponDelegate");
                        throw null;
                    }
                    pzh0 pzh0Var = (pzh0) szh0Var;
                    vqVar.a(izh0Var, pzh0Var.f27846a, null, null, null, ctc.b, true, new nq2(), pzh0Var.b, pzh0Var.c);
                } else {
                    izh0Var.getClass();
                    if (!szh0Var.equals(qzh0.f29578a)) {
                        t9f.b();
                        return null;
                    }
                    vq vqVar2 = izh0Var.N1;
                    if (vqVar2 == null) {
                        Intrinsics.h("addEventToCouponDelegate");
                        throw null;
                    }
                    vqVar2.b(izh0Var, null, null);
                }
                izh0Var.G0().x(tyh0.f34756a);
                return Unit.f46060a;
            case 2:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((duj) this.receiver).a(th);
                return Unit.f46060a;
            case 3:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((duj) this.receiver).a(th2);
                return Unit.f46060a;
            case 4:
                k0i0 k0i0Var = (k0i0) obj;
                k0i0Var.getClass();
                ((k3t0) this.receiver).x(k0i0Var);
                return Unit.f46060a;
            case 5:
                k0i0 k0i0Var2 = (k0i0) obj;
                k0i0Var2.getClass();
                ((k3t0) this.receiver).x(k0i0Var2);
                return Unit.f46060a;
            case 6:
                b1i0 b1i0Var = (b1i0) obj;
                b1i0Var.getClass();
                n0i0 n0i0Var = (n0i0) this.receiver;
                gne0 gne0Var = n0i0.R1;
                n0i0Var.getClass();
                pek0 pek0Var = pek0.f26859a;
                if (b1i0Var.equals(y0i0.f41807a)) {
                    ii iiVar = n0i0Var.N1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH = n0i0Var.H(R.string.caution);
                    String strH2 = n0i0Var.H(R.string.cashback_change_warning);
                    String strH3 = n0i0Var.H(R.string.cancel);
                    strH3.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, n0i0Var.H(R.string.ok_upper), (String) null, "REQUEST_APPROVE_DIALOG", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC2 = n0i0Var.C();
                    eVarC2.getClass();
                    iiVar.d(dialogFields, eVarC2);
                } else if (b1i0Var instanceof x0i0) {
                    d7a d7aVar = ((x0i0) b1i0Var).f40071a;
                    if (n0i0Var.M1 == null) {
                        Intrinsics.h("captchaDialogDelegate");
                        throw null;
                    }
                    String strH4 = n0i0Var.H(R.string.one_more_cashback_title);
                    strH4.getClass();
                    gl5.q(n0i0Var, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", d7aVar, strH4);
                } else if (b1i0Var instanceof z0i0) {
                    z0i0 z0i0Var = (z0i0) b1i0Var;
                    wdk0 wdk0Var = n0i0Var.O1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, new xdk0(pek0Var, z0i0Var.f43568a, null, null, null, null, 124), n0i0Var, null, null, false, null, 1020);
                } else {
                    if (!(b1i0Var instanceof a1i0)) {
                        t9f.b();
                        return null;
                    }
                    a1i0 a1i0Var = (a1i0) b1i0Var;
                    wdk0 wdk0Var2 = n0i0Var.O1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var2, new xdk0(pek0Var, a1i0Var.f71a, null, null, null, null, 124), n0i0Var, null, null, false, null, 1020);
                }
                n0i0Var.G0().x(d0i0.f5268a);
                return Unit.f46060a;
            case 7:
                k0i0 k0i0Var3 = (k0i0) obj;
                k0i0Var3.getClass();
                ((k3t0) this.receiver).x(k0i0Var3);
                return Unit.f46060a;
            case 8:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((g1i0) this.receiver).N(th3);
                return Unit.f46060a;
            case 9:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((g1i0) this.receiver).N(th4);
                return Unit.f46060a;
            case 10:
                sec secVar = (sec) obj;
                secVar.getClass();
                m1i0 m1i0Var = (m1i0) this.receiver;
                cge0 cge0Var = m1i0.O1;
                m1i0Var.getClass();
                if (secVar.equals(rec.f30328a)) {
                    ii iiVar2 = ((oci) m1i0Var.M1.getValue()).h;
                    String strH5 = m1i0Var.H(R.string.caution);
                    String strH6 = m1i0Var.H(R.string.close_the_activation_process_new);
                    String strH7 = m1i0Var.H(R.string.interrupt);
                    strH7.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH5, (CharSequence) strH6, (CharSequence) strH7, m1i0Var.H(R.string.cancel), (String) null, "CLOSE_CHOOSER_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC3 = m1i0Var.C();
                    eVarC3.getClass();
                    iiVar2.d(dialogFields2, eVarC3);
                } else {
                    if (!secVar.equals(qec.f28577a)) {
                        t9f.b();
                        return null;
                    }
                    j120.Y(m1i0Var);
                }
                m1i0Var.G0().x(xdc.f40686a);
                return Unit.f46060a;
            case 11:
                jec jecVar = (jec) obj;
                jecVar.getClass();
                ((k3t0) this.receiver).x(jecVar);
                return Unit.f46060a;
            case 12:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((p1i0) this.receiver).M(th5);
                return Unit.f46060a;
            case 13:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((p1i0) this.receiver).M(th6);
                return Unit.f46060a;
            case 14:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                ((p1i0) this.receiver).M(th7);
                return Unit.f46060a;
            case 15:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                ((p1i0) this.receiver).M(th8);
                return Unit.f46060a;
            case 16:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                ((p1i0) this.receiver).M(th9);
                return Unit.f46060a;
            case 17:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                ((p1i0) this.receiver).M(th10);
                return Unit.f46060a;
            case 18:
                b2i0 b2i0Var = (b2i0) obj;
                b2i0Var.getClass();
                x1i0 x1i0Var = (x1i0) this.receiver;
                zie0 zie0Var = x1i0.n2;
                x1i0Var.getClass();
                if (b2i0Var.equals(z1i0.f43622a)) {
                    if (!x1i0Var.R()) {
                        x1i0Var.y0();
                    }
                } else {
                    if (!(b2i0Var instanceof a2i0)) {
                        t9f.b();
                        return null;
                    }
                    if (!x1i0Var.R()) {
                        vcc.f0(i120.V(new Pair(x1i0Var.P0().b, ((a2i0) b2i0Var).f126a)), x1i0Var, x1i0Var.P0().b);
                        x1i0Var.y0();
                    }
                }
                x1i0Var.Q0().x(q1i0.f27955a);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                l3i0 l3i0Var = (l3i0) obj;
                l3i0Var.getClass();
                d3i0 d3i0Var = (d3i0) this.receiver;
                gle0 gle0Var = d3i0.n2;
                d3i0Var.getClass();
                if (l3i0Var instanceof f3i0) {
                    vcc.f0(i120.V(new Pair("END_DATE_SELECT_KEY", ((f3i0) l3i0Var).f8866a)), d3i0Var, "END_DATE_SELECT_KEY");
                    vcc.f0(i120.V(new Pair("REQUEST_TIME_FILTER", ygq0.CUSTOM_DATE)), d3i0Var, "REQUEST_TIME_FILTER");
                    d3i0Var.y0();
                } else if (l3i0Var instanceof g3i0) {
                    vcc.f0(i120.V(new Pair("START_DATE_SELECT_KEY", ((g3i0) l3i0Var).f10614a)), d3i0Var, "START_DATE_SELECT_KEY");
                } else if (l3i0Var instanceof h3i0) {
                    vcc.f0(i120.V(new Pair("REQUEST_TIME_FILTER", ygq0.NOT)), d3i0Var, "REQUEST_TIME_FILTER");
                } else if (l3i0Var instanceof i3i0) {
                    vcc.f0(i120.V(new Pair("REQUEST_TIME_FILTER", ((i3i0) l3i0Var).f14098a)), d3i0Var, "REQUEST_TIME_FILTER");
                    d3i0Var.y0();
                } else if (l3i0Var instanceof k3i0) {
                    d3i0Var.U0(new Date(), ((k3i0) l3i0Var).f17620a, "START_DATE_SELECT_KEY", j2i0.f15781a);
                } else {
                    if (!(l3i0Var instanceof j3i0)) {
                        t9f.b();
                        return null;
                    }
                    j3i0 j3i0Var = (j3i0) l3i0Var;
                    d3i0Var.U0(j3i0Var.f15835a, j3i0Var.b, "END_DATE_SELECT_KEY", j2i0.b);
                }
                d3i0Var.T0().x(q2i0.f27999a);
                return Unit.f46060a;
            case 20:
                y2i0 y2i0Var = (y2i0) obj;
                y2i0Var.getClass();
                ((k3t0) this.receiver).x(y2i0Var);
                return Unit.f46060a;
            case 21:
                c4i0 c4i0Var = (c4i0) obj;
                c4i0Var.getClass();
                y3i0 y3i0Var = (y3i0) this.receiver;
                lme0 lme0Var2 = y3i0.n2;
                y3i0Var.getClass();
                if (c4i0Var.equals(a4i0.f225a)) {
                    if (!y3i0Var.R()) {
                        y3i0Var.y0();
                    }
                } else {
                    if (!(c4i0Var instanceof b4i0)) {
                        t9f.b();
                        return null;
                    }
                    if (!y3i0Var.R()) {
                        vcc.f0(i120.V(new Pair(y3i0Var.P0().b, ((b4i0) c4i0Var).f1960a)), y3i0Var, y3i0Var.P0().b);
                        y3i0Var.y0();
                    }
                }
                ((k3t0) y3i0Var.m2.getValue()).x(s3i0.f31560a);
                return Unit.f46060a;
            case 22:
                m7i0 m7i0Var = (m7i0) obj;
                m7i0Var.getClass();
                ((k3t0) this.receiver).x(m7i0Var);
                return Unit.f46060a;
            case 23:
                p8i0 p8i0Var = (p8i0) obj;
                p8i0Var.getClass();
                ((k3t0) this.receiver).x(p8i0Var);
                return Unit.f46060a;
            case 24:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                ((ldi0) this.receiver).C(th11);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                ((Function1) this.receiver).invoke(th12);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Throwable th13 = (Throwable) obj;
                th13.getClass();
                ((ldi0) this.receiver).C(th13);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th14 = (Throwable) obj;
                th14.getClass();
                ((ldi0) this.receiver).C(th14);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Throwable th15 = (Throwable) obj;
                th15.getClass();
                ((ldi0) this.receiver).C(th15);
                return Unit.f46060a;
            default:
                Throwable th16 = (Throwable) obj;
                th16.getClass();
                ((ldi0) this.receiver).C(th16);
                return Unit.f46060a;
        }
    }
}

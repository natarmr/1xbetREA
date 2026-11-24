package a;

import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.bet_history.edit_coupon.presentation.model.OptionSelectBottomSheetDialogModel;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleFighting;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hin extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13121a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hin(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f13121a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [byte] */
    /* JADX WARN: Type inference failed for: r10v4, types: [int] */
    /* JADX WARN: Type inference failed for: r10v5, types: [int] */
    /* JADX WARN: Type inference failed for: r10v6 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        kuw kuwVar;
        Object value;
        syo syoVar;
        String message;
        byte b = this.f13121a;
        vyo vyoVar = vyo.f38257a;
        byte b2 = 25;
        byte b3 = 12;
        ?? errorCode = 0;
        errorCode = 0;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((kin) this.receiver).A(th);
                return Unit.f46060a;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((kin) this.receiver).A(th2);
                return Unit.f46060a;
            case 2:
                hnn hnnVar = (hnn) obj;
                hnnVar.getClass();
                kmn kmnVar = (kmn) this.receiver;
                xak xakVar = kmn.Q1;
                kmnVar.getClass();
                if (hnnVar instanceof enn) {
                    DialogFields dialogFields = ((enn) hnnVar).f8103a;
                    ii iiVar = kmnVar.M1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC = kmnVar.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else if (hnnVar instanceof fnn) {
                    OptionSelectBottomSheetDialogModel optionSelectBottomSheetDialogModel = ((fnn) hnnVar).f9846a;
                    ddk ddkVar = omn.p2;
                    androidx.fragment.app.e eVarC2 = kmnVar.C();
                    eVarC2.getClass();
                    String str = optionSelectBottomSheetDialogModel.b;
                    String str2 = optionSelectBottomSheetDialogModel.d;
                    String str3 = optionSelectBottomSheetDialogModel.f46390a;
                    int i = optionSelectBottomSheetDialogModel.c;
                    List list = optionSelectBottomSheetDialogModel.e;
                    ddkVar.getClass();
                    str.getClass();
                    str2.getClass();
                    str3.getClass();
                    list.getClass();
                    if (eVarC2.J("OPTION_SELECTION_BOTTOM_SHEET_TAG") == null) {
                        omn omnVar = new omn();
                        iiy[] iiyVarArr = omn.q2;
                        omnVar.k2.D(omnVar, iiyVarArr[0], list);
                        omnVar.m2.x(omnVar, iiyVarArr[2], str);
                        omnVar.n2.x(omnVar, iiyVarArr[3], str2);
                        omnVar.o2.I(omnVar, iiyVarArr[4], i);
                        omnVar.l2.x(omnVar, iiyVarArr[1], str3);
                        omnVar.H0(eVarC2, "OPTION_SELECTION_BOTTOM_SHEET_TAG");
                    }
                } else if (hnnVar instanceof gnn) {
                    xdk0 xdk0Var = ((gnn) hnnVar).f11597a;
                    wdk0 wdk0Var = kmnVar.N1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackBarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, xdk0Var, kmnVar, null, null, true, null, 1004);
                } else {
                    if (!hnnVar.equals(dnn.f6378a)) {
                        t9f.b();
                        return null;
                    }
                    vcc.f0(i120.U(), kmnVar, "REQUEST_EDIT_COUPON_DIALOG");
                }
                kmnVar.G0().x(ckn.f4515a);
                return Unit.f46060a;
            case 3:
                wkn wknVar = (wkn) obj;
                wknVar.getClass();
                ((k3t0) this.receiver).x(wknVar);
                return Unit.f46060a;
            case 4:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((wnn) this.receiver).N(th3);
                return Unit.f46060a;
            case 5:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((wnn) this.receiver).N(th4);
                return Unit.f46060a;
            case 6:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                wnn wnnVar = (wnn) this.receiver;
                wnnVar.B.b(th5, new qnn(wnnVar, errorCode));
                return Unit.f46060a;
            case 7:
                hpn hpnVar = (hpn) obj;
                hpnVar.getClass();
                xon xonVar = (xon) this.receiver;
                bek bekVar = xon.S1;
                xonVar.getClass();
                if (hpnVar instanceof epn) {
                    DialogFields dialogFields2 = ((epn) hpnVar).f8197a;
                    ii iiVar2 = xonVar.O1;
                    if (iiVar2 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC3 = xonVar.C();
                    eVarC3.getClass();
                    iiVar2.d(dialogFields2, eVarC3);
                } else if (hpnVar instanceof fpn) {
                    fpn fpnVar = (fpn) hpnVar;
                    String str4 = fpnVar.f9936a;
                    String str5 = fpnVar.b;
                    gst gstVar = gvv.m2;
                    androidx.fragment.app.e eVarC4 = xonVar.C();
                    eVarC4.getClass();
                    gstVar.getClass();
                    str4.getClass();
                    str5.getClass();
                    if (eVarC4.J("HelperBottomSheetDialog") == null) {
                        gvv gvvVar = new gvv();
                        iiy[] iiyVarArr2 = gvv.n2;
                        gvvVar.k2.x(gvvVar, iiyVarArr2[0], str4);
                        gvvVar.l2.x(gvvVar, iiyVarArr2[1], str5);
                        gvvVar.H0(eVarC4, "HelperBottomSheetDialog");
                    }
                } else {
                    if (!(hpnVar instanceof gpn)) {
                        t9f.b();
                        return null;
                    }
                    xdk0 xdk0Var2 = ((gpn) hpnVar).f11691a;
                    wdk0 wdk0Var2 = xonVar.P1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackBarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var2, xdk0Var2, xonVar, null, null, true, null, 1004);
                }
                xonVar.G0().x(xnn.f41177a);
                return Unit.f46060a;
            case 8:
                gon gonVar = (gon) obj;
                gonVar.getClass();
                ((k3t0) this.receiver).x(gonVar);
                return Unit.f46060a;
            case 9:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                mpn mpnVar = (mpn) this.receiver;
                int i2 = mpn.K;
                mpnVar.y.b(th6, new mxm(mpnVar, b2));
                return Unit.f46060a;
            case 10:
                hyn hynVar = (hyn) obj;
                hynVar.getClass();
                ayn aynVar = (ayn) this.receiver;
                sek sekVar = ayn.c2;
                aynVar.getClass();
                if (hynVar.equals(fyn.f10366a)) {
                    j120.g0(aynVar.o0(), i120.U());
                    aynVar.z0(false, false, false);
                } else {
                    if (!hynVar.equals(gyn.f12139a)) {
                        t9f.b();
                        return null;
                    }
                    j120.g0(aynVar.o0(), i120.V(new Pair("SHOW_AUTHORIZATION", Boolean.TRUE)));
                    aynVar.z0(false, false, false);
                }
                aynVar.I0().x(sxn.f32984a);
                return Unit.f46060a;
            case 11:
                s4o s4oVar = (s4o) obj;
                s4oVar.getClass();
                ((k3t0) this.receiver).x(s4oVar);
                return Unit.f46060a;
            case 12:
                y8o y8oVar = (y8o) obj;
                y8oVar.getClass();
                k8o k8oVar = (k8o) this.receiver;
                k8oVar.getClass();
                if (y8oVar instanceof x8o) {
                    x8o x8oVar = (x8o) y8oVar;
                    kxq kxqVarN0 = k8oVar.n0();
                    wdk0 wdk0Var3 = k8oVar.O1;
                    if (wdk0Var3 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    n6x.F(kxqVarN0, wdk0Var3, x8oVar.f40472a, x8oVar.b, x8oVar.c);
                } else {
                    if (!(y8oVar instanceof w8o)) {
                        t9f.b();
                        return null;
                    }
                    w8o w8oVar = (w8o) y8oVar;
                    ujd ujdVar = k8oVar.N1;
                    if (ujdVar == null) {
                        Intrinsics.h("composeGameCardFragmentDelegate");
                        throw null;
                    }
                    ujdVar.b(k8oVar, w8oVar.f38732a);
                }
                k8oVar.G0().x(e7o.f7336a);
                return Unit.f46060a;
            case 13:
                isp ispVar = (isp) obj;
                ispVar.getClass();
                EventCardMiddleFighting eventCardMiddleFighting = (EventCardMiddleFighting) this.receiver;
                int i3 = EventCardMiddleFighting.w;
                return eventCardMiddleFighting.u(ispVar);
            case 14:
                tg2 tg2Var = (tg2) obj;
                tg2Var.getClass();
                cio cioVar = (cio) this.receiver;
                ddk ddkVar2 = cio.P1;
                if (tg2Var instanceof ng2) {
                    ujd ujdVarD = cioVar.G0().m.d();
                    x1x.x(ujdVarD);
                    ujdVarD.b(cioVar, ((ng2) tg2Var).f23464a);
                } else {
                    if (tg2Var instanceof qg2) {
                        ((dbi) cioVar.G0().j.f3330a).o();
                        Intrinsics.h("resourceManager");
                        throw null;
                    }
                    cioVar.getClass();
                    if (tg2Var instanceof sg2) {
                        pek pekVar = s6p.o2;
                        androidx.fragment.app.e eVarC5 = cioVar.C();
                        eVarC5.getClass();
                        wep wepVar = wep.f39029a;
                        pekVar.getClass();
                        pek.p(eVarC5, wepVar, "REMOVE_ALL_SPORT_EVENTS_RESULT");
                    } else if (tg2Var.equals(rg2.f30412a)) {
                        ii iiVar3 = cioVar.G0().f21745a;
                        DialogFields dialogFields3 = new DialogFields((CharSequence) cioVar.G0().b.b.a(R.string.clear, Arrays.copyOf(new Object[0], 0)), (CharSequence) cioVar.G0().b.b.a(R.string.confirm_delete_all_actions, Arrays.copyOf(new Object[0], 0)), (CharSequence) cioVar.G0().b.b.a(R.string.clear, Arrays.copyOf(new Object[0], 0)), cioVar.G0().b.b.a(R.string.cancel, Arrays.copyOf(new Object[0], 0)), (String) null, "REQUEST_CLEAR_GROUPS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC6 = cioVar.C();
                        eVarC6.getClass();
                        iiVar3.d(dialogFields3, eVarC6);
                    } else if (!tg2Var.equals(pg2.f26934a)) {
                        if (!tg2Var.equals(og2.f25196a)) {
                            t9f.b();
                            return null;
                        }
                        View viewQ0 = cioVar.q0();
                        j120.X(viewQ0);
                        viewQ0.clearFocus();
                    }
                }
                cioVar.H0().x(qf2.f28608a);
                return Unit.f46060a;
            case 15:
                gg2 gg2Var = (gg2) obj;
                gg2Var.getClass();
                ((k3t0) this.receiver).x(gg2Var);
                return Unit.f46060a;
            case 16:
                ((oqo) obj).getClass();
                kqo kqoVar = (kqo) this.receiver;
                pek pekVar2 = kqo.P1;
                ii iiVar4 = kqoVar.G0().u;
                DialogFields dialogFields4 = new DialogFields((CharSequence) kqoVar.G0().k.b.a(R.string.coupon_has_items, Arrays.copyOf(new Object[0], 0)), (CharSequence) kqoVar.G0().k.b.a(R.string.coupon_has_items_message, Arrays.copyOf(new Object[0], 0)), (CharSequence) kqoVar.G0().k.b.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0)), kqoVar.G0().k.b.a(R.string.cancel, Arrays.copyOf(new Object[0], 0)), (String) null, "REQUEST_EXPRESS_DIALOG_EXPRESS", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                androidx.fragment.app.e eVarC7 = kqoVar.C();
                eVarC7.getClass();
                iiVar4.d(dialogFields4, eVarC7);
                ((k3t0) kqoVar.N1.getValue()).x(vpo.f37814a);
                return Unit.f46060a;
            case 17:
                hqo hqoVar = (hqo) obj;
                hqoVar.getClass();
                ((k3t0) this.receiver).x(hqoVar);
                return Unit.f46060a;
            case 18:
                gvo gvoVar = (gvo) obj;
                gvoVar.getClass();
                ((k3t0) this.receiver).x(gvoVar);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                cwo cwoVar = (cwo) this.receiver;
                cwoVar.getClass();
                th7.printStackTrace();
                if (th7 instanceof ff5) {
                    cwoVar.H(new x6o((byte) 15));
                } else {
                    cwoVar.H(new x6o((byte) 16));
                }
                return Unit.f46060a;
            case 20:
                xyo xyoVar = (xyo) obj;
                xyoVar.getClass();
                byo byoVar = (byo) this.receiver;
                bek bekVar2 = byo.P1;
                if (xyoVar instanceof uyo) {
                    uyo uyoVar = (uyo) xyoVar;
                    byoVar.I0(uyoVar.b, uyoVar.f36500a);
                } else if (xyoVar instanceof wyo) {
                    String str6 = ((wyo) xyoVar).f39983a;
                    ((egi) byoVar.N1.getValue()).getClass();
                    String strH = byoVar.H(R.string.change_password_title);
                    strH.getClass();
                    str6.getClass();
                    svs0 svs0Var = a2v0.g2;
                    androidx.fragment.app.e eVarF = byoVar.F();
                    c2v0 c2v0Var = new c2v0("CAPTCHA_REQUEST_KEY", new i7a(0, "", 0, m7a.e), "", strH, str6);
                    svs0Var.getClass();
                    svs0.d(eVarF, c2v0Var);
                } else {
                    byoVar.getClass();
                    if (xyoVar.equals(vyoVar)) {
                        ii iiVar5 = (ii) ((egi) byoVar.N1.getValue()).f7767a.n;
                        x1x.y(iiVar5);
                        String strH2 = byoVar.H(R.string.error);
                        String strH3 = byoVar.H(R.string.request_error);
                        String strH4 = byoVar.H(R.string.ok_new);
                        strH4.getClass();
                        DialogFields dialogFields5 = new DialogFields((CharSequence) strH2, (CharSequence) strH3, (CharSequence) strH4, (String) null, (String) null, "ERROR_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1496);
                        androidx.fragment.app.e eVarC8 = byoVar.C();
                        eVarC8.getClass();
                        iiVar5.d(dialogFields5, eVarC8);
                    } else {
                        if (!xyoVar.equals(tyo.f34765a)) {
                            t9f.b();
                            return null;
                        }
                        View view = byoVar.l1;
                        if (view != null) {
                            j120.X(view);
                            view.clearFocus();
                        }
                    }
                }
                byoVar.H0().x(kxo.f19065a);
                return Unit.f46060a;
            case 21:
                wxo wxoVar = (wxo) obj;
                wxoVar.getClass();
                ((k3t0) this.receiver).x(wxoVar);
                return Unit.f46060a;
            case 22:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                gzo gzoVar = (gzo) this.receiver;
                gzoVar.getClass();
                if ((th8 instanceof SocketTimeoutException) || (th8 instanceof UnknownHostException)) {
                    gzoVar.G(vyoVar);
                } else if (th8 instanceof x4x) {
                    p7m0 p7m0Var = gzoVar.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        syoVar = (syo) value;
                        gzoVar.f.getClass();
                        message = th8.getMessage();
                        if (message == null) {
                            message = "";
                        }
                    } while (!p7m0Var.m(value, syo.a(syoVar, false, false, null, null, null, null, message, null, null, yxo.f43432a, 895)));
                } else {
                    zhi0 zhi0Var = th8 instanceof zhi0 ? (zhi0) th8 : null;
                    if (zhi0Var != null && (kuwVar = zhi0Var.c) != null) {
                        errorCode = kuwVar.getErrorCode();
                    }
                    if (errorCode != 0) {
                        nr nrVar = gzoVar.z;
                        String strValueOf = String.valueOf((int) errorCode);
                        nrVar.getClass();
                        strValueOf.getClass();
                        i8i.D("error_code", strValueOf, (kt2) nrVar.b, "acc_change_password_error");
                        b1j.r(errorCode, gzoVar.A.f31684a, 3245L);
                    }
                    gzoVar.x.b(th8, new f5o(gzoVar, (byte) 10));
                }
                return Unit.f46060a;
            case 23:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                ((duj) this.receiver).a(th9);
                return Unit.f46060a;
            case 24:
                v2p v2pVar = (v2p) obj;
                v2pVar.getClass();
                t2p t2pVar = (t2p) this.receiver;
                ddk ddkVar3 = t2p.O1;
                wdk0.k(((igi) t2pVar.L1.getValue()).p, new xdk0(rek0.b, v2pVar.f36697a, null, null, null, null, 124), t2pVar, null, null, false, null, 1020);
                ((k3t0) t2pVar.M1.getValue()).x(h2p.f12345a);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                q2p q2pVar = (q2p) obj;
                q2pVar.getClass();
                ((k3t0) this.receiver).x(q2pVar);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                i3p i3pVar = (i3p) this.receiver;
                i3pVar.u.b(th10, new f5o(i3pVar, b3));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                i3p i3pVar2 = (i3p) this.receiver;
                i3pVar2.z.f(th11, new yhn(i3pVar2, b2));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                i3p i3pVar3 = (i3p) this.receiver;
                i3pVar3.u.b(th12, new f5o(i3pVar3, b3));
                return Unit.f46060a;
            default:
                c5p c5pVar = (c5p) obj;
                c5pVar.getClass();
                m4p m4pVar = (m4p) this.receiver;
                bek bekVar3 = m4p.S1;
                m4pVar.getClass();
                if (c5pVar instanceof a5p) {
                    j120.Y(m4pVar);
                } else {
                    if (!(c5pVar instanceof b5p)) {
                        t9f.b();
                        return null;
                    }
                    ujd ujdVar2 = m4pVar.Q1;
                    if (ujdVar2 == null) {
                        Intrinsics.h("gameCardFragmentDelegate");
                        throw null;
                    }
                    ujdVar2.b(m4pVar, ((b5p) c5pVar).f2014a);
                }
                m4pVar.G0().x(m3p.f21127a);
                return Unit.f46060a;
        }
    }
}

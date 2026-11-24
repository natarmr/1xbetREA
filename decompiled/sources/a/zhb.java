package a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.WebView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zhb extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44385a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zhb(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f44385a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v6, types: [a.zhi0] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        String strValueOf;
        kuw kuwVar;
        byte b = 13;
        byte b2 = 1;
        byte b3 = 5;
        byte b4 = 0;
        ?? r15 = 0;
        switch (this.f44385a) {
            case 0:
                jib jibVar = (jib) obj;
                jibVar.getClass();
                bib bibVar = (bib) this.receiver;
                bj5 bj5Var = bib.X1;
                bibVar.getClass();
                if (jibVar instanceof hib) {
                    hib hibVar = (hib) jibVar;
                    bibVar.V1 = false;
                    bibVar.U1 = false;
                    FixedWebView fixedWebView = bibVar.O1;
                    if (fixedWebView != null) {
                        fixedWebView.d(hibVar.f13105a, hibVar.b);
                    }
                } else if (jibVar instanceof gib) {
                    boolean z = ((gib) jibVar).f11336a;
                    FixedWebView fixedWebView2 = bibVar.O1;
                    if (fixedWebView2 != null && fixedWebView2.b()) {
                        WebView.setWebContentsDebuggingEnabled(z);
                    }
                } else {
                    if (!(jibVar instanceof iib)) {
                        t9f.b();
                        return null;
                    }
                    grj grjVar = bibVar.N1;
                    if (grjVar == null) {
                        Intrinsics.h("deepLinkNavigator");
                        throw null;
                    }
                    grjVar.a(((iib) jibVar).f14821a);
                }
                return Unit.f46060a;
            case 1:
                shb shbVar = (shb) obj;
                shbVar.getClass();
                ((k3t0) this.receiver).x(shbVar);
                return Unit.f46060a;
            case 2:
                wkb wkbVar = (wkb) obj;
                wkbVar.getClass();
                xjb xjbVar = (xjb) this.receiver;
                kj5 kj5Var = xjb.U1;
                xjbVar.getClass();
                if (wkbVar instanceof ukb) {
                    ukb ukbVar = (ukb) wkbVar;
                    ujd ujdVar = xjbVar.L1;
                    if (ujdVar == null) {
                        Intrinsics.h("composeGameCardFragmentDelegate");
                        throw null;
                    }
                    ujdVar.b(xjbVar, ukbVar.f35820a);
                } else {
                    if (!(wkbVar instanceof vkb)) {
                        t9f.b();
                        return null;
                    }
                    vkb vkbVar = (vkb) wkbVar;
                    oll0 oll0Var = xjbVar.M1;
                    if (oll0Var == null) {
                        Intrinsics.h("sportResultHistoryEventCardFragmentDelegate");
                        throw null;
                    }
                    oll0Var.a(xjbVar, vkbVar.f37564a);
                }
                ((k3t0) xjbVar.P1.getValue()).x(bjb.f2697a);
                return Unit.f46060a;
            case 3:
                oj2 oj2Var = (oj2) obj;
                oj2Var.getClass();
                cmb cmbVar = (cmb) this.receiver;
                yk5 yk5Var = cmb.O1;
                cmbVar.getClass();
                if (!oj2Var.equals(oj2.f25340a)) {
                    t9f.b();
                    return null;
                }
                ii iiVar = ((aci) cmbVar.L1.getValue()).d;
                String strH = cmbVar.H(R.string.clear);
                String strH2 = cmbVar.H(R.string.confirm_delete_all_actions);
                String strH3 = cmbVar.H(R.string.clear);
                strH3.getClass();
                DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, cmbVar.H(R.string.cancel), (String) null, "REMOVE_ALL_TOURNAMENTS_RESULT", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                androidx.fragment.app.e eVarC = cmbVar.C();
                eVarC.getClass();
                iiVar.d(dialogFields, eVarC);
                cmbVar.G0().x(si2.f32243a);
                return Unit.f46060a;
            case 4:
                dj2 dj2Var = (dj2) obj;
                dj2Var.getClass();
                ((k3t0) this.receiver).x(dj2Var);
                return Unit.f46060a;
            case 5:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((eqb) this.receiver).x(th);
                return Unit.f46060a;
            case 6:
                String str = (String) obj;
                str.getClass();
                ((hrb) this.receiver).x(str);
                return Unit.f46060a;
            case 7:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                hrb hrbVar = (hrb) this.receiver;
                hrbVar.getClass();
                sac.R(jiu0.a(hrbVar), new lya(hrbVar, b), null, hrbVar.c.f22085a, new fob(hrbVar, th2, r15, b3));
                return Unit.f46060a;
            case 8:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                hrb hrbVar2 = (hrb) this.receiver;
                hrbVar2.getClass();
                sac.R(jiu0.a(hrbVar2), new lya(hrbVar2, b), null, hrbVar2.c.f22085a, new fob(hrbVar2, th3, r15, b3));
                return Unit.f46060a;
            case 9:
                urb urbVar = (urb) obj;
                urbVar.getClass();
                srb srbVar = (srb) this.receiver;
                kj5 kj5Var2 = srb.N1;
                srbVar.getClass();
                if (!urbVar.equals(urb.f36156a)) {
                    t9f.b();
                    return null;
                }
                Context contextO0 = srbVar.o0();
                View currentFocus = srbVar.n0().getCurrentFocus();
                t32 t32Var = new t32((byte) 28);
                if (currentFocus != null) {
                    new Handler(Looper.getMainLooper()).postDelayed(new b1(contextO0, currentFocus.getWindowToken(), t32Var, (byte) 2), 0L);
                }
                wdk0 wdk0Var = ((zni) srbVar.L1.getValue()).k;
                qek0 qek0Var = qek0.f28589a;
                String strH4 = srbVar.H(R.string.add_pin_code_success);
                strH4.getClass();
                wdk0.k(wdk0Var, new xdk0(qek0Var, strH4, null, null, null, null, 124), srbVar, null, null, false, null, 1020);
                ((k3t0) srbVar.M1.getValue()).x(irb.f15248a);
                return Unit.f46060a;
            case 10:
                prb prbVar = (prb) obj;
                prbVar.getClass();
                ((k3t0) this.receiver).x(prbVar);
                return Unit.f46060a;
            case 11:
                CharSequence charSequence = (CharSequence) obj;
                charSequence.getClass();
                s1c s1cVar = (s1c) this.receiver;
                s1cVar.getClass();
                String string = charSequence.toString();
                p7m0 p7m0Var = s1cVar.x;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, f1c.a((f1c) value, string, string.length() > 0, false, false, 249)));
                s1cVar.v.f(x0c.f40063a);
                return Unit.f46060a;
            case 12:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((Function1) this.receiver).invoke(th4);
                return Unit.f46060a;
            case 13:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                s1c s1cVar2 = (s1c) this.receiver;
                s1cVar2.getClass();
                sac.V(jiu0.a(s1cVar2), l1c.f19244a, null, s1cVar2.d.f22085a, new i1c(s1cVar2, r15, b2), 10);
                strValueOf = th5 instanceof zhi0 ? String.valueOf(((zhi0) th5).c.getErrorCode()) : "";
                zg zgVar = s1cVar2.g;
                zgVar.getClass();
                strValueOf.getClass();
                zgVar.f44322a.a("acc_add_email_code_input", xp20.f(new Pair("send_code", "error"), new Pair("error_code", strValueOf)));
                s1cVar2.A(th5);
                return Unit.f46060a;
            case 14:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((s1c) this.receiver).A(th6);
                return Unit.f46060a;
            case 15:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                v7c v7cVar = (v7c) this.receiver;
                i1w0 i1w0Var = v7cVar.c;
                duj dujVar = v7cVar.e;
                ctf0 ctf0Var = v7cVar.f;
                ol60 ol60Var = v7cVar.P;
                boolean z2 = th7 instanceof zhi0;
                r15 = z2 ? (zhi0) th7 : 0;
                int errorCode = (r15 == 0 || (kuwVar = r15.c) == null) ? 0 : kuwVar.getErrorCode();
                if (errorCode != 0) {
                    v7cVar.I(zm4.ERROR, p64.ERROR, String.valueOf(errorCode));
                }
                v7cVar.n.a(th7);
                if ((th7 instanceof SocketTimeoutException) || (th7 instanceof UnknownHostException)) {
                    ol60Var.f(e7c.f7323a);
                } else {
                    byte b5 = 18;
                    if (th7 instanceof an4) {
                        an4 an4Var = (an4) th7;
                        if (v7cVar.d instanceof r5c) {
                            i1w0Var.d(new op7(v7cVar, an4Var, (byte) 29));
                        } else {
                            dujVar.b(an4Var, new kea(v7cVar, an4Var, b5));
                        }
                    } else if (z2) {
                        zhi0 zhi0Var = (zhi0) th7;
                        rek0 rek0Var = rek0.b;
                        kuw kuwVar2 = zhi0Var.c;
                        i2o i2oVar = i2o.AnotherRelatedAccountParticipating;
                        v6c v6cVar = v6c.f36870a;
                        if (kuwVar2 == i2oVar) {
                            String message = zhi0Var.getMessage();
                            strValueOf = message != null ? message : "";
                            ol60Var.f(v6cVar);
                            ol60Var.f(new d7c(rek0Var, strValueOf));
                        } else {
                            if (kuwVar2 == i2o.OldPasswordIncorrect) {
                                i1w0Var.d(new f6c(v7cVar, b4));
                            } else if (kuwVar2 == i2o.TokenExpiredError) {
                                String message2 = zhi0Var.getMessage();
                                ol60Var.f(new f7c(message2 != null ? message2 : ""));
                            } else if (kuwVar2 == i2o.TooManyRequests) {
                                ol60Var.f(v6cVar);
                                ol60Var.f(new d7c(rek0Var, ctf0Var.b.a(R.string.to_many_requests_try_later, Arrays.copyOf(new Object[0], 0))));
                            }
                            dujVar.b(zhi0Var, new kea(v7cVar, zhi0Var, b5));
                        }
                    } else if (th7 instanceof dwq0) {
                        v7cVar.O(ctf0Var.b.a(R.string.to_many_requests_try_later, Arrays.copyOf(new Object[0], 0)));
                    } else {
                        ol60Var.f(b7c.f2100a);
                    }
                }
                return Unit.f46060a;
            case 16:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                ((Function1) this.receiver).invoke(th8);
                return Unit.f46060a;
            case 17:
                qdc qdcVar = (qdc) obj;
                qdcVar.getClass();
                jdc jdcVar = (jdc) this.receiver;
                cl5 cl5Var = jdc.Q1;
                jdcVar.getClass();
                boolean zEquals = qdcVar.equals(odc.f25068a);
                ycc yccVar = ycc.f42378a;
                if (zEquals) {
                    ii iiVar2 = jdcVar.L1;
                    if (iiVar2 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH5 = jdcVar.H(R.string.attention);
                    String strH6 = jdcVar.H(R.string.change_the_limit_question);
                    String strH7 = jdcVar.H(R.string.yes);
                    strH7.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH5, (CharSequence) strH6, (CharSequence) strH7, jdcVar.H(R.string.cancel), (String) null, "SHOW_CONFIRM_CHANGE_LIMIT_DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC2 = jdcVar.C();
                    eVarC2.getClass();
                    iiVar2.d(dialogFields2, eVarC2);
                    jdcVar.G0().x(yccVar);
                } else if (qdcVar.equals(ndc.f23333a)) {
                    jdcVar.F().t0(i120.U(), "SEND_RESULT_REQUEST_KEY");
                    jdcVar.G0().x(yccVar);
                    jdcVar.G0().x(edc.f7609a);
                } else {
                    if (!(qdcVar instanceof pdc)) {
                        t9f.b();
                        return null;
                    }
                    String str2 = ((pdc) qdcVar).f26801a;
                    ii iiVar3 = jdcVar.L1;
                    if (iiVar3 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH8 = jdcVar.H(R.string.attention);
                    String strH9 = jdcVar.H(R.string.yes);
                    strH9.getClass();
                    DialogFields dialogFields3 = new DialogFields((CharSequence) strH8, (CharSequence) str2, (CharSequence) strH9, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528);
                    androidx.fragment.app.e eVarC3 = jdcVar.C();
                    eVarC3.getClass();
                    iiVar3.d(dialogFields3, eVarC3);
                    jdcVar.G0().x(yccVar);
                }
                return Unit.f46060a;
            case 18:
                fdc fdcVar = (fdc) obj;
                fdcVar.getClass();
                ((k3t0) this.receiver).x(fdcVar);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                zec zecVar = (zec) obj;
                zecVar.getClass();
                ((k3t0) this.receiver).x(zecVar);
                return Unit.f46060a;
            case 20:
                pgc pgcVar = (pgc) obj;
                pgcVar.getClass();
                qfc qfcVar = (qfc) this.receiver;
                int i = qfc.m2;
                qfcVar.getClass();
                vcc.f0(i120.V(new Pair("REQUEST_KEY", Integer.valueOf(pgcVar.f26947a))), qfcVar, "REQUEST_KEY");
                qfcVar.y0();
                return Unit.f46060a;
            case 21:
                mgc mgcVar = (mgc) obj;
                mgcVar.getClass();
                ((k3t0) this.receiver).x(mgcVar);
                return Unit.f46060a;
            case 22:
                mgc mgcVar2 = (mgc) obj;
                mgcVar2.getClass();
                ((k3t0) this.receiver).x(mgcVar2);
                return Unit.f46060a;
            case 23:
                nfc nfcVar = (nfc) obj;
                nfcVar.getClass();
                ((k3t0) this.receiver).x(nfcVar);
                return Unit.f46060a;
            case 24:
                nfc nfcVar2 = (nfc) obj;
                nfcVar2.getClass();
                ((k3t0) this.receiver).x(nfcVar2);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                vhc vhcVar = (vhc) obj;
                vhcVar.getClass();
                nhc nhcVar = (nhc) this.receiver;
                bj5 bj5Var2 = nhc.P1;
                nhcVar.getClass();
                if (vhcVar.equals(shc.f32204a)) {
                    ii iiVar4 = nhcVar.M1;
                    if (iiVar4 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH10 = nhcVar.H(R.string.attention);
                    String strH11 = nhcVar.H(R.string.change_the_limit_question);
                    String strH12 = nhcVar.H(R.string.yes);
                    strH12.getClass();
                    DialogFields dialogFields4 = new DialogFields((CharSequence) strH10, (CharSequence) strH11, (CharSequence) strH12, nhcVar.H(R.string.cancel), (String) null, "SHOW_CONFIRM_CHANGE_MONEY_LIMIT_DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC4 = nhcVar.C();
                    eVarC4.getClass();
                    iiVar4.d(dialogFields4, eVarC4);
                } else if (vhcVar instanceof uhc) {
                    String str3 = ((uhc) vhcVar).f35670a;
                    ii iiVar5 = nhcVar.M1;
                    if (iiVar5 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH13 = nhcVar.H(R.string.error);
                    String strH14 = StringsKt.W(str3) ? null : str3;
                    if (strH14 == null) {
                        strH14 = nhcVar.H(R.string.error_something_went_wrong);
                        strH14.getClass();
                    }
                    String strH15 = nhcVar.H(R.string.ok);
                    strH15.getClass();
                    DialogFields dialogFields5 = new DialogFields((CharSequence) strH13, (CharSequence) strH14, (CharSequence) strH15, (String) null, (String) null, "SHOW_ERROR_DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1496);
                    androidx.fragment.app.e eVarC5 = nhcVar.C();
                    eVarC5.getClass();
                    iiVar5.d(dialogFields5, eVarC5);
                } else {
                    if (!vhcVar.equals(thc.f33953a)) {
                        t9f.b();
                        return null;
                    }
                    nhcVar.F().t0(i120.U(), "SEND_RESULT_REQUEST_KEY");
                    nhcVar.G0().x(hhc.f13055a);
                }
                nhcVar.G0().x(ahc.f867a);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                jhc jhcVar = (jhc) obj;
                jhcVar.getClass();
                ((k3t0) this.receiver).x(jhcVar);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                iic iicVar = (iic) obj;
                iicVar.getClass();
                dic dicVar = (dic) this.receiver;
                kj5 kj5Var3 = dic.n2;
                dicVar.getClass();
                if (!iicVar.equals(iic.f14822a)) {
                    t9f.b();
                    return null;
                }
                dicVar.y0();
                ((k3t0) dicVar.m2.getValue()).x(zhc.f44386a);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                cd80 cd80Var = (cd80) obj;
                cd80Var.getClass();
                gnc gncVar = (gnc) this.receiver;
                kl5 kl5Var = gnc.Z1;
                gncVar.getClass();
                if (cd80Var instanceof yc80) {
                    ujd ujdVarD = gncVar.N0().f9838a.d();
                    x1x.x(ujdVarD);
                    ujdVarD.b(gncVar, ((yc80) cd80Var).f42374a);
                } else if (cd80Var instanceof zc80) {
                    afm0 afm0VarB = gncVar.N0().I.b();
                    x1x.x(afm0VarB);
                    afm0VarB.q(gncVar, ((zc80) cd80Var).f44155a, new bnc(gncVar, (byte) 4), new bnc(gncVar, b3));
                } else if (cd80Var instanceof ad80) {
                    ii iiVar6 = gncVar.N0().M;
                    String strH16 = gncVar.H(R.string.clear);
                    String strH17 = gncVar.H(R.string.confirm_delete_all_actions);
                    String strH18 = gncVar.H(R.string.clear);
                    strH18.getClass();
                    DialogFields dialogFields6 = new DialogFields((CharSequence) strH16, (CharSequence) strH17, (CharSequence) strH18, gncVar.H(R.string.cancel), (String) null, "REQUEST_OTHER_CLEAR_GROUPS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC6 = gncVar.C();
                    eVarC6.getClass();
                    iiVar6.d(dialogFields6, eVarC6);
                } else {
                    if (!(cd80Var instanceof bd80)) {
                        t9f.b();
                        return null;
                    }
                    wdk0.k(gncVar.N0().N, new xdk0(rek0.b, ((bd80) cd80Var).f2386a, null, null, null, null, 124), gncVar, null, null, false, null, 1020);
                }
                gncVar.O0().x(xa80.f40541a);
                return Unit.f46060a;
            default:
                ac80 ac80Var = (ac80) obj;
                ac80Var.getClass();
                ((k3t0) this.receiver).x(ac80Var);
                return Unit.f46060a;
        }
    }
}

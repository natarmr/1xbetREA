package a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.ui.platform.ComposeView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.registration.bonus.api.BonusSelectionScreenParams;
import org.xplatform.ui_core.calendar.model.DateCalendarBottomSheetParams;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qye0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29529a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qye0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f29529a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object g0g0Var;
        switch (this.f29529a) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((eze0) this.receiver).R(th);
                return Unit.f46060a;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((eze0) this.receiver).T(th2);
                return Unit.f46060a;
            case 2:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                eze0 eze0Var = (eze0) this.receiver;
                int i = eze0.y0;
                eze0Var.T(th3);
                return Unit.f46060a;
            case 3:
                q3f0 q3f0Var = (q3f0) obj;
                q3f0Var.getClass();
                ((k3t0) this.receiver).x(q3f0Var);
                return Unit.f46060a;
            case 4:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((x5f0) this.receiver).Q(th4);
                return Unit.f46060a;
            case 5:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((x5f0) this.receiver).Q(th5);
                return Unit.f46060a;
            case 6:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((x5f0) this.receiver).Q(th6);
                return Unit.f46060a;
            case 7:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                ((x5f0) this.receiver).Q(th7);
                return Unit.f46060a;
            case 8:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                ((x5f0) this.receiver).Q(th8);
                return Unit.f46060a;
            case 9:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                ((x5f0) this.receiver).Q(th9);
                return Unit.f46060a;
            case 10:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                ((x5f0) this.receiver).S(th10);
                return Unit.f46060a;
            case 11:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                x5f0 x5f0Var = (x5f0) this.receiver;
                int i2 = x5f0.z0;
                x5f0Var.S(th11);
                return Unit.f46060a;
            case 12:
                n7f0 n7f0Var = (n7f0) obj;
                n7f0Var.getClass();
                m6f0 m6f0Var = (m6f0) this.receiver;
                gle0 gle0Var = m6f0.f2;
                m6f0Var.getClass();
                if (n7f0Var instanceof h7f0) {
                    String str = ((h7f0) n7f0Var).f12571a;
                    wdk0 wdk0Var = m6f0Var.Z1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    String strH = m6f0Var.H(R.string.data_copied_to_clipboard);
                    strH.getClass();
                    j120.M(m6f0Var, wdk0Var, "", str, strH, null, Integer.valueOf(R.drawable.data_copy_icon), m6f0Var.K0().b, 16);
                } else if (n7f0Var instanceof j7f0) {
                    String str2 = ((j7f0) n7f0Var).f16038a;
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.putExtra("android.intent.extra.TEXT", str2);
                    intent.setType("text/plain");
                    m6f0Var.w0(Intent.createChooser(intent, null));
                } else if (n7f0Var instanceof l7f0) {
                    wdk0 wdk0Var2 = m6f0Var.Z1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.i(wdk0Var2, new xdk0(rek0.b, ((l7f0) n7f0Var).f19555a, null, null, null, null, 124), m6f0Var.K0().b);
                } else if (n7f0Var instanceof m7f0) {
                    String str3 = ((m7f0) n7f0Var).f21318a;
                    ii iiVar = m6f0Var.a2;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH2 = m6f0Var.H(R.string.authorization_error);
                    String strH3 = m6f0Var.H(R.string.close);
                    strH3.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH2, (CharSequence) str3, (CharSequence) strH3, (String) null, (String) null, "KEY_REQUEST_LOCATION_ERROR", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC = m6f0Var.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else if (n7f0Var instanceof i7f0) {
                    j120.d0(m6f0Var.o0(), "open/paysystems");
                } else {
                    if (!(n7f0Var instanceof k7f0)) {
                        t9f.b();
                        return null;
                    }
                    d7a d7aVar = ((k7f0) n7f0Var).f17816a;
                    if (m6f0Var.b2 == null) {
                        Intrinsics.h("captchaDialogDelegate");
                        throw null;
                    }
                    String strH4 = m6f0Var.H(R.string.authorization);
                    strH4.getClass();
                    gl5.q(m6f0Var, "KEY_REQUEST_CAPTCHA_CODE_DIALOG", d7aVar, strH4);
                }
                m6f0Var.L0().x(z5f0.f43812a);
                return Unit.f46060a;
            case 13:
                i6f0 i6f0Var = (i6f0) obj;
                i6f0Var.getClass();
                ((d7f0) this.receiver).x(i6f0Var);
                return Unit.f46060a;
            case 14:
                lbf0 lbf0Var = (lbf0) obj;
                lbf0Var.getClass();
                iaf0 iaf0Var = (iaf0) this.receiver;
                zie0 zie0Var = iaf0.Z1;
                rek0 rek0Var = rek0.b;
                if (lbf0Var instanceof vaf0) {
                    DateCalendarBottomSheetParams dateCalendarBottomSheetParams = ((vaf0) lbf0Var).f37084a;
                    iaf0Var.getClass();
                    kud kudVar = vcj.m2;
                    androidx.fragment.app.e eVarC2 = iaf0Var.C();
                    eVarC2.getClass();
                    kudVar.getClass();
                    kud.g(dateCalendarBottomSheetParams, eVarC2, "REQUEST_BIRTHDAY_CALENDAR_KEY");
                } else if (lbf0Var instanceof waf0) {
                    String str4 = ((waf0) lbf0Var).f38823a;
                    Context contextO0 = iaf0Var.o0();
                    str4.getClass();
                    try {
                        e0g0 e0g0Var = j0g0.b;
                        Intent intent2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                        intent2.setFlags(268435456);
                        intent2.setData(Uri.parse(str4));
                        contextO0.startActivity(intent2);
                        g0g0Var = Unit.f46060a;
                    } catch (Throwable th12) {
                        e0g0 e0g0Var2 = j0g0.b;
                        g0g0Var = new g0g0(th12);
                    }
                    if (j0g0.a(g0g0Var) != null) {
                        wdk0 wdk0VarG0 = iaf0Var.G0();
                        String strH5 = iaf0Var.H(R.string.open_browser_error_message);
                        strH5.getClass();
                        wdk0.k(wdk0VarG0, new xdk0(rek0Var, strH5, null, null, null, null, 124), iaf0Var, null, null, false, null, 1020);
                    }
                    break;
                } else if (lbf0Var instanceof yaf0) {
                    DateCalendarBottomSheetParams dateCalendarBottomSheetParams2 = ((yaf0) lbf0Var).f42294a;
                    iaf0Var.getClass();
                    kud kudVar2 = vcj.m2;
                    androidx.fragment.app.e eVarC3 = iaf0Var.C();
                    eVarC3.getClass();
                    kudVar2.getClass();
                    kud.g(dateCalendarBottomSheetParams2, eVarC3, "REQUEST_PASSPORT_DATE_EXPIRE_CALENDAR_KEY");
                } else if (lbf0Var instanceof zaf0) {
                    DateCalendarBottomSheetParams dateCalendarBottomSheetParams3 = ((zaf0) lbf0Var).f44065a;
                    iaf0Var.getClass();
                    kud kudVar3 = vcj.m2;
                    androidx.fragment.app.e eVarC4 = iaf0Var.C();
                    eVarC4.getClass();
                    kudVar3.getClass();
                    kud.g(dateCalendarBottomSheetParams3, eVarC4, "REQUEST_PASSPORT_DATE_ISSUE_CALENDAR_KEY");
                } else if (lbf0Var instanceof abf0) {
                    abf0 abf0Var = (abf0) lbf0Var;
                    if (!sj3.v0(iaf0Var.o0(), abf0Var.f576a, abf0Var.b)) {
                        wdk0 wdk0VarG1 = iaf0Var.G0();
                        String strH6 = iaf0Var.H(R.string.registration_gdpr_pdf_error);
                        strH6.getClass();
                        wdk0.k(wdk0VarG1, new xdk0(rek0Var, strH6, null, null, null, null, 124), iaf0Var, null, null, false, null, 1020);
                    }
                    ndk0 ndk0Var = iaf0Var.Y1;
                    if (ndk0Var != null) {
                        ndk0Var.dismiss();
                    }
                } else {
                    yje yjeVar = null;
                    if (lbf0Var instanceof cbf0) {
                        d7a d7aVar2 = ((cbf0) lbf0Var).f4060a;
                        if (iaf0Var.Q1 == null) {
                            Intrinsics.h("captchaDialogDelegate");
                            throw null;
                        }
                        String strH7 = iaf0Var.H(R.string.registration);
                        strH7.getClass();
                        gl5.q(iaf0Var, "UNIVERSAL_REQUEST_CAPTCHA_CODE_DIALOG_KEY", d7aVar2, strH7);
                    } else if (lbf0Var instanceof dbf0) {
                        dbf0 dbf0Var = (dbf0) lbf0Var;
                        int i3 = dbf0Var.b;
                        long j = dbf0Var.c;
                        int i4 = dbf0Var.f5802a;
                        boolean z = dbf0Var.d;
                        if (iaf0Var.S1 == null) {
                            Intrinsics.h("registrationBonusDialogFactory");
                            throw null;
                        }
                        androidx.fragment.app.e eVarC5 = iaf0Var.C();
                        eVarC5.getClass();
                        BonusSelectionScreenParams bonusSelectionScreenParams = new BonusSelectionScreenParams(i4, i3, 1357, j, z);
                        jue0.n2.getClass();
                        if (eVarC5.J("REGISTRATION_BONUS_VISUAL_STYLE_DIALOG_TAG") == null) {
                            jue0 jue0Var = new jue0();
                            jue0Var.k2.J(jue0Var, jue0.o2[0], bonusSelectionScreenParams);
                            jue0Var.H0(eVarC5, "REGISTRATION_BONUS_VISUAL_STYLE_DIALOG_TAG");
                        }
                    } else if (lbf0Var instanceof ebf0) {
                        String strH8 = ((ebf0) lbf0Var).f7516a;
                        wdk0 wdk0VarG2 = iaf0Var.G0();
                        if (strH8.length() == 0) {
                            strH8 = iaf0Var.H(R.string.error_check_input);
                            strH8.getClass();
                        }
                        wdk0.k(wdk0VarG2, new xdk0(rek0Var, strH8, null, null, null, null, 124), iaf0Var, null, null, false, null, 1020);
                    } else if (lbf0Var instanceof gbf0) {
                        boolean z2 = ((gbf0) lbf0Var).f11015a;
                        ndk0 ndk0Var2 = iaf0Var.Y1;
                        if (ndk0Var2 != null) {
                            ndk0Var2.dismiss();
                        }
                        if (z2) {
                            wdk0 wdk0VarG3 = iaf0Var.G0();
                            pek0 pek0Var = pek0.f26859a;
                            String strH9 = iaf0Var.H(R.string.show_loading_document_message);
                            strH9.getClass();
                            iaf0Var.Y1 = wdk0.k(wdk0VarG3, new xdk0(pek0Var, strH9, null, null, rv00.B, null, 108), iaf0Var, null, null, false, null, 1020);
                        }
                    } else if (lbf0Var instanceof ibf0) {
                        String strH10 = ((ibf0) lbf0Var).f14484a;
                        wdk0 wdk0VarG4 = iaf0Var.G0();
                        if (strH10.length() == 0) {
                            strH10 = iaf0Var.H(R.string.error_check_input);
                            strH10.getClass();
                        }
                        wdk0.k(wdk0VarG4, new xdk0(rek0Var, strH10, null, null, null, null, 124), iaf0Var, null, null, false, null, 1020);
                    } else if (lbf0Var instanceof jbf0) {
                        int i5 = ((jbf0) lbf0Var).f16238a;
                        Object objN = iaf0Var.M1.n(iaf0.a2[0], iaf0Var);
                        objN.getClass();
                        ComposeView composeView = ((b4r) objN).f1972a;
                        tkz tkzVarQ = x0x.Q(iaf0Var.u1);
                        rwj rwjVar = tvk.f34603a;
                        vs10 vs10Var = ys10.f43147a;
                        d21 d21Var = new d21((Object) iaf0Var, i5, (Object) composeView, yjeVar, (byte) 15);
                        iaf0Var = iaf0Var;
                        qjj.W(tkzVarQ, vs10Var, null, d21Var, 2);
                    } else {
                        iaf0Var.getClass();
                        if (lbf0Var.equals(kbf0.f18012a)) {
                            ii iiVar2 = iaf0Var.V1;
                            if (iiVar2 == null) {
                                Intrinsics.h("actionDialogManager");
                                throw null;
                            }
                            String strH11 = iaf0Var.H(R.string.error);
                            String strH12 = iaf0Var.H(R.string.user_already_exist_error);
                            String strH13 = iaf0Var.H(R.string.ok_new);
                            strH13.getClass();
                            DialogFields dialogFields2 = new DialogFields((CharSequence) strH11, (CharSequence) strH12, (CharSequence) strH13, (String) null, (String) null, "REQUEST_USER_EXIST_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                            androidx.fragment.app.e eVarC6 = iaf0Var.C();
                            eVarC6.getClass();
                            iiVar2.d(dialogFields2, eVarC6);
                        } else if (lbf0Var.equals(hbf0.f12767a)) {
                            ii iiVar3 = iaf0Var.V1;
                            if (iiVar3 == null) {
                                Intrinsics.h("actionDialogManager");
                                throw null;
                            }
                            String strH14 = iaf0Var.H(R.string.attention);
                            String strH15 = iaf0Var.H(R.string.registration_politically_exposed_person_info);
                            String strH16 = iaf0Var.H(R.string.ok_new);
                            strH16.getClass();
                            DialogFields dialogFields3 = new DialogFields((CharSequence) strH14, (CharSequence) strH15, (CharSequence) strH16, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528);
                            androidx.fragment.app.e eVarC7 = iaf0Var.C();
                            eVarC7.getClass();
                            iiVar3.d(dialogFields3, eVarC7);
                        } else if (lbf0Var.equals(fbf0.f9255a)) {
                            usd usdVar = ebj.i2;
                            String string = iaf0Var.G().getString(R.string.data_retrieval_error);
                            string.getClass();
                            androidx.fragment.app.e eVarC8 = iaf0Var.C();
                            eVarC8.getClass();
                            usdVar.getClass();
                            usd.e(eVarC8, string);
                        } else if (lbf0Var.equals(bbf0.f2306a)) {
                            if (iaf0Var.U1 == null) {
                                Intrinsics.h("authEntryPointsDialogFactory");
                                throw null;
                            }
                            androidx.fragment.app.e eVarC9 = iaf0Var.C();
                            eVarC9.getClass();
                            pek0.n(eVarC9, true);
                        } else if (lbf0Var.equals(xaf0.f40551a)) {
                            ii iiVar4 = iaf0Var.V1;
                            if (iiVar4 == null) {
                                Intrinsics.h("actionDialogManager");
                                throw null;
                            }
                            String strH17 = iaf0Var.H(R.string.caution);
                            String strH18 = iaf0Var.H(R.string.registration_interapt_question);
                            String strH19 = iaf0Var.H(R.string.interrupt);
                            strH19.getClass();
                            DialogFields dialogFields4 = new DialogFields((CharSequence) strH17, (CharSequence) strH18, (CharSequence) strH19, iaf0Var.H(R.string.cancel), (String) null, "REQUEST_EXIT_FROM_REGISTRATION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                            androidx.fragment.app.e eVarC10 = iaf0Var.C();
                            eVarC10.getClass();
                            iiVar4.d(dialogFields4, eVarC10);
                        } else {
                            if (!lbf0Var.equals(uaf0.f35325a)) {
                                t9f.b();
                                return null;
                            }
                            j120.Y(iaf0Var);
                        }
                    }
                }
                iaf0Var.H0().x(k8f0.f17870a);
                return Unit.f46060a;
            case 15:
                Throwable th13 = (Throwable) obj;
                th13.getClass();
                ((ocf0) this.receiver).R(th13);
                return Unit.f46060a;
            case 16:
                Throwable th14 = (Throwable) obj;
                th14.getClass();
                ((ocf0) this.receiver).R(th14);
                return Unit.f46060a;
            case 17:
                Throwable th15 = (Throwable) obj;
                th15.getClass();
                ((ocf0) this.receiver).R(th15);
                return Unit.f46060a;
            case 18:
                Throwable th16 = (Throwable) obj;
                th16.getClass();
                ((ocf0) this.receiver).R(th16);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Throwable th17 = (Throwable) obj;
                th17.getClass();
                ((ocf0) this.receiver).R(th17);
                return Unit.f46060a;
            case 20:
                Throwable th18 = (Throwable) obj;
                th18.getClass();
                ((ocf0) this.receiver).R(th18);
                return Unit.f46060a;
            case 21:
                Throwable th19 = (Throwable) obj;
                th19.getClass();
                ((ocf0) this.receiver).R(th19);
                return Unit.f46060a;
            case 22:
                Throwable th20 = (Throwable) obj;
                th20.getClass();
                ((ocf0) this.receiver).T(th20);
                return Unit.f46060a;
            case 23:
                Throwable th21 = (Throwable) obj;
                th21.getClass();
                ocf0 ocf0Var = (ocf0) this.receiver;
                int i6 = ocf0.z0;
                ocf0Var.T(th21);
                return Unit.f46060a;
            case 24:
                xdf0 xdf0Var = (xdf0) obj;
                xdf0Var.getClass();
                ((k3t0) this.receiver).x(xdf0Var);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ogf0 ogf0Var = (ogf0) obj;
                ogf0Var.getClass();
                lgf0 lgf0Var = (lgf0) this.receiver;
                gle0 gle0Var2 = lgf0.N1;
                lgf0Var.getClass();
                if (ogf0Var instanceof ngf0) {
                    j120.Y(lgf0Var);
                    ngf0 ngf0Var = (ngf0) ogf0Var;
                    nmy nmyVar = ngf0Var.f23483a;
                    cny cnyVar = ngf0Var.b;
                    nek nekVar = m5q.o2;
                    androidx.fragment.app.e eVarC11 = lgf0Var.C();
                    eVarC11.getClass();
                    nekVar.getClass();
                    if (eVarC11.J("FILTERS_BS_DIALOG_TAG") == null) {
                        m5q m5qVar = new m5q();
                        iiy[] iiyVarArr = m5q.p2;
                        m5qVar.k2.u(m5qVar, iiyVarArr[0], nmyVar);
                        m5qVar.l2.u(m5qVar, iiyVarArr[1], cnyVar);
                        m5qVar.H0(eVarC11, "FILTERS_BS_DIALOG_TAG");
                    }
                } else {
                    if (!(ogf0Var instanceof mgf0)) {
                        t9f.b();
                        return null;
                    }
                    j120.Y(lgf0Var);
                    String str5 = ((mgf0) ogf0Var).f21740a;
                    yk5 yk5Var = zsb.n2;
                    androidx.fragment.app.e eVarC12 = lgf0Var.C();
                    eVarC12.getClass();
                    yk5Var.getClass();
                    if (eVarC12.J("CHANGE_VALUE_BS_DIALOG_TAG") == null) {
                        zsb zsbVar = new zsb();
                        zsbVar.k2.x(zsbVar, zsb.o2[0], str5);
                        zsbVar.H0(eVarC12, "CHANGE_VALUE_BS_DIALOG_TAG");
                    }
                }
                lgf0Var.G0().x(agf0.f822a);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                hgf0 hgf0Var = (hgf0) obj;
                hgf0Var.getClass();
                ((k3t0) this.receiver).x(hgf0Var);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Object objF = ((m0o0) this.receiver).f((yje) obj);
                return objF == wne.f39444a ? objF : Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Object objF2 = ((m0o0) this.receiver).f((yje) obj);
                return objF2 == wne.f39444a ? objF2 : Unit.f46060a;
            default:
                Object objF3 = ((m0o0) this.receiver).f((yje) obj);
                return objF3 == wne.f39444a ? objF3 : Unit.f46060a;
        }
    }
}

package a;

import android.content.Context;
import android.content.Intent;
import android.javax.sip.message.Response;
import android.net.Uri;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.registration_default.api.presentation.model.RegistrationDefaultScreenParams;
import org.xplatform.registration_default.impl.presentation.registration_bonus.models.RegistrationBonusDefaultScreenParams;
import org.xplatform.ui_core.calendar.model.DateCalendarBottomSheetParams;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d8e0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5643a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d8e0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f5643a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        Object value3;
        ArrayList arrayList;
        Object g0g0Var;
        yje yjeVar = null;
        switch (this.f5643a) {
            case 0:
                a8e0 a8e0Var = (a8e0) obj;
                a8e0Var.getClass();
                ((k3t0) this.receiver).x(a8e0Var);
                return Unit.f46060a;
            case 1:
                Throwable th = (Throwable) obj;
                th.getClass();
                x8e0 x8e0Var = (x8e0) this.receiver;
                x8e0Var.getClass();
                th.printStackTrace();
                p7m0 p7m0Var = x8e0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    x8e0Var.f.getClass();
                } while (!p7m0Var.m(value, l8e0.a((l8e0) value, false, true, null, null, null, null, 0, false, false, 2044)));
                return Unit.f46060a;
            case 2:
                gsz gszVar = (gsz) obj;
                gszVar.getClass();
                nde0 nde0Var = (nde0) this.receiver;
                nde0Var.getClass();
                csz cszVar = gszVar.f11855a;
                p7m0 p7m0Var2 = nde0Var.h;
                do {
                    value2 = p7m0Var2.getValue();
                    List<gsz> list = (List) value2;
                    int value4 = cszVar.getValue();
                    nde0Var.b.e("CURRENT_SELECTED_LIMIT_BUNDLE_KEY", Integer.valueOf(value4));
                    p7m0 p7m0Var3 = nde0Var.i;
                    do {
                        value3 = p7m0Var3.getValue();
                        ((Boolean) value3).getClass();
                    } while (!p7m0Var3.m(value3, Boolean.valueOf(value4 != nde0Var.k)));
                    arrayList = new ArrayList(r3d.q(list, 10));
                    for (gsz gszVar2 : list) {
                        arrayList.add(new gsz(gszVar2.f11855a, gszVar2.f11855a.equals(cszVar)));
                    }
                } while (!p7m0Var2.m(value2, arrayList));
                return Unit.f46060a;
            case 3:
                ((yce0) obj).getClass();
                xce0 xce0Var = (xce0) this.receiver;
                fl70 fl70Var = xce0.N1;
                Context contextD = xce0Var.D();
                if (contextD != null) {
                    j120.g0(contextD, i120.U());
                }
                ((k3t0) xce0Var.M1.getValue()).x(sce0.f31983a);
                return Unit.f46060a;
            case 4:
                uce0 uce0Var = (uce0) obj;
                uce0Var.getClass();
                ((k3t0) this.receiver).x(uce0Var);
                return Unit.f46060a;
            case 5:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((dde0) this.receiver).u.b(th2, new k8e0((byte) 1));
                return Unit.f46060a;
            case 6:
                mfe0 mfe0Var = (mfe0) obj;
                mfe0Var.getClass();
                bfe0 bfe0Var = (bfe0) this.receiver;
                rl70 rl70Var = bfe0.R1;
                bfe0Var.getClass();
                if (mfe0Var instanceof lfe0) {
                    lfe0 lfe0Var = (lfe0) mfe0Var;
                    String str = lfe0Var.f19952a;
                    String str2 = lfe0Var.b;
                    String str3 = lfe0Var.c;
                    ii iiVar = bfe0Var.M1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    DialogFields dialogFields = new DialogFields((CharSequence) str, (CharSequence) str2, (CharSequence) str3, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC = bfe0Var.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else if (mfe0Var instanceof kfe0) {
                    String str4 = ((kfe0) mfe0Var).f18192a;
                    wdk0 wdk0Var = bfe0Var.O1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, new xdk0(rek0.b, str4, null, null, null, null, 124), bfe0Var, null, null, false, null, 1020);
                } else if (mfe0Var instanceof jfe0) {
                    ob0 ob0Var = ((jfe0) mfe0Var).f16422a;
                    if (ob0Var instanceof mb0) {
                        String str5 = ((mb0) ob0Var).f21481a;
                        ynb ynbVar = bfe0Var.N1;
                        if (ynbVar == null) {
                            Intrinsics.h("changeBalanceDialogProvider");
                            throw null;
                        }
                        bm5 bm5Var = bm5.e;
                        androidx.fragment.app.e eVarC2 = bfe0Var.C();
                        eVarC2.getClass();
                        ynb.b(ynbVar, bm5Var, str5, eVarC2, false, "REQUEST_CHANGE_BALANCE_KEY", Response.BUSY_HERE);
                    } else if (ob0Var.equals(lb0.f19732a)) {
                        kxq kxqVarB = bfe0Var.B();
                        if (kxqVarB != null) {
                            ii iiVar2 = bfe0Var.M1;
                            if (iiVar2 == null) {
                                Intrinsics.h("actionDialogManager");
                                throw null;
                            }
                            String string = kxqVarB.getString(R.string.attention);
                            String string2 = kxqVarB.getString(R.string.casino_guard_notify_description);
                            String string3 = kxqVarB.getString(R.string.ok);
                            string3.getClass();
                            iiVar2.d(new DialogFields((CharSequence) string, (CharSequence) string2, (CharSequence) string3, (String) null, (String) null, "REQUEST_ATTENTION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496), kxqVarB.r());
                        }
                    } else {
                        if (!ob0Var.equals(nb0.f23215a)) {
                            t9f.b();
                            return null;
                        }
                        kxq kxqVarB2 = bfe0Var.B();
                        if (kxqVarB2 != null) {
                            ii iiVar3 = bfe0Var.M1;
                            if (iiVar3 == null) {
                                Intrinsics.h("actionDialogManager");
                                throw null;
                            }
                            String string4 = kxqVarB2.getString(R.string.attention);
                            String string5 = kxqVarB2.getString(R.string.selected_balance_unavailable_description);
                            String string6 = kxqVarB2.getString(R.string.ok);
                            string6.getClass();
                            iiVar3.d(new DialogFields((CharSequence) string4, (CharSequence) string5, (CharSequence) string6, (String) null, (String) null, "REQUEST_ATTENTION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496), kxqVarB2.r());
                        }
                    }
                }
                bfe0Var.G0().x(eee0.f7669a);
                return Unit.f46060a;
            case 7:
                pee0 pee0Var = (pee0) obj;
                pee0Var.getClass();
                ((k3t0) this.receiver).x(pee0Var);
                return Unit.f46060a;
            case 8:
                wie0 wie0Var = (wie0) obj;
                wie0Var.getClass();
                ((k3t0) this.receiver).x(wie0Var);
                return Unit.f46060a;
            case 9:
                wje0 wje0Var = (wje0) obj;
                wje0Var.getClass();
                ((qke0) this.receiver).x(wje0Var);
                return Unit.f46060a;
            case 10:
                tke0 tke0Var = (tke0) obj;
                tke0Var.getClass();
                ((k3t0) this.receiver).x(tke0Var);
                return Unit.f46060a;
            case 11:
                jme0 jme0Var = (jme0) obj;
                jme0Var.getClass();
                ((k3t0) this.receiver).x(jme0Var);
                return Unit.f46060a;
            case 12:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((duj) this.receiver).a(th3);
                return Unit.f46060a;
            case 13:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((duj) this.receiver).a(th4);
                return Unit.f46060a;
            case 14:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((duj) this.receiver).a(th5);
                return Unit.f46060a;
            case 15:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((duj) this.receiver).a(th6);
                return Unit.f46060a;
            case 16:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                ((duj) this.receiver).a(th7);
                return Unit.f46060a;
            case 17:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                ((tpe0) this.receiver).x(th8);
                return Unit.f46060a;
            case 18:
                lg8 lg8Var = (lg8) obj;
                lg8Var.getClass();
                eue0 eue0Var = (eue0) this.receiver;
                zie0 zie0Var = eue0.n2;
                eue0Var.getClass();
                vcc.f0(i120.V(new Pair("KEY_ID_BONUS", Integer.valueOf(lg8Var.f19995a)), new Pair("KEY_NAME_BONUS", lg8Var.b)), eue0Var, "KEY_CHOOSE_BONUS");
                eue0Var.y0();
                ((k3t0) eue0Var.m2.getValue()).x(ig8.f14724a);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                kg8 kg8Var = (kg8) obj;
                kg8Var.getClass();
                ((k3t0) this.receiver).x(kg8Var);
                return Unit.f46060a;
            case 20:
                ug8 ug8Var = (ug8) obj;
                ug8Var.getClass();
                jue0 jue0Var = (jue0) this.receiver;
                gle0 gle0Var = jue0.n2;
                jue0Var.getClass();
                vcc.f0(i120.V(new Pair("KEY_SELECTED_BONUS_ID", Integer.valueOf(ug8Var.f35612a))), jue0Var, "KEY_SELECT_BONUS");
                jue0Var.y0();
                ((k3t0) jue0Var.m2.getValue()).x(rg8.f30420a);
                return Unit.f46060a;
            case 21:
                tg8 tg8Var = (tg8) obj;
                tg8Var.getClass();
                ((k3t0) this.receiver).x(tg8Var);
                return Unit.f46060a;
            case 22:
                hwe0 hwe0Var = (hwe0) obj;
                hwe0Var.getClass();
                ((k3t0) this.receiver).x(hwe0Var);
                return Unit.f46060a;
            case 23:
                zxe0 zxe0Var = (zxe0) obj;
                zxe0Var.getClass();
                dxe0 dxe0Var = (dxe0) this.receiver;
                lme0 lme0Var = dxe0.Y1;
                dxe0Var.getClass();
                rek0 rek0Var = rek0.b;
                if (zxe0Var instanceof jxe0) {
                    DateCalendarBottomSheetParams dateCalendarBottomSheetParams = ((jxe0) zxe0Var).f17304a;
                    kud kudVar = vcj.m2;
                    androidx.fragment.app.e eVarC3 = dxe0Var.C();
                    eVarC3.getClass();
                    kudVar.getClass();
                    kud.g(dateCalendarBottomSheetParams, eVarC3, "REQUEST_BIRTHDAY_CALENDAR_KEY");
                } else if (zxe0Var instanceof kxe0) {
                    String str6 = ((kxe0) zxe0Var).f19051a;
                    Context contextO0 = dxe0Var.o0();
                    str6.getClass();
                    try {
                        e0g0 e0g0Var = j0g0.b;
                        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                        intent.setFlags(268435456);
                        intent.setData(Uri.parse(str6));
                        contextO0.startActivity(intent);
                        g0g0Var = Unit.f46060a;
                    } catch (Throwable th9) {
                        e0g0 e0g0Var2 = j0g0.b;
                        g0g0Var = new g0g0(th9);
                    }
                    if (j0g0.a(g0g0Var) != null) {
                        wdk0 wdk0Var2 = dxe0Var.Q1;
                        if (wdk0Var2 == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        String strH = dxe0Var.H(R.string.open_browser_error_message);
                        strH.getClass();
                        wdk0.k(wdk0Var2, new xdk0(rek0Var, strH, null, null, null, null, 124), dxe0Var, null, null, false, null, 1020);
                    }
                    break;
                } else if (zxe0Var instanceof mxe0) {
                    DateCalendarBottomSheetParams dateCalendarBottomSheetParams2 = ((mxe0) zxe0Var).f22551a;
                    kud kudVar2 = vcj.m2;
                    androidx.fragment.app.e eVarC4 = dxe0Var.C();
                    eVarC4.getClass();
                    kudVar2.getClass();
                    kud.g(dateCalendarBottomSheetParams2, eVarC4, "REQUEST_PASSPORT_DATE_EXPIRE_CALENDAR_KEY");
                } else if (zxe0Var instanceof nxe0) {
                    DateCalendarBottomSheetParams dateCalendarBottomSheetParams3 = ((nxe0) zxe0Var).f24280a;
                    kud kudVar3 = vcj.m2;
                    androidx.fragment.app.e eVarC5 = dxe0Var.C();
                    eVarC5.getClass();
                    kudVar3.getClass();
                    kud.g(dateCalendarBottomSheetParams3, eVarC5, "REQUEST_PASSPORT_DATE_ISSUE_CALENDAR_KEY");
                } else if (zxe0Var instanceof oxe0) {
                    oxe0 oxe0Var = (oxe0) zxe0Var;
                    if (!sj3.v0(dxe0Var.o0(), oxe0Var.f26008a, oxe0Var.b)) {
                        wdk0 wdk0Var3 = dxe0Var.Q1;
                        if (wdk0Var3 == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        String strH2 = dxe0Var.H(R.string.registration_gdpr_pdf_error);
                        strH2.getClass();
                        wdk0.k(wdk0Var3, new xdk0(rek0Var, strH2, null, null, null, null, 124), dxe0Var, null, null, false, null, 1020);
                    }
                    ndk0 ndk0Var = dxe0Var.S1;
                    if (ndk0Var != null) {
                        ndk0Var.dismiss();
                    }
                } else if (zxe0Var instanceof qxe0) {
                    d7a d7aVar = ((qxe0) zxe0Var).f29481a;
                    if (dxe0Var.M1 == null) {
                        Intrinsics.h("captchaDialogDelegate");
                        throw null;
                    }
                    String str7 = "UNIVERSAL_REQUEST_CAPTCHA_CODE_DIALOG_KEY_" + ((RegistrationDefaultScreenParams) dxe0Var.V1.n(dxe0Var, dxe0.Z1[1])).f46869a;
                    String strH3 = dxe0Var.H(R.string.registration);
                    strH3.getClass();
                    gl5.q(dxe0Var, str7, d7aVar, strH3);
                } else if (zxe0Var instanceof rxe0) {
                    rxe0 rxe0Var = (rxe0) zxe0Var;
                    int i = rxe0Var.f31262a;
                    int i2 = rxe0Var.b;
                    long j = rxe0Var.c;
                    boolean z = rxe0Var.d;
                    zie0 zie0Var2 = eue0.n2;
                    androidx.fragment.app.e eVarC6 = dxe0Var.C();
                    eVarC6.getClass();
                    zie0Var2.getClass();
                    if (eVarC6.J("REGISTRATION_BONUS_DEFAULT_DIALOG_TAG") == null) {
                        eue0 eue0Var2 = new eue0();
                        eue0Var2.k2.J(eue0Var2, eue0.o2[0], new RegistrationBonusDefaultScreenParams(i, i2, 1357, j, z));
                        eue0Var2.H0(eVarC6, "REGISTRATION_BONUS_DEFAULT_DIALOG_TAG");
                    }
                } else if (zxe0Var instanceof sxe0) {
                    dxe0Var.H0(((sxe0) zxe0Var).f32974a);
                } else if (zxe0Var instanceof uxe0) {
                    boolean z2 = ((uxe0) zxe0Var).f36438a;
                    ndk0 ndk0Var2 = dxe0Var.S1;
                    if (ndk0Var2 != null) {
                        ndk0Var2.dismiss();
                    }
                    if (z2) {
                        wdk0 wdk0Var4 = dxe0Var.Q1;
                        if (wdk0Var4 == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        pek0 pek0Var = pek0.f26859a;
                        String strH4 = dxe0Var.H(R.string.show_loading_document_message);
                        strH4.getClass();
                        dxe0Var.S1 = wdk0.k(wdk0Var4, new xdk0(pek0Var, strH4, null, null, rv00.B, null, 108), dxe0Var, null, null, false, null, 1020);
                    }
                } else if (zxe0Var instanceof wxe0) {
                    dxe0Var.H0(((wxe0) zxe0Var).f39929a);
                } else if (zxe0Var instanceof xxe0) {
                    int i3 = ((xxe0) zxe0Var).f41655a;
                    tkz tkzVarQ = x0x.Q(dxe0Var.u1);
                    rwj rwjVar = tvk.f34603a;
                    qjj.W(tkzVarQ, ys10.f43147a, null, new u52((Object) dxe0Var, i3, yjeVar, (byte) 21), 2);
                } else if (zxe0Var.equals(yxe0.f43416a)) {
                    ii iiVar4 = dxe0Var.P1;
                    if (iiVar4 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH5 = dxe0Var.H(R.string.error);
                    String strH6 = dxe0Var.H(R.string.user_already_exist_error);
                    String strH7 = dxe0Var.H(R.string.ok_new);
                    strH7.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH5, (CharSequence) strH6, (CharSequence) strH7, (String) null, (String) null, "REQUEST_USER_EXIST_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC7 = dxe0Var.C();
                    eVarC7.getClass();
                    iiVar4.d(dialogFields2, eVarC7);
                } else if (zxe0Var.equals(vxe0.f38195a)) {
                    ii iiVar5 = dxe0Var.P1;
                    if (iiVar5 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH8 = dxe0Var.H(R.string.attention);
                    String strH9 = dxe0Var.H(R.string.registration_politically_exposed_person_info);
                    String strH10 = dxe0Var.H(R.string.ok_new);
                    strH10.getClass();
                    DialogFields dialogFields3 = new DialogFields((CharSequence) strH8, (CharSequence) strH9, (CharSequence) strH10, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528);
                    androidx.fragment.app.e eVarC8 = dxe0Var.C();
                    eVarC8.getClass();
                    iiVar5.d(dialogFields3, eVarC8);
                } else if (zxe0Var.equals(txe0.f34695a)) {
                    usd usdVar = ebj.i2;
                    String string7 = dxe0Var.G().getString(R.string.data_retrieval_error);
                    string7.getClass();
                    androidx.fragment.app.e eVarC9 = dxe0Var.C();
                    eVarC9.getClass();
                    usdVar.getClass();
                    usd.e(eVarC9, string7);
                } else if (zxe0Var.equals(pxe0.f27750a)) {
                    if (dxe0Var.O1 == null) {
                        Intrinsics.h("authEntryPointsDialogFactory");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC10 = dxe0Var.C();
                    eVarC10.getClass();
                    pek0.n(eVarC10, true);
                } else if (zxe0Var.equals(lxe0.f20812a)) {
                    ii iiVar6 = dxe0Var.P1;
                    if (iiVar6 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH11 = dxe0Var.H(R.string.caution);
                    String strH12 = dxe0Var.H(R.string.registration_interapt_question);
                    String strH13 = dxe0Var.H(R.string.interrupt);
                    strH13.getClass();
                    DialogFields dialogFields4 = new DialogFields((CharSequence) strH11, (CharSequence) strH12, (CharSequence) strH13, dxe0Var.H(R.string.cancel), (String) null, "REQUEST_EXIT_FROM_REGISTRATION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                    androidx.fragment.app.e eVarC11 = dxe0Var.C();
                    eVarC11.getClass();
                    iiVar6.d(dialogFields4, eVarC11);
                } else {
                    if (!zxe0Var.equals(ixe0.f15539a)) {
                        t9f.b();
                        return null;
                    }
                    j120.Y(dxe0Var);
                }
                dxe0Var.G0().x(yue0.f43265a);
                return Unit.f46060a;
            case 24:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                ((eze0) this.receiver).R(th10);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                ((eze0) this.receiver).R(th11);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                ((eze0) this.receiver).R(th12);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th13 = (Throwable) obj;
                th13.getClass();
                ((eze0) this.receiver).R(th13);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Throwable th14 = (Throwable) obj;
                th14.getClass();
                ((eze0) this.receiver).R(th14);
                return Unit.f46060a;
            default:
                Throwable th15 = (Throwable) obj;
                th15.getClass();
                ((eze0) this.receiver).R(th15);
                return Unit.f46060a;
        }
    }
}

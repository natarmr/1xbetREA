package a;

import android.app.Dialog;
import android.gov.nist.core.Separators;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetAlertModel;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetInfoItem;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetStringModel;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yw10 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43349a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yw10(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f43349a = b;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0386  */
    /* JADX WARN: Code duplicated, block: B:74:0x028f  */
    /* JADX WARN: Code duplicated, block: B:75:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:77:0x02ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:79:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:80:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:83:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:91:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:95:0x0312  */
    /* JADX WARN: Code duplicated, block: B:97:0x0326  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        kuw kuwVar;
        b720 b720Var;
        Window window;
        Window window2;
        Window window3;
        String strH;
        Window window4;
        String strH2;
        String str;
        en7 en7Var;
        int iOrdinal;
        String strI0;
        lgn0 lgn0Var;
        lc00 lc00VarB;
        int i;
        String str2;
        String str3;
        byte b = this.f43349a;
        zq00 zq00Var = zq00.f44786a;
        byte b2 = 15;
        byte b3 = 5;
        byte b4 = 4;
        Object obj2 = k320.f17598a;
        lb20 lb20Var = lb20.f19736a;
        mb20 mb20Var = mb20.f21486a;
        byte b5 = 1;
        byte b6 = 0;
        String strH3 = null;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((cx10) this.receiver).y(th);
                return Unit.f46060a;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((cx10) this.receiver).y(th2);
                return Unit.f46060a;
            case 2:
                bv30 bv30Var = (bv30) obj;
                bv30Var.getClass();
                ((k3t0) this.receiver).x(bv30Var);
                return Unit.f46060a;
            case 3:
                bv30 bv30Var2 = (bv30) obj;
                bv30Var2.getClass();
                ((k3t0) this.receiver).x(bv30Var2);
                return Unit.f46060a;
            case 4:
                bv30 bv30Var3 = (bv30) obj;
                bv30Var3.getClass();
                ((k3t0) this.receiver).x(bv30Var3);
                return Unit.f46060a;
            case 5:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                w220 w220Var = (w220) this.receiver;
                duj dujVar = w220Var.e0;
                if ((th3 instanceof zhi0) && ((kuwVar = ((zhi0) th3).c) == i2o.BetFromAnotherUser || kuwVar == i2o.SavedCouponsLimit)) {
                    dujVar.b(th3, new n120(w220Var, b6));
                } else {
                    dujVar.b(th3, new yr0(th3, (byte) 15));
                }
                return Unit.f46060a;
            case 6:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                h620 h620Var = (h620) this.receiver;
                h620Var.e.b(th4, new q520(h620Var, (byte) 1));
                p7m0 p7m0Var = h620Var.m0;
                p7m0Var.getClass();
                p7m0Var.o(null, zq00Var);
                return Unit.f46060a;
            case 7:
                zc20 zc20Var = (zc20) obj;
                zc20Var.getClass();
                b720 b720Var2 = (b720) this.receiver;
                evz evzVar = b720.w2;
                b720Var2.getClass();
                yzn0 yzn0Var = b720Var2.s2;
                if (zc20Var.equals(mb20Var)) {
                    gnm0.i(b720Var2.C());
                } else if (zc20Var.equals(fc20.f9289a)) {
                    gnm0.s(b720Var2.C());
                } else if (zc20Var.equals(uc20.f35409a)) {
                    ii iiVar = b720Var2.l2;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH4 = b720Var2.H(R.string.confirmation);
                    String strH5 = b720Var2.H(R.string.advancedbet_contract_agree_new);
                    String strH6 = b720Var2.H(R.string.yes);
                    strH6.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, b720Var2.H(R.string.no), (String) null, "REQUEST_ADVANCE_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC = b720Var2.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else if (zc20Var instanceof nc20) {
                    ngc0 ngc0Var = ((nc20) zc20Var).f23271a;
                    iw20 iw20Var = b720Var2.n2;
                    if (iw20Var == null) {
                        Intrinsics.h("promoCodesNavigator");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC2 = b720Var2.C();
                    eVarC2.getClass();
                    iw20Var.j(eVarC2, ngc0Var);
                } else if (zc20Var instanceof ic20) {
                    ic20 ic20Var = (ic20) zc20Var;
                    hg7 hg7Var = ic20Var.i;
                    if (hg7Var == hg7.b) {
                        strH = w6x.q(b720Var2.H(R.string.promo), ": ", b720Var2.H(R.string.single));
                    } else {
                        strH = b720Var2.H(R.string.single);
                        strH.getClass();
                    }
                    String str4 = strH;
                    lgn0 lgn0Var2 = b720Var2.m2;
                    if (lgn0Var2 == null) {
                        Intrinsics.h("successBetAlertManager");
                        throw null;
                    }
                    SuccessBetStringModel successBetStringModel = new SuccessBetStringModel(ic20Var.g, null, ic20Var.k, null);
                    String str5 = ic20Var.e;
                    lc00 lc00VarB2 = kotlin.collections.a.b();
                    String str6 = ic20Var.j;
                    int iOrdinal2 = hg7Var.ordinal();
                    if (iOrdinal2 == 0) {
                        strH3 = b720Var2.H(R.string.bet_sum);
                    } else if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 2) {
                            t9f.b();
                            return null;
                        }
                        strH3 = b720Var2.H(R.string.autobet_sum);
                    }
                    String str7 = strH3;
                    b5 = str6.length() != 0 ? (byte) 0 : (byte) 1;
                    String strH7 = b720Var2.H(b5 == 0 ? R.string.maximum_coef : R.string.coefficient);
                    strH7.getClass();
                    lc00VarB2.add(new SuccessBetInfoItem.Simple(strH7, ic20Var.b));
                    if (b5 == 0) {
                        String strH8 = b720Var2.H(R.string.optional_coef);
                        strH8.getClass();
                        lc00VarB2.add(new SuccessBetInfoItem.Simple(strH8, str6));
                    }
                    if (str7 != null) {
                        lc00VarB2.add(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitTextPrimary, b720Var2.o0()), str7, ic20Var.f14515a, ic20Var.d, true));
                    }
                    gnb0 gnb0Var = ic20Var.h;
                    if (gnb0Var != null) {
                        lc00VarB2.add(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitCommerce, b720Var2.o0()), gnb0Var.f11578a, gnb0Var.b, ic20Var.d, false));
                    }
                    lgn0Var2.c(successBetStringModel, new SuccessBetAlertModel(str4, str5, "REQUEST_SUCCESS_BET_KEY", Long.valueOf(ic20Var.c), hg7Var.name(), kotlin.collections.a.a(lc00VarB2)), b720Var2.p0());
                    if (!b720Var2.R()) {
                        b720Var2.y0();
                    }
                } else if (zc20Var instanceof qc20) {
                    xdk0 xdk0Var = ((qc20) zc20Var).f28468a;
                    View view = b720Var2.l1;
                    if (view == null) {
                        Dialog dialog = b720Var2.S1;
                        view = (dialog == null || (window3 = dialog.getWindow()) == null) ? null : (ViewGroup) window3.findViewById(android.R.id.content);
                    }
                    View view2 = view;
                    wdk0 wdk0Var = b720Var2.p2;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, xdk0Var, b720Var2, null, view2, false, null, 1012);
                } else if (zc20Var.equals(xb20.f40579a)) {
                    ynb ynbVar = b720Var2.o2;
                    if (ynbVar == null) {
                        Intrinsics.h("changeBalanceDialogProvider");
                        throw null;
                    }
                    bm5 bm5Var = bm5.b;
                    androidx.fragment.app.e eVarC3 = b720Var2.C();
                    eVarC3.getClass();
                    ynb.b(ynbVar, bm5Var, null, eVarC3, false, "CHANGE_BALANCE_REQUEST_KEY", 494);
                } else if (zc20Var instanceof cc20) {
                    String str8 = ((cc20) zc20Var).f4090a;
                    String strH9 = b720Var2.H(R.string.top_up);
                    strH9.getClass();
                    b720Var2.R0(str8, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY", strH9);
                } else if (zc20Var instanceof tb20) {
                    String str9 = ((tb20) zc20Var).f33641a;
                    String strH10 = b720Var2.H(R.string.ok);
                    strH10.getClass();
                    b720Var2.R0(str9, "REQUEST_BET_EXISTS_DIALOG_KEY", strH10);
                } else if (zc20Var.equals(jb20.f16218a)) {
                    j120.Y(b720Var2);
                    View view3 = b720Var2.l1;
                    if (view3 != null) {
                        view3.clearFocus();
                    }
                } else {
                    if (zc20Var instanceof za20) {
                        aud audVar = ((za20) zc20Var).f44048a;
                        mdk0 mdk0Var = b720Var2.r2;
                        if (mdk0Var != null) {
                            mdk0Var.dismiss();
                        }
                        vq vqVar = b720Var2.q2;
                        if (vqVar == null) {
                            Intrinsics.h("addEventToCouponDelegate");
                            throw null;
                        }
                        Dialog dialog2 = b720Var2.S1;
                        View decorView = (dialog2 == null || (window2 = dialog2.getWindow()) == null) ? null : window2.getDecorView();
                        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
                        ctc ctcVar = ctc.c;
                        ms2 ms2VarP0 = b720Var2.P0();
                        iiy[] iiyVarArr = b720.x2;
                        yq yqVarA = vqVar.a(b720Var2, audVar, viewGroup, new m620(b720Var2, (byte) 10), new m620(b720Var2, (byte) 11), ctcVar, false, ms2VarP0, ((m0k0) yzn0Var.n(b720Var2, iiyVarArr[0])).z, String.valueOf(((m0k0) yzn0Var.n(b720Var2, iiyVarArr[0])).Y));
                        b720Var = b720Var2;
                        if (yqVarA instanceof xq) {
                            b720Var.r2 = new mdk0(((xq) yqVarA).f41290a);
                        }
                    } else {
                        b720Var = b720Var2;
                        if (zc20Var.equals(fb20.f9236a)) {
                            mdk0 mdk0Var2 = b720Var.r2;
                            if (mdk0Var2 != null) {
                                mdk0Var2.dismiss();
                            }
                            vq vqVar2 = b720Var.q2;
                            if (vqVar2 == null) {
                                Intrinsics.h("addEventToCouponDelegate");
                                throw null;
                            }
                            Dialog dialog3 = b720Var.S1;
                            View decorView2 = (dialog3 == null || (window = dialog3.getWindow()) == null) ? null : window.getDecorView();
                            b720Var.r2 = new mdk0(vqVar2.b(b720Var, decorView2 instanceof ViewGroup ? (ViewGroup) decorView2 : null, new m620(b720Var, (byte) 9)).f41290a);
                        } else if (zc20Var.equals(qb20.f28427a)) {
                            mdk0 mdk0Var3 = b720Var.r2;
                            if (mdk0Var3 != null) {
                                mdk0Var3.dismiss();
                            }
                            wdk0 wdk0Var2 = b720Var.p2;
                            if (wdk0Var2 == null) {
                                Intrinsics.h("snackbarManager");
                                throw null;
                            }
                            pek0 pek0Var = pek0.f26859a;
                            String strH11 = b720Var.H(R.string.add_to_coupon_help_message);
                            strH11.getClass();
                            wdk0.k(wdk0Var2, new xdk0(pek0Var, strH11, null, lwf.Y, rv00.B, Integer.valueOf(R.drawable.ic_glyph_select_inactive), 68), b720Var, null, null, false, null, 1020);
                            b720Var2 = b720Var;
                        } else {
                            b720Var2 = b720Var;
                            if (zc20Var.equals(cb20.f4042a)) {
                                View view4 = b720Var2.l1;
                                if (view4 != null) {
                                    view4.clearFocus();
                                }
                            } else {
                                if (!zc20Var.equals(lc20.f19780a)) {
                                    t9f.b();
                                    return null;
                                }
                                ii iiVar2 = b720Var2.l2;
                                if (iiVar2 == null) {
                                    Intrinsics.h("actionDialogManager");
                                    throw null;
                                }
                                String strH12 = b720Var2.H(R.string.optibet_market_info_title);
                                String strH13 = b720Var2.H(R.string.optibet_market_desc);
                                String strH14 = b720Var2.H(R.string.ok);
                                strH14.getClass();
                                DialogFields dialogFields2 = new DialogFields((CharSequence) strH12, (CharSequence) strH13, (CharSequence) strH14, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528);
                                androidx.fragment.app.e eVarC4 = b720Var2.C();
                                eVarC4.getClass();
                                iiVar2.d(dialogFields2, eVarC4);
                            }
                        }
                    }
                    b720Var2 = b720Var;
                }
                b720Var2.Q0().x(obj2);
                return Unit.f46060a;
            case 8:
                yc20 yc20Var = (yc20) obj;
                yc20Var.getClass();
                z620 z620Var = (z620) this.receiver;
                uuz uuzVar = z620.u2;
                z620Var.getClass();
                if (yc20Var.equals(ob20.f24957a)) {
                    gnm0.i(z620Var.C());
                } else if (yc20Var.equals(wc20.f38906a)) {
                    gnm0.s(z620Var.C());
                } else if (yc20Var instanceof mc20) {
                    ngc0 ngc0Var2 = ((mc20) yc20Var).f21531a;
                    iw20 iw20Var2 = z620Var.o2;
                    if (iw20Var2 == null) {
                        Intrinsics.h("promoCodesNavigator");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC5 = z620Var.C();
                    eVarC5.getClass();
                    iw20Var2.j(eVarC5, ngc0Var2);
                } else if (yc20Var instanceof sc20) {
                    sc20 sc20Var = (sc20) yc20Var;
                    String str10 = sc20Var.f;
                    if (sc20Var.f31967a) {
                        z620Var.P0(z620Var).L0(sc20Var.c, sc20Var.b, str10);
                    } else {
                        z620Var.P0(z620Var).K0(sc20Var.e, sc20Var.c, sc20Var.b, sc20Var.d, str10, sc20Var.g, sc20Var.h, sc20Var.i);
                    }
                    if (!z620Var.R()) {
                        z620Var.y0();
                    }
                } else if (yc20Var instanceof zb20) {
                    xdk0 xdk0Var2 = ((zb20) yc20Var).f44094a;
                    Dialog dialog4 = z620Var.S1;
                    ViewGroup viewGroup2 = (dialog4 == null || (window4 = dialog4.getWindow()) == null) ? null : (ViewGroup) window4.findViewById(android.R.id.content);
                    wdk0 wdk0Var3 = z620Var.n2;
                    if (wdk0Var3 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var3, xdk0Var2, z620Var, null, viewGroup2, false, null, 1012);
                } else if (yc20Var instanceof pb20) {
                    bm5 bm5Var2 = ((pb20) yc20Var).f26685a;
                    ynb ynbVar2 = z620Var.m2;
                    if (ynbVar2 == null) {
                        Intrinsics.h("changeBalanceDialogProvider");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC6 = z620Var.C();
                    eVarC6.getClass();
                    ynb.b(ynbVar2, bm5Var2, null, eVarC6, false, "CHANGE_BALANCE_REQUEST_KEY", 494);
                } else if (yc20Var instanceof bc20) {
                    String str11 = ((bc20) yc20Var).f2334a;
                    String strH15 = z620Var.H(R.string.top_up);
                    strH15.getClass();
                    z620Var.R0(str11, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY", strH15);
                } else if (yc20Var instanceof sb20) {
                    String str12 = ((sb20) yc20Var).f31911a;
                    String strH16 = z620Var.H(R.string.ok);
                    strH16.getClass();
                    z620Var.R0(str12, "REQUEST_BET_EXISTS_DIALOG_KEY", strH16);
                } else if (yc20Var.equals(ib20.f14466a)) {
                    j120.Y(z620Var);
                    View view5 = z620Var.l1;
                    if (view5 != null) {
                        view5.clearFocus();
                    }
                } else if (yc20Var.equals(bb20.f2288a)) {
                    View view6 = z620Var.l1;
                    if (view6 != null) {
                        view6.clearFocus();
                    }
                } else {
                    if (!yc20Var.equals(eb20.f7499a)) {
                        t9f.b();
                        return null;
                    }
                    if (!z620Var.R()) {
                        z620Var.y0();
                    }
                }
                z620Var.Q0().x(obj2);
                return Unit.f46060a;
            case 9:
                l520 l520Var = (l520) obj;
                l520Var.getClass();
                ((k3t0) this.receiver).x(l520Var);
                return Unit.f46060a;
            case 10:
                l520 l520Var2 = (l520) obj;
                l520Var2.getClass();
                ((k3t0) this.receiver).x(l520Var2);
                return Unit.f46060a;
            case 11:
                l520 l520Var3 = (l520) obj;
                l520Var3.getClass();
                ((k3t0) this.receiver).x(l520Var3);
                return Unit.f46060a;
            case 12:
                l520 l520Var4 = (l520) obj;
                l520Var4.getClass();
                ((k3t0) this.receiver).x(l520Var4);
                return Unit.f46060a;
            case 13:
                xc20 xc20Var = (xc20) obj;
                xc20Var.getClass();
                b920 b920Var = (b920) this.receiver;
                htz htzVar = b920.U1;
                b920Var.getClass();
                if (xc20Var.equals(lb20Var)) {
                    gnm0.i(b920Var.C());
                } else if (xc20Var.equals(ec20.f7546a)) {
                    gnm0.s(b920Var.C());
                } else if (xc20Var.equals(vc20.f37168a)) {
                    ii iiVar3 = b920Var.M1;
                    if (iiVar3 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH17 = b920Var.H(R.string.confirmation);
                    String strH18 = b920Var.H(R.string.advancedbet_contract_agree_new);
                    String strH19 = b920Var.H(R.string.yes);
                    strH19.getClass();
                    DialogFields dialogFields3 = new DialogFields((CharSequence) strH17, (CharSequence) strH18, (CharSequence) strH19, b920Var.H(R.string.no), (String) null, "REQUEST_ADVANCE_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC7 = b920Var.C();
                    eVarC7.getClass();
                    iiVar3.d(dialogFields3, eVarC7);
                } else if (xc20Var instanceof oc20) {
                    ngc0 ngc0Var3 = ((oc20) xc20Var).f25009a;
                    iw20 iw20Var3 = b920Var.O1;
                    if (iw20Var3 == null) {
                        Intrinsics.h("promoCodesNavigator");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC8 = b920Var.C();
                    eVarC8.getClass();
                    iw20Var3.j(eVarC8, ngc0Var3);
                } else if (xc20Var instanceof hc20) {
                    hc20 hc20Var = (hc20) xc20Var;
                    hg7 hg7Var2 = hc20Var.l;
                    String str13 = hc20Var.m;
                    q4f q4fVar = hc20Var.g;
                    int iOrdinal3 = hg7Var2.ordinal();
                    if (iOrdinal3 != 0) {
                        if (iOrdinal3 == 1) {
                            str = null;
                        } else {
                            if (iOrdinal3 != 2) {
                                t9f.b();
                                return null;
                            }
                            strH2 = b920Var.H(R.string.autobet_sum);
                        }
                        if (hg7Var2 == hg7.b) {
                            strI0 = w6x.q(b920Var.H(R.string.promo), ": ", b920Var.H(lgb.V(q4fVar)));
                        } else {
                            en7Var = hc20Var.h;
                            iOrdinal = q4fVar.ordinal();
                            if (iOrdinal != 3) {
                                String strH20 = b920Var.H(R.string.system);
                                strH20.getClass();
                                strI0 = b920.I0(strH20, en7Var);
                            } else if (iOrdinal != 5) {
                                strI0 = b920Var.H(lgb.V(q4fVar));
                                strI0.getClass();
                            } else {
                                String strH21 = b920Var.H(R.string.multibet);
                                strH21.getClass();
                                strI0 = b920.I0(strH21, en7Var);
                            }
                        }
                        lgn0Var = b920Var.N1;
                        if (lgn0Var != null) {
                            Intrinsics.h("successBetAlertManager");
                            throw null;
                        }
                        SuccessBetStringModel successBetStringModel2 = new SuccessBetStringModel(hc20Var.k, null, hc20Var.n, null);
                        String str14 = hc20Var.i;
                        lc00VarB = kotlin.collections.a.b();
                        if (str13 != null && str13.length() != 0) {
                            b5 = 0;
                        }
                        if (b5 == 0) {
                            i = R.string.maximum_coef;
                        } else {
                            i = R.string.coefficient;
                        }
                        String strH22 = b920Var.H(i);
                        strH22.getClass();
                        lc00VarB.add(new SuccessBetInfoItem.Simple(strH22, hc20Var.b));
                        if (b5 == 0) {
                            String strH23 = b920Var.H(R.string.optional_coef);
                            strH23.getClass();
                            lc00VarB.add(new SuccessBetInfoItem.Simple(strH23, str13));
                        }
                        if (str != null) {
                            lc00VarB.add(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitTextPrimary, b920Var.o0()), str, hc20Var.f12799a, hc20Var.f, true));
                        }
                        str2 = hc20Var.d;
                        if (str2 != null && (str3 = hc20Var.e) != null) {
                            lc00VarB.add(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitCommerce, b920Var.o0()), str2, str3, hc20Var.f, false));
                        }
                        lgn0Var.c(successBetStringModel2, new SuccessBetAlertModel(strI0, str14, "REQUEST_SUCCESS_BET_KEY", Long.valueOf(hc20Var.c), hg7Var2.name(), kotlin.collections.a.a(lc00VarB)), b920Var.p0());
                    } else {
                        strH2 = b920Var.H(R.string.bet_sum);
                    }
                    str = strH2;
                    if (hg7Var2 == hg7.b) {
                        strI0 = w6x.q(b920Var.H(R.string.promo), ": ", b920Var.H(lgb.V(q4fVar)));
                    } else {
                        en7Var = hc20Var.h;
                        iOrdinal = q4fVar.ordinal();
                        if (iOrdinal != 3) {
                            String strH24 = b920Var.H(R.string.system);
                            strH24.getClass();
                            strI0 = b920.I0(strH24, en7Var);
                        } else if (iOrdinal != 5) {
                            strI0 = b920Var.H(lgb.V(q4fVar));
                            strI0.getClass();
                        } else {
                            String strH25 = b920Var.H(R.string.multibet);
                            strH25.getClass();
                            strI0 = b920.I0(strH25, en7Var);
                        }
                    }
                    lgn0Var = b920Var.N1;
                    if (lgn0Var != null) {
                        Intrinsics.h("successBetAlertManager");
                        throw null;
                    }
                    SuccessBetStringModel successBetStringModel3 = new SuccessBetStringModel(hc20Var.k, null, hc20Var.n, null);
                    String str15 = hc20Var.i;
                    lc00VarB = kotlin.collections.a.b();
                    if (str13 != null) {
                        b5 = 0;
                    }
                    if (b5 == 0) {
                        i = R.string.maximum_coef;
                    } else {
                        i = R.string.coefficient;
                    }
                    String strH26 = b920Var.H(i);
                    strH26.getClass();
                    lc00VarB.add(new SuccessBetInfoItem.Simple(strH26, hc20Var.b));
                    if (b5 == 0) {
                        String strH27 = b920Var.H(R.string.optional_coef);
                        strH27.getClass();
                        lc00VarB.add(new SuccessBetInfoItem.Simple(strH27, str13));
                    }
                    if (str != null) {
                        lc00VarB.add(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitTextPrimary, b920Var.o0()), str, hc20Var.f12799a, hc20Var.f, true));
                    }
                    str2 = hc20Var.d;
                    if (str2 != null) {
                        lc00VarB.add(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitCommerce, b920Var.o0()), str2, str3, hc20Var.f, false));
                    }
                    lgn0Var.c(successBetStringModel3, new SuccessBetAlertModel(strI0, str15, "REQUEST_SUCCESS_BET_KEY", Long.valueOf(hc20Var.c), hg7Var2.name(), kotlin.collections.a.a(lc00VarB)), b920Var.p0());
                } else if (xc20Var instanceof tc20) {
                    tc20 tc20Var = (tc20) xc20Var;
                    int i2 = tc20Var.b;
                    lgn0 lgn0Var3 = b920Var.N1;
                    if (lgn0Var3 == null) {
                        Intrinsics.h("successBetAlertManager");
                        throw null;
                    }
                    String strH28 = b920Var.H(R.string.bet_processed_successfully);
                    strH28.getClass();
                    String strH29 = b920Var.H(R.string.bet_processed_successfully);
                    Integer numValueOf = Integer.valueOf(i2);
                    int i3 = tc20Var.c;
                    lgn0Var3.c(new SuccessBetStringModel(strH28, w6x.q(strH29, Separators.RETURN, b920Var.I(R.string.bet_processed_count_v2, numValueOf, Integer.valueOf(i3))), tc20Var.d, b920Var.I(R.string.bet_processed_count_v2, Integer.valueOf(i2), Integer.valueOf(i3))), new SuccessBetAlertModel(null, null, "REQUEST_SUCCESS_BET_KEY", Long.valueOf(tc20Var.f33699a), "SIMPLE", iun.f15405a), b920Var.p0());
                } else if (xc20Var instanceof pc20) {
                    xdk0 xdk0Var3 = ((pc20) xc20Var).f26738a;
                    wdk0 wdk0Var4 = b920Var.Q1;
                    if (wdk0Var4 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var4, xdk0Var3, b920Var, null, null, false, null, 1020);
                } else if (xc20Var.equals(wb20.f38855a)) {
                    ynb ynbVar3 = b920Var.P1;
                    if (ynbVar3 == null) {
                        Intrinsics.h("changeBalanceDialogProvider");
                        throw null;
                    }
                    bm5 bm5Var3 = bm5.i;
                    androidx.fragment.app.e eVarC9 = b920Var.C();
                    eVarC9.getClass();
                    ynb.b(ynbVar3, bm5Var3, null, eVarC9, false, "CHANGE_BALANCE_REQUEST_KEY", 494);
                } else if (xc20Var instanceof ac20) {
                    String str16 = ((ac20) xc20Var).f609a;
                    String strH30 = b920Var.H(R.string.top_up);
                    strH30.getClass();
                    b920Var.K0(str16, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY", strH30);
                } else if (xc20Var instanceof rb20) {
                    String str17 = ((rb20) xc20Var).f30163a;
                    String strH31 = b920Var.H(R.string.ok);
                    strH31.getClass();
                    b920Var.K0(str17, "REQUEST_BET_EXISTS_DIALOG_KEY", strH31);
                } else if (xc20Var.equals(hb20.f12751a)) {
                    j120.Y(b920Var);
                    View view7 = b920Var.l1;
                    if (view7 != null) {
                        view7.clearFocus();
                    }
                } else if (xc20Var instanceof vb20) {
                    ArrayList arrayList = ((vb20) xc20Var).f37120a;
                    kwd kwdVar = n4f.k2;
                    String strH32 = b920Var.H(R.string.coupon_make_bet_type);
                    strH32.getClass();
                    androidx.fragment.app.e eVarC10 = b920Var.C();
                    eVarC10.getClass();
                    kwdVar.getClass();
                    kwd.g(strH32, arrayList, "CHANGE_SYSTEM_REQUEST_KEY", eVarC10);
                } else if (xc20Var instanceof kc20) {
                    kc20 kc20Var = (kc20) xc20Var;
                    ii iiVar4 = b920Var.M1;
                    if (iiVar4 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH33 = b920Var.H(R.string.attention);
                    String str18 = kc20Var.f18039a;
                    String strH34 = b920Var.H(R.string.ok_new);
                    strH34.getClass();
                    DialogFields dialogFields4 = new DialogFields((CharSequence) strH33, (CharSequence) str18, (CharSequence) strH34, b920Var.H(R.string.cancel), (String) null, "REQUEST_KEY_CHANGE_TYPE_TO_SYSTEM", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                    androidx.fragment.app.e eVarC11 = b920Var.C();
                    eVarC11.getClass();
                    iiVar4.d(dialogFields4, eVarC11);
                } else if (xc20Var.equals(gb20.f10995a)) {
                    Fragment fragment = b920Var.y;
                    axe axeVar = fragment instanceof axe ? (axe) fragment : null;
                    if (axeVar != null) {
                        axeVar.I0();
                    }
                } else {
                    if (!xc20Var.equals(ab20.f559a)) {
                        t9f.b();
                        return null;
                    }
                    View view8 = b920Var.l1;
                    if (view8 != null) {
                        view8.clearFocus();
                    }
                }
                b920Var.J0().x(obj2);
                return Unit.f46060a;
            case 14:
                l520 l520Var5 = (l520) obj;
                l520Var5.getClass();
                ((k3t0) this.receiver).x(l520Var5);
                return Unit.f46060a;
            case 15:
                l520 l520Var6 = (l520) obj;
                l520Var6.getClass();
                ((k3t0) this.receiver).x(l520Var6);
                return Unit.f46060a;
            case 16:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                x920 x920Var = (x920) this.receiver;
                p7m0 p7m0Var2 = x920Var.z;
                p7m0Var2.getClass();
                p7m0Var2.o(null, zq00Var);
                x920Var.c.b(th5, new i920(x920Var, b6));
                return Unit.f46060a;
            case 17:
                ouj0 ouj0Var = (ouj0) obj;
                ouj0Var.getClass();
                ((ha20) this.receiver).getClass();
                return CollectionsKt.b0(ouj0Var.e, "##", null, null, new r520((byte) 4), 30);
            case 18:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                qg20 qg20Var = (qg20) this.receiver;
                qg20Var.t.b(th6, new ed20(qg20Var, b6));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                qg20 qg20Var2 = (qg20) this.receiver;
                if (th7 instanceof CancellationException) {
                    qg20Var2.getClass();
                } else {
                    qg20Var2.N(true);
                    qg20Var2.e0(hnb0.f13344a);
                }
                return Unit.f46060a;
            case 20:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                nn20 nn20Var = (nn20) this.receiver;
                nn20Var.R.b(th8, new uh20(nn20Var, b5));
                nn20Var.G(mb20Var);
                return Unit.f46060a;
            case 21:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                nn20 nn20Var2 = (nn20) this.receiver;
                nn20Var2.R.b(th9, new uh20(nn20Var2, b5));
                nn20Var2.G(mb20Var);
                return Unit.f46060a;
            case 22:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                on20 on20Var = (on20) this.receiver;
                on20Var.C.b(th10, new lh20(on20Var, b6));
                on20Var.G(lb20Var);
                return Unit.f46060a;
            case 23:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                on20 on20Var2 = (on20) this.receiver;
                on20Var2.C.b(th11, new lh20(on20Var2, b6));
                on20Var2.G(lb20Var);
                return Unit.f46060a;
            case 24:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                on20 on20Var3 = (on20) this.receiver;
                on20Var3.C.b(th12, new lh20(on20Var3, b6));
                on20Var3.G(lb20Var);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th13 = (Throwable) obj;
                th13.getClass();
                nn20 nn20Var3 = (nn20) this.receiver;
                nn20Var3.R.b(th13, new k110(nn20Var3, th13, b2));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Throwable th14 = (Throwable) obj;
                th14.getClass();
                on20 on20Var4 = (on20) this.receiver;
                on20Var4.C.b(th14, new k110((Object) on20Var4, (Object) th14, (byte) 14));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th15 = (Throwable) obj;
                th15.getClass();
                nn20 nn20Var4 = (nn20) this.receiver;
                nn20Var4.R.b(th15, new uh20(nn20Var4, b5));
                nn20Var4.G(mb20Var);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Throwable th16 = (Throwable) obj;
                th16.getClass();
                nn20 nn20Var5 = (nn20) this.receiver;
                nn20Var5.R.b(th16, new uh20(nn20Var5, b3));
                return Unit.f46060a;
            default:
                Throwable th17 = (Throwable) obj;
                th17.getClass();
                on20 on20Var5 = (on20) this.receiver;
                on20Var5.C.b(th17, new lh20(on20Var5, b4));
                return Unit.f46060a;
        }
    }
}

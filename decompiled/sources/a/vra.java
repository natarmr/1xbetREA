package a;

import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vra extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37890a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vra(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f37890a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        xra xraVar;
        Object value;
        wya wyaVar;
        ArrayList arrayList;
        g5b g5bVar;
        byte b = this.f37890a;
        hl2 hl2Var = hl2.f13235a;
        gl2 gl2Var = gl2.f11471a;
        el2 el2Var = el2.f7979a;
        cm2 cm2Var = cm2.f4587a;
        hn2 hn2Var = hn2.f13331a;
        nm2 nm2Var = nm2.f23752a;
        qk2 qk2Var = qk2.f28866a;
        xi2 xi2Var = xi2.f40922a;
        ph2 ph2Var = ph2.f26975a;
        xf2 xf2Var = xf2.f40771a;
        yje yjeVar = null;
        switch (b) {
            case 0:
                dj2 dj2Var = (dj2) obj;
                dj2Var.getClass();
                ((k3t0) this.receiver).x(dj2Var);
                return Unit.f46060a;
            case 1:
                ml2 ml2Var = (ml2) obj;
                ml2Var.getClass();
                xra xraVar2 = (xra) this.receiver;
                cl5 cl5Var = xra.X1;
                if (ml2Var instanceof fl2) {
                    ujd ujdVarD = xraVar2.N0().b.d();
                    x1x.x(ujdVarD);
                    ujdVarD.b(xraVar2, ((fl2) ml2Var).f9720a);
                } else {
                    xraVar2.getClass();
                    if (ml2Var.equals(el2Var)) {
                        e720 e720Var = xraVar2.N0().g;
                        androidx.fragment.app.e eVarC = xraVar2.C();
                        eVarC.getClass();
                        e720Var.a(eVarC);
                    } else if (ml2Var.equals(gl2Var)) {
                        wdk0.k(xraVar2.N0().f, new xdk0(pek0.f26859a, xraVar2.N0().e.b.a(R.string.auto_sub_info_message, Arrays.copyOf(new Object[0], 0)), null, null, null, null, 124), xraVar2, null, null, true, null, 1004);
                    } else if (ml2Var.equals(hl2Var)) {
                        ii iiVar = xraVar2.N0().d;
                        DialogFields dialogFields = new DialogFields((CharSequence) xraVar2.N0().e.b.a(R.string.optibet_market_info_title, Arrays.copyOf(new Object[0], 0)), (CharSequence) xraVar2.N0().e.b.a(R.string.optibet_market_desc, Arrays.copyOf(new Object[0], 0)), (CharSequence) xraVar2.N0().e.b.a(R.string.ok, Arrays.copyOf(new Object[0], 0)), (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528);
                        androidx.fragment.app.e eVarC2 = xraVar2.C();
                        eVarC2.getClass();
                        iiVar.d(dialogFields, eVarC2);
                    } else if (ml2Var.equals(ll2.f20227a)) {
                        ii iiVar2 = xraVar2.N0().d;
                        String strH = xraVar2.H(R.string.remove);
                        String strH2 = xraVar2.H(R.string.coupon_edit_confirm_delete_message);
                        String strH3 = xraVar2.H(R.string.remove);
                        strH3.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, xraVar2.H(R.string.cancel), (String) null, "REQUEST_REMOVE_ONE_EVENT_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC3 = xraVar2.C();
                        eVarC3.getClass();
                        iiVar2.d(dialogFields2, eVarC3);
                    } else if (ml2Var.equals(jl2.f16696a)) {
                        ii iiVar3 = xraVar2.N0().d;
                        DialogFields dialogFields3 = new DialogFields((CharSequence) xraVar2.N0().e.b.a(R.string.each_way_dialog_title, Arrays.copyOf(new Object[0], 0)), (CharSequence) xraVar2.N0().e.b.a(R.string.each_way_description, Arrays.copyOf(new Object[0], 0)), (CharSequence) xraVar2.N0().e.b.a(R.string.ok_upper, Arrays.copyOf(new Object[0], 0)), (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528);
                        androidx.fragment.app.e eVarC4 = xraVar2.C();
                        eVarC4.getClass();
                        iiVar3.d(dialogFields3, eVarC4);
                    } else if (ml2Var instanceof kl2) {
                        kl2 kl2Var = (kl2) ml2Var;
                        m0k0 m0k0Var = kl2Var.f18465a;
                        m97 m97Var = kl2Var.b;
                        e720 e720Var2 = xraVar2.N0().g;
                        androidx.fragment.app.e eVarC5 = xraVar2.C();
                        eVarC5.getClass();
                        e720Var2.b(eVarC5, m97Var, m0k0Var, new fq2());
                    } else {
                        if (!(ml2Var instanceof il2)) {
                            t9f.b();
                            return null;
                        }
                        xraVar2.T0("REMOVE_ALL_COEF_TRACK_RESULT");
                    }
                }
                xraVar2.M0().x(hk2.f13189a);
                return Unit.f46060a;
            case 2:
                xk2 xk2Var = (xk2) obj;
                xk2Var.getClass();
                ((k3t0) this.receiver).x(xk2Var);
                return Unit.f46060a;
            case 3:
                jn2 jn2Var = (jn2) obj;
                jn2Var.getClass();
                xra xraVar3 = (xra) this.receiver;
                cl5 cl5Var2 = xra.X1;
                rek0 rek0Var = rek0.b;
                if (!(jn2Var instanceof fn2)) {
                    if (jn2Var instanceof gn2) {
                        wdk0 wdk0Var = ((qgi) xraVar3.N1.getValue()).R;
                        String strH4 = xraVar3.H(R.string.get_balance_list_error);
                        strH4.getClass();
                        xdk0 xdk0Var = new xdk0(rek0Var, strH4, null, null, null, null, 124);
                        xraVar = xraVar3;
                        wdk0.k(wdk0Var, xdk0Var, xraVar, null, null, false, null, 1020);
                    } else {
                        xraVar3.getClass();
                        if (jn2Var.equals(hn2Var)) {
                            xraVar3.T0("REMOVE_ALL_VIEWED_RESULT");
                        } else {
                            if (!(jn2Var instanceof in2)) {
                                t9f.b();
                                return null;
                            }
                            xraVar = xraVar3;
                            wdk0.k(xraVar3.N0().f, new xdk0(rek0Var, ((in2) jn2Var).f15052a, null, null, null, null, 124), xraVar, null, null, false, null, 1020);
                        }
                    }
                    xraVar.S0().x(cm2Var);
                    return Unit.f46060a;
                }
                ujd ujdVarD2 = ((qgi) xraVar3.N1.getValue()).P.d();
                x1x.x(ujdVarD2);
                ujdVarD2.b(xraVar3, ((fn2) jn2Var).f9812a);
                xraVar = xraVar3;
                xraVar.S0().x(cm2Var);
                return Unit.f46060a;
            case 4:
                wm2 wm2Var = (wm2) obj;
                wm2Var.getClass();
                ((k3t0) this.receiver).x(wm2Var);
                return Unit.f46060a;
            case 5:
                fsa fsaVar = (fsa) obj;
                fsaVar.getClass();
                xra xraVar4 = (xra) this.receiver;
                cl5 cl5Var3 = xra.X1;
                xraVar4.getClass();
                if (fsaVar instanceof bsa) {
                    dta dtaVar = ((bsa) fsaVar).f3119a;
                    if (dtaVar instanceof ysa) {
                        xraVar4.P0().x(xf2Var);
                    } else if (dtaVar instanceof zsa) {
                        xraVar4.Q0().x(ph2Var);
                    } else if (dtaVar instanceof ata) {
                        xraVar4.R0().x(xi2Var);
                    } else if (dtaVar instanceof bta) {
                        xraVar4.M0().x(qk2Var);
                    } else {
                        if (!(dtaVar instanceof cta)) {
                            t9f.b();
                            return null;
                        }
                        xraVar4.S0().x(nm2Var);
                    }
                } else if (fsaVar instanceof dsa) {
                    ((k3t0) xraVar4.Q1.getValue()).x(new wl2(((dsa) fsaVar).f6603a.f14760a));
                } else if (fsaVar instanceof csa) {
                    xraVar4.P0().x(new dg2(((csa) fsaVar).f4878a));
                } else if (fsaVar instanceof zra) {
                    View viewQ0 = xraVar4.q0();
                    j120.X(viewQ0);
                    viewQ0.clearFocus();
                } else if (fsaVar instanceof asa) {
                    ujd ujdVarD3 = xraVar4.N0().b.d();
                    x1x.x(ujdVarD3);
                    ujdVarD3.b(xraVar4, ((asa) fsaVar).f1381a);
                } else {
                    if (!fsaVar.equals(esa.f8319a)) {
                        t9f.b();
                        return null;
                    }
                    poq0 poq0Var = xraVar4.N0().f26708a;
                    androidx.fragment.app.e eVarC6 = xraVar4.C();
                    eVarC6.getClass();
                    uuz uuzVar = fk60.b;
                    ki60.q2.getClass();
                    if (eVarC6.J("OnboardingBottomSheetContainerFragment") == null) {
                        ki60 ki60Var = new ki60();
                        iiy[] iiyVarArr = ki60.r2;
                        ki60Var.n2.I(ki60Var, iiyVarArr[1], 32);
                        ki60Var.o2.x(ki60Var, iiyVarArr[2], "");
                        sj3.E0(ki60Var, eVarC6, "OnboardingBottomSheetContainerFragment");
                    }
                }
                xraVar4.O0().x(dra.f6549a);
                return Unit.f46060a;
            case 6:
                qra qraVar = (qra) obj;
                qraVar.getClass();
                ((k3t0) this.receiver).x(qraVar);
                return Unit.f46060a;
            case 7:
                kua kuaVar = (kua) obj;
                kuaVar.getClass();
                bua buaVar = (bua) this.receiver;
                gl5 gl5Var = bua.Q1;
                buaVar.getClass();
                if (kuaVar instanceof jua) {
                    ii iiVar4 = buaVar.M1;
                    if (iiVar4 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH5 = buaVar.H(R.string.caution);
                    String strH6 = buaVar.H(R.string.reset_to_default_values);
                    String strH7 = buaVar.H(R.string.ok_new);
                    strH7.getClass();
                    DialogFields dialogFields4 = new DialogFields((CharSequence) strH5, (CharSequence) strH6, (CharSequence) strH7, buaVar.H(R.string.cancel), (String) null, "REQUEST_RESET_CONFIRM_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC7 = buaVar.C();
                    eVarC7.getClass();
                    iiVar4.d(dialogFields4, eVarC7);
                } else if (kuaVar instanceof iua) {
                    ii iiVar5 = buaVar.M1;
                    if (iiVar5 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH8 = buaVar.H(R.string.caution);
                    String strH9 = buaVar.H(R.string.close_the_activation_process_new);
                    String strH10 = buaVar.H(R.string.interrupt);
                    strH10.getClass();
                    DialogFields dialogFields5 = new DialogFields((CharSequence) strH8, (CharSequence) strH9, (CharSequence) strH10, buaVar.H(R.string.cancel), (String) null, "REQUEST_EXIT_CONFIRM_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC8 = buaVar.C();
                    eVarC8.getClass();
                    iiVar5.d(dialogFields5, eVarC8);
                } else {
                    if (!(kuaVar instanceof hua)) {
                        t9f.b();
                        return null;
                    }
                    wdk0 wdk0Var2 = buaVar.N1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    qek0 qek0Var = qek0.f28589a;
                    String strH11 = buaVar.H(R.string.changes_applied_successfully);
                    strH11.getClass();
                    wdk0.k(wdk0Var2, new xdk0(qek0Var, strH11, null, null, null, null, 124), buaVar, null, null, false, null, 1020);
                }
                buaVar.G0().x(nta.f24088a);
                return Unit.f46060a;
            case 8:
                uta utaVar = (uta) obj;
                utaVar.getClass();
                ((k3t0) this.receiver).x(utaVar);
                return Unit.f46060a;
            case 9:
                txa txaVar = (txa) obj;
                txaVar.getClass();
                ((k3t0) this.receiver).x(txaVar);
                return Unit.f46060a;
            case 10:
                a570 a570Var = (a570) obj;
                a570Var.getClass();
                yya yyaVar = (yya) this.receiver;
                yyaVar.getClass();
                ArrayList arrayList2 = yyaVar.n;
                if (arrayList2.contains(a570Var)) {
                    arrayList2.remove(a570Var);
                } else if (arrayList2.size() < 2) {
                    arrayList2.add(a570Var);
                }
                p7m0 p7m0Var = yyaVar.u;
                do {
                    value = p7m0Var.getValue();
                    wyaVar = (wya) value;
                    List<i1b> list = wyaVar.f39964a;
                    arrayList = new ArrayList(r3d.q(list, 10));
                    for (i1b i1bVar : list) {
                        boolean zContains = arrayList2.contains(i1bVar.f13989a);
                        arrayList.add(i1b.c(i1bVar, zContains || arrayList2.size() < 2, zContains));
                    }
                } while (!p7m0Var.m(value, wya.a(wyaVar, arrayList, arrayList2.size(), null, 4)));
                return Unit.f46060a;
            case 11:
                ip1 ip1Var = (ip1) obj;
                ip1Var.getClass();
                g5b g5bVar2 = (g5b) this.receiver;
                gl5 gl5Var2 = g5b.c2;
                if (ip1Var instanceof hp1) {
                    wdk0.k(((k7i) g5bVar2.O1.getValue()).r, new xdk0(rek0.b, ((hp1) ip1Var).f13420a, null, null, null, null, 124), g5bVar2, null, null, false, null, 1020);
                } else {
                    g5bVar2.getClass();
                    if (!ip1Var.equals(gp1.f11661a)) {
                        t9f.b();
                        return null;
                    }
                    g5bVar2.Y0("REMOVE_ALL_FAVORITES_AGGREGATOR_RESULT");
                }
                g5bVar2.O0().x(fa0.f9181a);
                return Unit.f46060a;
            case 12:
                qa0 qa0Var = (qa0) obj;
                qa0Var.getClass();
                ((k3t0) this.receiver).x(qa0Var);
                return Unit.f46060a;
            case 13:
                tg2 tg2Var = (tg2) obj;
                tg2Var.getClass();
                g5b g5bVar3 = (g5b) this.receiver;
                gl5 gl5Var3 = g5b.c2;
                if (tg2Var instanceof ng2) {
                    ujd ujdVarD4 = g5bVar3.R0().b.d();
                    x1x.x(ujdVarD4);
                    ujdVarD4.b(g5bVar3, ((ng2) tg2Var).f23464a);
                } else if (tg2Var instanceof qg2) {
                    ((dbi) g5bVar3.R0().c.f3330a).o().r(g5bVar3, g5bVar3.R0().e, ((qg2) tg2Var).f28662a);
                } else {
                    g5bVar3.getClass();
                    if (tg2Var.equals(sg2.f32139a)) {
                        pek pekVar = s6p.o2;
                        androidx.fragment.app.e eVarC9 = g5bVar3.C();
                        eVarC9.getClass();
                        wep wepVar = wep.f39029a;
                        pekVar.getClass();
                        pek.p(eVarC9, wepVar, "REMOVE_ALL_SPORT_EVENTS_RESULT");
                    } else if (tg2Var.equals(rg2.f30412a)) {
                        ii iiVar6 = g5bVar3.R0().d;
                        DialogFields dialogFields6 = new DialogFields((CharSequence) g5bVar3.R0().e.b.a(R.string.clear, Arrays.copyOf(new Object[0], 0)), (CharSequence) g5bVar3.R0().e.b.a(R.string.confirm_delete_all_actions, Arrays.copyOf(new Object[0], 0)), (CharSequence) g5bVar3.R0().e.b.a(R.string.clear, Arrays.copyOf(new Object[0], 0)), g5bVar3.R0().e.b.a(R.string.cancel, Arrays.copyOf(new Object[0], 0)), (String) null, "REQUEST_CLEAR_GROUPS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC10 = g5bVar3.C();
                        eVarC10.getClass();
                        iiVar6.d(dialogFields6, eVarC10);
                    } else if (tg2Var.equals(pg2.f26934a)) {
                        g5bVar3.Q0().x(m4b.f21159a);
                    } else {
                        if (!tg2Var.equals(og2.f25196a)) {
                            t9f.b();
                            return null;
                        }
                        View viewQ1 = g5bVar3.q0();
                        j120.X(viewQ1);
                        viewQ1.clearFocus();
                        g5bVar3.Q0().x(p4b.f26345a);
                    }
                }
                g5bVar3.T0().x(qf2.f28608a);
                return Unit.f46060a;
            case 14:
                gg2 gg2Var = (gg2) obj;
                gg2Var.getClass();
                ((k3t0) this.receiver).x(gg2Var);
                return Unit.f46060a;
            case 15:
                di2 di2Var = (di2) obj;
                di2Var.getClass();
                g5b g5bVar4 = (g5b) this.receiver;
                gl5 gl5Var4 = g5b.c2;
                g5bVar4.getClass();
                if (!Intrinsics.d(di2Var, di2.f6120a)) {
                    t9f.b();
                    return null;
                }
                g5bVar4.Y0("REMOVE_ALL_TEAM_RESULT");
                g5bVar4.U0().x(kh2.f18268a);
                return Unit.f46060a;
            case 16:
                vh2 vh2Var = (vh2) obj;
                vh2Var.getClass();
                ((k3t0) this.receiver).x(vh2Var);
                return Unit.f46060a;
            case 17:
                oj2 oj2Var = (oj2) obj;
                oj2Var.getClass();
                g5b g5bVar5 = (g5b) this.receiver;
                gl5 gl5Var5 = g5b.c2;
                g5bVar5.getClass();
                if (!Intrinsics.d(oj2Var, oj2.f25340a)) {
                    t9f.b();
                    return null;
                }
                g5bVar5.Y0("REMOVE_ALL_TOURNAMENTS_RESULT");
                g5bVar5.V0().x(si2.f32243a);
                return Unit.f46060a;
            case 18:
                dj2 dj2Var2 = (dj2) obj;
                dj2Var2.getClass();
                ((k3t0) this.receiver).x(dj2Var2);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ml2 ml2Var2 = (ml2) obj;
                ml2Var2.getClass();
                g5b g5bVar6 = (g5b) this.receiver;
                gl5 gl5Var6 = g5b.c2;
                if (ml2Var2 instanceof fl2) {
                    ujd ujdVarD5 = g5bVar6.R0().b.d();
                    x1x.x(ujdVarD5);
                    ujdVarD5.b(g5bVar6, ((fl2) ml2Var2).f9720a);
                } else {
                    g5bVar6.getClass();
                    if (ml2Var2.equals(el2Var)) {
                        e720 e720Var3 = g5bVar6.R0().g;
                        androidx.fragment.app.e eVarC11 = g5bVar6.C();
                        eVarC11.getClass();
                        e720Var3.a(eVarC11);
                    } else if (ml2Var2.equals(gl2Var)) {
                        wdk0.k(g5bVar6.R0().f, new xdk0(pek0.f26859a, g5bVar6.R0().e.b.a(R.string.auto_sub_info_message, Arrays.copyOf(new Object[0], 0)), null, null, null, null, 124), g5bVar6, null, null, true, null, 1004);
                    } else if (ml2Var2.equals(hl2Var)) {
                        ii iiVar7 = g5bVar6.R0().d;
                        DialogFields dialogFields7 = new DialogFields((CharSequence) g5bVar6.R0().e.b.a(R.string.optibet_market_info_title, Arrays.copyOf(new Object[0], 0)), (CharSequence) g5bVar6.R0().e.b.a(R.string.optibet_market_desc, Arrays.copyOf(new Object[0], 0)), (CharSequence) g5bVar6.R0().e.b.a(R.string.ok, Arrays.copyOf(new Object[0], 0)), (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528);
                        androidx.fragment.app.e eVarC12 = g5bVar6.C();
                        eVarC12.getClass();
                        iiVar7.d(dialogFields7, eVarC12);
                    } else if (ml2Var2.equals(ll2.f20227a)) {
                        ii iiVar8 = g5bVar6.R0().d;
                        String strH12 = g5bVar6.H(R.string.remove);
                        String strH13 = g5bVar6.H(R.string.coupon_edit_confirm_delete_message);
                        String strH14 = g5bVar6.H(R.string.remove);
                        strH14.getClass();
                        DialogFields dialogFields8 = new DialogFields((CharSequence) strH12, (CharSequence) strH13, (CharSequence) strH14, g5bVar6.H(R.string.cancel), (String) null, "REQUEST_REMOVE_ONE_EVENT_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC13 = g5bVar6.C();
                        eVarC13.getClass();
                        iiVar8.d(dialogFields8, eVarC13);
                    } else if (ml2Var2.equals(jl2.f16696a)) {
                        ii iiVar9 = g5bVar6.R0().d;
                        DialogFields dialogFields9 = new DialogFields((CharSequence) g5bVar6.R0().e.b.a(R.string.each_way_dialog_title, Arrays.copyOf(new Object[0], 0)), (CharSequence) g5bVar6.R0().e.b.a(R.string.each_way_description, Arrays.copyOf(new Object[0], 0)), (CharSequence) g5bVar6.R0().e.b.a(R.string.ok_upper, Arrays.copyOf(new Object[0], 0)), (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528);
                        androidx.fragment.app.e eVarC14 = g5bVar6.C();
                        eVarC14.getClass();
                        iiVar9.d(dialogFields9, eVarC14);
                    } else if (ml2Var2 instanceof kl2) {
                        kl2 kl2Var2 = (kl2) ml2Var2;
                        m0k0 m0k0Var2 = kl2Var2.f18465a;
                        m97 m97Var2 = kl2Var2.b;
                        e720 e720Var4 = g5bVar6.R0().g;
                        androidx.fragment.app.e eVarC15 = g5bVar6.C();
                        eVarC15.getClass();
                        e720Var4.b(eVarC15, m97Var2, m0k0Var2, new fq2());
                    } else {
                        if (!ml2Var2.equals(il2.f14956a)) {
                            t9f.b();
                            return null;
                        }
                        g5bVar6.Y0("REMOVE_ALL_COEF_TRACK_RESULT");
                    }
                }
                g5bVar6.P0().x(hk2.f13189a);
                return Unit.f46060a;
            case 20:
                xk2 xk2Var2 = (xk2) obj;
                xk2Var2.getClass();
                ((k3t0) this.receiver).x(xk2Var2);
                return Unit.f46060a;
            case 21:
                yl2 yl2Var = (yl2) obj;
                yl2Var.getClass();
                ((k3t0) this.receiver).x(yl2Var);
                return Unit.f46060a;
            case 22:
                jn2 jn2Var2 = (jn2) obj;
                jn2Var2.getClass();
                g5b g5bVar7 = (g5b) this.receiver;
                gl5 gl5Var7 = g5b.c2;
                rek0 rek0Var2 = rek0.b;
                if (!(jn2Var2 instanceof fn2)) {
                    g5bVar7.getClass();
                    if (jn2Var2.equals(gn2.f11568a)) {
                        wdk0 wdk0Var3 = ((k7i) g5bVar7.O1.getValue()).r;
                        String strH15 = g5bVar7.H(R.string.get_balance_list_error);
                        strH15.getClass();
                        xdk0 xdk0Var2 = new xdk0(rek0Var2, strH15, null, null, null, null, 124);
                        g5bVar = g5bVar7;
                        wdk0.k(wdk0Var3, xdk0Var2, g5bVar, null, null, false, null, 1020);
                    } else if (jn2Var2.equals(hn2Var)) {
                        g5bVar7.Y0("REMOVE_ALL_VIEWED_RESULT");
                    } else {
                        if (!(jn2Var2 instanceof in2)) {
                            t9f.b();
                            return null;
                        }
                        g5bVar = g5bVar7;
                        wdk0.k(g5bVar7.R0().f, new xdk0(rek0Var2, ((in2) jn2Var2).f15052a, null, null, null, null, 124), g5bVar, null, null, false, null, 1020);
                    }
                    g5bVar.W0().x(cm2Var);
                    return Unit.f46060a;
                }
                ujd ujdVarD6 = g5bVar7.R0().b.d();
                x1x.x(ujdVarD6);
                ujdVarD6.b(g5bVar7, ((fn2) jn2Var2).f9812a);
                g5bVar = g5bVar7;
                g5bVar.W0().x(cm2Var);
                return Unit.f46060a;
            case 23:
                wm2 wm2Var2 = (wm2) obj;
                wm2Var2.getClass();
                ((k3t0) this.receiver).x(wm2Var2);
                return Unit.f46060a;
            case 24:
                tct tctVar = (tct) obj;
                tctVar.getClass();
                g5b g5bVar8 = (g5b) this.receiver;
                gl5 gl5Var8 = g5b.c2;
                if (tctVar instanceof rct) {
                    afm0 afm0VarB = ((aii) g5bVar8.P1.getValue()).f924a.b();
                    x1x.x(afm0VarB);
                    afm0VarB.q(g5bVar8, ((rct) tctVar).f30256a, new b5b(g5bVar8, (byte) 4), new b5b(g5bVar8, (byte) 5));
                } else {
                    g5bVar8.getClass();
                    if (!tctVar.equals(sct.f32004a)) {
                        t9f.b();
                        return null;
                    }
                    g5bVar8.Y0("REMOVE_ALL_FAVORITES_XGAMES_RESULT");
                }
                g5bVar8.X0().x(a2t.f141a);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                n2t n2tVar = (n2t) obj;
                n2tVar.getClass();
                ((k3t0) this.receiver).x(n2tVar);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                o5b o5bVar = (o5b) obj;
                o5bVar.getClass();
                g5b g5bVar9 = (g5b) this.receiver;
                gl5 gl5Var9 = g5b.c2;
                g5bVar9.getClass();
                if (o5bVar instanceof k5b) {
                    jx70 jx70Var = ((k5b) o5bVar).f17711a;
                    if (jx70Var instanceof cx70) {
                        g5bVar9.O0().x(ja0.f16164a);
                    } else if (jx70Var instanceof dx70) {
                        g5bVar9.X0().x(b2t.f1871a);
                    } else if (jx70Var instanceof ex70) {
                        g5bVar9.T0().x(xf2Var);
                    } else if (jx70Var instanceof fx70) {
                        g5bVar9.U0().x(ph2Var);
                    } else if (jx70Var instanceof gx70) {
                        g5bVar9.V0().x(xi2Var);
                    } else if (jx70Var instanceof hx70) {
                        g5bVar9.P0().x(qk2Var);
                    } else {
                        if (!(jx70Var instanceof ix70)) {
                            t9f.b();
                            return null;
                        }
                        g5bVar9.W0().x(nm2Var);
                    }
                } else if (o5bVar instanceof m5b) {
                    ((k3t0) g5bVar9.X1.getValue()).x(new wl2(((m5b) o5bVar).f21212a.f14760a));
                } else if (o5bVar instanceof l5b) {
                    g5bVar9.T0().x(new dg2(((l5b) o5bVar).f19445a));
                } else if (o5bVar.equals(j5b.f15924a)) {
                    View viewQ2 = g5bVar9.q0();
                    j120.X(viewQ2);
                    viewQ2.clearFocus();
                } else {
                    if (!o5bVar.equals(n5b.f22935a)) {
                        t9f.b();
                        return null;
                    }
                    poq0 poq0Var2 = g5bVar9.R0().f627a;
                    androidx.fragment.app.e eVarC16 = g5bVar9.C();
                    eVarC16.getClass();
                    uuz uuzVar2 = fk60.b;
                    ki60.q2.getClass();
                    if (eVarC16.J("OnboardingBottomSheetContainerFragment") == null) {
                        ki60 ki60Var2 = new ki60();
                        iiy[] iiyVarArr2 = ki60.r2;
                        ki60Var2.n2.I(ki60Var2, iiyVarArr2[1], 32);
                        ki60Var2.o2.x(ki60Var2, iiyVarArr2[2], "");
                        sj3.E0(ki60Var2, eVarC16, "OnboardingBottomSheetContainerFragment");
                    }
                }
                g5bVar9.Q0().x(n4b.f22892a);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                x4b x4bVar = (x4b) obj;
                x4bVar.getClass();
                ((k3t0) this.receiver).x(x4bVar);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                mk50 mk50Var = (mk50) obj;
                mk50Var.getClass();
                jgb jgbVar = (jgb) this.receiver;
                jgbVar.getClass();
                sac.V(jiu0.a(jgbVar), null, null, null, new xw5(jgbVar, mk50Var, yjeVar, (byte) 1), 15);
                return Unit.f46060a;
            default:
                Throwable th = (Throwable) obj;
                th.getClass();
                jgb jgbVar2 = (jgb) this.receiver;
                jgbVar2.getClass();
                r26 r26Var = new r26(g2v.d(jgbVar2.e, pb10.g, null, null, R.string.data_retrieval_error, 0, null, 478));
                p7m0 p7m0Var2 = jgbVar2.j;
                p7m0Var2.getClass();
                p7m0Var2.o(null, r26Var);
                jgbVar2.s.a(th);
                return Unit.f46060a;
        }
    }
}

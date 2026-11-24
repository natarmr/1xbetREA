package a;

import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class enc extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8087a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ enc(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f8087a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = 2;
        byte b2 = 0;
        byte b3 = 1;
        yje yjeVar = null;
        switch (this.f8087a) {
            case 0:
                tg2 tg2Var = (tg2) obj;
                tg2Var.getClass();
                gnc gncVar = (gnc) this.receiver;
                kl5 kl5Var = gnc.Z1;
                if (tg2Var instanceof ng2) {
                    ujd ujdVarD = ((mgi) gncVar.R1.getValue()).m.d();
                    x1x.x(ujdVarD);
                    ujdVarD.b(gncVar, ((ng2) tg2Var).f23464a);
                } else if (tg2Var instanceof qg2) {
                    ((dbi) ((mgi) gncVar.R1.getValue()).j.f3330a).o().r(gncVar, ((mgi) gncVar.R1.getValue()).b, ((qg2) tg2Var).f28662a);
                } else {
                    gncVar.getClass();
                    if (tg2Var.equals(sg2.f32139a)) {
                        pek pekVar = s6p.o2;
                        androidx.fragment.app.e eVarC = gncVar.C();
                        eVarC.getClass();
                        wep wepVar = wep.f39029a;
                        pekVar.getClass();
                        pek.p(eVarC, wepVar, "REMOVE_ALL_SPORT_EVENTS_RESULT");
                    } else if (tg2Var.equals(rg2.f30412a)) {
                        gncVar.S0("REQUEST_EVENTS_CLEAR_GROUPS_DIALOG_KEY");
                    } else if (tg2Var.equals(pg2.f26934a)) {
                        gncVar.M0().x(mmc.f22029a);
                    } else {
                        if (!tg2Var.equals(og2.f25196a)) {
                            t9f.b();
                            return null;
                        }
                        View viewQ0 = gncVar.q0();
                        j120.X(viewQ0);
                        viewQ0.clearFocus();
                    }
                }
                gncVar.P0().x(qf2.f28608a);
                return Unit.f46060a;
            case 1:
                gg2 gg2Var = (gg2) obj;
                gg2Var.getClass();
                ((k3t0) this.receiver).x(gg2Var);
                return Unit.f46060a;
            case 2:
                ml2 ml2Var = (ml2) obj;
                ml2Var.getClass();
                gnc gncVar2 = (gnc) this.receiver;
                kl5 kl5Var2 = gnc.Z1;
                if (ml2Var instanceof fl2) {
                    ujd ujdVarD2 = gncVar2.Q0().e.d();
                    x1x.x(ujdVarD2);
                    ujdVarD2.b(gncVar2, ((fl2) ml2Var).f9720a);
                } else {
                    gncVar2.getClass();
                    if (ml2Var.equals(el2.f7979a)) {
                        e720 e720Var = gncVar2.Q0().d;
                        androidx.fragment.app.e eVarC2 = gncVar2.C();
                        eVarC2.getClass();
                        e720Var.a(eVarC2);
                    } else if (ml2Var.equals(gl2.f11471a)) {
                        wdk0.k(gncVar2.Q0().c, new xdk0(pek0.f26859a, gncVar2.Q0().b.b.a(R.string.auto_sub_info_message, Arrays.copyOf(new Object[0], 0)), null, null, null, null, 124), gncVar2, null, null, true, null, 1004);
                    } else if (ml2Var.equals(hl2.f13235a)) {
                        ii iiVar = gncVar2.Q0().f25219a;
                        DialogFields dialogFields = new DialogFields((CharSequence) gncVar2.Q0().b.b.a(R.string.optibet_market_info_title, Arrays.copyOf(new Object[0], 0)), (CharSequence) gncVar2.Q0().b.b.a(R.string.optibet_market_desc, Arrays.copyOf(new Object[0], 0)), (CharSequence) gncVar2.Q0().b.b.a(R.string.ok, Arrays.copyOf(new Object[0], 0)), (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528);
                        androidx.fragment.app.e eVarC3 = gncVar2.C();
                        eVarC3.getClass();
                        iiVar.d(dialogFields, eVarC3);
                    } else if (ml2Var.equals(ll2.f20227a)) {
                        ii iiVar2 = gncVar2.Q0().f25219a;
                        String strH = gncVar2.H(R.string.remove);
                        String strH2 = gncVar2.H(R.string.coupon_edit_confirm_delete_message);
                        String strH3 = gncVar2.H(R.string.remove);
                        strH3.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, gncVar2.H(R.string.cancel), (String) null, "REQUEST_REMOVE_ONE_EVENT_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC4 = gncVar2.C();
                        eVarC4.getClass();
                        iiVar2.d(dialogFields2, eVarC4);
                    } else if (ml2Var instanceof kl2) {
                        e720 e720Var2 = gncVar2.Q0().d;
                        androidx.fragment.app.e eVarC5 = gncVar2.C();
                        eVarC5.getClass();
                        kl2 kl2Var = (kl2) ml2Var;
                        e720Var2.b(eVarC5, kl2Var.b, kl2Var.f18465a, new fq2());
                    } else if (ml2Var.equals(jl2.f16696a)) {
                        ii iiVar3 = gncVar2.L0().c;
                        String strH4 = gncVar2.H(R.string.each_way_dialog_title);
                        String strH5 = gncVar2.H(R.string.each_way_description);
                        String strH6 = gncVar2.H(R.string.ok_upper);
                        strH6.getClass();
                        DialogFields dialogFields3 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528);
                        androidx.fragment.app.e eVarC6 = gncVar2.C();
                        eVarC6.getClass();
                        iiVar3.d(dialogFields3, eVarC6);
                    } else {
                        if (!ml2Var.equals(il2.f14956a)) {
                            t9f.b();
                            return null;
                        }
                        gncVar2.S0("REMOVE_ALL_COEF_TRACK_RESULT");
                    }
                }
                gncVar2.K0().x(hk2.f13189a);
                return Unit.f46060a;
            case 3:
                xk2 xk2Var = (xk2) obj;
                xk2Var.getClass();
                ((k3t0) this.receiver).x(xk2Var);
                return Unit.f46060a;
            case 4:
                jn2 jn2Var = (jn2) obj;
                jn2Var.getClass();
                gnc gncVar3 = (gnc) this.receiver;
                kl5 kl5Var3 = gnc.Z1;
                rek0 rek0Var = rek0.b;
                if (jn2Var instanceof fn2) {
                    ujd ujdVarD3 = ((qgi) gncVar3.P1.getValue()).P.d();
                    x1x.x(ujdVarD3);
                    ujdVarD3.b(gncVar3, ((fn2) jn2Var).f9812a);
                } else if (jn2Var instanceof gn2) {
                    wdk0 wdk0Var = ((qgi) gncVar3.P1.getValue()).R;
                    String strH7 = gncVar3.H(R.string.get_balance_list_error);
                    strH7.getClass();
                    wdk0.k(wdk0Var, new xdk0(rek0Var, strH7, null, null, null, null, 124), gncVar3, null, null, false, null, 1020);
                } else {
                    gncVar3.getClass();
                    if (jn2Var.equals(hn2.f13331a)) {
                        gncVar3.S0("REMOVE_ALL_VIEWED_RESULT");
                    } else {
                        if (!(jn2Var instanceof in2)) {
                            t9f.b();
                            return null;
                        }
                        wdk0.k(((qgi) gncVar3.P1.getValue()).R, new xdk0(rek0Var, ((in2) jn2Var).f15052a, null, null, null, null, 124), gncVar3, null, null, false, null, 1020);
                    }
                }
                gncVar3.R0().x(cm2.f4587a);
                return Unit.f46060a;
            case 5:
                wm2 wm2Var = (wm2) obj;
                wm2Var.getClass();
                ((k3t0) this.receiver).x(wm2Var);
                return Unit.f46060a;
            case 6:
                nnc nncVar = (nnc) obj;
                nncVar.getClass();
                gnc gncVar4 = (gnc) this.receiver;
                kl5 kl5Var4 = gnc.Z1;
                gncVar4.getClass();
                if (nncVar instanceof inc) {
                    int iOrdinal = ((inc) nncVar).f15067a.ordinal();
                    if (iOrdinal == 0) {
                        gncVar4.P0().x(xf2.f40771a);
                    } else if (iOrdinal == 1) {
                        wep wepVar2 = wep.b;
                        pek pekVar2 = s6p.o2;
                        androidx.fragment.app.e eVarC7 = gncVar4.C();
                        eVarC7.getClass();
                        pekVar2.getClass();
                        pek.p(eVarC7, wepVar2, "REQUEST_KEY_OTHER_CLEAR");
                    } else if (iOrdinal == 2) {
                        gncVar4.K0().x(qk2.f28866a);
                    } else {
                        if (iOrdinal != 3) {
                            t9f.b();
                            return null;
                        }
                        gncVar4.R0().x(nm2.f23752a);
                    }
                } else if (nncVar instanceof lnc) {
                    int iOrdinal2 = ((lnc) nncVar).f20337a.ordinal();
                    if (iOrdinal2 == 0) {
                        gncVar4.P0().x(fg2.f9471a);
                    } else if (iOrdinal2 == 1) {
                        gncVar4.O0().x(ub80.f35368a);
                    } else if (iOrdinal2 == 2) {
                        gncVar4.K0().x(vk2.f37555a);
                    } else {
                        if (iOrdinal2 != 3) {
                            t9f.b();
                            return null;
                        }
                        gncVar4.R0().x(rm2.f30725a);
                    }
                } else if (nncVar instanceof jnc) {
                    gncVar4.P0().x(new dg2(((jnc) nncVar).f16805a));
                } else if (nncVar.equals(hnc.f13345a)) {
                    View viewQ1 = gncVar4.q0();
                    j120.X(viewQ1);
                    viewQ1.clearFocus();
                } else if (nncVar.equals(knc.f18578a)) {
                    gncVar4.O0().x(new db80(mc80.f21539a));
                } else {
                    if (!nncVar.equals(mnc.f22082a)) {
                        t9f.b();
                        return null;
                    }
                    poq0 poq0Var = gncVar4.L0().f18241a;
                    androidx.fragment.app.e eVarC8 = gncVar4.C();
                    eVarC8.getClass();
                    uuz uuzVar = fk60.b;
                    ki60.q2.getClass();
                    if (eVarC8.J("OnboardingBottomSheetContainerFragment") == null) {
                        ki60 ki60Var = new ki60();
                        iiy[] iiyVarArr = ki60.r2;
                        ki60Var.n2.I(ki60Var, iiyVarArr[1], 32);
                        ki60Var.o2.x(ki60Var, iiyVarArr[2], "");
                        sj3.E0(ki60Var, eVarC8, "OnboardingBottomSheetContainerFragment");
                    }
                }
                gncVar4.M0().x(nmc.f23763a);
                return Unit.f46060a;
            case 7:
                xmc xmcVar = (xmc) obj;
                xmcVar.getClass();
                ((k3t0) this.receiver).x(xmcVar);
                return Unit.f46060a;
            case 8:
                gsc gscVar = (gsc) obj;
                gscVar.getClass();
                esc escVar = (esc) this.receiver;
                int i = esc.m2;
                escVar.getClass();
                if (gscVar.equals(gsc.f11824a)) {
                    escVar.y0();
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 9:
                s1q0 s1q0Var = (s1q0) obj;
                s1q0Var.getClass();
                wtc wtcVar = (wtc) this.receiver;
                wtcVar.getClass();
                sac.V(jiu0.a(wtcVar), vtc.f37999a, null, null, new fob(s1q0Var, wtcVar, yjeVar, (byte) 10), 14);
                return Unit.f46060a;
            case 10:
                Throwable th = (Throwable) obj;
                th.getClass();
                qxc qxcVar = (qxc) this.receiver;
                bby bbyVar = qxcVar.o;
                if (bbyVar != null) {
                    v3c.N(bbyVar);
                }
                qxcVar.c.b(th, new cnc(qxcVar, b));
                return Unit.f46060a;
            case 11:
                tjz tjzVar = (tjz) obj;
                tjzVar.getClass();
                ((dk5) this.receiver).L(tjzVar);
                return Unit.f46060a;
            case 12:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((dk5) this.receiver).J(th2);
                return Unit.f46060a;
            case 13:
                ((dk5) this.receiver).K(((Boolean) obj).booleanValue());
                return Unit.f46060a;
            case 14:
                tjz tjzVar2 = (tjz) obj;
                tjzVar2.getClass();
                ((dk5) this.receiver).L(tjzVar2);
                return Unit.f46060a;
            case 15:
                eed eedVar = (eed) obj;
                eedVar.getClass();
                ((k3t0) this.receiver).x(eedVar);
                return Unit.f46060a;
            case 16:
                wed wedVar = (wed) obj;
                wedVar.getClass();
                ((k3t0) this.receiver).x(wedVar);
                return Unit.f46060a;
            case 17:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((svd) this.receiver).B(th3);
                return Unit.f46060a;
            case 18:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((svd) this.receiver).B(th4);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((svd) this.receiver).B(th5);
                return Unit.f46060a;
            case 20:
                cwd cwdVar = (cwd) obj;
                cwdVar.getClass();
                ((k3t0) this.receiver).x(cwdVar);
                return Unit.f46060a;
            case 21:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((kyd) this.receiver).B(th6);
                return Unit.f46060a;
            case 22:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                ((Function1) this.receiver).invoke(th7);
                return Unit.f46060a;
            case 23:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                ((kyd) this.receiver).B(th8);
                return Unit.f46060a;
            case 24:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                ((kyd) this.receiver).B(th9);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                ((kyd) this.receiver).B(th10);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                ((kzd) this.receiver).x(th11);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                g1e g1eVar = (g1e) this.receiver;
                g1eVar.getClass();
                sac.V(jiu0.a(g1eVar), v0e.f36577a, null, null, new w0e(th12, g1eVar, yjeVar, b2), 14);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Throwable th13 = (Throwable) obj;
                th13.getClass();
                g1e g1eVar2 = (g1e) this.receiver;
                g1eVar2.getClass();
                sac.V(jiu0.a(g1eVar2), z0e.f43563a, null, null, new w0e(th13, g1eVar2, yjeVar, b3), 14);
                return Unit.f46060a;
            default:
                jzp jzpVar = (jzp) obj;
                jzpVar.getClass();
                e7e e7eVar = (e7e) this.receiver;
                kwd kwdVar = e7e.d2;
                fae faeVarJ0 = e7eVar.J0();
                sac.V(jiu0.a(faeVarJ0), new z6e(1, faeVarJ0, fae.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 7), null, faeVarJ0.k.b, new fob(jzpVar, faeVarJ0, yjeVar, (byte) 16), 10);
                return Unit.f46060a;
        }
    }
}

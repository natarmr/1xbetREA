package a;

import android.text.SpannableString;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.related.api.presentation.RelatedParams;
import org.xplatform.sportgame.classic.impl.presentation.legacy.models.CardIdentity;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.matchinfo.MatchInfoContainerView;
import org.xplatform.sportgame.core.presentation.GameScreenRelatedContainerView;
import org.xplatform.sportgame.subgames.api.SubGamesParams;
import org.xplatform.ui_core.viewcomponents.views.BetInputView;
import org.xplatform.ui_core.viewcomponents.views.MakeBetBalanceViewDs;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jbh0 extends xo implements Function2 {
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jbh0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.h = b;
    }

    private final Object a(Object obj, Object obj2) {
        py30 py30Var = (py30) obj;
        gbl0 gbl0Var = (gbl0) this.f41192a;
        lme0 lme0Var = gbl0.c2;
        gbl0Var.getClass();
        if (!Intrinsics.d(py30Var, ny30.f24311a)) {
            yje yjeVar = null;
            if (py30Var instanceof oy30) {
                if (gbl0Var.O1 == null) {
                    Intrinsics.h("actionMenuDialogFactory");
                    throw null;
                }
                androidx.fragment.app.e eVarC = gbl0Var.C();
                eVarC.getClass();
                gfk0.h(eVarC, ((oy30) py30Var).f26043a);
            } else if (Intrinsics.d(py30Var, ny30.b)) {
                if (gbl0Var.R1 == null) {
                    Intrinsics.h("quickBetDialogNavigator");
                    throw null;
                }
                androidx.fragment.app.e eVarC2 = gbl0Var.C();
                eVarC2.getClass();
                xi70.h(eVarC2);
            } else {
                if (!Intrinsics.d(py30Var, ny30.c)) {
                    t9f.b();
                    return null;
                }
                wdk0 wdk0Var = gbl0Var.S1;
                if (wdk0Var == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                qek0 qek0Var = qek0.f28589a;
                String strH = gbl0Var.H(R.string.one_click_bet_disabled_message);
                strH.getClass();
                wdk0.k(wdk0Var, new xdk0(qek0Var, strH, null, null, null, null, 124), gbl0Var, null, null, false, null, 1020);
            }
            f3j f3jVar = gbl0Var.J0().t;
            sac.V(jiu0.a(f3jVar.s()), svs.f32884a, null, f3jVar.d.c, new lvs(f3jVar, yjeVar, (byte) 4), 10);
        }
        return Unit.f46060a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.h;
        byte b2 = 1;
        byte b3 = 8;
        Object obj3 = this.f41192a;
        switch (b) {
            case 0:
                lbh0 lbh0Var = (lbh0) obj3;
                qjj.W(lbh0Var.k1.c(), null, null, new a5(lbh0Var, ((g6u0) obj).f10786a, null, (byte) 2), 3);
                return Unit.f46060a;
            case 1:
                lbh0 lbh0Var2 = (lbh0) obj3;
                qjj.W(lbh0Var2.k1.c(), null, null, new a5(lbh0Var2, ((g6u0) obj).f10786a, null, (byte) 3), 3);
                return Unit.f46060a;
            case 2:
                ((ldi0) obj3).C((Throwable) obj);
                return Unit.f46060a;
            case 3:
                m5j0 m5j0Var = (m5j0) obj;
                d4j0 d4j0Var = (d4j0) obj3;
                eke0 eke0Var = d4j0.S1;
                d4j0Var.getClass();
                if (m5j0Var != null) {
                    if (m5j0Var instanceof l5j0) {
                        t4r t4rVarG0 = d4j0Var.G0();
                        t4rVarG0.b.setVisibility(0);
                        t4rVarG0.c.setVisibility(8);
                    } else if (m5j0Var instanceof k5j0) {
                        List list = ((k5j0) m5j0Var).f17724a;
                        t4r t4rVarG1 = d4j0Var.G0();
                        t4rVarG1.b.setVisibility(8);
                        ((y1j0) d4j0Var.Q1.getValue()).A(list);
                        t4rVarG1.c.setVisibility(0);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 4:
                j5j0 j5j0Var = (j5j0) obj;
                d4j0 d4j0Var2 = (d4j0) obj3;
                eke0 eke0Var2 = d4j0.S1;
                d4j0Var2.getClass();
                c5j0 c5j0Var = c5j0.f3774a;
                if (!Intrinsics.d(j5j0Var, c5j0Var)) {
                    if (Intrinsics.d(j5j0Var, e5j0.f7237a)) {
                        String strH = d4j0Var2.H(R.string.confirmation);
                        strH.getClass();
                        String strH2 = d4j0Var2.H(R.string.push_tracking_alert_message);
                        strH2.getClass();
                        String strH3 = d4j0Var2.H(R.string.activate);
                        strH3.getClass();
                        d4j0.K0(d4j0Var2, strH, strH2, "APP_NOTIFICATION_SETTINGS_REQUEST_KEY", strH3, 16);
                    } else if (Intrinsics.d(j5j0Var, g5j0.f10722a)) {
                        String strH4 = d4j0Var2.H(R.string.confirmation);
                        strH4.getClass();
                        String strH5 = d4j0Var2.H(R.string.system_push_notification_setting);
                        strH5.getClass();
                        String strH6 = d4j0Var2.H(R.string.open_settings);
                        strH6.getClass();
                        String strH7 = d4j0Var2.H(R.string.cancel);
                        strH7.getClass();
                        d4j0Var2.J0(strH4, strH5, "SYSTEM_NOTIFICATION_SETTINGS_REQUEST_KEY", strH6, strH7);
                    } else if (Intrinsics.d(j5j0Var, f5j0.f8964a)) {
                        String strH8 = d4j0Var2.H(R.string.caution);
                        strH8.getClass();
                        String strH9 = d4j0Var2.H(R.string.automax_activate_dialog_message);
                        strH9.getClass();
                        d4j0.K0(d4j0Var2, strH8, strH9, "AUTO_MAX_ACTIVATE_DIALOG_REQUEST_KEY", null, 24);
                    } else if (Intrinsics.d(j5j0Var, h5j0.f12483a)) {
                        String strH10 = d4j0Var2.H(R.string.caution);
                        strH10.getClass();
                        String strH11 = d4j0Var2.H(R.string.vip_bet_activate_dialog_message);
                        strH11.getClass();
                        d4j0.K0(d4j0Var2, strH10, strH11, "VIP_ACTIVATE_DIALOG_REQUEST_KEY", null, 24);
                    } else if (j5j0Var instanceof d5j0) {
                        qud qudVar = ysj.m2;
                        androidx.fragment.app.e eVarC = d4j0Var2.C();
                        eVarC.getClass();
                        bm5 bm5VarH0 = d4j0Var2.H0();
                        qudVar.getClass();
                        if (eVarC.J("DefaultBetSumEditorBottomSheetFragmentTag") == null) {
                            ysj ysjVar = new ysj();
                            ysjVar.g2.u(ysjVar, ysj.n2[0], bm5VarH0);
                            ysjVar.H0(eVarC, "DefaultBetSumEditorBottomSheetFragmentTag");
                        }
                    } else {
                        if (!(j5j0Var instanceof i5j0)) {
                            t9f.b();
                            return null;
                        }
                        h4j0 h4j0Var = ((i5j0) j5j0Var).f14195a;
                        rl70 rl70Var = snd0.n2;
                        androidx.fragment.app.e eVarC2 = d4j0Var2.C();
                        eVarC2.getClass();
                        bm5 bm5VarH1 = d4j0Var2.H0();
                        rl70Var.getClass();
                        if (eVarC2.J("QuickBetSumEditorBottomSheetFragmentTag") == null) {
                            snd0 snd0Var = new snd0();
                            iiy[] iiyVarArr = snd0.o2;
                            snd0Var.g2.u(snd0Var, iiyVarArr[0], bm5VarH1);
                            snd0Var.h2.u(snd0Var, iiyVarArr[1], h4j0Var);
                            snd0Var.H0(eVarC2, "QuickBetSumEditorBottomSheetFragmentTag");
                        }
                    }
                    p7m0 p7m0Var = d4j0Var2.I0().B;
                    p7m0Var.getClass();
                    p7m0Var.o(null, c5j0Var);
                }
                return Unit.f46060a;
            case 5:
                pm5 pm5Var = (pm5) obj;
                kvj0 kvj0Var = (kvj0) obj3;
                eke0 eke0Var3 = kvj0.S1;
                kvj0Var.L0().c.setVisibility(pm5Var instanceof em5 ? (byte) 8 : (byte) 0);
                if (pm5Var instanceof im5) {
                    kvj0Var.L0().c.v();
                } else {
                    kvj0Var.L0().c.x();
                }
                if (!Intrinsics.d(pm5Var, im5.f15009a) && !Intrinsics.d(pm5Var, em5.f8031a)) {
                    if (!(pm5Var instanceof lm5)) {
                        t9f.b();
                        return null;
                    }
                    lm5 lm5Var = (lm5) pm5Var;
                    ke keVar = lm5Var.b;
                    boolean z = lm5Var.c;
                    MakeBetBalanceViewDs makeBetBalanceViewDs = kvj0Var.L0().c;
                    makeBetBalanceViewDs.setModel(keVar);
                    if (z) {
                        String string = kvj0Var.o0().getString(R.string.change_balance_account);
                        string.getClass();
                        makeBetBalanceViewDs.setChangeBalanceBtnText(string);
                        makeBetBalanceViewDs.setChangeBalanceClickListener(new bvj0(kvj0Var, makeBetBalanceViewDs));
                    } else {
                        String string2 = kvj0Var.o0().getString(R.string.refill_account);
                        string2.getClass();
                        makeBetBalanceViewDs.setChangeBalanceBtnText(string2);
                        makeBetBalanceViewDs.setChangeBalanceClickListener(new bvj0(kvj0Var));
                    }
                }
                return Unit.f46060a;
            case 6:
                fwo0 fwo0Var = (fwo0) obj;
                kvj0 kvj0Var2 = (kvj0) obj3;
                eke0 eke0Var4 = kvj0.S1;
                kvj0Var2.L0().e.e();
                if (Intrinsics.d(fwo0Var, vvo0.f38111a)) {
                    kvj0Var2.L0().e.setVisibility(8);
                } else {
                    if (!(fwo0Var instanceof yvo0)) {
                        t9f.b();
                        return null;
                    }
                    kvj0Var2.L0().e.setVisibility(0);
                    kvj0Var2.L0().e.f();
                }
                return Unit.f46060a;
            case 7:
                fpm0 fpm0Var = (fpm0) obj;
                kvj0 kvj0Var3 = (kvj0) obj3;
                eke0 eke0Var5 = kvj0.S1;
                kvj0Var3.getClass();
                if (Intrinsics.d(fpm0Var, bpm0.f2992a)) {
                    kvj0Var3.L0().b.y(true);
                } else {
                    if (!(fpm0Var instanceof cpm0)) {
                        t9f.b();
                        return null;
                    }
                    BetInputView betInputView = kvj0Var3.L0().b;
                    betInputView.y(false);
                    cpm0 cpm0Var = (cpm0) fpm0Var;
                    betInputView.setVisibilityStepButtons(cpm0Var.d);
                    SpannableString spannableStringC = cpm0Var.c.c(kvj0Var3.o0());
                    betInputView.setBetLimitsText(spannableStringC);
                    if (!cpm0Var.b) {
                        betInputView.w(null, cpm0Var.f4755a);
                    }
                    betInputView.setMakeBetButtonEnabled(cpm0Var.g);
                    betInputView.setPlusButtonEnabled(cpm0Var.e);
                    betInputView.setMinusButtonEnabled(cpm0Var.f);
                    betInputView.x(spannableStringC.toString(), cpm0Var.h);
                }
                return Unit.f46060a;
            case 8:
                zb50 zb50Var = (zb50) obj;
                kvj0 kvj0Var4 = (kvj0) obj3;
                eke0 eke0Var6 = kvj0.S1;
                if (zb50Var instanceof vb50) {
                    bm5 bm5Var = ((vb50) zb50Var).f37125a;
                    ynb ynbVar = kvj0Var4.M1;
                    if (ynbVar == null) {
                        Intrinsics.h("changeBalanceDialogProvider");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC3 = kvj0Var4.C();
                    eVarC3.getClass();
                    ynb.b(ynbVar, bm5Var, null, eVarC3, false, "REQUEST_CHANGE_BALANCE_DIALOG_KEY", 494);
                    p7m0 p7m0Var2 = kvj0Var4.M0().Y;
                    p7m0Var2.getClass();
                    p7m0Var2.o(null, wb50.f38861a);
                } else {
                    kvj0Var4.getClass();
                }
                return Unit.f46060a;
            case 9:
                ((kvj0) obj3).K0((k520) obj);
                return Unit.f46060a;
            case 10:
                enb0 enb0Var = (enb0) obj;
                kvj0 kvj0Var5 = (kvj0) obj3;
                eke0 eke0Var7 = kvj0.S1;
                kvj0Var5.getClass();
                if (Intrinsics.d(enb0Var, cnb0.f4645a)) {
                    kvj0Var5.L0().d.setVisibility(8);
                } else {
                    if (!(enb0Var instanceof dnb0)) {
                        t9f.b();
                        return null;
                    }
                    kvj0Var5.L0().d.setVisibility(0);
                    kvj0Var5.L0().d.setText(((dnb0) enb0Var).f6360a.b(kvj0Var5.o0()));
                }
                return Unit.f46060a;
            case 11:
                ((kvj0) obj3).J0((r0o) obj);
                return Unit.f46060a;
            case 12:
                ch5 ch5Var = (ch5) obj;
                kvj0 kvj0Var6 = (kvj0) obj3;
                eke0 eke0Var8 = kvj0.S1;
                kvj0Var6.getClass();
                if (Intrinsics.d(ch5Var, ug5.f35607a)) {
                    kvj0Var6.L0().c.u();
                } else if (Intrinsics.d(ch5Var, yg5.f42570a)) {
                    kvj0Var6.L0().c.w();
                }
                return Unit.f46060a;
            case 13:
                ((yxj0) obj3).w((Throwable) obj);
                return Unit.f46060a;
            case 14:
                ((yxj0) obj3).w((Throwable) obj);
                return Unit.f46060a;
            case 15:
                ((xxj0) obj3).C((Throwable) obj);
                return Unit.f46060a;
            case 16:
                ((duj) obj3).a((Throwable) obj);
                return Unit.f46060a;
            case 17:
                pik0 pik0Var = (pik0) obj;
                tik0 tik0Var = (tik0) obj3;
                iiy[] iiyVarArr2 = tik0.Q1;
                tik0Var.getClass();
                if (pik0Var != null) {
                    if (pik0Var instanceof nik0) {
                        if (((nik0) pik0Var).f23593a) {
                            tik0Var.H0().t.setVisibility(8);
                            tik0Var.H0().u.setVisibility(0);
                        } else {
                            tik0Var.H0().u.setVisibility(8);
                        }
                    } else if (pik0Var instanceof oik0) {
                        tik0Var.H0().D.setVisibility(0);
                        tik0Var.H0().O.setVisibility(0);
                        tik0Var.H0().t.setVisibility(8);
                        tik0Var.H0().u.setVisibility(8);
                        ArrayList<ijk0> arrayList = ((oik0) pik0Var).f25317a;
                        ijk0 ijk0Var = (ijk0) CollectionsKt.f0(arrayList);
                        byte b4 = ijk0Var != null ? ijk0Var.b : (byte) -1;
                        for (ijk0 ijk0Var2 : arrayList) {
                            byte b5 = ijk0Var2.b;
                            boolean z2 = b5 == b4;
                            if (b5 == 1) {
                                tik0Var.H0().A.setVisibility(!z2 ? 0 : 8);
                                tik0Var.G0(ijk0Var2.f14879a, tik0Var.H0().h, tik0Var.H0().q, tik0Var.H0().L, ijk0Var2.b);
                            } else if (b5 == 5) {
                                tik0Var.H0().y.setVisibility(!z2 ? 0 : 8);
                                tik0Var.G0(ijk0Var2.f14879a, tik0Var.H0().f, tik0Var.H0().o, tik0Var.H0().J, ijk0Var2.b);
                            } else if (b5 == 7) {
                                tik0Var.H0().C.setVisibility(!z2 ? 0 : 8);
                                tik0Var.G0(ijk0Var2.f14879a, tik0Var.H0().j, tik0Var.H0().s, tik0Var.H0().N, ijk0Var2.b);
                            } else if (b5 == 9) {
                                tik0Var.H0().x.setVisibility(!z2 ? 0 : 8);
                                tik0Var.G0(ijk0Var2.f14879a, tik0Var.H0().e, tik0Var.H0().n, tik0Var.H0().I, ijk0Var2.b);
                            } else if (b5 == 11) {
                                tik0Var.H0().w.setVisibility(!z2 ? 0 : 8);
                                tik0Var.G0(ijk0Var2.f14879a, tik0Var.H0().d, tik0Var.H0().m, tik0Var.H0().H, ijk0Var2.b);
                            } else if (b5 == 13) {
                                tik0Var.H0().B.setVisibility(!z2 ? 0 : 8);
                                tik0Var.G0(ijk0Var2.f14879a, tik0Var.H0().i, tik0Var.H0().r, tik0Var.H0().M, ijk0Var2.b);
                            } else if (b5 == 17) {
                                tik0Var.H0().z.setVisibility(!z2 ? 0 : 8);
                                tik0Var.G0(ijk0Var2.f14879a, tik0Var.H0().g, tik0Var.H0().p, tik0Var.H0().K, ijk0Var2.b);
                            } else if (b5 == 19) {
                                tik0Var.G0(ijk0Var2.f14879a, tik0Var.H0().b, tik0Var.H0().k, tik0Var.H0().F, ijk0Var2.b);
                            } else if (b5 == 31) {
                                tik0Var.H0().v.setVisibility(!z2 ? 0 : 8);
                                tik0Var.G0(ijk0Var2.f14879a, tik0Var.H0().c, tik0Var.H0().l, tik0Var.H0().G, ijk0Var2.b);
                            }
                        }
                    } else if (pik0Var instanceof mik0) {
                        ra10 ra10Var = ((mik0) pik0Var).f21851a;
                        tik0Var.H0().D.setVisibility(8);
                        tik0Var.H0().O.setVisibility(8);
                        tik0Var.H0().u.setVisibility(8);
                        LottieView lottieView = tik0Var.H0().t;
                        lottieView.v(ra10Var);
                        lottieView.setVisibility(0);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 18:
                zik0 zik0Var = (zik0) obj;
                tik0 tik0Var2 = (tik0) obj3;
                iiy[] iiyVarArr3 = tik0.Q1;
                boolean z3 = zik0Var instanceof xik0;
                wik0 wik0Var = wik0.f39218a;
                if (z3) {
                    String str = ((xik0) zik0Var).f40949a;
                    wdk0 wdk0Var = tik0Var2.M1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, new xdk0(rek0.b, str, null, null, null, null, 124), tik0Var2, null, null, false, null, 1020);
                    p7m0 p7m0Var3 = tik0Var2.I0().n;
                    p7m0Var3.getClass();
                    p7m0Var3.o(null, wik0Var);
                } else {
                    tik0Var2.getClass();
                    if (Intrinsics.d(zik0Var, yik0.f42696a)) {
                        wdk0 wdk0Var2 = tik0Var2.M1;
                        if (wdk0Var2 == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        qek0 qek0Var = qek0.f28589a;
                        String strH12 = tik0Var2.H(R.string.successfully_connected);
                        strH12.getClass();
                        wdk0.k(wdk0Var2, new xdk0(qek0Var, strH12, null, null, null, null, 124), tik0Var2, null, null, false, null, 1020);
                        p7m0 p7m0Var4 = tik0Var2.I0().n;
                        p7m0Var4.getClass();
                        p7m0Var4.o(null, wik0Var);
                    } else if (!Intrinsics.d(zik0Var, wik0Var)) {
                        t9f.b();
                        return null;
                    }
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                zy5 zy5Var = (zy5) obj;
                tyk0 tyk0Var = (tyk0) obj3;
                mne mneVar = tyk0Var.v;
                if (zy5Var != null) {
                    if (zy5Var instanceof qy5) {
                        sac.V(jiu0.a(tyk0Var), new gvj0(1, tyk0Var, tyk0.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 20), null, mneVar.f22085a, new oyk0(tyk0Var, null, b2), 10);
                        tyk0Var.y(tyk0Var.x.a());
                    } else if (zy5Var instanceof yy5) {
                        bby bbyVar = tyk0Var.B;
                        if (bbyVar == null || !bbyVar.isActive()) {
                            tyk0Var.B = sac.V(jiu0.a(tyk0Var), new gvj0(1, tyk0Var, tyk0.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 24), null, mneVar.b, new syk0(tyk0Var, null, (byte) 0), 10);
                        }
                    } else if (zy5Var instanceof ry5) {
                        tyk0Var.B();
                    } else if (zy5Var instanceof iy5) {
                        if (((iy5) zy5Var).f15573a.f4905a.f3145a != esr.NOTHING) {
                            tyk0Var.B();
                        }
                    } else if (zy5Var instanceof ty5) {
                        if (!((ty5) zy5Var).f34736a.f4905a.f3145a.a()) {
                            tyk0Var.B();
                        }
                    } else if (zy5Var instanceof ly5) {
                        sac.V(jiu0.a(tyk0Var), new gvj0(1, tyk0Var, tyk0.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 21), null, mneVar.f22085a, new kbh0(tyk0Var, null, (byte) 22), 10);
                    } else if (zy5Var instanceof ole) {
                        tyk0Var.G(((ole) zy5Var).f25449a);
                    }
                }
                return Unit.f46060a;
            case 20:
                gbl0 gbl0Var = (gbl0) obj3;
                lme0 lme0Var = gbl0.c2;
                gbl0Var.K0((ucs) obj, gbl0Var.I0().c.getBackgroundView(), 0);
                return Unit.f46060a;
            case 21:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                lme0 lme0Var2 = gbl0.c2;
                ((gbl0) obj3).I0().c.O(zBooleanValue);
                return Unit.f46060a;
            case 22:
                dus dusVar = (dus) obj;
                gbl0 gbl0Var2 = (gbl0) obj3;
                lme0 lme0Var3 = gbl0.c2;
                gbl0Var2.getClass();
                if (dusVar != null) {
                    if (dusVar instanceof cus) {
                        gbl0Var2.I0().c.J((cus) dusVar);
                    } else if (dusVar instanceof bus) {
                        gbl0Var2.I0().c.H((bus) dusVar);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 23:
                prs prsVar = (prs) obj;
                gbl0 gbl0Var3 = (gbl0) obj3;
                lme0 lme0Var4 = gbl0.c2;
                gbl0Var3.I0().c.P(prsVar.f27481a.f29646a);
                gbl0Var3.I0().c.R(prsVar.b);
                ((lnd) gbl0Var3.a2.getValue()).A(prsVar.f27481a.b);
                return Unit.f46060a;
            case 24:
                gsr gsrVar = (gsr) obj;
                gbl0 gbl0Var4 = (gbl0) obj3;
                lme0 lme0Var5 = gbl0.c2;
                MatchInfoContainerView matchInfoContainerView = gbl0Var4.I0().c;
                ArrayList arrayList2 = gsrVar.f11844a;
                matchInfoContainerView.o1 = arrayList2;
                hsr hsrVar = matchInfoContainerView.B;
                if (hsrVar != null) {
                    yz3 yz3Var = (yz3) hsrVar.n;
                    List list2 = yz3Var.f;
                    list2.getClass();
                    if (list2.size() != arrayList2.size()) {
                        yz3Var.b(arrayList2, null);
                    }
                }
                gbl0Var4.I0().c.setTabsVisibility(gsrVar.b);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                abl0 abl0Var = (abl0) obj;
                gbl0 gbl0Var5 = (gbl0) obj3;
                lme0 lme0Var6 = gbl0.c2;
                gbl0Var5.getClass();
                ual0 ual0Var = ual0.f35335a;
                if (!Intrinsics.d(abl0Var, ual0Var)) {
                    if (abl0Var instanceof val0) {
                        val0 val0Var = (val0) abl0Var;
                        long j = val0Var.f37095a;
                        long j2 = val0Var.b;
                        boolean z4 = val0Var.c;
                        String str2 = val0Var.d;
                        long j3 = val0Var.e;
                        androidx.fragment.app.e eVarC4 = gbl0Var5.C();
                        if (gbl0Var5.N1 == null) {
                            Intrinsics.h("subGamesFragmentFactory");
                            throw null;
                        }
                        if (eVarC4.J("SUB_GAME_FRAGMENT_TAG") == null) {
                            if (gbl0Var5.N1 == null) {
                                Intrinsics.h("subGamesFragmentFactory");
                                throw null;
                            }
                            SubGamesParams subGamesParams = new SubGamesParams(j, j2, j3, gbl0Var5.G0().g ? new lq2() : new zq2(), str2, z4);
                            eym0.S1.getClass();
                            eym0 eym0Var = new eym0();
                            eym0Var.P1.J(eym0Var, eym0.U1[0], subGamesParams);
                            androidx.fragment.app.e eVarC5 = gbl0Var5.C();
                            eVarC5.getClass();
                            zb5 zb5Var = new zb5(eVarC5);
                            int fragmentContainerId = gbl0Var5.I0().b.getFragmentContainerId();
                            if (gbl0Var5.N1 == null) {
                                Intrinsics.h("subGamesFragmentFactory");
                                throw null;
                            }
                            zb5Var.k(fragmentContainerId, eym0Var, "SUB_GAME_FRAGMENT_TAG", 1);
                            zb5Var.f();
                        }
                        gbl0Var5.I0().d.getRelatedGamesList().e();
                    } else if (abl0Var instanceof yal0) {
                        androidx.fragment.app.e eVarC6 = gbl0Var5.C();
                        if (gbl0Var5.N1 == null) {
                            Intrinsics.h("subGamesFragmentFactory");
                            throw null;
                        }
                        Fragment fragmentJ = eVarC6.J("SUB_GAME_FRAGMENT_TAG");
                        if (fragmentJ != null) {
                            androidx.fragment.app.e eVarC7 = gbl0Var5.C();
                            eVarC7.getClass();
                            zb5 zb5Var2 = new zb5(eVarC7);
                            zb5Var2.n(fragmentJ);
                            zb5Var2.f();
                        }
                        pkd.i(gbl0Var5.I0().d.getRelatedGamesList(), null, new ugd(-1638947141, true, new mz7(gbl0Var5, ((yal0) abl0Var).f42305a, b3)));
                    } else if (abl0Var instanceof wal0) {
                        wdk0 wdk0Var3 = gbl0Var5.S1;
                        if (wdk0Var3 == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        rek0 rek0Var = rek0.b;
                        String strH13 = gbl0Var5.H(((wal0) abl0Var).f38834a);
                        strH13.getClass();
                        wdk0.k(wdk0Var3, new xdk0(rek0Var, strH13, null, null, null, null, 124), gbl0Var5, null, null, false, null, 1020);
                    } else if (abl0Var instanceof xal0) {
                        xal0 xal0Var = (xal0) abl0Var;
                        new c0x(xal0Var.f40562a, gbl0Var5.o0(), xal0Var.b).show();
                    } else if (abl0Var instanceof zal0) {
                        gbl0Var5.C().t0(i120.V(new Pair("BUNDLE_KEY_GAME_ID", Long.valueOf(((zal0) abl0Var).f44075a))), "REQUEST_KEY_UPDATE_GAME_ID");
                    } else {
                        if (!Intrinsics.d(abl0Var, tal0.f33618a)) {
                            t9f.b();
                            return null;
                        }
                        gbl0Var5.I0().c.B();
                    }
                    p7m0 p7m0Var5 = gbl0Var5.J0().R;
                    p7m0Var5.getClass();
                    p7m0Var5.o(null, ual0Var);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                crs crsVar = (crs) obj;
                gbl0 gbl0Var6 = (gbl0) obj3;
                lme0 lme0Var7 = gbl0.c2;
                if (!(crsVar instanceof brs)) {
                    gbl0Var6.getClass();
                    if (!Intrinsics.d(crsVar, ars.f1361a)) {
                        t9f.b();
                        return null;
                    }
                    gbl0Var6.I0().b.setVisibility(0);
                    gbl0Var6.I0().d.setVisibility(8);
                    return Unit.f46060a;
                }
                gbl0Var6.I0().d.setVisibility(0);
                gbl0Var6.I0().b.setVisibility(8);
                GameScreenRelatedContainerView gameScreenRelatedContainerView = gbl0Var6.I0().d;
                xef0 xef0Var = ((brs) crsVar).f3094a;
                if (xef0Var instanceof vef0) {
                    gameScreenRelatedContainerView.getBinding().c.setVisibility(8);
                    gameScreenRelatedContainerView.getBinding().d.setVisibility(0);
                    gameScreenRelatedContainerView.getBinding().d.setText(((vef0) xef0Var).f37285a);
                } else {
                    if (!(xef0Var instanceof wef0)) {
                        t9f.b();
                        return null;
                    }
                    gameScreenRelatedContainerView.getBinding().c.setVisibility(0);
                    gameScreenRelatedContainerView.getBinding().d.setVisibility(8);
                    gameScreenRelatedContainerView.getBinding().e.setVisibility(0);
                    gameScreenRelatedContainerView.getBinding().e.setText(((wef0) xef0Var).b);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                lme0 lme0Var8 = gbl0.c2;
                ((gbl0) obj3).I0().e.v((zus) obj);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return a(obj, obj2);
            default:
                g4z g4zVar = (g4z) obj;
                ncl0 ncl0Var = (ncl0) obj3;
                p7m0 p7m0Var6 = ncl0Var.R;
                ncl0Var.D(false);
                yje yjeVar = null;
                sac.V(jiu0.a(ncl0Var), sbl0.f31942a, null, ncl0Var.o.c, new pnd0(ncl0Var, g4zVar, yjeVar, (byte) 14), 10);
                if (g4zVar != null) {
                    if (g4zVar instanceof v3z) {
                        ncl0Var.c.e("KEY_SHOW_BETTING", Boolean.FALSE);
                        boolean z5 = ((zqs) ((p7m0) ncl0Var.w()).getValue()).f;
                        long j4 = ((zqs) ((p7m0) ncl0Var.w()).getValue()).b;
                        long j5 = ((zqs) ((p7m0) ncl0Var.w()).getValue()).d;
                        tef0 tef0Var = tef0.f33818a;
                        xuz xuzVar = pb10.c;
                        yal0 yal0Var = new yal0(new RelatedParams(z5, j4, ((zqs) ((p7m0) ncl0Var.w()).getValue()).c, -1L, j5, tef0Var));
                        p7m0Var6.getClass();
                        p7m0Var6.o(null, yal0Var);
                        qz40 qz40VarW = ncl0Var.w();
                        zqs zqsVarA = zqs.a((zqs) ((p7m0) ncl0Var.w()).getValue(), false, 0L, 0L, 0L, false, true, 0L, null, 958);
                        p7m0 p7m0Var7 = (p7m0) qz40VarW;
                        p7m0Var7.getClass();
                        p7m0Var7.o(null, zqsVarA);
                    } else if (g4zVar instanceof w3z) {
                        k9s k9sVar = ((w3z) g4zVar).f38520a;
                        ncl0Var.y(k9sVar.f17929a, k9sVar.z, k9sVar.H, k9sVar.s, k9sVar.B, k9sVar.Z, k9sVar.l);
                    } else if (g4zVar instanceof y3z) {
                        sac.V(jiu0.a(ncl0Var), tbl0.f33670a, null, null, new wn10(ncl0Var, ((y3z) g4zVar).f41975a, yjeVar, (byte) 19), 14);
                    } else if (g4zVar instanceof z3z) {
                        zal0 zal0Var = new zal0(((z3z) g4zVar).f43742a);
                        p7m0Var6.getClass();
                        p7m0Var6.o(null, zal0Var);
                    } else if (g4zVar instanceof a4z) {
                        k9s k9sVar2 = ((a4z) g4zVar).f245a;
                        ncl0Var.y(k9sVar2.f17929a, k9sVar2.z, k9sVar2.H, k9sVar2.s, k9sVar2.B, k9sVar2.Z, k9sVar2.l);
                    } else if (g4zVar instanceof c4z) {
                        qz40 qz40VarW2 = ncl0Var.w();
                        zqs zqsVarA2 = zqs.a((zqs) ((p7m0) ncl0Var.w()).getValue(), false, 0L, 0L, 0L, false, true, ((c4z) g4zVar).b, null, 575);
                        p7m0 p7m0Var8 = (p7m0) qz40VarW2;
                        p7m0Var8.getClass();
                        p7m0Var8.o(null, zqsVarA2);
                    } else if (g4zVar instanceof d4z) {
                        sac.V(jiu0.a(ncl0Var), tbl0.f33670a, null, null, new wn10(ncl0Var, ((d4z) g4zVar).f5479a, yjeVar, (byte) 19), 14);
                    } else if (g4zVar instanceof e4z) {
                        qz40 qz40VarW3 = ncl0Var.w();
                        zqs zqsVarA3 = zqs.a((zqs) ((p7m0) ncl0Var.w()).getValue(), false, 0L, 0L, 0L, false, false, 0L, null, 575);
                        p7m0 p7m0Var9 = (p7m0) qz40VarW3;
                        p7m0Var9.getClass();
                        p7m0Var9.o(null, zqsVarA3);
                        p7m0 p7m0Var10 = ncl0Var.N;
                        p7m0Var10.o(null, wqs.a((wqs) p7m0Var10.getValue(), null, 0, new CardIdentity(dja.COMMON, -1), 3));
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}

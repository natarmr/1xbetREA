package a;

import a.cu60;
import a.d270;
import a.evz;
import a.gs60;
import a.i120;
import a.m1r;
import a.p170;
import a.ufx;
import a.xt60;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.feature.online_call.impl.service.OnlineCallService;
import org.xplatform.games_list.features.common.OneXGamesScreens$OneXGamesFavoritesScreen;
import org.xplatform.games_section.api.models.GamesActionsFragmentResultModel;
import org.xplatform.picker.api.presentation.PickerParams;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cd60 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4147a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cd60(cl80 cl80Var, qah0 qah0Var) {
        this.f4147a = (byte) 28;
        this.b = cl80Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r15v12, types: [a.sik] */
    /* JADX WARN: Type inference failed for: r15v24 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ijl ijlVar;
        FragmentScreen fragmentScreen;
        FragmentScreen oneXGamesScreens$OneXGamesFavoritesScreen;
        WebView webView;
        WebView webView2;
        WebView webView3;
        WebView webView4;
        WebView webView5;
        Window window;
        Window window2;
        WindowManager.LayoutParams attributes;
        Object value;
        byte b = this.f4147a;
        GamesActionsFragmentResultModel.PreviewActionGamesUnderMaintenance previewActionGamesUnderMaintenance = GamesActionsFragmentResultModel.PreviewActionGamesUnderMaintenance.f46723a;
        wx70 wx70Var = wx70.f39918a;
        byte b2 = 10;
        byte b3 = 3;
        boolean z = false;
        boolean z2 = true;
        yje yjeVar = null;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                rrd rrdVar = (rrd) obj2;
                Throwable th = (Throwable) obj;
                th.getClass();
                if ((th instanceof zhi0) && ((zhi0) th).c == i2o.IncorrectDataError) {
                    ((r4v) rrdVar.e).f29856a.i();
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                rrd rrdVar2 = (rrd) obj2;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                if ((th2 instanceof zhi0) && ((zhi0) th2).c == i2o.IncorrectDataError) {
                    ((x4v) rrdVar2.e).f40286a.j();
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                ((lwk) obj).getClass();
                return new ty2((ufk0) obj2, (byte) 15);
            case 3:
                of60 of60Var = (of60) obj2;
                evz evzVar = of60.i2;
                ((Throwable) obj).getClass();
                of60Var.F().t0(i120.V(new Pair("ERROR_SOCIAL", of60Var.H(R.string.something_went_wrong))), "ERROR_SOCIAL");
                of60Var.y0();
                return Unit.f46060a;
            case 4:
                iqt0 iqt0Var = (iqt0) obj;
                iiy[] iiyVarArr = oj60.P1;
                iqt0Var.getClass();
                ((oj60) obj2).G0().l.a(iqt0Var);
                return Unit.f46060a;
            case 5:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.f40887a.setOnClickListener(new bs50((jw50) obj2, cpVar, b3));
                cpVar.t(new b1w(cpVar, (byte) 28));
                return Unit.f46060a;
            case 6:
                iiy[] iiyVarArr2 = wn60.O1;
                ((View) obj).getClass();
                yn60 yn60Var = (yn60) ((wn60) obj2).N1.getValue();
                if (yn60Var.d.a()) {
                    sac.V(jiu0.a(yn60Var), xn60.f41159a, null, yn60Var.c.f22085a, new w620((Object) yn60Var, yjeVar, (byte) 29), 10);
                }
                return Unit.f46060a;
            case 7:
                b430 b430Var = (b430) obj2;
                ewa ewaVar = (ewa) obj;
                ewaVar.getClass();
                ctf0 ctf0Var = (ctf0) b430Var.b;
                if (!((Boolean) ((fee) b430Var.e.getValue()).c()).booleanValue()) {
                    return new yva(ctf0Var.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                }
                String str = ewaVar.f8512a;
                String str2 = ewaVar.b;
                String str3 = ewaVar.c;
                kg kgVar = (kg) ((fee) b430Var.d.getValue()).c();
                kgVar.getClass();
                int iOrdinal = kgVar.ordinal();
                if (iOrdinal == 0) {
                    ijlVar = ijl.f14880a;
                } else if (iOrdinal == 1) {
                    ijlVar = ijl.b;
                } else if (iOrdinal == 2) {
                    ijlVar = ijl.c;
                } else if (iOrdinal == 3) {
                    ijlVar = ijl.d;
                } else {
                    if (iOrdinal != 4) {
                        t9f.b();
                        return null;
                    }
                    ijlVar = ijl.e;
                }
                return new xva(str, str2, str3, ijlVar, ctf0Var.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)));
            case 8:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                cpVar2.t(new xg(cpVar2, obj2, cpVar2, b2));
                return Unit.f46060a;
            case 9:
                ly60 ly60Var = (ly60) obj;
                iiy[] iiyVarArr3 = py60.P1;
                ly60Var.getClass();
                ((k3t0) ((py60) obj2).O1.getValue()).x(ly60Var);
                return Unit.f46060a;
            case 10:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((vy60) obj2).u.b(th3, new cr60((byte) 12));
                return Unit.f46060a;
            case 11:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((uw50) obj2).b.b(th4, new cr60((byte) 13));
                return Unit.f46060a;
            case 12:
                p170 p170Var = (p170) obj2;
                GamesActionsFragmentResultModel gamesActionsFragmentResultModel = (GamesActionsFragmentResultModel) obj;
                xuz xuzVar = p170.Q1;
                gamesActionsFragmentResultModel.getClass();
                phf0 phf0Var = p170Var.P1;
                iiy[] iiyVarArr4 = p170.R1;
                if (phf0Var.n(p170Var, iiyVarArr4[1]).length() > 0) {
                    o2t.c(p170Var.F(), gamesActionsFragmentResultModel, phf0Var.n(p170Var, iiyVarArr4[1]));
                }
                if (gamesActionsFragmentResultModel instanceof GamesActionsFragmentResultModel.OneXGamesGameUnderMaintenance) {
                    p170Var.G0().x(new t070(((GamesActionsFragmentResultModel.OneXGamesGameUnderMaintenance) gamesActionsFragmentResultModel).f46721a));
                } else if (gamesActionsFragmentResultModel.equals(previewActionGamesUnderMaintenance)) {
                    p170Var.G0().x(u070.f34843a);
                }
                return Unit.f46060a;
            case 13:
                y370 y370Var = (y370) obj2;
                k0w0 k0w0Var = (k0w0) obj;
                wsz wszVar = y370.Y1;
                k0w0Var.getClass();
                iiy[] iiyVarArr5 = y370.Z1;
                int iOrdinal2 = ((r270) y370Var.V1.getValue()).ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        if (y370Var.N1 == null) {
                            Intrinsics.h("appScreensProvider");
                            throw null;
                        }
                        final int iIntValue = y370Var.U1.n(y370Var, iiyVarArr5[4]).intValue();
                        fragmentScreen = new FragmentScreen(iIntValue) { // from class: org.xplatform.games_section.impl.navigation.GamesSectionScreens$OneXGamesPromoScreen

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final int f46737a;

                            {
                                this.f46737a = iIntValue;
                            }

                            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                            public final Fragment a(m1r m1rVar) {
                                m1rVar.getClass();
                                p170.Q1.getClass();
                                p170 p170Var2 = new p170();
                                Pair pair = new Pair("OneXGamesPromo.BUNDLE_SCREEN_NAME", p170.class.getSimpleName());
                                d270.b.getClass();
                                p170Var2.s0(i120.V(pair, new Pair("OPEN_PROMO_KEY", evz.c(this.f46737a)), new Pair("OneXGamesPromo.BUNDLE_UM_RESULT_KEY", "OneXGamesTabContainerFragment.UM_RESULT_KEY")));
                                return p170Var2;
                            }

                            @Override // a.m7h0
                            /* JADX INFO: renamed from: b */
                            public final String getF45455a() {
                                return ufx.C(this);
                            }

                            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                            /* JADX INFO: renamed from: g */
                            public final /* bridge */ boolean getB() {
                                return true;
                            }
                        };
                    } else if (iOrdinal2 == 2) {
                        uf3 uf3Var = y370Var.N1;
                        if (uf3Var == null) {
                            Intrinsics.h("appScreensProvider");
                            throw null;
                        }
                        r9u r9uVar = uf3Var.f35560a.b;
                        ygp ygpVar = ygp.y1;
                        r9uVar.getClass();
                        j1q0 j1q0Var = r9uVar.f30104a;
                        j1q0Var.getClass();
                        boolean zD = j1q0Var.f15748a.d(ygpVar);
                        final String str4 = "OneXGamesTabContainerFragment.UM_RESULT_KEY";
                        oneXGamesScreens$OneXGamesFavoritesScreen = zD ? new FragmentScreen(str4) { // from class: org.xplatform.games_section.impl.navigation.GamesSectionScreens$OneXGamesCashbackFragmentScreen

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final String f46734a;

                            {
                                this.f46734a = str4;
                            }

                            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                            public final Fragment a(m1r m1rVar) {
                                m1rVar.getClass();
                                xt60.V1.getClass();
                                xt60 xt60Var = new xt60();
                                xt60Var.K1.x(xt60Var, xt60.W1[0], this.f46734a);
                                return xt60Var;
                            }

                            @Override // a.m7h0
                            /* JADX INFO: renamed from: b */
                            public final String getF45455a() {
                                return ufx.C(this);
                            }

                            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                            /* JADX INFO: renamed from: g */
                            public final /* bridge */ boolean getB() {
                                return true;
                            }
                        } : new FragmentScreen(str4) { // from class: org.xplatform.games_section.impl.navigation.GamesSectionScreens$OneXGamesCashbackFragmentScreenOld

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final String f46735a;

                            {
                                this.f46735a = str4;
                            }

                            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                            public final Fragment a(m1r m1rVar) {
                                m1rVar.getClass();
                                cu60.U1.getClass();
                                cu60 cu60Var = new cu60();
                                cu60Var.K1.x(cu60Var, cu60.V1[0], this.f46735a);
                                return cu60Var;
                            }

                            @Override // a.m7h0
                            /* JADX INFO: renamed from: b */
                            public final String getF45455a() {
                                return ufx.C(this);
                            }

                            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                            /* JADX INFO: renamed from: g */
                            public final /* bridge */ boolean getB() {
                                return true;
                            }
                        };
                    } else {
                        if (iOrdinal2 != 3) {
                            t9f.b();
                            return null;
                        }
                        oneXGamesScreens$OneXGamesFavoritesScreen = new OneXGamesScreens$OneXGamesFavoritesScreen();
                    }
                    k0w0Var.b(new y0w0(oneXGamesScreens$OneXGamesFavoritesScreen));
                    return Unit.f46060a;
                }
                final long jLongValue = y370Var.S1.n(y370Var, iiyVarArr5[3]).longValue();
                final String strN = y370Var.Q1.n(y370Var, iiyVarArr5[1]);
                fragmentScreen = new FragmentScreen(jLongValue, strN) { // from class: org.xplatform.games_list.features.common.OneXGamesScreens$OneXGamesAllGamesScreen

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final long f46714a;
                    public final String b;

                    {
                        strN.getClass();
                        this.f46714a = jLongValue;
                        this.b = strN;
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        gs60.R1.getClass();
                        String str5 = this.b;
                        str5.getClass();
                        gs60 gs60Var = new gs60();
                        gs60Var.K1.x(gs60Var, gs60.S1[0], "OneXGamesTabContainerFragment.UM_RESULT_KEY");
                        gs60Var.s0(i120.V(new Pair("GAME_ID_TO_OPEN_BUNDLE_KEY", Long.valueOf(this.f46714a)), new Pair("WEB_GAME_SESSION_ID", str5)));
                        return gs60Var;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        return ufx.C(this);
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                };
                oneXGamesScreens$OneXGamesFavoritesScreen = fragmentScreen;
                k0w0Var.b(new y0w0(oneXGamesScreens$OneXGamesFavoritesScreen));
                return Unit.f46060a;
            case 14:
                ca70 ca70Var = (ca70) obj2;
                wb70 wb70Var = (wb70) obj;
                htz htzVar = ca70.U1;
                wb70Var.getClass();
                ?? r15 = 0;
                if (wb70Var instanceof ra70) {
                    ra70 ra70Var = (ra70) wb70Var;
                    mne mneVar = ra70Var.b;
                    tkz tkzVarQ = x0x.Q(ca70Var.u1);
                    vs10 vs10Var = mneVar.c;
                    wmq wmqVar = new wmq((Object) ra70Var, (Object) mneVar, false, (Object) ca70Var, (yje) r15, (byte) 12);
                    ca70Var = ca70Var;
                    sac.V(tkzVarQ, null, null, vs10Var, wmqVar, 11);
                } else if (wb70Var instanceof sa70) {
                    ca70Var.w0(new Intent("android.settings.SETTINGS"));
                } else if (wb70Var instanceof db70) {
                    z7z z7zVar = ca70Var.M1;
                    if (z7zVar == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    Object obj3 = z7zVar.get();
                    obj3.getClass();
                    pek0 pek0Var = pek0.f26859a;
                    String strH = ca70Var.H(R.string.demo_snackbar_description);
                    strH.getClass();
                    wdk0.k((wdk0) obj3, new xdk0(pek0Var, strH, null, lwf.Y, null, null, 116), ca70Var, null, null, false, null, 1020);
                } else if (wb70Var instanceof qa70) {
                    qa70 qa70Var = (qa70) wb70Var;
                    Fragment fragmentJ = ca70Var.C().J("OneXGamesWebGameDisableDemoBottomDialog.TAG");
                    h970 h970Var = fragmentJ instanceof h970 ? (h970) fragmentJ : null;
                    if (h970Var != null) {
                        ((k3t0) h970Var.n2.getValue()).x(new j970(qa70Var.f28382a));
                    }
                } else if (wb70Var instanceof ab70) {
                    ii iiVar = (ii) ca70Var.G0().get();
                    String strH2 = ca70Var.H(R.string.attention);
                    String strH3 = ca70Var.H(R.string.games_demo_bonus_alert);
                    String strH4 = ca70Var.H(R.string.continue_action);
                    strH4.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH2, (CharSequence) strH3, (CharSequence) strH4, ca70Var.H(R.string.cancel), (String) null, "DEMO_BONUS_DIALOG", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC = ca70Var.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else if (wb70Var instanceof bb70) {
                    bb70 bb70Var = (bb70) wb70Var;
                    Fragment fragmentJ2 = ca70Var.C().J("OneXGamesWebGameDisableDemoBottomDialog.TAG");
                    sik sikVar = fragmentJ2 instanceof sik ? (sik) fragmentJ2 : null;
                    if (sikVar == null || sikVar.m) {
                        if (sikVar != null) {
                            sikVar.y0();
                        }
                        atz atzVar = h970.o2;
                        String str5 = bb70Var.f2295a;
                        String str6 = bb70Var.b;
                        boolean z3 = bb70Var.c;
                        atzVar.getClass();
                        h970 h970Var2 = new h970();
                        h970Var2.k2.x(h970Var2, h970.p2[0], "DEMO_DISABLE_DIALOG");
                        Bundle bundle = h970Var2.g;
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putString("OneXGamesWebGame.DISABLE_DEMO_DIALOG_BUNDLE_BALANCE", str5);
                        bundle.putString("OneXGamesWebGame.DISABLE_DEMO_DIALOG_BUNDLE_TOTAL_SUM", str6);
                        bundle.putBoolean("OneXGamesWebGame.DISABLE_DEMO_DIALOG_BUNDLE_EXIT_ENABLE", z3);
                        h970Var2.s0(bundle);
                        androidx.fragment.app.e eVarC2 = ca70Var.C();
                        eVarC2.getClass();
                        sj3.E0(h970Var2, eVarC2, "OneXGamesWebGameDisableDemoBottomDialog.TAG");
                    }
                } else if (wb70Var instanceof cb70) {
                    if (ca70Var.C().J("OneXGamesWebGameUnauthorizedDemoBottomDialog.TAG") == null) {
                        lc70.n2.getClass();
                        lc70 lc70VarI = uuz.i("DEMO_UNAUTHORIZED_DIALOG", true);
                        androidx.fragment.app.e eVarC3 = ca70Var.C();
                        eVarC3.getClass();
                        sj3.E0(lc70VarI, eVarC3, "OneXGamesWebGameUnauthorizedDemoBottomDialog.TAG");
                    }
                } else if (wb70Var instanceof pa70) {
                    Fragment fragmentJ3 = ca70Var.C().J("OneXGamesWebGameDisableDemoBottomDialog.TAG");
                    r15 = fragmentJ3 instanceof sik ? (sik) fragmentJ3 : 0;
                    if (r15 != 0) {
                        r15.y0();
                    }
                } else if (wb70Var instanceof eb70) {
                    ii iiVar2 = (ii) ca70Var.G0().get();
                    String strH5 = ca70Var.H(R.string.attention);
                    String strH6 = ca70Var.H(R.string.demo_replenish_dialog_description);
                    String strH7 = ca70Var.H(R.string.continue_action);
                    strH7.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH5, (CharSequence) strH6, (CharSequence) strH7, ca70Var.H(R.string.cancel), (String) null, "DEMO_REPLENISH_DIALOG", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                    androidx.fragment.app.e eVarC4 = ca70Var.C();
                    eVarC4.getClass();
                    iiVar2.d(dialogFields2, eVarC4);
                } else if (wb70Var instanceof fb70) {
                    if (((fb70) wb70Var).f9243a) {
                        ii iiVar3 = (ii) ca70Var.G0().get();
                        String strH8 = ca70Var.H(R.string.attention);
                        String strH9 = ca70Var.H(R.string.demo_dialog_unavailable_description);
                        String strH10 = ca70Var.H(R.string.demo_dialog_unavailable_exit_button_text);
                        strH10.getClass();
                        DialogFields dialogFields3 = new DialogFields((CharSequence) strH8, (CharSequence) strH9, (CharSequence) strH10, (String) null, (String) null, "DEMO_UNAVAILABLE_DIALOG", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                        androidx.fragment.app.e eVarC5 = ca70Var.C();
                        eVarC5.getClass();
                        iiVar3.d(dialogFields3, eVarC5);
                    } else if (ca70Var.C().J("OneXGamesWebGameUnauthorizedDemoBottomDialog.TAG") == null) {
                        lc70.n2.getClass();
                        lc70 lc70VarI2 = uuz.i("DEMO_UNAVAILABLE_DIALOG", false);
                        androidx.fragment.app.e eVarC6 = ca70Var.C();
                        eVarC6.getClass();
                        sj3.E0(lc70VarI2, eVarC6, "OneXGamesWebGameUnauthorizedDemoBottomDialog.TAG");
                    }
                } else if (wb70Var instanceof za70) {
                    ii iiVar4 = (ii) ca70Var.G0().get();
                    String strH11 = ca70Var.H(R.string.attention);
                    String strH12 = ca70Var.H(R.string.bonus_not_applied_warning_message_web_game);
                    String strH13 = ca70Var.H(R.string.ok_new);
                    strH13.getClass();
                    DialogFields dialogFields4 = new DialogFields((CharSequence) strH11, (CharSequence) strH12, (CharSequence) strH13, (String) null, (String) null, "CHANGE_ACCOUNT_TO_PRIMARY_DIALOG", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC7 = ca70Var.C();
                    eVarC7.getClass();
                    iiVar4.d(dialogFields4, eVarC7);
                } else if (wb70Var instanceof ya70) {
                    ii iiVar5 = (ii) ca70Var.G0().get();
                    String strH14 = ca70Var.H(R.string.attention);
                    String strH15 = ca70Var.H(R.string.bonus_not_applied_bonus_account_warning_message_web_game);
                    String strH16 = ca70Var.H(R.string.ok_new);
                    strH16.getClass();
                    DialogFields dialogFields5 = new DialogFields((CharSequence) strH14, (CharSequence) strH15, (CharSequence) strH16, (String) null, (String) null, "CHANGE_ACCOUNT_TO_PRIMARY_DIALOG", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC8 = ca70Var.C();
                    eVarC8.getClass();
                    iiVar5.d(dialogFields5, eVarC8);
                } else if (wb70Var instanceof xa70) {
                    ii iiVar6 = (ii) ca70Var.G0().get();
                    String strH17 = ca70Var.H(R.string.attention);
                    String strH18 = ca70Var.H(R.string.one_x_games_game_bonus_reset_after_account_change);
                    String strH19 = ca70Var.H(R.string.ok_new);
                    strH19.getClass();
                    DialogFields dialogFields6 = new DialogFields((CharSequence) strH17, (CharSequence) strH18, (CharSequence) strH19, (String) null, (String) null, "CHANGE_ACCOUNT_TO_PRIMARY_DIALOG", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC9 = ca70Var.C();
                    eVarC9.getClass();
                    iiVar6.d(dialogFields6, eVarC9);
                } else if (wb70Var instanceof gb70) {
                    ca70Var.I0(false);
                } else if (wb70Var instanceof jb70) {
                    ii iiVar7 = (ii) ca70Var.G0().get();
                    int i = xgs.f2;
                    String strH20 = ca70Var.H(R.string.unfinished_game_attention);
                    String strH21 = ca70Var.H(R.string.game_is_not_finished_dialog_text);
                    String strH22 = ca70Var.H(R.string.game_is_not_finsihed_btn_continue);
                    strH22.getClass();
                    DialogFields dialogFields7 = new DialogFields((CharSequence) strH20, (CharSequence) strH21, (CharSequence) strH22, ca70Var.H(R.string.game_is_not_finsihed_btn_exit), (String) null, "UNFINISHED_GAME_DIALOG", ca70Var.H(R.string.game_is_not_finsihed_dont_show_again_text), (ActionDialogButtonStyle) null, n12.f22727a, false, 1424);
                    xgs xgsVar = new xgs();
                    xgsVar.R0(dialogFields7);
                    androidx.fragment.app.e eVarC10 = ca70Var.C();
                    eVarC10.getClass();
                    iiVar7.c(xgsVar, eVarC10);
                } else if (wb70Var instanceof va70) {
                    va70 va70Var = (va70) wb70Var;
                    z7z z7zVar2 = ca70Var.N1;
                    if (z7zVar2 == null) {
                        Intrinsics.h("changeBalanceDialogProvider");
                        throw null;
                    }
                    Object obj4 = z7zVar2.get();
                    obj4.getClass();
                    bm5 bm5Var = va70Var.f37072a;
                    boolean z4 = va70Var.b;
                    androidx.fragment.app.e eVarC11 = ca70Var.C();
                    eVarC11.getClass();
                    ynb.b((ynb) obj4, bm5Var, null, eVarC11, z4, "BALANCE_SELECTOR", 206);
                } else if (wb70Var instanceof ua70) {
                    Context contextD = ca70Var.D();
                    if (contextD != null ? sj3.J(contextD) : true) {
                        ca70Var.H0().x(b770.f2091a);
                    }
                    Context contextD2 = ca70Var.D();
                    boolean zJ = contextD2 != null ? sj3.J(contextD2) : true;
                    w970 w970Var = new w970(ca70Var, b2);
                    w970 w970Var2 = new w970(ca70Var, (byte) 11);
                    Object obj5 = ca70Var.G0().get();
                    obj5.getClass();
                    kpb.w0(ca70Var, zJ, w970Var, w970Var2, (ii) obj5);
                } else if (wb70Var instanceof hb70) {
                    ii iiVar8 = (ii) ca70Var.G0().get();
                    String strH23 = ca70Var.H(R.string.attention);
                    String strH24 = ca70Var.H(R.string.selected_balance_unavailable_description);
                    String strH25 = ca70Var.H(R.string.ok);
                    strH25.getClass();
                    DialogFields dialogFields8 = new DialogFields((CharSequence) strH23, (CharSequence) strH24, (CharSequence) strH25, (String) null, (String) null, "SECTION_BALANCE_EXPIRED_DIALOG", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC12 = ca70Var.C();
                    eVarC12.getClass();
                    iiVar8.d(dialogFields8, eVarC12);
                } else if (wb70Var instanceof wa70) {
                    ii iiVar9 = (ii) ca70Var.G0().get();
                    String strH26 = ca70Var.H(R.string.attention);
                    String strH27 = ca70Var.H(R.string.game_not_allowed_from_bonus_account_warning_message_web_game);
                    String strH28 = ca70Var.H(R.string.ok_new);
                    strH28.getClass();
                    DialogFields dialogFields9 = new DialogFields((CharSequence) strH26, (CharSequence) strH27, (CharSequence) strH28, (String) null, (String) null, "BONUS_BALANCE_UNAVAILABLE_DIALOG", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC13 = ca70Var.C();
                    eVarC13.getClass();
                    iiVar9.d(dialogFields9, eVarC13);
                } else if (wb70Var instanceof ib70) {
                    ii iiVar10 = (ii) ca70Var.G0().get();
                    String strH29 = ca70Var.H(R.string.attention);
                    String strH30 = ca70Var.H(R.string.unacceptable_bonus_account_for_web_game);
                    String strH31 = ca70Var.H(R.string.ok);
                    strH31.getClass();
                    DialogFields dialogFields10 = new DialogFields((CharSequence) strH29, (CharSequence) strH30, (CharSequence) strH31, (String) null, (String) null, "SPORT_BONUS_BALANCE_UNAVAILABLE_DIALOG", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC14 = ca70Var.C();
                    eVarC14.getClass();
                    iiVar10.d(dialogFields10, eVarC14);
                } else if (wb70Var instanceof kb70) {
                    z7z z7zVar3 = ca70Var.M1;
                    if (z7zVar3 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    Object obj6 = z7zVar3.get();
                    obj6.getClass();
                    rek0 rek0Var = rek0.b;
                    String strI = ca70Var.I(R.string.error_not_installed_v2, "WebView");
                    strI.getClass();
                    wdk0.k((wdk0) obj6, new xdk0(rek0Var, strI, null, null, null, null, 124), ca70Var, null, null, false, null, 1020);
                } else if (wb70Var instanceof ta70) {
                    csr csrVar = ((ta70) wb70Var).f33602a;
                    Bundle bundle2 = new Bundle();
                    bundle2.putSerializable("OneXGames.BONUS_NOT_USED_RESULT_DATA_KEY", csrVar);
                    vcc.f0(bundle2, ca70Var, "OneXGames.BONUS_NOT_USED_RESULT_KEY");
                } else if (wb70Var instanceof vb70) {
                    vb70 vb70Var = (vb70) wb70Var;
                    if (vb70Var instanceof qb70) {
                        c5v0 c5v0Var = ((qb70) vb70Var).f28434a;
                        if (c5v0Var != null && (webView5 = c5v0Var.d) != null) {
                            webView5.clearCache(true);
                        }
                    } else if (vb70Var instanceof rb70) {
                        c5v0 c5v0Var2 = ((rb70) vb70Var).f30170a;
                        if (c5v0Var2 != null && (webView4 = c5v0Var2.d) != null) {
                            webView4.clearHistory();
                        }
                    } else if (vb70Var instanceof sb70) {
                        sb70 sb70Var = (sb70) vb70Var;
                        String str7 = sb70Var.b;
                        Log.i("OneXGamesWebGame js:", ntm0.c(str7));
                        c5v0 c5v0Var3 = sb70Var.f31918a;
                        if (c5v0Var3 != null && (webView3 = c5v0Var3.d) != null) {
                            webView3.evaluateJavascript(str7, null);
                        }
                    } else if (vb70Var instanceof tb70) {
                        tb70 tb70Var = (tb70) vb70Var;
                        c5v0 c5v0Var4 = tb70Var.f33649a;
                        if (c5v0Var4 != null && (webView2 = c5v0Var4.d) != null) {
                            webView2.loadUrl(tb70Var.b, tb70Var.c);
                        }
                    } else {
                        if (!(vb70Var instanceof ub70)) {
                            t9f.b();
                            return null;
                        }
                        c5v0 c5v0Var5 = ((ub70) vb70Var).f35367a;
                        if (c5v0Var5 != null && (webView = c5v0Var5.d) != null) {
                            webView.stopLoading();
                            webView.loadUrl("about:blank");
                        }
                    }
                } else {
                    if (!(wb70Var instanceof pb70)) {
                        t9f.b();
                        return null;
                    }
                    pb70 pb70Var = (pb70) wb70Var;
                    if (pb70Var instanceof ob70) {
                        ii iiVar11 = (ii) ca70Var.G0().get();
                        String strH32 = ca70Var.H(R.string.technical_works);
                        String strH33 = ca70Var.H(R.string.game_technical_works);
                        String strH34 = ca70Var.H(R.string.continue_action);
                        strH34.getClass();
                        DialogFields dialogFields11 = new DialogFields((CharSequence) strH32, (CharSequence) strH33, (CharSequence) strH34, (String) null, (String) null, "TECHNICAL_WORKS_DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                        androidx.fragment.app.e eVarC15 = ca70Var.C();
                        eVarC15.getClass();
                        iiVar11.d(dialogFields11, eVarC15);
                    } else if (pb70Var instanceof mb70) {
                        o2t.b(ca70Var.F(), ((mb70) pb70Var).f21494a, "");
                    } else if (pb70Var instanceof lb70) {
                        o2t.c(ca70Var.F(), GamesActionsFragmentResultModel.PreviewActionBonusGamesUnderMaintenance.f46722a, "");
                    } else {
                        if (!(pb70Var instanceof nb70)) {
                            t9f.b();
                            return null;
                        }
                        o2t.c(ca70Var.F(), previewActionGamesUnderMaintenance, "");
                    }
                }
                ca70Var.H0().x(n670.f22983a);
                return Unit.f46060a;
            case 15:
                Activity activity = (Activity) obj2;
                ((lwk) obj).getClass();
                int i2 = (activity == null || (window2 = activity.getWindow()) == null || (attributes = window2.getAttributes()) == null) ? 32 : attributes.softInputMode;
                if (activity != null && (window = activity.getWindow()) != null) {
                    window.setSoftInputMode(48);
                }
                return new oa70(activity, i2, (byte) 1);
            case 16:
                WebView webView6 = (WebView) obj2;
                Context context = (Context) obj;
                context.getClass();
                FrameLayout frameLayout = new FrameLayout(context);
                if (webView6 != null) {
                    webView6.setOverScrollMode(2);
                    webView6.setBackgroundColor(fbc.U(y3d.f));
                    frameLayout.addView(webView6);
                }
                return frameLayout;
            case 17:
                oe70 oe70Var = (oe70) obj2;
                Bundle bundle3 = (Bundle) obj;
                iiy[] iiyVarArr6 = oe70.Q1;
                bundle3.getClass();
                if (bundle3.containsKey("RESULT_ON_ITEM_SELECTED_LISTENER_KEY")) {
                    Serializable serializable = bundle3.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY");
                    if (serializable instanceof ql5) {
                        oe70Var.H0().x((ql5) serializable);
                    }
                }
                return Unit.f46060a;
            case 18:
                sf70 sf70Var = (sf70) obj2;
                iiy[] iiyVarArr7 = sf70.M1;
                ((View) obj).getClass();
                sf70Var.H0().x();
                j120.Y(sf70Var);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((to70) obj2).K.b(th5, new yr0(th5, (byte) 17));
                return Unit.f46060a;
            case 20:
                sp70 sp70Var = (sp70) obj2;
                ((k0w0) obj).h(sp70Var.H.c(sp70Var.I.f42064a.a(), sp70Var.g.a(), null));
                return Unit.f46060a;
            case 21:
                OnlineCallService onlineCallService = (OnlineCallService) obj2;
                ht70 ht70Var = (ht70) obj;
                String str8 = OnlineCallService.d;
                ht70Var.getClass();
                if (ht70Var.equals(ht70.f13621a)) {
                    onlineCallService.stopSelf();
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 22:
                ox70 ox70Var = (ox70) obj2;
                a8z a8zVar = ox70Var.k2;
                zx70 zx70Var = (zx70) obj;
                mi70 mi70Var = ox70.n2;
                zx70Var.getClass();
                if (zx70Var instanceof xx70) {
                    kxq kxqVarB = ox70Var.B();
                    if (kxqVarB != null) {
                        wdk0 wdk0Var = (wdk0) ((ymi) a8zVar.getValue()).f42889a.c;
                        x1x.y(wdk0Var);
                        String strH35 = ox70Var.H(R.string.social_telegram);
                        strH35.getClass();
                        n6x.i0(kxqVarB, wdk0Var, strH35, "org.telegram.messenger", ((xx70) zx70Var).f41643a);
                    }
                    ox70Var.y0();
                } else if (zx70Var.equals(wx70Var)) {
                    ox70Var.y0();
                } else {
                    if (!(zx70Var instanceof yx70)) {
                        t9f.b();
                        return null;
                    }
                    wdk0 wdk0Var2 = (wdk0) ((ymi) a8zVar.getValue()).f42889a.c;
                    x1x.y(wdk0Var2);
                    wdk0.k(wdk0Var2, new xdk0(rek0.b, ((yx70) zx70Var).f43407a, null, null, null, null, 124), ox70Var, null, null, false, null, 1020);
                }
                ox70Var.P0().x(qx70.f29468a);
                return Unit.f46060a;
            case 23:
                cy70 cy70Var = (cy70) obj2;
                ((Throwable) obj).getClass();
                p7m0 p7m0Var = cy70Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    cy70Var.f.getClass();
                } while (!p7m0Var.m(value, ay70.a((ay70) value, false)));
                cy70Var.G(new yx70(cy70Var.o.b.a(R.string.error_something_went_wrong, Arrays.copyOf(new Object[0], 0))));
                cy70Var.G(wx70Var);
                return Unit.f46060a;
            case 24:
                xi70 xi70Var = z880.U1;
                ((View) obj).getClass();
                aa80 aa80VarH0 = ((z880) obj2).H0();
                tkt0 tkt0Var = aa80VarH0.r;
                p7m0 p7m0Var2 = aa80VarH0.z;
                List<bt9> list = ((d980) p7m0Var2.getValue()).e.f2196a;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (bt9 bt9Var : list) {
                    bt9Var.getClass();
                    arrayList.add(new jq90(bt9Var.f3171a, bt9Var.b));
                }
                tkt0Var.getClass();
                tkt0Var.f34114a.k(arrayList);
                p7m0 p7m0Var3 = aa80VarH0.A;
                bt9 bt9Var2 = ((d980) p7m0Var2.getValue()).e.b;
                if (bt9Var2 != null) {
                    v880 v880Var = new v880(new PickerParams.Language(Integer.valueOf(bt9Var2.f3171a)));
                    p7m0Var3.getClass();
                    p7m0Var3.o(null, v880Var);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                f240 f240Var = (f240) obj;
                nh70 nh70Var = kc80.O1;
                f240Var.getClass();
                ((fho0) ((kc80) obj2).M1.getValue()).F(f240Var);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hcz.e(hczVar, null, null, new ugd(-1966386684, true, new uc80((mdm) obj2, z2 ? 1 : 0)), 3);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                f240 f240Var2 = (f240) obj;
                mi70 mi70Var2 = xc80.O1;
                f240Var2.getClass();
                ((rio0) ((xc80) obj2).M1.getValue()).E(f240Var2);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                float fFloatValue = ((Float) obj).floatValue();
                xk80 xk80Var = ((cl80) obj2).b;
                xk80Var.q.m(xk80Var.j(xk80Var.k() + si30.b(xk80Var.p() != 0 ? fFloatValue / xk80Var.p() : 0.0f)));
                return Unit.f46060a;
            default:
                h7d h7dVar = (h7d) obj;
                h7dVar.getClass();
                ((t3w) obj2).F(h7dVar.c);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ cd60(Object obj, byte b) {
        this.f4147a = b;
        this.b = obj;
    }
}

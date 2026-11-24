package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetAlertModel;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetInfoItem;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetStringModel;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes3.dex */
public final class do6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ fo6 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ do6(fo6 fo6Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = fo6Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        fo6 fo6Var = this.k;
        switch (b) {
            case 0:
                do6 do6Var = new do6(fo6Var, yjeVar, (byte) 0);
                do6Var.j = obj;
                return do6Var;
            case 1:
                do6 do6Var2 = new do6(fo6Var, yjeVar, (byte) 1);
                do6Var2.j = obj;
                return do6Var2;
            case 2:
                do6 do6Var3 = new do6(fo6Var, yjeVar, (byte) 2);
                do6Var3.j = obj;
                return do6Var3;
            default:
                do6 do6Var4 = new do6(fo6Var, yjeVar, (byte) 3);
                do6Var4.j = obj;
                return do6Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((do6) create((zv7) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((do6) create((xn20) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((do6) create((dv7) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((do6) create((plt0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        xhe0 xhe0VarO;
        View view;
        byte b = this.i;
        fo6 fo6Var = this.k;
        int i = 0;
        switch (b) {
            case 0:
                zv7 zv7Var = (zv7) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (zv7Var != null) {
                    if (zv7Var instanceof uv7) {
                        kj5 kj5Var = fo6.W1;
                        fo6Var.I0(false);
                        ra10 ra10Var = ((uv7) zv7Var).f36334a;
                        LottieView lottieView = fo6Var.G0().d;
                        lottieView.v(ra10Var);
                        lottieView.setVisibility(0);
                        fo6Var.G0().c.setVisibility(8);
                    } else if (zv7Var instanceof vv7) {
                        kj5 kj5Var2 = fo6.W1;
                        fo6Var.I0(false);
                        ra10 ra10Var2 = ((vv7) zv7Var).f38086a;
                        LottieView lottieView2 = fo6Var.G0().d;
                        lottieView2.v(ra10Var2);
                        lottieView2.setVisibility(0);
                        fo6Var.G0().c.setVisibility(8);
                    } else if (zv7Var instanceof xv7) {
                        boolean z = ((xv7) zv7Var).f41544a;
                        kj5 kj5Var3 = fo6.W1;
                        fo6Var.I0(z);
                    } else if (zv7Var instanceof yv7) {
                        kj5 kj5Var4 = fo6.W1;
                        fo6Var.G0().c.setVisibility(0);
                        fo6Var.I0(false);
                        xv6 xv6Var = (xv6) fo6Var.V1.getValue();
                        yv7 yv7Var = (yv7) zv7Var;
                        boolean z2 = yv7Var.b;
                        xv6Var.A(yv7Var.f43307a);
                        fo6Var.G0().h.setVisibility(z2 ? 0 : 8);
                        if (z2) {
                            fo6Var.G0().f.setVisibility(0);
                            pkd.i(fo6Var.G0().f, null, new ugd(-404006573, true, new bo6(fo6Var, (byte) 0)));
                        } else {
                            fo6Var.G0().f.setVisibility(8);
                            fo6Var.G0().f.e();
                        }
                    }
                }
                return Unit.f46060a;
            case 1:
                xn20 xn20Var = (xn20) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (xn20Var instanceof wn20) {
                    kj5 kj5Var5 = fo6.W1;
                    gnm0.i(fo6Var.C());
                    wn20 wn20Var = (wn20) xn20Var;
                    lgn0 lgn0Var = fo6Var.Q1;
                    if (lgn0Var == null) {
                        Intrinsics.h("successBetAlertManager");
                        throw null;
                    }
                    String strH = fo6Var.H(R.string.bet_processed_successfully);
                    strH.getClass();
                    SuccessBetStringModel successBetStringModel = new SuccessBetStringModel(strH, null, null, null);
                    String strH2 = fo6Var.H(R.string.alternative_sport);
                    String str = wn20Var.f39428a;
                    lc00 lc00VarB = kotlin.collections.a.b();
                    String strH3 = fo6Var.H(R.string.coefficient);
                    strH3.getClass();
                    lc00VarB.add(new SuccessBetInfoItem.Simple(strH3, wn20Var.d));
                    String strH4 = fo6Var.H(R.string.bet_sum);
                    strH4.getClass();
                    pn40 pn40Var = pn40.f27267a;
                    lc00VarB.add(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitTextPrimary, fo6Var.o0()), strH4, pn40.c(wn20Var.c, p3u0.c), wn20Var.f, true));
                    if (!wn20Var.g) {
                        String strH5 = fo6Var.H(R.string.history_possible_win);
                        strH5.getClass();
                        lc00VarB.add(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitCommerce, fo6Var.o0()), StringsKt.v0(kotlin.text.c.r(strH5, Separators.COLON, "", false)).toString(), pn40.o(wn20Var.e), wn20Var.f, false));
                    }
                    lgn0Var.c(successBetStringModel, new SuccessBetAlertModel(strH2, str, "REQUEST_SUCCESS_BET_KEY", Long.valueOf(wn20Var.b), "SIMPLE", kotlin.collections.a.a(lc00VarB)), fo6Var);
                    p7m0 p7m0Var = fo6Var.H0().S;
                    p7m0Var.getClass();
                    p7m0Var.o(null, vn20.f37696a);
                }
                return Unit.f46060a;
            case 2:
                rek0 rek0Var = rek0.b;
                dv7 dv7Var = (dv7) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (dv7Var != null) {
                    boolean z3 = dv7Var instanceof vu7;
                    fo6 fo6Var2 = this.k;
                    if (z3) {
                        String str2 = ((vu7) dv7Var).f38035a;
                        kj5 kj5Var6 = fo6.W1;
                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(fo6Var2.D(), R.anim.shake);
                        List list = ((xv6) fo6Var2.V1.getValue()).e.f;
                        list.getClass();
                        for (Object obj2 : list) {
                            int i2 = i + 1;
                            if (i < 0) {
                                q3d.p();
                                throw null;
                            }
                            if ((((p6t0) obj2) instanceof wnp0) && (xhe0VarO = fo6Var2.G0().g.O(i)) != null && (view = xhe0VarO.f40887a) != null) {
                                view.startAnimation(animationLoadAnimation);
                            }
                            i = i2;
                        }
                        wdk0 wdk0Var = fo6Var2.S1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        wdk0.k(wdk0Var, new xdk0(rek0Var, str2, null, null, null, null, 124), fo6Var2, null, null, false, null, 1020);
                    } else if (dv7Var instanceof wu7) {
                        String str3 = ((wu7) dv7Var).f39776a;
                        kj5 kj5Var7 = fo6.W1;
                        if (fo6Var2.S()) {
                            ii iiVar = fo6Var2.L1;
                            if (iiVar == null) {
                                Intrinsics.h("actionDialogManager");
                                throw null;
                            }
                            String strH6 = fo6Var2.H(R.string.error);
                            String strH7 = fo6Var2.H(R.string.replenish);
                            strH7.getClass();
                            DialogFields dialogFields = new DialogFields((CharSequence) strH6, (CharSequence) str3, (CharSequence) strH7, fo6Var2.H(R.string.cancel), (String) null, "REQUEST_BALANCE_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                            androidx.fragment.app.e eVarC = fo6Var2.C();
                            eVarC.getClass();
                            iiVar.d(dialogFields, eVarC);
                        }
                    } else if (dv7Var instanceof xu7) {
                        xu7 xu7Var = (xu7) dv7Var;
                        String str4 = xu7Var.f41496a;
                        String str5 = xu7Var.b;
                        kj5 kj5Var8 = fo6.W1;
                        if (fo6Var2.S()) {
                            ii iiVar2 = fo6Var2.L1;
                            if (iiVar2 == null) {
                                Intrinsics.h("actionDialogManager");
                                throw null;
                            }
                            String strH8 = fo6Var2.H(R.string.ok_new);
                            strH8.getClass();
                            DialogFields dialogFields2 = new DialogFields((CharSequence) str4, (CharSequence) str5, (CharSequence) strH8, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                            androidx.fragment.app.e eVarC2 = fo6Var2.C();
                            eVarC2.getClass();
                            iiVar2.d(dialogFields2, eVarC2);
                        }
                    } else if (dv7Var instanceof yu7) {
                        boolean z4 = ((yu7) dv7Var).f43254a;
                        kj5 kj5Var9 = fo6.W1;
                        if (z4) {
                            gnm0.s(fo6Var2.C());
                        } else {
                            gnm0.i(fo6Var2.C());
                        }
                    } else if (dv7Var instanceof zu7) {
                        zu7 zu7Var = (zu7) dv7Var;
                        boolean z5 = zu7Var.f44995a;
                        boolean z6 = zu7Var.b;
                        kj5 kj5Var10 = fo6.W1;
                        if (z5) {
                            is6 is6Var = new is6();
                            androidx.fragment.app.e eVarC3 = fo6Var2.C();
                            eVarC3.getClass();
                            sj3.D0(is6Var, eVarC3);
                        } else {
                            zp6.m2.getClass();
                            zp6 zp6Var = new zp6();
                            zp6Var.k2.v(zp6Var, zp6.n2[1], z6);
                            androidx.fragment.app.e eVarC4 = fo6Var2.C();
                            eVarC4.getClass();
                            sj3.D0(zp6Var, eVarC4);
                        }
                    } else if (dv7Var instanceof av7) {
                        kj5 kj5Var11 = fo6.W1;
                        kxq kxqVarB = fo6Var2.B();
                        if (kxqVarB != null) {
                            v1r v1rVarR = kxqVarB.r();
                            if (fo6Var2.R1 == null) {
                                Intrinsics.h("quickBetDialogNavigator");
                                throw null;
                            }
                            xi70.h(v1rVarR);
                        }
                    } else if (dv7Var instanceof bv7) {
                        kj5 kj5Var12 = fo6.W1;
                        wdk0 wdk0Var2 = fo6Var2.S1;
                        if (wdk0Var2 == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        qek0 qek0Var = qek0.f28589a;
                        String strH9 = fo6Var2.H(R.string.one_click_bet_disabled_message);
                        strH9.getClass();
                        wdk0.k(wdk0Var2, new xdk0(qek0Var, strH9, null, null, null, null, 124), fo6Var2, null, null, false, null, 1020);
                    } else if (dv7Var instanceof uu7) {
                        String str6 = ((uu7) dv7Var).f36286a;
                        kj5 kj5Var13 = fo6.W1;
                        if (fo6Var2.S()) {
                            ii iiVar3 = fo6Var2.L1;
                            if (iiVar3 == null) {
                                Intrinsics.h("actionDialogManager");
                                throw null;
                            }
                            String strH10 = fo6Var2.H(R.string.error);
                            String strH11 = fo6Var2.H(R.string.ok_new);
                            strH11.getClass();
                            DialogFields dialogFields3 = new DialogFields((CharSequence) strH10, (CharSequence) str6, (CharSequence) strH11, fo6Var2.H(R.string.cancel), (String) null, "REQUEST_BET_EXISTS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                            androidx.fragment.app.e eVarC5 = fo6Var2.C();
                            eVarC5.getClass();
                            iiVar3.d(dialogFields3, eVarC5);
                        }
                    } else if (dv7Var instanceof cv7) {
                        wdk0 wdk0Var3 = fo6Var2.S1;
                        if (wdk0Var3 == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        wdk0.k(wdk0Var3, new xdk0(rek0Var, ((cv7) dv7Var).f5017a, null, null, null, null, 124), fo6Var2, null, null, false, null, 1020);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                plt0 plt0Var = (plt0) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                if (plt0Var instanceof olt0) {
                    Context contextO0 = fo6Var.o0();
                    il60 il60Var = ((olt0) plt0Var).f25475a;
                    Drawable drawableU = epv0.U(il60Var.f14961a, contextO0);
                    vcc.c0(drawableU, fo6Var.o0(), il60Var.b);
                    fo6Var.G0().c.setImageDrawable(drawableU);
                }
                return Unit.f46060a;
        }
    }
}

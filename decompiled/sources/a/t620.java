package a;

import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.make_bet.impl.presentation.model.BetDetailsUiModel;
import org.xplatform.make_bet.impl.presentation.model.CoefUiModel;
import org.xplatform.ui_core.AnimatedCoefficientView;

/* JADX INFO: loaded from: classes5.dex */
public final class t620 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ a720 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t620(a720 a720Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = a720Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        a720 a720Var = this.k;
        switch (b) {
            case 0:
                t620 t620Var = new t620(a720Var, yjeVar, (byte) 0);
                t620Var.j = obj;
                return t620Var;
            case 1:
                t620 t620Var2 = new t620(a720Var, yjeVar, (byte) 1);
                t620Var2.j = obj;
                return t620Var2;
            case 2:
                t620 t620Var3 = new t620(a720Var, yjeVar, (byte) 2);
                t620Var3.j = obj;
                return t620Var3;
            case 3:
                t620 t620Var4 = new t620(a720Var, yjeVar, (byte) 3);
                t620Var4.j = obj;
                return t620Var4;
            case 4:
                t620 t620Var5 = new t620(a720Var, yjeVar, (byte) 4);
                t620Var5.j = obj;
                return t620Var5;
            case 5:
                t620 t620Var6 = new t620(a720Var, yjeVar, (byte) 5);
                t620Var6.j = obj;
                return t620Var6;
            case 6:
                t620 t620Var7 = new t620(a720Var, yjeVar, (byte) 6);
                t620Var7.j = obj;
                return t620Var7;
            case 7:
                t620 t620Var8 = new t620(a720Var, yjeVar, (byte) 7);
                t620Var8.j = obj;
                return t620Var8;
            default:
                t620 t620Var9 = new t620(a720Var, yjeVar, (byte) 8);
                t620Var9.j = obj;
                return t620Var9;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((t620) create((aud) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((t620) create((ji20) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((t620) create((go4) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((t620) create((BetDetailsUiModel) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((t620) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((t620) create((CoefUiModel) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((t620) create((ui20) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((t620) create((xi20) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((t620) create((yi20) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        View viewN0;
        byte b = this.i;
        byte b2 = 1;
        byte b3 = 0;
        a720 a720Var = this.k;
        switch (b) {
            case 0:
                aud audVar = (aud) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                a720 a720Var2 = this.k;
                ndk0 ndk0Var = a720Var2.p2;
                if (ndk0Var != null) {
                    ndk0Var.dismiss();
                }
                vq vqVar = a720Var2.i2;
                if (vqVar == null) {
                    Intrinsics.h("addEventToCouponDelegate");
                    throw null;
                }
                yq yqVarA = vqVar.a(a720Var2, audVar, a720Var2.Q0().r, new q620(a720Var2, (byte) 3), new q620(a720Var2, (byte) 4), ctc.c, false, a720Var2.W0(), a720Var2.X0().z, String.valueOf(a720Var2.X0().Y));
                if (yqVarA instanceof xq) {
                    a720Var2.p2 = new mdk0(((xq) yqVarA).f41290a);
                }
                return Unit.f46060a;
            case 1:
                ji20 ji20Var = (ji20) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                xuz xuzVar = a720.x2;
                View viewO0 = a720Var.O0();
                nnm nnmVar = viewO0 instanceof nnm ? (nnm) viewO0 : null;
                if (Intrinsics.d(ji20Var, hi20.f13094a)) {
                    if (nnmVar != null) {
                        nnmVar.setEndState(false);
                    }
                } else {
                    if (!Intrinsics.d(ji20Var, ii20.f14809a)) {
                        t9f.b();
                        return null;
                    }
                    if (nnmVar != null) {
                        nnmVar.setEndState(true);
                    }
                }
                return Unit.f46060a;
            case 2:
                go4 go4Var = (go4) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(go4Var, do4.f6399a)) {
                    a720Var.Q0().j.setVisibility(8);
                    a720Var.Q0().i.setVisibility(0);
                } else if (Intrinsics.d(go4Var, fo4.f9863a)) {
                    a720Var.Q0().j.setVisibility(0);
                    a720Var.Q0().i.setVisibility(8);
                } else {
                    if (!Intrinsics.d(go4Var, eo4.f8123a)) {
                        t9f.b();
                        return null;
                    }
                    a720Var.Q0().j.setVisibility(8);
                    a720Var.Q0().i.setVisibility(8);
                }
                return Unit.f46060a;
            case 3:
                BetDetailsUiModel betDetailsUiModel = (BetDetailsUiModel) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                a720Var.Q0().t.setText(betDetailsUiModel.f46770a);
                a720Var.Q0().w.setText(betDetailsUiModel.b);
                a720Var.Q0().v.setText(betDetailsUiModel.c);
                a720Var.Q0().l.setVisibility(betDetailsUiModel.e ? 0 : 8);
                if (betDetailsUiModel.d) {
                    jmu0.l(a720Var.G().getDimensionPixelSize(R.dimen.space_24), 0, 13, a720Var.Q0().b);
                } else {
                    String strH = a720Var.H(R.string.bet_add_to_monitoring);
                    strH.getClass();
                    String strH2 = a720Var.H(R.string.bet_stop_monitoring);
                    strH2.getClass();
                    String strH3 = a720Var.H(R.string.bet_add_to_coupon);
                    strH3.getClass();
                    String strH4 = a720Var.H(R.string.bet_remove_from_coupon);
                    strH4.getClass();
                    View viewM0 = a720Var.M0(new ip8(new q00(true, true, strH, strH2, strH3, strH4, R.drawable.ic_glyph_track, R.drawable.ic_glyph_do_not_track, R.drawable.ic_glyph_add_to_bet_slip, R.drawable.ic_glyph_remove_from_bet_slip)));
                    FrameLayout frameLayout = a720Var.P0().b;
                    frameLayout.removeAllViews();
                    frameLayout.addView(viewM0);
                    frameLayout.setVisibility(0);
                    frameLayout.setBackgroundColor(m5d.b(a720Var.b2, a720Var.o0()));
                    byte b4 = 6;
                    stl.L0(a720Var, viewM0, null, 6);
                    if (Build.VERSION.SDK_INT >= 35) {
                        Object parent = a720Var.q0().getParent();
                        viewN0 = parent instanceof View ? (View) parent : null;
                    } else {
                        viewN0 = stl.N0(a720Var.q0());
                    }
                    if (viewN0 != null) {
                        wti wtiVar = new wti(a720Var, viewM0, b4);
                        WeakHashMap weakHashMap = rgu0.f30456a;
                        igu0.c(viewN0, wtiVar);
                    }
                    LinearLayout linearLayout = a720Var.P0().d;
                    linearLayout.setClipToOutline(true);
                    linearLayout.setOutlineProvider(new otl(a720Var, (byte) 0));
                    jmu0.j(a720Var.P0().g, ColorStateList.valueOf(m5d.b(R.attr.uikitStaticWhite20, a720Var.o0())));
                    View viewO1 = a720Var.O0();
                    nnm nnmVar2 = viewO1 instanceof nnm ? (nnm) viewO1 : null;
                    if (nnmVar2 != null) {
                        nnmVar2.setStartClickListener(new l620(a720Var, b3));
                        nnmVar2.setEndClickListener(new l620(a720Var, b2));
                    }
                }
                return Unit.f46060a;
            case 4:
                String str = (String) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                a720Var.Q0().u.setText(str);
                return Unit.f46060a;
            case 5:
                CoefUiModel coefUiModel = (CoefUiModel) this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                boolean z = coefUiModel.i;
                l0d l0dVar = coefUiModel.d;
                String str2 = coefUiModel.c;
                String str3 = coefUiModel.f46772a;
                String str4 = coefUiModel.f;
                a720Var.Q0().g.setVisibility(!z ? 0 : 8);
                a720Var.Q0().n.setVisibility(z ? 0 : 8);
                a720Var.Q0().p.setVisibility(z ? 0 : 8);
                a720Var.Q0().q.setVisibility(!z ? 0 : 8);
                if (!z) {
                    AnimatedCoefficientView animatedCoefficientView = a720Var.Q0().g;
                    if (str2 == null) {
                        str2 = "";
                    }
                    animatedCoefficientView.i(str3, str2, l0dVar);
                } else if (str4 == null || str4.length() <= 0) {
                    x0x.s(a720Var.Q0().n);
                    a720Var.Q0().f.setVisibility(0);
                    a720Var.Q0().h.setVisibility(8);
                } else {
                    x0x.O(a720Var.Q0().n);
                    a720Var.Q0().f.setVisibility(8);
                    a720Var.Q0().h.setVisibility(0);
                    AnimatedCoefficientView animatedCoefficientView2 = a720Var.Q0().m;
                    if (str2 == null) {
                        str2 = "";
                    }
                    animatedCoefficientView2.i(str3, str2, l0dVar);
                    AnimatedCoefficientView animatedCoefficientView3 = a720Var.Q0().o;
                    String str5 = coefUiModel.g;
                    animatedCoefficientView3.i(str4, str5 != null ? str5 : "", coefUiModel.h);
                }
                return Unit.f46060a;
            case 6:
                ui20 ui20Var = (ui20) this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(ui20Var, ti20.f33987a)) {
                    String strH5 = a720Var.H(R.string.event_tracked);
                    strH5.getClass();
                    a720Var.Z0(strH5);
                } else {
                    if (!Intrinsics.d(ui20Var, si20.f32244a)) {
                        t9f.b();
                        return null;
                    }
                    String strH6 = a720Var.H(R.string.event_not_tracked);
                    strH6.getClass();
                    a720Var.Z0(strH6);
                }
                return Unit.f46060a;
            case 7:
                xi20 xi20Var = (xi20) this.j;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                xuz xuzVar2 = a720.x2;
                View viewO2 = a720Var.O0();
                nnm nnmVar3 = viewO2 instanceof nnm ? (nnm) viewO2 : null;
                if (Intrinsics.d(xi20Var, wi20.f39194a)) {
                    if (nnmVar3 != null) {
                        nnmVar3.setStartState(false);
                    }
                } else {
                    if (!Intrinsics.d(xi20Var, vi20.f37457a)) {
                        t9f.b();
                        return null;
                    }
                    if (nnmVar3 != null) {
                        nnmVar3.setStartState(true);
                    }
                }
                return Unit.f46060a;
            default:
                yi20 yi20Var = (yi20) this.j;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                a720 a720Var3 = this.k;
                ndk0 ndk0Var2 = a720Var3.p2;
                if (ndk0Var2 != null) {
                    ndk0Var2.dismiss();
                }
                wdk0 wdk0Var = a720Var3.j2;
                if (wdk0Var != null) {
                    a720Var3.p2 = wdk0.k(wdk0Var, yi20Var.f42666a, a720Var3, null, a720Var3.Q0().r, true, null, 996);
                    return Unit.f46060a;
                }
                Intrinsics.h("snackbarManager");
                throw null;
        }
    }
}

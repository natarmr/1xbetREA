package a;

import android.animation.ObjectAnimator;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.spin_and_win.presentation.views.SpinAndWinButton;
import org.xplatform.spin_and_win.presentation.views.SpinAndWinChoiceView;
import org.xplatform.spin_and_win.presentation.views.SpinAndWinWheelView;

/* JADX INFO: loaded from: classes5.dex */
public final class eyk0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ hyk0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eyk0(hyk0 hyk0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = hyk0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        hyk0 hyk0Var = this.k;
        switch (b) {
            case 0:
                eyk0 eyk0Var = new eyk0(hyk0Var, yjeVar, (byte) 0);
                eyk0Var.j = obj;
                return eyk0Var;
            case 1:
                eyk0 eyk0Var2 = new eyk0(hyk0Var, yjeVar, (byte) 1);
                eyk0Var2.j = obj;
                return eyk0Var2;
            case 2:
                eyk0 eyk0Var3 = new eyk0(hyk0Var, yjeVar, (byte) 2);
                eyk0Var3.j = obj;
                return eyk0Var3;
            case 3:
                eyk0 eyk0Var4 = new eyk0(hyk0Var, yjeVar, (byte) 3);
                eyk0Var4.j = obj;
                return eyk0Var4;
            case 4:
                eyk0 eyk0Var5 = new eyk0(hyk0Var, yjeVar, (byte) 4);
                eyk0Var5.j = obj;
                return eyk0Var5;
            default:
                eyk0 eyk0Var6 = new eyk0(hyk0Var, yjeVar, (byte) 5);
                eyk0Var6.j = obj;
                return eyk0Var6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((eyk0) create((dav0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((eyk0) create((lav0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((eyk0) create((dcs) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((eyk0) create((qc7) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((eyk0) create((pl60) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((eyk0) create((hlu0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        String strD;
        byte b = this.i;
        hyk0 hyk0Var = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                dav0 dav0Var = (dav0) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (dav0Var == null) {
                    t9f.b();
                    return null;
                }
                hyk0Var.R1 = true;
                int i = dav0Var.f5771a;
                int dimensionPixelOffset = hyk0Var.G().getDimensionPixelOffset(R.dimen.space_22);
                int dimensionPixelOffset2 = hyk0Var.G().getDimensionPixelOffset(R.dimen.space_26);
                ViewGroup.LayoutParams layoutParams = hyk0Var.G0().i.getLayoutParams();
                layoutParams.getClass();
                ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(i, dimensionPixelOffset, 0, dimensionPixelOffset2);
                hyk0Var.G0().i.requestLayout();
                return Unit.f46060a;
            case 1:
                lav0 lav0Var = (lav0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (lav0Var != null) {
                    if (lav0Var instanceof jav0) {
                        iiy[] iiyVarArr = hyk0.U1;
                        hyk0Var.G0().i.setVisibility(((jav0) lav0Var).f16210a ? 0 : 8);
                    } else if (lav0Var instanceof kav0) {
                        kav0 kav0Var = (kav0) lav0Var;
                        yxk0 yxk0Var = kav0Var.b;
                        if (kav0Var.f17985a) {
                            iiy[] iiyVarArr2 = hyk0.U1;
                            SpinAndWinWheelView spinAndWinWheelView = hyk0Var.G0().i;
                            yxk0Var.getClass();
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(spinAndWinWheelView.f46983a.c, "rotation", 0.0f, (((Number) CollectionsKt.s0(tlb.U(yxk0Var), f1e0.f8761a)).intValue() * 18.0f) + 2160.0f);
                            objectAnimatorOfFloat.setDuration(9000L);
                            objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
                            objectAnimatorOfFloat.addListener(new r9g(spinAndWinWheelView, (byte) 11));
                            spinAndWinWheelView.b = objectAnimatorOfFloat;
                            objectAnimatorOfFloat.start();
                        } else {
                            iiy[] iiyVarArr3 = hyk0.U1;
                            SpinAndWinWheelView spinAndWinWheelView2 = hyk0Var.G0().i;
                            yxk0Var.getClass();
                            spinAndWinWheelView2.f46983a.c.setRotation(((Number) CollectionsKt.s0(tlb.U(yxk0Var), f1e0.f8761a)).intValue() * 18.0f);
                            spinAndWinWheelView2.invalidate();
                        }
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 2:
                dcs dcsVar = (dcs) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (dcsVar != null) {
                    if (dcsVar instanceof acs) {
                        yxk0 yxk0Var2 = ((acs) dcsVar).f643a;
                        iiy[] iiyVarArr4 = hyk0.U1;
                        SpinAndWinChoiceView spinAndWinChoiceView = hyk0Var.G0().b;
                        yxk0Var2.getClass();
                        yxk0 yxk0Var3 = yxk0.g;
                        ArrayList<SpinAndWinButton> arrayList = spinAndWinChoiceView.c;
                        if (yxk0Var2 == yxk0Var3) {
                            for (SpinAndWinButton spinAndWinButton : arrayList) {
                                spinAndWinButton.b();
                                spinAndWinButton.setDefaultState(false);
                            }
                        } else {
                            for (SpinAndWinButton spinAndWinButton2 : arrayList) {
                                spinAndWinButton2.setDefaultState(true);
                                if (spinAndWinButton2.getType() == yxk0Var2) {
                                    spinAndWinButton2.b();
                                }
                            }
                        }
                    } else if (dcsVar instanceof ccs) {
                        iiy[] iiyVarArr5 = hyk0.U1;
                        hyk0Var.G0().b.setVisibility(((ccs) dcsVar).f4127a ? 0 : 4);
                    } else if (dcsVar instanceof zbs) {
                        zbs zbsVar = (zbs) dcsVar;
                        yxk0 yxk0Var4 = zbsVar.f44131a;
                        Double d = zbsVar.b;
                        iiy[] iiyVarArr6 = hyk0.U1;
                        SpinAndWinChoiceView spinAndWinChoiceView2 = hyk0Var.G0().b;
                        if (yxk0Var4 != yxk0.g) {
                            for (SpinAndWinButton spinAndWinButton3 : spinAndWinChoiceView2.c) {
                                int i2 = SpinAndWinButton.c;
                                spinAndWinButton3.setDefaultState(false);
                                if (spinAndWinButton3.getType() == yxk0Var4) {
                                    spinAndWinButton3.c();
                                    if (d != null) {
                                        spinAndWinButton3.setSum(d.doubleValue());
                                    }
                                } else {
                                    spinAndWinButton3.d();
                                }
                            }
                        }
                    } else if (dcsVar instanceof bcs) {
                        List<xxk0> list = ((bcs) dcsVar).f2367a;
                        iiy[] iiyVarArr7 = hyk0.U1;
                        SpinAndWinChoiceView spinAndWinChoiceView3 = hyk0Var.G0().b;
                        list.getClass();
                        for (xxk0 xxk0Var : list) {
                            for (SpinAndWinButton spinAndWinButton4 : spinAndWinChoiceView3.c) {
                                spinAndWinButton4.d();
                                if (spinAndWinButton4.getType() == xxk0Var.b) {
                                    spinAndWinButton4.setSum(xxk0Var.f41663a);
                                }
                            }
                        }
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 3:
                qc7 qc7Var = (qc7) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                if (qc7Var != null) {
                    if (qc7Var instanceof nc7) {
                        nc7 nc7Var = (nc7) qc7Var;
                        boolean z = nc7Var.f23277a;
                        double d2 = nc7Var.b;
                        String str = nc7Var.c;
                        iiy[] iiyVarArr8 = hyk0.U1;
                        TextView textView = hyk0Var.G0().h;
                        if (z) {
                            strD = hyk0Var.H(R.string.bonus);
                        } else {
                            pn40 pn40Var = pn40.f27267a;
                            strD = pn40.d(d2, str, p3u0.c);
                        }
                        textView.setText(strD);
                    } else if (qc7Var instanceof pc7) {
                        List list2 = ((pc7) qc7Var).f26744a;
                        iiy[] iiyVarArr9 = hyk0.U1;
                        u70 u70Var = hyk0Var.P1;
                        if (u70Var != null) {
                            u70Var.G(list2);
                        }
                    } else if (qc7Var instanceof oc7) {
                        boolean z2 = ((oc7) qc7Var).f25014a;
                        iiy[] iiyVarArr10 = hyk0.U1;
                        RecyclerView recyclerView = hyk0Var.G0().g;
                        recyclerView.setAlpha(z2 ? 1.0f : 0.35f);
                        recyclerView.setEnabled(z2);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 4:
                pl60 pl60Var = (pl60) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                if (pl60Var == null) {
                    t9f.b();
                    return null;
                }
                iiy[] iiyVarArr11 = hyk0.U1;
                hyk0 hyk0Var2 = this.k;
                ndk0 ndk0Var = hyk0Var2.Q1;
                if (ndk0Var == null || !ndk0Var.a()) {
                    wdk0 wdk0Var = hyk0Var2.M1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    pek0 pek0Var = pek0.f26859a;
                    String strH = hyk0Var2.H(R.string.games_select_outcome_to_start_game_message);
                    strH.getClass();
                    hyk0Var2.Q1 = wdk0.k(wdk0Var, new xdk0(pek0Var, strH, null, null, null, null, 124), hyk0Var2, null, null, false, null, 1020);
                    tyk0 tyk0VarH0 = hyk0Var2.H0();
                    ztt zttVar = tyk0VarH0.e;
                    if (zttVar.a().f4905a.f3145a.a()) {
                        sac.V(jiu0.a(tyk0VarH0), nyk0.f24333a, null, tyk0VarH0.v.f22085a, new kbh0(tyk0VarH0, new ty5(zttVar.a()), yjeVar, (byte) 20), 10);
                    }
                }
                return Unit.f46060a;
            default:
                hlu0 hlu0Var = (hlu0) this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                boolean z3 = hlu0Var.f13280a;
                iiy[] iiyVarArr12 = hyk0.U1;
                hyk0Var.G0().c.setVisibility(z3 ? 0 : 4);
                int dimensionPixelOffset3 = hyk0Var.G().getDimensionPixelOffset(hlu0Var.b ? R.dimen.multi_choice_play_button_margin_bottom_instant_bet : R.dimen.multi_choice_play_button_margin_bottom_bet);
                AppCompatButton appCompatButton = hyk0Var.G0().c;
                ViewGroup.LayoutParams layoutParams2 = hyk0Var.G0().c.getLayoutParams();
                layoutParams2.getClass();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, dimensionPixelOffset3);
                appCompatButton.setLayoutParams(marginLayoutParams);
                return Unit.f46060a;
        }
    }
}

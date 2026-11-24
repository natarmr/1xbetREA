package a;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.ui_core.AnimatedCoefficientView;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes.dex */
public final class g820 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ i820 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g820(i820 i820Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = i820Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        i820 i820Var = this.k;
        switch (b) {
            case 0:
                g820 g820Var = new g820(i820Var, yjeVar, (byte) 0);
                g820Var.j = obj;
                return g820Var;
            case 1:
                g820 g820Var2 = new g820(i820Var, yjeVar, (byte) 1);
                g820Var2.j = obj;
                return g820Var2;
            case 2:
                g820 g820Var3 = new g820(i820Var, yjeVar, (byte) 2);
                g820Var3.j = obj;
                return g820Var3;
            default:
                g820 g820Var4 = new g820(i820Var, yjeVar, (byte) 3);
                g820Var4.j = obj;
                return g820Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((g820) create((sc7) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((g820) create((jm7) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((g820) create((nze) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((g820) create((kze) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        axe axeVar;
        byte b = this.i;
        i820 i820Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                sc7 sc7Var = (sc7) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                atz atzVar = i820.U1;
                TextView textView = i820Var.G0().t;
                long j = sc7Var.f31972a;
                boolean z = sc7Var.i;
                textView.setText(String.valueOf(j));
                i820.J0(i820Var.G0().j, sc7Var);
                i820.J0(i820Var.G0().i, sc7Var);
                boolean z2 = sc7Var.m != null;
                if (sc7Var.g) {
                    if (z2) {
                        e0f e0fVar = i820Var.G0().j;
                        ConstraintLayout constraintLayout = (ConstraintLayout) e0fVar.g;
                        if (z) {
                            x0x.s(constraintLayout);
                        } else {
                            x0x.O(constraintLayout);
                        }
                        ((DsShimmerView) e0fVar.l).setVisibility(z ? 0 : 8);
                        ((AnimatedCoefficientView) e0fVar.j).setVisibility(!z ? 0 : 8);
                        ((DsShimmerView) e0fVar.k).setVisibility(z ? 0 : 8);
                        ((AnimatedCoefficientView) e0fVar.i).setVisibility(!z ? 0 : 8);
                        e0f e0fVar2 = i820Var.G0().i;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) e0fVar2.g;
                        if (z) {
                            x0x.s(constraintLayout2);
                        } else {
                            x0x.O(constraintLayout2);
                        }
                        ((DsShimmerView) e0fVar2.l).setVisibility(z ? 0 : 8);
                        ((AnimatedCoefficientView) e0fVar2.j).setVisibility(!z ? 0 : 8);
                        ((DsShimmerView) e0fVar2.k).setVisibility(z ? 0 : 8);
                        ((AnimatedCoefficientView) e0fVar2.i).setVisibility(!z ? 0 : 8);
                    } else {
                        i820Var.I0(z);
                    }
                    if (!z) {
                        i820Var.G0().s.setText(sc7Var.c);
                    }
                } else {
                    i820Var.I0(false);
                    i820Var.G0().s.setText(i820Var.H(R.string.figure_dash));
                }
                i820Var.G0().n.setVisibility(8);
                ((ConstraintLayout) i820Var.G0().i.e).setVisibility(0);
                i820Var.G0().f.setVisibility(0);
                i820Var.G0().g.getViewTreeObserver().addOnGlobalLayoutListener(i820Var.Q1);
                return Unit.f46060a;
            case 1:
                jm7 jm7Var = (jm7) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                boolean z3 = jm7Var.b;
                String str = jm7Var.f16752a;
                boolean z4 = jm7Var.c;
                if (z3 && z4) {
                    atz atzVar2 = i820.U1;
                    x0x.s(i820Var.G0().o);
                    i820Var.G0().l.setVisibility(0);
                    i820Var.G0().o.setVisibility(0);
                    i820Var.G0().c.setVisibility(8);
                } else if (!z3 || z4) {
                    atz atzVar3 = i820.U1;
                    i820Var.G0().l.setVisibility(8);
                } else {
                    atz atzVar4 = i820.U1;
                    x0x.O(i820Var.G0().o);
                    i820Var.G0().l.setVisibility(0);
                    i820Var.G0().o.setVisibility(8);
                    i820Var.G0().c.setVisibility(0);
                    i820Var.G0().c.l(jm7Var.d);
                }
                if (!StringsKt.W(str)) {
                    i820Var.G0().r.setText(str);
                }
                return Unit.f46060a;
            case 2:
                nze nzeVar = (nze) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (nzeVar != null) {
                    if (nzeVar instanceof mze) {
                        float f = ((mze) nzeVar).f22651a;
                        boolean z5 = f > 0.85f;
                        atz atzVar5 = i820.U1;
                        i820Var.G0().h.setVisibility(0);
                        i820Var.G0().g.setAlpha(1.0f - f);
                        i820Var.G0().h.setAlpha(f);
                        i820Var.G0().h.setTranslationZ(z5 ? 1.0f : 0.0f);
                        i820Var.G0().g.setTranslationZ(z5 ? 0.0f : 1.0f);
                        ConstraintLayout constraintLayout3 = i820Var.G0().h;
                        constraintLayout3.setFocusable(z5);
                        constraintLayout3.setClickable(z5);
                        constraintLayout3.setFocusableInTouchMode(z5);
                        ConstraintLayout constraintLayout4 = i820Var.G0().g;
                        boolean z6 = !z5;
                        constraintLayout4.setFocusable(z6);
                        constraintLayout4.setClickable(z6);
                        constraintLayout4.setFocusableInTouchMode(z6);
                    } else if (nzeVar instanceof lze) {
                        atz atzVar6 = i820.U1;
                        i820Var.G0().g.setAlpha(1.0f);
                        i820Var.G0().h.setAlpha(0.0f);
                        i820Var.G0().h.setVisibility(8);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                kze kzeVar = (kze) obj2;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                if (kzeVar instanceof jze) {
                    kwd kwdVar = n4f.k2;
                    String strH = i820Var.H(R.string.coupon_make_bet_type);
                    strH.getClass();
                    ArrayList arrayList = ((jze) kzeVar).f17408a;
                    androidx.fragment.app.e eVarC = i820Var.C();
                    eVarC.getClass();
                    kwdVar.getClass();
                    kwd.g(strH, arrayList, "CHANGE_SYSTEM_REQUEST_KEY", eVarC);
                } else if (kzeVar instanceof hze) {
                    atz atzVar7 = i820.U1;
                    Fragment fragment = i820Var.y;
                    axeVar = fragment instanceof axe ? (axe) fragment : null;
                    if (axeVar != null) {
                        r7f r7fVarM0 = axeVar.M0();
                        r7fVarM0.b2.f(new p720(r7fVarM0.T1));
                    }
                } else {
                    if (!Intrinsics.d(kzeVar, ize.f15631a)) {
                        t9f.b();
                        return null;
                    }
                    atz atzVar8 = i820.U1;
                    Fragment fragment2 = i820Var.y;
                    axeVar = fragment2 instanceof axe ? (axe) fragment2 : null;
                    if (axeVar != null) {
                        axeVar.I0();
                    }
                }
                return Unit.f46060a;
        }
    }
}

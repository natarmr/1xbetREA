package a;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.african_roulette.presentation.views.AfricanRouletteCell;
import org.xplatform.african_roulette.presentation.views.AfricanRouletteGameField;
import org.xplatform.african_roulette.presentation.views.AfricanRouletteWheel;

/* JADX INFO: loaded from: classes2.dex */
public final class k80 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ n80 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k80(n80 n80Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = n80Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        n80 n80Var = this.k;
        switch (b) {
            case 0:
                k80 k80Var = new k80(n80Var, yjeVar, (byte) 0);
                k80Var.j = obj;
                return k80Var;
            case 1:
                k80 k80Var2 = new k80(n80Var, yjeVar, (byte) 1);
                k80Var2.j = obj;
                return k80Var2;
            case 2:
                k80 k80Var3 = new k80(n80Var, yjeVar, (byte) 2);
                k80Var3.j = obj;
                return k80Var3;
            case 3:
                k80 k80Var4 = new k80(n80Var, yjeVar, (byte) 3);
                k80Var4.j = obj;
                return k80Var4;
            case 4:
                k80 k80Var5 = new k80(n80Var, yjeVar, (byte) 4);
                k80Var5.j = obj;
                return k80Var5;
            default:
                k80 k80Var6 = new k80(n80Var, yjeVar, (byte) 5);
                k80Var6.j = obj;
                return k80Var6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((k80) create((n90) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((k80) create((l90) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((k80) create((h90) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((k80) create((c90) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((k80) create((m90) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((k80) create((i90) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        String strD;
        byte b = this.i;
        n80 n80Var = this.k;
        final byte b2 = 1;
        final byte b3 = 0;
        switch (b) {
            case 0:
                n90 n90Var = (n90) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (n90Var == null) {
                    t9f.b();
                    return null;
                }
                n80Var.R1 = true;
                int i = n90Var.f23115a;
                int dimensionPixelOffset = n80Var.G().getDimensionPixelOffset(R.dimen.space_22);
                int dimensionPixelOffset2 = n80Var.G().getDimensionPixelOffset(R.dimen.space_26);
                ViewGroup.LayoutParams layoutParams = n80Var.G0().f.getLayoutParams();
                layoutParams.getClass();
                ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(i, dimensionPixelOffset, 0, dimensionPixelOffset2);
                n80Var.G0().f.requestLayout();
                return Unit.f46060a;
            case 1:
                l90 l90Var = (l90) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (l90Var != null) {
                    if (l90Var instanceof j90) {
                        jdk0 jdk0Var = n80.U1;
                        n80Var.G0().f.setVisibility(((j90) l90Var).f16113a ? 0 : 8);
                    } else if (l90Var instanceof k90) {
                        k90 k90Var = (k90) l90Var;
                        float f = k90Var.c;
                        float f2 = k90Var.b;
                        if (k90Var.f17894a) {
                            jdk0 jdk0Var2 = n80.U1;
                            final AfricanRouletteWheel africanRouletteWheel = n80Var.G0().f;
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((ImageView) africanRouletteWheel.f46269a.e, "rotation", 0.0f, ((f2 + f) - 20.0f) + 2160.0f);
                            objectAnimatorOfFloat.setDuration(12000L);
                            objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
                            objectAnimatorOfFloat.addListener(new x90(africanRouletteWheel, (byte) 1));
                            africanRouletteWheel.d = objectAnimatorOfFloat;
                            objectAnimatorOfFloat.start();
                            africanRouletteWheel.b = 2.4f;
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(-20.0f, -147.0f);
                            valueAnimatorOfFloat.setDuration(2100L);
                            valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
                            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: a.v90
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    byte b4 = b3;
                                    AfricanRouletteWheel africanRouletteWheel2 = africanRouletteWheel;
                                    switch (b4) {
                                        case 0:
                                            int i2 = AfricanRouletteWheel.f;
                                            valueAnimator.getClass();
                                            dc3 dc3Var = africanRouletteWheel2.f46269a;
                                            ViewGroup.LayoutParams layoutParams2 = ((ImageView) dc3Var.d).getLayoutParams();
                                            a3e a3eVar = layoutParams2 instanceof a3e ? (a3e) layoutParams2 : null;
                                            Object animatedValue = valueAnimator.getAnimatedValue();
                                            Float f3 = animatedValue instanceof Float ? (Float) animatedValue : null;
                                            if (f3 != null) {
                                                float fFloatValue = f3.floatValue();
                                                if (a3eVar != null) {
                                                    a3eVar.r = fFloatValue;
                                                }
                                                ((ImageView) dc3Var.d).setLayoutParams(a3eVar);
                                            }
                                            break;
                                        default:
                                            dc3 dc3Var2 = africanRouletteWheel2.f46269a;
                                            int i3 = AfricanRouletteWheel.f;
                                            valueAnimator.getClass();
                                            Object animatedValue2 = valueAnimator.getAnimatedValue();
                                            Float f4 = animatedValue2 instanceof Float ? (Float) animatedValue2 : null;
                                            if (f4 != null) {
                                                float fFloatValue2 = f4.floatValue();
                                                ViewGroup.LayoutParams layoutParams3 = ((ImageView) dc3Var2.d).getLayoutParams();
                                                a3e a3eVar2 = layoutParams3 instanceof a3e ? (a3e) layoutParams3 : null;
                                                if (a3eVar2 != null) {
                                                    a3eVar2.r = fFloatValue2;
                                                }
                                                ((ImageView) dc3Var2.d).setLayoutParams(a3eVar2);
                                            }
                                            break;
                                    }
                                }
                            });
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.05f);
                            valueAnimatorOfFloat2.setStartDelay(800L);
                            valueAnimatorOfFloat2.setDuration(1300L);
                            final float f3 = africanRouletteWheel.b;
                            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: a.w90
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i2 = AfricanRouletteWheel.f;
                                    valueAnimator.getClass();
                                    Object animatedValue = valueAnimator.getAnimatedValue();
                                    Float f4 = animatedValue instanceof Float ? (Float) animatedValue : null;
                                    if (f4 != null) {
                                        float fFloatValue = f4.floatValue() + f3;
                                        if (fFloatValue == 0.0f) {
                                            fFloatValue = 2.4f;
                                        }
                                        africanRouletteWheel.b = fFloatValue;
                                    }
                                }
                            });
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(-147.0f, 1080.0f + f);
                            valueAnimatorOfFloat3.setDuration(10000L);
                            valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: a.v90
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    byte b4 = b2;
                                    AfricanRouletteWheel africanRouletteWheel2 = africanRouletteWheel;
                                    switch (b4) {
                                        case 0:
                                            int i2 = AfricanRouletteWheel.f;
                                            valueAnimator.getClass();
                                            dc3 dc3Var = africanRouletteWheel2.f46269a;
                                            ViewGroup.LayoutParams layoutParams2 = ((ImageView) dc3Var.d).getLayoutParams();
                                            a3e a3eVar = layoutParams2 instanceof a3e ? (a3e) layoutParams2 : null;
                                            Object animatedValue = valueAnimator.getAnimatedValue();
                                            Float f4 = animatedValue instanceof Float ? (Float) animatedValue : null;
                                            if (f4 != null) {
                                                float fFloatValue = f4.floatValue();
                                                if (a3eVar != null) {
                                                    a3eVar.r = fFloatValue;
                                                }
                                                ((ImageView) dc3Var.d).setLayoutParams(a3eVar);
                                            }
                                            break;
                                        default:
                                            dc3 dc3Var2 = africanRouletteWheel2.f46269a;
                                            int i3 = AfricanRouletteWheel.f;
                                            valueAnimator.getClass();
                                            Object animatedValue2 = valueAnimator.getAnimatedValue();
                                            Float f5 = animatedValue2 instanceof Float ? (Float) animatedValue2 : null;
                                            if (f5 != null) {
                                                float fFloatValue2 = f5.floatValue();
                                                ViewGroup.LayoutParams layoutParams3 = ((ImageView) dc3Var2.d).getLayoutParams();
                                                a3e a3eVar2 = layoutParams3 instanceof a3e ? (a3e) layoutParams3 : null;
                                                if (a3eVar2 != null) {
                                                    a3eVar2.r = fFloatValue2;
                                                }
                                                ((ImageView) dc3Var2.d).setLayoutParams(a3eVar2);
                                            }
                                            break;
                                    }
                                }
                            });
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            africanRouletteWheel.c = animatorSet2;
                            animatorSet2.playSequentially(animatorSet, valueAnimatorOfFloat3);
                            animatorSet2.removeAllListeners();
                            animatorSet2.addListener(new x90(africanRouletteWheel, (byte) 0));
                            AnimatorSet animatorSet3 = africanRouletteWheel.c;
                            if (animatorSet3 != null) {
                                animatorSet3.start();
                            }
                        } else if (f2 != 0.0f) {
                            jdk0 jdk0Var3 = n80.U1;
                            AfricanRouletteWheel africanRouletteWheel2 = n80Var.G0().f;
                            dc3 dc3Var = africanRouletteWheel2.f46269a;
                            ImageView imageView = (ImageView) dc3Var.e;
                            ImageView imageView2 = (ImageView) dc3Var.d;
                            imageView.setRotation((f2 + f) - 20.0f);
                            ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
                            a3e a3eVar = layoutParams2 instanceof a3e ? (a3e) layoutParams2 : null;
                            if (a3eVar != null) {
                                a3eVar.r = f;
                            }
                            imageView2.setLayoutParams(a3eVar);
                            africanRouletteWheel2.b = 3.45f;
                            africanRouletteWheel2.invalidate();
                        }
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 2:
                h90 h90Var = (h90) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (h90Var != null) {
                    if (h90Var instanceof g90) {
                        jdk0 jdk0Var4 = n80.U1;
                        n80Var.G0().c.setVisibility(((g90) h90Var).f10889a ? 0 : 4);
                    } else if (h90Var instanceof f90) {
                        jdk0 jdk0Var5 = n80.U1;
                        AfricanRouletteGameField africanRouletteGameField = n80Var.G0().c;
                        ArrayList arrayList = ((f90) h90Var).f9132a;
                        for (AfricanRouletteCell africanRouletteCell : africanRouletteGameField.q) {
                            boolean zContains = arrayList.contains(africanRouletteCell.getBetType$african_roulette());
                            vd7 vd7Var = africanRouletteCell.f46268a;
                            if (zContains) {
                                ((ImageView) vd7Var.c).setVisibility(0);
                            } else {
                                ((ImageView) vd7Var.c).setVisibility(8);
                            }
                        }
                    } else if (h90Var instanceof e90) {
                        z70 z70Var = ((e90) h90Var).f7398a;
                        jdk0 jdk0Var6 = n80.U1;
                        for (AfricanRouletteCell africanRouletteCell2 : n80Var.G0().c.q) {
                            z70 betType$african_roulette = africanRouletteCell2.getBetType$african_roulette();
                            vd7 vd7Var2 = africanRouletteCell2.f46268a;
                            if (betType$african_roulette == z70Var) {
                                ((FrameLayout) vd7Var2.b).setAlpha(1.0f);
                            } else {
                                ((FrameLayout) vd7Var2.b).setAlpha(0.3f);
                            }
                        }
                    } else if (h90Var instanceof d90) {
                        jdk0 jdk0Var7 = n80.U1;
                        Iterator it = n80Var.G0().c.q.iterator();
                        while (it.hasNext()) {
                            ((FrameLayout) ((AfricanRouletteCell) it.next()).f46268a.b).setAlpha(1.0f);
                        }
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 3:
                c90 c90Var = (c90) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                if (c90Var != null) {
                    if (c90Var instanceof z80) {
                        z80 z80Var = (z80) c90Var;
                        boolean z = z80Var.f43944a;
                        double d = z80Var.b;
                        String str = z80Var.c;
                        jdk0 jdk0Var8 = n80.U1;
                        TextView textView = n80Var.G0().e;
                        if (z) {
                            strD = n80Var.H(R.string.bonus);
                        } else {
                            pn40 pn40Var = pn40.f27267a;
                            strD = pn40.d(d, str, p3u0.c);
                        }
                        textView.setText(strD);
                    } else if (c90Var instanceof b90) {
                        List list = ((b90) c90Var).f2184a;
                        jdk0 jdk0Var9 = n80.U1;
                        u70 u70Var = n80Var.P1;
                        if (u70Var != null) {
                            u70Var.G(list);
                        }
                    } else if (c90Var instanceof a90) {
                        boolean z2 = ((a90) c90Var).f452a;
                        jdk0 jdk0Var10 = n80.U1;
                        RecyclerView recyclerView = n80Var.G0().d;
                        recyclerView.setAlpha(z2 ? 1.0f : 0.35f);
                        recyclerView.setEnabled(z2);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 4:
                m90 m90Var = (m90) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                boolean z3 = m90Var.f21392a;
                jdk0 jdk0Var11 = n80.U1;
                n80Var.G0().b.setVisibility(z3 ? 0 : 4);
                int dimensionPixelOffset3 = n80Var.G().getDimensionPixelOffset(m90Var.b ? R.dimen.multi_choice_play_button_margin_bottom_instant_bet : R.dimen.multi_choice_play_button_margin_bottom_bet);
                AppCompatButton appCompatButton = n80Var.G0().b;
                ViewGroup.LayoutParams layoutParams3 = n80Var.G0().b.getLayoutParams();
                layoutParams3.getClass();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, dimensionPixelOffset3);
                appCompatButton.setLayoutParams(marginLayoutParams);
                return Unit.f46060a;
            default:
                i90 i90Var = (i90) this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                if (i90Var == null) {
                    t9f.b();
                    return null;
                }
                jdk0 jdk0Var12 = n80.U1;
                n80 n80Var2 = this.k;
                ndk0 ndk0Var = n80Var2.Q1;
                if (ndk0Var == null || !ndk0Var.a()) {
                    wdk0 wdk0Var = n80Var2.M1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    pek0 pek0Var = pek0.f26859a;
                    String strH = n80Var2.H(R.string.games_select_sector_to_start_game_message);
                    strH.getClass();
                    n80Var2.Q1 = wdk0.k(wdk0Var, new xdk0(pek0Var, strH, null, null, null, null, 124), n80Var2, null, null, false, null, 1020);
                }
                return Unit.f46060a;
        }
    }
}

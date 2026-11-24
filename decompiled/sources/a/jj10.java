package a;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Random;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.core.presentation.custom_views.cards.LuckyCardWidget;
import org.xplatform.lucky_card.presentation.views.LuckyCardChoiceView;

/* JADX INFO: loaded from: classes2.dex */
public final class jj10 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ lj10 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jj10(lj10 lj10Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = lj10Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        lj10 lj10Var = this.k;
        switch (b) {
            case 0:
                jj10 jj10Var = new jj10(lj10Var, yjeVar, (byte) 0);
                jj10Var.j = obj;
                return jj10Var;
            case 1:
                jj10 jj10Var2 = new jj10(lj10Var, yjeVar, (byte) 1);
                jj10Var2.j = obj;
                return jj10Var2;
            default:
                jj10 jj10Var3 = new jj10(lj10Var, yjeVar, (byte) 2);
                jj10Var3.j = obj;
                return jj10Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((jj10) create((qj10) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((jj10) create((mj10) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((jj10) create((nj10) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0115  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        int i;
        byte b = this.i;
        lj10 lj10Var = this.k;
        final byte b2 = 1;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                qj10 qj10Var = (qj10) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (!Intrinsics.d(qj10Var, oj10.f25339a)) {
                    if (Intrinsics.d(qj10Var, oj10.b)) {
                        iiy[] iiyVarArr = lj10.O1;
                        ((LuckyCardChoiceView) lj10Var.G0().b.d).a();
                        LuckyCardWidget luckyCardWidget = (LuckyCardWidget) lj10Var.G0().b.c;
                        luckyCardWidget.e = false;
                        luckyCardWidget.invalidate();
                        ((LuckyCardChoiceView) lj10Var.G0().b.d).setVisibility(4);
                    } else {
                        if (!(qj10Var instanceof pj10)) {
                            t9f.b();
                            return null;
                        }
                        vj10 vj10Var = ((pj10) qj10Var).f27067a;
                        iiy[] iiyVarArr2 = lj10.O1;
                        final LuckyCardWidget luckyCardWidget2 = (LuckyCardWidget) lj10Var.G0().b.c;
                        ws60 ws60Var = vj10Var.g;
                        ij10 ij10Var = new ij10(lj10Var, (byte) 1);
                        Random random = luckyCardWidget2.j;
                        luckyCardWidget2.e = true;
                        Context context = luckyCardWidget2.getContext();
                        context.getClass();
                        koa koaVar = ws60Var.f39677a;
                        int i2 = ws60Var.b;
                        int i3 = fk10.f9670a[koaVar.ordinal()];
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    if (i3 != 4) {
                                        if (i3 != 5) {
                                            i = 0;
                                        } else {
                                            i = R.drawable.cards_prizes_iphone;
                                        }
                                    } else if (i2 == 2) {
                                        i = R.drawable.fool_2_diamond;
                                    } else if (i2 == 3) {
                                        i = R.drawable.fool_3_diamond;
                                    } else if (i2 == 4) {
                                        i = R.drawable.fool_4_diamond;
                                    } else if (i2 == 5) {
                                        i = R.drawable.fool_5_diamond;
                                    } else if (i2 == 6) {
                                        i = R.drawable.fool_6_diamond;
                                    } else if (i2 == 7) {
                                        i = R.drawable.fool_7_diamond;
                                    } else if (i2 == 8) {
                                        i = R.drawable.fool_8_diamond;
                                    } else if (i2 == 9) {
                                        i = R.drawable.fool_9_diamond;
                                    } else if (i2 == 10) {
                                        i = R.drawable.fool_10_diamond;
                                    } else if (i2 == 11) {
                                        i = R.drawable.fool_j_diamond;
                                    } else if (i2 == 12) {
                                        i = R.drawable.fool_q_diamond;
                                    } else if (i2 == 13) {
                                        i = R.drawable.fool_k_diamond;
                                    } else if (i2 == 14) {
                                        i = R.drawable.fool_a_diamond;
                                    } else {
                                        i = 0;
                                    }
                                } else if (i2 == 2) {
                                    i = R.drawable.fool_2_heart;
                                } else if (i2 == 3) {
                                    i = R.drawable.fool_3_heart;
                                } else if (i2 == 4) {
                                    i = R.drawable.fool_4_heart;
                                } else if (i2 == 5) {
                                    i = R.drawable.fool_5_heart;
                                } else if (i2 == 6) {
                                    i = R.drawable.fool_6_heart;
                                } else if (i2 == 7) {
                                    i = R.drawable.fool_7_heart;
                                } else if (i2 == 8) {
                                    i = R.drawable.fool_8_heart;
                                } else if (i2 == 9) {
                                    i = R.drawable.fool_9_heart;
                                } else if (i2 == 10) {
                                    i = R.drawable.fool_10_heart;
                                } else if (i2 == 11) {
                                    i = R.drawable.fool_j_heart;
                                } else if (i2 == 12) {
                                    i = R.drawable.fool_q_heart;
                                } else if (i2 == 13) {
                                    i = R.drawable.fool_k_heart;
                                } else if (i2 == 14) {
                                    i = R.drawable.fool_a_heart;
                                } else {
                                    i = 0;
                                }
                            } else if (i2 == 2) {
                                i = R.drawable.fool_2_club;
                            } else if (i2 == 3) {
                                i = R.drawable.fool_3_club;
                            } else if (i2 == 4) {
                                i = R.drawable.fool_4_club;
                            } else if (i2 == 5) {
                                i = R.drawable.fool_5_club;
                            } else if (i2 == 6) {
                                i = R.drawable.fool_6_club;
                            } else if (i2 == 7) {
                                i = R.drawable.fool_7_club;
                            } else if (i2 == 8) {
                                i = R.drawable.fool_8_club;
                            } else if (i2 == 9) {
                                i = R.drawable.fool_9_club;
                            } else if (i2 == 10) {
                                i = R.drawable.fool_10_club;
                            } else if (i2 == 11) {
                                i = R.drawable.fool_j_club;
                            } else if (i2 == 12) {
                                i = R.drawable.fool_q_club;
                            } else if (i2 == 13) {
                                i = R.drawable.fool_k_club;
                            } else if (i2 == 14) {
                                i = R.drawable.fool_a_club;
                            } else {
                                i = 0;
                            }
                        } else if (i2 == 2) {
                            i = R.drawable.fool_2_spade;
                        } else if (i2 == 3) {
                            i = R.drawable.fool_3_spade;
                        } else if (i2 == 4) {
                            i = R.drawable.fool_4_spade;
                        } else if (i2 == 5) {
                            i = R.drawable.fool_5_spade;
                        } else if (i2 == 6) {
                            i = R.drawable.fool_6_spade;
                        } else if (i2 == 7) {
                            i = R.drawable.fool_7_spade;
                        } else if (i2 == 8) {
                            i = R.drawable.fool_8_spade;
                        } else if (i2 == 9) {
                            i = R.drawable.fool_9_spade;
                        } else if (i2 == 10) {
                            i = R.drawable.fool_10_spade;
                        } else if (i2 == 11) {
                            i = R.drawable.fool_j_spade;
                        } else if (i2 == 12) {
                            i = R.drawable.fool_q_spade;
                        } else if (i2 == 13) {
                            i = R.drawable.fool_k_spade;
                        } else if (i2 == 14) {
                            i = R.drawable.fool_a_spade;
                        } else {
                            i = 0;
                        }
                        Drawable drawableU = epv0.U(i, context);
                        if (drawableU != null) {
                            luckyCardWidget2.f = drawableU;
                        }
                        luckyCardWidget2.i = random.nextInt(luckyCardWidget2.k - 1) + 1;
                        AnimatorSet animatorSet = new AnimatorSet();
                        int i4 = random.nextBoolean() ? -1 : 1;
                        final byte b3 = 0;
                        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, i4 * ((int) ((-luckyCardWidget2.c) * 0.5f)), 0);
                        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: a.gk10
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                byte b4 = b3;
                                LuckyCardWidget luckyCardWidget3 = luckyCardWidget2;
                                switch (b4) {
                                    case 0:
                                        LuckyCardWidget.a(luckyCardWidget3, valueAnimator);
                                        break;
                                    default:
                                        LuckyCardWidget.b(luckyCardWidget3, valueAnimator);
                                        break;
                                }
                            }
                        });
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: a.gk10
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                byte b4 = b2;
                                LuckyCardWidget luckyCardWidget3 = luckyCardWidget2;
                                switch (b4) {
                                    case 0:
                                        LuckyCardWidget.a(luckyCardWidget3, valueAnimator);
                                        break;
                                    default:
                                        LuckyCardWidget.b(luckyCardWidget3, valueAnimator);
                                        break;
                                }
                            }
                        });
                        animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorOfFloat);
                        animatorSet.setDuration(800L);
                        animatorSet.addListener(unh0.h0(s7n0.l(luckyCardWidget2), null, new rx00(ij10Var, (byte) 10), 11));
                        animatorSet.start();
                        luckyCardWidget2.invalidate();
                    }
                }
                return Unit.f46060a;
            case 1:
                mj10 mj10Var = (mj10) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(mj10Var, mj10.b)) {
                    iiy[] iiyVarArr3 = lj10.O1;
                    ((LuckyCardChoiceView) lj10Var.G0().b.d).setEnabled(true);
                } else {
                    if (!Intrinsics.d(mj10Var, mj10.f21872a)) {
                        t9f.b();
                        return null;
                    }
                    iiy[] iiyVarArr4 = lj10.O1;
                    ((LuckyCardChoiceView) lj10Var.G0().b.d).setEnabled(false);
                }
                return Unit.f46060a;
            default:
                nj10 nj10Var = (nj10) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(nj10Var, nj10.f23614a)) {
                    iiy[] iiyVarArr5 = lj10.O1;
                    ((LuckyCardChoiceView) lj10Var.G0().b.d).setVisibility(4);
                } else {
                    if (!Intrinsics.d(nj10Var, nj10.b)) {
                        t9f.b();
                        return null;
                    }
                    iiy[] iiyVarArr6 = lj10.O1;
                    ((LuckyCardChoiceView) lj10Var.G0().b.d).setVisibility(0);
                }
                return Unit.f46060a;
        }
    }
}

package org.xplatform.cyber.game.universal.impl.presentation.dicepoker;

import a.akc;
import a.fkk;
import a.fr9;
import a.gkk;
import a.hny;
import a.jkk;
import a.nkk;
import a.okk;
import a.q3d;
import a.qkk;
import a.rwj;
import a.sac;
import a.sj3;
import a.tkz;
import a.tvk;
import a.vbk;
import a.xj1;
import a.yje;
import a.ykk;
import a.ys10;
import a.yum0;
import a.zkk;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import java.util.ArrayList;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.cyber.game.universal.impl.presentation.timerView.SyntheticTimerView;

/* JADX INFO: loaded from: classes4.dex */
public final class DicePokerView extends ConstraintLayout {
    public static final /* synthetic */ int t = 0;
    public final zkk q;
    public final List r;
    public final List s;

    /* JADX WARN: Illegal instructions before constructor call */
    public DicePokerView(Context context, AttributeSet attributeSet, int i) {
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet2, 0);
        LayoutInflater.from(context).inflate(R.layout.dice_poker_view, this);
        int i2 = R.id.firstPlayerFifthDice;
        ImageView imageView = (ImageView) yum0.f(this, R.id.firstPlayerFifthDice);
        if (imageView != null) {
            i2 = R.id.firstPlayerFirstDice;
            ImageView imageView2 = (ImageView) yum0.f(this, R.id.firstPlayerFirstDice);
            if (imageView2 != null) {
                i2 = R.id.firstPlayerFourthDice;
                ImageView imageView3 = (ImageView) yum0.f(this, R.id.firstPlayerFourthDice);
                if (imageView3 != null) {
                    i2 = R.id.firstPlayerSecondDice;
                    ImageView imageView4 = (ImageView) yum0.f(this, R.id.firstPlayerSecondDice);
                    if (imageView4 != null) {
                        i2 = R.id.firstPlayerThirdDice;
                        ImageView imageView5 = (ImageView) yum0.f(this, R.id.firstPlayerThirdDice);
                        if (imageView5 != null) {
                            i2 = R.id.halfGuidline;
                            if (((Guideline) yum0.f(this, R.id.halfGuidline)) != null) {
                                i2 = R.id.ivBlackCup;
                                ImageView imageView6 = (ImageView) yum0.f(this, R.id.ivBlackCup);
                                if (imageView6 != null) {
                                    i2 = R.id.ivWhiteCup;
                                    ImageView imageView7 = (ImageView) yum0.f(this, R.id.ivWhiteCup);
                                    if (imageView7 != null) {
                                        i2 = R.id.secondPlayerFifthDice;
                                        ImageView imageView8 = (ImageView) yum0.f(this, R.id.secondPlayerFifthDice);
                                        if (imageView8 != null) {
                                            i2 = R.id.secondPlayerFirstDice;
                                            ImageView imageView9 = (ImageView) yum0.f(this, R.id.secondPlayerFirstDice);
                                            if (imageView9 != null) {
                                                i2 = R.id.secondPlayerFourthDice;
                                                ImageView imageView10 = (ImageView) yum0.f(this, R.id.secondPlayerFourthDice);
                                                if (imageView10 != null) {
                                                    i2 = R.id.secondPlayerSecondDice;
                                                    ImageView imageView11 = (ImageView) yum0.f(this, R.id.secondPlayerSecondDice);
                                                    if (imageView11 != null) {
                                                        i2 = R.id.secondPlayerThirdDice;
                                                        ImageView imageView12 = (ImageView) yum0.f(this, R.id.secondPlayerThirdDice);
                                                        if (imageView12 != null) {
                                                            i2 = R.id.syntheticTimerView;
                                                            SyntheticTimerView syntheticTimerView = (SyntheticTimerView) yum0.f(this, R.id.syntheticTimerView);
                                                            if (syntheticTimerView != null) {
                                                                i2 = R.id.tvPlayerOneCombination;
                                                                TextView textView = (TextView) yum0.f(this, R.id.tvPlayerOneCombination);
                                                                if (textView != null) {
                                                                    i2 = R.id.tvPlayerOneTitle;
                                                                    if (((TextView) yum0.f(this, R.id.tvPlayerOneTitle)) != null) {
                                                                        i2 = R.id.tvPlayerTwoCombination;
                                                                        TextView textView2 = (TextView) yum0.f(this, R.id.tvPlayerTwoCombination);
                                                                        if (textView2 != null) {
                                                                            i2 = R.id.tvPlayerTwoTitle;
                                                                            if (((TextView) yum0.f(this, R.id.tvPlayerTwoTitle)) != null) {
                                                                                i2 = R.id.tvStatus;
                                                                                TextView textView3 = (TextView) yum0.f(this, R.id.tvStatus);
                                                                                if (textView3 != null) {
                                                                                    i2 = R.id.tvWinnerText;
                                                                                    TextView textView4 = (TextView) yum0.f(this, R.id.tvWinnerText);
                                                                                    if (textView4 != null) {
                                                                                        this.q = new zkk(this, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, imageView11, imageView12, syntheticTimerView, textView, textView2, textView3, textView4);
                                                                                        this.r = q3d.j(imageView2, imageView4, imageView5, imageView3, imageView);
                                                                                        this.s = q3d.j(imageView9, imageView11, imageView12, imageView10, imageView8);
                                                                                        return;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public static void C(TextView textView, String str) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) ViewGroup.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.getClass();
        objectAnimatorOfFloat.addListener(new akc(textView, str, (byte) 5));
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setWinDices(gkk gkkVar) {
        int iOrdinal = gkkVar.f.ordinal();
        if (iOrdinal == 0) {
            z(gkkVar.d, this.r);
        } else {
            if (iOrdinal != 1) {
                return;
            }
            z(gkkVar.e, this.s);
        }
    }

    public static void x(ArrayList arrayList, List list) {
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            ((ImageView) list.get(i)).setImageResource(((fkk) obj).f9697a);
            i = i2;
        }
    }

    public final void A(jkk jkkVar, boolean z) {
        if (z) {
            x(jkkVar.f16673a, this.s);
            return;
        }
        Context context = getRootView().getContext();
        context.getClass();
        zkk zkkVar = this.q;
        new qkk(context, (ImageView) zkkVar.b, R.anim.cybergame_dice_poker_shake_black_cup, (DicePokerView) zkkVar.f, jkkVar.b, new ykk(this, jkkVar, (byte) 1));
    }

    public final void B(okk okkVar, tkz tkzVar, boolean z) {
        zkk zkkVar = this.q;
        if (z) {
            if (okkVar.c) {
                ((TextView) zkkVar.h).setText(getContext().getString(R.string.game_end));
            } else {
                ((TextView) zkkVar.h).setText(okkVar.b);
            }
            ((SyntheticTimerView) zkkVar.g).setVisibility(okkVar.d ? 0 : 8);
            return;
        }
        ((SyntheticTimerView) zkkVar.g).setVisibility(8);
        ((TextView) zkkVar.h).setText(okkVar.f25408a);
        rwj rwjVar = tvk.f34603a;
        sac.V(tkzVar, new vbk((byte) 6), null, ys10.f43147a, new fr9(this, okkVar, null, (byte) 18), 10);
    }

    public final void v(jkk jkkVar, boolean z) {
        if (z) {
            x(jkkVar.f16673a, this.r);
            return;
        }
        Context context = getRootView().getContext();
        context.getClass();
        zkk zkkVar = this.q;
        new qkk(context, (ImageView) zkkVar.c, R.anim.cybergame_dice_poker_shake_white_cup, (DicePokerView) zkkVar.f, jkkVar.b, new ykk(this, jkkVar, (byte) 0));
    }

    public final void w(gkk gkkVar, boolean z, tkz tkzVar) {
        if (gkkVar.f != nkk.d) {
            rwj rwjVar = tvk.f34603a;
            sac.V(tkzVar, new vbk((byte) 5), null, ys10.f43147a, new xj1(z, (Object) this, (Object) gkkVar, (yje) null, (byte) 5), 10);
        }
    }

    public final void y(List list, List list2) {
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            if (((Boolean) obj).booleanValue()) {
                ImageView imageView = (ImageView) list2.get(i);
                Context context = getContext();
                context.getClass();
                imageView.setBackground(sj3.U(R.drawable.cybergame_dice_poker_cube_player_one_selected_bg, context));
            } else {
                ImageView imageView2 = (ImageView) list2.get(i);
                Context context2 = getContext();
                context2.getClass();
                imageView2.setColorFilter(sj3.P(R.color.static_black_40, context2));
            }
            i = i2;
        }
    }

    public final void z(List list, List list2) {
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            if (((Boolean) obj).booleanValue()) {
                ImageView imageView = (ImageView) list2.get(i);
                Context context = getContext();
                context.getClass();
                imageView.setBackground(sj3.U(R.drawable.cybergame_dice_poker_cube_player_two_selected_bg, context));
            }
            i = i2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DicePokerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DicePokerView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}

package org.xplatform.uikit_sport.eventcard.middle;

import a.cbo;
import a.hny;
import a.l7n;
import a.llk;
import a.p5h0;
import a.q3d;
import a.tbc;
import a.yum0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.uikit.components.timer.DsTimer;
import org.xplatform.uikit_sport.score.SportScore;

/* JADX INFO: loaded from: classes6.dex */
public final class EventCardMiddleDicePoker extends ConstraintLayout implements cbo {
    public final tbc q;
    public final List r;
    public final List s;

    /* JADX WARN: Illegal instructions before constructor call */
    public EventCardMiddleDicePoker(Context context, AttributeSet attributeSet, int i) {
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet2, R.attr.eventCardMiddleDicePokerStyle);
        LayoutInflater.from(context).inflate(R.layout.event_card_middle_dice_poker_view, this);
        int i2 = R.id.fifthDicePlayerOne;
        ImageView imageView = (ImageView) yum0.f(this, R.id.fifthDicePlayerOne);
        if (imageView != null) {
            i2 = R.id.fifthDicePlayerTwo;
            ImageView imageView2 = (ImageView) yum0.f(this, R.id.fifthDicePlayerTwo);
            if (imageView2 != null) {
                i2 = R.id.firstDicePlayerOne;
                ImageView imageView3 = (ImageView) yum0.f(this, R.id.firstDicePlayerOne);
                if (imageView3 != null) {
                    i2 = R.id.firstDicePlayerTwo;
                    ImageView imageView4 = (ImageView) yum0.f(this, R.id.firstDicePlayerTwo);
                    if (imageView4 != null) {
                        i2 = R.id.flexPlayerOneDice;
                        if (((FlexboxLayout) yum0.f(this, R.id.flexPlayerOneDice)) != null) {
                            i2 = R.id.flexPlayerTwoDice;
                            if (((FlexboxLayout) yum0.f(this, R.id.flexPlayerTwoDice)) != null) {
                                i2 = R.id.fourthDicePlayerOne;
                                ImageView imageView5 = (ImageView) yum0.f(this, R.id.fourthDicePlayerOne);
                                if (imageView5 != null) {
                                    i2 = R.id.fourthDicePlayerTwo;
                                    ImageView imageView6 = (ImageView) yum0.f(this, R.id.fourthDicePlayerTwo);
                                    if (imageView6 != null) {
                                        i2 = R.id.playerOneCombination;
                                        TextView textView = (TextView) yum0.f(this, R.id.playerOneCombination);
                                        if (textView != null) {
                                            i2 = R.id.playerOneName;
                                            TextView textView2 = (TextView) yum0.f(this, R.id.playerOneName);
                                            if (textView2 != null) {
                                                i2 = R.id.playerTwoCombination;
                                                TextView textView3 = (TextView) yum0.f(this, R.id.playerTwoCombination);
                                                if (textView3 != null) {
                                                    i2 = R.id.playerTwoName;
                                                    TextView textView4 = (TextView) yum0.f(this, R.id.playerTwoName);
                                                    if (textView4 != null) {
                                                        i2 = R.id.score;
                                                        SportScore sportScore = (SportScore) yum0.f(this, R.id.score);
                                                        if (sportScore != null) {
                                                            i2 = R.id.secondDicePlayerOne;
                                                            ImageView imageView7 = (ImageView) yum0.f(this, R.id.secondDicePlayerOne);
                                                            if (imageView7 != null) {
                                                                i2 = R.id.secondDicePlayerTwo;
                                                                ImageView imageView8 = (ImageView) yum0.f(this, R.id.secondDicePlayerTwo);
                                                                if (imageView8 != null) {
                                                                    i2 = R.id.thirdDicePlayerOne;
                                                                    ImageView imageView9 = (ImageView) yum0.f(this, R.id.thirdDicePlayerOne);
                                                                    if (imageView9 != null) {
                                                                        i2 = R.id.thirdDicePlayerTwo;
                                                                        ImageView imageView10 = (ImageView) yum0.f(this, R.id.thirdDicePlayerTwo);
                                                                        if (imageView10 != null) {
                                                                            i2 = R.id.timer;
                                                                            DsTimer dsTimer = (DsTimer) yum0.f(this, R.id.timer);
                                                                            if (dsTimer != null) {
                                                                                i2 = R.id.tvGameLabel;
                                                                                TextView textView5 = (TextView) yum0.f(this, R.id.tvGameLabel);
                                                                                if (textView5 != null) {
                                                                                    i2 = R.id.tvInfoLabel;
                                                                                    TextView textView6 = (TextView) yum0.f(this, R.id.tvInfoLabel);
                                                                                    if (textView6 != null) {
                                                                                        this.q = new tbc(this, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, textView, textView2, textView3, textView4, sportScore, imageView7, imageView8, imageView9, imageView10, dsTimer, textView5, textView6);
                                                                                        setLayoutDirection(0);
                                                                                        this.r = q3d.j(imageView3, imageView7, imageView9, imageView5, imageView);
                                                                                        this.s = q3d.j(imageView4, imageView8, imageView10, imageView6, imageView2);
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

    public static void u(List list, List list2) {
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            ImageView imageView = (ImageView) obj;
            if (i < list.size()) {
                imageView.setImageResource(((llk) list.get(i)).f20251a);
                imageView.setAlpha(((llk) list.get(i)).b ? 0.5f : 1.0f);
            } else {
                imageView.setImageDrawable(null);
                imageView.setAlpha(1.0f);
            }
            i = i2;
        }
    }

    public final void setGameLabel(CharSequence charSequence) {
        tbc tbcVar = this.q;
        ((TextView) tbcVar.i).setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        ((TextView) tbcVar.i).setText(charSequence);
    }

    public final void setHideAfterFinished(boolean z) {
        ((DsTimer) this.q.h).setHideAfterFinished(z);
    }

    public final void setInformation(CharSequence charSequence) {
        tbc tbcVar = this.q;
        ((TextView) tbcVar.j).setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        ((TextView) tbcVar.j).setText(charSequence);
    }

    public final void setPlayerOneCombination(String str) {
        str.getClass();
        tbc tbcVar = this.q;
        tbcVar.d.setVisibility(str.length() == 0 ? 8 : 0);
        tbcVar.d.setText(str);
    }

    public final void setPlayerOneDice(List<llk> list) {
        list.getClass();
        u(list, this.r);
    }

    public final void setPlayerOneName(CharSequence charSequence) {
        this.q.e.setText(charSequence);
    }

    public final void setPlayerTwoCombination(String str) {
        str.getClass();
        tbc tbcVar = this.q;
        ((TextView) tbcVar.c).setVisibility(str.length() == 0 ? 8 : 0);
        ((TextView) tbcVar.c).setText(str);
    }

    public final void setPlayerTwoDice(List<llk> list) {
        list.getClass();
        u(list, this.s);
    }

    public final void setPlayerTwoName(CharSequence charSequence) {
        ((TextView) this.q.g).setText(charSequence);
    }

    public final void setScoreModel(p5h0 p5h0Var) {
        p5h0Var.getClass();
        ((SportScore) this.q.b).setScore(p5h0Var);
    }

    public final void setTime(long j) {
        ((DsTimer) this.q.h).setTime(j);
    }

    public final void setTimeDirection(l7n l7nVar) {
        l7nVar.getClass();
        ((DsTimer) this.q.h).setTimeDirection(l7nVar);
    }

    public final void setTimerVisibility(boolean z) {
        ((DsTimer) this.q.h).setVisibility(z ? 0 : 8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardMiddleDicePoker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardMiddleDicePoker(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}

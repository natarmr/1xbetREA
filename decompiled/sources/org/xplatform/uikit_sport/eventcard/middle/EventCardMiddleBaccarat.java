package org.xplatform.uikit_sport.eventcard.middle;

import a.cbo;
import a.hny;
import a.laa;
import a.p5h0;
import a.q3d;
import a.uk5;
import a.yum0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.uikit_sport.score.SportScore;

/* JADX INFO: loaded from: classes3.dex */
public final class EventCardMiddleBaccarat extends ConstraintLayout implements cbo {
    public final uk5 q;
    public final List r;
    public final List s;

    /* JADX WARN: Illegal instructions before constructor call */
    public EventCardMiddleBaccarat(Context context, AttributeSet attributeSet, int i) {
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet2, R.attr.eventCardMiddleBaccaratStyle);
        LayoutInflater.from(context).inflate(R.layout.event_card_middle_baccarat_view, this);
        int i2 = R.id.bankerFifthCard;
        ImageView imageView = (ImageView) yum0.f(this, R.id.bankerFifthCard);
        if (imageView != null) {
            i2 = R.id.bankerFirstCard;
            ImageView imageView2 = (ImageView) yum0.f(this, R.id.bankerFirstCard);
            if (imageView2 != null) {
                i2 = R.id.bankerFourthCard;
                ImageView imageView3 = (ImageView) yum0.f(this, R.id.bankerFourthCard);
                if (imageView3 != null) {
                    i2 = R.id.bankerName;
                    TextView textView = (TextView) yum0.f(this, R.id.bankerName);
                    if (textView != null) {
                        i2 = R.id.bankerSecondCard;
                        ImageView imageView4 = (ImageView) yum0.f(this, R.id.bankerSecondCard);
                        if (imageView4 != null) {
                            i2 = R.id.bankerThirdCard;
                            ImageView imageView5 = (ImageView) yum0.f(this, R.id.bankerThirdCard);
                            if (imageView5 != null) {
                                i2 = R.id.bottomInfo;
                                TextView textView2 = (TextView) yum0.f(this, R.id.bottomInfo);
                                if (textView2 != null) {
                                    i2 = R.id.information;
                                    TextView textView3 = (TextView) yum0.f(this, R.id.information);
                                    if (textView3 != null) {
                                        i2 = R.id.playerEighthCard;
                                        ImageView imageView6 = (ImageView) yum0.f(this, R.id.playerEighthCard);
                                        if (imageView6 != null) {
                                            i2 = R.id.playerFifthCard;
                                            ImageView imageView7 = (ImageView) yum0.f(this, R.id.playerFifthCard);
                                            if (imageView7 != null) {
                                                i2 = R.id.playerFirstCard;
                                                ImageView imageView8 = (ImageView) yum0.f(this, R.id.playerFirstCard);
                                                if (imageView8 != null) {
                                                    i2 = R.id.playerFourthCard;
                                                    ImageView imageView9 = (ImageView) yum0.f(this, R.id.playerFourthCard);
                                                    if (imageView9 != null) {
                                                        i2 = R.id.playerName;
                                                        TextView textView4 = (TextView) yum0.f(this, R.id.playerName);
                                                        if (textView4 != null) {
                                                            i2 = R.id.playerSecondCard;
                                                            ImageView imageView10 = (ImageView) yum0.f(this, R.id.playerSecondCard);
                                                            if (imageView10 != null) {
                                                                i2 = R.id.playerSeventhCard;
                                                                ImageView imageView11 = (ImageView) yum0.f(this, R.id.playerSeventhCard);
                                                                if (imageView11 != null) {
                                                                    i2 = R.id.playerSixthCard;
                                                                    ImageView imageView12 = (ImageView) yum0.f(this, R.id.playerSixthCard);
                                                                    if (imageView12 != null) {
                                                                        i2 = R.id.playerThirdCard;
                                                                        ImageView imageView13 = (ImageView) yum0.f(this, R.id.playerThirdCard);
                                                                        if (imageView13 != null) {
                                                                            i2 = R.id.score;
                                                                            SportScore sportScore = (SportScore) yum0.f(this, R.id.score);
                                                                            if (sportScore != null) {
                                                                                i2 = R.id.topBarrier;
                                                                                if (((Barrier) yum0.f(this, R.id.topBarrier)) != null) {
                                                                                    this.q = new uk5(this, imageView, imageView2, imageView3, textView, imageView4, imageView5, textView2, textView3, imageView6, imageView7, imageView8, imageView9, textView4, imageView10, imageView11, imageView12, imageView13, sportScore);
                                                                                    setLayoutDirection(0);
                                                                                    this.r = q3d.j(imageView8, imageView10, imageView13, imageView9, imageView7, imageView12, imageView11, imageView6);
                                                                                    this.s = q3d.j(imageView, imageView3, imageView5, imageView4, imageView2);
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
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void setBankerCards(List<? extends laa> list) {
        list.getClass();
        int i = 0;
        for (Object obj : this.s) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            ImageView imageView = (ImageView) obj;
            if (i <= q3d.i(list)) {
                imageView.setImageResource(list.get(i).f19696a);
            }
            imageView.getClass();
            imageView.setVisibility(i > list.size() - 1 ? 4 : 0);
            i = i2;
        }
    }

    public final void setBankerName(int i) {
        setBankerName(getContext().getText(i));
    }

    public final void setBottomInfo(CharSequence charSequence) {
        uk5 uk5Var = this.q;
        ((TextView) uk5Var.d).setVisibility((charSequence == null || charSequence.length() == 0) ? 4 : 0);
        ((TextView) uk5Var.d).setText(charSequence);
    }

    public final void setInformation(CharSequence charSequence) {
        uk5 uk5Var = this.q;
        ((TextView) uk5Var.e).setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        ((TextView) uk5Var.e).setText(charSequence);
    }

    public final void setPlayerCards(List<? extends laa> list) {
        list.getClass();
        int i = 0;
        for (Object obj : this.r) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            ImageView imageView = (ImageView) obj;
            if (i <= q3d.i(list)) {
                imageView.setImageResource(list.get(i).f19696a);
            }
            imageView.getClass();
            imageView.setVisibility(i <= list.size() - 1 ? 0 : 8);
            i = i2;
        }
    }

    public final void setPlayerName(int i) {
        setPlayerName(getContext().getText(i));
    }

    public final void setScoreModel(p5h0 p5h0Var) {
        p5h0Var.getClass();
        ((SportScore) this.q.g).setScore(p5h0Var);
    }

    public final void setBankerName(CharSequence charSequence) {
        ((TextView) this.q.c).setText(charSequence);
    }

    public final void setPlayerName(CharSequence charSequence) {
        ((TextView) this.q.f).setText(charSequence);
    }

    public final void setBottomInfo(int i) {
        setBottomInfo(getContext().getText(i));
    }

    public final void setInformation(int i) {
        setInformation(getContext().getText(i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardMiddleBaccarat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardMiddleBaccarat(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}

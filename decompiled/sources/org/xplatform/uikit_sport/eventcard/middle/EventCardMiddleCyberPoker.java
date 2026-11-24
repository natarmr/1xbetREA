package org.xplatform.uikit_sport.eventcard.middle;

import a.cbo;
import a.ebo;
import a.hny;
import a.l7n;
import a.laa;
import a.p5h0;
import a.q3d;
import a.unq0;
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
import org.xplatform.uikit.components.timer.DsTimer;
import org.xplatform.uikit_sport.score.SportScore;

/* JADX INFO: loaded from: classes6.dex */
public final class EventCardMiddleCyberPoker extends ConstraintLayout implements cbo {
    public final ebo q;

    /* JADX WARN: Illegal instructions before constructor call */
    public EventCardMiddleCyberPoker(Context context, AttributeSet attributeSet, int i) {
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet2, R.attr.eventCardMiddleCyberPokerStyle);
        LayoutInflater.from(context).inflate(R.layout.event_card_middle_cyber_poker_view, this);
        int i2 = R.id.bottomInfo;
        TextView textView = (TextView) yum0.f(this, R.id.bottomInfo);
        if (textView != null) {
            i2 = R.id.caption;
            TextView textView2 = (TextView) yum0.f(this, R.id.caption);
            if (textView2 != null) {
                i2 = R.id.combinationBarrier;
                if (((Barrier) yum0.f(this, R.id.combinationBarrier)) != null) {
                    i2 = R.id.dealerFifthCard;
                    ImageView imageView = (ImageView) yum0.f(this, R.id.dealerFifthCard);
                    if (imageView != null) {
                        i2 = R.id.dealerFirstCard;
                        ImageView imageView2 = (ImageView) yum0.f(this, R.id.dealerFirstCard);
                        if (imageView2 != null) {
                            i2 = R.id.dealerFourthCard;
                            ImageView imageView3 = (ImageView) yum0.f(this, R.id.dealerFourthCard);
                            if (imageView3 != null) {
                                i2 = R.id.dealerSecondCard;
                                ImageView imageView4 = (ImageView) yum0.f(this, R.id.dealerSecondCard);
                                if (imageView4 != null) {
                                    i2 = R.id.dealerThirdCard;
                                    ImageView imageView5 = (ImageView) yum0.f(this, R.id.dealerThirdCard);
                                    if (imageView5 != null) {
                                        i2 = R.id.firstPlayerCombination;
                                        TextView textView3 = (TextView) yum0.f(this, R.id.firstPlayerCombination);
                                        if (textView3 != null) {
                                            i2 = R.id.firstPlayerFirstCard;
                                            ImageView imageView6 = (ImageView) yum0.f(this, R.id.firstPlayerFirstCard);
                                            if (imageView6 != null) {
                                                i2 = R.id.firstPlayerName;
                                                TextView textView4 = (TextView) yum0.f(this, R.id.firstPlayerName);
                                                if (textView4 != null) {
                                                    i2 = R.id.firstPlayerSecondCard;
                                                    ImageView imageView7 = (ImageView) yum0.f(this, R.id.firstPlayerSecondCard);
                                                    if (imageView7 != null) {
                                                        i2 = R.id.firstPlayerThirdCard;
                                                        ImageView imageView8 = (ImageView) yum0.f(this, R.id.firstPlayerThirdCard);
                                                        if (imageView8 != null) {
                                                            i2 = R.id.information;
                                                            TextView textView5 = (TextView) yum0.f(this, R.id.information);
                                                            if (textView5 != null) {
                                                                i2 = R.id.score;
                                                                SportScore sportScore = (SportScore) yum0.f(this, R.id.score);
                                                                if (sportScore != null) {
                                                                    i2 = R.id.secondPlayerCombination;
                                                                    TextView textView6 = (TextView) yum0.f(this, R.id.secondPlayerCombination);
                                                                    if (textView6 != null) {
                                                                        i2 = R.id.secondPlayerFirstCard;
                                                                        ImageView imageView9 = (ImageView) yum0.f(this, R.id.secondPlayerFirstCard);
                                                                        if (imageView9 != null) {
                                                                            i2 = R.id.secondPlayerName;
                                                                            TextView textView7 = (TextView) yum0.f(this, R.id.secondPlayerName);
                                                                            if (textView7 != null) {
                                                                                i2 = R.id.secondPlayerSecondCard;
                                                                                ImageView imageView10 = (ImageView) yum0.f(this, R.id.secondPlayerSecondCard);
                                                                                if (imageView10 != null) {
                                                                                    i2 = R.id.secondPlayerThirdCard;
                                                                                    ImageView imageView11 = (ImageView) yum0.f(this, R.id.secondPlayerThirdCard);
                                                                                    if (imageView11 != null) {
                                                                                        i2 = R.id.timer;
                                                                                        DsTimer dsTimer = (DsTimer) yum0.f(this, R.id.timer);
                                                                                        if (dsTimer != null) {
                                                                                            i2 = R.id.topBarrier;
                                                                                            if (((Barrier) yum0.f(this, R.id.topBarrier)) != null) {
                                                                                                this.q = new ebo(this, textView, textView2, imageView, imageView2, imageView3, imageView4, imageView5, textView3, imageView6, textView4, imageView7, imageView8, textView5, sportScore, textView6, imageView9, textView7, imageView10, imageView11, dsTimer);
                                                                                                setLayoutDirection(0);
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
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final List<ImageView> getDealerCardViews() {
        ebo eboVar = this.q;
        return q3d.j(eboVar.e, eboVar.g, eboVar.h, eboVar.f, eboVar.d);
    }

    private final List<ImageView> getFirstPlayerCardViews() {
        ebo eboVar = this.q;
        return q3d.j(eboVar.j, eboVar.l, eboVar.m);
    }

    private final List<ImageView> getSecondPlayerCardViews() {
        ebo eboVar = this.q;
        return q3d.j(eboVar.q, eboVar.s, eboVar.t);
    }

    public static void u(List list, List list2) {
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            ImageView imageView = (ImageView) obj;
            if (i < list2.size()) {
                imageView.setImageResource(((laa) list2.get(i)).f19696a);
            }
            imageView.setVisibility(i < list2.size() ? 0 : 8);
            i = i2;
        }
    }

    public static void v(EventCardMiddleCyberPoker eventCardMiddleCyberPoker, List list) {
        int i = 0;
        for (Object obj : eventCardMiddleCyberPoker.getDealerCardViews()) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            ImageView imageView = (ImageView) obj;
            if (i <= list.size() - 1) {
                imageView.setImageResource(((laa) list.get(i)).f19696a);
                imageView.setVisibility(0);
            } else {
                imageView.setImageResource(R.drawable.ic_card_shirt);
                imageView.setVisibility(8);
            }
            i = i2;
        }
    }

    public final void setBottomInfo(CharSequence charSequence) {
        ebo eboVar = this.q;
        eboVar.b.setVisibility((charSequence == null || charSequence.length() == 0) ? 4 : 0);
        eboVar.b.setText(charSequence);
    }

    public final void setCaption(CharSequence charSequence) {
        TextView textView = this.q.c;
        textView.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        textView.setText(charSequence);
    }

    public final void setFirstPlayerCards(List<? extends laa> list) {
        list.getClass();
        u(getFirstPlayerCardViews(), list);
    }

    public final void setFirstPlayerCombination(CharSequence charSequence) {
        ebo eboVar = this.q;
        eboVar.i.setVisibility((charSequence == null || charSequence.length() == 0) ? 4 : 0);
        eboVar.i.setText(charSequence);
    }

    public final void setFirstPlayerName(int i) {
        setFirstPlayerName(getContext().getText(i));
    }

    public final void setHideAfterFinished(boolean z) {
        this.q.u.setHideAfterFinished(z);
    }

    public final void setInformation(CharSequence charSequence) {
        ebo eboVar = this.q;
        eboVar.n.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        eboVar.n.setText(charSequence);
    }

    public final void setScoreModel(p5h0 p5h0Var) {
        p5h0Var.getClass();
        this.q.o.setScore(p5h0Var);
    }

    public final void setSecondPlayerCards(List<? extends laa> list) {
        list.getClass();
        u(getSecondPlayerCardViews(), list);
    }

    public final void setSecondPlayerCombination(CharSequence charSequence) {
        ebo eboVar = this.q;
        eboVar.p.setVisibility((charSequence == null || charSequence.length() == 0) ? 4 : 0);
        eboVar.p.setText(charSequence);
    }

    public final void setSecondPlayerName(int i) {
        setSecondPlayerName(getContext().getText(i));
    }

    public final void setTime(long j) {
        this.q.u.setTime(j);
    }

    public final void setTimeDirection(l7n l7nVar) {
        l7nVar.getClass();
        this.q.u.setTimeDirection(l7nVar);
    }

    public final void setTimerType(unq0 unq0Var) {
        unq0Var.getClass();
        this.q.u.setTimerType(unq0Var);
    }

    public final void setTimerVisibility(boolean z) {
        this.q.u.setVisibility(z ? 0 : 8);
    }

    public final void setFirstPlayerName(CharSequence charSequence) {
        this.q.k.setText(charSequence);
    }

    public final void setSecondPlayerName(CharSequence charSequence) {
        this.q.r.setText(charSequence);
    }

    public final void setCaption(int i) {
        setCaption(getContext().getText(i));
    }

    public final void setBottomInfo(int i) {
        setBottomInfo(getContext().getText(i));
    }

    public final void setFirstPlayerCombination(int i) {
        setFirstPlayerCombination(getContext().getText(i));
    }

    public final void setSecondPlayerCombination(int i) {
        setSecondPlayerCombination(getContext().getText(i));
    }

    public final void setInformation(int i) {
        setInformation(getContext().getText(i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardMiddleCyberPoker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardMiddleCyberPoker(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}

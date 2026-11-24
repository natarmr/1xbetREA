package org.xplatform.uikit_sport.eventcard.middle;

import a.cbo;
import a.fbo;
import a.hny;
import a.p5h0;
import a.yum0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;
import org.xplatform.uikit.components.separator.DsSeparator;
import org.xplatform.uikit_sport.score.SportScore;

/* JADX INFO: loaded from: classes6.dex */
public final class EventCardMiddleDice extends ConstraintLayout implements cbo {
    public final fbo q;

    /* JADX WARN: Illegal instructions before constructor call */
    public EventCardMiddleDice(Context context, AttributeSet attributeSet, int i) {
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet2, R.attr.eventCardMiddleDiceStyle);
        LayoutInflater.from(context).inflate(R.layout.event_card_middle_dice_view, this);
        int i2 = R.id.firstPlayerBottomFirstScore;
        TextView textView = (TextView) yum0.f(this, R.id.firstPlayerBottomFirstScore);
        if (textView != null) {
            i2 = R.id.firstPlayerBottomIcon;
            if (((ImageView) yum0.f(this, R.id.firstPlayerBottomIcon)) != null) {
                i2 = R.id.firstPlayerBottomResult;
                TextView textView2 = (TextView) yum0.f(this, R.id.firstPlayerBottomResult);
                if (textView2 != null) {
                    i2 = R.id.firstPlayerBottomSecondScore;
                    TextView textView3 = (TextView) yum0.f(this, R.id.firstPlayerBottomSecondScore);
                    if (textView3 != null) {
                        i2 = R.id.firstPlayerBottomSeparator;
                        if (((DsSeparator) yum0.f(this, R.id.firstPlayerBottomSeparator)) != null) {
                            i2 = R.id.firstPlayerName;
                            TextView textView4 = (TextView) yum0.f(this, R.id.firstPlayerName);
                            if (textView4 != null) {
                                i2 = R.id.firstPlayerTopFirstScore;
                                TextView textView5 = (TextView) yum0.f(this, R.id.firstPlayerTopFirstScore);
                                if (textView5 != null) {
                                    i2 = R.id.firstPlayerTopIcon;
                                    if (((ImageView) yum0.f(this, R.id.firstPlayerTopIcon)) != null) {
                                        i2 = R.id.firstPlayerTopResult;
                                        TextView textView6 = (TextView) yum0.f(this, R.id.firstPlayerTopResult);
                                        if (textView6 != null) {
                                            i2 = R.id.firstPlayerTopSecondScore;
                                            TextView textView7 = (TextView) yum0.f(this, R.id.firstPlayerTopSecondScore);
                                            if (textView7 != null) {
                                                i2 = R.id.firstPlayerTopSeparator;
                                                if (((DsSeparator) yum0.f(this, R.id.firstPlayerTopSeparator)) != null) {
                                                    i2 = R.id.information;
                                                    TextView textView8 = (TextView) yum0.f(this, R.id.information);
                                                    if (textView8 != null) {
                                                        i2 = R.id.score;
                                                        SportScore sportScore = (SportScore) yum0.f(this, R.id.score);
                                                        if (sportScore != null) {
                                                            i2 = R.id.secondPlayerBottomFirstScore;
                                                            TextView textView9 = (TextView) yum0.f(this, R.id.secondPlayerBottomFirstScore);
                                                            if (textView9 != null) {
                                                                i2 = R.id.secondPlayerBottomIcon;
                                                                if (((ImageView) yum0.f(this, R.id.secondPlayerBottomIcon)) != null) {
                                                                    i2 = R.id.secondPlayerBottomResult;
                                                                    TextView textView10 = (TextView) yum0.f(this, R.id.secondPlayerBottomResult);
                                                                    if (textView10 != null) {
                                                                        i2 = R.id.secondPlayerBottomSecondScore;
                                                                        TextView textView11 = (TextView) yum0.f(this, R.id.secondPlayerBottomSecondScore);
                                                                        if (textView11 != null) {
                                                                            i2 = R.id.secondPlayerBottomSeparator;
                                                                            if (((DsSeparator) yum0.f(this, R.id.secondPlayerBottomSeparator)) != null) {
                                                                                i2 = R.id.secondPlayerName;
                                                                                TextView textView12 = (TextView) yum0.f(this, R.id.secondPlayerName);
                                                                                if (textView12 != null) {
                                                                                    i2 = R.id.secondPlayerTopFirstScore;
                                                                                    TextView textView13 = (TextView) yum0.f(this, R.id.secondPlayerTopFirstScore);
                                                                                    if (textView13 != null) {
                                                                                        i2 = R.id.secondPlayerTopIcon;
                                                                                        if (((ImageView) yum0.f(this, R.id.secondPlayerTopIcon)) != null) {
                                                                                            i2 = R.id.secondPlayerTopResult;
                                                                                            TextView textView14 = (TextView) yum0.f(this, R.id.secondPlayerTopResult);
                                                                                            if (textView14 != null) {
                                                                                                i2 = R.id.secondPlayerTopSecondScore;
                                                                                                TextView textView15 = (TextView) yum0.f(this, R.id.secondPlayerTopSecondScore);
                                                                                                if (textView15 != null) {
                                                                                                    i2 = R.id.secondPlayerTopSeparator;
                                                                                                    if (((DsSeparator) yum0.f(this, R.id.secondPlayerTopSeparator)) != null) {
                                                                                                        this.q = new fbo(this, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, sportScore, textView9, textView10, textView11, textView12, textView13, textView14, textView15);
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
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void setFirstPlayerBottomFirstScore(int i) {
        setFirstPlayerBottomFirstScore(getContext().getText(i));
    }

    public final void setFirstPlayerBottomResult(int i) {
        setFirstPlayerBottomResult(getContext().getText(i));
    }

    public final void setFirstPlayerBottomSecondScore(int i) {
        setFirstPlayerBottomSecondScore(getContext().getText(i));
    }

    public final void setFirstPlayerName(int i) {
        setFirstPlayerName(getContext().getText(i));
    }

    public final void setFirstPlayerTopFirstScore(int i) {
        setFirstPlayerTopFirstScore(getContext().getText(i));
    }

    public final void setFirstPlayerTopResult(int i) {
        setFirstPlayerTopResult(getContext().getText(i));
    }

    public final void setFirstPlayerTopSecondScore(int i) {
        setFirstPlayerTopSecondScore(getContext().getText(i));
    }

    public final void setInformation(CharSequence charSequence) {
        fbo fboVar = this.q;
        fboVar.i.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        fboVar.i.setText(charSequence);
    }

    public final void setScoreModel(p5h0 p5h0Var) {
        p5h0Var.getClass();
        this.q.j.setScore(p5h0Var);
    }

    public final void setSecondPlayerBottomFirstScore(int i) {
        setSecondPlayerBottomFirstScore(getContext().getText(i));
    }

    public final void setSecondPlayerBottomResult(int i) {
        setSecondPlayerBottomResult(getContext().getText(i));
    }

    public final void setSecondPlayerBottomSecondScore(int i) {
        setSecondPlayerBottomSecondScore(getContext().getText(i));
    }

    public final void setSecondPlayerName(int i) {
        setSecondPlayerName(getContext().getText(i));
    }

    public final void setSecondPlayerTopFirstScore(int i) {
        setSecondPlayerTopFirstScore(getContext().getText(i));
    }

    public final void setSecondPlayerTopResult(int i) {
        setSecondPlayerTopResult(getContext().getText(i));
    }

    public final void setSecondPlayerTopSecondScore(int i) {
        setSecondPlayerTopSecondScore(getContext().getText(i));
    }

    public final void setFirstPlayerBottomFirstScore(CharSequence charSequence) {
        this.q.b.setText(charSequence);
    }

    public final void setFirstPlayerBottomResult(CharSequence charSequence) {
        this.q.c.setText(charSequence);
    }

    public final void setFirstPlayerBottomSecondScore(CharSequence charSequence) {
        this.q.d.setText(charSequence);
    }

    public final void setFirstPlayerName(CharSequence charSequence) {
        this.q.e.setText(charSequence);
    }

    public final void setFirstPlayerTopFirstScore(CharSequence charSequence) {
        this.q.f.setText(charSequence);
    }

    public final void setFirstPlayerTopResult(CharSequence charSequence) {
        this.q.g.setText(charSequence);
    }

    public final void setFirstPlayerTopSecondScore(CharSequence charSequence) {
        this.q.h.setText(charSequence);
    }

    public final void setSecondPlayerBottomFirstScore(CharSequence charSequence) {
        this.q.k.setText(charSequence);
    }

    public final void setSecondPlayerBottomResult(CharSequence charSequence) {
        this.q.l.setText(charSequence);
    }

    public final void setSecondPlayerBottomSecondScore(CharSequence charSequence) {
        this.q.m.setText(charSequence);
    }

    public final void setSecondPlayerName(CharSequence charSequence) {
        this.q.n.setText(charSequence);
    }

    public final void setSecondPlayerTopFirstScore(CharSequence charSequence) {
        this.q.o.setText(charSequence);
    }

    public final void setSecondPlayerTopResult(CharSequence charSequence) {
        this.q.p.setText(charSequence);
    }

    public final void setSecondPlayerTopSecondScore(CharSequence charSequence) {
        this.q.q.setText(charSequence);
    }

    public final void setInformation(int i) {
        setInformation(getContext().getText(i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardMiddleDice(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardMiddleDice(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}

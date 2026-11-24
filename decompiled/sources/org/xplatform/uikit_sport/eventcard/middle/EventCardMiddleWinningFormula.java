package org.xplatform.uikit_sport.eventcard.middle;

import a.cbo;
import a.hny;
import a.jbo;
import a.p5h0;
import a.yum0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;
import org.xplatform.uikit_sport.score.SportScore;

/* JADX INFO: loaded from: classes4.dex */
public final class EventCardMiddleWinningFormula extends ConstraintLayout implements cbo {
    public final jbo q;

    /* JADX WARN: Illegal instructions before constructor call */
    public EventCardMiddleWinningFormula(Context context, AttributeSet attributeSet, int i) {
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet2, R.attr.eventCardMiddleWinningFormulaStyle);
        LayoutInflater.from(context).inflate(R.layout.event_card_middle_winning_formula_view, this);
        int i2 = R.id.firstFormula;
        TextView textView = (TextView) yum0.f(this, R.id.firstFormula);
        if (textView != null) {
            i2 = R.id.firstFormulaTitle;
            TextView textView2 = (TextView) yum0.f(this, R.id.firstFormulaTitle);
            if (textView2 != null) {
                i2 = R.id.firstPlayerFirstAnswer;
                TextView textView3 = (TextView) yum0.f(this, R.id.firstPlayerFirstAnswer);
                if (textView3 != null) {
                    i2 = R.id.firstPlayerFirstAnswerTitle;
                    TextView textView4 = (TextView) yum0.f(this, R.id.firstPlayerFirstAnswerTitle);
                    if (textView4 != null) {
                        i2 = R.id.firstPlayerName;
                        TextView textView5 = (TextView) yum0.f(this, R.id.firstPlayerName);
                        if (textView5 != null) {
                            i2 = R.id.firstPlayerSecondAnswer;
                            TextView textView6 = (TextView) yum0.f(this, R.id.firstPlayerSecondAnswer);
                            if (textView6 != null) {
                                i2 = R.id.firstPlayerSecondAnswerTitle;
                                TextView textView7 = (TextView) yum0.f(this, R.id.firstPlayerSecondAnswerTitle);
                                if (textView7 != null) {
                                    i2 = R.id.firstPlayerThirdAnswer;
                                    TextView textView8 = (TextView) yum0.f(this, R.id.firstPlayerThirdAnswer);
                                    if (textView8 != null) {
                                        i2 = R.id.firstPlayerThirdAnswerTitle;
                                        TextView textView9 = (TextView) yum0.f(this, R.id.firstPlayerThirdAnswerTitle);
                                        if (textView9 != null) {
                                            i2 = R.id.information;
                                            TextView textView10 = (TextView) yum0.f(this, R.id.information);
                                            if (textView10 != null) {
                                                i2 = R.id.score;
                                                SportScore sportScore = (SportScore) yum0.f(this, R.id.score);
                                                if (sportScore != null) {
                                                    i2 = R.id.secondFormula;
                                                    TextView textView11 = (TextView) yum0.f(this, R.id.secondFormula);
                                                    if (textView11 != null) {
                                                        i2 = R.id.secondFormulaTitle;
                                                        TextView textView12 = (TextView) yum0.f(this, R.id.secondFormulaTitle);
                                                        if (textView12 != null) {
                                                            i2 = R.id.secondPlayerFirstAnswer;
                                                            TextView textView13 = (TextView) yum0.f(this, R.id.secondPlayerFirstAnswer);
                                                            if (textView13 != null) {
                                                                i2 = R.id.secondPlayerFirstAnswerTitle;
                                                                TextView textView14 = (TextView) yum0.f(this, R.id.secondPlayerFirstAnswerTitle);
                                                                if (textView14 != null) {
                                                                    i2 = R.id.secondPlayerName;
                                                                    TextView textView15 = (TextView) yum0.f(this, R.id.secondPlayerName);
                                                                    if (textView15 != null) {
                                                                        i2 = R.id.secondPlayerSecondAnswer;
                                                                        TextView textView16 = (TextView) yum0.f(this, R.id.secondPlayerSecondAnswer);
                                                                        if (textView16 != null) {
                                                                            i2 = R.id.secondPlayerSecondAnswerTitle;
                                                                            TextView textView17 = (TextView) yum0.f(this, R.id.secondPlayerSecondAnswerTitle);
                                                                            if (textView17 != null) {
                                                                                i2 = R.id.secondPlayerThirdAnswer;
                                                                                TextView textView18 = (TextView) yum0.f(this, R.id.secondPlayerThirdAnswer);
                                                                                if (textView18 != null) {
                                                                                    i2 = R.id.secondPlayerThirdAnswerTitle;
                                                                                    TextView textView19 = (TextView) yum0.f(this, R.id.secondPlayerThirdAnswerTitle);
                                                                                    if (textView19 != null) {
                                                                                        i2 = R.id.timeLeft;
                                                                                        TextView textView20 = (TextView) yum0.f(this, R.id.timeLeft);
                                                                                        if (textView20 != null) {
                                                                                            this.q = new jbo(this, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, sportScore, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20);
                                                                                            setLayoutDirection(0);
                                                                                            textView4.setText("x1");
                                                                                            textView7.setText("x2");
                                                                                            textView9.setText("x3");
                                                                                            textView14.setText("x1");
                                                                                            textView17.setText("x2");
                                                                                            textView19.setText("x3");
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
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void setFirstFormula(int i) {
        setFirstFormula(getContext().getText(i));
    }

    public final void setFirstFormulaTitle(int i) {
        setFirstFormulaTitle(getContext().getText(i));
    }

    public final void setFirstPlayerFirstAnswer(int i) {
        setFirstPlayerFirstAnswer(getContext().getText(i));
    }

    public final void setFirstPlayerName(int i) {
        setFirstPlayerName(getContext().getText(i));
    }

    public final void setFirstPlayerSecondAnswer(int i) {
        setFirstPlayerSecondAnswer(getContext().getText(i));
    }

    public final void setFirstPlayerThirdAnswer(int i) {
        setFirstPlayerThirdAnswer(getContext().getText(i));
    }

    public final void setInformation(CharSequence charSequence) {
        jbo jboVar = this.q;
        ((TextView) jboVar.i).setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        ((TextView) jboVar.i).setText(charSequence);
    }

    public final void setScoreModel(p5h0 p5h0Var) {
        p5h0Var.getClass();
        ((SportScore) this.q.q).setScore(p5h0Var);
    }

    public final void setSecondFormula(int i) {
        setSecondFormula(getContext().getText(i));
    }

    public final void setSecondFormulaTitle(int i) {
        setSecondFormulaTitle(getContext().getText(i));
    }

    public final void setSecondPlayerFirstAnswer(int i) {
        setSecondPlayerSecondAnswer(getContext().getText(i));
    }

    public final void setSecondPlayerName(int i) {
        setSecondPlayerName(getContext().getText(i));
    }

    public final void setSecondPlayerSecondAnswer(int i) {
        setSecondPlayerSecondAnswer(getContext().getText(i));
    }

    public final void setSecondPlayerThirdAnswer(int i) {
        setSecondPlayerThirdAnswer(getContext().getText(i));
    }

    public final void setTimeLeft(CharSequence charSequence) {
        jbo jboVar = this.q;
        ((TextView) jboVar.p).setVisibility((charSequence == null || charSequence.length() == 0) ? 4 : 0);
        ((TextView) jboVar.p).setText(charSequence);
    }

    public final void setFirstFormula(CharSequence charSequence) {
        ((TextView) this.q.c).setText(charSequence);
    }

    public final void setFirstFormulaTitle(CharSequence charSequence) {
        ((TextView) this.q.d).setText(charSequence);
    }

    public final void setFirstPlayerFirstAnswer(CharSequence charSequence) {
        ((TextView) this.q.e).setText(charSequence);
    }

    public final void setFirstPlayerName(CharSequence charSequence) {
        ((TextView) this.q.f).setText(charSequence);
    }

    public final void setFirstPlayerSecondAnswer(CharSequence charSequence) {
        ((TextView) this.q.g).setText(charSequence);
    }

    public final void setFirstPlayerThirdAnswer(CharSequence charSequence) {
        this.q.h.setText(charSequence);
    }

    public final void setSecondFormula(CharSequence charSequence) {
        ((TextView) this.q.j).setText(charSequence);
    }

    public final void setSecondFormulaTitle(CharSequence charSequence) {
        ((TextView) this.q.k).setText(charSequence);
    }

    public final void setSecondPlayerFirstAnswer(CharSequence charSequence) {
        ((TextView) this.q.l).setText(charSequence);
    }

    public final void setSecondPlayerName(CharSequence charSequence) {
        ((TextView) this.q.m).setText(charSequence);
    }

    public final void setSecondPlayerSecondAnswer(CharSequence charSequence) {
        ((TextView) this.q.n).setText(charSequence);
    }

    public final void setSecondPlayerThirdAnswer(CharSequence charSequence) {
        ((TextView) this.q.o).setText(charSequence);
    }

    public final void setTimeLeft(int i) {
        setTimeLeft(getContext().getText(i));
    }

    public final void setInformation(int i) {
        setInformation(getContext().getText(i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardMiddleWinningFormula(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardMiddleWinningFormula(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}

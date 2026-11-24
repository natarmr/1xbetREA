package org.xplatform.uikit_sport.eventcard.middle;

import a.cbo;
import a.hny;
import a.jg;
import a.p5h0;
import a.yum0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;
import org.xplatform.uikit.components.team_logo.DsTeamLogo;
import org.xplatform.uikit.components.views.LoadableShapeableImageView;
import org.xplatform.uikit_sport.score.SportScore;

/* JADX INFO: loaded from: classes6.dex */
public final class EventCardMiddleRoulette extends ConstraintLayout implements cbo {
    public final jg q;

    /* JADX WARN: Illegal instructions before constructor call */
    public EventCardMiddleRoulette(Context context, AttributeSet attributeSet, int i) {
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet2, R.attr.eventCardMiddleRouletteStyle);
        LayoutInflater.from(context).inflate(R.layout.event_card_middle_roulette_view, this);
        int i2 = R.id.firstBarrier;
        if (((Barrier) yum0.f(this, R.id.firstBarrier)) != null) {
            i2 = R.id.firstTeamLogo;
            DsTeamLogo dsTeamLogo = (DsTeamLogo) yum0.f(this, R.id.firstTeamLogo);
            if (dsTeamLogo != null) {
                i2 = R.id.firstTeamName;
                TextView textView = (TextView) yum0.f(this, R.id.firstTeamName);
                if (textView != null) {
                    i2 = R.id.score;
                    SportScore sportScore = (SportScore) yum0.f(this, R.id.score);
                    if (sportScore != null) {
                        i2 = R.id.secondBarrier;
                        if (((Barrier) yum0.f(this, R.id.secondBarrier)) != null) {
                            i2 = R.id.secondTeamLogo;
                            DsTeamLogo dsTeamLogo2 = (DsTeamLogo) yum0.f(this, R.id.secondTeamLogo);
                            if (dsTeamLogo2 != null) {
                                i2 = R.id.secondTeamName;
                                TextView textView2 = (TextView) yum0.f(this, R.id.secondTeamName);
                                if (textView2 != null) {
                                    i2 = R.id.tvGameLabel;
                                    TextView textView3 = (TextView) yum0.f(this, R.id.tvGameLabel);
                                    if (textView3 != null) {
                                        i2 = R.id.vStatisticFifthValue;
                                        TextView textView4 = (TextView) yum0.f(this, R.id.vStatisticFifthValue);
                                        if (textView4 != null) {
                                            i2 = R.id.vStatisticFirstValue;
                                            TextView textView5 = (TextView) yum0.f(this, R.id.vStatisticFirstValue);
                                            if (textView5 != null) {
                                                i2 = R.id.vStatisticFourthValue;
                                                TextView textView6 = (TextView) yum0.f(this, R.id.vStatisticFourthValue);
                                                if (textView6 != null) {
                                                    i2 = R.id.vStatisticSecondValue;
                                                    TextView textView7 = (TextView) yum0.f(this, R.id.vStatisticSecondValue);
                                                    if (textView7 != null) {
                                                        i2 = R.id.vStatisticThirdValue;
                                                        TextView textView8 = (TextView) yum0.f(this, R.id.vStatisticThirdValue);
                                                        if (textView8 != null) {
                                                            this.q = new jg(this, dsTeamLogo, textView, sportScore, dsTeamLogo2, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void setFirstTeamLogo(Drawable drawable) {
        jg jgVar = this.q;
        DsTeamLogo dsTeamLogo = (DsTeamLogo) jgVar.e;
        DsTeamLogo dsTeamLogo2 = (DsTeamLogo) jgVar.e;
        dsTeamLogo.setVisibility(drawable == null ? 8 : 0);
        dsTeamLogo2.setImageTintList(null);
        dsTeamLogo2.g(dsTeamLogo2);
        dsTeamLogo2.setImageDrawable(drawable);
    }

    public final void setGameLabel(CharSequence charSequence) {
        jg jgVar = this.q;
        ((TextView) jgVar.h).setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        ((TextView) jgVar.h).setText(charSequence);
    }

    public final void setPlayerOneName(CharSequence charSequence) {
        this.q.b.setText(charSequence);
    }

    public final void setPlayerTwoName(CharSequence charSequence) {
        this.q.c.setText(charSequence);
    }

    public final void setScoreModel(p5h0 p5h0Var) {
        p5h0Var.getClass();
        ((SportScore) this.q.f).setScore(p5h0Var);
    }

    public final void setSecondTeamLogo(Drawable drawable) {
        jg jgVar = this.q;
        DsTeamLogo dsTeamLogo = (DsTeamLogo) jgVar.g;
        DsTeamLogo dsTeamLogo2 = (DsTeamLogo) jgVar.g;
        dsTeamLogo.setVisibility(drawable == null ? 8 : 0);
        dsTeamLogo2.setImageTintList(null);
        dsTeamLogo2.g(dsTeamLogo2);
        dsTeamLogo2.setImageDrawable(drawable);
    }

    public final void setFirstTeamLogo(int i) {
        setFirstTeamLogo(getContext().getDrawable(i));
    }

    public final void setSecondTeamLogo(String str) {
        str.getClass();
        jg jgVar = this.q;
        ((DsTeamLogo) jgVar.g).setImageTintList(null);
        LoadableShapeableImageView.i((DsTeamLogo) jgVar.g, str, null, 14);
    }

    public final void setSecondTeamLogo(int i) {
        ((DsTeamLogo) this.q.g).setImageTintList(null);
        setSecondTeamLogo(getContext().getDrawable(i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardMiddleRoulette(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardMiddleRoulette(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}

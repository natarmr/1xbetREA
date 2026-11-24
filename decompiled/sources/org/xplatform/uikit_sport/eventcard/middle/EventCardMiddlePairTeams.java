package org.xplatform.uikit_sport.eventcard.middle;

import a.cbo;
import a.hny;
import a.p5h0;
import a.yum0;
import a.zkk;
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

/* JADX INFO: loaded from: classes4.dex */
public final class EventCardMiddlePairTeams extends ConstraintLayout implements cbo {
    public final zkk q;

    /* JADX WARN: Illegal instructions before constructor call */
    public EventCardMiddlePairTeams(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.eventCardMiddleStyle);
        LayoutInflater.from(context).inflate(R.layout.event_card_middle_multi_teams_view, this);
        int i2 = R.id.botFirstTeamLogo;
        DsTeamLogo dsTeamLogo = (DsTeamLogo) yum0.f(this, R.id.botFirstTeamLogo);
        if (dsTeamLogo != null) {
            i2 = R.id.botSecondTeamLogo;
            DsTeamLogo dsTeamLogo2 = (DsTeamLogo) yum0.f(this, R.id.botSecondTeamLogo);
            if (dsTeamLogo2 != null) {
                i2 = R.id.firstTeamLogosBarrier;
                if (((Barrier) yum0.f(this, R.id.firstTeamLogosBarrier)) != null) {
                    i2 = R.id.firstTeamName;
                    TextView textView = (TextView) yum0.f(this, R.id.firstTeamName);
                    if (textView != null) {
                        i2 = R.id.score;
                        SportScore sportScore = (SportScore) yum0.f(this, R.id.score);
                        if (sportScore != null) {
                            i2 = R.id.secondTeamLogosBarrier;
                            if (((Barrier) yum0.f(this, R.id.secondTeamLogosBarrier)) != null) {
                                i2 = R.id.secondTeamName;
                                TextView textView2 = (TextView) yum0.f(this, R.id.secondTeamName);
                                if (textView2 != null) {
                                    i2 = R.id.topFirstTeamLogo;
                                    DsTeamLogo dsTeamLogo3 = (DsTeamLogo) yum0.f(this, R.id.topFirstTeamLogo);
                                    if (dsTeamLogo3 != null) {
                                        i2 = R.id.topSecondTeamLogo;
                                        DsTeamLogo dsTeamLogo4 = (DsTeamLogo) yum0.f(this, R.id.topSecondTeamLogo);
                                        if (dsTeamLogo4 != null) {
                                            this.q = new zkk(this, dsTeamLogo, dsTeamLogo2, textView, sportScore, textView2, dsTeamLogo3, dsTeamLogo4);
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
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void setBotFirstTeamLogo(Drawable drawable) {
        zkk zkkVar = this.q;
        ((DsTeamLogo) zkkVar.b).setVisibility(drawable == null ? 8 : 0);
        ((DsTeamLogo) zkkVar.b).setImageDrawable(drawable);
    }

    public final void setBotSecondTeamLogo(Drawable drawable) {
        zkk zkkVar = this.q;
        ((DsTeamLogo) zkkVar.c).setVisibility(drawable == null ? 8 : 0);
        ((DsTeamLogo) zkkVar.c).setImageDrawable(drawable);
    }

    public final void setFirstTeamsName(int i) {
        setFirstTeamsName(getContext().getText(i));
    }

    public final void setScore(int i) {
        setScore(getContext().getText(i));
    }

    public final void setScoreModel(p5h0 p5h0Var) {
        p5h0Var.getClass();
        ((SportScore) this.q.g).setScore(p5h0Var);
    }

    public final void setSecondTeamsName(int i) {
        setSecondTeamsName(getContext().getText(i));
    }

    public final void setTopFirstTeamLogo(Drawable drawable) {
        zkk zkkVar = this.q;
        ((DsTeamLogo) zkkVar.h).setVisibility(drawable == null ? 8 : 0);
        ((DsTeamLogo) zkkVar.h).setImageDrawable(drawable);
    }

    public final void setTopSecondTeamLogo(Drawable drawable) {
        zkk zkkVar = this.q;
        ((DsTeamLogo) zkkVar.i).setVisibility(drawable == null ? 8 : 0);
        ((DsTeamLogo) zkkVar.i).setImageDrawable(drawable);
    }

    public final void setFirstTeamsName(CharSequence charSequence) {
        this.q.d.setText(charSequence);
    }

    public final void setScore(CharSequence charSequence) {
        ((SportScore) this.q.g).setText(charSequence);
    }

    public final void setSecondTeamsName(CharSequence charSequence) {
        ((TextView) this.q.e).setText(charSequence);
    }

    public final void setBotFirstTeamLogo(int i) {
        setBotFirstTeamLogo(getContext().getDrawable(i));
    }

    public final void setBotSecondTeamLogo(int i) {
        setBotSecondTeamLogo(getContext().getDrawable(i));
    }

    public final void setTopFirstTeamLogo(int i) {
        setTopFirstTeamLogo(getContext().getDrawable(i));
    }

    public final void setTopSecondTeamLogo(int i) {
        setTopSecondTeamLogo(getContext().getDrawable(i));
    }

    public final void setBotFirstTeamLogo(String str) {
        str.getClass();
        LoadableShapeableImageView.i((DsTeamLogo) this.q.b, str, null, 14);
    }

    public final void setBotSecondTeamLogo(String str) {
        str.getClass();
        LoadableShapeableImageView.i((DsTeamLogo) this.q.c, str, null, 14);
    }

    public final void setTopFirstTeamLogo(String str) {
        str.getClass();
        LoadableShapeableImageView.i((DsTeamLogo) this.q.h, str, null, 14);
    }

    public final void setTopSecondTeamLogo(String str) {
        str.getClass();
        LoadableShapeableImageView.i((DsTeamLogo) this.q.i, str, null, 14);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardMiddlePairTeams(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardMiddlePairTeams(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}

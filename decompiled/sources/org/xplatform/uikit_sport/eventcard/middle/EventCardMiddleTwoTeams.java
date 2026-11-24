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
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;
import org.xplatform.uikit.components.counter.DsCounter;
import org.xplatform.uikit.components.team_logo.DsTeamLogo;
import org.xplatform.uikit.components.views.LoadableShapeableImageView;
import org.xplatform.uikit_sport.score.SportScore;

/* JADX INFO: loaded from: classes6.dex */
public final class EventCardMiddleTwoTeams extends ConstraintLayout implements cbo {
    public final zkk q;

    /* JADX WARN: Illegal instructions before constructor call */
    public EventCardMiddleTwoTeams(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.eventCardMiddleStyle);
        setLayoutDirection(0);
        LayoutInflater.from(context).inflate(R.layout.event_card_middle_two_teams_view, this);
        int i2 = R.id.firstTeamCounter;
        DsCounter dsCounter = (DsCounter) yum0.f(this, R.id.firstTeamCounter);
        if (dsCounter != null) {
            i2 = R.id.firstTeamLogo;
            DsTeamLogo dsTeamLogo = (DsTeamLogo) yum0.f(this, R.id.firstTeamLogo);
            if (dsTeamLogo != null) {
                i2 = R.id.firstTeamName;
                AppCompatTextView appCompatTextView = (AppCompatTextView) yum0.f(this, R.id.firstTeamName);
                if (appCompatTextView != null) {
                    i2 = R.id.score;
                    SportScore sportScore = (SportScore) yum0.f(this, R.id.score);
                    if (sportScore != null) {
                        i2 = R.id.secondTeamCounter;
                        DsCounter dsCounter2 = (DsCounter) yum0.f(this, R.id.secondTeamCounter);
                        if (dsCounter2 != null) {
                            i2 = R.id.secondTeamLogo;
                            DsTeamLogo dsTeamLogo2 = (DsTeamLogo) yum0.f(this, R.id.secondTeamLogo);
                            if (dsTeamLogo2 != null) {
                                i2 = R.id.secondTeamName;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) yum0.f(this, R.id.secondTeamName);
                                if (appCompatTextView2 != null) {
                                    this.q = new zkk(this, dsCounter, dsTeamLogo, appCompatTextView, sportScore, dsCounter2, dsTeamLogo2, appCompatTextView2);
                                    return;
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

    public final void setFirstTeamCounter(Integer num) {
        zkk zkkVar = this.q;
        ((DsCounter) zkkVar.b).setVisibility(num != null ? 0 : 8);
        ((DsCounter) zkkVar.b).setCount(num);
    }

    public final void setFirstTeamLogo(Drawable drawable) {
        zkk zkkVar = this.q;
        DsTeamLogo dsTeamLogo = (DsTeamLogo) zkkVar.c;
        DsTeamLogo dsTeamLogo2 = (DsTeamLogo) zkkVar.c;
        dsTeamLogo.setVisibility(drawable == null ? 8 : 0);
        dsTeamLogo2.setImageTintList(null);
        dsTeamLogo2.g(dsTeamLogo2);
        dsTeamLogo2.setImageDrawable(drawable);
    }

    public final void setFirstTeamLogoVisibility(boolean z) {
        ((DsTeamLogo) this.q.c).setVisibility(z ? 0 : 8);
    }

    public final void setFirstTeamName(CharSequence charSequence) {
        zkk zkkVar = this.q;
        ((AppCompatTextView) zkkVar.g).setText("");
        ((AppCompatTextView) zkkVar.g).setText(charSequence);
    }

    public final void setScore(int i) {
        setScore(getContext().getText(i));
    }

    public final void setScoreModel(p5h0 p5h0Var) {
        p5h0Var.getClass();
        ((SportScore) this.q.d).setScore(p5h0Var);
    }

    public final void setSecondTeamCounter(Integer num) {
        zkk zkkVar = this.q;
        ((DsCounter) zkkVar.e).setVisibility(num != null ? 0 : 8);
        ((DsCounter) zkkVar.e).setCount(num);
    }

    public final void setSecondTeamLogo(Drawable drawable) {
        zkk zkkVar = this.q;
        DsTeamLogo dsTeamLogo = (DsTeamLogo) zkkVar.h;
        DsTeamLogo dsTeamLogo2 = (DsTeamLogo) zkkVar.h;
        dsTeamLogo.setVisibility(drawable == null ? 8 : 0);
        dsTeamLogo2.setImageTintList(null);
        dsTeamLogo2.g(dsTeamLogo2);
        dsTeamLogo2.setImageDrawable(drawable);
    }

    public final void setSecondTeamLogoVisibility(boolean z) {
        ((DsTeamLogo) this.q.h).setVisibility(z ? 0 : 8);
    }

    public final void setSecondTeamName(CharSequence charSequence) {
        zkk zkkVar = this.q;
        ((AppCompatTextView) zkkVar.i).setText("");
        ((AppCompatTextView) zkkVar.i).setText(charSequence);
    }

    public final void u(String str, Drawable drawable) {
        int length = str.length();
        zkk zkkVar = this.q;
        if (length > 0) {
            ((DsTeamLogo) zkkVar.c).setImageTintList(null);
        }
        LoadableShapeableImageView.i((DsTeamLogo) zkkVar.c, str, drawable, 12);
    }

    public final void v(String str, Drawable drawable) {
        int length = str.length();
        zkk zkkVar = this.q;
        if (length > 0) {
            ((DsTeamLogo) zkkVar.h).setImageTintList(null);
        }
        LoadableShapeableImageView.i((DsTeamLogo) zkkVar.h, str, drawable, 12);
    }

    public final void setScore(CharSequence charSequence) {
        ((SportScore) this.q.d).setText(charSequence);
    }

    public final void setFirstTeamName(int i) {
        setFirstTeamName(getContext().getText(i));
    }

    public final void setSecondTeamName(int i) {
        setSecondTeamName(getContext().getText(i));
    }

    public final void setFirstTeamLogo(String str) {
        str.getClass();
        zkk zkkVar = this.q;
        ((DsTeamLogo) zkkVar.c).setImageTintList(null);
        LoadableShapeableImageView.i((DsTeamLogo) zkkVar.c, str, null, 14);
    }

    public final void setSecondTeamLogo(String str) {
        str.getClass();
        zkk zkkVar = this.q;
        ((DsTeamLogo) zkkVar.h).setImageTintList(null);
        LoadableShapeableImageView.i((DsTeamLogo) zkkVar.h, str, null, 14);
    }

    public final void setFirstTeamLogo(int i) {
        setFirstTeamLogo(getContext().getDrawable(i));
    }

    public final void setSecondTeamLogo(int i) {
        ((DsTeamLogo) this.q.h).setImageTintList(null);
        setSecondTeamLogo(getContext().getDrawable(i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardMiddleTwoTeams(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardMiddleTwoTeams(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}

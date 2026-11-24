package org.xplatform.uikit_sport.eventcard.middle;

import a.cbo;
import a.hny;
import a.vd7;
import a.yum0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;
import org.xplatform.uikit.components.team_logo.DsTeamLogo;
import org.xplatform.uikit.components.views.LoadableShapeableImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class EventCardMiddleSingleTeam extends ConstraintLayout implements cbo {
    public final vd7 q;

    /* JADX WARN: Illegal instructions before constructor call */
    public EventCardMiddleSingleTeam(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.eventCardMiddleStyle);
        LayoutInflater.from(context).inflate(R.layout.event_card_middle_single_team_view, this);
        int i2 = R.id.teamLogo;
        DsTeamLogo dsTeamLogo = (DsTeamLogo) yum0.f(this, R.id.teamLogo);
        if (dsTeamLogo != null) {
            i2 = R.id.teamName;
            TextView textView = (TextView) yum0.f(this, R.id.teamName);
            if (textView != null) {
                this.q = new vd7(this, dsTeamLogo, textView, (byte) 13);
                return;
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void setTeamLogo(Drawable drawable) {
        setTeamLogoVisibility(drawable != null);
        ((DsTeamLogo) this.q.c).setImageDrawable(drawable);
    }

    public final void setTeamLogoVisibility(boolean z) {
        vd7 vd7Var = this.q;
        ((DsTeamLogo) vd7Var.c).setVisibility(z ? 0 : 8);
        ((TextView) vd7Var.d).setGravity(z ? 8388611 : 1);
    }

    public final void setTeamName(int i) {
        setTeamName(getContext().getText(i));
    }

    public final void setTeamName(CharSequence charSequence) {
        ((TextView) this.q.d).setText(charSequence);
    }

    public final void setTeamLogo(int i) {
        setTeamLogo(getContext().getDrawable(i));
    }

    public final void setTeamLogo(String str) {
        str.getClass();
        LoadableShapeableImageView.i((DsTeamLogo) this.q.c, str, null, 14);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardMiddleSingleTeam(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardMiddleSingleTeam(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}

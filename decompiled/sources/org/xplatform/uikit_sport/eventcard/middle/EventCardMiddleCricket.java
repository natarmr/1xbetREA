package org.xplatform.uikit_sport.eventcard.middle;

import a.a3e;
import a.a8z;
import a.cbo;
import a.cem0;
import a.dbo;
import a.f5h0;
import a.hny;
import a.maz;
import a.ryl;
import a.t9f;
import a.wez;
import a.yum0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;
import org.xplatform.uikit.components.team_logo.DsTeamLogo;
import org.xplatform.uikit.components.timer.DsTimerWithDescription;
import org.xplatform.uikit.components.views.LoadableShapeableImageView;

/* JADX INFO: loaded from: classes6.dex */
public final class EventCardMiddleCricket extends ConstraintLayout implements cbo {
    public static final /* synthetic */ int s = 0;
    public final dbo q;
    public final a8z r;

    /* JADX WARN: Illegal instructions before constructor call */
    public EventCardMiddleCricket(Context context, AttributeSet attributeSet, int i) {
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet2, R.attr.eventCardMiddleCricketStyle);
        LayoutInflater.from(context).inflate(R.layout.event_card_middle_cricket_view, this);
        int i2 = R.id.botFirstLogo;
        DsTeamLogo dsTeamLogo = (DsTeamLogo) yum0.f(this, R.id.botFirstLogo);
        if (dsTeamLogo != null) {
            i2 = R.id.botGameIndicator;
            ImageView imageView = (ImageView) yum0.f(this, R.id.botGameIndicator);
            if (imageView != null) {
                i2 = R.id.botGameScore;
                TextView textView = (TextView) yum0.f(this, R.id.botGameScore);
                if (textView != null) {
                    i2 = R.id.botResultScore;
                    TextView textView2 = (TextView) yum0.f(this, R.id.botResultScore);
                    if (textView2 != null) {
                        i2 = R.id.botScore;
                        TextView textView3 = (TextView) yum0.f(this, R.id.botScore);
                        if (textView3 != null) {
                            i2 = R.id.botSecondLogo;
                            DsTeamLogo dsTeamLogo2 = (DsTeamLogo) yum0.f(this, R.id.botSecondLogo);
                            if (dsTeamLogo2 != null) {
                                i2 = R.id.botSetScore;
                                TextView textView4 = (TextView) yum0.f(this, R.id.botSetScore);
                                if (textView4 != null) {
                                    i2 = R.id.botTeamName;
                                    TextView textView5 = (TextView) yum0.f(this, R.id.botTeamName);
                                    if (textView5 != null) {
                                        i2 = R.id.gameText;
                                        TextView textView6 = (TextView) yum0.f(this, R.id.gameText);
                                        if (textView6 != null) {
                                            i2 = R.id.infoBarrier;
                                            if (((Barrier) yum0.f(this, R.id.infoBarrier)) != null) {
                                                i2 = R.id.liveInfo;
                                                DsTimerWithDescription dsTimerWithDescription = (DsTimerWithDescription) yum0.f(this, R.id.liveInfo);
                                                if (dsTimerWithDescription != null) {
                                                    i2 = R.id.resultText;
                                                    TextView textView7 = (TextView) yum0.f(this, R.id.resultText);
                                                    if (textView7 != null) {
                                                        i2 = R.id.setText;
                                                        TextView textView8 = (TextView) yum0.f(this, R.id.setText);
                                                        if (textView8 != null) {
                                                            i2 = R.id.teamNameEndBarrier;
                                                            if (((Barrier) yum0.f(this, R.id.teamNameEndBarrier)) != null) {
                                                                i2 = R.id.topFirstLogo;
                                                                DsTeamLogo dsTeamLogo3 = (DsTeamLogo) yum0.f(this, R.id.topFirstLogo);
                                                                if (dsTeamLogo3 != null) {
                                                                    i2 = R.id.topGameIndicator;
                                                                    ImageView imageView2 = (ImageView) yum0.f(this, R.id.topGameIndicator);
                                                                    if (imageView2 != null) {
                                                                        i2 = R.id.topGameScore;
                                                                        TextView textView9 = (TextView) yum0.f(this, R.id.topGameScore);
                                                                        if (textView9 != null) {
                                                                            i2 = R.id.topResultScore;
                                                                            TextView textView10 = (TextView) yum0.f(this, R.id.topResultScore);
                                                                            if (textView10 != null) {
                                                                                i2 = R.id.topScore;
                                                                                TextView textView11 = (TextView) yum0.f(this, R.id.topScore);
                                                                                if (textView11 != null) {
                                                                                    i2 = R.id.topSecondLogo;
                                                                                    DsTeamLogo dsTeamLogo4 = (DsTeamLogo) yum0.f(this, R.id.topSecondLogo);
                                                                                    if (dsTeamLogo4 != null) {
                                                                                        i2 = R.id.topSetScore;
                                                                                        TextView textView12 = (TextView) yum0.f(this, R.id.topSetScore);
                                                                                        if (textView12 != null) {
                                                                                            i2 = R.id.topTeamName;
                                                                                            TextView textView13 = (TextView) yum0.f(this, R.id.topTeamName);
                                                                                            if (textView13 != null) {
                                                                                                this.q = new dbo(this, dsTeamLogo, imageView, textView, textView2, textView3, dsTeamLogo2, textView4, textView5, textView6, dsTimerWithDescription, textView7, textView8, dsTeamLogo3, imageView2, textView9, textView10, textView11, dsTeamLogo4, textView12, textView13);
                                                                                                this.r = maz.a(wez.b, new ryl(context, (byte) 16));
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

    private final Animation getRotateAnimation() {
        return (Animation) this.r.getValue();
    }

    public static void v(TextView textView, f5h0 f5h0Var) {
        int i;
        int iOrdinal = f5h0Var.ordinal();
        if (iOrdinal == 0) {
            i = R.style.TextStyle_Caption_Medium_L_TextPrimary;
        } else if (iOrdinal == 1) {
            i = R.style.TextStyle_Caption_Regular_L_Secondary;
        } else if (iOrdinal == 2) {
            i = R.style.TextStyle_Caption_Medium_L_StaticGreen;
        } else {
            if (iOrdinal != 3) {
                t9f.b();
                return;
            }
            i = R.style.TextStyle_Caption_Regular_L_StaticGreen;
        }
        cem0.n(i, textView);
    }

    public final void A(CharSequence charSequence, f5h0 f5h0Var) {
        f5h0Var.getClass();
        dbo dboVar = this.q;
        TextView textView = dboVar.t;
        TextView textView2 = dboVar.t;
        textView.setVisibility(charSequence.length() == 0 ? 8 : 0);
        textView2.setText(charSequence);
        v(textView2, f5h0Var);
    }

    public final dbo getBinding() {
        return this.q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dbo dboVar = this.q;
        dboVar.o.clearAnimation();
        dboVar.c.clearAnimation();
    }

    public final void setBotFirstLogo(Drawable drawable) {
        dbo dboVar = this.q;
        dboVar.b.setVisibility(drawable == null ? 8 : 0);
        dboVar.b.setImageDrawable(drawable);
    }

    public final void setBotGameIndicator(boolean z) {
        dbo dboVar = this.q;
        dboVar.c.setVisibility(z ? 0 : 8);
        ImageView imageView = dboVar.c;
        if (z) {
            imageView.startAnimation(getRotateAnimation());
        } else {
            imageView.clearAnimation();
        }
    }

    public final void setBotScore(CharSequence charSequence) {
        dbo dboVar = this.q;
        dboVar.f.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        dboVar.f.setText(charSequence);
        w();
    }

    public final void setBotSecondLogo(Drawable drawable) {
        dbo dboVar = this.q;
        dboVar.g.setVisibility(drawable == null ? 8 : 0);
        dboVar.g.setImageDrawable(drawable);
    }

    public final void setBotTeamName(CharSequence charSequence) {
        dbo dboVar = this.q;
        dboVar.i.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        dboVar.i.setText(charSequence);
    }

    public final void setGameStartTime(long j) {
        this.q.k.setGameStartTime(j);
    }

    public final void setGameText(CharSequence charSequence) {
        dbo dboVar = this.q;
        dboVar.j.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        dboVar.j.setText(charSequence);
        u();
    }

    public final void setInfoText(CharSequence charSequence) {
        dbo dboVar = this.q;
        dboVar.k.setVisibility((charSequence == null || charSequence.length() == 0) ? 4 : 0);
        dboVar.k.setSubTitle(charSequence);
    }

    public final void setResultText(CharSequence charSequence) {
        dbo dboVar = this.q;
        dboVar.l.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        dboVar.l.setText(charSequence);
        u();
    }

    public final void setSetText(CharSequence charSequence) {
        dbo dboVar = this.q;
        dboVar.m.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        dboVar.m.setText(charSequence);
        u();
    }

    public final void setTimerVisible(boolean z) {
        this.q.k.setTimerVisible(z);
    }

    public final void setTopFirstLogo(Drawable drawable) {
        dbo dboVar = this.q;
        dboVar.n.setVisibility(drawable == null ? 8 : 0);
        dboVar.n.setImageDrawable(drawable);
    }

    public final void setTopGameIndicator(boolean z) {
        dbo dboVar = this.q;
        dboVar.o.setVisibility(z ? 0 : 8);
        ImageView imageView = dboVar.o;
        if (z) {
            imageView.startAnimation(getRotateAnimation());
        } else {
            imageView.clearAnimation();
        }
    }

    public final void setTopScore(CharSequence charSequence) {
        dbo dboVar = this.q;
        dboVar.r.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        dboVar.r.setText(charSequence);
        w();
    }

    public final void setTopSecondLogo(Drawable drawable) {
        dbo dboVar = this.q;
        dboVar.s.setVisibility(drawable == null ? 8 : 0);
        dboVar.s.setImageDrawable(drawable);
    }

    public final void setTopTeamName(CharSequence charSequence) {
        dbo dboVar = this.q;
        dboVar.u.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        dboVar.u.setText(charSequence);
    }

    public final void u() {
        DsTimerWithDescription dsTimerWithDescription = this.q.k;
        ViewGroup.LayoutParams layoutParams = dsTimerWithDescription.getLayoutParams();
        if (layoutParams == null) {
            hny.u("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        a3e a3eVar = (a3e) layoutParams;
        a3eVar.setMarginEnd(getResources().getDimensionPixelSize(R.dimen.space_8));
        dsTimerWithDescription.setLayoutParams(a3eVar);
    }

    public final void w() {
        DsTimerWithDescription dsTimerWithDescription = this.q.k;
        ViewGroup.LayoutParams layoutParams = dsTimerWithDescription.getLayoutParams();
        if (layoutParams == null) {
            hny.u("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        a3e a3eVar = (a3e) layoutParams;
        a3eVar.setMarginEnd(0);
        dsTimerWithDescription.setLayoutParams(a3eVar);
    }

    public final void x(CharSequence charSequence, f5h0 f5h0Var) {
        f5h0Var.getClass();
        dbo dboVar = this.q;
        TextView textView = dboVar.d;
        TextView textView2 = dboVar.d;
        textView.setVisibility(charSequence.length() == 0 ? 8 : 0);
        textView2.setText(charSequence);
        v(textView2, f5h0Var);
    }

    public final void y(CharSequence charSequence, f5h0 f5h0Var) {
        f5h0Var.getClass();
        dbo dboVar = this.q;
        TextView textView = dboVar.h;
        TextView textView2 = dboVar.h;
        textView.setVisibility(charSequence.length() == 0 ? 8 : 0);
        textView2.setText(charSequence);
        v(textView2, f5h0Var);
    }

    public final void z(CharSequence charSequence, f5h0 f5h0Var) {
        f5h0Var.getClass();
        dbo dboVar = this.q;
        TextView textView = dboVar.p;
        TextView textView2 = dboVar.p;
        textView.setVisibility(charSequence.length() == 0 ? 8 : 0);
        textView2.setText(charSequence);
        v(textView2, f5h0Var);
    }

    public final void setBotFirstLogo(int i) {
        setBotFirstLogo(getContext().getDrawable(i));
    }

    public final void setBotSecondLogo(int i) {
        setBotSecondLogo(getContext().getDrawable(i));
    }

    public final void setTopFirstLogo(int i) {
        setTopFirstLogo(getContext().getDrawable(i));
    }

    public final void setTopSecondLogo(int i) {
        setTopSecondLogo(getContext().getDrawable(i));
    }

    public final void setBotFirstLogo(String str) {
        str.getClass();
        LoadableShapeableImageView.i(this.q.b, str, null, 14);
    }

    public final void setBotSecondLogo(String str) {
        str.getClass();
        LoadableShapeableImageView.i(this.q.g, str, null, 14);
    }

    public final void setTopFirstLogo(String str) {
        str.getClass();
        LoadableShapeableImageView.i(this.q.n, str, null, 14);
    }

    public final void setTopSecondLogo(String str) {
        str.getClass();
        LoadableShapeableImageView.i(this.q.s, str, null, 14);
    }

    public final void setInfoText(int i) {
        setInfoText(getContext().getText(i));
    }

    public final void setBotTeamName(int i) {
        setBotTeamName(getContext().getText(i));
    }

    public final void setTopTeamName(int i) {
        setTopTeamName(getContext().getText(i));
    }

    public final void setBotScore(int i) {
        setBotScore(getContext().getText(i));
    }

    public final void setGameText(int i) {
        setGameText(getContext().getString(i));
    }

    public final void setResultText(int i) {
        setResultText(getContext().getText(i));
    }

    public final void setSetText(int i) {
        setSetText(getContext().getText(i));
    }

    public final void setTopScore(int i) {
        setTopScore(getContext().getText(i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardMiddleCricket(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardMiddleCricket(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}

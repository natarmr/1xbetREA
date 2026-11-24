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
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import org.xbet.client1.R;
import org.xplatform.uikit.components.team_logo.DsTeamLogo;
import org.xplatform.uikit.components.views.LoadableShapeableImageView;
import org.xplatform.uikit_sport.score.SportScore;
import org.xplatform.uikit_sport.victoryindiacator.SportVictoryIndicator;

/* JADX INFO: loaded from: classes6.dex */
public final class EventCardMiddleCyber extends FrameLayout implements cbo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47291a;
    public final int b;
    public final zkk c;

    /* JADX WARN: Illegal instructions before constructor call */
    public EventCardMiddleCyber(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.eventCardMiddleStyle);
        this.f47291a = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.b = getResources().getDimensionPixelSize(R.dimen.space_8);
        LayoutInflater.from(context).inflate(R.layout.event_card_middle_cyber_view, this);
        int i2 = R.id.firstBarrier;
        if (((Barrier) yum0.f(this, R.id.firstBarrier)) != null) {
            i2 = R.id.firstTeamLogo;
            DsTeamLogo dsTeamLogo = (DsTeamLogo) yum0.f(this, R.id.firstTeamLogo);
            if (dsTeamLogo != null) {
                i2 = R.id.firstTeamName;
                TextView textView = (TextView) yum0.f(this, R.id.firstTeamName);
                if (textView != null) {
                    i2 = R.id.firstVictoryIndicator;
                    SportVictoryIndicator sportVictoryIndicator = (SportVictoryIndicator) yum0.f(this, R.id.firstVictoryIndicator);
                    if (sportVictoryIndicator != null) {
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
                                        i2 = R.id.secondVictoryIndicator;
                                        SportVictoryIndicator sportVictoryIndicator2 = (SportVictoryIndicator) yum0.f(this, R.id.secondVictoryIndicator);
                                        if (sportVictoryIndicator2 != null) {
                                            this.c = new zkk(this, dsTeamLogo, textView, sportVictoryIndicator, sportScore, dsTeamLogo2, textView2, sportVictoryIndicator2);
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
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        zkk zkkVar = this.c;
        int measuredWidth = ((SportScore) zkkVar.g).getMeasuredWidth();
        SportScore sportScore = (SportScore) zkkVar.g;
        int measuredHeight = sportScore.getMeasuredHeight();
        int i7 = (i5 - measuredWidth) / 2;
        int i8 = (i6 - measuredHeight) / 2;
        int i9 = measuredWidth + i7;
        sportScore.layout(i7, i8, i9, measuredHeight + i8);
        SportVictoryIndicator sportVictoryIndicator = (SportVictoryIndicator) zkkVar.c;
        int measuredWidth2 = sportVictoryIndicator.getMeasuredWidth();
        int measuredHeight2 = sportVictoryIndicator.getMeasuredHeight();
        int i10 = this.f47291a;
        int i11 = (i7 - measuredWidth2) - i10;
        int i12 = (i6 - measuredHeight2) / 2;
        sportVictoryIndicator.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
        SportVictoryIndicator sportVictoryIndicator2 = (SportVictoryIndicator) zkkVar.i;
        int measuredWidth3 = sportVictoryIndicator2.getMeasuredWidth();
        int measuredHeight3 = sportVictoryIndicator2.getMeasuredHeight();
        int i13 = i9 + i10;
        int i14 = (i6 - measuredHeight3) / 2;
        int i15 = measuredWidth3 + i13;
        sportVictoryIndicator2.layout(i13, i14, i15, measuredHeight3 + i14);
        DsTeamLogo dsTeamLogo = (DsTeamLogo) zkkVar.b;
        int measuredWidth4 = dsTeamLogo.getMeasuredWidth();
        int measuredHeight4 = dsTeamLogo.getMeasuredHeight();
        int i16 = this.b;
        int i17 = (i11 - measuredWidth4) - i16;
        int i18 = (i6 - measuredHeight4) / 2;
        dsTeamLogo.layout(i17, i18, measuredWidth4 + i17, measuredHeight4 + i18);
        DsTeamLogo dsTeamLogo2 = (DsTeamLogo) zkkVar.h;
        int measuredWidth5 = dsTeamLogo2.getMeasuredWidth();
        int measuredHeight5 = dsTeamLogo2.getMeasuredHeight();
        int i19 = i15 + i16;
        int i20 = (i6 - measuredHeight5) / 2;
        int i21 = measuredWidth5 + i19;
        dsTeamLogo2.layout(i19, i20, i21, measuredHeight5 + i20);
        TextView textView = zkkVar.d;
        int measuredWidth6 = textView.getMeasuredWidth();
        int measuredHeight6 = textView.getMeasuredHeight();
        int i22 = (i17 - measuredWidth6) - i16;
        int i23 = (i6 - measuredHeight6) / 2;
        textView.layout(i22, i23, measuredWidth6 + i22, measuredHeight6 + i23);
        TextView textView2 = (TextView) zkkVar.e;
        int measuredWidth7 = textView2.getMeasuredWidth();
        int measuredHeight7 = textView2.getMeasuredHeight();
        int i24 = i21 + i16;
        int i25 = (i6 - measuredHeight7) / 2;
        textView2.layout(i24, i25, measuredWidth7 + i24, measuredHeight7 + i25);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = (this.f47291a * 2) + (this.b * 6);
        zkk zkkVar = this.c;
        int measuredWidth = ((DsTeamLogo) zkkVar.h).getMeasuredWidth() + ((DsTeamLogo) zkkVar.b).getMeasuredWidth();
        int measuredWidth2 = ((((getMeasuredWidth() - measuredWidth) - (((SportVictoryIndicator) zkkVar.i).getMeasuredWidth() + ((SportVictoryIndicator) zkkVar.c).getMeasuredWidth())) - ((SportScore) zkkVar.g).getMeasuredWidth()) - i3) / 2;
        zkkVar.d.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        ((TextView) zkkVar.e).measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public final void setFirstTeamLogo(Drawable drawable) {
        zkk zkkVar = this.c;
        ((DsTeamLogo) zkkVar.b).setVisibility(drawable == null ? 8 : 0);
        ((DsTeamLogo) zkkVar.b).setImageDrawable(drawable);
    }

    public final void setFirstTeamName(CharSequence charSequence) {
        this.c.d.setText(charSequence);
    }

    public final void setScore(CharSequence charSequence) {
        charSequence.getClass();
        ((SportScore) this.c.g).setText(charSequence);
    }

    public final void setScoreModel(p5h0 p5h0Var) {
        p5h0Var.getClass();
        ((SportScore) this.c.g).setScore(p5h0Var);
    }

    public final void setSecondTeamLogo(Drawable drawable) {
        zkk zkkVar = this.c;
        ((DsTeamLogo) zkkVar.h).setVisibility(drawable == null ? 8 : 0);
        ((DsTeamLogo) zkkVar.h).setImageDrawable(drawable);
    }

    public final void setSecondTeamName(CharSequence charSequence) {
        ((TextView) this.c.e).setText(charSequence);
    }

    public final void setFirstTeamLogo(int i) {
        setFirstTeamLogo(getContext().getDrawable(i));
    }

    public final void setSecondTeamLogo(int i) {
        setSecondTeamLogo(getContext().getDrawable(i));
    }

    public final void setFirstTeamLogo(String str) {
        str.getClass();
        LoadableShapeableImageView.i((DsTeamLogo) this.c.b, str, null, 14);
    }

    public final void setSecondTeamLogo(String str) {
        str.getClass();
        LoadableShapeableImageView.i((DsTeamLogo) this.c.h, str, null, 14);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardMiddleCyber(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardMiddleCyber(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}

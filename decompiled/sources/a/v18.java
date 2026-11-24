package a;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.FrameLayout;
import org.xbet.client1.R;
import org.xplatform.uikit_sport.score.SportScore;
import org.xplatform.uikit_sport.victoryindiacator.SportVictoryIndicator;

/* JADX INFO: loaded from: classes6.dex */
public final class v18 extends FrameLayout implements zse, rkg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SportScore f36617a;
    public SportVictoryIndicator b;
    public SportVictoryIndicator c;
    public final int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v18(Context context) {
        super(context, null, 0);
        context.getClass();
        SportScore sportScore = new SportScore(context, null, 6);
        sportScore.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        addView(sportScore);
        this.f36617a = sportScore;
        this.d = getResources().getDimensionPixelSize(R.dimen.space_4);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        v18 v18Var;
        if (this.e && getLayoutDirection() == 1) {
            SportVictoryIndicator sportVictoryIndicator = this.b;
            if (sportVictoryIndicator != null) {
                int i5 = this.i;
                jmu0.f(0, i5, sportVictoryIndicator.getMeasuredWidth() + i5, sportVictoryIndicator.getMeasuredHeight(), sportVictoryIndicator, this);
                v18Var = this;
            } else {
                v18Var = this;
            }
            SportVictoryIndicator sportVictoryIndicator2 = v18Var.c;
            if (sportVictoryIndicator2 != null) {
                int i6 = v18Var.h;
                jmu0.f(i6, v18Var.j, sportVictoryIndicator2.getMeasuredWidth() + i6, v18Var.j + sportVictoryIndicator2.getMeasuredHeight(), sportVictoryIndicator2, v18Var);
            }
        } else {
            v18Var = this;
            SportVictoryIndicator sportVictoryIndicator3 = v18Var.b;
            if (sportVictoryIndicator3 != null) {
                int i7 = v18Var.i;
                sportVictoryIndicator3.layout(0, i7, sportVictoryIndicator3.getMeasuredWidth() + i7, sportVictoryIndicator3.getMeasuredHeight());
            }
            SportVictoryIndicator sportVictoryIndicator4 = v18Var.c;
            if (sportVictoryIndicator4 != null) {
                int i8 = v18Var.h;
                sportVictoryIndicator4.layout(i8, v18Var.j, sportVictoryIndicator4.getMeasuredWidth() + i8, sportVictoryIndicator4.getMeasuredHeight() + v18Var.j);
            }
        }
        int i9 = v18Var.f;
        int i10 = v18Var.g;
        SportScore sportScore = v18Var.f36617a;
        sportScore.layout(i9, i10, sportScore.getMeasuredWidth() + i9, sportScore.getMeasuredHeight() + v18Var.g);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE);
        SportScore sportScore = this.f36617a;
        sportScore.measure(iMakeMeasureSpec, i2);
        SportVictoryIndicator sportVictoryIndicator = this.b;
        if (sportVictoryIndicator != null) {
            sportVictoryIndicator.measure(i, i2);
        }
        SportVictoryIndicator sportVictoryIndicator2 = this.c;
        if (sportVictoryIndicator2 != null) {
            sportVictoryIndicator2.measure(i, i2);
        }
        SportVictoryIndicator sportVictoryIndicator3 = this.b;
        int measuredWidth = sportVictoryIndicator3 != null ? sportVictoryIndicator3.getMeasuredWidth() : 0;
        SportVictoryIndicator sportVictoryIndicator4 = this.c;
        int measuredWidth2 = sportVictoryIndicator4 != null ? sportVictoryIndicator4.getMeasuredWidth() : 0;
        SportVictoryIndicator sportVictoryIndicator5 = this.b;
        int measuredHeight = sportVictoryIndicator5 != null ? sportVictoryIndicator5.getMeasuredHeight() : 0;
        SportVictoryIndicator sportVictoryIndicator6 = this.c;
        int measuredHeight2 = sportVictoryIndicator6 != null ? sportVictoryIndicator6.getMeasuredHeight() : 0;
        SportVictoryIndicator sportVictoryIndicator7 = this.c;
        int measuredWidth3 = sportVictoryIndicator7 != null ? sportVictoryIndicator7.getMeasuredWidth() : 0;
        int i3 = this.d;
        Integer numValueOf = Integer.valueOf((i3 * 2) + measuredWidth3 + measuredWidth);
        if (measuredWidth <= 0 || measuredWidth2 <= 0) {
            numValueOf = null;
        }
        int measuredWidth4 = sportScore.getMeasuredWidth() + (numValueOf != null ? numValueOf.intValue() : 0);
        int iMax = Math.max(sportScore.getMeasuredHeight(), Math.max(measuredHeight, measuredHeight2));
        this.f = (measuredWidth4 / 2) - (sportScore.getMeasuredWidth() / 2);
        int i4 = iMax / 2;
        this.i = i4 - (measuredHeight / 2);
        this.j = i4 - (measuredHeight2 / 2);
        this.h = sportScore.getMeasuredWidth() + (i3 * 2) + measuredWidth;
        this.g = i4 - (sportScore.getMeasuredHeight() / 2);
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(measuredWidth4, 1073741824), View.MeasureSpec.makeMeasureSpec(iMax, 1073741824));
    }

    @Override // a.rkg0
    public void setRtlSupportEnabled(boolean z) {
        this.e = z;
        this.f36617a.setRtlSupportEnabled(z);
        SportVictoryIndicator sportVictoryIndicator = this.b;
        if (sportVictoryIndicator != null) {
            sportVictoryIndicator.setRtlSupportEnabled(z);
        }
        SportVictoryIndicator sportVictoryIndicator2 = this.c;
        if (sportVictoryIndicator2 != null) {
            sportVictoryIndicator2.setRtlSupportEnabled(z);
        }
        invalidate();
        requestLayout();
    }

    @Override // a.zse
    public void setScoreUiModel(yse yseVar) {
        p5h0 n5h0Var;
        yseVar.getClass();
        use useVar = yseVar instanceof use ? (use) yseVar : null;
        if (useVar == null) {
            return;
        }
        if (useVar.g) {
            String str = useVar.f36206a;
            String str2 = useVar.d;
            pip0 pip0Var = useVar.c;
            pip0 pip0Var2 = pip0.CHANGED;
            n5h0Var = new n5h0(str, str2, pip0Var == pip0Var2, useVar.e == pip0Var2);
        } else {
            n5h0Var = o5h0.f24687a;
        }
        this.f36617a.setScore(n5h0Var);
        heu0 heu0Var = useVar.b;
        int i = heu0Var.b;
        int i2 = heu0Var.f12941a;
        SportVictoryIndicator sportVictoryIndicator = this.b;
        if (i == 0) {
            if (sportVictoryIndicator != null) {
                removeView(sportVictoryIndicator);
            }
            this.b = null;
        } else {
            if (sportVictoryIndicator == null) {
                sportVictoryIndicator = new SportVictoryIndicator(new ContextThemeWrapper(getContext(), R.style.Widget_SportVictoryIndicator_Left_Theme), null, 6);
                sportVictoryIndicator.setRtlSupportEnabled(this.e);
                addView(sportVictoryIndicator);
                this.b = sportVictoryIndicator;
            }
            sportVictoryIndicator.b(i, i2);
        }
        heu0 heu0Var2 = useVar.f;
        int i3 = heu0Var2.b;
        int i4 = heu0Var2.f12941a;
        SportVictoryIndicator sportVictoryIndicator2 = this.c;
        if (i3 == 0) {
            if (sportVictoryIndicator2 != null) {
                removeView(sportVictoryIndicator2);
            }
            this.c = null;
        } else {
            if (sportVictoryIndicator2 == null) {
                sportVictoryIndicator2 = new SportVictoryIndicator(new ContextThemeWrapper(getContext(), R.style.Widget_SportVictoryIndicator_Right_Theme), null, 6);
                sportVictoryIndicator2.setRtlSupportEnabled(this.e);
                addView(sportVictoryIndicator2);
                this.c = sportVictoryIndicator2;
            }
            sportVictoryIndicator2.b(i3, i4);
        }
    }
}

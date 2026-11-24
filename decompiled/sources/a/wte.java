package a;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.xplatform.uikit_sport.score.SportScore;

/* JADX INFO: loaded from: classes6.dex */
public final class wte extends FrameLayout implements zse, rkg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SportScore f39736a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wte(Context context) {
        super(context, null, 0);
        context.getClass();
        SportScore sportScore = new SportScore(context, null, 6);
        sportScore.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        addView(sportScore);
        this.f39736a = sportScore;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE);
        SportScore sportScore = this.f39736a;
        sportScore.measure(iMakeMeasureSpec, i2);
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(sportScore.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(sportScore.getMeasuredHeight(), 1073741824));
    }

    @Override // a.rkg0
    public void setRtlSupportEnabled(boolean z) {
        this.f39736a.setRtlSupportEnabled(z);
        requestLayout();
    }

    @Override // a.zse
    public void setScoreUiModel(yse yseVar) {
        yseVar.getClass();
        boolean z = yseVar instanceof vse;
        SportScore sportScore = this.f39736a;
        if (!z) {
            if (yseVar.equals(wse.f39686a)) {
                sportScore.setScore(o5h0.f24687a);
            }
        } else {
            vse vseVar = (vse) yseVar;
            String str = vseVar.f37945a;
            String str2 = vseVar.c;
            pip0 pip0Var = vseVar.b;
            pip0 pip0Var2 = pip0.CHANGED;
            sportScore.setScore(new n5h0(str, str2, pip0Var == pip0Var2, vseVar.d == pip0Var2));
        }
    }
}

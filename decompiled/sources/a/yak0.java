package a;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.FrameLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class yak0 extends FrameLayout implements zse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f3h0 f42304a;
    public final f3h0 b;
    public int c;
    public int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yak0(Context context) {
        super(context, null, 0);
        context.getClass();
        this.f42304a = new f3h0(new ContextThemeWrapper(context, R.style.Widget_ScoreCell_SmallTeamLogo));
        this.b = new f3h0(new ContextThemeWrapper(context, R.style.Widget_ScoreCell_SmallTeamLogo));
        this.e = getResources().getDimensionPixelSize(R.dimen.size_24);
        this.f = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.g = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.h = getResources().getDimensionPixelSize(R.dimen.space_4);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getMeasuredWidth() <= 0 || getMeasuredHeight() <= 0) {
            return;
        }
        f3h0 f3h0Var = this.f42304a;
        int measuredWidth = f3h0Var.getMeasuredWidth();
        f3h0 f3h0Var2 = this.f42304a;
        int measuredHeight = f3h0Var2.getMeasuredHeight();
        int i5 = this.h;
        jmu0.f(0, i5, measuredWidth, measuredHeight + i5, f3h0Var, this);
        int measuredHeight2 = f3h0Var2.getMeasuredHeight() + i5 + this.g;
        f3h0 f3h0Var3 = this.b;
        jmu0.f(0, measuredHeight2, f3h0Var3.getMeasuredWidth(), this.b.getMeasuredHeight() + measuredHeight2, f3h0Var3, f3h0Var3);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.c;
        int i4 = this.e;
        if (i3 > 2) {
            i4 += (i3 - 2) * this.f;
        }
        this.d = i4;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        f3h0 f3h0Var = this.f42304a;
        f3h0Var.measure(iMakeMeasureSpec, i2);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.d, 1073741824);
        f3h0 f3h0Var2 = this.b;
        f3h0Var2.measure(iMakeMeasureSpec2, i2);
        Integer numValueOf = Integer.valueOf((this.h * 2) + f3h0Var2.getMeasuredHeight() + f3h0Var.getMeasuredHeight() + this.g);
        if (f3h0Var.getMeasuredHeight() <= 0 && f3h0Var2.getMeasuredHeight() <= 0) {
            numValueOf = null;
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(this.d, 1073741824), View.MeasureSpec.makeMeasureSpec(numValueOf != null ? numValueOf.intValue() : 0, 1073741824));
    }

    @Override // a.zse
    public void setScoreUiModel(yse yseVar) {
        yseVar.getClass();
        vse vseVar = yseVar instanceof vse ? (vse) yseVar : null;
        if (vseVar == null) {
            return;
        }
        String str = vseVar.c;
        String str2 = vseVar.f37945a;
        f3h0 f3h0Var = this.f42304a;
        f3h0Var.setTeamScore(str2);
        f3h0 f3h0Var2 = this.b;
        f3h0Var2.setTeamScore(str);
        this.c = Math.max(str2.length(), str.length());
        f3h0Var.setTeamScoreState(vseVar.b);
        f3h0Var2.setTeamScoreState(vseVar.d);
        if (f3h0Var.getParent() == null) {
            addView(f3h0Var);
        }
        if (f3h0Var2.getParent() == null) {
            addView(f3h0Var2);
        }
        requestLayout();
    }
}

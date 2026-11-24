package a;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.FrameLayout;
import org.xbet.client1.R;
import org.xplatform.uikit.components.victory_indicator_compact.DsVictoryIndicatorCompact;

/* JADX INFO: loaded from: classes6.dex */
public final class xak0 extends FrameLayout implements zse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f3h0 f40560a;
    public final f3h0 b;
    public final n0o0 c;
    public final n0o0 d;
    public int e;
    public int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xak0(Context context) {
        super(context, null, 0);
        context.getClass();
        this.f40560a = new f3h0(new ContextThemeWrapper(context, R.style.Widget_ScoreCell_SmallTeamLogo));
        this.b = new f3h0(new ContextThemeWrapper(context, R.style.Widget_ScoreCell_SmallTeamLogo));
        this.c = maz.b(new hrf0(context, (byte) 1));
        this.d = maz.b(new hrf0(context, (byte) 2));
        this.g = getResources().getDimensionPixelSize(R.dimen.size_24);
        this.h = getResources().getDimensionPixelSize(R.dimen.size_24);
        this.i = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.j = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.k = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.l = getResources().getDimensionPixelSize(R.dimen.space_4);
    }

    private final DsVictoryIndicatorCompact getFirstTeamVictoryIndicatorView() {
        return (DsVictoryIndicatorCompact) this.c.getValue();
    }

    private final DsVictoryIndicatorCompact getSecondTeamVictoryIndicatorView() {
        return (DsVictoryIndicatorCompact) this.d.getValue();
    }

    private final int getTotalWidth() {
        int iMax = Math.max(getFirstTeamVictoryIndicatorView().getMeasuredWidth(), getSecondTeamVictoryIndicatorView().getMeasuredWidth());
        int i = this.f;
        return iMax + i + (i > 0 ? this.k : 0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getMeasuredWidth() <= 0 || getMeasuredHeight() <= 0) {
            return;
        }
        int i5 = this.h;
        int i6 = i5 / 2;
        int i7 = this.l;
        int i8 = i6 + i7;
        int i9 = this.j;
        int iD = hne.D(i7, i5, i9, i6);
        DsVictoryIndicatorCompact firstTeamVictoryIndicatorView = getFirstTeamVictoryIndicatorView();
        jmu0.f(0, i8 - (firstTeamVictoryIndicatorView.getMeasuredHeight() / 2), firstTeamVictoryIndicatorView.getMeasuredWidth(), (firstTeamVictoryIndicatorView.getMeasuredHeight() / 2) + i8, firstTeamVictoryIndicatorView, this);
        DsVictoryIndicatorCompact secondTeamVictoryIndicatorView = getSecondTeamVictoryIndicatorView();
        jmu0.f(0, iD - (secondTeamVictoryIndicatorView.getMeasuredHeight() / 2), secondTeamVictoryIndicatorView.getMeasuredWidth(), (secondTeamVictoryIndicatorView.getMeasuredHeight() / 2) + iD, secondTeamVictoryIndicatorView, this);
        int iMax = Math.max(getFirstTeamVictoryIndicatorView().getMeasuredWidth(), getSecondTeamVictoryIndicatorView().getMeasuredWidth()) + this.k;
        jmu0.f(iMax, this.l, getMeasuredWidth(), getMeasuredHeight(), this.f40560a, this);
        f3h0 f3h0Var = this.f40560a;
        jmu0.f(iMax, f3h0Var.getMeasuredHeight() + i7 + i9, getMeasuredWidth(), f3h0Var.getMeasuredHeight() + i7 + i9 + getMeasuredHeight(), this.b, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4 = this.e;
        if (i4 == 0) {
            i3 = 0;
        } else {
            int i5 = this.g;
            i3 = i4 <= 2 ? i5 : ((i4 - 2) * this.i) + i5;
        }
        this.f = i3;
        this.f40560a.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        this.b.measure(View.MeasureSpec.makeMeasureSpec(this.f, 1073741824), i2);
        getFirstTeamVictoryIndicatorView().measure(i, i2);
        getSecondTeamVictoryIndicatorView().measure(i, i2);
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec((this.h * 2) + this.j + this.l, 1073741824));
    }

    @Override // a.zse
    public void setScoreUiModel(yse yseVar) {
        yseVar.getClass();
        use useVar = yseVar instanceof use ? (use) yseVar : null;
        if (useVar == null) {
            return;
        }
        String str = useVar.d;
        String str2 = useVar.f36206a;
        boolean z = ((use) yseVar).g;
        f3h0 f3h0Var = this.b;
        f3h0 f3h0Var2 = this.f40560a;
        if (z) {
            f3h0Var2.setTeamScore(str2);
            f3h0Var.setTeamScore(str);
            f3h0Var2.setTeamScoreState(useVar.c);
            f3h0Var.setTeamScoreState(useVar.e);
            this.e = Math.max(str2.length(), str.length());
        }
        DsVictoryIndicatorCompact firstTeamVictoryIndicatorView = getFirstTeamVictoryIndicatorView();
        heu0 heu0Var = useVar.b;
        firstTeamVictoryIndicatorView.b(heu0Var.b, heu0Var.f12941a);
        DsVictoryIndicatorCompact secondTeamVictoryIndicatorView = getSecondTeamVictoryIndicatorView();
        heu0 heu0Var2 = useVar.f;
        secondTeamVictoryIndicatorView.b(heu0Var2.b, heu0Var2.f12941a);
        if (f3h0Var2.getParent() == null) {
            addView(f3h0Var2);
        }
        if (f3h0Var.getParent() == null) {
            addView(f3h0Var);
        }
        if (getFirstTeamVictoryIndicatorView().getParent() == null) {
            addView(getFirstTeamVictoryIndicatorView());
        }
        if (getSecondTeamVictoryIndicatorView().getParent() == null) {
            addView(getSecondTeamVictoryIndicatorView());
        }
        requestLayout();
    }
}

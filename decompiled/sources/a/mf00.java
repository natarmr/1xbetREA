package a;

import android.widget.AbsListView;

/* JADX INFO: loaded from: classes.dex */
public final class mf00 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ of00 f21674a;

    public mf00(of00 of00Var) {
        this.f21674a = of00Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        of00 of00Var = this.f21674a;
        lf00 lf00Var = of00Var.r;
        xd3 xd3Var = of00Var.z;
        if (i != 1 || xd3Var.getInputMethodMode() == 2 || xd3Var.getContentView() == null) {
            return;
        }
        of00Var.v.removeCallbacks(lf00Var);
        lf00Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}

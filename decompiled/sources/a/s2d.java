package a;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class s2d implements ub3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CollapsingToolbarLayout f31496a;

    public s2d(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f31496a = collapsingToolbarLayout;
    }

    @Override // a.ub3
    public final void a(AppBarLayout appBarLayout, int i) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.f31496a;
        f2d f2dVar = collapsingToolbarLayout.m;
        f2d f2dVar2 = collapsingToolbarLayout.l;
        collapsingToolbarLayout.B = i;
        xiv0 xiv0Var = collapsingToolbarLayout.h1;
        int iD = xiv0Var != null ? xiv0Var.d() : 0;
        int childCount = collapsingToolbarLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = collapsingToolbarLayout.getChildAt(i2);
            r2d r2dVar = (r2d) childAt.getLayoutParams();
            ziu0 ziu0VarB = CollapsingToolbarLayout.b(childAt);
            int i3 = r2dVar.f29726a;
            if (i3 == 1) {
                ziu0VarB.b(r7x.u(-i, 0, ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.b(childAt).b) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((r2d) childAt.getLayoutParams())).bottomMargin));
            } else if (i3 == 2) {
                ziu0VarB.b(Math.round((-i) * r2dVar.b));
            }
        }
        collapsingToolbarLayout.d();
        if (collapsingToolbarLayout.s != null && iD > 0) {
            collapsingToolbarLayout.postInvalidateOnAnimation();
        }
        int height = collapsingToolbarLayout.getHeight();
        int minimumHeight = (height - collapsingToolbarLayout.getMinimumHeight()) - iD;
        int scrimVisibleHeightTrigger = height - collapsingToolbarLayout.getScrimVisibleHeightTrigger();
        int i4 = collapsingToolbarLayout.B + minimumHeight;
        float f = minimumHeight;
        float fAbs = Math.abs(i) / f;
        float f2 = scrimVisibleHeightTrigger / f;
        float fMin = Math.min(1.0f, f2);
        f2dVar2.d = fMin;
        f2dVar2.e = rw2.a(1.0f, fMin, 0.5f, fMin);
        f2dVar2.f = i4;
        f2dVar2.A(fAbs);
        float fMin2 = Math.min(1.0f, f2);
        f2dVar.d = fMin2;
        f2dVar.e = rw2.a(1.0f, fMin2, 0.5f, fMin2);
        f2dVar.f = i4;
        f2dVar.A(fAbs);
    }
}

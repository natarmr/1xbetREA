package a;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar$ScrollingViewBehavior;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qrv extends yiu0 {
    public final Rect c;
    public final Rect d;
    public int e;
    public int f;

    public qrv() {
        this.c = new Rect();
        this.d = new Rect();
        this.e = 0;
    }

    @Override // a.yke
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        AppBarLayout appBarLayoutA;
        xiv0 lastWindowInsets;
        int i4 = view.getLayoutParams().height;
        if ((i4 != -1 && i4 != -2) || (appBarLayoutA = AppBarLayout.ScrollingViewBehavior.A(coordinatorLayout.k(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (appBarLayoutA.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.a() + lastWindowInsets.d();
        }
        int totalScrollRange = appBarLayoutA.getTotalScrollRange() + size;
        int measuredHeight = appBarLayoutA.getMeasuredHeight();
        if (this instanceof SearchBar$ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            totalScrollRange -= measuredHeight;
        }
        coordinatorLayout.s(i, i2, View.MeasureSpec.makeMeasureSpec(totalScrollRange, i4 == -1 ? 1073741824 : Integer.MIN_VALUE), view);
        return true;
    }

    @Override // a.yiu0
    public final void y(CoordinatorLayout coordinatorLayout, View view, int i) {
        AppBarLayout appBarLayoutA = AppBarLayout.ScrollingViewBehavior.A(coordinatorLayout.k(view));
        if (appBarLayoutA == null) {
            coordinatorLayout.r(view, i);
            this.e = 0;
            return;
        }
        ble bleVar = (ble) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) bleVar).leftMargin;
        int bottom = appBarLayoutA.getBottom() + ((ViewGroup.MarginLayoutParams) bleVar).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) bleVar).rightMargin;
        int bottom2 = ((appBarLayoutA.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) bleVar).bottomMargin;
        Rect rect = this.c;
        rect.set(paddingLeft, bottom, width, bottom2);
        xiv0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left = lastWindowInsets.b() + rect.left;
            rect.right -= lastWindowInsets.c();
        }
        int i2 = bleVar.c;
        if (i2 == 0) {
            i2 = 8388659;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.d;
        Gravity.apply(i2, measuredWidth, measuredHeight, rect, rect2, i);
        int iZ = z(appBarLayoutA);
        view.layout(rect2.left, rect2.top - iZ, rect2.right, rect2.bottom - iZ);
        this.e = rect2.top - appBarLayoutA.getBottom();
    }

    public final int z(View view) {
        int i;
        if (this.f == 0) {
            return 0;
        }
        float f = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            yke ykeVar = ((ble) appBarLayout.getLayoutParams()).f2790a;
            int iA = ykeVar instanceof AppBarLayout.BaseBehavior ? ((AppBarLayout.BaseBehavior) ykeVar).A() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + iA > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                f = (iA / i) + 1.0f;
            }
        }
        int i2 = this.f;
        return r7x.u((int) (f * i2), 0, i2);
    }

    public qrv(int i) {
        super(0);
        this.c = new Rect();
        this.d = new Rect();
        this.e = 0;
    }
}

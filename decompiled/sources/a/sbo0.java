package a;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class sbo0 extends LinearLayout {
    public static final /* synthetic */ int c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ValueAnimator f31945a;
    public final /* synthetic */ TabLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbo0(TabLayout tabLayout, Context context) {
        super(context);
        this.b = tabLayout;
        setWillNotDraw(false);
    }

    public final void a(int i) {
        TabLayout tabLayout = this.b;
        if (tabLayout.x1 == 0 || (tabLayout.getTabSelectedIndicator().getBounds().left == -1 && tabLayout.getTabSelectedIndicator().getBounds().right == -1)) {
            View childAt = getChildAt(i);
            g9m0 g9m0Var = tabLayout.l1;
            Drawable drawable = tabLayout.o;
            g9m0Var.getClass();
            RectF rectFA = g9m0.a(tabLayout, childAt);
            drawable.setBounds((int) rectFA.left, drawable.getBounds().top, (int) rectFA.right, drawable.getBounds().bottom);
            tabLayout.f45580a = i;
        }
    }

    public final void b(int i) {
        TabLayout tabLayout = this.b;
        Rect bounds = tabLayout.o.getBounds();
        tabLayout.o.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    public final void c(View view, View view2, float f) {
        TabLayout tabLayout = this.b;
        if (view == null || view.getWidth() <= 0) {
            Drawable drawable = tabLayout.o;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.o.getBounds().bottom);
        } else {
            tabLayout.l1.f(tabLayout, view, view2, f, tabLayout.o);
        }
        postInvalidateOnAnimation();
    }

    public final void d(int i, int i2, boolean z) {
        TabLayout tabLayout = this.b;
        if (tabLayout.f45580a == i) {
            return;
        }
        View childAt = getChildAt(tabLayout.getSelectedTabPosition());
        View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            a(tabLayout.getSelectedTabPosition());
            return;
        }
        tabLayout.f45580a = i;
        rbo0 rbo0Var = new rbo0(this, childAt, childAt2);
        if (!z) {
            this.f31945a.removeAllUpdateListeners();
            this.f31945a.addUpdateListener(rbo0Var);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f31945a = valueAnimator;
        valueAnimator.setInterpolator(tabLayout.m1);
        valueAnimator.setDuration(i2);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(rbo0Var);
        valueAnimator.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        TabLayout tabLayout = this.b;
        int iHeight = tabLayout.o.getBounds().height();
        if (iHeight < 0) {
            iHeight = tabLayout.o.getIntrinsicHeight();
        }
        int i = tabLayout.B;
        if (i == 0) {
            height = getHeight() - iHeight;
            iHeight = getHeight();
        } else if (i != 1) {
            height = 0;
            if (i != 2) {
                iHeight = i != 3 ? 0 : getHeight();
            }
        } else {
            height = (getHeight() - iHeight) / 2;
            iHeight = (getHeight() + iHeight) / 2;
        }
        if (tabLayout.o.getBounds().width() > 0) {
            Rect bounds = tabLayout.o.getBounds();
            tabLayout.o.setBounds(bounds.left, height, bounds.right, iHeight);
            tabLayout.o.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.f31945a;
        TabLayout tabLayout = this.b;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            d(tabLayout.getSelectedTabPosition(), -1, false);
            return;
        }
        int selectedTabPosition = tabLayout.f45580a;
        if (selectedTabPosition == -1) {
            selectedTabPosition = tabLayout.getSelectedTabPosition();
            tabLayout.f45580a = selectedTabPosition;
        }
        a(selectedTabPosition);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        TabLayout tabLayout = this.b;
        boolean z = true;
        if (tabLayout.z == 1 || tabLayout.f1 == 2) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    iMax = Math.max(iMax, childAt.getMeasuredWidth());
                }
            }
            if (iMax <= 0) {
                return;
            }
            if (iMax * childCount <= getMeasuredWidth() - (((int) afn0.l(16, getContext())) * 2)) {
                boolean z2 = false;
                for (int i4 = 0; i4 < childCount; i4++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                    if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                        layoutParams.width = iMax;
                        layoutParams.weight = 0.0f;
                        z2 = true;
                    }
                }
                z = z2;
            } else {
                tabLayout.z = 0;
                tabLayout.n(false);
            }
            if (z) {
                super.onMeasure(i, i2);
            }
        }
    }
}

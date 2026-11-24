package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class bcg0 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2356a;
    public final int b;
    public View c;
    public final acg0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcg0(Context context) {
        super(context, null, 0);
        context.getClass();
        this.f2356a = getResources().getDimensionPixelSize(R.dimen.size_56);
        this.b = getResources().getDimensionPixelSize(R.dimen.size_48);
        acg0 acg0Var = new acg0(context);
        acg0Var.setId(jmu0.d());
        this.d = acg0Var;
        addView(acg0Var);
    }

    public final void a() {
        acg0 acg0Var = this.d;
        ArrayList arrayList = acg0Var.e;
        if (arrayList.contains(acg0Var.h)) {
            return;
        }
        arrayList.add(0, acg0Var.h);
        acg0Var.f.add(0, acg0Var.g);
        acg0Var.addView(acg0Var.h, 0);
        acg0Var.c = false;
        acg0Var.requestLayout();
    }

    public final void b() {
        View view = this.c;
        if (view != null) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            view.setVisibility(8);
            this.d.setVisibility(0);
        }
        this.c = null;
    }

    public final int getButtonsActualWidth() {
        return getVisibleButtonsCount() * this.b;
    }

    public final boolean getSearchFieldOpenedState() {
        return this.d.getSearchFieldOpenedState();
    }

    public final int getVisibleButtonsCount() {
        return this.d.getVisibleButtons().size();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int size = this.d.getVisibleButtons().size();
        int i5 = this.b;
        jmu0.f(0, 0, size * i5, i5, this.d, this);
        View view = this.c;
        if (view != null) {
            jmu0.f(0, 0, view.getMeasuredWidth(), this.b, view, this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f2356a, 1073741824);
        int size = View.MeasureSpec.getSize(i);
        int visibleButtonsCount = getVisibleButtonsCount();
        int i3 = this.b;
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(visibleButtonsCount * i3, 1073741824);
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        acg0 acg0Var = this.d;
        acg0Var.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
        int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        View view = this.c;
        if (view != null) {
            measureChild(view, iMakeMeasureSpec4, iMakeMeasureSpec5);
        }
        int measuredWidth = acg0Var.getMeasuredWidth();
        View view2 = this.c;
        setMeasuredDimension(Math.min(size, Math.max(measuredWidth, Math.max(view2 != null ? view2.getMeasuredWidth() : 0, i3))), iMakeMeasureSpec);
    }

    public final void setButtonsAlpha(float f) {
        this.d.setButtonsAlpha(f);
    }

    public final void setButtonsBackgroundsColor(Integer num) {
        this.d.setButtonsBackgroundsColor(num);
    }

    public final void setButtonsScale(float f) {
        this.d.setButtonsScale(f);
    }

    public final void setButtonsTranslationY(float f) {
        this.d.setButtonsTranslationY(f);
    }

    public final void setCustomView(View view) {
        view.getClass();
        b();
        this.d.setVisibility(8);
        view.setVisibility(0);
        addView(view);
        this.c = view;
    }

    public final void setNavigationBarButtonsColorStateList(ColorStateList colorStateList) {
        this.d.setNavigationBarButtonsColorStateList(colorStateList);
    }

    public final void setButtonsBackgroundsColor(ColorStateList colorStateList) {
        this.d.setButtonsBackgroundsColor(colorStateList);
    }
}

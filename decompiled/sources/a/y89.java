package a;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import org.xbet.client1.R;
import org.xplatform.uikit.components.counter.DsCounter;

/* JADX INFO: loaded from: classes6.dex */
public final class y89 extends FrameLayout implements xoe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42185a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public tdo0 i;
    public ymx j;
    public final ImageView k;
    public final AppCompatTextView l;
    public final DsCounter m;
    public final if5 n;
    public int o;
    public final ObjectAnimator p;
    public final ValueAnimator q;
    public final ValueAnimator r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y89(Context context, boolean z) {
        super(context, null);
        context.getClass();
        this.f42185a = getResources().getDimensionPixelSize(R.dimen.size_24);
        this.b = getResources().getDimensionPixelSize(R.dimen.size_18);
        this.c = getResources().getDimensionPixelSize(R.dimen.size_28);
        this.d = getResources().getDimensionPixelOffset(R.dimen.space_14);
        this.e = getResources().getDimensionPixelOffset(R.dimen.space_16);
        this.f = getResources().getDimensionPixelOffset(R.dimen.space_8);
        int color = z ? context.getColor(R.color.static_white_40) : m5d.b(R.attr.uikitSecondary, context);
        this.g = color;
        int color2 = z ? context.getColor(R.color.static_white) : m5d.b(R.attr.uikitPrimary, context);
        this.h = color2;
        this.j = ivb0.b;
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.icon);
        imageView.setBackground(null);
        byte b = 1;
        imageView.setDuplicateParentStateEnabled(true);
        imageView.setColorFilter(imageView.isSelected() ? color2 : color, PorterDuff.Mode.SRC_IN);
        this.k = imageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        aem0.r(appCompatTextView, 10, 12, 1, 2);
        appCompatTextView.setGravity(17);
        appCompatTextView.setMaxLines(2);
        appCompatTextView.setAlpha(0.0f);
        appCompatTextView.setTextAppearance(R.style.TextAppearance_Caption_Medium_L);
        appCompatTextView.setTextColor(color2);
        this.l = appCompatTextView;
        DsCounter dsCounter = new DsCounter(context, null, 6);
        dsCounter.setComponentStyle(r0m.m);
        this.m = dsCounter;
        if5 if5Var = new if5(imageView, new vb8((Object) this, (byte) 20));
        this.n = if5Var;
        this.o = color;
        ObjectAnimator objectAnimatorOfArgb = ObjectAnimator.ofArgb(imageView, new x89(this), 0);
        objectAnimatorOfArgb.setDuration(300L);
        this.p = objectAnimatorOfArgb;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(new float[0]);
        valueAnimatorOfFloat.addUpdateListener(new fd5(this, b));
        valueAnimatorOfFloat.setDuration(300L);
        this.q = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 1);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        this.r = valueAnimatorOfInt;
        setWillNotDraw(false);
        addView(imageView);
        addView(appCompatTextView);
        setClickable(true);
        setFocusable(true);
        if5Var.f(null, R.attr.tabBarItemStyle);
    }

    public final ValueAnimator getAnimator() {
        return this.r;
    }

    public final int getCalculatedWidth() {
        return this.s;
    }

    public Integer getCount() {
        return this.m.getCount();
    }

    public final AppCompatTextView getDescriptionView() {
        return this.l;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        Integer count = this.m.getCount();
        int iIntValue = count != null ? count.intValue() : 0;
        int i2 = R.attr.state_counted;
        if (iIntValue <= 0) {
            i2 = -R.attr.state_counted;
        }
        int[] iArrMergeDrawableStates = View.mergeDrawableStates(iArrOnCreateDrawableState, new int[]{i2});
        iArrMergeDrawableStates.getClass();
        return iArrMergeDrawableStates;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.p.cancel();
        this.q.cancel();
        this.r.cancel();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iIntValue;
        int layoutDirection = getLayoutDirection();
        int i5 = this.b;
        DsCounter dsCounter = this.m;
        int i6 = this.c;
        int i7 = this.d;
        int i8 = this.e;
        int i9 = this.f;
        AppCompatTextView appCompatTextView = this.l;
        ImageView imageView = this.k;
        int i10 = this.f42185a;
        if (layoutDirection == 0 && isSelected()) {
            int i11 = i3 - i;
            int iMin = Math.min(this.s, i11);
            ViewParent parent = getParent();
            parent.getClass();
            Integer num = ((a99) parent).getTitleTabWidths().get(getTag());
            iIntValue = num != null ? num.intValue() : 0;
            int iMin2 = (iMin / 2) - (Math.min((i10 + i9) + iIntValue, i11) / 2);
            int top = getTop() + i8;
            int top2 = getTop() + i7;
            int i12 = iMin2 + i10;
            imageView.layout(iMin2, top, i12, i10 + top);
            int i13 = i12 + i9;
            appCompatTextView.layout(i13, top2, iIntValue + i13, i6 + top2);
            int i14 = iMin2 + i7;
            int i15 = top + i9;
            dsCounter.layout(i14, i15, i14 + i5, i5 + i15);
            return;
        }
        if (getLayoutDirection() != 0 && isSelected()) {
            int i16 = i3 - i;
            int iMin3 = Math.min(this.s, i16);
            ViewParent parent2 = getParent();
            parent2.getClass();
            Integer num2 = ((a99) parent2).getTitleTabWidths().get(getTag());
            iIntValue = num2 != null ? num2.intValue() : 0;
            int iMin4 = (Math.min((i10 + i9) + iIntValue, i16) / 2) + (iMin3 / 2);
            int top3 = getTop() + i8;
            int top4 = getTop() + i7;
            int i17 = iMin4 - i10;
            imageView.layout(i17, top3, iMin4, i10 + top3);
            int i18 = i17 - i9;
            appCompatTextView.layout(i18 - iIntValue, top4, i18, i6 + top4);
            int i19 = iMin4 - i7;
            int i20 = top3 + i9;
            dsCounter.layout(i19 - i5, i20, i19, i5 + i20);
            return;
        }
        if (getLayoutDirection() == 0 && !isSelected()) {
            int iMax = Math.max(this.s, i3 - i) / 2;
            int i21 = i10 / 2;
            int i22 = iMax - i21;
            int bottom = ((getBottom() - getTop()) / 2) - i21;
            imageView.layout(i22, bottom, i22 + i10, i10 + bottom);
            appCompatTextView.layout(0, 0, 0, 0);
            int i23 = i22 + i7;
            int i24 = bottom + i9;
            dsCounter.layout(i23, i24, i23 + i5, i5 + i24);
            return;
        }
        if (getLayoutDirection() == 0 || isSelected()) {
            return;
        }
        int iMax2 = Math.max(this.s, i3 - i) / 2;
        int i25 = i10 / 2;
        int i26 = iMax2 + i25;
        int bottom2 = ((getBottom() - getTop()) / 2) - i25;
        imageView.layout(i26 - i10, bottom2, i26, i10 + bottom2);
        appCompatTextView.layout(0, 0, 0, 0);
        int i27 = i26 - i7;
        int i28 = bottom2 + i9;
        dsCounter.layout(i27 - i5, i28, i27, i5 + i28);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        ViewParent parent = getParent();
        parent.getClass();
        Integer num = ((a99) parent).getTitleTabWidths().get(getTag());
        int iIntValue = num != null ? num.intValue() : 0;
        int i3 = this.f42185a;
        this.k.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        this.l.measure(View.MeasureSpec.makeMeasureSpec(iIntValue, 1073741824), View.MeasureSpec.makeMeasureSpec(this.c, 1073741824));
        int i4 = this.b;
        this.m.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final boolean performClick() {
        ymx ymxVar = this.j;
        ymxVar.getClass();
        if (SystemClock.uptimeMillis() - ivb0.c <= ymxVar.f42912a) {
            return false;
        }
        setSelected(true);
        return super.performClick();
    }

    public final void setCalculatedWidth(int i) {
        this.s = i;
    }

    @Override // a.xoe
    public void setCount(Integer num) {
        DsCounter dsCounter = this.m;
        dsCounter.setCount(num);
        if (dsCounter.getParent() == null) {
            addView(dsCounter);
        }
        refreshDrawableState();
    }

    public final void setIcon(Drawable drawable) {
        ImageView imageView = this.k;
        imageView.setImageDrawable(drawable);
        imageView.setVisibility(drawable != null ? 0 : 8);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (onClickListener instanceof cjj) {
            this.j = ((cjj) onClickListener).d;
        }
        super.setOnClickListener(onClickListener);
    }

    public final void setSelect(boolean z) {
        if (z == isSelected()) {
            return;
        }
        boolean zIsSelected = isSelected();
        int i = this.g;
        int i2 = this.h;
        int i3 = zIsSelected ? i2 : i;
        if (z) {
            i = i2;
        }
        int[] iArr = {i3, i};
        ObjectAnimator objectAnimator = this.p;
        objectAnimator.setIntValues(iArr);
        if (z) {
            ValueAnimator valueAnimator = this.q;
            valueAnimator.setFloatValues(0.0f, 1.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimator, valueAnimator);
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.start();
        } else {
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(objectAnimator);
            animatorSet2.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet2.start();
            this.l.setAlpha(0.0f);
        }
        super.setSelected(z);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        tdo0 tdo0Var;
        if (!z || (tdo0Var = this.i) == null) {
            return;
        }
        tdo0Var.j(this);
    }

    public final void setTabSelectListener(tdo0 tdo0Var) {
        this.i = tdo0Var;
    }

    public final void setText(CharSequence charSequence) {
        AppCompatTextView appCompatTextView = this.l;
        appCompatTextView.setText(charSequence);
        appCompatTextView.setVisibility(charSequence == null || charSequence.length() == 0 ? 8 : 0);
    }
}

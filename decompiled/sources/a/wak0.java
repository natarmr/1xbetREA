package a;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.xbet.client1.R;
import org.xplatform.uikit.components.badges.DsBadge;
import org.xplatform.uikit.components.counter.DsCounter;

/* JADX INFO: loaded from: classes6.dex */
public final class wak0 extends FrameLayout implements xoe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38832a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public tdo0 g;
    public ymx h;
    public boolean i;
    public final float j;
    public final byte k;
    public final byte l;
    public final ImageView m;
    public final TextView n;
    public final DsCounter o;
    public final if5 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wak0(Context context, boolean z) {
        super(context, null);
        context.getClass();
        this.f38832a = getResources().getDimensionPixelSize(R.dimen.size_24);
        this.b = getResources().getDimensionPixelSize(R.dimen.size_18);
        this.c = getResources().getDimensionPixelOffset(R.dimen.space_14);
        this.d = getResources().getDimensionPixelOffset(R.dimen.space_8);
        int color = z ? context.getColor(R.color.static_white_40) : m5d.b(R.attr.uikitSecondary, context);
        this.e = color;
        int color2 = z ? context.getColor(R.color.static_white) : m5d.b(R.attr.uikitPrimary, context);
        this.f = color2;
        this.h = ivb0.b;
        this.i = true;
        this.j = 1.2f;
        this.k = (byte) 100;
        this.l = (byte) 30;
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.icon);
        imageView.setTag("SmallTabIconView");
        imageView.setBackground(null);
        imageView.setDuplicateParentStateEnabled(true);
        imageView.setColorFilter(imageView.isSelected() ? color2 : color, PorterDuff.Mode.SRC_IN);
        this.m = imageView;
        TextView textView = new TextView(context);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setGravity(17);
        textView.setTextAppearance(R.style.TextAppearance_Caption_Medium_L);
        textView.setTextColor(textView.isSelected() ? color2 : color);
        this.n = textView;
        DsCounter dsCounter = new DsCounter(context, null, 6);
        dsCounter.setComponentStyle(r0m.m);
        this.o = dsCounter;
        if5 if5Var = new if5(imageView, new goi0(this, (byte) 8));
        this.p = if5Var;
        addView(imageView);
        addView(textView);
        setClickable(true);
        setFocusable(true);
        if5Var.f(null, R.attr.tabBarItemStyle);
    }

    public final void a(boolean z) {
        this.p.a(z ? vf5.b : null);
    }

    public final void b(int i) {
        this.o.i(i);
        Integer numValueOf = Integer.valueOf(i);
        if5 if5Var = this.p;
        if5Var.g = numValueOf;
        DsBadge dsBadge = if5Var.c;
        if (dsBadge != null) {
            dsBadge.d.e(i);
        }
    }

    public Integer getCount() {
        return this.o.getCount();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        Integer count = this.o.getCount();
        int iIntValue = count != null ? count.intValue() : 0;
        int i2 = R.attr.state_counted;
        if (iIntValue <= 0) {
            i2 = -R.attr.state_counted;
        }
        int[] iArrMergeDrawableStates = View.mergeDrawableStates(iArrOnCreateDrawableState, new int[]{i2});
        iArrMergeDrawableStates.getClass();
        return iArrMergeDrawableStates;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView = this.m;
        int measuredWidth = ((i3 - i) / 2) - (imageView.getMeasuredWidth() / 2);
        int measuredHeight = i4 - imageView.getMeasuredHeight();
        TextView textView = this.n;
        int measuredHeight2 = measuredHeight - textView.getMeasuredHeight();
        int i5 = this.d;
        int i6 = (measuredHeight2 - i5) - i2;
        imageView.layout(measuredWidth, i6, imageView.getMeasuredWidth() + measuredWidth, ((i4 - textView.getMeasuredHeight()) - i5) - i2);
        int i7 = this.c;
        int i8 = this.b;
        jmu0.f(measuredWidth + i7, i6 + i5, measuredWidth + i7 + i8, i6 + i5 + i8, this.o, this);
        textView.layout(0, ((i4 - textView.getMeasuredHeight()) - i5) - i2, textView.getMeasuredWidth(), (i4 - i5) - i2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.f38832a;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        ImageView imageView = this.m;
        imageView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        TextView textView = this.n;
        textView.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
        int i4 = this.b;
        this.o.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        int measuredHeight = textView.getMeasuredHeight() + imageView.getMeasuredHeight() + this.d;
        ViewParent parent = getParent();
        kao0 kao0Var = parent instanceof kao0 ? (kao0) parent : null;
        if (kao0Var != null) {
            kao0Var.setMaxItemHeight(measuredHeight);
        }
        setMeasuredDimension(size, measuredHeight);
    }

    @Override // android.view.View
    public final boolean performClick() {
        ymx ymxVar = this.h;
        ymxVar.getClass();
        if (SystemClock.uptimeMillis() - ivb0.c <= ymxVar.f42912a) {
            return false;
        }
        setSelected(true);
        if (this.i) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = this.m.animate();
            float f = this.j;
            viewPropertyAnimatorAnimate.scaleX(f).scaleY(f).setDuration(this.k).setInterpolator(new AccelerateInterpolator()).withEndAction(new vak0(this, (byte) 0)).start();
        }
        return super.performClick();
    }

    @Override // a.xoe
    public void setCount(Integer num) {
        DsCounter dsCounter = this.o;
        dsCounter.setCount(num);
        if (dsCounter.getParent() == null) {
            addView(dsCounter);
        }
        refreshDrawableState();
    }

    public final void setIcon(Drawable drawable) {
        ImageView imageView = this.m;
        imageView.setImageDrawable(drawable);
        imageView.setVisibility(drawable != null ? 0 : 8);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (onClickListener instanceof cjj) {
            this.h = ((cjj) onClickListener).d;
        }
        super.setOnClickListener(onClickListener);
    }

    public final void setSelect(boolean z) {
        int i = this.e;
        int i2 = this.f;
        this.n.setTextColor(z ? i2 : i);
        if (z) {
            i = i2;
        }
        this.m.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        super.setSelected(z);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        tdo0 tdo0Var;
        if (!z || (tdo0Var = this.g) == null) {
            return;
        }
        tdo0Var.j(this);
    }

    public final void setTabSelectListener(tdo0 tdo0Var) {
        this.g = tdo0Var;
    }

    public final void setText(CharSequence charSequence) {
        TextView textView = this.n;
        textView.setText(charSequence);
        textView.setVisibility(charSequence == null || charSequence.length() == 0 ? 8 : 0);
    }
}

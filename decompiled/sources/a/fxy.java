package a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.xbet.client1.R;
import org.xplatform.uikit.components.counter.DsCounter;

/* JADX INFO: loaded from: classes6.dex */
public final class fxy extends FrameLayout implements xoe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10334a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public tdo0 f;
    public ymx g;
    public final int h;
    public final int i;
    public final int j;
    public final DsCounter k;
    public final ImageView l;
    public final TextView m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxy(Context context, boolean z) {
        super(context, null, R.attr.tabBarItemStyle);
        context.getClass();
        this.f10334a = getResources().getDimensionPixelSize(R.dimen.size_48);
        this.b = getResources().getDimensionPixelSize(R.dimen.size_18);
        this.c = getResources().getDimensionPixelOffset(R.dimen.space_4);
        this.d = getResources().getDimensionPixelOffset(R.dimen.space_2);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.space_8);
        this.e = dimensionPixelOffset;
        this.g = ivb0.b;
        int color = z ? context.getColor(R.color.static_white_40) : m5d.b(R.attr.uikitSecondary, context);
        this.h = color;
        int color2 = z ? context.getColor(R.color.static_white) : m5d.b(R.attr.uikitPrimary, context);
        this.i = color2;
        int iB = z ? m5d.b(R.attr.uikitStaticBackgroundContent, context) : m5d.b(R.attr.uikitPrimaryForeground, context);
        this.j = iB;
        DsCounter dsCounter = new DsCounter(context, null, 6);
        dsCounter.setComponentStyle(r0m.m);
        this.k = dsCounter;
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.icon);
        imageView.setTag("LargeTabIconView");
        imageView.setImageTintList(null);
        imageView.setColorFilter(iB);
        imageView.setBackgroundResource(z ? R.drawable.tab_bar_central_item_background_static : R.drawable.tab_bar_central_item_background);
        imageView.setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        imageView.setDuplicateParentStateEnabled(true);
        this.l = imageView;
        TextView textView = new TextView(context);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setTextAppearance(R.style.TextAppearance_Caption_Medium_L);
        textView.setGravity(17);
        textView.setLayoutDirection(3);
        textView.setTextDirection(3);
        textView.setTextColor(textView.isSelected() ? color2 : color);
        this.m = textView;
        setClickable(true);
        setFocusable(true);
        addView(imageView);
        addView(textView);
    }

    public Integer getCount() {
        return this.k.getCount();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        Integer count = this.k.getCount();
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
        ImageView imageView = this.l;
        int measuredWidth = ((i3 - i) / 2) - (imageView.getMeasuredWidth() / 2);
        int measuredHeight = i4 - imageView.getMeasuredHeight();
        TextView textView = this.m;
        int measuredHeight2 = measuredHeight - textView.getMeasuredHeight();
        int i5 = this.e;
        int i6 = this.d;
        int measuredWidth2 = imageView.getMeasuredWidth() + measuredWidth;
        int measuredHeight3 = ((i4 - textView.getMeasuredHeight()) - i5) - i6;
        imageView.layout(measuredWidth, (measuredHeight2 - i5) - i6, measuredWidth2, measuredHeight3);
        int i7 = this.b;
        int i8 = (i7 / 2) - (i7 / 3);
        int i9 = this.c;
        jmu0.f((measuredWidth2 - i7) + i9, (measuredHeight3 - i7) + i8, measuredWidth2 + i9, measuredHeight3 + i8, this.k, this);
        textView.layout(0, (i4 - textView.getMeasuredHeight()) - i5, textView.getMeasuredWidth(), i4 - i5);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.f10334a;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        ImageView imageView = this.l;
        imageView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        TextView textView = this.m;
        textView.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
        int i4 = this.b;
        this.k.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        int measuredHeight = textView.getMeasuredHeight() + imageView.getMeasuredHeight() + this.d + this.e;
        ViewParent parent = getParent();
        kao0 kao0Var = parent instanceof kao0 ? (kao0) parent : null;
        if (kao0Var != null) {
            kao0Var.setMaxItemHeight(measuredHeight);
        }
        setMeasuredDimension(size, measuredHeight);
    }

    @Override // android.view.View
    public final boolean performClick() {
        ymx ymxVar = this.g;
        ymxVar.getClass();
        if (SystemClock.uptimeMillis() - ivb0.c <= ymxVar.f42912a) {
            return false;
        }
        setSelected(true);
        return super.performClick();
    }

    @Override // a.xoe
    public void setCount(Integer num) {
        DsCounter dsCounter = this.k;
        dsCounter.setCount(num);
        if (dsCounter.getParent() == null) {
            addView(dsCounter);
        }
        refreshDrawableState();
    }

    public final void setIcon(Drawable drawable) {
        ImageView imageView = this.l;
        imageView.setImageDrawable(drawable);
        imageView.setVisibility(drawable != null ? 0 : 8);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (onClickListener instanceof cjj) {
            this.g = ((cjj) onClickListener).d;
        }
        super.setOnClickListener(onClickListener);
    }

    public final void setSelect(boolean z) {
        this.m.setTextColor(z ? this.i : this.h);
        this.l.setColorFilter(this.j);
        super.setSelected(z);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        tdo0 tdo0Var;
        if (!z || (tdo0Var = this.f) == null) {
            return;
        }
        tdo0Var.j(this);
    }

    public final void setTabSelectListener(tdo0 tdo0Var) {
        this.f = tdo0Var;
    }

    public final void setText(CharSequence charSequence) {
        TextView textView = this.m;
        textView.setText(charSequence);
        textView.setVisibility(charSequence == null || charSequence.length() == 0 ? 8 : 0);
    }
}

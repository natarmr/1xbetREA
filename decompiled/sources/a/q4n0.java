package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class q4n0 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28107a;
    public final ssq0 b;
    public final TextView c;
    public final FrameLayout d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4n0(Context context) {
        super(context, null, 0);
        context.getClass();
        this.f28107a = getResources().getDimensionPixelSize(R.dimen.space_2);
        ssq0 ssq0Var = new ssq0(context);
        ssq0Var.setId(jmu0.d());
        this.b = ssq0Var;
        TextView textView = new TextView(context);
        textView.setId(jmu0.d());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        cem0.n(R.style.TextStyle_Caption_Regular_L, textView);
        textView.setTextColor(m5d.b(R.attr.uikitSecondary, context));
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        textView.setTextSize(12.0f);
        this.c = textView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(jmu0.d());
        this.d = frameLayout;
        addView(textView);
        addView(frameLayout);
        addView(ssq0Var);
    }

    public final boolean getChevronVisibility() {
        return this.b.getChevronVisibility();
    }

    public final CharSequence getSubTitle() {
        CharSequence text = this.c.getText();
        text.getClass();
        return text;
    }

    public final CharSequence getTitle() {
        return this.b.getTitle();
    }

    public final int getTitleCurrentColor() {
        return this.b.getCurrentTextColor();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        ssq0 ssq0Var = this.b;
        int measuredWidth2 = (measuredWidth - ssq0Var.getMeasuredWidth()) / 2;
        jmu0.f(measuredWidth2, 0, ssq0Var.getMeasuredWidth() + measuredWidth2, ssq0Var.getMeasuredHeight(), this.b, this);
        int measuredWidth3 = getMeasuredWidth();
        int measuredHeight = ssq0Var.getMeasuredHeight();
        int i5 = this.f28107a;
        jmu0.f(0, measuredHeight, measuredWidth3, measuredHeight + i5, this.d, this);
        int measuredWidth4 = getMeasuredWidth();
        TextView textView = this.c;
        int measuredWidth5 = (measuredWidth4 - textView.getMeasuredWidth()) / 2;
        int measuredWidth6 = textView.getMeasuredWidth() + measuredWidth5;
        int bottom = ssq0Var.getBottom() + i5;
        jmu0.f(measuredWidth5, bottom, measuredWidth6, textView.getMeasuredHeight() + bottom, textView, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        ssq0 ssq0Var = this.b;
        int desiredTitleTextHeight = ssq0Var.getDesiredTitleTextHeight();
        int i3 = this.f28107a;
        ssq0Var.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(desiredTitleTextHeight + i3, 1073741824));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(size), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        TextView textView = this.c;
        textView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.d.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        setMeasuredDimension(Math.max(ssq0Var.getMeasuredWidth(), textView.getMeasuredWidth()), textView.getMeasuredHeight() + ssq0Var.getMeasuredHeight() + i3);
    }

    public final void setChevronColor(int i) {
        this.b.setChevronColor(i);
    }

    public final void setChevronVisibility(boolean z) {
        this.b.setChevronVisibility(z);
    }

    public final void setMaxLines(int i) {
        this.b.setMaxLines(i);
    }

    public final void setOnTitlesClickListener(Function0<Unit> function0) {
        function0.getClass();
        this.b.setOnTitlesClickListener(new xhl0(function0, (byte) 7));
    }

    public final void setSubTitle(CharSequence charSequence) {
        charSequence.getClass();
        this.c.setText(charSequence);
    }

    public final void setSubTitleColor(int i) {
        this.c.setTextColor(i);
    }

    public final void setSubTitleVisible(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
    }

    public final void setSubtitleVisible(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
    }

    public final void setTitle(CharSequence charSequence) {
        charSequence.getClass();
        this.b.setTitle(charSequence);
    }

    public final void setTitleAlpha(float f) {
        this.b.setTitleAlpha(f);
    }

    public final void setTitleScale(float f) {
        this.b.setTitleScale(f);
    }

    public final void setTitleText(CharSequence charSequence) {
        charSequence.getClass();
        ssq0 ssq0Var = this.b;
        ssq0Var.setTitle(charSequence);
        ssq0Var.setMaxLines(1);
    }

    public final void setTitleTextColor(ColorStateList colorStateList) {
        colorStateList.getClass();
        this.b.setTextColor(colorStateList);
    }

    public final void setTitleTranslationY(float f) {
        this.b.setTitleTranslationY(f);
    }

    public final void setTitleVisible(boolean z) {
        this.b.setVisibility(z ? 0 : 8);
    }

    public final void setChevronColor(ColorStateList colorStateList) {
        this.b.setChevronColor(colorStateList);
    }

    public final void setTitleTextColor(int i) {
        this.b.setTextColor(i);
    }
}

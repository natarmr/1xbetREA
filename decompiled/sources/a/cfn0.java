package a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class cfn0 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4271a;
    public final rsq0 b;
    public final TextView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfn0(Context context) {
        super(context, null, 0);
        context.getClass();
        this.f4271a = getResources().getDimensionPixelSize(R.dimen.space_2);
        rsq0 rsq0Var = new rsq0(context);
        rsq0Var.setId(jmu0.d());
        this.b = rsq0Var;
        TextView textView = new TextView(context);
        cem0.n(R.style.TextStyle_Caption_Regular_L, textView);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        textView.setTextSize(12.0f);
        this.c = textView;
        addView(rsq0Var);
        addView(textView);
    }

    public final TextView getSubTitleTextView() {
        return this.c;
    }

    public final rsq0 getTitleTextView() {
        return this.b;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextView textView = this.c;
        int visibility = textView.getVisibility();
        rsq0 rsq0Var = this.b;
        int measuredHeight = visibility == 0 ? 0 : (getMeasuredHeight() - rsq0Var.getMeasuredHeight()) / 2;
        int measuredWidth = (getMeasuredWidth() - rsq0Var.getMeasuredWidth()) / 2;
        jmu0.f(measuredWidth, measuredHeight, rsq0Var.getMeasuredWidth() + measuredWidth, rsq0Var.getMeasuredHeight() + measuredHeight, rsq0Var, this);
        int bottom = this.f4271a + rsq0Var.getBottom();
        int measuredWidth2 = (getMeasuredWidth() - textView.getMeasuredWidth()) / 2;
        jmu0.f(measuredWidth2, bottom, textView.getMeasuredWidth() + measuredWidth2, textView.getMeasuredHeight() + bottom, textView, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
        rsq0 rsq0Var = this.b;
        rsq0Var.measure(iMakeMeasureSpec, 0);
        TextView textView = this.c;
        textView.setMaxWidth(size);
        textView.measure(0, 0);
        setMeasuredDimension(Math.max(rsq0Var.getMeasuredWidth(), textView.getMeasuredWidth()), textView.getMeasuredHeight() + rsq0Var.getMeasuredHeight() + this.f4271a);
    }

    public final void setMaxLines(int i) {
        this.b.setMaxLines(i);
    }

    public final void setSubTitle(CharSequence charSequence) {
        charSequence.getClass();
        this.c.setText(charSequence);
        requestLayout();
    }

    public final void setSubtitleVisible(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
    }

    public final void setTitle(CharSequence charSequence) {
        rsq0 rsq0Var = this.b;
        rsq0Var.setTitle(charSequence);
        rsq0Var.setMaxLines(1);
    }

    public final void setTitleVisible(boolean z) {
        this.b.setVisibility(z ? 0 : 8);
    }
}

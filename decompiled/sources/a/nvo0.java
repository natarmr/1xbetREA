package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class nvo0 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f24197a;
    public final TextView b;
    public final int c;

    public nvo0(Context context) {
        super(context, null);
        TextView textView = new TextView(context);
        textView.setTag("taxText");
        textView.setId(View.generateViewId());
        iaq0.a(R.style.TextStyle_Text_Regular_Secondary, textView);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388627;
        textView.setLayoutParams(layoutParams);
        this.f24197a = textView;
        TextView textView2 = new TextView(context);
        textView2.setTag("taxValue");
        textView2.setId(View.generateViewId());
        iaq0.a(R.style.TextStyle_Text_Medium_TextPrimary, textView2);
        textView2.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388629;
        textView2.setLayoutParams(layoutParams2);
        textView2.setTextDirection(3);
        this.b = textView2;
        this.c = getResources().getDimensionPixelSize(R.dimen.space_12);
        addView(textView);
        addView(textView2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        TextView textView = this.b;
        int measuredWidth = textView.getMeasuredWidth();
        int measuredHeight = textView.getMeasuredHeight();
        int paddingTop = ((((i6 - getPaddingTop()) - getPaddingBottom()) - measuredHeight) / 2) + getPaddingTop();
        jmu0.f((i5 - getPaddingEnd()) - measuredWidth, paddingTop, i5 - getPaddingEnd(), measuredHeight + paddingTop, textView, this);
        TextView textView2 = this.f24197a;
        int measuredWidth2 = textView2.getMeasuredWidth();
        int measuredHeight2 = textView2.getMeasuredHeight();
        int paddingTop2 = ((((i6 - getPaddingTop()) - getPaddingBottom()) - measuredHeight2) / 2) + getPaddingTop();
        jmu0.f(getPaddingStart(), paddingTop2, measuredWidth2 + getPaddingStart(), paddingTop2 + measuredHeight2, textView2, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        TextView textView = this.b;
        measureChildWithMargins(textView, i, 0, i2, 0);
        int measuredWidth = textView.getMeasuredWidth();
        int measuredHeight = textView.getMeasuredHeight();
        int size = View.MeasureSpec.getSize(i) - measuredWidth;
        int i3 = this.c;
        int paddingStart = ((size - i3) - getPaddingStart()) - getPaddingEnd();
        if (paddingStart < 0) {
            paddingStart = 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingStart, Integer.MIN_VALUE);
        TextView textView2 = this.f24197a;
        measureChildWithMargins(textView2, iMakeMeasureSpec, 0, i2, 0);
        int measuredWidth2 = textView2.getMeasuredWidth();
        int measuredHeight2 = textView2.getMeasuredHeight();
        int paddingEnd = getPaddingEnd() + getPaddingStart() + measuredWidth2 + measuredWidth + i3;
        if (measuredHeight2 >= measuredHeight) {
            measuredHeight = measuredHeight2;
        }
        setMeasuredDimension(View.resolveSize(paddingEnd, i), View.resolveSize(getPaddingBottom() + getPaddingTop() + measuredHeight, i2));
    }

    public final void setModel(mvo0 mvo0Var) {
        mvo0Var.getClass();
        this.f24197a.setText(mvo0Var.f22468a);
        this.b.setText(mvo0Var.b.concat(Separators.SP));
    }
}

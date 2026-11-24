package a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class n2c0 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22791a;
    public final int b;
    public final int c;
    public final int d;
    public final TextView e;
    public final TextView f;

    public n2c0(Context context) {
        super(context, null, 0);
        this.f22791a = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.b = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.c = getResources().getDimensionPixelSize(R.dimen.space_12);
        this.d = getResources().getDimensionPixelSize(R.dimen.size_56);
        float dimension = getResources().getDimension(R.dimen.text_14);
        float dimension2 = getResources().getDimension(R.dimen.text_12);
        TextView textView = new TextView(context);
        textView.setId(R.id.name);
        textView.setTextAlignment(5);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity(80);
        textView.setMaxLines(1);
        textView.setTextSize(dimension);
        textView.setVisibility(0);
        cem0.n(R.style.TextStyle_Text_Medium_TextPrimary, textView);
        this.e = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(R.id.description);
        textView2.setEllipsize(truncateAt);
        textView2.setMaxLines(1);
        textView2.setTextSize(dimension2);
        textView2.setVisibility(0);
        textView2.setGravity(48);
        cem0.n(R.style.TextStyle_Caption_Medium_L_Primary, textView2);
        this.f = textView2;
        addView(textView);
        addView(textView2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        TextView textView = this.e;
        int measuredHeight = textView.getMeasuredHeight();
        TextView textView2 = this.f;
        int measuredHeight2 = textView2.getMeasuredHeight() + measuredHeight;
        int i6 = this.d;
        int i7 = (i6 - measuredHeight2) / 2;
        int paddingRight = i5 - getPaddingRight();
        int i8 = this.c;
        int i9 = paddingRight - i8;
        int measuredHeight3 = textView.getMeasuredHeight() + i7;
        boolean zC = cy7.c();
        int i10 = this.b;
        if (zC) {
            textView.layout(getMeasuredWidth() - i9, i7, getMeasuredWidth() - i10, measuredHeight3);
        } else {
            textView.layout(i10, i7, i9, measuredHeight3);
        }
        int measuredHeight4 = (i6 - (textView2.getMeasuredHeight() + textView.getMeasuredHeight())) / 2;
        int measuredHeight5 = textView.getMeasuredHeight() + measuredHeight4;
        int measuredWidth = textView2.getMeasuredWidth();
        int paddingRight2 = (i5 - getPaddingRight()) - i8;
        int i11 = this.b;
        int i12 = paddingRight2 - i11;
        if (measuredWidth > i12) {
            measuredWidth = i12;
        }
        jmu0.f(i11, measuredHeight5, i11 + measuredWidth, textView2.getMeasuredHeight() + textView.getMeasuredHeight() + measuredHeight4 + this.f22791a, textView2, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = ((View.MeasureSpec.getSize(i) - getPaddingRight()) - this.c) - this.b;
        if (size < 0) {
            size = 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        TextView textView = this.e;
        textView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(View.MeasureSpec.getSize(i)), Integer.MIN_VALUE), textView.getMeasuredHeight());
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.resolveSize(this.d, i2));
    }

    public final void setSubTitle(CharSequence charSequence) {
        charSequence.getClass();
        this.f.setText(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        charSequence.getClass();
        this.e.setText(charSequence);
    }
}

package a;

import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ks5 extends FrameLayout implements gr5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18796a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final ms5 f;
    public final TextView g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks5(Context context) {
        super(context, null);
        context.getClass();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.size_96);
        this.f18796a = dimensionPixelSize;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.size_96);
        this.b = dimensionPixelSize2;
        this.c = getResources().getDimensionPixelSize(R.dimen.size_96);
        this.d = getResources().getDimensionPixelSize(R.dimen.size_128);
        this.e = getResources().getDimensionPixelSize(R.dimen.size_28);
        ms5 ms5Var = new ms5(context);
        ms5Var.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize2));
        addView(ms5Var);
        this.f = ms5Var;
        TextView textView = new TextView(context);
        textView.setTag("titleSquareSTextView");
        textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        jmu0.l(textView.getResources().getDimensionPixelSize(R.dimen.space_4), 0, 13, textView);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(by7.c().f3402a ? 8388613 : 8388611);
        textView.setLayoutDirection(3);
        textView.setTextDirection(3);
        textView.setGravity(17);
        textView.setMinHeight(textView.getResources().getDimensionPixelSize(R.dimen.size_28));
        textView.setLineSpacing(0.0f, 0.8f);
        cem0.n(R.style.TextStyle_Caption_Medium_L_StaticWhite, textView);
        addView(textView);
        this.g = textView;
    }

    @Override // a.gr5
    public final void a(o0x o0xVar, gp5 gp5Var) {
        o0xVar.getClass();
        gp5Var.getClass();
        this.f.a(o0xVar, gp5Var);
    }

    @Override // a.gr5
    public String getLoadedImageUrl() {
        return this.f.getLoadedImageUrl();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        jmu0.f(0, 0, this.f18796a, this.b, this.f, this);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextView textView = this.g;
        int iMax = Math.max(xdx.H(textView, this.c, 252).getHeight(), this.e);
        int i5 = this.d;
        jmu0.f(0, i5 - iMax, this.c, i5, textView, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.f.measure(View.MeasureSpec.makeMeasureSpec(this.f18796a, 1073741824), View.MeasureSpec.makeMeasureSpec(this.b, 1073741824));
        int i3 = this.c;
        this.g.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        setMeasuredDimension(i3, this.d);
    }

    @Override // a.gr5
    public void setDecoratorImage(o0x o0xVar) {
        this.f.setDecoratorImage(o0xVar);
    }

    @Override // a.gr5
    public void setTag(String str) {
        str.getClass();
        this.f.setTag(str);
        invalidate();
    }

    @Override // a.gr5
    public void setTagColor(goo0 goo0Var) {
        this.f.setTagColor(goo0Var);
        invalidate();
    }

    @Override // a.gr5
    public void setTitle(String str) {
        str.getClass();
        this.g.setText(str);
        setTag((Object) str);
        invalidate();
    }
}

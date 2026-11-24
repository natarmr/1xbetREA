package a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class e680 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7268a;
    public final int b;
    public final int c;
    public final TextView d;
    public final ImageView e;
    public final ImageView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e680(Context context) {
        super(context, null, 0);
        context.getClass();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.size_14);
        this.f7268a = dimensionPixelSize;
        this.b = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.c = getResources().getDimensionPixelSize(R.dimen.space_8);
        TextView textView = new TextView(context);
        cem0.n(R.style.TextStyle_Caption_Regular_L_TextPrimary, textView);
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setPadding(0, 0, 0, 0);
        this.d = textView;
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        imageView.setImageDrawable(epv0.U(R.drawable.ic_glyph_color_optionbet, context));
        this.e = imageView;
        ImageView imageView2 = new ImageView(context);
        imageView2.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        Drawable drawableU = epv0.U(R.drawable.ic_glyph_info_circle, context);
        if (drawableU != null) {
            drawableU.setTint(m5d.b(R.attr.uikitSecondary, context));
        }
        imageView2.setImageDrawable(drawableU);
        this.f = imageView2;
        addView(imageView);
        addView(textView);
        addView(imageView2);
    }

    private final int getFinalHeight() {
        return Math.max(this.d.getMeasuredHeight(), this.f.getMeasuredHeight()) + this.c;
    }

    private final int getIconDivHeight() {
        TextView textView = this.d;
        int measuredHeight = textView.getMeasuredHeight();
        ImageView imageView = this.f;
        if (measuredHeight > imageView.getMeasuredHeight()) {
            return (textView.getMeasuredHeight() / 2) - (imageView.getMeasuredHeight() / 2);
        }
        return 0;
    }

    private final int getTextDivHeight() {
        TextView textView = this.d;
        int measuredHeight = textView.getMeasuredHeight();
        ImageView imageView = this.f;
        if (measuredHeight >= imageView.getMeasuredHeight()) {
            return 0;
        }
        return (imageView.getMeasuredHeight() / 2) - (textView.getMeasuredHeight() / 2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iconDivHeight = getIconDivHeight();
        ImageView imageView = this.e;
        jmu0.f(0, iconDivHeight, imageView.getMeasuredWidth(), imageView.getMeasuredHeight() + iconDivHeight, imageView, this);
        int textDivHeight = getTextDivHeight();
        int measuredWidth = imageView.getMeasuredWidth();
        int i5 = this.b;
        int i6 = measuredWidth + i5;
        TextView textView = this.d;
        jmu0.f(i6, textDivHeight, textView.getMeasuredWidth() + i6, textView.getMeasuredHeight() + textDivHeight, textView, this);
        int iconDivHeight2 = getIconDivHeight();
        int i7 = i5 * 2;
        int measuredWidth2 = i7 + textView.getMeasuredWidth() + imageView.getMeasuredWidth();
        ImageView imageView2 = this.f;
        jmu0.f(measuredWidth2, iconDivHeight2, imageView2.getMeasuredWidth() + measuredWidth2, imageView2.getMeasuredHeight() + iconDivHeight2, imageView2, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.f7268a;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        ImageView imageView = this.e;
        imageView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        ImageView imageView2 = this.f;
        imageView2.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
        this.d.measure(View.MeasureSpec.makeMeasureSpec(((size - (this.b * 2)) - imageView.getMeasuredWidth()) - imageView2.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        setMeasuredDimension(i, getFinalHeight());
    }

    public final void setOnOptionBetClickListener(Function1<? super View, Unit> function1) {
        dyb.c0(this, new i160(function1, (byte) 19));
    }

    public final void setOptionBetText(CharSequence charSequence) {
        String string;
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        this.d.setText(string);
    }
}

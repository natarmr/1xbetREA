package org.xplatform.core.presentation.views.tax_message;

import a.c0;
import a.cem0;
import a.epv0;
import a.jiq0;
import a.jmu0;
import a.pvo0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class TaxMessageView extends FrameLayout {
    public static final /* synthetic */ int i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f46466a;
    public final float b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final TextView g;
    public final ImageView h;

    /* JADX WARN: Illegal instructions before constructor call */
    public TaxMessageView(Context context, AttributeSet attributeSet, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        setWillNotDraw(false);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f46466a = paint;
        this.b = getResources().getDimension(R.dimen.radius_16);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.size_48);
        this.c = dimensionPixelSize;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.space_16);
        this.d = dimensionPixelSize2;
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.space_12);
        this.e = dimensionPixelSize3;
        this.f = getResources().getDimensionPixelSize(R.dimen.space_8);
        TextView textView = new TextView(context);
        cem0.n(R.style.TextStyle_Caption_Medium_L, textView);
        textView.setTextSize(0, textView.getResources().getDimension(R.dimen.text_10));
        addView(textView);
        this.g = textView;
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(epv0.U(R.drawable.ic_glyph_cancel, context));
        imageView.setBackground(epv0.U(R.drawable.tax_message_close_button_bg, context));
        imageView.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        imageView.setPaddingRelative(dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize2);
        addView(imageView);
        this.h = imageView;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float f = this.b;
        canvas.drawRoundRect(0.0f, 0.0f, measuredWidth, measuredHeight, f, f, this.f46466a);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        int measuredHeight = getMeasuredHeight() / 2;
        TextView textView = this.g;
        int measuredHeight2 = measuredHeight - (textView.getMeasuredHeight() / 2);
        int measuredWidth = getMeasuredWidth();
        ImageView imageView = this.h;
        jmu0.f(this.e, measuredHeight2, (measuredWidth - imageView.getMeasuredWidth()) - this.f, textView.getMeasuredHeight() + measuredHeight2, textView, this);
        int measuredWidth2 = getMeasuredWidth() - imageView.getMeasuredWidth();
        int measuredHeight3 = (getMeasuredHeight() / 2) - (imageView.getMeasuredHeight() / 2);
        jmu0.f(measuredWidth2, measuredHeight3, imageView.getMeasuredWidth() + measuredWidth2, imageView.getMeasuredHeight() + measuredHeight3, imageView, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int size = View.MeasureSpec.getSize(i2);
        int i4 = this.c;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        ImageView imageView = this.h;
        measureChild(imageView, iMakeMeasureSpec, iMakeMeasureSpec2);
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec((size - imageView.getMeasuredWidth()) - this.f, 1073741824);
        int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        TextView textView = this.g;
        measureChild(textView, iMakeMeasureSpec3, iMakeMeasureSpec4);
        setMeasuredDimension(i2, Math.max(textView.getMeasuredHeight(), imageView.getMeasuredHeight()) + this.d);
    }

    public final void setOnCloseListener(Function0<Unit> function0) {
        function0.getClass();
        this.h.setOnClickListener(new c0(function0, (byte) 14));
    }

    public final void setUiModel(pvo0 pvo0Var) {
        pvo0Var.getClass();
        boolean z = pvo0Var.f27672a;
        setVisibility(z ? 0 : 8);
        if (z) {
            this.f46466a.setColor(getContext().getColor(R.color.static_black_70));
            ColorStateList colorStateListN0 = jiq0.n0(R.color.static_white_20, getContext());
            ImageView imageView = this.h;
            imageView.setBackgroundTintList(colorStateListN0);
            imageView.setImageTintList(jiq0.n0(R.color.static_white, getContext()));
            String str = pvo0Var.b;
            TextView textView = this.g;
            textView.setText(str);
            textView.setTextColor(jiq0.n0(R.color.static_white_80, getContext()));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TaxMessageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TaxMessageView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}

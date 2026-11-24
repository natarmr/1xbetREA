package org.xplatform.coupon.impl.core.presentation.base.view.express_boost;

import a.aem0;
import a.btm;
import a.cem0;
import a.dyb;
import a.epv0;
import a.hne;
import a.jmu0;
import a.m5d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ExpressBoostView extends FrameLayout {
    public static final /* synthetic */ int r = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f46467a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final ImageView e;
    public final ImageView f;
    public final ImageView g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final float n;
    public final float o;
    public final Paint p;
    public final RectF q;

    /* JADX WARN: Illegal instructions before constructor call */
    public ExpressBoostView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.size_16);
        this.h = dimensionPixelSize;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.size_24);
        this.i = dimensionPixelSize2;
        this.j = getResources().getDimensionPixelSize(R.dimen.size_24);
        this.k = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.l = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.m = getResources().getDimensionPixelSize(R.dimen.space_12);
        this.n = getResources().getDimension(R.dimen.size_16);
        float dimension = getResources().getDimension(R.dimen.space_2);
        this.o = dimension;
        float dimension2 = getResources().getDimension(R.dimen.space_4);
        float dimension3 = getResources().getDimension(R.dimen.space_6);
        int iB = m5d.b(R.attr.uikitBackgroundContent, context);
        DashPathEffect dashPathEffect = new DashPathEffect(new float[]{dimension2, dimension3}, 0.0f);
        Paint paint = new Paint();
        paint.setColor(m5d.b(R.attr.uikitPrimary, context));
        paint.setStrokeWidth(dimension);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setPathEffect(dashPathEffect);
        this.p = paint;
        this.q = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        jmu0.j(this, ColorStateList.valueOf(iB));
        setBackgroundResource(R.drawable.rounded_background_16);
        TextView textView = new TextView(context);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        cem0.n(R.style.TextStyle_Text_Medium_TextPrimary, textView);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f46467a = textView;
        TextView textView2 = new TextView(context);
        textView2.setMaxLines(3);
        textView2.setEllipsize(truncateAt);
        cem0.n(R.style.TextStyle_Caption_Regular_L_Secondary, textView2);
        textView2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.b = textView2;
        TextView textView3 = new TextView(context);
        textView3.setMaxLines(1);
        textView3.setEllipsize(truncateAt);
        cem0.n(R.style.TextStyle_Caption_Regular_L_Secondary, textView3);
        textView3.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.c = textView3;
        TextView textView4 = new TextView(context);
        textView4.setMaxLines(1);
        textView4.setEllipsize(truncateAt);
        cem0.n(R.style.TextStyle_Text_Medium_TextPrimary, textView4);
        textView4.setGravity(16);
        textView4.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView4.setTextDirection(3);
        aem0.r(textView4, 8, 14, 1, 2);
        this.d = textView4;
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        Drawable drawableU = epv0.U(R.drawable.ic_glyph_quick_bet_inactive, context);
        if (drawableU != null) {
            drawableU.setTint(m5d.b(R.attr.uikitPrimary, context));
        }
        imageView.setImageDrawable(drawableU);
        this.e = imageView;
        ImageView imageView2 = new ImageView(context);
        imageView2.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        Drawable drawableU2 = epv0.U(R.drawable.ic_glyph_info_circle, context);
        if (drawableU2 != null) {
            drawableU2.setTint(m5d.b(R.attr.uikitSecondary, context));
        }
        imageView2.setImageDrawable(drawableU2);
        this.f = imageView2;
        ImageView imageView3 = new ImageView(context);
        imageView3.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize2, dimensionPixelSize2));
        Drawable drawableU3 = epv0.U(R.drawable.ic_glyph_cancel, context);
        if (drawableU3 != null) {
            drawableU3.setTint(m5d.b(R.attr.uikitPrimary, context));
        }
        imageView3.setImageDrawable(drawableU3);
        this.g = imageView3;
        addView(imageView);
        addView(imageView2);
        addView(imageView3);
        addView(textView);
        addView(textView2);
        addView(textView3);
        addView(textView4);
    }

    private final int getIconTopOffset() {
        return hne.d(this.j, this.h, 2, this.l);
    }

    private final int getStartOffsetWithBoostIcon() {
        return this.e.getMeasuredWidth() + this.m + this.k;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        super.dispatchDraw(canvas);
        float f = this.n;
        canvas.drawRoundRect(this.q, f, f, this.p);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iconTopOffset = getIconTopOffset();
        ImageView imageView = this.e;
        int measuredWidth = imageView.getMeasuredWidth();
        int i5 = this.m;
        int iconTopOffset2 = getIconTopOffset() + imageView.getMeasuredHeight();
        jmu0.f(this.m, iconTopOffset, measuredWidth + i5, iconTopOffset2, imageView, this);
        int startOffsetWithBoostIcon = getStartOffsetWithBoostIcon();
        TextView textView = this.f46467a;
        int measuredWidth2 = textView.getMeasuredWidth() + startOffsetWithBoostIcon;
        int i6 = this.k;
        int i7 = measuredWidth2 + i6;
        int iconTopOffset3 = getIconTopOffset();
        ImageView imageView2 = this.f;
        jmu0.f(i7, iconTopOffset3, imageView2.getMeasuredWidth() + i7, imageView2.getMeasuredHeight() + getIconTopOffset(), imageView2, this);
        int width = getWidth();
        int i8 = this.l;
        ImageView imageView3 = this.g;
        jmu0.f((width - i8) - imageView3.getMeasuredWidth(), this.l, getWidth() - i8, imageView3.getMeasuredHeight() + i8, imageView3, this);
        int measuredHeight = textView.getMeasuredHeight();
        int i9 = this.j;
        int i10 = i8 + ((i9 - measuredHeight) / 2);
        jmu0.f(getStartOffsetWithBoostIcon(), i10, textView.getMeasuredWidth() + getStartOffsetWithBoostIcon(), textView.getMeasuredHeight() + i10, textView, this);
        int i11 = i8 + i9 + i6;
        int width2 = getWidth() - i8;
        TextView textView2 = this.b;
        jmu0.f(this.m, i11, width2, textView2.getMeasuredHeight() + i11, textView2, this);
        int width3 = getWidth();
        TextView textView3 = this.d;
        int i12 = i8 + i9 + i6;
        jmu0.f(Integer.max(width3 - (textView3.getMeasuredWidth() + i8), (int) (((double) getWidth()) * 0.4d)), i12, getWidth() - i8, textView3.getMeasuredHeight() + i12, textView3, this);
        TextView textView4 = this.c;
        int iMin = Integer.min(textView4.getMeasuredWidth() + i5, (int) (((double) getWidth()) * 0.4d));
        int measuredHeight2 = i8 + i9 + i6 + ((textView3.getMeasuredHeight() - textView4.getMeasuredHeight()) / 2);
        jmu0.f(this.m, measuredHeight2, iMin, textView4.getMeasuredHeight() + measuredHeight2, textView4, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.h;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        ImageView imageView = this.e;
        imageView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        ImageView imageView2 = this.f;
        imageView2.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
        int i4 = this.i;
        this.g.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        int i5 = this.m;
        int i6 = this.l;
        int i7 = this.k;
        this.f46467a.measure(View.MeasureSpec.makeMeasureSpec(((((size - i5) - i6) - (i7 * 2)) - imageView.getMeasuredWidth()) - imageView2.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec((size - i5) - i6, Integer.MIN_VALUE);
        int iMakeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(0, 0);
        TextView textView = this.b;
        textView.measure(iMakeMeasureSpec5, iMakeMeasureSpec6);
        int iMakeMeasureSpec7 = View.MeasureSpec.makeMeasureSpec(((((int) (((double) size) * 0.6d)) - i5) - i6) - i7, Integer.MIN_VALUE);
        int iMakeMeasureSpec8 = View.MeasureSpec.makeMeasureSpec(0, 0);
        TextView textView2 = this.d;
        textView2.measure(iMakeMeasureSpec7, iMakeMeasureSpec8);
        int iMakeMeasureSpec9 = View.MeasureSpec.makeMeasureSpec((((size - i5) - i6) - textView2.getMeasuredWidth()) - i7, Integer.MIN_VALUE);
        int iMakeMeasureSpec10 = View.MeasureSpec.makeMeasureSpec(0, 0);
        TextView textView3 = this.c;
        textView3.measure(iMakeMeasureSpec9, iMakeMeasureSpec10);
        setMeasuredDimension(i, View.MeasureSpec.makeMeasureSpec(i5 + i6 + this.j + i7 + (textView.getVisibility() == 0 ? textView.getMeasuredHeight() : textView3.getMeasuredHeight()), 1073741824));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = this.o;
        this.q.set(f / 2.0f, f / 2.0f, getWidth() - (f / 2.0f), getHeight() - (f / 2.0f));
    }

    public final void setCoefLabel(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public final void setCoefValue(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public final void setOnCloseClickListener(Function1<? super View, Unit> function1) {
        btm btmVar = new btm(function1, (byte) 26);
        ImageView imageView = this.g;
        dyb.c0(imageView, btmVar);
        imageView.setVisibility(function1 != null ? 0 : 8);
    }

    public final void setSubTitle(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public final void setTitle(int i) {
        setTitle(getContext().getString(i));
    }

    public final void setTitle(CharSequence charSequence) {
        this.f46467a.setText(charSequence);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpressBoostView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpressBoostView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}

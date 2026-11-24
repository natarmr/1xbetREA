package org.xplatform.uikit.components.account_control;

import a.ohs0;
import a.r7x;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class AmountCurrencyView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47223a;
    public final float b;
    public String c;
    public String d;
    public final TextPaint e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmountCurrencyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f47223a = getResources().getDimensionPixelSize(R.dimen.space_2);
        this.b = getResources().getDimension(R.dimen.text_1);
        this.c = "";
        this.d = "";
        this.e = new TextPaint(1);
        this.l = "";
    }

    public final void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (Intrinsics.d(str, this.c) && Intrinsics.d(str2, this.d)) {
            return;
        }
        this.c = str;
        this.d = str2;
        setContentDescription(str + str2);
        requestLayout();
    }

    public final void b(Context context, int i, Float f, Float f2) {
        context.getClass();
        TextPaint textPaint = this.e;
        r7x.r(textPaint, context, i);
        this.f = f != null ? f.floatValue() : textPaint.getTextSize();
        this.g = f2 != null ? f2.floatValue() : textPaint.getTextSize();
        textPaint.setTextSize(this.f);
    }

    public final void c(int i) {
        if (d(i)) {
            return;
        }
        TextPaint textPaint = this.e;
        float textSize = textPaint.getTextSize();
        float f = this.g;
        if (textSize <= f) {
            return;
        }
        textPaint.setTextSize(Math.max(f, textPaint.getTextSize() - this.b));
        c(i);
    }

    public final boolean d(int i) {
        String str = this.c;
        String str2 = this.d;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return this.e.measureText(sb.toString()) + ((float) this.f47223a) <= ((float) i);
    }

    public final CharSequence getVisibleText() {
        return this.l;
    }

    public final CharSequence getVisibleTextWithCurrency() {
        return ohs0.n(this.l, this.d);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        String str = this.d;
        float f = this.h;
        float f2 = this.i;
        TextPaint textPaint = this.e;
        canvas.drawText(str, f, f2, textPaint);
        canvas.drawText(this.l, this.j, this.k, textPaint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float measuredHeight = getMeasuredHeight() / 2;
        TextPaint textPaint = this.e;
        float fAscent = measuredHeight - ((textPaint.ascent() + textPaint.descent()) / 2.0f);
        if (getLayoutDirection() == 0) {
            this.j = 0.0f;
            this.h = textPaint.measureText(this.l) + this.f47223a;
        } else {
            float measuredWidth = getMeasuredWidth() - textPaint.measureText(this.d);
            this.h = measuredWidth;
            this.j = (measuredWidth - textPaint.measureText(this.l)) - this.f47223a;
        }
        this.k = fAscent;
        this.i = fAscent;
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        String string;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        float f = this.f;
        TextPaint textPaint = this.e;
        textPaint.setTextSize(f);
        c(size);
        if (d(size)) {
            string = this.c;
            this.l = string;
        } else {
            string = TextUtils.ellipsize(this.c, textPaint, (size - textPaint.measureText(this.d)) - this.f47223a, TextUtils.TruncateAt.END).toString();
            this.l = string;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((int) textPaint.measureText(string + this.d)) + this.f47223a, 1073741824);
        int i3 = (int) (textPaint.getFontMetrics().bottom - textPaint.getFontMetrics().top);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        if (size2 < i3) {
            setMeasuredDimension(iMakeMeasureSpec, iMakeMeasureSpec2);
        } else {
            setMeasuredDimension(iMakeMeasureSpec, i2);
        }
        setTag("DSAmountCurrencyView");
    }

    public final void setAmountCurrencyMargin(int i) {
        this.f47223a = getResources().getDimensionPixelSize(i);
        requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmountCurrencyView(Context context) {
        this(context, null);
        context.getClass();
    }
}

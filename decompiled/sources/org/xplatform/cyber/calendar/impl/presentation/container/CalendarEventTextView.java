package org.xplatform.cyber.calendar.impl.presentation.container;

import a.itf0;
import a.vpd0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class CalendarEventTextView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f46480a;
    public final float b;
    public final TextPaint c;
    public final Typeface d;

    /* JADX WARN: Illegal instructions before constructor call */
    public CalendarEventTextView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f46480a = "";
        TextPaint textPaint = new TextPaint();
        this.c = textPaint;
        int color = -16777216;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, vpd0.f37799a, 0, 0);
            typedArrayObtainStyledAttributes.getClass();
            this.d = itf0.a(typedArrayObtainStyledAttributes.getResourceId(2, 0), getContext());
            color = typedArrayObtainStyledAttributes.getColor(1, -16777216);
            this.b = typedArrayObtainStyledAttributes.getDimension(3, this.b);
            typedArrayObtainStyledAttributes.recycle();
        }
        Typeface typeface = this.d;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setTextSize(this.b);
        textPaint.setColor(color);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        String str = this.f46480a;
        float width = getWidth();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint = this.c;
        CharSequence charSequenceEllipsize = TextUtils.ellipsize(str, textPaint, width, truncateAt);
        float height = (getHeight() / 2) - ((textPaint.ascent() + textPaint.descent()) / 2.0f);
        float measuredWidth = getLayoutDirection() == 0 ? 0.0f : getMeasuredWidth() - textPaint.measureText(charSequenceEllipsize.toString());
        charSequenceEllipsize.getClass();
        canvas.drawText(charSequenceEllipsize.length() == 0 ? "..." : charSequenceEllipsize.toString(), measuredWidth, height, textPaint);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CalendarEventTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CalendarEventTextView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}

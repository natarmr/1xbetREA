package a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class gtv extends MetricAffectingSpan implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b930 f11899a;
    public final Rect b = ba60.f2244a;
    public final Paint c = ba60.c;
    public final int d;

    public gtv(b930 b930Var, int i) {
        this.f11899a = b930Var;
        this.d = i;
    }

    public final void a(TextPaint textPaint) {
        this.f11899a.getClass();
        textPaint.setFakeBoldText(true);
        int i = this.d;
        float[] fArr = b930.g;
        if (6 >= i) {
            textPaint.setTextSize(textPaint.getTextSize() * fArr[i - 1]);
        } else {
            Locale locale = Locale.US;
            jf4.n(defpackage.c.b(i, "Supplied heading level: ", " is invalid, where configured heading sizes are: `", Arrays.toString(fArr), "`"));
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        int i8 = this.d;
        if ((i8 == 1 || i8 == 2) && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanEnd(this) == i7) {
            Paint paint2 = this.c;
            paint2.set(paint);
            b930 b930Var = this.f11899a;
            b930Var.getClass();
            paint2.setColor(xbc.I(paint2.getColor(), 75));
            paint2.setStyle(Paint.Style.FILL);
            int i9 = b930Var.e;
            if (i9 >= 0) {
                paint2.setStrokeWidth(i9);
            }
            float strokeWidth = paint2.getStrokeWidth();
            if (strokeWidth > 0.0f) {
                int i10 = (int) ((i5 - strokeWidth) + 0.5f);
                if (i2 > 0) {
                    width = canvas.getWidth();
                } else {
                    width = i;
                    i -= canvas.getWidth();
                }
                Rect rect = this.b;
                rect.set(i, i10, width, i5);
                canvas.drawRect(rect, paint2);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}

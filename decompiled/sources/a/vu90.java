package a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vu90 extends ReplacementSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Paint.FontMetricsInt f38037a;
    public boolean b;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f38037a;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        Intrinsics.h("fontMetrics");
        throw null;
    }

    public final int b() {
        if (this.b) {
            return 0;
        }
        ycx.b("PlaceholderSpan is not laid out yet.");
        return 0;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.b = true;
        paint.getTextSize();
        this.f38037a = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            ycx.a("Invalid fontMetrics: line height can not be negative.");
        }
        throw null;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}

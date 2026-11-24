package a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: loaded from: classes2.dex */
public final class i98 implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14375a;
    public final b930 b;
    public final Rect c;
    public final Paint d;

    public i98(b930 b930Var, byte b) {
        this.f14375a = b;
        switch (b) {
            case 1:
                this.c = ba60.f2244a;
                this.d = ba60.c;
                this.b = b930Var;
                break;
            default:
                this.c = ba60.f2244a;
                this.d = ba60.c;
                this.b = b930Var;
                break;
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        byte b = this.f14375a;
        b930 b930Var = this.b;
        Paint paint2 = this.d;
        Rect rect = this.c;
        switch (b) {
            case 0:
                int i8 = b930Var.b;
                if (i8 == 0) {
                    i8 = (int) ((b930Var.f2188a * 0.25f) + 0.5f);
                }
                paint2.set(paint);
                b930Var.getClass();
                int I = xbc.I(paint2.getColor(), 25);
                paint2.setStyle(Paint.Style.FILL);
                paint2.setColor(I);
                int i9 = i2 * i8;
                int i10 = i + i9;
                int i11 = i9 + i10;
                rect.set(Math.min(i10, i11), i3, Math.max(i10, i11), i5);
                canvas.drawRect(rect, paint2);
                break;
            default:
                int iD = hne.d(i5, i3, 2, i3);
                paint2.set(paint);
                b930Var.getClass();
                paint2.setColor(xbc.I(paint2.getColor(), 25));
                paint2.setStyle(Paint.Style.FILL);
                int i12 = b930Var.f;
                if (i12 >= 0) {
                    paint2.setStrokeWidth(i12);
                }
                int strokeWidth = (int) ((((int) (paint2.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
                if (i2 > 0) {
                    width = canvas.getWidth();
                } else {
                    width = i;
                    i -= canvas.getWidth();
                }
                rect.set(i, iD - strokeWidth, width, iD + strokeWidth);
                canvas.drawRect(rect, paint2);
                break;
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        switch (this.f14375a) {
            case 0:
                return this.b.f2188a;
            default:
                return 0;
        }
    }
}

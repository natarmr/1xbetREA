package a;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class oao extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f24937a;
    public final TextPaint b;
    public final int c;
    public final int d;
    public String e;
    public String f;
    public float g;
    public float h;
    public String i;
    public float j;
    public float k;
    public String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oao(Context context) {
        super(context, null);
        context.getClass();
        TextPaint textPaint = new TextPaint(1);
        r7x.r(textPaint, context, R.style.TextStyle_Text_Medium_TextPrimary);
        this.f24937a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        r7x.r(textPaint2, context, R.style.TextStyle_Text_Medium_Secondary);
        this.b = textPaint2;
        this.c = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.d = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.e = "";
        this.f = "";
        this.i = "";
        this.l = "";
    }

    public final String getAdditionalHeaderTitle() {
        return this.f;
    }

    public final String getHeaderTitle() {
        return this.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        if (this.i.length() > 0) {
            canvas.drawText(this.i, this.h, this.g, this.f24937a);
        }
        if (this.l.length() > 0) {
            canvas.drawText(this.l, this.k, this.j, this.b);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = (this.e.length() == 0 || this.f.length() == 0) ? 0 : this.d;
        String str = this.e;
        TextPaint textPaint = this.f24937a;
        float fMeasureText = textPaint.measureText(str);
        String str2 = this.f;
        TextPaint textPaint2 = this.b;
        float fMeasureText2 = textPaint2.measureText(str2);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.c;
        int i5 = (measuredWidth - (i4 * 2)) - i3;
        float f = fMeasureText + fMeasureText2 + i3 + (i4 * 2);
        float measuredWidth2 = ((getMeasuredWidth() - i4) / 2) - i3;
        if (f <= getMeasuredWidth()) {
            this.i = this.e;
            this.l = this.f;
        } else if (f > getMeasuredWidth()) {
            if (fMeasureText > measuredWidth2 && fMeasureText2 > measuredWidth2) {
                String str3 = this.e;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                this.i = TextUtils.ellipsize(str3, textPaint, measuredWidth2, truncateAt).toString();
                this.l = TextUtils.ellipsize(this.f, textPaint2, measuredWidth2, truncateAt).toString();
            } else if (fMeasureText < measuredWidth2) {
                this.i = this.e;
                this.l = TextUtils.ellipsize(this.f, textPaint2, i5 - fMeasureText, TextUtils.TruncateAt.END).toString();
            } else if (fMeasureText2 < measuredWidth2) {
                this.l = this.f;
                this.i = TextUtils.ellipsize(this.e, textPaint, i5 - fMeasureText2, TextUtils.TruncateAt.END).toString();
            }
        }
        int i6 = size2 / 2;
        if (this.i.length() > 0) {
            this.h = getLayoutDirection() == 1 ? (size - textPaint.measureText(this.i)) - i4 : i4;
            this.g = i6 - ((textPaint.ascent() + textPaint.descent()) / 2.0f);
        }
        if (this.l.length() > 0) {
            this.k = getLayoutDirection() == 1 ? i4 : (size - textPaint2.measureText(this.l)) - i4;
            this.j = i6 - ((textPaint2.ascent() + textPaint2.descent()) / 2.0f);
        }
    }
}

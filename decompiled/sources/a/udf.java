package a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class udf extends FrameLayout implements zse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f35474a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public final TextPaint m;
    public final TextPaint n;
    public final int o;
    public final int p;
    public final int q;
    public String r;
    public String s;
    public String t;
    public String u;
    public int v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public udf(Context context) {
        super(context, null, 0);
        context.getClass();
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        textPaint.setStyle(style);
        r7x.r(textPaint, context, R.style.TextStyle_Caption_Bold_L_TextPrimary);
        this.m = textPaint;
        TextPaint textPaint2 = new TextPaint();
        textPaint2.setAntiAlias(true);
        textPaint2.setStyle(style);
        r7x.r(textPaint2, context, R.style.TextStyle_Caption_Bold_M_TextPrimary);
        this.n = textPaint2;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.size_32);
        this.o = dimensionPixelSize;
        this.p = getResources().getDimensionPixelSize(R.dimen.space_2);
        this.q = dimensionPixelSize * 2;
        this.r = "";
        this.s = "";
        this.t = "";
        this.u = "";
        pip0 pip0Var = pip0.INACTIVE;
        this.v = R.attr.uikitTextPrimary;
        this.w = R.attr.uikitTextPrimary;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        int i = this.v;
        TextPaint textPaint = this.m;
        textPaint.setColor(i);
        int i2 = this.v;
        TextPaint textPaint2 = this.n;
        textPaint2.setColor(i2);
        canvas.drawText(this.r, this.f35474a, this.c, textPaint);
        canvas.drawText(this.s, this.e, this.g, textPaint2);
        textPaint.setColor(this.w);
        textPaint2.setColor(this.w);
        canvas.drawText(this.t, this.b, this.d, textPaint);
        canvas.drawText(this.u, this.f, this.h, textPaint2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        String str = this.r;
        TextPaint textPaint = this.m;
        this.i = textPaint.measureText(str);
        String str2 = this.s;
        TextPaint textPaint2 = this.n;
        this.k = textPaint2.measureText(str2);
        this.j = textPaint.measureText(this.t);
        float fMeasureText = textPaint2.measureText(this.u);
        this.l = fMeasureText;
        float f = this.i + this.k;
        int i3 = this.p;
        int iMax = (int) Math.max(f + i3, this.j + fMeasureText + i3);
        this.e = getLayoutDirection() == 0 ? iMax - this.k : this.i + i3;
        this.f35474a = getLayoutDirection() == 0 ? (this.e - i3) - this.i : 0.0f;
        int i4 = this.o;
        int i5 = i4 / 2;
        float f2 = i5;
        this.c = (textPaint.getTextSize() / 2.0f) + f2;
        this.g = (textPaint2.getTextSize() / 2.0f) + f2;
        this.f = getLayoutDirection() == 0 ? iMax - this.l : this.j + i3;
        this.b = getLayoutDirection() == 0 ? (this.f - i3) - this.j : 0.0f;
        float f3 = i5 + i4;
        this.d = (textPaint.getTextSize() / 2.0f) + f3;
        this.h = (textPaint2.getTextSize() / 2.0f) + f3;
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(iMax, 1073741824), View.MeasureSpec.makeMeasureSpec(this.q, 1073741824));
    }

    @Override // a.zse
    public void setScoreUiModel(yse yseVar) {
        yseVar.getClass();
        tse tseVar = yseVar instanceof tse ? (tse) yseVar : null;
        if (tseVar == null) {
            return;
        }
        this.r = tseVar.f34457a;
        this.s = tseVar.b;
        this.t = tseVar.d;
        this.u = tseVar.e;
        Context context = getContext();
        context.getClass();
        this.v = m5d.b(tseVar.c.f27054a, context);
        Context context2 = getContext();
        context2.getClass();
        this.w = m5d.b(tseVar.f.f27054a, context2);
        invalidate();
        requestLayout();
    }
}

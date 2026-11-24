package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.FrameLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class f3h0 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f8864a;
    public final n0o0 b;
    public final float c;
    public final float d;
    public final int e;
    public final int f;
    public final int g;
    public float h;
    public float i;
    public final boolean j;
    public final Paint k;
    public final TextPaint l;
    public String m;

    public f3h0(ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper, null, 0);
        this.f8864a = new RectF();
        this.b = maz.b(new a7g0(this, (byte) 13));
        float dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.space_1);
        this.c = dimensionPixelSize;
        this.d = getResources().getDimensionPixelSize(R.dimen.radius_6);
        this.e = getResources().getDimensionPixelSize(R.dimen.size_24);
        this.f = getResources().getDimensionPixelSize(R.dimen.size_24);
        this.g = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.j = true;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(dimensionPixelSize);
        paint.setColor(m5d.b(R.attr.uikitSeparator, contextThemeWrapper));
        this.k = paint;
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        r7x.r(textPaint, contextThemeWrapper, R.style.TextStyle_Caption_Bold_L_TextPrimary);
        this.l = textPaint;
        this.m = "";
        setWillNotDraw(false);
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(null, cqd0.d, 0, 0);
        this.j = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        setBackground(contextThemeWrapper.getDrawable(R.drawable.rounded_background_6));
        getBackgroundTintHelper().a(null, 0);
    }

    private final od5 getBackgroundTintHelper() {
        return (od5) this.b.getValue();
    }

    private final int getViewWidth() {
        int length = this.m.length();
        int i = this.e;
        return length <= 2 ? i : ((this.m.length() - 2) * this.g) + i;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getBackgroundTintHelper().b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        if (this.m.length() > 0) {
            canvas.drawText(this.m, this.h, this.i, this.l);
            if (this.j) {
                RectF rectF = this.f8864a;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = getMeasuredWidth();
                rectF.bottom = getMeasuredHeight();
                float f = this.d;
                canvas.drawRoundRect(rectF, f, f, this.k);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Integer numValueOf = Integer.valueOf(View.MeasureSpec.getMode(i) == 1073741824 ? View.MeasureSpec.getSize(i) : getViewWidth());
        if (this.m.length() <= 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        int i3 = this.f;
        Integer numValueOf2 = this.m.length() > 0 ? Integer.valueOf(i3) : null;
        int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 0;
        String str = this.m;
        TextPaint textPaint = this.l;
        this.h = (iIntValue / 2) - (textPaint.measureText(str) / 2.0f);
        this.i = ((textPaint.getTextSize() / 2.0f) + (i3 / 2)) - this.c;
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(iIntValue, 1073741824), View.MeasureSpec.makeMeasureSpec(iIntValue2, 1073741824));
    }

    public final void setTeamScore(String str) {
        str.getClass();
        this.m = str;
        setVisibility(str.length() > 0 ? 0 : 8);
        invalidate();
        requestLayout();
    }

    public final void setTeamScoreState(pip0 pip0Var) {
        pip0Var.getClass();
        Context context = getContext();
        context.getClass();
        int iB = m5d.b(pip0Var.f27054a, context);
        TextPaint textPaint = this.l;
        textPaint.setColor(iB);
        textPaint.setAlpha(pip0Var == pip0.INACTIVE ? 127 : 255);
        invalidate();
    }
}

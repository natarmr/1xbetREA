package a;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class wqm extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f39597a;
    public final Matrix b;
    public final ValueAnimator c;
    public final float d;

    public wqm(boolean z) {
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.f39597a = paint;
        this.b = new Matrix();
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(2500L);
        valueAnimator.setRepeatCount(-1);
        float[] fArr = {-1.0f, 1.0f};
        if (z) {
            // fill-array-data instruction
            fArr[0] = 1.0f;
            fArr[1] = -1.0f;
            valueAnimator.setFloatValues(fArr);
        } else {
            valueAnimator.setFloatValues(fArr);
        }
        valueAnimator.addUpdateListener(new sb3(this, valueAnimator, (byte) 3));
        this.c = valueAnimator;
        this.d = (z ? -1 : 1) * 20.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        Object animatedValue = this.c.getAnimatedValue();
        animatedValue.getClass();
        float fFloatValue = ((Float) animatedValue).floatValue() * getBounds().width() * 1.1f;
        Matrix matrix = this.b;
        matrix.reset();
        matrix.postRotate(this.d);
        matrix.preTranslate(fFloatValue, 0.0f);
        Paint paint = this.f39597a;
        Shader shader = paint.getShader();
        if (shader != null) {
            shader.setLocalMatrix(matrix);
        }
        canvas.drawRect(getBounds(), paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        rect.getClass();
        this.f39597a.setShader(new LinearGradient(0.0f, 0.0f, getBounds().width(), 0.0f, CollectionsKt.K0(q3d.j(-1, Integer.valueOf(k5d.e(-1, 160)), Integer.valueOf(k5d.e(-1, 160)), -1)), gqj0.f11736a, Shader.TileMode.CLAMP));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

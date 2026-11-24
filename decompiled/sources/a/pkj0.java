package a;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes2.dex */
public final class pkj0 extends tkj0 {
    public final rkj0 c;
    public final float d;
    public final float e;

    public pkj0(rkj0 rkj0Var, float f, float f2) {
        this.c = rkj0Var;
        this.d = f;
        this.e = f2;
    }

    @Override // a.tkj0
    public final void a(Matrix matrix, ujj0 ujj0Var, int i, Canvas canvas) {
        rkj0 rkj0Var = this.c;
        float f = rkj0Var.c;
        float f2 = this.e;
        float f3 = rkj0Var.b;
        float f4 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.f34098a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        ujj0Var.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = ujj0Var.c;
        int[] iArr = ujj0.i;
        iArr[0] = i2;
        iArr[1] = ujj0Var.b;
        iArr[2] = ujj0Var.f35784a;
        Paint paint = (Paint) ujj0Var.f;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, ujj0.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        rkj0 rkj0Var = this.c;
        return (float) Math.toDegrees(Math.atan((rkj0Var.c - this.e) / (rkj0Var.b - this.d)));
    }
}

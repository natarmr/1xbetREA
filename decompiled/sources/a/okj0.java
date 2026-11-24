package a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes2.dex */
public final class okj0 extends tkj0 {
    public final qkj0 c;

    public okj0(qkj0 qkj0Var) {
        this.c = qkj0Var;
    }

    @Override // a.tkj0
    public final void a(Matrix matrix, ujj0 ujj0Var, int i, Canvas canvas) {
        RectF rectF = qkj0.h;
        qkj0 qkj0Var = this.c;
        float f = qkj0Var.f;
        float f2 = qkj0Var.g;
        RectF rectF2 = new RectF(qkj0Var.b, qkj0Var.c, qkj0Var.d, qkj0Var.e);
        Paint paint = (Paint) ujj0Var.e;
        boolean z = f2 < 0.0f;
        Path path = (Path) ujj0Var.h;
        int[] iArr = ujj0.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = ujj0Var.c;
            iArr[2] = ujj0Var.b;
            iArr[3] = ujj0Var.f35784a;
        } else {
            path.rewind();
            path.moveTo(rectF2.centerX(), rectF2.centerY());
            path.arcTo(rectF2, f, f2);
            path.close();
            float f3 = -i;
            rectF2.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = ujj0Var.f35784a;
            iArr[2] = ujj0Var.b;
            iArr[3] = ujj0Var.c;
        }
        float fWidth = rectF2.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float fZ = rw2.z(1.0f, f4, 2.0f, f4);
        float[] fArr = ujj0.l;
        fArr[1] = f4;
        fArr[2] = fZ;
        paint.setShader(new RadialGradient(rectF2.centerX(), rectF2.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF2.height() / rectF2.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, (Paint) ujj0Var.g);
        }
        canvas.drawArc(rectF2, f, f2, true, paint);
        canvas.restore();
    }
}

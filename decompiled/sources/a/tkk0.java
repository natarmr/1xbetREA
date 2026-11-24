package a;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class tkk0 extends tz5 {
    public final RectF D;
    public final sty E;
    public final float[] F;
    public final Path G;
    public final y5z H;
    public h2u0 I;
    public h2u0 J;

    public tkk0(bb10 bb10Var, y5z y5zVar) {
        super(bb10Var, y5zVar);
        this.D = new RectF();
        sty styVar = new sty();
        this.E = styVar;
        this.F = new float[8];
        this.G = new Path();
        this.H = y5zVar;
        styVar.setAlpha(0);
        styVar.setStyle(Paint.Style.FILL);
        styVar.setColor(y5zVar.l);
    }

    @Override // a.tz5, a.thl
    public final void e(RectF rectF, Matrix matrix, boolean z) {
        super.e(rectF, matrix, z);
        y5z y5zVar = this.H;
        float f = y5zVar.j;
        float f2 = y5zVar.k;
        RectF rectF2 = this.D;
        rectF2.set(0.0f, 0.0f, f, f2);
        this.n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // a.tz5, a.uky
    public final void g(zn00 zn00Var, Object obj) {
        super.g(zn00Var, obj);
        if (obj == nb10.I) {
            this.I = new h2u0(zn00Var, null);
        } else if (obj == 1) {
            this.J = new h2u0(zn00Var, null);
        }
    }

    @Override // a.tz5
    public final void k(Canvas canvas, Matrix matrix, int i, kil kilVar) {
        y5z y5zVar = this.H;
        int iAlpha = Color.alpha(y5zVar.l);
        if (iAlpha == 0) {
            return;
        }
        h2u0 h2u0Var = this.J;
        Integer num = h2u0Var == null ? null : (Integer) h2u0Var.e();
        sty styVar = this.E;
        if (num != null) {
            styVar.setColor(num.intValue());
        } else {
            styVar.setColor(y5zVar.l);
        }
        sz5 sz5Var = this.w.p;
        int iIntValue = (int) ((((iAlpha / 255.0f) * (sz5Var == null ? 100 : ((Integer) sz5Var.e()).intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
        styVar.setAlpha(iIntValue);
        if (kilVar == null || Color.alpha(kilVar.d) <= 0) {
            styVar.clearShadowLayer();
        } else {
            styVar.setShadowLayer(Math.max(kilVar.f18344a, Float.MIN_VALUE), kilVar.b, kilVar.c, kilVar.d);
        }
        h2u0 h2u0Var2 = this.I;
        if (h2u0Var2 != null) {
            styVar.setColorFilter((ColorFilter) h2u0Var2.e());
        }
        if (iIntValue > 0) {
            float[] fArr = this.F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = y5zVar.j;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f2 = y5zVar.k;
            fArr[5] = f2;
            fArr[6] = 0.0f;
            fArr[7] = f2;
            matrix.mapPoints(fArr);
            Path path = this.G;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, styVar);
        }
    }
}

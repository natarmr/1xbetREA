package a;

import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ahg0 extends lls0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f874a;
    public final float b;
    public final float c;
    public final float d;
    public final String e;

    public ahg0(float f, float f2, float f3, float f4) {
        this.f874a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (f < 0.0f || f2 < 0.0f || f3 < 0.0f || f4 < 0.0f) {
            jf4.o("All radii must be >= 0.");
            throw null;
        }
        this.e = sre0.f32672a.b(ahg0.class).v() + "-" + f + Separators.COMMA + f2 + Separators.COMMA + f3 + Separators.COMMA + f4;
    }

    @Override // a.lls0
    public final String a() {
        return this.e;
    }

    @Override // a.lls0
    public final Bitmap b(Bitmap bitmap, f7k0 f7k0Var) {
        long jB;
        f7k0 f7k0Var2 = f7k0.c;
        if (Intrinsics.d(f7k0Var, f7k0Var2)) {
            jB = z1x.B(bitmap.getWidth(), bitmap.getHeight());
        } else {
            umk umkVar = f7k0Var.f9062a;
            umk umkVar2 = f7k0Var.b;
            if ((umkVar instanceof rmk) && (umkVar2 instanceof rmk)) {
                jB = z1x.B(((rmk) umkVar).f30747a, ((rmk) umkVar2).f30747a);
            } else {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                umk umkVar3 = f7k0Var.f9062a;
                double dA = u1c.A(width, height, umkVar3 instanceof rmk ? ((rmk) umkVar3).f30747a : Integer.MIN_VALUE, umkVar2 instanceof rmk ? ((rmk) umkVar2).f30747a : Integer.MIN_VALUE, j1h0.f15734a, f7k0Var2);
                jB = z1x.B(si30.a(((double) bitmap.getWidth()) * dA), si30.a(dA * ((double) bitmap.getHeight())));
            }
        }
        int i = (int) (jB >> 32);
        int i2 = (int) (jB & 4294967295L);
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paintW = qsm0.w(bitmap, i, i2);
        float f = this.f874a;
        float f2 = this.b;
        float f3 = this.d;
        float f4 = this.c;
        if (f == f2 && f2 == f4 && f4 == f3) {
            canvas.drawRoundRect(0.0f, 0.0f, i, i2, f, f, paintW);
            return bitmapCreateBitmap;
        }
        float[] fArr = {f, f, f2, f2, f3, f3, f4, f4};
        RectF rectF = new RectF(0.0f, 0.0f, i, i2);
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paintW);
        return bitmapCreateBitmap;
    }
}

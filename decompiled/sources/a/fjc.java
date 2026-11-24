package a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes6.dex */
public final class fjc extends lls0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9633a;
    public final String b;

    public fjc(byte b) {
        this.f9633a = b;
        switch (b) {
            case 1:
                this.b = "RotateCoilTransformation(90)";
                break;
            default:
                this.b = String.valueOf(sre0.f32672a.b(fjc.class).v());
                break;
        }
    }

    @Override // a.lls0
    public final String a() {
        byte b = this.f9633a;
        return this.b;
    }

    @Override // a.lls0
    public final Bitmap b(Bitmap bitmap, f7k0 f7k0Var) {
        switch (this.f9633a) {
            case 0:
                int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
                Bitmap.Config config = bitmap.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, config);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Paint paintW = qsm0.w(bitmap, iMin, iMin);
                float f = iMin / 2.0f;
                canvas.drawCircle(f, f, f, paintW);
                return bitmapCreateBitmap;
            default:
                Matrix matrix = new Matrix();
                matrix.postRotate(90.0f);
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                bitmapCreateBitmap2.getClass();
                return bitmapCreateBitmap2;
        }
    }
}

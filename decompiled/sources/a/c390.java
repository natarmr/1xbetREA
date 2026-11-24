package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public final class c390 extends f290 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f3662a = new Path();
    public final Matrix b = new Matrix();

    public c390(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x4d0.o);
        try {
            String strQ = zsm0.q(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (strQ == null) {
                throw new RuntimeException("pathData must be supplied for patternPathMotion");
            }
            b(gfx.E(strQ));
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // a.f290
    public final Path a(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float fSqrt = (float) Math.sqrt((f6 * f6) + (f5 * f5));
        double dAtan2 = Math.atan2(f6, f5);
        Matrix matrix = this.b;
        matrix.setScale(fSqrt, fSqrt);
        matrix.postRotate((float) Math.toDegrees(dAtan2));
        matrix.postTranslate(f, f2);
        Path path = new Path();
        this.f3662a.transform(matrix, path);
        return path;
    }

    public final void b(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            jf4.o("pattern must not end at the starting point");
            return;
        }
        Matrix matrix = this.b;
        matrix.setTranslate(-f3, -f4);
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fSqrt = 1.0f / ((float) Math.sqrt((f6 * f6) + (f5 * f5)));
        matrix.postScale(fSqrt, fSqrt);
        matrix.postRotate((float) Math.toDegrees(-Math.atan2(f6, f5)));
        path.transform(matrix, this.f3662a);
    }
}

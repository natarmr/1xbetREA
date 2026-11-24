package a;

import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class drv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final drv0 f6584a = new drv0();

    public final long a(Paint paint) {
        int i = y3d.h;
        long colorLong = paint.getColorLong();
        long j = 63 & colorLong;
        if (j >= 16) {
            colorLong = (colorLong & (-64)) | (j + 1);
        }
        g2t0 g2t0Var = h2t0.b;
        return colorLong;
    }

    public final void b(Paint paint, int i) {
        paint.setBlendMode(dj8.b0(i));
    }

    public final void c(Paint paint, long j) {
        paint.setColor(rq8.X(j));
    }
}

package a;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class atf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointF f1429a;
    public final PointF b;
    public final PointF c;

    public atf() {
        this.f1429a = new PointF();
        this.b = new PointF();
        this.c = new PointF();
    }

    public final String toString() {
        PointF pointF = this.c;
        Float fValueOf = Float.valueOf(pointF.x);
        Float fValueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.f1429a;
        Float fValueOf3 = Float.valueOf(pointF2.x);
        Float fValueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", fValueOf, fValueOf2, fValueOf3, fValueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public atf(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f1429a = pointF;
        this.b = pointF2;
        this.c = pointF3;
    }
}

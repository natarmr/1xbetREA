package a;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class d290 extends cmy {
    public Path q;
    public final cmy r;

    public d290(fa10 fa10Var, cmy cmyVar) {
        super(fa10Var, (PointF) cmyVar.b, (PointF) cmyVar.c, cmyVar.d, cmyVar.e, cmyVar.f, cmyVar.g, cmyVar.h);
        this.r = cmyVar;
        d();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public final void d() {
        boolean z;
        Object obj;
        Object obj2 = this.c;
        Object obj3 = this.b;
        if (obj2 == null || obj3 == null) {
            z = false;
        } else {
            PointF pointF = (PointF) obj2;
            if (((PointF) obj3).equals(pointF.x, pointF.y)) {
                z = true;
            } else {
                z = false;
            }
        }
        if (obj3 == null || (obj = this.c) == null || z) {
            return;
        }
        PointF pointF2 = (PointF) obj3;
        PointF pointF3 = (PointF) obj;
        cmy cmyVar = this.r;
        PointF pointF4 = cmyVar.o;
        PointF pointF5 = cmyVar.p;
        Matrix matrix = cut0.f5002a;
        Path path = new Path();
        path.moveTo(pointF2.x, pointF2.y);
        if (pointF4 == null || pointF5 == null || (pointF4.length() == 0.0f && pointF5.length() == 0.0f)) {
            path.lineTo(pointF3.x, pointF3.y);
        } else {
            float f = pointF4.x + pointF2.x;
            float f2 = pointF2.y + pointF4.y;
            float f3 = pointF3.x;
            float f4 = f3 + pointF5.x;
            float f5 = pointF3.y;
            path.cubicTo(f, f2, f4, f5 + pointF5.y, f3, f5);
        }
        this.q = path;
    }
}

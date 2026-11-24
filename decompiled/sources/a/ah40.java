package a;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class ah40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PointF f855a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static int c(int i) {
        return Math.max(0, Math.min(255, i));
    }

    public static int d(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!((i ^ i2) >= 0) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static void e(dkj0 dkj0Var, Path path) {
        Path path2;
        path.reset();
        PointF pointF = dkj0Var.b;
        ArrayList arrayList = dkj0Var.f6233a;
        path.moveTo(pointF.x, pointF.y);
        float f = pointF.x;
        float f2 = pointF.y;
        PointF pointF2 = f855a;
        pointF2.set(f, f2);
        int i = 0;
        while (i < arrayList.size()) {
            atf atfVar = (atf) arrayList.get(i);
            PointF pointF3 = atfVar.f1429a;
            PointF pointF4 = atfVar.b;
            PointF pointF5 = atfVar.c;
            if (pointF3.equals(pointF2) && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i++;
            path = path2;
        }
        Path path3 = path;
        if (dkj0Var.c) {
            path3.close();
        }
    }

    public static float f(float f, float f2, float f3) {
        return rw2.a(f2, f, f3, f);
    }

    public static void g(tky tkyVar, int i, ArrayList arrayList, tky tkyVar2, vky vkyVar) {
        if (tkyVar.a(i, vkyVar.getName())) {
            String name = vkyVar.getName();
            tky tkyVar3 = new tky(tkyVar2);
            tkyVar3.f34119a.add(name);
            tky tkyVar4 = new tky(tkyVar3);
            tkyVar4.b = vkyVar;
            arrayList.add(tkyVar4);
        }
    }
}

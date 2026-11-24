package a;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ot40 extends bk30 {
    public final fms0 i;
    public p4e j;

    public ot40(w6k w6kVar) {
        super(w6kVar);
        this.i = new fms0(new viq(w6kVar, (byte) 24));
    }

    public static void g(fhl fhlVar, vdv0 vdv0Var, x03 x03Var, long j) {
        if (vdv0Var.c()) {
            fhl.u(fhlVar, j, k9x.i(vdv0Var.b, vdv0Var.c), p7x.n(Math.max(0, vdv0Var.d - vdv0Var.b), Math.max(0, vdv0Var.e - vdv0Var.c)), 0.0f, new vtm0(3.0f, 0.0f, 0, 0, x03Var, 14), null, 0, 104);
            return;
        }
        Matrix matrix = new Matrix();
        if (!Float.isNaN(vdv0Var.j)) {
            float f = vdv0Var.j;
            int i = vdv0Var.b;
            float f2 = ((vdv0Var.d - i) / 2.0f) + i;
            int i2 = vdv0Var.c;
            matrix.preRotate(f, f2, ((vdv0Var.e - i2) / 2.0f) + i2);
        }
        float f3 = Float.isNaN(vdv0Var.n) ? 1.0f : vdv0Var.n;
        float f4 = Float.isNaN(vdv0Var.o) ? 1.0f : vdv0Var.o;
        int i3 = vdv0Var.b;
        float f5 = ((vdv0Var.d - i3) / 2.0f) + i3;
        int i4 = vdv0Var.c;
        matrix.preScale(f3, f4, f5, ((vdv0Var.e - i4) / 2.0f) + i4);
        float f6 = vdv0Var.b;
        float f7 = vdv0Var.c;
        float f8 = vdv0Var.d;
        float f9 = vdv0Var.e;
        float[] fArr = {f6, f7, f8, f7, f8, f9, f6, f9};
        matrix.mapPoints(fArr);
        fhl.Q(fhlVar, j, k9x.i(fArr[0], fArr[1]), k9x.i(fArr[2], fArr[3]), 3.0f, 0, x03Var, 464);
        fhl.Q(fhlVar, j, k9x.i(fArr[2], fArr[3]), k9x.i(fArr[4], fArr[5]), 3.0f, 0, x03Var, 464);
        fhl.Q(fhlVar, j, k9x.i(fArr[4], fArr[5]), k9x.i(fArr[6], fArr[7]), 3.0f, 0, x03Var, 464);
        fhl.Q(fhlVar, j, k9x.i(fArr[6], fArr[7]), k9x.i(fArr[0], fArr[1]), 3.0f, 0, x03Var, 464);
    }

    public final void h(s3e s3eVar, List list, long j) {
        f7m0 f7m0Var = this.e;
        f7m0Var.g();
        s3eVar.b(f7m0Var, list);
        jeb.L(f7m0Var, list);
        l4e l4eVar = this.f2731a;
        f7m0Var.a(l4eVar);
        ArrayList arrayList = l4eVar.u0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((k4e) arrayList.get(i)).j0 = true;
        }
        l4eVar.T(p4e.i(j));
        l4eVar.O(p4e.h(j));
        this.h = Float.NaN;
        l4eVar.v0.z(l4eVar);
        l4eVar.H0 = 257;
        p900.q = l4eVar.d0(512);
        this.f2731a.b0(0, 0, 0, 0, 0, 0, 0);
    }
}

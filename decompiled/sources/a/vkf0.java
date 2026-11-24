package a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class vkf0 implements thl, b290, sfv, oz5, vky {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f37569a = new Matrix();
    public final Path b = new Path();
    public final bb10 c;
    public final tz5 d;
    public final String e;
    public final boolean f;
    public final hlq g;
    public final hlq h;
    public final hls0 i;
    public dee j;

    public vkf0(bb10 bb10Var, tz5 tz5Var, sge0 sge0Var) {
        this.c = bb10Var;
        this.d = tz5Var;
        this.e = sge0Var.b;
        this.f = sge0Var.d;
        hlq hlqVarF0 = sge0Var.c.f0();
        this.g = hlqVarF0;
        tz5Var.f(hlqVarF0);
        hlqVarF0.a(this);
        hlq hlqVarF1 = ((v33) sge0Var.e).f0();
        this.h = hlqVarF1;
        tz5Var.f(hlqVarF1);
        hlqVarF1.a(this);
        z33 z33Var = (z33) sge0Var.f;
        z33Var.getClass();
        hls0 hls0Var = new hls0(z33Var);
        this.i = hls0Var;
        hls0Var.a(tz5Var);
        hls0Var.b(this);
    }

    @Override // a.oz5
    public final void a() {
        this.c.invalidateSelf();
    }

    @Override // a.qde
    public final void b(List list, List list2) {
        this.j.b(list, list2);
    }

    @Override // a.b290
    public final Path c() {
        Path pathC = this.j.c();
        Path path = this.b;
        path.reset();
        float fFloatValue = ((Float) this.g.e()).floatValue();
        float fFloatValue2 = ((Float) this.h.e()).floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            Matrix matrixF = this.i.f(i + fFloatValue2);
            Matrix matrix = this.f37569a;
            matrix.set(matrixF);
            path.addPath(pathC, matrix);
        }
        return path;
    }

    @Override // a.uky
    public final void d(tky tkyVar, int i, ArrayList arrayList, tky tkyVar2) {
        ah40.g(tkyVar, i, arrayList, tkyVar2, this);
        for (int i2 = 0; i2 < this.j.i.size(); i2++) {
            qde qdeVar = (qde) this.j.i.get(i2);
            if (qdeVar instanceof vky) {
                ah40.g(tkyVar, i, arrayList, tkyVar2, (vky) qdeVar);
            }
        }
    }

    @Override // a.thl
    public final void e(RectF rectF, Matrix matrix, boolean z) {
        this.j.e(rectF, matrix, z);
    }

    @Override // a.sfv
    public final void f(ListIterator listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((qde) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new dee(this.c, this.d, "Repeater", this.f, arrayList, null);
    }

    @Override // a.uky
    public final void g(zn00 zn00Var, Object obj) {
        if (this.i.c(zn00Var, obj)) {
            return;
        }
        if (obj == nb10.s) {
            this.g.j(zn00Var);
        } else if (obj == nb10.t) {
            this.h.j(zn00Var);
        }
    }

    @Override // a.qde
    public final String getName() {
        return this.e;
    }

    @Override // a.thl
    public final void h(Canvas canvas, Matrix matrix, int i, kil kilVar) {
        float fFloatValue = ((Float) this.g.e()).floatValue();
        float fFloatValue2 = ((Float) this.h.e()).floatValue();
        hls0 hls0Var = this.i;
        float fFloatValue3 = ((Float) hls0Var.v.e()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) hls0Var.w.e()).floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            Matrix matrix2 = this.f37569a;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(hls0Var.f(f + fFloatValue2));
            this.j.h(canvas, matrix2, (int) (ah40.f(fFloatValue3, fFloatValue4, f / fFloatValue) * i), kilVar);
        }
    }
}

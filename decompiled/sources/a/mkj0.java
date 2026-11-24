package a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mkj0 extends tz5 {
    public final dee D;
    public final uld E;
    public final nil F;

    public mkj0(bb10 bb10Var, y5z y5zVar, uld uldVar, fa10 fa10Var) {
        super(bb10Var, y5zVar);
        this.E = uldVar;
        dee deeVar = new dee(bb10Var, this, new ikj0("__container", y5zVar.f42071a, false), fa10Var);
        this.D = deeVar;
        List list = Collections.EMPTY_LIST;
        deeVar.b(list, list);
        kki kkiVar = this.p.x;
        if (kkiVar != null) {
            this.F = new nil(this, this, kkiVar);
        }
    }

    @Override // a.tz5, a.thl
    public final void e(RectF rectF, Matrix matrix, boolean z) {
        super.e(rectF, matrix, z);
        this.D.e(rectF, this.n, z);
    }

    @Override // a.tz5, a.uky
    public final void g(zn00 zn00Var, Object obj) {
        super.g(zn00Var, obj);
        PointF pointF = nb10.f23218a;
        nil nilVar = this.F;
        if (obj == 5 && nilVar != null) {
            nilVar.c.j(zn00Var);
            return;
        }
        if (obj == nb10.E && nilVar != null) {
            nilVar.c(zn00Var);
            return;
        }
        if (obj == nb10.F && nilVar != null) {
            nilVar.e.j(zn00Var);
            return;
        }
        if (obj == nb10.G && nilVar != null) {
            nilVar.f.j(zn00Var);
        } else {
            if (obj != nb10.H || nilVar == null) {
                return;
            }
            nilVar.g.j(zn00Var);
        }
    }

    @Override // a.tz5
    public final void k(Canvas canvas, Matrix matrix, int i, kil kilVar) {
        nil nilVar = this.F;
        if (nilVar != null) {
            kilVar = nilVar.b(matrix, i);
        }
        this.D.h(canvas, matrix, i, kilVar);
    }

    @Override // a.tz5
    public final r7v l() {
        r7v r7vVar = this.p.w;
        return r7vVar != null ? r7vVar : this.E.p.w;
    }

    @Override // a.tz5
    public final void p(tky tkyVar, int i, ArrayList arrayList, tky tkyVar2) {
        this.D.d(tkyVar, i, arrayList, tkyVar2);
    }
}

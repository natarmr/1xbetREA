package a;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class cmn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4614a;
    public final Matrix b;
    public final boolean c;
    public final Rect d;
    public final boolean e;
    public final int f;
    public final h55 g;
    public int h;
    public int i;
    public pmn0 k;
    public bmn0 l;
    public boolean j = false;
    public final HashSet m = new HashSet();
    public boolean n = false;
    public final ArrayList o = new ArrayList();

    public cmn0(int i, int i2, h55 h55Var, Matrix matrix, boolean z, Rect rect, int i3, int i4, boolean z2) {
        this.f = i;
        this.f4614a = i2;
        this.g = h55Var;
        this.b = matrix;
        this.c = z;
        this.d = rect;
        this.i = i3;
        this.h = i4;
        this.e = z2;
        this.l = new bmn0(i2, h55Var.f12463a);
    }

    public final void a() {
        z1x.y("Edge is already closed.", !this.n);
    }

    public final void b() {
        ofm0.m();
        this.l.a();
        this.n = true;
        this.o.clear();
        this.m.clear();
    }

    public final pmn0 c(s0a s0aVar, boolean z) {
        ofm0.m();
        a();
        h55 h55Var = this.g;
        pmn0 pmn0Var = new pmn0(h55Var.f12463a, s0aVar, z, h55Var.c, new xln0(this, (byte) 0));
        try {
            o3x o3xVar = pmn0Var.k;
            bmn0 bmn0Var = this.l;
            if (bmn0Var.g(o3xVar, new yln0(bmn0Var, (byte) 0))) {
                ro4.c0(bmn0Var.e).a(new zln0(o3xVar, (byte) 0), bnk.a());
            }
            this.k = pmn0Var;
            e();
            return pmn0Var;
        } catch (gzj e) {
            throw new AssertionError("Surface is somehow already closed", e);
        } catch (RuntimeException e2) {
            pmn0Var.c();
            throw e2;
        }
    }

    public final void d() {
        boolean z;
        ofm0.m();
        a();
        bmn0 bmn0Var = this.l;
        ofm0.m();
        if (bmn0Var.p == null) {
            synchronized (bmn0Var.f13909a) {
                z = bmn0Var.c;
            }
            if (!z) {
                return;
            }
        }
        this.j = false;
        this.l.a();
        this.l = new bmn0(this.f4614a, this.g.f12463a);
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void e() {
        omn0 omn0Var;
        Executor executor;
        ofm0.m();
        l55 l55Var = new l55(this.d, this.i, this.h, this.c, this.b, this.e);
        pmn0 pmn0Var = this.k;
        if (pmn0Var != null) {
            synchronized (pmn0Var.f27245a) {
                pmn0Var.l = l55Var;
                omn0Var = pmn0Var.m;
                executor = pmn0Var.n;
            }
            if (omn0Var != null && executor != null) {
                executor.execute(new kmn0(omn0Var, l55Var, (byte) 0));
            }
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((sbe) it.next()).accept(l55Var);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceEdge{targets=");
        sb.append(this.f);
        sb.append(", format=");
        sb.append(this.f4614a);
        sb.append(", resolution=");
        sb.append(this.g.f12463a);
        sb.append(", cropRect=");
        sb.append(this.d);
        sb.append(", rotationDegrees=");
        sb.append(this.i);
        sb.append(", mirroring=");
        sb.append(this.e);
        sb.append(", sensorToBufferTransform= ");
        Matrix matrix = this.b;
        sb.append(matrix);
        sb.append(", rotationInTransform= ");
        sb.append(jls0.b(matrix));
        sb.append(", isMirrorInTransform= ");
        sb.append(jls0.e(matrix));
        sb.append(", isClosed=");
        return brm0.o(sb, this.n, '}');
    }
}

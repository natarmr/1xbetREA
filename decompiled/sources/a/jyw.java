package a;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class jyw extends fot0 {
    public static final hyw y = new hyw();
    public final Object r;
    public kyw s;
    public Rect t;
    public Matrix u;
    public tii0 v;
    public o3x w;
    public uii0 x;

    public jyw(myw mywVar) {
        super(mywVar);
        this.r = new Object();
    }

    @Override // a.fot0
    public final void A() {
        ofm0.m();
        uii0 uii0Var = this.x;
        if (uii0Var != null) {
            uii0Var.b();
            this.x = null;
        }
        o3x o3xVar = this.w;
        if (o3xVar != null) {
            o3xVar.a();
            this.w = null;
        }
        synchronized (this.r) {
            kyw kywVar = this.s;
            kywVar.o = false;
            kywVar.c();
            this.s = null;
        }
    }

    @Override // a.fot0
    public final void B(Matrix matrix) {
        super.B(matrix);
        synchronized (this.r) {
            try {
                kyw kywVar = this.s;
                if (kywVar != null) {
                    kywVar.h(matrix);
                }
                this.u = matrix;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.fot0
    public final void C(Rect rect) {
        this.l = rect;
        synchronized (this.r) {
            try {
                kyw kywVar = this.s;
                if (kywVar != null) {
                    kywVar.i(rect);
                }
                this.t = rect;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x009a  */
    public final tii0 G(myw mywVar, h55 h55Var) {
        kyw kywVar;
        boolean z;
        ofm0.m();
        Size size = h55Var.f12463a;
        Executor executor = (Executor) mywVar.e(bcq0.B0, jxv.a());
        executor.getClass();
        int iIntValue = ((Integer) ((myw) this.i).e(myw.b, 0)).intValue() == 1 ? ((Integer) ((myw) this.i).e(myw.c, 6)).intValue() : 4;
        ibe0 ibe0Var = null;
        if (mywVar.e(myw.d, null) != null) {
            hny.b();
            return null;
        }
        ibe0 ibe0Var2 = new ibe0(g1x.r(size.getWidth(), size.getHeight(), this.i.k(), iIntValue));
        synchronized (this.r) {
            I();
            kywVar = this.s;
        }
        if (d() != null) {
            s0a s0aVarD = d();
            if (!((Boolean) ((myw) this.i).e(myw.g, Boolean.FALSE)).booleanValue() || i(s0aVarD, false) % 180 == 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        int height = z ? size.getHeight() : size.getWidth();
        int width = z ? size.getWidth() : size.getHeight();
        int i = H() == 2 ? 1 : 35;
        boolean z2 = this.i.k() == 35 && H() == 2;
        boolean z3 = this.i.k() == 35 && H() == 3;
        boolean z4 = this.i.k() == 35 && (!(d() == null || i(d(), false) == 0) || Boolean.TRUE.equals((Boolean) ((myw) this.i).e(myw.f, null)));
        if (z2 || (z4 && !z3)) {
            ibe0Var = new ibe0(g1x.r(height, width, i, ibe0Var2.G()));
        }
        if (ibe0Var != null) {
            synchronized (kywVar.n) {
                kywVar.d = ibe0Var;
            }
        }
        J();
        ibe0Var2.o(kywVar, executor);
        tii0 tii0VarD = tii0.d(mywVar, h55Var.f12463a);
        drd drdVar = h55Var.f;
        if (drdVar != null) {
            tii0VarD.b.g(drdVar);
        }
        o3x o3xVar = this.w;
        if (o3xVar != null) {
            o3xVar.a();
        }
        o3x o3xVar2 = new o3x(ibe0Var2.getSurface(), size, this.i.k());
        this.w = o3xVar2;
        ro4.c0(o3xVar2.e).a(new llo(ibe0Var2, ibe0Var, (byte) 9), j120.T());
        tii0VarD.h = h55Var.d;
        a(tii0VarD, h55Var);
        tii0VarD.b(this.w, h55Var.c, -1);
        uii0 uii0Var = this.x;
        if (uii0Var != null) {
            uii0Var.b();
        }
        uii0 uii0Var2 = new uii0(new eyw(this, kywVar, (byte) 0));
        this.x = uii0Var2;
        tii0VarD.f = uii0Var2;
        return tii0VarD;
    }

    public final int H() {
        return ((Integer) ((myw) this.i).e(myw.e, 1)).intValue();
    }

    public final void I() {
        kyw lywVar;
        synchronized (this.r) {
            try {
                myw mywVar = (myw) this.i;
                if (((Integer) mywVar.e(myw.b, 0)).intValue() == 1) {
                    lywVar = new lyw();
                    this.s = lywVar;
                } else {
                    pyw pywVar = new pyw((Executor) mywVar.e(bcq0.B0, jxv.a()));
                    this.s = pywVar;
                    lywVar = pywVar;
                }
                lywVar.b = H();
                this.s.c = ((Boolean) ((myw) this.i).e(myw.g, Boolean.FALSE)).booleanValue();
                s0a s0aVarD = d();
                if (s0aVarD != null) {
                    s0aVarD.h().o().a(OnePixelShiftQuirk.class);
                }
                this.s.getClass();
                if (s0aVarD != null) {
                    this.s.f19126a = i(s0aVarD, false);
                }
                Rect rect = this.t;
                if (rect != null) {
                    this.s.i(rect);
                }
                Matrix matrix = this.u;
                if (matrix != null) {
                    this.s.h(matrix);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void J() {
        synchronized (this.r) {
            try {
                s0a s0aVarD = d();
                if (s0aVarD != null) {
                    this.s.f19126a = i(s0aVarD, false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.fot0
    public final fpt0 g(boolean z, ipt0 ipt0Var) {
        y.getClass();
        myw mywVar = hyw.f13880a;
        drd drdVarA = ipt0Var.a(mywVar.v(), 1);
        if (z) {
            drdVarA = drd.r(drdVarA, mywVar);
        }
        if (drdVarA == null) {
            return null;
        }
        return new myw(b780.j(((gyw) n(drdVarA)).b));
    }

    public final String toString() {
        return "ImageAnalysis:".concat(h());
    }

    @Override // a.fot0
    public final fpt0 v(n0a n0aVar, ept0 ept0Var) {
        synchronized (this.r) {
        }
        return ept0Var.e();
    }

    @Override // a.fot0
    public final h55 y(drd drdVar) {
        this.v.a(drdVar);
        Object[] objArr = {this.v.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        qgd qgdVarB = this.j.b();
        qgdVarB.g = drdVar;
        return qgdVarB.i();
    }

    @Override // a.fot0
    public final h55 z(h55 h55Var, h55 h55Var2) {
        l8x.U("ImageAnalysis", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + h55Var + ", secondaryStreamSpec " + h55Var2);
        myw mywVar = (myw) this.i;
        f();
        tii0 tii0VarG = G(mywVar, h55Var);
        this.v = tii0VarG;
        Object[] objArr = {tii0VarG.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        return h55Var;
    }
}

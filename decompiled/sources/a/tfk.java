package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class tfk extends yjj implements kfk, goc {
    public final eu00 f;
    public final tek g;
    public List h;
    public final p5 i;
    public final c4d0 j;
    public final h950 k;
    public final roi0 l;
    public final xbu0 m;
    public final hfk n;
    public kzj0 o;
    public kzj0 p;
    public List q;
    public kzj0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfk(eu00 eu00Var, vjj vjjVar, g93 g93Var, g950 g950Var, tek tekVar, c4d0 c4d0Var, h950 h950Var, roi0 roi0Var, xbu0 xbu0Var, hfk hfkVar) {
        super(vjjVar, g93Var, g950Var, gmk0.x0);
        eu00Var.getClass();
        vjjVar.getClass();
        g93Var.getClass();
        g950Var.getClass();
        tekVar.getClass();
        c4d0Var.getClass();
        h950Var.getClass();
        roi0Var.getClass();
        xbu0Var.getClass();
        eu00Var.getClass();
        vjjVar.getClass();
        g93Var.getClass();
        g950Var.getClass();
        tekVar.getClass();
        this.f = eu00Var;
        this.g = tekVar;
        eu00Var.b(new o5(this, (byte) 0));
        this.i = new p5(this);
        this.j = c4d0Var;
        this.k = h950Var;
        this.l = roi0Var;
        this.m = xbu0Var;
        this.n = hfkVar;
    }

    @Override // a.kfk
    public final h950 A() {
        return this.k;
    }

    @Override // a.kfk
    public final hfk B() {
        return this.n;
    }

    @Override // a.foc
    public final kzj0 I() {
        kzj0 kzj0Var = this.r;
        if (kzj0Var != null) {
            return kzj0Var;
        }
        Intrinsics.h("defaultTypeImpl");
        throw null;
    }

    @Override // a.sq30
    public final boolean L() {
        return false;
    }

    @Override // a.goc
    public final List M() {
        List list = this.h;
        if (list != null) {
            return list;
        }
        Intrinsics.h("declaredTypeParametersImpl");
        throw null;
    }

    @Override // a.kfk
    public final z3 O() {
        return this.j;
    }

    @Override // a.sq30
    public final boolean Q() {
        return false;
    }

    @Override // a.wen0
    public final xjj f(xzs0 xzs0Var) {
        xzs0Var.getClass();
        if (xzs0Var.f41769a.e()) {
            return this;
        }
        vjj vjjVarJ = j();
        vjjVarJ.getClass();
        g93 annotations = getAnnotations();
        annotations.getClass();
        g950 name = getName();
        name.getClass();
        tfk tfkVar = new tfk(this.f, vjjVarJ, annotations, name, this.g, this.j, this.k, this.l, this.m, this.n);
        List listM = M();
        kzj0 kzj0VarR1 = r1();
        t3u0 t3u0Var = t3u0.c;
        tfkVar.s1(listM, qsm0.s(xzs0Var.f(kzj0VarR1, t3u0Var)), qsm0.s(xzs0Var.f(q1(), t3u0Var)));
        return tfkVar;
    }

    @Override // a.sq30
    public final tek getVisibility() {
        return this.g;
    }

    @Override // a.foc
    public final iys0 h() {
        return this.i;
    }

    @Override // a.goc
    public final boolean i() {
        return e0t0.c(r1(), new w0((Object) this, (byte) 3), null);
    }

    @Override // a.vjj
    public final Object i0(zjj zjjVar, Object obj) {
        return zjjVar.n(this, obj);
    }

    @Override // a.sq30
    public final boolean isExternal() {
        return false;
    }

    public final wm40 p1() {
        if (bdx.k0(q1())) {
            return null;
        }
        foc focVarN = q1().S().n();
        if (focVarN instanceof wm40) {
            return (wm40) focVarN;
        }
        return null;
    }

    public final kzj0 q1() {
        kzj0 kzj0Var = this.p;
        if (kzj0Var != null) {
            return kzj0Var;
        }
        Intrinsics.h("expandedType");
        throw null;
    }

    public final kzj0 r1() {
        kzj0 kzj0Var = this.o;
        if (kzj0Var != null) {
            return kzj0Var;
        }
        Intrinsics.h("underlyingType");
        throw null;
    }

    public final void s1(List list, kzj0 kzj0Var, kzj0 kzj0Var2) {
        cr30 cr30VarK0;
        kzj0 kzj0VarI0;
        list.getClass();
        kzj0Var.getClass();
        kzj0Var2.getClass();
        this.h = list;
        this.o = kzj0Var;
        this.p = kzj0Var2;
        this.q = nsm0.o(this);
        wm40 wm40VarP1 = p1();
        if (wm40VarP1 == null || (cr30VarK0 = wm40VarP1.k0()) == null) {
            cr30VarK0 = br30.b;
        }
        cr30 cr30Var = cr30VarK0;
        pnk0 pnk0Var = new pnk0(this, (byte) 16);
        a2o a2oVar = e0t0.f7005a;
        if (f2o.f(this)) {
            kzj0VarI0 = f2o.c(c2o.k, toString());
        } else {
            iys0 iys0VarH = h();
            if (iys0VarH == null) {
                e0t0.a(12);
                throw null;
            }
            List listD = e0t0.d(((p5) iys0VarH).getParameters());
            ays0.b.getClass();
            kzj0VarI0 = ucx.i0(ays0.c, iys0VarH, listD, false, cr30Var, pnk0Var);
        }
        this.r = kzj0VarI0;
    }

    @Override // a.wjj, a.p4
    public final String toString() {
        return "typealias " + getName().b();
    }

    @Override // a.kfk
    public final roi0 x() {
        return this.l;
    }

    @Override // a.yjj, a.wjj, a.vjj, a.kp9
    /* JADX INFO: renamed from: a */
    public final vjj o1() {
        return this;
    }

    @Override // a.yjj, a.wjj, a.vjj, a.kp9
    /* JADX INFO: renamed from: a */
    public final foc o1() {
        return this;
    }

    @Override // a.yjj
    public final xjj o1() {
        return this;
    }
}

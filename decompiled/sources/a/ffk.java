package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ffk extends h1 implements vjj {
    public final s2d0 e;
    public final e28 f;
    public final gmk0 g;
    public final qlc h;
    public final gm40 i;
    public final tek j;
    public final slc k;
    public final g45 l;
    public final cr30 m;
    public final efk n;
    public final c3h0 o;
    public final ali p;
    public final vjj q;
    public final bu00 r;
    public final cu00 s;
    public final bu00 t;
    public final p4d0 u;
    public final g93 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffk(g45 g45Var, s2d0 s2d0Var, h950 h950Var, e28 e28Var, gmk0 gmk0Var) {
        slc slcVar;
        super((eu00) ((f6i) g45Var.f10647a).e, ydx.K(h950Var, s2d0Var.e).f());
        g45Var.getClass();
        s2d0Var.getClass();
        h950Var.getClass();
        e28Var.getClass();
        gmk0Var.getClass();
        this.e = s2d0Var;
        this.f = e28Var;
        this.g = gmk0Var;
        this.h = ydx.K(h950Var, s2d0Var.e);
        this.i = lwf.a((k3d0) njq.e.e(s2d0Var.d));
        this.j = l8x.V((o4d0) njq.d.e(s2d0Var.d));
        r2d0 r2d0Var = (r2d0) njq.f.e(s2d0Var.d);
        switch (r2d0Var == null ? -1 : u4d0.b[r2d0Var.ordinal()]) {
            case 1:
                slcVar = slc.f32392a;
                break;
            case 2:
                slcVar = slc.b;
                break;
            case 3:
                slcVar = slc.c;
                break;
            case 4:
                slcVar = slc.d;
                break;
            case 5:
                slcVar = slc.e;
                break;
            case 6:
            case 7:
                slcVar = slc.f;
                break;
            default:
                slcVar = slc.f32392a;
                break;
        }
        slc slcVar2 = slcVar;
        this.k = slcVar2;
        List list = s2d0Var.g;
        list.getClass();
        g4d0 g4d0Var = s2d0Var.A;
        g4d0Var.getClass();
        roi0 roi0Var = new roi0(g4d0Var);
        xbu0 xbu0Var = xbu0.b;
        n4d0 n4d0Var = s2d0Var.Y;
        n4d0Var.getClass();
        g45 g45VarH = g45Var.h(this, list, h950Var, roi0Var, tnq0.j(n4d0Var), e28Var);
        f6i f6iVar = (f6i) g45VarH.f10647a;
        eu00 eu00Var = (eu00) f6iVar.e;
        this.l = g45VarH;
        boolean zBooleanValue = njq.m.e(s2d0Var.d).booleanValue();
        cr30 dfkVar = new dfk(this);
        slc slcVar3 = slc.c;
        byte b = 0;
        if (slcVar2 == slcVar3) {
            boolean z = zBooleanValue || Intrinsics.d(((b0o) f6iVar.u).b0(), Boolean.TRUE);
            String strB = getName().b();
            strB.getClass();
            dfkVar = obb.L(strB, tx3.s(new cr30[]{dfkVar, new y8m0(eu00Var, this, z)}));
        }
        this.m = dfkVar;
        this.n = new efk(this);
        zie0 zie0Var = c3h0.d;
        ((lm50) ((km50) f6iVar.s)).getClass();
        y6h y6hVar = new y6h(1, this, cfk.class, "<init>", "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lkotlin/reflect/jvm/internal/impl/types/checker/KotlinTypeRefiner;)V", 0, (byte) 24);
        zie0Var.getClass();
        eu00Var.getClass();
        this.o = new c3h0(this, eu00Var, y6hVar);
        this.p = slcVar2 == slcVar3 ? new ali(this) : null;
        vjj vjjVar = (vjj) g45Var.c;
        this.q = vjjVar;
        this.r = new bu00(eu00Var, new yek(this, b));
        this.s = new cu00(eu00Var, new yek(this, (byte) 1));
        new bu00(eu00Var, new yek(this, (byte) 2));
        eu00Var.b(new yek(this, (byte) 3));
        this.t = new bu00(eu00Var, new yek(this, (byte) 4));
        h950 h950Var2 = (h950) g45VarH.b;
        roi0 roi0Var2 = (roi0) g45VarH.d;
        ffk ffkVar = vjjVar instanceof ffk ? (ffk) vjjVar : null;
        this.u = new p4d0(s2d0Var, h950Var2, roi0Var2, gmk0Var, ffkVar != null ? ffkVar.u : null);
        this.v = !njq.c.e(s2d0Var.d).booleanValue() ? ujn.c : new b660(eu00Var, new yek(this, (byte) 5));
    }

    @Override // a.sq30
    public final boolean L() {
        return false;
    }

    @Override // a.wm40, a.goc
    public final List M() {
        return ((qgd) this.l.h).E();
    }

    @Override // a.sq30
    public final boolean Q() {
        return njq.j.e(this.e.d).booleanValue();
    }

    @Override // a.wm40
    public final cr30 U() {
        return this.m;
    }

    @Override // a.xjj
    public final gmk0 b() {
        return this.g;
    }

    @Override // a.wm40
    public final Collection g() {
        return (Collection) this.s.invoke();
    }

    @Override // a.e83
    public final g93 getAnnotations() {
        return this.v;
    }

    @Override // a.wm40, a.sq30
    public final tek getVisibility() {
        return this.j;
    }

    @Override // a.foc
    public final iys0 h() {
        return this.n;
    }

    @Override // a.goc
    public final boolean i() {
        return njq.g.e(this.e.d).booleanValue();
    }

    @Override // a.sq30
    public final boolean isExternal() {
        return njq.i.e(this.e.d).booleanValue();
    }

    @Override // a.wm40
    public final boolean isInline() {
        if (!njq.k.e(this.e.d).booleanValue()) {
            return false;
        }
        e28 e28Var = this.f;
        int i = e28Var.b;
        if (i >= 1) {
            if (i > 1) {
                return false;
            }
            int i2 = e28Var.c;
            if (i2 >= 4 && (i2 > 4 || e28Var.d > 1)) {
                return false;
            }
        }
        return true;
    }

    @Override // a.vjj
    public final vjj j() {
        return this.q;
    }

    @Override // a.wm40
    public final cr30 l0(cty ctyVar) {
        c3h0 c3h0Var = this.o;
        h1 h1Var = c3h0Var.f3674a;
        int i = rek.f30339a;
        oek.c(h1Var).getClass();
        return (cr30) yqm0.s(c3h0Var.c, c3h0.e[0]);
    }

    @Override // a.wm40, a.sq30
    public final gm40 m() {
        return this.i;
    }

    @Override // a.wm40
    public final flc m0() {
        return (flc) this.r.invoke();
    }

    @Override // a.wm40
    public final k2u0 n0() {
        return (k2u0) this.t.invoke();
    }

    @Override // a.wm40
    public final boolean o0() {
        return njq.f.e(this.e.d) == r2d0.COMPANION_OBJECT;
    }

    @Override // a.wm40
    public final List p() {
        g45 g45Var = this.l;
        List listK = m8x.K(this.e, (roi0) g45Var.d);
        ArrayList arrayList = new ArrayList(r3d.q(listK, 10));
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(new c8z(f0(), new mje(this, ((qgd) g45Var.h).d0((a4d0) it.next()), (g950) null), ujn.c));
        }
        return arrayList;
    }

    @Override // a.wm40
    public final boolean p0() {
        return njq.h.e(this.e.d).booleanValue();
    }

    @Override // a.wm40
    public final boolean q0() {
        return njq.l.e(this.e.d).booleanValue();
    }

    @Override // a.wm40
    public final slc r() {
        return this.k;
    }

    @Override // a.wm40
    public final boolean r0() {
        return njq.k.e(this.e.d).booleanValue() && this.f.a(1, 4, 2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("deserialized ");
        sb.append(Q() ? "expect " : "");
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    public final cfk u0() {
        ((lm50) ((km50) ((f6i) this.l.f10647a).s)).getClass();
        c3h0 c3h0Var = this.o;
        c3h0Var.getClass();
        h1 h1Var = c3h0Var.f3674a;
        int i = rek.f30339a;
        oek.c(h1Var).getClass();
        return (cfk) ((cr30) yqm0.s(c3h0Var.c, c3h0.e[0]));
    }

    public final kzj0 v0(g950 g950Var) {
        Iterator it = u0().f(g950Var, ux50.g).iterator();
        boolean z = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
                break;
            }
            Object next = it.next();
            d0d0 d0d0Var = (d0d0) next;
            if (d0d0Var.F() == null && d0d0Var.W().isEmpty()) {
                if (!z) {
                    z = true;
                    obj = next;
                }
            }
            obj = null;
            break;
        }
        d0d0 d0d0Var2 = (d0d0) obj;
        return (kzj0) (d0d0Var2 != null ? d0d0Var2.getType() : null);
    }
}

package a;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class xgy extends ihy implements kry, sgy, oiy, jys0 {
    public static final HashSet d;
    public final Class b;
    public final a8z c = maz.a(wez.f39042a, new tgy(this, 0));

    static {
        LinkedHashSet linkedHashSet = kxk0.f19060a;
        HashSet hashSet = new HashSet();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            hashSet.add(((qlc) it.next()).a().f32934a.toString());
        }
        d = hashSet;
    }

    public xgy(Class cls) {
        this.b = cls;
    }

    public static llc T(qlc qlcVar, pog0 pog0Var) {
        f6i f6iVar = pog0Var.f27328a;
        nun nunVar = new nun((ym40) f6iVar.f, qlcVar.f28927a, (byte) 0);
        g950 g950VarF = qlcVar.f();
        gm40 gm40Var = gm40.b;
        slc slcVar = slc.f32392a;
        List listC = kotlin.collections.a.c(((ym40) f6iVar.f).c().k("Any").I());
        eu00 eu00Var = (eu00) f6iVar.e;
        llc llcVar = new llc(nunVar, g950VarF, gm40Var, slcVar, listC, eu00Var);
        llcVar.u0(new ker(eu00Var, llcVar, (byte) 1), xun.f41520a, null);
        return llcVar;
    }

    @Override // a.ihy
    public final Collection D() {
        Collection collectionG = W().g();
        collectionG.getClass();
        return collectionG;
    }

    @Override // a.ihy
    public final Collection E() {
        qpy qpyVarX = X();
        ArrayList arrayList = qpyVarX != null ? qpyVarX.h : null;
        return arrayList == null ? iun.f15405a : arrayList;
    }

    @Override // a.ihy
    public final Collection F(g950 g950Var) {
        cr30 cr30VarY = W().I().y();
        ux50 ux50Var = ux50.b;
        Collection collectionA = cr30VarY.a(g950Var, ux50Var);
        cr30 cr30VarU = W().U();
        cr30VarU.getClass();
        return CollectionsKt.q0(collectionA, cr30VarU.a(g950Var, ux50Var));
    }

    @Override // a.sgy
    public final boolean I() {
        qpy qpyVarX = X();
        return qpyVarX != null && j24.f.m(j24.f15764a[14], qpyVarX);
    }

    @Override // a.sgy
    public final String J() {
        mre0 mre0Var = ((vgy) this.c.getValue()).f;
        iiy iiyVar = vgy.r[2];
        return (String) mre0Var.invoke();
    }

    @Override // a.ihy
    public final d0d0 N(int i) {
        wm40 wm40VarW = W();
        ffk ffkVar = wm40VarW instanceof ffk ? (ffk) wm40VarW : null;
        if (ffkVar != null) {
            s2d0 s2d0Var = ffkVar.e;
            ijt ijtVar = dgy.h;
            ijtVar.getClass();
            p3d0 p3d0Var = (p3d0) h8x.M(s2d0Var, ijtVar, i);
            if (p3d0Var != null) {
                ir00 ir00Var = new ir00(this);
                g45 g45Var = ffkVar.l;
                return (d0d0) xtt0.g(this.b, ir00Var, p3d0Var, (h950) g45Var.b, (roi0) g45Var.d, ffkVar.f, x0.r);
            }
        }
        return null;
    }

    @Override // a.ihy
    public final dqy O(int i) {
        qpy qpyVarX = X();
        if (qpyVarX != null) {
            return (dqy) CollectionsKt.W(i, j0x.t(qpyVarX).f28605a);
        }
        return null;
    }

    @Override // a.ihy
    public final Collection Q(g950 g950Var) {
        cr30 cr30VarY = W().I().y();
        ux50 ux50Var = ux50.b;
        Collection collectionF = cr30VarY.f(g950Var, ux50Var);
        cr30 cr30VarU = W().U();
        cr30VarU.getClass();
        return CollectionsKt.q0(collectionF, cr30VarU.f(g950Var, ux50Var));
    }

    public final qlc U() {
        iwb0 iwb0VarD;
        qlc qlcVar = sog0.f32540a;
        Class cls = this.b;
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            componentType.getClass();
            iwb0VarD = componentType.isPrimitive() ? mfy.b(componentType.getSimpleName()).d() : null;
            if (iwb0VarD != null) {
                return new qlc(j4m0.l, iwb0VarD.b);
            }
            swq swqVarI = i4m0.g.i();
            return new qlc(swqVarI.b(), swqVarI.f32934a.g());
        }
        if (cls.equals(Void.TYPE)) {
            return sog0.f32540a;
        }
        iwb0VarD = cls.isPrimitive() ? mfy.b(cls.getSimpleName()).d() : null;
        if (iwb0VarD != null) {
            return new qlc(j4m0.l, iwb0VarD.f15481a);
        }
        qlc qlcVarA = bqe0.a(cls);
        if (!qlcVarA.c) {
            String str = bay.f2281a;
            qlc qlcVarG = bay.g(qlcVarA.a());
            if (qlcVarG != null) {
                return qlcVarG;
            }
        }
        return qlcVarA;
    }

    public final rlc V() {
        rlc rlcVarA;
        qpy qpyVarX = X();
        if (qpyVarX != null && (rlcVarA = j24.a(qpyVarX)) != null) {
            return rlcVarA;
        }
        Class cls = this.b;
        if (cls.isAnnotation()) {
            return rlc.ANNOTATION_CLASS;
        }
        if (cls.isInterface()) {
            return rlc.INTERFACE;
        }
        if (cls.isEnum()) {
            return rlc.ENUM_CLASS;
        }
        return cls.getSuperclass().isEnum() ? rlc.ENUM_ENTRY : rlc.CLASS;
    }

    public final wm40 W() {
        return ((vgy) this.c.getValue()).b();
    }

    public final qpy X() {
        return ((vgy) this.c.getValue()).c();
    }

    public final fm40 Y() {
        fm40 fm40Var;
        qpy qpyVarX = X();
        if (qpyVarX != null && (fm40Var = (fm40) j24.b.v(j24.f15764a[7], qpyVarX)) != null) {
            return fm40Var;
        }
        Class cls = this.b;
        if (cls.isAnnotation() || cls.isEnum()) {
            return fm40.FINAL;
        }
        if (Intrinsics.d(zdx.E(cls), Boolean.TRUE)) {
            return fm40.SEALED;
        }
        if (Modifier.isAbstract(cls.getModifiers())) {
            return fm40.ABSTRACT;
        }
        return !Modifier.isFinal(cls.getModifiers()) ? fm40.OPEN : fm40.FINAL;
    }

    public final boolean Z() {
        return ((Boolean) ((vgy) this.c.getValue()).m.getValue()).booleanValue();
    }

    @Override // a.sgy
    public final List b() {
        mre0 mre0Var = ((vgy) this.c.getValue()).k;
        iiy iiyVar = vgy.r[8];
        Object objInvoke = mre0Var.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof xgy) && azw.H(this).equals(azw.H((sgy) obj));
    }

    @Override // a.kry
    public final GenericDeclaration findJavaDeclaration() {
        return this.b;
    }

    @Override // a.sgy
    public final Collection g() {
        mre0 mre0Var = ((vgy) this.c.getValue()).h;
        iiy iiyVar = vgy.r[4];
        Object objInvoke = mre0Var.invoke();
        objInvoke.getClass();
        return (Collection) objInvoke;
    }

    @Override // a.pgy
    public final List getAnnotations() {
        mre0 mre0Var = ((vgy) this.c.getValue()).e;
        iiy iiyVar = vgy.r[1];
        Object objInvoke = mre0Var.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // a.sgy, a.oiy
    public final List getTypeParameters() {
        mre0 mre0Var = ((vgy) this.c.getValue()).i;
        iiy iiyVar = vgy.r[6];
        Object objInvoke = mre0Var.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // a.sgy
    public final int hashCode() {
        return azw.H(this).hashCode();
    }

    @Override // a.sgy
    public final boolean i() {
        qpy qpyVarX = X();
        if (qpyVarX != null) {
            return j24.e.m(j24.f15764a[10], qpyVarX);
        }
        Class cls = this.b;
        return (cls.getDeclaringClass() == null || Modifier.isStatic(cls.getModifiers())) ? false : true;
    }

    @Override // a.elc
    public final Class j() {
        return this.b;
    }

    @Override // a.sgy
    public final boolean l() {
        return Y() == fm40.SEALED;
    }

    @Override // a.sgy
    public final boolean r(Object obj) {
        Map map = bqe0.d;
        Class cls = this.b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return zys0.f(num.intValue(), obj);
        }
        Class clsE = bqe0.e(cls);
        if (clsE != null) {
            cls = clsE;
        }
        return cls.isInstance(obj);
    }

    @Override // a.sgy
    public final Collection s() {
        mre0 mre0Var = ((vgy) this.c.getValue()).o;
        iiy iiyVar = vgy.r[11];
        Object objInvoke = mre0Var.invoke();
        objInvoke.getClass();
        return (Collection) objInvoke;
    }

    public final String toString() {
        qlc qlcVarU = U();
        swq swqVar = qlcVarU.f28927a;
        return "class ".concat((swqVar.f32934a.c() ? "" : axq.m(new StringBuilder(), swqVar.f32934a.f34663a, '.')).concat(kotlin.text.c.s(qlcVarU.b.f32934a.f34663a, '.', '$')));
    }

    @Override // a.sgy
    public final String v() {
        mre0 mre0Var = ((vgy) this.c.getValue()).g;
        iiy iiyVar = vgy.r[3];
        return (String) mre0Var.invoke();
    }
}

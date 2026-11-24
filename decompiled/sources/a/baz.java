package a;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class baz extends dr30 {
    public static final /* synthetic */ iiy[] m = {new j0d0(baz.class, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0), new j0d0(baz.class, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0), new j0d0(baz.class, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0)};
    public final f7u b;
    public final baz c;
    public final xt00 d;
    public final cu00 e;
    public final zt00 f;
    public final xg g;
    public final zt00 h;
    public final cu00 i;
    public final cu00 j;
    public final cu00 k;
    public final zt00 l;

    public baz(f7u f7uVar, p9z p9zVar) {
        f7uVar.getClass();
        this.b = f7uVar;
        this.c = p9zVar;
        v7i v7iVar = (v7i) f7uVar.b;
        eu00 eu00Var = (eu00) v7iVar.i;
        byte b = 0;
        y9z y9zVar = new y9z(this, b);
        iun iunVar = iun.f15405a;
        if (iunVar == null) {
            eu00.a(27);
            throw null;
        }
        this.d = new xt00(eu00Var, y9zVar, iunVar);
        byte b2 = 1;
        this.e = new cu00((eu00) v7iVar.i, new y9z(this, b2));
        this.f = ((eu00) v7iVar.i).c(new z9z(this, b));
        this.g = ((eu00) v7iVar.i).d(new z9z(this, b2));
        byte b3 = 2;
        this.h = ((eu00) v7iVar.i).c(new z9z(this, b3));
        this.i = new cu00((eu00) v7iVar.i, new y9z(this, b3));
        byte b4 = 3;
        this.j = new cu00((eu00) v7iVar.i, new y9z(this, b4));
        this.k = new cu00((eu00) v7iVar.i, new y9z(this, (byte) 4));
        this.l = ((eu00) v7iVar.i).c(new z9z(this, b4));
    }

    public static wsy l(vqe0 vqe0Var, f7u f7uVar) {
        vqe0Var.getClass();
        Class<?> declaringClass = ((Method) vqe0Var.b()).getDeclaringClass();
        declaringClass.getClass();
        return ((nvu) f7uVar.e).V(vqe0Var.f(), xvw.Y(b0t0.b, declaringClass.isAnnotation(), null, 6));
    }

    public static rsq u(f7u f7uVar, oer oerVar, List list) throws Throwable {
        Pair pair;
        g950 g950Var;
        g950 g950VarE;
        list.getClass();
        rx3 rx3VarS0 = CollectionsKt.S0(list);
        ArrayList arrayList = new ArrayList(r3d.q(rx3VarS0, 10));
        Iterator it = rx3VarS0.iterator();
        boolean z = false;
        while (true) {
            iil iilVar = (iil) it;
            if (!iilVar.b.hasNext()) {
                return new rsq(CollectionsKt.L0(arrayList), z);
            }
            IndexedValue indexedValue = (IndexedValue) iilVar.next();
            int i = indexedValue.f46061a;
            bre0 bre0Var = (bre0) indexedValue.b;
            j9z j9zVarW = r8x.W(f7uVar, bre0Var);
            nvu nvuVar = (nvu) f7uVar.e;
            zm40 zm40Var = (zm40) ((v7i) f7uVar.b).j;
            fay fayVarY = xvw.Y(b0t0.b, false, null, 7);
            boolean z2 = bre0Var.d;
            zqe0 zqe0Var = bre0Var.f3078a;
            if (z2) {
                gqe0 gqe0Var = zqe0Var instanceof gqe0 ? (gqe0) zqe0Var : null;
                if (gqe0Var == null) {
                    hny.n(bre0Var, "Vararg parameter should be an array: ");
                    return null;
                }
                tft0 tft0VarU = nvuVar.U(gqe0Var, fayVarY, true);
                pair = new Pair(tft0VarU, zm40Var.e.f(tft0VarU));
            } else {
                pair = new Pair(nvuVar.V(zqe0Var, fayVarY), null);
            }
            wsy wsyVar = (wsy) pair.f46059a;
            wsy wsyVar2 = (wsy) pair.b;
            if (Intrinsics.d(oerVar.getName().b(), "equals") && list.size() == 1 && zm40Var.e.p().equals(wsyVar)) {
                g950VarE = g950.e("other");
            } else {
                String str = bre0Var.c;
                g950 g950VarD = str != null ? g950.d(str) : null;
                if (g950VarD == null) {
                    z = true;
                }
                if (g950VarD == null) {
                    g950VarE = g950.e("p" + i);
                } else {
                    g950Var = g950VarD;
                }
                arrayList.add(new k3u0(oerVar, null, i, j9zVarW, g950Var, wsyVar, false, false, false, wsyVar2, m2a.v(bre0Var)));
            }
            g950Var = g950VarE;
            arrayList.add(new k3u0(oerVar, null, i, j9zVarW, g950Var, wsyVar, false, false, false, wsyVar2, m2a.v(bre0Var)));
        }
    }

    @Override // a.dr30, a.cr30
    public Collection a(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        ux50Var.getClass();
        return !c().contains(g950Var) ? iun.f15405a : (Collection) this.h.invoke(g950Var);
    }

    @Override // a.dr30, a.cr30
    public Collection b(cek cekVar, Function1 function1) {
        cekVar.getClass();
        return (Collection) this.d.invoke();
    }

    @Override // a.dr30, a.cr30
    public final Set c() {
        return (Set) yqm0.s(this.i, m[0]);
    }

    @Override // a.dr30, a.cr30
    public final Set e() {
        return (Set) yqm0.s(this.k, m[2]);
    }

    @Override // a.dr30, a.cr30
    public Collection f(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        return !g().contains(g950Var) ? iun.f15405a : (Collection) this.l.invoke(g950Var);
    }

    @Override // a.dr30, a.cr30
    public final Set g() {
        return (Set) yqm0.s(this.j, m[1]);
    }

    public Set h(cek cekVar, Function1 function1) {
        cekVar.getClass();
        return xun.f41520a;
    }

    public Set i(cek cekVar, Function1 function1) {
        cekVar.getClass();
        return xun.f41520a;
    }

    public ckj k() {
        return bkj.f2750a;
    }

    public Set o(cek cekVar) {
        cekVar.getClass();
        return xun.f41520a;
    }

    public c8z p() {
        return null;
    }

    public abstract vjj q();

    public boolean r(u9y u9yVar) {
        return true;
    }

    public aaz s(vqe0 vqe0Var, ArrayList arrayList, wsy wsyVar, List list) {
        vqe0Var.getClass();
        wsyVar.getClass();
        list.getClass();
        return new aaz(wsyVar, list, arrayList, iun.f15405a);
    }

    public final u9y t(vqe0 vqe0Var) {
        gm40 gm40Var;
        vqe0Var.getClass();
        f7u f7uVar = this.b;
        u9y u9yVarD1 = u9y.D1(q(), r8x.W(f7uVar, vqe0Var), vqe0Var.c(), m2a.v(vqe0Var), ((ckj) this.e.invoke()).a(vqe0Var.c()) != null && ((ArrayList) vqe0Var.g()).isEmpty());
        f7uVar.getClass();
        f7u f7uVar2 = new f7u((v7i) f7uVar.b, new ucs0(f7uVar, u9yVarD1, vqe0Var, 0), (a8z) f7uVar.d);
        ArrayList typeParameters = vqe0Var.getTypeParameters();
        ArrayList arrayList = new ArrayList(r3d.q(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            hzs0 hzs0VarC = ((mzs0) f7uVar2.c).c((are0) it.next());
            hzs0VarC.getClass();
            arrayList.add(hzs0VarC);
        }
        rsq rsqVarU = u(f7uVar2, u9yVarD1, vqe0Var.g());
        aaz aazVarS = s(vqe0Var, arrayList, l(vqe0Var, f7uVar2), rsqVarU.f31043a);
        List list = aazVarS.d;
        c8z c8zVarP = p();
        iun iunVar = iun.f15405a;
        ArrayList arrayList2 = aazVarS.c;
        List list2 = aazVarS.b;
        wsy wsyVar = aazVarS.f554a;
        evz evzVar = gm40.f11524a;
        boolean zIsAbstract = Modifier.isAbstract(((Method) vqe0Var.b()).getModifiers());
        boolean zIsFinal = Modifier.isFinal(((Method) vqe0Var.b()).getModifiers());
        evzVar.getClass();
        if (zIsAbstract) {
            gm40Var = gm40.e;
        } else {
            gm40Var = !zIsFinal ? gm40.d : gm40.b;
        }
        gm40 gm40Var2 = gm40Var;
        tek tekVarU = u4n0.u(vqe0Var.e());
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        u9yVarD1.C1(null, c8zVarP, iunVar, arrayList2, list2, wsyVar, gm40Var2, tekVarU, lunVar);
        u9yVarD1.p = Modifier.isNative(vqe0Var.f37852a.getModifiers());
        u9yVarD1.E1(false, rsqVarU.b);
        if (list.isEmpty()) {
            return u9yVarD1;
        }
        v4i0.p("Should not be called");
        return null;
    }

    public String toString() {
        return "Lazy scope for " + q();
    }

    public void j(g950 g950Var, ArrayList arrayList) {
    }

    public void m(LinkedHashSet linkedHashSet, g950 g950Var) {
    }

    public void n(g950 g950Var, ArrayList arrayList) {
    }
}

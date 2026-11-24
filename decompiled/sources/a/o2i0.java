package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class o2i0 implements c5a, nvu0 {
    public static final /* synthetic */ long f = defpackage.a.f0a.objectFieldOffset(o2i0.class.getDeclaredField("state$volatile"));
    public static final /* synthetic */ int g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f24531a;
    public Object c;
    private volatile /* synthetic */ Object state$volatile = p2i0.f26251a;
    public ArrayList b = new ArrayList(2);
    public int d = -1;
    public Object e = p2i0.d;

    public o2i0(CoroutineContext coroutineContext) {
        this.f24531a = coroutineContext;
    }

    public static Object d(o2i0 o2i0Var, bnn0 bnn0Var) {
        return defpackage.a.f0a.getObjectVolatile(o2i0Var, f) instanceof m2i0 ? o2i0Var.c(bnn0Var) : o2i0Var.e(bnn0Var);
    }

    @Override // a.nvu0
    public final void a(wvh0 wvh0Var, int i) {
        this.c = wvh0Var;
        this.d = i;
    }

    @Override // a.c5a
    public final void b(Throwable th) {
        o2i0 o2i0Var;
        while (true) {
            Unsafe unsafe = defpackage.a.f0a;
            long j = f;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == p2i0.b) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = defpackage.a.f0a;
                o2i0Var = this;
                if (unsafe2.compareAndSwapObject(o2i0Var, f, objectVolatile, p2i0.c)) {
                    ArrayList arrayList = o2i0Var.b;
                    if (arrayList == null) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((m2i0) it.next()).a();
                    }
                    o2i0Var.e = p2i0.d;
                    o2i0Var.b = null;
                    return;
                }
                if (unsafe2.getObjectVolatile(o2i0Var, j) != objectVolatile) {
                    break;
                } else {
                    this = o2i0Var;
                }
            }
            this = o2i0Var;
        }
    }

    public final Object c(zje zjeVar) {
        Unsafe unsafe = defpackage.a.f0a;
        long j = f;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        objectVolatile.getClass();
        m2i0 m2i0Var = (m2i0) objectVolatile;
        Object obj = m2i0Var.d;
        Object obj2 = this.e;
        ArrayList<m2i0> arrayList = this.b;
        if (arrayList != null) {
            for (m2i0 m2i0Var2 : arrayList) {
                if (m2i0Var2 != m2i0Var) {
                    m2i0Var2.a();
                }
            }
            defpackage.a.f0a.putObjectVolatile(this, j, p2i0.b);
            this.e = p2i0.d;
            this.b = null;
        }
        Object objF = m2i0Var.c.F(m2i0Var.f21062a, obj, obj2);
        wdr wdrVar = m2i0Var.e;
        return obj == p2i0.e ? ((Function1) wdrVar).invoke(zjeVar) : ((Function2) wdrVar).invoke(objF, zjeVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object e(zje zjeVar) {
        n2i0 n2i0Var;
        n5a n5aVar;
        Unsafe unsafe;
        if (zjeVar instanceof n2i0) {
            n2i0Var = (n2i0) zjeVar;
            int i = n2i0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                n2i0Var.k = i - Integer.MIN_VALUE;
            } else {
                n2i0Var = new n2i0(this, zjeVar);
            }
        } else {
            n2i0Var = new n2i0(this, zjeVar);
        }
        n2i0 n2i0Var2 = n2i0Var;
        Object obj = n2i0Var2.i;
        Object obj2 = wne.f39444a;
        int i2 = n2i0Var2.k;
        if (i2 == 0) {
            z1x.P(obj);
            n2i0Var2.k = 1;
            n5a n5aVar2 = new n5a(1, pnx.b(n2i0Var2));
            n5aVar2.r();
            loop0: while (true) {
                Unsafe unsafe2 = defpackage.a.f0a;
                long j = f;
                Object objectVolatile = unsafe2.getObjectVolatile(this, j);
                n5a n5aVar3 = n5aVar2;
                pfw pfwVar = p2i0.f26251a;
                if (objectVolatile == pfwVar) {
                    n5a n5aVar4 = n5aVar3;
                    while (true) {
                        Unsafe unsafe3 = defpackage.a.f0a;
                        n5aVar = n5aVar4;
                        if (unsafe3.compareAndSwapObject(this, f, objectVolatile, n5aVar4)) {
                            n5aVar.u(this);
                            break loop0;
                        }
                        if (unsafe3.getObjectVolatile(this, j) != objectVolatile) {
                            break;
                        }
                        n5aVar4 = n5aVar;
                    }
                    n5aVar2 = n5aVar;
                } else {
                    n5aVar = n5aVar3;
                    if (!(objectVolatile instanceof List)) {
                        if (!(objectVolatile instanceof m2i0)) {
                            udk.e(objectVolatile, "unexpected state: ");
                            return null;
                        }
                        Unit unit = Unit.f46060a;
                        m2i0 m2i0Var = (m2i0) objectVolatile;
                        Object obj3 = this.e;
                        xdr xdrVar = m2i0Var.f;
                        n5aVar.v(unit, xdrVar != null ? (xdr) xdrVar.F(this, m2i0Var.d, obj3) : null);
                        break;
                    }
                    do {
                        unsafe = defpackage.a.f0a;
                        if (unsafe.compareAndSwapObject(this, f, objectVolatile, pfwVar)) {
                            Iterator it = ((Iterable) objectVolatile).iterator();
                            while (it.hasNext()) {
                                m2i0 m2i0VarF = f(it.next());
                                m2i0VarF.getClass();
                                m2i0VarF.g = null;
                                m2i0VarF.h = -1;
                                h(m2i0VarF, true);
                            }
                            break;
                        }
                    } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
                    n5aVar2 = n5aVar;
                }
            }
            Object objP = n5aVar.p();
            if (objP != wne.f39444a) {
                objP = Unit.f46060a;
            }
            if (objP != obj2) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        n2i0Var2.k = 2;
        Object objC = c(n2i0Var2);
        return objC == obj2 ? obj2 : objC;
    }

    public final m2i0 f(Object obj) {
        Object next;
        ArrayList arrayList = this.b;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((m2i0) next).f21062a != obj);
        m2i0 m2i0Var = (m2i0) next;
        if (m2i0Var != null) {
            return m2i0Var;
        }
        c99.m(obj, " is not found", "Clause with object ");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(i1i0 i1i0Var, Function2 function2) {
        Object obj = ((n660) i1i0Var).f22981a;
        n660 n660Var = (n660) i1i0Var;
        h(new m2i0(this, obj, (xdr) n660Var.b, (xdr) n660Var.c, null, (bnn0) function2, (xdr) n660Var.d), false);
    }

    public final void h(m2i0 m2i0Var, boolean z) {
        Object obj = m2i0Var.f21062a;
        Unsafe unsafe = defpackage.a.f0a;
        long j = f;
        if (unsafe.getObjectVolatile(this, j) instanceof m2i0) {
            return;
        }
        if (!z) {
            ArrayList arrayList = this.b;
            arrayList.getClass();
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((m2i0) it.next()).f21062a == obj) {
                        hny.t(obj, "Cannot use select clauses on the same object: ");
                        return;
                    }
                }
            }
        }
        m2i0Var.b.F(obj, this, m2i0Var.d);
        if (this.e != p2i0.d) {
            defpackage.a.f0a.putObjectVolatile(this, j, m2i0Var);
            return;
        }
        if (!z) {
            ArrayList arrayList2 = this.b;
            arrayList2.getClass();
            arrayList2.add(m2i0Var);
        }
        m2i0Var.g = this.c;
        m2i0Var.h = this.d;
        this.c = null;
        this.d = -1;
    }

    public final boolean i(Object obj, Object obj2) {
        return j(obj, obj2) == 0;
    }

    public final int j(Object obj, Object obj2) {
        o2i0 o2i0Var;
        Unsafe unsafe;
        Unsafe unsafe2;
        while (true) {
            Unsafe unsafe3 = defpackage.a.f0a;
            long j = f;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (objectVolatile instanceof m5a) {
                m2i0 m2i0VarF = this.f(obj);
                if (m2i0VarF != null) {
                    xdr xdrVar = m2i0VarF.f;
                    xdr xdrVar2 = xdrVar != null ? (xdr) xdrVar.F(this, m2i0VarF.d, obj2) : null;
                    while (true) {
                        Unsafe unsafe4 = defpackage.a.f0a;
                        o2i0Var = this;
                        if (unsafe4.compareAndSwapObject(o2i0Var, f, objectVolatile, m2i0VarF)) {
                            m5a m5aVar = (m5a) objectVolatile;
                            o2i0Var.e = obj2;
                            pfw pfwVarB = m5aVar.b(Unit.f46060a, xdrVar2);
                            if (pfwVarB == null) {
                                o2i0Var.e = p2i0.d;
                                return 2;
                            }
                            m5aVar.w(pfwVarB);
                            return 0;
                        }
                        if (unsafe4.getObjectVolatile(o2i0Var, j) != objectVolatile) {
                            break;
                        }
                        this = o2i0Var;
                    }
                } else {
                    continue;
                }
            } else {
                o2i0Var = this;
                if (Intrinsics.d(objectVolatile, p2i0.b) || (objectVolatile instanceof m2i0)) {
                    return 3;
                }
                if (Intrinsics.d(objectVolatile, p2i0.c)) {
                    return 2;
                }
                if (Intrinsics.d(objectVolatile, p2i0.f26251a)) {
                    List listC = kotlin.collections.a.c(obj);
                    do {
                        unsafe2 = defpackage.a.f0a;
                        if (unsafe2.compareAndSwapObject(o2i0Var, f, objectVolatile, listC)) {
                            return 1;
                        }
                    } while (unsafe2.getObjectVolatile(o2i0Var, j) == objectVolatile);
                } else {
                    if (!(objectVolatile instanceof List)) {
                        udk.e(objectVolatile, "Unexpected state: ");
                        return 0;
                    }
                    ArrayList arrayListR0 = CollectionsKt.r0((Collection) objectVolatile, obj);
                    do {
                        unsafe = defpackage.a.f0a;
                        if (unsafe.compareAndSwapObject(o2i0Var, f, objectVolatile, arrayListR0)) {
                            return 1;
                        }
                    } while (unsafe.getObjectVolatile(o2i0Var, j) == objectVolatile);
                }
            }
            this = o2i0Var;
        }
    }
}

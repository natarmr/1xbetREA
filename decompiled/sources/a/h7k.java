package a;

import android.gov.nist.core.Separators;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h7k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12578a;
    public boolean b;
    public boolean c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public Object h;
    public Object i;

    public h7k(e7z e7zVar) {
        this.f12578a = (byte) 3;
        this.d = e7zVar;
        this.e = new oif0((byte) 16);
        this.f = new kd30((byte) 4);
        this.g = new xz40(new e7z[16]);
        this.h = new xz40(new qj30[16]);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static boolean f(e7z e7zVar, p4e p4eVar) {
        boolean zL0;
        e7z e7zVar2 = e7zVar.i;
        i7z i7zVar = e7zVar.i1;
        if (e7zVar2 == null) {
            return false;
        }
        if (p4eVar == null) {
            i810 i810Var = i7zVar.q;
            p4e p4eVar2 = i810Var != null ? i810Var.n : null;
            if (p4eVar2 == null || e7zVar2 == null) {
                zL0 = false;
            } else {
                i810Var.getClass();
                zL0 = i810Var.L0(p4eVar2.f26347a);
            }
        } else if (e7zVar2 != null) {
            i810 i810Var2 = i7zVar.q;
            i810Var2.getClass();
            zL0 = i810Var2.L0(p4eVar.f26347a);
        } else {
            zL0 = false;
        }
        e7z e7zVarV = e7zVar.v();
        if (zL0 && e7zVarV != null) {
            if (e7zVarV.i == null) {
                e7z.W(e7zVarV, false, 3);
                return zL0;
            }
            if (e7zVar.t() == c7z.f3886a) {
                e7z.U(e7zVarV, false, 3);
                return zL0;
            }
            if (e7zVar.t() == c7z.b) {
                e7zVarV.T(false);
            }
        }
        return zL0;
    }

    public static boolean g(e7z e7zVar, p4e p4eVar) {
        boolean zL0;
        if (p4eVar != null) {
            if (e7zVar.Z == c7z.c) {
                e7zVar.d();
            }
            zL0 = e7zVar.i1.p.L0(p4eVar.f26347a);
        } else {
            sj30 sj30Var = e7zVar.i1.p;
            p4e p4eVar2 = sj30Var.j ? new p4e(sj30Var.d) : null;
            if (p4eVar2 != null) {
                if (e7zVar.Z == c7z.c) {
                    e7zVar.d();
                }
                zL0 = e7zVar.i1.p.L0(p4eVar2.f26347a);
            } else {
                zL0 = false;
            }
        }
        e7z e7zVarV = e7zVar.v();
        if (zL0 && e7zVarV != null) {
            if (e7zVar.s() == c7z.f3886a) {
                e7z.W(e7zVarV, false, 3);
                return zL0;
            }
            if (e7zVar.s() == c7z.b) {
                e7zVarV.V(false);
            }
        }
        return zL0;
    }

    public static boolean m(e7z e7zVar) {
        i810 i810Var;
        f7z f7zVar;
        if (e7zVar.i1.e) {
            return (e7zVar.t() == c7z.c && ((i810Var = e7zVar.i1.q) == null || (f7zVar = i810Var.s) == null || !f7zVar.e())) ? false : true;
        }
        return false;
    }

    public static boolean n(e7z e7zVar) {
        if (!e7zVar.r()) {
            return false;
        }
        do {
            if (e7zVar.s() == c7z.c && !e7zVar.i1.p.y.e()) {
                e7z e7zVarV = e7zVar.v();
                if ((e7zVarV != null ? e7zVarV.i1.d : null) != a7z.f398a) {
                    return false;
                }
            }
            e7zVar = e7zVar.v();
            if (e7zVar == null) {
                return false;
            }
        } while (!e7zVar.J());
        return true;
    }

    public static boolean r(e7z e7zVar) {
        i810 i810Var;
        f7z f7zVar;
        i7z i7zVar = e7zVar.i1;
        return e7zVar.J() || i7zVar.p.u || n(e7zVar) || Intrinsics.d(e7zVar.K(), Boolean.TRUE) || m(e7zVar) || i7zVar.p.y.e() || !((i810Var = i7zVar.q) == null || (f7zVar = i810Var.s) == null || !f7zVar.e());
    }

    public void A(e7z e7zVar, boolean z) {
        p4e p4eVar;
        if (e7zVar.s1) {
            return;
        }
        if (e7zVar == ((e7z) this.d)) {
            p4eVar = (p4e) this.i;
            p4eVar.getClass();
        } else {
            p4eVar = null;
        }
        if (z) {
            f(e7zVar, p4eVar);
        } else {
            g(e7zVar, p4eVar);
        }
    }

    public boolean B(e7z e7zVar, boolean z) {
        int iOrdinal = e7zVar.i1.d.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                ((xz40) this.h).b(new qj30(e7zVar, false, z));
            } else {
                if (iOrdinal != 4) {
                    t9f.b();
                    return false;
                }
                if (!e7zVar.r() || z) {
                    e7zVar.i1.p.v = true;
                    if (!e7zVar.s1 && (e7zVar.J() || n(e7zVar))) {
                        e7z e7zVarV = e7zVar.v();
                        if (e7zVarV == null || !e7zVarV.r()) {
                            ((oif0) this.e).a(e7zVar, eox.c);
                        }
                        if (!this.c) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public void C(long j) {
        e7z e7zVar = (e7z) this.d;
        p4e p4eVar = (p4e) this.i;
        if (p4eVar == null ? false : p4e.c(p4eVar.f26347a, j)) {
            return;
        }
        if (this.b) {
            xcx.a("updateRootConstraints called while measuring");
        }
        this.i = new p4e(j);
        boolean zI = e7zVar.I();
        i7z i7zVar = e7zVar.i1;
        if (zI) {
            e7z e7zVar2 = e7zVar.i;
            if (e7zVar2 != null) {
                i7zVar.e = true;
            }
            i7zVar.p.v = true;
            ((oif0) this.e).a(e7zVar, e7zVar2 != null ? eox.f8158a : eox.c);
        }
    }

    public void a(i7k i7kVar, int i, ArrayList arrayList, nog0 nog0Var) {
        hev0 hev0Var = i7kVar.d;
        nog0 nog0Var2 = hev0Var.c;
        i7k i7kVar2 = hev0Var.i;
        i7k i7kVar3 = hev0Var.h;
        if (nog0Var2 == null) {
            l4e l4eVar = (l4e) this.d;
            if (hev0Var == l4eVar.d || hev0Var == l4eVar.e) {
                return;
            }
            if (nog0Var == null) {
                nog0Var = new nog0();
                nog0Var.f23865a = null;
                nog0Var.b = new ArrayList();
                nog0Var.f23865a = hev0Var;
                arrayList.add(nog0Var);
            }
            hev0Var.c = nog0Var;
            nog0Var.b.add(hev0Var);
            for (d7k d7kVar : i7kVar3.k) {
                if (d7kVar instanceof i7k) {
                    a((i7k) d7kVar, i, arrayList, nog0Var);
                }
            }
            for (d7k d7kVar2 : i7kVar2.k) {
                if (d7kVar2 instanceof i7k) {
                    a((i7k) d7kVar2, i, arrayList, nog0Var);
                }
            }
            if (i == 1 && (hev0Var instanceof ocu0)) {
                for (d7k d7kVar3 : ((ocu0) hev0Var).k.k) {
                    if (d7kVar3 instanceof i7k) {
                        a((i7k) d7kVar3, i, arrayList, nog0Var);
                    }
                }
            }
            Iterator it = i7kVar3.l.iterator();
            while (it.hasNext()) {
                a((i7k) it.next(), i, arrayList, nog0Var);
            }
            Iterator it2 = i7kVar2.l.iterator();
            while (it2.hasNext()) {
                a((i7k) it2.next(), i, arrayList, nog0Var);
            }
            if (i == 1 && (hev0Var instanceof ocu0)) {
                Iterator it3 = ((ocu0) hev0Var).k.l.iterator();
                while (it3.hasNext()) {
                    a((i7k) it3.next(), i, arrayList, nog0Var);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0208  */
    public void b(l4e l4eVar) {
        int iM;
        j4e j4eVar;
        j4e j4eVar2;
        j4e j4eVar3;
        j4e j4eVar4;
        j4e j4eVar5;
        Iterator it = l4eVar.u0.iterator();
        while (it.hasNext()) {
            k4e k4eVar = (k4e) it.next();
            j4e[] j4eVarArr = k4eVar.U;
            w2e[] w2eVarArr = k4eVar.R;
            w2e w2eVar = k4eVar.M;
            w2e w2eVar2 = k4eVar.K;
            w2e w2eVar3 = k4eVar.L;
            w2e w2eVar4 = k4eVar.J;
            j4e j4eVar6 = j4eVarArr[0];
            j4e j4eVar7 = j4eVarArr[1];
            if (k4eVar.i0 == 8) {
                k4eVar.f17665a = true;
            } else {
                float f = k4eVar.x;
                j4e j4eVar8 = j4e.c;
                if (f < 1.0f && j4eVar6 == j4eVar8) {
                    k4eVar.s = 2;
                }
                float f2 = k4eVar.A;
                if (f2 < 1.0f && j4eVar7 == j4eVar8) {
                    k4eVar.t = 2;
                }
                float f3 = k4eVar.Y;
                j4e j4eVar9 = j4e.f15879a;
                j4e j4eVar10 = j4e.b;
                Iterator it2 = it;
                if (f3 > 0.0f) {
                    if (j4eVar6 == j4eVar8 && (j4eVar7 == j4eVar10 || j4eVar7 == j4eVar9)) {
                        k4eVar.s = 3;
                    } else if (j4eVar7 == j4eVar8 && (j4eVar6 == j4eVar10 || j4eVar6 == j4eVar9)) {
                        k4eVar.t = 3;
                    } else if (j4eVar6 == j4eVar8 && j4eVar7 == j4eVar8) {
                        if (k4eVar.s == 0) {
                            k4eVar.s = 3;
                        }
                        if (k4eVar.t == 0) {
                            k4eVar.t = 3;
                        }
                    }
                }
                if (j4eVar6 == j4eVar8 && k4eVar.s == 1 && (w2eVar4.f == null || w2eVar3.f == null)) {
                    j4eVar6 = j4eVar10;
                }
                if (j4eVar7 == j4eVar8 && k4eVar.t == 1 && (w2eVar2.f == null || w2eVar.f == null)) {
                    j4eVar7 = j4eVar10;
                }
                cmw cmwVar = k4eVar.d;
                cmwVar.d = j4eVar6;
                int i = k4eVar.s;
                cmwVar.f12943a = i;
                ocu0 ocu0Var = k4eVar.e;
                ocu0Var.d = j4eVar7;
                int i2 = k4eVar.t;
                ocu0Var.f12943a = i2;
                j4e j4eVar11 = j4e.d;
                if ((j4eVar6 == j4eVar11 || j4eVar6 == j4eVar9 || j4eVar6 == j4eVar10) && (j4eVar7 == j4eVar11 || j4eVar7 == j4eVar9 || j4eVar7 == j4eVar10)) {
                    int iS = k4eVar.s();
                    if (j4eVar6 == j4eVar11) {
                        iS = (l4eVar.s() - w2eVar4.g) - w2eVar3.g;
                        j4eVar6 = j4eVar9;
                    }
                    int iM2 = k4eVar.m();
                    if (j4eVar7 == j4eVar11) {
                        iM = (l4eVar.m() - w2eVar2.g) - w2eVar.g;
                        j4eVar = j4eVar9;
                    } else {
                        iM = iM2;
                        j4eVar = j4eVar7;
                    }
                    s(k4eVar, j4eVar6, iS, j4eVar, iM);
                    k4eVar.d.e.d(k4eVar.s());
                    k4eVar.e.e.d(k4eVar.m());
                    k4eVar.f17665a = true;
                } else {
                    if (j4eVar6 != j4eVar8 || (j4eVar7 != j4eVar10 && j4eVar7 != j4eVar9)) {
                        j4eVar2 = j4eVar7;
                        j4eVar3 = j4eVar10;
                    } else if (i == 3) {
                        if (j4eVar7 == j4eVar10) {
                            s(k4eVar, j4eVar10, 0, j4eVar10, 0);
                        }
                        int iM3 = k4eVar.m();
                        s(k4eVar, j4eVar9, (int) ((iM3 * k4eVar.Y) + 0.5f), j4eVar9, iM3);
                        k4eVar.d.e.d(k4eVar.s());
                        k4eVar.e.e.d(k4eVar.m());
                        k4eVar.f17665a = true;
                    } else if (i == 1) {
                        s(k4eVar, j4eVar10, 0, j4eVar7, 0);
                        k4eVar.d.e.m = k4eVar.s();
                    } else {
                        j4eVar3 = j4eVar10;
                        if (i == 2) {
                            j4e j4eVar12 = l4eVar.U[0];
                            if (j4eVar12 == j4eVar9 || j4eVar12 == j4eVar11) {
                                s(k4eVar, j4eVar9, (int) ((f * l4eVar.s()) + 0.5f), j4eVar7, k4eVar.m());
                                k4eVar.d.e.d(k4eVar.s());
                                k4eVar.e.e.d(k4eVar.m());
                                k4eVar.f17665a = true;
                            } else {
                                j4eVar9 = j4eVar9;
                                j4eVar2 = j4eVar7;
                            }
                        } else {
                            j4eVar9 = j4eVar9;
                            j4eVar2 = j4eVar7;
                            if (w2eVarArr[0].f == null || w2eVarArr[1].f == null) {
                                s(k4eVar, j4eVar3, 0, j4eVar2, 0);
                                k4eVar.d.e.d(k4eVar.s());
                                k4eVar.e.e.d(k4eVar.m());
                                k4eVar.f17665a = true;
                            }
                        }
                    }
                    if (j4eVar2 != j4eVar8 || (j4eVar6 != j4eVar3 && j4eVar6 != j4eVar9)) {
                        j4eVar4 = j4eVar3;
                        j4eVar5 = j4eVar9;
                    } else if (i2 == 3) {
                        if (j4eVar6 == j4eVar3) {
                            s(k4eVar, j4eVar3, 0, j4eVar3, 0);
                        }
                        int iS2 = k4eVar.s();
                        float f4 = k4eVar.Y;
                        if (k4eVar.Z == -1) {
                            f4 = 1.0f / f4;
                        }
                        s(k4eVar, j4eVar9, iS2, j4eVar9, (int) ((iS2 * f4) + 0.5f));
                        k4eVar.d.e.d(k4eVar.s());
                        k4eVar.e.e.d(k4eVar.m());
                        k4eVar.f17665a = true;
                    } else {
                        j4eVar4 = j4eVar3;
                        j4eVar5 = j4eVar9;
                        if (i2 == 1) {
                            s(k4eVar, j4eVar6, 0, j4eVar4, 0);
                            k4eVar.e.e.m = k4eVar.m();
                        } else if (i2 == 2) {
                            j4e j4eVar13 = l4eVar.U[1];
                            if (j4eVar13 == j4eVar5 || j4eVar13 == j4eVar11) {
                                s(k4eVar, j4eVar6, k4eVar.s(), j4eVar5, (int) ((f2 * l4eVar.m()) + 0.5f));
                                k4eVar.d.e.d(k4eVar.s());
                                k4eVar.e.e.d(k4eVar.m());
                                k4eVar.f17665a = true;
                            }
                        } else if (w2eVarArr[2].f == null || w2eVarArr[3].f == null) {
                            s(k4eVar, j4eVar4, 0, j4eVar2, 0);
                            k4eVar.d.e.d(k4eVar.s());
                            k4eVar.e.e.d(k4eVar.m());
                            k4eVar.f17665a = true;
                        }
                    }
                    if (j4eVar6 == j4eVar8 && j4eVar2 == j4eVar8) {
                        if (i == 1 || i2 == 1) {
                            j4e j4eVar14 = j4eVar4;
                            s(k4eVar, j4eVar14, 0, j4eVar14, 0);
                            k4eVar.d.e.m = k4eVar.s();
                            k4eVar.e.e.m = k4eVar.m();
                        } else if (i2 == 2 && i == 2) {
                            j4e[] j4eVarArr2 = l4eVar.U;
                            if (j4eVarArr2[0] == j4eVar5 && j4eVarArr2[1] == j4eVar5) {
                                s(k4eVar, j4eVar5, (int) ((f * l4eVar.s()) + 0.5f), j4eVar5, (int) ((f2 * l4eVar.m()) + 0.5f));
                                k4eVar.d.e.d(k4eVar.s());
                                k4eVar.e.e.d(k4eVar.m());
                                k4eVar.f17665a = true;
                            }
                        }
                    }
                }
                it = it2;
            }
        }
    }

    public void c() {
        l4e l4eVar = (l4e) this.d;
        ArrayList arrayList = (ArrayList) this.g;
        ArrayList<hev0> arrayList2 = (ArrayList) this.f;
        arrayList2.clear();
        l4e l4eVar2 = (l4e) this.e;
        l4eVar2.d.f();
        l4eVar2.e.f();
        arrayList2.add(l4eVar2.d);
        arrayList2.add(l4eVar2.e);
        HashSet hashSet = null;
        for (k4e k4eVar : l4eVar2.u0) {
            if (k4eVar instanceof qiv) {
                riv rivVar = new riv(k4eVar);
                k4eVar.d.f();
                k4eVar.e.f();
                rivVar.f = ((qiv) k4eVar).y0;
                arrayList2.add(rivVar);
            } else {
                if (k4eVar.z()) {
                    if (k4eVar.b == null) {
                        k4eVar.b = new nbb(k4eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(k4eVar.b);
                } else {
                    arrayList2.add(k4eVar.d);
                }
                if (k4eVar.A()) {
                    if (k4eVar.c == null) {
                        k4eVar.c = new nbb(k4eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(k4eVar.c);
                } else {
                    arrayList2.add(k4eVar.e);
                }
                if (k4eVar instanceof jvv) {
                    arrayList2.add(new ivv(k4eVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((hev0) it.next()).f();
        }
        for (hev0 hev0Var : arrayList2) {
            if (hev0Var.b != l4eVar2) {
                hev0Var.d();
            }
        }
        arrayList.clear();
        j(l4eVar.d, 0, arrayList);
        j(l4eVar.e, 1, arrayList);
        this.b = false;
    }

    public int d(l4e l4eVar, int i) {
        ArrayList arrayList;
        int i2;
        long j;
        float f;
        long j2;
        ArrayList arrayList2 = (ArrayList) this.g;
        int size = arrayList2.size();
        long j3 = 0;
        int i3 = 0;
        long jMax = 0;
        while (i3 < size) {
            hev0 hev0Var = ((nog0) arrayList2.get(i3)).f23865a;
            if (!(hev0Var instanceof nbb) ? !(i != 0 ? (hev0Var instanceof ocu0) : (hev0Var instanceof cmw)) : ((nbb) hev0Var).f != i) {
                i7k i7kVar = (i == 0 ? l4eVar.d : l4eVar.e).h;
                i7k i7kVar2 = (i == 0 ? l4eVar.d : l4eVar.e).i;
                i7k i7kVar3 = hev0Var.h;
                i7k i7kVar4 = hev0Var.i;
                boolean zContains = i7kVar3.l.contains(i7kVar);
                boolean zContains2 = i7kVar4.l.contains(i7kVar2);
                long j4 = hev0Var.j();
                if (zContains && zContains2) {
                    long jB = nog0.b(i7kVar3, j3);
                    arrayList = arrayList2;
                    long jA = nog0.a(i7kVar4, j3);
                    long j5 = jB - j4;
                    int i4 = i7kVar4.f;
                    i2 = i3;
                    if (j5 >= (-i4)) {
                        j5 += (long) i4;
                    }
                    long j6 = i7kVar3.f;
                    long j7 = ((-jA) - j4) - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    k4e k4eVar = hev0Var.b;
                    if (i == 0) {
                        f = k4eVar.f0;
                    } else if (i == 1) {
                        f = k4eVar.g0;
                    } else {
                        k4eVar.getClass();
                        f = -1.0f;
                    }
                    if (f > 0.0f) {
                        j2 = (long) ((j5 / (1.0f - f)) + (j7 / f));
                    } else {
                        j2 = 0;
                    }
                    float f2 = j2;
                    j = (((long) i7kVar3.f) + ((((long) ((f2 * f) + 0.5f)) + j4) + ((long) rw2.a(1.0f, f, f2, 0.5f)))) - ((long) i7kVar4.f);
                } else {
                    arrayList = arrayList2;
                    i2 = i3;
                    if (zContains) {
                        j = Math.max(nog0.b(i7kVar3, i7kVar3.f), ((long) i7kVar3.f) + j4);
                    } else if (zContains2) {
                        j = Math.max(-nog0.a(i7kVar4, i7kVar4.f), ((long) (-i7kVar4.f)) + j4);
                    } else {
                        j = (hev0Var.j() + ((long) i7kVar3.f)) - ((long) i7kVar4.f);
                    }
                }
            } else {
                arrayList = arrayList2;
                j = j3;
                i2 = i3;
            }
            jMax = Math.max(jMax, j);
            i3 = i2 + 1;
            arrayList2 = arrayList;
            j3 = 0;
        }
        return (int) jMax;
    }

    public void e(boolean z) {
        kd30 kd30Var = (kd30) this.f;
        xz40 xz40Var = (xz40) kd30Var.f18086a;
        if (z) {
            e7z e7zVar = (e7z) this.d;
            if (e7zVar.r1 > 0) {
                xz40Var.g();
                xz40Var.b(e7zVar);
                e7zVar.q1 = true;
            }
        }
        if (xz40Var.c != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                kd30Var.I();
            } finally {
                Trace.endSection();
            }
        }
    }

    public void h() {
        xz40 xz40Var = (xz40) this.h;
        int i = xz40Var.c;
        if (i != 0) {
            Object[] objArr = xz40Var.f41739a;
            for (int i2 = 0; i2 < i; i2++) {
                qj30 qj30Var = (qj30) objArr[i2];
                if (qj30Var.f28818a.I()) {
                    boolean z = qj30Var.b;
                    e7z e7zVar = qj30Var.f28818a;
                    boolean z2 = qj30Var.c;
                    if (z) {
                        e7z.U(e7zVar, z2, 2);
                    } else {
                        e7z.W(e7zVar, z2, 2);
                    }
                }
            }
            xz40Var.g();
        }
    }

    public void i(e7z e7zVar) {
        xz40 xz40VarA = e7zVar.A();
        Object[] objArr = xz40VarA.f41739a;
        int i = xz40VarA.c;
        for (int i2 = 0; i2 < i; i2++) {
            e7z e7zVar2 = (e7z) objArr[i2];
            if (Intrinsics.d(e7zVar2.K(), Boolean.TRUE) && !e7zVar2.s1) {
                if (((oif0) this.e).f(e7zVar2)) {
                    e7zVar2.L();
                }
                i(e7zVar2);
            }
        }
    }

    public void j(hev0 hev0Var, int i, ArrayList arrayList) {
        i7k i7kVar = hev0Var.h;
        i7k i7kVar2 = hev0Var.i;
        for (d7k d7kVar : i7kVar.k) {
            if (d7kVar instanceof i7k) {
                a((i7k) d7kVar, i, arrayList, null);
            } else if (d7kVar instanceof hev0) {
                a(((hev0) d7kVar).h, i, arrayList, null);
            }
        }
        for (d7k d7kVar2 : i7kVar2.k) {
            if (d7kVar2 instanceof i7k) {
                a((i7k) d7kVar2, i, arrayList, null);
            } else if (d7kVar2 instanceof hev0) {
                a(((hev0) d7kVar2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            for (d7k d7kVar3 : ((ocu0) hev0Var).k.k) {
                if (d7kVar3 instanceof i7k) {
                    a((i7k) d7kVar3, i, arrayList, null);
                }
            }
        }
    }

    public void k(e7z e7zVar, boolean z) {
        if (!this.b) {
            xcx.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? e7zVar.i1.e : e7zVar.r()) {
            xcx.a("node not yet measured");
        }
        l(e7zVar, z);
    }

    public void l(e7z e7zVar, boolean z) {
        i810 i810Var;
        f7z f7zVar;
        xz40 xz40VarA = e7zVar.A();
        Object[] objArr = xz40VarA.f41739a;
        int i = xz40VarA.c;
        for (int i2 = 0; i2 < i; i2++) {
            e7z e7zVar2 = (e7z) objArr[i2];
            if ((!z && (e7zVar2.s() == c7z.f3886a || e7zVar2.i1.p.y.e())) || (z && (e7zVar2.t() == c7z.f3886a || ((i810Var = e7zVar2.i1.q) != null && (f7zVar = i810Var.s) != null && f7zVar.e())))) {
                boolean zE = p7x.E(e7zVar2);
                i7z i7zVar = e7zVar2.i1;
                if (zE && !z) {
                    if (i7zVar.e && ((oif0) this.e).f(e7zVar2)) {
                        y(e7zVar2, true);
                    } else {
                        k(e7zVar2, true);
                    }
                }
                if (z ? i7zVar.e : e7zVar2.r()) {
                    y(e7zVar2, z);
                }
                if (!(z ? i7zVar.e : e7zVar2.r())) {
                    l(e7zVar2, z);
                }
            }
        }
        if (z ? e7zVar.i1.e : e7zVar.r()) {
            y(e7zVar, z);
        }
    }

    public List o(List list, boolean z) {
        if (z) {
            this.c = false;
        } else {
            this.b = false;
        }
        lc00 lc00VarB = kotlin.collections.a.b();
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        zfs0 zfs0Var = (zfs0) CollectionsKt.firstOrNull(list);
        if (zfs0Var == null) {
            return kotlin.collections.a.c(sds0.f32046a);
        }
        long j = zfs0Var.b;
        calendar.setTimeInMillis(j * 1000);
        lc00VarB.add(new zds0(j));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zfs0 zfs0Var2 = (zfs0) it.next();
            calendar2.setTimeInMillis(zfs0Var2.b * 1000);
            if (calendar2.get(6) != calendar.get(6)) {
                lc00VarB.add(new zds0(zfs0Var2.b));
                lc00VarB.add(zfs0Var2);
            } else {
                lc00VarB.add(zfs0Var2);
            }
            calendar.setTimeInMillis(calendar2.getTimeInMillis());
        }
        return kotlin.collections.a.a(lc00VarB);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0125  */
    /* JADX WARN: Code duplicated, block: B:39:0x0157  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0157 -> B:40:0x0158). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object p(long r19, java.lang.Long r21, java.lang.Long r22, java.lang.String r23, java.lang.Integer r24, int r25, java.util.List r26, boolean r27, a.zje r28) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.h7k.p(long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Integer, int, java.util.List, boolean, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0109  */
    /* JADX WARN: Code duplicated, block: B:38:0x0139  */
    /* JADX WARN: Code duplicated, block: B:62:0x019e  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0139 -> B:39:0x013a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object q(long r19, boolean r21, java.util.List r22, java.lang.Long r23, java.lang.Integer r24, java.lang.Long r25, java.lang.String r26, a.zje r27) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.h7k.q(long, boolean, java.util.List, java.lang.Long, java.lang.Integer, java.lang.Long, java.lang.String, a.zje):java.lang.Object");
    }

    public void s(k4e k4eVar, j4e j4eVar, int i, j4e j4eVar2, int i2) {
        q96 q96Var = (q96) this.i;
        q96Var.f28332a = j4eVar;
        q96Var.b = j4eVar2;
        q96Var.c = i;
        q96Var.d = i2;
        ((r96) this.h).b(k4eVar, q96Var);
        k4eVar.T(q96Var.e);
        k4eVar.O(q96Var.f);
        k4eVar.F = q96Var.h;
        k4eVar.K(q96Var.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v4 */
    public boolean t(Function0 function0) {
        boolean z;
        ?? V;
        boolean z2;
        e7z e7zVar;
        boolean z3;
        boolean zY;
        oif0 oif0Var = (oif0) this.e;
        clc clcVar = (clc) oif0Var.b;
        e7z e7zVar2 = (e7z) this.d;
        if (!e7zVar2.I()) {
            xcx.a("performMeasureAndLayout called with unattached root");
        }
        if (!e7zVar2.J()) {
            xcx.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.b) {
            xcx.a("performMeasureAndLayout called during measure layout");
        }
        int i = 0;
        if (((p4e) this.i) != null) {
            this.b = true;
            this.c = true;
            try {
                if (oif0Var.E()) {
                    z = false;
                    while (true) {
                        clc clcVar2 = (clc) oif0Var.d;
                        mlk0 mlk0Var = (mlk0) clcVar2.b;
                        clc clcVar3 = (clc) oif0Var.c;
                        mlk0 mlk0Var2 = (mlk0) clcVar3.b;
                        if (!((mlk0) clcVar.b).isEmpty()) {
                            e7zVar = (e7z) ((mlk0) clcVar.b).first();
                            clcVar.g(e7zVar);
                            z3 = e7zVar.i != null;
                            z2 = false;
                        } else if (!mlk0Var2.isEmpty()) {
                            e7zVar = (e7z) mlk0Var2.first();
                            clcVar3.g(e7zVar);
                            z3 = e7zVar.i != null;
                            z2 = true;
                        } else {
                            if (mlk0Var.isEmpty()) {
                                break;
                            }
                            e7z e7zVar3 = (e7z) mlk0Var.first();
                            clcVar2.g(e7zVar3);
                            z2 = true;
                            e7zVar = e7zVar3;
                            z3 = false;
                        }
                        if (z2) {
                            zY = x(e7zVar, z3);
                        } else {
                            zY = y(e7zVar, z3);
                            if (e7zVar.i1.f) {
                                oif0Var.a(e7zVar, eox.b);
                            }
                            if (e7zVar.q()) {
                                oif0Var.a(e7zVar, eox.d);
                            }
                        }
                        if (e7zVar == e7zVar2 && zY) {
                            z = true;
                        }
                    }
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else {
                    z = false;
                }
                this.b = false;
                this.c = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.b = false;
                    this.c = false;
                    throw th2;
                }
            }
        } else {
            z = false;
        }
        xz40 xz40Var = (xz40) this.g;
        Object[] objArr = xz40Var.f41739a;
        int i2 = xz40Var.c;
        int i3 = 0;
        while (i3 < i2) {
            tzi tziVar = ((e7z) objArr[i3]).h1;
            rdx rdxVar = (rdx) tziVar.d;
            boolean zG = t460.g(4194304);
            lm40 lm40Var = rdxVar.D1;
            if (zG || (lm40Var = lm40Var.e) != null) {
                mb50 mb50Var = s460.w1;
                lm40 lm40VarJ1 = rdxVar.j1(zG);
                while (lm40VarJ1 != null && (lm40VarJ1.d & 4194304) != 0) {
                    if ((lm40VarJ1.c & 4194304) != 0) {
                        ?? r12 = lm40VarJ1;
                        ?? xz40Var2 = 0;
                        while (r12 != 0) {
                            if (r12 instanceof g6z) {
                                ((g6z) r12).N((rdx) tziVar.d);
                            } else {
                                if ((r12.c & 4194304) != 0 && (r12 instanceof f3k)) {
                                    lm40 lm40Var2 = ((f3k) r12).p;
                                    int i4 = i;
                                    V = r12;
                                    xz40Var2 = xz40Var2;
                                    while (lm40Var2 != null) {
                                        if ((lm40Var2.c & 4194304) != 0) {
                                            i4++;
                                            xz40Var2 = xz40Var2;
                                            if (i4 == 1) {
                                                V = lm40Var2;
                                            } else {
                                                if (xz40Var2 == 0) {
                                                    xz40Var2 = new xz40(new lm40[16]);
                                                }
                                                if (V != 0) {
                                                    xz40Var2.b(V);
                                                    V = 0;
                                                }
                                                xz40Var2.b(lm40Var2);
                                            }
                                        }
                                        lm40Var2 = lm40Var2.f;
                                        V = V;
                                        xz40Var2 = xz40Var2;
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                i = 0;
                                r12 = V;
                                xz40Var2 = xz40Var2;
                            }
                            V = vcc.V(xz40Var2);
                            i = 0;
                            r12 = V;
                            xz40Var2 = xz40Var2;
                        }
                    }
                    if (lm40VarJ1 == lm40Var) {
                        break;
                    }
                    lm40VarJ1 = lm40VarJ1.f;
                    i = 0;
                }
            }
            i3++;
            i = 0;
        }
        xz40Var.g();
        return z;
    }

    public String toString() {
        switch (this.f12578a) {
            case 1:
                Map map = (Map) this.i;
                Long l = (Long) this.h;
                Long l2 = (Long) this.g;
                Long l3 = (Long) this.f;
                Long l4 = (Long) this.e;
                ArrayList arrayList = new ArrayList();
                if (this.b) {
                    arrayList.add("isRegularFile");
                }
                if (this.c) {
                    arrayList.add("isDirectory");
                }
                if (l4 != null) {
                    arrayList.add("byteCount=" + l4.longValue());
                }
                if (l3 != null) {
                    arrayList.add("createdAt=" + l3.longValue());
                }
                if (l2 != null) {
                    arrayList.add("lastModifiedAt=" + l2.longValue());
                }
                if (l != null) {
                    arrayList.add("lastAccessedAt=" + l.longValue());
                }
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return CollectionsKt.b0(arrayList, ", ", "FileMetadata(", Separators.RPAREN, null, 56);
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v6 */
    public void u(e7z e7zVar, long j) {
        e7z e7zVar2 = (e7z) this.d;
        if (e7zVar.s1) {
            return;
        }
        if (e7zVar == e7zVar2) {
            xcx.a("measureAndLayout called on root");
        }
        if (!e7zVar2.I()) {
            xcx.a("performMeasureAndLayout called with unattached root");
        }
        if (!e7zVar2.J()) {
            xcx.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.b) {
            xcx.a("performMeasureAndLayout called during measure layout");
        }
        if (((p4e) this.i) != null) {
            this.b = true;
            this.c = false;
            try {
                oif0 oif0Var = (oif0) this.e;
                ((clc) oif0Var.b).g(e7zVar);
                ((clc) oif0Var.c).g(e7zVar);
                ((clc) oif0Var.d).g(e7zVar);
                if ((f(e7zVar, new p4e(j)) || e7zVar.i1.f) && Intrinsics.d(e7zVar.K(), Boolean.TRUE)) {
                    e7zVar.L();
                }
                i(e7zVar);
                g(e7zVar, new p4e(j));
                if (e7zVar.q() && e7zVar.J()) {
                    e7zVar.S();
                    kd30 kd30Var = (kd30) this.f;
                    if (e7zVar.r1 > 0) {
                        ((xz40) kd30Var.f18086a).b(e7zVar);
                        e7zVar.q1 = true;
                    }
                }
                h();
                this.b = false;
                this.c = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.b = false;
                    this.c = false;
                    throw th2;
                }
            }
        }
        xz40 xz40Var = (xz40) this.g;
        Object[] objArr = xz40Var.f41739a;
        int i = xz40Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            tzi tziVar = ((e7z) objArr[i2]).h1;
            rdx rdxVar = (rdx) tziVar.d;
            boolean zG = t460.g(4194304);
            lm40 lm40Var = rdxVar.D1;
            if (zG || (lm40Var = lm40Var.e) != null) {
                mb50 mb50Var = s460.w1;
                for (lm40 lm40VarJ1 = rdxVar.j1(zG); lm40VarJ1 != null && (lm40VarJ1.d & 4194304) != 0; lm40VarJ1 = lm40VarJ1.f) {
                    if ((lm40VarJ1.c & 4194304) != 0) {
                        ?? V = lm40VarJ1;
                        ?? xz40Var2 = 0;
                        while (V != 0) {
                            if (V instanceof g6z) {
                                ((g6z) V).N((rdx) tziVar.d);
                            } else if ((V.c & 4194304) != 0 && (V instanceof f3k)) {
                                lm40 lm40Var2 = ((f3k) V).p;
                                int i3 = 0;
                                V = V;
                                xz40Var2 = xz40Var2;
                                while (lm40Var2 != null) {
                                    if ((lm40Var2.c & 4194304) != 0) {
                                        i3++;
                                        xz40Var2 = xz40Var2;
                                        if (i3 == 1) {
                                            V = lm40Var2;
                                        } else {
                                            if (xz40Var2 == 0) {
                                                xz40Var2 = new xz40(new lm40[16]);
                                            }
                                            if (V != 0) {
                                                xz40Var2.b(V);
                                                V = 0;
                                            }
                                            xz40Var2.b(lm40Var2);
                                        }
                                    }
                                    lm40Var2 = lm40Var2.f;
                                    V = V;
                                    xz40Var2 = xz40Var2;
                                }
                                if (i3 == 1) {
                                }
                            }
                            V = vcc.V(xz40Var2);
                        }
                    }
                    if (lm40VarJ1 == lm40Var) {
                        break;
                    }
                }
            }
        }
        xz40Var.g();
    }

    public void v() {
        e7z e7zVar = (e7z) this.d;
        oif0 oif0Var = (oif0) this.e;
        if (oif0Var.E()) {
            if (!e7zVar.I()) {
                xcx.a("performMeasureAndLayout called with unattached root");
            }
            if (!e7zVar.J()) {
                xcx.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.b) {
                xcx.a("performMeasureAndLayout called during measure layout");
            }
            if (((p4e) this.i) != null) {
                this.b = true;
                this.c = false;
                try {
                    if ((((mlk0) ((clc) oif0Var.d).b).isEmpty() || ((mlk0) ((clc) oif0Var.b).b).isEmpty()) ? false : true) {
                        if (e7zVar.i != null) {
                            A(e7zVar, true);
                        } else {
                            z(e7zVar);
                        }
                    }
                    A(e7zVar, false);
                    this.b = false;
                    this.c = false;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        this.b = false;
                        this.c = false;
                        throw th2;
                    }
                }
            }
        }
    }

    public void w() {
        h7k h7kVar;
        i56 i56Var;
        for (k4e k4eVar : ((l4e) this.d).u0) {
            if (!k4eVar.f17665a) {
                j4e[] j4eVarArr = k4eVar.U;
                boolean z = false;
                j4e j4eVar = j4eVarArr[0];
                j4e j4eVar2 = j4eVarArr[1];
                int i = k4eVar.s;
                int i2 = k4eVar.t;
                j4e j4eVar3 = j4e.c;
                j4e j4eVar4 = j4e.b;
                boolean z2 = j4eVar == j4eVar4 || (j4eVar == j4eVar3 && i == 1);
                if (j4eVar2 == j4eVar4 || (j4eVar2 == j4eVar3 && i2 == 1)) {
                    z = true;
                }
                vmk vmkVar = k4eVar.d.e;
                boolean z3 = vmkVar.j;
                vmk vmkVar2 = k4eVar.e.e;
                boolean z4 = vmkVar2.j;
                boolean z5 = z2;
                j4e j4eVar5 = j4e.f15879a;
                if (z3 && z4) {
                    h7kVar = this;
                    h7kVar.s(k4eVar, j4eVar5, vmkVar.g, j4eVar5, vmkVar2.g);
                    k4eVar.f17665a = true;
                } else if (z3 && z) {
                    h7kVar = this;
                    h7kVar.s(k4eVar, j4eVar5, vmkVar.g, j4eVar4, vmkVar2.g);
                    ocu0 ocu0Var = k4eVar.e;
                    if (j4eVar2 == j4eVar3) {
                        ocu0Var.e.m = k4eVar.m();
                    } else {
                        ocu0Var.e.d(k4eVar.m());
                        k4eVar.f17665a = true;
                    }
                } else {
                    h7kVar = this;
                    if (z4 && z5) {
                        h7kVar.s(k4eVar, j4eVar4, vmkVar.g, j4eVar5, vmkVar2.g);
                        cmw cmwVar = k4eVar.d;
                        if (j4eVar == j4eVar3) {
                            cmwVar.e.m = k4eVar.s();
                        } else {
                            cmwVar.e.d(k4eVar.s());
                            k4eVar.f17665a = true;
                        }
                    }
                }
                if (k4eVar.f17665a && (i56Var = k4eVar.e.l) != null) {
                    i56Var.d(k4eVar.c0);
                }
                this = h7kVar;
            }
        }
    }

    public boolean x(e7z e7zVar, boolean z) {
        p4e p4eVar;
        e7z e7zVarV;
        e7z e7zVar2 = (e7z) this.d;
        boolean z2 = e7zVar.s1;
        i7z i7zVar = e7zVar.i1;
        boolean zF = false;
        if (!z2 && r(e7zVar)) {
            if (e7zVar == e7zVar2) {
                p4eVar = (p4e) this.i;
                p4eVar.getClass();
            } else {
                p4eVar = null;
            }
            if (z) {
                zF = i7zVar.e ? f(e7zVar, p4eVar) : false;
                if ((zF || i7zVar.f) && Intrinsics.d(e7zVar.K(), Boolean.TRUE)) {
                    e7zVar.L();
                }
            } else {
                boolean zG = e7zVar.r() ? g(e7zVar, p4eVar) : false;
                if (e7zVar.q() && (e7zVar == e7zVar2 || ((e7zVarV = e7zVar.v()) != null && e7zVarV.J() && i7zVar.p.u))) {
                    if (e7zVar == e7zVar2) {
                        if (e7zVar.Z == c7z.c) {
                            e7zVar.g();
                        }
                        e7z e7zVarV2 = e7zVar.v();
                        (e7zVarV2 != null ? ((rdx) e7zVarV2.h1.d).p : h7z.a(e7zVar).getPlacementScope()).m(i7zVar.p, 0, 0, 0.0f);
                    } else {
                        e7zVar.S();
                    }
                    kd30 kd30Var = (kd30) this.f;
                    if (e7zVar.r1 > 0) {
                        ((xz40) kd30Var.f18086a).b(e7zVar);
                        e7zVar.q1 = true;
                    }
                }
                zF = zG;
            }
            h();
        }
        return zF;
    }

    public boolean y(e7z e7zVar, boolean z) {
        p4e p4eVar;
        boolean zG = false;
        if (!e7zVar.s1 && r(e7zVar)) {
            if (e7zVar == ((e7z) this.d)) {
                p4eVar = (p4e) this.i;
                p4eVar.getClass();
            } else {
                p4eVar = null;
            }
            if (z) {
                if (e7zVar.i1.e) {
                    zG = f(e7zVar, p4eVar);
                }
            } else if (e7zVar.r()) {
                zG = g(e7zVar, p4eVar);
            }
            h();
        }
        return zG;
    }

    public void z(e7z e7zVar) {
        xz40 xz40VarA = e7zVar.A();
        Object[] objArr = xz40VarA.f41739a;
        int i = xz40VarA.c;
        for (int i2 = 0; i2 < i; i2++) {
            e7z e7zVar2 = (e7z) objArr[i2];
            if (e7zVar2.s() == c7z.f3886a || e7zVar2.i1.p.y.e()) {
                if (p7x.E(e7zVar2)) {
                    A(e7zVar2, true);
                } else {
                    z(e7zVar2);
                }
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h7k(boolean z, boolean z2, y190 y190Var, Long l, Long l2, Long l3, Long l4) {
        this.f12578a = (byte) 1;
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        this(z, z2, y190Var, l, l2, l3, l4, lunVar);
    }

    public h7k(roi0 roi0Var, ieu ieuVar, onv onvVar, e1u e1uVar, ahu ahuVar, pmi pmiVar) {
        this.f12578a = (byte) 2;
        this.d = roi0Var;
        this.e = ieuVar;
        this.f = onvVar;
        this.g = e1uVar;
        this.h = ahuVar;
        this.i = pmiVar;
        this.b = true;
        this.c = true;
    }

    public h7k(l4e l4eVar) {
        this.f12578a = (byte) 0;
        this.b = true;
        this.c = true;
        this.f = new ArrayList();
        new ArrayList();
        this.h = null;
        this.i = new q96();
        this.g = new ArrayList();
        this.d = l4eVar;
        this.e = l4eVar;
    }

    public h7k(boolean z, boolean z2, y190 y190Var, Long l, Long l2, Long l3, Long l4, Map map) {
        this.f12578a = (byte) 1;
        map.getClass();
        this.b = z;
        this.c = z2;
        this.d = y190Var;
        this.e = l;
        this.f = l2;
        this.g = l3;
        this.h = l4;
        this.i = xp20.n(map);
    }
}

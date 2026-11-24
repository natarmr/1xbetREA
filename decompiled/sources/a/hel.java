package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class hel extends f3k implements gpa0, h7x, vld, tel {
    public amt A;
    public amt B;
    public mdl Y;
    public ldl Z;
    public kdl f1;
    public qcc g1;
    public j6u0 h1;
    public hac i1;
    public f7x j1;
    public ma80 q;
    public Function1 r;
    public boolean s;
    public gy40 t;
    public q99 u;
    public nel v;
    public boolean w;
    public boolean x;
    public jdl y;
    public long z = 0;

    public hel(Function1 function1, boolean z, gy40 gy40Var, ma80 ma80Var) {
        this.q = ma80Var;
        this.r = function1;
        this.s = z;
        this.t = gy40Var;
    }

    public static void g1(hel helVar, dpa0 dpa0Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        ldl ldlVar = helVar.Z;
        if (ldlVar == null) {
            ldlVar = new ldl();
            ldlVar.f19856a = null;
            ldlVar.b = Long.MAX_VALUE;
            ldlVar.c = false;
            helVar.Z = ldlVar;
        }
        ldlVar.f19856a = dpa0Var;
        ldlVar.b = j;
        hac hacVar = helVar.i1;
        ma80 ma80Var = helVar.q;
        if (hacVar == null) {
            helVar.i1 = new hac(ma80Var);
        } else {
            hacVar.c = ma80Var;
            hacVar.b = j2;
        }
        ldlVar.c = false;
        helVar.g1 = ldlVar;
    }

    @Override // a.zlt
    public final String F() {
        if (!this.s) {
            return "idle";
        }
        qcc qccVar = this.g1;
        if (qccVar instanceof jdl) {
            return ((jdl) qccVar).c ? "waiting" : "idle";
        }
        if ((qccVar instanceof ldl) || (qccVar instanceof kdl)) {
            return "waiting";
        }
        return qccVar instanceof mdl ? "recognized" : "idle";
    }

    @Override // a.tel
    public final ma80 J() {
        return this.q;
    }

    @Override // a.lm40
    public final void S0() {
        this.w = false;
        c1();
        amt amtVar = this.B;
        if (amtVar != null) {
            a1(amtVar);
        }
        amt amtVar2 = this.A;
        if (amtVar2 != null) {
            a1(amtVar2);
        }
        this.B = null;
        this.A = null;
    }

    @Override // a.h7x
    public final void Y(zz2 zz2Var, xoa0 xoa0Var) {
        Object obj;
        float f;
        Object obj2;
        float fIntBitsToFloat;
        Object obj3;
        Object obj4;
        Object obj5;
        int i = zz2Var.f45232a;
        ArrayList arrayList = (ArrayList) zz2Var.b;
        if (this.s) {
            f7x f7xVar = this.j1;
            if (f7xVar == null) {
                f7xVar = new f7x(this);
                this.j1 = f7xVar;
            }
            if (this.B == null) {
                amt amtVar = new amt(f7xVar);
                Z0(amtVar);
                this.B = amtVar;
            }
            f7x f7xVar2 = this.j1;
            if (f7xVar2 != null) {
                hel helVar = f7xVar2.f9079a;
                d7x d7xVar = f7xVar2.f;
                int i2 = 0;
                Object obj6 = d7xVar;
                if (d7xVar == null) {
                    z6x z6xVar = f7xVar2.b;
                    z6x z6xVar2 = z6xVar;
                    if (z6xVar == null) {
                        y6x y6xVar = y6x.c;
                        z6x z6xVar3 = new z6x();
                        z6xVar3.f43891a = y6xVar;
                        z6xVar3.b = false;
                        z6xVar3.c = false;
                        f7xVar2.b = z6xVar3;
                        z6xVar2 = z6xVar3;
                    }
                    f7xVar2.f = z6xVar2;
                    obj6 = z6xVar2;
                }
                boolean z = true;
                if (obj6 instanceof z6x) {
                    z6x z6xVar4 = (z6x) obj6;
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    int size = arrayList.size();
                    while (i2 < size) {
                        if (!g7x.v((x6x) arrayList.get(i2))) {
                            return;
                        } else {
                            i2++;
                        }
                    }
                    x6x x6xVar = (x6x) CollectionsKt.U(arrayList);
                    y6x y6xVar2 = e7x.f7346a[z6xVar4.f43891a.ordinal()] == 1 ? !helVar.r1() ? y6x.f42121a : y6x.b : z6xVar4.f43891a;
                    z6xVar4.f43891a = y6xVar2;
                    if (xoa0Var == xoa0.f41207a) {
                        if (y6xVar2 == y6x.b) {
                            x6xVar.i = true;
                            z6xVar4.b = true;
                        }
                        z6xVar4.c = true;
                    }
                    if (xoa0Var == xoa0.b) {
                        if (y6xVar2 == y6x.f42121a) {
                            f7x.c(f7xVar2, x6xVar, x6xVar.f40386a, 0L, 12);
                            return;
                        }
                        if (z6xVar4.b) {
                            f7xVar2.f(x6xVar, x6xVar, new v6x(i), 0L);
                            f7xVar2.e(x6xVar, new v6x(i), 0L);
                            long j = x6xVar.f40386a;
                            c7x c7xVar = f7xVar2.c;
                            if (c7xVar == null) {
                                c7xVar = new c7x();
                                c7xVar.f3884a = Long.MAX_VALUE;
                                f7xVar2.c = c7xVar;
                            }
                            c7xVar.f3884a = j;
                            f7xVar2.f = c7xVar;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (obj6 instanceof b7x) {
                    b7x b7xVar = (b7x) obj6;
                    if (xoa0Var == xoa0.f41207a) {
                        return;
                    }
                    int size2 = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            obj3 = null;
                            break;
                        }
                        obj3 = arrayList.get(i3);
                        int i4 = i3;
                        if (b5x.I(((x6x) obj3).f40386a, b7xVar.b)) {
                            break;
                        } else {
                            i3 = i4 + 1;
                        }
                    }
                    x6x x6xVar2 = (x6x) obj3;
                    if (x6xVar2 == null) {
                        int size3 = arrayList.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size3) {
                                obj5 = null;
                                break;
                            }
                            obj5 = arrayList.get(i5);
                            if (((x6x) obj5).d) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                        x6xVar2 = (x6x) obj5;
                        if (x6xVar2 == null) {
                            f7xVar2.a();
                            return;
                        }
                        b7xVar.b = x6xVar2.f40386a;
                    }
                    if (xoa0Var == xoa0.b) {
                        if (x6xVar2.i) {
                            x6x x6xVar3 = b7xVar.f2128a;
                            if (x6xVar3 == null) {
                                jf4.o("AwaitTouchSlop.initialDown was not initialized");
                                return;
                            }
                            long j2 = b7xVar.b;
                            hac hacVar = f7xVar2.h;
                            if (hacVar == null) {
                                jf4.o("AwaitTouchSlop.touchSlopDetector was not initialized");
                                return;
                            }
                            f7xVar2.b(x6xVar3, j2, hacVar);
                        } else if (g7x.w(x6xVar2)) {
                            int size4 = arrayList.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size4) {
                                    obj4 = null;
                                    break;
                                }
                                Object obj7 = arrayList.get(i6);
                                if (((x6x) obj7).d) {
                                    obj4 = obj7;
                                    break;
                                }
                                i6++;
                            }
                            x6x x6xVar4 = (x6x) obj4;
                            if (x6xVar4 == null) {
                                f7xVar2.a();
                            } else {
                                b7xVar.b = x6xVar4.f40386a;
                            }
                        } else {
                            wgu0 wgu0Var = (wgu0) mbc.R(helVar, bmd.t);
                            float f2 = bel.f2455a;
                            float fH = wgu0Var.h();
                            hac hacVar2 = f7xVar2.h;
                            if (hacVar2 == null) {
                                jf4.o("Touch slop detector not initialized.");
                                return;
                            }
                            long jU = hac.u(hacVar2, g7x.U(x6xVar2, helVar.q, new v6x(i), true), fH);
                            if ((9223372034707292159L & jU) != 9205357640488583168L) {
                                x6xVar2.i = true;
                                x6x x6xVar5 = b7xVar.f2128a;
                                x6xVar5.getClass();
                                x6x x6xVar6 = x6xVar2;
                                f7xVar2.f(x6xVar5, x6xVar6, new v6x(i), jU);
                                x6xVar2 = x6xVar6;
                                f7xVar2.e(x6xVar2, new v6x(i), jU);
                                long j3 = x6xVar2.f40386a;
                                c7x c7xVar2 = f7xVar2.c;
                                if (c7xVar2 == null) {
                                    c7xVar2 = new c7x();
                                    c7xVar2.f3884a = Long.MAX_VALUE;
                                    f7xVar2.c = c7xVar2;
                                }
                                c7xVar2.f3884a = j3;
                                f7xVar2.f = c7xVar2;
                            } else {
                                b7xVar.c = true;
                            }
                        }
                    }
                    if (xoa0Var == xoa0.c && b7xVar.c) {
                        if (!x6xVar2.i) {
                            b7xVar.c = false;
                            return;
                        }
                        x6x x6xVar7 = b7xVar.f2128a;
                        if (x6xVar7 == null) {
                            jf4.o("AwaitTouchSlop.initialDown was not initialized");
                            return;
                        }
                        long j4 = b7xVar.b;
                        hac hacVar3 = f7xVar2.h;
                        if (hacVar3 != null) {
                            f7xVar2.b(x6xVar7, j4, hacVar3);
                            return;
                        } else {
                            jf4.o("AwaitTouchSlop.touchSlopDetector was not initialized");
                            return;
                        }
                    }
                    return;
                }
                if (obj6 instanceof a7x) {
                    a7x a7xVar = (a7x) obj6;
                    if (xoa0Var != xoa0.c) {
                        return;
                    }
                    int size5 = arrayList.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        if (((x6x) arrayList.get(i7)).i) {
                            z = false;
                            break;
                        }
                    }
                    int size6 = arrayList.size();
                    while (i2 < size6) {
                        if (((x6x) arrayList.get(i2)).d) {
                            if (arrayList.isEmpty()) {
                                break;
                            }
                            if (z) {
                                long jV = g7x.V((x6x) CollectionsKt.U(arrayList), helVar.q, new v6x(i));
                                x6x x6xVar8 = a7xVar.f396a;
                                x6xVar8.getClass();
                                long jE = ne60.e(jV, g7x.V(x6xVar8, helVar.q, new v6x(i)));
                                x6x x6xVar9 = a7xVar.f396a;
                                if (x6xVar9 != null) {
                                    f7x.c(f7xVar2, x6xVar9, a7xVar.b, jE, 8);
                                    return;
                                } else {
                                    jf4.o("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                        i2++;
                    }
                    f7xVar2.a();
                    return;
                }
                if (!(obj6 instanceof c7x)) {
                    t9f.b();
                    return;
                }
                c7x c7xVar3 = (c7x) obj6;
                if (xoa0Var != xoa0.b) {
                    return;
                }
                long j5 = c7xVar3.f3884a;
                int size7 = arrayList.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        obj = null;
                        break;
                    }
                    obj = arrayList.get(i8);
                    if (b5x.I(((x6x) obj).f40386a, j5)) {
                        break;
                    } else {
                        i8++;
                    }
                }
                x6x x6xVar10 = (x6x) obj;
                if (x6xVar10 == null) {
                    return;
                }
                long j6 = x6xVar10.c;
                boolean zW = g7x.w(x6xVar10);
                ndl ndlVar = ndl.f23340a;
                if (!zW) {
                    if (x6xVar10.i) {
                        helVar.h1(ndlVar);
                        return;
                    } else {
                        if (ne60.d(g7x.U(x6xVar10, helVar.q, new v6x(i), true)) == 0.0f) {
                            return;
                        }
                        f7xVar2.e(x6xVar10, new v6x(i), g7x.U(x6xVar10, helVar.q, new v6x(i), false));
                        x6xVar10.i = true;
                        return;
                    }
                }
                int size8 = arrayList.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size8) {
                        f = 0.0f;
                        obj2 = null;
                        break;
                    } else {
                        obj2 = arrayList.get(i9);
                        f = 0.0f;
                        if (((x6x) obj2).d) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                }
                x6x x6xVar11 = (x6x) obj2;
                if (x6xVar11 != null) {
                    c7xVar3.f3884a = x6xVar11.f40386a;
                    return;
                }
                if (x6xVar10.i || !g7x.w(x6xVar10)) {
                    helVar.h1(ndlVar);
                } else {
                    j6u0 j6u0VarD = f7xVar2.d();
                    ma80 ma80Var = helVar.q;
                    y78 y78Var = f7xVar2.i;
                    vy40 vy40Var = (vy40) y78Var.c;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j6 >> 32));
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j6 & 4294967295L));
                    if (g7x.v(x6xVar10)) {
                        y78Var.b = 0;
                        vy40Var.d();
                    }
                    if (!g7x.w(x6xVar10) && !g7x.v(x6xVar10)) {
                        if (vy40Var.b == 3) {
                            int i10 = y78Var.b;
                            y78Var.b = i10 + 1;
                            vy40Var.o(i10, x6xVar10);
                        } else {
                            vy40Var.a(x6xVar10);
                        }
                        if (y78Var.b == 3) {
                            y78Var.b = 0;
                        }
                        Object[] objArr = vy40Var.f38232a;
                        int i11 = vy40Var.b;
                        float fIntBitsToFloat4 = f;
                        for (int i12 = 0; i12 < i11; i12++) {
                            fIntBitsToFloat4 += Float.intBitsToFloat((int) (((x6x) objArr[i12]).c >> 32));
                        }
                        int i13 = vy40Var.b;
                        fIntBitsToFloat2 = fIntBitsToFloat4 / i13;
                        Object[] objArr2 = vy40Var.f38232a;
                        float fIntBitsToFloat5 = f;
                        for (int i14 = 0; i14 < i13; i14++) {
                            fIntBitsToFloat5 += Float.intBitsToFloat((int) (((x6x) objArr2[i14]).c & 4294967295L));
                        }
                        fIntBitsToFloat3 = fIntBitsToFloat5 / vy40Var.b;
                    }
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32);
                    if (ma80Var != null) {
                        if (i == 1) {
                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                        } else if (i == 2) {
                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                        }
                        jFloatToRawIntBits = ma80Var == ma80.b ? (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) : (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
                    }
                    j6u0VarD.f16007a.b(x6xVar10.b, jFloatToRawIntBits);
                    float fG = ((wgu0) mbc.R(helVar, bmd.t)).g();
                    long jA = f7xVar2.d().a(wpm0.g(fG, fG));
                    r34 r34Var = f7xVar2.d().f16007a;
                    i6u0 i6u0Var = (i6u0) r34Var.b;
                    zaj[] zajVarArr = i6u0Var.d;
                    qx3.l(0, zajVarArr.length, null, zajVarArr);
                    i6u0Var.e = 0;
                    i6u0 i6u0Var2 = (i6u0) r34Var.c;
                    zaj[] zajVarArr2 = i6u0Var2.d;
                    qx3.l(0, zajVarArr2.length, null, zajVarArr2);
                    i6u0Var2.e = 0;
                    r34Var.f29768a = 0L;
                    helVar.h1(new qdl(true, uel.c(jA)));
                }
                f7xVar2.a();
            }
        }
    }

    public final void c1() {
        nel nelVar = this.v;
        if (nelVar != null) {
            gy40 gy40Var = this.t;
            if (gy40Var != null) {
                gy40Var.b(new mel(nelVar));
            }
            this.v = null;
        }
    }

    public abstract Object d1(ic1 ic1Var, xb2 xb2Var);

    public final void e1() {
        this.z = 0L;
        jdl jdlVar = this.y;
        if (jdlVar == null) {
            idl idlVar = idl.c;
            jdlVar = new jdl();
            jdlVar.f16333a = idlVar;
            jdlVar.b = false;
            jdlVar.c = false;
            this.y = jdlVar;
        }
        jdlVar.f16333a = idl.c;
        jdlVar.b = false;
        jdlVar.c = false;
        this.g1 = jdlVar;
    }

    public final void f1(dpa0 dpa0Var, long j, hac hacVar) {
        kdl kdlVar = this.f1;
        if (kdlVar == null) {
            kdlVar = new kdl();
            kdlVar.f18112a = null;
            kdlVar.b = Long.MAX_VALUE;
            this.f1 = kdlVar;
        }
        kdlVar.f18112a = dpa0Var;
        kdlVar.b = j;
        hacVar.b = 0L;
        this.g1 = kdlVar;
    }

    /* JADX WARN: Code duplicated, block: B:96:0x01a6  */
    @Override // a.gpa0
    public void h(woa0 woa0Var, xoa0 xoa0Var, long j) {
        Object obj;
        Object obj2;
        boolean z;
        Object obj3;
        ldl ldlVar;
        boolean z2;
        Object obj4;
        this.x = true;
        if (this.s) {
            if (this.A == null) {
                amt amtVar = new amt(this);
                Z0(amtVar);
                this.A = amtVar;
            }
            qcc qccVar = this.g1;
            boolean z3 = false;
            Object obj5 = qccVar;
            if (qccVar == null) {
                jdl jdlVar = this.y;
                jdl jdlVar2 = jdlVar;
                if (jdlVar == null) {
                    idl idlVar = idl.c;
                    jdl jdlVar3 = new jdl();
                    jdlVar3.f16333a = idlVar;
                    jdlVar3.b = false;
                    jdlVar3.c = false;
                    this.y = jdlVar3;
                    jdlVar2 = jdlVar3;
                }
                this.g1 = jdlVar2;
                obj5 = jdlVar2;
            }
            if (obj5 instanceof jdl) {
                jdl jdlVar4 = (jdl) obj5;
                if (!woa0Var.f39485a.isEmpty() && tto0.e(woa0Var, false)) {
                    dpa0 dpa0Var = (dpa0) CollectionsKt.U(woa0Var.f39485a);
                    idl idlVar2 = del.f5956a[jdlVar4.f16333a.ordinal()] == 1 ? !r1() ? idl.f14590a : idl.b : jdlVar4.f16333a;
                    jdlVar4.f16333a = idlVar2;
                    if (xoa0Var == xoa0.f41207a) {
                        if (idlVar2 == idl.b) {
                            dpa0Var.a();
                            jdlVar4.b = true;
                        }
                        jdlVar4.c = true;
                    }
                    if (xoa0Var == xoa0.b) {
                        if (idlVar2 == idl.f14590a) {
                            g1(this, dpa0Var, dpa0Var.f6456a, 0L, 12);
                            return;
                        }
                        if (jdlVar4.b) {
                            q1(dpa0Var, dpa0Var, 0L);
                            p1(0L, dpa0Var);
                            long j2 = dpa0Var.f6456a;
                            mdl mdlVar = this.Y;
                            if (mdlVar == null) {
                                mdlVar = new mdl();
                                mdlVar.f21602a = Long.MAX_VALUE;
                                this.Y = mdlVar;
                            }
                            mdlVar.f21602a = j2;
                            this.g1 = mdlVar;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            Object obj6 = null;
            if (!(obj5 instanceof ldl)) {
                if (obj5 instanceof kdl) {
                    kdl kdlVar = (kdl) obj5;
                    if (xoa0Var != xoa0.c) {
                        return;
                    }
                    List list = woa0Var.f39485a;
                    int size = list.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            z = true;
                            break;
                        } else {
                            if (((dpa0) list.get(i)).c()) {
                                z = false;
                                break;
                            }
                            i++;
                        }
                    }
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        if (((dpa0) list.get(i2)).d) {
                            if (list.isEmpty()) {
                                break;
                            }
                            if (z) {
                                long j3 = ((dpa0) CollectionsKt.U(list)).c;
                                dpa0 dpa0Var2 = kdlVar.f18112a;
                                dpa0Var2.getClass();
                                long jE = ne60.e(j3, dpa0Var2.c);
                                dpa0 dpa0Var3 = kdlVar.f18112a;
                                if (dpa0Var3 != null) {
                                    g1(this, dpa0Var3, kdlVar.b, jE, 8);
                                    return;
                                } else {
                                    jf4.o("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    e1();
                    return;
                }
                if (!(obj5 instanceof mdl)) {
                    t9f.b();
                    return;
                }
                mdl mdlVar2 = (mdl) obj5;
                if (xoa0Var != xoa0.b) {
                    return;
                }
                long j4 = mdlVar2.f21602a;
                List list2 = woa0Var.f39485a;
                int size3 = list2.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size3) {
                        obj = null;
                        break;
                    }
                    obj = list2.get(i3);
                    if (b5x.I(((dpa0) obj).f6456a, j4)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                dpa0 dpa0Var4 = (dpa0) obj;
                if (dpa0Var4 == null) {
                    return;
                }
                boolean zL = x2x.L(dpa0Var4);
                Object obj7 = ndl.f23340a;
                if (!zL) {
                    if (dpa0Var4.c()) {
                        n1().f(obj7);
                        return;
                    } else {
                        if (ne60.d(x2x.j0(dpa0Var4, true)) == 0.0f) {
                            return;
                        }
                        p1(x2x.j0(dpa0Var4, false), dpa0Var4);
                        dpa0Var4.a();
                        return;
                    }
                }
                List list3 = woa0Var.f39485a;
                int size4 = list3.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size4) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list3.get(i4);
                    if (((dpa0) obj2).d) {
                        break;
                    } else {
                        i4++;
                    }
                }
                dpa0 dpa0Var5 = (dpa0) obj2;
                if (dpa0Var5 != null) {
                    mdlVar2.f21602a = dpa0Var5.f6456a;
                    return;
                }
                if (dpa0Var4.c() || !x2x.L(dpa0Var4)) {
                    n1().f(obj7);
                } else {
                    float fG = ((wgu0) mbc.R(this, bmd.t)).g();
                    dqm0.l(o1(), dpa0Var4);
                    long jA = o1().a(wpm0.g(fG, fG));
                    r34 r34Var = o1().f16007a;
                    i6u0 i6u0Var = (i6u0) r34Var.b;
                    zaj[] zajVarArr = i6u0Var.d;
                    qx3.l(0, zajVarArr.length, null, zajVarArr);
                    i6u0Var.e = 0;
                    i6u0 i6u0Var2 = (i6u0) r34Var.c;
                    zaj[] zajVarArr2 = i6u0Var2.d;
                    qx3.l(0, zajVarArr2.length, null, zajVarArr2);
                    i6u0Var2.e = 0;
                    r34Var.f29768a = 0L;
                    n1().f(new qdl(false, uel.c(jA)));
                    this.x = false;
                }
                e1();
                return;
            }
            ldl ldlVar2 = (ldl) obj5;
            if (xoa0Var == xoa0.f41207a) {
                return;
            }
            List list4 = woa0Var.f39485a;
            int size5 = list4.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    obj3 = null;
                    break;
                }
                obj3 = list4.get(i5);
                if (b5x.I(((dpa0) obj3).f6456a, ldlVar2.b)) {
                    break;
                } else {
                    i5++;
                }
            }
            dpa0 dpa0Var6 = (dpa0) obj3;
            if (dpa0Var6 == null) {
                int size6 = list4.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size6) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list4.get(i6);
                    if (((dpa0) obj4).d) {
                        break;
                    } else {
                        i6++;
                    }
                }
                dpa0Var6 = (dpa0) obj4;
                if (dpa0Var6 == null) {
                    e1();
                    return;
                }
                ldlVar2.b = dpa0Var6.f6456a;
            }
            if (xoa0Var != xoa0.b) {
                ldlVar = ldlVar2;
            } else if (dpa0Var6.c()) {
                ldlVar = ldlVar2;
                dpa0 dpa0Var7 = ldlVar.f19856a;
                if (dpa0Var7 == null) {
                    jf4.o("AwaitTouchSlop.initialDown was not initialized");
                    return;
                }
                long j5 = ldlVar.b;
                hac hacVar = this.i1;
                if (hacVar == null) {
                    jf4.o("AwaitTouchSlop.touchSlopDetector was not initialized");
                    return;
                }
                f1(dpa0Var7, j5, hacVar);
            } else if (x2x.L(dpa0Var6)) {
                int size7 = list4.size();
                for (int i7 = 0; i7 < size7; i7++) {
                    Object obj8 = list4.get(i7);
                    if (((dpa0) obj8).d) {
                        obj6 = obj8;
                        break;
                    }
                }
                dpa0 dpa0Var8 = (dpa0) obj6;
                if (dpa0Var8 == null) {
                    e1();
                } else {
                    ldlVar2.b = dpa0Var8.f6456a;
                }
                ldlVar = ldlVar2;
            } else {
                float fI = bel.i((wgu0) mbc.R(this, bmd.t), dpa0Var6.i);
                hac hacVar2 = this.i1;
                if (hacVar2 == null) {
                    jf4.o("Touch slop detector not initialized.");
                    return;
                }
                long jU = hac.u(hacVar2, x2x.j0(dpa0Var6, true), fI);
                if ((9223372034707292159L & jU) != 9205357640488583168L) {
                    ldlVar = ldlVar2;
                    long jF = ne60.f(this.z, x2x.j0(dpa0Var6, false));
                    this.z = jF;
                    float fAtan2 = ((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (this.z & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (jF >> 32))))) * 57.29578f;
                    ma80 ma80Var = this.q;
                    if (ma80Var == null) {
                        z2 = true;
                    } else {
                        bk9 bk9Var = uel.f35535a;
                        if (ma80Var != ma80.b ? fAtan2 <= 30.0f || fAtan2 > 90.0f : fAtan2 > 30.0f) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                    }
                    hie0 hie0Var = new hie0();
                    cel celVar = new cel(fAtan2, (Object) hie0Var, (byte) (z3 ? 1 : 0));
                    bk9 bk9Var2 = uel.f35535a;
                    etm0.t(this, amt.p, new dht(new edl(celVar, (byte) 2), (byte) 6));
                    if (z2 || !hie0Var.f13108a) {
                        dpa0Var6.a();
                        dpa0 dpa0Var9 = ldlVar.f19856a;
                        dpa0Var9.getClass();
                        q1(dpa0Var9, dpa0Var6, jU);
                        p1(jU, dpa0Var6);
                        long j6 = dpa0Var6.f6456a;
                        mdl mdlVar3 = this.Y;
                        if (mdlVar3 == null) {
                            mdlVar3 = new mdl();
                            mdlVar3.f21602a = Long.MAX_VALUE;
                            this.Y = mdlVar3;
                        }
                        mdlVar3.f21602a = j6;
                        this.g1 = mdlVar3;
                    } else {
                        ldlVar.c = true;
                    }
                } else {
                    ldlVar = ldlVar2;
                    ldlVar.c = true;
                    this.z = ne60.f(this.z, x2x.j0(dpa0Var6, true));
                }
            }
            if (xoa0Var == xoa0.c && ldlVar.c) {
                if (!dpa0Var6.c()) {
                    ldlVar.c = false;
                    return;
                }
                dpa0 dpa0Var10 = ldlVar.f19856a;
                if (dpa0Var10 == null) {
                    jf4.o("AwaitTouchSlop.initialDown was not initialized");
                    return;
                }
                long j7 = ldlVar.b;
                hac hacVar3 = this.i1;
                if (hacVar3 != null) {
                    f1(dpa0Var10, j7, hacVar3);
                } else {
                    jf4.o("AwaitTouchSlop.touchSlopDetector was not initialized");
                }
            }
        }
    }

    public final void h1(rdl rdlVar) {
        if ((rdlVar instanceof pdl) && !this.w) {
            this.w = true;
            s1();
        }
        n1().f(rdlVar);
    }

    public void j1(qdl qdlVar) {
        if (this.n) {
            qjj.W(N0(), null, null, new oa(this, qdlVar, null, (byte) 14), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k1(zje zjeVar) {
        eel eelVar;
        if (zjeVar instanceof eel) {
            eelVar = (eel) zjeVar;
            int i = eelVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                eelVar.k = i - Integer.MIN_VALUE;
            } else {
                eelVar = new eel(this, zjeVar);
            }
        } else {
            eelVar = new eel(this, zjeVar);
        }
        Object obj = eelVar.i;
        wne wneVar = wne.f39444a;
        int i2 = eelVar.k;
        if (i2 == 0) {
            z1x.P(obj);
            nel nelVar = this.v;
            if (nelVar != null) {
                gy40 gy40Var = this.t;
                if (gy40Var != null) {
                    mel melVar = new mel(nelVar);
                    eelVar.k = 1;
                    if (gy40Var.a(melVar, eelVar) == wneVar) {
                        return wneVar;
                    }
                }
            }
            j1(new qdl(false, 0L));
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        this.v = null;
        j1(new qdl(false, 0L));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l1(pdl pdlVar, zje zjeVar) {
        fel felVar;
        gy40 gy40Var;
        nel nelVar;
        pdl pdlVar2;
        nel nelVar2;
        if (zjeVar instanceof fel) {
            felVar = (fel) zjeVar;
            int i = felVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                felVar.m = i - Integer.MIN_VALUE;
            } else {
                felVar = new fel(this, zjeVar);
            }
        } else {
            felVar = new fel(this, zjeVar);
        }
        Object obj = felVar.k;
        wne wneVar = wne.f39444a;
        int i2 = felVar.m;
        if (i2 == 0) {
            z1x.P(obj);
            nel nelVar3 = this.v;
            if (nelVar3 != null && (gy40Var = this.t) != null) {
                mel melVar = new mel(nelVar3);
                felVar.i = pdlVar;
                felVar.m = 1;
                if (gy40Var.a(melVar, felVar) != wneVar) {
                }
                return wneVar;
            }
            this.v = nelVar;
            i1(pdlVar.f26812a);
            return Unit.f46060a;
        }
        if (i2 == 1) {
            pdlVar = felVar.i;
            z1x.P(obj);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nelVar2 = felVar.j;
            pdlVar2 = felVar.i;
            z1x.P(obj);
        }
        nelVar = nelVar2;
        pdlVar = pdlVar2;
        this.v = nelVar;
        i1(pdlVar.f26812a);
        return Unit.f46060a;
        nelVar = new nel();
        gy40 gy40Var2 = this.t;
        if (gy40Var2 != null) {
            felVar.i = pdlVar;
            felVar.j = nelVar;
            felVar.m = 2;
            if (gy40Var2.a(nelVar, felVar) != wneVar) {
                pdlVar2 = pdlVar;
                nelVar2 = nelVar;
                nelVar = nelVar2;
                pdlVar = pdlVar2;
            }
            return wneVar;
        }
        this.v = nelVar;
        i1(pdlVar.f26812a);
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m1(qdl qdlVar, zje zjeVar) {
        gel gelVar;
        if (zjeVar instanceof gel) {
            gelVar = (gel) zjeVar;
            int i = gelVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                gelVar.l = i - Integer.MIN_VALUE;
            } else {
                gelVar = new gel(this, zjeVar);
            }
        } else {
            gelVar = new gel(this, zjeVar);
        }
        Object obj = gelVar.j;
        wne wneVar = wne.f39444a;
        int i2 = gelVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            nel nelVar = this.v;
            if (nelVar != null) {
                gy40 gy40Var = this.t;
                if (gy40Var != null) {
                    oel oelVar = new oel(nelVar);
                    gelVar.i = qdlVar;
                    gelVar.l = 1;
                    if (gy40Var.a(oelVar, gelVar) == wneVar) {
                        return wneVar;
                    }
                }
            }
            j1(qdlVar);
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qdlVar = gelVar.i;
        z1x.P(obj);
        this.v = null;
        j1(qdlVar);
        return Unit.f46060a;
    }

    @Override // a.gpa0
    public final void n0() {
        if (this.x) {
            e1();
            if (this.w) {
                n1().f(ndl.f23340a);
            }
            this.h1 = null;
        }
        this.x = false;
    }

    public final htb n1() {
        q99 q99Var = this.u;
        if (q99Var != null) {
            return q99Var;
        }
        jf4.o("Events channel not initialized.");
        return null;
    }

    public final j6u0 o1() {
        j6u0 j6u0Var = this.h1;
        if (j6u0Var != null) {
            return j6u0Var;
        }
        jf4.o("Velocity Tracker not initialized.");
        return null;
    }

    public final void p1(long j, dpa0 dpa0Var) {
        this.z = ne60.f(this.z, j);
        dqm0.l(o1(), dpa0Var);
        n1().f(new odl(false, j));
    }

    public final void q1(dpa0 dpa0Var, dpa0 dpa0Var2, long j) {
        if (this.h1 == null) {
            this.h1 = new j6u0();
        }
        dqm0.l(o1(), dpa0Var);
        long jE = ne60.e(dpa0Var2.c, j);
        if (((Boolean) this.r.invoke(new lpa0(dpa0Var.i))).booleanValue()) {
            if (!this.w) {
                if (this.u == null) {
                    this.u = vtb.d(Integer.MAX_VALUE, null, null, 6);
                }
                s1();
            }
            n1().f(new pdl(jE));
        }
    }

    public boolean r1() {
        sch0 sch0Var = ((lbh0) this).s1;
        if (sch0Var.f31986a.a()) {
            return true;
        }
        vf80 vf80Var = sch0Var.b;
        return vf80Var != null ? vf80Var.b() : false;
    }

    public final void s1() {
        this.w = true;
        if (this.u == null) {
            this.u = vtb.d(Integer.MAX_VALUE, null, null, 6);
        }
        qjj.W(N0(), null, null, new xb2(this, null), 3);
    }

    public final void t1(Function1 function1, boolean z, gy40 gy40Var, ma80 ma80Var, boolean z2) {
        this.r = function1;
        boolean z3 = true;
        if (this.s != z) {
            this.s = z;
            if (!z) {
                amt amtVar = this.B;
                if (amtVar != null) {
                    a1(amtVar);
                }
                amt amtVar2 = this.A;
                if (amtVar2 != null) {
                    a1(amtVar2);
                }
                this.B = null;
                this.A = null;
                c1();
                this.j1 = null;
            }
            z2 = true;
        }
        if (!Intrinsics.d(this.t, gy40Var)) {
            c1();
            this.t = gy40Var;
        }
        if (this.q != ma80Var) {
            this.q = ma80Var;
        } else {
            z3 = z2;
        }
        if (z3) {
            boolean z4 = this.x;
            ndl ndlVar = ndl.f23340a;
            if (z4) {
                e1();
                if (this.w) {
                    n1().f(ndlVar);
                }
                this.h1 = null;
            }
            f7x f7xVar = this.j1;
            if (f7xVar != null) {
                f7xVar.a();
                hel helVar = f7xVar.f9079a;
                if (helVar.w) {
                    helVar.h1(ndlVar);
                }
                f7xVar.g = null;
                y78 y78Var = f7xVar.j;
                y78Var.b = 0;
                ((iy40) y78Var.c).b = 0;
            }
        }
    }

    @Override // a.h7x
    public final void z0() {
        f7x f7xVar = this.j1;
        if (f7xVar != null) {
            f7xVar.a();
            hel helVar = f7xVar.f9079a;
            if (helVar.w) {
                helVar.h1(ndl.f23340a);
            }
            f7xVar.g = null;
            y78 y78Var = f7xVar.j;
            y78Var.b = 0;
            ((iy40) y78Var.c).b = 0;
        }
    }

    public void i1(long j) {
    }
}

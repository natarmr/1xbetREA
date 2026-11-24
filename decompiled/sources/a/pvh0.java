package a;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public final class pvh0 extends p4 {
    public static final p73 t = new p73(0.0f);
    public static final p73 u = new p73(1.0f);
    public final pz40 c;
    public final pz40 d;
    public Object e;
    public oms0 f;
    public long g;
    public final a7g0 h;
    public pgk0 i;
    public final agk0 j;
    public n5a k;
    public final k050 l;
    public final h050 m;
    public long n;
    public final vy40 o;
    public jvh0 p;
    public final ivh0 q;
    public float r;
    public final ivh0 s;

    /* JADX WARN: Type inference failed for: r3v7, types: [a.ivh0] */
    /* JADX WARN: Type inference failed for: r3v8, types: [a.ivh0] */
    public pvh0(Object obj) {
        super((byte) 12);
        this.c = androidx.compose.runtime.e.e(obj);
        this.d = androidx.compose.runtime.e.e(obj);
        this.e = obj;
        this.h = new a7g0(this, (byte) 22);
        this.j = androidx.compose.runtime.e.a(0.0f);
        this.l = new k050();
        this.m = new h050();
        this.n = Long.MIN_VALUE;
        this.o = new vy40();
        final byte b = 0;
        this.q = new Function1(this) { // from class: a.ivh0
            public final /* synthetic */ pvh0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                byte b2 = b;
                pvh0 pvh0Var = this.b;
                Long l = (Long) obj2;
                switch (b2) {
                    case 0:
                        pvh0Var.n = l.longValue();
                        break;
                    default:
                        long jLongValue = l.longValue();
                        long j = jLongValue - pvh0Var.n;
                        pvh0Var.n = jLongValue;
                        long jC = si30.c(j / ((double) pvh0Var.r));
                        vy40 vy40Var = pvh0Var.o;
                        if (vy40Var.j()) {
                            Object[] objArr = vy40Var.f38232a;
                            int i = vy40Var.b;
                            int i2 = 0;
                            for (int i3 = 0; i3 < i; i3++) {
                                jvh0 jvh0Var = (jvh0) objArr[i3];
                                pvh0.q1(jvh0Var, jC);
                                jvh0Var.c = true;
                            }
                            oms0 oms0Var = pvh0Var.f;
                            if (oms0Var != null) {
                                oms0Var.q();
                            }
                            int i4 = vy40Var.b;
                            Object[] objArr2 = vy40Var.f38232a;
                            IntRange intRangeO = l1e0.o(0, i4);
                            int i5 = intRangeO.f46068a;
                            int i6 = intRangeO.b;
                            if (i5 <= i6) {
                                while (true) {
                                    objArr2[i5 - i2] = objArr2[i5];
                                    if (((jvh0) objArr2[i5]).c) {
                                        i2++;
                                    }
                                    if (i5 != i6) {
                                        i5++;
                                    }
                                }
                            }
                            qx3.l(i4 - i2, i4, null, objArr2);
                            vy40Var.b -= i2;
                        }
                        jvh0 jvh0Var2 = pvh0Var.p;
                        if (jvh0Var2 != null) {
                            jvh0Var2.g = pvh0Var.g;
                            pvh0.q1(jvh0Var2, jC);
                            pvh0Var.u1(jvh0Var2.d);
                            if (jvh0Var2.d == 1.0f) {
                                pvh0Var.p = null;
                            }
                            pvh0Var.t1();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        };
        final byte b2 = 1;
        this.s = new Function1(this) { // from class: a.ivh0
            public final /* synthetic */ pvh0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                byte b3 = b2;
                pvh0 pvh0Var = this.b;
                Long l = (Long) obj2;
                switch (b3) {
                    case 0:
                        pvh0Var.n = l.longValue();
                        break;
                    default:
                        long jLongValue = l.longValue();
                        long j = jLongValue - pvh0Var.n;
                        pvh0Var.n = jLongValue;
                        long jC = si30.c(j / ((double) pvh0Var.r));
                        vy40 vy40Var = pvh0Var.o;
                        if (vy40Var.j()) {
                            Object[] objArr = vy40Var.f38232a;
                            int i = vy40Var.b;
                            int i2 = 0;
                            for (int i3 = 0; i3 < i; i3++) {
                                jvh0 jvh0Var = (jvh0) objArr[i3];
                                pvh0.q1(jvh0Var, jC);
                                jvh0Var.c = true;
                            }
                            oms0 oms0Var = pvh0Var.f;
                            if (oms0Var != null) {
                                oms0Var.q();
                            }
                            int i4 = vy40Var.b;
                            Object[] objArr2 = vy40Var.f38232a;
                            IntRange intRangeO = l1e0.o(0, i4);
                            int i5 = intRangeO.f46068a;
                            int i6 = intRangeO.b;
                            if (i5 <= i6) {
                                while (true) {
                                    objArr2[i5 - i2] = objArr2[i5];
                                    if (((jvh0) objArr2[i5]).c) {
                                        i2++;
                                    }
                                    if (i5 != i6) {
                                        i5++;
                                    }
                                }
                            }
                            qx3.l(i4 - i2, i4, null, objArr2);
                            vy40Var.b -= i2;
                        }
                        jvh0 jvh0Var2 = pvh0Var.p;
                        if (jvh0Var2 != null) {
                            jvh0Var2.g = pvh0Var.g;
                            pvh0.q1(jvh0Var2, jC);
                            pvh0Var.u1(jvh0Var2.d);
                            if (jvh0Var2.d == 1.0f) {
                                pvh0Var.p = null;
                            }
                            pvh0Var.t1();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        };
    }

    public static void q1(jvh0 jvh0Var, long j) {
        long j2 = jvh0Var.f17203a + j;
        jvh0Var.f17203a = j2;
        long j3 = jvh0Var.h;
        if (j2 >= j3) {
            jvh0Var.d = 1.0f;
            return;
        }
        p5u0 p5u0Var = jvh0Var.b;
        p73 p73Var = jvh0Var.e;
        if (p5u0Var == null) {
            float f = j2 / j3;
            jvh0Var.d = (f * 1.0f) + ((1.0f - f) * p73Var.a(0));
            return;
        }
        p73 p73Var2 = jvh0Var.f;
        if (p73Var2 == null) {
            p73Var2 = t;
        }
        jvh0Var.d = l1e0.c(((p73) p5u0Var.c(j2, p73Var, u, p73Var2)).a(0), 0.0f, 1.0f);
    }

    @Override // a.p4
    public final Object A0() {
        return ((hgk0) this.c).getValue();
    }

    @Override // a.p4
    public final void I0(Object obj) {
        ((hgk0) this.d).setValue(obj);
    }

    @Override // a.p4
    public final void K0(oms0 oms0Var) {
        oms0 oms0Var2 = this.f;
        if (oms0Var2 != null && !oms0Var.equals(oms0Var2)) {
            fsb0.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f + ", new instance: " + oms0Var);
        }
        this.f = oms0Var;
    }

    @Override // a.p4
    public final void L0() {
        this.f = null;
        pgk0 pgk0Var = this.i;
        if (pgk0Var != null) {
            pgk0Var.b(this);
        }
    }

    public final Object n1(zje zjeVar) {
        float fV = hhm0.v(zjeVar.getContext());
        if (fV <= 0.0f) {
            o1();
            return Unit.f46060a;
        }
        this.r = fV;
        Object objE = s0x.P(zjeVar.getContext()).e(this.s, zjeVar);
        return objE == wne.f39444a ? objE : Unit.f46060a;
    }

    public final void o1() {
        oms0 oms0Var = this.f;
        if (oms0Var != null) {
            oms0Var.c();
        }
        this.o.d();
        if (this.p != null) {
            this.p = null;
            u1(1.0f);
            t1();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0061  */
    public final void p1() {
        oms0 oms0Var = this.f;
        if (oms0Var == null) {
            return;
        }
        jvh0 jvh0Var = this.p;
        if (jvh0Var == null) {
            if (this.g > 0) {
                agk0 agk0Var = this.j;
                if (agk0Var.l() == 1.0f || Intrinsics.d(((hgk0) this.d).getValue(), ((hgk0) this.c).getValue())) {
                    jvh0Var = null;
                } else {
                    jvh0 jvh0Var2 = new jvh0();
                    jvh0Var2.d = agk0Var.l();
                    long j = this.g;
                    jvh0Var2.g = j;
                    jvh0Var2.h = si30.c((1.0d - ((double) agk0Var.l())) * j);
                    jvh0Var2.e.e(agk0Var.l(), 0);
                    jvh0Var = jvh0Var2;
                }
            } else {
                jvh0Var = null;
            }
        }
        if (jvh0Var != null) {
            jvh0Var.g = this.g;
            this.o.a(jvh0Var);
            oms0Var.n(jvh0Var);
        }
        this.p = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r1(zje zjeVar) {
        lvh0 lvh0Var;
        if (zjeVar instanceof lvh0) {
            lvh0Var = (lvh0) zjeVar;
            int i = lvh0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                lvh0Var.k = i - Integer.MIN_VALUE;
            } else {
                lvh0Var = new lvh0(this, zjeVar);
            }
        } else {
            lvh0Var = new lvh0(this, zjeVar);
        }
        Object obj = lvh0Var.i;
        Object obj2 = wne.f39444a;
        int i2 = lvh0Var.k;
        vy40 vy40Var = this.o;
        if (i2 == 0) {
            z1x.P(obj);
            if (vy40Var.i() && this.p == null) {
                return Unit.f46060a;
            }
            if (hhm0.v(lvh0Var.getContext()) == 0.0f) {
                o1();
                this.n = Long.MIN_VALUE;
                return Unit.f46060a;
            }
            if (this.n == Long.MIN_VALUE) {
                lvh0Var.k = 1;
                if (s0x.P(lvh0Var.getContext()).e(this.q, lvh0Var) != obj2) {
                }
            }
            return obj2;
        }
        if (i2 != 1 && i2 != 2) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        do {
            if (!vy40Var.j() && this.p == null) {
                this.n = Long.MIN_VALUE;
                return Unit.f46060a;
            }
            lvh0Var.k = 2;
        } while (n1(lvh0Var) != obj2);
        return obj2;
    }

    public final Object s1(float f, Object obj, bnn0 bnn0Var) {
        if (0.0f > f || f > 1.0f) {
            fsb0.a("Expecting fraction between 0 and 1. Got " + f);
        }
        oms0 oms0Var = this.f;
        if (oms0Var == null) {
            return Unit.f46060a;
        }
        Object objA = h050.a(this.m, new mvh0(obj, ((hgk0) this.c).getValue(), this, oms0Var, f, null), bnn0Var);
        return objA == wne.f39444a ? objA : Unit.f46060a;
    }

    public final void t1() {
        oms0 oms0Var = this.f;
        if (oms0Var == null) {
            return;
        }
        oms0Var.m(si30.c(((double) this.j.l()) * ((Number) oms0Var.m.getValue()).longValue()));
    }

    public final void u1(float f) {
        this.j.m(f);
    }

    public final void v1(pgk0 pgk0Var) {
        jk8 jk8Var;
        if (Intrinsics.d(this.i, pgk0Var)) {
            return;
        }
        pgk0 pgk0Var2 = this.i;
        if (pgk0Var2 != null) {
            pgk0Var2.b(this);
        }
        pgk0 pgk0Var3 = this.i;
        if (pgk0Var3 != null && (jk8Var = pgk0Var3.h) != null) {
            jk8Var.a();
        }
        this.i = pgk0Var;
        if (pgk0Var != null) {
            pgk0Var.e();
        }
        pgk0 pgk0Var4 = this.i;
        if (pgk0Var4 != null) {
            pgk0Var4.d(this, phu0.j, this.h);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0077  */
    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w1(zje zjeVar) {
        nvh0 nvh0Var;
        Object value;
        Object obj;
        if (zjeVar instanceof nvh0) {
            nvh0Var = (nvh0) zjeVar;
            int i = nvh0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                nvh0Var.l = i - Integer.MIN_VALUE;
            } else {
                nvh0Var = new nvh0(this, zjeVar);
            }
        } else {
            nvh0Var = new nvh0(this, zjeVar);
        }
        Object obj2 = nvh0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = nvh0Var.l;
        k050 k050Var = this.l;
        if (i2 == 0) {
            z1x.P(obj2);
            value = ((hgk0) this.c).getValue();
            nvh0Var.i = value;
            nvh0Var.l = 1;
            if (k050Var.d(nvh0Var) != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            Object obj3 = nvh0Var.i;
            z1x.P(obj2);
            value = obj3;
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = nvh0Var.i;
            z1x.P(obj2);
        }
        if (Intrinsics.d(obj2, obj)) {
            return Unit.f46060a;
        }
        this.n = Long.MIN_VALUE;
        throw new CancellationException("targetState while waiting for composition");
        nvh0Var.i = value;
        nvh0Var.l = 2;
        n5a n5aVar = new n5a(1, pnx.b(nvh0Var));
        n5aVar.r();
        this.k = n5aVar;
        k050Var.c(null);
        Object objP = n5aVar.p();
        if (objP != wneVar) {
            obj = value;
            obj2 = objP;
            if (Intrinsics.d(obj2, obj)) {
                return Unit.f46060a;
            }
            this.n = Long.MIN_VALUE;
            throw new CancellationException("targetState while waiting for composition");
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x0086, please report this as an issue */
    public final Object x1(zje zjeVar) {
        ovh0 ovh0Var;
        Object value;
        Object obj;
        if (zjeVar instanceof ovh0) {
            ovh0Var = (ovh0) zjeVar;
            int i = ovh0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ovh0Var.l = i - Integer.MIN_VALUE;
            } else {
                ovh0Var = new ovh0(this, zjeVar);
            }
        } else {
            ovh0Var = new ovh0(this, zjeVar);
        }
        Object obj2 = ovh0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = ovh0Var.l;
        k050 k050Var = this.l;
        if (i2 == 0) {
            z1x.P(obj2);
            value = ((hgk0) this.c).getValue();
            ovh0Var.i = value;
            ovh0Var.l = 1;
            if (k050Var.d(ovh0Var) != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            Object obj3 = ovh0Var.i;
            z1x.P(obj2);
            value = obj3;
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = ovh0Var.i;
            z1x.P(obj2);
        }
        if (!Intrinsics.d(obj2, obj)) {
            this.n = Long.MIN_VALUE;
            throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
        }
        return Unit.f46060a;
        if (!Intrinsics.d(value, this.e)) {
            ovh0Var.i = value;
            ovh0Var.l = 2;
            n5a n5aVar = new n5a(1, pnx.b(ovh0Var));
            n5aVar.r();
            this.k = n5aVar;
            k050Var.c(null);
            Object objP = n5aVar.p();
            if (objP != wneVar) {
                obj = value;
                obj2 = objP;
                if (!Intrinsics.d(obj2, obj)) {
                    this.n = Long.MIN_VALUE;
                    throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                }
            }
            return wneVar;
        }
        k050Var.c(null);
        return Unit.f46060a;
    }

    @Override // a.p4
    public final Object y0() {
        return ((hgk0) this.d).getValue();
    }
}

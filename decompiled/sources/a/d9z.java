package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class d9z implements bch0 {
    public static final v0h0 w = qxw.L(new z8z(0), new hvy(10));
    public boolean b;
    public q8z c;
    public final t8z d;
    public float g;
    public e7z j;
    public final tbz o;
    public final pz40 t;
    public final pz40 u;
    public final ieu v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ovj f5722a = new ovj();
    public final pz40 e = androidx.compose.runtime.e.d(f9z.f9179a, m2a.v);
    public final gy40 f = new gy40();
    public final ywj h = new ywj(new adw(this, 29));
    public final boolean i = true;
    public final a9z k = new a9z(this, (byte) 0);
    public final la5 l = new la5();
    public final dbz m = new dbz();
    public final hru n = new hru((byte) 25);
    public final pyu p = new pyu(this);
    public final qbz q = new qbz();
    public final pz40 r = m8x.J();
    public final pz40 s = m8x.J();

    public d9z(int i, int i2) {
        this.d = new t8z(i, i2, (byte) 0);
        this.o = new tbz(new z08((Object) this, i, (byte) 7));
        Boolean bool = Boolean.FALSE;
        this.t = androidx.compose.runtime.e.e(bool);
        this.u = androidx.compose.runtime.e.e(bool);
        this.v = new ieu((byte) 23);
    }

    public static Object f(d9z d9zVar, bnn0 bnn0Var) {
        d9zVar.getClass();
        Object objB = d9zVar.b(c050.f3507a, new juy(d9zVar, null, (byte) 3), bnn0Var);
        return objB == wne.f39444a ? objB : Unit.f46060a;
    }

    @Override // a.bch0
    public final boolean a() {
        return this.h.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r6.h.b(r7, r8, r0) == r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.bch0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(a.c050 r7, kotlin.jvm.functions.Function2 r8, a.yje r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof a.b9z
            if (r0 == 0) goto L13
            r0 = r9
            a.b9z r0 = (a.b9z) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            a.b9z r0 = new a.b9z
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.m
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            a.z1x.P(r9)
            goto L6c
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L31:
            a.bnn0 r7 = r0.j
            r8 = r7
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            a.c050 r7 = r0.i
            a.z1x.P(r9)
            goto L5d
        L3c:
            a.z1x.P(r9)
            a.pz40 r9 = r6.e
            a.hgk0 r9 = (a.hgk0) r9
            java.lang.Object r9 = r9.getValue()
            a.q8z r2 = a.f9z.f9179a
            if (r9 != r2) goto L5d
            r0.i = r7
            r9 = r8
            a.bnn0 r9 = (a.bnn0) r9
            r0.j = r9
            r0.m = r5
            a.la5 r9 = r6.l
            java.lang.Object r9 = r9.i(r0)
            if (r9 != r1) goto L5d
            goto L6b
        L5d:
            r0.i = r3
            r0.j = r3
            r0.m = r4
            a.ywj r6 = r6.h
            java.lang.Object r6 = r6.b(r7, r8, r0)
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.d9z.b(a.c050, kotlin.jvm.functions.Function2, a.yje):java.lang.Object");
    }

    @Override // a.bch0
    public final boolean c() {
        return ((Boolean) ((hgk0) this.u).getValue()).booleanValue();
    }

    @Override // a.bch0
    public final boolean d() {
        return ((Boolean) ((hgk0) this.t).getValue()).booleanValue();
    }

    @Override // a.bch0
    public final float e(float f) {
        return this.h.e(f);
    }

    public final void g(q8z q8zVar, boolean z, boolean z2) {
        r8z r8zVar;
        r8z r8zVar2;
        r8z r8zVar3;
        List list = q8zVar.n;
        int i = q8zVar.q;
        s8z s8zVar = q8zVar.f28321a;
        int i2 = q8zVar.b;
        this.o.e = list.size();
        Object obj = null;
        obj = null;
        t8z t8zVar = this.d;
        ieu ieuVar = this.v;
        if (!z && this.b) {
            this.c = q8zVar;
            rfk0 rfk0VarJ = vdx.J();
            Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
            rfk0 rfk0VarW = vdx.W(rfk0VarJ);
            try {
                if (ieuVar.o() && i2 == t8zVar.c.l() && s8zVar != null && (r8zVar3 = (r8z) tx3.B(s8zVar.b)) != null && r8zVar3.f30051a == t8zVar.b.l()) {
                    ieuVar.q();
                }
                return;
            } finally {
                vdx.Y(rfk0VarJ, rfk0VarW, function1E);
            }
        }
        if (z) {
            this.b = true;
        }
        this.g -= q8zVar.d;
        ((hgk0) this.e).setValue(q8zVar);
        ((hgk0) this.u).setValue(Boolean.valueOf(((s8zVar != null ? s8zVar.f31827a : 0) == 0 && i2 == 0) ? false : true));
        ((hgk0) this.t).setValue(Boolean.valueOf(q8zVar.c));
        if (z2) {
            t8zVar.getClass();
            if (i2 < 0.0f) {
                adx.c("scrollOffset should be non-negative");
            }
            t8zVar.c.m(i2);
        } else {
            t8zVar.getClass();
            if (s8zVar != null && (r8zVar2 = (r8z) tx3.B(s8zVar.b)) != null) {
                obj = r8zVar2.b;
            }
            t8zVar.e = obj;
            if (t8zVar.d || i > 0) {
                t8zVar.d = true;
                if (i2 < 0.0f) {
                    adx.c("scrollOffset should be non-negative (" + i2 + Separators.RPAREN);
                }
                t8zVar.a((s8zVar == null || (r8zVar = (r8z) tx3.B(s8zVar.b)) == null) ? 0 : r8zVar.f30051a, i2);
            }
            if (this.i) {
                ovj ovjVar = this.f5722a;
                xz40 xz40Var = ovjVar.b;
                int i3 = ovjVar.f25928a;
                boolean z3 = ovjVar.c;
                if (i3 != -1 && !list.isEmpty() && i3 != ovj.a(q8zVar, z3)) {
                    ovjVar.f25928a = -1;
                    Object[] objArr = xz40Var.f41739a;
                    int i4 = xz40Var.c;
                    for (int i5 = 0; i5 < i4; i5++) {
                        ((sbz) objArr[i5]).cancel();
                    }
                    xz40Var.g();
                }
                int i6 = ovjVar.d;
                if (i6 != -1 && ovjVar.e != 0.0f && i6 != i && !list.isEmpty()) {
                    int iA = ovj.a(q8zVar, ovjVar.e < 0.0f);
                    int i7 = ovjVar.e < 0.0f ? ((r8z) CollectionsKt.d0(list)).f30051a + 1 : ((r8z) CollectionsKt.U(list)).f30051a - 1;
                    if (i7 >= 0 && i7 < i && iA != ovjVar.f25928a && iA >= 0) {
                        ovjVar.f25928a = iA;
                        xz40Var.g();
                        xz40Var.d(xz40Var.c, this.p.p(iA));
                    }
                }
                ovjVar.d = i;
            }
        }
        if (z) {
            ieuVar.s(q8zVar.f, q8zVar.i, q8zVar.h);
        }
    }

    public final int h() {
        return this.d.b.l();
    }

    public final int i() {
        return this.d.c.l();
    }

    public final q8z j() {
        return (q8z) ((hgk0) this.e).getValue();
    }

    public final void k(float f, q8z q8zVar) {
        if (this.i) {
            ovj ovjVar = this.f5722a;
            xz40 xz40Var = ovjVar.b;
            List list = q8zVar.n;
            List list2 = q8zVar.n;
            ma80 ma80Var = q8zVar.r;
            if (!list.isEmpty()) {
                int i = 0;
                boolean z = f < 0.0f;
                int iA = ovj.a(q8zVar, z);
                int i2 = z ? ((r8z) CollectionsKt.d0(list2)).f30051a + 1 : ((r8z) CollectionsKt.U(list2)).f30051a - 1;
                if (i2 >= 0 && i2 < q8zVar.q) {
                    if (iA != ovjVar.f25928a && iA >= 0) {
                        if (ovjVar.c != z) {
                            Object[] objArr = xz40Var.f41739a;
                            int i3 = xz40Var.c;
                            for (int i4 = 0; i4 < i3; i4++) {
                                ((sbz) objArr[i4]).cancel();
                            }
                        }
                        ovjVar.c = z;
                        ovjVar.f25928a = iA;
                        xz40Var.g();
                        xz40Var.d(xz40Var.c, this.p.p(iA));
                    }
                    if (z) {
                        r8z r8zVar = (r8z) CollectionsKt.d0(list2);
                        if (((m8x.b0(r8zVar, ma80Var) + ((int) (ma80Var == ma80.f21447a ? r8zVar.w & 4294967295L : r8zVar.w >> 32))) + q8zVar.t) - q8zVar.p < (-f)) {
                            Object[] objArr2 = xz40Var.f41739a;
                            int i5 = xz40Var.c;
                            while (i < i5) {
                                ((sbz) objArr2[i]).a();
                                i++;
                            }
                        }
                    } else if (q8zVar.o - m8x.b0((r8z) CollectionsKt.U(list2), ma80Var) < f) {
                        Object[] objArr3 = xz40Var.f41739a;
                        int i6 = xz40Var.c;
                        while (i < i6) {
                            ((sbz) objArr3[i]).a();
                            i++;
                        }
                    }
                }
            }
            ovjVar.e = f;
        }
    }

    public final Object l(int i, int i2, yje yjeVar) {
        Object objB = b(c050.f3507a, new c9z(this, i, i2, null, (byte) 0), yjeVar);
        return objB == wne.f39444a ? objB : Unit.f46060a;
    }

    public final void m(int i, int i2, boolean z) {
        t8z t8zVar = this.d;
        if (t8zVar.b.l() != i || t8zVar.c.l() != i2) {
            dbz dbzVar = this.m;
            dbzVar.e();
            dbzVar.b = null;
            dbzVar.c = -1;
        }
        t8zVar.a(i, i2);
        t8zVar.e = null;
        e7z e7zVar = this.j;
        if (e7zVar != null) {
            e7zVar.l();
        }
    }
}

package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public abstract class xk80 implements bch0 {
    public final qbz A;
    public final pz40 B;
    public final pz40 C;
    public final pz40 D;
    public final pz40 E;
    public final pz40 F;
    public final pz40 G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f41020a;
    public pk80 b;
    public final pz40 c;
    public final qaj d;
    public int e;
    public int f;
    public long g;
    public long h;
    public float i;
    public float j;
    public final ywj k;
    public final boolean l;
    public final pz40 m;
    public w6k n;
    public int o;
    public final gy40 p;
    public final cgk0 q;
    public final cgk0 r;
    public final zbk s;
    public final zbk t;
    public final tbz u;
    public final sj80 v;
    public final hru w;
    public final la5 x;
    public final pz40 y;
    public final a9z z;

    public xk80(float f, int i) {
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            adx.a("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.c = androidx.compose.runtime.e.e(new ne60(0L));
        this.d = new qaj(i, f, this);
        this.e = i;
        this.g = Long.MAX_VALUE;
        final byte b = 0;
        this.k = new ywj(new Function1(this) { // from class: a.uk80
            public final /* synthetic */ xk80 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Long] */
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
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                pk80 pk80Var;
                byte b2 = b;
                pk80 pk80Var2 = null;
                xk80 xk80Var = this.b;
                switch (b2) {
                    case 0:
                        ?? ValueOf = (Float) obj;
                        float fFloatValue = ValueOf.floatValue();
                        long jB = k7x.B(xk80Var);
                        float f2 = xk80Var.i + fFloatValue;
                        long jC = si30.c(f2);
                        xk80Var.i = f2 - jC;
                        if (Math.abs(fFloatValue) >= 1.0E-4f) {
                            long j = jB + jC;
                            long jF = l1e0.f(j, xk80Var.h, xk80Var.g);
                            ?? r0 = j != jF;
                            long j2 = jF - jB;
                            float f3 = j2;
                            xk80Var.j = f3;
                            if (Math.abs(j2) != 0) {
                                ((hgk0) xk80Var.F).setValue(Boolean.valueOf(f3 > 0.0f));
                                ((hgk0) xk80Var.G).setValue(Boolean.valueOf(f3 < 0.0f));
                            }
                            int i2 = (int) j2;
                            int i3 = -i2;
                            pk80 pk80VarG = ((pk80) ((hgk0) xk80Var.m).getValue()).g(i3);
                            if (pk80VarG == null || (pk80Var = xk80Var.b) == null) {
                                pk80Var2 = pk80VarG;
                            } else {
                                pk80 pk80VarG2 = pk80Var.g(i3);
                                if (pk80VarG2 != null) {
                                    xk80Var.b = pk80VarG2;
                                    pk80Var2 = pk80VarG;
                                }
                            }
                            if (pk80Var2 != null) {
                                xk80Var.h(pk80Var2, xk80Var.f41020a, true);
                                m8x.Z(xk80Var.B);
                            } else {
                                qaj qajVar = xk80Var.d;
                                xk80 xk80Var2 = (xk80) qajVar.c;
                                agk0 agk0Var = (agk0) qajVar.e;
                                agk0Var.m(agk0Var.l() + (xk80Var2.p() != 0 ? i2 / xk80Var2.p() : 0.0f));
                                e7z e7zVar = (e7z) ((hgk0) xk80Var.y).getValue();
                                if (e7zVar != null) {
                                    e7zVar.l();
                                }
                            }
                            if (r0 != false) {
                                ValueOf = Long.valueOf(j2);
                            }
                            fFloatValue = ValueOf.floatValue();
                        }
                        return Float.valueOf(fFloatValue);
                    default:
                        rbz rbzVar = (rbz) obj;
                        rfk0 rfk0VarJ = vdx.J();
                        Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
                        rfk0 rfk0VarW = vdx.W(rfk0VarJ);
                        try {
                            rbzVar.a(xk80Var.e);
                            return Unit.f46060a;
                        } finally {
                            vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                        }
                }
            }
        });
        final byte b2 = 1;
        this.l = true;
        this.m = androidx.compose.runtime.e.d(zk80.b, m2a.v);
        this.n = zk80.f44518a;
        this.p = new gy40();
        this.q = androidx.compose.runtime.e.b(-1);
        this.r = androidx.compose.runtime.e.b(i);
        rek0 rek0Var = rek0.c;
        s39 s39Var = new s39(this, (byte) 26);
        nvu nvuVar = jgk0.f16485a;
        this.s = new zbk(s39Var, rek0Var);
        this.t = new zbk(new s39(this, (byte) 27), rek0Var);
        tbz tbzVar = new tbz(new Function1(this) { // from class: a.uk80
            public final /* synthetic */ xk80 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Long] */
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
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                pk80 pk80Var;
                byte b3 = b2;
                pk80 pk80Var2 = null;
                xk80 xk80Var = this.b;
                switch (b3) {
                    case 0:
                        ?? ValueOf = (Float) obj;
                        float fFloatValue = ValueOf.floatValue();
                        long jB = k7x.B(xk80Var);
                        float f2 = xk80Var.i + fFloatValue;
                        long jC = si30.c(f2);
                        xk80Var.i = f2 - jC;
                        if (Math.abs(fFloatValue) >= 1.0E-4f) {
                            long j = jB + jC;
                            long jF = l1e0.f(j, xk80Var.h, xk80Var.g);
                            ?? r0 = j != jF;
                            long j2 = jF - jB;
                            float f3 = j2;
                            xk80Var.j = f3;
                            if (Math.abs(j2) != 0) {
                                ((hgk0) xk80Var.F).setValue(Boolean.valueOf(f3 > 0.0f));
                                ((hgk0) xk80Var.G).setValue(Boolean.valueOf(f3 < 0.0f));
                            }
                            int i2 = (int) j2;
                            int i3 = -i2;
                            pk80 pk80VarG = ((pk80) ((hgk0) xk80Var.m).getValue()).g(i3);
                            if (pk80VarG == null || (pk80Var = xk80Var.b) == null) {
                                pk80Var2 = pk80VarG;
                            } else {
                                pk80 pk80VarG2 = pk80Var.g(i3);
                                if (pk80VarG2 != null) {
                                    xk80Var.b = pk80VarG2;
                                    pk80Var2 = pk80VarG;
                                }
                            }
                            if (pk80Var2 != null) {
                                xk80Var.h(pk80Var2, xk80Var.f41020a, true);
                                m8x.Z(xk80Var.B);
                            } else {
                                qaj qajVar = xk80Var.d;
                                xk80 xk80Var2 = (xk80) qajVar.c;
                                agk0 agk0Var = (agk0) qajVar.e;
                                agk0Var.m(agk0Var.l() + (xk80Var2.p() != 0 ? i2 / xk80Var2.p() : 0.0f));
                                e7z e7zVar = (e7z) ((hgk0) xk80Var.y).getValue();
                                if (e7zVar != null) {
                                    e7zVar.l();
                                }
                            }
                            if (r0 != false) {
                                ValueOf = Long.valueOf(j2);
                            }
                            fFloatValue = ValueOf.floatValue();
                        }
                        return Float.valueOf(fFloatValue);
                    default:
                        rbz rbzVar = (rbz) obj;
                        rfk0 rfk0VarJ = vdx.J();
                        Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
                        rfk0 rfk0VarW = vdx.W(rfk0VarJ);
                        try {
                            rbzVar.a(xk80Var.e);
                            return Unit.f46060a;
                        } finally {
                            vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                        }
                }
            }
        });
        this.u = tbzVar;
        this.v = new sj80(new o470(this), tbzVar, new s39(this, (byte) 28));
        this.w = new hru((byte) 25);
        this.x = new la5();
        this.y = androidx.compose.runtime.e.e(null);
        this.z = new a9z(this, (byte) 3);
        r4e.b(0, 0, 0, 0, 15);
        this.A = new qbz();
        this.B = m8x.J();
        this.C = m8x.J();
        Boolean bool = Boolean.FALSE;
        this.D = androidx.compose.runtime.e.e(bool);
        this.E = androidx.compose.runtime.e.e(bool);
        this.F = androidx.compose.runtime.e.e(bool);
        this.G = androidx.compose.runtime.e.e(bool);
    }

    public static /* synthetic */ Object g(xk80 xk80Var, int i, uts0 uts0Var, yje yjeVar, int i2) {
        j73 j73VarG0 = uts0Var;
        if ((i2 & 4) != 0) {
            j73VarG0 = ro4.g0(0.0f, 0.0f, null, 7);
        }
        return xk80Var.f(i, j73VarG0, yjeVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r9.b(r7, r8, r0) == r1) goto L24;
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object u(a.xk80 r6, a.c050 r7, kotlin.jvm.functions.Function2 r8, a.yje r9) {
        /*
            boolean r0 = r9 instanceof a.wk80
            if (r0 == 0) goto L13
            r0 = r9
            a.wk80 r0 = (a.wk80) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            a.wk80 r0 = new a.wk80
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.l
            a.wne r1 = a.wne.f39444a
            int r2 = r0.n
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            a.xk80 r6 = r0.i
            a.z1x.P(r9)
            goto L77
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L33:
            a.bnn0 r6 = r0.k
            r8 = r6
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            a.c050 r7 = r0.j
            a.xk80 r6 = r0.i
            a.z1x.P(r9)
            goto L55
        L40:
            a.z1x.P(r9)
            r0.i = r6
            r0.j = r7
            r9 = r8
            a.bnn0 r9 = (a.bnn0) r9
            r0.k = r9
            r0.n = r5
            java.lang.Object r9 = r6.i(r0)
            if (r9 != r1) goto L55
            goto L76
        L55:
            a.ywj r9 = r6.k
            boolean r9 = r9.a()
            if (r9 != 0) goto L66
            int r9 = r6.k()
            a.cgk0 r2 = r6.r
            r2.m(r9)
        L66:
            a.ywj r9 = r6.k
            r0.i = r6
            r0.j = r3
            r0.k = r3
            r0.n = r4
            java.lang.Object r7 = r9.b(r7, r8, r0)
            if (r7 != r1) goto L77
        L76:
            return r1
        L77:
            r7 = -1
            a.cgk0 r6 = r6.q
            r6.m(r7)
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xk80.u(a.xk80, a.c050, kotlin.jvm.functions.Function2, a.yje):java.lang.Object");
    }

    @Override // a.bch0
    public final boolean a() {
        return this.k.a();
    }

    @Override // a.bch0
    public final Object b(c050 c050Var, Function2 function2, yje yjeVar) {
        return u(this, c050Var, function2, yjeVar);
    }

    @Override // a.bch0
    public final boolean c() {
        return ((Boolean) ((hgk0) this.E).getValue()).booleanValue();
    }

    @Override // a.bch0
    public final boolean d() {
        return ((Boolean) ((hgk0) this.D).getValue()).booleanValue();
    }

    @Override // a.bch0
    public final float e(float f) {
        return this.k.e(f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        if (b(a.c050.f3507a, r6, r0) == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r13, a.j73 r14, a.yje r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof a.vk80
            if (r0 == 0) goto L13
            r0 = r15
            a.vk80 r0 = (a.vk80) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            a.vk80 r0 = new a.vk80
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.m
            r3 = 0
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3b
            if (r2 == r6) goto L32
            if (r2 != r5) goto L2c
            a.z1x.P(r15)
            goto L82
        L2c:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r12)
            return r3
        L32:
            int r13 = r0.i
            a.j73 r14 = r0.j
            a.z1x.P(r15)
        L39:
            r10 = r14
            goto L63
        L3b:
            a.z1x.P(r15)
            int r15 = r12.k()
            if (r13 != r15) goto L4d
            float r15 = r12.l()
            int r15 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r15 != 0) goto L4d
            goto L53
        L4d:
            int r15 = r12.n()
            if (r15 != 0) goto L56
        L53:
            kotlin.Unit r12 = kotlin.Unit.f46060a
            return r12
        L56:
            r0.j = r14
            r0.i = r13
            r0.m = r6
            java.lang.Object r15 = r12.i(r0)
            if (r15 != r1) goto L39
            goto L81
        L63:
            int r8 = r12.j(r13)
            int r13 = r12.p()
            float r13 = (float) r13
            float r9 = r4 * r13
            a.ekg r6 = new a.ekg
            r11 = 0
            r7 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            r0.j = r3
            r0.m = r5
            a.c050 r12 = a.c050.f3507a
            java.lang.Object r12 = r7.b(r12, r6, r0)
            if (r12 != r1) goto L82
        L81:
            return r1
        L82:
            kotlin.Unit r12 = kotlin.Unit.f46060a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xk80.f(int, a.j73, a.yje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0118 A[Catch: all -> 0x012d, TryCatch #0 {all -> 0x012d, blocks: (B:46:0x00c6, B:49:0x00cf, B:52:0x00dc, B:54:0x00e8, B:62:0x011e, B:60:0x0118, B:57:0x0100), top: B:78:0x00c6 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void h(pk80 pk80Var, boolean z, boolean z2) {
        List list = pk80Var.f27124a;
        int i = pk80Var.l;
        wj30 wj30Var = pk80Var.i;
        wj30 wj30Var2 = pk80Var.j;
        float f = pk80Var.k;
        this.u.e = list.size();
        int i2 = pk80Var.b;
        this.o = pk80Var.c + i2;
        if (!z && this.f41020a) {
            this.b = pk80Var;
            return;
        }
        boolean z3 = true;
        if (z) {
            this.f41020a = true;
        }
        sj80 sj80Var = this.v;
        boolean z4 = this.l;
        qaj qajVar = this.d;
        if (z2) {
            ((agk0) qajVar.e).m(f);
        } else {
            qajVar.getClass();
            qajVar.b = wj30Var2 != null ? wj30Var2.d : null;
            if (qajVar.f28396a || !list.isEmpty()) {
                qajVar.f28396a = true;
                int i3 = wj30Var2 != null ? wj30Var2.f39244a : 0;
                ((cgk0) qajVar.d).m(i3);
                ((lbz) qajVar.f).b(i3);
                ((agk0) qajVar.e).m(f);
            }
            if (z4) {
                nvu nvuVar = sj80Var.q;
                nvuVar.c = pk80Var;
                nvuVar.d = sj80Var.p;
                sj80Var.i(nvuVar);
            }
        }
        ((hgk0) this.m).setValue(pk80Var);
        ((hgk0) this.D).setValue(Boolean.valueOf(pk80Var.m));
        if ((wj30Var != null ? wj30Var.f39244a : 0) == 0 && i == 0) {
            z3 = false;
        }
        ((hgk0) this.E).setValue(Boolean.valueOf(z3));
        if (wj30Var != null) {
            this.e = wj30Var.f39244a;
        }
        this.f = i;
        rfk0 rfk0VarJ = vdx.J();
        Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
        rfk0 rfk0VarW = vdx.W(rfk0VarJ);
        if (z4) {
            try {
                if (pk80Var.h < n() && Math.abs(this.j) > 0.5f) {
                    float f2 = this.j;
                    if (m().e == ma80.f21447a) {
                        if (Math.signum(f2) != Math.signum(-Float.intBitsToFloat((int) (s() & 4294967295L)))) {
                            if (t()) {
                            }
                        }
                    } else if (Math.signum(f2) != Math.signum(-Float.intBitsToFloat((int) (s() >> 32)))) {
                        if (t()) {
                        }
                    }
                    float f3 = this.j;
                    nvu nvuVar2 = sj80Var.q;
                    nvuVar2.c = pk80Var;
                    nvuVar2.d = sj80Var.p;
                    sj80Var.h(nvuVar2, -f3);
                }
            } catch (Throwable th) {
                vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                throw th;
            }
        }
        vdx.Y(rfk0VarJ, rfk0VarW, function1E);
        this.g = zk80.a(pk80Var, n());
        n();
        int iH = (int) (pk80Var.e == ma80.b ? pk80Var.h() >> 32 : pk80Var.h() & 4294967295L);
        long jD = l1e0.d(pk80Var.n.a(iH, i2, -pk80Var.f, pk80Var.d), 0, iH);
        long j = this.g;
        if (jD > j) {
            jD = j;
        }
        this.h = jD;
    }

    public final Object i(zje zjeVar) {
        if (((hgk0) this.m).getValue() != zk80.b) {
            return Unit.f46060a;
        }
        Object objI = this.x.i(zjeVar);
        return objI == wne.f39444a ? objI : Unit.f46060a;
    }

    public final int j(int i) {
        if (n() > 0) {
            return l1e0.d(i, 0, n() - 1);
        }
        return 0;
    }

    public final int k() {
        return ((cgk0) this.d.d).l();
    }

    public final float l() {
        return ((agk0) this.d.e).l();
    }

    public final pk80 m() {
        return (pk80) ((hgk0) this.m).getValue();
    }

    public abstract int n();

    public final int o() {
        return ((pk80) ((hgk0) this.m).getValue()).b;
    }

    public final int p() {
        return ((pk80) ((hgk0) this.m).getValue()).c + o();
    }

    public final int q() {
        return ((Number) this.s.getValue()).intValue();
    }

    public final int r() {
        return ((Number) this.t.getValue()).intValue();
    }

    public final long s() {
        return ((ne60) ((hgk0) this.c).getValue()).f23370a;
    }

    public final boolean t() {
        return ((int) Float.intBitsToFloat((int) (s() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (s() & 4294967295L))) == 0;
    }

    public final Object v(int i, float f, yje yjeVar) {
        Object objB = b(c050.f3507a, new c4a(this, f, i, null, (byte) 1), yjeVar);
        return objB == wne.f39444a ? objB : Unit.f46060a;
    }

    public final void w(float f, int i, boolean z) {
        qaj qajVar = this.d;
        cgk0 cgk0Var = (cgk0) qajVar.d;
        agk0 agk0Var = (agk0) qajVar.e;
        if (cgk0Var.l() != i || agk0Var.l() != f) {
            this.v.k();
        }
        ((cgk0) qajVar.d).m(i);
        ((lbz) qajVar.f).b(i);
        agk0Var.m(f);
        qajVar.b = null;
        if (!z) {
            m8x.Z(this.C);
            return;
        }
        e7z e7zVar = (e7z) ((hgk0) this.y).getValue();
        if (e7zVar != null) {
            e7zVar.l();
        }
    }
}

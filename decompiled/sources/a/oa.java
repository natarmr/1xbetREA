package a;

import android.content.Context;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.platform.app.ApplicationLoader;

/* JADX INFO: loaded from: classes3.dex */
public final class oa extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa(jm8 jm8Var, List list, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 27;
        this.l = jm8Var;
        this.k = list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        if (a.qjj.d0(r3, r6, r14) == r2) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object G(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.l
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r14.k
            a.l94 r1 = (a.l94) r1
            a.wne r2 = a.wne.f39444a
            byte r3 = r14.j
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L23
            if (r3 == r6) goto L1f
            if (r3 != r5) goto L19
            a.z1x.P(r15)
            goto L6c
        L19:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r14)
            return r4
        L1f:
            a.z1x.P(r15)
            goto L54
        L23:
            a.z1x.P(r15)
            int r15 = a.l94.y
            a.ocj r15 = r1.i
            a.p7m0 r15 = r15.f25029a
        L2c:
            java.lang.Object r3 = r15.getValue()
            r3.getClass()
            r7 = r3
            a.d94 r7 = (a.d94) r7
            r12 = 1
            r13 = 15
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            a.d94 r7 = a.d94.a(r7, r8, r9, r10, r11, r12, r13)
            boolean r3 = r15.m(r3, r7)
            if (r3 == 0) goto L2c
            a.jof0 r15 = r1.p
            r14.j = r6
            a.z220 r15 = r15.f16855a
            java.lang.Object r15 = r15.K(r0, r14)
            if (r15 != r2) goto L54
            goto L6b
        L54:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            a.mne r3 = r1.t
            a.vs10 r3 = r3.c
            a.y32 r6 = new a.y32
            r6.<init>(r15, r1, r0, r4)
            r14.j = r5
            java.lang.Object r14 = a.qjj.d0(r3, r6, r14)
            if (r14 != r2) goto L6c
        L6b:
            return r2
        L6c:
            int r14 = a.l94.y
            r1.N()
            kotlin.Unit r14 = kotlin.Unit.f46060a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: a.oa.G(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (r0.Q(r7) == r2) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object H(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.l
            a.fh4 r0 = (a.fh4) r0
            java.lang.Object r1 = r7.k
            a.mm4 r1 = (a.mm4) r1
            a.wne r2 = a.wne.f39444a
            byte r3 = r7.j
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L23
            if (r3 == r6) goto L1f
            if (r3 != r5) goto L19
            a.z1x.P(r8)
            goto L73
        L19:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r4
        L1f:
            a.z1x.P(r8)
            goto L38
        L23:
            a.z1x.P(r8)
            a.im4 r8 = r0.p
            r7.k = r1
            r7.j = r6
            r8.getClass()
            a.jl4 r3 = a.jl4.f16698a
            java.lang.Object r8 = r8.a(r3, r7)
            if (r8 != r2) goto L38
            goto L4a
        L38:
            if (r1 == 0) goto L76
            boolean r8 = r1 instanceof a.lm4
            if (r8 == 0) goto L4b
            r7.k = r4
            r7.j = r5
            int r8 = a.fh4.c0
            java.lang.Object r7 = r0.Q(r7)
            if (r7 != r2) goto L73
        L4a:
            return r2
        L4b:
            boolean r7 = r1 instanceof a.km4
            if (r7 == 0) goto L5b
            int r7 = a.fh4.c0
            a.rg4 r7 = new a.rg4
            r8 = 5
            r7.<init>(r0, r8)
            r0.S(r7)
            goto L73
        L5b:
            boolean r7 = r1 instanceof a.jm4
            if (r7 == 0) goto L76
            org.xplatform.login.core.presentation.model.AuthDataErrorModel r7 = new org.xplatform.login.core.presentation.model.AuthDataErrorModel
            a.jm4 r1 = (a.jm4) r1
            java.lang.Throwable r8 = r1.f16747a
            a.uu4 r1 = r1.b
            org.xplatform.login.core.presentation.model.AuthDataModel r1 = a.sc4.a(r1)
            r7.<init>(r8, r1)
            int r8 = a.fh4.c0
            r0.P(r7)
        L73:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        L76:
            a.t9f.b()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a.oa.H(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0418, code lost:
    
        if (kotlin.Unit.f46060a == r8) goto L104;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object I(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 1058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.oa.I(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        if (r0 == r9) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object J(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.oa.J(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008f A[PHI: r4
  0x008f: PHI (r4v16 java.lang.Object) = (r4v11 java.lang.Object), (r4v23 java.lang.Object) binds: [B:24:0x008c, B:10:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009b, code lost:
    
        if (r0 == r3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object K(java.lang.Object r17) throws a.g2 {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.oa.K(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ee, code lost:
    
        if (r0 == r2) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object L(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.oa.L(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r0.P(r6, false, r5) == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object M(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.l
            a.jm8 r0 = (a.jm8) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r5.j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1f
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L14
            a.z1x.P(r6)
            goto L48
        L14:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L1b:
            a.z1x.P(r6)
            goto L31
        L1f:
            a.z1x.P(r6)
            a.yoc r6 = r0.w
            java.lang.Object r2 = r5.k
            java.util.List r2 = (java.util.List) r2
            r5.j = r4
            java.lang.Object r6 = r6.b(r2, r5)
            if (r6 != r1) goto L31
            goto L47
        L31:
            a.bby r6 = r0.S
            a.v3c.N(r6)
            java.lang.Object r6 = r0.D()
            a.kl8 r6 = (a.kl8) r6
            a.je8 r6 = r6.d
            r5.j = r3
            r2 = 0
            java.lang.Object r5 = r0.P(r6, r2, r5)
            if (r5 != r1) goto L48
        L47:
            return r1
        L48:
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.oa.M(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0083  */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if (r0 == r3) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object Q(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.oa.Q(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x01ba, code lost:
    
        if (r1.c(r5, r18) == r2) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01c5, code lost:
    
        if (r1.w(r5, r18) == r2) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01c7, code lost:
    
        return r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v19, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Iterable] */
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
    private final java.lang.Object l(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.oa.l(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a1, code lost:
    
        if (r2.c(r10, r9) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.l
            a.fk2 r0 = (a.fk2) r0
            java.lang.Object r1 = r9.k
            a.vne r1 = (a.vne) r1
            a.wne r1 = a.wne.f39444a
            byte r2 = r9.j
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L26
            if (r2 == r4) goto L20
            if (r2 != r3) goto L1a
            a.z1x.P(r10)
            goto La4
        L1a:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            return r5
        L20:
            a.z1x.P(r10)     // Catch: java.lang.Throwable -> L24
            goto L38
        L24:
            r10 = move-exception
            goto L3d
        L26:
            a.z1x.P(r10)
            a.e0g0 r10 = a.j0g0.b     // Catch: java.lang.Throwable -> L24
            a.yzn0 r10 = r0.A     // Catch: java.lang.Throwable -> L24
            r9.k = r5     // Catch: java.lang.Throwable -> L24
            r9.j = r4     // Catch: java.lang.Throwable -> L24
            java.lang.Object r10 = r10.l(r9)     // Catch: java.lang.Throwable -> L24
            if (r10 != r1) goto L38
            goto La3
        L38:
            kotlin.Unit r10 = kotlin.Unit.f46060a     // Catch: java.lang.Throwable -> L24
            a.e0g0 r2 = a.j0g0.b     // Catch: java.lang.Throwable -> L24
            goto L45
        L3d:
            a.e0g0 r2 = a.j0g0.b
            a.g0g0 r2 = new a.g0g0
            r2.<init>(r10)
            r10 = r2
        L45:
            java.lang.Throwable r2 = a.j0g0.a(r10)
            r6 = 0
            if (r2 != 0) goto L66
            kotlin.Unit r10 = (kotlin.Unit) r10
            int r10 = a.fk2.K
            a.z8u r10 = r0.B
            a.a1t r10 = r10.a()
            a.c00 r2 = new a.c00
            r7 = 5
            r2.<init>(r10, r0, r7)
            a.eh2 r10 = new a.eh2
            r10.<init>(r0, r5, r3)
            a.utb r10 = a.aoq.c(r2, r10)
            goto L7c
        L66:
            int r10 = a.fk2.K
            a.nvu r10 = r0.v
            java.lang.Object r7 = r0.D()
            a.pj2 r7 = (a.pj2) r7
            boolean r7 = r7.g
            a.utb r10 = r10.G(r7, r4)
            a.zj2 r7 = new a.zj2
            r7.<init>(r10, r0, r2, r6)
            r10 = r7
        L7c:
            a.wa r2 = new a.wa
            r7 = 7
            r2.<init>(r0, r5, r7)
            a.fnq r7 = new a.fnq
            r8 = 4
            r7.<init>(r10, r2, r8)
            a.ck2 r10 = new a.ck2
            r10.<init>(r0, r5, r6)
            a.dnq r2 = new a.dnq
            r2.<init>(r7, r10, r4)
            a.mn1 r10 = new a.mn1
            r4 = 14
            r10.<init>(r0, r4)
            r9.k = r5
            r9.j = r3
            java.lang.Object r9 = r2.c(r10, r9)
            if (r9 != r1) goto La4
        La3:
            return r1
        La4:
            kotlin.Unit r9 = kotlin.Unit.f46060a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.oa.m(java.lang.Object):java.lang.Object");
    }

    private final Object o(Object obj) throws Throwable {
        wne wneVar = wne.f39444a;
        byte b = this.j;
        if (b == 0) {
            z1x.P(obj);
            sy2 sy2Var = new sy2((byte) 2);
            this.j = (byte) 1;
            if (s0x.k0(sy2Var, this) == wneVar) {
                return wneVar;
            }
        } else {
            if (b != 1) {
                if (b != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                csj.b();
                return null;
            }
            z1x.P(obj);
        }
        mz40 mz40VarI = ((e03) this.k).i();
        if (mz40VarI == null) {
            return Unit.f46060a;
        }
        mn1 mn1Var = new mn1((xex) this.l, (byte) 17);
        this.j = (byte) 2;
        qoj0.o((qoj0) mz40VarI, mn1Var, this);
        return wneVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
    
        if (r0.f(r15, r14) == r2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e9, code lost:
    
        if (r0.f(r1, r14) == r2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00eb, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.oa.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (r0.z(r2, r9) == r1) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.l
            a.kq3 r0 = (a.kq3) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r9.j
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L2a
            if (r2 == r6) goto L26
            if (r2 == r5) goto L1e
            if (r2 != r4) goto L18
            a.z1x.P(r10)
            goto L72
        L18:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            return r3
        L1e:
            java.lang.Object r2 = r9.k
            a.dr3 r2 = (a.dr3) r2
            a.z1x.P(r10)
            goto L67
        L26:
            a.z1x.P(r10)
            goto L49
        L2a:
            a.z1x.P(r10)
            r0.y()
            a.iqi r10 = r0.k
            r9.j = r6
            java.lang.Object r2 = r10.c
            a.qq3 r2 = (a.qq3) r2
            java.lang.Object r10 = r10.b
            a.y5s r10 = (a.y5s) r10
            a.s470 r10 = r10.f42064a
            long r6 = r10.a()
            java.lang.Object r10 = r2.b(r6, r9)
            if (r10 != r1) goto L49
            goto L71
        L49:
            r2 = r10
            a.dr3 r2 = (a.dr3) r2
            a.qni0 r10 = r0.l
            double r6 = r2.c
            r10.a(r6)
            a.fq r10 = r0.h
            a.oy5 r6 = new a.oy5
            long r7 = r2.f6541a
            r6.<init>(r7)
            r9.k = r2
            r9.j = r5
            java.lang.Object r10 = r10.f(r6, r9)
            if (r10 != r1) goto L67
            goto L71
        L67:
            r9.k = r3
            r9.j = r4
            java.lang.Object r9 = r0.z(r2, r9)
            if (r9 != r1) goto L72
        L71:
            return r1
        L72:
            kotlin.Unit r9 = kotlin.Unit.f46060a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.oa.s(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
    
        if (r11.B((a.dr3) r0, r17) == r12) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object t(java.lang.Object r18) {
        /*
            r17 = this;
            r10 = r17
            java.lang.Object r0 = r10.l
            r11 = r0
            a.kq3 r11 = (a.kq3) r11
            a.wne r12 = a.wne.f39444a
            byte r0 = r10.j
            r13 = 0
            r14 = 2
            r1 = 1
            if (r0 == 0) goto L2a
            if (r0 == r1) goto L1f
            if (r0 != r14) goto L19
            a.z1x.P(r18)
            goto L9a
        L19:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            return r13
        L1f:
            java.lang.Object r0 = r10.k
            r11 = r0
            a.kq3 r11 = (a.kq3) r11
            a.z1x.P(r18)
            r0 = r18
            goto L8d
        L2a:
            a.z1x.P(r18)
            a.p7m0 r0 = r11.x
            r0.getClass()
            a.yq3 r2 = a.yq3.f43056a
            r0.o(r13, r2)
            a.gr00 r0 = r11.i
            r10.k = r11
            r10.j = r1
            java.lang.Object r1 = r0.d
            a.ztt r1 = (a.ztt) r1
            a.csr r3 = r1.a()
            java.lang.Object r1 = r0.f11760a
            a.mp3 r1 = (a.mp3) r1
            java.lang.Object r2 = r0.c
            a.gmt r2 = (a.gmt) r2
            a.ql5 r4 = r2.a()
            if (r4 == 0) goto La3
            long r4 = r4.f28916a
            a.ql5 r2 = r2.a()
            if (r2 == 0) goto L9d
            long r6 = r2.f28916a
            a.bsr r2 = r3.f4905a
            a.esr r2 = r2.f3145a
            boolean r2 = r2.a()
            if (r2 == 0) goto L6a
            r8 = 0
            goto L72
        L6a:
            java.lang.Object r2 = r0.b
            a.itt r2 = (a.itt) r2
            double r8 = r2.a()
        L72:
            java.lang.Object r0 = r0.e
            a.jcu r0 = (a.jcu) r0
            a.aws r0 = r0.f16295a
            a.yvs r0 = r0.f1590a
            a.s470 r0 = r0.f43335a
            long r15 = r0.a()
            a.qq3 r0 = r1.f22158a
            r1 = r4
            r4 = r6
            r6 = r8
            r8 = r15
            java.lang.Object r0 = r0.a(r1, r3, r4, r6, r8, r10)
            if (r0 != r12) goto L8d
            goto L99
        L8d:
            a.dr3 r0 = (a.dr3) r0
            r10.k = r13
            r10.j = r14
            java.lang.Object r0 = r11.B(r0, r10)
            if (r0 != r12) goto L9a
        L99:
            return r12
        L9a:
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        L9d:
            a.ss3 r0 = new a.ss3
            r0.<init>()
            throw r0
        La3:
            a.ss3 r0 = new a.ss3
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.oa.t(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a1, code lost:
    
        if (kotlin.Unit.f46060a == r2) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object x(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.oa.x(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0098, code lost:
    
        if (r2.B(r24) == r1) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v7, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Iterable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object y(java.lang.Object r25) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 819
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.oa.y(java.lang.Object):java.lang.Object");
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                return new oa(obj2, yjeVar, (byte) 0);
            case 1:
                return new oa(obj2, yjeVar, (byte) 1);
            case 2:
                return new oa(obj2, yjeVar, (byte) 2);
            case 3:
                return new oa(obj2, yjeVar, (byte) 3);
            case 4:
                return new oa(obj2, yjeVar, (byte) 4);
            case 5:
                oa oaVar = new oa(obj2, yjeVar, (byte) 5);
                oaVar.k = obj;
                return oaVar;
            case 6:
                return new oa((nc0) this.k, (lr5) obj2, yjeVar, (byte) 6);
            case 7:
                return new oa(obj2, yjeVar, (byte) 7);
            case 8:
                return new oa(obj2, yjeVar, (byte) 8);
            case 9:
                return new oa((uv1) this.k, (gu1) obj2, yjeVar, (byte) 9);
            case 10:
                return new oa((wz1) this.k, (myr0) obj2, yjeVar, (byte) 10);
            case 11:
                return new oa((s72) this.k, (fql0) obj2, yjeVar, (byte) 11);
            case 12:
                oa oaVar2 = new oa(obj2, yjeVar, (byte) 12);
                oaVar2.k = obj;
                return oaVar2;
            case 13:
                oa oaVar3 = new oa(obj2, yjeVar, (byte) 13);
                oaVar3.k = obj;
                return oaVar3;
            case 14:
                return new oa((hv2) this.k, (qdl) obj2, yjeVar, (byte) 14);
            case 15:
                return new oa((e03) this.k, (xex) obj2, yjeVar, (byte) 15);
            case 16:
                oa oaVar4 = new oa(obj2, yjeVar, (byte) 16);
                oaVar4.k = obj;
                return oaVar4;
            case 17:
                return new oa(obj2, yjeVar, (byte) 17);
            case 18:
                return new oa(obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new oa((Context) this.k, (ApplicationLoader) obj2, yjeVar, (byte) 19);
            case 20:
                return new oa((ApplicationLoader) this.k, (ApplicationLoader) obj2, yjeVar, (byte) 20);
            case 21:
                return new oa((l94) this.k, (String) obj2, yjeVar, (byte) 21);
            case 22:
                oa oaVar5 = new oa(obj2, yjeVar, (byte) 22);
                oaVar5.k = obj;
                return oaVar5;
            case 23:
                oa oaVar6 = new oa(obj2, yjeVar, (byte) 23);
                oaVar6.k = obj;
                return oaVar6;
            case 24:
                return new oa((kd7) this.k, (String) obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new oa(obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new oa(obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new oa((jm8) obj2, (List) this.k, yjeVar);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new oa(obj2, yjeVar, (byte) 28);
            default:
                return new oa(obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((oa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((oa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((oa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((oa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((oa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((oa) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((oa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((oa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((oa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((oa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((oa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((oa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((oa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((oa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((oa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((oa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((oa) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((oa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((oa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((oa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((oa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((oa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((oa) create((mm4) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((oa) create((fd4) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((oa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((oa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((oa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((oa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((oa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((oa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:396:0x094d  */
    /* JADX WARN: Code duplicated, block: B:399:0x0957  */
    /* JADX WARN: Code duplicated, block: B:404:0x0966  */
    /* JADX WARN: Code duplicated, block: B:471:0x0ab1  */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0225, code lost:
    
        if (r4.c(r0, r40) == r2) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02fc, code lost:
    
        if (r2.a(r3, r40) == r13) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x034b, code lost:
    
        if (r0.S(r7, r40) == r13) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x05be, code lost:
    
        if (r0 == r4) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a4, code lost:
    
        if (r1 == r2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0691, code lost:
    
        if (r0.c(r2, r40) == r3) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x070b, code lost:
    
        if (r1 == r2) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0728, code lost:
    
        if (r1 == r2) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0791, code lost:
    
        if (r0.a(r3, r40) == r2) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x07a1, code lost:
    
        if (r0.a(r3, r40) == r2) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0807, code lost:
    
        if (r2.a(r4, r40) == r3) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x08c4, code lost:
    
        if (r2.f(a.my5.f22588a, r40) == r3) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0938, code lost:
    
        if (a.qcc.P(r10, r40) == r3) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x0af6, code lost:
    
        if (r1 == r3) goto L479;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0b5c, code lost:
    
        if (r1 == r0) goto L496;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x0be8, code lost:
    
        if (((a.gmq) r3).c(r5, r40) == r0) goto L522;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r41) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 3118
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.oa.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oa(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oa(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
    }
}

package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class fhq extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fhq(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007e, code lost:
    
        if (r1.y(r3, r21) == r4) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object G(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            java.lang.Object r1 = r0.l
            a.mn20 r1 = (a.mn20) r1
            a.mne r2 = r1.i
            java.lang.Object r3 = r0.k
            a.m97 r3 = (a.m97) r3
            a.wne r4 = a.wne.f39444a
            byte r5 = r0.j
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L27
            if (r5 == r7) goto L23
            if (r5 != r6) goto L1d
            a.z1x.P(r22)
            goto L81
        L1d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            return r8
        L23:
            a.z1x.P(r22)
            goto L3c
        L27:
            a.z1x.P(r22)
            a.vzg0 r5 = r1.y
            java.lang.String r9 = "BET_INFO_SAVE_STATE_KEY"
            r5.e(r9, r3)
            r0.k = r3
            r0.j = r7
            java.lang.Object r5 = r1.F(r3, r0)
            if (r5 != r4) goto L3c
            goto L80
        L3c:
            a.bvc r9 = a.jiu0.a(r1)
            a.r520 r10 = new a.r520
            r5 = 17
            r10.<init>(r5)
            a.dvj r12 = r2.b
            a.mq10 r13 = new a.mq10
            r5 = 7
            r13.<init>(r1, r3, r8, r5)
            r14 = 10
            r11 = 0
            a.sac.V(r9, r10, r11, r12, r13, r14)
            a.bvc r15 = a.jiu0.a(r1)
            a.r520 r5 = new a.r520
            r7 = 19
            r5.<init>(r7)
            a.dvj r2 = r2.b
            a.xr10 r7 = new a.xr10
            r9 = 8
            r7.<init>(r1, r3, r8, r9)
            r20 = 10
            r17 = 0
            r18 = r2
            r16 = r5
            r19 = r7
            a.sac.V(r15, r16, r17, r18, r19, r20)
            r0.k = r8
            r0.j = r6
            java.lang.Object r0 = r1.y(r3, r0)
            if (r0 != r4) goto L81
        L80:
            return r4
        L81:
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fhq.G(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (a.slb.Q(r0, r7, r6) == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object H(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.k
            a.kmq r0 = (a.kmq) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r6.j
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L1f
            if (r2 == r5) goto L1b
            if (r2 != r4) goto L15
            a.z1x.P(r7)
            goto L3e
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L1b:
            a.z1x.P(r7)
            goto L2d
        L1f:
            a.z1x.P(r7)
            r6.k = r0
            r6.j = r5
            java.lang.Object r7 = r0.a(r3, r6)
            if (r7 != r1) goto L2d
            goto L3d
        L2d:
            java.lang.Object r7 = r6.l
            a.ir30 r7 = (a.ir30) r7
            a.qoj0 r7 = r7.d
            r6.k = r3
            r6.j = r4
            java.lang.Object r6 = a.slb.Q(r0, r7, r6)
            if (r6 != r1) goto L3e
        L3d:
            return r1
        L3e:
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fhq.H(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003f A[Catch: all -> 0x001c, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0016, B:17:0x0035, B:19:0x003f, B:23:0x004e, B:14:0x0029), top: B:32:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x006f -> B:27:0x0070). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final java.lang.Object I(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.l
            r1 = r0
            a.iu40 r1 = (a.iu40) r1
            a.wne r0 = a.wne.f39444a
            byte r2 = r11.j
            r7 = 0
            r8 = 2
            r9 = 1
            if (r2 == 0) goto L2e
            if (r2 == r9) goto L25
            if (r2 != r8) goto L1f
            java.lang.Object r2 = r11.k
            a.vne r2 = (a.vne) r2
            a.z1x.P(r12)     // Catch: java.lang.Throwable -> L1c
            r6 = r11
            r12 = r2
            goto L70
        L1c:
            r0 = move-exception
            r11 = r0
            goto L77
        L1f:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r11)
            return r7
        L25:
            java.lang.Object r2 = r11.k
            a.vne r2 = (a.vne) r2
            a.z1x.P(r12)     // Catch: java.lang.Throwable -> L1c
            r10 = r2
            goto L4e
        L2e:
            a.z1x.P(r12)
            java.lang.Object r12 = r11.k
            a.vne r12 = (a.vne) r12
        L35:
            kotlin.coroutines.CoroutineContext r2 = r12.getCoroutineContext()     // Catch: java.lang.Throwable -> L1c
            boolean r2 = a.zvw.X(r2)     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L72
            a.q99 r2 = r1.g     // Catch: java.lang.Throwable -> L1c
            r11.k = r12     // Catch: java.lang.Throwable -> L1c
            r11.j = r9     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r2 = r2.g(r11)     // Catch: java.lang.Throwable -> L1c
            if (r2 != r0) goto L4c
            goto L6e
        L4c:
            r10 = r12
            r12 = r2
        L4e:
            r3 = r12
            a.eu40 r3 = (a.eu40) r3     // Catch: java.lang.Throwable -> L1c
            a.w6k r12 = r1.c     // Catch: java.lang.Throwable -> L1c
            r2 = 1086324736(0x40c00000, float:6.0)
            float r4 = r12.w0(r2)     // Catch: java.lang.Throwable -> L1c
            a.w6k r12 = r1.c     // Catch: java.lang.Throwable -> L1c
            r2 = 1065353216(0x3f800000, float:1.0)
            float r5 = r12.w0(r2)     // Catch: java.lang.Throwable -> L1c
            a.sch0 r2 = r1.f5538a     // Catch: java.lang.Throwable -> L1c
            r11.k = r10     // Catch: java.lang.Throwable -> L1c
            r11.j = r8     // Catch: java.lang.Throwable -> L1c
            r6 = r11
            java.lang.Object r11 = r1.d(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L1c
            if (r11 != r0) goto L6f
        L6e:
            return r0
        L6f:
            r12 = r10
        L70:
            r11 = r6
            goto L35
        L72:
            r1.h = r7
            kotlin.Unit r11 = kotlin.Unit.f46060a
            return r11
        L77:
            r1.h = r7
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fhq.I(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (r11 == r2) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object J(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.l
            a.d650 r0 = (a.d650) r0
            a.p7m0 r1 = r0.g1
            a.wne r2 = a.wne.f39444a
            byte r3 = r10.j
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L25
            if (r3 == r6) goto L1d
            if (r3 != r5) goto L17
            a.z1x.P(r11)
            goto L4f
        L17:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r10)
            return r4
        L1d:
            java.lang.Object r0 = r10.k
            a.ytt r0 = (a.ytt) r0
            a.z1x.P(r11)
            goto L3a
        L25:
            a.z1x.P(r11)
            a.ytt r11 = r0.j0
            a.pmi r0 = r0.l0
            r10.k = r11
            r10.j = r6
            java.io.Serializable r0 = r0.x(r10)
            if (r0 != r2) goto L37
            goto L4e
        L37:
            r9 = r0
            r0 = r11
            r11 = r9
        L3a:
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            r10.k = r4
            r10.j = r5
            a.oue0 r0 = r0.f43236a
            r7 = -1
            java.lang.Object r11 = r0.b(r11, r7, r10)
            if (r11 != r2) goto L4f
        L4e:
            return r2
        L4f:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r10 = r11.iterator()
        L55:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L67
            java.lang.Object r11 = r10.next()
            r0 = r11
            org.xplatform.registration.api.domain.models.BonusInfoModel r0 = (org.xplatform.registration.api.domain.models.BonusInfoModel) r0
            int r0 = r0.f46848a
            if (r0 != r6) goto L55
            r4 = r11
        L67:
            org.xplatform.registration.api.domain.models.BonusInfoModel r4 = (org.xplatform.registration.api.domain.models.BonusInfoModel) r4
        L69:
            java.lang.Object r10 = r1.getValue()
            r11 = r10
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r11 = r1.getValue()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = 10
            int r2 = a.r3d.q(r11, r2)
            r0.<init>(r2)
            java.util.Iterator r11 = r11.iterator()
        L85:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto Laf
            java.lang.Object r2 = r11.next()
            a.ef40 r2 = (a.ef40) r2
            boolean r3 = r2 instanceof a.ye40
            if (r3 == 0) goto Lab
            if (r4 == 0) goto La4
            a.qbj r2 = new a.qbj
            r3 = 0
            r2.<init>(r4, r3)
            a.ye40 r3 = new a.ye40
            r3.<init>(r2)
            r2 = r3
            goto Lab
        La4:
            a.ye40 r2 = new a.ye40
            a.nbj r3 = a.nbj.f23243a
            r2.<init>(r3)
        Lab:
            r0.add(r2)
            goto L85
        Laf:
            boolean r10 = r1.m(r10, r0)
            if (r10 == 0) goto L69
            kotlin.Unit r10 = kotlin.Unit.f46060a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fhq.J(java.lang.Object):java.lang.Object");
    }

    private final Object l(Object obj) {
        s77 s77Var;
        s77 s77Var2;
        naw nawVar = (naw) this.l;
        vzg0 vzg0Var = nawVar.c;
        wne wneVar = wne.f39444a;
        byte b = this.j;
        if (b == 0) {
            z1x.P(obj);
            if (nawVar.i0.d() != 0 && nawVar.y0 == 0) {
                this.j = (byte) 1;
                if (nawVar.N(this) != wneVar) {
                }
                return wneVar;
            }
            nawVar.E(s77Var);
            return Unit.f46060a;
        }
        if (b == 1) {
            z1x.P(obj);
        } else {
            if (b != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            s77Var2 = (s77) this.k;
            z1x.P(obj);
        }
        s77Var = s77Var2;
        nawVar.E(s77Var);
        return Unit.f46060a;
        s77Var = (s77) vzg0Var.a("TYPE_FILTER_KEY");
        if (s77Var == null) {
            s77Var = nawVar.D0;
        }
        List list = (List) vzg0Var.a("STATUS_FILTERS_KEY");
        if (list != null && !list.isEmpty()) {
            aau aauVar = nawVar.U;
            sys0 sys0Var = nawVar.d;
            this.k = s77Var;
            this.j = (byte) 2;
            if (aauVar.a(sys0Var, s77Var, list, this) != wneVar) {
                s77Var2 = s77Var;
                s77Var = s77Var2;
            }
            return wneVar;
        }
        nawVar.E(s77Var);
        return Unit.f46060a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d8, code lost:
    
        if (r1.w(r15, r14) == r3) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fhq.m(java.lang.Object):java.lang.Object");
    }

    private final Object o(Object obj) {
        f6y f6yVar;
        t6y t6yVar = (t6y) this.l;
        wne wneVar = wne.f39444a;
        byte b = this.j;
        if (b == 0) {
            z1x.P(obj);
            jru jruVar = t6yVar.b;
            this.j = (byte) 1;
            obj = jruVar.h(this);
            if (obj != wneVar) {
            }
            return wneVar;
        }
        if (b == 1) {
            z1x.P(obj);
        } else {
            if (b != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f6yVar = (f6y) this.k;
            z1x.P(obj);
        }
        q6y q6yVar = new q6y(f6yVar, ((xuf) obj).f);
        p7m0 p7m0Var = t6yVar.n;
        p7m0Var.getClass();
        p7m0Var.o(null, q6yVar);
        return Unit.f46060a;
        Pair pair = (Pair) obj;
        f6y f6yVar2 = (f6y) pair.f46059a;
        long jLongValue = ((Number) pair.b).longValue();
        m0u m0uVar = t6yVar.c;
        this.k = f6yVar2;
        this.j = (byte) 2;
        obj = m0uVar.f20973a.c(jLongValue, this);
        if (obj != wneVar) {
            f6yVar = f6yVar2;
            q6y q6yVar2 = new q6y(f6yVar, ((xuf) obj).f);
            p7m0 p7m0Var2 = t6yVar.n;
            p7m0Var2.getClass();
            p7m0Var2.o(null, q6yVar2);
            return Unit.f46060a;
        }
        return wneVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c9, code lost:
    
        if (r2.w(r7, r1, r19) == r6) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fhq.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
    
        if (r14.f(a.my5.f22588a, r13) == r1) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.l
            a.uj10 r0 = (a.uj10) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r14.j
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L20
            if (r2 == r5) goto L1b
            if (r2 != r4) goto L15
            a.z1x.P(r15)
            goto L80
        L15:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r14)
            return r3
        L1b:
            a.z1x.P(r15)
            r13 = r14
            goto L67
        L20:
            a.z1x.P(r15)
            a.mj10 r15 = a.mj10.f21872a
            a.bvc r6 = a.jiu0.a(r0)
            a.p610 r7 = new a.p610
            r2 = 10
            r7.<init>(r2)
            a.juy r10 = new a.juy
            r2 = 25
            r10.<init>(r0, r15, r3, r2)
            r11 = 14
            r8 = 0
            r9 = 0
            a.sac.V(r6, r7, r8, r9, r10, r11)
            a.vju r15 = r0.g
            java.lang.Object r2 = r14.k
            r12 = r2
            a.ej10 r12 = (a.ej10) r12
            r14.j = r5
            a.yj10 r6 = r15.f37548a
            a.gmt r2 = r15.d
            a.ql5 r2 = r2.a()
            if (r2 == 0) goto L83
            long r7 = r2.f28916a
            a.itt r2 = r15.c
            double r9 = r2.a()
            a.ztt r15 = r15.b
            a.csr r11 = r15.a()
            r13 = r14
            java.lang.Object r15 = r6.a(r7, r9, r11, r12, r13)
            if (r15 != r1) goto L67
            goto L7f
        L67:
            a.vj10 r15 = (a.vj10) r15
            r0.n = r15
            a.pj10 r14 = new a.pj10
            r14.<init>(r15)
            r0.y(r14)
            a.fq r14 = r0.b
            r13.j = r4
            a.my5 r15 = a.my5.f22588a
            java.lang.Object r14 = r14.f(r15, r13)
            if (r14 != r1) goto L80
        L7f:
            return r1
        L80:
            kotlin.Unit r14 = kotlin.Unit.f46060a
            return r14
        L83:
            a.ss3 r14 = new a.ss3
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fhq.s(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r1.a(r6, r5) == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object t(java.lang.Object r6) {
        /*
            r5 = this;
            a.wne r0 = a.wne.f39444a
            byte r1 = r5.j
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            a.z1x.P(r6)
            goto L46
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            return r2
        L17:
            java.lang.Object r1 = r5.k
            a.ccl r1 = (a.ccl) r1
            a.z1x.P(r6)
            goto L35
        L1f:
            a.z1x.P(r6)
            java.lang.Object r6 = r5.l
            a.w220 r6 = (a.w220) r6
            a.ccl r1 = r6.z
            a.pmi r6 = r6.g
            r5.k = r1
            r5.j = r4
            java.io.Serializable r6 = r6.x(r5)
            if (r6 != r0) goto L35
            goto L45
        L35:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r5.k = r2
            r5.j = r3
            java.lang.Object r5 = r1.a(r6, r5)
            if (r5 != r0) goto L46
        L45:
            return r0
        L46:
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fhq.t(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d8  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0095, code lost:
    
        if (r2 == r3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00da, code lost:
    
        if (r0 == r3) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object x(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fhq.x(java.lang.Object):java.lang.Object");
    }

    private final Object y(Object obj) {
        Object value;
        ql5 ql5Var;
        hnd0 hnd0Var;
        String str;
        Object value2;
        boolean z;
        ixo ixoVar;
        p3u0 p3u0Var;
        ixo ixoVar2;
        double d;
        qg20 qg20Var = (qg20) this.l;
        p7m0 p7m0Var = qg20Var.l1;
        wne wneVar = wne.f39444a;
        byte b = this.j;
        if (b == 0) {
            z1x.P(obj);
            gs gsVar = qg20Var.B;
            gsVar.getClass();
            if (q3d.j(q4f.h, q4f.m).contains(((ave) gsVar.f11805a.c).f1521a)) {
                qg20Var.d0();
            } else {
                if (qg20Var.D.a()) {
                    this.j = (byte) 1;
                    obj = qg20Var.G(this);
                    if (obj != wneVar) {
                    }
                    return wneVar;
                }
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, fxo.a((fxo) value, true, false, false, 15)));
            }
            return Unit.f46060a;
        }
        if (b == 1) {
            z1x.P(obj);
        } else {
            if (b != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ql5Var = (ql5) this.k;
            z1x.P(obj);
        }
        hnd0Var = (hnd0) obj;
        str = ql5Var.f;
        do {
            value2 = p7m0Var.getValue();
            z = ((fxo) value2).g;
            hnd0Var.getClass();
            double d2 = hnd0Var.b;
            str.getClass();
            int i = cy7.f5159a;
            pn40 pn40Var = pn40.f27267a;
            p3u0Var = p3u0.g;
            ixoVar = new ixo(cy7.e(pn40.d(d2, str, p3u0Var)), d2);
            double d3 = hnd0Var.c;
            ixoVar2 = new ixo(cy7.e(pn40.d(d3, str, p3u0Var)), d3);
            d = hnd0Var.d;
        } while (!p7m0Var.m(value2, new fxo(ixoVar, ixoVar2, new ixo(cy7.e(pn40.d(d, str, p3u0Var)), d), true, true, false, z, false)));
        return Unit.f46060a;
        ql5 ql5Var2 = (ql5) obj;
        lbu lbuVar = qg20Var.C;
        long j = ql5Var2.f28916a;
        this.k = ql5Var2;
        this.j = (byte) 2;
        Object objD = lbuVar.d(j, this);
        if (objD != wneVar) {
            obj = objD;
            ql5Var = ql5Var2;
            hnd0Var = (hnd0) obj;
            str = ql5Var.f;
            do {
                value2 = p7m0Var.getValue();
                z = ((fxo) value2).g;
                hnd0Var.getClass();
                double d4 = hnd0Var.b;
                str.getClass();
                int i2 = cy7.f5159a;
                pn40 pn40Var2 = pn40.f27267a;
                p3u0Var = p3u0.g;
                ixoVar = new ixo(cy7.e(pn40.d(d4, str, p3u0Var)), d4);
                double d5 = hnd0Var.c;
                ixoVar2 = new ixo(cy7.e(pn40.d(d5, str, p3u0Var)), d5);
                d = hnd0Var.d;
            } while (!p7m0Var.m(value2, new fxo(ixoVar, ixoVar2, new ixo(cy7.e(pn40.d(d, str, p3u0Var)), d), true, true, false, z, false)));
            return Unit.f46060a;
        }
        return wneVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                return new fhq((ghq) this.k, (vmi0) obj2, yjeVar, (byte) 0);
            case 1:
                fhq fhqVar = new fhq((ro30) obj2, yjeVar, (byte) 1);
                fhqVar.k = obj;
                return fhqVar;
            case 2:
                fhq fhqVar2 = new fhq((spr) obj2, yjeVar, (byte) 2);
                fhqVar2.k = obj;
                return fhqVar2;
            case 3:
                return new fhq((sbs) obj2, yjeVar, (byte) 3);
            case 4:
                return new fhq((zns) obj2, yjeVar, (byte) 4);
            case 5:
                return new fhq((yys) obj2, yjeVar, (byte) 5);
            case 6:
                fhq fhqVar3 = new fhq((c0t) obj2, yjeVar, (byte) 6);
                fhqVar3.k = obj;
                return fhqVar3;
            case 7:
                return new fhq((mkt) obj2, yjeVar, (byte) 7);
            case 8:
                fhq fhqVar4 = new fhq((h6i) obj2, yjeVar, (byte) 8);
                fhqVar4.k = obj;
                return fhqVar4;
            case 9:
                fhq fhqVar5 = new fhq((pwi) obj2, yjeVar, (byte) 9);
                fhqVar5.k = obj;
                return fhqVar5;
            case 10:
                return new fhq((nr) this.k, (Set) obj2, yjeVar, (byte) 10);
            case 11:
                fhq fhqVar6 = new fhq((List) obj2, yjeVar, (byte) 11);
                fhqVar6.k = obj;
                return fhqVar6;
            case 12:
                fhq fhqVar7 = new fhq((yhi) obj2, yjeVar, (byte) 12);
                fhqVar7.k = obj;
                return fhqVar7;
            case 13:
                return new fhq((a6u) obj2, yjeVar, (byte) 13);
            case 14:
                return new fhq((naw) this.k, (ql5) obj2, yjeVar, (byte) 14);
            case 15:
                return new fhq((naw) this.k, (vlq0) obj2, yjeVar, (byte) 15);
            case 16:
                return new fhq((naw) obj2, yjeVar, (byte) 16);
            case 17:
                fhq fhqVar8 = new fhq((dix) obj2, yjeVar, (byte) 17);
                fhqVar8.k = obj;
                return fhqVar8;
            case 18:
                return new fhq((t6y) obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new fhq((xm00) this.k, (String) obj2, yjeVar, (byte) 19);
            case 20:
                return new fhq((ej10) this.k, (uj10) obj2, yjeVar, (byte) 20);
            case 21:
                return new fhq((bo10) this.k, (bpi0) obj2, yjeVar, (byte) 21);
            case 22:
                return new fhq((w220) obj2, yjeVar, (byte) 22);
            case 23:
                return new fhq((w220) obj2, yjeVar, (byte) 23);
            case 24:
                return new fhq((qg20) obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                fhq fhqVar9 = new fhq((mn20) obj2, yjeVar, (byte) 25);
                fhqVar9.k = obj;
                return fhqVar9;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                fhq fhqVar10 = new fhq((ir30) obj2, yjeVar, (byte) 26);
                fhqVar10.k = obj;
                return fhqVar10;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                fhq fhqVar11 = new fhq((iu40) obj2, yjeVar, (byte) 27);
                fhqVar11.k = obj;
                return fhqVar11;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new fhq((d650) obj2, yjeVar, (byte) 28);
            default:
                fhq fhqVar12 = new fhq((v360) obj2, yjeVar, (byte) 29);
                fhqVar12.k = obj;
                return fhqVar12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.i) {
            case 0:
                return ((fhq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                ((fhq) create((hzb0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
                return wne.f39444a;
            case 2:
                return ((fhq) create((psr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((fhq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((fhq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((fhq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((fhq) create((ats) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((fhq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((fhq) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((fhq) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((fhq) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((fhq) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((fhq) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((fhq) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((fhq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((fhq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((fhq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((fhq) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((fhq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((fhq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((fhq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((fhq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((fhq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((fhq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((fhq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((fhq) create((m97) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((fhq) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((fhq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((fhq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((fhq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0172, code lost:
    
        if (a.qjj.d0(r3, r4, r47) == r2) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01be, code lost:
    
        if (a.qjj.d0(r3, r4, r47) == r2) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0240, code lost:
    
        if (r0 == r2) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x029b, code lost:
    
        if (r0.a((java.lang.String) r3, r47) == r2) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x02e7, code lost:
    
        if (r0.a(r6, r47) == r2) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x03e3, code lost:
    
        if (r2.a(r0, r47) == r3) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x048c, code lost:
    
        if (r0.a(r4, r47) == r2) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x04d8, code lost:
    
        if (kotlin.Unit.f46060a == r0) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        if (r0 == r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x05c4, code lost:
    
        if (r1 == r4) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
    
        if (r0 == r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        if (r7.c(r0, r47) == r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x07dd, code lost:
    
        if (r1 == r2) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x085d, code lost:
    
        if (r2.b(r0, r47) == r4) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x08d0, code lost:
    
        if (a.qcc.O(50, r47) == r4) goto L443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x08fe, code lost:
    
        if (a.qcc.O(50, r47) == r4) goto L443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0a34, code lost:
    
        if (r2.b(r47) == r3) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x010b, code lost:
    
        if (((a.bpi0) r6).a(true, r47) == r0) goto L71;
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x09bf: INVOKE (r7v2 ?? I:a.sxk), (r6v10 ?? I:java.lang.Object), (r3 I:java.lang.Object), (r10 I:a.yje), (r8 I:byte) DIRECT call: a.sxk.<init>(java.lang.Object, java.lang.Object, a.yje, byte):void A[MD:(java.lang.Object, java.lang.Object, a.yje, byte):void (m)] (LINE:2496), block:B:476:0x09a9 */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r48) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fhq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fhq(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
    }
}

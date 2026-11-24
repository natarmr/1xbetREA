package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class hr extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public byte j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hr(Object obj, Object obj2, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        if (a.qcc.P(r0, r19) == r8) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object G(java.lang.Object r20) throws java.lang.Throwable {
        /*
            r19 = this;
            r4 = r19
            java.lang.Object r0 = r4.l
            a.v85 r0 = (a.v85) r0
            java.lang.Object r1 = r4.k
            r6 = r1
            a.wli0 r6 = (a.wli0) r6
            a.ocj r7 = r6.i
            a.wne r8 = a.wne.f39444a
            byte r1 = r4.j
            r9 = 2
            r2 = 1
            if (r1 == 0) goto L28
            if (r1 == r2) goto L24
            if (r1 != r9) goto L1d
            a.z1x.P(r20)
            goto L84
        L1d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            r0 = 0
            return r0
        L24:
            a.z1x.P(r20)
            goto L71
        L28:
            a.z1x.P(r20)
            int r1 = a.wli0.x
            a.p7m0 r1 = r7.f25029a
        L2f:
            java.lang.Object r3 = r1.getValue()
            r3.getClass()
            r10 = r3
            a.sli0 r10 = (a.sli0) r10
            r17 = 0
            r18 = 253(0xfd, float:3.55E-43)
            r11 = 0
            r12 = 1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            a.sli0 r5 = a.sli0.a(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r3 = r1.m(r3, r5)
            if (r3 == 0) goto L2f
            a.csi0 r1 = r6.t
            long r10 = r0.f36965a
            java.lang.Object r3 = r6.D()
            a.sli0 r3 = (a.sli0) r3
            a.xrz r3 = r3.h
            java.lang.String r5 = r0.b
            r4.j = r2
            a.j400 r0 = r1.f4890a
            int r1 = r3.getId()
            r2 = r10
            java.lang.Object r0 = r0.c(r1, r2, r4, r5)
            if (r0 != r8) goto L6c
            goto L6e
        L6c:
            kotlin.Unit r0 = kotlin.Unit.f46060a
        L6e:
            if (r0 != r8) goto L71
            goto L83
        L71:
            a.uen r0 = a.wen.b
            r0 = 3500(0xdac, float:4.905E-42)
            a.bfn r1 = a.bfn.MILLISECONDS
            long r0 = a.ibc.v0(r0, r1)
            r4.j = r9
            java.lang.Object r0 = a.qcc.P(r0, r4)
            if (r0 != r8) goto L84
        L83:
            return r8
        L84:
            int r0 = a.wli0.x
            a.p7m0 r3 = r7.f25029a
        L88:
            java.lang.Object r0 = r3.getValue()
            r0.getClass()
            r7 = r0
            a.sli0 r7 = (a.sli0) r7
            r14 = 0
            r15 = 253(0xfd, float:3.55E-43)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            a.sli0 r1 = a.sli0.a(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = r3.m(r0, r1)
            if (r0 == 0) goto L88
            a.nli0 r0 = a.nli0.f23730a
            r6.G(r0)
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hr.G(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r2.E() == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (r7 == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object l(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.l
            a.d430 r0 = (a.d430) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r7.j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L20
            if (r2 == r4) goto L18
            if (r2 != r3) goto L11
            goto L18
        L11:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            r7 = 0
            return r7
        L18:
            java.lang.Object r7 = r7.k
            a.aw20 r7 = (a.aw20) r7
            a.z1x.P(r8)
            goto L54
        L20:
            a.z1x.P(r8)
            java.lang.Object r8 = r0.D()
            a.y330 r8 = (a.y330) r8
            a.aw20 r8 = r8.c
            a.art r2 = r0.r
            java.lang.Object r5 = r0.D()
            a.y330 r5 = (a.y330) r5
            a.udl0 r5 = r5.b
            a.t730 r5 = a.ufx.N(r5)
            r2.getClass()
            a.aw20 r2 = a.art.d(r5)
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L56
            a.h03 r2 = r0.t
            r7.k = r8
            r7.j = r4
            kotlin.Unit r7 = r2.E()
            if (r7 != r1) goto L53
            goto L69
        L53:
            r7 = r8
        L54:
            r4 = r7
            goto L6a
        L56:
            a.zru r2 = r0.s
            r7.k = r8
            r7.j = r3
            a.pyu r2 = r2.f44876a
            java.lang.Object r7 = r2.o(r8, r7)
            if (r7 != r1) goto L65
            goto L67
        L65:
            kotlin.Unit r7 = kotlin.Unit.f46060a
        L67:
            if (r7 != r1) goto L53
        L69:
            return r1
        L6a:
            java.util.List r7 = a.d430.v
            a.ocj r7 = r0.i
            a.p7m0 r7 = r7.f25029a
        L70:
            java.lang.Object r8 = r7.getValue()
            r8.getClass()
            r1 = r8
            a.y330 r1 = (a.y330) r1
            r5 = 0
            r6 = 119(0x77, float:1.67E-43)
            r2 = 0
            r3 = 0
            a.y330 r0 = a.y330.a(r1, r2, r3, r4, r5, r6)
            boolean r8 = r7.m(r8, r0)
            if (r8 == 0) goto L70
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hr.l(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00c4  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0126, code lost:
    
        if (r2.a(r4, r42) == r3) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r43) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hr.m(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0085 A[LOOP:0: B:26:0x007c->B:28:0x0085, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x008f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0095 A[EDGE_INSN: B:33:0x0095->B:31:0x0095 BREAK  A[LOOP:0: B:26:0x007c->B:28:0x0085], SYNTHETIC] */
    private final Object o(Object obj) {
        m2c0 m2c0Var;
        m2c0 m2c0Var2;
        i1w0 i1w0Var;
        ListIterator listIteratorP;
        paw pawVar;
        hl60 hl60Var = (hl60) this.l;
        wne wneVar = wne.f39444a;
        byte b = this.j;
        if (b == 0) {
            z1x.P(obj);
            if (hl60Var.g.f25751a.a()) {
                this.j = (byte) 1;
                obj = hl60Var.B(this);
                if (obj != wneVar) {
                }
                return wneVar;
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
            m2c0Var2 = (m2c0) this.k;
            z1x.P(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            i1w0Var = hl60Var.n;
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new d1w0(rek0.b(hl60Var.c, mq4.f22204a))), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                pawVar = (paw) listIteratorP;
                if (pawVar.hasNext()) {
                    break;
                }
                i1w0Var.a((oe50) pawVar.next());
            }
        } else {
            m2c0Var = m2c0Var2;
            hl60Var.w(m2c0Var.k);
        }
        return Unit.f46060a;
        m2c0Var = (m2c0) obj;
        if (!a8k0.B(m2c0Var) && m2c0Var.n0) {
            gxu gxuVar = hl60Var.b;
            this.k = m2c0Var;
            this.j = (byte) 2;
            Object objN = gxuVar.n(this);
            if (objN != wneVar) {
                obj = objN;
                m2c0Var2 = m2c0Var;
                if (((Boolean) obj).booleanValue()) {
                    i1w0Var = hl60Var.n;
                    CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
                    listIteratorP = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, new d1w0(rek0.b(hl60Var.c, mq4.f22204a))), i1w0Var, copyOnWriteArrayListQ2, 0);
                    while (true) {
                        pawVar = (paw) listIteratorP;
                        if (pawVar.hasNext()) {
                            break;
                            break;
                        }
                        i1w0Var.a((oe50) pawVar.next());
                    }
                } else {
                    m2c0Var = m2c0Var2;
                    hl60Var.w(m2c0Var.k);
                }
            }
            return wneVar;
        }
        hl60Var.w(m2c0Var.k);
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0065  */
    /* JADX WARN: Code duplicated, block: B:24:0x0067 A[Catch: p660 -> 0x006d, TryCatch #1 {p660 -> 0x006d, blocks: (B:21:0x0053, B:24:0x0067, B:25:0x006c), top: B:39:0x0053 }] */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (r1.d(r8, r7) == r2) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.l
            a.jn90 r0 = (a.jn90) r0
            a.o8f r1 = r0.r
            a.wne r2 = a.wne.f39444a
            byte r3 = r7.j
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L2b
            if (r3 == r5) goto L21
            if (r3 != r4) goto L1b
            java.lang.Object r7 = r7.k
            java.util.List r7 = (java.util.List) r7
            a.z1x.P(r8)
            goto L7a
        L1b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r6
        L21:
            java.lang.Object r3 = r7.k
            java.util.List r3 = (java.util.List) r3
            a.yun r3 = (a.yun) r3
            a.z1x.P(r8)
            goto L51
        L2b:
            a.z1x.P(r8)
            a.d1u r8 = r0.o     // Catch: a.yun -> L45
            a.vdn r8 = r8.f5328a     // Catch: a.yun -> L45
            a.udn r8 = r8.f37240a     // Catch: a.yun -> L45
            a.p7m0 r8 = r8.f35488a     // Catch: a.yun -> L45
            java.lang.Object r8 = r8.getValue()     // Catch: a.yun -> L45
            java.util.List r8 = (java.util.List) r8     // Catch: a.yun -> L45
            if (r8 == 0) goto L3f
            goto L53
        L3f:
            a.yun r8 = new a.yun     // Catch: a.yun -> L45
            r8.<init>()     // Catch: a.yun -> L45
            throw r8     // Catch: a.yun -> L45
        L45:
            r8 = move-exception
            r7.k = r6
            r7.j = r5
            java.lang.Object r8 = r1.d(r8, r7)
            if (r8 != r2) goto L51
            goto L78
        L51:
            a.iun r8 = a.iun.f15405a
        L53:
            a.ivn r3 = r0.p     // Catch: a.p660 -> L6d
            java.lang.Object r3 = r3.f15453a     // Catch: a.p660 -> L6d
            a.vdn r3 = (a.vdn) r3     // Catch: a.p660 -> L6d
            a.udn r3 = r3.f37240a     // Catch: a.p660 -> L6d
            a.p7m0 r3 = r3.b     // Catch: a.p660 -> L6d
            java.lang.Object r3 = r3.getValue()     // Catch: a.p660 -> L6d
            a.rvm0 r3 = (a.rvm0) r3     // Catch: a.p660 -> L6d
            if (r3 == 0) goto L67
            r6 = r3
            goto L7b
        L67:
            a.p660 r3 = new a.p660     // Catch: a.p660 -> L6d
            r3.<init>()     // Catch: a.p660 -> L6d
            throw r3     // Catch: a.p660 -> L6d
        L6d:
            r3 = move-exception
            r7.k = r8
            r7.j = r4
            java.lang.Object r7 = r1.d(r3, r7)
            if (r7 != r2) goto L79
        L78:
            return r2
        L79:
            r7 = r8
        L7a:
            r8 = r7
        L7b:
            int r7 = a.jn90.s
            a.ocj r7 = r0.i
            a.p7m0 r7 = r7.f25029a
        L81:
            java.lang.Object r0 = r7.getValue()
            r0.getClass()
            r1 = r0
            a.gn90 r1 = (a.gn90) r1
            r8.getClass()
            a.gn90 r1 = new a.gn90
            r1.<init>(r8, r6)
            boolean r0 = r7.m(r0, r1)
            if (r0 == 0) goto L81
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hr.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (r0.S(r11) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        if (r11 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0095, code lost:
    
        if (r0.R(r12, r11) == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.k
            a.d7f0 r0 = (a.d7f0) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r11.j
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L27
            if (r2 == r7) goto L23
            if (r2 == r6) goto L1e
            if (r2 == r5) goto L1e
            if (r2 != r4) goto L18
            goto L1e
        L18:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r11)
            return r3
        L1e:
            a.z1x.P(r12)
            goto L98
        L23:
            a.z1x.P(r12)
            goto L58
        L27:
            a.z1x.P(r12)
            int r12 = a.d7f0.M
            a.ocj r12 = r0.i
            a.p7m0 r12 = r12.f25029a
        L30:
            java.lang.Object r2 = r12.getValue()
            r2.getClass()
            r8 = r2
            a.o7f0 r8 = (a.o7f0) r8
            r9 = 0
            r10 = 2015(0x7df, float:2.824E-42)
            a.o7f0 r8 = a.o7f0.a(r8, r7, r9, r10)
            boolean r2 = r12.m(r2, r8)
            if (r2 == 0) goto L30
            a.tu4 r12 = r0.P()
            java.lang.Object r2 = r11.l
            java.lang.String r2 = (java.lang.String) r2
            r11.j = r7
            java.lang.Object r12 = r0.N(r12, r2, r11)
            if (r12 != r1) goto L58
            goto L97
        L58:
            a.mm4 r12 = (a.mm4) r12
            if (r12 == 0) goto L9b
            boolean r2 = r12 instanceof a.lm4
            if (r2 == 0) goto L6b
            r11.j = r6
            int r12 = a.d7f0.M
            java.lang.Object r11 = r0.S(r11)
            if (r11 != r1) goto L98
            goto L97
        L6b:
            boolean r2 = r12 instanceof a.km4
            if (r2 == 0) goto L85
            r11.j = r5
            int r12 = a.d7f0.M
            a.eme0 r12 = new a.eme0
            r2 = 7
            r12.<init>(r0, r2)
            java.lang.Object r11 = r0.T(r12, r11)
            if (r11 != r1) goto L80
            goto L82
        L80:
            kotlin.Unit r11 = kotlin.Unit.f46060a
        L82:
            if (r11 != r1) goto L98
            goto L97
        L85:
            boolean r2 = r12 instanceof a.jm4
            if (r2 == 0) goto L9b
            a.jm4 r12 = (a.jm4) r12
            java.lang.Throwable r12 = r12.f16747a
            r11.j = r4
            int r2 = a.d7f0.M
            java.lang.Object r11 = r0.R(r12, r11)
            if (r11 != r1) goto L98
        L97:
            return r1
        L98:
            kotlin.Unit r11 = kotlin.Unit.f46060a
            return r11
        L9b:
            a.t9f.b()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hr.s(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r8 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (r8 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object t(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Object r0 = r8.l
            a.khf0 r0 = (a.khf0) r0
            java.lang.Object r0 = r0.c
            a.khf0 r0 = (a.khf0) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r8.j
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L20
            if (r2 == r5) goto L1c
            if (r2 != r4) goto L16
            goto L1c
        L16:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r3
        L1c:
            a.z1x.P(r9)
            goto L76
        L20:
            a.z1x.P(r9)
            java.lang.Object r9 = r8.k
            a.sgb r9 = (a.sgb) r9
            if (r9 == 0) goto L79
            boolean r2 = r9 instanceof a.qgb
            if (r2 == 0) goto L53
            a.qgb r9 = (a.qgb) r9
            long r2 = r9.f28675a
            long r6 = r9.b
            r8.j = r5
            a.x4k r9 = new a.x4k
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r6)
            r9.<init>(r4, r2)
            java.lang.Object r2 = r0.d
            a.btt0 r2 = (a.btt0) r2
            java.lang.String r2 = r2.a()
            java.lang.Object r8 = r0.m(r2, r9, r8)
            if (r8 != r1) goto L4e
            goto L50
        L4e:
            kotlin.Unit r8 = kotlin.Unit.f46060a
        L50:
            if (r8 != r1) goto L76
            goto L75
        L53:
            boolean r2 = r9 instanceof a.rgb
            if (r2 == 0) goto L79
            a.rgb r9 = (a.rgb) r9
            long r5 = r9.f30424a
            r8.j = r4
            a.x4k r9 = new a.x4k
            r9.<init>(r3, r5)
            java.lang.Object r2 = r0.d
            a.btt0 r2 = (a.btt0) r2
            java.lang.String r2 = r2.a()
            java.lang.Object r8 = r0.m(r2, r9, r8)
            if (r8 != r1) goto L71
            goto L73
        L71:
            kotlin.Unit r8 = kotlin.Unit.f46060a
        L73:
            if (r8 != r1) goto L76
        L75:
            return r1
        L76:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        L79:
            a.t9f.b()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hr.t(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (r8 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r8 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object x(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Object r0 = r8.l
            a.phf0 r0 = (a.phf0) r0
            java.lang.Object r0 = r0.f26994a
            a.phf0 r0 = (a.phf0) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r8.j
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L20
            if (r2 == r5) goto L1c
            if (r2 != r4) goto L16
            goto L1c
        L16:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r3
        L1c:
            a.z1x.P(r9)
            goto L63
        L20:
            a.z1x.P(r9)
            java.lang.Object r9 = r8.k
            a.tnp0 r9 = (a.tnp0) r9
            if (r9 == 0) goto L66
            boolean r2 = r9 instanceof a.rnp0
            if (r2 == 0) goto L46
            a.rnp0 r9 = (a.rnp0) r9
            long r2 = r9.f30800a
            long r6 = r9.c
            r8.j = r5
            a.vjt0 r9 = new a.vjt0
            r9.<init>(r2, r6)
            java.lang.Object r8 = r0.f(r9, r8)
            if (r8 != r1) goto L41
            goto L43
        L41:
            kotlin.Unit r8 = kotlin.Unit.f46060a
        L43:
            if (r8 != r1) goto L63
            goto L62
        L46:
            boolean r2 = r9 instanceof a.snp0
            if (r2 == 0) goto L66
            a.snp0 r9 = (a.snp0) r9
            long r2 = r9.f32505a
            r8.j = r4
            a.vjt0 r9 = new a.vjt0
            r4 = 0
            r9.<init>(r2, r4)
            java.lang.Object r8 = r0.f(r9, r8)
            if (r8 != r1) goto L5e
            goto L60
        L5e:
            kotlin.Unit r8 = kotlin.Unit.f46060a
        L60:
            if (r8 != r1) goto L63
        L62:
            return r1
        L63:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        L66:
            a.t9f.b()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hr.x(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        if (a.qcc.P(r13, r11) == r2) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object y(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.Object r0 = r13.k
            a.e8i0 r0 = (a.e8i0) r0
            a.ocj r1 = r0.i
            a.wne r2 = a.wne.f39444a
            byte r3 = r13.j
            r4 = 62
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L24
            if (r3 == r6) goto L1f
            if (r3 != r5) goto L18
            a.z1x.P(r14)
            goto L74
        L18:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r13)
            r13 = 0
            return r13
        L1f:
            a.z1x.P(r14)
            r11 = r13
            goto L61
        L24:
            a.z1x.P(r14)
            int r14 = a.e8i0.w
            a.p7m0 r14 = r1.f25029a
        L2b:
            java.lang.Object r3 = r14.getValue()
            r3.getClass()
            r7 = r3
            a.b8i0 r7 = (a.b8i0) r7
            a.b8i0 r7 = a.b8i0.a(r7, r6, r4)
            boolean r3 = r14.m(r3, r7)
            if (r3 == 0) goto L2b
            a.csi0 r14 = r0.s
            java.lang.Object r3 = r13.l
            a.d9i0 r3 = (a.d9i0) r3
            long r9 = r3.f5702a
            a.h8i0 r7 = a.h8i0.SELF_EXCLUSION
            java.lang.String r12 = r3.b
            r13.j = r6
            a.j400 r14 = r14.f4890a
            int r8 = r7.getId()
            r11 = r13
            r7 = r14
            java.lang.Object r13 = r7.c(r8, r9, r11, r12)
            if (r13 != r2) goto L5c
            goto L5e
        L5c:
            kotlin.Unit r13 = kotlin.Unit.f46060a
        L5e:
            if (r13 != r2) goto L61
            goto L73
        L61:
            a.uen r13 = a.wen.b
            r13 = 3500(0xdac, float:4.905E-42)
            a.bfn r14 = a.bfn.MILLISECONDS
            long r13 = a.ibc.v0(r13, r14)
            r11.j = r5
            java.lang.Object r13 = a.qcc.P(r13, r11)
            if (r13 != r2) goto L74
        L73:
            return r2
        L74:
            int r13 = a.e8i0.w
            a.p7m0 r13 = r1.f25029a
        L78:
            java.lang.Object r14 = r13.getValue()
            r14.getClass()
            r1 = r14
            a.b8i0 r1 = (a.b8i0) r1
            r2 = 0
            a.b8i0 r1 = a.b8i0.a(r1, r2, r4)
            boolean r14 = r13.m(r14, r1)
            if (r14 == 0) goto L78
            a.x7i0 r13 = a.x7i0.f40415a
            r0.G(r13)
            kotlin.Unit r13 = kotlin.Unit.f46060a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hr.y(java.lang.Object):java.lang.Object");
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        Object obj = this.l;
        switch (b) {
            case 0:
                return new hr((sgb) this.k, (nr) obj, yjeVar, (byte) 0);
            case 1:
                return new hr((tnp0) this.k, (es) obj, yjeVar, (byte) 1);
            case 2:
                return new hr((n91) obj, yjeVar, (byte) 2);
            case 3:
                return new hr((kc4) obj, yjeVar, (byte) 3);
            case 4:
                return new hr((fh4) obj, yjeVar, (byte) 4);
            case 5:
                return new hr((fh4) obj, yjeVar, (byte) 5);
            case 6:
                return new hr((hk4) obj, yjeVar, (byte) 6);
            case 7:
                return new hr((hk4) obj, yjeVar, (byte) 7);
            case 8:
                return new hr((ksc) obj, yjeVar, (byte) 8);
            case 9:
                return new hr((xg0) obj, yjeVar, (byte) 9);
            case 10:
                return new hr((ncj) obj, yjeVar, (byte) 10);
            case 11:
                return new hr((d4o) this.k, (String) obj, yjeVar, (byte) 11);
            case 12:
                return new hr((ccp) obj, yjeVar, (byte) 12);
            case 13:
                return new hr((eop) this.k, (String) obj, yjeVar, (byte) 13);
            case 14:
                return new hr((typ) obj, yjeVar, (byte) 14);
            case 15:
                return new hr((nzp) obj, yjeVar, (byte) 15);
            case 16:
                return new hr((u7u) obj, yjeVar, (byte) 16);
            case 17:
                return new hr((h8u) obj, yjeVar, (byte) 17);
            case 18:
                return new hr((qvu) obj, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new hr((ryy) obj, yjeVar, (byte) 19);
            case 20:
                return new hr((d430) obj, yjeVar, (byte) 20);
            case 21:
                return new hr((v360) obj, yjeVar, (byte) 21);
            case 22:
                return new hr((hl60) obj, yjeVar, (byte) 22);
            case 23:
                return new hr((jn90) obj, yjeVar, (byte) 23);
            case 24:
                return new hr((d7f0) this.k, (String) obj, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new hr((sgb) this.k, (khf0) obj, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new hr((tnp0) this.k, (phf0) obj, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new hr((e8i0) this.k, (d9i0) obj, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new hr((wli0) this.k, (v85) obj, yjeVar, (byte) 28);
            default:
                return new hr((eoj0) obj, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                break;
        }
        return ((hr) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:180:0x0358 A[PHI: r0
  0x0358: PHI (r0v76 java.lang.Object) = (r0v75 java.lang.Object), (r0v82 java.lang.Object) binds: [B:178:0x0355, B:167:0x02e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:219:0x0475  */
    /* JADX WARN: Code duplicated, block: B:296:0x064a  */
    /* JADX WARN: Code duplicated, block: B:299:0x0655  */
    /* JADX WARN: Code duplicated, block: B:337:0x0702  */
    /* JADX WARN: Code duplicated, block: B:391:0x0819  */
    /* JADX WARN: Code duplicated, block: B:442:0x08fc  */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x027c, code lost:
    
        if (r0 == r1) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0369, code lost:
    
        if (a.slb.O((a.gmq) r0, r2, r42) == r1) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x03f1, code lost:
    
        if (r0.N(r19, r42) == r1) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x04f4, code lost:
    
        if (r1.a(r3, r42) == r2) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x053b, code lost:
    
        if (r2.b(r11) == r1) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0591, code lost:
    
        if (r2 == r1) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x07a0, code lost:
    
        if (a.qjj.d0(r2, r3, r42) == r1) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0883, code lost:
    
        if (a.qjj.d0(r1, r2, r42) == r0) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0974, code lost:
    
        if (r2 == r3) goto L473;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x0990, code lost:
    
        if (r1 == r3) goto L473;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0a0d, code lost:
    
        if (r1 == r0) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0a2c, code lost:
    
        if (r1 == r0) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x0a81, code lost:
    
        if (r1 == r0) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0aa8, code lost:
    
        if (r1 == r0) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r1v169 */
    /* JADX WARN: Type inference failed for: r1v170 */
    /* JADX WARN: Type inference failed for: r1v171 */
    /* JADX WARN: Type inference failed for: r1v172 */
    /* JADX WARN: Type inference failed for: r1v173 */
    /* JADX WARN: Type inference failed for: r1v174 */
    /* JADX WARN: Type inference failed for: r1v175 */
    /* JADX WARN: Type inference failed for: r1v176 */
    /* JADX WARN: Type inference failed for: r1v177 */
    /* JADX WARN: Type inference failed for: r1v178 */
    /* JADX WARN: Type inference failed for: r1v179 */
    /* JADX WARN: Type inference failed for: r1v180 */
    /* JADX WARN: Type inference failed for: r1v181 */
    /* JADX WARN: Type inference failed for: r1v182 */
    /* JADX WARN: Type inference failed for: r1v183 */
    /* JADX WARN: Type inference failed for: r1v43, types: [byte] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46, types: [a.yrt0] */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v64, types: [byte] */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v67, types: [a.yrt0] */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r1v73 */
    /* JADX WARN: Type inference failed for: r1v78, types: [byte] */
    /* JADX WARN: Type inference failed for: r1v79 */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r1v81, types: [a.yrt0] */
    /* JADX WARN: Type inference failed for: r1v86 */
    /* JADX WARN: Type inference failed for: r1v87 */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r43) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hr.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hr(Object obj, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.l = obj;
    }
}

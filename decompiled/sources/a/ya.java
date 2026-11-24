package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ya extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ya(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
    
        if (a.qcc.P(r11, r9) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object G(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.Object r0 = r11.k
            a.m8k r0 = (a.m8k) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r11.j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L21
            if (r2 == r4) goto L1c
            if (r2 != r3) goto L15
            a.z1x.P(r12)
            goto L9c
        L15:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r11)
            r11 = 0
            return r11
        L1c:
            a.z1x.P(r12)
            r9 = r11
            goto L72
        L21:
            a.z1x.P(r12)
            int r12 = a.m8k.w
            a.ocj r12 = r0.i
            a.p7m0 r12 = r12.f25029a
        L2a:
            java.lang.Object r2 = r12.getValue()
            r2.getClass()
            r5 = r2
            a.k8k r5 = (a.k8k) r5
            r9 = 0
            r10 = 27
            r6 = 0
            r7 = 0
            r8 = 1
            a.k8k r5 = a.k8k.a(r5, r6, r7, r8, r9, r10)
            boolean r2 = r12.m(r2, r5)
            if (r2 == 0) goto L2a
            a.toi0 r12 = r0.p
            java.lang.Object r2 = r0.D()
            a.k8k r2 = (a.k8k) r2
            a.d8k r2 = r2.b
            long r7 = r2.b
            java.lang.Object r2 = r0.D()
            a.k8k r2 = (a.k8k) r2
            a.xrz r2 = r2.f17876a
            int r6 = r2.getId()
            java.lang.Object r2 = r0.D()
            a.k8k r2 = (a.k8k) r2
            a.d8k r2 = r2.b
            java.lang.String r10 = r2.e
            r11.j = r4
            a.twz r5 = r12.f34286a
            r9 = r11
            java.lang.Object r12 = r5.f(r6, r7, r9, r10)
            if (r12 != r1) goto L72
            goto L9b
        L72:
            a.i500 r12 = (a.i500) r12
            java.util.List r11 = r12.b
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L89
            a.yoi0 r11 = r0.q
            java.util.List r12 = r12.b
            r11.a(r12)
            a.f8k r11 = a.f8k.f9109a
            r0.G(r11)
            goto La3
        L89:
            a.uen r11 = a.wen.b
            r11 = 3500(0xdac, double:1.729E-320)
            a.bfn r2 = a.bfn.MILLISECONDS
            long r11 = a.ibc.w0(r11, r2)
            r9.j = r3
            java.lang.Object r11 = a.qcc.P(r11, r9)
            if (r11 != r1) goto L9c
        L9b:
            return r1
        L9c:
            int r11 = a.m8k.w
            a.g8k r11 = a.g8k.f10867a
            r0.G(r11)
        La3:
            kotlin.Unit r11 = kotlin.Unit.f46060a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ya.G(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (a.qcc.O(3500, r7) == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object H(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.k
            a.p9k r0 = (a.p9k) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r7.j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1f
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L14
            a.z1x.P(r8)
            goto L47
        L14:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            r7 = 0
            return r7
        L1b:
            a.z1x.P(r8)
            goto L3c
        L1f:
            a.z1x.P(r8)
            a.f5a r8 = r0.g
            a.n8k r2 = r0.k
            int r2 = r2.f23093a
            a.art r5 = org.xplatform.responsible_game.impl.domain.models.LimitTypeEnum.b
            int r6 = r0.i
            r5.getClass()
            org.xplatform.responsible_game.impl.domain.models.LimitTypeEnum r5 = a.art.c(r6)
            r7.j = r4
            java.io.Serializable r8 = r8.a(r2, r5, r7)
            if (r8 != r1) goto L3c
            goto L46
        L3c:
            r7.j = r3
            r2 = 3500(0xdac, double:1.729E-320)
            java.lang.Object r7 = a.qcc.O(r2, r7)
            if (r7 != r1) goto L47
        L46:
            return r1
        L47:
            a.i1w0 r7 = r0.b
            java.util.concurrent.CopyOnWriteArrayList r8 = a.b1j.q(r7)
            a.c8d r0 = new a.c8d
            a.v7d r1 = a.y7d.f42146a
            a.p0w0 r2 = a.p0w0.f26173a
            r0.<init>(r1, r2)
            r1 = 0
            java.util.ListIterator r8 = a.b1j.p(r8, r0, r7, r8, r1)
        L5b:
            r0 = r8
            a.paw r0 = (a.paw) r0
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6e
            java.lang.Object r0 = r0.next()
            a.oe50 r0 = (a.oe50) r0
            r7.a(r0)
            goto L5b
        L6e:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ya.H(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (a.qcc.O(3500, r6) == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object I(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.k
            a.iak r0 = (a.iak) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r6.j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1f
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L14
            a.z1x.P(r7)
            goto L3e
        L14:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            r6 = 0
            return r6
        L1b:
            a.z1x.P(r7)
            goto L33
        L1f:
            a.z1x.P(r7)
            a.f5a r7 = r0.g
            a.p7k r2 = r0.j
            int r2 = r2.f26510a
            org.xplatform.responsible_game.impl.domain.models.LimitTypeEnum r5 = org.xplatform.responsible_game.impl.domain.models.LimitTypeEnum.DEPOSIT_LIMIT_7_DAY
            r6.j = r4
            java.io.Serializable r7 = r7.a(r2, r5, r6)
            if (r7 != r1) goto L33
            goto L3d
        L33:
            r6.j = r3
            r2 = 3500(0xdac, double:1.729E-320)
            java.lang.Object r6 = a.qcc.O(r2, r6)
            if (r6 != r1) goto L3e
        L3d:
            return r1
        L3e:
            a.i1w0 r6 = r0.b
            java.util.concurrent.CopyOnWriteArrayList r7 = a.b1j.q(r6)
            a.c8d r0 = new a.c8d
            a.v7d r1 = a.y7d.f42146a
            a.p0w0 r2 = a.p0w0.f26173a
            r0.<init>(r1, r2)
            r1 = 0
            java.util.ListIterator r7 = a.b1j.p(r7, r0, r6, r7, r1)
        L52:
            r0 = r7
            a.paw r0 = (a.paw) r0
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L65
            java.lang.Object r0 = r0.next()
            a.oe50 r0 = (a.oe50) r0
            r6.a(r0)
            goto L52
        L65:
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ya.I(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r5.c1(false, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r5.d1(r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object J(java.lang.Object r5) {
        /*
            r4 = this;
            a.wne r0 = a.wne.f39444a
            byte r1 = r4.j
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 == r3) goto L14
            if (r1 != r2) goto Ld
            goto L14
        Ld:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r4)
            r4 = 0
            return r4
        L14:
            a.z1x.P(r5)
            goto L36
        L18:
            a.z1x.P(r5)
            java.lang.Object r5 = r4.k
            a.tom r5 = (a.tom) r5
            boolean r1 = r5.q
            if (r1 != 0) goto L2d
            r4.j = r3
            r1 = 0
            java.lang.Object r4 = r5.c1(r1, r4)
            if (r4 != r0) goto L36
            goto L35
        L2d:
            r4.j = r2
            java.lang.Object r4 = r5.d1(r4)
            if (r4 != r0) goto L36
        L35:
            return r0
        L36:
            kotlin.Unit r4 = kotlin.Unit.f46060a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ya.J(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009d, code lost:
    
        if (a.qcc.O(3500, r20) == r2) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object l(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            java.lang.Object r1 = r0.k
            a.wdc r1 = (a.wdc) r1
            a.wne r2 = a.wne.f39444a
            byte r3 = r0.j
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L23
            if (r3 == r5) goto L1e
            if (r3 != r4) goto L17
            a.z1x.P(r21)
            goto La0
        L17:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            r0 = 0
            return r0
        L1e:
            a.z1x.P(r21)
            goto L95
        L23:
            a.z1x.P(r21)
            int r3 = a.wdc.w
            a.ocj r3 = r1.i
            a.p7m0 r3 = r3.f25029a
        L2c:
            java.lang.Object r6 = r3.getValue()
            r6.getClass()
            r7 = r6
            a.rdc r7 = (a.rdc) r7
            r18 = 0
            r19 = 383(0x17f, float:5.37E-43)
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 1
            a.rdc r7 = a.rdc.a(r7, r8, r9, r11, r12, r13, r14, r16, r17, r18, r19)
            boolean r6 = r3.m(r6, r7)
            if (r6 == 0) goto L2c
            java.lang.Object r3 = r1.D()
            a.rdc r3 = (a.rdc) r3
            a.z85 r3 = r3.i
            if (r3 == 0) goto L95
            a.usi0 r6 = r1.v
            long r7 = r3.f43950a
            a.g8i0 r9 = a.g8i0.f10866a
            java.lang.String r3 = r3.b
            r0.j = r5
            a.r200 r5 = r6.f36213a
            a.d200 r6 = r5.f29707a
            a.btt0 r5 = r5.c
            java.lang.String r5 = r5.a()
            a.qsi0 r9 = new a.qsi0
            a.b7i0 r10 = new a.b7i0
            r11 = -9999(0xffffffffffffd8f1, double:NaN)
            int r11 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r11 != 0) goto L7a
            r7 = 0
        L7a:
            r10.<init>(r7, r3)
            java.util.List r3 = kotlin.collections.a.c(r10)
            r9.<init>(r3)
            java.lang.Object r3 = r6.b(r5, r9, r0)
            if (r3 != r2) goto L8b
            goto L8d
        L8b:
            kotlin.Unit r3 = kotlin.Unit.f46060a
        L8d:
            if (r3 != r2) goto L90
            goto L92
        L90:
            kotlin.Unit r3 = kotlin.Unit.f46060a
        L92:
            if (r3 != r2) goto L95
            goto L9f
        L95:
            r0.j = r4
            r3 = 3500(0xdac, double:1.729E-320)
            java.lang.Object r0 = a.qcc.O(r3, r0)
            if (r0 != r2) goto La0
        L9f:
            return r2
        La0:
            int r0 = a.wdc.w
            a.ndc r0 = a.ndc.f23333a
            r1.G(r0)
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ya.l(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x009f, code lost:
    
        if (r10 == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.k
            a.trc r0 = (a.trc) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r10.j
            r3 = 6
            r4 = 0
            r6 = 1
            r7 = 2
            if (r2 == 0) goto L23
            if (r2 == r6) goto L1f
            if (r2 != r7) goto L18
            a.z1x.P(r11)
            goto La2
        L18:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r10)
            r10 = 0
            return r10
        L1f:
            a.z1x.P(r11)
            goto L64
        L23:
            a.z1x.P(r11)
            a.urc r11 = r0.d
            r10.j = r6
            a.cu5 r11 = r11.f36157a
            a.q7d0 r2 = r11.f
            java.lang.String r6 = "FIRST_SAVE_SEEN_CMS_BANNER_TIMESTAMP"
            android.content.SharedPreferences r2 = r2.a()
            long r8 = r2.getLong(r6, r4)
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r2 <= 0) goto L5a
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            r2.setTimeInMillis(r8)
            r2.add(r7, r3)
            java.util.Calendar r6 = java.util.Calendar.getInstance()
            int r2 = r6.compareTo(r2)
            if (r2 <= 0) goto L5a
            java.lang.Object r11 = r11.b(r10)
            if (r11 != r1) goto L57
            goto L5c
        L57:
            kotlin.Unit r11 = kotlin.Unit.f46060a
            goto L5c
        L5a:
            kotlin.Unit r11 = kotlin.Unit.f46060a
        L5c:
            if (r11 != r1) goto L5f
            goto L61
        L5f:
            kotlin.Unit r11 = kotlin.Unit.f46060a
        L61:
            if (r11 != r1) goto L64
            goto La1
        L64:
            a.vrc r11 = r0.e
            r10.j = r7
            a.rwc r11 = r11.f37894a
            a.q7d0 r0 = r11.g
            java.lang.String r2 = "FIRST_SAVE_SEEN_BANNER_TIMESTAMP"
            android.content.SharedPreferences r0 = r0.a()
            long r8 = r0.getLong(r2, r4)
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 <= 0) goto L98
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r0.setTimeInMillis(r8)
            r0.add(r7, r3)
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            int r0 = r2.compareTo(r0)
            if (r0 <= 0) goto L98
            java.lang.Object r10 = r11.a(r10)
            if (r10 != r1) goto L95
            goto L9a
        L95:
            kotlin.Unit r10 = kotlin.Unit.f46060a
            goto L9a
        L98:
            kotlin.Unit r10 = kotlin.Unit.f46060a
        L9a:
            if (r10 != r1) goto L9d
            goto L9f
        L9d:
            kotlin.Unit r10 = kotlin.Unit.f46060a
        L9f:
            if (r10 != r1) goto La2
        La1:
            return r1
        La2:
            kotlin.Unit r10 = kotlin.Unit.f46060a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ya.m(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (r0.a(r1, r7) == r2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r0.a(r1, r7) == r2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.k
            a.ibe r0 = (a.ibe) r0
            a.p7m0 r1 = r0.b
            a.wne r2 = a.wne.f39444a
            byte r3 = r7.j
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L1d
            if (r3 == r6) goto L13
            if (r3 != r5) goto L17
        L13:
            a.z1x.P(r8)
            goto L69
        L17:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r4
        L1d:
            a.z1x.P(r8)
            java.lang.Object r8 = r1.getValue()
            a.hbe r8 = (a.hbe) r8
            a.i9e0 r8 = r8.b
            boolean r3 = r8 instanceof a.h9e0
            if (r3 == 0) goto L2f
            a.h9e0 r8 = (a.h9e0) r8
            goto L30
        L2f:
            r8 = r4
        L30:
            if (r8 == 0) goto L69
            int r8 = r8.f12672a
            a.qoj0 r0 = r0.c
            java.lang.Object r1 = r1.getValue()
            a.hbe r1 = (a.hbe) r1
            a.vsf0 r1 = r1.f12766a
            int r1 = r1.ordinal()
            if (r1 == 0) goto L69
            if (r1 == r6) goto L5b
            if (r1 != r5) goto L57
            a.fbe r1 = new a.fbe
            r3 = 0
            r1.<init>(r3, r8)
            r7.j = r5
            java.lang.Object r7 = r0.a(r1, r7)
            if (r7 != r2) goto L69
            goto L68
        L57:
            a.t9f.b()
            return r4
        L5b:
            a.fbe r1 = new a.fbe
            r1.<init>(r6, r8)
            r7.j = r6
            java.lang.Object r7 = r0.a(r1, r7)
            if (r7 != r2) goto L69
        L68:
            return r2
        L69:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ya.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r1.D(r3, r22) == r4) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r23) throws java.lang.Throwable {
        /*
            r22 = this;
            r0 = r22
            java.lang.Object r1 = r0.k
            a.hbg r1 = (a.hbg) r1
            a.p7m0 r2 = r1.u
            org.xplatform.cyber.calendar.api.CyberCalendarParams r3 = r1.k
            a.wne r4 = a.wne.f39444a
            byte r5 = r0.j
            r6 = 1
            r7 = 0
            r8 = 2
            if (r5 == 0) goto L27
            if (r5 == r6) goto L21
            if (r5 != r8) goto L1b
            a.z1x.P(r23)
            goto L55
        L1b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            return r7
        L21:
            a.z1x.P(r23)
            r5 = r23
            goto L37
        L27:
            a.z1x.P(r23)
            a.g2v r5 = r1.h
            java.util.List r9 = r3.f46477a
            r0.j = r6
            java.lang.Object r5 = r5.g(r9, r0)
            if (r5 != r4) goto L37
            goto L54
        L37:
            a.o4g r5 = (a.o4g) r5
            java.util.List r6 = r5.b
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L5e
            java.util.List r6 = r5.f24633a
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L4a
            goto L5e
        L4a:
            java.util.List r3 = r5.b
            r0.j = r8
            java.lang.Object r0 = r1.D(r3, r0)
            if (r0 != r4) goto L55
        L54:
            return r4
        L55:
            r2.getClass()
            a.u9g r0 = a.u9g.f35282a
            r2.o(r7, r0)
            goto L91
        L5e:
            a.v9g r0 = new a.v9g
            a.g2v r8 = r1.f
            boolean r1 = r3.d
            if (r1 == 0) goto L6a
            a.pb10 r1 = a.pb10.r
        L68:
            r9 = r1
            goto L73
        L6a:
            r3 = -1
            a.pb10 r1 = a.pb10.v
            a.pb10 r1 = a.ozb.J(r3, r1)
            goto L68
        L73:
            r19 = 0
            r21 = 606(0x25e, float:8.49E-43)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 2131953088(0x7f1305c0, float:1.9542637E38)
            r15 = 0
            r16 = 2131957392(0x7f131690, float:1.9551367E38)
            r17 = 10000(0x2710, double:4.9407E-320)
            a.mdm r1 = a.g2v.b(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r21)
            r0.<init>(r1)
            r2.getClass()
            r2.o(r7, r0)
        L91:
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ya.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (((a.gmq) r13).c(r2, r12) == r1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.k
            a.lmh r0 = (a.lmh) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r12.j
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L1f
            if (r2 == r5) goto L1b
            if (r2 != r4) goto L15
            a.z1x.P(r13)
            goto L71
        L15:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r12)
            return r3
        L1b:
            a.z1x.P(r13)
            goto L60
        L1f:
            a.z1x.P(r13)
            a.reu r13 = r0.t
            org.xplatform.cyber.section.api.tournament_bracket.CyberTournamentBracketParams r2 = r0.o
            long r6 = r2.f46571a
            long r8 = r2.f
            a.znq0 r2 = new a.znq0
            r2.<init>(r8)
            r12.j = r5
            java.lang.Object r13 = r13.b
            a.ykh r13 = (a.ykh) r13
            r10 = 0
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 <= 0) goto L44
            a.dfj r5 = a.dfj.UNIQUE_4
            r8 = 12
            java.lang.String r2 = a.jtv.K0(r2, r5, r8)
            goto L46
        L44:
            java.lang.String r2 = ""
        L46:
            a.jo20 r2 = a.ckb.P(r6, r2)
            a.sjh r5 = r13.b
            a.or30 r6 = r5.f32303a
            long r7 = a.ykh.d
            a.ffd r10 = new a.ffd
            r5 = 6
            r10.<init>(r13, r2, r3, r5)
            r11 = 252(0xfc, float:3.53E-43)
            r9 = 0
            a.vsg0 r13 = a.gfx.R(r6, r7, r9, r10, r11)
            if (r13 != r1) goto L60
            goto L70
        L60:
            a.gmq r13 = (a.gmq) r13
            a.b5h r2 = new a.b5h
            r3 = 3
            r2.<init>(r0, r3)
            r12.j = r4
            java.lang.Object r12 = r13.c(r2, r12)
            if (r12 != r1) goto L71
        L70:
            return r1
        L71:
            kotlin.Unit r12 = kotlin.Unit.f46060a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ya.s(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (a.slb.O(r8, r2, r7) == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object t(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.k
            a.j2j r0 = (a.j2j) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r7.j
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L1f
            if (r2 == r5) goto L1b
            if (r2 != r4) goto L15
            a.z1x.P(r8)
            goto L43
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r3
        L1b:
            a.z1x.P(r8)
            goto L2d
        L1f:
            a.z1x.P(r8)
            r7.j = r5
            r5 = 1500(0x5dc, double:7.41E-321)
            java.lang.Object r8 = a.qcc.O(r5, r7)
            if (r8 != r1) goto L2d
            goto L42
        L2d:
            a.kki r8 = r0.e
            a.dnq r8 = r8.l()
            a.b1f r2 = new a.b1f
            r5 = 13
            r2.<init>(r0, r3, r5)
            r7.j = r4
            java.lang.Object r7 = a.slb.O(r8, r2, r7)
            if (r7 != r1) goto L43
        L42:
            return r1
        L43:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ya.t(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r13 == r1) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object x(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.k
            a.e6j r0 = (a.e6j) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r12.j
            r3 = 0
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L20
            if (r2 == r6) goto L1c
            if (r2 != r5) goto L16
            a.z1x.P(r13)
            goto L41
        L16:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r12)
            return r3
        L1c:
            a.z1x.P(r13)
            goto L2e
        L20:
            a.z1x.P(r13)
            a.es r13 = r0.z
            r12.j = r6
            java.lang.Object r13 = r13.t(r12)
            if (r13 != r1) goto L2e
            goto L40
        L2e:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L65
            a.nou r13 = r0.C
            r12.j = r5
            java.io.Serializable r13 = a.nou.b(r13, r12)
            if (r13 != r1) goto L41
        L40:
            return r1
        L41:
            a.ql5 r13 = (a.ql5) r13
            a.trm0 r12 = r0.D
            a.bm5 r1 = a.bm5.e
            r12.l(r1, r13)
            a.wyb r12 = r0.A
            boolean r12 = r12.a()
            if (r12 == 0) goto L81
            a.s5j r12 = a.s5j.f31656a
            r0.G(r12)
            a.qoc r12 = r0.B
            a.wsf0 r12 = r12.f29067a
            java.lang.Object r12 = r12.b
            a.q7d0 r12 = (a.q7d0) r12
            java.lang.String r13 = "USER_AGGREGATOR_BALANCE_WARNING"
            r12.d(r13, r4)
            goto L81
        L65:
            int r12 = a.e6j.L
            a.bvc r6 = a.jiu0.a(r0)
            a.y5j r7 = new a.y5j
            r7.<init>(r0, r5)
            a.mne r12 = r0.q
            a.dvj r9 = r12.b
            a.u88 r10 = new a.u88
            r12 = 11
            r10.<init>(r0, r4, r3, r12)
            r11 = 10
            r8 = 0
            a.sac.V(r6, r7, r8, r9, r10, r11)
        L81:
            kotlin.Unit r12 = kotlin.Unit.f46060a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ya.x(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (r0.w(r4, r9) == r1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object y(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.k
            a.xgj r0 = (a.xgj) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r9.j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1f
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L14
            a.z1x.P(r10)
            goto L46
        L14:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            r9 = 0
            return r9
        L1b:
            a.z1x.P(r10)
            goto L2f
        L1f:
            a.z1x.P(r10)
            a.znt r10 = r0.c
            r9.j = r4
            a.chf0 r10 = r10.f44690a
            java.lang.Object r10 = r10.D(r9)
            if (r10 != r1) goto L2f
            goto L45
        L2f:
            java.lang.Number r10 = (java.lang.Number) r10
            long r5 = r10.longValue()
            r7 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 != 0) goto L3c
            goto L3d
        L3c:
            r4 = 0
        L3d:
            r9.j = r3
            java.lang.Object r9 = r0.w(r4, r9)
            if (r9 != r1) goto L46
        L45:
            return r1
        L46:
            kotlin.Unit r9 = kotlin.Unit.f46060a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ya.y(java.lang.Object):java.lang.Object");
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                return new ya((ab) obj2, yjeVar, (byte) 0);
            case 1:
                return new ya((wj) obj2, yjeVar, (byte) 1);
            case 2:
                return new ya((s20) obj2, yjeVar, (byte) 2);
            case 3:
                return new ya((n91) obj2, yjeVar, (byte) 3);
            case 4:
                return new ya((kc1) obj2, yjeVar, (byte) 4);
            case 5:
                return new ya((n92) obj2, yjeVar, (byte) 5);
            case 6:
                return new ya((dk5) obj2, yjeVar, (byte) 6);
            case 7:
                return new ya((dt6) obj2, yjeVar, (byte) 7);
            case 8:
                return new ya((f97) obj2, yjeVar, (byte) 8);
            case 9:
                return new ya((kf7) obj2, yjeVar, (byte) 9);
            case 10:
                return new ya((jm8) obj2, yjeVar, (byte) 10);
            case 11:
                return new ya((xpj0) obj2, yjeVar, (byte) 11);
            case 12:
                return new ya((rrd) obj2, yjeVar, (byte) 12);
            case 13:
                return new ya((h2b) obj2, yjeVar, (byte) 13);
            case 14:
                return new ya((y7b) obj2, yjeVar, (byte) 14);
            case 15:
                return new ya((ywq0) obj2, yjeVar, (byte) 15);
            case 16:
                return new ya((wdc) obj2, yjeVar, (byte) 16);
            case 17:
                return new ya((trc) obj2, yjeVar, (byte) 17);
            case 18:
                return new ya((ibe) obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new ya((hbg) obj2, yjeVar, (byte) 19);
            case 20:
                return new ya((lmh) obj2, yjeVar, (byte) 20);
            case 21:
                return new ya((rsh) obj2, yjeVar, (byte) 21);
            case 22:
                return new ya((j2j) obj2, yjeVar, (byte) 22);
            case 23:
                return new ya((e6j) obj2, yjeVar, (byte) 23);
            case 24:
                return new ya((xgj) obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new ya((m8k) obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new ya((p9k) obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new ya((iak) obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new ya((tom) obj2, yjeVar, (byte) 28);
            default:
                return new ya((t33) obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Exception {
        switch (this.i) {
            case 0:
                return ((ya) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((ya) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((ya) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                ((ya) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
                return wne.f39444a;
            case 4:
                return ((ya) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((ya) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((ya) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((ya) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((ya) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((ya) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((ya) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((ya) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((ya) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((ya) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((ya) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((ya) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((ya) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((ya) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((ya) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((ya) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((ya) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((ya) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((ya) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((ya) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((ya) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((ya) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((ya) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((ya) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((ya) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                ((ya) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
                return wne.f39444a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:419:0x08ff  */
    /* JADX WARN: Code duplicated, block: B:421:0x0904  */
    /* JADX WARN: Code duplicated, block: B:507:0x0ad6  */
    /* JADX WARN: Code duplicated, block: B:508:0x0ad9  */
    /* JADX WARN: Code duplicated, block: B:542:0x0b94  */
    /* JADX WARN: Code duplicated, block: B:544:0x0ba6  */
    /* JADX WARN: Code duplicated, block: B:545:0x0bb8  */
    /* JADX WARN: Code duplicated, block: B:549:0x0bd4 A[LOOP:12: B:547:0x0bcb->B:549:0x0bd4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:574:0x0bde A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0050 -> B:12:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:425:0x0920 -> B:421:0x0904). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r43) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 3104
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ya.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

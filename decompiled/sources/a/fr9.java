package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.game.universal.impl.presentation.dicepoker.DicePokerView;
import org.xplatform.personal.impl.presentation.documentchoice.models.PersonalDocumentRedesignUiModel;

/* JADX INFO: loaded from: classes3.dex */
public final class fr9 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fr9(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0099, code lost:
    
        if (r11.A((a.vgl) r0, r17) == r12) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object G(java.lang.Object r18) {
        /*
            r17 = this;
            r10 = r17
            java.lang.Object r0 = r10.l
            r11 = r0
            a.cgl r11 = (a.cgl) r11
            a.wne r12 = a.wne.f39444a
            byte r0 = r10.j
            r13 = 0
            r14 = 2
            r1 = 1
            if (r0 == 0) goto L2a
            if (r0 == r1) goto L1f
            if (r0 != r14) goto L19
            a.z1x.P(r18)
            goto L9c
        L19:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            return r13
        L1f:
            java.lang.Object r0 = r10.k
            r11 = r0
            a.cgl r11 = (a.cgl) r11
            a.z1x.P(r18)
            r0 = r18
            goto L8f
        L2a:
            a.z1x.P(r18)
            a.p7m0 r0 = r11.y
            r0.getClass()
            a.qgl r2 = a.qgl.f28690a
            r0.o(r13, r2)
            a.gr00 r0 = r11.i
            r10.k = r11
            r10.j = r1
            java.lang.Object r1 = r0.d
            a.ztt r1 = (a.ztt) r1
            a.csr r3 = r1.a()
            java.lang.Object r1 = r0.f11760a
            a.rrc r1 = (a.rrc) r1
            java.lang.Object r2 = r0.c
            a.gmt r2 = (a.gmt) r2
            a.ql5 r4 = r2.a()
            if (r4 == 0) goto La5
            long r4 = r4.f28916a
            a.ql5 r2 = r2.a()
            if (r2 == 0) goto L9f
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
            java.lang.Object r0 = r1.b
            a.igl r0 = (a.igl) r0
            r1 = r4
            r4 = r6
            r6 = r8
            r8 = r15
            java.lang.Object r0 = r0.a(r1, r3, r4, r6, r8, r10)
            if (r0 != r12) goto L8f
            goto L9b
        L8f:
            a.vgl r0 = (a.vgl) r0
            r10.k = r13
            r10.j = r14
            java.lang.Object r0 = r11.A(r0, r10)
            if (r0 != r12) goto L9c
        L9b:
            return r12
        L9c:
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        L9f:
            a.ss3 r0 = new a.ss3
            r0.<init>()
            throw r0
        La5:
            a.ss3 r0 = new a.ss3
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fr9.G(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r0.e(r7) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r0.a(r7) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        if (r0.b(false, r7) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object H(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.l
            a.x3m r0 = (a.x3m) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r7.j
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L1f
            if (r2 == r6) goto L1b
            if (r2 == r5) goto L1b
            if (r2 != r4) goto L15
            goto L1b
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r3
        L1b:
            a.z1x.P(r8)
            goto L50
        L1f:
            a.z1x.P(r8)
            java.lang.Object r8 = r7.k
            a.lo8 r8 = (a.lo8) r8
            int r8 = r8.ordinal()
            if (r8 == 0) goto L46
            if (r8 == r6) goto L3d
            if (r8 != r5) goto L39
            r7.j = r5
            java.lang.Object r7 = r0.e(r7)
            if (r7 != r1) goto L50
            goto L4f
        L39:
            a.t9f.b()
            return r3
        L3d:
            r7.j = r6
            java.lang.Object r7 = r0.a(r7)
            if (r7 != r1) goto L50
            goto L4f
        L46:
            r7.j = r4
            r8 = 0
            java.lang.Object r7 = r0.b(r8, r7)
            if (r7 != r1) goto L50
        L4f:
            return r1
        L50:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fr9.H(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0074 A[PHI: r2
  0x0074: PHI (r2v4 a.cjn) = (r2v3 a.cjn), (r2v6 a.cjn) binds: [B:21:0x0071, B:11:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        if (r0.x(r2, r9) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object I(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.l
            a.kin r0 = (a.kin) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r9.j
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L31
            if (r2 == r7) goto L2d
            if (r2 == r6) goto L29
            if (r2 == r5) goto L21
            if (r2 != r4) goto L1b
            a.z1x.P(r10)
            goto L7f
        L1b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            return r3
        L21:
            java.lang.Object r2 = r9.k
            a.cjn r2 = (a.cjn) r2
            a.z1x.P(r10)
            goto L74
        L29:
            a.z1x.P(r10)
            goto L56
        L2d:
            a.z1x.P(r10)
            goto L47
        L31:
            a.z1x.P(r10)
            a.p7m0 r10 = r0.w
            r10.getClass()
            a.zin r2 = a.zin.f44448a
            r10.o(r3, r2)
            r9.j = r7
            java.lang.Object r10 = r0.C(r9)
            if (r10 != r1) goto L47
            goto L7e
        L47:
            a.ivn r10 = r0.k
            r9.j = r6
            java.lang.Object r10 = r10.f15453a
            a.ali r10 = (a.ali) r10
            java.lang.Object r10 = r10.e(r9)
            if (r10 != r1) goto L56
            goto L7e
        L56:
            r2 = r10
            a.cjn r2 = (a.cjn) r2
            a.qni0 r10 = r0.l
            double r6 = r2.c
            r10.a(r6)
            a.fq r10 = r0.h
            a.oy5 r6 = new a.oy5
            long r7 = r2.f4469a
            r6.<init>(r7)
            r9.k = r2
            r9.j = r5
            java.lang.Object r10 = r10.f(r6, r9)
            if (r10 != r1) goto L74
            goto L7e
        L74:
            r9.k = r3
            r9.j = r4
            java.lang.Object r9 = r0.x(r2, r9)
            if (r9 != r1) goto L7f
        L7e:
            return r1
        L7f:
            kotlin.Unit r9 = kotlin.Unit.f46060a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fr9.I(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        if (r1.y((a.cjn) r15, r13) == r0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object J(java.lang.Object r15) {
        /*
            r14 = this;
            a.wne r0 = a.wne.f39444a
            byte r1 = r14.j
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L20
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            a.z1x.P(r15)
            goto L7d
        L11:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r14)
            return r2
        L17:
            java.lang.Object r1 = r14.k
            a.kin r1 = (a.kin) r1
            a.z1x.P(r15)
            r13 = r14
            goto L70
        L20:
            a.z1x.P(r15)
            java.lang.Object r15 = r14.l
            r1 = r15
            a.kin r1 = (a.kin) r1
            a.mii0 r15 = r1.i
            r14.k = r1
            r14.j = r4
            java.lang.Object r4 = r15.e
            a.ztt r4 = (a.ztt) r4
            a.csr r8 = r4.a()
            java.lang.Object r4 = r15.b
            a.clc r4 = (a.clc) r4
            java.lang.Object r5 = r15.d
            a.gmt r5 = (a.gmt) r5
            a.ql5 r6 = r5.a()
            if (r6 == 0) goto L86
            long r6 = r6.f28916a
            a.ql5 r5 = r5.a()
            if (r5 == 0) goto L80
            long r9 = r5.f28916a
            a.bsr r5 = r8.f4905a
            a.esr r5 = r5.f3145a
            boolean r5 = r5.a()
            if (r5 == 0) goto L5b
            r11 = 0
            goto L63
        L5b:
            java.lang.Object r15 = r15.c
            a.itt r15 = (a.itt) r15
            double r11 = r15.a()
        L63:
            java.lang.Object r15 = r4.b
            r5 = r15
            a.ali r5 = (a.ali) r5
            r13 = r14
            java.lang.Object r15 = r5.b(r6, r8, r9, r11, r13)
            if (r15 != r0) goto L70
            goto L7c
        L70:
            a.cjn r15 = (a.cjn) r15
            r13.k = r2
            r13.j = r3
            java.lang.Object r14 = r1.y(r15, r13)
            if (r14 != r0) goto L7d
        L7c:
            return r0
        L7d:
            kotlin.Unit r14 = kotlin.Unit.f46060a
            return r14
        L80:
            a.ss3 r14 = new a.ss3
            r14.<init>()
            throw r14
        L86:
            a.ss3 r14 = new a.ss3
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fr9.J(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r7.a(r0, r6) == r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r7.a(r0, r6) == r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object K(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.l
            a.j7o r0 = (a.j7o) r0
            a.owr0 r0 = r0.f16051a
            java.lang.Object r1 = r6.k
            a.k9o r1 = (a.k9o) r1
            a.wne r2 = a.wne.f39444a
            byte r3 = r6.j
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L22
            if (r3 == r5) goto L1e
            if (r3 != r4) goto L17
            goto L1e
        L17:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            r6 = 0
            return r6
        L1e:
            a.z1x.P(r7)
            goto L49
        L22:
            a.z1x.P(r7)
            a.pru r7 = r1.q
            a.sff0 r7 = r7.a()
            boolean r7 = r7.O0
            if (r7 == 0) goto L3c
            a.qyg0 r7 = r1.y
            int r0 = r0.f25979a
            r6.j = r5
            java.lang.Object r6 = r7.a(r0, r6)
            if (r6 != r2) goto L49
            goto L48
        L3c:
            a.pyg0 r7 = r1.x
            int r0 = r0.f25979a
            r6.j = r4
            java.lang.Object r6 = r7.a(r0, r6)
            if (r6 != r2) goto L49
        L48:
            return r2
        L49:
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fr9.K(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0096 A[PHI: r1
  0x0096: PHI (r1v3 java.lang.Object) = (r1v2 java.lang.Object), (r1v7 java.lang.Object) binds: [B:25:0x0093, B:10:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x009c  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a7  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        if (r4 == r3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b1, code lost:
    
        if (r2.N(r1, r21) == r3) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object L(java.lang.Object r22) throws java.lang.Throwable {
        /*
            r21 = this;
            r0 = r21
            java.lang.Object r1 = r0.l
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.k
            a.gzo r2 = (a.gzo) r2
            a.wne r3 = a.wne.f39444a
            byte r4 = r0.j
            r5 = 3
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L31
            if (r4 == r7) goto L2b
            if (r4 == r6) goto L25
            if (r4 != r5) goto L1e
            a.z1x.P(r22)
            goto Lb4
        L1e:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            r0 = 0
            return r0
        L25:
            a.z1x.P(r22)
            r1 = r22
            goto L96
        L2b:
            a.z1x.P(r22)
            r4 = r22
            goto L69
        L31:
            a.z1x.P(r22)
            int r4 = a.gzo.H
            a.ocj r4 = r2.i
            a.p7m0 r4 = r4.f25029a
        L3a:
            java.lang.Object r8 = r4.getValue()
            r8.getClass()
            r9 = r8
            a.syo r9 = (a.syo) r9
            r19 = 0
            r20 = 2045(0x7fd, float:2.866E-42)
            r10 = 1
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            a.syo r9 = a.syo.a(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r8 = r4.m(r8, r9)
            if (r8 == 0) goto L3a
            if (r1 != 0) goto L7b
            r0.j = r7
            java.lang.Object r4 = r2.P(r0)
            if (r4 != r3) goto L69
            goto Lb3
        L69:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L74
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        L74:
            int r4 = a.gzo.H
            a.tyo r4 = a.tyo.f34765a
            r2.G(r4)
        L7b:
            java.lang.Object r4 = r2.D()
            a.syo r4 = (a.syo) r4
            java.lang.String r4 = r4.d
            java.lang.Object r7 = r2.D()
            a.syo r7 = (a.syo) r7
            java.lang.String r7 = r7.e
            a.lsn r8 = r2.q
            r0.j = r6
            java.lang.Object r1 = r8.c(r4, r7, r1, r0)
            if (r1 != r3) goto L96
            goto Lb3
        L96:
            a.oyo r1 = (a.oyo) r1
            java.lang.String r4 = r1.b
            if (r4 == 0) goto La7
            a.wyo r0 = new a.wyo
            r0.<init>(r4)
            int r1 = a.gzo.H
            r2.G(r0)
            goto Lb4
        La7:
            java.lang.String r1 = r1.f26066a
            r0.j = r5
            int r4 = a.gzo.H
            kotlin.Unit r0 = r2.N(r1, r0)
            if (r0 != r3) goto Lb4
        Lb3:
            return r3
        Lb4:
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fr9.L(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (r12 == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010d, code lost:
    
        if (r3.c(r12, r11) == r1) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object M(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fr9.M(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
    
        if (r8 == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object Q(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Object r0 = r8.l
            org.xplatform.favorites.impl.presentation.category.f r0 = (org.xplatform.favorites.impl.presentation.category.f) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r8.j
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L23
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            a.z1x.P(r9)
            goto L7f
        L15:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r5
        L1b:
            java.lang.Object r2 = r8.k
            java.util.List r2 = (java.util.List) r2
            a.z1x.P(r9)
            goto L3b
        L23:
            a.z1x.P(r9)
            a.luu r9 = r0.l
            a.nok0 r9 = r9.f20692a
            java.util.List r2 = r9.a()
            a.j3c r9 = r0.o
            r8.k = r2
            r8.j = r4
            java.lang.Object r9 = r9.c(r8)
            if (r9 != r1) goto L3b
            goto L7e
        L3b:
            a.wcb r9 = (a.wcb) r9
            a.zn00 r6 = r0.k
            a.n0o0 r7 = r0.s
            java.lang.Object r7 = r7.getValue()
            a.sff0 r7 = (a.sff0) r7
            boolean r7 = r7.J1
            a.p6d r6 = r6.M0(r7)
            a.d2c r7 = new a.d2c
            r7.<init>(r6, r0, r9, r2)
            a.qep r9 = new a.qep
            r9.<init>(r0, r5, r4)
            a.dnq r2 = new a.dnq
            r2.<init>(r7, r9, r4)
            a.sxk r9 = new a.sxk
            r4 = 17
            r9.<init>(r0, r5, r4)
            r8.k = r5
            r8.j = r3
            a.vnq r0 = new a.vnq
            a.h660 r4 = a.h660.f12515a
            r0.<init>(r4, r9, r3)
            java.lang.Object r8 = r2.c(r0, r8)
            if (r8 != r1) goto L75
            goto L77
        L75:
            kotlin.Unit r8 = kotlin.Unit.f46060a
        L77:
            if (r8 != r1) goto L7a
            goto L7c
        L7a:
            kotlin.Unit r8 = kotlin.Unit.f46060a
        L7c:
            if (r8 != r1) goto L7f
        L7e:
            return r1
        L7f:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fr9.Q(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        if (r9 == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object l(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.l
            a.j7g r0 = (a.j7g) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r9.j
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L23
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            a.z1x.P(r10)
            goto L6f
        L15:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            return r5
        L1b:
            java.lang.Object r2 = r9.k
            a.o4g r2 = (a.o4g) r2
            a.z1x.P(r10)
            goto L3d
        L23:
            a.z1x.P(r10)
            a.a7q r10 = r0.c
            java.lang.Object r10 = r10.f384a
            a.ul9 r10 = (a.ul9) r10
            a.o4g r2 = r10.b()
            a.h3c r10 = r0.e
            r9.k = r2
            r9.j = r4
            java.lang.Object r10 = r10.c(r2, r9)
            if (r10 != r1) goto L3d
            goto L6e
        L3d:
            java.util.List r10 = (java.util.List) r10
            a.p7m0 r6 = r0.l
            a.p7m0 r7 = r0.m
            a.i7g r8 = new a.i7g
            r8.<init>(r0, r10, r2, r5)
            r9.k = r5
            r9.j = r3
            a.gmq[] r10 = new a.gmq[r3]
            r0 = 0
            r10[r0] = r6
            r10[r4] = r7
            a.pul r0 = a.pul.j
            a.kh1 r2 = new a.kh1
            r3 = 9
            r2.<init>(r8, r5, r3)
            a.h660 r3 = a.h660.f12515a
            java.lang.Object r9 = a.tdc.G(r9, r3, r2, r0, r10)
            if (r9 != r1) goto L65
            goto L67
        L65:
            kotlin.Unit r9 = kotlin.Unit.f46060a
        L67:
            if (r9 != r1) goto L6a
            goto L6c
        L6a:
            kotlin.Unit r9 = kotlin.Unit.f46060a
        L6c:
            if (r9 != r1) goto L6f
        L6e:
            return r1
        L6f:
            kotlin.Unit r9 = kotlin.Unit.f46060a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fr9.l(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (r0.A(r11) == r1) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.l
            a.vqg r0 = (a.vqg) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r11.j
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L23
            if (r2 == r5) goto L1b
            if (r2 != r4) goto L15
            a.z1x.P(r12)
            goto L52
        L15:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r11)
            return r3
        L1b:
            java.lang.Object r2 = r11.k
            a.vqg r2 = (a.vqg) r2
            a.z1x.P(r12)
            goto L43
        L23:
            a.z1x.P(r12)
            a.pzu r6 = r0.h
            org.xplatform.cyber.cyberstatistic.api.navigation.CyberGameStatisticScreenParams r12 = r0.b
            long r7 = r12.b
            java.lang.String r9 = r12.f46490a
            r11.k = r0
            r11.j = r5
            r6.getClass()
            a.p4z r5 = new a.p4z
            r10 = 0
            r5.<init>(r6, r7, r9, r10)
            java.lang.Object r12 = a.d5c.J(r11, r5)
            if (r12 != r1) goto L42
            goto L51
        L42:
            r2 = r0
        L43:
            a.dqg r12 = (a.dqg) r12
            r2.E = r12
            r11.k = r3
            r11.j = r4
            java.lang.Object r11 = r0.A(r11)
            if (r11 != r1) goto L52
        L51:
            return r1
        L52:
            kotlin.Unit r11 = kotlin.Unit.f46060a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fr9.m(java.lang.Object):java.lang.Object");
    }

    private final Object o(Object obj) throws Throwable {
        u340 u340Var = (u340) this.l;
        ncj ncjVar = (ncj) this.k;
        wne wneVar = wne.f39444a;
        byte b = this.j;
        yje yjeVar = null;
        if (b == 0) {
            z1x.P(obj);
            g7m0 g7m0VarA = ncjVar.h.a();
            if (g7m0VarA instanceof naj) {
                Function2 function2 = u340Var.f34979a;
                CoroutineContext coroutineContext = u340Var.d;
                this.j = (byte) 1;
                Object objB = ncjVar.c().b(new am4(ncjVar, coroutineContext, function2, yjeVar, (byte) 3), this);
                if (objB != wneVar) {
                    return objB;
                }
            } else {
                if (!(g7m0VarA instanceof jae0) && !(g7m0VarA instanceof h7t0)) {
                    if (g7m0VarA instanceof hbq) {
                        throw ((hbq) g7m0VarA).b;
                    }
                    if (g7m0VarA instanceof l460) {
                        jf4.n("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        return null;
                    }
                    t9f.b();
                    return null;
                }
                if (g7m0VarA != u340Var.c) {
                    throw ((jae0) g7m0VarA).b;
                }
                this.j = (byte) 2;
                if (ncjVar.f(this) != wneVar) {
                }
            }
        }
        if (b == 1) {
            z1x.P(obj);
            return obj;
        }
        if (b != 2) {
            if (b == 3) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        Function2 function3 = u340Var.f34979a;
        CoroutineContext coroutineContext2 = u340Var.d;
        this.j = (byte) 3;
        Object objB2 = ncjVar.c().b(new am4(ncjVar, coroutineContext2, function3, yjeVar, (byte) 3), this);
        return objB2 == wneVar ? wneVar : objB2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (r0 == r3) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fr9.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r12 == r2) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fr9.s(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (a.qcc.O(2000, r9) == r4) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object t(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.l
            a.okk r0 = (a.okk) r0
            boolean r1 = r0.c
            java.lang.Object r2 = r9.k
            org.xplatform.cyber.game.universal.impl.presentation.dicepoker.DicePokerView r2 = (org.xplatform.cyber.game.universal.impl.presentation.dicepoker.DicePokerView) r2
            a.zkk r3 = r2.q
            a.wne r4 = a.wne.f39444a
            byte r5 = r9.j
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L27
            if (r5 == r7) goto L23
            if (r5 != r6) goto L1c
            a.z1x.P(r10)
            goto L58
        L1c:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            r9 = 0
            return r9
        L23:
            a.z1x.P(r10)
            goto L35
        L27:
            a.z1x.P(r10)
            r9.j = r7
            r7 = 5500(0x157c, double:2.7174E-320)
            java.lang.Object r10 = a.qcc.O(r7, r9)
            if (r10 != r4) goto L35
            goto L57
        L35:
            java.lang.Object r10 = r3.h
            android.widget.TextView r10 = (android.widget.TextView) r10
            java.lang.String r0 = r0.b
            r10.setText(r0)
            java.lang.Object r10 = r3.g
            org.xplatform.cyber.game.universal.impl.presentation.timerView.SyntheticTimerView r10 = (org.xplatform.cyber.game.universal.impl.presentation.timerView.SyntheticTimerView) r10
            if (r1 != 0) goto L46
            r0 = 0
            goto L48
        L46:
            r0 = 8
        L48:
            r10.setVisibility(r0)
            if (r1 == 0) goto L6a
            r9.j = r6
            r0 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r9 = a.qcc.O(r0, r9)
            if (r9 != r4) goto L58
        L57:
            return r4
        L58:
            java.lang.Object r9 = r3.h
            android.widget.TextView r9 = (android.widget.TextView) r9
            android.content.Context r10 = r2.getContext()
            r0 = 2131953952(0x7f130920, float:1.954439E38)
            java.lang.String r10 = r10.getString(r0)
            r9.setText(r10)
        L6a:
            kotlin.Unit r9 = kotlin.Unit.f46060a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fr9.t(java.lang.Object):java.lang.Object");
    }

    private final Object x(Object obj) {
        ArrayList arrayList;
        p7m0 p7m0Var;
        Object value;
        txk txkVar = (txk) this.l;
        kxk kxkVar = txkVar.b;
        wne wneVar = wne.f39444a;
        byte b = this.j;
        yje yjeVar = null;
        if (b != 0) {
            if (b == 1) {
                z1x.P(obj);
            } else {
                if (b != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                arrayList = (ArrayList) this.k;
                z1x.P(obj);
            }
            p7m0Var = txkVar.e;
            do {
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, oxk.a((oxk) value, dyb.o0(arrayList))));
            return Unit.f46060a;
        }
        z1x.P(obj);
        rpt rptVar = txkVar.c;
        int i = kxkVar.f19059a;
        this.j = (byte) 1;
        pmi pmiVar = (pmi) rptVar.f30901a;
        Object obj2 = ((iyk) pmiVar.c).f15593a.get(Integer.valueOf(i));
        if (obj2 == null) {
            obj2 = iun.f15405a;
        }
        List list = (List) obj2;
        if (list.isEmpty()) {
            obj = qjj.d0(((mne) pmiVar.e).b, new u52((Object) pmiVar, i, yjeVar, (byte) 7), this);
            if (obj != wneVar) {
                obj = (List) obj;
            }
        } else {
            obj = list;
        }
        if (obj != wneVar) {
        }
        return wneVar;
        List<xxk> list2 = (List) obj;
        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
        for (xxk xxkVar : list2) {
            int i2 = kxkVar.b;
            xxkVar.getClass();
            int i3 = xxkVar.f41662a;
            boolean z = i3 == i2;
            arrayList2.add(new PersonalDocumentRedesignUiModel(i3, xxkVar.b, z, z ? d4d.PRIMARY : d4d.TEXT_PRIMARY));
        }
        this.k = arrayList2;
        this.j = (byte) 2;
        if (qcc.O(500L, this) != wneVar) {
            arrayList = arrayList2;
            p7m0Var = txkVar.e;
            do {
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, oxk.a((oxk) value, dyb.o0(arrayList))));
            return Unit.f46060a;
        }
        return wneVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (r0.z(r2, r9) == r1) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object y(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.l
            a.cgl r0 = (a.cgl) r0
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
            a.vgl r2 = (a.vgl) r2
            a.z1x.P(r10)
            goto L67
        L26:
            a.z1x.P(r10)
            goto L49
        L2a:
            a.z1x.P(r10)
            r0.y()
            a.fhj r10 = r0.k
            r9.j = r6
            java.lang.Object r2 = r10.f9543a
            a.igl r2 = (a.igl) r2
            java.lang.Object r10 = r10.b
            a.y5s r10 = (a.y5s) r10
            a.s470 r10 = r10.f42064a
            long r6 = r10.a()
            java.lang.Object r10 = r2.b(r6, r9)
            if (r10 != r1) goto L49
            goto L71
        L49:
            r2 = r10
            a.vgl r2 = (a.vgl) r2
            a.qni0 r10 = r0.l
            double r6 = r2.c
            r10.a(r6)
            a.fq r10 = r0.h
            a.oy5 r6 = new a.oy5
            long r7 = r2.f37386a
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
        throw new UnsupportedOperationException("Method not decompiled: a.fr9.y(java.lang.Object):java.lang.Object");
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                return new fr9((mr9) obj2, yjeVar, (byte) 0);
            case 1:
                return new fr9((sp9) this.k, (or9) obj2, yjeVar, (byte) 1);
            case 2:
                return new fr9((at9) obj2, yjeVar, (byte) 2);
            case 3:
                return new fr9((List) this.k, (i9a) obj2, yjeVar, (byte) 3);
            case 4:
                fr9 fr9Var = new fr9((h2b) obj2, yjeVar, (byte) 4);
                fr9Var.k = obj;
                return fr9Var;
            case 5:
                return new fr9((y7b) this.k, (js20) obj2, yjeVar, (byte) 5);
            case 6:
                return new fr9((v7c) this.k, (String) obj2, yjeVar, (byte) 6);
            case 7:
                return new fr9((ywq0) obj2, yjeVar, (byte) 7);
            case 8:
                fr9 fr9Var2 = new fr9((r7f) obj2, yjeVar, (byte) 8);
                fr9Var2.k = obj;
                return fr9Var2;
            case 9:
                return new fr9((r7f) this.k, (String) obj2, yjeVar, (byte) 9);
            case 10:
                return new fr9((t33) this.k, (t33) obj2, yjeVar, (byte) 10);
            case 11:
                return new fr9((ouf) obj2, yjeVar, (byte) 11);
            case 12:
                return new fr9((bby) this.k, (fwf) obj2, yjeVar, (byte) 12);
            case 13:
                return new fr9((j7g) obj2, yjeVar, (byte) 13);
            case 14:
                return new fr9((vqg) obj2, yjeVar, (byte) 14);
            case 15:
                return new fr9((ncj) this.k, (u340) obj2, yjeVar, (byte) 15);
            case 16:
                return new fr9((p9k) obj2, yjeVar, (byte) 16);
            case 17:
                return new fr9((iak) obj2, yjeVar, (byte) 17);
            case 18:
                return new fr9((DicePokerView) this.k, (okk) obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new fr9((txk) obj2, yjeVar, (byte) 19);
            case 20:
                return new fr9((cgl) obj2, yjeVar, (byte) 20);
            case 21:
                return new fr9((cgl) obj2, yjeVar, (byte) 21);
            case 22:
                return new fr9((lo8) this.k, (x3m) obj2, yjeVar, (byte) 22);
            case 23:
                return new fr9((kin) obj2, yjeVar, (byte) 23);
            case 24:
                return new fr9((kin) obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new fr9((k9o) this.k, (j7o) obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new fr9((gzo) this.k, (String) obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                fr9 fr9Var3 = new fr9((ccp) obj2, yjeVar, (byte) 27);
                fr9Var3.k = obj;
                return fr9Var3;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new fr9((org.xplatform.favorites.impl.presentation.category.f) obj2, yjeVar, (byte) 28);
            default:
                return new fr9((eop) obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws dwq0, zhi0, j7t0 {
        switch (this.i) {
            case 0:
                return ((fr9) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((fr9) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((fr9) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((fr9) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((fr9) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((fr9) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((fr9) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((fr9) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((fr9) create((ql5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((fr9) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                ((fr9) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
                return wne.f39444a;
            case 11:
                return ((fr9) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                ((fr9) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
                return wne.f39444a;
            case 13:
                return ((fr9) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((fr9) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((fr9) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((fr9) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((fr9) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((fr9) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((fr9) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((fr9) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((fr9) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((fr9) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((fr9) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((fr9) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((fr9) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((fr9) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((fr9) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((fr9) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((fr9) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:111:0x01cb A[LOOP:0: B:109:0x01c5->B:111:0x01cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x0219  */
    /* JADX WARN: Code duplicated, block: B:115:0x021d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0223  */
    /* JADX WARN: Code duplicated, block: B:121:0x0249  */
    /* JADX WARN: Code duplicated, block: B:124:0x024e  */
    /* JADX WARN: Code duplicated, block: B:128:0x025f  */
    /* JADX WARN: Code duplicated, block: B:136:0x0283  */
    /* JADX WARN: Code duplicated, block: B:144:0x02bb A[PHI: r8
  0x02bb: PHI (r8v50 a.ghn) = (r8v43 a.ghn), (r8v52 a.ghn) binds: [B:139:0x0290, B:142:0x02b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:147:0x02c6 A[PHI: r8
  0x02c6: PHI (r8v49 a.ghn) = (r8v44 a.ghn), (r8v50 a.ghn) binds: [B:138:0x028b, B:145:0x02c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:150:0x02e5 A[PHI: r8
  0x02e5: PHI (r8v48 a.ghn) = (r8v45 a.ghn), (r8v49 a.ghn) binds: [B:137:0x0286, B:148:0x02e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:156:0x030a  */
    /* JADX WARN: Code duplicated, block: B:294:0x0629  */
    /* JADX WARN: Code duplicated, block: B:297:0x0631  */
    /* JADX WARN: Code duplicated, block: B:298:0x0635  */
    /* JADX WARN: Code duplicated, block: B:300:0x063d  */
    /* JADX WARN: Code duplicated, block: B:303:0x0646  */
    /* JADX WARN: Code duplicated, block: B:304:0x064a  */
    /* JADX WARN: Code duplicated, block: B:306:0x0652  */
    /* JADX WARN: Code duplicated, block: B:309:0x065a  */
    /* JADX WARN: Code duplicated, block: B:310:0x065e  */
    /* JADX WARN: Code duplicated, block: B:312:0x0662  */
    /* JADX WARN: Code duplicated, block: B:315:0x0689  */
    /* JADX WARN: Code duplicated, block: B:317:0x068d  */
    /* JADX WARN: Code duplicated, block: B:318:0x069d  */
    /* JADX WARN: Code duplicated, block: B:320:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:322:0x06ab  */
    /* JADX WARN: Code duplicated, block: B:325:0x06b9  */
    /* JADX WARN: Code duplicated, block: B:348:0x0768  */
    /* JADX WARN: Code duplicated, block: B:351:0x078a A[LOOP:5: B:349:0x0781->B:351:0x078a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:353:0x079d  */
    /* JADX WARN: Code duplicated, block: B:355:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:357:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:360:0x07d5 A[LOOP:6: B:358:0x07cc->B:360:0x07d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:362:0x07e8  */
    /* JADX WARN: Code duplicated, block: B:363:0x07ec  */
    /* JADX WARN: Code duplicated, block: B:365:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:539:0x0794 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:0x07df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0138  */
    /* JADX WARN: Code duplicated, block: B:83:0x0139 A[Catch: all -> 0x00f7, TryCatch #1 {all -> 0x00f7, blocks: (B:62:0x00f3, B:87:0x0148, B:80:0x0130, B:83:0x0139, B:67:0x00fd, B:68:0x0101, B:69:0x0109, B:76:0x0120, B:78:0x0129), top: B:533:0x00e9 }] */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0250, code lost:
    
        if (r2 == r1) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0323, code lost:
    
        if (a.t33.a((a.t33) r3, r1, r2, null, null, r43, 12) == r7) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x043f, code lost:
    
        if (r0.C(r1, r2.i, r2.f4585a, r2.b, r2.c, r2.d, r2.e, r2.g, (java.lang.String) r3, r13, r43) == r15) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
    
        if (r2.c(r3, r43) == r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x04ab, code lost:
    
        if (r3.z(r0, false, r43) == r1) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0521, code lost:
    
        if (r1 == r0) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0588, code lost:
    
        if (r6 == r9) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x05a4, code lost:
    
        if (r6 == r9) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x05e2, code lost:
    
        if (r0.M((a.owf0) r1, r2, r43) == r9) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x05f5, code lost:
    
        if (r0.K(r8, r43) == r9) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x060d, code lost:
    
        if (r6 == r9) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0803, code lost:
    
        if (r0 == r9) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x085b, code lost:
    
        if (r4.c(r2, r43) == r1) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0900, code lost:
    
        if (kotlin.Unit.f46060a == r1) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x0965, code lost:
    
        if (r0.join(r43) == r1) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0a7a, code lost:
    
        if (r0 == r1) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x0ab3, code lost:
    
        if (r0 == r1) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0144, code lost:
    
        if (a.qcc.O(500, r43) == r0) goto L85;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:157:0x0323 -> B:160:0x0327). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0144 -> B:87:0x0148). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r44) throws a.dwq0, a.zhi0, a.j7t0 {
        /*
            Method dump skipped, instruction units count: 3032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fr9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fr9(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
    }
}

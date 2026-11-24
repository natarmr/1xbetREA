package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class xb2 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb2(lpj0 lpj0Var, gmq gmqVar, mz40 mz40Var, Object obj, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 25;
        this.k = lpj0Var;
        this.m = gmqVar;
        this.n = mz40Var;
        this.l = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r2.c(r3, r8) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (r2.c(r3, r8) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        if (a.slb.O(r9, r1, r8) == r0) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object G(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.m
            r2 = r0
            a.gmq r2 = (a.gmq) r2
            java.lang.Object r0 = r8.n
            r3 = r0
            a.mz40 r3 = (a.mz40) r3
            a.wne r0 = a.wne.f39444a
            byte r1 = r8.j
            r7 = 4
            r4 = 3
            r5 = 1
            r6 = 2
            if (r1 == 0) goto L2c
            if (r1 == r5) goto L28
            if (r1 == r6) goto L24
            if (r1 == r4) goto L28
            if (r1 != r7) goto L1d
            goto L28
        L1d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            r8 = 0
            return r8
        L24:
            a.z1x.P(r9)
            goto L5a
        L28:
            a.z1x.P(r9)
            goto L83
        L2c:
            a.z1x.P(r9)
            java.lang.Object r9 = r8.k
            a.lpj0 r9 = (a.lpj0) r9
            a.j6m0 r1 = a.kpj0.f18679a
            if (r9 != r1) goto L40
            r8.j = r5
            java.lang.Object r8 = r2.c(r3, r8)
            if (r8 != r0) goto L83
            goto L82
        L40:
            a.m6m0 r1 = a.kpj0.b
            r5 = 0
            if (r9 != r1) goto L63
            r9 = r3
            a.e5 r9 = (a.e5) r9
            a.w6n0 r9 = r9.l()
            a.loq r1 = new a.loq
            r1.<init>(r6, r5)
            r8.j = r6
            java.lang.Object r9 = a.ntb.L(r9, r1, r8)
            if (r9 != r0) goto L5a
            goto L82
        L5a:
            r8.j = r4
            java.lang.Object r8 = r2.c(r3, r8)
            if (r8 != r0) goto L83
            goto L82
        L63:
            r1 = r3
            a.e5 r1 = (a.e5) r1
            a.w6n0 r1 = r1.l()
            a.gmq r9 = r9.b(r1)
            a.gmq r9 = a.i120.W(r9)
            a.wmq r1 = new a.wmq
            java.lang.Object r4 = r8.l
            r6 = 2
            r1.<init>(r2, r3, r4, r5, r6)
            r8.j = r7
            java.lang.Object r8 = a.slb.O(r9, r1, r8)
            if (r8 != r0) goto L83
        L82:
            return r0
        L83:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xb2.G(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if (r6.o(r3, (a.o3w0) r8, r7) == r2) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object H(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.n
            a.l9s r0 = (a.l9s) r0
            java.lang.Object r1 = r7.m
            a.spr r1 = (a.spr) r1
            a.wne r2 = a.wne.f39444a
            byte r3 = r7.j
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L2b
            if (r3 == r6) goto L1f
            if (r3 != r5) goto L19
            a.z1x.P(r8)
            goto L51
        L19:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r4
        L1f:
            java.lang.Object r3 = r7.l
            a.l9s r3 = (a.l9s) r3
            java.lang.Object r6 = r7.k
            a.pwi r6 = (a.pwi) r6
            a.z1x.P(r8)
            goto L42
        L2b:
            a.z1x.P(r8)
            a.pwi r8 = r1.H
            a.owp0 r3 = r1.I
            r7.k = r8
            r7.l = r0
            r7.j = r6
            java.lang.Object r3 = r3.e(r7)
            if (r3 != r2) goto L3f
            goto L50
        L3f:
            r6 = r8
            r8 = r3
            r3 = r0
        L42:
            a.o3w0 r8 = (a.o3w0) r8
            r7.k = r4
            r7.l = r4
            r7.j = r5
            java.lang.Object r7 = r6.o(r3, r8, r7)
            if (r7 != r2) goto L51
        L50:
            return r2
        L51:
            int r7 = a.spr.j0
            r1.N(r0)
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xb2.H(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if (r8.G(r2, (a.o3w0) r14, r13) == r1) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object I(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xb2.I(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b4, code lost:
    
        if (r0.y(r1, r3, r5, r12, r9) == r10) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object J(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xb2.J(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
    
        if (a.t33.a(r0, r1, r2, null, null, r12, 12) == r8) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object l(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.k
            r7 = r0
            a.mmo r7 = (a.mmo) r7
            java.lang.Object r0 = r12.m
            a.pz40 r0 = (a.pz40) r0
            a.wne r8 = a.wne.f39444a
            byte r1 = r12.j
            r9 = 0
            r10 = 100
            r2 = 1
            r11 = 2
            if (r1 == 0) goto L28
            if (r1 == r2) goto L24
            if (r1 != r11) goto L1d
            a.z1x.P(r13)
            goto L91
        L1d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            r0 = 0
            return r0
        L24:
            a.z1x.P(r13)
            goto L62
        L28:
            a.z1x.P(r13)
            java.lang.Object r1 = r0.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            boolean r3 = r7.c
            if (r1 != r3) goto L3c
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        L3c:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r0.setValue(r1)
            java.lang.Object r0 = r12.l
            a.t33 r0 = (a.t33) r0
            java.lang.Float r1 = new java.lang.Float
            r3 = 0
            r1.<init>(r3)
            a.zsf r3 = a.ihn.f14788a
            a.uts0 r3 = a.ro4.m0(r10, r9, r3, r11)
            r12.j = r2
            r2 = r3
            r3 = 0
            r4 = 0
            r6 = 12
            r5 = r12
            java.lang.Object r0 = a.t33.a(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r8) goto L62
            goto L90
        L62:
            java.lang.Object r0 = r12.n
            a.pz40 r0 = (a.pz40) r0
            boolean r1 = r7.c
            if (r1 == 0) goto L6d
            java.lang.String r1 = r7.b
            goto L6f
        L6d:
            java.lang.String r1 = r7.f22049a
        L6f:
            r0.setValue(r1)
            java.lang.Object r0 = r12.l
            a.t33 r0 = (a.t33) r0
            java.lang.Float r1 = new java.lang.Float
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r2)
            a.zsf r2 = a.ihn.f14788a
            a.uts0 r2 = a.ro4.m0(r10, r9, r2, r11)
            r12.j = r11
            r3 = 0
            r4 = 0
            r6 = 12
            r5 = r12
            java.lang.Object r0 = a.t33.a(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r8) goto L91
        L90:
            return r8
        L91:
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xb2.l(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
    
        if (a.t33.a(r0, r1, r2, null, null, r12, 12) == r8) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.k
            r7 = r0
            a.imo r7 = (a.imo) r7
            java.lang.Object r0 = r12.m
            a.pz40 r0 = (a.pz40) r0
            a.wne r8 = a.wne.f39444a
            byte r1 = r12.j
            r9 = 0
            r10 = 100
            r2 = 1
            r11 = 2
            if (r1 == 0) goto L28
            if (r1 == r2) goto L24
            if (r1 != r11) goto L1d
            a.z1x.P(r13)
            goto L91
        L1d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            r0 = 0
            return r0
        L24:
            a.z1x.P(r13)
            goto L62
        L28:
            a.z1x.P(r13)
            java.lang.Object r1 = r0.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            boolean r3 = r7.c
            if (r1 != r3) goto L3c
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        L3c:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r0.setValue(r1)
            java.lang.Object r0 = r12.l
            a.t33 r0 = (a.t33) r0
            java.lang.Float r1 = new java.lang.Float
            r3 = 0
            r1.<init>(r3)
            a.zsf r3 = a.ihn.f14788a
            a.uts0 r3 = a.ro4.m0(r10, r9, r3, r11)
            r12.j = r2
            r2 = r3
            r3 = 0
            r4 = 0
            r6 = 12
            r5 = r12
            java.lang.Object r0 = a.t33.a(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r8) goto L62
            goto L90
        L62:
            java.lang.Object r0 = r12.n
            a.pz40 r0 = (a.pz40) r0
            boolean r1 = r7.c
            if (r1 == 0) goto L6d
            java.lang.String r1 = r7.b
            goto L6f
        L6d:
            java.lang.String r1 = r7.f15036a
        L6f:
            r0.setValue(r1)
            java.lang.Object r0 = r12.l
            a.t33 r0 = (a.t33) r0
            java.lang.Float r1 = new java.lang.Float
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r2)
            a.zsf r2 = a.ihn.f14788a
            a.uts0 r2 = a.ro4.m0(r10, r9, r2, r11)
            r12.j = r11
            r3 = 0
            r4 = 0
            r6 = 12
            r5 = r12
            java.lang.Object r0 = a.t33.a(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r8) goto L91
        L90:
            return r8
        L91:
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xb2.m(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (r0.a((a.x9l) r12, r11) == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.l
            a.kmq r0 = (a.kmq) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r11.j
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L20
            if (r2 == r4) goto L1c
            if (r2 != r3) goto L15
            a.z1x.P(r12)
            goto L53
        L15:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r11)
            r11 = 0
            return r11
        L1c:
            a.z1x.P(r12)
            goto L46
        L20:
            a.z1x.P(r12)
            java.lang.Object r12 = r11.k
            r7 = r12
            a.ali r7 = (a.ali) r7
            java.lang.Object r12 = r11.m
            r6 = r12
            a.m9s r6 = (a.m9s) r6
            java.lang.Object r12 = r11.n
            r8 = r12
            java.lang.String r8 = (java.lang.String) r8
            r11.l = r0
            r11.j = r4
            r7.getClass()
            a.lpp r5 = new a.lpp
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Object r12 = a.d5c.J(r11, r5)
            if (r12 != r1) goto L46
            goto L52
        L46:
            a.x9l r12 = (a.x9l) r12
            r11.l = r9
            r11.j = r3
            java.lang.Object r11 = r0.a(r12, r11)
            if (r11 != r1) goto L53
        L52:
            return r1
        L53:
            kotlin.Unit r11 = kotlin.Unit.f46060a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xb2.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r0.a(r7, r6) == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.l
            a.kmq r0 = (a.kmq) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r6.j
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L23
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            a.z1x.P(r7)
            goto L50
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r5
        L1b:
            java.lang.Object r0 = r6.k
            a.kmq r0 = (a.kmq) r0
            a.z1x.P(r7)
            goto L43
        L23:
            a.z1x.P(r7)
            java.lang.Object r7 = r6.m
            a.ali r7 = (a.ali) r7
            java.lang.Object r7 = r7.f1068a
            a.reu r7 = (a.reu) r7
            java.lang.Object r2 = r6.n
            java.lang.String r2 = (java.lang.String) r2
            r6.l = r5
            r6.k = r0
            r6.j = r4
            java.lang.Object r7 = r7.b
            a.njg r7 = (a.njg) r7
            java.lang.Object r7 = r7.a(r2, r6)
            if (r7 != r1) goto L43
            goto L4f
        L43:
            r6.l = r5
            r6.k = r5
            r6.j = r3
            java.lang.Object r6 = r0.a(r7, r6)
            if (r6 != r1) goto L50
        L4f:
            return r1
        L50:
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xb2.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r0.a(r7, r6) == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.l
            a.kmq r0 = (a.kmq) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r6.j
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L23
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            a.z1x.P(r7)
            goto L52
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r5
        L1b:
            java.lang.Object r0 = r6.k
            a.kmq r0 = (a.kmq) r0
            a.z1x.P(r7)
            goto L45
        L23:
            a.z1x.P(r7)
            java.lang.Object r7 = r6.m
            a.pmi r7 = (a.pmi) r7
            java.lang.Object r7 = r7.c
            a.reu r7 = (a.reu) r7
            java.lang.Object r2 = r6.n
            a.bqp r2 = (a.bqp) r2
            java.lang.String r2 = r2.f3043a
            r6.l = r5
            r6.k = r0
            r6.j = r4
            java.lang.Object r7 = r7.b
            a.njg r7 = (a.njg) r7
            java.lang.Object r7 = r7.a(r2, r6)
            if (r7 != r1) goto L45
            goto L51
        L45:
            r6.l = r5
            r6.k = r5
            r6.j = r3
            java.lang.Object r6 = r0.a(r7, r6)
            if (r6 != r1) goto L52
        L51:
            return r1
        L52:
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xb2.s(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r0.a(r7, r6) == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object t(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.l
            a.kmq r0 = (a.kmq) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r6.j
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L23
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            a.z1x.P(r7)
            goto L50
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r5
        L1b:
            java.lang.Object r0 = r6.k
            a.kmq r0 = (a.kmq) r0
            a.z1x.P(r7)
            goto L43
        L23:
            a.z1x.P(r7)
            java.lang.Object r7 = r6.m
            a.kki r7 = (a.kki) r7
            java.lang.Object r7 = r7.e
            a.reu r7 = (a.reu) r7
            java.lang.Object r2 = r6.n
            java.lang.String r2 = (java.lang.String) r2
            r6.l = r5
            r6.k = r0
            r6.j = r4
            java.lang.Object r7 = r7.b
            a.njg r7 = (a.njg) r7
            java.lang.Object r7 = r7.a(r2, r6)
            if (r7 != r1) goto L43
            goto L4f
        L43:
            r6.l = r5
            r6.k = r5
            r6.j = r3
            java.lang.Object r6 = r0.a(r7, r6)
            if (r6 != r1) goto L50
        L4f:
            return r1
        L50:
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xb2.t(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r0.a(r7, r6) == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object x(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.l
            a.kmq r0 = (a.kmq) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r6.j
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L23
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            a.z1x.P(r7)
            goto L50
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r5
        L1b:
            java.lang.Object r0 = r6.k
            a.kmq r0 = (a.kmq) r0
            a.z1x.P(r7)
            goto L43
        L23:
            a.z1x.P(r7)
            java.lang.Object r7 = r6.m
            a.ali r7 = (a.ali) r7
            java.lang.Object r7 = r7.f1068a
            a.reu r7 = (a.reu) r7
            java.lang.Object r2 = r6.n
            java.lang.String r2 = (java.lang.String) r2
            r6.l = r5
            r6.k = r0
            r6.j = r4
            java.lang.Object r7 = r7.b
            a.njg r7 = (a.njg) r7
            java.lang.Object r7 = r7.a(r2, r6)
            if (r7 != r1) goto L43
            goto L4f
        L43:
            r6.l = r5
            r6.k = r5
            r6.j = r3
            java.lang.Object r6 = r0.a(r7, r6)
            if (r6 != r1) goto L50
        L4f:
            return r1
        L50:
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xb2.x(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        if (r9.c(r5, r8) == r0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object y(java.lang.Object r9) {
        /*
            r8 = this;
            a.wne r0 = a.wne.f39444a
            byte r1 = r8.j
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            a.z1x.P(r9)
            goto L5b
        L11:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r2
        L17:
            java.lang.Object r1 = r8.k
            a.mie0 r1 = (a.mie0) r1
            java.lang.Object r4 = r8.l
            a.kmq r4 = (a.kmq) r4
            a.z1x.P(r9)
            goto L3f
        L23:
            a.z1x.P(r9)
            java.lang.Object r9 = r8.l
            a.kmq r9 = (a.kmq) r9
            a.mie0 r1 = new a.mie0
            r1.<init>()
            r1.f21842a = r2
            r8.l = r9
            r8.k = r1
            r8.j = r4
            java.lang.Object r4 = r9.a(r2, r8)
            if (r4 != r0) goto L3e
            goto L5a
        L3e:
            r4 = r9
        L3f:
            java.lang.Object r9 = r8.m
            a.fnq r9 = (a.fnq) r9
            a.yj2 r5 = new a.yj2
            java.lang.Object r6 = r8.n
            a.zg2 r6 = (a.zg2) r6
            r7 = 13
            r5.<init>(r1, r6, r4, r7)
            r8.l = r2
            r8.k = r2
            r8.j = r3
            java.lang.Object r8 = r9.c(r5, r8)
            if (r8 != r0) goto L5b
        L5a:
            return r0
        L5b:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xb2.y(java.lang.Object):java.lang.Object");
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                xb2 xb2Var = new xb2(this.m, this.n, yjeVar, (byte) 0);
                xb2Var.l = obj;
                return xb2Var;
            case 1:
                return new xb2((yn2) this.k, (a570) this.l, (String) this.m, (String) this.n, yjeVar, (byte) 1);
            case 2:
                xb2 xb2Var2 = new xb2(this.m, this.n, yjeVar, (byte) 2);
                xb2Var2.l = obj;
                return xb2Var2;
            case 3:
                return new xb2(this.m, this.n, yjeVar, (byte) 3);
            case 4:
                return new xb2(this.m, this.n, yjeVar, (byte) 4);
            case 5:
                return new xb2(this.m, this.n, yjeVar, (byte) 5);
            case 6:
                return new xb2(this.m, this.n, yjeVar, (byte) 6);
            case 7:
                return new xb2(this.m, this.n, yjeVar, (byte) 7);
            case 8:
                return new xb2(this.l, this.m, this.n, yjeVar, (byte) 8);
            case 9:
                return new xb2(yjeVar, (g9a) this.k, (ArrayList) this.l, (ArrayList) this.m);
            case 10:
                return new xb2(this.l, this.m, this.n, yjeVar, (byte) 10);
            case 11:
                return new xb2(this.m, this.n, yjeVar, (byte) 11);
            case 12:
                return new xb2(this.l, this.m, this.n, yjeVar, (byte) 12);
            case 13:
                return new xb2((l7m0) this.k, (xcz) this.l, (pz40) this.m, (Function1) this.n, yjeVar, (byte) 13);
            case 14:
                return new xb2(this.l, this.m, this.n, yjeVar, (byte) 14);
            case 15:
                xb2 xb2Var3 = new xb2((hel) this.n, yjeVar);
                xb2Var3.l = obj;
                return xb2Var3;
            case 16:
                return new xb2((imo) this.k, (t33) this.l, (pz40) this.m, (pz40) this.n, yjeVar, (byte) 16);
            case 17:
                return new xb2((mmo) this.k, (t33) this.l, (pz40) this.m, (pz40) this.n, yjeVar, (byte) 17);
            case 18:
                xb2 xb2Var4 = new xb2(this.k, this.m, (String) this.n, yjeVar, (byte) 18);
                xb2Var4.l = obj;
                return xb2Var4;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                xb2 xb2Var5 = new xb2(this.k, this.m, (String) this.n, yjeVar, (byte) 19);
                xb2Var5.l = obj;
                return xb2Var5;
            case 20:
                xb2 xb2Var6 = new xb2(this.m, this.n, yjeVar, (byte) 20);
                xb2Var6.l = obj;
                return xb2Var6;
            case 21:
                xb2 xb2Var7 = new xb2(this.m, this.n, yjeVar, (byte) 21);
                xb2Var7.l = obj;
                return xb2Var7;
            case 22:
                xb2 xb2Var8 = new xb2(this.m, this.n, yjeVar, (byte) 22);
                xb2Var8.l = obj;
                return xb2Var8;
            case 23:
                xb2 xb2Var9 = new xb2(this.m, this.n, yjeVar, (byte) 23);
                xb2Var9.l = obj;
                return xb2Var9;
            case 24:
                xb2 xb2Var10 = new xb2(this.m, this.n, yjeVar, (byte) 24);
                xb2Var10.l = obj;
                return xb2Var10;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new xb2((lpj0) this.k, (gmq) this.m, (mz40) this.n, this.l, yjeVar);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new xb2(this.m, this.n, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new xb2(this.m, this.n, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new xb2(this.l, this.m, this.n, yjeVar, (byte) 28);
            default:
                return new xb2((xcz) this.k, (pz40) this.l, (pz40) this.m, (Function1) this.n, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((xb2) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((xb2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((xb2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((xb2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((xb2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((xb2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((xb2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((xb2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((xb2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((xb2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((xb2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((xb2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((xb2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((xb2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((xb2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((xb2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((xb2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((xb2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((xb2) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((xb2) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((xb2) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((xb2) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((xb2) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((xb2) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((xb2) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((xb2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((xb2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((xb2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((xb2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((xb2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0201 A[Catch: CancellationException -> 0x01ff, TryCatch #0 {CancellationException -> 0x01ff, blocks: (B:102:0x01ea, B:104:0x01f0, B:108:0x0201, B:110:0x0205), top: B:512:0x01ea }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0205 A[Catch: CancellationException -> 0x01ff, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x01ff, blocks: (B:102:0x01ea, B:104:0x01f0, B:108:0x0201, B:110:0x0205), top: B:512:0x01ea }] */
    /* JADX WARN: Code duplicated, block: B:145:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:150:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:191:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:194:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:272:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:328:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:332:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:358:0x0784  */
    /* JADX WARN: Code duplicated, block: B:388:0x085a  */
    /* JADX WARN: Code duplicated, block: B:529:0x06f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:531:0x06e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0167 A[PHI: r4 r7
  0x0167: PHI (r4v88 a.mie0) = (r4v80 a.mie0), (r4v96 a.mie0) binds: [B:76:0x0164, B:100:0x01e7] A[DONT_GENERATE, DONT_INLINE]
  0x0167: PHI (r7v41 a.vne) = (r7v38 a.vne), (r7v43 a.vne) binds: [B:76:0x0164, B:100:0x01e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x0196 A[PHI: r8
  0x0196: PHI (r8v37 a.vne) = (r8v31 a.vne), (r8v31 a.vne), (r8v31 a.vne), (r8v35 a.vne), (r8v40 a.vne) binds: [B:109:0x0203, B:111:0x0210, B:105:0x01fc, B:116:0x0221, B:82:0x0195] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x019c  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x01fc -> B:83:0x0196). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0203 -> B:83:0x0196). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x0210 -> B:83:0x0196). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x021d -> B:82:0x0195). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x0221 -> B:83:0x0196). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r47) {
        /*
            Method dump skipped, instruction units count: 3082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xb2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb2(hel helVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 15;
        this.n = helVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb2(yje yjeVar, g9a g9aVar, ArrayList arrayList, ArrayList arrayList2) {
        super(2, yjeVar);
        this.i = (byte) 9;
        this.k = g9aVar;
        this.l = arrayList;
        this.m = arrayList2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xb2(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
        this.n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xb2(Object obj, Object obj2, Object obj3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xb2(Object obj, Object obj2, Object obj3, Object obj4, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
        this.n = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xb2(Object obj, Object obj2, String str, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.m = obj2;
        this.n = str;
    }
}

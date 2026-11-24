package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xplatform.bethistory.sale.presentation.SaleDataModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.BonusStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.CitizenshipStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.CityStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.CountryStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.CurrencyStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.DocumentStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.PhoneStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.RegionStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.SocialStateModel;

/* JADX INFO: loaded from: classes5.dex */
public final class zye0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public Object k;
    public Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zye0(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if (a.qjj.d0(r14, r15, r11) == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object G(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.k
            r1 = r0
            a.cxg0 r1 = (a.cxg0) r1
            a.wne r0 = a.wne.f39444a
            byte r2 = r14.j
            r12 = 0
            r13 = 2
            r3 = 1
            if (r2 == 0) goto L21
            if (r2 == r3) goto L1c
            if (r2 != r13) goto L16
            a.z1x.P(r15)
            goto L55
        L16:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r14)
            return r12
        L1c:
            a.z1x.P(r15)
            r11 = r14
            goto L3d
        L21:
            a.z1x.P(r15)
            java.lang.Object r15 = r14.l
            r2 = r15
            java.lang.String r2 = (java.lang.String) r2
            org.xplatform.bethistory.sale.presentation.SaleDataModel r15 = r1.r
            double r5 = r15.c
            long r9 = r1.n
            r14.j = r3
            r3 = 0
            r7 = 0
            r11 = r14
            java.lang.Object r14 = r1.E(r2, r3, r5, r7, r9, r11)
            if (r14 != r0) goto L3d
            goto L54
        L3d:
            a.mne r14 = r1.g
            a.vs10 r14 = r14.c
            a.tye0 r15 = new a.tye0
            java.lang.Object r2 = r11.l
            java.lang.String r2 = (java.lang.String) r2
            r3 = 19
            r15.<init>(r1, r2, r12, r3)
            r11.j = r13
            java.lang.Object r14 = a.qjj.d0(r14, r15, r11)
            if (r14 != r0) goto L55
        L54:
            return r0
        L55:
            kotlin.Unit r14 = kotlin.Unit.f46060a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zye0.G(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (a.qjj.d0(r1, r2, r16) == r12) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object H(java.lang.Object r17) {
        /*
            r16 = this;
            r10 = r16
            java.lang.Object r0 = r10.k
            a.cxg0 r0 = (a.cxg0) r0
            java.lang.Object r1 = r10.l
            r11 = r1
            org.xplatform.bethistory.sale.presentation.SaleDataModel r11 = (org.xplatform.bethistory.sale.presentation.SaleDataModel) r11
            a.wne r12 = a.wne.f39444a
            byte r1 = r10.j
            r13 = 0
            r14 = 2
            r2 = 1
            if (r1 == 0) goto L26
            if (r1 == r2) goto L22
            if (r1 != r14) goto L1c
            a.z1x.P(r17)
            goto L5e
        L1c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            return r13
        L22:
            a.z1x.P(r17)
            goto L49
        L26:
            a.z1x.P(r17)
            a.n3w r1 = r0.l
            java.lang.String r1 = r1.f22868a
            double r3 = r11.l
            r6 = r3
            double r4 = r11.e
            boolean r3 = r0.m
            if (r3 == 0) goto L39
            double r8 = r11.h
            goto L3b
        L39:
            r8 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L3b:
            long r14 = r0.n
            r10.j = r2
            r2 = r6
            r6 = r8
            r8 = r14
            java.lang.Object r1 = r0.E(r1, r2, r4, r6, r8, r10)
            if (r1 != r12) goto L49
            goto L5d
        L49:
            a.mne r1 = r0.g
            a.vs10 r1 = r1.c
            a.tye0 r2 = new a.tye0
            r3 = 20
            r2.<init>(r0, r11, r13, r3)
            r0 = 2
            r10.j = r0
            java.lang.Object r0 = a.qjj.d0(r1, r2, r10)
            if (r0 != r12) goto L5e
        L5d:
            return r12
        L5e:
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zye0.H(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0076  */
    /* JADX WARN: Code duplicated, block: B:21:0x0081  */
    /* JADX WARN: Code duplicated, block: B:25:0x009c  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d8  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (r0 == r15) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ec, code lost:
    
        if (a.qjj.d0(r0, r2, r20) == r15) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object I(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zye0.I(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        if (r13.f(a.my5.f22588a, r10) == r1) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object J(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.l
            a.w6h0 r0 = (a.w6h0) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r12.j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L24
            if (r2 == r4) goto L1f
            if (r2 != r3) goto L18
            java.lang.Object r12 = r12.k
            a.c7h0 r12 = (a.c7h0) r12
            a.z1x.P(r13)
            goto L7f
        L18:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r12)
            r12 = 0
            return r12
        L1f:
            a.z1x.P(r13)
            r10 = r12
            goto L53
        L24:
            a.z1x.P(r13)
            a.q6h0 r13 = new a.q6h0
            r13.<init>(r4)
            r0.x(r13)
            a.ix90 r13 = r0.e
            r12.j = r4
            a.f7h0 r5 = r13.f15531a
            a.gmt r2 = r13.d
            a.ql5 r2 = r2.a()
            if (r2 == 0) goto L8f
            long r8 = r2.f28916a
            a.itt r2 = r13.c
            double r6 = r2.a()
            a.ztt r13 = r13.b
            a.csr r11 = r13.a()
            r10 = r12
            java.lang.Object r13 = r5.a(r6, r8, r10, r11)
            if (r13 != r1) goto L53
            goto L7e
        L53:
            r12 = r13
            a.c7h0 r12 = (a.c7h0) r12
            a.q6h0 r13 = new a.q6h0
            r2 = 0
            r13.<init>(r2)
            r0.x(r13)
            a.noi0 r13 = r0.i
            r13.getClass()
            r12.getClass()
            a.f7h0 r13 = r13.f23868a
            a.b7h0 r13 = r13.c
            r13.getClass()
            r13.f2109a = r12
            a.fq r13 = r0.b
            r10.k = r12
            r10.j = r3
            a.my5 r2 = a.my5.f22588a
            java.lang.Object r13 = r13.f(r2, r10)
            if (r13 != r1) goto L7f
        L7e:
            return r1
        L7f:
            a.n6h0 r13 = new a.n6h0
            r13.<init>(r12)
            r0.x(r13)
            a.m6h0 r12 = a.m6h0.f21271a
            r0.x(r12)
            kotlin.Unit r12 = kotlin.Unit.f46060a
            return r12
        L8f:
            a.ss3 r12 = new a.ss3
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zye0.J(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if (r0.l(0, 0, r6) == r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        if (r0.f(0, 0, r6) == r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object K(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.l
            a.xcz r0 = (a.xcz) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r6.j
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L1b
            if (r2 == r5) goto L11
            if (r2 != r4) goto L15
        L11:
            a.z1x.P(r7)
            goto L47
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L1b:
            a.z1x.P(r7)
            java.lang.Object r7 = r6.k
            a.sah0 r7 = (a.sah0) r7
            int r7 = r7.ordinal()
            if (r7 == 0) goto L47
            r2 = 0
            if (r7 == r5) goto L3c
            if (r7 != r4) goto L38
            r6.j = r4
            a.v0h0 r7 = a.xcz.y
            java.lang.Object r6 = r0.l(r2, r2, r6)
            if (r6 != r1) goto L47
            goto L46
        L38:
            a.t9f.b()
            return r3
        L3c:
            r6.j = r5
            a.v0h0 r7 = a.xcz.y
            java.lang.Object r6 = r0.f(r2, r2, r6)
            if (r6 != r1) goto L47
        L46:
            return r1
        L47:
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zye0.K(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
    
        if (a.slb.N(r0, r8) == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object L(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.k
            a.iph0 r0 = (a.iph0) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r8.j
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L1f
            if (r2 == r5) goto L1b
            if (r2 != r3) goto L15
            a.z1x.P(r9)
            goto L7e
        L15:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r4
        L1b:
            a.z1x.P(r9)
            goto L35
        L1f:
            a.z1x.P(r9)
            java.lang.Object r9 = r8.l
            a.noh0 r9 = (a.noh0) r9
            r2 = 0
            r0.y(r9, r2)
            a.rou r9 = r0.j
            r8.j = r5
            java.lang.Object r9 = r9.a(r5, r8)
            if (r9 != r1) goto L35
            goto L7d
        L35:
            a.m2c0 r9 = (a.m2c0) r9
            boolean r2 = r9.N
            r2 = r2 ^ r5
            a.vd1 r6 = r0.l
            r6.a(r2)
            a.zlt0 r6 = r0.f
            java.lang.Object r6 = r6.b
            a.vlk r6 = (a.vlk) r6
            a.vwb0 r6 = r6.f37628a
            java.lang.String r7 = "restrictEmail"
            r6.e(r7, r2)
            a.p6a r2 = new a.p6a
            long r6 = r9.S
            java.lang.String r9 = java.lang.String.valueOf(r6)
            r6 = 6
            r2.<init>(r9, r6)
            a.cyh r9 = r0.e
            a.p5a r9 = r9.a(r2)
            a.eph0 r2 = new a.eph0
            r2.<init>(r0, r4, r5)
            a.fnq r6 = new a.fnq
            r7 = 4
            r6.<init>(r9, r2, r7)
            a.jgb0 r9 = new a.jgb0
            r2 = 11
            r9.<init>(r0, r4, r2)
            a.dnq r0 = new a.dnq
            r0.<init>(r6, r9, r5)
            r8.j = r3
            java.lang.Object r8 = a.slb.N(r0, r8)
            if (r8 != r1) goto L7e
        L7d:
            return r1
        L7e:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zye0.L(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0086, code lost:
    
        if (a.slb.N(r0, r8) == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object M(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.k
            a.irh0 r0 = (a.irh0) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r8.j
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L1f
            if (r2 == r5) goto L1b
            if (r2 != r3) goto L15
            a.z1x.P(r9)
            goto L89
        L15:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r4
        L1b:
            a.z1x.P(r9)
            goto L35
        L1f:
            a.z1x.P(r9)
            java.lang.Object r9 = r8.l
            a.hqh0 r9 = (a.hqh0) r9
            r2 = 0
            r0.z(r9, r2)
            a.rou r9 = r0.i
            r8.j = r5
            java.lang.Object r9 = r9.a(r5, r8)
            if (r9 != r1) goto L35
            goto L88
        L35:
            a.m2c0 r9 = (a.m2c0) r9
            boolean r2 = r9.N
            r2 = r2 ^ r5
            a.ik4 r6 = r0.B
            a.ssh0 r7 = a.ssh0.f
            java.lang.String r7 = a.w9x.F(r7)
            r6.d(r7, r2)
            a.vd1 r6 = r0.k
            r6.a(r2)
            a.zlt0 r6 = r0.e
            java.lang.Object r6 = r6.b
            a.vlk r6 = (a.vlk) r6
            a.vwb0 r6 = r6.f37628a
            java.lang.String r7 = "restrictEmail"
            r6.e(r7, r2)
            a.p6a r2 = new a.p6a
            long r6 = r9.S
            java.lang.String r9 = java.lang.String.valueOf(r6)
            r6 = 6
            r2.<init>(r9, r6)
            a.cyh r9 = r0.d
            a.p5a r9 = r9.a(r2)
            a.erh0 r2 = new a.erh0
            r2.<init>(r0, r4, r5)
            a.fnq r6 = new a.fnq
            r7 = 4
            r6.<init>(r9, r2, r7)
            a.jgb0 r9 = new a.jgb0
            r2 = 12
            r9.<init>(r0, r4, r2)
            a.dnq r0 = new a.dnq
            r0.<init>(r6, r9, r5)
            r8.j = r3
            java.lang.Object r8 = a.slb.N(r0, r8)
            if (r8 != r1) goto L89
        L88:
            return r1
        L89:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zye0.M(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0086, code lost:
    
        if (a.slb.N(r0, r8) == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object Q(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.k
            a.zuh0 r0 = (a.zuh0) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r8.j
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L1f
            if (r2 == r5) goto L1b
            if (r2 != r3) goto L15
            a.z1x.P(r9)
            goto L89
        L15:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r4
        L1b:
            a.z1x.P(r9)
            goto L35
        L1f:
            a.z1x.P(r9)
            java.lang.Object r9 = r8.l
            a.dth0 r9 = (a.dth0) r9
            r2 = 0
            r0.B(r9, r2)
            a.rou r9 = r0.i
            r8.j = r5
            java.lang.Object r9 = r9.a(r5, r8)
            if (r9 != r1) goto L35
            goto L88
        L35:
            a.m2c0 r9 = (a.m2c0) r9
            boolean r2 = r9.N
            r2 = r2 ^ r5
            a.ik4 r6 = r0.B
            a.ssh0 r7 = a.ssh0.f
            java.lang.String r7 = a.w9x.F(r7)
            r6.d(r7, r2)
            a.vd1 r6 = r0.k
            r6.a(r2)
            a.zlt0 r6 = r0.e
            java.lang.Object r6 = r6.b
            a.vlk r6 = (a.vlk) r6
            a.vwb0 r6 = r6.f37628a
            java.lang.String r7 = "restrictEmail"
            r6.e(r7, r2)
            a.p6a r2 = new a.p6a
            long r6 = r9.S
            java.lang.String r9 = java.lang.String.valueOf(r6)
            r6 = 6
            r2.<init>(r9, r6)
            a.cyh r9 = r0.d
            a.p5a r9 = r9.a(r2)
            a.wuh0 r2 = new a.wuh0
            r2.<init>(r0, r4, r5)
            a.fnq r6 = new a.fnq
            r7 = 4
            r6.<init>(r9, r2, r7)
            a.jgb0 r9 = new a.jgb0
            r2 = 13
            r9.<init>(r0, r4, r2)
            a.dnq r0 = new a.dnq
            r0.<init>(r6, r9, r5)
            r8.j = r3
            java.lang.Object r8 = a.slb.N(r0, r8)
            if (r8 != r1) goto L89
        L88:
            return r1
        L89:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zye0.Q(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007e  */
    /* JADX WARN: Code duplicated, block: B:24:0x008f  */
    /* JADX WARN: Code duplicated, block: B:26:0x009e  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
    
        if (r13.a(true, r6) == r8) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object R(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.l
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r13.k
            a.uri0 r0 = (a.uri0) r0
            a.ol60 r7 = r0.w
            a.wne r8 = a.wne.f39444a
            byte r1 = r13.j
            r9 = 3
            r10 = 2
            r11 = 1
            if (r1 == 0) goto L2e
            if (r1 == r11) goto L2a
            if (r1 == r10) goto L25
            if (r1 != r9) goto L1e
            a.z1x.P(r14)
            goto L89
        L1e:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r13)
            r13 = 0
            return r13
        L25:
            a.z1x.P(r14)
            r6 = r13
            goto L5c
        L2a:
            a.z1x.P(r14)
            goto L3e
        L2e:
            a.z1x.P(r14)
            a.lqb r14 = r0.h
            r13.j = r11
            a.n660 r14 = r14.f20479a
            java.lang.Object r14 = r14.i(r2, r13)
            if (r14 != r8) goto L3e
            goto L88
        L3e:
            a.byf0 r14 = r0.d
            a.vqi0 r1 = r0.i
            long r3 = r1.b
            a.swp0 r5 = new a.swp0
            org.xplatform.security.api.presentation.models.TokenRestoreData r1 = r1.f37857a
            java.lang.String r6 = r1.b
            java.lang.String r1 = r1.f46941a
            r12 = 0
            r5.<init>(r6, r1, r12)
            r13.j = r10
            a.n660 r1 = r14.f3414a
            r6 = r13
            java.lang.Object r13 = r1.H(r2, r3, r5, r6)
            if (r13 != r8) goto L5c
            goto L88
        L5c:
            a.s31 r13 = r0.o
            a.kt2 r13 = r13.f31532a
            java.lang.String r14 = "login_lost_pass_done"
            r13.c(r14)
            a.je r13 = r0.p
            a.s1p r13 = r13.f16351a
            r3 = 3042(0xbe2, double:1.503E-320)
            a.xun r14 = a.xun.f41520a
            r13.a(r14, r3)
            a.joc r13 = r0.e
            a.g090 r13 = r13.f16851a
            java.lang.Object r13 = r13.f10448a
            a.d190 r13 = (a.d190) r13
            a.pwf0 r13 = r13.e
            a.pwf0 r14 = a.pwf0.c
            if (r13 != r14) goto L8f
            a.woc r13 = r0.j
            r6.j = r9
            java.lang.Object r13 = r13.a(r11, r6)
            if (r13 != r8) goto L89
        L88:
            return r8
        L89:
            a.mri0 r13 = a.mri0.f22274a
            r7.f(r13)
            goto Lab
        L8f:
            a.lri0 r13 = a.lri0.f20534a
            r7.f(r13)
            a.eru r13 = r0.c
            a.owp0 r13 = r13.f8298a
            int r14 = r2.length()
            if (r14 <= 0) goto La1
            r13.i(r2)
        La1:
            a.i1w0 r13 = r0.b
            a.cri0 r14 = new a.cri0
            r14.<init>(r0, r10)
            r13.d(r14)
        Lab:
            a.jrc r13 = r0.f
            a.g090 r13 = r13.f16997a
            java.lang.Object r13 = r13.f10448a
            a.d190 r13 = (a.d190) r13
            java.lang.String r14 = ""
            r13.c = r14
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r13.d = r14
            a.pwf0 r14 = a.pwf0.f27709a
            r13.e = r14
            kotlin.Unit r13 = kotlin.Unit.f46060a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zye0.R(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r1.x(r0, r7) == r2) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object S(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zye0.S(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0138  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d0, code lost:
    
        if (r0 == r3) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object T(java.lang.Object r44) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zye0.T(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0096, code lost:
    
        if (r1.M(r0, r9) == r2) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object U(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.l
            a.ql5 r0 = (a.ql5) r0
            java.lang.Object r1 = r9.k
            a.odj0 r1 = (a.odj0) r1
            a.wne r2 = a.wne.f39444a
            byte r3 = r9.j
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L24
            if (r3 == r5) goto L20
            if (r3 != r4) goto L19
            a.z1x.P(r10)
            goto L99
        L19:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            r9 = 0
            return r9
        L20:
            a.z1x.P(r10)
            goto L3b
        L24:
            a.z1x.P(r10)
            a.ieu r10 = r1.u
            java.lang.Object r3 = r1.D()
            a.tcj0 r3 = (a.tcj0) r3
            boolean r3 = r3.B
            r3 = r3 ^ r5
            r9.j = r5
            java.lang.Object r10 = a.ieu.n(r10, r3, r9)
            if (r10 != r2) goto L3b
            goto L98
        L3b:
            a.ql5 r10 = (a.ql5) r10
            long r5 = r10.f28916a
            long r7 = r0.f28916a
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 == 0) goto L99
            a.peu r10 = r1.J0
            a.vlk r10 = r10.f26869a
            boolean r10 = r10.b()
            if (r10 == 0) goto L90
            a.ctf0 r9 = r1.E
            r10 = 0
            java.lang.Object[] r2 = new java.lang.Object[r10]
            a.lsm0 r3 = r9.b
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r10)
            r5 = 2131951662(0x7f13002e, float:1.9539745E38)
            java.lang.String r2 = r3.a(r5, r2)
            a.txs0 r3 = r0.i
            boolean r3 = r3.e()
            if (r3 == 0) goto L6a
            goto L87
        L6a:
            java.lang.Object[] r3 = new java.lang.Object[r10]
            a.lsm0 r9 = r9.b
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r3, r10)
            r3 = 2131951663(0x7f13002f, float:1.9539747E38)
            java.lang.String r9 = r9.a(r3, r10)
            java.lang.Object[] r9 = new java.lang.Object[]{r2, r9}
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r4)
            java.lang.String r10 = "%s\n\n%s"
            java.lang.String r2 = java.lang.String.format(r10, r9)
        L87:
            a.gcj0 r9 = new a.gcj0
            r9.<init>(r0, r2)
            r1.G(r9)
            goto L99
        L90:
            r9.j = r4
            java.lang.Object r9 = r1.M(r0, r9)
            if (r9 != r2) goto L99
        L98:
            return r2
        L99:
            kotlin.Unit r9 = kotlin.Unit.f46060a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zye0.U(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if (r7 == r2) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
    
        if (r1.e(r8, r0, r7) == r2) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
    
        return r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object V(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.l
            a.gji0 r0 = (a.gji0) r0
            java.lang.Object r1 = r7.k
            a.gpj0 r1 = (a.gpj0) r1
            a.wne r2 = a.wne.f39444a
            byte r3 = r7.j
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L25
            if (r3 == r6) goto L1f
            if (r3 != r5) goto L19
            a.z1x.P(r8)
            goto L82
        L19:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r4
        L1f:
            a.z1x.P(r8)     // Catch: java.lang.Exception -> L23
            goto L82
        L23:
            r8 = move-exception
            goto L38
        L25:
            a.z1x.P(r8)
            a.wbj r8 = r1.e     // Catch: java.lang.Exception -> L23
            a.epj0 r3 = new a.epj0     // Catch: java.lang.Exception -> L23
            r3.<init>(r1, r4, r6)     // Catch: java.lang.Exception -> L23
            r7.j = r6     // Catch: java.lang.Exception -> L23
            java.lang.Object r7 = r8.a(r3, r7)     // Catch: java.lang.Exception -> L23
            if (r7 != r2) goto L82
            goto L81
        L38:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "App foregrounded, failed to update data. Message: "
            r3.<init>(r6)
            java.lang.String r8 = r8.getMessage()
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            java.lang.String r3 = "FirebaseSessions"
            android.util.Log.d(r3, r8)
            boolean r8 = r1.d(r0)
            if (r8 == 0) goto L82
            a.vji0 r8 = r1.b
            a.pji0 r3 = r0.f11398a
            a.pji0 r8 = r8.a(r3)
            r3 = 4
            a.gji0 r0 = a.gji0.a(r0, r8, r4, r4, r3)
            r1.h = r0
            a.uji0 r0 = r1.c
            kotlin.coroutines.CoroutineContext r3 = r0.e
            a.sje r3 = a.d5c.a(r3)
            a.sji0 r6 = new a.sji0
            r6.<init>(r0, r8, r4)
            r0 = 3
            a.qjj.W(r3, r4, r4, r6, r0)
            java.lang.String r8 = r8.f27093a
            a.dpj0 r0 = a.dpj0.b
            r7.j = r5
            java.lang.Object r7 = r1.e(r8, r0, r7)
            if (r7 != r2) goto L82
        L81:
            return r2
        L82:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zye0.V(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0053 A[PHI: r2 r7
  0x0053: PHI (r2v1 a.b1f) = (r2v3 a.b1f), (r2v5 a.b1f) binds: [B:13:0x0050, B:9:0x001b] A[DONT_GENERATE, DONT_INLINE]
  0x0053: PHI (r7v6 java.lang.Object) = (r7v14 java.lang.Object), (r7v0 java.lang.Object) binds: [B:13:0x0050, B:9:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (r2.invoke(r7, r6) == r1) goto L17;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005b -> B:18:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object W(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = r6.l
            a.z220 r0 = (a.z220) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r6.j
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L23
            if (r2 == r5) goto L1b
            if (r2 != r4) goto L15
            a.z1x.P(r7)
            goto L5e
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L1b:
            java.lang.Object r2 = r6.k
            a.b1f r2 = (a.b1f) r2
            a.z1x.P(r7)
            goto L53
        L23:
            a.z1x.P(r7)
            java.lang.Object r7 = r0.e
            a.ok50 r7 = (a.ok50) r7
            java.lang.Object r7 = r7.f25390a
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.get()
            if (r7 <= 0) goto L6f
        L34:
            java.lang.Object r7 = r0.b
            a.vne r7 = (a.vne) r7
            kotlin.coroutines.CoroutineContext r7 = r7.getCoroutineContext()
            a.zvw.O(r7)
            java.lang.Object r7 = r0.c
            r2 = r7
            a.b1f r2 = (a.b1f) r2
            java.lang.Object r7 = r0.d
            a.q99 r7 = (a.q99) r7
            r6.k = r2
            r6.j = r5
            java.lang.Object r7 = r7.g(r6)
            if (r7 != r1) goto L53
            goto L5d
        L53:
            r6.k = r3
            r6.j = r4
            java.lang.Object r7 = r2.invoke(r7, r6)
            if (r7 != r1) goto L5e
        L5d:
            return r1
        L5e:
            java.lang.Object r7 = r0.e
            a.ok50 r7 = (a.ok50) r7
            java.lang.Object r7 = r7.f25390a
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.decrementAndGet()
            if (r7 != 0) goto L34
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        L6f:
            java.lang.String r6 = "Check failed."
            a.jf4.n(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zye0.W(java.lang.Object):java.lang.Object");
    }

    private final Object X(Object obj) {
        Object value;
        ql5 ql5Var;
        hnd0 hnd0Var;
        String str;
        Object value2;
        boolean z;
        hxo hxoVar;
        p3u0 p3u0Var;
        hxo hxoVar2;
        double d;
        xxj0 xxj0Var = (xxj0) this.l;
        p7m0 p7m0Var = xxj0Var.D0;
        wne wneVar = wne.f39444a;
        byte b = this.j;
        if (b == 0) {
            z1x.P(obj);
            if (xxj0Var.A.a()) {
                khf0 khf0Var = xxj0Var.f;
                bm5 bm5Var = bm5.b;
                this.j = (byte) 1;
                obj = khf0.G(khf0Var, bm5Var, this);
                if (obj != wneVar) {
                }
                return wneVar;
            }
            do {
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, exo.a((exo) value, true, false, false, 15)));
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
            z = ((exo) value2).g;
            hnd0Var.getClass();
            double d2 = hnd0Var.b;
            str.getClass();
            int i = cy7.f5159a;
            pn40 pn40Var = pn40.f27267a;
            p3u0Var = p3u0.g;
            hxoVar = new hxo(cy7.e(pn40.d(d2, str, p3u0Var)), d2);
            double d3 = hnd0Var.c;
            hxoVar2 = new hxo(cy7.e(pn40.d(d3, str, p3u0Var)), d3);
            d = hnd0Var.d;
        } while (!p7m0Var.m(value2, new exo(hxoVar, hxoVar2, new hxo(cy7.e(pn40.d(d, str, p3u0Var)), d), true, true, false, z, false)));
        return Unit.f46060a;
        ql5 ql5Var2 = (ql5) obj;
        lbu lbuVar = xxj0Var.B;
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
                z = ((exo) value2).g;
                hnd0Var.getClass();
                double d4 = hnd0Var.b;
                str.getClass();
                int i2 = cy7.f5159a;
                pn40 pn40Var2 = pn40.f27267a;
                p3u0Var = p3u0.g;
                hxoVar = new hxo(cy7.e(pn40.d(d4, str, p3u0Var)), d4);
                double d5 = hnd0Var.c;
                hxoVar2 = new hxo(cy7.e(pn40.d(d5, str, p3u0Var)), d5);
                d = hnd0Var.d;
            } while (!p7m0Var.m(value2, new exo(hxoVar, hxoVar2, new hxo(cy7.e(pn40.d(d, str, p3u0Var)), d), true, true, false, z, false)));
            return Unit.f46060a;
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0261  */
    /* JADX WARN: Code duplicated, block: B:296:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:306:0x04de A[PHI: r2 r6 r10
  0x04de: PHI (r2v5 java.lang.Object) = (r2v4 java.lang.Object), (r2v29 java.lang.Object) binds: [B:304:0x04db, B:11:0x0030] A[DONT_GENERATE, DONT_INLINE]
  0x04de: PHI (r6v147 a.yje) = (r6v146 a.yje), (r6v153 a.yje) binds: [B:304:0x04db, B:11:0x0030] A[DONT_GENERATE, DONT_INLINE]
  0x04de: PHI (r10v11 java.lang.String) = (r10v10 java.lang.String), (r10v15 java.lang.String) binds: [B:304:0x04db, B:11:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:308:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:311:0x0501  */
    /* JADX WARN: Code duplicated, block: B:313:0x050d  */
    /* JADX WARN: Code duplicated, block: B:317:0x0527  */
    /* JADX WARN: Code duplicated, block: B:319:0x0534  */
    /* JADX WARN: Code duplicated, block: B:324:0x0543  */
    /* JADX WARN: Code duplicated, block: B:327:0x0558  */
    /* JADX WARN: Code duplicated, block: B:328:0x055d  */
    /* JADX WARN: Code duplicated, block: B:331:0x056b  */
    /* JADX WARN: Code duplicated, block: B:332:0x0570  */
    /* JADX WARN: Code duplicated, block: B:335:0x057e  */
    /* JADX WARN: Code duplicated, block: B:336:0x0581  */
    /* JADX WARN: Code duplicated, block: B:339:0x058f  */
    /* JADX WARN: Code duplicated, block: B:340:0x0594  */
    /* JADX WARN: Code duplicated, block: B:343:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:344:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:347:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:350:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:351:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:354:0x0603  */
    /* JADX WARN: Code duplicated, block: B:355:0x0606  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:361:0x04a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x01be  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c9  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object l(Object obj) {
        vrb0 vrb0Var;
        String str;
        Object objN;
        String str2;
        Iterator it;
        Object m1qVar;
        String strA;
        String strA2;
        boolean z;
        boolean z2;
        String strA3;
        yje yjeVar;
        Object objA;
        List list;
        q7f0 q7f0Var;
        q7f0 q7f0Var2;
        Integer num;
        Object objO;
        List list2;
        int iIntValue;
        CountryStateModel countryStateModel;
        int i;
        CurrencyStateModel currencyStateModel;
        int i2;
        String str3;
        String str4;
        BonusStateModel bonusStateModel;
        int i3;
        Integer num2;
        int iIntValue2;
        q7f0 q7f0Var3;
        yje yjeVar2;
        PhoneStateModel phoneStateModel;
        String str5;
        PhoneStateModel phoneStateModel2;
        String str6;
        x5f0 x5f0Var = (x5f0) this.l;
        wne wneVar = wne.f39444a;
        byte b = this.j;
        String str7 = "";
        if (b == 0) {
            z1x.P(obj);
            this.j = (byte) 1;
            if (qcc.O(300L, this) != wneVar) {
            }
            return wneVar;
        }
        if (b == 1) {
            z1x.P(obj);
        } else {
            if (b == 2) {
                vrb0Var = (vrb0) this.k;
                z1x.P(obj);
                objN = obj;
                str = "";
                List list3 = ((u4f0) x5f0Var.D()).d;
                yjeVar = null;
                this.k = null;
                this.j = (byte) 3;
                objA = vrb0Var.a((List) objN, list3, this);
                if (objA != wneVar) {
                    list = (List) objA;
                    q7f0Var = ((u4f0) x5f0Var.D()).g.M;
                    q7f0Var2 = q7f0.REGULATOR;
                    if (q7f0Var == q7f0Var2) {
                        x5f0Var.i0.m();
                    }
                    if (((u4f0) x5f0Var.D()).g.M != q7f0.SOCIAL) {
                        num = ((u4f0) x5f0Var.D()).g.D;
                        if (num == null) {
                            return Unit.f46060a;
                        }
                        x5f0Var.G(new r4f0(num.intValue()));
                        return Unit.f46060a;
                    }
                    num = ((u4f0) x5f0Var.D()).g.D;
                    if (num == null) {
                        return Unit.f46060a;
                    }
                    x5f0Var.G(new r4f0(num.intValue()));
                    return Unit.f46060a;
                    this.k = list;
                    this.j = (byte) 4;
                    objO = x5f0Var.O(this);
                    if (objO != wneVar) {
                        list2 = list;
                    }
                }
                return wneVar;
            }
            if (b == 3) {
                z1x.P(obj);
                objA = obj;
                str = "";
                yjeVar = null;
                list = (List) objA;
                q7f0Var = ((u4f0) x5f0Var.D()).g.M;
                q7f0Var2 = q7f0.REGULATOR;
                if (q7f0Var == q7f0Var2) {
                    x5f0Var.i0.m();
                }
                if ((((u4f0) x5f0Var.D()).g.M != q7f0.SOCIAL || ((u4f0) x5f0Var.D()).g.M == q7f0Var2) && ((u4f0) x5f0Var.D()).g.E == null) {
                    num = ((u4f0) x5f0Var.D()).g.D;
                    if (num == null) {
                        return Unit.f46060a;
                    }
                    x5f0Var.G(new r4f0(num.intValue()));
                    return Unit.f46060a;
                }
                this.k = list;
                this.j = (byte) 4;
                objO = x5f0Var.O(this);
                if (objO != wneVar) {
                    list2 = list;
                }
                return wneVar;
            }
            if (b != 4) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list4 = (List) this.k;
            z1x.P(obj);
            list2 = list4;
            str = "";
            yjeVar = null;
            objO = obj;
        }
        iIntValue = ((Number) objO).intValue();
        xte0 xte0Var = x5f0Var.i0;
        countryStateModel = ((u4f0) x5f0Var.D()).g.g;
        if (countryStateModel != null) {
            i = countryStateModel.f46853a;
        } else {
            i = 0;
        }
        currencyStateModel = ((u4f0) x5f0Var.D()).g.h;
        if (currencyStateModel != null) {
            i2 = currencyStateModel.f46854a;
        } else {
            i2 = -1;
        }
        str3 = ((u4f0) x5f0Var.D()).g.u;
        if (str3 == null) {
            str4 = str;
        } else {
            str4 = str3;
        }
        bonusStateModel = ((u4f0) x5f0Var.D()).g.c;
        if (bonusStateModel != null) {
            i3 = bonusStateModel.f46850a;
        } else {
            i3 = iIntValue;
        }
        num2 = ((u4f0) x5f0Var.D()).g.D;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = -1;
        }
        q7f0Var3 = ((u4f0) x5f0Var.D()).g.M;
        if (q7f0Var3 == null) {
            q7f0Var3 = q7f0.FULL;
        }
        xte0Var.n(i, i2, str4, i3, iIntValue2, q7f0Var3);
        fs fsVar = new fs((Object) x5f0Var, list2, iIntValue, yjeVar, (byte) 13);
        yjeVar2 = yjeVar;
        y4f0 y4f0Var = new y4f0(x5f0Var, (byte) 11);
        qye0 qye0Var = new qye0(1, x5f0Var, x5f0.class, "handleRegistrationExceptions", "handleRegistrationExceptions(Ljava/lang/Throwable;)V", 0, (byte) 11);
        lie0 lie0Var = new lie0();
        phoneStateModel = ((u4f0) x5f0Var.D()).g.r;
        if (phoneStateModel != null) {
            str5 = phoneStateModel.b;
        } else {
            str5 = yjeVar2;
        }
        phoneStateModel2 = ((u4f0) x5f0Var.D()).g.r;
        if (phoneStateModel2 != null) {
            str6 = phoneStateModel2.f46856a;
        } else {
            str6 = yjeVar2;
        }
        fnq fnqVar = new fnq(new fnq(x5f0Var.W.a(new p6a("Registration", ohs0.n(str5, str6), str)), new d7a0(x5f0Var, yjeVar2, (byte) 24)), new wn2((Object) x5f0Var, (Object) lie0Var, (Object) fsVar, (Object) y4f0Var, (yje) null, (byte) 25), (byte) 4);
        byte b2 = 1;
        x5f0Var.w0 = sac.T(new dnq(fnqVar, new sye0(x5f0Var, yjeVar2, b2), (byte) 0), jiu0.a(x5f0Var), new tye0(qye0Var, yjeVar2, b2));
        return Unit.f46060a;
        vrb0Var = x5f0Var.R;
        u4f0 u4f0Var = (u4f0) x5f0Var.D();
        String strC = ((tv3) x5f0Var.q0.f384a).f34579a.c("APPS_FLYER_ID", "");
        String str8 = ((u4f0) x5f0Var.D()).A.d;
        List list5 = ((u4f0) x5f0Var.D()).r.K;
        u4f0Var.getClass();
        list5.getClass();
        lc00 lc00VarB = kotlin.collections.a.b();
        List list6 = u4f0Var.d;
        r1f0 r1f0Var = u4f0Var.g;
        CitizenshipStateModel citizenshipStateModel = r1f0Var.o;
        Iterator it2 = list6.iterator();
        while (it2.hasNext()) {
            q0f0 q0f0Var = (q0f0) it2.next();
            if (q0f0Var instanceof gze0) {
                boolean z3 = ((gze0) q0f0Var).c;
                String str9 = r1f0Var.f29678a;
                if (str9 == null) {
                    str9 = str7;
                }
                m1qVar = new y0q(str9, z3);
            } else if (q0f0Var instanceof hze0) {
                m1qVar = new z0q(r1f0Var.b);
            } else {
                if (q0f0Var instanceof jze0) {
                    BonusStateModel bonusStateModel2 = r1f0Var.c;
                    if (bonusStateModel2 != null) {
                        m1qVar = new c1q(bonusStateModel2.b, bonusStateModel2.f46850a, ((jze0) q0f0Var).c);
                    } else {
                        m1qVar = null;
                    }
                } else if (q0f0Var instanceof kze0) {
                    if (citizenshipStateModel != null) {
                        m1qVar = new d1q(((kze0) q0f0Var).c, citizenshipStateModel.f46851a);
                    } else {
                        m1qVar = null;
                    }
                } else if (q0f0Var instanceof lze0) {
                    CityStateModel cityStateModel = r1f0Var.d;
                    if (cityStateModel != null) {
                        m1qVar = new e1q(((lze0) q0f0Var).c, cityStateModel.f46852a);
                    } else {
                        m1qVar = null;
                    }
                } else if (q0f0Var instanceof mze0) {
                    mze0 mze0Var = (mze0) q0f0Var;
                    m1qVar = new f1q(mze0Var.c, r1f0Var.e, mze0Var.d);
                } else if (q0f0Var instanceof xze0) {
                    xze0 xze0Var = (xze0) q0f0Var;
                    m1qVar = new o1q(xze0Var.c, r1f0Var.f, xze0Var.d);
                } else if (q0f0Var instanceof nze0) {
                    CountryStateModel countryStateModel2 = r1f0Var.g;
                    if (countryStateModel2 != null) {
                        m1qVar = new g1q(countryStateModel2.b, countryStateModel2.f46853a, ((nze0) q0f0Var).c);
                    } else {
                        m1qVar = null;
                    }
                } else if (q0f0Var instanceof oze0) {
                    CurrencyStateModel currencyStateModel2 = r1f0Var.h;
                    if (currencyStateModel2 != null) {
                        m1qVar = new h1q(currencyStateModel2.b, currencyStateModel2.f46854a, ((oze0) q0f0Var).c);
                    } else {
                        m1qVar = null;
                    }
                } else if (q0f0Var instanceof pze0) {
                    boolean z4 = ((pze0) q0f0Var).c;
                    Long l = r1f0Var.i;
                    str2 = str7;
                    it = it2;
                    if (l != null) {
                        long jLongValue = l.longValue();
                        rdj rdjVar = rdj.f30294a;
                        ynq0 ynq0Var = new ynq0(jLongValue);
                        sdj sdjVar = sdj.UNIQUE_10;
                        Locale locale = Locale.ENGLISH;
                        locale.getClass();
                        strA3 = rdj.a(ynq0Var, sdjVar, false, locale);
                    } else {
                        strA3 = null;
                    }
                    if (strA3 == null) {
                        strA3 = str2;
                    }
                    m1qVar = new b1q(strA3, z4);
                } else {
                    str2 = str7;
                    it = it2;
                    if (q0f0Var instanceof qze0) {
                        DocumentStateModel documentStateModel = r1f0Var.j;
                        if (documentStateModel != null) {
                            if (list5.isEmpty()) {
                                z2 = ((qze0) q0f0Var).c;
                            } else {
                                String str10 = citizenshipStateModel != null ? citizenshipStateModel.b : null;
                                if (str10 == null || str10.length() == 0 || list5.contains(Integer.valueOf(citizenshipStateModel.f46851a))) {
                                    z2 = ((qze0) q0f0Var).c;
                                } else {
                                    z2 = true;
                                }
                            }
                            m1qVar = new i1q(z2, documentStateModel.f46855a);
                        } else {
                            m1qVar = null;
                        }
                    } else if (q0f0Var instanceof rze0) {
                        boolean z5 = ((rze0) q0f0Var).c;
                        String str11 = r1f0Var.k;
                        if (str11 == null) {
                            str11 = str2;
                        }
                        m1qVar = new j1q(str11, z5);
                    } else if (q0f0Var instanceof sze0) {
                        boolean z6 = ((sze0) q0f0Var).c;
                        String str12 = r1f0Var.l;
                        if (str12 == null) {
                            str12 = str2;
                        }
                        m1qVar = new k1q(StringsKt.u0(str12).toString(), z6);
                    } else if (q0f0Var instanceof uze0) {
                        boolean z7 = ((uze0) q0f0Var).c;
                        String str13 = r1f0Var.m;
                        if (str13 == null) {
                            str13 = str2;
                        }
                        m1qVar = new l1q(StringsKt.u0(str13).toString(), z7);
                    } else if (q0f0Var instanceof wze0) {
                        boolean z8 = ((wze0) q0f0Var).c;
                        String str14 = r1f0Var.n;
                        if (str14 == null) {
                            str14 = str2;
                        }
                        m1qVar = new n1q(StringsKt.u0(str14).toString(), z8);
                    } else if (q0f0Var instanceof a0f0) {
                        if (list5.isEmpty()) {
                            z = ((a0f0) q0f0Var).c;
                        } else {
                            String str15 = citizenshipStateModel != null ? citizenshipStateModel.b : null;
                            if (str15 == null || str15.length() == 0) {
                                z = ((a0f0) q0f0Var).c;
                            } else {
                                if (CollectionsKt.L(list5, citizenshipStateModel != null ? Integer.valueOf(citizenshipStateModel.f46851a) : null)) {
                                    z = ((a0f0) q0f0Var).c;
                                } else {
                                    z = true;
                                }
                            }
                        }
                        String str16 = r1f0Var.p;
                        if (str16 == null) {
                            str16 = str2;
                        }
                        m1qVar = new r1q(str16, z);
                    } else if (q0f0Var instanceof b0f0) {
                        boolean z9 = ((b0f0) q0f0Var).c;
                        String str17 = r1f0Var.q;
                        if (str17 == null) {
                            str17 = str2;
                        }
                        m1qVar = new s1q(str17, z9);
                    } else if (q0f0Var instanceof c0f0) {
                        boolean z10 = ((c0f0) q0f0Var).c;
                        PhoneStateModel phoneStateModel3 = r1f0Var.r;
                        String str18 = phoneStateModel3 != null ? phoneStateModel3.f46856a : null;
                        if (str18 == null) {
                            str18 = str2;
                        }
                        String str19 = phoneStateModel3 != null ? phoneStateModel3.b : null;
                        if (str19 == null) {
                            str19 = str2;
                        }
                        m1qVar = new u1q(z10, str18, str19);
                    } else if (q0f0Var instanceof d0f0) {
                        m1qVar = new v1q(r1f0Var.s, ((d0f0) q0f0Var).c);
                    } else if (q0f0Var instanceof e0f0) {
                        boolean z11 = ((e0f0) q0f0Var).c;
                        String str20 = r1f0Var.t;
                        if (str20 == null) {
                            str20 = str2;
                        }
                        m1qVar = new w1q(str20, z11);
                    } else if (q0f0Var instanceof f0f0) {
                        boolean z12 = ((f0f0) q0f0Var).c;
                        String str21 = r1f0Var.u;
                        if (str21 == null) {
                            str21 = str2;
                        }
                        m1qVar = new x1q(str21, z12);
                    } else if (q0f0Var instanceof g0f0) {
                        RegionStateModel regionStateModel = r1f0Var.v;
                        if (regionStateModel != null) {
                            m1qVar = new y1q(((g0f0) q0f0Var).c, regionStateModel.f46857a);
                        } else {
                            m1qVar = null;
                        }
                    } else if (q0f0Var instanceof i0f0) {
                        m1qVar = new a2q(((i0f0) q0f0Var).c, r1f0Var.x);
                    } else if (q0f0Var instanceof j0f0) {
                        m1qVar = new b2q(((j0f0) q0f0Var).c, r1f0Var.y);
                    } else if (q0f0Var instanceof k0f0) {
                        boolean z13 = ((k0f0) q0f0Var).c;
                        String str22 = r1f0Var.z;
                        if (str22 == null) {
                            str22 = str2;
                        }
                        m1qVar = new c2q(str22, z13);
                    } else if (q0f0Var instanceof l0f0) {
                        m1qVar = new d2q(((l0f0) q0f0Var).c, r1f0Var.A);
                    } else if (q0f0Var instanceof m0f0) {
                        m1qVar = new e2q(((m0f0) q0f0Var).c, r1f0Var.B);
                    } else if (q0f0Var instanceof tze0) {
                        boolean z14 = ((tze0) q0f0Var).c;
                        Integer num3 = r1f0Var.F;
                        m1qVar = new g2q(z14, num3 != null ? num3.intValue() : -1);
                    } else if (q0f0Var instanceof o0f0) {
                        m1qVar = new h2q(((o0f0) q0f0Var).c, r1f0Var.C);
                    } else if (q0f0Var instanceof p0f0) {
                        boolean z15 = ((p0f0) q0f0Var).c;
                        Integer num4 = r1f0Var.D;
                        int iIntValue3 = num4 != null ? num4.intValue() : -1;
                        SocialStateModel socialStateModel = r1f0Var.E;
                        String str23 = socialStateModel != null ? socialStateModel.b : null;
                        String str24 = str23 == null ? str2 : str23;
                        int i4 = socialStateModel != null ? socialStateModel.c : -1;
                        String str25 = socialStateModel != null ? socialStateModel.d : null;
                        String str26 = str25 == null ? str2 : str25;
                        String str27 = socialStateModel != null ? socialStateModel.e : null;
                        String str28 = str27 == null ? str2 : str27;
                        String str29 = socialStateModel != null ? socialStateModel.j : null;
                        String str30 = str29 == null ? str2 : str29;
                        String str31 = socialStateModel != null ? socialStateModel.f : null;
                        String str32 = str31 == null ? str2 : str31;
                        String str33 = socialStateModel != null ? socialStateModel.g : null;
                        String str34 = str33 == null ? str2 : str33;
                        String str35 = socialStateModel != null ? socialStateModel.h : null;
                        String str36 = str35 == null ? str2 : str35;
                        String str37 = socialStateModel != null ? socialStateModel.i : null;
                        m1qVar = new i2q(z15, iIntValue3, new djk0(i4, str24, str26, str28, str32, str34, str36, str37 == null ? str2 : str37, str30));
                    } else if (q0f0Var instanceof h0f0) {
                        boolean z16 = ((h0f0) q0f0Var).c;
                        String str38 = r1f0Var.w;
                        if (str38 == null) {
                            str38 = str2;
                        }
                        m1qVar = new z1q(str38, z16);
                    } else if (q0f0Var instanceof ize0) {
                        m1qVar = new a1q(strC);
                    } else if (q0f0Var instanceof yze0) {
                        boolean z17 = ((yze0) q0f0Var).c;
                        Long l2 = r1f0Var.I;
                        if (l2 != null) {
                            long jLongValue2 = l2.longValue();
                            rdj rdjVar2 = rdj.f30294a;
                            ynq0 ynq0Var2 = new ynq0(jLongValue2);
                            sdj sdjVar2 = sdj.UNIVERSAL;
                            Locale locale2 = Locale.ENGLISH;
                            locale2.getClass();
                            strA2 = rdj.a(ynq0Var2, sdjVar2, false, locale2);
                        } else {
                            strA2 = null;
                        }
                        if (strA2 == null) {
                            strA2 = str2;
                        }
                        m1qVar = new p1q(strA2, z17);
                    } else if (q0f0Var instanceof zze0) {
                        boolean z18 = ((zze0) q0f0Var).c;
                        Long l3 = r1f0Var.J;
                        if (l3 != null) {
                            long jLongValue3 = l3.longValue();
                            rdj rdjVar3 = rdj.f30294a;
                            ynq0 ynq0Var3 = new ynq0(jLongValue3);
                            sdj sdjVar3 = sdj.UNIVERSAL;
                            Locale locale3 = Locale.ENGLISH;
                            locale3.getClass();
                            strA = rdj.a(ynq0Var3, sdjVar3, false, locale3);
                        } else {
                            strA = null;
                        }
                        if (strA == null) {
                            strA = str2;
                        }
                        m1qVar = new q1q(strA, z18);
                    } else if (q0f0Var instanceof n0f0) {
                        m1qVar = new f2q(((n0f0) q0f0Var).c, r1f0Var.L);
                    } else {
                        if (!Intrinsics.d(q0f0Var, vze0.c)) {
                            t9f.b();
                            return null;
                        }
                        m1qVar = new m1q(str8);
                    }
                }
                if (m1qVar != null) {
                    lc00VarB.add(m1qVar);
                }
                it2 = it;
                str7 = str2;
            }
            str2 = str7;
            it = it2;
            if (m1qVar != null) {
                lc00VarB.add(m1qVar);
            }
            it2 = it;
            str7 = str2;
        }
        str = str7;
        ArrayList arrayListN0 = CollectionsKt.N0(kotlin.collections.a.a(lc00VarB));
        this.k = vrb0Var;
        this.j = (byte) 2;
        objN = x5f0Var.N(arrayListN0, this);
        if (objN != wneVar) {
            List list7 = ((u4f0) x5f0Var.D()).d;
            yjeVar = null;
            this.k = null;
            this.j = (byte) 3;
            objA = vrb0Var.a((List) objN, list7, this);
            if (objA != wneVar) {
                list = (List) objA;
                q7f0Var = ((u4f0) x5f0Var.D()).g.M;
                q7f0Var2 = q7f0.REGULATOR;
                if (q7f0Var == q7f0Var2) {
                    x5f0Var.i0.m();
                }
                if (((u4f0) x5f0Var.D()).g.M != q7f0.SOCIAL) {
                    num = ((u4f0) x5f0Var.D()).g.D;
                    if (num == null) {
                        return Unit.f46060a;
                    }
                    x5f0Var.G(new r4f0(num.intValue()));
                    return Unit.f46060a;
                }
                num = ((u4f0) x5f0Var.D()).g.D;
                if (num == null) {
                    return Unit.f46060a;
                }
                x5f0Var.G(new r4f0(num.intValue()));
                return Unit.f46060a;
                this.k = list;
                this.j = (byte) 4;
                objO = x5f0Var.O(this);
                if (objO != wneVar) {
                    list2 = list;
                    iIntValue = ((Number) objO).intValue();
                    xte0 xte0Var2 = x5f0Var.i0;
                    countryStateModel = ((u4f0) x5f0Var.D()).g.g;
                    if (countryStateModel != null) {
                        i = countryStateModel.f46853a;
                    } else {
                        i = 0;
                    }
                    currencyStateModel = ((u4f0) x5f0Var.D()).g.h;
                    if (currencyStateModel != null) {
                        i2 = currencyStateModel.f46854a;
                    } else {
                        i2 = -1;
                    }
                    str3 = ((u4f0) x5f0Var.D()).g.u;
                    if (str3 == null) {
                        str4 = str;
                    } else {
                        str4 = str3;
                    }
                    bonusStateModel = ((u4f0) x5f0Var.D()).g.c;
                    if (bonusStateModel != null) {
                        i3 = bonusStateModel.f46850a;
                    } else {
                        i3 = iIntValue;
                    }
                    num2 = ((u4f0) x5f0Var.D()).g.D;
                    if (num2 != null) {
                        iIntValue2 = num2.intValue();
                    } else {
                        iIntValue2 = -1;
                    }
                    q7f0Var3 = ((u4f0) x5f0Var.D()).g.M;
                    if (q7f0Var3 == null) {
                        q7f0Var3 = q7f0.FULL;
                    }
                    xte0Var2.n(i, i2, str4, i3, iIntValue2, q7f0Var3);
                    fs fsVar2 = new fs((Object) x5f0Var, list2, iIntValue, yjeVar, (byte) 13);
                    yjeVar2 = yjeVar;
                    y4f0 y4f0Var2 = new y4f0(x5f0Var, (byte) 11);
                    qye0 qye0Var2 = new qye0(1, x5f0Var, x5f0.class, "handleRegistrationExceptions", "handleRegistrationExceptions(Ljava/lang/Throwable;)V", 0, (byte) 11);
                    lie0 lie0Var2 = new lie0();
                    phoneStateModel = ((u4f0) x5f0Var.D()).g.r;
                    if (phoneStateModel != null) {
                        str5 = phoneStateModel.b;
                    } else {
                        str5 = yjeVar2;
                    }
                    phoneStateModel2 = ((u4f0) x5f0Var.D()).g.r;
                    if (phoneStateModel2 != null) {
                        str6 = phoneStateModel2.f46856a;
                    } else {
                        str6 = yjeVar2;
                    }
                    fnq fnqVar2 = new fnq(new fnq(x5f0Var.W.a(new p6a("Registration", ohs0.n(str5, str6), str)), new d7a0(x5f0Var, yjeVar2, (byte) 24)), new wn2((Object) x5f0Var, (Object) lie0Var2, (Object) fsVar2, (Object) y4f0Var2, (yje) null, (byte) 25), (byte) 4);
                    byte b3 = 1;
                    x5f0Var.w0 = sac.T(new dnq(fnqVar2, new sye0(x5f0Var, yjeVar2, b3), (byte) 0), jiu0.a(x5f0Var), new tye0(qye0Var2, yjeVar2, b3));
                    return Unit.f46060a;
                }
            }
        }
        return wneVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d1, code lost:
    
        if (a.qjj.d0(r3, r6, r33) == r2) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zye0.m(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:42:0x0107  */
    /* JADX WARN: Code duplicated, block: B:47:0x011c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0128  */
    /* JADX WARN: Code duplicated, block: B:50:0x012b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0140  */
    /* JADX WARN: Code duplicated, block: B:56:0x015e  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010d, code lost:
    
        if (r1.W(r35) == r3) goto L44;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x0128, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r36) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zye0.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0093, code lost:
    
        if (a.qjj.d0(r3, r6, r32) == r2) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r33) {
        /*
            r32 = this;
            r0 = r32
            java.lang.Object r1 = r0.l
            a.ocf0 r1 = (a.ocf0) r1
            a.wne r2 = a.wne.f39444a
            byte r3 = r0.j
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L28
            if (r3 == r6) goto L1e
            if (r3 != r5) goto L18
            a.z1x.P(r33)
            goto L96
        L18:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            return r4
        L1e:
            java.lang.Object r3 = r0.k
            a.gnu r3 = (a.gnu) r3
            a.z1x.P(r33)
            r6 = r33
            goto L7d
        L28:
            a.z1x.P(r33)
            int r3 = a.ocf0.z0
            a.ocj r3 = r1.i
            a.p7m0 r3 = r3.f25029a
        L31:
            java.lang.Object r7 = r3.getValue()
            r7.getClass()
            r8 = r7
            a.mbf0 r8 = (a.mbf0) r8
            r30 = 0
            r31 = 1073741822(0x3ffffffe, float:1.9999998)
            r9 = 1
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            a.mbf0 r8 = a.mbf0.a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            boolean r7 = r3.m(r7, r8)
            if (r7 == 0) goto L31
            a.gnu r3 = r1.Q
            a.ali r7 = r1.j0
            r0.k = r3
            r0.j = r6
            r6 = 0
            java.lang.Object r6 = r7.r(r6, r0)
            if (r6 != r2) goto L7d
            goto L95
        L7d:
            java.util.List r6 = (java.util.List) r6
            r3.c(r6)
            a.mne r3 = r1.Z
            a.vs10 r3 = r3.c
            a.mcf0 r6 = new a.mcf0
            r6.<init>(r1, r4)
            r0.k = r4
            r0.j = r5
            java.lang.Object r0 = a.qjj.d0(r3, r6, r0)
            if (r0 != r2) goto L96
        L95:
            return r2
        L96:
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zye0.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0251  */
    /* JADX WARN: Code duplicated, block: B:292:0x0493  */
    /* JADX WARN: Code duplicated, block: B:304:0x04de  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:313:0x0517  */
    /* JADX WARN: Code duplicated, block: B:315:0x0524  */
    /* JADX WARN: Code duplicated, block: B:320:0x0533  */
    /* JADX WARN: Code duplicated, block: B:323:0x0548  */
    /* JADX WARN: Code duplicated, block: B:324:0x054d  */
    /* JADX WARN: Code duplicated, block: B:327:0x055b  */
    /* JADX WARN: Code duplicated, block: B:328:0x0560  */
    /* JADX WARN: Code duplicated, block: B:331:0x056e  */
    /* JADX WARN: Code duplicated, block: B:332:0x0571  */
    /* JADX WARN: Code duplicated, block: B:335:0x057f  */
    /* JADX WARN: Code duplicated, block: B:336:0x0584  */
    /* JADX WARN: Code duplicated, block: B:339:0x0592  */
    /* JADX WARN: Code duplicated, block: B:340:0x0599  */
    /* JADX WARN: Code duplicated, block: B:343:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:346:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:347:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:350:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:351:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:357:0x0496 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b9  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object s(Object obj) {
        vrb0 vrb0Var;
        String str;
        Object objN;
        Object m1qVar;
        String strA;
        String strA2;
        Object y1qVar;
        boolean z;
        boolean z2;
        String strA3;
        yje yjeVar;
        Object objA;
        List list;
        q7f0 q7f0Var;
        q7f0 q7f0Var2;
        Integer num;
        Object objO;
        List list2;
        int iIntValue;
        org.xplatform.registration.visual.impl.presentation.state.models.fields.CountryStateModel countryStateModel;
        int i;
        org.xplatform.registration.visual.impl.presentation.state.models.fields.CurrencyStateModel currencyStateModel;
        int i2;
        String str2;
        String str3;
        org.xplatform.registration.visual.impl.presentation.state.models.fields.BonusStateModel bonusStateModel;
        int i3;
        Integer num2;
        int iIntValue2;
        q7f0 q7f0Var3;
        yje yjeVar2;
        org.xplatform.registration.visual.impl.presentation.state.models.fields.PhoneStateModel phoneStateModel;
        String str4;
        org.xplatform.registration.visual.impl.presentation.state.models.fields.PhoneStateModel phoneStateModel2;
        String str5;
        ocf0 ocf0Var = (ocf0) this.l;
        wne wneVar = wne.f39444a;
        byte b = this.j;
        String str6 = "";
        if (b != 0) {
            if (b == 1) {
                vrb0Var = (vrb0) this.k;
                z1x.P(obj);
                objN = obj;
                str = "";
            } else {
                if (b == 2) {
                    z1x.P(obj);
                    objA = obj;
                    str = "";
                    yjeVar = null;
                    list = (List) objA;
                    q7f0Var = ((mbf0) ocf0Var.D()).g.M;
                    q7f0Var2 = q7f0.REGULATOR;
                    if (q7f0Var == q7f0Var2) {
                        ocf0Var.i0.m();
                    }
                    if ((((mbf0) ocf0Var.D()).g.M != q7f0.SOCIAL || ((mbf0) ocf0Var.D()).g.M == q7f0Var2) && ((mbf0) ocf0Var.D()).g.E == null) {
                        num = ((mbf0) ocf0Var.D()).g.D;
                        if (num == null) {
                            return Unit.f46060a;
                        }
                        ocf0Var.G(new jbf0(num.intValue()));
                        return Unit.f46060a;
                    }
                    this.k = list;
                    this.j = (byte) 3;
                    objO = ocf0Var.O(this);
                    if (objO != wneVar) {
                        list2 = list;
                    }
                    return wneVar;
                }
                if (b != 3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List list3 = (List) this.k;
                z1x.P(obj);
                list2 = list3;
                str = "";
                yjeVar = null;
                objO = obj;
            }
            iIntValue = ((Number) objO).intValue();
            xte0 xte0Var = ocf0Var.i0;
            countryStateModel = ((mbf0) ocf0Var.D()).g.g;
            if (countryStateModel != null) {
                i = countryStateModel.f46863a;
            } else {
                i = 0;
            }
            currencyStateModel = ((mbf0) ocf0Var.D()).g.h;
            if (currencyStateModel != null) {
                i2 = currencyStateModel.f46864a;
            } else {
                i2 = -1;
            }
            str2 = ((mbf0) ocf0Var.D()).g.u;
            if (str2 == null) {
                str3 = str;
            } else {
                str3 = str2;
            }
            bonusStateModel = ((mbf0) ocf0Var.D()).g.c;
            if (bonusStateModel != null) {
                i3 = bonusStateModel.f46860a;
            } else {
                i3 = iIntValue;
            }
            num2 = ((mbf0) ocf0Var.D()).g.D;
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            } else {
                iIntValue2 = -1;
            }
            q7f0Var3 = ((mbf0) ocf0Var.D()).g.M;
            if (q7f0Var3 == null) {
                q7f0Var3 = q7f0.FULL;
            }
            xte0Var.n(i, i2, str3, i3, iIntValue2, q7f0Var3);
            fs fsVar = new fs((Object) ocf0Var, list2, iIntValue, yjeVar, (byte) 14);
            yjeVar2 = yjeVar;
            pbf0 pbf0Var = new pbf0(ocf0Var, (byte) 11);
            qye0 qye0Var = new qye0(1, ocf0Var, ocf0.class, "handleRegistrationExceptions", "handleRegistrationExceptions(Ljava/lang/Throwable;)V", 0, (byte) 23);
            lie0 lie0Var = new lie0();
            phoneStateModel = ((mbf0) ocf0Var.D()).g.r;
            if (phoneStateModel != null) {
                str4 = phoneStateModel.b;
            } else {
                str4 = yjeVar2;
            }
            phoneStateModel2 = ((mbf0) ocf0Var.D()).g.r;
            if (phoneStateModel2 != null) {
                str5 = phoneStateModel2.f46866a;
            } else {
                str5 = yjeVar2;
            }
            ocf0Var.w0 = sac.T(new dnq(new fnq(new fnq(ocf0Var.W.a(new p6a("Registration", ohs0.n(str4, str5), str)), new d7a0(ocf0Var, yjeVar2, (byte) 25)), new wn2((Object) ocf0Var, (Object) lie0Var, (Object) fsVar, (Object) pbf0Var, (yje) null, (byte) 26), (byte) 4), new sye0(ocf0Var, yjeVar2, (byte) 2), (byte) 0), jiu0.a(ocf0Var), new tye0(qye0Var, yjeVar2, (byte) 3));
            return Unit.f46060a;
        }
        z1x.P(obj);
        vrb0Var = ocf0Var.R;
        mbf0 mbf0Var = (mbf0) ocf0Var.D();
        String strC = ((tv3) ocf0Var.q0.f384a).f34579a.c("APPS_FLYER_ID", "");
        String str7 = ((mbf0) ocf0Var.D()).A.d;
        List list4 = ((mbf0) ocf0Var.D()).r.K;
        mbf0Var.getClass();
        list4.getClass();
        lc00 lc00VarB = kotlin.collections.a.b();
        List list5 = mbf0Var.d;
        p1f0 p1f0Var = mbf0Var.g;
        org.xplatform.registration.visual.impl.presentation.state.models.fields.CitizenshipStateModel citizenshipStateModel = p1f0Var.o;
        Iterator it = list5.iterator();
        while (it.hasNext()) {
            q0f0 q0f0Var = (q0f0) it.next();
            if (q0f0Var instanceof gze0) {
                boolean z3 = ((gze0) q0f0Var).c;
                String str8 = p1f0Var.f26199a;
                if (str8 == null) {
                    str8 = str6;
                }
                m1qVar = new y0q(str8, z3);
            } else if (q0f0Var instanceof hze0) {
                m1qVar = new z0q(p1f0Var.b);
            } else {
                if (q0f0Var instanceof jze0) {
                    org.xplatform.registration.visual.impl.presentation.state.models.fields.BonusStateModel bonusStateModel2 = p1f0Var.c;
                    if (bonusStateModel2 != null) {
                        m1qVar = new c1q(bonusStateModel2.b, bonusStateModel2.f46860a, ((jze0) q0f0Var).c);
                    } else {
                        m1qVar = null;
                    }
                } else if (q0f0Var instanceof kze0) {
                    if (citizenshipStateModel != null) {
                        m1qVar = new d1q(((kze0) q0f0Var).c, citizenshipStateModel.f46861a);
                    } else {
                        m1qVar = null;
                    }
                } else if (q0f0Var instanceof lze0) {
                    org.xplatform.registration.visual.impl.presentation.state.models.fields.CityStateModel cityStateModel = p1f0Var.d;
                    if (cityStateModel != null) {
                        m1qVar = new e1q(((lze0) q0f0Var).c, cityStateModel.f46862a);
                    } else {
                        m1qVar = null;
                    }
                } else if (q0f0Var instanceof mze0) {
                    mze0 mze0Var = (mze0) q0f0Var;
                    m1qVar = new f1q(mze0Var.c, p1f0Var.e, mze0Var.d);
                } else if (q0f0Var instanceof xze0) {
                    xze0 xze0Var = (xze0) q0f0Var;
                    m1qVar = new o1q(xze0Var.c, p1f0Var.f, xze0Var.d);
                } else if (q0f0Var instanceof nze0) {
                    org.xplatform.registration.visual.impl.presentation.state.models.fields.CountryStateModel countryStateModel2 = p1f0Var.g;
                    if (countryStateModel2 != null) {
                        m1qVar = new g1q(countryStateModel2.b, countryStateModel2.f46863a, ((nze0) q0f0Var).c);
                    } else {
                        m1qVar = null;
                    }
                } else if (q0f0Var instanceof oze0) {
                    org.xplatform.registration.visual.impl.presentation.state.models.fields.CurrencyStateModel currencyStateModel2 = p1f0Var.h;
                    if (currencyStateModel2 != null) {
                        m1qVar = new h1q(currencyStateModel2.b, currencyStateModel2.f46864a, ((oze0) q0f0Var).c);
                    } else {
                        m1qVar = null;
                    }
                } else if (q0f0Var instanceof pze0) {
                    boolean z4 = ((pze0) q0f0Var).c;
                    Long l = p1f0Var.i;
                    if (l != null) {
                        long jLongValue = l.longValue();
                        rdj rdjVar = rdj.f30294a;
                        ynq0 ynq0Var = new ynq0(jLongValue);
                        sdj sdjVar = sdj.UNIQUE_10;
                        Locale locale = Locale.ENGLISH;
                        locale.getClass();
                        strA3 = rdj.a(ynq0Var, sdjVar, false, locale);
                    } else {
                        strA3 = null;
                    }
                    if (strA3 == null) {
                        strA3 = str6;
                    }
                    m1qVar = new b1q(strA3, z4);
                } else {
                    it = it;
                    str6 = str6;
                    if (q0f0Var instanceof qze0) {
                        org.xplatform.registration.visual.impl.presentation.state.models.fields.DocumentStateModel documentStateModel = p1f0Var.j;
                        if (documentStateModel != null) {
                            if (list4.isEmpty()) {
                                z2 = ((qze0) q0f0Var).c;
                            } else {
                                String str9 = citizenshipStateModel != null ? citizenshipStateModel.b : null;
                                if (str9 == null || str9.length() == 0 || list4.contains(Integer.valueOf(citizenshipStateModel.f46861a))) {
                                    z2 = ((qze0) q0f0Var).c;
                                } else {
                                    z2 = true;
                                }
                            }
                            y1qVar = new i1q(z2, documentStateModel.f46865a);
                            m1qVar = y1qVar;
                        } else {
                            m1qVar = null;
                        }
                    } else if (q0f0Var instanceof rze0) {
                        boolean z5 = ((rze0) q0f0Var).c;
                        String str10 = p1f0Var.k;
                        if (str10 == null) {
                            str10 = str6;
                        }
                        m1qVar = new j1q(str10, z5);
                    } else if (q0f0Var instanceof sze0) {
                        boolean z6 = ((sze0) q0f0Var).c;
                        String str11 = p1f0Var.l;
                        if (str11 == null) {
                            str11 = str6;
                        }
                        m1qVar = new k1q(StringsKt.u0(str11).toString(), z6);
                    } else if (q0f0Var instanceof uze0) {
                        boolean z7 = ((uze0) q0f0Var).c;
                        String str12 = p1f0Var.m;
                        if (str12 == null) {
                            str12 = str6;
                        }
                        m1qVar = new l1q(StringsKt.u0(str12).toString(), z7);
                    } else if (q0f0Var instanceof wze0) {
                        boolean z8 = ((wze0) q0f0Var).c;
                        String str13 = p1f0Var.n;
                        if (str13 == null) {
                            str13 = str6;
                        }
                        m1qVar = new n1q(StringsKt.u0(str13).toString(), z8);
                    } else if (q0f0Var instanceof a0f0) {
                        if (list4.isEmpty()) {
                            z = ((a0f0) q0f0Var).c;
                        } else {
                            String str14 = citizenshipStateModel != null ? citizenshipStateModel.b : null;
                            if (str14 == null || str14.length() == 0) {
                                z = ((a0f0) q0f0Var).c;
                            } else {
                                if (CollectionsKt.L(list4, citizenshipStateModel != null ? Integer.valueOf(citizenshipStateModel.f46861a) : null)) {
                                    z = ((a0f0) q0f0Var).c;
                                } else {
                                    z = true;
                                }
                            }
                        }
                        String str15 = p1f0Var.p;
                        if (str15 == null) {
                            str15 = str6;
                        }
                        m1qVar = new r1q(str15, z);
                    } else if (q0f0Var instanceof b0f0) {
                        boolean z9 = ((b0f0) q0f0Var).c;
                        String str16 = p1f0Var.q;
                        if (str16 == null) {
                            str16 = str6;
                        }
                        m1qVar = new s1q(str16, z9);
                    } else if (q0f0Var instanceof c0f0) {
                        boolean z10 = ((c0f0) q0f0Var).c;
                        org.xplatform.registration.visual.impl.presentation.state.models.fields.PhoneStateModel phoneStateModel3 = p1f0Var.r;
                        String str17 = phoneStateModel3 != null ? phoneStateModel3.f46866a : null;
                        if (str17 == null) {
                            str17 = str6;
                        }
                        String str18 = phoneStateModel3 != null ? phoneStateModel3.b : null;
                        if (str18 == null) {
                            str18 = str6;
                        }
                        m1qVar = new u1q(z10, str17, str18);
                    } else if (q0f0Var instanceof d0f0) {
                        m1qVar = new v1q(p1f0Var.s, ((d0f0) q0f0Var).c);
                    } else if (q0f0Var instanceof e0f0) {
                        boolean z11 = ((e0f0) q0f0Var).c;
                        String str19 = p1f0Var.t;
                        if (str19 == null) {
                            str19 = str6;
                        }
                        m1qVar = new w1q(str19, z11);
                    } else if (q0f0Var instanceof f0f0) {
                        boolean z12 = ((f0f0) q0f0Var).c;
                        String str20 = p1f0Var.u;
                        if (str20 == null) {
                            str20 = str6;
                        }
                        m1qVar = new x1q(str20, z12);
                    } else if (q0f0Var instanceof g0f0) {
                        org.xplatform.registration.visual.impl.presentation.state.models.fields.RegionStateModel regionStateModel = p1f0Var.v;
                        if (regionStateModel != null) {
                            y1qVar = new y1q(((g0f0) q0f0Var).c, regionStateModel.f46867a);
                            m1qVar = y1qVar;
                        } else {
                            m1qVar = null;
                        }
                    } else if (q0f0Var instanceof i0f0) {
                        m1qVar = new a2q(((i0f0) q0f0Var).c, p1f0Var.x);
                    } else if (q0f0Var instanceof j0f0) {
                        m1qVar = new b2q(((j0f0) q0f0Var).c, p1f0Var.y);
                    } else if (q0f0Var instanceof k0f0) {
                        boolean z13 = ((k0f0) q0f0Var).c;
                        String str21 = p1f0Var.z;
                        if (str21 == null) {
                            str21 = str6;
                        }
                        m1qVar = new c2q(str21, z13);
                    } else if (q0f0Var instanceof l0f0) {
                        m1qVar = new d2q(((l0f0) q0f0Var).c, p1f0Var.A);
                    } else if (q0f0Var instanceof m0f0) {
                        m1qVar = new e2q(((m0f0) q0f0Var).c, p1f0Var.B);
                    } else if (q0f0Var instanceof tze0) {
                        boolean z14 = ((tze0) q0f0Var).c;
                        Integer num3 = p1f0Var.F;
                        m1qVar = new g2q(z14, num3 != null ? num3.intValue() : -1);
                    } else if (q0f0Var instanceof o0f0) {
                        m1qVar = new h2q(((o0f0) q0f0Var).c, p1f0Var.C);
                    } else if (q0f0Var instanceof p0f0) {
                        boolean z15 = ((p0f0) q0f0Var).c;
                        Integer num4 = p1f0Var.D;
                        int iIntValue3 = num4 != null ? num4.intValue() : -1;
                        org.xplatform.registration.visual.impl.presentation.state.models.fields.SocialStateModel socialStateModel = p1f0Var.E;
                        String str22 = socialStateModel != null ? socialStateModel.b : null;
                        String str23 = str22 == null ? str6 : str22;
                        int i4 = socialStateModel != null ? socialStateModel.c : -1;
                        String str24 = socialStateModel != null ? socialStateModel.d : null;
                        String str25 = str24 == null ? str6 : str24;
                        String str26 = socialStateModel != null ? socialStateModel.e : null;
                        String str27 = str26 == null ? str6 : str26;
                        String str28 = socialStateModel != null ? socialStateModel.j : null;
                        String str29 = str28 == null ? str6 : str28;
                        String str30 = socialStateModel != null ? socialStateModel.f : null;
                        String str31 = str30 == null ? str6 : str30;
                        String str32 = socialStateModel != null ? socialStateModel.g : null;
                        String str33 = str32 == null ? str6 : str32;
                        String str34 = socialStateModel != null ? socialStateModel.h : null;
                        String str35 = str34 == null ? str6 : str34;
                        String str36 = socialStateModel != null ? socialStateModel.i : null;
                        m1qVar = new i2q(z15, iIntValue3, new djk0(i4, str23, str25, str27, str31, str33, str35, str36 == null ? str6 : str36, str29));
                    } else if (q0f0Var instanceof h0f0) {
                        boolean z16 = ((h0f0) q0f0Var).c;
                        String str37 = p1f0Var.w;
                        if (str37 == null) {
                            str37 = str6;
                        }
                        m1qVar = new z1q(str37, z16);
                    } else if (q0f0Var instanceof ize0) {
                        m1qVar = new a1q(strC);
                    } else if (q0f0Var instanceof yze0) {
                        boolean z17 = ((yze0) q0f0Var).c;
                        Long l2 = p1f0Var.I;
                        if (l2 != null) {
                            long jLongValue2 = l2.longValue();
                            rdj rdjVar2 = rdj.f30294a;
                            ynq0 ynq0Var2 = new ynq0(jLongValue2);
                            sdj sdjVar2 = sdj.UNIVERSAL;
                            Locale locale2 = Locale.ENGLISH;
                            locale2.getClass();
                            strA2 = rdj.a(ynq0Var2, sdjVar2, false, locale2);
                        } else {
                            strA2 = null;
                        }
                        if (strA2 == null) {
                            strA2 = str6;
                        }
                        m1qVar = new p1q(strA2, z17);
                    } else if (q0f0Var instanceof zze0) {
                        boolean z18 = ((zze0) q0f0Var).c;
                        Long l3 = p1f0Var.J;
                        if (l3 != null) {
                            long jLongValue3 = l3.longValue();
                            rdj rdjVar3 = rdj.f30294a;
                            ynq0 ynq0Var3 = new ynq0(jLongValue3);
                            sdj sdjVar3 = sdj.UNIVERSAL;
                            Locale locale3 = Locale.ENGLISH;
                            locale3.getClass();
                            strA = rdj.a(ynq0Var3, sdjVar3, false, locale3);
                        } else {
                            strA = null;
                        }
                        if (strA == null) {
                            strA = str6;
                        }
                        m1qVar = new q1q(strA, z18);
                    } else if (q0f0Var instanceof n0f0) {
                        m1qVar = new f2q(((n0f0) q0f0Var).c, p1f0Var.L);
                    } else {
                        if (!Intrinsics.d(q0f0Var, vze0.c)) {
                            t9f.b();
                            return null;
                        }
                        m1qVar = new m1q(str7);
                    }
                }
                if (m1qVar != null) {
                    lc00VarB.add(m1qVar);
                }
                it = it;
                str6 = str6;
            }
            it = it;
            str6 = str6;
            if (m1qVar != null) {
                lc00VarB.add(m1qVar);
            }
            it = it;
            str6 = str6;
        }
        str = str6;
        ArrayList arrayListN0 = CollectionsKt.N0(kotlin.collections.a.a(lc00VarB));
        this.k = vrb0Var;
        this.j = (byte) 1;
        objN = ocf0Var.N(arrayListN0, this);
        if (objN != wneVar) {
        }
        return wneVar;
        List list6 = ((mbf0) ocf0Var.D()).d;
        yjeVar = null;
        this.k = null;
        this.j = (byte) 2;
        objA = vrb0Var.a((List) objN, list6, this);
        if (objA != wneVar) {
            list = (List) objA;
            q7f0Var = ((mbf0) ocf0Var.D()).g.M;
            q7f0Var2 = q7f0.REGULATOR;
            if (q7f0Var == q7f0Var2) {
                ocf0Var.i0.m();
            }
            if (((mbf0) ocf0Var.D()).g.M != q7f0.SOCIAL) {
                num = ((mbf0) ocf0Var.D()).g.D;
                if (num == null) {
                    return Unit.f46060a;
                }
                ocf0Var.G(new jbf0(num.intValue()));
                return Unit.f46060a;
            }
            num = ((mbf0) ocf0Var.D()).g.D;
            if (num == null) {
                return Unit.f46060a;
            }
            ocf0Var.G(new jbf0(num.intValue()));
            return Unit.f46060a;
            this.k = list;
            this.j = (byte) 3;
            objO = ocf0Var.O(this);
            if (objO != wneVar) {
                list2 = list;
                iIntValue = ((Number) objO).intValue();
                xte0 xte0Var2 = ocf0Var.i0;
                countryStateModel = ((mbf0) ocf0Var.D()).g.g;
                if (countryStateModel != null) {
                    i = countryStateModel.f46863a;
                } else {
                    i = 0;
                }
                currencyStateModel = ((mbf0) ocf0Var.D()).g.h;
                if (currencyStateModel != null) {
                    i2 = currencyStateModel.f46864a;
                } else {
                    i2 = -1;
                }
                str2 = ((mbf0) ocf0Var.D()).g.u;
                if (str2 == null) {
                    str3 = str;
                } else {
                    str3 = str2;
                }
                bonusStateModel = ((mbf0) ocf0Var.D()).g.c;
                if (bonusStateModel != null) {
                    i3 = bonusStateModel.f46860a;
                } else {
                    i3 = iIntValue;
                }
                num2 = ((mbf0) ocf0Var.D()).g.D;
                if (num2 != null) {
                    iIntValue2 = num2.intValue();
                } else {
                    iIntValue2 = -1;
                }
                q7f0Var3 = ((mbf0) ocf0Var.D()).g.M;
                if (q7f0Var3 == null) {
                    q7f0Var3 = q7f0.FULL;
                }
                xte0Var2.n(i, i2, str3, i3, iIntValue2, q7f0Var3);
                fs fsVar2 = new fs((Object) ocf0Var, list2, iIntValue, yjeVar, (byte) 14);
                yjeVar2 = yjeVar;
                pbf0 pbf0Var2 = new pbf0(ocf0Var, (byte) 11);
                qye0 qye0Var2 = new qye0(1, ocf0Var, ocf0.class, "handleRegistrationExceptions", "handleRegistrationExceptions(Ljava/lang/Throwable;)V", 0, (byte) 23);
                lie0 lie0Var2 = new lie0();
                phoneStateModel = ((mbf0) ocf0Var.D()).g.r;
                if (phoneStateModel != null) {
                    str4 = phoneStateModel.b;
                } else {
                    str4 = yjeVar2;
                }
                phoneStateModel2 = ((mbf0) ocf0Var.D()).g.r;
                if (phoneStateModel2 != null) {
                    str5 = phoneStateModel2.f46866a;
                } else {
                    str5 = yjeVar2;
                }
                ocf0Var.w0 = sac.T(new dnq(new fnq(new fnq(ocf0Var.W.a(new p6a("Registration", ohs0.n(str4, str5), str)), new d7a0(ocf0Var, yjeVar2, (byte) 25)), new wn2((Object) ocf0Var, (Object) lie0Var2, (Object) fsVar2, (Object) pbf0Var2, (yje) null, (byte) 26), (byte) 4), new sye0(ocf0Var, yjeVar2, (byte) 2), (byte) 0), jiu0.a(ocf0Var), new tye0(qye0Var2, yjeVar2, (byte) 3));
                return Unit.f46060a;
            }
        }
        return wneVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
    
        if (r1.f(r7, r19) == r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object t(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            java.lang.Object r1 = r0.l
            a.aqf0 r1 = (a.aqf0) r1
            a.wne r2 = a.wne.f39444a
            byte r3 = r0.j
            r4 = 2
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L26
            if (r3 == r6) goto L1e
            if (r3 != r4) goto L18
            a.z1x.P(r20)
            goto L8c
        L18:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            return r5
        L1e:
            java.lang.Object r3 = r0.k
            a.wof0 r3 = (a.wof0) r3
            a.z1x.P(r20)
            goto L5e
        L26:
            a.z1x.P(r20)
            a.vqf0 r3 = r1.y
            if (r3 == 0) goto L8f
            a.wof0 r7 = r3.b
            if (r7 != 0) goto L32
            goto L8f
        L32:
            a.trf0 r3 = r3.f37854a
            a.vqf0 r8 = new a.vqf0
            r8.<init>(r3, r5)
            r1.y = r8
            a.p7m0 r3 = r1.E
        L3d:
            java.lang.Object r8 = r3.getValue()
            r9 = r8
            a.ipf0 r9 = (a.ipf0) r9
            r10 = 30
            a.ipf0 r9 = a.ipf0.a(r9, r5, r10)
            boolean r8 = r3.m(r8, r9)
            if (r8 == 0) goto L3d
            r0.k = r7
            r0.j = r6
            r8 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r3 = a.qcc.O(r8, r0)
            if (r3 != r2) goto L5d
            goto L8b
        L5d:
            r3 = r7
        L5e:
            a.fq r1 = r1.j
            a.ly5 r7 = new a.ly5
            double r8 = r3.l
            a.lnm0 r10 = r3.k
            a.lnm0 r11 = a.lnm0.f
            if (r10 != r11) goto L6c
        L6a:
            r11 = r6
            goto L6e
        L6c:
            r6 = 0
            goto L6a
        L6e:
            double r12 = r3.i
            a.csr r6 = r3.b
            a.bsr r6 = r6.f4905a
            a.esr r6 = r6.f3145a
            long r14 = r3.f39494a
            r17 = r14
            r14 = 0
            r16 = r6
            r7.<init>(r8, r10, r11, r12, r14, r16, r17)
            r0.k = r5
            r0.j = r4
            java.lang.Object r0 = r1.f(r7, r0)
            if (r0 != r2) goto L8c
        L8b:
            return r2
        L8c:
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        L8f:
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zye0.t(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (kotlin.Unit.f46060a == r1) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object x(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.k
            a.wuf0 r0 = (a.wuf0) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r9.j
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L1f
            if (r2 == r5) goto L1b
            if (r2 != r4) goto L15
            a.z1x.P(r10)
            goto L5e
        L15:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            return r3
        L1b:
            a.z1x.P(r10)
            goto L48
        L1f:
            a.z1x.P(r10)
            a.p7m0 r10 = r0.r
        L24:
            java.lang.Object r2 = r10.getValue()
            r6 = r2
            a.vuf0 r6 = (a.vuf0) r6
            r7 = 5
            r8 = 0
            a.vuf0 r6 = a.vuf0.a(r6, r8, r5, r8, r7)
            boolean r2 = r10.m(r2, r6)
            if (r2 == 0) goto L24
            a.b8u r10 = r0.b
            java.lang.Object r2 = r9.l
            java.io.File r2 = (java.io.File) r2
            a.dxk r6 = a.dxk.RESPONSIBLE_GAMING_DOC_RULES
            r9.j = r5
            java.lang.Object r10 = r10.e(r2, r6, r9)
            if (r10 != r1) goto L48
            goto L5d
        L48:
            java.io.File r10 = (java.io.File) r10
            a.p7m0 r0 = r0.q
            a.tuf0 r2 = new a.tuf0
            r2.<init>(r10)
            r9.j = r4
            r0.getClass()
            r0.o(r3, r2)
            kotlin.Unit r9 = kotlin.Unit.f46060a
            if (r9 != r1) goto L5e
        L5d:
            return r1
        L5e:
            kotlin.Unit r9 = kotlin.Unit.f46060a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zye0.x(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r14 == r2) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object y(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zye0.y(java.lang.Object):java.lang.Object");
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new zye0((eze0) this.k, (q7f0) this.l, yjeVar, (byte) 0);
            case 1:
                return new zye0((eze0) this.k, yjeVar, (byte) 1);
            case 2:
                return new zye0((eze0) this.k, yjeVar, (byte) 2);
            case 3:
                return new zye0(this.l, yjeVar, (byte) 3);
            case 4:
                return new zye0((x5f0) this.k, (q7f0) this.l, yjeVar, (byte) 4);
            case 5:
                return new zye0(this.l, yjeVar, (byte) 5);
            case 6:
                return new zye0(this.l, yjeVar, (byte) 6);
            case 7:
                return new zye0(this.l, yjeVar, (byte) 7);
            case 8:
                return new zye0((ocf0) this.k, (q7f0) this.l, yjeVar, (byte) 8);
            case 9:
                return new zye0(this.l, yjeVar, (byte) 9);
            case 10:
                return new zye0(this.l, yjeVar, (byte) 10);
            case 11:
                return new zye0(this.l, yjeVar, (byte) 11);
            case 12:
                return new zye0((wuf0) this.k, (File) this.l, yjeVar, (byte) 12);
            case 13:
                zye0 zye0Var = new zye0(this.l, yjeVar, (byte) 13);
                zye0Var.k = obj;
                return zye0Var;
            case 14:
                return new zye0((cxg0) this.k, (String) this.l, yjeVar, (byte) 14);
            case 15:
                return new zye0((cxg0) this.k, (SaleDataModel) this.l, yjeVar, (byte) 15);
            case 16:
                return new zye0(this.l, yjeVar, (byte) 16);
            case 17:
                return new zye0(this.l, yjeVar, (byte) 17);
            case 18:
                return new zye0((sah0) this.k, (xcz) this.l, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zye0((iph0) this.k, (noh0) this.l, yjeVar, (byte) 19);
            case 20:
                return new zye0((irh0) this.k, (hqh0) this.l, yjeVar, (byte) 20);
            case 21:
                return new zye0((zuh0) this.k, (dth0) this.l, yjeVar, (byte) 21);
            case 22:
                return new zye0((uri0) this.k, (String) this.l, yjeVar, (byte) 22);
            case 23:
                return new zye0((w5j0) this.k, (bm5) this.l, yjeVar, (byte) 23);
            case 24:
                return new zye0(this.l, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zye0((odj0) this.k, (ql5) this.l, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zye0((gpj0) this.k, (gji0) this.l, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zye0(this.l, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zye0(this.l, yjeVar, (byte) 28);
            default:
                return new zye0(this.l, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
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
        return ((zye0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0234  */
    /* JADX WARN: Code duplicated, block: B:112:0x0240  */
    /* JADX WARN: Code duplicated, block: B:115:0x0249  */
    /* JADX WARN: Code duplicated, block: B:117:0x0255  */
    /* JADX WARN: Code duplicated, block: B:122:0x026a  */
    /* JADX WARN: Code duplicated, block: B:127:0x0281  */
    /* JADX WARN: Code duplicated, block: B:129:0x028d  */
    /* JADX WARN: Code duplicated, block: B:130:0x0290  */
    /* JADX WARN: Code duplicated, block: B:132:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:136:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:195:0x0482  */
    /* JADX WARN: Code duplicated, block: B:248:0x055e  */
    /* JADX WARN: Code duplicated, block: B:250:0x0568  */
    /* JADX WARN: Code duplicated, block: B:292:0x0600  */
    /* JADX WARN: Code duplicated, block: B:459:0x0843  */
    /* JADX WARN: Code duplicated, block: B:470:0x088f  */
    /* JADX WARN: Code duplicated, block: B:479:0x08c8  */
    /* JADX WARN: Code duplicated, block: B:480:0x08d6  */
    /* JADX WARN: Code duplicated, block: B:484:0x08e8  */
    /* JADX WARN: Code duplicated, block: B:487:0x08fe  */
    /* JADX WARN: Code duplicated, block: B:488:0x0902  */
    /* JADX WARN: Code duplicated, block: B:491:0x090f  */
    /* JADX WARN: Code duplicated, block: B:492:0x0913  */
    /* JADX WARN: Code duplicated, block: B:495:0x0920  */
    /* JADX WARN: Code duplicated, block: B:496:0x0922  */
    /* JADX WARN: Code duplicated, block: B:499:0x092f  */
    /* JADX WARN: Code duplicated, block: B:500:0x0933  */
    /* JADX WARN: Code duplicated, block: B:503:0x0940  */
    /* JADX WARN: Code duplicated, block: B:504:0x0946  */
    /* JADX WARN: Code duplicated, block: B:507:0x0953  */
    /* JADX WARN: Code duplicated, block: B:510:0x0992  */
    /* JADX WARN: Code duplicated, block: B:511:0x0995  */
    /* JADX WARN: Code duplicated, block: B:514:0x09a2  */
    /* JADX WARN: Code duplicated, block: B:515:0x09a5  */
    /* JADX WARN: Code duplicated, block: B:555:0x0b32  */
    /* JADX WARN: Code duplicated, block: B:558:0x0b3c  */
    /* JADX WARN: Code duplicated, block: B:560:0x0b48  */
    /* JADX WARN: Code duplicated, block: B:563:0x0b52  */
    /* JADX WARN: Code duplicated, block: B:565:0x0b5e  */
    /* JADX WARN: Code duplicated, block: B:568:0x0b68  */
    /* JADX WARN: Code duplicated, block: B:570:0x0b74  */
    /* JADX WARN: Code duplicated, block: B:575:0x0b89  */
    /* JADX WARN: Code duplicated, block: B:580:0x0ba1  */
    /* JADX WARN: Code duplicated, block: B:582:0x0baf  */
    /* JADX WARN: Code duplicated, block: B:583:0x0bb2  */
    /* JADX WARN: Code duplicated, block: B:585:0x0bc7  */
    /* JADX WARN: Code duplicated, block: B:589:0x0be5  */
    /* JADX WARN: Code duplicated, block: B:604:0x0846 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0270, code lost:
    
        if (r1.V(r47) == r15) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if (r2.G((a.ql5) r3, r47) == r1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03ba, code lost:
    
        if (a.qjj.d0(r2, r4, r47) == r3) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0a8c, code lost:
    
        if (a.qjj.d0(r3, r4, r47) == r2) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0b90, code lost:
    
        if (r1.W(r47) == r4) goto L577;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x015c, code lost:
    
        if (a.qjj.d0(r2, r3, r47) == r14) goto L80;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:129:0x028d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:582:0x0baf, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r48) {
        /*
            Method dump skipped, instruction units count: 3168
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zye0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zye0(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zye0(eze0 eze0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = eze0Var;
    }
}

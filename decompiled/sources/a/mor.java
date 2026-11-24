package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class mor extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ spr k;
    public final /* synthetic */ u3z l;
    public final /* synthetic */ Long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mor(spr sprVar, u3z u3zVar, Long l, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = sprVar;
        this.l = u3zVar;
        this.m = l;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new mor(this.k, this.l, this.m, yjeVar, (byte) 0);
            default:
                return new mor(this.k, this.l, this.m, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((mor) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006a, code lost:
    
        if (a.slb.N(r1, r14) == r13) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b9, code lost:
    
        if (a.slb.N(r2, r14) == r0) goto L31;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            byte r0 = r14.i
            r7 = 3
            r8 = 4
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            a.spr r9 = r14.k
            r10 = 2
            r11 = 0
            r12 = 1
            switch(r0) {
                case 0: goto L71;
                default: goto Le;
            }
        Le:
            a.wne r13 = a.wne.f39444a
            byte r0 = r14.j
            if (r0 == 0) goto L25
            if (r0 == r12) goto L20
            if (r0 != r10) goto L1c
            a.z1x.P(r15)
            goto L6e
        L1c:
            a.jf4.n(r1)
            goto L70
        L20:
            a.z1x.P(r15)
            r0 = r15
            goto L4c
        L25:
            a.z1x.P(r15)
            a.tzi r0 = r9.E
            a.sff0 r1 = r9.M()
            boolean r2 = r1.D0
            a.sff0 r1 = r9.M()
            a.oxk0 r1 = r1.I1
            byte r4 = r1.f26017a
            a.sff0 r1 = r9.M()
            boolean r5 = r1.K1
            r14.j = r12
            a.u3z r1 = r14.l
            java.lang.Long r3 = r14.m
            r6 = r14
            java.lang.Object r0 = r0.o(r1, r2, r3, r4, r5, r6)
            if (r0 != r13) goto L4c
            goto L6c
        L4c:
            a.gmq r0 = (a.gmq) r0
            a.lor r1 = new a.lor
            r1.<init>(r9, r11, r12)
            a.fnq r2 = new a.fnq
            r2.<init>(r0, r1, r8)
            a.lo3 r0 = new a.lo3
            r1 = 13
            r0.<init>(r7, r11, r1)
            a.dnq r1 = new a.dnq
            r1.<init>(r2, r0, r12)
            r14.j = r10
            java.lang.Object r0 = a.slb.N(r1, r14)
            if (r0 != r13) goto L6e
        L6c:
            r11 = r13
            goto L70
        L6e:
            kotlin.Unit r11 = kotlin.Unit.f46060a
        L70:
            return r11
        L71:
            a.wne r0 = a.wne.f39444a
            byte r2 = r14.j
            if (r2 == 0) goto L88
            if (r2 == r12) goto L83
            if (r2 != r10) goto L7f
            a.z1x.P(r15)
            goto Lbd
        L7f:
            a.jf4.n(r1)
            goto Lbf
        L83:
            a.z1x.P(r15)
            r1 = r15
            goto L9a
        L88:
            a.z1x.P(r15)
            a.wdu r1 = r9.F
            r14.j = r12
            a.u3z r2 = r14.l
            java.lang.Long r3 = r14.m
            java.lang.Object r1 = r1.w(r2, r3, r14)
            if (r1 != r0) goto L9a
            goto Lbb
        L9a:
            a.gmq r1 = (a.gmq) r1
            a.lor r2 = new a.lor
            r3 = 0
            r2.<init>(r9, r11, r3)
            a.fnq r3 = new a.fnq
            r3.<init>(r1, r2, r8)
            a.lo3 r1 = new a.lo3
            r2 = 12
            r1.<init>(r7, r11, r2)
            a.dnq r2 = new a.dnq
            r2.<init>(r3, r1, r12)
            r14.j = r10
            java.lang.Object r1 = a.slb.N(r2, r14)
            if (r1 != r0) goto Lbd
        Lbb:
            r11 = r0
            goto Lbf
        Lbd:
            kotlin.Unit r11 = kotlin.Unit.f46060a
        Lbf:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a.mor.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

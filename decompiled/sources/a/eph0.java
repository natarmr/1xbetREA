package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class eph0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public /* synthetic */ Object k;
    public final /* synthetic */ iph0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eph0(iph0 iph0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = iph0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        iph0 iph0Var = this.l;
        switch (b) {
            case 0:
                eph0 eph0Var = new eph0(iph0Var, yjeVar, (byte) 0);
                eph0Var.k = obj;
                return eph0Var;
            default:
                eph0 eph0Var2 = new eph0(iph0Var, yjeVar, (byte) 1);
                eph0Var2.k = obj;
                return eph0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((eph0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((eph0) create((e7a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (a.qcc.O(3000, r8) == r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a7, code lost:
    
        if (r0.a((a.jph0) r9, r8) == r6) goto L40;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.i
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            a.iph0 r2 = r8.l
            r3 = 1
            r4 = 2
            r5 = 0
            switch(r0) {
                case 0: goto L73;
                default: goto Lc;
            }
        Lc:
            java.lang.Object r0 = r8.k
            a.e7a r0 = (a.e7a) r0
            a.wne r6 = a.wne.f39444a
            byte r7 = r8.j
            if (r7 == 0) goto L26
            if (r7 == r3) goto L22
            if (r7 != r4) goto L1e
            a.z1x.P(r9)
            goto L5f
        L1e:
            a.jf4.n(r1)
            goto L72
        L22:
            a.z1x.P(r9)
            goto L51
        L26:
            a.z1x.P(r9)
            if (r0 == 0) goto L6f
            boolean r9 = r0 instanceof a.d7a
            if (r9 == 0) goto L3c
            a.ol60 r8 = r2.J
            a.yoh0 r9 = new a.yoh0
            a.d7a r0 = (a.d7a) r0
            r9.<init>(r0)
            r8.f(r9)
            goto L6c
        L3c:
            boolean r9 = r0 instanceof a.c7a
            if (r9 == 0) goto L6f
            a.abu r9 = r2.r
            a.c7a r0 = (a.c7a) r0
            a.ynb0 r0 = r0.f3852a
            r8.k = r5
            r8.j = r3
            java.lang.Object r9 = r9.x(r0, r8)
            if (r9 != r6) goto L51
            goto L5d
        L51:
            r8.k = r5
            r8.j = r4
            r0 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r8 = a.qcc.O(r0, r8)
            if (r8 != r6) goto L5f
        L5d:
            r5 = r6
            goto L72
        L5f:
            r2.x()
            a.p7m0 r8 = r2.D
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r8.getClass()
            r8.o(r5, r9)
        L6c:
            kotlin.Unit r5 = kotlin.Unit.f46060a
            goto L72
        L6f:
            a.t9f.b()
        L72:
            return r5
        L73:
            java.lang.Object r0 = r8.k
            a.kmq r0 = (a.kmq) r0
            a.wne r6 = a.wne.f39444a
            byte r7 = r8.j
            if (r7 == 0) goto L8d
            if (r7 == r3) goto L89
            if (r7 != r4) goto L85
            a.z1x.P(r9)
            goto Lab
        L85:
            a.jf4.n(r1)
            goto Lad
        L89:
            a.z1x.P(r9)
            goto L9d
        L8d:
            a.z1x.P(r9)
            a.phf0 r9 = r2.d
            r8.k = r0
            r8.j = r3
            java.lang.Object r9 = r9.v(r3, r8)
            if (r9 != r6) goto L9d
            goto La9
        L9d:
            a.jph0 r9 = (a.jph0) r9
            r8.k = r5
            r8.j = r4
            java.lang.Object r8 = r0.a(r9, r8)
            if (r8 != r6) goto Lab
        La9:
            r5 = r6
            goto Lad
        Lab:
            kotlin.Unit r5 = kotlin.Unit.f46060a
        Lad:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.eph0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

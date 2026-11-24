package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class zsa0 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ ata0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zsa0(ata0 ata0Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = ata0Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        ata0 ata0Var = this.k;
        switch (b) {
            case 0:
                return new zsa0(ata0Var, yjeVar, (byte) 0);
            default:
                return new zsa0(ata0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((zsa0) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (((a.gmq) r13).c(r1, r12) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
    
        if (((a.gmq) r13).c(r12, r11) == r0) goto L31;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            byte r0 = r12.i
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r2 = 1
            r3 = 2
            a.ata0 r4 = r12.k
            r5 = 0
            switch(r0) {
                case 0: goto L54;
                default: goto Lc;
            }
        Lc:
            a.wne r0 = a.wne.f39444a
            byte r6 = r12.j
            if (r6 == 0) goto L22
            if (r6 == r2) goto L1e
            if (r6 != r3) goto L1a
            a.z1x.P(r13)
            goto L51
        L1a:
            a.jf4.n(r1)
            goto L53
        L1e:
            a.z1x.P(r13)
            goto L3f
        L22:
            a.z1x.P(r13)
            a.w5z r13 = r4.w
            r12.j = r2
            java.lang.Object r1 = r13.b
            a.s1u r1 = (a.s1u) r1
            a.i89 r1 = r1.a()
            a.kh1 r2 = new a.kh1
            r6 = 13
            r2.<init>(r5, r13, r6)
            a.utb r13 = a.aoq.c(r1, r2)
            if (r13 != r0) goto L3f
            goto L4f
        L3f:
            a.gmq r13 = (a.gmq) r13
            a.ysa0 r1 = new a.ysa0
            r2 = 3
            r1.<init>(r4, r2)
            r12.j = r3
            java.lang.Object r12 = r13.c(r1, r12)
            if (r12 != r0) goto L51
        L4f:
            r5 = r0
            goto L53
        L51:
            kotlin.Unit r5 = kotlin.Unit.f46060a
        L53:
            return r5
        L54:
            a.wne r0 = a.wne.f39444a
            byte r6 = r12.j
            if (r6 == 0) goto L6b
            if (r6 == r2) goto L66
            if (r6 != r3) goto L62
            a.z1x.P(r13)
            goto La8
        L62:
            a.jf4.n(r1)
            goto Laa
        L66:
            a.z1x.P(r13)
            r11 = r12
            goto L96
        L6b:
            a.z1x.P(r13)
            a.pru r13 = r4.v
            a.sff0 r13 = r13.a()
            a.u3z r5 = new a.u3z
            long r6 = r4.o
            a.t3z r8 = a.t3z.b
            r9 = 314(0x13a, double:1.55E-321)
            r5.<init>(r6, r8, r9)
            a.tzi r1 = r4.r
            boolean r7 = r13.D0
            a.oxk0 r6 = r13.I1
            byte r9 = r6.f26017a
            boolean r10 = r13.K1
            r12.j = r2
            r8 = 0
            r11 = r12
            r6 = r5
            r5 = r1
            java.lang.Object r13 = r5.o(r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L96
            goto La6
        L96:
            a.gmq r13 = (a.gmq) r13
            a.ysa0 r12 = new a.ysa0
            r1 = 0
            r12.<init>(r4, r1)
            r11.j = r3
            java.lang.Object r12 = r13.c(r12, r11)
            if (r12 != r0) goto La8
        La6:
            r5 = r0
            goto Laa
        La8:
            kotlin.Unit r5 = kotlin.Unit.f46060a
        Laa:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zsa0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class gm20 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ mn20 k;
    public final /* synthetic */ m0k0 l;
    public final /* synthetic */ zxj0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gm20(mn20 mn20Var, m0k0 m0k0Var, zxj0 zxj0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = mn20Var;
        this.l = m0k0Var;
        this.m = zxj0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new gm20(this.k, this.l, this.m, yjeVar, (byte) 0);
            default:
                return new gm20(this.k, this.l, this.m, yjeVar, (byte) 1);
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
        return ((gm20) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        if (r8.D(r1, r3, r11, r7, r13) == r10) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b2, code lost:
    
        if (r8.D(r1, r3, r11, r6, r13) == r10) goto L31;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            byte r0 = r13.i
            a.hi20 r1 = a.hi20.f13094a
            a.zxj0 r2 = r13.m
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            r5 = 2
            a.m0k0 r6 = r13.l
            r7 = 0
            switch(r0) {
                case 0: goto L64;
                default: goto L10;
            }
        L10:
            a.wne r10 = a.wne.f39444a
            byte r0 = r13.j
            a.mn20 r8 = r13.k
            if (r0 == 0) goto L29
            if (r0 == r4) goto L24
            if (r0 != r5) goto L20
            a.z1x.P(r14)
            goto L61
        L20:
            a.jf4.n(r3)
            goto L63
        L24:
            a.z1x.P(r14)
            r0 = r14
            goto L3d
        L29:
            a.z1x.P(r14)
            a.xzp r0 = r8.t
            a.ms2 r3 = r8.h
            a.gwe r3 = a.phu0.Y(r3)
            r13.j = r4
            java.lang.Object r0 = r0.N(r6, r2, r3, r13)
            if (r0 != r10) goto L3d
            goto L5f
        L3d:
            a.vtd r0 = (a.vtd) r0
            a.ol60 r2 = r8.O
            r2.f(r0)
            a.p7m0 r0 = r8.R
            r0.getClass()
            r0.o(r7, r1)
            long r1 = r6.Y
            long r3 = r6.f20959a
            long r11 = r6.B
            r0 = r8
            long r7 = r6.z
            r13.j = r5
            r9 = r13
            r5 = r11
            java.lang.Object r0 = r0.D(r1, r3, r5, r7, r9)
            if (r0 != r10) goto L61
        L5f:
            r7 = r10
            goto L63
        L61:
            kotlin.Unit r7 = kotlin.Unit.f46060a
        L63:
            return r7
        L64:
            a.wne r10 = a.wne.f39444a
            byte r0 = r13.j
            a.mn20 r8 = r13.k
            if (r0 == 0) goto L7d
            if (r0 == r4) goto L78
            if (r0 != r5) goto L74
            a.z1x.P(r14)
            goto Lb6
        L74:
            a.jf4.n(r3)
            goto Lb8
        L78:
            a.z1x.P(r14)
            r0 = r14
            goto L91
        L7d:
            a.z1x.P(r14)
            a.cr r0 = r8.v
            a.ms2 r3 = r8.h
            a.gwe r3 = a.phu0.Y(r3)
            r13.j = r4
            java.lang.Object r0 = a.cr.c(r0, r6, r2, r3, r13)
            if (r0 != r10) goto L91
            goto Lb4
        L91:
            a.aud r0 = (a.aud) r0
            a.ol60 r2 = r8.O
            r2.f(r0)
            a.p7m0 r0 = r8.R
            r0.getClass()
            r0.o(r7, r1)
            long r1 = r6.Y
            long r3 = r6.f20959a
            long r11 = r6.B
            long r6 = r6.z
            r13.j = r5
            r9 = r13
            r0 = r8
            r7 = r6
            r5 = r11
            java.lang.Object r0 = r0.D(r1, r3, r5, r7, r9)
            if (r0 != r10) goto Lb6
        Lb4:
            r7 = r10
            goto Lb8
        Lb6:
            kotlin.Unit r7 = kotlin.Unit.f46060a
        Lb8:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gm20.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

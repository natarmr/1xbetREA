package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class u9w extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ naw k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u9w(naw nawVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = nawVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        naw nawVar = this.k;
        switch (b) {
            case 0:
                return new u9w(nawVar, yjeVar, (byte) 0);
            default:
                return new u9w(nawVar, yjeVar, (byte) 1);
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
        return ((u9w) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (a.qjj.d0(r1, r6, r13) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        if (r8.k(r6, r13) == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a9, code lost:
    
        if (r8.k(r6, r13) == r0) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            byte r0 = r13.i
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r2 = 2
            a.naw r3 = r13.k
            r4 = 1
            r5 = 0
            switch(r0) {
                case 0: goto L5b;
                default: goto Lc;
            }
        Lc:
            a.wne r0 = a.wne.f39444a
            byte r6 = r13.j
            if (r6 == 0) goto L22
            if (r6 == r4) goto L1e
            if (r6 != r2) goto L1a
            a.z1x.P(r14)
            goto L58
        L1a:
            a.jf4.n(r1)
            goto L5a
        L1e:
            a.z1x.P(r14)
            goto L43
        L22:
            a.z1x.P(r14)
            a.a6u r14 = r3.f
            a.s77 r1 = r3.z0
            r13.j = r4
            java.lang.Object r6 = r14.b
            a.g2v r6 = (a.g2v) r6
            a.bm5 r7 = a.bm5.c
            boolean r6 = r6.i(r7)
            if (r6 == 0) goto L3c
            java.io.Serializable r14 = r14.o(r1, r13)
            goto L40
        L3c:
            java.lang.Object r14 = r14.K(r13)
        L40:
            if (r14 != r0) goto L43
            goto L56
        L43:
            a.ql5 r14 = (a.ql5) r14
            a.mne r1 = r3.L
            a.vs10 r1 = r1.c
            a.haw r6 = new a.haw
            r6.<init>(r3, r14, r5, r4)
            r13.j = r2
            java.lang.Object r13 = a.qjj.d0(r1, r6, r13)
            if (r13 != r0) goto L58
        L56:
            r5 = r0
            goto L5a
        L58:
            kotlin.Unit r5 = kotlin.Unit.f46060a
        L5a:
            return r5
        L5b:
            long r6 = r3.y0
            a.wne r0 = a.wne.f39444a
            byte r8 = r13.j
            r9 = 0
            if (r8 == 0) goto L75
            if (r8 == r4) goto L71
            if (r8 != r2) goto L6d
            a.z1x.P(r14)
            goto Lad
        L6d:
            a.jf4.n(r1)
            goto Lb9
        L71:
            a.z1x.P(r14)
            goto Lb7
        L75:
            a.z1x.P(r14)
            a.sys0 r14 = r3.d
            a.sys0 r1 = a.sys0.c
            a.ehf0 r8 = r3.q
            if (r14 != r1) goto L89
            r13.j = r4
            java.lang.Object r13 = r8.k(r6, r13)
            if (r13 != r0) goto Lb7
            goto Lab
        L89:
            a.ocl r14 = r3.i0
            long r11 = r14.d()
            java.lang.Long r14 = new java.lang.Long
            r14.<init>(r11)
            long r11 = r14.longValue()
            int r1 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r1 == 0) goto L9d
            r5 = r14
        L9d:
            if (r5 == 0) goto La3
            long r6 = r5.longValue()
        La3:
            r13.j = r2
            java.lang.Object r13 = r8.k(r6, r13)
            if (r13 != r0) goto Lad
        Lab:
            r5 = r0
            goto Lb9
        Lad:
            a.hpc r13 = r3.j0
            a.rrd r13 = r13.f13434a
            java.lang.Object r13 = r13.g
            a.m0w r13 = (a.m0w) r13
            r13.h = r9
        Lb7:
            kotlin.Unit r5 = kotlin.Unit.f46060a
        Lb9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.u9w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class gcj extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ ncj k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gcj(ncj ncjVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ncjVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ncj ncjVar = this.k;
        switch (b) {
            case 0:
                return new gcj(ncjVar, yjeVar, (byte) 0);
            default:
                return new gcj(ncjVar, yjeVar, (byte) 1);
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
        return ((gcj) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r10 == r7) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009b, code lost:
    
        if (r10.c(r1, r9) == r0) goto L41;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            byte r0 = r9.i
            r1 = -1
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            a.ncj r4 = r9.k
            r5 = 1
            r6 = 2
            switch(r0) {
                case 0: goto L55;
                default: goto Ld;
            }
        Ld:
            a.ocj r0 = r4.h
            a.wne r7 = a.wne.f39444a
            byte r8 = r9.j
            if (r8 == 0) goto L27
            if (r8 == r5) goto L21
            if (r8 != r6) goto L1d
            a.z1x.P(r10)
            goto L4b
        L1d:
            a.jf4.n(r3)
            goto L54
        L21:
            a.z1x.P(r10)     // Catch: java.lang.Throwable -> L25
            goto L40
        L25:
            r9 = move-exception
            goto L4f
        L27:
            a.z1x.P(r10)
            a.g7m0 r10 = r0.a()
            boolean r10 = r10 instanceof a.hbq
            if (r10 == 0) goto L37
            a.g7m0 r2 = r0.a()
            goto L54
        L37:
            r9.j = r5     // Catch: java.lang.Throwable -> L25
            java.lang.Object r10 = r4.f(r9)     // Catch: java.lang.Throwable -> L25
            if (r10 != r7) goto L40
            goto L49
        L40:
            r9.j = r6
            r10 = 0
            java.lang.Object r10 = r4.g(r10, r9)
            if (r10 != r7) goto L4b
        L49:
            r2 = r7
            goto L54
        L4b:
            r2 = r10
            a.g7m0 r2 = (a.g7m0) r2
            goto L54
        L4f:
            a.jae0 r2 = new a.jae0
            r2.<init>(r1, r9)
        L54:
            return r2
        L55:
            a.wne r0 = a.wne.f39444a
            byte r7 = r9.j
            if (r7 == 0) goto L6b
            if (r7 == r5) goto L67
            if (r7 != r6) goto L63
            a.z1x.P(r10)
            goto L9f
        L63:
            a.jf4.n(r3)
            goto La1
        L67:
            a.z1x.P(r10)
            goto L82
        L6b:
            a.z1x.P(r10)
            a.pmi r10 = r4.i
            r9.j = r5
            java.lang.Object r10 = r10.c
            a.odd r10 = (a.odd) r10
            java.lang.Object r10 = r10.q(r9)
            if (r10 != r0) goto L7d
            goto L7f
        L7d:
            kotlin.Unit r10 = kotlin.Unit.f46060a
        L7f:
            if (r10 != r0) goto L82
            goto L9d
        L82:
            a.mlx r10 = r4.c()
            a.gmq r10 = r10.c()
            a.gmq r10 = a.ulb.D(r10, r1)
            a.b5h r1 = new a.b5h
            r2 = 12
            r1.<init>(r4, r2)
            r9.j = r6
            java.lang.Object r9 = r10.c(r1, r9)
            if (r9 != r0) goto L9f
        L9d:
            r2 = r0
            goto La1
        L9f:
            kotlin.Unit r2 = kotlin.Unit.f46060a
        La1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gcj.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

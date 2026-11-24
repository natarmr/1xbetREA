package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class uf30 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ xcz l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uf30(boolean z, xcz xczVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = z;
        this.l = xczVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        xcz xczVar = this.l;
        boolean z = this.k;
        switch (b) {
            case 0:
                return new uf30(z, xczVar, yjeVar, (byte) 0);
            default:
                return new uf30(z, xczVar, yjeVar, (byte) 1);
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
        return ((uf30) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r4.l(r10, 0, r9) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r10.c(r1, r9) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        if (r4.l(r10, 0, r9) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
    
        if (r10.c(r1, r9) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return r0;
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
            boolean r1 = r9.k
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 2
            a.xcz r4 = r9.l
            r5 = 0
            r6 = 1
            r7 = 0
            switch(r0) {
                case 0: goto L56;
                default: goto Lf;
            }
        Lf:
            a.wne r0 = a.wne.f39444a
            byte r8 = r9.j
            if (r8 == 0) goto L22
            if (r8 == r6) goto L1e
            if (r8 != r3) goto L1a
            goto L1e
        L1a:
            a.jf4.n(r2)
            goto L55
        L1e:
            a.z1x.P(r10)
            goto L53
        L22:
            a.z1x.P(r10)
            if (r1 == 0) goto L39
            a.mcz r10 = r4.j()
            int r10 = r10.o
            int r10 = r10 - r6
            if (r10 < 0) goto L53
            r9.j = r6
            java.lang.Object r9 = r4.l(r10, r5, r9)
            if (r9 != r0) goto L53
            goto L51
        L39:
            a.a7s r10 = new a.a7s
            r1 = 15
            r10.<init>(r4, r1)
            a.vsg0 r10 = a.ydx.V(r7, r10)
            a.tf30 r1 = new a.tf30
            r1.<init>(r4, r6)
            r9.j = r3
            java.lang.Object r9 = r10.c(r1, r9)
            if (r9 != r0) goto L53
        L51:
            r7 = r0
            goto L55
        L53:
            kotlin.Unit r7 = kotlin.Unit.f46060a
        L55:
            return r7
        L56:
            a.wne r0 = a.wne.f39444a
            byte r8 = r9.j
            if (r8 == 0) goto L69
            if (r8 == r6) goto L65
            if (r8 != r3) goto L61
            goto L65
        L61:
            a.jf4.n(r2)
            goto L9c
        L65:
            a.z1x.P(r10)
            goto L9a
        L69:
            a.z1x.P(r10)
            if (r1 == 0) goto L80
            a.mcz r10 = r4.j()
            int r10 = r10.o
            int r10 = r10 - r6
            if (r10 < 0) goto L9a
            r9.j = r6
            java.lang.Object r9 = r4.l(r10, r5, r9)
            if (r9 != r0) goto L9a
            goto L98
        L80:
            a.a7s r10 = new a.a7s
            r1 = 14
            r10.<init>(r4, r1)
            a.vsg0 r10 = a.ydx.V(r7, r10)
            a.tf30 r1 = new a.tf30
            r1.<init>(r4, r5)
            r9.j = r3
            java.lang.Object r9 = r10.c(r1, r9)
            if (r9 != r0) goto L9a
        L98:
            r7 = r0
            goto L9c
        L9a:
            kotlin.Unit r7 = kotlin.Unit.f46060a
        L9c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.uf30.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

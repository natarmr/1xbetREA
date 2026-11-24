package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.statistic.stage.api.domain.TypeStageId;

/* JADX INFO: loaded from: classes6.dex */
public final class c1m0 extends bnn0 implements Function2 {
    public byte i;
    public final /* synthetic */ TypeStageId j;
    public final /* synthetic */ nvu k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1m0(TypeStageId typeStageId, nvu nvuVar, yje yjeVar) {
        super(2, yjeVar);
        this.j = typeStageId;
        this.k = nvuVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new c1m0(this.j, this.k, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c1m0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r10 == r2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        if (r10 == r2) goto L20;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            a.nvu r0 = r9.k
            java.lang.Object r1 = r0.c
            a.knf0 r1 = (a.knf0) r1
            java.lang.Object r0 = r0.b
            a.nw20 r0 = (a.nw20) r0
            a.wne r2 = a.wne.f39444a
            byte r3 = r9.i
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L25
            if (r3 == r6) goto L21
            if (r3 != r5) goto L1b
            a.z1x.P(r10)
            goto L79
        L1b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            return r4
        L21:
            a.z1x.P(r10)
            goto L53
        L25:
            a.z1x.P(r10)
            org.xplatform.statistic.stage.api.domain.TypeStageId r10 = r9.j
            java.lang.String r3 = org.xplatform.statistic.stage.api.domain.c.a(r10)
            boolean r7 = r10 instanceof org.xplatform.statistic.stage.api.domain.TypeStageId.Game
            java.lang.String r8 = "application/vnd.xenvelop+json"
            if (r7 == 0) goto L56
            java.lang.String r10 = r1.c()
            int r1 = r1.b()
            java.util.LinkedHashMap r10 = a.ofm0.o(r1, r3, r10)
            r9.i = r6
            java.lang.Object r0 = r0.b
            a.goi0 r0 = (a.goi0) r0
            java.lang.Object r0 = r0.invoke()
            a.xzl0 r0 = (a.xzl0) r0
            java.lang.Object r10 = r0.a(r10, r8, r9)
            if (r10 != r2) goto L53
            goto L78
        L53:
            a.dx5 r10 = (a.dx5) r10
            goto L7b
        L56:
            boolean r10 = r10 instanceof org.xplatform.statistic.stage.api.domain.TypeStageId.Champ
            if (r10 == 0) goto L86
            java.lang.String r10 = r1.c()
            int r1 = r1.b()
            java.util.LinkedHashMap r10 = a.ofm0.o(r1, r3, r10)
            r9.i = r5
            java.lang.Object r0 = r0.b
            a.goi0 r0 = (a.goi0) r0
            java.lang.Object r0 = r0.invoke()
            a.xzl0 r0 = (a.xzl0) r0
            java.lang.Object r10 = r0.b(r10, r8, r9)
            if (r10 != r2) goto L79
        L78:
            return r2
        L79:
            a.dx5 r10 = (a.dx5) r10
        L7b:
            java.lang.Object r9 = r10.a()
            a.f1m0 r9 = (a.f1m0) r9
            a.r1m0 r9 = a.g8x.Z(r9)
            return r9
        L86:
            a.t9f.b()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a.c1m0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class iru0 extends bnn0 implements Function2 {
    public byte i;
    public final /* synthetic */ jru0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iru0(jru0 jru0Var, yje yjeVar) {
        super(2, yjeVar);
        this.j = jru0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new iru0(this.j, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((iru0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (r7 == r0) goto L15;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            a.wne r0 = a.wne.f39444a
            byte r1 = r7.i
            r2 = 2
            r3 = 1
            a.jru0 r4 = r7.j
            if (r1 == 0) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L16
            a.z1x.P(r8)
            a.j0g0 r8 = (a.j0g0) r8
            java.lang.Object r7 = r8.f15681a
            goto L42
        L16:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            r7 = 0
            return r7
        L1d:
            a.z1x.P(r8)
            goto L2f
        L21:
            a.z1x.P(r8)
            a.pmi r8 = r4.u
            r7.i = r3
            java.io.Serializable r8 = r8.x(r7)
            if (r8 != r0) goto L2f
            goto L41
        L2f:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            a.g2v r1 = r4.t
            org.xplatform.cyber.section.api.domain.entity.CyberGamesPage$Virtual r3 = org.xplatform.cyber.section.api.domain.entity.CyberGamesPage.Virtual.INSTANCE
            r7.i = r2
            java.lang.Object r7 = r1.j(r3, r8, r7)
            if (r7 != r0) goto L42
        L41:
            return r0
        L42:
            int r8 = a.jru0.y
            a.ocj r8 = r4.i
            a.p7m0 r8 = r8.f25029a
        L48:
            java.lang.Object r0 = r8.getValue()
            r0.getClass()
            r1 = r0
            a.fru0 r1 = (a.fru0) r1
            a.j0g0 r3 = new a.j0g0
            r3.<init>(r7)
            r5 = 0
            r6 = 13
            r2 = 0
            r4 = 0
            a.fru0 r1 = a.fru0.a(r1, r2, r3, r4, r5, r6)
            boolean r0 = r8.m(r0, r1)
            if (r0 == 0) goto L48
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.iru0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

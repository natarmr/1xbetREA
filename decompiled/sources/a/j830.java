package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class j830 extends bnn0 implements Function2 {
    public byte i;
    public final /* synthetic */ l830 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j830(l830 l830Var, yje yjeVar) {
        super(2, yjeVar);
        this.j = l830Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new j830(this.j, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j830) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (a.slb.N(r1, r8) == r0) goto L15;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            a.wne r0 = a.wne.f39444a
            byte r1 = r8.i
            r2 = 0
            r3 = 2
            r4 = 1
            a.l830 r5 = r8.j
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L19
            if (r1 != r3) goto L13
            a.z1x.P(r9)
            goto L4f
        L13:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r2
        L19:
            a.z1x.P(r9)
            goto L2f
        L1d:
            a.z1x.P(r9)
            a.wdu r9 = r5.p
            org.xplatform.sportgame.markets.base.api.navigation.MarketsParams$StandardSubGame r1 = r5.x
            long r6 = r1.c
            r8.i = r4
            java.lang.Object r9 = r9.v(r6, r8)
            if (r9 != r0) goto L2f
            goto L4e
        L2f:
            a.gmq r9 = (a.gmq) r9
            a.h830 r1 = new a.h830
            r1.<init>(r5, r2)
            a.fnq r6 = new a.fnq
            r7 = 4
            r6.<init>(r9, r1, r7)
            a.i830 r9 = new a.i830
            r9.<init>(r5, r2)
            a.dnq r1 = new a.dnq
            r1.<init>(r6, r9, r4)
            r8.i = r3
            java.lang.Object r8 = a.slb.N(r1, r8)
            if (r8 != r0) goto L4f
        L4e:
            return r0
        L4f:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.j830.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

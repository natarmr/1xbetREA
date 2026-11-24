package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class pnf extends bnn0 implements ydr {
    public final /* synthetic */ byte i = 0;
    public byte j;
    public Object k;
    public /* synthetic */ Object l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pnf(Function1 function1, xdr xdrVar, yje yjeVar) {
        super(4, yjeVar);
        this.m = function1;
        this.n = xdrVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (((a.xdr) r3).F(r1, r8, r29) == r9) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a9, code lost:
    
        if (r3.N(r29) == r8) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v9, types: [a.iun] */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pnf.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.i;
        Object obj5 = this.n;
        switch (b) {
            case 0:
                pnf pnfVar = new pnf((rnf) obj5, (yje) obj4);
                pnfVar.l = (ats) obj;
                pnfVar.m = (mrf) obj2;
                return pnfVar.invokeSuspend(Unit.f46060a);
            default:
                ((Number) obj3).longValue();
                pnf pnfVar2 = new pnf((Function1) this.m, (xdr) obj5, (yje) obj4);
                pnfVar2.k = (kmq) obj;
                pnfVar2.l = (Throwable) obj2;
                return pnfVar2.invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pnf(rnf rnfVar, yje yjeVar) {
        super(4, yjeVar);
        this.n = rnfVar;
    }
}

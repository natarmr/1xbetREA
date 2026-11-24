package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class vnu extends bnn0 implements xdr {
    public final /* synthetic */ byte i = 1;
    public byte j;
    public /* synthetic */ boolean k;
    public kmq l;
    public Object m;
    public /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vnu(yje yjeVar, wdu wduVar, boolean z) {
        super(3, yjeVar);
        this.o = wduVar;
        this.k = z;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        Object obj4 = this.o;
        switch (b) {
            case 0:
                vnu vnuVar = new vnu((yje) obj3, (wdu) obj4, this.k);
                vnuVar.m = (kmq) obj;
                vnuVar.n = obj2;
                return vnuVar.invokeSuspend(Unit.f46060a);
            default:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                vnu vnuVar2 = new vnu((qg20) obj4, (yje) obj3);
                vnuVar2.n = (ql5) obj;
                vnuVar2.k = zBooleanValue;
                return vnuVar2.invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0118  */
    /* JADX WARN: Code duplicated, block: B:27:0x0128  */
    /* JADX WARN: Code duplicated, block: B:28:0x012d  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a6, code lost:
    
        if (r2.a(r4, r29) == r8) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x018a, code lost:
    
        if (r2.o(r29) == r8) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01a4, code lost:
    
        if (a.slb.Q(r1, r3, r29) == r8) goto L48;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.vnu.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vnu(qg20 qg20Var, yje yjeVar) {
        super(3, yjeVar);
        this.o = qg20Var;
    }
}

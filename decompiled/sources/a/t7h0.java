package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class t7h0 extends bnn0 implements ydr {
    public int i;
    public int j;
    public int k;
    public boolean l;
    public boolean m;
    public byte n;
    public /* synthetic */ kmq o;
    public /* synthetic */ Throwable p;
    public /* synthetic */ long q;
    public final /* synthetic */ Function1 r;
    public final /* synthetic */ long s;
    public final /* synthetic */ Function1 t;
    public final /* synthetic */ Function0 u;
    public final /* synthetic */ xdr v;
    public final /* synthetic */ boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7h0(Function1 function1, long j, Function1 function2, Function0 function0, xdr xdrVar, boolean z, yje yjeVar) {
        super(4, yjeVar);
        this.r = function1;
        this.s = j;
        this.t = function2;
        this.u = function0;
        this.v = xdrVar;
        this.w = z;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:49:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0141  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0087, code lost:
    
        if (a.qcc.P(r1, r17) == r5) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f0, code lost:
    
        if (a.qcc.P(r1, r17) == r5) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x013c, code lost:
    
        if (a.qcc.P(r9, r17) == r5) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0168, code lost:
    
        if (a.qcc.P(r1, r17) == r5) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v6, types: [int] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7, types: [int] */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.t7h0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        xdr xdrVar = this.v;
        boolean z = this.w;
        t7h0 t7h0Var = new t7h0(this.r, this.s, this.t, this.u, xdrVar, z, (yje) obj4);
        t7h0Var.o = (kmq) obj;
        t7h0Var.p = (Throwable) obj2;
        t7h0Var.q = jLongValue;
        return t7h0Var.invokeSuspend(Unit.f46060a);
    }
}

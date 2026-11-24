package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class bxk0 extends bnn0 implements ydr {
    public int i;
    public int j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public byte o;
    public /* synthetic */ Throwable p;
    public /* synthetic */ long q;
    public final /* synthetic */ yhi r;
    public final /* synthetic */ Function0 s;
    public final /* synthetic */ Function2 t;
    public final /* synthetic */ byte u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    public bxk0(yhi yhiVar, Function0 function0, Function2 function2, long j, yje yjeVar) {
        super(4, yjeVar);
        this.r = yhiVar;
        this.s = function0;
        this.t = function2;
        this.u = (int) j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00df, code lost:
    
        if (a.qcc.P(r13, r16) == r4) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x012c, code lost:
    
        if (a.qcc.P(r13, r16) == r4) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.bxk0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        bxk0 bxk0Var = new bxk0(this.r, this.s, this.t, this.u, (yje) obj4);
        bxk0Var.p = (Throwable) obj2;
        bxk0Var.q = jLongValue;
        return bxk0Var.invokeSuspend(Unit.f46060a);
    }
}

package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class p2v extends bnn0 implements Function2 {
    public ieu i;
    public Long j;
    public Long k;
    public edu l;
    public int m;
    public int n;
    public long o;
    public long p;
    public byte q;
    public /* synthetic */ Object r;
    public final /* synthetic */ ieu s;
    public final /* synthetic */ long t;
    public final /* synthetic */ Long u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2v(ieu ieuVar, long j, Long l, yje yjeVar) {
        super(2, yjeVar);
        this.s = ieuVar;
        this.t = j;
        this.u = l;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        p2v p2vVar = new p2v(this.s, this.t, this.u, yjeVar);
        p2vVar.r = obj;
        return p2vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p2v) create((xe60) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:25|96|26|27|108|28|100|29|30|92|31|32|98|33|(1:36)) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:7|87|106|22|(15:25|96|26|27|108|28|100|29|30|92|31|32|98|33|(1:36))|85) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(1:(1:(1:(6:7|87|106|22|(15:25|96|26|27|108|28|100|29|30|92|31|32|98|33|(1:36))|85)(2:8|9))(4:10|104|11|12))(19:16|102|17|18|96|26|27|108|28|100|29|30|92|31|32|98|33|(1:36)|85))(5:21|106|22|(15:25|96|26|27|108|28|100|29|30|92|31|32|98|33|(1:36))|85)|94|37|89|90|(1:(0))) */
    /* JADX WARN: Code duplicated, block: B:25:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:56:0x013c  */
    /* JADX WARN: Code duplicated, block: B:61:0x014a  */
    /* JADX WARN: Code duplicated, block: B:64:0x014f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0165  */
    /* JADX WARN: Code duplicated, block: B:75:0x0167  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0103, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0104, code lost:
    
        r15 = r5;
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0108, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0109, code lost:
    
        r5 = r9;
        r6 = r10;
        r1 = r11;
        r2 = r14;
        r3 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0110, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0115, code lost:
    
        r1 = r11;
        r2 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0118, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0119, code lost:
    
        r13 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0126, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0127, code lost:
    
        r17 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x012e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x012f, code lost:
    
        r13 = r9;
        r17 = r12;
        r21 = r6;
        r6 = r1;
        r1 = r2;
        r2 = r5;
        r5 = r15;
        r15 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0147, code lost:
    
        r9 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0157, code lost:
    
        if ((r0 instanceof a.zhi0) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0159, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015e, code lost:
    
        if (r9.f != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0165, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0167, code lost:
    
        r9 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016e, code lost:
    
        if (a.hic.C(r0) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0171, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0174, code lost:
    
        if (r2 > 3) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0179, code lost:
    
        java.lang.System.out.println((java.lang.Object) a.b1j.g(r2, "error (", "): ", r0));
        r23.r = r1;
        r23.i = r6;
        r23.j = r5;
        r9 = null;
        r23.k = null;
        r23.l = null;
        r23.m = r15;
        r23.o = r3;
        r23.n = r2;
        r23.q = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a0, code lost:
    
        if (a.qcc.O(3000, r23) != r8) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a3, code lost:
    
        r2 = r1;
        r1 = r6;
        r6 = r15;
        r15 = r5;
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b2, code lost:
    
        r1 = a.j0g0.b;
        r0 = new a.g0g0(r0);
     */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v4, types: [a.edu, java.lang.Long] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x01a3 -> B:87:0x01ab). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.p2v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

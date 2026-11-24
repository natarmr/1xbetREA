package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class zyb extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public byte j;
    public boolean k;
    public int l;
    public boolean m;
    public Object n;
    public Object o;
    public Object p;
    public Object q;
    public Object r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zyb(rwc rwcVar, mvc mvcVar, boolean z, int i, String str, boolean z2, String str2, String str3, yje yjeVar) {
        super(2, yjeVar);
        this.o = rwcVar;
        this.p = mvcVar;
        this.k = z;
        this.l = i;
        this.q = str;
        this.m = z2;
        this.r = str2;
        this.s = str3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.s;
        switch (b) {
            case 0:
                return new zyb((azb) obj2, yjeVar);
            case 1:
                zyb zybVar = new zyb((rwc) this.o, (mvc) this.p, this.k, this.l, (String) this.q, this.m, (String) this.r, (String) obj2, yjeVar);
                zybVar.n = obj;
                return zybVar;
            default:
                zyb zybVar2 = new zyb((pyt) this.r, (mvc) obj2, yjeVar);
                zybVar2.q = obj;
                return zybVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((zyb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((zyb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((zyb) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0351 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x0353 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x0358 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x035a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x035f  */
    /* JADX WARN: Code duplicated, block: B:118:0x036c  */
    /* JADX WARN: Code duplicated, block: B:125:0x039e  */
    /* JADX WARN: Code duplicated, block: B:126:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:22:0x0098  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:42:0x012f  */
    /* JADX WARN: Code duplicated, block: B:86:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:90:0x030c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0331  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008c, code lost:
    
        if (r11 == r10) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a6, code lost:
    
        if (r4 == r10) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c0, code lost:
    
        if (r4 == r10) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0142, code lost:
    
        if (r3.a(r1, r22) == r10) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0189, code lost:
    
        if (r0 == r3) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01d1, code lost:
    
        if (r0 == r3) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r21v1 */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zyb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zyb(azb azbVar, yje yjeVar) {
        super(2, yjeVar);
        this.s = azbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zyb(pyt pytVar, mvc mvcVar, yje yjeVar) {
        super(2, yjeVar);
        this.r = pytVar;
        this.s = mvcVar;
    }
}

package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class lh1 extends bnn0 implements Function2 {
    public Object i;
    public vne j;
    public lh1 k;
    public long l;
    public long m;
    public int n;
    public int o;
    public byte p;
    public /* synthetic */ Object q;
    public final /* synthetic */ mh1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lh1(mh1 mh1Var, yje yjeVar) {
        super(2, yjeVar);
        this.r = mh1Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        lh1 lh1Var = new lh1(this.r, yjeVar);
        lh1Var.q = obj;
        return lh1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((lh1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:23|24|25|124|38|39|117|40|(10:43|122|44|45|93|94|(1:96)|99|(1:100)|103)|109) */
    /* JADX WARN: Can't wrap try/catch for region: R(12:18|19|20|122|44|45|93|94|(1:96)|99|(1:100)|103) */
    /* JADX WARN: Code duplicated, block: B:37:0x0136  */
    /* JADX WARN: Code duplicated, block: B:43:0x0162  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a1 A[Catch: all -> 0x0059, TRY_ENTER, TryCatch #5 {all -> 0x0059, blocks: (B:14:0x0048, B:93:0x022f, B:60:0x01a1, B:62:0x01a5, B:66:0x01af, B:68:0x01b3, B:71:0x01b9, B:73:0x01bd, B:75:0x01c4, B:83:0x01d7, B:87:0x01de, B:92:0x0227, B:80:0x01d0, B:104:0x0294), top: B:121:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b3 A[Catch: all -> 0x0059, TryCatch #5 {all -> 0x0059, blocks: (B:14:0x0048, B:93:0x022f, B:60:0x01a1, B:62:0x01a5, B:66:0x01af, B:68:0x01b3, B:71:0x01b9, B:73:0x01bd, B:75:0x01c4, B:83:0x01d7, B:87:0x01de, B:92:0x0227, B:80:0x01d0, B:104:0x0294), top: B:121:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:96:0x023d  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x016b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x016c, code lost:
    
        r11 = r13;
        r13 = r1;
        r1 = r2;
        r2 = r3;
        r4 = r11;
        r11 = r19;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0173, code lost:
    
        r9 = r9;
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0176, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0177, code lost:
    
        r19 = r13;
        r13 = r1;
        r1 = r2;
        r2 = r3;
        r4 = r19;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x017f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0180, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0253, code lost:
    
        if (a.qcc.O(r9 - r11, r41) == r8) goto L109;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0077: MOVE (r39 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:120), block:B:22:0x0077 */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x007e: MOVE (r39 I:??[OBJECT, ARRAY]) = (r19 I:??[OBJECT, ARRAY]) (LINE:127), block:B:22:0x0077 */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x007b: MOVE (r2 I:??[long, double]) = (r3 I:??[long, double]) (LINE:124), block:B:22:0x0077 */
    /* JADX WARN: Type inference failed for: r11v14, types: [long] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v8, types: [int] */
    /* JADX WARN: Type inference failed for: r39v3 */
    /* JADX WARN: Type inference failed for: r39v4 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v10, types: [long] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v5, types: [long] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [long] */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.lh1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class wg0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public Object j;
    public long k;
    public long l;
    public byte m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wg0(Object obj, long j, long j2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.n = obj;
        this.k = j;
        this.l = j2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                return new wg0((eh0) obj2, yjeVar, (byte) 0);
            case 1:
                return new wg0((wz1) obj2, yjeVar, (byte) 1);
            case 2:
                return new wg0((f97) obj2, this.k, this.l, yjeVar, (byte) 2);
            case 3:
                wg0 wg0Var = new wg0(this.l, (j2j) obj2, yjeVar, (byte) 3);
                wg0Var.j = obj;
                return wg0Var;
            case 4:
                return new wg0((e6j) obj2, yjeVar, (byte) 4);
            case 5:
                wg0 wg0Var2 = new wg0((a7q) obj2, this.k, this.l, yjeVar, (byte) 5);
                wg0Var2.j = obj;
                return wg0Var2;
            case 6:
                return new wg0((jt80) obj2, yjeVar, (byte) 6);
            case 7:
                return new wg0((rv80) obj2, yjeVar, (byte) 7);
            case 8:
                return new wg0((f1b0) obj2, yjeVar, (byte) 8);
            default:
                wg0 wg0Var3 = new wg0(this.l, (org.xplatform.feature.promo_aggregator.impl.presentation.compose.b) obj2, yjeVar, (byte) 9);
                wg0Var3.j = obj;
                return wg0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((wg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((wg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((wg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((wg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((wg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((wg0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((wg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((wg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((wg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((wg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0252  */
    /* JADX WARN: Code duplicated, block: B:119:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:130:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:170:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:17:0x0053  */
    /* JADX WARN: Code duplicated, block: B:189:0x0426  */
    /* JADX WARN: Code duplicated, block: B:200:0x0484  */
    /* JADX WARN: Code duplicated, block: B:20:0x008c A[LOOP:0: B:15:0x004d->B:20:0x008c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:253:0x05a9 A[LOOP:8: B:251:0x05a0->B:253:0x05a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:262:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:282:0x063d  */
    /* JADX WARN: Code duplicated, block: B:285:0x067c A[LOOP:10: B:280:0x0637->B:285:0x067c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:304:0x0710  */
    /* JADX WARN: Code duplicated, block: B:306:0x0718  */
    /* JADX WARN: Code duplicated, block: B:310:0x0746  */
    /* JADX WARN: Code duplicated, block: B:313:0x074b  */
    /* JADX WARN: Code duplicated, block: B:316:0x0750  */
    /* JADX WARN: Code duplicated, block: B:319:0x0755  */
    /* JADX WARN: Code duplicated, block: B:354:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:360:0x0820  */
    /* JADX WARN: Code duplicated, block: B:362:0x082a  */
    /* JADX WARN: Code duplicated, block: B:367:0x085d  */
    /* JADX WARN: Code duplicated, block: B:372:0x0898  */
    /* JADX WARN: Code duplicated, block: B:380:0x08d2  */
    /* JADX WARN: Code duplicated, block: B:446:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:462:0x05bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:466:0x067a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:487:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:488:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:493:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:494:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:500:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0260, code lost:
    
        if (a.qcc.O(r7 - r11, r37) == r4) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02b1, code lost:
    
        if (a.qcc.O(r8 - r10, r37) == r4) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        if (a.qcc.O(r2, r37) == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x03e1, code lost:
    
        if (a.qcc.O(r7 - r11, r37) == r4) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x03e5, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0434, code lost:
    
        if (a.qcc.O(r8 - r10, r37) == r4) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x04e8, code lost:
    
        if (r6.a(r14, r37) == r7) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x062a, code lost:
    
        if (a.qcc.O(r3, r37) == r2) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x06ba, code lost:
    
        if (r2 == r0) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0757, code lost:
    
        if (r1 == r0) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0948, code lost:
    
        if (a.qcc.O(r7 - r9, r37) == r1) goto L418;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v106 */
    /* JADX WARN: Type inference failed for: r1v107 */
    /* JADX WARN: Type inference failed for: r1v108 */
    /* JADX WARN: Type inference failed for: r1v109 */
    /* JADX WARN: Type inference failed for: r1v110 */
    /* JADX WARN: Type inference failed for: r1v111 */
    /* JADX WARN: Type inference failed for: r1v112 */
    /* JADX WARN: Type inference failed for: r1v52, types: [long] */
    /* JADX WARN: Type inference failed for: r1v55, types: [long] */
    /* JADX WARN: Type inference failed for: r1v68, types: [long] */
    /* JADX WARN: Type inference failed for: r1v72, types: [long] */
    /* JADX WARN: Type inference failed for: r1v85, types: [byte] */
    /* JADX WARN: Type inference failed for: r1v86, types: [long] */
    /* JADX WARN: Type inference failed for: r1v93, types: [long] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [long] */
    /* JADX WARN: Type inference failed for: r2v5, types: [long] */
    /* JADX WARN: Type inference failed for: r2v84 */
    /* JADX WARN: Type inference failed for: r2v85 */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wg0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wg0(i3t0 i3t0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.n = i3t0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wg0(long j, Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = j;
        this.n = obj;
    }
}

package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class tw extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public int j;
    public byte k;
    public final /* synthetic */ diu0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw(fir0 fir0Var, int i, yje yjeVar) {
        super(1, yjeVar);
        this.i = (byte) 3;
        this.l = fir0Var;
        this.j = i;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        diu0 diu0Var = this.l;
        switch (b) {
            case 0:
                return new tw(diu0Var, yjeVar, (byte) 0);
            case 1:
                return new tw(diu0Var, yjeVar, (byte) 1);
            case 2:
                return new tw(diu0Var, yjeVar, (byte) 2);
            default:
                return new tw((fir0) diu0Var, this.j, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((tw) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0247 A[LOOP:2: B:114:0x0241->B:116:0x0247, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x010a  */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0266, code lost:
    
        if (r4.w(r6, r3, r23) == r1) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r2.a(r3, r23) == r9) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0112, code lost:
    
        if (r5.L(r23) == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0185, code lost:
    
        if (r0 == r2) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0199, code lost:
    
        if (r0 == r2) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.tw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tw(diu0 diu0Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.l = diu0Var;
    }
}

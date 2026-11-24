package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class vbp0 extends bnn0 implements Function1 {
    public o9p0 i;
    public byte j;
    public final /* synthetic */ wbp0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vbp0(wbp0 wbp0Var, yje yjeVar) {
        super(1, yjeVar);
        this.k = wbp0Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new vbp0(this.k, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((vbp0) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0093 A[LOOP:0: B:20:0x008d->B:22:0x0093, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:37:0x0109  */
    /* JADX WARN: Code duplicated, block: B:38:0x010e  */
    /* JADX WARN: Code duplicated, block: B:42:0x011e  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ed A[LOOP:3: B:52:0x015f->B:59:0x01ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x017d A[EDGE_INSN: B:70:0x017d->B:54:0x017d BREAK  A[LOOP:3: B:52:0x015f->B:59:0x01ed], SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01e7, code lost:
    
        if (a.slb.O(r2, r3, r27) == r1) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.CharSequence, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.vbp0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ef70 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ qf70 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ef70(qf70 qf70Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = qf70Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        qf70 qf70Var = this.k;
        switch (b) {
            case 0:
                return new ef70(qf70Var, yjeVar, (byte) 0);
            case 1:
                return new ef70(qf70Var, yjeVar, (byte) 1);
            case 2:
                return new ef70(qf70Var, yjeVar, (byte) 2);
            case 3:
                return new ef70(qf70Var, yjeVar, (byte) 3);
            default:
                return new ef70(qf70Var, yjeVar, (byte) 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((ef70) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0186  */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x022f, code lost:
    
        if (r12 == r0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0241, code lost:
    
        if (r2.J(r12, true, r1, r11) == r0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r12 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r12 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (r12 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010d, code lost:
    
        if (r2.J(r12, true, r0, r11) == r6) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0164, code lost:
    
        if (r12 == r7) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x019b, code lost:
    
        if (r0.f(r1, r11) == r7) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01eb, code lost:
    
        if (r1.c(r5, r11) == r0) goto L96;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r5v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ef70.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

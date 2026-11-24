package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class ro3 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ to3 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ro3(to3 to3Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = to3Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        to3 to3Var = this.k;
        switch (b) {
            case 0:
                return new ro3(to3Var, yjeVar, (byte) 0);
            case 1:
                return new ro3(to3Var, yjeVar, (byte) 1);
            default:
                return new ro3(to3Var, yjeVar, (byte) 2);
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
        }
        return ((ro3) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ed A[LOOP:0: B:52:0x00e7->B:54:0x00ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x0101  */
    /* JADX WARN: Code duplicated, block: B:60:0x010a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0125  */
    /* JADX WARN: Code duplicated, block: B:86:0x0191  */
    /* JADX WARN: Code duplicated, block: B:89:0x0196  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (r0.a(r15, r14) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        if (r0.a(a.c56.f3755a, r14) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012d, code lost:
    
        if (a.qcc.O(30000, r14) == r0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0198, code lost:
    
        if (r14 == r0) goto L91;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ro3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class g3b0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public long j;
    public long k;
    public Object l;
    public byte m;
    public final /* synthetic */ v3b0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g3b0(v3b0 v3b0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.n = v3b0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        v3b0 v3b0Var = this.n;
        switch (b) {
            case 0:
                return new g3b0(v3b0Var, yjeVar, (byte) 0);
            default:
                return new g3b0(v3b0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((g3b0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x009a  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x014c  */
    /* JADX WARN: Code duplicated, block: B:85:0x016e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0180  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ab  */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ba, code lost:
    
        if (a.qcc.O(r3 - r7, r14) == r0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015a, code lost:
    
        if (a.qcc.O(r3 - r8, r14) == r0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x015e, code lost:
    
        r14 = r15;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g3b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

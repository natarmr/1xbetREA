package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class zqn0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ arn0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zqn0(arn0 arn0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = arn0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        arn0 arn0Var = this.k;
        switch (b) {
            case 0:
                return new zqn0(arn0Var, yjeVar, (byte) 0);
            case 1:
                return new zqn0(arn0Var, yjeVar, (byte) 1);
            default:
                return new zqn0(arn0Var, yjeVar, (byte) 2);
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
        return ((zqn0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0085  */
    /* JADX WARN: Code duplicated, block: B:24:0x0088  */
    /* JADX WARN: Code duplicated, block: B:90:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:? A[LOOP:0: B:19:0x0075->B:92:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019a, code lost:
    
        if (a.qcc.O(500, r16) == r2) goto L86;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zqn0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

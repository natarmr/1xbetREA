package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class mye0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ eze0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mye0(eze0 eze0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = eze0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        eze0 eze0Var = this.k;
        switch (b) {
            case 0:
                return new mye0(eze0Var, yjeVar, (byte) 0);
            case 1:
                return new mye0(eze0Var, yjeVar, (byte) 1);
            default:
                return new mye0(eze0Var, yjeVar, (byte) 2);
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
        return ((mye0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00dc, code lost:
    
        if (a.qjj.d0(r2, r3, r35) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01af, code lost:
    
        if (a.qjj.d0(r2, r3, r35) == r1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0281, code lost:
    
        if (a.qjj.d0(r2, r3, r35) == r1) goto L91;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) {
        /*
            Method dump skipped, instruction units count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.mye0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

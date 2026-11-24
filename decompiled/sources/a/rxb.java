package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class rxb extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ yxb k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rxb(yxb yxbVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = yxbVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        yxb yxbVar = this.k;
        switch (b) {
            case 0:
                return new rxb(yxbVar, yjeVar, (byte) 0);
            case 1:
                return new rxb(yxbVar, yjeVar, (byte) 1);
            default:
                return new rxb(yxbVar, yjeVar, (byte) 2);
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
        return ((rxb) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b4  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (a.qcc.O(40, r12) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bf, code lost:
    
        if (a.qcc.O(150, r12) == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00fc, code lost:
    
        if (a.qcc.O(40, r12) == r0) goto L65;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.rxb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

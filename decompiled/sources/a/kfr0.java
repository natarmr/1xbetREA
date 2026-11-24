package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class kfr0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ ofr0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kfr0(ofr0 ofr0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ofr0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ofr0 ofr0Var = this.k;
        switch (b) {
            case 0:
                return new kfr0(ofr0Var, yjeVar, (byte) 0);
            case 1:
                return new kfr0(ofr0Var, yjeVar, (byte) 1);
            default:
                return new kfr0(ofr0Var, yjeVar, (byte) 2);
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
        return ((kfr0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0249  */
    /* JADX WARN: Code duplicated, block: B:118:0x024f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0128  */
    /* JADX WARN: Code duplicated, block: B:60:0x012e  */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x028a, code lost:
    
        if (r14 == r0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r14 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0168, code lost:
    
        if (r14 == r0) goto L75;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kfr0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class v36 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ p36 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v36(p36 p36Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = p36Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        p36 p36Var = this.k;
        switch (b) {
            case 0:
                return new v36(p36Var, yjeVar, (byte) 0);
            default:
                return new v36(p36Var, yjeVar, (byte) 1);
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
        return ((v36) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ef  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        if (r0.a(r15, r14) == r7) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        if (r0.a(a.c56.f3755a, r14) == r7) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f1, code lost:
    
        if (r14 == r0) goto L56;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.v36.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

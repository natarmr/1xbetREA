package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class vn10 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public bo10 j;
    public byte k;
    public final /* synthetic */ bo10 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vn10(bo10 bo10Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = bo10Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        bo10 bo10Var = this.l;
        switch (b) {
            case 0:
                return new vn10(bo10Var, yjeVar, (byte) 0);
            default:
                return new vn10(bo10Var, yjeVar, (byte) 1);
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
        return ((vn10) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r2.C(r8) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dd, code lost:
    
        if (r2.C(r8) == r0) goto L53;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.vn10.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

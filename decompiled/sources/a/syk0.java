package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class syk0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ tyk0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ syk0(tyk0 tyk0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = tyk0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        tyk0 tyk0Var = this.k;
        switch (b) {
            case 0:
                return new syk0(tyk0Var, yjeVar, (byte) 0);
            default:
                return new syk0(tyk0Var, yjeVar, (byte) 1);
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
        return ((syk0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r1.b(r22) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0178, code lost:
    
        if (r0.f(a.my5.f22588a, r22) == r9) goto L51;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.syk0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

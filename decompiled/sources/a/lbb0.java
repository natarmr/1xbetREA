package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class lbb0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ sbb0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lbb0(sbb0 sbb0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = sbb0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        sbb0 sbb0Var = this.k;
        switch (b) {
            case 0:
                return new lbb0(sbb0Var, yjeVar, (byte) 0);
            default:
                return new lbb0(sbb0Var, yjeVar, (byte) 1);
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
        return ((lbb0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r2.A(r25) == r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (r2.B(r25) == r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        if (r0 == r8) goto L36;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.lbb0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class yfl extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ cgl k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yfl(cgl cglVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = cglVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        cgl cglVar = this.k;
        switch (b) {
            case 0:
                return new yfl(cglVar, yjeVar, (byte) 0);
            default:
                return new yfl(cglVar, yjeVar, (byte) 1);
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
        return ((yfl) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0088, code lost:
    
        if (r2.F(r15, r13) == r6) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e6, code lost:
    
        if (r2.F(r15, r14) == r14) goto L35;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.yfl.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

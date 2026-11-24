package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class pi80 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public ri80 j;
    public k050 k;
    public qi80 l;
    public byte m;
    public final /* synthetic */ qi80 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pi80(qi80 qi80Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.n = qi80Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        qi80 qi80Var = this.n;
        switch (b) {
            case 0:
                return new pi80(qi80Var, yjeVar, (byte) 0);
            default:
                return new pi80(qi80Var, yjeVar, (byte) 1);
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
        return ((pi80) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        if (r1.a(r9, r2, r8) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c4, code lost:
    
        if (r1.a(r9, r2, r8) == r0) goto L37;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pi80.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

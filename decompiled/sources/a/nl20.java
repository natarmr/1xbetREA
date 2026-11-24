package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class nl20 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ on20 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nl20(on20 on20Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = on20Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        on20 on20Var = this.k;
        switch (b) {
            case 0:
                return new nl20(on20Var, yjeVar, (byte) 0);
            default:
                return new nl20(on20Var, yjeVar, (byte) 1);
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
        return ((nl20) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0120  */
    /* JADX WARN: Code duplicated, block: B:72:0x0124  */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r3.n0(r17) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r3.l0(r17) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0134, code lost:
    
        if (r3.x0(r7, r2, r17) == r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
    
        return r1;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nl20.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

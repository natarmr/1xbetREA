package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class xl7 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ fm7 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xl7(fm7 fm7Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = fm7Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        fm7 fm7Var = this.k;
        switch (b) {
            case 0:
                return new xl7(fm7Var, yjeVar, (byte) 0);
            default:
                return new xl7(fm7Var, yjeVar, (byte) 1);
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
        return ((xl7) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (a.qcc.P(r2, r32) == r1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c4, code lost:
    
        if (a.qcc.P(r2, r32) == r1) goto L34;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xl7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

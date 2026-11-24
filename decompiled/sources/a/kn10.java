package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class kn10 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public pn10 j;
    public byte k;
    public final /* synthetic */ pn10 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kn10(pn10 pn10Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = pn10Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        pn10 pn10Var = this.l;
        switch (b) {
            case 0:
                return new kn10(pn10Var, yjeVar, (byte) 0);
            default:
                return new kn10(pn10Var, yjeVar, (byte) 1);
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
        return ((kn10) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009a, code lost:
    
        if (r3.S(r35) == r8) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0191, code lost:
    
        if (r3.S(r35) == r8) goto L59;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kn10.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

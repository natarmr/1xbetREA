package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class brs0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public /* synthetic */ Object k;
    public final /* synthetic */ krs0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ brs0(krs0 krs0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = krs0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        krs0 krs0Var = this.l;
        switch (b) {
            case 0:
                brs0 brs0Var = new brs0(krs0Var, yjeVar, (byte) 0);
                brs0Var.k = obj;
                return brs0Var;
            default:
                brs0 brs0Var2 = new brs0(krs0Var, yjeVar, (byte) 1);
                brs0Var2.k = obj;
                return brs0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ghs0 ghs0Var = (ghs0) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((brs0) create(ghs0Var, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ae, code lost:
    
        if (r2.a(r3, r7, r19) == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0107, code lost:
    
        if (r0 == r1) goto L69;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.brs0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

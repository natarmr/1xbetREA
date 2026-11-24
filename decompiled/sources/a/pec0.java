package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class pec0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public kmq j;
    public byte k;
    public /* synthetic */ Object l;
    public final /* synthetic */ sec0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pec0(sec0 sec0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = sec0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        sec0 sec0Var = this.m;
        switch (b) {
            case 0:
                pec0 pec0Var = new pec0(sec0Var, yjeVar, (byte) 0);
                pec0Var.l = obj;
                return pec0Var;
            default:
                pec0 pec0Var2 = new pec0(sec0Var, yjeVar, (byte) 1);
                pec0Var2.l = obj;
                return pec0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((pec0) create(kmqVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x02a3, code lost:
    
        if (r1.a(r2, r32) == r7) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (r1.a(r2, r32) == r7) goto L16;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pec0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

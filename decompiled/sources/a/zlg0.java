package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class zlg0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ bmg0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zlg0(bmg0 bmg0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = bmg0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        bmg0 bmg0Var = this.k;
        switch (b) {
            case 0:
                zlg0 zlg0Var = new zlg0(bmg0Var, yjeVar, (byte) 0);
                zlg0Var.j = obj;
                return zlg0Var;
            default:
                zlg0 zlg0Var2 = new zlg0(bmg0Var, yjeVar, (byte) 1);
                zlg0Var2.j = obj;
                return zlg0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((zlg0) create((fog0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((zlg0) create((kog0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0051  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ad, code lost:
    
        if ((r0 instanceof a.gog0) != false) goto L24;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zlg0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

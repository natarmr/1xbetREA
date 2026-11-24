package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class k6v0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ l6v0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k6v0(l6v0 l6v0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = l6v0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        l6v0 l6v0Var = this.k;
        switch (b) {
            case 0:
                k6v0 k6v0Var = new k6v0(l6v0Var, yjeVar, (byte) 0);
                k6v0Var.j = obj;
                return k6v0Var;
            case 1:
                k6v0 k6v0Var2 = new k6v0(l6v0Var, yjeVar, (byte) 1);
                k6v0Var2.j = obj;
                return k6v0Var2;
            default:
                k6v0 k6v0Var3 = new k6v0(l6v0Var, yjeVar, (byte) 2);
                k6v0Var3.j = obj;
                return k6v0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((k6v0) create((a7v0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((k6v0) create((b7v0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((k6v0) create((u6v0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0060, code lost:
    
        if ((r13 instanceof a.r6v0) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0175, code lost:
    
        if ((r13 instanceof a.v6v0) != false) goto L58;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.k6v0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

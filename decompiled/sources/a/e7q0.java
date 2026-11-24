package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class e7q0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ k7q0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e7q0(k7q0 k7q0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = k7q0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        k7q0 k7q0Var = this.k;
        switch (b) {
            case 0:
                e7q0 e7q0Var = new e7q0(k7q0Var, yjeVar, (byte) 0);
                long j = ((ne60) obj).f23370a;
                return e7q0Var;
            default:
                return new e7q0(k7q0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                long j = ((ne60) obj).f23370a;
                return new e7q0(this.k, (yje) obj2, (byte) 0).invokeSuspend(Unit.f46060a);
            default:
                return ((e7q0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x01ae  */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0361, code lost:
    
        if (r2 == r1) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x044a, code lost:
    
        if (r0 == r4) goto L213;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r56) {
        /*
            Method dump skipped, instruction units count: 1112
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e7q0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

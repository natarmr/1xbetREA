package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class z81 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ n91 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z81(n91 n91Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = n91Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        n91 n91Var = this.k;
        switch (b) {
            case 0:
                return new z81(n91Var, yjeVar, (byte) 0);
            default:
                return new z81(n91Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((z81) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d7, code lost:
    
        if (r1 == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01de, code lost:
    
        if (r0.N0(0, r2, r27, "") == r9) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0222, code lost:
    
        if (r0.I(r1, 0, "", r27) == r9) goto L66;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.z81.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

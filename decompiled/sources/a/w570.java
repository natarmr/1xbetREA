package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class w570 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ g670 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w570(g670 g670Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = g670Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        g670 g670Var = this.k;
        switch (b) {
            case 0:
                return new w570(g670Var, yjeVar, (byte) 0);
            default:
                return new w570(g670Var, yjeVar, (byte) 1);
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
        return ((w570) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0179  */
    /* JADX WARN: Code duplicated, block: B:63:0x017c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0185 A[PHI: r2
  0x0185: PHI (r2v15 java.lang.Object) = (r2v14 java.lang.Object), (r2v20 java.lang.Object) binds: [B:64:0x0182, B:34:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x018d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0190  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r0 == r8) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x019c, code lost:
    
        if (kotlin.Unit.f46060a == r8) goto L71;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.w570.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

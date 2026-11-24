package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class ek90 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ kk90 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ek90(kk90 kk90Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = kk90Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        kk90 kk90Var = this.k;
        switch (b) {
            case 0:
                return new ek90(kk90Var, yjeVar, (byte) 0);
            default:
                return new ek90(kk90Var, yjeVar, (byte) 1);
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
        return ((ek90) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0077  */
    /* JADX WARN: Code duplicated, block: B:21:0x0089  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a5 A[LOOP:0: B:23:0x009c->B:25:0x00a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x00af  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b8 A[PHI: r14
  0x00b8: PHI (r14v22 java.lang.Object) = (r14v18 java.lang.Object), (r14v0 java.lang.Object) binds: [B:27:0x00b5, B:11:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e2 A[PHI: r14
  0x00e2: PHI (r14v32 java.lang.Object) = (r14v28 java.lang.Object), (r14v0 java.lang.Object) binds: [B:38:0x00df, B:9:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:48:0x0101 A[PHI: r14
  0x0101: PHI (r14v38 java.lang.Object) = (r14v36 java.lang.Object), (r14v0 java.lang.Object) binds: [B:46:0x00fe, B:7:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0109  */
    /* JADX WARN: Code duplicated, block: B:82:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
    
        if (r14 == r7) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f4, code lost:
    
        if (r3.x(true, r13) == r7) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0110, code lost:
    
        if (r3.z(r13) == r7) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0198, code lost:
    
        if (r14 == r0) goto L73;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ek90.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

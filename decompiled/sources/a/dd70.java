package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class dd70 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public byte n;
    public Object o;
    public final /* synthetic */ diu0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dd70(diu0 diu0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.p = diu0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        diu0 diu0Var = this.p;
        switch (b) {
            case 0:
                return new dd70((xd70) diu0Var, yjeVar, (byte) 0);
            default:
                return new dd70((doc0) diu0Var, yjeVar, (byte) 1);
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
        return ((dd70) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00f2 A[PHI: r2 r4
  0x00f2: PHI (r2v17 boolean) = (r2v14 boolean), (r2v36 boolean) binds: [B:46:0x0162, B:36:0x00eb] A[DONT_GENERATE, DONT_INLINE]
  0x00f2: PHI (r4v13 java.lang.Object) = (r4v5 java.lang.Object), (r4v34 java.lang.Object) binds: [B:46:0x0162, B:36:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0178  */
    /* JADX WARN: Code duplicated, block: B:51:0x017b  */
    /* JADX WARN: Code duplicated, block: B:54:0x018b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0195  */
    /* JADX WARN: Code duplicated, block: B:57:0x0197  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:70:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:72:0x0208  */
    /* JADX WARN: Code duplicated, block: B:73:0x020d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0238  */
    /* JADX WARN: Code duplicated, block: B:80:0x0242  */
    /* JADX WARN: Code duplicated, block: B:85:0x0284 A[PHI: r1 r2 r4 r5
  0x0284: PHI (r1v5 boolean) = (r1v4 boolean), (r1v7 boolean) binds: [B:83:0x0281, B:34:0x00cc] A[DONT_GENERATE, DONT_INLINE]
  0x0284: PHI (r2v34 boolean) = (r2v32 boolean), (r2v38 boolean) binds: [B:83:0x0281, B:34:0x00cc] A[DONT_GENERATE, DONT_INLINE]
  0x0284: PHI (r4v33 boolean) = (r4v31 boolean), (r4v36 boolean) binds: [B:83:0x0281, B:34:0x00cc] A[DONT_GENERATE, DONT_INLINE]
  0x0284: PHI (r5v8 boolean) = (r5v6 boolean), (r5v10 boolean) binds: [B:83:0x0281, B:34:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0095, code lost:
    
        if (r0 == r8) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0117, code lost:
    
        if (r2 == r9) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0296, code lost:
    
        if (r3.P(r29) == r9) goto L87;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dd70.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

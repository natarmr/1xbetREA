package a;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class wk20 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public byte k;
    public Object l;
    public Object m;
    public Object n;
    public Serializable o;
    public Object p;
    public final /* synthetic */ diu0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk20(boolean z, pun0 pun0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        this.j = z;
        this.q = pun0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        diu0 diu0Var = this.q;
        switch (b) {
            case 0:
                return new wk20(diu0Var, yjeVar, (byte) 0);
            case 1:
                return new wk20(diu0Var, yjeVar, (byte) 1);
            default:
                return new wk20(this.j, (pun0) diu0Var, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((wk20) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0324 A[PHI: r0 r14
  0x0324: PHI (r0v34 java.lang.Object) = (r0v28 java.lang.Object), (r0v48 java.lang.Object) binds: [B:98:0x0320, B:80:0x0252] A[DONT_GENERATE, DONT_INLINE]
  0x0324: PHI (r14v1 boolean) = (r14v0 boolean), (r14v2 boolean) binds: [B:98:0x0320, B:80:0x0252] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x0344  */
    /* JADX WARN: Code duplicated, block: B:105:0x036d  */
    /* JADX WARN: Code duplicated, block: B:108:0x037c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0380  */
    /* JADX WARN: Code duplicated, block: B:111:0x0383  */
    /* JADX WARN: Code duplicated, block: B:116:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:119:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:120:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:123:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:124:0x03c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:128:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:133:0x0459  */
    /* JADX WARN: Code duplicated, block: B:137:0x0465  */
    /* JADX WARN: Code duplicated, block: B:141:0x0492  */
    /* JADX WARN: Code duplicated, block: B:167:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:168:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:172:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:176:0x0623 A[PHI: r2 r3 r6 r7 r8 r9 r10
  0x0623: PHI (r2v2 java.lang.Object) = (r2v1 java.lang.Object), (r2v6 java.lang.Object) binds: [B:174:0x0620, B:154:0x0552] A[DONT_GENERATE, DONT_INLINE]
  0x0623: PHI (r3v7 java.lang.String) = (r3v6 java.lang.String), (r3v16 java.lang.String) binds: [B:174:0x0620, B:154:0x0552] A[DONT_GENERATE, DONT_INLINE]
  0x0623: PHI (r6v8 java.lang.String) = (r6v7 java.lang.String), (r6v18 java.lang.String) binds: [B:174:0x0620, B:154:0x0552] A[DONT_GENERATE, DONT_INLINE]
  0x0623: PHI (r7v7 java.lang.String) = (r7v6 java.lang.String), (r7v14 java.lang.String) binds: [B:174:0x0620, B:154:0x0552] A[DONT_GENERATE, DONT_INLINE]
  0x0623: PHI (r8v6 a.qz40) = (r8v5 a.qz40), (r8v14 a.qz40) binds: [B:174:0x0620, B:154:0x0552] A[DONT_GENERATE, DONT_INLINE]
  0x0623: PHI (r9v5 boolean) = (r9v4 boolean), (r9v10 boolean) binds: [B:174:0x0620, B:154:0x0552] A[DONT_GENERATE, DONT_INLINE]
  0x0623: PHI (r10v8 a.z7u) = (r10v6 a.z7u), (r10v11 a.z7u) binds: [B:174:0x0620, B:154:0x0552] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:179:0x063e  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:37:0x0101  */
    /* JADX WARN: Code duplicated, block: B:42:0x0121  */
    /* JADX WARN: Code duplicated, block: B:47:0x0140  */
    /* JADX WARN: Code duplicated, block: B:50:0x0146  */
    /* JADX WARN: Code duplicated, block: B:51:0x0149  */
    /* JADX WARN: Code duplicated, block: B:54:0x015f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0162  */
    /* JADX WARN: Code duplicated, block: B:58:0x0174  */
    /* JADX WARN: Code duplicated, block: B:59:0x0177  */
    /* JADX WARN: Code duplicated, block: B:61:0x017b  */
    /* JADX WARN: Code duplicated, block: B:62:0x017e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0192  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:88:0x0277  */
    /* JADX WARN: Code duplicated, block: B:91:0x0293 A[PHI: r0
  0x0293: PHI (r0v15 java.lang.Object) = (r0v14 java.lang.Object), (r0v33 java.lang.Object) binds: [B:89:0x028f, B:81:0x025c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:97:0x0316  */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03d8, code lost:
    
        if (r10.u0(r0, r13, r49) == r12) goto L140;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r50) {
        /*
            Method dump skipped, instruction units count: 1662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wk20.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wk20(diu0 diu0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.q = diu0Var;
    }
}

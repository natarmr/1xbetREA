package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class ymq extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public byte j;
    public Object k;
    public Object l;
    public Object m;
    public /* synthetic */ Object n;
    public /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ymq(Object obj, Object obj2, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.p = obj;
        this.q = obj2;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        Object obj4 = this.q;
        Object obj5 = this.p;
        switch (b) {
            case 0:
                ymq ymqVar = new ymq((Function1) obj5, (gmq) obj4, (yje) obj3, (byte) 0);
                ymqVar.n = (vne) obj;
                ymqVar.o = (kmq) obj2;
                return ymqVar.invokeSuspend(Unit.f46060a);
            default:
                ymq ymqVar2 = new ymq((kzj) obj5, (kzj) obj4, (yje) obj3, (byte) 1);
                ymqVar2.n = (uvp) obj;
                ymqVar2.o = (uvp) obj2;
                return ymqVar2.invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00cf A[PHI: r1 r2
  0x00cf: PHI (r1v7 a.mie0) = (r1v4 a.mie0), (r1v5 a.mie0), (r1v22 a.mie0) binds: [B:26:0x00a9, B:51:0x0154, B:23:0x0087] A[DONT_GENERATE, DONT_INLINE]
  0x00cf: PHI (r2v7 ??) = (r2v14 ??), (r2v15 ??), (r2v16 ??) binds: [B:26:0x00a9, B:51:0x0154, B:23:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00de  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:45:0x0116 A[PHI: r2 r4 r10
  0x0116: PHI (r2v4 a.mie0) = (r2v6 a.mie0), (r2v8 a.mie0), (r2v8 a.mie0) binds: [B:44:0x0113, B:30:0x00dc, B:36:0x00f8] A[DONT_GENERATE, DONT_INLINE]
  0x0116: PHI (r4v2 ??) = (r4v11 ??), (r4v12 ??), (r4v13 ??) binds: [B:44:0x0113, B:30:0x00dc, B:36:0x00f8] A[DONT_GENERATE, DONT_INLINE]
  0x0116: PHI (r10v3 a.lie0) = (r10v6 a.lie0), (r10v8 a.lie0), (r10v8 a.lie0) binds: [B:44:0x0113, B:30:0x00dc, B:36:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x0119  */
    /* JADX WARN: Code duplicated, block: B:49:0x012c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v5, types: [a.htb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0154 -> B:27:0x00cf). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ymq.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

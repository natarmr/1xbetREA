package a;

import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class fl00 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public kmq j;
    public byte k;
    public /* synthetic */ Object l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ List n;
    public final /* synthetic */ Set o;
    public final /* synthetic */ int p;
    public final /* synthetic */ ygq0 q;
    public final /* synthetic */ List r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ long t;
    public final /* synthetic */ Pair u;
    public final /* synthetic */ Integer v;
    public Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fl00(boolean z, Object obj, List list, Set set, int i, ygq0 ygq0Var, List list2, boolean z2, long j, Pair pair, Integer num, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = z;
        this.x = obj;
        this.n = list;
        this.o = set;
        this.p = i;
        this.q = ygq0Var;
        this.r = list2;
        this.s = z2;
        this.t = j;
        this.u = pair;
        this.v = num;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.x;
        switch (b) {
            case 0:
                fl00 fl00Var = new fl00(this.m, (nvu) obj2, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, yjeVar, (byte) 0);
                fl00Var.l = obj;
                return fl00Var;
            default:
                fl00 fl00Var2 = new fl00(this.m, (y3v) obj2, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, yjeVar, (byte) 1);
                fl00Var2.l = obj;
                return fl00Var2;
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
        return ((fl00) create(kmqVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00b6 A[PHI: r0 r2 r13 r14
  0x00b6: PHI (r0v40 java.lang.Object) = (r0v36 java.lang.Object), (r0v43 java.lang.Object) binds: [B:19:0x00b3, B:10:0x0045] A[DONT_GENERATE, DONT_INLINE]
  0x00b6: PHI (r2v17 a.kmq) = (r2v15 a.kmq), (r2v18 a.kmq) binds: [B:19:0x00b3, B:10:0x0045] A[DONT_GENERATE, DONT_INLINE]
  0x00b6: PHI (r13v12 a.kmq) = (r6v0 a.kmq), (r13v13 a.kmq) binds: [B:19:0x00b3, B:10:0x0045] A[DONT_GENERATE, DONT_INLINE]
  0x00b6: PHI (r14v17 a.wne) = (r14v14 a.wne), (r14v18 a.wne) binds: [B:19:0x00b3, B:10:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x011a A[PHI: r0 r2 r11 r13 r15
  0x011a: PHI (r0v50 java.lang.Object) = (r0v46 java.lang.Object), (r0v53 java.lang.Object) binds: [B:29:0x0117, B:7:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x011a: PHI (r2v21 a.kmq) = (r2v19 a.kmq), (r2v22 a.kmq) binds: [B:29:0x0117, B:7:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x011a: PHI (r11v8 a.fl00) = (r11v7 a.fl00), (r11v0 a.fl00) binds: [B:29:0x0117, B:7:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x011a: PHI (r13v17 a.wne) = (r13v14 a.wne), (r13v18 a.wne) binds: [B:29:0x0117, B:7:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x011a: PHI (r15v6 a.kmq) = (r15v4 a.kmq), (r15v7 a.kmq) binds: [B:29:0x0117, B:7:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x01d0 A[PHI: r0 r2 r14
  0x01d0: PHI (r0v13 java.lang.Object) = (r0v9 java.lang.Object), (r0v16 java.lang.Object) binds: [B:51:0x01cc, B:42:0x015f] A[DONT_GENERATE, DONT_INLINE]
  0x01d0: PHI (r2v7 a.kmq) = (r2v5 a.kmq), (r2v8 a.kmq) binds: [B:51:0x01cc, B:42:0x015f] A[DONT_GENERATE, DONT_INLINE]
  0x01d0: PHI (r14v6 a.wne) = (r14v4 a.wne), (r14v7 a.wne) binds: [B:51:0x01cc, B:42:0x015f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0223 A[PHI: r0 r11 r13 r14
  0x0223: PHI (r0v23 java.lang.Object) = (r0v19 java.lang.Object), (r0v26 java.lang.Object) binds: [B:61:0x0220, B:39:0x013f] A[DONT_GENERATE, DONT_INLINE]
  0x0223: PHI (r11v4 a.fl00) = (r11v3 a.fl00), (r11v0 a.fl00) binds: [B:61:0x0220, B:39:0x013f] A[DONT_GENERATE, DONT_INLINE]
  0x0223: PHI (r13v4 a.kmq) = (r13v2 a.kmq), (r13v5 a.kmq) binds: [B:61:0x0220, B:39:0x013f] A[DONT_GENERATE, DONT_INLINE]
  0x0223: PHI (r14v11 a.wne) = (r14v8 a.wne), (r14v12 a.wne) binds: [B:61:0x0220, B:39:0x013f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c0, code lost:
    
        if (r2.a(r0, r11) == r14) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0125, code lost:
    
        if (r2.a(r0, r11) == r13) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01da, code lost:
    
        if (r2.a(r0, r11) == r14) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x022e, code lost:
    
        if (r13.a(r0, r11) == r14) goto L65;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fl00.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

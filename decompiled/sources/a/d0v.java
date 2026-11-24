package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class d0v extends bnn0 implements Function2 {
    public int i;
    public byte j;
    public /* synthetic */ Object k;
    public final /* synthetic */ pwi l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0v(pwi pwiVar, boolean z, boolean z2, boolean z3, yje yjeVar) {
        super(2, yjeVar);
        this.l = pwiVar;
        this.m = z;
        this.n = z2;
        this.o = z3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        d0v d0vVar = new d0v(this.l, this.m, this.n, this.o, yjeVar);
        d0vVar.k = obj;
        return d0vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d0v) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x0083 A[Catch: all -> 0x0030, PHI: r0 r9
  0x0083: PHI (r0v21 java.lang.Object) = (r0v20 java.lang.Object), (r0v30 java.lang.Object) binds: [B:30:0x007f, B:13:0x002d] A[DONT_GENERATE, DONT_INLINE]
  0x0083: PHI (r9v8 int) = (r9v7 int), (r9v9 int) binds: [B:30:0x007f, B:13:0x002d] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002a, B:32:0x0083, B:34:0x008d, B:36:0x0093, B:29:0x006f), top: B:51:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x008d A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002a, B:32:0x0083, B:34:0x008d, B:36:0x0093, B:29:0x006f), top: B:51:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0092  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r2.a(r0, r25) == r3) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0149, code lost:
    
        if (a.slb.Q(r2, r4, r25) == r3) goto L48;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.d0v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

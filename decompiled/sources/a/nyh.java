package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class nyh extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public ehs0 j;
    public byte k;
    public /* synthetic */ Object l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ aeg0 o;
    public final /* synthetic */ Function1 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nyh(boolean z, boolean z2, aeg0 aeg0Var, yje yjeVar, Function1 function1, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = z;
        this.n = z2;
        this.o = aeg0Var;
        this.p = function1;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                nyh nyhVar = new nyh(this.m, this.n, this.o, yjeVar, this.p, (byte) 0);
                nyhVar.l = obj;
                return nyhVar;
            default:
                nyh nyhVar2 = new nyh(this.m, this.n, this.o, yjeVar, this.p, (byte) 1);
                nyhVar2.l = obj;
                return nyhVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ghs0 ghs0Var = (ghs0) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((nyh) create(ghs0Var, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009f A[DONT_INVERT, PHI: r1 r14
  0x009f: PHI (r1v22 a.ghs0) = (r1v19 a.ghs0), (r1v26 a.ghs0) binds: [B:33:0x009c, B:12:0x002f] A[DONT_GENERATE, DONT_INLINE]
  0x009f: PHI (r14v32 java.lang.Object) = (r14v30 java.lang.Object), (r14v0 java.lang.Object) binds: [B:33:0x009c, B:12:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:77:0x0161 A[DONT_INVERT, PHI: r1 r14
  0x0161: PHI (r1v9 a.ghs0) = (r1v6 a.ghs0), (r1v13 a.ghs0) binds: [B:75:0x015e, B:54:0x00f0] A[DONT_GENERATE, DONT_INLINE]
  0x0161: PHI (r14v14 java.lang.Object) = (r14v12 java.lang.Object), (r14v0 java.lang.Object) binds: [B:75:0x015e, B:54:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x0163  */
    /* JADX WARN: Code duplicated, block: B:81:0x016f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0179  */
    /* JADX WARN: Code duplicated, block: B:85:0x0187  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
    
        if (r14.a(r13) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0145, code lost:
    
        if (r14.a(r13) == r0) goto L80;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nyh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

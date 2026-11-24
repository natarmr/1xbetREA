package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class lyh extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 3;
    public boolean j;
    public byte k;
    public /* synthetic */ Object l;
    public final /* synthetic */ boolean m;
    public Object n;
    public Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lyh(jrs0 jrs0Var, int[] iArr, boolean z, boolean z2, String[] strArr, yje yjeVar) {
        super(2, yjeVar);
        this.n = jrs0Var;
        this.o = iArr;
        this.j = z;
        this.m = z2;
        this.p = strArr;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.p;
        switch (b) {
            case 0:
                lyh lyhVar = new lyh(yjeVar, (zdg0) this.o, (Function2) obj2, this.j, this.m);
                lyhVar.l = obj;
                return lyhVar;
            case 1:
                lyh lyhVar2 = new lyh((kki) obj2, this.m, yjeVar);
                lyhVar2.l = obj;
                return lyhVar2;
            case 2:
                lyh lyhVar3 = new lyh(this.j, (rrd) this.o, (Function1) obj2, this.m, yjeVar);
                lyhVar3.l = obj;
                return lyhVar3;
            default:
                lyh lyhVar4 = new lyh((jrs0) this.n, (int[]) this.o, this.j, this.m, (String[]) obj2, yjeVar);
                lyhVar4.l = obj;
                return lyhVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.i) {
            case 0:
                return ((lyh) create((fhs0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((lyh) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((lyh) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                ((lyh) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
                return wne.f39444a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:165:0x039e  */
    /* JADX WARN: Code duplicated, block: B:197:0x0448  */
    /* JADX WARN: Code duplicated, block: B:200:0x0461  */
    /* JADX WARN: Code duplicated, block: B:204:0x046c A[PHI: r4 r10
  0x046c: PHI (r4v7 a.dhs0) = (r4v4 a.dhs0), (r4v6 a.dhs0), (r4v6 a.dhs0), (r4v15 a.dhs0) binds: [B:203:0x0467, B:196:0x0446, B:201:0x0463, B:183:0x03ff] A[DONT_GENERATE, DONT_INLINE]
  0x046c: PHI (r10v8 a.fhs0) = (r10v4 a.fhs0), (r10v7 a.fhs0), (r10v7 a.fhs0), (r10v13 a.fhs0) binds: [B:203:0x0467, B:196:0x0446, B:201:0x0463, B:183:0x03ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:207:0x047e A[DONT_INVERT, PHI: r0 r10
  0x047e: PHI (r0v6 java.lang.Object) = (r0v4 java.lang.Object), (r0v11 java.lang.Object) binds: [B:205:0x047b, B:182:0x03f3] A[DONT_GENERATE, DONT_INLINE]
  0x047e: PHI (r10v9 a.fhs0) = (r10v8 a.fhs0), (r10v14 a.fhs0) binds: [B:205:0x047b, B:182:0x03f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:208:0x0480  */
    /* JADX WARN: Code duplicated, block: B:267:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0489, code lost:
    
        if (r1 == r9) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d3, code lost:
    
        if (a.slb.Q(r2, r0, r25) == r3) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.lyh.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lyh(kki kkiVar, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.p = kkiVar;
        this.m = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lyh(yje yjeVar, zdg0 zdg0Var, Function2 function2, boolean z, boolean z2) {
        super(2, yjeVar);
        this.j = z;
        this.m = z2;
        this.o = zdg0Var;
        this.p = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lyh(boolean z, rrd rrdVar, Function1 function1, boolean z2, yje yjeVar) {
        super(2, yjeVar);
        this.j = z;
        this.o = rrdVar;
        this.p = function1;
        this.m = z2;
    }
}

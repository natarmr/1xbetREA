package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class kqs extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 1;
    public long j;
    public byte k;
    public boolean l;
    public Object m;
    public Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kqs(Function1 function1, Function1 function2, i2o i2oVar, Function0 function0, long j, yje yjeVar) {
        super(2, yjeVar);
        this.n = function1;
        this.o = function2;
        this.p = i2oVar;
        this.q = function0;
        this.j = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.q;
        Object obj3 = this.p;
        Object obj4 = this.o;
        switch (b) {
            case 0:
                kqs kqsVar = new kqs((Function1) this.n, (Function1) obj4, (i2o) obj3, (Function0) obj2, this.j, yjeVar);
                kqsVar.m = obj;
                return kqsVar;
            default:
                return new kqs((g7c0) obj4, this.l, (String) obj3, (String) obj2, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((kqs) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((kqs) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0074  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b4 A[PHI: r0
  0x00b4: PHI (r0v9 java.lang.Object) = (r0v7 java.lang.Object), (r0v13 java.lang.Object) binds: [B:20:0x00b0, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:29:0x0110  */
    /* JADX WARN: Code duplicated, block: B:32:0x0116  */
    /* JADX WARN: Code duplicated, block: B:34:0x011a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0147  */
    /* JADX WARN: Code duplicated, block: B:40:0x014c  */
    /* JADX WARN: Code duplicated, block: B:43:0x015b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0160  */
    /* JADX WARN: Code duplicated, block: B:69:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:80:0x020b  */
    /* JADX WARN: Code duplicated, block: B:82:0x020f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0234 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0236  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0171, code lost:
    
        if (r9.w(r2, (a.oa20) r8, (java.lang.String) r6, r26) == r13) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01e3, code lost:
    
        if (r0.a(r8, r26) == r12) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01e6, code lost:
    
        r8 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0208, code lost:
    
        if (r0.a(r8, r26) == r12) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x021d, code lost:
    
        if (r0.a(r8, r26) == r12) goto L87;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0230 -> B:63:0x01b3). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kqs.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kqs(g7c0 g7c0Var, boolean z, String str, String str2, yje yjeVar) {
        super(2, yjeVar);
        this.o = g7c0Var;
        this.l = z;
        this.p = str;
        this.q = str2;
    }
}

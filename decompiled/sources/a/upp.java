package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class upp extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public Object j;
    public long k;
    public byte l;
    public Object m;
    public final /* synthetic */ long n;
    public Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public upp(tzi tziVar, long j, sip sipVar, long j2, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        this.o = tziVar;
        this.k = j;
        this.p = sipVar;
        this.n = j2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.p;
        switch (b) {
            case 0:
                upp uppVar = new upp((tzi) this.o, this.k, (sip) obj2, this.n, yjeVar);
                uppVar.m = obj;
                return uppVar;
            case 1:
                upp uppVar2 = new upp(this.o, (Enum) obj2, this.n, yjeVar, (byte) 1);
                uppVar2.m = obj;
                return uppVar2;
            case 2:
                return new upp(this.o, (Enum) obj2, this.n, yjeVar, (byte) 2);
            default:
                return new upp((tpe0) obj2, this.k, this.n, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((upp) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((upp) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((upp) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((upp) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0155  */
    /* JADX WARN: Code duplicated, block: B:60:0x016d  */
    /* JADX WARN: Code duplicated, block: B:64:0x017d A[PHI: r12
  0x017d: PHI (r12v1 long) = (r12v2 long), (r12v7 long) binds: [B:62:0x017a, B:52:0x0133] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0194  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0100, code lost:
    
        if (r0 == r9) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x018e, code lost:
    
        if (a.qcc.O(r14, r19) == r9) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01e2, code lost:
    
        if (r9.a(r0, r19) == r10) goto L82;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x018e -> B:67:0x0192). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.upp.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public upp(tpe0 tpe0Var, long j, long j2, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        this.p = tpe0Var;
        this.k = j;
        this.n = j2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ upp(Object obj, Enum r2, long j, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.o = obj;
        this.p = r2;
        this.n = j;
    }
}

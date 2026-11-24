package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class h3b0 extends bnn0 implements Function2 {
    public long i;
    public long j;
    public Object k;
    public byte l;
    public final /* synthetic */ v3b0 m;
    public final /* synthetic */ w4t n;
    public final /* synthetic */ long o;
    public final /* synthetic */ byte p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    public h3b0(v3b0 v3b0Var, w4t w4tVar, long j, long j2, yje yjeVar) {
        super(2, yjeVar);
        this.m = v3b0Var;
        this.n = w4tVar;
        this.o = j;
        this.p = (int) j2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new h3b0(this.m, this.n, this.o, this.p, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h3b0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008c A[Catch: all -> 0x008f, TryCatch #4 {all -> 0x008f, blocks: (B:25:0x0088, B:27:0x008c, B:30:0x0091), top: B:58:0x0088 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00af, code lost:
    
        if (a.qcc.O(r10 - r6, r20) == r2) goto L48;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.h3b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class kcc extends bnn0 implements Function2 {
    public byte i;
    public final /* synthetic */ xcz j;
    public final /* synthetic */ int k;
    public final /* synthetic */ w6k l;
    public final /* synthetic */ int m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ hh80 o;
    public final /* synthetic */ k6z p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kcc(xcz xczVar, int i, w6k w6kVar, int i2, boolean z, hh80 hh80Var, k6z k6zVar, yje yjeVar) {
        super(2, yjeVar);
        this.j = xczVar;
        this.k = i;
        this.l = w6kVar;
        this.m = i2;
        this.n = z;
        this.o = hh80Var;
        this.p = k6zVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new kcc(this.j, this.k, this.l, this.m, this.n, this.o, this.p, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((kcc) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00cf  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        if (r9.l(r3, 0, r12) == r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ad, code lost:
    
        if (r9.f(r3, 0, r12) == r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ca, code lost:
    
        if (a.bww.x(r9, r13, r1, r12) == r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d8, code lost:
    
        if (a.bww.x(r9, r11, r1, r12) == r0) goto L54;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kcc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class an0 extends bnn0 implements Function2 {
    public vne i;
    public dn0 j;
    public lu0 k;
    public int l;
    public int m;
    public int n;
    public long o;
    public byte p;
    public /* synthetic */ Object q;
    public final /* synthetic */ dn0 r;
    public final /* synthetic */ long s;
    public final /* synthetic */ int t;
    public final /* synthetic */ lu0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an0(dn0 dn0Var, long j, int i, lu0 lu0Var, yje yjeVar) {
        super(2, yjeVar);
        this.r = dn0Var;
        this.s = j;
        this.t = i;
        this.u = lu0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        an0 an0Var = new an0(this.r, this.s, this.t, this.u, yjeVar);
        an0Var.q = obj;
        return an0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((an0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:6|60|81|15|16|79|17|(1:20)|58) */
    /* JADX WARN: Code duplicated, block: B:20:0x0089  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:64:0x011f  */
    /* JADX WARN: Code duplicated, block: B:67:0x012e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0142  */
    /* JADX WARN: Code duplicated, block: B:83:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x013b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[LOOP:0: B:65:0x0128->B:85:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0099, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009a, code lost:
    
        r1 = r15;
        r15 = r11;
        r11 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009f, code lost:
    
        r12 = r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x010a -> B:60:0x010e). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.an0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

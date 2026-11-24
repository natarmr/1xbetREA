package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class gm0 extends bnn0 implements Function2 {
    public vne i;
    public dn0 j;
    public mlr k;
    public lu0 l;
    public int m;
    public int n;
    public int o;
    public byte p;
    public /* synthetic */ Object q;
    public final /* synthetic */ dn0 r;
    public final /* synthetic */ mlr s;
    public final /* synthetic */ int t;
    public final /* synthetic */ lu0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm0(dn0 dn0Var, mlr mlrVar, int i, lu0 lu0Var, yje yjeVar) {
        super(2, yjeVar);
        this.r = dn0Var;
        this.s = mlrVar;
        this.t = i;
        this.u = lu0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        gm0 gm0Var = new gm0(this.r, this.s, this.t, this.u, yjeVar);
        gm0Var.q = obj;
        return gm0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((gm0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:6|68|98|15|16|94|17|18|100|19|20|96|21|(1:24)|66) */
    /* JADX WARN: Code duplicated, block: B:104:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0098  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:72:0x0138  */
    /* JADX WARN: Code duplicated, block: B:75:0x014a  */
    /* JADX WARN: Code duplicated, block: B:78:0x0154  */
    /* JADX WARN: Code duplicated, block: B:81:0x0163 A[EDGE_INSN: B:81:0x0163->B:82:0x016c BREAK  A[LOOP:0: B:76:0x014e->B:106:?]] */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
    
        r3 = r5;
        r14 = r10;
        r2 = r12;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ab, code lost:
    
        r11 = r3;
        r3 = r5;
        r14 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b2, code lost:
    
        r10 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b6, code lost:
    
        r11 = r3;
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c8, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d7, code lost:
    
        if ((r0 instanceof a.zhi0) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d9, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00de, code lost:
    
        if (r5.f != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e5, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e9, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ef, code lost:
    
        if (a.hic.C(r0) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f2, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f5, code lost:
    
        if (r1 > 3) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00fa, code lost:
    
        java.lang.System.out.println((java.lang.Object) a.b1j.g(r1, "error (", "): ", r0));
        r5 = null;
        r19.q = null;
        r19.i = r15;
        r19.j = r14;
        r19.k = r11;
        r19.l = r3;
        r19.m = r2;
        r19.n = r4;
        r19.o = r1;
        r19.p = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0121, code lost:
    
        if (a.qcc.O(3000, r19) != r8) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0124, code lost:
    
        r0 = r3;
        r3 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x012b, code lost:
    
        r1 = a.j0g0.b;
        r0 = new a.g0g0(r0);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0124 -> B:68:0x0126). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gm0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

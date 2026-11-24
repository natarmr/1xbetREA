package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class m9s0 extends bnn0 implements Function2 {
    public vne i;
    public h0q0 j;
    public Integer k;
    public vne l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public byte q;
    public /* synthetic */ Object r;
    public final /* synthetic */ h0q0 s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ Integer u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9s0(h0q0 h0q0Var, boolean z, Integer num, int i, yje yjeVar) {
        super(2, yjeVar);
        this.s = h0q0Var;
        this.t = z;
        this.u = num;
        this.v = i;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        m9s0 m9s0Var = new m9s0(this.s, this.t, this.u, this.v, yjeVar);
        m9s0Var.r = obj;
        return m9s0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m9s0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:6|87|94|15|(2:100|17)(1:21)|22|(1:24)(1:25)|26|27|98|28|(1:31)|85) */
    /* JADX WARN: Can't wrap try/catch for region: R(2:100|17) */
    /* JADX WARN: Code duplicated, block: B:100:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0094  */
    /* JADX WARN: Code duplicated, block: B:24:0x0099  */
    /* JADX WARN: Code duplicated, block: B:25:0x009b  */
    /* JADX WARN: Code duplicated, block: B:31:0x00be  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d2 A[Catch: all -> 0x004b, TryCatch #2 {all -> 0x004b, blocks: (B:32:0x00c6, B:34:0x00d2, B:35:0x00d4, B:36:0x00dd, B:38:0x00e3, B:43:0x00f9, B:46:0x00ff, B:48:0x0103, B:42:0x00f1, B:49:0x0107, B:10:0x0044, B:39:0x00e9), top: B:96:0x0044, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e3 A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #2 {all -> 0x004b, blocks: (B:32:0x00c6, B:34:0x00d2, B:35:0x00d4, B:36:0x00dd, B:38:0x00e3, B:43:0x00f9, B:46:0x00ff, B:48:0x0103, B:42:0x00f1, B:49:0x0107, B:10:0x0044, B:39:0x00e9), top: B:96:0x0044, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:56:0x0119  */
    /* JADX WARN: Code duplicated, block: B:61:0x0126  */
    /* JADX WARN: Code duplicated, block: B:64:0x012b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0141  */
    /* JADX WARN: Code duplicated, block: B:75:0x0143  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008d, code lost:
    
        r2 = r13;
        r4 = r15;
        r13 = r11;
        r11 = r1;
        r1 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x010c, code lost:
    
        r1 = r12;
        r2 = r13;
        r4 = r15;
        r13 = r11;
        r11 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0113, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0114, code lost:
    
        r16 = r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x017d -> B:87:0x0182). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.m9s0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class v1e0 extends bnn0 implements Function2 {
    public w1e0 i;
    public v1e0 j;
    public Throwable k;
    public int l;
    public int m;
    public int n;
    public int o;
    public long p;
    public long q;
    public byte r;
    public /* synthetic */ Object s;
    public final /* synthetic */ w1e0 t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1e0(w1e0 w1e0Var, int i, yje yjeVar) {
        super(2, yjeVar);
        this.t = w1e0Var;
        this.u = i;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        v1e0 v1e0Var = new v1e0(this.t, this.u, yjeVar);
        v1e0Var.s = obj;
        return v1e0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v1e0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:109|30|104|31|32|33|102|34|35|100|36|(1:39)|83) */
    /* JADX WARN: Code duplicated, block: B:109:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x011c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0140 A[Catch: all -> 0x007d, TryCatch #3 {all -> 0x007d, blocks: (B:40:0x0125, B:42:0x0140, B:44:0x014e, B:16:0x0076), top: B:106:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0186 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0188 A[Catch: all -> 0x021e, TryCatch #4 {all -> 0x021e, blocks: (B:8:0x0028, B:45:0x015c, B:56:0x0180, B:59:0x0188, B:61:0x0193, B:65:0x019b, B:67:0x019f, B:71:0x01c1, B:73:0x01ca, B:75:0x01d1, B:79:0x01d9, B:81:0x01dd, B:86:0x0201, B:88:0x020b, B:90:0x0215, B:91:0x021c, B:92:0x021d, B:13:0x0053, B:27:0x00b9), top: B:108:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0193 A[Catch: all -> 0x021e, TryCatch #4 {all -> 0x021e, blocks: (B:8:0x0028, B:45:0x015c, B:56:0x0180, B:59:0x0188, B:61:0x0193, B:65:0x019b, B:67:0x019f, B:71:0x01c1, B:73:0x01ca, B:75:0x01d1, B:79:0x01d9, B:81:0x01dd, B:86:0x0201, B:88:0x020b, B:90:0x0215, B:91:0x021c, B:92:0x021d, B:13:0x0053, B:27:0x00b9), top: B:108:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0198  */
    /* JADX WARN: Code duplicated, block: B:64:0x019a  */
    /* JADX WARN: Code duplicated, block: B:67:0x019f A[Catch: all -> 0x021e, TryCatch #4 {all -> 0x021e, blocks: (B:8:0x0028, B:45:0x015c, B:56:0x0180, B:59:0x0188, B:61:0x0193, B:65:0x019b, B:67:0x019f, B:71:0x01c1, B:73:0x01ca, B:75:0x01d1, B:79:0x01d9, B:81:0x01dd, B:86:0x0201, B:88:0x020b, B:90:0x0215, B:91:0x021c, B:92:0x021d, B:13:0x0053, B:27:0x00b9), top: B:108:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c1 A[Catch: all -> 0x021e, TryCatch #4 {all -> 0x021e, blocks: (B:8:0x0028, B:45:0x015c, B:56:0x0180, B:59:0x0188, B:61:0x0193, B:65:0x019b, B:67:0x019f, B:71:0x01c1, B:73:0x01ca, B:75:0x01d1, B:79:0x01d9, B:81:0x01dd, B:86:0x0201, B:88:0x020b, B:90:0x0215, B:91:0x021c, B:92:0x021d, B:13:0x0053, B:27:0x00b9), top: B:108:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01ca A[Catch: all -> 0x021e, TryCatch #4 {all -> 0x021e, blocks: (B:8:0x0028, B:45:0x015c, B:56:0x0180, B:59:0x0188, B:61:0x0193, B:65:0x019b, B:67:0x019f, B:71:0x01c1, B:73:0x01ca, B:75:0x01d1, B:79:0x01d9, B:81:0x01dd, B:86:0x0201, B:88:0x020b, B:90:0x0215, B:91:0x021c, B:92:0x021d, B:13:0x0053, B:27:0x00b9), top: B:108:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01d1 A[Catch: all -> 0x021e, TryCatch #4 {all -> 0x021e, blocks: (B:8:0x0028, B:45:0x015c, B:56:0x0180, B:59:0x0188, B:61:0x0193, B:65:0x019b, B:67:0x019f, B:71:0x01c1, B:73:0x01ca, B:75:0x01d1, B:79:0x01d9, B:81:0x01dd, B:86:0x0201, B:88:0x020b, B:90:0x0215, B:91:0x021c, B:92:0x021d, B:13:0x0053, B:27:0x00b9), top: B:108:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x01dd A[Catch: all -> 0x021e, TryCatch #4 {all -> 0x021e, blocks: (B:8:0x0028, B:45:0x015c, B:56:0x0180, B:59:0x0188, B:61:0x0193, B:65:0x019b, B:67:0x019f, B:71:0x01c1, B:73:0x01ca, B:75:0x01d1, B:79:0x01d9, B:81:0x01dd, B:86:0x0201, B:88:0x020b, B:90:0x0215, B:91:0x021c, B:92:0x021d, B:13:0x0053, B:27:0x00b9), top: B:108:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0201 A[Catch: all -> 0x021e, TryCatch #4 {all -> 0x021e, blocks: (B:8:0x0028, B:45:0x015c, B:56:0x0180, B:59:0x0188, B:61:0x0193, B:65:0x019b, B:67:0x019f, B:71:0x01c1, B:73:0x01ca, B:75:0x01d1, B:79:0x01d9, B:81:0x01dd, B:86:0x0201, B:88:0x020b, B:90:0x0215, B:91:0x021c, B:92:0x021d, B:13:0x0053, B:27:0x00b9), top: B:108:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0208  */
    /* JADX WARN: Code duplicated, block: B:88:0x020b A[Catch: all -> 0x021e, TryCatch #4 {all -> 0x021e, blocks: (B:8:0x0028, B:45:0x015c, B:56:0x0180, B:59:0x0188, B:61:0x0193, B:65:0x019b, B:67:0x019f, B:71:0x01c1, B:73:0x01ca, B:75:0x01d1, B:79:0x01d9, B:81:0x01dd, B:86:0x0201, B:88:0x020b, B:90:0x0215, B:91:0x021c, B:92:0x021d, B:13:0x0053, B:27:0x00b9), top: B:108:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0213 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0215 A[Catch: all -> 0x021e, TryCatch #4 {all -> 0x021e, blocks: (B:8:0x0028, B:45:0x015c, B:56:0x0180, B:59:0x0188, B:61:0x0193, B:65:0x019b, B:67:0x019f, B:71:0x01c1, B:73:0x01ca, B:75:0x01d1, B:79:0x01d9, B:81:0x01dd, B:86:0x0201, B:88:0x020b, B:90:0x0215, B:91:0x021c, B:92:0x021d, B:13:0x0053, B:27:0x00b9), top: B:108:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:92:0x021d A[Catch: all -> 0x021e, TRY_LEAVE, TryCatch #4 {all -> 0x021e, blocks: (B:8:0x0028, B:45:0x015c, B:56:0x0180, B:59:0x0188, B:61:0x0193, B:65:0x019b, B:67:0x019f, B:71:0x01c1, B:73:0x01ca, B:75:0x01d1, B:79:0x01d9, B:81:0x01dd, B:86:0x0201, B:88:0x020b, B:90:0x0215, B:91:0x021c, B:92:0x021d, B:13:0x0053, B:27:0x00b9), top: B:108:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:97:0x022d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0235  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0160, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0162, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0163, code lost:
    
        r12 = r2;
        r16 = r3;
        r9 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0167, code lost:
    
        r2 = r15;
        r15 = r0;
        r0 = r2;
        r5 = r9;
        r2 = r12;
        r3 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x016f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0174, code lost:
    
        r2 = r15;
        r15 = r0;
        r0 = r2;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0179, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x020b -> B:85:0x01fd). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.v1e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

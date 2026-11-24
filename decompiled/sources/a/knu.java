package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class knu extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public vne j;
    public String k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public byte p;
    public /* synthetic */ Object q;
    public final /* synthetic */ String r;
    public final /* synthetic */ byte s;
    public final /* synthetic */ boolean t;
    public Object u;
    public Object v;
    public Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public knu(jnu jnuVar, es esVar, String str, int i, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.v = jnuVar;
        this.x = esVar;
        this.r = str;
        this.s = i;
        this.t = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.x;
        switch (b) {
            case 0:
                knu knuVar = new knu((jnu) this.v, (es) obj2, this.r, this.s, this.t, yjeVar);
                knuVar.q = obj;
                return knuVar;
            default:
                knu knuVar2 = new knu((khf0) this.w, (vh0) obj2, this.r, this.s, this.t, yjeVar);
                knuVar2.q = obj;
                return knuVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((knu) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:8|9|64|168|17|18|156|19|(1:22)|62|171) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:75|76|145|152|85|86|166|87|88|(2:162|90)(1:95)|96|97|158|98|(1:101)|143|173) */
    /* JADX WARN: Can't wrap try/catch for region: R(2:162|90) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:4|(1:(1:(11:8|9|64|168|17|18|156|19|(1:22)|62|171)(2:10|170))(4:11|164|12|13))(9:16|168|17|18|156|19|(1:22)|62|171)|160|23|66|67) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:69|(2:71|(2:73|(17:75|76|145|152|85|86|166|87|88|(2:162|90)(1:95)|96|97|158|98|(1:101)|143|173)(2:77|172))(4:78|150|79|80))(15:84|152|85|86|166|87|88|(2:162|90)(1:95)|96|97|158|98|(1:101)|143|173)|154|102|147|148) */
    /* JADX WARN: Code duplicated, block: B:101:0x024a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0271  */
    /* JADX WARN: Code duplicated, block: B:119:0x027e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0283  */
    /* JADX WARN: Code duplicated, block: B:132:0x0299  */
    /* JADX WARN: Code duplicated, block: B:133:0x029d  */
    /* JADX WARN: Code duplicated, block: B:162:0x0205 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:51:0x0115  */
    /* JADX WARN: Code duplicated, block: B:52:0x0117  */
    /* JADX WARN: Code duplicated, block: B:95:0x021a A[Catch: all -> 0x025f, TRY_ENTER, TryCatch #8 {all -> 0x025f, blocks: (B:87:0x01fd, B:96:0x021c, B:95:0x021a), top: B:166:0x01fd }] */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0258, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x025b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x025c, code lost:
    
        r10 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x025d, code lost:
    
        r9 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x025f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0260, code lost:
    
        r21 = r4;
        r20 = r5;
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0267, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0268, code lost:
    
        r21 = r4;
        r20 = r5;
        r5 = r7;
        r4 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ce, code lost:
    
        r25 = r11;
        r11 = r6;
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d2, code lost:
    
        r7 = r8;
        r8 = r9;
        r9 = r10;
        r10 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d9, code lost:
    
        r25 = r11;
        r11 = r2;
        r2 = r3;
        r3 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00df, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e0, code lost:
    
        r9 = r22;
        r6 = r23;
        r7 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f4, code lost:
    
        r14 = r12;
        r17 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0107, code lost:
    
        if ((r0 instanceof a.zhi0) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0109, code lost:
    
        r12 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010e, code lost:
    
        if (r12.f != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0115, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0117, code lost:
    
        r12 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011e, code lost:
    
        if (a.hic.C(r0) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0121, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0124, code lost:
    
        if (r2 > 3) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0129, code lost:
    
        java.lang.System.out.println((java.lang.Object) a.b1j.g(r2, "error (", "): ", r0));
        r1.q = r15;
        r1.j = r11;
        r1.u = r10;
        r1.v = r9;
        r1.k = r8;
        r1.l = r7;
        r1.m = r6;
        r1.o = r3;
        r1.n = r2;
        r1.p = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x014d, code lost:
    
        if (a.qcc.O(3000, r1) != r13) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0151, code lost:
    
        r24 = r3;
        r23 = r6;
        r3 = r2;
        r22 = r8;
        r8 = r7;
        r2 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0161, code lost:
    
        r1 = a.j0g0.b;
        r0 = new a.g0g0(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x020e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x020f, code lost:
    
        r21 = r4;
        r20 = r5;
        r9 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0214, code lost:
    
        r7 = r15;
        r4 = r3;
        r3 = r6;
        r6 = r14;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:144:0x02de -> B:76:0x01a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0151 -> B:9:0x0048). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.knu.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public knu(khf0 khf0Var, vh0 vh0Var, String str, int i, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.w = khf0Var;
        this.x = vh0Var;
        this.r = str;
        this.s = i;
        this.t = z;
    }
}

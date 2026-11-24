package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class gfe0 extends bnn0 implements Function2 {
    public Object i;
    public kd30 j;
    public gfe0 k;
    public long l;
    public long m;
    public long n;
    public long o;
    public int p;
    public int q;
    public int r;
    public byte s;
    public /* synthetic */ Object t;
    public final /* synthetic */ kd30 u;
    public final /* synthetic */ long v;
    public final /* synthetic */ String w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfe0(kd30 kd30Var, long j, String str, yje yjeVar) {
        super(2, yjeVar);
        this.u = kd30Var;
        this.v = j;
        this.w = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        gfe0 gfe0Var = new gfe0(this.u, this.v, this.w, yjeVar);
        gfe0Var.t = obj;
        return gfe0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((gfe0) create((xe60) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|2|202|(1:(1:(1:(1:(2:8|9)(2:10|191))(2:11|181))(51:12|237|13|14|15|168|192|29|235|30|31|229|32|225|33|34|217|35|231|36|198|37|38|39|(1:42)|(3:196|44|45)(1:49)|50|51|223|52|53|219|56|(1:58)|59|(3:215|61|(1:66))(1:66)|67|68|211|69|70|205|71|72|194|73|74|221|75|76|(2:78|190)(1:79)))(4:18|207|19|20))(48:24|(1:26)(1:27)|28|192|29|235|30|31|229|32|225|33|34|217|35|231|36|198|37|38|39|(1:42)|(3:196|44|45)(1:49)|50|51|223|52|53|219|56|(1:58)|59|(3:215|61|(1:66))(1:66)|67|68|211|69|70|205|71|72|194|73|74|221|75|76|(2:78|190)(1:79))|21|213|80|(8:82|227|83|84|203|85|(2:88|86)|239)(1:93)|(1:95)|96|97|175|176|(2:178|(1:244)(1:241))(1:240)|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(3:196|44|45) */
    /* JADX WARN: Can't wrap try/catch for region: R(3:215|61|(1:66)) */
    /* JADX WARN: Can't wrap try/catch for region: R(48:237|13|14|15|168|192|29|235|30|31|229|32|225|33|34|217|35|231|36|198|37|38|39|(1:42)|(3:196|44|45)(1:49)|50|51|(3:223|52|53)|219|56|(1:58)|59|(3:215|61|(1:66))(1:66)|67|68|211|69|70|205|71|72|194|73|74|221|75|76|(2:78|190)(1:79)) */
    /* JADX WARN: Can't wrap try/catch for region: R(50:237|13|14|15|168|192|29|235|30|31|229|32|225|33|34|217|35|231|36|198|37|38|39|(1:42)|(3:196|44|45)(1:49)|50|51|223|52|53|219|56|(1:58)|59|(3:215|61|(1:66))(1:66)|67|68|211|69|70|205|71|72|194|73|74|221|75|76|(2:78|190)(1:79)) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:82|227|83|84|203|85|(2:88|86)|239) */
    /* JADX WARN: Code duplicated, block: B:130:0x024b  */
    /* JADX WARN: Code duplicated, block: B:133:0x0251 A[Catch: all -> 0x025b, TRY_LEAVE, TryCatch #21 {all -> 0x025b, blocks: (B:131:0x024d, B:133:0x0251, B:147:0x0273, B:149:0x027a), top: B:233:0x024d }] */
    /* JADX WARN: Code duplicated, block: B:138:0x0261  */
    /* JADX WARN: Code duplicated, block: B:142:0x0269 A[Catch: all -> 0x0305, TryCatch #4 {all -> 0x0305, blocks: (B:140:0x0265, B:142:0x0269, B:145:0x026f, B:163:0x02d2, B:154:0x028c), top: B:200:0x0265 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x0327  */
    /* JADX WARN: Code duplicated, block: B:188:0x0354  */
    /* JADX WARN: Code duplicated, block: B:196:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0144 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:49:0x0112  */
    /* JADX WARN: Code duplicated, block: B:58:0x013f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0156  */
    /* JADX WARN: Code duplicated, block: B:78:0x0187  */
    /* JADX WARN: Code duplicated, block: B:79:0x018a  */
    /* JADX WARN: Code duplicated, block: B:82:0x019f  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b8 A[Catch: all -> 0x01c6, LOOP:0: B:86:0x01b2->B:88:0x01b8, LOOP_END, TryCatch #6 {all -> 0x01c6, blocks: (B:85:0x01a7, B:86:0x01b2, B:88:0x01b8, B:95:0x01e2, B:96:0x01e4), top: B:203:0x01a7 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01db  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e2 A[Catch: all -> 0x01c6, TryCatch #6 {all -> 0x01c6, blocks: (B:85:0x01a7, B:86:0x01b2, B:88:0x01b8, B:95:0x01e2, B:96:0x01e4), top: B:203:0x01a7 }] */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ef, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f2, code lost:
    
        r16 = r5;
        r3 = r19;
        r27 = r6;
        r6 = r4;
        r4 = r9;
        r9 = r11;
        r11 = r7;
        r7 = r15;
        r8 = r18;
        r15 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0202, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0203, code lost:
    
        r18 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0206, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0207, code lost:
    
        r30 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x020a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x020b, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x020e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x020f, code lost:
    
        r19 = r2;
        r18 = r3;
        r5 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0218, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0219, code lost:
    
        r5 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x021f, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0222, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0223, code lost:
    
        r18 = r3;
        r5 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0229, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x022c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x022d, code lost:
    
        r5 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0234, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0235, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0237, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0238, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x023c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x023d, code lost:
    
        r30 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0240, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0241, code lost:
    
        r30 = r5;
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0258, code lost:
    
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0271, code lost:
    
        if ((r0 instanceof a.zhi0) == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0282, code lost:
    
        r19 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0287, code lost:
    
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0293, code lost:
    
        r2 = r30 + 1;
        r20 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0298, code lost:
    
        if (r2 > 3) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x029c, code lost:
    
        r3 = r18;
        r11 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02a2, code lost:
    
        java.lang.System.out.println((java.lang.Object) ("error (" + r2 + "): " + r0));
        r29.t = r3;
        r29.i = r8;
        r29.j = r6;
        r29.k = r7;
        r29.l = r13;
        r29.m = r9;
        r29.n = r4;
        r29.p = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02d0, code lost:
    
        r11 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02d2, code lost:
    
        r29.o = r11;
        r0 = r16;
        r29.q = r0;
        r29.r = r2;
        r29.s = 2;
        r16 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02e7, code lost:
    
        r3 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02e9, code lost:
    
        if (a.qcc.O(3000, r7) == r3) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02ed, code lost:
    
        r18 = r13;
        r2 = r16;
        r13 = r9;
        r9 = r4;
        r4 = r6;
        r5 = r2;
        r6 = r0;
        r0 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0308, code lost:
    
        r4 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x030a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x030b, code lost:
    
        r3 = r18;
        r11 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0310, code lost:
    
        r2 = a.j0g0.b;
        r4 = new a.g0g0(r0);
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0102, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0103, code lost:
    
        r15 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010a, code lost:
    
        r8 = r3;
        r3 = r2;
        r2 = r16;
        r16 = r25;
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014c, code lost:
    
        r15 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c7, code lost:
    
        r4 = r9;
        r9 = r11;
        r11 = r6;
        r7 = r15;
        r6 = r30;
        r15 = r8;
        r30 = r16;
        r16 = r18;
        r8 = r3;
        r3 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d8, code lost:
    
        r18 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01eb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ec, code lost:
    
        r30 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v16, types: [long] */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [long] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [long] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v4, types: [long] */
    /* JADX WARN: Type inference failed for: r9v6, types: [long] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:167:0x02ed -> B:15:0x005b). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gfe0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

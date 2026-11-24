package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class iut extends bnn0 implements Function2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ String B;
    public final /* synthetic */ String Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ boolean f1;
    public int i;
    public int j;
    public int k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;
    public boolean q;
    public Object r;
    public String s;
    public String t;
    public jut u;
    public iut v;
    public byte w;
    public /* synthetic */ int x;
    public final /* synthetic */ jut y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iut(jut jutVar, long j, boolean z, String str, String str2, boolean z2, boolean z3, yje yjeVar) {
        super(2, yjeVar);
        this.y = jutVar;
        this.z = j;
        this.A = z;
        this.B = str;
        this.Y = str2;
        this.Z = z2;
        this.f1 = z3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        iut iutVar = new iut(this.y, this.z, this.A, this.B, this.Y, this.Z, this.f1, yjeVar);
        iutVar.x = ((Number) obj).intValue();
        return iutVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((iut) create(Integer.valueOf(((Number) obj).intValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(32:172|13|14|118|174|28|188|29|30|31|156|32|33|186|34|35|164|36|37|180|38|39|176|40|41|170|42|43|160|44|45|(2:47|150)(8:48|168|49|50|190|126|127|(2:129|(1:196)(1:193))(1:192))) */
    /* JADX WARN: Can't wrap try/catch for region: R(33:12|172|13|14|118|174|28|188|29|30|31|156|32|33|186|34|35|164|36|37|180|38|39|176|40|41|170|42|43|160|44|45|(2:47|150)(8:48|168|49|50|190|126|127|(2:129|(1:196)(1:193))(1:192))) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:48|168|49|50|(4:190|126|127|(2:129|(1:196)(1:193))(1:192))) */
    /* JADX WARN: Code duplicated, block: B:129:0x031e  */
    /* JADX WARN: Code duplicated, block: B:148:0x035e  */
    /* JADX WARN: Code duplicated, block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0168  */
    /* JADX WARN: Code duplicated, block: B:48:0x016b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0228  */
    /* JADX WARN: Code duplicated, block: B:81:0x022e A[Catch: all -> 0x0238, TRY_LEAVE, TryCatch #16 {all -> 0x0238, blocks: (B:79:0x022a, B:81:0x022e, B:95:0x0252, B:97:0x0259), top: B:184:0x022a }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0240  */
    /* JADX WARN: Code duplicated, block: B:90:0x0248 A[Catch: all -> 0x034a, TryCatch #5 {all -> 0x034a, blocks: (B:88:0x0244, B:90:0x0248, B:93:0x024e, B:102:0x0267), top: B:162:0x0244 }] */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0261, code lost:
    
        r21 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0264, code lost:
    
        r21 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x026e, code lost:
    
        r2 = r24 + 1;
        r23 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0273, code lost:
    
        if (r2 > 3) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0277, code lost:
    
        r3 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x027b, code lost:
    
        r6 = new java.lang.StringBuilder();
        r21 = r12;
        r6.append("error (");
        r6.append(r2);
        r6.append("): ");
        r6.append(r0);
        java.lang.System.out.println((java.lang.Object) r6.toString());
        r35.r = r9;
        r35.s = r10;
        r35.t = r11;
        r35.u = r3;
        r35.v = r7;
        r35.x = r8;
        r35.l = r14;
        r35.m = r4;
        r35.o = r13;
        r35.i = r21;
        r35.p = r23;
        r6 = r19;
        r35.q = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02b9, code lost:
    
        r19 = r3;
        r23 = r4;
        r3 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02bf, code lost:
    
        r35.n = r3;
        r5 = r36;
        r35.j = r5;
        r35.k = r2;
        r35.w = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02cc, code lost:
    
        r17 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02d4, code lost:
    
        r3 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02d6, code lost:
    
        if (a.qcc.O(3000, r7) == r3) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02da, code lost:
    
        r25 = r10;
        r4 = r23;
        r2 = r19;
        r12 = r6;
        r23 = r2;
        r24 = r5;
        r5 = r14;
        r14 = r21;
        r15 = r11;
        r11 = r13;
        r13 = r9;
        r9 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02f8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02f9, code lost:
    
        r3 = r22;
        r5 = r14;
        r10 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0300, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0301, code lost:
    
        r17 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0304, code lost:
    
        r2 = a.j0g0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x030b, code lost:
    
        r0 = new a.g0g0(r0);
        r5 = r14;
        r10 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0341, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0347, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0348, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x018d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x018e, code lost:
    
        r36 = r24;
        r24 = r3;
        r3 = r36;
        r22 = r2;
        r36 = r4;
        r17 = r5;
        r2 = r7;
        r6 = r9;
        r4 = r13;
        r7 = r23;
        r9 = r26;
        r14 = r29;
        r13 = r12;
        r12 = r11;
        r11 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01a9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01aa, code lost:
    
        r2 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01ad, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01af, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01b0, code lost:
    
        r24 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01b2, code lost:
    
        r29 = r5;
        r6 = r11;
        r11 = r15;
        r2 = r22;
        r20 = true;
        r32 = r12;
        r12 = r4;
        r4 = r9;
        r9 = r13;
        r10 = r14;
        r14 = r7;
        r7 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c3, code lost:
    
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c5, code lost:
    
        r13 = r6;
        r6 = r12;
        r2 = r14;
        r36 = r23;
        r17 = r25;
        r3 = r27;
        r14 = r29;
        r12 = r7;
        r7 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01d5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01d6, code lost:
    
        r20 = true;
        r24 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01e0, code lost:
    
        r32 = r12;
        r12 = r4;
        r4 = r9;
        r9 = r13;
        r10 = r14;
        r14 = r7;
        r7 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01ea, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01eb, code lost:
    
        r23 = r2;
        r24 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ef, code lost:
    
        r29 = r5;
        r6 = r11;
        r11 = r15;
        r20 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01f8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f9, code lost:
    
        r24 = r23;
        r20 = true;
        r23 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0204, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0205, code lost:
    
        r20 = r24;
        r24 = r23;
        r23 = r20;
        r25 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x020e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x020f, code lost:
    
        r20 = r24;
        r24 = r23;
        r23 = r20;
        r27 = r2;
        r28 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x021a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x021b, code lost:
    
        r20 = r24;
        r24 = r23;
        r23 = r20;
        r27 = r2;
        r28 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0235, code lost:
    
        r21 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0250, code lost:
    
        if ((r0 instanceof a.zhi0) == false) goto L102;
     */
    /* JADX WARN: Type inference failed for: r2v30, types: [a.iut, a.jut, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x02da -> B:118:0x02ed). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 893
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.iut.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

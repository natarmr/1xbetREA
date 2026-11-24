package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class j400 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f400 f15861a;
    public final btt0 b;
    public final e400 c;
    public final mne d;
    public final kuy e;
    public final sje f;
    public bby g;
    public bby h;
    public long i;
    public long j;
    public plq0 k;
    public plq0 l;

    public j400(f400 f400Var, btt0 btt0Var, e400 e400Var, mne mneVar, kuy kuyVar) {
        f400Var.getClass();
        btt0Var.getClass();
        e400Var.getClass();
        kuyVar.getClass();
        this.f15861a = f400Var;
        this.b = btt0Var;
        this.c = e400Var;
        this.d = mneVar;
        this.e = kuyVar;
        this.f = d5c.a(kotlin.coroutines.e.c(qem0.e(), mneVar.b));
        wen.b.getClass();
        this.i = 0L;
        this.j = 0L;
        qlq0.f28947a.getClass();
        rq40.f30914a.getClass();
        this.k = new plq0(rq40.b());
        this.l = new plq0(rq40.b());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:219|24|(1:27)|210) */
    /* JADX WARN: Code duplicated, block: B:102:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:103:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:106:0x01f7 A[LOOP:0: B:33:0x00f8->B:106:0x01f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:125:0x0229  */
    /* JADX WARN: Code duplicated, block: B:129:0x023e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0248  */
    /* JADX WARN: Code duplicated, block: B:133:0x0258  */
    /* JADX WARN: Code duplicated, block: B:134:0x025d  */
    /* JADX WARN: Code duplicated, block: B:137:0x0263  */
    /* JADX WARN: Code duplicated, block: B:138:0x0268  */
    /* JADX WARN: Code duplicated, block: B:141:0x026e  */
    /* JADX WARN: Code duplicated, block: B:142:0x0275  */
    /* JADX WARN: Code duplicated, block: B:145:0x027b  */
    /* JADX WARN: Code duplicated, block: B:147:0x0283  */
    /* JADX WARN: Code duplicated, block: B:149:0x028d  */
    /* JADX WARN: Code duplicated, block: B:151:0x0298  */
    /* JADX WARN: Code duplicated, block: B:154:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:156:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:157:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:160:0x02be  */
    /* JADX WARN: Code duplicated, block: B:162:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:165:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:166:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:169:0x02d7 A[LOOP:2: B:127:0x0238->B:169:0x02d7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:185:0x030d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:186:0x030f  */
    /* JADX WARN: Code duplicated, block: B:187:0x0318  */
    /* JADX WARN: Code duplicated, block: B:189:0x031d  */
    /* JADX WARN: Code duplicated, block: B:190:0x031f  */
    /* JADX WARN: Code duplicated, block: B:193:0x0324  */
    /* JADX WARN: Code duplicated, block: B:198:0x0341  */
    /* JADX WARN: Code duplicated, block: B:199:0x0347  */
    /* JADX WARN: Code duplicated, block: B:200:0x0349  */
    /* JADX WARN: Code duplicated, block: B:202:0x0350  */
    /* JADX WARN: Code duplicated, block: B:204:0x0356  */
    /* JADX WARN: Code duplicated, block: B:205:0x0358  */
    /* JADX WARN: Code duplicated, block: B:208:0x035d  */
    /* JADX WARN: Code duplicated, block: B:212:0x0377  */
    /* JADX WARN: Code duplicated, block: B:213:0x037d  */
    /* JADX WARN: Code duplicated, block: B:214:0x037f  */
    /* JADX WARN: Code duplicated, block: B:215:0x0389 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:216:0x038b  */
    /* JADX WARN: Code duplicated, block: B:218:0x0391  */
    /* JADX WARN: Code duplicated, block: B:219:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x021d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x0219 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x0215 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x020d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0209 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x0205 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x01da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x02f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x02f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x02ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x02e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x02e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x02a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:37:0x0108  */
    /* JADX WARN: Code duplicated, block: B:39:0x0114  */
    /* JADX WARN: Code duplicated, block: B:41:0x011c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0120  */
    /* JADX WARN: Code duplicated, block: B:45:0x0126  */
    /* JADX WARN: Code duplicated, block: B:48:0x012d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0135  */
    /* JADX WARN: Code duplicated, block: B:52:0x013d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0147  */
    /* JADX WARN: Code duplicated, block: B:56:0x0152  */
    /* JADX WARN: Code duplicated, block: B:57:0x0159  */
    /* JADX WARN: Code duplicated, block: B:60:0x015f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0166  */
    /* JADX WARN: Code duplicated, block: B:64:0x016c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0173  */
    /* JADX WARN: Code duplicated, block: B:68:0x0179  */
    /* JADX WARN: Code duplicated, block: B:69:0x0180  */
    /* JADX WARN: Code duplicated, block: B:72:0x0186  */
    /* JADX WARN: Code duplicated, block: B:73:0x018d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0193  */
    /* JADX WARN: Code duplicated, block: B:77:0x019a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:97:0x01de  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e2  */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0306, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v22, types: [int] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v15, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [a.sl] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r36v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r37v0 */
    /* JADX WARN: Type inference failed for: r37v1, types: [a.sl] */
    /* JADX WARN: Type inference failed for: r37v2 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:186:0x030f -> B:23:0x00a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:214:0x037f -> B:197:0x033d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r42, a.zje r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.j400.a(java.lang.String, a.zje):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:7))(1:7)|8|(1:(5:(1:(1:13)(2:14|15))(1:16)|17|61|51|(11:81|26|27|89|28|29|85|30|31|(1:34)|74)(1:(2:78|79)(1:80)))(4:18|87|19|20))(2:24|(11:81|26|27|89|28|29|85|30|31|(1:34)|74)(1:(2:78|79)(1:80)))|83|35|36|37|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(11:81|26|27|89|28|29|85|30|31|(1:34)|74) */
    /* JADX WARN: Code duplicated, block: B:34:0x010c  */
    /* JADX WARN: Code duplicated, block: B:49:0x013b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x013d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0147  */
    /* JADX WARN: Code duplicated, block: B:54:0x014e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0150  */
    /* JADX WARN: Code duplicated, block: B:58:0x0155  */
    /* JADX WARN: Code duplicated, block: B:62:0x0175  */
    /* JADX WARN: Code duplicated, block: B:63:0x017d  */
    /* JADX WARN: Code duplicated, block: B:64:0x017f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0186  */
    /* JADX WARN: Code duplicated, block: B:68:0x018f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0191  */
    /* JADX WARN: Code duplicated, block: B:72:0x0196  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:76:0x01be  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0126, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0129, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x012a, code lost:
    
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012e, code lost:
    
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0132, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0133, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01b1, code lost:
    
        if (a.qcc.P(r10, r7) == r1) goto L74;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x013d -> B:51:0x0144). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x01b1 -> B:61:0x0173). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x01b4 -> B:61:0x0173). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x01be -> B:61:0x0173). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r22, long r23, a.zje r25, java.lang.String r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.j400.b(int, long, a.zje, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:7))(1:7)|8|(1:(4:(1:(1:13)(2:14|15))(1:16)|17|62|(20:98|25|26|92|27|28|102|29|30|100|31|32|96|33|34|106|35|36|(1:39)|85)(1:(2:89|90)(1:91)))(4:18|94|19|20))(2:23|(20:98|25|26|92|27|28|102|29|30|100|31|32|96|33|34|106|35|36|(1:39)|85)(1:(2:89|90)(1:91)))|104|40|41|42|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(20:98|25|26|92|27|28|102|29|30|100|31|32|96|33|34|106|35|36|(1:39)|85) */
    /* JADX WARN: Code duplicated, block: B:39:0x011c  */
    /* JADX WARN: Code duplicated, block: B:60:0x015f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0161  */
    /* JADX WARN: Code duplicated, block: B:63:0x016d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0174  */
    /* JADX WARN: Code duplicated, block: B:66:0x0176  */
    /* JADX WARN: Code duplicated, block: B:69:0x017b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0199  */
    /* JADX WARN: Code duplicated, block: B:73:0x019b  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:83:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:86:0x01db  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:98:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0130, code lost:
    
        r7 = r2;
        r2 = r10;
        r10 = r6;
        r6 = r8;
        r8 = r4;
        r17 = r14;
        r14 = r3;
        r3 = r5;
        r4 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x013f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0140, code lost:
    
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0143, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0144, code lost:
    
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0148, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0149, code lost:
    
        r8 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x014c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x014d, code lost:
    
        r8 = r23;
        r3 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0152, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0153, code lost:
    
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0155, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0156, code lost:
    
        r1 = r3;
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01d8, code lost:
    
        if (a.qcc.P(r10, r7) == r1) goto L85;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0161 -> B:62:0x0168). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01a4 -> B:62:0x0168). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(int r22, long r23, a.zje r25, java.lang.String r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.j400.c(int, long, a.zje, java.lang.String):java.lang.Object");
    }

    public final void d(boolean z) {
        bby bbyVar = this.h;
        if (bbyVar == null || !bbyVar.isActive()) {
            qlq0.f28947a.getClass();
            rq40.f30914a.getClass();
            this.l = new plq0(rq40.b());
            List listC = kotlin.collections.a.c(oqt0.class);
            long j = this.j;
            uen uenVar = wen.b;
            bfn bfnVar = bfn.SECONDS;
            long jW0 = ibc.w0(30L, bfnVar);
            wen.b.getClass();
            this.h = sac.d0(this.f, "LimitsRsRepositoryImpl_sendPing", 30L, wen.d(j, 0L) ? 5L : wen.l(wen.j(jW0, j), bfnVar), this.d.b, 30L, listC, new z8z((byte) 21), new u88((Object) this, z, (yje) null, (byte) 26), 16);
        }
    }
}

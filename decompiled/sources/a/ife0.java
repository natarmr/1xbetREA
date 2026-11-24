package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ife0 extends m06 {
    public final xzp b;
    public final btt0 c;

    public ife0(xzp xzpVar, btt0 btt0Var) {
        btt0Var.getClass();
        this.b = xzpVar;
        this.c = btt0Var;
    }

    @Override // a.m06
    public final Object a(om80 om80Var) {
        Long l;
        int i;
        String str;
        om80Var.getClass();
        Integer num = om80Var.b;
        short s = om80Var.c.f7986a;
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        mm80 mm80VarA = om80Var.a(iIntValue);
        bp80 bp80Var = mm80VarA != null ? (bp80) mm80VarA.b : null;
        mm80 mm80VarA2 = om80Var.a(iIntValue);
        bp80 bp80Var2 = mm80VarA2 != null ? (bp80) mm80VarA2.c : null;
        if (bp80Var == null || (l = bp80Var.f2970a) == null) {
            l = bp80Var2 != null ? bp80Var2.f2970a : null;
        }
        if (bp80Var != null) {
            i = bp80Var.b + s;
        } else {
            i = bp80Var2 != null ? bp80Var2.b - s : 0;
        }
        if (bp80Var == null || (str = bp80Var.c) == null) {
            String str2 = bp80Var2 != null ? bp80Var2.c : null;
            str = str2 == null ? "" : str2;
        }
        return new bp80(i, l, str);
    }

    @Override // a.m06
    public final lm80 b(Throwable th) {
        return new lm80(th);
    }

    @Override // a.m06
    public final boolean d(Object obj, Object obj2) {
        return Intrinsics.d((bp80) obj, (bp80) obj2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:205|19|20|139|190|40|186|41|42|213|43|44|(1:47)|(3:198|49|50)(1:54)|55|56|57|(2:209|58)|200|64|(1:66)|67|(3:203|69|(1:72))(1:72)|76|77|196|78|79|188|80|(2:82|182)(14:83|84|85|86|194|144|145|(2:147|(1:217)(1:150))|(1:163)(4:156|(1:158)(1:159)|(1:161)|162)|164|(1:166)|(1:168)(1:169)|170|171)) */
    /* JADX WARN: Can't wrap try/catch for region: R(33:18|205|19|20|139|190|40|186|41|42|213|43|44|(1:47)|(3:198|49|50)(1:54)|55|56|57|209|58|200|64|(1:66)|67|(3:203|69|(1:72))(1:72)|76|77|196|78|79|188|80|(2:82|182)(14:83|84|85|86|194|144|145|(2:147|(1:217)(1:150))|(1:163)(4:156|(1:158)(1:159)|(1:161)|162)|164|(1:166)|(1:168)(1:169)|170|171)) */
    /* JADX WARN: Can't wrap try/catch for region: R(3:198|49|50) */
    /* JADX WARN: Can't wrap try/catch for region: R(3:203|69|(1:72)) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:60|61|207|62|63) */
    /* JADX WARN: Code duplicated, block: B:104:0x01d8 A[Catch: all -> 0x01e3, TryCatch #0 {all -> 0x01e3, blocks: (B:102:0x01d4, B:104:0x01d8, B:111:0x01e9, B:113:0x01ed, B:116:0x01f3, B:118:0x01f7, B:120:0x01fe, B:128:0x0215, B:132:0x021e, B:125:0x020e), top: B:184:0x01d4 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x01ed A[Catch: all -> 0x01e3, TryCatch #0 {all -> 0x01e3, blocks: (B:102:0x01d4, B:104:0x01d8, B:111:0x01e9, B:113:0x01ed, B:116:0x01f3, B:118:0x01f7, B:120:0x01fe, B:128:0x0215, B:132:0x021e, B:125:0x020e), top: B:184:0x01d4 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0206  */
    /* JADX WARN: Code duplicated, block: B:147:0x0292  */
    /* JADX WARN: Code duplicated, block: B:150:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:153:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:163:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:166:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:168:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:169:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:180:0x0308  */
    /* JADX WARN: Code duplicated, block: B:184:0x01d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x0151 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0104  */
    /* JADX WARN: Code duplicated, block: B:54:0x0127  */
    /* JADX WARN: Code duplicated, block: B:66:0x014c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0158  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x0188  */
    /* JADX WARN: Code duplicated, block: B:83:0x018b  */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01cd, code lost:
    
        r26 = r10;
        r10 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01df, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01f5, code lost:
    
        if ((r0 instanceof a.zhi0) != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01fc, code lost:
    
        if (r0.f != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0206, code lost:
    
        r23 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x020a, code lost:
    
        r23 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0212, code lost:
    
        if (a.hic.C(r0) == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0215, code lost:
    
        r9 = r26 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0218, code lost:
    
        if (r9 > 3) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x021c, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x021e, code lost:
    
        r2 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0223, code lost:
    
        r16 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0225, code lost:
    
        r2.append("error (");
        r2.append(r9);
        r2.append("): ");
        r2.append(r0);
        java.lang.System.out.println((java.lang.Object) r2.toString());
        r1.i = r7;
        r1.j = r6;
        r1.k = r8;
        r1.l = r5;
        r1.o = r10;
        r1.p = r14;
        r1.q = r12;
        r1.m = r4;
        r1.n = r9;
        r1.t = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0259, code lost:
    
        r2 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x025b, code lost:
    
        if (a.qcc.O(3000, r8) == r2) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x025f, code lost:
    
        r24 = r14;
        r14 = r10;
        r10 = r12;
        r12 = r24;
        r16 = r5;
        r5 = r1;
        r1 = r7;
        r7 = r4;
        r4 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0271, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0272, code lost:
    
        r2 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0276, code lost:
    
        r3 = a.j0g0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x027d, code lost:
    
        r0 = new a.g0g0(r0);
        r4 = r5;
        r5 = r14;
        r14 = r10;
        r11 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0117, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0118, code lost:
    
        r8 = r6;
        r6 = r2;
        r2 = r8;
        r8 = r4;
        r4 = r7;
        r10 = r14;
        r7 = r1;
        r1 = r5;
        r5 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0123, code lost:
    
        r12 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x015b, code lost:
    
        r8 = r6;
        r6 = r2;
        r2 = r8;
        r7 = r1;
        r5 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01aa, code lost:
    
        r2 = r6;
        r5 = r10;
        r6 = r11;
        r7 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b5, code lost:
    
        r26 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b9, code lost:
    
        r16 = r1;
        r11 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01bd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01bf, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c0, code lost:
    
        r11 = r2;
        r10 = r16;
        r16 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01c6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01c7, code lost:
    
        r26 = r10;
        r10 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01cc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:184:0x01d4, B:110:0x01e7], limit reached: 211 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:138:0x025f -> B:139:0x026b). Please report as a decompilation issue!!! */
    @Override // a.m06
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable f(a.km80 r27, a.yje r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ife0.f(a.km80, a.yje):java.io.Serializable");
    }
}

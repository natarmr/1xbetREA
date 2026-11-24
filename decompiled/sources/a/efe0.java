package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class efe0 extends m06 {
    public final btt0 b;
    public final xzp c;

    public efe0(xzp xzpVar, btt0 btt0Var) {
        btt0Var.getClass();
        this.b = btt0Var;
        this.c = xzpVar;
    }

    @Override // a.m06
    public final Object a(om80 om80Var) {
        int i;
        String str;
        Long l;
        om80Var.getClass();
        Integer num = om80Var.b;
        short s = om80Var.c.f7986a;
        Long l2 = null;
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        mm80 mm80VarA = om80Var.a(iIntValue);
        bp80 bp80Var = mm80VarA != null ? (bp80) mm80VarA.b : null;
        mm80 mm80VarA2 = om80Var.a(iIntValue);
        bp80 bp80Var2 = mm80VarA2 != null ? (bp80) mm80VarA2.c : null;
        if (bp80Var != null && (l = bp80Var.f2970a) != null) {
            l2 = l;
        } else if (bp80Var2 != null) {
            l2 = bp80Var2.f2970a;
        }
        if (bp80Var != null) {
            i = bp80Var.b + s;
        } else {
            i = bp80Var2 != null ? bp80Var2.b - s : 0;
        }
        if (bp80Var == null || (str = bp80Var.c) == null) {
            str = bp80Var2 != null ? bp80Var2.c : "";
        }
        return new bp80(i, l2, str);
    }

    @Override // a.m06
    public final lm80 b(Throwable th) {
        return new lm80(th);
    }

    @Override // a.m06
    public final boolean d(Object obj, Object obj2) {
        return Intrinsics.d((bp80) obj, (bp80) obj2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:52|297|53|54|290|55|(3:303|57|(1:63)(1:60))(1:63)|64|65|278|66|(15:69|274|70|71|282|125|126|226|(2:228|(2:231|232))|(1:251)(5:237|(1:242)(1:241)|243|(1:249)(1:248)|250)|252|(1:254)|(1:256)(1:257)|258|259)|266) */
    /* JADX WARN: Can't wrap try/catch for region: R(14:163|284|164|165|224|225|226|(2:228|(2:231|232))|(2:234|251)(1:251)|252|(1:254)|(1:256)(1:257)|258|259) */
    /* JADX WARN: Can't wrap try/catch for region: R(3:276|136|(1:138)(1:143)) */
    /* JADX WARN: Can't wrap try/catch for region: R(3:303|57|(1:63)(1:60)) */
    /* JADX WARN: Can't wrap try/catch for region: R(3:314|147|(1:152)) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:69|274|70|71|(11:282|125|126|226|(2:228|(2:231|232))|(1:251)(5:237|(1:242)(1:241)|243|(1:249)(1:248)|250)|252|(1:254)|(1:256)(1:257)|258|259)) */
    /* JADX WARN: Code duplicated, block: B:102:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:138:0x02a6 A[Catch: all -> 0x02b1, TRY_LEAVE, TryCatch #4 {all -> 0x02b1, blocks: (B:136:0x02a2, B:138:0x02a6), top: B:276:0x02a2 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x02c6 A[Catch: all -> 0x0358, TRY_ENTER, TRY_LEAVE, TryCatch #21 {all -> 0x0358, blocks: (B:134:0x028c, B:143:0x02c6), top: B:309:0x028c }] */
    /* JADX WARN: Code duplicated, block: B:152:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:163:0x031e  */
    /* JADX WARN: Code duplicated, block: B:185:0x0366 A[Catch: all -> 0x036f, TryCatch #1 {all -> 0x036f, blocks: (B:224:0x040a, B:183:0x0362, B:185:0x0366, B:191:0x0373, B:193:0x0377, B:196:0x037d, B:198:0x0381, B:200:0x0388, B:209:0x039d, B:213:0x03a7, B:206:0x0396), top: B:270:0x0362 }] */
    /* JADX WARN: Code duplicated, block: B:193:0x0377 A[Catch: all -> 0x036f, TryCatch #1 {all -> 0x036f, blocks: (B:224:0x040a, B:183:0x0362, B:185:0x0366, B:191:0x0373, B:193:0x0377, B:196:0x037d, B:198:0x0381, B:200:0x0388, B:209:0x039d, B:213:0x03a7, B:206:0x0396), top: B:270:0x0362 }] */
    /* JADX WARN: Code duplicated, block: B:203:0x0390  */
    /* JADX WARN: Code duplicated, block: B:228:0x041c  */
    /* JADX WARN: Code duplicated, block: B:231:0x0436  */
    /* JADX WARN: Code duplicated, block: B:234:0x043a  */
    /* JADX WARN: Code duplicated, block: B:251:0x0476  */
    /* JADX WARN: Code duplicated, block: B:254:0x047b  */
    /* JADX WARN: Code duplicated, block: B:256:0x047f  */
    /* JADX WARN: Code duplicated, block: B:257:0x0481  */
    /* JADX WARN: Code duplicated, block: B:264:0x049c  */
    /* JADX WARN: Code duplicated, block: B:266:0x04b4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:270:0x0362 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x02a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x0149 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x01c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x02d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x014e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0160  */
    /* JADX WARN: Code duplicated, block: B:69:0x0194  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:83:0x01cd A[Catch: all -> 0x01d8, TRY_LEAVE, TryCatch #20 {all -> 0x01d8, blocks: (B:81:0x01c9, B:83:0x01cd, B:97:0x01ee, B:99:0x01f5), top: B:307:0x01c9 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01de  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e4 A[Catch: all -> 0x0260, TryCatch #0 {all -> 0x0260, blocks: (B:90:0x01e0, B:92:0x01e4, B:95:0x01ea, B:108:0x020a, B:112:0x0215, B:105:0x0203), top: B:268:0x01e0 }] */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02b1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02b2, code lost:
    
        r13 = r11;
        r19 = r7;
        r20 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02bc, code lost:
    
        r7 = r4;
        r4 = r6;
        r24 = r9;
        r9 = r2;
        r2 = r5;
        r5 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02da, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02db, code lost:
    
        r13 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0339, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x036d, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x037f, code lost:
    
        if ((r0 instanceof a.zhi0) != false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0386, code lost:
    
        if (r0.f != false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0390, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0394, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x039a, code lost:
    
        if (a.hic.C(r0) == false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x039d, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x03a0, code lost:
    
        if (r2 > 3) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x03a4, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x03a7, code lost:
    
        r10 = new java.lang.StringBuilder();
        r12 = r20;
        r10.append(r12);
        r10.append(r2);
        r8 = r19;
        r10.append(r8);
        r10.append(r0);
        java.lang.System.out.println((java.lang.Object) r10.toString());
        r1.i = r11;
        r1.j = r9;
        r1.k = r7;
        r1.l = r15;
        r1.o = r13;
        r1.p = r5;
        r1.m = r4;
        r1.n = r2;
        r1.s = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03d8, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x03e1, code lost:
    
        if (a.qcc.O(3000, r7) == r3) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x03e5, code lost:
    
        r0 = r7;
        r7 = r4;
        r4 = r0;
        r0 = r2;
        r24 = r5;
        r5 = r9;
        r6 = r11;
        r11 = r10;
        r9 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x03fe, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0401, code lost:
    
        r1 = a.j0g0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0408, code lost:
    
        r0 = new a.g0g0(r0);
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0151, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0152, code lost:
    
        r24 = r15;
        r15 = r1;
        r1 = r4;
        r4 = r9;
        r9 = r24;
        r24 = r6;
        r6 = r2;
        r2 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01b0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b4, code lost:
    
        r4 = r6;
        r6 = r2;
        r2 = r4;
        r4 = r9;
        r9 = r15;
        r15 = r1;
        r1 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01bd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01be, code lost:
    
        r22 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c2, code lost:
    
        r22 = r4;
        r23 = r10;
     */
    /* JADX WARN: Path cross not found for [B:270:0x0362, B:190:0x0372], limit reached: 304 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x024f -> B:118:0x0256). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:218:0x03e5 -> B:219:0x03f1). Please report as a decompilation issue!!! */
    @Override // a.m06
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable f(a.km80 r28, a.yje r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.efe0.f(a.km80, a.yje):java.io.Serializable");
    }
}

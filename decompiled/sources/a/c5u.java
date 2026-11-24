package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class c5u extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public q5u j;
    public Throwable k;
    public long l;
    public long m;
    public long n;
    public int o;
    public int p;
    public int q;
    public byte r;
    public /* synthetic */ Object s;
    public final /* synthetic */ q5u t;
    public final /* synthetic */ long u;
    public bnn0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c5u(q5u q5uVar, long j, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.t = q5uVar;
        this.u = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                c5u c5uVar = new c5u(this.t, this.u, yjeVar, (byte) 0);
                c5uVar.s = obj;
                return c5uVar;
            default:
                c5u c5uVar2 = new c5u(this.t, this.u, yjeVar, (byte) 1);
                c5uVar2.s = obj;
                return c5uVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((c5u) create(kmqVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:133|249|134|(1:136)|237|137|(9:139|(5:251|142|(4:144|235|145|(2:147|264)(1:265))(2:151|266)|148|140)|263|154|226|155|(3:157|(5:160|161|246|162|158)|267)|172|221)(1:170)|167|171|172|221) */
    /* JADX WARN: Can't wrap try/catch for region: R(13:124|232|125|126|228|127|128|255|129|130|(11:133|249|134|(1:136)|237|137|(9:139|(5:251|142|(4:144|235|145|(2:147|264)(1:265))(2:151|266)|148|140)|263|154|226|155|(3:157|(5:160|161|246|162|158)|267)|172|221)(1:170)|167|171|172|221)|223|271) */
    /* JADX WARN: Can't wrap try/catch for region: R(4:144|235|145|(2:147|264)(1:265)) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:160|161|246|162|158) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:251|142|(4:144|235|145|(2:147|264)(1:265))(2:151|266)|148|140) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:36|230|37|38|90) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:139|(5:251|142|(4:144|235|145|(2:147|264)(1:265))(2:151|266)|148|140)|263|154|226|155|(3:157|(5:160|161|246|162|158)|267)|172|221) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:30|243|31|32|241|33|(1:35)(5:36|230|37|38|90)|92|269) */
    /* JADX WARN: Code duplicated, block: B:124:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:133:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:136:0x0311  */
    /* JADX WARN: Code duplicated, block: B:139:0x0316 A[Catch: all -> 0x03c9, TryCatch #6 {all -> 0x03c9, blocks: (B:137:0x0312, B:139:0x0316, B:140:0x031f), top: B:237:0x0312 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x0336  */
    /* JADX WARN: Code duplicated, block: B:147:0x0340 A[Catch: all -> 0x0349, TRY_LEAVE, TryCatch #5 {all -> 0x0349, blocks: (B:145:0x0338, B:147:0x0340), top: B:235:0x0338 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x0357  */
    /* JADX WARN: Code duplicated, block: B:157:0x036d A[Catch: all -> 0x03c2, TryCatch #0 {all -> 0x03c2, blocks: (B:155:0x0360, B:157:0x036d, B:158:0x037c, B:160:0x0382), top: B:226:0x0360 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x0382 A[Catch: all -> 0x03c2, TRY_LEAVE, TryCatch #0 {all -> 0x03c2, blocks: (B:155:0x0360, B:157:0x036d, B:158:0x037c, B:160:0x0382), top: B:226:0x0360 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:186:0x03f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:187:0x03f5 A[Catch: all -> 0x03d6, TryCatch #12 {all -> 0x03d6, blocks: (B:184:0x03ed, B:187:0x03f5, B:189:0x0401, B:193:0x040b, B:195:0x040f, B:200:0x0435, B:202:0x043e, B:204:0x0445, B:208:0x044f, B:210:0x0453, B:213:0x0471, B:214:0x0479, B:172:0x03d2, B:217:0x0486, B:218:0x048d, B:219:0x048e), top: B:248:0x03ed }] */
    /* JADX WARN: Code duplicated, block: B:189:0x0401 A[Catch: all -> 0x03d6, TryCatch #12 {all -> 0x03d6, blocks: (B:184:0x03ed, B:187:0x03f5, B:189:0x0401, B:193:0x040b, B:195:0x040f, B:200:0x0435, B:202:0x043e, B:204:0x0445, B:208:0x044f, B:210:0x0453, B:213:0x0471, B:214:0x0479, B:172:0x03d2, B:217:0x0486, B:218:0x048d, B:219:0x048e), top: B:248:0x03ed }] */
    /* JADX WARN: Code duplicated, block: B:191:0x0408  */
    /* JADX WARN: Code duplicated, block: B:192:0x040a  */
    /* JADX WARN: Code duplicated, block: B:195:0x040f A[Catch: all -> 0x03d6, TryCatch #12 {all -> 0x03d6, blocks: (B:184:0x03ed, B:187:0x03f5, B:189:0x0401, B:193:0x040b, B:195:0x040f, B:200:0x0435, B:202:0x043e, B:204:0x0445, B:208:0x044f, B:210:0x0453, B:213:0x0471, B:214:0x0479, B:172:0x03d2, B:217:0x0486, B:218:0x048d, B:219:0x048e), top: B:248:0x03ed }] */
    /* JADX WARN: Code duplicated, block: B:197:0x042c  */
    /* JADX WARN: Code duplicated, block: B:198:0x042e A[PHI: r4 r10
  0x042e: PHI (r4v14 int) = (r4v11 int), (r4v18 int) binds: [B:211:0x046e, B:196:0x042a] A[DONT_GENERATE, DONT_INLINE]
  0x042e: PHI (r10v4 int) = (r10v2 int), (r10v5 int) binds: [B:211:0x046e, B:196:0x042a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:200:0x0435 A[Catch: all -> 0x03d6, TryCatch #12 {all -> 0x03d6, blocks: (B:184:0x03ed, B:187:0x03f5, B:189:0x0401, B:193:0x040b, B:195:0x040f, B:200:0x0435, B:202:0x043e, B:204:0x0445, B:208:0x044f, B:210:0x0453, B:213:0x0471, B:214:0x0479, B:172:0x03d2, B:217:0x0486, B:218:0x048d, B:219:0x048e), top: B:248:0x03ed }] */
    /* JADX WARN: Code duplicated, block: B:202:0x043e A[Catch: all -> 0x03d6, TryCatch #12 {all -> 0x03d6, blocks: (B:184:0x03ed, B:187:0x03f5, B:189:0x0401, B:193:0x040b, B:195:0x040f, B:200:0x0435, B:202:0x043e, B:204:0x0445, B:208:0x044f, B:210:0x0453, B:213:0x0471, B:214:0x0479, B:172:0x03d2, B:217:0x0486, B:218:0x048d, B:219:0x048e), top: B:248:0x03ed }] */
    /* JADX WARN: Code duplicated, block: B:204:0x0445 A[Catch: all -> 0x03d6, TryCatch #12 {all -> 0x03d6, blocks: (B:184:0x03ed, B:187:0x03f5, B:189:0x0401, B:193:0x040b, B:195:0x040f, B:200:0x0435, B:202:0x043e, B:204:0x0445, B:208:0x044f, B:210:0x0453, B:213:0x0471, B:214:0x0479, B:172:0x03d2, B:217:0x0486, B:218:0x048d, B:219:0x048e), top: B:248:0x03ed }] */
    /* JADX WARN: Code duplicated, block: B:206:0x044c  */
    /* JADX WARN: Code duplicated, block: B:207:0x044e  */
    /* JADX WARN: Code duplicated, block: B:210:0x0453 A[Catch: all -> 0x03d6, TryCatch #12 {all -> 0x03d6, blocks: (B:184:0x03ed, B:187:0x03f5, B:189:0x0401, B:193:0x040b, B:195:0x040f, B:200:0x0435, B:202:0x043e, B:204:0x0445, B:208:0x044f, B:210:0x0453, B:213:0x0471, B:214:0x0479, B:172:0x03d2, B:217:0x0486, B:218:0x048d, B:219:0x048e), top: B:248:0x03ed }] */
    /* JADX WARN: Code duplicated, block: B:212:0x0470  */
    /* JADX WARN: Code duplicated, block: B:213:0x0471 A[Catch: all -> 0x03d6, TryCatch #12 {all -> 0x03d6, blocks: (B:184:0x03ed, B:187:0x03f5, B:189:0x0401, B:193:0x040b, B:195:0x040f, B:200:0x0435, B:202:0x043e, B:204:0x0445, B:208:0x044f, B:210:0x0453, B:213:0x0471, B:214:0x0479, B:172:0x03d2, B:217:0x0486, B:218:0x048d, B:219:0x048e), top: B:248:0x03ed }] */
    /* JADX WARN: Code duplicated, block: B:214:0x0479 A[Catch: all -> 0x03d6, TryCatch #12 {all -> 0x03d6, blocks: (B:184:0x03ed, B:187:0x03f5, B:189:0x0401, B:193:0x040b, B:195:0x040f, B:200:0x0435, B:202:0x043e, B:204:0x0445, B:208:0x044f, B:210:0x0453, B:213:0x0471, B:214:0x0479, B:172:0x03d2, B:217:0x0486, B:218:0x048d, B:219:0x048e), top: B:248:0x03ed }] */
    /* JADX WARN: Code duplicated, block: B:215:0x047f  */
    /* JADX WARN: Code duplicated, block: B:217:0x0486 A[Catch: all -> 0x03d6, TryCatch #12 {all -> 0x03d6, blocks: (B:184:0x03ed, B:187:0x03f5, B:189:0x0401, B:193:0x040b, B:195:0x040f, B:200:0x0435, B:202:0x043e, B:204:0x0445, B:208:0x044f, B:210:0x0453, B:213:0x0471, B:214:0x0479, B:172:0x03d2, B:217:0x0486, B:218:0x048d, B:219:0x048e), top: B:248:0x03ed }] */
    /* JADX WARN: Code duplicated, block: B:219:0x048e A[Catch: all -> 0x03d6, TRY_LEAVE, TryCatch #12 {all -> 0x03d6, blocks: (B:184:0x03ed, B:187:0x03f5, B:189:0x0401, B:193:0x040b, B:195:0x040f, B:200:0x0435, B:202:0x043e, B:204:0x0445, B:208:0x044f, B:210:0x0453, B:213:0x0471, B:214:0x0479, B:172:0x03d2, B:217:0x0486, B:218:0x048d, B:219:0x048e), top: B:248:0x03ed }] */
    /* JADX WARN: Code duplicated, block: B:251:0x0325 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x0343 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:47:0x0118 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x011a A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #17 {all -> 0x005d, blocks: (B:13:0x0047, B:38:0x0102, B:45:0x0112, B:48:0x011a, B:18:0x0077, B:27:0x00bd), top: B:257:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0124  */
    /* JADX WARN: Code duplicated, block: B:53:0x012d  */
    /* JADX WARN: Code duplicated, block: B:54:0x012f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0157  */
    /* JADX WARN: Code duplicated, block: B:66:0x0164  */
    /* JADX WARN: Code duplicated, block: B:70:0x0175 A[Catch: all -> 0x0172, TryCatch #10 {all -> 0x0172, blocks: (B:67:0x0168, B:70:0x0175, B:72:0x017d, B:76:0x0187, B:78:0x018b, B:82:0x01b0, B:83:0x01bf, B:86:0x01cd, B:87:0x01d4, B:88:0x01d5), top: B:245:0x0168 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x017d A[Catch: all -> 0x0172, TryCatch #10 {all -> 0x0172, blocks: (B:67:0x0168, B:70:0x0175, B:72:0x017d, B:76:0x0187, B:78:0x018b, B:82:0x01b0, B:83:0x01bf, B:86:0x01cd, B:87:0x01d4, B:88:0x01d5), top: B:245:0x0168 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0184  */
    /* JADX WARN: Code duplicated, block: B:75:0x0186  */
    /* JADX WARN: Code duplicated, block: B:78:0x018b A[Catch: all -> 0x0172, TryCatch #10 {all -> 0x0172, blocks: (B:67:0x0168, B:70:0x0175, B:72:0x017d, B:76:0x0187, B:78:0x018b, B:82:0x01b0, B:83:0x01bf, B:86:0x01cd, B:87:0x01d4, B:88:0x01d5), top: B:245:0x0168 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b0 A[Catch: all -> 0x0172, TryCatch #10 {all -> 0x0172, blocks: (B:67:0x0168, B:70:0x0175, B:72:0x017d, B:76:0x0187, B:78:0x018b, B:82:0x01b0, B:83:0x01bf, B:86:0x01cd, B:87:0x01d4, B:88:0x01d5), top: B:245:0x0168 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01bf A[Catch: all -> 0x0172, TryCatch #10 {all -> 0x0172, blocks: (B:67:0x0168, B:70:0x0175, B:72:0x017d, B:76:0x0187, B:78:0x018b, B:82:0x01b0, B:83:0x01bf, B:86:0x01cd, B:87:0x01d4, B:88:0x01d5), top: B:245:0x0168 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01cd A[Catch: all -> 0x0172, TryCatch #10 {all -> 0x0172, blocks: (B:67:0x0168, B:70:0x0175, B:72:0x017d, B:76:0x0187, B:78:0x018b, B:82:0x01b0, B:83:0x01bf, B:86:0x01cd, B:87:0x01d4, B:88:0x01d5), top: B:245:0x0168 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01d5 A[Catch: all -> 0x0172, TRY_LEAVE, TryCatch #10 {all -> 0x0172, blocks: (B:67:0x0168, B:70:0x0175, B:72:0x017d, B:76:0x0187, B:78:0x018b, B:82:0x01b0, B:83:0x01bf, B:86:0x01cd, B:87:0x01d4, B:88:0x01d5), top: B:245:0x0168 }] */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0349, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x034a, code lost:
    
        r5 = r0;
        r0 = r13;
        r9 = r15;
        r15 = r14;
        r13 = r7;
        r6 = r11;
        r12 = r9;
        r11 = r16;
        r8 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x035a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x035b, code lost:
    
        r16 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x03b5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03b6, code lost:
    
        r5 = r0;
        r6 = r11;
        r0 = r13;
        r12 = r15;
        r11 = r16;
        r8 = r21;
        r15 = r14;
        r13 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x03c2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x03c3, code lost:
    
        r30 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x03c9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x03ca, code lost:
    
        r16 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03d9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x03da, code lost:
    
        r16 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x03dd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x03de, code lost:
    
        r2 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03e0, code lost:
    
        r5 = r0;
        r0 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03e4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03e5, code lost:
    
        r19 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03e8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03e9, code lost:
    
        r2 = r4;
        r19 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x04ab, code lost:
    
        if (r3.a(r0, r37) == r2) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0107, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0109, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010a, code lost:
    
        r2 = r10;
        r4 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010f, code lost:
    
        r2 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01f3, code lost:
    
        if (r15.a(r2, r37) == r10) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v23, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:201:0x043c -> B:199:0x0430). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0157 -> B:62:0x0158). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0168 -> B:63:0x015b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x01ad -> B:62:0x0158). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x01b0 -> B:63:0x015b). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r38) {
        /*
            Method dump skipped, instruction units count: 1208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.c5u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

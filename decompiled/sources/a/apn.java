package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class apn extends bnn0 implements Function2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ long B;
    public final /* synthetic */ String Y;
    public long i;
    public long j;
    public long k;
    public long l;
    public int m;
    public int n;
    public int o;
    public int p;
    public cu q;
    public String r;
    public Throwable s;
    public boolean t;
    public boolean u;
    public byte v;
    public final /* synthetic */ cu w;
    public final /* synthetic */ long x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apn(cu cuVar, long j, boolean z, int i, boolean z2, long j2, String str, yje yjeVar) {
        super(2, yjeVar);
        this.w = cuVar;
        this.x = j;
        this.y = z;
        this.z = i;
        this.A = z2;
        this.B = j2;
        this.Y = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new apn(this.w, this.x, this.y, this.z, this.A, this.B, this.Y, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((apn) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(32:124|18|19|118|20|126|21|22|23|24|25|26|27|28|120|29|133|30|(1:32)(1:37)|33|39|40|122|41|42|116|43|44|129|45|46|(1:49)) */
    /* JADX WARN: Can't wrap try/catch for region: R(4:(1:(1:(3:7|107|108)(2:8|9))(2:10|135))(4:11|131|12|13)|128|50|(3:(1:53)(1:56)|57|58)(2:59|60)) */
    /* JADX WARN: Code duplicated, block: B:100:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:103:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:106:0x0311  */
    /* JADX WARN: Code duplicated, block: B:109:0x0329  */
    /* JADX WARN: Code duplicated, block: B:110:0x034a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0369  */
    /* JADX WARN: Code duplicated, block: B:113:0x036d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0375  */
    /* JADX WARN: Code duplicated, block: B:124:0x0113 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0149  */
    /* JADX WARN: Code duplicated, block: B:37:0x015b  */
    /* JADX WARN: Code duplicated, block: B:49:0x019e  */
    /* JADX WARN: Code duplicated, block: B:52:0x01b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x01ba A[Catch: all -> 0x01bd, TryCatch #6 {all -> 0x01bd, blocks: (B:50:0x01ac, B:53:0x01ba, B:57:0x01d0, B:56:0x01ce, B:59:0x01d5, B:60:0x01dc), top: B:128:0x01ac }] */
    /* JADX WARN: Code duplicated, block: B:56:0x01ce A[Catch: all -> 0x01bd, TryCatch #6 {all -> 0x01bd, blocks: (B:50:0x01ac, B:53:0x01ba, B:57:0x01d0, B:56:0x01ce, B:59:0x01d5, B:60:0x01dc), top: B:128:0x01ac }] */
    /* JADX WARN: Code duplicated, block: B:59:0x01d5 A[Catch: all -> 0x01bd, TryCatch #6 {all -> 0x01bd, blocks: (B:50:0x01ac, B:53:0x01ba, B:57:0x01d0, B:56:0x01ce, B:59:0x01d5, B:60:0x01dc), top: B:128:0x01ac }] */
    /* JADX WARN: Code duplicated, block: B:81:0x022a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x022c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0241  */
    /* JADX WARN: Code duplicated, block: B:85:0x024c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0250  */
    /* JADX WARN: Code duplicated, block: B:89:0x0259  */
    /* JADX WARN: Code duplicated, block: B:92:0x0288  */
    /* JADX WARN: Code duplicated, block: B:94:0x029f  */
    /* JADX WARN: Code duplicated, block: B:95:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:97:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:99:0x02db  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x014e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x014f, code lost:
    
        r33 = r2;
        r6 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0157, code lost:
    
        r3 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01bd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01be, code lost:
    
        r15 = r3;
        r3 = r0;
        r0 = r14;
        r13 = r4;
        r4 = r15;
        r15 = r7;
        r5 = r17;
        r7 = r18;
        r25 = r19;
        r27 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01dd, code lost:
    
        r25 = r3;
        r4 = r19;
        r27 = r22;
        r3 = r0;
        r0 = r14;
        r13 = r11;
        r11 = r7;
        r8 = r9;
        r7 = r18;
        r9 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01ed, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ee, code lost:
    
        r6 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01f1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01f2, code lost:
    
        r33 = r2;
        r6 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01f8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01f9, code lost:
    
        r22 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01fd, code lost:
    
        r6 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ff, code lost:
    
        r3 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0202, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0203, code lost:
    
        r18 = r3;
        r19 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x020a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x020b, code lost:
    
        r6 = r2;
        r18 = r3;
        r19 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0211, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0212, code lost:
    
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0219, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x021a, code lost:
    
        r18 = r3;
        r19 = r4;
        r33 = r6;
        r3 = r20;
        r6 = r2;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x0311 -> B:107:0x0322). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0329 -> B:108:0x0325). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x034a -> B:108:0x0325). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x022c -> B:17:0x0111). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x029f -> B:17:0x0111). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.apn.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class bpn extends bnn0 implements Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ long B;
    public final /* synthetic */ String Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ long f1;
    public final /* synthetic */ byte g1;
    public final /* synthetic */ boolean h1;
    public long i;
    public long j;
    public long k;
    public long l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public cu s;
    public String t;
    public Throwable u;
    public boolean v;
    public boolean w;
    public byte x;
    public final /* synthetic */ int y;
    public final /* synthetic */ cu z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public bpn(int i, cu cuVar, int i2, long j, String str, boolean z, long j2, int i3, boolean z2, yje yjeVar) {
        super(2, yjeVar);
        this.y = i;
        this.z = cuVar;
        this.A = i2;
        this.B = j;
        this.Y = str;
        this.Z = z;
        this.f1 = j2;
        this.g1 = i3;
        this.h1 = z2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new bpn(this.y, this.z, this.A, this.B, this.Y, this.Z, this.f1, this.g1, this.h1, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((bpn) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(28:126|20|21|120|22|(1:24)(1:28)|25|118|30|31|135|32|33|128|34|35|122|36|37|137|38|132|39|40|124|41|42|(2:44|108)(1:45)) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:0|2|(1:(1:(1:(3:7|110|(28:126|20|21|120|22|(1:24)(1:28)|25|118|30|31|135|32|33|128|34|35|122|36|37|137|38|132|39|40|124|41|42|(2:44|108)(1:45))(2:113|(2:115|116)(1:117)))(2:8|9))(4:10|11|95|(28:126|20|21|120|22|(1:24)(1:28)|25|118|30|31|135|32|33|128|34|35|122|36|37|137|38|132|39|40|124|41|42|(2:44|108)(1:45))(2:113|(2:115|116)(1:117))))(4:12|130|13|14))(2:18|(28:126|20|21|120|22|(1:24)(1:28)|25|118|30|31|135|32|33|128|34|35|122|36|37|137|38|132|39|40|124|41|42|(2:44|108)(1:45))(2:113|(2:115|116)(1:117)))|134|46|(2:48|(4:(1:51)(1:55)|52|56|57)(2:58|59))(2:60|61)) */
    /* JADX WARN: Code duplicated, block: B:100:0x0346  */
    /* JADX WARN: Code duplicated, block: B:102:0x034f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0351  */
    /* JADX WARN: Code duplicated, block: B:106:0x0356  */
    /* JADX WARN: Code duplicated, block: B:109:0x038d  */
    /* JADX WARN: Code duplicated, block: B:111:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:112:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:113:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:115:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:117:0x0403  */
    /* JADX WARN: Code duplicated, block: B:126:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x017c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0188  */
    /* JADX WARN: Code duplicated, block: B:44:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:45:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:48:0x01eb A[Catch: all -> 0x01fc, TryCatch #8 {all -> 0x01fc, blocks: (B:46:0x01e5, B:48:0x01eb, B:51:0x01f7, B:56:0x0217, B:55:0x0214, B:58:0x0228, B:59:0x022f, B:60:0x0230, B:61:0x0236), top: B:134:0x01e5 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x01f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x01f7 A[Catch: all -> 0x01fc, TryCatch #8 {all -> 0x01fc, blocks: (B:46:0x01e5, B:48:0x01eb, B:51:0x01f7, B:56:0x0217, B:55:0x0214, B:58:0x0228, B:59:0x022f, B:60:0x0230, B:61:0x0236), top: B:134:0x01e5 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0214 A[Catch: all -> 0x01fc, TryCatch #8 {all -> 0x01fc, blocks: (B:46:0x01e5, B:48:0x01eb, B:51:0x01f7, B:56:0x0217, B:55:0x0214, B:58:0x0228, B:59:0x022f, B:60:0x0230, B:61:0x0236), top: B:134:0x01e5 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0228 A[Catch: all -> 0x01fc, TryCatch #8 {all -> 0x01fc, blocks: (B:46:0x01e5, B:48:0x01eb, B:51:0x01f7, B:56:0x0217, B:55:0x0214, B:58:0x0228, B:59:0x022f, B:60:0x0230, B:61:0x0236), top: B:134:0x01e5 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0230 A[Catch: all -> 0x01fc, TryCatch #8 {all -> 0x01fc, blocks: (B:46:0x01e5, B:48:0x01eb, B:51:0x01f7, B:56:0x0217, B:55:0x0214, B:58:0x0228, B:59:0x022f, B:60:0x0230, B:61:0x0236), top: B:134:0x01e5 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0281 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0283  */
    /* JADX WARN: Code duplicated, block: B:85:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:87:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:88:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:91:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:93:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:94:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:96:0x0304  */
    /* JADX WARN: Code duplicated, block: B:98:0x0331  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0181, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0182, code lost:
    
        r25 = r2;
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01fc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01fd, code lost:
    
        r10 = r12;
        r12 = r13;
        r13 = r14;
        r14 = r9;
        r45 = r4;
        r41 = r5;
        r4 = r17;
        r39 = r26;
        r17 = r2;
        r5 = r3;
        r2 = r8;
        r8 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0237, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0238, code lost:
    
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x023b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x023c, code lost:
    
        r19 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x023f, code lost:
    
        r3 = r0;
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0242, code lost:
    
        r41 = r12;
        r0 = r21;
        r2 = r25;
        r39 = r26;
        r12 = r4;
        r4 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x024e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x024f, code lost:
    
        r19 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0251, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0255, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0256, code lost:
    
        r45 = r45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0259, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x025a, code lost:
    
        r45 = r45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x025d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x025e, code lost:
    
        r26 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0261, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0262, code lost:
    
        r25 = r2;
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0267, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0268, code lost:
    
        r45 = r19;
        r19 = r4;
        r4 = r45;
        r45 = r14;
        r10 = r21;
        r14 = r22;
        r11 = r24;
        r12 = r28;
        r21 = r3;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x038d -> B:110:0x03a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0283 -> B:19:0x013b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x02ff -> B:19:0x013b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x032d -> B:19:0x013b). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.bpn.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class kgu extends bnn0 implements Function2 {
    public final /* synthetic */ long A;
    public final /* synthetic */ List B;
    public final /* synthetic */ List Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ String f1;
    public final /* synthetic */ String g1;
    public final /* synthetic */ boolean h1;
    public int i;
    public final /* synthetic */ int i1;
    public int j;
    public final /* synthetic */ sff0 j1;
    public int k;
    public long l;
    public long m;
    public long n;
    public Object o;
    public List p;
    public String q;
    public String r;
    public String s;
    public sff0 t;
    public dgu u;
    public kgu v;
    public boolean w;
    public byte x;
    public /* synthetic */ int y;
    public final /* synthetic */ dgu z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kgu(dgu dguVar, long j, List list, List list2, String str, String str2, String str3, boolean z, int i, sff0 sff0Var, yje yjeVar) {
        super(2, yjeVar);
        this.z = dguVar;
        this.A = j;
        this.B = list;
        this.Y = list2;
        this.Z = str;
        this.f1 = str2;
        this.g1 = str3;
        this.h1 = z;
        this.i1 = i;
        this.j1 = sff0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        kgu kguVar = new kgu(this.z, this.A, this.B, this.Y, this.Z, this.f1, this.g1, this.h1, this.i1, this.j1, yjeVar);
        kguVar.y = ((Number) obj).intValue();
        return kguVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((kgu) create(Integer.valueOf(((Number) obj).intValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(1:(1:(1:(1:(2:8|9)(2:10|170))(2:11|151))(42:12|207|13|14|134|197|27|211|28|29|30|31|32|33|187|34|35|213|36|37|199|38|39|177|40|41|183|42|43|203|44|45|173|46|47|205|48|49|193|50|51|(2:53|169)(1:54)))(4:17|171|18|19))(40:22|(1:24)(1:25)|26|197|27|211|28|29|30|31|32|33|187|34|35|213|36|37|199|38|39|177|40|41|183|42|43|203|44|45|173|46|47|205|48|49|193|50|51|(2:53|169)(1:54))|201|55|56|181|145|146|(2:148|(1:221)(1:218))(1:217)|(1:(1:180))) */
    /* JADX WARN: Can't wrap try/catch for region: R(41:207|13|14|134|197|27|211|28|29|30|31|32|33|187|34|35|213|36|37|199|38|39|177|40|41|183|42|43|203|44|45|173|46|47|205|48|49|193|50|51|(2:53|169)(1:54)) */
    /* JADX WARN: Can't wrap try/catch for region: R(42:12|207|13|14|134|197|27|211|28|29|30|31|32|33|187|34|35|213|36|37|199|38|39|177|40|41|183|42|43|203|44|45|173|46|47|205|48|49|193|50|51|(2:53|169)(1:54)) */
    /* JADX WARN: Code duplicated, block: B:102:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:106:0x02f2 A[Catch: all -> 0x0413, TryCatch #12 {all -> 0x0413, blocks: (B:104:0x02ee, B:106:0x02f2, B:109:0x02f8, B:118:0x0311), top: B:195:0x02ee }] */
    /* JADX WARN: Code duplicated, block: B:148:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:167:0x042f  */
    /* JADX WARN: Code duplicated, block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:93:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:96:0x02d7 A[Catch: all -> 0x02e1, TRY_LEAVE, TryCatch #2 {all -> 0x02e1, blocks: (B:94:0x02d3, B:96:0x02d7, B:111:0x02fc, B:113:0x0303), top: B:175:0x02d3 }] */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01d6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01d7, code lost:
    
        r17 = r1;
        r38 = r3;
        r16 = r4;
        r33 = r5;
        r19 = r10;
        r1 = r13;
        r4 = r15;
        r13 = r23;
        r10 = r24;
        r5 = r27;
        r15 = r30;
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01ec, code lost:
    
        r2 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01f0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01f1, code lost:
    
        r2 = r4;
        r30 = r30;
        r9 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01f7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01f8, code lost:
    
        r21 = r3;
        r2 = r4;
        r20 = r2;
        r22 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0205, code lost:
    
        r9 = r1;
        r23 = r6;
        r6 = r10;
        r10 = r13;
        r1 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x020c, code lost:
    
        r17 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x020e, code lost:
    
        r11 = r3;
        r1 = r19;
        r16 = r20;
        r38 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0215, code lost:
    
        r4 = r23;
        r33 = r24;
        r13 = r29;
        r15 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x021d, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0220, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0221, code lost:
    
        r22 = r2;
        r20 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0236, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0237, code lost:
    
        r20 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0248, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0249, code lost:
    
        r20 = r2;
        r2 = r4;
        r19 = r5;
        r3 = r7;
        r5 = r9;
        r7 = r11;
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0259, code lost:
    
        r11 = r3;
        r1 = r19;
        r16 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0261, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0262, code lost:
    
        r24 = r2;
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0275, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0276, code lost:
    
        r31 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x027b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x027c, code lost:
    
        r30 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0280, code lost:
    
        r31 = r3;
        r2 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x028d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x028e, code lost:
    
        r29 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0293, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0294, code lost:
    
        r29 = r2;
        r31 = r3;
        r19 = r5;
        r3 = r7;
        r5 = r9;
        r7 = r11;
        r8 = r12;
        r20 = r23;
        r2 = r28;
        r9 = r1;
        r23 = r6;
        r6 = r10;
        r10 = r13;
        r11 = r3;
        r1 = r19;
        r16 = r20;
        r4 = r23;
        r33 = r24;
        r13 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02ba, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02bb, code lost:
    
        r21 = r38;
        r29 = r2;
        r31 = r3;
        r30 = r15;
        r20 = r23;
        r2 = r28;
     */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v7, types: [a.dgu, a.kgu, a.sff0, java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:133:0x0388 -> B:134:0x039c). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kgu.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

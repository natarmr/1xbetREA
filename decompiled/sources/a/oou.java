package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class oou extends bnn0 implements Function2 {
    public Object i;
    public pou j;
    public oou k;
    public long l;
    public long m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public byte s;
    public /* synthetic */ Object t;
    public final /* synthetic */ short u;
    public final /* synthetic */ pou v;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ String y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
    public oou(long j, pou pouVar, int i, int i2, String str, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.u = (int) j;
        this.v = pouVar;
        this.w = i;
        this.x = i2;
        this.y = str;
        this.z = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        oou oouVar = new oou(this.u, this.v, this.w, this.x, this.y, this.z, yjeVar);
        oouVar.t = obj;
        return oouVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((oou) create((xe60) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:126|13|14|15|84|130|28|29|124|30|31|122|32|(2:34|111)(1:35)) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:12|126|13|14|15|84|130|28|29|124|30|31|122|32|(2:34|111)(1:35)) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(1:(1:(1:(1:(2:8|9)(2:10|112))(2:11|98))(15:12|126|13|14|15|84|130|28|29|124|30|31|122|32|(2:34|111)(1:35)))(4:18|114|19|20))(12:23|(1:25)(1:26)|27|130|28|29|124|30|31|122|32|(2:34|111)(1:35))|128|36|37|(4:132|92|93|(2:95|(1:138)(1:135))(1:134))|(1:(0))) */
    /* JADX WARN: Code duplicated, block: B:109:0x0224  */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:47:0x0127  */
    /* JADX WARN: Code duplicated, block: B:50:0x012d A[Catch: all -> 0x005b, TRY_LEAVE, TryCatch #7 {all -> 0x005b, blocks: (B:13:0x004a, B:48:0x0129, B:50:0x012d, B:62:0x0149, B:64:0x0150), top: B:126:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0137  */
    /* JADX WARN: Code duplicated, block: B:57:0x013f A[Catch: all -> 0x0212, TryCatch #3 {all -> 0x0212, blocks: (B:55:0x013b, B:57:0x013f, B:60:0x0145, B:70:0x0160), top: B:118:0x013b }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01f4  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fe, code lost:
    
        r23 = r10;
        r10 = r2;
        r2 = r3;
        r3 = r4;
        r5 = r6;
        r6 = r9;
        r9 = r11;
        r11 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0109, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010a, code lost:
    
        r6 = r2;
        r5 = r4;
        r2 = r11;
        r11 = r1;
        r1 = r9;
        r9 = r26;
        r13 = r3;
        r3 = r12;
        r12 = r14;
        r14 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x011a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011b, code lost:
    
        r14 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011e, code lost:
    
        r26 = r12;
        r21 = r13;
        r12 = r19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v8, types: [long] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23, types: [long] */
    /* JADX WARN: Type inference failed for: r3v3, types: [long] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [long] */
    /* JADX WARN: Type inference failed for: r4v7, types: [long] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x01bf -> B:15:0x0058). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.oou.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class x4j extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public vne j;
    public kki k;
    public int l;
    public int m;
    public long n;
    public byte o;
    public /* synthetic */ Object p;
    public final /* synthetic */ kki q;
    public final /* synthetic */ long r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x4j(kki kkiVar, long j, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.q = kkiVar;
        this.r = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                x4j x4jVar = new x4j(this.q, this.r, yjeVar, (byte) 0);
                x4jVar.p = obj;
                return x4jVar;
            case 1:
                x4j x4jVar2 = new x4j(this.q, this.r, yjeVar, (byte) 1);
                x4jVar2.p = obj;
                return x4jVar2;
            default:
                x4j x4jVar3 = new x4j(this.q, this.r, yjeVar, (byte) 2);
                x4jVar3.p = obj;
                return x4jVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((x4j) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:8|56|181|16|(1:19)|54|192) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:66|67|116|185|75|(1:78)|114|194) */
    /* JADX WARN: Code duplicated, block: B:102:0x019c  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:137:0x0250  */
    /* JADX WARN: Code duplicated, block: B:148:0x0274  */
    /* JADX WARN: Code duplicated, block: B:161:0x028f  */
    /* JADX WARN: Code duplicated, block: B:163:0x0293  */
    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:78:0x015d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0181  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        r12 = r9;
        r8 = r7;
        r7 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
    
        r3 = r11;
        r16 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
    
        if ((r0 instanceof a.zhi0) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a2, code lost:
    
        if (r3.f != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a9, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ab, code lost:
    
        r3 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b2, code lost:
    
        if (a.hic.C(r0) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b5, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b7, code lost:
    
        if (r7 > r6) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bc, code lost:
    
        java.lang.System.out.println((java.lang.Object) a.b1j.g(r7, "error (", "): ", r0));
        r1.p = null;
        r1.j = r2;
        r1.k = r12;
        r1.l = r10;
        r1.n = r8;
        r1.m = r7;
        r1.o = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00db, code lost:
    
        if (a.qcc.O(3000, r1) != r15) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00df, code lost:
    
        r0 = r7;
        r7 = r8;
        r9 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e9, code lost:
    
        r1 = a.j0g0.b;
        r14 = new a.g0g0(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x016b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x016c, code lost:
    
        r9 = r6;
        r6 = r7;
        r7 = r8;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x01d3 -> B:67:0x011c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:174:0x02c5 -> B:189:0x0237). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00df -> B:56:0x00e3). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.x4j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

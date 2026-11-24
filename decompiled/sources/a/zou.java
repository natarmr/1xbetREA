package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class zou extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public vne j;
    public edu k;
    public int l;
    public int m;
    public long n;
    public byte o;
    public /* synthetic */ Object p;
    public final /* synthetic */ edu q;
    public final /* synthetic */ long r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zou(edu eduVar, long j, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.q = eduVar;
        this.r = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                zou zouVar = new zou(this.q, this.r, yjeVar, (byte) 0);
                zouVar.p = obj;
                return zouVar;
            default:
                zou zouVar2 = new zou(this.q, this.r, yjeVar, (byte) 1);
                zouVar2.p = obj;
                return zouVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((zou) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:8|57|128|16|(1:19)|55|131) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:67|68|117|122|76|(1:79)|115|133) */
    /* JADX WARN: Code duplicated, block: B:104:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:19:0x0071  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    /* JADX WARN: Code duplicated, block: B:44:0x00af  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:79:0x0172  */
    /* JADX WARN: Code duplicated, block: B:91:0x0198  */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ac, code lost:
    
        if (r12.f != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01b3, code lost:
    
        r12 = 1;
        r16 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b7, code lost:
    
        r12 = 1;
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01bf, code lost:
    
        if (a.hic.C(r0) == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c2, code lost:
    
        r6 = r6 + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c4, code lost:
    
        if (r6 > 3) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01c9, code lost:
    
        java.lang.System.out.println((java.lang.Object) a.b1j.g(r6, "error (", r4, r0));
        r1.p = null;
        r1.j = r9;
        r1.k = r10;
        r1.l = r11;
        r1.n = r7;
        r1.m = r6;
        r1.o = 2;
        r15 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01e7, code lost:
    
        if (a.qcc.O(3000, r1) != r2) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01eb, code lost:
    
        r17 = r7;
        r7 = r6;
        r6 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01f4, code lost:
    
        r1 = a.j0g0.b;
        r14 = new a.g0g0(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        r12 = r9;
        r8 = r7;
        r7 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0180, code lost:
    
        r9 = r6;
        r6 = r7;
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0187, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0196, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a5, code lost:
    
        if ((r0 instanceof a.zhi0) != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01a7, code lost:
    
        r12 = r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x01eb -> B:68:0x0125). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00e5 -> B:57:0x00e9). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zou.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

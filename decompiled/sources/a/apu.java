package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class apu extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public boolean j;
    public long k;
    public int l;
    public byte m;
    public /* synthetic */ Object n;
    public final /* synthetic */ long o;
    public int p;
    public Object q;
    public Object r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apu(wdu wduVar, long j, int i, yje yjeVar) {
        super(2, yjeVar);
        this.s = wduVar;
        this.o = j;
        this.p = i;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.s;
        switch (b) {
            case 0:
                apu apuVar = new apu(this.o, yjeVar, (edu) obj2);
                apuVar.n = obj;
                return apuVar;
            default:
                apu apuVar2 = new apu((wdu) obj2, this.o, this.p, yjeVar);
                apuVar2.n = obj;
                return apuVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((apu) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((apu) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:39|88|93|47|(1:50)|86|100) */
    /* JADX WARN: Code duplicated, block: B:29:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:50:0x0150  */
    /* JADX WARN: Code duplicated, block: B:62:0x017c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0197  */
    /* JADX WARN: Code duplicated, block: B:76:0x0199  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d1, code lost:
    
        if (r1.a(r0, r19) == r10) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0163, code lost:
    
        r16 = r2;
        r2 = r1;
        r1 = r8;
        r8 = r13;
        r12 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x016b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x017a, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0189, code lost:
    
        if ((r0 instanceof a.zhi0) != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018b, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0190, code lost:
    
        if (r3.f != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0197, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0199, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x019f, code lost:
    
        if (a.hic.C(r0) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a2, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a3, code lost:
    
        if (r1 > r7) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a8, code lost:
    
        java.lang.System.out.println((java.lang.Object) a.b1j.g(r1, "error (", "): ", r0));
        r19.n = null;
        r19.q = r2;
        r19.r = r14;
        r19.l = r8;
        r19.k = r12;
        r19.j = r11;
        r19.p = r1;
        r19.m = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01cb, code lost:
    
        if (a.qcc.O(3000, r19) != r10) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01cf, code lost:
    
        r0 = r8;
        r8 = r1;
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d8, code lost:
    
        r1 = a.j0g0.b;
        r9 = new a.g0g0(r0);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x01cf -> B:88:0x01d2). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.apu.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apu(long j, yje yjeVar, edu eduVar) {
        super(2, yjeVar);
        this.s = eduVar;
        this.o = j;
    }
}

package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class m5v extends bnn0 implements Function2 {
    public kmq i;
    public abu j;
    public String k;
    public qmu0 l;
    public int m;
    public int n;
    public boolean o;
    public byte p;
    public /* synthetic */ Object q;
    public final /* synthetic */ abu r;
    public final /* synthetic */ qmu0 s;
    public final /* synthetic */ String t;
    public final /* synthetic */ boolean u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5v(abu abuVar, qmu0 qmu0Var, String str, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.r = abuVar;
        this.s = qmu0Var;
        this.t = str;
        this.u = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        m5v m5vVar = new m5v(this.r, this.s, this.t, this.u, yjeVar);
        m5vVar.q = obj;
        return m5vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m5v) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:10|61|79|17|18|83|19|(8:22|23|63|(1:65)|66|(1:68)(2:70|(1:72))|69|73)|75) */
    /* JADX WARN: Code duplicated, block: B:22:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:65:0x0137  */
    /* JADX WARN: Code duplicated, block: B:68:0x013c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0140  */
    /* JADX WARN: Code duplicated, block: B:72:0x0144  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00af, code lost:
    
        r1 = r14;
        r14 = r2;
        r2 = r1;
        r1 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b5, code lost:
    
        r13 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x015d, code lost:
    
        if (r6.a(r0, r18) == r7) goto L75;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0120 -> B:61:0x0125). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.m5v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

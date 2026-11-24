package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class lqs extends bnn0 implements Function2 {
    public long i;
    public int j;
    public byte k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ffd m;
    public final /* synthetic */ adw n;
    public final /* synthetic */ y2x o;
    public final /* synthetic */ djx p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqs(ffd ffdVar, adw adwVar, y2x y2xVar, djx djxVar, yje yjeVar) {
        super(2, yjeVar);
        this.m = ffdVar;
        this.n = adwVar;
        this.o = y2xVar;
        this.p = djxVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        lqs lqsVar = new lqs(this.m, this.n, this.o, this.p, yjeVar);
        lqsVar.l = obj;
        return lqsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((lqs) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0089  */
    /* JADX WARN: Code duplicated, block: B:29:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x008e  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cf  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cc, code lost:
    
        if (r2.a(r4, r19) == r3) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e4, code lost:
    
        if (r2.a(r4, r19) == r3) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0117, code lost:
    
        if (a.qcc.O(r5, r19) == r3) goto L51;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0117 -> B:52:0x011a). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.lqs.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

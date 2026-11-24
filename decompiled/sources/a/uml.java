package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class uml extends bnn0 implements Function2 {
    public int i;
    public int j;
    public int k;
    public byte l;
    public final /* synthetic */ lml m;
    public final /* synthetic */ int n;
    public final /* synthetic */ float o;
    public final /* synthetic */ pzh p;
    public final /* synthetic */ float q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uml(lml lmlVar, int i, float f, pzh pzhVar, float f2, yje yjeVar) {
        super(2, yjeVar);
        this.m = lmlVar;
        this.n = i;
        this.o = f;
        this.p = pzhVar;
        this.q = f2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new uml(this.m, this.n, this.o, this.p, this.q, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((uml) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0081  */
    /* JADX WARN: Code duplicated, block: B:23:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:26:0x00db  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0075, code lost:
    
        if (a.bww.x(r14, r15, r7, r19) == r5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00be, code lost:
    
        if (a.bww.x(r7, r15, r2, r19) == r5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0116, code lost:
    
        if (a.bww.x(r7, r4, r2, r19) == r5) goto L29;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00be -> B:22:0x00c1). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.uml.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

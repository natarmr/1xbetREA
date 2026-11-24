package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class ozu extends bnn0 implements Function2 {
    public Object[] i;
    public kmq j;
    public Object[] k;
    public boolean l;
    public byte m;
    public /* synthetic */ Object n;
    public final /* synthetic */ pzu o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ Function1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozu(pzu pzuVar, boolean z, boolean z2, Function1 function1, yje yjeVar) {
        super(2, yjeVar);
        this.o = pzuVar;
        this.p = z;
        this.q = z2;
        this.r = function1;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        ozu ozuVar = new ozu(this.o, this.p, this.q, this.r, yjeVar);
        ozuVar.n = obj;
        return ozuVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ozu) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d7, code lost:
    
        if (a.slb.Q(r1, r3, r18) == r2) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [a.kmq, a.yje, java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ozu.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

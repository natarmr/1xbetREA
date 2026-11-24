package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class n7f extends bnn0 implements Function2 {
    public r7f i;
    public q4f j;
    public boolean k;
    public byte l;
    public final /* synthetic */ r7f m;
    public final /* synthetic */ int n;
    public final /* synthetic */ boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7f(r7f r7fVar, int i, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.m = r7fVar;
        this.n = i;
        this.o = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new n7f(this.m, this.n, this.o, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n7f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00e1  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00be, code lost:
    
        if (r1.b(r14) == r2) goto L35;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.n7f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

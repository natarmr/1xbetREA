package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class vo1 extends bnn0 implements Function2 {
    public long i;
    public long j;
    public Object k;
    public byte l;
    public final /* synthetic */ dp1 m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo1(dp1 dp1Var, boolean z, boolean z2, yje yjeVar) {
        super(2, yjeVar);
        this.m = dp1Var;
        this.n = z;
        this.o = z2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new vo1(this.m, this.n, this.o, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vo1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:46:0x00da  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
    
        if (a.qcc.O(r11 - r3, r18) == r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a3, code lost:
    
        if (r0 == r2) goto L38;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.vo1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

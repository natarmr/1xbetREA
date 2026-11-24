package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class d1f extends bnn0 implements Function2 {
    public byte i;
    public final /* synthetic */ g45 j;
    public final /* synthetic */ List k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ List m;
    public final /* synthetic */ long n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ double r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1f(g45 g45Var, List list, boolean z, List list2, long j, int i, int i2, int i3, double d, yje yjeVar) {
        super(2, yjeVar);
        this.j = g45Var;
        this.k = list;
        this.l = z;
        this.m = list2;
        this.n = j;
        this.o = i;
        this.p = i2;
        this.q = i3;
        this.r = d;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new d1f(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d1f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0140, code lost:
    
        if (r0 == r3) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01cc, code lost:
    
        if (r0 == r3) goto L55;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r38) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.d1f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

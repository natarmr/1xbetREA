package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class b9a extends bnn0 implements Function2 {
    public byte i;
    public final /* synthetic */ List j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ g9a l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ int o;
    public AutoCloseable p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9a(List list, yje yjeVar, boolean z, g9a g9aVar, boolean z2, boolean z3, int i) {
        super(2, yjeVar);
        this.j = list;
        this.k = z;
        this.l = g9aVar;
        this.m = z2;
        this.n = z3;
        this.o = i;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new b9a(this.j, yjeVar, this.k, this.l, this.m, this.n, this.o);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b9a) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ad  */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d6, code lost:
    
        if (r1.q(1000000000, r12) == r0) goto L66;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b9a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

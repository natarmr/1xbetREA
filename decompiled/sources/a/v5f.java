package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class v5f extends bnn0 implements Function2 {
    public List i;
    public cit0 j;
    public byte k;
    public final /* synthetic */ r7f l;
    public final /* synthetic */ List m;
    public final /* synthetic */ q4f n;
    public final /* synthetic */ List o;
    public final /* synthetic */ List p;
    public final /* synthetic */ List q;
    public final /* synthetic */ List r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ boolean u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5f(r7f r7fVar, List list, q4f q4fVar, List list2, List list3, List list4, List list5, boolean z, boolean z2, boolean z3, yje yjeVar) {
        super(2, yjeVar);
        this.l = r7fVar;
        this.m = list;
        this.n = q4fVar;
        this.o = list2;
        this.p = list3;
        this.q = list4;
        this.r = list5;
        this.s = z;
        this.t = z2;
        this.u = z3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new v5f(this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v5f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008b  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a3, code lost:
    
        if (r0 == r9) goto L27;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.v5f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

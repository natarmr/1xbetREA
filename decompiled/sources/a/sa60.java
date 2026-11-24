package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class sa60 extends bnn0 implements Function2 {
    public Object i;
    public int j;
    public boolean k;
    public long l;
    public long m;
    public long n;
    public byte o;
    public /* synthetic */ Object p;
    public final /* synthetic */ pwi q;
    public final /* synthetic */ List r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa60(pwi pwiVar, List list, boolean z, String str, yje yjeVar) {
        super(2, yjeVar);
        this.q = pwiVar;
        this.r = list;
        this.s = z;
        this.t = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        sa60 sa60Var = new sa60(this.q, this.r, this.s, this.t, yjeVar);
        sa60Var.p = obj;
        return sa60Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((sa60) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00d3  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00eb, code lost:
    
        if (r12.a(r0, r20) == r13) goto L27;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.sa60.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

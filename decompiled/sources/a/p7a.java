package a;

/* JADX INFO: loaded from: classes4.dex */
public final class p7a extends zje {
    public odd i;
    public odd j;
    public /* synthetic */ Object k;
    public final /* synthetic */ k19 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7a(k19 k19Var, yje yjeVar) {
        super(yjeVar);
        this.l = k19Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, this);
    }
}

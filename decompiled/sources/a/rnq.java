package a;

/* JADX INFO: loaded from: classes2.dex */
public final class rnq extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ snq j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rnq(snq snqVar, yje yjeVar) {
        super(yjeVar);
        this.j = snqVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, this);
    }
}

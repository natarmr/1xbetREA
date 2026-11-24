package a;

/* JADX INFO: loaded from: classes5.dex */
public final class mv extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ pv j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv(pv pvVar, zje zjeVar) {
        super(zjeVar);
        this.j = pvVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.z(null, this);
    }
}

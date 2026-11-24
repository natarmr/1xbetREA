package a;

/* JADX INFO: loaded from: classes2.dex */
public final class w1p extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ uyn j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1p(uyn uynVar, zje zjeVar) {
        super(zjeVar);
        this.j = uynVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.l(null, null, null, null, 0, null, this);
    }
}

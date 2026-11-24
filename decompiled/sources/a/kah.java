package a;

/* JADX INFO: loaded from: classes4.dex */
public final class kah extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ qah j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kah(qah qahVar, zje zjeVar) {
        super(zjeVar);
        this.j = qahVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, null, this);
    }
}

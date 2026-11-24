package a;

/* JADX INFO: loaded from: classes3.dex */
public final class w8p extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ kki j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8p(kki kkiVar, zje zjeVar) {
        super(zjeVar);
        this.j = kkiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object objA = this.j.a(0L, null, this);
        return objA == wne.f39444a ? objA : new j0g0(objA);
    }
}

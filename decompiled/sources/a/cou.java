package a;

/* JADX INFO: loaded from: classes3.dex */
public final class cou extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ wdu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cou(wdu wduVar, zje zjeVar) {
        super(zjeVar);
        this.j = wduVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.n(0, 0L, this, false);
    }
}

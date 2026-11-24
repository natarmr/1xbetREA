package a;

/* JADX INFO: loaded from: classes3.dex */
public final class e700 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ wdu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e700(wdu wduVar, zje zjeVar) {
        super(zjeVar);
        this.j = wduVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.k(false, null, 0, null, null, false, 0L, null, false, this);
    }
}

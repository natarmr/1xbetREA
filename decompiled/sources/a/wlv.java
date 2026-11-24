package a;

/* JADX INFO: loaded from: classes5.dex */
public final class wlv extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ daf j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wlv(daf dafVar, zje zjeVar) {
        super(zjeVar);
        this.j = dafVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.d0(null, this);
    }
}

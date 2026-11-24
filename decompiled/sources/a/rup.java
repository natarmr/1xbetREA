package a;

/* JADX INFO: loaded from: classes5.dex */
public final class rup extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ wti j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rup(wti wtiVar, zje zjeVar) {
        super(zjeVar);
        this.j = wtiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.t(null, this);
    }
}

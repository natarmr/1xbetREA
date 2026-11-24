package a;

/* JADX INFO: loaded from: classes5.dex */
public final class v2u extends zje {
    public int i;
    public cyu j;
    public /* synthetic */ Object k;
    public final /* synthetic */ wti l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2u(wti wtiVar, zje zjeVar) {
        super(zjeVar);
        this.l = wtiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.m(0, this);
    }
}

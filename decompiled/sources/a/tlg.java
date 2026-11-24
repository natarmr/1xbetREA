package a;

/* JADX INFO: loaded from: classes4.dex */
public final class tlg extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ulg j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlg(ulg ulgVar, zje zjeVar) {
        super(zjeVar);
        this.j = ulgVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.j(null, this);
    }
}

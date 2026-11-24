package a;

/* JADX INFO: loaded from: classes3.dex */
public final class zk00 extends zje {
    public ed5 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ evt k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk00(evt evtVar, zje zjeVar) {
        super(zjeVar);
        this.k = evtVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, null, this);
    }
}

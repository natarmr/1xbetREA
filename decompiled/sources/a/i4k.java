package a;

/* JADX INFO: loaded from: classes7.dex */
public final class i4k extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ jtj j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4k(jtj jtjVar, zje zjeVar) {
        super(zjeVar);
        this.j = jtjVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.k(this);
    }
}

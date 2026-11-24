package a;

/* JADX INFO: loaded from: classes4.dex */
public final class d3p extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ i3p j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3p(i3p i3pVar, zje zjeVar) {
        super(zjeVar);
        this.j = i3pVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.M(this);
    }
}

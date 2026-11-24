package a;

/* JADX INFO: loaded from: classes4.dex */
public final class c0b extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ d0b j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0b(d0b d0bVar, zje zjeVar) {
        super(zjeVar);
        this.j = d0bVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.f(null, this);
    }
}

package a;

/* JADX INFO: loaded from: classes4.dex */
public final class a3g extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ b3g j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3g(b3g b3gVar, yje yjeVar) {
        super(yjeVar);
        this.j = b3gVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(null, this);
    }
}

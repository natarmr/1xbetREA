package a;

/* JADX INFO: loaded from: classes6.dex */
public final class b7u extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ d7u k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7u(d7u d7uVar, yje yjeVar) {
        super(yjeVar);
        this.k = d7uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}

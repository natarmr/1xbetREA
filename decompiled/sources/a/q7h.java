package a;

/* JADX INFO: loaded from: classes4.dex */
public final class q7h extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ t7h k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7h(t7h t7hVar, yje yjeVar) {
        super(yjeVar);
        this.k = t7hVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}

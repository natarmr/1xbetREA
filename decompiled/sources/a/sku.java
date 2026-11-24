package a;

/* JADX INFO: loaded from: classes6.dex */
public final class sku extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ vku k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sku(vku vkuVar, yje yjeVar) {
        super(yjeVar);
        this.k = vkuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}

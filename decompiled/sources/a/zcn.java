package a;

/* JADX INFO: loaded from: classes5.dex */
public final class zcn extends zje {
    public r530 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ adn k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zcn(adn adnVar, zje zjeVar) {
        super(zjeVar);
        this.k = adnVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, this);
    }
}

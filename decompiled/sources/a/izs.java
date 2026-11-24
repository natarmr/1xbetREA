package a;

/* JADX INFO: loaded from: classes4.dex */
public final class izs extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ yop k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izs(yop yopVar, yje yjeVar) {
        super(yjeVar);
        this.k = yopVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}

package a;

/* JADX INFO: loaded from: classes3.dex */
public final class d8e extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ va k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8e(va vaVar, yje yjeVar) {
        super(yjeVar);
        this.k = vaVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}

package a;

/* JADX INFO: loaded from: classes4.dex */
public final class c220 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ a1t k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c220(a1t a1tVar, yje yjeVar) {
        super(yjeVar);
        this.k = a1tVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}

package a;

/* JADX INFO: loaded from: classes4.dex */
public final class bgu extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ b3g k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgu(b3g b3gVar, yje yjeVar) {
        super(yjeVar);
        this.k = b3gVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}

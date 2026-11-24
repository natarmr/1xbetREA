package a;

/* JADX INFO: loaded from: classes.dex */
public final class c7f extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ z4f k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7f(z4f z4fVar, yje yjeVar) {
        super(yjeVar);
        this.k = z4fVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}

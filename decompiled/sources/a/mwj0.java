package a;

/* JADX INFO: loaded from: classes4.dex */
public final class mwj0 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ l0f k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mwj0(l0f l0fVar, yje yjeVar) {
        super(yjeVar);
        this.k = l0fVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}

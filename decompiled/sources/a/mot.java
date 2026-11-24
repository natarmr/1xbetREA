package a;

/* JADX INFO: loaded from: classes4.dex */
public final class mot extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ oot k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mot(oot ootVar, yje yjeVar) {
        super(yjeVar);
        this.k = ootVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}

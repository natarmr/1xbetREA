package a;

/* JADX INFO: loaded from: classes.dex */
public final class kev extends zje {
    public k050 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ lev k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kev(lev levVar, zje zjeVar) {
        super(zjeVar);
        this.k = levVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}

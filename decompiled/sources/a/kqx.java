package a;

/* JADX INFO: loaded from: classes5.dex */
public final class kqx extends zje {
    public sff0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ieu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kqx(ieu ieuVar, zje zjeVar) {
        super(zjeVar);
        this.k = ieuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.k(this);
    }
}

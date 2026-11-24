package a;

/* JADX INFO: loaded from: classes.dex */
public final class evu extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ hnu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public evu(hnu hnuVar, zje zjeVar) {
        super(zjeVar);
        this.j = hnuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.c(0, this);
    }
}

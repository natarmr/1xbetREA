package a;

/* JADX INFO: loaded from: classes5.dex */
public final class ezo extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ gzo j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezo(gzo gzoVar, zje zjeVar) {
        super(zjeVar);
        this.j = gzoVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.P(this);
    }
}

package a;

/* JADX INFO: loaded from: classes.dex */
public final class ulq extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ vlq j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ulq(vlq vlqVar, zje zjeVar) {
        super(zjeVar);
        this.j = vlqVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(this);
    }
}

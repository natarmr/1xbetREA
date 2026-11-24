package a;

/* JADX INFO: loaded from: classes4.dex */
public final class gcu extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ cmt j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcu(cmt cmtVar, zje zjeVar) {
        super(zjeVar);
        this.j = cmtVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.f(null, 0, null, false, 0, this);
    }
}

package a;

/* JADX INFO: loaded from: classes4.dex */
public final class vgj extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ xgj j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vgj(xgj xgjVar, zje zjeVar) {
        super(zjeVar);
        this.j = xgjVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.w(false, this);
    }
}

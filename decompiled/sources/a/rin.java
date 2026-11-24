package a;

/* JADX INFO: loaded from: classes4.dex */
public final class rin extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ali j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rin(ali aliVar, zje zjeVar) {
        super(zjeVar);
        this.j = aliVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.w(0, 0, 0L, this);
    }
}

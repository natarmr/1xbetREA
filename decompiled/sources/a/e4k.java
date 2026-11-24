package a;

/* JADX INFO: loaded from: classes3.dex */
public final class e4k extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ yqc j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4k(yqc yqcVar, zje zjeVar) {
        super(zjeVar);
        this.j = yqcVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.y(0L, this);
    }
}

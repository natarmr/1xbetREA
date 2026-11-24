package a;

/* JADX INFO: loaded from: classes4.dex */
public final class ggl extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ igl j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggl(igl iglVar, zje zjeVar) {
        super(zjeVar);
        this.j = iglVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.c(0, 0L, 0L, this);
    }
}

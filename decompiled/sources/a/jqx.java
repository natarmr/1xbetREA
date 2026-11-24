package a;

/* JADX INFO: loaded from: classes2.dex */
public final class jqx extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ yox j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqx(yox yoxVar, zje zjeVar) {
        super(zjeVar);
        this.j = yoxVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.m(0L, this);
    }
}

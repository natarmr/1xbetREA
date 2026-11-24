package a;

/* JADX INFO: loaded from: classes4.dex */
public final class lve extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ove j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lve(ove oveVar, zje zjeVar) {
        super(zjeVar);
        this.j = oveVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.o(this);
    }
}

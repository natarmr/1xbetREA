package a;

/* JADX INFO: loaded from: classes4.dex */
public final class fvu extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ j3c j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fvu(j3c j3cVar, yje yjeVar) {
        super(yjeVar);
        this.j = j3cVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(0L, 0L, this);
    }
}

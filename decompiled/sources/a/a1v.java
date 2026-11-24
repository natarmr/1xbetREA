package a;

/* JADX INFO: loaded from: classes4.dex */
public final class a1v extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ f1v j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1v(f1v f1vVar, zje zjeVar) {
        super(zjeVar);
        this.j = f1vVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}

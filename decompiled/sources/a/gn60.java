package a;

/* JADX INFO: loaded from: classes4.dex */
public final class gn60 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ nn60 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn60(nn60 nn60Var, zje zjeVar) {
        super(zjeVar);
        this.j = nn60Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.j(null, this);
    }
}

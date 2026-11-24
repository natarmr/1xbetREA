package a;

/* JADX INFO: loaded from: classes2.dex */
public final class f200 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ p200 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f200(p200 p200Var, zje zjeVar) {
        super(zjeVar);
        this.j = p200Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}

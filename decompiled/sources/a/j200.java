package a;

/* JADX INFO: loaded from: classes2.dex */
public final class j200 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ s200 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j200(s200 s200Var, zje zjeVar) {
        super(zjeVar);
        this.j = s200Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}

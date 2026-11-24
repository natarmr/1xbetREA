package a;

/* JADX INFO: loaded from: classes3.dex */
public final class lza0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ sd60 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lza0(sd60 sd60Var, zje zjeVar) {
        super(zjeVar);
        this.j = sd60Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.s(this);
    }
}

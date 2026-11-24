package a;

/* JADX INFO: loaded from: classes.dex */
public final class fk20 extends zje {
    public hx4 i;
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ on20 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk20(on20 on20Var, zje zjeVar) {
        super(zjeVar);
        this.l = on20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.l0(this);
    }
}

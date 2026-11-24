package a;

/* JADX INFO: loaded from: classes5.dex */
public final class cio0 extends zje {
    public rio0 i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ rio0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cio0(rio0 rio0Var, zje zjeVar) {
        super(zjeVar);
        this.l = rio0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.x(this);
    }
}

package a;

/* JADX INFO: loaded from: classes4.dex */
public final class wlu extends zje {
    public uaq0 i;
    public sff0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ khf0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wlu(khf0 khf0Var, zje zjeVar) {
        super(zjeVar);
        this.l = khf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.B(null, this);
    }
}

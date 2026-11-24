package a;

/* JADX INFO: loaded from: classes7.dex */
public final class cut extends zje {
    public hie0 i;
    public hie0 j;
    public hie0 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ jtj m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cut(jtj jtjVar, zje zjeVar) {
        super(zjeVar);
        this.m = jtjVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.k(this);
    }
}

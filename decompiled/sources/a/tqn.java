package a;

/* JADX INFO: loaded from: classes3.dex */
public final class tqn extends zje {
    public ftb i;
    public hqn j;
    public ynb0 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ iqi m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tqn(iqi iqiVar, zje zjeVar) {
        super(zjeVar);
        this.m = iqiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.i(null, null, this);
    }
}

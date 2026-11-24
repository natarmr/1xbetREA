package a;

/* JADX INFO: loaded from: classes5.dex */
public final class tou extends zje {
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ uou n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tou(uou uouVar, zje zjeVar) {
        super(zjeVar);
        this.n = uouVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(this);
    }
}

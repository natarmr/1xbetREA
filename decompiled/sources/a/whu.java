package a;

/* JADX INFO: loaded from: classes2.dex */
public final class whu extends zje {
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ biu n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public whu(biu biuVar, zje zjeVar) {
        super(zjeVar);
        this.n = biuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(false, false, false, false, false, this);
    }
}

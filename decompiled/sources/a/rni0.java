package a;

/* JADX INFO: loaded from: classes.dex */
public final class rni0 extends zje {
    public int i;
    public double j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ipc l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rni0(ipc ipcVar, zje zjeVar) {
        super(zjeVar);
        this.l = ipcVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(0.0d, 0, this);
    }
}

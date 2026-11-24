package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ryk extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ hsj j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ryk(hsj hsjVar, zje zjeVar) {
        super(zjeVar);
        this.j = hsjVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.u(0, this, null);
    }
}

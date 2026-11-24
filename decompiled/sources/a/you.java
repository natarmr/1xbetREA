package a;

/* JADX INFO: loaded from: classes3.dex */
public final class you extends zje {
    public boolean i;
    public hsj j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ hsj n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public you(hsj hsjVar, zje zjeVar) {
        super(zjeVar);
        this.n = hsjVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.q(false, this);
    }
}

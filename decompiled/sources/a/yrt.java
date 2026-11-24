package a;

/* JADX INFO: loaded from: classes3.dex */
public final class yrt extends zje {
    public int i;
    public fhj j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ zrt m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yrt(zrt zrtVar, zje zjeVar) {
        super(zjeVar);
        this.m = zrtVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(0, this);
    }
}

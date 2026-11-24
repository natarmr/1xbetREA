package a;

/* JADX INFO: loaded from: classes6.dex */
public final class i6v extends zje {
    public ql5 i;
    public int j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ j6v m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6v(j6v j6vVar, zje zjeVar) {
        super(zjeVar);
        this.m = j6vVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(null, this);
    }
}

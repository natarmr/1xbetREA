package a;

/* JADX INFO: loaded from: classes4.dex */
public final class c6u extends zje {
    public boolean i;
    public v8d j;
    public j910 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ a6u m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6u(a6u a6uVar, zje zjeVar) {
        super(zjeVar);
        this.m = a6uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.E(false, this);
    }
}

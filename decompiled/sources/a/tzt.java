package a;

/* JADX INFO: loaded from: classes5.dex */
public final class tzt extends zje {
    public String i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ wti l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tzt(wti wtiVar, zje zjeVar) {
        super(zjeVar);
        this.l = wtiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.k(this, null, false);
    }
}

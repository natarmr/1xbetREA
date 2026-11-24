package a;

/* JADX INFO: loaded from: classes5.dex */
public final class j1c extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ s1c j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1c(s1c s1cVar, zje zjeVar) {
        super(zjeVar);
        this.j = s1cVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.x(null, this);
    }
}

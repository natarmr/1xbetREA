package a;

/* JADX INFO: loaded from: classes.dex */
public final class tza extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ yk50 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tza(yk50 yk50Var, zje zjeVar) {
        super(zjeVar);
        this.j = yk50Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.c(0, this, null, null);
    }
}

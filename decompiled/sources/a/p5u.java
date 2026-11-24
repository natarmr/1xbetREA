package a;

/* JADX INFO: loaded from: classes4.dex */
public final class p5u extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ q5u j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5u(q5u q5uVar, zje zjeVar) {
        super(zjeVar);
        this.j = q5uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.c(null, 0L, null, this);
    }
}

package a;

/* JADX INFO: loaded from: classes6.dex */
public final class apx extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ z7u j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apx(z7u z7uVar, zje zjeVar) {
        super(zjeVar);
        this.j = z7uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.c(0L, this);
    }
}

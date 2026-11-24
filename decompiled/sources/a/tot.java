package a;

/* JADX INFO: loaded from: classes2.dex */
public final class tot extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ h6i j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tot(h6i h6iVar, zje zjeVar) {
        super(zjeVar);
        this.j = h6iVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(this);
    }
}

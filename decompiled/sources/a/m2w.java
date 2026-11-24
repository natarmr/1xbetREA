package a;

/* JADX INFO: loaded from: classes3.dex */
public final class m2w extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ r2w j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2w(r2w r2wVar, zje zjeVar) {
        super(zjeVar);
        this.j = r2wVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.x(this);
    }
}

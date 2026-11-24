package a;

/* JADX INFO: loaded from: classes.dex */
public final class fff0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ tlw j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fff0(tlw tlwVar, zje zjeVar) {
        super(zjeVar);
        this.j = tlwVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(0.0f, this);
    }
}

package a;

/* JADX INFO: loaded from: classes5.dex */
public final class fyd extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ kyd j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyd(kyd kydVar, zje zjeVar) {
        super(zjeVar);
        this.j = kydVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.z(this);
    }
}

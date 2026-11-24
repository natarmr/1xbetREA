package a;

/* JADX INFO: loaded from: classes4.dex */
public final class squ extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ dgu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public squ(dgu dguVar, zje zjeVar) {
        super(zjeVar);
        this.j = dguVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.f(this);
    }
}

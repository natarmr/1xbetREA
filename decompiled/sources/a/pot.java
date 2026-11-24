package a;

/* JADX INFO: loaded from: classes4.dex */
public final class pot extends zje {
    public String i;
    public zri j;
    public zri k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ zri n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pot(zri zriVar, zje zjeVar) {
        super(zjeVar);
        this.n = zriVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.j(0, this, null, false);
    }
}

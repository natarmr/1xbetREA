package a;

/* JADX INFO: loaded from: classes.dex */
public final class vk50 extends zje {
    public mie0 i;
    public mie0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ zk50 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk50(zk50 zk50Var, yje yjeVar) {
        super(yjeVar);
        this.l = zk50Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(this);
    }
}

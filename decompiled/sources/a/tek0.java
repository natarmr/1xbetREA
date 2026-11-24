package a;

/* JADX INFO: loaded from: classes5.dex */
public final class tek0 extends zje {
    public qah0 i;
    public float j;
    public /* synthetic */ Object k;
    public final /* synthetic */ uek0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tek0(uek0 uek0Var, zje zjeVar) {
        super(zjeVar);
        this.l = uek0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, 0.0f, this);
    }
}

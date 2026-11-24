package a;

/* JADX INFO: loaded from: classes4.dex */
public final class vy7 extends zje {
    public l08 i;
    public rz7 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ yy7 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy7(yy7 yy7Var, zje zjeVar) {
        super(zjeVar);
        this.l = yy7Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.g(null, this);
    }
}

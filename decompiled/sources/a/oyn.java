package a;

/* JADX INFO: loaded from: classes.dex */
public final class oyn extends zje {
    public o1x i;
    public Object j;
    public gqw0 k;
    public mie0 l;
    public mie0 m;
    public mie0 n;
    public mie0 o;
    public /* synthetic */ Object p;
    public final /* synthetic */ ryn q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oyn(ryn rynVar, zje zjeVar) {
        super(zjeVar);
        this.q = rynVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.c(null, null, null, null, this);
    }
}

package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ybu extends zje {
    public /* synthetic */ Object i;
    public int j;
    public kmq k;
    public final /* synthetic */ zbu l;
    public mie0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybu(zbu zbuVar, yje yjeVar) {
        super(yjeVar);
        this.l = zbuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}

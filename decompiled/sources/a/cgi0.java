package a;

/* JADX INFO: loaded from: classes3.dex */
public final class cgi0 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public kmq k;
    public final /* synthetic */ r980 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgi0(r980 r980Var, yje yjeVar) {
        super(yjeVar);
        this.l = r980Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}

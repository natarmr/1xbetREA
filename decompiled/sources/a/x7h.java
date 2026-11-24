package a;

/* JADX INFO: loaded from: classes4.dex */
public final class x7h extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ s7h k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7h(s7h s7hVar, yje yjeVar) {
        super(yjeVar);
        this.k = s7hVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}

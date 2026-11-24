package a;

/* JADX INFO: loaded from: classes3.dex */
public final class r7e extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ s7e k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7e(s7e s7eVar, yje yjeVar) {
        super(yjeVar);
        this.k = s7eVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}

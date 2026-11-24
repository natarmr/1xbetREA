package a;

/* JADX INFO: loaded from: classes5.dex */
public final class ext extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ fxt j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ext(fxt fxtVar, zje zjeVar) {
        super(zjeVar);
        this.j = fxtVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(0, this);
    }
}

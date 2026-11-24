package a;

/* JADX INFO: loaded from: classes3.dex */
public final class kfi0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ojj j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfi0(ojj ojjVar, zje zjeVar) {
        super(zjeVar);
        this.j = ojjVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, this);
    }
}

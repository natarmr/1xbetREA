package a;

/* JADX INFO: loaded from: classes4.dex */
public final class hmg extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ img j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmg(img imgVar, zje zjeVar) {
        super(zjeVar);
        this.j = imgVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, 0, false, this);
    }
}

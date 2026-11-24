package a;

/* JADX INFO: loaded from: classes3.dex */
public final class avu extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ b3u j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avu(b3u b3uVar, zje zjeVar) {
        super(zjeVar);
        this.j = b3uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}

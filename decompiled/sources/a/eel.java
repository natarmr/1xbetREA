package a;

/* JADX INFO: loaded from: classes.dex */
public final class eel extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ hel j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eel(hel helVar, zje zjeVar) {
        super(zjeVar);
        this.j = helVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.k1(this);
    }
}

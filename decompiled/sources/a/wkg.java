package a;

/* JADX INFO: loaded from: classes4.dex */
public final class wkg extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ zkg j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkg(zkg zkgVar, zje zjeVar) {
        super(zjeVar);
        this.j = zkgVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(0L, this);
    }
}

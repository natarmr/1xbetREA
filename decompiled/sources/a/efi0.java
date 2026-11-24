package a;

/* JADX INFO: loaded from: classes3.dex */
public final class efi0 extends zje {
    public rei0 i;
    public String j;
    public a640 k;
    public gxb l;
    public /* synthetic */ Object m;
    public final /* synthetic */ f4v n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efi0(f4v f4vVar, zje zjeVar) {
        super(zjeVar);
        this.n = f4vVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.c(null, this);
    }
}

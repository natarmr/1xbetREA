package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class anu extends zje {
    public Object i;
    public List j;
    public j2u k;
    public long l;
    public /* synthetic */ Object m;
    public final /* synthetic */ bnu n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anu(bnu bnuVar, zje zjeVar) {
        super(zjeVar);
        this.n = bnuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(0L, this, null);
    }
}

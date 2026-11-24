package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m8a extends zje {
    public int i;
    public g9a j;
    public List k;
    public i8a l;
    public /* synthetic */ Object m;
    public final /* synthetic */ g9a n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8a(g9a g9aVar, zje zjeVar) {
        super(zjeVar);
        this.n = g9aVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.f(null, 0, null, this);
    }
}

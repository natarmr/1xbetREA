package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class z1b extends zje {
    public List i;
    public jza j;
    public h2b k;
    public /* synthetic */ Object l;
    public final /* synthetic */ h2b m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1b(h2b h2bVar, zje zjeVar) {
        super(zjeVar);
        this.m = h2bVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.x(this);
    }
}

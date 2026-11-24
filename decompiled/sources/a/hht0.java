package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class hht0 extends zje {
    public int i;
    public int j;
    public ArrayList k;
    public long l;
    public /* synthetic */ Object m;
    public final /* synthetic */ h9c n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hht0(h9c h9cVar, zje zjeVar) {
        super(zjeVar);
        this.n = h9cVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.b(0, 0, this);
    }
}

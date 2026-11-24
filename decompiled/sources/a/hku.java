package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class hku extends zje {
    public long i;
    public boolean j;
    public boolean k;
    public List l;
    public /* synthetic */ Object m;
    public final /* synthetic */ dgu n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hku(dgu dguVar, zje zjeVar) {
        super(zjeVar);
        this.n = dguVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.t(0L, false, false, this);
    }
}

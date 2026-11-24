package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class cgu extends zje {
    public boolean i;
    public boolean j;
    public List k;
    public /* synthetic */ Object l;
    public final /* synthetic */ dgu m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgu(dgu dguVar, zje zjeVar) {
        super(zjeVar);
        this.m = dguVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.x(false, false, this);
    }
}

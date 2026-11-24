package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class emu extends zje {
    public List i;
    public List j;
    public List k;
    public List l;
    public List m;
    public List n;
    public List o;
    public /* synthetic */ Object p;
    public final /* synthetic */ lhf0 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emu(lhf0 lhf0Var, zje zjeVar) {
        super(zjeVar);
        this.q = lhf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.x(this);
    }
}

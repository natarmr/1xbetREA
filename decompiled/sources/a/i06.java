package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i06 extends zje {
    public lhf0 i;
    public fm80 j;
    public List k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ lhf0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i06(lhf0 lhf0Var, zje zjeVar) {
        super(zjeVar);
        this.n = lhf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return lhf0.H(this.n, false, this);
    }
}

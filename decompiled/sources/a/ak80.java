package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ak80 extends zje {
    public List i;
    public lk80 j;
    public k050 k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ sd60 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak80(sd60 sd60Var, zje zjeVar) {
        super(zjeVar);
        this.n = sd60Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.m(null, false, null, this);
    }
}

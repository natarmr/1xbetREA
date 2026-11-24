package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wy3 extends zje {
    public List i;
    public atf0 j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ xy3 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy3(xy3 xy3Var, zje zjeVar) {
        super(zjeVar);
        this.n = xy3Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.b(this);
    }
}

package a;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class otq0 extends zje {
    public Map i;
    public List j;
    public p7m0 k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ mmq0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public otq0(mmq0 mmq0Var, yje yjeVar) {
        super(yjeVar);
        this.n = mmq0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.b(null, this);
    }
}

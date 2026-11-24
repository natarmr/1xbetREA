package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class eht0 extends zje {
    public q4f i;
    public List j;
    public mie0 k;
    public ArrayList l;
    public List m;
    public mie0 n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ fht0 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eht0(fht0 fht0Var, zje zjeVar) {
        super(zjeVar);
        this.r = fht0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.k(0L, null, this);
    }
}

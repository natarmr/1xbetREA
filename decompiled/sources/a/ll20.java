package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ll20 extends zje {
    public List i;
    public List j;
    public g920 k;
    public List l;
    public svu m;
    public String n;
    public boolean o;
    public boolean p;
    public /* synthetic */ Object q;
    public final /* synthetic */ on20 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll20(on20 on20Var, zje zjeVar) {
        super(zjeVar);
        this.r = on20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.v0(null, null, false, null, this);
    }
}

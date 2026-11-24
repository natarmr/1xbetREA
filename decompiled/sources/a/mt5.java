package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mt5 extends zje {
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public String n;
    public List o;
    public /* synthetic */ Object p;
    public final /* synthetic */ cu5 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt5(cu5 cu5Var, zje zjeVar) {
        super(zjeVar);
        this.q = cu5Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.f(0, this, null, false, false, false, false);
    }
}

package a;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class of20 extends zje {
    public List i;
    public List j;
    public q4f k;
    public List l;
    public Iterator m;
    public String n;
    public svu o;
    public boolean p;
    public boolean q;
    public /* synthetic */ Object r;
    public final /* synthetic */ qg20 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of20(qg20 qg20Var, zje zjeVar) {
        super(zjeVar);
        this.s = qg20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.W(null, null, null, false, this);
    }
}

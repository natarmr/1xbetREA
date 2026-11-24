package a;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class le6 extends zje {
    public String i;
    public List j;
    public Collection k;
    public Iterator l;
    public hf6 m;
    public lef0 n;
    public Collection o;
    public /* synthetic */ Object p;
    public final /* synthetic */ me6 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le6(me6 me6Var, zje zjeVar) {
        super(zjeVar);
        this.q = me6Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.F(null, this);
    }
}

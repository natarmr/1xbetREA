package a;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class cyn0 extends zje {
    public boolean i;
    public xuf j;
    public Collection k;
    public Iterator l;
    public kka m;
    public String n;
    public Collection o;
    public Collection p;
    public double q;
    public /* synthetic */ Object r;
    public final /* synthetic */ zyn0 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyn0(zyn0 zyn0Var, zje zjeVar) {
        super(zjeVar);
        this.s = zyn0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.N(this);
    }
}

package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class iw3 extends zje {
    public Iterator i;
    public hf6 j;
    public String k;
    public String l;
    public hsj m;
    public double n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ gr00 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw3(gr00 gr00Var, zje zjeVar) {
        super(zjeVar);
        this.q = gr00Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.z(this);
    }
}

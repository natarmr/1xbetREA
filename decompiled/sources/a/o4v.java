package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class o4v extends zje {
    public String i;
    public xsu j;
    public List k;
    public cne0 l;
    public ynb0 m;
    public int n;
    public int o;
    public boolean p;
    public boolean q;
    public /* synthetic */ Object r;
    public final /* synthetic */ a6u s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4v(a6u a6uVar, zje zjeVar) {
        super(zjeVar);
        this.s = a6uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.D(null, null, 0, false, false, this);
    }
}

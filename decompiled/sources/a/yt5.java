package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class yt5 extends zje {
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public String o;
    public ArrayList p;
    public /* synthetic */ Object q;
    public final /* synthetic */ cu5 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt5(cu5 cu5Var, zje zjeVar) {
        super(zjeVar);
        this.r = cu5Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.q(0, 0, false, false, null, false, false, this);
    }
}

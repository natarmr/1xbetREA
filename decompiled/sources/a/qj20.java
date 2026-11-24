package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class qj20 extends zje {
    public long i;
    public double j;
    public double k;
    public boolean l;
    public ArrayList m;
    public /* synthetic */ Object n;
    public final /* synthetic */ on20 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj20(on20 on20Var, zje zjeVar) {
        super(zjeVar);
        this.o = on20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.Z(0L, 0.0d, 0.0d, false, null, this);
    }
}

package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class s90 extends zje {
    public List i;
    public u90 j;
    public boolean k;
    public boolean l;
    public double m;
    public /* synthetic */ Object n;
    public final /* synthetic */ u90 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s90(u90 u90Var, zje zjeVar) {
        super(zjeVar);
        this.o = u90Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.B(null, this);
    }
}

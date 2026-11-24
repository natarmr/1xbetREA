package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class j06 extends zje {
    public k06 i;
    public xe60 j;
    public List k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ k06 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j06(k06 k06Var, zje zjeVar) {
        super(zjeVar);
        this.n = k06Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return k06.a(this.n, false, this);
    }
}

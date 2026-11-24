package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class eku extends zje {
    public long i;
    public boolean j;
    public boolean k;
    public List l;
    public /* synthetic */ Object m;
    public final /* synthetic */ f7u n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eku(f7u f7uVar, zje zjeVar) {
        super(zjeVar);
        this.n = f7uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.t(0L, false, false, this);
    }
}

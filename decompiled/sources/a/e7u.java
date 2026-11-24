package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class e7u extends zje {
    public boolean i;
    public boolean j;
    public List k;
    public /* synthetic */ Object l;
    public final /* synthetic */ f7u m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7u(f7u f7uVar, zje zjeVar) {
        super(zjeVar);
        this.m = f7uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.w(false, false, this);
    }
}

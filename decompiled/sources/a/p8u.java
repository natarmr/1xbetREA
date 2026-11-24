package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class p8u extends zje {
    public Object i;
    public List j;
    public j2u k;
    public boolean l;
    public long m;
    public /* synthetic */ Object n;
    public final /* synthetic */ q8u o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8u(q8u q8uVar, zje zjeVar) {
        super(zjeVar);
        this.o = q8uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.a(null, false, 0L, this);
    }
}

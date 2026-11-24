package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class bcl extends zje {
    public int i;
    public boolean j;
    public List k;
    public Object l;
    public /* synthetic */ Object m;
    public final /* synthetic */ ccl n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcl(ccl cclVar, zje zjeVar) {
        super(zjeVar);
        this.n = cclVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(0, this);
    }
}

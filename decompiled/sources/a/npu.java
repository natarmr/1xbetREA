package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class npu extends zje {
    public List i;
    public String j;
    public String k;
    public List l;
    public /* synthetic */ Object m;
    public final /* synthetic */ a6u n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npu(a6u a6uVar, zje zjeVar) {
        super(zjeVar);
        this.n = a6uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.w(this, null, null);
    }
}

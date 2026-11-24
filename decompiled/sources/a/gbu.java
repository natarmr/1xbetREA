package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gbu extends zje {
    public byte i;
    public int j;
    public List k;
    public /* synthetic */ Object l;
    public final /* synthetic */ qv m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbu(qv qvVar, zje zjeVar) {
        super(zjeVar);
        this.m = qvVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(0, this);
    }
}

package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class l6u extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ n4u j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6u(n4u n4uVar, zje zjeVar) {
        super(zjeVar);
        this.j = n4uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Serializable serializableG = this.j.g(null, this);
        return serializableG == wne.f39444a ? serializableG : new j0g0(serializableG);
    }
}

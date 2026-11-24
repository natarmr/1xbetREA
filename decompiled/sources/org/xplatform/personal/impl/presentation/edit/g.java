package org.xplatform.personal.impl.presentation.edit;

import a.zje;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ n j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(n nVar, zje zjeVar) {
        super(zjeVar);
        this.j = nVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.x(null, this);
    }
}

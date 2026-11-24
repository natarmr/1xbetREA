package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class wku extends zje {
    public String i;
    public List j;
    public boolean k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ dgu n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wku(dgu dguVar, zje zjeVar) {
        super(zjeVar);
        this.n = dguVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.v(this, null, false, false);
    }
}

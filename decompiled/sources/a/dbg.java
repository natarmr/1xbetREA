package a;

import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class dbg extends zje {
    public c5g i;
    public Calendar j;
    public Iterator k;
    public /* synthetic */ Object l;
    public final /* synthetic */ hbg m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbg(hbg hbgVar, zje zjeVar) {
        super(zjeVar);
        this.m = hbgVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.y(null, null, null, this);
    }
}

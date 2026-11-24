package a;

import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ebg extends zje {
    public Calendar i;
    public Iterator j;
    public c5g k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ hbg n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebg(hbg hbgVar, zje zjeVar) {
        super(zjeVar);
        this.n = hbgVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.z(null, null, this);
    }
}

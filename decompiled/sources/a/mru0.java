package a;

import java.io.Serializable;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class mru0 extends zje {
    public int i;
    public int j;
    public int k;
    public int l;
    public CyberGamesPage m;
    public nru0 n;
    public mru0 o;
    public Throwable p;
    public long q;
    public long r;
    public /* synthetic */ Object s;
    public final /* synthetic */ nru0 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mru0(nru0 nru0Var, zje zjeVar) {
        super(zjeVar);
        this.t = nru0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        Serializable serializableA = this.t.a(0, this, null);
        return serializableA == wne.f39444a ? serializableA : new j0g0(serializableA);
    }
}

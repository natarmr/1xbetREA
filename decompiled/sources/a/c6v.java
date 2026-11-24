package a;

import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes5.dex */
public final class c6v extends zje {
    public int i;
    public int j;
    public sip k;
    public CyberGamesPage.Virtual l;
    public cyu m;
    public /* synthetic */ Object n;
    public final /* synthetic */ ouu o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6v(ouu ouuVar, zje zjeVar) {
        super(zjeVar);
        this.o = ouuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.D(0, null, null, 0, this);
    }
}

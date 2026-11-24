package a;

import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class qb6 extends zje {
    public sip i;
    public CyberGamesPage.Real j;
    public /* synthetic */ Object k;
    public final /* synthetic */ sb6 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb6(sb6 sb6Var, zje zjeVar) {
        super(zjeVar);
        this.l = sb6Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, null, 0, null, false, this);
    }
}

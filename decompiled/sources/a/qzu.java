package a;

import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class qzu extends zje {
    public cyu i;
    public sip j;
    public CyberGamesPage k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ yuu n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qzu(yuu yuuVar, zje zjeVar) {
        super(zjeVar);
        this.n = yuuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.s(null, null, 0, this);
    }
}

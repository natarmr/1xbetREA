package a;

import kotlin.Unit;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class izu extends bnn0 implements xdr {
    public byte i;
    public /* synthetic */ kmq j;
    public /* synthetic */ Object k;
    public final /* synthetic */ f7u l;
    public final /* synthetic */ sip m;
    public final /* synthetic */ long n;
    public final /* synthetic */ CyberGamesPage o;
    public kmq p;
    public CyberGamesPage q;
    public sip r;
    public cyu s;
    public int t;
    public long u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izu(yje yjeVar, f7u f7uVar, sip sipVar, long j, CyberGamesPage cyberGamesPage) {
        super(3, yjeVar);
        this.l = f7uVar;
        this.m = sipVar;
        this.n = j;
        this.o = cyberGamesPage;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        izu izuVar = new izu((yje) obj3, this.l, this.m, this.n, this.o);
        izuVar.j = (kmq) obj;
        izuVar.k = obj2;
        return izuVar.invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f3, code lost:
    
        if (a.slb.Q(r12, r15, r22) == r1) goto L15;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.izu.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

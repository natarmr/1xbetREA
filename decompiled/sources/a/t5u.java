package a;

import kotlin.Pair;
import kotlin.Unit;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class t5u extends bnn0 implements xdr {
    public byte i;
    public /* synthetic */ kmq j;
    public /* synthetic */ Object k;
    public final /* synthetic */ v5u l;
    public final /* synthetic */ Pair m;
    public final /* synthetic */ CyberGamesPage n;
    public final /* synthetic */ long o;
    public final /* synthetic */ n2o p;
    public kmq q;
    public ypl0 r;
    public boolean s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5u(yje yjeVar, v5u v5uVar, Pair pair, CyberGamesPage cyberGamesPage, long j, n2o n2oVar) {
        super(3, yjeVar);
        this.l = v5uVar;
        this.m = pair;
        this.n = cyberGamesPage;
        this.o = j;
        this.p = n2oVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        t5u t5uVar = new t5u((yje) obj3, this.l, this.m, this.n, this.o, this.p);
        t5uVar.j = (kmq) obj;
        t5uVar.k = obj2;
        return t5uVar.invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0104  */
    /* JADX WARN: Code duplicated, block: B:27:0x0109  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x010b, code lost:
    
        if (r0 == r7) goto L29;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.t5u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

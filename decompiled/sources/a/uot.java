package a;

import kotlin.Unit;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class uot extends bnn0 implements xdr {
    public final /* synthetic */ byte i = 0;
    public byte j;
    public /* synthetic */ kmq k;
    public /* synthetic */ Object l;
    public final /* synthetic */ long m;
    public kmq n;
    public final /* synthetic */ Object o;
    public Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uot(yje yjeVar, q5u q5uVar, long j, CyberGamesPage cyberGamesPage) {
        super(3, yjeVar);
        this.o = q5uVar;
        this.m = j;
        this.p = cyberGamesPage;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        Object obj4 = this.o;
        kmq kmqVar = (kmq) obj;
        switch (b) {
            case 0:
                uot uotVar = new uot((yje) obj3, (h6i) obj4, this.m);
                uotVar.k = kmqVar;
                uotVar.l = obj2;
                return uotVar.invokeSuspend(Unit.f46060a);
            default:
                uot uotVar2 = new uot((yje) obj3, (q5u) obj4, this.m, (CyberGamesPage) this.p);
                uotVar2.k = kmqVar;
                uotVar2.l = obj2;
                return uotVar2.invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        if (a.slb.Q(r1, (a.gmq) r6, r18) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0131, code lost:
    
        if (a.slb.Q(r13, r2, r18) == r12) goto L38;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.uot.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uot(yje yjeVar, h6i h6iVar, long j) {
        super(3, yjeVar);
        this.o = h6iVar;
        this.m = j;
    }
}

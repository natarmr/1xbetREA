package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class q7u extends bnn0 implements xdr {
    public byte i;
    public /* synthetic */ kmq j;
    public /* synthetic */ Object k;
    public final /* synthetic */ pwi l;
    public final /* synthetic */ int m;
    public final /* synthetic */ boolean n;
    public kmq o;
    public List p;
    public gmq q;
    public boolean r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7u(yje yjeVar, pwi pwiVar, int i, boolean z) {
        super(3, yjeVar);
        this.l = pwiVar;
        this.m = i;
        this.n = z;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        q7u q7uVar = new q7u((yje) obj3, this.l, this.m, this.n);
        q7uVar.j = (kmq) obj;
        q7uVar.k = obj2;
        return q7uVar.invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00c5  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f2, code lost:
    
        if (a.slb.Q(r2, r0, r14) == r6) goto L29;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.q7u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

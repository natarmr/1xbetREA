package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class mc40 extends bnn0 implements xdr {
    public byte i;
    public /* synthetic */ kmq j;
    public /* synthetic */ Object k;
    public final /* synthetic */ cyu l;
    public final /* synthetic */ long m;
    public kmq n;
    public List o;
    public dgu p;
    public List q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc40(yje yjeVar, cyu cyuVar, long j) {
        super(3, yjeVar);
        this.l = cyuVar;
        this.m = j;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        mc40 mc40Var = new mc40((yje) obj3, this.l, this.m);
        mc40Var.j = (kmq) obj;
        mc40Var.k = obj2;
        return mc40Var.invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f9, code lost:
    
        if (a.slb.Q(r9, r2, r16) == r1) goto L24;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.mc40.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

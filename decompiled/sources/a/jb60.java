package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class jb60 extends bnn0 implements xdr {
    public byte i;
    public /* synthetic */ kmq j;
    public /* synthetic */ List k;
    public final /* synthetic */ pzu l;
    public final /* synthetic */ int m;
    public final /* synthetic */ boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb60(int i, yje yjeVar, pzu pzuVar, boolean z) {
        super(3, yjeVar);
        this.l = pzuVar;
        this.m = i;
        this.n = z;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        jb60 jb60Var = new jb60(this.m, (yje) obj3, this.l, this.n);
        jb60Var.j = (kmq) obj;
        jb60Var.k = (List) obj2;
        return jb60Var.invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r1.a(r2, r24) == r8) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c6, code lost:
    
        if (a.slb.Q(r1, r2, r24) == r8) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c8, code lost:
    
        return r8;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.jb60.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

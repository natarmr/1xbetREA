package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class xa60 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public Object[] j;
    public kmq k;
    public Object[] l;
    public boolean m;
    public byte n;
    public /* synthetic */ kmq o;
    public /* synthetic */ List p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xa60(Object obj, boolean z, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.r = obj;
        this.q = z;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        boolean z = this.q;
        Object obj4 = this.r;
        kmq kmqVar = (kmq) obj;
        List list = (List) obj2;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                xa60 xa60Var = new xa60((nc0) obj4, z, yjeVar, (byte) 0);
                xa60Var.o = kmqVar;
                xa60Var.p = list;
                return xa60Var.invokeSuspend(Unit.f46060a);
            default:
                xa60 xa60Var2 = new xa60((qv2) obj4, z, yjeVar, (byte) 1);
                xa60Var2.o = kmqVar;
                xa60Var2.p = list;
                return xa60Var2.invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        if (r1.a(r2, r27) == r15) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0105, code lost:
    
        if (a.slb.Q(r1, r2, r27) == r15) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0156, code lost:
    
        if (r1.a(r2, r27) == r3) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01fd, code lost:
    
        if (a.slb.Q(r1, r2, r27) == r3) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xa60.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

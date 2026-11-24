package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class isu extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public byte j;
    public /* synthetic */ kmq k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ isu(Object obj, boolean z, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.m = obj;
        this.l = z;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        boolean z = this.l;
        Object obj4 = this.m;
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                isu isuVar = new isu((wdu) obj4, z, yjeVar, (byte) 0);
                isuVar.k = kmqVar;
                return isuVar.invokeSuspend(Unit.f46060a);
            case 1:
                isu isuVar2 = new isu((pzu) obj4, z, yjeVar, (byte) 1);
                isuVar2.k = kmqVar;
                return isuVar2.invokeSuspend(Unit.f46060a);
            case 2:
                isu isuVar3 = new isu((pwi) obj4, z, yjeVar, (byte) 2);
                isuVar3.k = kmqVar;
                return isuVar3.invokeSuspend(Unit.f46060a);
            default:
                isu isuVar4 = new isu((tzi) obj4, z, yjeVar, (byte) 3);
                isuVar4.k = kmqVar;
                return isuVar4.invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r0.a(r10, r9) == r7) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0091, code lost:
    
        if (r0.a(r10, r9) == r7) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d6, code lost:
    
        if (r0.a(r10, r9) == r7) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0121, code lost:
    
        if (r0.a(r10, r9) == r7) goto L71;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.isu.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

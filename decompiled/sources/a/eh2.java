package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class eh2 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public byte j;
    public /* synthetic */ Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eh2(Object obj, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.m = obj;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        Object obj4 = this.m;
        switch (b) {
            case 0:
                eh2 eh2Var = new eh2((hh2) obj4, (yje) obj3, (byte) 0);
                eh2Var.k = (kmq) obj;
                eh2Var.l = (hat) obj2;
                return eh2Var.invokeSuspend(Unit.f46060a);
            case 1:
                eh2 eh2Var2 = new eh2((qi2) obj4, (yje) obj3, (byte) 1);
                eh2Var2.k = (kmq) obj;
                eh2Var2.l = (fqp0) obj2;
                return eh2Var2.invokeSuspend(Unit.f46060a);
            case 2:
                eh2 eh2Var3 = new eh2((fk2) obj4, (yje) obj3, (byte) 2);
                eh2Var3.k = (kmq) obj;
                eh2Var3.l = (nj2) obj2;
                return eh2Var3.invokeSuspend(Unit.f46060a);
            case 3:
                eh2 eh2Var4 = new eh2((yn2) obj4, (yje) obj3, (byte) 3);
                eh2Var4.k = (kmq) obj;
                eh2Var4.l = (List) obj2;
                return eh2Var4.invokeSuspend(Unit.f46060a);
            case 4:
                eh2 eh2Var5 = new eh2((a6u) obj4, (yje) obj3, (byte) 4);
                eh2Var5.k = (kmq) obj;
                eh2Var5.l = (List) obj2;
                return eh2Var5.invokeSuspend(Unit.f46060a);
            case 5:
                eh2 eh2Var6 = new eh2((nl40) obj4, (yje) obj3, (byte) 5);
                eh2Var6.k = (ats) obj;
                eh2Var6.l = (mi40) obj2;
                return eh2Var6.invokeSuspend(Unit.f46060a);
            default:
                eh2 eh2Var7 = new eh2((v360) obj4, (yje) obj3, (byte) 6);
                eh2Var7.k = (kmq) obj;
                eh2Var7.l = (rz50) obj2;
                return eh2Var7.invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0301, code lost:
    
        if (a.slb.Q(r1, r2, r29) == r5) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x030e, code lost:
    
        if (r1.a(r2, r29) == r5) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0394, code lost:
    
        if (a.slb.Q(r1, r4, r29) == r3) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03a1, code lost:
    
        if (r1.a(r2, r29) == r3) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0420, code lost:
    
        if (a.slb.Q(r1, r2, r29) == r3) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x042d, code lost:
    
        if (r1.a(r2, r29) == r3) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r1.a(r11, r29) == r12) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x04dd, code lost:
    
        if (a.slb.Q(r3, r1, r29) == r5) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x04ea, code lost:
    
        if (r3.a(r4, r29) == r5) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:?, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        if (a.slb.Q(r1, r4, r29) == r12) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ad, code lost:
    
        if (a.slb.Q(r1, r5, r29) == r12) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e1, code lost:
    
        if (a.slb.Q(r1, r2, r29) == r12) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ee, code lost:
    
        if (r1.a(r11, r29) == r12) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01fa, code lost:
    
        if (r1.N(r29) == r4) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x026b, code lost:
    
        if (a.slb.Q(r1, r5, r29) == r3) goto L98;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 1282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.eh2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

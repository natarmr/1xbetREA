package a;

import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class a6v extends bnn0 implements xdr {
    public final /* synthetic */ byte i = 0;
    public byte j;
    public /* synthetic */ kmq k;
    public /* synthetic */ Object l;
    public int m;
    public Object n;
    public final /* synthetic */ Object o;
    public Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6v(yje yjeVar, b6v b6vVar, ArrayList arrayList, int i) {
        super(3, yjeVar);
        this.o = b6vVar;
        this.p = arrayList;
        this.m = i;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        Object obj4 = this.o;
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                a6v a6vVar = new a6v(yjeVar, (b6v) obj4, (ArrayList) this.p, this.m);
                a6vVar.k = kmqVar;
                a6vVar.l = obj2;
                return a6vVar.invokeSuspend(Unit.f46060a);
            default:
                a6v a6vVar2 = new a6v(yjeVar, (qi80) this.n, (gp00) obj4);
                a6vVar2.k = kmqVar;
                a6vVar2.l = obj2;
                return a6vVar2.invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c4, code lost:
    
        if (a.slb.Q(r9, r0, r11) == r6) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x011a, code lost:
    
        if (a.slb.Q(r1, (a.gmq) r12, r11) == r0) goto L52;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a6v.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6v(yje yjeVar, qi80 qi80Var, gp00 gp00Var) {
        super(3, yjeVar);
        this.n = qi80Var;
        this.o = gp00Var;
    }
}

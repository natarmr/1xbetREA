package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class y5m0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public byte j;
    public /* synthetic */ Object k;
    public final /* synthetic */ t33 l;
    public final /* synthetic */ t33 m;
    public final /* synthetic */ t33 n;
    public final /* synthetic */ t33 o;
    public final /* synthetic */ long p;
    public final /* synthetic */ t33 q;
    public final /* synthetic */ k43 r;
    public final /* synthetic */ t33 s;
    public final /* synthetic */ t33 t;
    public final /* synthetic */ t33 u;
    public final /* synthetic */ zsf v;
    public final /* synthetic */ t33 w;
    public final /* synthetic */ u5m0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5m0(t33 t33Var, long j, t33 t33Var2, t33 t33Var3, t33 t33Var4, t33 t33Var5, q5m0 q5m0Var, t33 t33Var6, k43 k43Var, zsf zsfVar, t33 t33Var7, t33 t33Var8, t33 t33Var9, yje yjeVar) {
        super(2, yjeVar);
        this.l = t33Var;
        this.p = j;
        this.m = t33Var2;
        this.n = t33Var3;
        this.o = t33Var4;
        this.q = t33Var5;
        this.x = q5m0Var;
        this.s = t33Var6;
        this.r = k43Var;
        this.v = zsfVar;
        this.t = t33Var7;
        this.u = t33Var8;
        this.w = t33Var9;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        u5m0 u5m0Var = this.x;
        switch (b) {
            case 0:
                y5m0 y5m0Var = new y5m0(this.l, this.p, this.m, this.n, this.o, this.q, (q5m0) u5m0Var, this.s, this.r, this.v, this.t, this.u, this.w, yjeVar);
                y5m0Var.k = obj;
                return y5m0Var;
            default:
                y5m0 y5m0Var2 = new y5m0(this.l, (r5m0) u5m0Var, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, yjeVar);
                y5m0Var2.k = obj;
                return y5m0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((y5m0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:67:0x0200  */
    /* JADX WARN: Code duplicated, block: B:70:0x0213  */
    /* JADX WARN: Code duplicated, block: B:73:0x0226  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0272, code lost:
    
        if (r4.join(r31) == r3) goto L75;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.y5m0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5m0(t33 t33Var, r5m0 r5m0Var, t33 t33Var2, t33 t33Var3, t33 t33Var4, long j, t33 t33Var5, k43 k43Var, t33 t33Var6, t33 t33Var7, t33 t33Var8, zsf zsfVar, t33 t33Var9, yje yjeVar) {
        super(2, yjeVar);
        this.l = t33Var;
        this.x = r5m0Var;
        this.m = t33Var2;
        this.n = t33Var3;
        this.o = t33Var4;
        this.p = j;
        this.q = t33Var5;
        this.r = k43Var;
        this.s = t33Var6;
        this.t = t33Var7;
        this.u = t33Var8;
        this.v = zsfVar;
        this.w = t33Var9;
    }
}

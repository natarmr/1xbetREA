package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class ly70 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ kmq k;
    public /* synthetic */ Object l;
    public final /* synthetic */ gz70 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ly70(byte b, yje yjeVar, gz70 gz70Var) {
        super(3, yjeVar);
        this.i = b;
        this.m = gz70Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj3;
        switch (this.i) {
            case 0:
                ly70 ly70Var = new ly70((byte) 0, yjeVar, this.m);
                ly70Var.k = kmqVar;
                ly70Var.l = obj2;
                return ly70Var.invokeSuspend(Unit.f46060a);
            default:
                ly70 ly70Var2 = new ly70((byte) 1, yjeVar, this.m);
                ly70Var2.k = kmqVar;
                ly70Var2.l = obj2;
                return ly70Var2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        byte b2 = 10;
        gz70 gz70Var = this.m;
        int i = 2;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    kmq kmqVar = this.k;
                    c4m0 c4m0Var = gz70.D;
                    gmq gmqVarW = i120.W(new p6d(((vae) gz70Var.b.f29365a.b).r, new vsg0(new er60(gz70Var, yjeVar, b2)), new y0g(3, (yje) null, (byte) 9), (byte) 1));
                    my70 my70Var = new my70((byte) 1, null, gz70Var);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    f7k.J(kmqVar);
                    Object objC = gmqVarW.c(new vnq(kmqVar, my70Var, (byte) 2), this);
                    if (objC != wneVar) {
                        objC = Unit.f46060a;
                    }
                    if (objC != wneVar) {
                        objC = Unit.f46060a;
                    }
                    if (objC == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    kmq kmqVar2 = this.k;
                    boolean zBooleanValue = ((Boolean) this.l).booleanValue();
                    c4m0 c4m0Var2 = gz70.D;
                    gz70Var.getClass();
                    gmq gmqVarW2 = i120.W(new tst(aoq.b(new vsg0(new fot(i, yjeVar, b2)), new vsg0(new iy70((byte) 2, null, gz70Var)), new vsg0(new ys8(zBooleanValue, (Object) gz70Var, yjeVar, (byte) 26))), zBooleanValue, (byte) 1));
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar2, gmqVarW2, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}

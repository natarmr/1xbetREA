package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class erx extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ kmq k;
    public /* synthetic */ Object l;
    public final /* synthetic */ tzi m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ List o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ erx(yje yjeVar, tzi tziVar, boolean z, List list, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.m = tziVar;
        this.n = z;
        this.o = list;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj3;
        switch (this.i) {
            case 0:
                erx erxVar = new erx(yjeVar, this.m, this.n, this.o, (byte) 0);
                erxVar.k = kmqVar;
                erxVar.l = obj2;
                return erxVar.invokeSuspend(Unit.f46060a);
            default:
                erx erxVar2 = new erx(yjeVar, this.m, this.n, this.o, (byte) 1);
                erxVar2.k = kmqVar;
                erxVar2.l = obj2;
                return erxVar2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        gmq eu4Var;
        gmq eu4Var2;
        int i = 3;
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    kmq kmqVar = this.k;
                    yje yjeVar = null;
                    if (((Boolean) this.l).booleanValue()) {
                        tzi tziVar = this.m;
                        xae0 xae0VarN = vtb.N(((tj60) ((rdd) tziVar.i).f30285a.f24171a).b);
                        s5r0 s5r0Var = (s5r0) ((h0q0) ((xsu) tziVar.b).f41434a).b;
                        eu4Var = aoq.c(new p6d(xae0VarN, i120.W(aoq.c(s5r0Var.c, new za60(yjeVar, (Object) s5r0Var, (byte) 18))), new y0g(3, (yje) null, (byte) 6), (byte) 1), new erx(yjeVar, tziVar, this.n, this.o, (byte) 1));
                    } else {
                        eu4Var = new eu4(new x5r0(false, null), (byte) 12);
                    }
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar, eu4Var, this) == wneVar) {
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
                    yje yjeVar2 = null;
                    if (((Boolean) this.l).booleanValue()) {
                        hie0 hie0Var = new hie0();
                        hie0Var.f13108a = true;
                        boolean z3 = this.n;
                        long j = z3 ? 8L : 30L;
                        tzi tziVar2 = this.m;
                        eu4Var2 = new dnq(new eu4(new eu4(dtb.U(new i89(uvw.P(new qqu(new vsg0(new tu3((Object) tziVar2, z3, (Object) this.o, yjeVar2, (byte) 7)), hie0Var, (byte) 13), new lqu(hie0Var, (byte) 14), j, new brx(1, null, (byte) 0), null, new x9((Object) tziVar2, z3, (byte) 26), 24), (byte) 22), 1), (byte) 16), (byte) 17), new oz0(i, yjeVar2, (byte) 23), (byte) 1);
                    } else {
                        eu4Var2 = new eu4(new x5r0(false, null), (byte) 12);
                    }
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar2, eu4Var2, this) == wneVar2) {
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

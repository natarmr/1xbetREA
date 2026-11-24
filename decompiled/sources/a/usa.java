package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class usa extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ wsa k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ usa(wsa wsaVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = wsaVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        wsa wsaVar = this.k;
        switch (b) {
            case 0:
                usa usaVar = new usa(wsaVar, yjeVar, (byte) 0);
                usaVar.j = ((Boolean) obj).booleanValue();
                return usaVar;
            default:
                return new usa(wsaVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((usa) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((usa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        rra rraVar;
        switch (this.i) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                wsa wsaVar = this.k;
                if (z) {
                    int i = wsa.Q;
                    v3c.N(wsaVar.P);
                    wsaVar.P = i3t0.F(wsaVar, wsaVar.u, null, null, new im8((byte) 28), 119);
                    c4m0 c4m0Var = wsaVar.O;
                    if (c4m0Var == null || !c4m0Var.isActive()) {
                        wdu wduVar = wsaVar.B;
                        rra rraVar2 = ((gsa) wsaVar.D()).f11820a;
                        lsa lsaVar = new lsa(wduVar.s(true, true, rraVar2 != null && rraVar2.h, null), (byte) 2);
                        rra rraVar3 = ((gsa) wsaVar.D()).f11820a;
                        gmq eu4Var = ((rraVar3 == null || !rraVar3.d) && ((rraVar = ((gsa) wsaVar.D()).f11820a) == null || !rraVar.e)) ? new eu4(0, (byte) 12) : new dnq(new lsa(wsaVar.A.O(), (byte) 0), new oz0(3, null, (byte) 2), (byte) 1);
                        rra rraVar4 = ((gsa) wsaVar.D()).f11820a;
                        wsaVar.O = sac.T(dub.f0(lsaVar, eu4Var, (rraVar4 == null || !rraVar4.b) ? new eu4(0, (byte) 12) : new dnq(new lsa(wsaVar.z.g(), (byte) 1), new oz0(3, null, (byte) 3), (byte) 1), new tsa(wsaVar, null)), d5c.S(jiu0.a(wsaVar), wsaVar.q.f22085a), new c48(2, wsaVar, wsa.class, "onDataLoadingError", "onDataLoadingError(Ljava/lang/Throwable;)V", 4, (byte) 9));
                    }
                } else if (((gsa) wsaVar.D()).c) {
                    p7m0 p7m0Var = wsaVar.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, gsa.a((gsa) value, null, null, true, null, 0, 0, null, false, false, null, 4087)));
                }
                return Unit.f46060a;
            default:
                Object obj2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    wsa wsaVar2 = this.k;
                    i89 i89VarM = wsaVar2.v.m();
                    h2c h2cVarA = wsaVar2.w.a();
                    ko0 ko0Var = new ko0(wsaVar2, (yje) null, (byte) 4);
                    k19 k19Var = new k19(wsaVar2, (byte) 22);
                    this.j = true;
                    Object objG = tdc.G(this, k19Var, new kh1((Object) ko0Var, (yje) null, (byte) 9), pul.j, new gmq[]{i89VarM, h2cVarA});
                    if (objG != obj2) {
                        objG = Unit.f46060a;
                    }
                    if (objG == obj2) {
                        return obj2;
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

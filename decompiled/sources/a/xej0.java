package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class xej0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ org.xplatform.settings.impl.presentation.a j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xej0(org.xplatform.settings.impl.presentation.a aVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = aVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        org.xplatform.settings.impl.presentation.a aVar = this.j;
        switch (b) {
            case 0:
                return new xej0(aVar, yjeVar, (byte) 0);
            case 1:
                return new xej0(aVar, yjeVar, (byte) 1);
            default:
                return new xej0(aVar, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((xej0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((xej0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((xej0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        yje yjeVar = null;
        byte b2 = 1;
        org.xplatform.settings.impl.presentation.a aVar = this.j;
        byte b3 = 0;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                sac.V(jiu0.a(aVar), new kej0(aVar, b3), new lej0(aVar, b3), null, new xej0(aVar, yjeVar, b2), 12);
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                boolean zA = aVar.U.f15225a.a();
                p7m0 p7m0Var = aVar.X0;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, caj0.a((caj0) value, false, false, zA, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, 33554423)));
                boolean z = aVar.V.a().f13512a;
                while (true) {
                    Object value3 = p7m0Var.getValue();
                    boolean z2 = z;
                    if (p7m0Var.m(value3, caj0.a((caj0) value3, false, false, false, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, z2, 16777215))) {
                        if (zA) {
                            sac.i0(jiu0.a(aVar), "SettingsViewModel.getAuthorizedData", 3, 5L, kotlin.collections.a.c(oqt0.class), null, new uu3(aVar, (yje) null), null, null, new kej0(aVar, (byte) 5), null, 720);
                        }
                        if (aVar.J0.N.i) {
                            j6d0 j6d0VarC = aVar.P.c();
                            do {
                                value2 = p7m0Var.getValue();
                            } while (!p7m0Var.m(value2, caj0.a((caj0) value2, false, false, false, j6d0VarC, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, 33554399)));
                        }
                        aVar.x(false);
                        aVar.G(new o0j0(false), null);
                    } else {
                        z = z2;
                    }
                    break;
                }
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                aVar.P0 = 1;
                aVar.O0 = false;
                break;
        }
        return Unit.f46060a;
    }
}

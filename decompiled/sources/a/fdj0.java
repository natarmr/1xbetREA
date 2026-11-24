package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class fdj0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ odj0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fdj0(odj0 odj0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = odj0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        odj0 odj0Var = this.j;
        switch (b) {
            case 0:
                return new fdj0(odj0Var, yjeVar, (byte) 0);
            default:
                return new fdj0(odj0Var, yjeVar, (byte) 1);
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
        return ((fdj0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        odj0 odj0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean zA = odj0Var.h0.f15225a.a();
                odj0Var.H(new cxi0((byte) 5, zA));
                if (zA) {
                    yje yjeVar = null;
                    sac.i0(jiu0.a(odj0Var), "SettingsViewModel.getAuthorizedData", 3, 5L, kotlin.collections.a.c(oqt0.class), null, new zye0((Object) odj0Var, yjeVar, (byte) 24), null, null, new vcj0(odj0Var, (byte) 6), null, 720);
                    sac.V(jiu0.a(odj0Var), new vcj0(odj0Var, (byte) 8), null, odj0Var.F.b, new bdj0(odj0Var, yjeVar, (byte) 2), 10);
                }
                if (((tcj0) odj0Var.D()).F) {
                    odj0Var.H(new exi0(odj0Var.d0.c(), (byte) 1));
                }
                odj0Var.N(false);
                byte b2 = 23;
                odj0Var.H(new u49(b2, odj0Var.t0.a(), false));
                odj0Var.G(new rbj0(false));
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i = odj0.V0;
                odj0Var.H(new r3j0((byte) 14));
                odj0Var.H(new r3j0((byte) 15));
                break;
        }
        return Unit.f46060a;
    }
}

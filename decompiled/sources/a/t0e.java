package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.login.new_place.api.navigation.ConfirmationNewPlaceScreenType;

/* JADX INFO: loaded from: classes2.dex */
public final class t0e extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ g1e j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0e(g1e g1eVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = g1eVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        g1e g1eVar = this.j;
        switch (b) {
            case 0:
                return new t0e(g1eVar, yjeVar, (byte) 0);
            default:
                return new t0e(g1eVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((t0e) create(kmqVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        g1e g1eVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                g1eVar.F();
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ConfirmationNewPlaceScreenType confirmationNewPlaceScreenType = g1eVar.d;
                if (confirmationNewPlaceScreenType instanceof ConfirmationNewPlaceScreenType.Authenticator) {
                    g1eVar.C(((ConfirmationNewPlaceScreenType.Authenticator) confirmationNewPlaceScreenType).d);
                }
                c4m0 c4m0Var = g1eVar.D;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    g1eVar.D = sac.T(new fnq(g1eVar.g.b(), new e1e(g1eVar, null), (byte) 4), d5c.S(jiu0.a(g1eVar), g1eVar.f.f22085a), new f1e(2, null, (byte) 0));
                }
                break;
        }
        return Unit.f46060a;
    }
}

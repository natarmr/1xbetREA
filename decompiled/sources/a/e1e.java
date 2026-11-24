package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.login.new_place.api.navigation.ConfirmationNewPlaceScreenType;

/* JADX INFO: loaded from: classes2.dex */
public final class e1e extends bnn0 implements Function2 {
    public /* synthetic */ boolean i;
    public final /* synthetic */ g1e j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1e(g1e g1eVar, yje yjeVar) {
        super(2, yjeVar);
        this.j = g1eVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        e1e e1eVar = new e1e(this.j, yjeVar);
        e1eVar.i = ((Boolean) obj).booleanValue();
        return e1eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((e1e) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        bby bbyVar;
        boolean z = this.i;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        g1e g1eVar = this.j;
        g1eVar.z = z;
        g1eVar.I(g1eVar.B);
        if (z && (bbyVar = g1eVar.E) != null && !bbyVar.isActive()) {
            ConfirmationNewPlaceScreenType confirmationNewPlaceScreenType = g1eVar.d;
            if (confirmationNewPlaceScreenType instanceof ConfirmationNewPlaceScreenType.Authenticator) {
                g1eVar.C(((ConfirmationNewPlaceScreenType.Authenticator) confirmationNewPlaceScreenType).d);
            }
        }
        return Unit.f46060a;
    }
}

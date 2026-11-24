package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes6.dex */
public final class gkm extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ DsButton j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gkm(DsButton dsButton, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = dsButton;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        DsButton dsButton = this.j;
        switch (b) {
            case 0:
                return new gkm(dsButton, yjeVar, (byte) 0);
            default:
                return new gkm(dsButton, yjeVar, (byte) 1);
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
        return ((gkm) create(kmqVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        DsButton dsButton = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                dsButton.setEnabled(false);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                dsButton.setEnabled(false);
                break;
        }
        return Unit.f46060a;
    }
}

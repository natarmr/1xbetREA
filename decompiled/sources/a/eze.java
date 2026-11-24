package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class eze extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ gze j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eze(gze gzeVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = gzeVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        gze gzeVar = this.j;
        switch (b) {
            case 0:
                return new eze(gzeVar, yjeVar, (byte) 0);
            default:
                return new eze(gzeVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit unit = (Unit) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((eze) create(unit, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        gze gzeVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                usd usdVar = gze.S1;
                gzeVar.G0().b.u();
                gzeVar.G0().b.setIsNeedClearText(true);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                usd usdVar2 = gze.S1;
                gzeVar.G0().b.setIsNeedClearText(true);
                break;
        }
        return Unit.f46060a;
    }
}

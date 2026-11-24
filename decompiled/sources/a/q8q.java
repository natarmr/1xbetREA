package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class q8q extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ r8q j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q8q(r8q r8qVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = r8qVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        r8q r8qVar = this.j;
        switch (b) {
            case 0:
                return new q8q(r8qVar, yjeVar, (byte) 0);
            default:
                return new q8q(r8qVar, yjeVar, (byte) 1);
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
        return ((q8q) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        r8q r8qVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ocq ocqVar = r8q.Y;
                r8qVar.D(false);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ocq ocqVar2 = r8q.Y;
                r8qVar.D(true);
                break;
        }
        return Unit.f46060a;
    }
}

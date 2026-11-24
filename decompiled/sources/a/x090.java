package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class x090 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ boolean j;
    public final /* synthetic */ b190 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x090(b190 b190Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = b190Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        b190 b190Var = this.k;
        switch (b) {
            case 0:
                x090 x090Var = new x090(b190Var, yjeVar, (byte) 0);
                x090Var.j = ((Boolean) obj).booleanValue();
                return x090Var;
            case 1:
                x090 x090Var2 = new x090(b190Var, yjeVar, (byte) 1);
                x090Var2.j = ((Boolean) obj).booleanValue();
                return x090Var2;
            default:
                x090 x090Var3 = new x090(b190Var, yjeVar, (byte) 2);
                x090Var3.j = ((Boolean) obj).booleanValue();
                return x090Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.i;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        yje yjeVar = (yje) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((x090) create(bool, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        b190 b190Var = this.k;
        boolean z = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                fl70 fl70Var = b190.V1;
                b190Var.G0().e.setVisibility(z ? 0 : 8);
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                fl70 fl70Var2 = b190.V1;
                b190Var.G0().e.setVisibility(z ? 0 : 8);
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                fl70 fl70Var3 = b190.V1;
                b190Var.G0().b.setFirstButtonEnabled(z);
                break;
        }
        return Unit.f46060a;
    }
}

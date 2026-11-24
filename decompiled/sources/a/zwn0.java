package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class zwn0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ z220 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zwn0(z220 z220Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = z220Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        z220 z220Var = this.j;
        switch (b) {
            case 0:
                return new zwn0(z220Var, yjeVar, (byte) 0);
            default:
                return new zwn0(z220Var, yjeVar, (byte) 1);
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
        return ((zwn0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        z220 z220Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                yvn0 yvn0Var = (yvn0) z220Var.d;
                yvn0Var.getClass();
                try {
                    String string = yvn0Var.f43330a.a().getString("KEY_SAVED_SWIPE_X_CHAMPS", "");
                    return (string == null || string.length() == 0) ? iun.f15405a : (List) yvn0Var.b.b(new zw3(epn0.Companion.serializer(), (byte) 0), string);
                } catch (Exception unused) {
                    return iun.f15405a;
                }
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                yvn0 yvn0Var2 = (yvn0) z220Var.d;
                yvn0Var2.getClass();
                try {
                    String string2 = yvn0Var2.f43330a.a().getString("KEY_SAVED_SWIPE_X_SPORTS", "");
                    return (string2 == null || string2.length() == 0) ? iun.f15405a : (List) yvn0Var2.b.b(new zw3(hpn0.Companion.serializer(), (byte) 0), string2);
                } catch (Exception unused2) {
                    return iun.f15405a;
                }
        }
    }
}

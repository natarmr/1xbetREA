package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class adg extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ boolean j;
    public final /* synthetic */ gdg k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ adg(gdg gdgVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = gdgVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        gdg gdgVar = this.k;
        switch (b) {
            case 0:
                adg adgVar = new adg(gdgVar, yjeVar, (byte) 0);
                adgVar.j = ((Boolean) obj).booleanValue();
                return adgVar;
            default:
                adg adgVar2 = new adg(gdgVar, yjeVar, (byte) 1);
                adgVar2.j = ((Boolean) obj).booleanValue();
                return adgVar2;
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
        }
        return ((adg) create(bool, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        gdg gdgVar = this.k;
        boolean z = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (z) {
                    gdgVar.z.f();
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (z) {
                    gdgVar.y.f();
                }
                break;
        }
        return Unit.f46060a;
    }
}

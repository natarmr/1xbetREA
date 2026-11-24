package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class yuh0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ zuh0 j;
    public final /* synthetic */ String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yuh0(zuh0 zuh0Var, String str, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = zuh0Var;
        this.k = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        String str = this.k;
        zuh0 zuh0Var = this.j;
        switch (b) {
            case 0:
                return new yuh0(zuh0Var, str, yjeVar, (byte) 0);
            default:
                return new yuh0(zuh0Var, str, yjeVar, (byte) 1);
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
        return ((yuh0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        String str = this.k;
        zuh0 zuh0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                zuh0Var.E.f(new muh0(rek0.b, str));
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                zuh0Var.E.f(new muh0(rek0.b, str));
                p7m0 p7m0Var = zuh0Var.F;
                Boolean bool = Boolean.FALSE;
                p7m0Var.getClass();
                p7m0Var.o(null, bool);
                break;
        }
        return Unit.f46060a;
    }
}

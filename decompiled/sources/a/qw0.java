package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class qw0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ tw0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qw0(tw0 tw0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = tw0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        tw0 tw0Var = this.j;
        switch (b) {
            case 0:
                return new qw0(tw0Var, yjeVar, (byte) 0);
            case 1:
                return new qw0(tw0Var, yjeVar, (byte) 1);
            default:
                return new qw0(tw0Var, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((qw0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        tw0 tw0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                tw0Var.G(new gw0(((jw0) tw0Var.D()).e, ((jw0) tw0Var.D()).f));
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i = tw0.x;
                tw0Var.G(fw0.f10238a);
                p7m0 p7m0Var = tw0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, jw0.a((jw0) value, true, false, false, null, 3967)));
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i2 = tw0.x;
                p7m0 p7m0Var2 = tw0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, jw0.a((jw0) value2, false, true, false, null, 3839)));
                break;
        }
        return Unit.f46060a;
    }
}

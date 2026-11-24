package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class zx20 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ dy20 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zx20(dy20 dy20Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = dy20Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        dy20 dy20Var = this.j;
        switch (b) {
            case 0:
                return new zx20(dy20Var, yjeVar, (byte) 0);
            default:
                return new zx20(dy20Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((zx20) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((zx20) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        dy20 dy20Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                dy20Var.y(dy20Var.y);
                dy20Var.y = false;
                v3c.N(dy20Var.w);
                yje yjeVar = null;
                byte b2 = 2;
                dy20Var.w = sac.T(new fnq(dtb.z(dy20Var.h.b(), 1), new w620((Object) dy20Var, yjeVar, (byte) 4), (byte) 4), d5c.S(jiu0.a(dy20Var), dy20Var.e.b), new st20(b2, yjeVar, b2));
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                dy20Var.z();
                break;
        }
        return Unit.f46060a;
    }
}

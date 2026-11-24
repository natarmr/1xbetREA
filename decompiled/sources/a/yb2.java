package a;

import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yb2 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ zb2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yb2(zb2 zb2Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = zb2Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        zb2 zb2Var = this.k;
        switch (b) {
            case 0:
                yb2 yb2Var = new yb2(zb2Var, yjeVar, (byte) 0);
                yb2Var.j = obj;
                return yb2Var;
            default:
                yb2 yb2Var2 = new yb2(zb2Var, yjeVar, (byte) 1);
                yb2Var2.j = obj;
                return yb2Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((yb2) create((Date) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((yb2) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        zb2 zb2Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                Date date = (Date) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (!Intrinsics.d(((dc2) zb2Var.D()).k, date) || ((dc2) zb2Var.D()).f5830a.isEmpty()) {
                    p7m0 p7m0Var = zb2Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, dc2.a((dc2) value, null, null, false, false, true, false, false, null, null, 8143)));
                    if (date == null) {
                        date = new Date();
                    }
                    zb2Var.M(date);
                } else {
                    c4m0 c4m0Var = zb2Var.y;
                    if (c4m0Var != null && !c4m0Var.isActive()) {
                        if (date == null) {
                            date = new Date();
                        }
                        zb2Var.M(date);
                    }
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                zb2Var.u.b((Throwable) obj2, new ma2((byte) 2));
                break;
        }
        return Unit.f46060a;
    }
}

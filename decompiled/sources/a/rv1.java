package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class rv1 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ uv1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rv1(uv1 uv1Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = uv1Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        uv1 uv1Var = this.k;
        switch (b) {
            case 0:
                rv1 rv1Var = new rv1(uv1Var, yjeVar, (byte) 0);
                rv1Var.j = obj;
                return rv1Var;
            case 1:
                rv1 rv1Var2 = new rv1(uv1Var, yjeVar, (byte) 1);
                rv1Var2.j = obj;
                return rv1Var2;
            default:
                rv1 rv1Var3 = new rv1(uv1Var, yjeVar, (byte) 2);
                rv1Var3.j = obj;
                return rv1Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((rv1) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((rv1) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((rv1) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        byte b = this.i;
        uv1 uv1Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = uv1.X;
                p7m0 p7m0Var = uv1Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, yu1.a((yu1) value, null, false, null, null, bt1.f3159a, null, null, null, null, false, false, false, null, null, null, null, null, 33554175)));
                uv1Var.r.b(th, new xg1((byte) 15));
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                bo0 bo0Var = new bo0((List) obj2, (byte) 6);
                int i2 = uv1.X;
                uv1Var.H(bo0Var);
                break;
            default:
                sw00 sw00Var = (sw00) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i3 = uv1.X;
                ocj ocjVar = uv1Var.i;
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, yu1.a((yu1) value2, null, sw00Var.f32897a, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, 33554415)));
                boolean z = sw00Var.f32897a;
                c4m0 c4m0Var = uv1Var.T;
                yje yjeVar = null;
                if (z) {
                    if (c4m0Var != null) {
                        c4m0Var.cancel(null);
                    }
                    uv1Var.v.b();
                    uv1Var.T = sac.T(new fnq(uv1Var.u.o(), new rv1(uv1Var, yjeVar, (byte) 1), (byte) 4), d5c.S(jiu0.a(uv1Var), uv1Var.L.b), sv1.h);
                } else {
                    if (c4m0Var != null) {
                        c4m0Var.cancel(null);
                    }
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var3.getValue();
                        value3.getClass();
                    } while (!p7m0Var3.m(value3, yu1.a((yu1) value3, null, false, null, null, null, null, null, null, null, false, false, false, null, null, null, xun.f41520a, null, 25165823)));
                }
                break;
        }
        return Unit.f46060a;
    }
}

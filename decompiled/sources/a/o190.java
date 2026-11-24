package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class o190 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ t190 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o190(t190 t190Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = t190Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        t190 t190Var = this.j;
        switch (b) {
            case 0:
                return new o190(t190Var, yjeVar, (byte) 0);
            case 1:
                return new o190(t190Var, yjeVar, (byte) 1);
            default:
                return new o190(t190Var, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((o190) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((o190) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((o190) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        m190 m190Var;
        dxh0 dxh0Var;
        byte b = this.i;
        byte b2 = 3;
        yje yjeVar = null;
        t190 t190Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                t190Var.w = sac.T(new p6d(t190Var.j.b(), ((d190) ((g090) t190Var.n.f42558a).f10448a).f, new jr9(t190Var, yjeVar, b2), (byte) 1), d5c.S(jiu0.a(t190Var), t190Var.m.f22085a), r190.h);
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                t190Var.x = sac.T(new fnq(((d190) ((g090) t190Var.o.b).f10448a).g, new s980(t190Var, yjeVar, (byte) 8), (byte) 4), d5c.S(jiu0.a(t190Var), t190Var.m.f22085a), s190.h);
                return Unit.f46060a;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                zvh0 zvh0Var = t190Var.k.a().g.x;
                p7m0 p7m0Var = t190Var.t;
                do {
                    value = p7m0Var.getValue();
                    m190Var = (m190) value;
                    int iOrdinal = zvh0Var.ordinal();
                    if (iOrdinal == 0) {
                        dxh0Var = axh0.f1625a;
                    } else if (iOrdinal == 1) {
                        dxh0Var = zwh0.f45106a;
                    } else if (iOrdinal == 2) {
                        dxh0Var = cxh0.f5122a;
                    } else {
                        if (iOrdinal != 3) {
                            t9f.b();
                            return null;
                        }
                        dxh0Var = bxh0.f3376a;
                    }
                } while (!p7m0Var.m(value, m190.a(m190Var, dxh0Var, 0, 6)));
                return Unit.f46060a;
        }
    }
}

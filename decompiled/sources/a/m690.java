package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class m690 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ s690 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m690(s690 s690Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = s690Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        s690 s690Var = this.j;
        switch (b) {
            case 0:
                return new m690(s690Var, yjeVar, (byte) 0);
            case 1:
                return new m690(s690Var, yjeVar, (byte) 1);
            default:
                return new m690(s690Var, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((m690) create((Unit) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((m690) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((m690) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        s690 s690Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                l690 l690Var = (l690) s690Var.v.getValue();
                if ((l690Var instanceof j690) && !((j690) l690Var).f15973a) {
                    s690Var.x(s690Var.b);
                }
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                s690Var.y.f(new c690(s690Var.n.f15748a.b()));
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var = s690Var.w;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, z590.f43805a));
                break;
        }
        return Unit.f46060a;
    }
}

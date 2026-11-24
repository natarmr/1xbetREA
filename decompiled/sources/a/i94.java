package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class i94 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ l94 j;
    public boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i94(l94 l94Var, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        this.j = l94Var;
        this.k = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        l94 l94Var = this.j;
        switch (b) {
            case 0:
                return new i94(l94Var, yjeVar, (byte) 0);
            case 1:
                return new i94(l94Var, this.k, yjeVar);
            default:
                i94 i94Var = new i94(l94Var, yjeVar, (byte) 2);
                i94Var.k = ((Boolean) obj).booleanValue();
                return i94Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((i94) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((i94) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((i94) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        l94 l94Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.k;
                if (!z) {
                    z1x.P(obj);
                    vs10 vs10Var = l94Var.t.c;
                    y32 y32Var = new y32(l94Var, null, (byte) 20);
                    this.k = true;
                    if (qjj.d0(vs10Var, y32Var, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ctf0 ctf0Var = l94Var.s;
                boolean z2 = this.k;
                l94Var.G(new x84(z2 ? qek0.f28589a : rek0.b, ctf0Var.b.a(z2 ? R.string.security_exit_success : R.string.security_exit_error, Arrays.copyOf(new Object[0], 0))));
                return Unit.f46060a;
            default:
                boolean z3 = this.k;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (z3) {
                    int i = l94.y;
                    l94Var.N();
                }
                int i2 = l94.y;
                p7m0 p7m0Var = l94Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, d94.a((d94) value, null, null, z3, null, false, 27)));
                if (!z3) {
                    l94Var.G(u84.f35217a);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i94(l94 l94Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = l94Var;
    }
}

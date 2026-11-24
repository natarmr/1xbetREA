package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class aqb extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ eqb k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aqb(eqb eqbVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = eqbVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        eqb eqbVar = this.k;
        switch (b) {
            case 0:
                aqb aqbVar = new aqb(eqbVar, yjeVar, (byte) 0);
                aqbVar.j = ((Boolean) obj).booleanValue();
                return aqbVar;
            default:
                return new aqb(eqbVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((aqb) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((aqb) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        eqb eqbVar = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (((CharSequence) eqbVar.r.getValue()).length() == 0 && z) {
                    eqbVar.w();
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    qoj0 qoj0Var = eqbVar.w;
                    Unit unit = Unit.f46060a;
                    this.j = true;
                    if (qoj0Var.a(unit, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                p7m0 p7m0Var = eqbVar.u;
                Boolean bool = Boolean.TRUE;
                p7m0Var.getClass();
                p7m0Var.o(null, bool);
                p7m0 p7m0Var2 = eqbVar.s;
                Boolean bool2 = Boolean.FALSE;
                p7m0Var2.getClass();
                p7m0Var2.o(null, bool2);
                return Unit.f46060a;
        }
    }
}

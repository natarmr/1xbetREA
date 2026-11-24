package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class yau0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ abu0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yau0(abu0 abu0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = abu0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        abu0 abu0Var = this.k;
        switch (b) {
            case 0:
                return new yau0(abu0Var, yjeVar, (byte) 0);
            default:
                yau0 yau0Var = new yau0(abu0Var, yjeVar, (byte) 1);
                yau0Var.j = ((Boolean) obj).booleanValue();
                return yau0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((yau0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((yau0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        abu0 abu0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    woc wocVar = abu0Var.j;
                    this.j = true;
                    if (wocVar.a(false, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                abu0Var.A.f(rau0.f30154a);
                return Unit.f46060a;
            default:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (z2 && !abu0Var.B) {
                    abu0Var.B();
                } else if (!z2 && (abu0Var.z.getValue() instanceof tau0)) {
                    abu0Var.z(abu0Var.D);
                }
                abu0Var.B = z2;
                return Unit.f46060a;
        }
    }
}

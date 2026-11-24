package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class tz20 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ uz20 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tz20(uz20 uz20Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = uz20Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        uz20 uz20Var = this.k;
        switch (b) {
            case 0:
                return new tz20(uz20Var, yjeVar, (byte) 0);
            default:
                return new tz20(uz20Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((tz20) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        dz20 dz20Var;
        byte b = this.i;
        uz20 uz20Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    nvu nvuVar = uz20Var.I;
                    long j = uz20Var.q.f46990a;
                    this.j = true;
                    if (nvuVar.I(j, this, true) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i = uz20.R;
                p7m0 p7m0Var = uz20Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    dz20Var = (dz20) value;
                } while (!p7m0Var.m(value, dz20.a(dz20Var, null, null, null, null, null, null, false, null, null, sf6.a(dz20Var.k, null, 1), false, 3063)));
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    nvu nvuVar2 = uz20Var.I;
                    long j2 = uz20Var.q.f46990a;
                    this.j = true;
                    if (nvuVar2.I(j2, this, false) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}

package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class jp4 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ kp4 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jp4(kp4 kp4Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = kp4Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        kp4 kp4Var = this.k;
        switch (b) {
            case 0:
                return new jp4(kp4Var, yjeVar, (byte) 0);
            default:
                return new jp4(kp4Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((jp4) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objD;
        Object value;
        Object value2;
        byte b = this.i;
        kp4 kp4Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    fnk fnkVar = kp4Var.p;
                    this.j = true;
                    if (fnkVar.a(this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i = kp4.D;
                kp4Var.G(a94.f458a);
                kp4Var.O();
                return Unit.f46060a;
            default:
                oyg0 oyg0Var = kp4Var.f;
                ocj ocjVar = kp4Var.i;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    dkj dkjVar = kp4Var.t;
                    this.j = true;
                    objD = dkjVar.f6232a.d(this);
                    if (objD == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objD = obj;
                }
                List list = (List) objD;
                int i2 = kp4.D;
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value, zn4.a((zn4) value, false, false, false, false, null, null, 158)));
                kp4Var.P(false);
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, zn4.a((zn4) value2, false, false, false, false, null, list, 123)));
                return Unit.f46060a;
        }
    }
}

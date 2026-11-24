package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class vr6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ wr6 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vr6(wr6 wr6Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = wr6Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        wr6 wr6Var = this.k;
        switch (b) {
            case 0:
                return new vr6(wr6Var, yjeVar, (byte) 0);
            default:
                vr6 vr6Var = new vr6(wr6Var, yjeVar, (byte) 1);
                vr6Var.j = ((Boolean) obj).booleanValue();
                return vr6Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((vr6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((vr6) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        wr6 wr6Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    xex xexVar = wr6Var.G;
                    this.j = true;
                    obj = xexVar.H(this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    int i = wr6.K;
                    wr6Var.G(ir6.f15241a);
                }
                return Unit.f46060a;
            default:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if ((((or6) wr6Var.D()).g || ((or6) wr6Var.D()).f) && z2) {
                    wr6Var.M();
                } else if ((((or6) wr6Var.D()).g || ((or6) wr6Var.D()).f) && !z2) {
                    p7m0 p7m0Var = wr6Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, or6.a((or6) value, null, null, 0, false, false, true, null, Response.UNSUPPORTED_MEDIA_TYPE)));
                }
                return Unit.f46060a;
        }
    }
}

package a;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class iaw extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ naw k;
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iaw(naw nawVar, long j, long j2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = nawVar;
        this.l = j;
        this.m = j2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new iaw(this.k, this.l, this.m, yjeVar, (byte) 0);
            default:
                return new iaw(this.k, this.l, this.m, yjeVar, (byte) 1);
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
        return ((iaw) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        naw nawVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    lef0 lef0Var = nawVar.s;
                    long j = this.l * 1000;
                    long j2 = this.m * 1000;
                    lef0Var.getClass();
                    TimeUnit.MILLISECONDS.getClass();
                    l77 l77Var = (l77) lef0Var.f19899a;
                    l77Var.getClass();
                    l77Var.f19543a.e = j;
                    l77Var.d = j2;
                    dv3 dv3Var = nawVar.r;
                    pdj pdjVar = pdj.b;
                    this.j = true;
                    if (dv3Var.a(pdjVar, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                List list = naw.d1;
                nawVar.P();
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    z220 z220Var = nawVar.u;
                    this.j = true;
                    if (z220Var.B(this.l, this.m, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                nawVar.Z0.f(j9w.f16160a);
                p7m0 p7m0Var = nawVar.W0;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, l9h0.a((l9h0) value, false, false, false, null, false, false, false, false, false, null, null, false, false, 32766)));
                return Unit.f46060a;
        }
    }
}

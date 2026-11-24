package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class yzh0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ zzh0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yzh0(zzh0 zzh0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = zzh0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        zzh0 zzh0Var = this.j;
        switch (b) {
            case 0:
                return new yzh0(zzh0Var, yjeVar, (byte) 0);
            default:
                return new yzh0(zzh0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((yzh0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((yzh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        yje yjeVar = null;
        zzh0 zzh0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = zzh0.C;
                zzh0Var.A = sac.V(jiu0.a(zzh0Var), new wzh0(zzh0Var, (byte) 3), null, null, new yzh0(zzh0Var, yjeVar, (byte) 1), 14);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                rrd rrdVar = zzh0Var.x;
                long j = ((tzh0) zzh0Var.D()).f;
                boolean z = ((tzh0) zzh0Var.D()).g;
                rrdVar.getClass();
                sac.T(new fnq(new vsg0(new up6(rrdVar, j, z, null)), new tye0(zzh0Var, yjeVar, (byte) 25), (byte) 4), d5c.S(jiu0.a(zzh0Var), zzh0Var.o.f22085a), foe.h);
                break;
        }
        return Unit.f46060a;
    }
}

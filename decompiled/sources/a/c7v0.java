package a;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class c7v0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ d7v0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c7v0(d7v0 d7v0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = d7v0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        d7v0 d7v0Var = this.j;
        switch (b) {
            case 0:
                return new c7v0(d7v0Var, yjeVar, (byte) 0);
            default:
                return new c7v0(d7v0Var, yjeVar, (byte) 1);
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
        return ((c7v0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        d7v0 d7v0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                d7v0Var.z(new z6v0(true));
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                b7v0 b7v0Var = new b7v0(System.currentTimeMillis() + (d7v0Var.n - SystemClock.elapsedRealtime()), d7v0Var.o);
                sac.V(jiu0.a(d7v0Var), new d4u0((byte) 22), null, d7v0Var.e.c, new n7t0(d7v0Var, b7v0Var, null, (byte) 15), 10);
                if (d7v0Var.n <= SystemClock.elapsedRealtime()) {
                    d7v0Var.w();
                    d7v0Var.l.cancel(null);
                }
                break;
        }
        return Unit.f46060a;
    }
}

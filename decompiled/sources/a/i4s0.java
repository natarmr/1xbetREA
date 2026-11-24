package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class i4s0 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ long j;
    public final /* synthetic */ z1s0 k;
    public final /* synthetic */ String l;
    public final /* synthetic */ i3t0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i4s0(i3t0 i3t0Var, long j, z1s0 z1s0Var, String str, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.m = i3t0Var;
        this.j = j;
        this.k = z1s0Var;
        this.l = str;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        i3t0 i3t0Var = this.m;
        switch (b) {
            case 0:
                return new i4s0((k4s0) i3t0Var, this.j, this.k, this.l, yjeVar, (byte) 0);
            case 1:
                return new i4s0((n6s0) i3t0Var, this.j, this.k, this.l, yjeVar, (byte) 1);
            default:
                return new i4s0((l7s0) i3t0Var, this.j, this.k, this.l, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((i4s0) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        i3t0 i3t0Var = this.m;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                k4s0 k4s0Var = (k4s0) i3t0Var;
                int i = k4s0.A;
                sac.V(jiu0.a(k4s0Var), new g4s0((byte) 2), null, k4s0Var.q.b, new fl3(k4s0Var, this.j, this.k, this.l, null, (byte) 6), 10);
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                n6s0 n6s0Var = (n6s0) i3t0Var;
                int i2 = n6s0.A;
                sac.V(jiu0.a(n6s0Var), new g4s0((byte) 7), null, n6s0Var.q.b, new fl3(n6s0Var, this.j, this.k, this.l, null, (byte) 7), 10);
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                l7s0 l7s0Var = (l7s0) i3t0Var;
                int i3 = l7s0.z;
                sac.V(jiu0.a(l7s0Var), new g4s0((byte) 12), null, l7s0Var.s.b, new fl3(l7s0Var, this.j, this.k, this.l, null, (byte) 8), 10);
                break;
        }
        return Unit.f46060a;
    }
}

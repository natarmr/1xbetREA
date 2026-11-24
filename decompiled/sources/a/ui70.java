package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ui70 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public double j;
    public gxo k;
    public boolean l;
    public final /* synthetic */ gxo m;
    public final /* synthetic */ double n;
    public w46 o;
    public final /* synthetic */ w46 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ui70(w46 w46Var, gxo gxoVar, double d, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.p = w46Var;
        this.m = gxoVar;
        this.n = d;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        w46 w46Var = this.p;
        switch (b) {
            case 0:
                return new ui70((vi70) w46Var, this.m, this.n, yjeVar, (byte) 0);
            default:
                return new ui70((ol70) w46Var, this.m, this.n, yjeVar, (byte) 1);
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
        return ((ui70) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        double d;
        double d2;
        byte b = this.i;
        double d3 = this.n;
        gxo gxoVar = this.m;
        w46 w46Var = this.p;
        switch (b) {
            case 0:
                vi70 vi70Var = (vi70) w46Var;
                wne wneVar = wne.f39444a;
                boolean z = this.l;
                if (!z) {
                    z1x.P(obj);
                    double dA = vi70Var.d.a();
                    if (d3 <= 0.0d) {
                        d3 = dA;
                    }
                    t0u t0uVar = vi70Var.k;
                    this.o = vi70Var;
                    this.k = gxoVar;
                    this.j = d3;
                    this.l = true;
                    obj = t0uVar.a(this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                    d = d3;
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d = this.j;
                    gxoVar = this.k;
                    vi70Var = (vi70) this.o;
                    z1x.P(obj);
                }
                vi70Var.x(new qi70(gxoVar, d, (String) obj));
                return Unit.f46060a;
            default:
                ol70 ol70Var = (ol70) w46Var;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.l;
                if (!z2) {
                    z1x.P(obj);
                    double dA2 = ol70Var.c.a();
                    if (d3 <= 0.0d) {
                        d3 = dA2;
                    }
                    t0u t0uVar2 = ol70Var.n;
                    this.o = ol70Var;
                    this.k = gxoVar;
                    this.j = d3;
                    this.l = true;
                    obj = t0uVar2.a(this);
                    if (obj == wneVar2) {
                        return wneVar2;
                    }
                    d2 = d3;
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d2 = this.j;
                    gxoVar = this.k;
                    ol70Var = (ol70) this.o;
                    z1x.P(obj);
                }
                ol70Var.z(new jl70(gxoVar, d2, (String) obj));
                return Unit.f46060a;
        }
    }
}

package a;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class zz6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ b07 k;
    public final /* synthetic */ rg5 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zz6(b07 b07Var, rg5 rg5Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = b07Var;
        this.l = rg5Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        rg5 rg5Var = this.l;
        b07 b07Var = this.k;
        switch (b) {
            case 0:
                return new zz6(b07Var, rg5Var, yjeVar, (byte) 0);
            case 1:
                return new zz6(b07Var, rg5Var, yjeVar, (byte) 1);
            case 2:
                return new zz6(b07Var, rg5Var, yjeVar, (byte) 2);
            default:
                return new zz6(b07Var, rg5Var, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((zz6) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        rg5 rg5Var = this.l;
        b07 b07Var = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.j = true;
                    List list = b07.w;
                    obj = b07Var.y(rg5Var, this);
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
                Pair pair = (Pair) obj;
                Object obj2 = pair.b;
                Object obj3 = pair.f46059a;
                b07Var.r = (String) obj2;
                Number number = (Number) obj3;
                b07Var.s = number.doubleValue();
                pn40 pn40Var = pn40.f27267a;
                b07Var.z(new nz6(pn40.d(number.doubleValue() * ((double) b07Var.t), b07Var.r, p3u0.c)));
                b07Var.z(new tz6(false));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    iqi iqiVar = b07Var.g;
                    long j = rg5Var.f30416a;
                    this.j = true;
                    obj = ((rkc0) iqiVar.b).a(((s470) iqiVar.c).a(), j, this);
                    if (obj == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return new Pair(new Double(((pl5) obj).d), rg5Var.d);
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (z3) {
                    if (z3) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                dq00 dq00Var = b07Var.h;
                int i = b07Var.t;
                boolean z4 = rg5Var.e;
                long j2 = rg5Var.f30416a;
                this.j = true;
                Object objB = ((rkc0) dq00Var.b).b(i, ((s470) dq00Var.c).a(), j2, this, z4);
                return objB == wneVar3 ? wneVar3 : objB;
            default:
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    dvj dvjVar = b07Var.e.b;
                    zz6 zz6Var = new zz6(b07Var, rg5Var, yjeVar, (byte) 2);
                    this.j = true;
                    obj = qjj.d0(dvjVar, zz6Var, this);
                    if (obj == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                b07Var.z(new pz6((k390) obj, b07Var.t, b07.w.indexOf(new Integer(b07Var.t))));
                b07Var.z(new tz6(false));
                return Unit.f46060a;
        }
    }
}

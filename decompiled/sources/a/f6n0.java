package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
public final class f6n0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ long k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f6n0(Object obj, Object obj2, long j, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = obj2;
        this.k = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        Object obj3 = this.l;
        switch (b) {
            case 0:
                return new f6n0((n660) obj3, (ql5) obj2, this.k, yjeVar, (byte) 0);
            case 1:
                return new f6n0((t33) obj3, (ngk0) obj2, this.k, yjeVar, (byte) 1);
            default:
                return new f6n0((y3v) obj3, (String) obj2, this.k, yjeVar, (byte) 2);
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
        }
        return ((f6n0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        long j = this.k;
        Object obj2 = this.m;
        Object obj3 = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    nw20 nw20Var = (nw20) ((n660) obj3).f22981a;
                    ql5 ql5Var = (ql5) obj2;
                    long j2 = ql5Var.f28916a;
                    long[] jArr = {j};
                    this.j = true;
                    if (nw20Var.m(j2, ql5Var, jArr, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    t33 t33Var = (t33) obj3;
                    ne60 ne60Var = (ne60) ((ngk0) obj2).get(new Long(j));
                    ne60 ne60Var2 = new ne60(ne60Var != null ? ne60Var.f23370a : 0L);
                    this.j = true;
                    if (t33Var.f(this, ne60Var2) == wneVar2) {
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
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    vqc vqcVar = (vqc) ((y3v) obj3).b;
                    this.j = true;
                    obj = ((hd5) ((azj0) vqcVar.b).b(sre0.f32672a.b(hd5.class), j)).b((String) obj2, this);
                    if (obj == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ResponseBody responseBody = (ResponseBody) obj;
                return new hc5(responseBody.a(), responseBody.getC());
        }
    }
}

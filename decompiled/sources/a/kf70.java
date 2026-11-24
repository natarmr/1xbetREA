package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class kf70 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ qf70 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kf70(qf70 qf70Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = qf70Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        qf70 qf70Var = this.k;
        switch (b) {
            case 0:
                return new kf70(qf70Var, yjeVar, (byte) 0);
            default:
                return new kf70(qf70Var, yjeVar, (byte) 1);
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
        return ((kf70) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        byte b = this.i;
        qf70 qf70Var = this.k;
        switch (b) {
            case 0:
                y5s y5sVar = qf70Var.E;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    hs60 hs60Var = qf70Var.A;
                    long jA = y5sVar.f42064a.a();
                    zn60 zn60Var = zn60.Main;
                    hs60Var.b(jA);
                    l7k l7kVar = qf70Var.B;
                    int iA = (int) y5sVar.f42064a.a();
                    y1p y1pVar = y1p.MAIN;
                    l7kVar.a(iA, "games", qf70Var.C.g());
                    this.j = true;
                    obj = qf70Var.z(this);
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
                qf70Var.w.a(qf70Var.b, true, ((ql5) obj).f28916a);
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    ql5 ql5VarA = qf70Var.n.a();
                    if (ql5VarA != null) {
                        nf60 nf60Var = new nf60(qf70Var, null, (byte) 16);
                        this.j = true;
                        if (qf70Var.J(ql5VarA, false, nf60Var, this) == wneVar2) {
                            return wneVar2;
                        }
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

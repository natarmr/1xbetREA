package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class y1y extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ a2y k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1y(a2y a2yVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = a2yVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        a2y a2yVar = this.k;
        switch (b) {
            case 0:
                return new y1y(a2yVar, yjeVar, (byte) 0);
            default:
                y1y y1yVar = new y1y(a2yVar, yjeVar, (byte) 1);
                y1yVar.j = ((Boolean) obj).booleanValue();
                return y1yVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((y1y) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((y1y) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        a2y a2yVar = this.k;
        switch (b) {
            case 0:
                mne mneVar = a2yVar.A;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    khf0 khf0Var = a2yVar.s;
                    bm5 bm5Var = bm5.m;
                    this.j = true;
                    obj = khf0.G(khf0Var, bm5Var, this);
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
                ql5 ql5Var = (ql5) obj;
                a2yVar.H(new uo1(ql5Var, a2yVar.w.f30857a.c(), ql5Var.b <= 0.0d));
                sac.V(jiu0.a(a2yVar), z1y.f43645a, null, mneVar.f22085a, new cin(a2yVar, null, (byte) 23), 10);
                c4m0 c4m0Var = a2yVar.F;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    i89 i89VarA = a2yVar.v.a(bm5.m);
                    v1x v1xVar = new v1x((byte) 20);
                    eoh0 eoh0Var = i120.f;
                    zys0.e(2, v1xVar);
                    a2yVar.F = sac.T(new fnq(i120.X(i89VarA, eoh0Var, v1xVar), new u5u(a2yVar, (yje) null, (byte) 23), (byte) 4), d5c.S(jiu0.a(a2yVar), mneVar.f22085a), new kaw(a2yVar, null, (byte) 11));
                }
                return Unit.f46060a;
            default:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i = a2y.G;
                p7m0 p7m0Var = a2yVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, s1y.a((s1y) value, null, null, z2, false, 95)));
                return Unit.f46060a;
        }
    }
}

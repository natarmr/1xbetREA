package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class b6y extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ e6y k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b6y(e6y e6yVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = e6yVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        e6y e6yVar = this.k;
        switch (b) {
            case 0:
                return new b6y(e6yVar, yjeVar, (byte) 0);
            default:
                b6y b6yVar = new b6y(e6yVar, yjeVar, (byte) 1);
                b6yVar.j = ((Boolean) obj).booleanValue();
                return b6yVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((b6y) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((b6y) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        e6y e6yVar = this.k;
        switch (b) {
            case 0:
                mne mneVar = e6yVar.A;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    khf0 khf0Var = e6yVar.s;
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
                e6yVar.H(new ns6((ql5) obj, e6yVar.w.f30857a.c(), (byte) 1));
                sac.V(jiu0.a(e6yVar), d6y.f5571a, null, mneVar.f22085a, new cin(e6yVar, null, (byte) 24), 10);
                c4m0 c4m0Var = e6yVar.F;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    i89 i89VarA = e6yVar.v.a(bm5.m);
                    v1x v1xVar = new v1x((byte) 22);
                    eoh0 eoh0Var = i120.f;
                    zys0.e(2, v1xVar);
                    e6yVar.F = sac.T(new fnq(i120.X(i89VarA, eoh0Var, v1xVar), new u5u(e6yVar, (yje) null, (byte) 26), (byte) 4), d5c.S(jiu0.a(e6yVar), mneVar.f22085a), new kaw(e6yVar, null, (byte) 14));
                }
                return Unit.f46060a;
            default:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i = e6y.G;
                p7m0 p7m0Var = e6yVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, x5y.a((x5y) value, null, null, z2, false, 47)));
                return Unit.f46060a;
        }
    }
}

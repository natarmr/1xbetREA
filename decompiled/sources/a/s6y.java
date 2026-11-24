package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class s6y extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public final /* synthetic */ t6y j;
    public boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6y(t6y t6yVar, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.j = t6yVar;
        this.k = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        t6y t6yVar = this.j;
        switch (b) {
            case 0:
                return new s6y(t6yVar, yjeVar);
            default:
                return new s6y(t6yVar, this.k, yjeVar);
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
        return ((s6y) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        yje yjeVar = null;
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.k;
                t6y t6yVar = this.j;
                if (!z) {
                    z1x.P(obj);
                    abu abuVar = t6yVar.j;
                    this.k = true;
                    obj = abuVar.w(this);
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
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ol60 ol60Var = t6yVar.q;
                if (zBooleanValue) {
                    ol60Var.f(l6y.f19531a);
                } else {
                    ol60Var.f(l6y.b);
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                boolean z2 = this.k;
                t6y t6yVar2 = this.j;
                if (z2 && !t6yVar2.m) {
                    sac.V(jiu0.a(t6yVar2), new g1y(1, t6yVar2, t6y.class, "handleErrorWithLottie", "handleErrorWithLottie(Ljava/lang/Throwable;)V", 0, (byte) 9), null, t6yVar2.h.b, new fhq(t6yVar2, yjeVar, (byte) 18), 10);
                    p7m0 p7m0Var = t6yVar2.o;
                    p7m0Var.getClass();
                    p7m0Var.o(null, m6y.f21294a);
                } else if (!z2 && !t6yVar2.m) {
                    sa10.b(t6yVar2.e, pb10.g, R.string.data_retrieval_error, 0, null, 28);
                }
                t6yVar2.m = z2;
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6y(t6y t6yVar, yje yjeVar) {
        super(2, yjeVar);
        this.j = t6yVar;
    }
}

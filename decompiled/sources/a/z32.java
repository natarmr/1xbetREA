package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class z32 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ org.xplatform.special_event.impl.alleventsgames.presentation.f k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z32(org.xplatform.special_event.impl.alleventsgames.presentation.f fVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = fVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        org.xplatform.special_event.impl.alleventsgames.presentation.f fVar = this.k;
        switch (b) {
            case 0:
                return new z32(fVar, yjeVar, (byte) 0);
            default:
                return new z32(fVar, yjeVar, (byte) 1);
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
        return ((z32) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        org.xplatform.special_event.impl.alleventsgames.presentation.f fVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    j3c j3cVar = fVar.u;
                    this.j = true;
                    obj = j3cVar.c(this);
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
                wcb wcbVar = (wcb) obj;
                int i = org.xplatform.special_event.impl.alleventsgames.presentation.f.Q;
                p7m0 p7m0Var = fVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, n32.a((n32) value, null, null, null, null, wcbVar, null, 239)));
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    yhi yhiVar = fVar.B;
                    int i2 = ((n32) fVar.D()).g.f14076a;
                    bvc bvcVarA = jiu0.a(fVar);
                    n0w n0wVar = n0w.f22720a;
                    boolean z3 = ((n32) fVar.D()).g.f;
                    this.j = true;
                    if (yhiVar.e(i2, bvcVarA, n0wVar, z3, this) == wneVar2) {
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
        }
    }
}

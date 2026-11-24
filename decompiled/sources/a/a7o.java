package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.game.universal.api.EsportsUniversalScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class a7o extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ b7o k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a7o(b7o b7oVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = b7oVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        b7o b7oVar = this.k;
        switch (b) {
            case 0:
                a7o a7oVar = new a7o(b7oVar, yjeVar, (byte) 0);
                a7oVar.j = ((Boolean) obj).booleanValue();
                return a7oVar;
            case 1:
                a7o a7oVar2 = new a7o(b7oVar, yjeVar, (byte) 1);
                a7oVar2.j = ((Boolean) obj).booleanValue();
                return a7oVar2;
            case 2:
                a7o a7oVar3 = new a7o(b7oVar, yjeVar, (byte) 2);
                a7oVar3.j = ((Boolean) obj).booleanValue();
                return a7oVar3;
            default:
                return new a7o(b7oVar, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((a7o) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((a7o) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((a7o) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((a7o) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objA;
        Object value2;
        byte b = this.i;
        b7o b7oVar = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = b7o.X;
                p7m0 p7m0Var = b7oVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, l6o.a((l6o) value, null, null, null, null, null, null, false, null, z, false, null, null, 0L, false, 66977791)));
                return Unit.f46060a;
            case 1:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (z2) {
                    b7oVar.z.h();
                }
                return Unit.f46060a;
            case 2:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i2 = b7o.X;
                p7m0 p7m0Var2 = b7oVar.i.f25029a;
                while (true) {
                    Object value3 = p7m0Var2.getValue();
                    value3.getClass();
                    boolean z4 = z3;
                    if (p7m0Var2.m(value3, l6o.a((l6o) value3, null, null, null, null, null, null, z4, null, false, false, null, null, 0L, false, 67106815))) {
                        return Unit.f46060a;
                    }
                    z3 = z4;
                }
                break;
            default:
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    j3c j3cVar = b7oVar.H;
                    EsportsUniversalScreenParams esportsUniversalScreenParams = b7oVar.p;
                    long j = esportsUniversalScreenParams.d;
                    long j2 = esportsUniversalScreenParams.e;
                    this.j = true;
                    objA = j3cVar.a(j, j2, this);
                    if (objA == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                ypl0 ypl0Var = (ypl0) objA;
                int i3 = b7o.X;
                p7m0 p7m0Var3 = b7oVar.i.f25029a;
                do {
                    value2 = p7m0Var3.getValue();
                    value2.getClass();
                } while (!p7m0Var3.m(value2, l6o.a((l6o) value2, null, null, null, ypl0Var, null, null, false, null, false, false, null, null, 0L, false, 67108847)));
                return Unit.f46060a;
        }
    }
}

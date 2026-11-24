package a;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class q5f0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ x5f0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q5f0(x5f0 x5f0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = x5f0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        x5f0 x5f0Var = this.k;
        switch (b) {
            case 0:
                return new q5f0(x5f0Var, yjeVar, (byte) 0);
            case 1:
                return new q5f0(x5f0Var, yjeVar, (byte) 1);
            default:
                q5f0 q5f0Var = new q5f0(x5f0Var, yjeVar, (byte) 2);
                q5f0Var.j = ((Boolean) obj).booleanValue();
                return q5f0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((q5f0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((q5f0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((q5f0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object value;
        Object objD;
        byte b = this.i;
        x5f0 x5f0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    b8u b8uVar = x5f0Var.r;
                    this.j = true;
                    objA = ((t090) b8uVar.f2175a).a(this);
                    if (objA == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                List list = (List) objA;
                int i = x5f0.z0;
                p7m0 p7m0Var = x5f0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, u4f0.a((u4f0) value, false, false, list, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, 1073741819)));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    jru jruVar = x5f0Var.l0;
                    boolean z3 = ((u4f0) x5f0Var.D()).m.k.h;
                    List list2 = ((u4f0) x5f0Var.D()).m.N.r;
                    this.j = true;
                    objD = jruVar.d(this, list2, z3);
                    if (objD == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objD = obj;
                }
                List list3 = (List) objD;
                q7f0 q7f0Var = ((u4f0) x5f0Var.D()).j;
                if (q7f0Var == null) {
                    q7f0Var = (q7f0) CollectionsKt.firstOrNull(list3);
                }
                q7f0 q7f0Var2 = q7f0Var;
                p7m0 p7m0Var2 = x5f0Var.i.f25029a;
                while (true) {
                    Object value2 = p7m0Var2.getValue();
                    value2.getClass();
                    q7f0 q7f0Var3 = q7f0Var2;
                    if (p7m0Var2.m(value2, u4f0.a((u4f0) value2, false, false, null, null, null, null, null, null, null, q7f0Var2, list3, false, null, false, null, null, null, null, null, null, null, null, 1073736703))) {
                        x5f0Var.x0.n(q7f0Var3);
                        return Unit.f46060a;
                    }
                    q7f0Var2 = q7f0Var3;
                }
                break;
            default:
                boolean z4 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i2 = x5f0.z0;
                p7m0 p7m0Var3 = x5f0Var.i.f25029a;
                while (true) {
                    Object value3 = p7m0Var3.getValue();
                    value3.getClass();
                    boolean z5 = z4;
                    if (p7m0Var3.m(value3, u4f0.a((u4f0) value3, false, false, null, null, null, null, null, null, null, null, null, false, null, z5, null, null, null, null, null, null, null, null, 1073676287))) {
                        return Unit.f46060a;
                    }
                    z4 = z5;
                }
                break;
        }
    }
}

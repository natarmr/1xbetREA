package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class nou0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ oou0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nou0(oou0 oou0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = oou0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        oou0 oou0Var = this.k;
        switch (b) {
            case 0:
                return new nou0(oou0Var, yjeVar, (byte) 0);
            default:
                nou0 nou0Var = new nou0(oou0Var, yjeVar, (byte) 1);
                nou0Var.j = ((Boolean) obj).booleanValue();
                return nou0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((nou0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((nou0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object value;
        Object value2;
        byte b = this.i;
        yje yjeVar = null;
        oou0 oou0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    r2u r2uVar = oou0Var.q;
                    ArrayList arrayList = oou0Var.t.f46573a;
                    this.j = true;
                    objA = r2uVar.a(arrayList, this);
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
                int i = oou0.w;
                p7m0 p7m0Var = oou0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, kou0.a((kou0) value, null, new j0g0(list), false, false, 13)));
                return Unit.f46060a;
            default:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (z2) {
                    int i2 = oou0.w;
                    bby bbyVar = oou0Var.v;
                    if (bbyVar == null || !bbyVar.isActive()) {
                        oou0Var.v = sac.V(jiu0.a(oou0Var), new npt0(oou0Var, (byte) 14), null, oou0Var.p.b, new nou0(oou0Var, yjeVar, (byte) 0), 10);
                    }
                }
                int i3 = oou0.w;
                p7m0 p7m0Var2 = oou0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, kou0.a((kou0) value2, null, null, false, z2, 7)));
                return Unit.f46060a;
        }
    }
}

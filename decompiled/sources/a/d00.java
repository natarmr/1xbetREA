package a;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class d00 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ g00 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d00(g00 g00Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = g00Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        g00 g00Var = this.j;
        switch (b) {
            case 0:
                return new d00(g00Var, yjeVar, (byte) 0);
            case 1:
                return new d00(g00Var, yjeVar, (byte) 1);
            default:
                return new d00(g00Var, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((d00) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((d00) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((d00) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0078  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        itc itcVar;
        int i;
        byte b = this.i;
        Object obj2 = null;
        g00 g00Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                mne mneVar = g00Var.p;
                if (((Collection) g00Var.A.getValue()).isEmpty()) {
                    sac.V(jiu0.a(g00Var), f00.f8695a, null, mneVar.b, new l1(g00Var, null, (byte) 6), 10);
                }
                c4m0 c4m0Var = g00Var.C;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    g00Var.C = sac.T(new fnq(g00Var.t.b(), new pa(g00Var, (yje) null, (byte) 7), (byte) 4), d5c.S(jiu0.a(g00Var), mneVar.f22085a), new pd(2, null, (byte) 4));
                }
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int iX = g00Var.x();
                if (iX != 0) {
                    ol60 ol60Var = g00Var.z;
                    Iterable iterable = (Iterable) g00Var.A.getValue();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : iterable) {
                        if (obj3 instanceof itc) {
                            arrayList.add(obj3);
                        }
                    }
                    for (Object obj4 : arrayList) {
                        if (((itc) obj4).c == vqp.g) {
                            obj2 = obj4;
                            itcVar = (itc) obj2;
                            if (itcVar != null) {
                                i = itcVar.f15347a;
                            } else {
                                i = 0;
                            }
                            ol60Var.f(new pz(i, iX));
                            break;
                        }
                    }
                    itcVar = (itc) obj2;
                    if (itcVar != null) {
                        i = itcVar.f15347a;
                    } else {
                        i = 0;
                    }
                    ol60Var.f(new pz(i, iX));
                }
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int iW = g00Var.w();
                if (iW != 0) {
                    g00Var.z.f(new vz(g00Var.x(), iW));
                }
                break;
        }
        return Unit.f46060a;
    }
}

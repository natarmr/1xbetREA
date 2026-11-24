package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class vj1 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ bk1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vj1(bk1 bk1Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = bk1Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        bk1 bk1Var = this.k;
        switch (b) {
            case 0:
                vj1 vj1Var = new vj1(bk1Var, yjeVar, (byte) 0);
                vj1Var.j = obj;
                return vj1Var;
            case 1:
                vj1 vj1Var2 = new vj1(bk1Var, yjeVar, (byte) 1);
                vj1Var2.j = obj;
                return vj1Var2;
            default:
                vj1 vj1Var3 = new vj1(bk1Var, yjeVar, (byte) 2);
                vj1Var3.j = obj;
                return vj1Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((vj1) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((vj1) create((f2j) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((vj1) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        bk1 bk1Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                bo0 bo0Var = new bo0((List) obj2, (byte) 5);
                int i = bk1.D;
                bk1Var.H(bo0Var);
                return Unit.f46060a;
            case 1:
                f2j f2jVar = (f2j) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (f2jVar == null || !(f2jVar instanceof f2j)) {
                    t9f.b();
                    return null;
                }
                String simpleName = qj1.class.getSimpleName();
                int i2 = bk1.D;
                a4j.c.getClass();
                String strA = usd.a(simpleName);
                bk1Var.y.k(strA);
                bk1Var.A.k(strA);
                bk1Var.G(f8d0.f9099a);
                j2j j2jVar = bk1Var.z;
                j2jVar.getClass();
                bby bbyVar = j2jVar.o;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                return Unit.f46060a;
            default:
                sw00 sw00Var = (sw00) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i3 = bk1.D;
                p7m0 p7m0Var = bk1Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, j8d0.a((j8d0) value, sw00Var.f32897a, null, null, null, 4087)));
                if (sw00Var.f32897a) {
                    bk1Var.M();
                }
                return Unit.f46060a;
        }
    }
}

package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class jbu0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ lbu0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jbu0(lbu0 lbu0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = lbu0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        lbu0 lbu0Var = this.k;
        switch (b) {
            case 0:
                return new jbu0(lbu0Var, yjeVar, (byte) 0);
            case 1:
                return new jbu0(lbu0Var, yjeVar, (byte) 1);
            default:
                jbu0 jbu0Var = new jbu0(lbu0Var, yjeVar, (byte) 2);
                jbu0Var.j = ((Boolean) obj).booleanValue();
                return jbu0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((jbu0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((jbu0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((jbu0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        bby bbyVar;
        byte b = this.i;
        boolean z = false;
        lbu0 lbu0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    woc wocVar = lbu0Var.u;
                    this.j = true;
                    if (wocVar.a(false, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                List list = lbu0.J;
                lbu0Var.G(cbu0.f4078a);
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    this.j = true;
                    List list2 = lbu0.J;
                    obj = lbu0Var.M(true, this);
                    if (obj == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                cau0 cau0Var = ((m2c0) obj).e0;
                List list3 = lbu0.J;
                p7m0 p7m0Var = lbu0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, ebu0.a((ebu0) value, cau0Var, null, 61)));
                if (!lbu0.J.contains(((ebu0) lbu0Var.D()).b) && (bbyVar = lbu0Var.G) != null) {
                    bbyVar.cancel(null);
                }
                return Unit.f46060a;
            default:
                boolean z4 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                boolean z5 = !z4 && ((ebu0) lbu0Var.D()).c == x9u0.f40526a;
                if (z4 && ((ebu0) lbu0Var.D()).c == x9u0.c) {
                    z = true;
                }
                if (z5 || z) {
                    List list4 = lbu0.J;
                    lbu0Var.N();
                }
                return Unit.f46060a;
        }
    }
}

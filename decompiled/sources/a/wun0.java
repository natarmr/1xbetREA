package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class wun0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ bvn0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wun0(bvn0 bvn0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = bvn0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        bvn0 bvn0Var = this.k;
        switch (b) {
            case 0:
                return new wun0(bvn0Var, yjeVar, (byte) 0);
            default:
                return new wun0(bvn0Var, yjeVar, (byte) 1);
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
        return ((wun0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objV;
        Object value;
        Object value2;
        byte b = this.i;
        bvn0 bvn0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    kvu kvuVar = bvn0Var.x;
                    this.j = true;
                    objV = kvuVar.f18971a.v(this);
                    if (objV == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objV = obj;
                }
                boolean z2 = !((Collection) objV).isEmpty();
                int i = bvn0.E;
                p7m0 p7m0Var = bvn0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, gvn0.a((gvn0) value, false, false, z2, false, null, null, null, 251)));
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    List<hpn0> list = ((gvn0) bvn0Var.D()).f;
                    ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                    for (hpn0 hpn0Var : list) {
                        bvn0Var.H(new uun0(hpn0Var.f13452a, false, hpn0Var.c));
                        arrayList.add(hpn0.a(hpn0Var, false));
                    }
                    p7m0 p7m0Var2 = bvn0Var.i.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                    } while (!p7m0Var2.m(value2, gvn0.a((gvn0) value2, false, false, false, false, null, arrayList, null, 223)));
                    bvn0Var.Q();
                    this.j = true;
                    if (bvn0Var.S(this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}

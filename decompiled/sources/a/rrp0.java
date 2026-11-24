package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class rrp0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ urp0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rrp0(urp0 urp0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = urp0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        urp0 urp0Var = this.k;
        switch (b) {
            case 0:
                return new rrp0(urp0Var, yjeVar, (byte) 0);
            case 1:
                return new rrp0(urp0Var, yjeVar, (byte) 1);
            default:
                return new rrp0(urp0Var, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((rrp0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        h660 h660Var = h660.f12515a;
        urp0 urp0Var = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    xae0 xae0Var = urp0Var.s;
                    qrp0 qrp0Var = new qrp0(urp0Var, yjeVar, (byte) 0);
                    this.j = true;
                    Object objC = xae0Var.f40549a.c(new vnq(h660Var, qrp0Var, (byte) 2), this);
                    if (objC != wneVar) {
                        objC = Unit.f46060a;
                    }
                    if (objC != wneVar) {
                        objC = Unit.f46060a;
                    }
                    if (objC == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                vzg0 vzg0Var = urp0Var.b;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    p6d p6dVarA = urp0Var.j.a(urp0Var.d);
                    this.j = true;
                    obj = ntb.K(p6dVarA, this);
                    if (obj == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Integer(((rfp0) it.next()).b));
                }
                Set setP0 = CollectionsKt.P0(arrayList);
                vzg0Var.e("INITIAL_SELECTED_IDS", setP0);
                vzg0Var.e("SELECTED_IDS", new crp0(setP0));
                return Unit.f46060a;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    gmq gmqVarB = urp0Var.f.b();
                    din0 din0Var = new din0((diu0) urp0Var, yjeVar, (byte) 3);
                    this.j = true;
                    Object objC2 = gmqVarB.c(new vnq(h660Var, din0Var, (byte) 2), this);
                    if (objC2 != wneVar3) {
                        objC2 = Unit.f46060a;
                    }
                    if (objC2 != wneVar3) {
                        objC2 = Unit.f46060a;
                    }
                    if (objC2 == wneVar3) {
                        return wneVar3;
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

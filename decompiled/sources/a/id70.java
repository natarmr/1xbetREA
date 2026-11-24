package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class id70 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ xd70 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ id70(xd70 xd70Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = xd70Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        xd70 xd70Var = this.j;
        switch (b) {
            case 0:
                return new id70(xd70Var, yjeVar, (byte) 0);
            case 1:
                return new id70(xd70Var, yjeVar, (byte) 1);
            default:
                return new id70(xd70Var, yjeVar, (byte) 2);
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
        return ((id70) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        xd70 xd70Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                pgr pgrVar = new pgr(false, ((xb70) xd70Var.D()).n.e);
                Object obj2 = xd70Var.j0.get();
                obj2.getClass();
                xd70Var.m0(pgrVar.a((vby) obj2));
                if (!((xb70) xd70Var.D()).h) {
                    xd70Var.l0();
                    i1w0 i1w0Var = xd70Var.q;
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                    ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorP;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                }
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i = xd70.B0;
                p7m0 p7m0Var = xd70Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, xb70.a((xb70) value, null, null, null, false, false, false, false, false, null, false, false, 0, false, null, null, null, null, 129023)));
                xd70Var.G(new qb70(((xb70) xd70Var.D()).c));
                xd70Var.G(new rb70(((xb70) xd70Var.D()).c));
                if (((xb70) xd70Var.D()).g) {
                    xd70Var.t0();
                }
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                xd70Var.G(new rb70(((xb70) xd70Var.D()).c));
                break;
        }
        return Unit.f46060a;
    }
}

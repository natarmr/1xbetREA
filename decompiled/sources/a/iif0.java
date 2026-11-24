package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class iif0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ jif0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iif0(jif0 jif0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = jif0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        jif0 jif0Var = this.k;
        switch (b) {
            case 0:
                return new iif0(jif0Var, yjeVar, (byte) 0);
            default:
                return new iif0(jif0Var, yjeVar, (byte) 1);
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
        return ((iif0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        jif0 jif0Var = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    cu cuVar = jif0Var.o;
                    this.j = true;
                    if (cuVar.l(this) == wneVar) {
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
            default:
                i1w0 i1w0Var = jif0Var.s;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    if (((gif0) jif0Var.D()).f11343a.equals(((gif0) jif0Var.D()).b)) {
                        gxu gxuVar = jif0Var.p;
                        this.j = true;
                        obj = gxuVar.n(this);
                        if (obj == wneVar2) {
                            return wneVar2;
                        }
                    } else {
                        p7m0 p7m0Var = jif0Var.i.f25029a;
                        do {
                            value = p7m0Var.getValue();
                            value.getClass();
                        } while (!p7m0Var.m(value, gif0.a((gif0) value, "", true, true, 1)));
                    }
                    return Unit.f46060a;
                }
                if (!z2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                krc krcVar = jif0Var.q;
                byte b2 = 0;
                p0w0 p0w0Var = p0w0.f26173a;
                if (zBooleanValue) {
                    krcVar.b();
                    sac.V(jiu0.a(jif0Var), new eme0(jif0Var, (byte) 11), null, jif0Var.r.f22085a, new iif0(jif0Var, yjeVar, b2), 10);
                    jif0Var.G(cif0.f4411a);
                    i1w0Var.getClass();
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    ListIterator listIteratorP = b1j.p(copyOnWriteArrayList, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayList, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorP;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                } else {
                    krcVar.b();
                    i1w0Var.getClass();
                    CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
                    ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayList2, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayList2, 0);
                    while (true) {
                        paw pawVar2 = (paw) listIteratorP2;
                        if (pawVar2.hasNext()) {
                            i1w0Var.a((oe50) pawVar2.next());
                        }
                    }
                }
                return Unit.f46060a;
        }
    }
}

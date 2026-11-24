package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class i1c extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ s1c j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1c(s1c s1cVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = s1cVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        s1c s1cVar = this.j;
        switch (b) {
            case 0:
                return new i1c(s1cVar, yjeVar, (byte) 0);
            default:
                return new i1c(s1cVar, yjeVar, (byte) 1);
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
        return ((i1c) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        s1c s1cVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                i1w0 i1w0Var = s1cVar.c;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, r0w0.f29649a), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (pawVar.hasNext()) {
                        i1w0Var.a((oe50) pawVar.next());
                    }
                    break;
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var = s1cVar.x;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, f1c.a((f1c) value, "", false, false, false, 253)));
                break;
        }
        return Unit.f46060a;
    }
}

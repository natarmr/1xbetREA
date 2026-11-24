package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class e20 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ f20 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e20(f20 f20Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = f20Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        f20 f20Var = this.j;
        switch (b) {
            case 0:
                return new e20(f20Var, yjeVar, (byte) 0);
            default:
                return new e20(f20Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((e20) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((e20) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        f20 f20Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                i1w0 i1w0Var = f20Var.c;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, u0w0.f34875a), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        f20Var.B.f(x10.f40097a);
                    } else {
                        i1w0Var.a((oe50) pawVar.next());
                    }
                    break;
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                f20Var.y(f20Var.D);
                break;
        }
        return Unit.f46060a;
    }
}

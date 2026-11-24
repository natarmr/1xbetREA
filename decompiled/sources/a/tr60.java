package a;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class tr60 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ bs60 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tr60(bs60 bs60Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = bs60Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        bs60 bs60Var = this.j;
        switch (b) {
            case 0:
                return new tr60(bs60Var, yjeVar, (byte) 0);
            case 1:
                return new tr60(bs60Var, yjeVar, (byte) 1);
            default:
                return new tr60(bs60Var, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((tr60) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((tr60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((tr60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        bs60 bs60Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                return bs60Var.M.p(true);
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                i1w0 i1w0VarC = bs60Var.y.c();
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                c8d c8dVar = new c8d(y7d.f42146a, o0w0.f24450a);
                ListIterator listIterator = cs0.h(copyOnWriteArrayListQ, c8dVar, c8dVar, i1w0VarC, copyOnWriteArrayListQ).listIterator(0);
                while (true) {
                    paw pawVar = (paw) listIterator;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0VarC.a((oe50) pawVar.next());
                }
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int iB = bs60Var.G.b();
                int i = bs60Var.I.c().f28665a;
                Iterable<lxl> iterable = ((w370) bs60Var.D()).g.c;
                if (iterable == null) {
                    iterable = iun.f15405a;
                }
                ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                for (lxl lxlVar : iterable) {
                    arrayList.add(lxl.a(lxlVar, ((int) lxlVar.f20819a) == iB ? uxl.b : uxl.f36445a));
                }
                bs60Var.H(new al1((byte) 3, i, iB, (Object) arrayList));
                return Unit.f46060a;
        }
    }
}

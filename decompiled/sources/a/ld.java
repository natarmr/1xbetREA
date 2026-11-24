package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ld implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19823a;
    public final /* synthetic */ nd b;

    public /* synthetic */ ld(nd ndVar, byte b) {
        this.f19823a = b;
        this.b = ndVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f19823a;
        nd ndVar = this.b;
        switch (b) {
            case 0:
                jdk0 jdk0Var = nd.S1;
                ndVar.H0();
                return Unit.f46060a;
            case 1:
                jdk0 jdk0Var2 = nd.S1;
                ndVar.H0();
                return Unit.f46060a;
            case 2:
                jdk0 jdk0Var3 = nd.S1;
                qd qdVar = (qd) ndVar.M1.getValue();
                if (qdVar.l) {
                    qdVar.b.d(new t1(qdVar, (byte) 6));
                }
                return Unit.f46060a;
            case 3:
                jdk0 jdk0Var4 = nd.S1;
                i1w0 i1w0VarF = a4n0.f(ndVar);
                yfi yfiVar = ndVar.K1;
                if (yfiVar != null) {
                    return new ry3(i1w0VarF, yfiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 4:
                jdk0 jdk0Var5 = nd.S1;
                t0 t0Var = new t0(1, (qd) ndVar.M1.getValue(), qd.class, "onAccountSelected", "onAccountSelected(J)V", 0, (byte) 11);
                String strH = ndVar.H(R.string.account_id_v2);
                strH.getClass();
                kd kdVar = new kd();
                gbn gbnVar = new gbn(new hhd((byte) 17), new l9(3, (byte) 10), new k1(t0Var, strH, (byte) 11), m9.l);
                dp dpVar = kdVar.d;
                dpVar.b(gbnVar);
                dpVar.b(new gbn(new shq0((byte) 9), new d8q0(3, (byte) 6), new t6q0((byte) 20), pfo0.o));
                return kdVar;
            default:
                jdk0 jdk0Var6 = nd.S1;
                qd qdVar2 = (qd) ndVar.M1.getValue();
                we50 we50Var = (we50) ndVar.Q1.n(ndVar, nd.U1[3]);
                i1w0 i1w0Var = qdVar2.b;
                if (od.f25053a[we50Var.ordinal()] != 1) {
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                    ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new d1w0(qdVar2.d.G0(we50.d))), i1w0Var, copyOnWriteArrayListQ, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorP;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                } else if (((d190) qdVar2.c.f16851a.f10448a).e == pwf0.c) {
                    CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
                    ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, new q0w0(jh70.j(qdVar2.f, false))), i1w0Var, copyOnWriteArrayListQ2, 0);
                    while (true) {
                        paw pawVar2 = (paw) listIteratorP2;
                        if (pawVar2.hasNext()) {
                            i1w0Var.a((oe50) pawVar2.next());
                        }
                    }
                } else {
                    CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var);
                    ListIterator listIteratorP3 = b1j.p(copyOnWriteArrayListQ3, new c8d(y7d.f42146a, new d1w0(qdVar2.e.f0())), i1w0Var, copyOnWriteArrayListQ3, 0);
                    while (true) {
                        paw pawVar3 = (paw) listIteratorP3;
                        if (pawVar3.hasNext()) {
                            i1w0Var.a((oe50) pawVar3.next());
                        }
                    }
                }
                return Unit.f46060a;
        }
    }
}

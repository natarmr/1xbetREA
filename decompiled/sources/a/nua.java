package a;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class nua extends i3t0 {
    public static final /* synthetic */ int t = 0;
    public final i1w0 o;
    public final hwt p;
    public final tqt q;
    public final hwt r;
    public final a7q s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nua(vzg0 vzg0Var, i1w0 i1w0Var, mne mneVar, ctf0 ctf0Var, hwt hwtVar, tqt tqtVar, hwt hwtVar2, a7q a7qVar, pru pruVar) {
        super(null, new hc0(pruVar, (byte) 15), new ep4(ctf0Var, (byte) 14), cvm0.p(mneVar.f22085a, mneVar.c), null);
        ctf0Var.getClass();
        this.o = i1w0Var;
        this.p = hwtVar;
        this.q = tqtVar;
        this.r = hwtVar2;
        this.s = a7qVar;
        i3t0.K(this, null, null, new pn(this, null, (byte) 15), 3);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        lua luaVar;
        Object value2;
        Object value3;
        ArrayList arrayListN0;
        uta utaVar = (uta) obj;
        utaVar.getClass();
        super.x(utaVar);
        if (utaVar instanceof nta) {
            E();
            return;
        }
        boolean z = utaVar instanceof qta;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z) {
            qta qtaVar = (qta) utaVar;
            int i = qtaVar.f29290a;
            int i2 = qtaVar.b;
            List list = ((lua) D()).c;
            if (i == i2 || i < 0 || i >= list.size() || i2 < 0 || i2 >= list.size()) {
                return;
            }
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value3 = p7m0Var.getValue();
                value3.getClass();
                oyg0Var.getClass();
                arrayListN0 = CollectionsKt.N0(list);
                arrayListN0.add(i2, arrayListN0.remove(i));
            } while (!p7m0Var.m(value3, lua.a((lua) value3, null, arrayListN0, null, null, null, false, 123)));
            return;
        }
        if (utaVar instanceof tta) {
            List list2 = ((lua) D()).c;
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value2 = p7m0Var2.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value2, lua.a((lua) value2, null, null, null, null, null, true, 63)));
            i3t0.K(this, null, null, new za(this, list2, null, (byte) 28), 3);
            return;
        }
        if (utaVar instanceof rta) {
            G(jua.f17143a);
            return;
        }
        if (utaVar instanceof sta) {
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value = p7m0Var3.getValue();
                value.getClass();
                luaVar = (lua) value;
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value, lua.a(luaVar, null, luaVar.d, null, null, null, false, 123)));
            return;
        }
        boolean z2 = utaVar instanceof ota;
        p0w0 p0w0Var = p0w0.f26173a;
        i1w0 i1w0Var = this.o;
        if (z2) {
            if (!Intrinsics.d(((lua) D()).c, ((lua) D()).f)) {
                G(iua.f15386a);
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            if (!(utaVar instanceof pta)) {
                t9f.b();
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ2, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorP2;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
    }
}

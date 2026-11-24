package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class s91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rl1 f31829a;
    public final ehf0 b;
    public final gx3 c;
    public final qoj0 d;
    public final p7m0 e;
    public final boolean f;

    public s91(rl1 rl1Var, ehf0 ehf0Var, pru pruVar) {
        rl1Var.getClass();
        this.f31829a = rl1Var;
        this.b = ehf0Var;
        this.c = new gx3(5);
        this.d = roj0.a(1, 1, i99.b);
        this.e = q7m0.a(ir1.c);
        this.f = pruVar.a().b.C;
    }

    public static void d(s91 s91Var, lr1 lr1Var, boolean z, boolean z2, int i) {
        Boolean bool;
        byte b = 0;
        boolean z3 = (i & 2) == 0 || ((lr1) s91Var.e.getValue()).f20507a == lr1Var.f20507a;
        boolean z4 = (i & 4) != 0 ? false : z;
        boolean z5 = (i & 8) != 0 ? z4 : z2;
        gx3 gx3Var = s91Var.c;
        rl1 rl1Var = s91Var.f31829a;
        p7m0 p7m0Var = s91Var.e;
        lr1Var.getClass();
        ir1 ir1Var = ir1.c;
        if (lr1Var.equals(ir1Var)) {
            return;
        }
        mr1 mr1Var = ((lr1) p7m0Var.getValue()).f20507a;
        mr1 mr1Var2 = lr1Var.f20507a;
        tm1 tm1Var = lr1Var.b;
        boolean z6 = mr1Var == mr1Var2;
        if (!z6 || !z4) {
            if (z6) {
                return;
            }
            boolean zBooleanValue = (z3 || (bool = (Boolean) gx3Var.get(mr1Var2.name())) == null) ? false : bool.booleanValue();
            if (!Intrinsics.d(p7m0Var.getValue(), ir1Var)) {
                lr1 lr1Var2 = (lr1) p7m0Var.getValue();
                rl1Var.getClass();
                lr1Var2.getClass();
                FragmentScreen fragmentScreenW = rl1Var.h.w(lr1Var2.b, new AggregatorScreenModel(null, null, 0L, null, null, 0L, 0L, null, false, 511), false);
                rl1Var.b(new ryg0(fragmentScreenW, fragmentScreenW.getF45455a()));
            }
            if (z3) {
                rl1Var.g(lr1Var);
            }
            if (zBooleanValue) {
                rl1Var.getClass();
                FragmentScreen fragmentScreenW2 = rl1Var.h.w(tm1Var, new AggregatorScreenModel(null, null, 0L, null, null, 0L, 0L, null, false, 511), false);
                rl1Var.b(new szf0(fragmentScreenW2, fragmentScreenW2.getF45455a()));
            } else {
                rl1Var.d(new r91(s91Var, lr1Var, z5, b));
                gx3Var.put(mr1Var2.name(), Boolean.TRUE);
            }
            s91Var.e(lr1Var);
            return;
        }
        rl1Var.getClass();
        FragmentScreen fragmentScreenW3 = rl1Var.h.w(tm1Var, new AggregatorScreenModel(null, null, 0L, null, null, 0L, 0L, null, false, 511), z5);
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.add(new c8d(y7d.f42146a, new y0w0(fragmentScreenW3)));
        ListIterator listIterator = rl1Var.c().d(copyOnWriteArrayList).listIterator(0);
        while (true) {
            paw pawVar = (paw) listIterator;
            if (!pawVar.hasNext()) {
                gx3Var.put(mr1Var2.name(), Boolean.TRUE);
                s91Var.e(lr1Var);
                return;
            }
            rl1Var.a((oe50) pawVar.next());
        }
    }

    public final void a() {
        rl1 rl1Var = this.f31829a;
        rl1Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.add(new c8d(y7d.f42146a, p0w0.f26173a));
        ListIterator listIterator = rl1Var.c().d(copyOnWriteArrayList).listIterator(0);
        while (true) {
            paw pawVar = (paw) listIterator;
            if (!pawVar.hasNext()) {
                return;
            } else {
                rl1Var.a((oe50) pawVar.next());
            }
        }
    }

    public final void b(AggregatorScreenModel aggregatorScreenModel, AggregatorScreenModel aggregatorScreenModel2) {
        tm1 tm1Var = aggregatorScreenModel.d;
        tm1 tm1Var2 = aggregatorScreenModel2.d;
        gm1 gm1Var = gm1.f11520a;
        if (Intrinsics.d(tm1Var2, gm1Var)) {
            return;
        }
        ehf0 ehf0Var = this.b;
        FragmentScreen fragmentScreenW = ehf0Var.w(tm1Var2, aggregatorScreenModel2, false);
        FragmentScreen fragmentScreenW2 = !Intrinsics.d(tm1Var, gm1Var) ? ehf0Var.w(tm1Var, aggregatorScreenModel, false) : null;
        rl1 rl1Var = this.f31829a;
        rl1Var.getClass();
        k0w0 k0w0Var = new k0w0(rl1Var);
        k0w0Var.c(fragmentScreenW2);
        k0w0Var.h(fragmentScreenW);
        ListIterator listIterator = rl1Var.c().d(k0w0Var.f17489a).listIterator(0);
        while (true) {
            paw pawVar = (paw) listIterator;
            if (!pawVar.hasNext()) {
                return;
            } else {
                rl1Var.a((oe50) pawVar.next());
            }
        }
    }

    public final void c(AggregatorScreenModel aggregatorScreenModel) {
        tm1 tm1Var = aggregatorScreenModel.d;
        if (Intrinsics.d(tm1Var, gm1.f11520a)) {
            return;
        }
        FragmentScreen fragmentScreenW = this.b.w(tm1Var, aggregatorScreenModel, false);
        rl1 rl1Var = this.f31829a;
        rl1Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        if (fragmentScreenW instanceof DialogScreen) {
            copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenW)));
        } else {
            copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenW)));
        }
        ListIterator listIterator = rl1Var.c().d(copyOnWriteArrayList).listIterator(0);
        while (true) {
            paw pawVar = (paw) listIterator;
            if (!pawVar.hasNext()) {
                return;
            } else {
                rl1Var.a((oe50) pawVar.next());
            }
        }
    }

    public final void e(lr1 lr1Var) {
        this.e.n(lr1Var);
        this.d.g(new p91(lr1Var, this.f));
        uo0.b = lr1Var;
    }
}

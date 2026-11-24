package a;

import android.os.Handler;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes3.dex */
public class i1w0 {
    public wzu0 c;
    public jmv0 d;
    public gdv0 e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cu f14021a = new cu((byte) 12);
    public final ajc b = new ajc((byte) 1);
    public final n0o0 f = maz.b(new h1w0(this, 0));
    public final n0o0 g = maz.b(new h1w0(this, 1));

    public final void a(oe50 oe50Var) {
        if (oe50Var != null) {
            if (oe50Var instanceof fe50) {
                b(new dwq(((fe50) oe50Var).f9389a));
                return;
            }
            if (oe50Var instanceof ke50) {
                b(new xkf0(((ke50) oe50Var).f18137a));
                return;
            }
            if (oe50Var instanceof td50) {
                b(new nb5());
                return;
            }
            if (oe50Var instanceof ud50) {
                b(new ac5(((ud50) oe50Var).f35464a));
                return;
            }
            if (oe50Var instanceof he50) {
                b(new ac5(null), new xkf0(((he50) oe50Var).f12904a));
                return;
            }
            if (oe50Var instanceof ee50) {
                b(new ac5(null), new nb5());
                return;
            }
            if (oe50Var instanceof me50) {
                b(new x4m0(((me50) oe50Var).f21628a));
                return;
            }
            if (oe50Var instanceof de50) {
                b(new afq());
                return;
            }
            if (oe50Var instanceof ie50) {
                b(new gn50(((ie50) oe50Var).f14617a));
                return;
            }
            if (oe50Var instanceof vd50) {
                b(new bc5(((vd50) oe50Var).f37216a));
                return;
            }
            if (oe50Var instanceof ge50) {
                Iterator it = ((ge50) oe50Var).f11136a.iterator();
                while (it.hasNext()) {
                    b(new dwq((m7h0) it.next()));
                }
                return;
            }
            if (oe50Var instanceof le50) {
                le50 le50Var = (le50) oe50Var;
                DialogScreen dialogScreen = le50Var.f19884a;
                bjk bjkVar = le50Var.b;
                b(new psj0(dialogScreen, bjkVar.b, bjkVar.c));
                return;
            }
            if (oe50Var instanceof zd50) {
                throw null;
            }
            if (oe50Var instanceof yd50) {
                bjk bjkVar2 = ((yd50) oe50Var).f42417a;
                b(new kvk(bjkVar2.b, bjkVar2.d));
                return;
            }
            if (oe50Var instanceof je50) {
                je50 je50Var = (je50) oe50Var;
                b(new gw70(je50Var.f16357a, je50Var.b));
                return;
            }
            if (oe50Var instanceof wd50) {
                throw null;
            }
            if (oe50Var instanceof xd50) {
                throw null;
            }
            if (oe50Var instanceof sd50) {
                ((sd50) oe50Var).f32016a.invoke();
                return;
            }
            if (oe50Var instanceof ne50) {
                wzu0 wzu0Var = this.c;
                if (wzu0Var != null) {
                    wzu0Var.invoke(((ne50) oe50Var).f23368a);
                    return;
                }
                return;
            }
            if (oe50Var instanceof ae50) {
                mf50 mf50VarC = c();
                v7d v7dVar = y7d.f42146a;
                g1w0 g1w0Var = ((ae50) oe50Var).f711a;
                mf50VarC.getClass();
                v7dVar.getClass();
                g1w0Var.getClass();
                List list = (List) mf50VarC.e(v7dVar, g1w0Var).f46059a;
                mf50VarC.c(kotlin.collections.a.c(new c8d(v7dVar, g1w0Var)));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    a((oe50) it2.next());
                }
                return;
            }
            if (oe50Var instanceof be50) {
                for (ho4 ho4Var : ((be50) oe50Var).f2431a) {
                    mf50 mf50VarC2 = c();
                    w7d w7dVar = ho4Var.b;
                    q0w0 q0w0Var = ho4Var.f13376a;
                    mf50VarC2.getClass();
                    w7dVar.getClass();
                    List list2 = (List) mf50VarC2.e(w7dVar, q0w0Var).f46059a;
                    mf50VarC2.c(kotlin.collections.a.c(new c8d(w7dVar, q0w0Var)));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        a((oe50) it3.next());
                    }
                }
                return;
            }
            if (oe50Var instanceof ce50) {
                ListIterator listIterator = c().d(((ce50) oe50Var).f4196a).listIterator(0);
                while (true) {
                    paw pawVar = (paw) listIterator;
                    if (!pawVar.hasNext()) {
                        return;
                    } else {
                        a((oe50) pawVar.next());
                    }
                }
            }
        }
        t9f.b();
    }

    public final void b(t7d... t7dVarArr) {
        cu cuVar = this.f14021a;
        cuVar.getClass();
        ((Handler) cuVar.d).post(new fy2(cuVar, t7dVarArr, (byte) 26));
    }

    public final mf50 c() {
        return (mf50) this.g.getValue();
    }

    public final void d(Function1 function1) {
        function1.getClass();
        k0w0 k0w0Var = new k0w0(this);
        function1.invoke(k0w0Var);
        ListIterator listIteratorO = b1j.o(this, k0w0Var.f17489a, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return;
            } else {
                a((oe50) pawVar.next());
            }
        }
    }

    public final void e(Object obj, String str) {
        obj.getClass();
        ajc ajcVar = this.b;
        ajcVar.getClass();
        t2g0 t2g0Var = (t2g0) ajcVar.f967a.remove(str);
        if (t2g0Var == null) {
            return;
        }
        t2g0Var.onResult(obj);
    }

    public final uq f(String str, t2g0 t2g0Var) {
        ajc ajcVar = this.b;
        ajcVar.getClass();
        ajcVar.f967a.put(str, t2g0Var);
        return new uq((Object) ajcVar, (Object) str, (byte) 27);
    }
}

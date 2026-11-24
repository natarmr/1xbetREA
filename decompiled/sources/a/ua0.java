package a;

import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$AggregatorMainScreen;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class ua0 extends rs3 {
    public final i1w0 f;
    public final f8 g;

    /* JADX WARN: Illegal instructions before constructor call */
    public ua0(kxq kxqVar, androidx.fragment.app.e eVar, i1w0 i1w0Var, f8 f8Var) {
        m1r m1rVarS = eVar.S();
        m1rVarS.getClass();
        eVar.getClass();
        i1w0Var.getClass();
        super(kxqVar, R.id.fragmentContainer, eVar, m1rVarS);
        this.f = i1w0Var;
        this.g = f8Var;
    }

    @Override // a.rs3
    public final void a(t7d t7dVar) {
        t7dVar.getClass();
        if (t7dVar instanceof dwq) {
            m7h0 m7h0Var = ((dwq) t7dVar).f6811a;
            if (m7h0Var instanceof AggregatorScreens$AggregatorMainScreen) {
                i1w0 i1w0Var = this.f;
                i1w0Var.getClass();
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                m7h0Var.getClass();
                if (m7h0Var instanceof DialogScreen) {
                    copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) m7h0Var)));
                } else {
                    copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(m7h0Var)));
                }
                ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayList, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar.next());
                    }
                }
            }
        }
        boolean z = t7dVar instanceof tb50;
        androidx.fragment.app.e eVar = this.c;
        if (z) {
            tb50 tb50Var = (tb50) t7dVar;
            FragmentScreen fragmentScreen = tb50Var.f33647a;
            String str = tb50Var.b;
            Fragment fragmentA = fragmentScreen.a(this.d);
            eVar.getClass();
            zb5 zb5Var = new zb5(eVar);
            zb5Var.p = true;
            int i = this.b;
            i(fragmentScreen, zb5Var, eVar.I(i), fragmentA);
            if (fragmentScreen.getB()) {
                zb5Var.o(i, fragmentA, str);
            } else {
                zb5Var.k(i, fragmentA, str, 1);
            }
            zb5Var.c(str);
            this.e.add(str);
            zb5Var.f();
            return;
        }
        if (t7dVar instanceof ryg0) {
            String str2 = ((ryg0) t7dVar).b;
            eVar.getClass();
            eVar.A(new androidx.fragment.app.d(eVar, str2), false);
        } else if (t7dVar instanceof szf0) {
            String str3 = ((szf0) t7dVar).b;
            eVar.getClass();
            eVar.A(new p1r(eVar, str3, (byte) 1), false);
        } else {
            if (!(t7dVar instanceof asc)) {
                super.a(t7dVar);
                return;
            }
            String str4 = ((asc) t7dVar).b;
            eVar.getClass();
            eVar.A(new p1r(eVar, str4, (byte) 0), false);
        }
    }

    @Override // a.rs3
    public final void c() {
        if (this.c.P() > 1 && !((Boolean) this.g.invoke()).booleanValue()) {
            super.c();
            return;
        }
        this.e.clear();
        i1w0 i1w0Var = this.f;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    @Override // a.rs3
    public final void d(m7h0 m7h0Var) {
        m7h0Var.getClass();
        this.e.clear();
        androidx.fragment.app.e eVar = this.c;
        if (eVar.P() < 1) {
            eVar.f0(1, null);
            return;
        }
        zb5 zb5VarO = eVar.O(0);
        zb5VarO.getClass();
        String str = zb5VarO.i;
        if (str != null) {
            eVar.f0(0, str);
        } else {
            eVar.e0(zb5VarO.t, 0, false);
        }
    }

    @Override // a.rs3
    public final void i(FragmentScreen fragmentScreen, zb5 zb5Var, Fragment fragment, Fragment fragment2) {
        fragmentScreen.getClass();
        fragment2.getClass();
        zb5Var.p(R.anim.fade_in_medium, R.anim.fade_out_medium, 0, 0);
    }
}

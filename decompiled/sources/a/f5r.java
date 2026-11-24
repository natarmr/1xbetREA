package a;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class f5r extends yge0 implements k8m0 {
    public final glz d;
    public final androidx.fragment.app.e e;
    public final u710 f;
    public final u710 g;
    public final u710 h;
    public lrd i;
    public final gnw0 j;
    public boolean k;
    public boolean l;

    public f5r(androidx.fragment.app.e eVar, glz glzVar) {
        Object obj = null;
        this.f = new u710(obj);
        this.g = new u710(obj);
        this.h = new u710(obj);
        gnw0 gnw0Var = new gnw0();
        gnw0Var.f11606a = new CopyOnWriteArrayList();
        this.j = gnw0Var;
        this.k = false;
        this.l = false;
        this.e = eVar;
        this.d = glzVar;
        w(true);
    }

    public static void z(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            jf4.n("Design assumption violated.");
            return;
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public boolean A(long j) {
        return j >= 0 && j < ((long) d());
    }

    public Fragment B(int i) {
        if (i != 0) {
            return i != 1 ? new u3s0() : new z8s0();
        }
        return new k1s0();
    }

    public final void C() {
        u710 u710Var;
        u710 u710Var2;
        Fragment fragment;
        View viewJ;
        if (!this.l || this.e.a0()) {
            return;
        }
        lx3 lx3Var = new lx3(0);
        int i = 0;
        while (true) {
            u710Var = this.f;
            int iH = u710Var.h();
            u710Var2 = this.h;
            if (i >= iH) {
                break;
            }
            long jE = u710Var.e(i);
            if (!A(jE)) {
                lx3Var.add(Long.valueOf(jE));
                u710Var2.g(jE);
            }
            i++;
        }
        if (!this.k) {
            this.l = false;
            for (int i2 = 0; i2 < u710Var.h(); i2++) {
                long jE2 = u710Var.e(i2);
                if (u710Var2.c(jE2) < 0 && ((fragment = (Fragment) u710Var.b(jE2)) == null || (viewJ = fragment.J()) == null || viewJ.getParent() == null)) {
                    lx3Var.add(Long.valueOf(jE2));
                }
            }
        }
        bx3 bx3Var = new bx3(lx3Var);
        while (bx3Var.hasNext()) {
            F(((Long) bx3Var.next()).longValue());
        }
    }

    public final Long D(int i) {
        int i2 = 0;
        Long lValueOf = null;
        while (true) {
            u710 u710Var = this.h;
            if (i2 >= u710Var.h()) {
                return lValueOf;
            }
            if (((Integer) u710Var.i(i2)).intValue() == i) {
                if (lValueOf != null) {
                    jf4.n("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                    return null;
                }
                lValueOf = Long.valueOf(u710Var.e(i2));
            }
            i2++;
        }
    }

    public final void E(m6r m6rVar) {
        Fragment fragment = (Fragment) this.f.b(m6rVar.e);
        if (fragment == null) {
            jf4.n("Design assumption violated.");
            return;
        }
        FrameLayout frameLayout = (FrameLayout) m6rVar.f40887a;
        View viewJ = fragment.J();
        if (!fragment.N() && viewJ != null) {
            jf4.n("Design assumption violated.");
            return;
        }
        boolean zN = fragment.N();
        androidx.fragment.app.e eVar = this.e;
        if (zN && viewJ == null) {
            eVar.k0(new e5r(this, fragment, frameLayout), false);
            return;
        }
        if (fragment.N() && viewJ.getParent() != null) {
            if (viewJ.getParent() != frameLayout) {
                z(viewJ, frameLayout);
                return;
            }
            return;
        }
        if (fragment.N()) {
            z(viewJ, frameLayout);
            return;
        }
        if (eVar.a0()) {
            if (eVar.K) {
                return;
            }
            this.d.a(new lz2(this, m6rVar));
            return;
        }
        eVar.k0(new e5r(this, fragment, frameLayout), false);
        gnw0 gnw0Var = this.j;
        gnw0Var.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = gnw0Var.f11606a.iterator();
        if (it.hasNext()) {
            throw rw2.h(it);
        }
        try {
            fragment.u0(false);
            zb5 zb5Var = new zb5(eVar);
            zb5Var.k(0, fragment, "f" + m6rVar.e, 1);
            zb5Var.q(fragment, lkz.d);
            zb5Var.h();
            this.i.b(false);
        } finally {
            gnw0.a(arrayList);
        }
    }

    public final void F(long j) {
        ViewParent parent;
        u710 u710Var = this.f;
        Fragment fragment = (Fragment) u710Var.b(j);
        if (fragment == null) {
            return;
        }
        if (fragment.J() != null && (parent = fragment.J().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean zA = A(j);
        u710 u710Var2 = this.g;
        if (!zA) {
            u710Var2.g(j);
        }
        if (!fragment.N()) {
            u710Var.g(j);
            return;
        }
        androidx.fragment.app.e eVar = this.e;
        if (eVar.a0()) {
            this.l = true;
            return;
        }
        boolean zN = fragment.N();
        gnw0 gnw0Var = this.j;
        if (zN && A(j)) {
            gnw0Var.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = gnw0Var.f11606a.iterator();
            if (it.hasNext()) {
                throw rw2.h(it);
            }
            Fragment.SavedState savedStateQ0 = eVar.q0(fragment);
            gnw0.a(arrayList);
            u710Var2.f(savedStateQ0, j);
        }
        gnw0Var.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = gnw0Var.f11606a.iterator();
        if (it2.hasNext()) {
            throw rw2.h(it2);
        }
        try {
            zb5 zb5Var = new zb5(eVar);
            zb5Var.n(fragment);
            zb5Var.h();
            u710Var.g(j);
        } finally {
            gnw0.a(arrayList2);
        }
    }

    @Override // a.yge0
    public long e(int i) {
        return i;
    }

    @Override // a.yge0
    public final void m(RecyclerView recyclerView) {
        z1x.u(this.i == null);
        lrd lrdVar = new lrd();
        lrdVar.f = this;
        lrdVar.f20526a = -1L;
        this.i = lrdVar;
        ViewPager2 viewPager2A = lrd.a(recyclerView);
        lrdVar.e = viewPager2A;
        xp6 xp6Var = new xp6(lrdVar, (byte) 7);
        lrdVar.b = xp6Var;
        viewPager2A.c(xp6Var);
        l5g l5gVar = new l5g(lrdVar, (byte) 3);
        lrdVar.c = l5gVar;
        v(l5gVar);
        ige0 ige0Var = new ige0(lrdVar, (byte) 4);
        lrdVar.d = ige0Var;
        this.d.a(ige0Var);
    }

    @Override // a.yge0
    public final void n(xhe0 xhe0Var, int i) {
        m6r m6rVar = (m6r) xhe0Var;
        long j = m6rVar.e;
        FrameLayout frameLayout = (FrameLayout) m6rVar.f40887a;
        int id = frameLayout.getId();
        Long lD = D(id);
        u710 u710Var = this.h;
        if (lD != null && lD.longValue() != j) {
            F(lD.longValue());
            u710Var.g(lD.longValue());
        }
        u710Var.f(Integer.valueOf(id), j);
        long jE = e(i);
        u710 u710Var2 = this.f;
        if (u710Var2.c(jE) < 0) {
            Fragment fragmentB = B(i);
            fragmentB.t0((Fragment.SavedState) this.g.b(jE));
            u710Var2.f(fragmentB, jE);
        }
        if (frameLayout.isAttachedToWindow()) {
            E(m6rVar);
        }
        C();
    }

    @Override // a.yge0
    public final void q(RecyclerView recyclerView) {
        lrd lrdVar = this.i;
        lrdVar.getClass();
        lrd.a(recyclerView).g((xp6) lrdVar.b);
        f5r f5rVar = (f5r) lrdVar.f;
        f5rVar.y((l5g) lrdVar.c);
        f5rVar.d.f((ige0) lrdVar.d);
        lrdVar.e = null;
        this.i = null;
    }

    @Override // a.yge0
    public final boolean r(xhe0 xhe0Var) {
        return true;
    }

    @Override // a.yge0
    public final void s(xhe0 xhe0Var) {
        E((m6r) xhe0Var);
        C();
    }

    @Override // a.yge0
    public final void u(xhe0 xhe0Var) {
        Long lD = D(((FrameLayout) ((m6r) xhe0Var).f40887a).getId());
        if (lD != null) {
            F(lD.longValue());
            this.h.g(lD.longValue());
        }
    }
}

package a;

import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qzf0 extends androidx.fragment.app.g {
    public final SparseArray h;
    public final List i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qzf0(androidx.fragment.app.e eVar, List list) {
        super(eVar);
        list.getClass();
        eVar.getClass();
        eVar.getClass();
        this.h = new SparseArray();
        this.i = list;
    }

    @Override // a.pj80
    public final void a(ViewPager viewPager, int i, Object obj) {
        ArrayList arrayList;
        obj.getClass();
        this.h.remove(i);
        Fragment fragment = (Fragment) obj;
        zb5 zb5Var = this.c;
        androidx.fragment.app.e eVar = this.b;
        if (zb5Var == null) {
            eVar.getClass();
            this.c = new zb5(eVar);
        }
        while (true) {
            arrayList = this.d;
            if (arrayList.size() > i) {
                break;
            } else {
                arrayList.add(null);
            }
        }
        arrayList.set(i, fragment.N() ? eVar.q0(fragment) : null);
        this.e.set(i, null);
        this.c.n(fragment);
        if (fragment != this.f) {
            return;
        }
        this.f = null;
    }

    @Override // a.pj80
    public final int c() {
        return this.i.size();
    }

    @Override // a.pj80
    public final Object d(ViewPager viewPager, int i) {
        Fragment fragmentJ;
        Fragment.SavedState savedState;
        ArrayList arrayList = this.e;
        if (arrayList.size() <= i || (fragmentJ = (Fragment) arrayList.get(i)) == null) {
            if (this.c == null) {
                androidx.fragment.app.e eVar = this.b;
                eVar.getClass();
                this.c = new zb5(eVar);
            }
            fragmentJ = j(i);
            ArrayList arrayList2 = this.d;
            if (arrayList2.size() > i && (savedState = (Fragment.SavedState) arrayList2.get(i)) != null) {
                fragmentJ.t0(savedState);
            }
            while (arrayList.size() <= i) {
                arrayList.add(null);
            }
            fragmentJ.u0(false);
            arrayList.set(i, fragmentJ);
            this.c.k(viewPager.getId(), fragmentJ, null, 1);
            this.c.q(fragmentJ, lkz.d);
        }
        this.h.append(i, fragmentJ);
        return fragmentJ;
    }

    @Override // androidx.fragment.app.g
    public final yx5 j(int i) {
        yx5 yx5Var = (yx5) ((Fragment) this.h.get(i));
        if (yx5Var != null) {
            return yx5Var;
        }
        wzf0 wzf0Var = (wzf0) this.i.get(i);
        if (wzf0Var != null) {
            if (wzf0Var instanceof vzf0) {
                ayf0.S1.getClass();
                return new ayf0();
            }
            if (wzf0Var instanceof uzf0) {
                hxf0.V1.getClass();
                hxf0 hxf0Var = new hxf0();
                hxf0Var.L1.x(hxf0Var, hxf0.W1[0], "");
                return hxf0Var;
            }
        }
        t9f.b();
        return null;
    }
}

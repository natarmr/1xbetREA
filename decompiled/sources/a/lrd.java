package a;

import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lrd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f20526a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public static ViewPager2 a(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            return (ViewPager2) parent;
        }
        e9d0.v(parent, "Expected ViewPager2 instance. Got: ");
        return null;
    }

    public void b(boolean z) {
        int currentItem;
        Fragment fragment;
        f5r f5rVar = (f5r) this.f;
        gnw0 gnw0Var = f5rVar.j;
        u710 u710Var = f5rVar.f;
        androidx.fragment.app.e eVar = f5rVar.e;
        if (eVar.a0() || ((ViewPager2) this.e).getScrollState() != 0 || u710Var.d() || f5rVar.d() == 0 || (currentItem = ((ViewPager2) this.e).getCurrentItem()) >= f5rVar.d()) {
            return;
        }
        long jE = f5rVar.e(currentItem);
        if ((jE != this.f20526a || z) && (fragment = (Fragment) u710Var.b(jE)) != null && fragment.N()) {
            this.f20526a = jE;
            eVar.getClass();
            zb5 zb5Var = new zb5(eVar);
            ArrayList<List> arrayList = new ArrayList();
            Fragment fragment2 = null;
            for (int i = 0; i < u710Var.h(); i++) {
                long jE2 = u710Var.e(i);
                Fragment fragment3 = (Fragment) u710Var.i(i);
                if (fragment3.N()) {
                    if (jE2 != this.f20526a) {
                        zb5Var.q(fragment3, lkz.d);
                        gnw0Var.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = gnw0Var.f11606a.iterator();
                        if (it.hasNext()) {
                            throw rw2.h(it);
                        }
                        arrayList.add(arrayList2);
                    } else {
                        fragment2 = fragment3;
                    }
                    fragment3.u0(jE2 == this.f20526a);
                }
            }
            if (fragment2 != null) {
                zb5Var.q(fragment2, lkz.e);
                gnw0Var.getClass();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = gnw0Var.f11606a.iterator();
                if (it2.hasNext()) {
                    throw rw2.h(it2);
                }
                arrayList.add(arrayList3);
            }
            if (zb5Var.f44098a.isEmpty()) {
                return;
            }
            zb5Var.h();
            Collections.reverse(arrayList);
            for (List list : arrayList) {
                gnw0Var.getClass();
                gnw0.a(list);
            }
        }
    }
}

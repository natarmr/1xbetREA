package androidx.fragment.app;

import a.lkz;
import a.pj80;
import a.twn;
import a.udk;
import a.yx5;
import a.zb5;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends pj80 {
    public final e b;
    public zb5 c = null;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public Fragment f = null;
    public boolean g;

    public g(e eVar) {
        this.b = eVar;
    }

    @Override // a.pj80
    public final void b() {
        zb5 zb5Var = this.c;
        if (zb5Var != null) {
            if (!this.g) {
                try {
                    this.g = true;
                    zb5Var.i();
                    this.g = false;
                } catch (Throwable th) {
                    this.g = false;
                    throw th;
                }
            }
            this.c = null;
        }
    }

    @Override // a.pj80
    public final boolean e(View view, Object obj) {
        return ((Fragment) obj).J() == view;
    }

    @Override // a.pj80
    public final void f(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList arrayList2 = this.e;
            arrayList2.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    arrayList.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int i = Integer.parseInt(str.substring(1));
                    Fragment fragmentQ = this.b.Q(bundle, str);
                    if (fragmentQ != null) {
                        while (arrayList2.size() <= i) {
                            arrayList2.add(null);
                        }
                        fragmentQ.u0(false);
                        arrayList2.set(i, fragmentQ);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key ".concat(str));
                    }
                }
            }
        }
    }

    @Override // a.pj80
    public final Parcelable g() {
        Bundle bundle;
        ArrayList arrayList = this.d;
        if (arrayList.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[arrayList.size()];
            arrayList.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i >= arrayList2.size()) {
                return bundle;
            }
            Fragment fragment = (Fragment) arrayList2.get(i);
            if (fragment != null && fragment.N()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.b.j0(bundle, fragment, twn.m(i, "f"));
            }
            i++;
        }
    }

    @Override // a.pj80
    public final void h(Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f;
        if (fragment != fragment2) {
            e eVar = this.b;
            if (fragment2 != null) {
                fragment2.u0(false);
                zb5 zb5Var = this.c;
                if (zb5Var == null) {
                    eVar.getClass();
                    zb5Var = new zb5(eVar);
                    this.c = zb5Var;
                }
                zb5Var.q(this.f, lkz.d);
            }
            fragment.u0(true);
            zb5 zb5Var2 = this.c;
            if (zb5Var2 == null) {
                eVar.getClass();
                zb5Var2 = new zb5(eVar);
                this.c = zb5Var2;
            }
            zb5Var2.q(fragment, lkz.e);
            this.f = fragment;
        }
    }

    @Override // a.pj80
    public final void i(ViewPager viewPager) {
        if (viewPager.getId() != -1) {
            return;
        }
        udk.d(this, " requires a view id", "ViewPager with adapter ");
    }

    public abstract yx5 j(int i);
}

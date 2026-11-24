package a;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class l8k0 {
    public static final l13 g = new l13((byte) 24);
    public static final l13 h = new l13((byte) 25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f19609a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final Object f;

    public l8k0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f = staggeredGridLayoutManager;
        this.f19609a = new ArrayList();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
        this.e = i;
    }

    public void a(float f, int i) {
        k8k0 k8k0Var;
        k8k0[] k8k0VarArr = (k8k0[]) this.f;
        int i2 = this.b;
        ArrayList arrayList = this.f19609a;
        if (i2 != 1) {
            Collections.sort(arrayList, g);
            this.b = 1;
        }
        int i3 = this.e;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.e = i4;
            k8k0Var = k8k0VarArr[i4];
        } else {
            k8k0Var = new k8k0();
        }
        int i5 = this.c;
        this.c = i5 + 1;
        k8k0Var.f17877a = i5;
        k8k0Var.b = i;
        k8k0Var.c = f;
        arrayList.add(k8k0Var);
        this.d += i;
        while (true) {
            int i6 = this.d;
            if (i6 <= 2000) {
                return;
            }
            int i7 = i6 - 2000;
            k8k0 k8k0Var2 = (k8k0) arrayList.get(0);
            int i8 = k8k0Var2.b;
            if (i8 <= i7) {
                this.d -= i8;
                arrayList.remove(0);
                int i9 = this.e;
                if (i9 < 5) {
                    this.e = i9 + 1;
                    k8k0VarArr[i9] = k8k0Var2;
                }
            } else {
                k8k0Var2.b = i8 - i7;
                this.d -= i7;
            }
        }
    }

    public void b() {
        View view = (View) dw9.l(1, this.f19609a);
        a4m0 a4m0Var = (a4m0) view.getLayoutParams();
        this.c = ((StaggeredGridLayoutManager) this.f).r.d(view);
        a4m0Var.getClass();
    }

    public void c() {
        this.f19609a.clear();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public int d() {
        boolean z = ((StaggeredGridLayoutManager) this.f).w;
        ArrayList arrayList = this.f19609a;
        return z ? f(arrayList.size() - 1, -1) : f(0, arrayList.size());
    }

    public int e() {
        boolean z = ((StaggeredGridLayoutManager) this.f).w;
        ArrayList arrayList = this.f19609a;
        return z ? f(0, arrayList.size()) : f(arrayList.size() - 1, -1);
    }

    public int f(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f;
        int iM = staggeredGridLayoutManager.r.m();
        int i3 = staggeredGridLayoutManager.r.i();
        int i4 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.f19609a.get(i);
            int iG = staggeredGridLayoutManager.r.g(view);
            int iD = staggeredGridLayoutManager.r.d(view);
            boolean z = iG <= i3;
            boolean z2 = iD >= iM;
            if (z && z2 && (iG < iM || iD > i3)) {
                return androidx.recyclerview.widget.b.T(view);
            }
            i += i4;
        }
        return -1;
    }

    public int g(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f19609a.size() == 0) {
            return i;
        }
        b();
        return this.c;
    }

    public View h(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f;
        View view = null;
        ArrayList arrayList = this.f19609a;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.w && androidx.recyclerview.widget.b.T(view2) >= i) || ((!staggeredGridLayoutManager.w && androidx.recyclerview.widget.b.T(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            View view3 = (View) arrayList.get(i3);
            if ((staggeredGridLayoutManager.w && androidx.recyclerview.widget.b.T(view3) <= i) || ((!staggeredGridLayoutManager.w && androidx.recyclerview.widget.b.T(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    public float i() {
        int i = this.b;
        ArrayList arrayList = this.f19609a;
        if (i != 0) {
            Collections.sort(arrayList, h);
            this.b = 0;
        }
        float f = 0.5f * this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            k8k0 k8k0Var = (k8k0) arrayList.get(i3);
            i2 += k8k0Var.b;
            if (i2 >= f) {
                return k8k0Var.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((k8k0) dw9.l(1, arrayList)).c;
    }

    public int j(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        ArrayList arrayList = this.f19609a;
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        a4m0 a4m0Var = (a4m0) view.getLayoutParams();
        this.b = ((StaggeredGridLayoutManager) this.f).r.g(view);
        a4m0Var.getClass();
        return this.b;
    }

    public l8k0() {
        this.f = new k8k0[5];
        this.f19609a = new ArrayList();
        this.b = -1;
    }
}

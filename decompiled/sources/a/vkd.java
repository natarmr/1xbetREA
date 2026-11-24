package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class vkd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fet f37566a;
    public qpb b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final skx d = new skx();
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public vkd(fet fetVar, qpb qpbVar) {
        this.f37566a = fetVar;
        this.b = qpbVar;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            a180 a180Var = this.b.f29108a;
            a180Var.c0(o080.d);
            a180Var.c[a180Var.d - a180Var.f60a[a180Var.b - 1].b] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        qpb qpbVar = this.b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        qpbVar.getClass();
        if (size != 0) {
            a180 a180Var2 = qpbVar.f29108a;
            a180Var2.c0(oz70.d);
            c9x.L(a180Var2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                a180 a180Var = this.b.f29108a;
                a180Var.c0(e080.d);
                int i3 = a180Var.d - a180Var.f60a[a180Var.b - 1].b;
                int[] iArr = a180Var.c;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                a180 a180Var2 = this.b.f29108a;
                a180Var2.c0(zz70.d);
                int i6 = a180Var2.d - a180Var2.f60a[a180Var2.b - 1].b;
                int[] iArr2 = a180Var2.c;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        p9k0 p9k0Var = this.f37566a.G;
        int i = z ? p9k0Var.i : p9k0Var.g;
        int i2 = i - this.f;
        if (i2 < 0) {
            ykd.a("Tried to seek backward");
        }
        if (i2 > 0) {
            a180 a180Var = this.b.f29108a;
            a180Var.c0(hz70.d);
            a180Var.c[a180Var.d - a180Var.f60a[a180Var.b - 1].b] = i2;
            this.f = i;
        }
    }

    public final void e() {
        p9k0 p9k0Var = this.f37566a.G;
        if (p9k0Var.c > 0) {
            int i = p9k0Var.i;
            skx skxVar = this.d;
            if (skxVar.a(-2) != i) {
                if (!this.c && this.e) {
                    d(false);
                    this.b.f29108a.c0(uz70.d);
                    this.c = true;
                }
                if (i > 0) {
                    bet betVarA = p9k0Var.a(i);
                    skxVar.c(i);
                    d(false);
                    a180 a180Var = this.b.f29108a;
                    a180Var.c0(tz70.d);
                    c9x.L(a180Var, 0, betVarA);
                    this.c = true;
                }
            }
        }
    }

    public final void f(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                ykd.a("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}

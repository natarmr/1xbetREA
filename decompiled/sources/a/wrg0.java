package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class wrg0 implements qqg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f39641a;
    public float b;
    public float c;
    public xrg0 d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;

    public wrg0(esg0 esg0Var, tyc tycVar) {
        ArrayList arrayList = new ArrayList();
        this.f39641a = arrayList;
        this.d = null;
        this.e = false;
        this.f = true;
        this.g = -1;
        if (tycVar == null) {
            return;
        }
        tycVar.z(this);
        if (this.h) {
            this.d.b((xrg0) arrayList.get(this.g));
            arrayList.set(this.g, this.d);
            this.h = false;
        }
        xrg0 xrg0Var = this.d;
        if (xrg0Var != null) {
            arrayList.add(xrg0Var);
        }
    }

    @Override // a.qqg0
    public final void a(float f, float f2, float f3, float f4) {
        this.d.a(f, f2);
        this.f39641a.add(this.d);
        this.d = new xrg0(f3, f4, f3 - f, f4 - f2);
        this.h = false;
    }

    @Override // a.qqg0
    public final void b(float f, float f2) {
        boolean z = this.h;
        ArrayList arrayList = this.f39641a;
        if (z) {
            this.d.b((xrg0) arrayList.get(this.g));
            arrayList.set(this.g, this.d);
            this.h = false;
        }
        xrg0 xrg0Var = this.d;
        if (xrg0Var != null) {
            arrayList.add(xrg0Var);
        }
        this.b = f;
        this.c = f2;
        this.d = new xrg0(f, f2, 0.0f, 0.0f);
        this.g = arrayList.size();
    }

    @Override // a.qqg0
    public final void c(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.f || this.e) {
            this.d.a(f, f2);
            this.f39641a.add(this.d);
            this.e = false;
        }
        this.d = new xrg0(f5, f6, f5 - f3, f6 - f4);
        this.h = false;
    }

    @Override // a.qqg0
    public final void close() {
        this.f39641a.add(this.d);
        e(this.b, this.c);
        this.h = true;
    }

    @Override // a.qqg0
    public final void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        this.e = true;
        this.f = false;
        xrg0 xrg0Var = this.d;
        esg0.n(xrg0Var.f41369a, xrg0Var.b, f, f2, f3, z, z2, f4, f5, this);
        this.f = true;
        this.h = false;
    }

    @Override // a.qqg0
    public final void e(float f, float f2) {
        this.d.a(f, f2);
        this.f39641a.add(this.d);
        xrg0 xrg0Var = this.d;
        this.d = new xrg0(f, f2, f - xrg0Var.f41369a, f2 - xrg0Var.b);
        this.h = false;
    }
}

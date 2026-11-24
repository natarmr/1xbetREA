package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class af50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public df50 f762a;
    public List b;
    public List c;
    public jf50 d;
    public boolean e;
    public boolean f;
    public ye50 g;

    public af50(df50 df50Var, boolean z, int i) {
        df50Var.getClass();
        this.f762a = df50Var;
        iun iunVar = iun.f15405a;
        this.b = iunVar;
        this.c = iunVar;
        this.d = hf50.f12957a;
        this.e = z;
        this.f = false;
    }

    public final boolean a() {
        ye50 ye50Var = this.g;
        if (ye50Var == null || ye50Var.i()) {
            return this.e;
        }
        return false;
    }

    public final boolean b() {
        ye50 ye50Var = this.g;
        if (ye50Var == null || ye50Var.i()) {
            return this.f;
        }
        return false;
    }

    public abstract void c();

    public abstract void d();

    public abstract void e(xe50 xe50Var);

    public abstract void f(xe50 xe50Var);

    public final void h() {
        ye50 ye50Var = this.g;
        if (ye50Var == null || !ye50Var.g.h(this)) {
            return;
        }
        ff50 ff50Var = ye50Var.e;
        ff50Var.getClass();
        if (equals(ff50Var.f)) {
            int i = ff50Var.g;
            hf50 hf50Var = hf50.f12957a;
            if (i == -1) {
                this.d = hf50Var;
                c();
            } else if (i == 1) {
                this.d = hf50Var;
                g();
            }
            ff50Var.f = null;
            ff50Var.g = 0;
            ff50Var.h = null;
        }
        ff50Var.d.remove(this);
        ff50Var.e.remove(this);
        this.g = null;
        ff50Var.b();
    }

    public final void i(boolean z) {
        ff50 ff50Var;
        if (this.e == z) {
            return;
        }
        this.e = z;
        ye50 ye50Var = this.g;
        if (ye50Var == null || (ff50Var = ye50Var.e) == null) {
            return;
        }
        ff50Var.b();
    }

    public void g() {
    }
}

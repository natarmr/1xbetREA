package a;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class vq70 implements uq70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final got0 f37843a;
    public final o5d0 b;
    public final r9u c;
    public final AtomicReference d;

    public vq70(got0 got0Var, o5d0 o5d0Var, r9u r9uVar) {
        o5d0Var.getClass();
        r9uVar.getClass();
        this.f37843a = got0Var;
        this.b = o5d0Var;
        this.c = r9uVar;
        this.d = new AtomicReference(null);
    }

    @Override // a.uq70
    public final void a() {
        uq70 uq70Var = (uq70) this.d.get();
        if (uq70Var != null) {
            uq70Var.a();
        }
    }

    @Override // a.uq70
    public final void b(xo9 xo9Var) {
        i().b(xo9Var);
    }

    @Override // a.uq70
    public final void c() {
        uq70 uq70Var = (uq70) this.d.get();
        if (uq70Var != null) {
            uq70Var.c();
        }
    }

    @Override // a.uq70
    public final void close() {
        uq70 uq70Var = (uq70) this.d.getAndSet(null);
        if (uq70Var != null) {
            uq70Var.close();
        }
    }

    @Override // a.uq70
    public final void d(boolean z) {
        uq70 uq70Var = (uq70) this.d.get();
        if (uq70Var != null) {
            uq70Var.d(z);
        }
    }

    @Override // a.uq70
    public final void e(boolean z) {
        uq70 uq70Var = (uq70) this.d.get();
        if (uq70Var != null) {
            uq70Var.e(z);
        }
    }

    @Override // a.uq70
    public final boolean f() {
        uq70 uq70Var = (uq70) this.d.get();
        if (uq70Var != null) {
            return uq70Var.f();
        }
        return false;
    }

    @Override // a.uq70
    public final boolean g() {
        uq70 uq70Var = (uq70) this.d.get();
        if (uq70Var != null) {
            return uq70Var.g();
        }
        return false;
    }

    @Override // a.uq70
    public final gmq h() {
        return i().h();
    }

    public final uq70 i() {
        uq70 uq70Var;
        AtomicReference atomicReference = this.d;
        uq70 uq70Var2 = (uq70) atomicReference.get();
        if (uq70Var2 != null) {
            return uq70Var2;
        }
        ygp ygpVar = ygp.p1;
        r9u r9uVar = this.c;
        r9uVar.getClass();
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        if (j1q0Var.f15748a.d(ygpVar)) {
            Object obj = this.b.get();
            obj.getClass();
            uq70Var = (uq70) obj;
        } else {
            Object obj2 = this.f37843a.get();
            obj2.getClass();
            uq70Var = (uq70) obj2;
        }
        while (!atomicReference.compareAndSet(null, uq70Var)) {
            if (atomicReference.get() != null) {
                uq70 uq70Var3 = (uq70) atomicReference.get();
                if (uq70Var3 == null) {
                    break;
                }
                return uq70Var3;
            }
        }
        return uq70Var;
    }
}

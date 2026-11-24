package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class bjt implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mjt f2722a;
    public mjt b;

    public bjt(mjt mjtVar) {
        this.f2722a = mjtVar;
        if (mjtVar.g()) {
            jf4.o("Default instance must be immutable.");
            throw null;
        }
        this.b = mjtVar.i();
    }

    public final mjt a() {
        mjt mjtVarB = b();
        mjtVarB.getClass();
        if (mjt.f(mjtVarB, true)) {
            return mjtVarB;
        }
        throw new w7t0();
    }

    public final mjt b() {
        boolean zG = this.b.g();
        mjt mjtVar = this.b;
        if (!zG) {
            return mjtVar;
        }
        mjtVar.getClass();
        c5d0 c5d0Var = c5d0.c;
        c5d0Var.getClass();
        c5d0Var.a(mjtVar.getClass()).b(mjtVar);
        mjtVar.h();
        return this.b;
    }

    public final void c() {
        if (this.b.g()) {
            return;
        }
        mjt mjtVarI = this.f2722a.i();
        mjt mjtVar = this.b;
        c5d0 c5d0Var = c5d0.c;
        c5d0Var.getClass();
        c5d0Var.a(mjtVarI.getClass()).a(mjtVarI, mjtVar);
        this.b = mjtVarI;
    }

    public final Object clone() {
        bjt bjtVar = (bjt) this.f2722a.c(5);
        bjtVar.b = b();
        return bjtVar;
    }
}

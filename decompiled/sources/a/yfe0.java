package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class yfe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zfe0 f42538a;
    public int b;
    public bet c;
    public Function2 d;
    public int e;
    public ry40 f;
    public hz40 g;

    public yfe0(zfe0 zfe0Var) {
        this.f42538a = zfe0Var;
    }

    public final boolean a() {
        if (this.f42538a != null) {
            bet betVar = this.c;
            if (betVar != null ? betVar.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final gox b(Object obj) {
        gox goxVarE;
        zfe0 zfe0Var = this.f42538a;
        return (zfe0Var == null || (goxVarE = zfe0Var.e(this, obj)) == null) ? gox.f11656a : goxVarE;
    }

    public final void c() {
        zfe0 zfe0Var = this.f42538a;
        if (zfe0Var != null) {
            zfe0Var.b();
        }
        this.f42538a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void d(boolean z) {
        int i = this.b;
        this.b = z ? i | 32 : i & (-33);
    }
}

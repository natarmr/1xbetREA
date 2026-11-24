package a;

/* JADX INFO: loaded from: classes.dex */
public final class v5u0 implements p5u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p5u0 f36844a;
    public final long b;

    public v5u0(p5u0 p5u0Var, long j) {
        this.f36844a = p5u0Var;
        this.b = j;
    }

    @Override // a.l5u0
    public final long b(t73 t73Var, t73 t73Var2, t73 t73Var3) {
        return this.b;
    }

    @Override // a.l5u0
    public final t73 c(long j, t73 t73Var, t73 t73Var2, t73 t73Var3) {
        return this.f36844a.c(this.b - j, t73Var2, t73Var, t73Var3);
    }

    @Override // a.l5u0
    public final t73 h(long j, t73 t73Var, t73 t73Var2, t73 t73Var3) {
        t73 t73VarH = this.f36844a.h(this.b - j, t73Var2, t73Var, t73Var3);
        if (t73VarH instanceof p73) {
            return new p73(((p73) t73VarH).f26486a * (-1.0f));
        }
        if (t73VarH instanceof q73) {
            q73 q73Var = (q73) t73VarH;
            return new q73(q73Var.f28229a * (-1.0f), q73Var.b * (-1.0f));
        }
        if (t73VarH instanceof r73) {
            r73 r73Var = (r73) t73VarH;
            return new r73(r73Var.f29959a * (-1.0f), r73Var.b * (-1.0f), r73Var.c * (-1.0f));
        }
        if (t73VarH instanceof s73) {
            s73 s73Var = (s73) t73VarH;
            return new s73(s73Var.f31731a * (-1.0f), s73Var.b * (-1.0f), s73Var.c * (-1.0f), s73Var.d * (-1.0f));
        }
        t9f.b();
        return null;
    }
}

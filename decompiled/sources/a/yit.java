package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yit implements f540, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jjt f42712a;
    public jjt b;

    public yit(jjt jjtVar) {
        this.f42712a = jjtVar;
        if (jjtVar.o()) {
            jf4.o("Default instance must be immutable.");
            throw null;
        }
        this.b = jjtVar.r();
    }

    public static void f(Object obj, Object obj2) {
        z4d0 z4d0Var = z4d0.c;
        z4d0Var.getClass();
        z4d0Var.a(obj.getClass()).a(obj, obj2);
    }

    public final jjt b() {
        jjt jjtVarC = c();
        jjtVarC.getClass();
        if (jjt.n(jjtVarC, true)) {
            return jjtVarC;
        }
        throw new v7t0();
    }

    public final jjt c() {
        boolean zO = this.b.o();
        jjt jjtVar = this.b;
        if (!zO) {
            return jjtVar;
        }
        jjtVar.getClass();
        z4d0 z4d0Var = z4d0.c;
        z4d0Var.getClass();
        z4d0Var.a(jjtVar.getClass()).b(jjtVar);
        jjtVar.p();
        return this.b;
    }

    public final yit d() {
        yit yitVarD = this.f42712a.d();
        yitVarD.b = c();
        return yitVarD;
    }

    public final void e() {
        if (this.b.o()) {
            return;
        }
        jjt jjtVarR = this.f42712a.r();
        f(jjtVarR, this.b);
        this.b = jjtVarR;
    }
}

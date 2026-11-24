package a;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class ef60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short f7707a;
    public long b;
    public short c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final fq80 g = new fq80(255);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [int, short] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int, short] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean a(guo guoVar, boolean z) throws kq80, EOFException {
        boolean zB;
        boolean zB2;
        this.f7707a = (short) 0;
        this.b = 0L;
        this.c = (short) 0;
        this.d = 0;
        this.e = 0;
        fq80 fq80Var = this.g;
        fq80Var.J(27);
        try {
            zB = guoVar.b(fq80Var.f9961a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zB = false;
        }
        if (zB && fq80Var.B() == 1332176723) {
            if (fq80Var.z() == 0) {
                this.f7707a = fq80Var.z();
                this.b = fq80Var.p();
                fq80Var.q();
                fq80Var.q();
                fq80Var.q();
                ?? Z = fq80Var.z();
                this.c = Z;
                this.d = Z + 27;
                fq80Var.J(Z);
                try {
                    zB2 = guoVar.b(fq80Var.f9961a, 0, this.c, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    zB2 = false;
                }
                if (zB2) {
                    for (int i = 0; i < this.c; i++) {
                        int iZ = fq80Var.z();
                        this.f[i] = iZ;
                        this.e += iZ;
                    }
                    return true;
                }
            } else if (!z) {
                throw kq80.e("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final boolean b(guo guoVar, long j) {
        boolean zB;
        x0x.A(guoVar.getPosition() == guoVar.i());
        fq80 fq80Var = this.g;
        fq80Var.J(4);
        while (true) {
            if (j != -1 && guoVar.getPosition() + 4 >= j) {
                break;
            }
            try {
                zB = guoVar.b(fq80Var.f9961a, 0, 4, true);
            } catch (EOFException unused) {
                zB = false;
            }
            if (!zB) {
                break;
            }
            fq80Var.M(0);
            if (fq80Var.B() == 1332176723) {
                guoVar.g();
                return true;
            }
            guoVar.m(1);
        }
        do {
            if (j != -1 && guoVar.getPosition() >= j) {
                break;
            }
        } while (guoVar.k(1) != -1);
        return false;
    }
}

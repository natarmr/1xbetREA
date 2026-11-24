package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class oaw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j6z f24950a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final vy40 f = new vy40();
    public final x460 g = new x460();
    public final jy40 h = new jy40(10);

    public oaw(j6z j6zVar) {
        this.f24950a = j6zVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    public final void a(long j, List list, boolean z) {
        char c;
        jy40 jy40Var;
        long[] jArr;
        n460 n460Var;
        Object objD;
        Object obj;
        int size = list.size();
        x460 x460Var = this.g;
        x460 x460Var2 = x460Var;
        boolean z2 = true;
        int i = 0;
        while (true) {
            c = 7;
            jy40Var = this.h;
            if (i >= size) {
                break;
            }
            lm40 lm40Var = (lm40) list.get(i);
            if (lm40Var.n) {
                lm40Var.m = new wqv(this, lm40Var, (byte) 7);
                if (z2) {
                    xz40 xz40Var = x460Var2.f40250a;
                    Object[] objArr = xz40Var.f41739a;
                    int i2 = xz40Var.c;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= i2) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i3];
                        if (((n460) obj).c.equals(lm40Var)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    n460Var = (n460) obj;
                    if (n460Var != null) {
                        n460Var.i = true;
                        n460Var.d.a(j);
                        if (z) {
                            Object objD2 = jy40Var.d(j);
                            if (objD2 == null) {
                                objD2 = new vy40();
                                jy40Var.g(objD2, j);
                            }
                            ((vy40) objD2).a(n460Var);
                        }
                    } else {
                        z2 = false;
                        n460Var = new n460(lm40Var);
                        n460Var.d.a(j);
                        if (z) {
                            objD = jy40Var.d(j);
                            if (objD == null) {
                                objD = new vy40();
                                jy40Var.g(objD, j);
                            }
                            ((vy40) objD).a(n460Var);
                        }
                        x460Var2.f40250a.b(n460Var);
                    }
                } else {
                    n460Var = new n460(lm40Var);
                    n460Var.d.a(j);
                    if (z) {
                        objD = jy40Var.d(j);
                        if (objD == null) {
                            objD = new vy40();
                            jy40Var.g(objD, j);
                        }
                        ((vy40) objD).a(n460Var);
                    }
                    x460Var2.f40250a.b(n460Var);
                }
                x460Var2 = n460Var;
            }
            i++;
        }
        if (z) {
            long[] jArr2 = jy40Var.b;
            Object[] objArr2 = jy40Var.c;
            long[] jArr3 = jy40Var.f17342a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j2 = jArr3[i4];
                    if ((((~j2) << c) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((255 & j2) < 128) {
                                int i8 = (i4 << 3) + i7;
                                long j3 = jArr2[i8];
                                vy40 vy40Var = (vy40) objArr2[i8];
                                xz40 xz40Var2 = x460Var.f40250a;
                                Object[] objArr3 = xz40Var2.f41739a;
                                int i9 = xz40Var2.c;
                                for (int i10 = 0; i10 < i9; i10++) {
                                    ((n460) objArr3[i10]).f(j3, vy40Var);
                                }
                            }
                            j2 >>= i5;
                            i7++;
                            i5 = i5;
                            jArr2 = jArr2;
                        }
                        jArr = jArr2;
                        if (i6 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr2;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr2 = jArr;
                    c = 7;
                }
            }
        }
        jy40Var.a();
    }

    public final boolean b(cgx0 cgx0Var, boolean z) {
        x460 x460Var = this.g;
        xz40 xz40Var = x460Var.f40250a;
        if (!x460Var.a((u710) cgx0Var.c, this.f24950a, cgx0Var, z)) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        Object[] objArr = xz40Var.f41739a;
        int i = xz40Var.c;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((n460) objArr[i2]).e(cgx0Var, z) || z3;
        }
        Object[] objArr2 = xz40Var.f41739a;
        int i3 = xz40Var.c;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((n460) objArr2[i4]).d(cgx0Var) || z4;
        }
        x460Var.b(cgx0Var);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            vy40 vy40Var = this.f;
            int i5 = vy40Var.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d((lm40) vy40Var.g(i6));
            }
            vy40Var.d();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            x460Var.f40250a.g();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        x460 x460Var = this.g;
        xz40 xz40Var = x460Var.f40250a;
        Object[] objArr = xz40Var.f41739a;
        int i = xz40Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((n460) objArr[i2]).c();
        }
        if (this.d) {
            this.d = true;
        } else {
            x460Var.f40250a.g();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void d(lm40 lm40Var) {
        if (this.b) {
            this.e = true;
            this.f.a(lm40Var);
            return;
        }
        x460 x460Var = this.g;
        vy40 vy40Var = x460Var.b;
        vy40Var.d();
        vy40Var.a(x460Var);
        while (vy40Var.j()) {
            x460 x460Var2 = (x460) vy40Var.l(vy40Var.b - 1);
            int i = 0;
            while (true) {
                xz40 xz40Var = x460Var2.f40250a;
                if (i < xz40Var.c) {
                    n460 n460Var = (n460) xz40Var.f41739a[i];
                    if (n460Var.c.equals(lm40Var)) {
                        x460Var2.f40250a.j(n460Var);
                        n460Var.c();
                    } else {
                        vy40Var.a(n460Var);
                        i++;
                    }
                }
            }
        }
    }
}

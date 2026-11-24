package a;

/* JADX INFO: loaded from: classes.dex */
public final class xiq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z18 f40957a;
    public final d28 b;
    public a28 c;
    public final int d;

    public xiq(b28 b28Var, d28 d28Var, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = d28Var;
        this.d = i;
        this.f40957a = new z18(b28Var, j, j2, j3, j4, j5);
    }

    public static int b(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static int c(guo guoVar, long j, mtc mtcVar) {
        if (j == guoVar.getPosition()) {
            return 0;
        }
        mtcVar.f22363a = j;
        return 1;
    }

    public final int a(guo guoVar, mtc mtcVar) {
        while (true) {
            a28 a28Var = this.c;
            a28Var.getClass();
            long j = a28Var.f;
            long j2 = a28Var.g;
            long j3 = a28Var.h;
            long j4 = j2 - j;
            long j5 = this.d;
            d28 d28Var = this.b;
            if (j4 <= j5) {
                this.c = null;
                d28Var.u();
                return c(guoVar, j, mtcVar);
            }
            long position = j3 - guoVar.getPosition();
            if (position < 0 || position > 262144) {
                return c(guoVar, j3, mtcVar);
            }
            guoVar.m((int) position);
            guoVar.g();
            c28 c28VarJ = d28Var.j(guoVar, a28Var.b);
            int i = c28VarJ.f3612a;
            long j6 = c28VarJ.b;
            long j7 = c28VarJ.c;
            if (i == -3) {
                this.c = null;
                d28Var.u();
                return c(guoVar, j3, mtcVar);
            }
            if (i == -2) {
                a28Var.d = j6;
                a28Var.f = j7;
                a28Var.h = a28.a(a28Var.b, j6, a28Var.e, j7, a28Var.g, a28Var.c);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        jf4.n("Invalid case");
                        return 0;
                    }
                    long position2 = j7 - guoVar.getPosition();
                    if (position2 >= 0 && position2 <= 262144) {
                        guoVar.m((int) position2);
                    }
                    this.c = null;
                    d28Var.u();
                    return c(guoVar, j7, mtcVar);
                }
                a28Var.e = j6;
                a28Var.g = j7;
                a28Var.h = a28.a(a28Var.b, a28Var.d, j6, a28Var.f, j7, a28Var.c);
            }
        }
    }

    public final void d(long j) {
        a28 a28Var = this.c;
        if (a28Var == null || a28Var.f112a != j) {
            z18 z18Var = this.f40957a;
            this.c = new a28(j, z18Var.f43606a.a(j), z18Var.c, z18Var.d, z18Var.e, z18Var.f);
        }
    }
}

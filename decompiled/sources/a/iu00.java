package a;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public class iu00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ long f15376a = defpackage.a.f0a.objectFieldOffset(iu00.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new ku00(8, false);

    public final boolean a(Runnable runnable) {
        iu00 iu00Var;
        while (true) {
            Unsafe unsafe = defpackage.a.f0a;
            long j = f15376a;
            ku00 ku00Var = (ku00) unsafe.getObjectVolatile(this, j);
            int iA = ku00Var.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                ku00 ku00VarC = ku00Var.c();
                while (true) {
                    Unsafe unsafe2 = defpackage.a.f0a;
                    iu00Var = this;
                    if (unsafe2.compareAndSwapObject(iu00Var, f15376a, ku00Var, ku00VarC) || unsafe2.getObjectVolatile(iu00Var, j) != ku00Var) {
                        break;
                    }
                    this = iu00Var;
                }
            } else {
                if (iA == 2) {
                    return false;
                }
                iu00Var = this;
            }
            this = iu00Var;
        }
    }

    public final void b() {
        iu00 iu00Var;
        while (true) {
            Unsafe unsafe = defpackage.a.f0a;
            long j = f15376a;
            ku00 ku00Var = (ku00) unsafe.getObjectVolatile(this, j);
            if (ku00Var.b()) {
                return;
            }
            ku00 ku00VarC = ku00Var.c();
            while (true) {
                iu00Var = this;
                if (defpackage.a.f0a.compareAndSwapObject(iu00Var, f15376a, ku00Var, ku00VarC) || defpackage.a.f0a.getObjectVolatile(iu00Var, j) != ku00Var) {
                    break;
                } else {
                    this = iu00Var;
                }
            }
            this = iu00Var;
        }
    }

    public final int c() {
        ku00 ku00Var = (ku00) defpackage.a.f0a.getObjectVolatile(this, f15376a);
        ku00Var.getClass();
        long longVolatile = defpackage.a.f0a.getLongVolatile(ku00Var, ku00.g);
        return 1073741823 & (((int) ((longVolatile & 1152921503533105152L) >> 30)) - ((int) (1073741823 & longVolatile)));
    }

    public final Object d() {
        iu00 iu00Var;
        while (true) {
            Unsafe unsafe = defpackage.a.f0a;
            long j = f15376a;
            ku00 ku00Var = (ku00) unsafe.getObjectVolatile(this, j);
            Object objD = ku00Var.d();
            if (objD != ku00.e) {
                return objD;
            }
            ku00 ku00VarC = ku00Var.c();
            while (true) {
                iu00Var = this;
                if (defpackage.a.f0a.compareAndSwapObject(iu00Var, f15376a, ku00Var, ku00VarC) || defpackage.a.f0a.getObjectVolatile(iu00Var, j) != ku00Var) {
                    break;
                }
                this = iu00Var;
            }
            this = iu00Var;
        }
    }
}

package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class ou90 implements w6k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f25867a;

    public static void C(ou90 ou90Var, pu90 pu90Var, long j, dfv dfvVar) {
        if (ou90Var.b() == k6z.f17794a || ou90Var.c() == 0) {
            ou90Var.e(pu90Var);
            pu90Var.l0(ikx.d(j, pu90Var.e), 0.0f, dfvVar);
        } else {
            int iC = (ou90Var.c() - pu90Var.f27604a) - ((int) (j >> 32));
            ou90Var.e(pu90Var);
            pu90Var.l0(ikx.d((((long) ((int) (j & 4294967295L))) & 4294967295L) | (((long) iC) << 32), pu90Var.e), 0.0f, dfvVar);
        }
    }

    public static /* synthetic */ void F(ou90 ou90Var, pu90 pu90Var, int i, int i2, Function1 function1, int i3) {
        if ((i3 & 8) != 0) {
            function1 = qu90.f29337a;
        }
        ou90Var.D(pu90Var, i, i2, 0.0f, function1);
    }

    public static void G(ou90 ou90Var, pu90 pu90Var, long j) {
        er90 er90Var = qu90.f29337a;
        ou90Var.e(pu90Var);
        pu90Var.n0(ikx.d(j, pu90Var.e), 0.0f, er90Var);
    }

    public static void j(ou90 ou90Var, pu90 pu90Var, long j) {
        ou90Var.e(pu90Var);
        pu90Var.n0(ikx.d(j, pu90Var.e), 0.0f, null);
    }

    public static void v(ou90 ou90Var, pu90 pu90Var, long j) {
        if (ou90Var.b() == k6z.f17794a || ou90Var.c() == 0) {
            ou90Var.e(pu90Var);
            pu90Var.n0(ikx.d(j, pu90Var.e), 0.0f, null);
        } else {
            int iC = (ou90Var.c() - pu90Var.f27604a) - ((int) (j >> 32));
            ou90Var.e(pu90Var);
            pu90Var.n0(ikx.d((((long) ((int) (j & 4294967295L))) & 4294967295L) | (((long) iC) << 32), pu90Var.e), 0.0f, null);
        }
    }

    public static void w(ou90 ou90Var, pu90 pu90Var, int i, int i2, cj cjVar, int i3) {
        Function1 function1 = cjVar;
        if ((i3 & 8) != 0) {
            function1 = qu90.f29337a;
        }
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (ou90Var.b() == k6z.f17794a || ou90Var.c() == 0) {
            ou90Var.e(pu90Var);
            pu90Var.n0(ikx.d(j, pu90Var.e), 0.0f, function1);
        } else {
            ou90Var.e(pu90Var);
            pu90Var.n0(ikx.d((((long) ((ou90Var.c() - pu90Var.f27604a) - ((int) (j >> 32)))) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), pu90Var.e), 0.0f, function1);
        }
    }

    public static void y(ou90 ou90Var, pu90 pu90Var, long j) {
        er90 er90Var = qu90.f29337a;
        if (ou90Var.b() == k6z.f17794a || ou90Var.c() == 0) {
            ou90Var.e(pu90Var);
            pu90Var.n0(ikx.d(j, pu90Var.e), 0.0f, er90Var);
        } else {
            int iC = (ou90Var.c() - pu90Var.f27604a) - ((int) (j >> 32));
            ou90Var.e(pu90Var);
            pu90Var.n0(ikx.d((((long) ((int) (j & 4294967295L))) & 4294967295L) | (((long) iC) << 32), pu90Var.e), 0.0f, er90Var);
        }
    }

    public final void D(pu90 pu90Var, int i, int i2, float f, Function1 function1) {
        e(pu90Var);
        pu90Var.n0(ikx.d((((long) i2) & 4294967295L) | (((long) i) << 32), pu90Var.e), f, function1);
    }

    public final void H(Function1 function1) {
        this.f25867a = true;
        function1.invoke(this);
        this.f25867a = false;
    }

    public float a(xlw xlwVar) {
        return Float.NaN;
    }

    public abstract k6z b();

    public abstract int c();

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(pu90 pu90Var) {
        if (pu90Var instanceof tt40) {
            ((tt40) pu90Var).v(this.f25867a);
        }
    }

    public final void g(pu90 pu90Var, int i, int i2, float f) {
        e(pu90Var);
        pu90Var.n0(ikx.d((((long) i2) & 4294967295L) | (((long) i) << 32), pu90Var.e), f, null);
    }

    public final void m(pu90 pu90Var, int i, int i2, float f) {
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (b() == k6z.f17794a || c() == 0) {
            e(pu90Var);
            pu90Var.n0(ikx.d(j, pu90Var.e), f, null);
        } else {
            int iC = (c() - pu90Var.f27604a) - ((int) (j >> 32));
            e(pu90Var);
            pu90Var.n0(ikx.d((((long) iC) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), pu90Var.e), f, null);
        }
    }
}

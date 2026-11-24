package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class y0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final esg0 f41778a;
    public final v0 b;
    public final z3 c;
    public final int d;
    public final int e;

    public y0(esg0 esg0Var, v0 v0Var, z3 z3Var, int i, int i2) {
        this.f41778a = esg0Var;
        this.b = v0Var;
        this.c = z3Var;
        this.d = i;
        this.e = i2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int size;
        z3 z3Var = this.c;
        boolean z = z3Var instanceof i3d0;
        int i = 0;
        if (z) {
            size = ((i3d0) z3Var).o.size();
        } else {
            size = z3Var instanceof p3d0 ? ((p3d0) z3Var).o.size() : 0;
        }
        v0 v0Var = this.b;
        if (z) {
            int i2 = ((i3d0) z3Var).c;
            if ((i2 & 32) == 32 || (i2 & 64) == 64) {
                i = 1;
            }
        } else if (z3Var instanceof p3d0) {
            int i3 = ((p3d0) z3Var).c;
            if ((i3 & 32) == 32 || (i3 & 64) == 64) {
                i = 1;
            }
        } else {
            if (!(z3Var instanceof v2d0)) {
                throw new UnsupportedOperationException("Unsupported message: " + z3Var.getClass());
            }
            p4d0 p4d0Var = (p4d0) v0Var;
            if (p4d0Var.h == r2d0.ENUM_CLASS) {
                i = 2;
            } else if (p4d0Var.i) {
                i = 1;
            }
        }
        return this.f41778a.f0(v0Var, z3Var, this.d, size + i + this.e);
    }
}

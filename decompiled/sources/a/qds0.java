package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class qds0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28550a;
    public final ccs0 b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        vtt0.H(0);
        vtt0.H(1);
        vtt0.H(3);
        vtt0.H(4);
    }

    public qds0(ccs0 ccs0Var, boolean z, int[] iArr, boolean[] zArr) {
        int i = ccs0Var.f4128a;
        this.f28550a = i;
        boolean z2 = false;
        x0x.A(i == iArr.length && i == zArr.length);
        this.b = ccs0Var;
        if (z && i > 1) {
            z2 = true;
        }
        this.c = z2;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final boolean a(int i) {
        return this.d[i] == 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qds0.class != obj.getClass()) {
            return false;
        }
        qds0 qds0Var = (qds0) obj;
        return this.c == qds0Var.c && this.b.equals(qds0Var.b) && Arrays.equals(this.d, qds0Var.d) && Arrays.equals(this.e, qds0Var.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }
}

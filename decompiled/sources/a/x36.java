package a;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class x36 implements fmo {
    public static final l13 g = new l13((byte) 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ccs0 f40201a;
    public final int b;
    public final int[] c;
    public final androidx.media3.common.b[] d;
    public final long[] e;
    public int f;

    public x36(int i, ccs0 ccs0Var, int[] iArr) {
        androidx.media3.common.b[] bVarArr;
        int i2 = 0;
        x0x.K(iArr.length > 0);
        ccs0Var.getClass();
        this.f40201a = ccs0Var;
        int length = iArr.length;
        this.b = length;
        this.d = new androidx.media3.common.b[length];
        int i3 = 0;
        while (true) {
            int length2 = iArr.length;
            bVarArr = this.d;
            if (i3 >= length2) {
                break;
            }
            bVarArr[i3] = ccs0Var.d[iArr[i3]];
            i3++;
        }
        Arrays.sort(bVarArr, g);
        this.c = new int[this.b];
        while (true) {
            int i4 = this.b;
            if (i2 >= i4) {
                this.e = new long[i4];
                return;
            } else {
                this.c[i2] = ccs0Var.a(this.d[i2]);
                i2++;
            }
        }
    }

    @Override // a.fmo
    public final boolean c(int i, long j) {
        return this.e[i] > j;
    }

    @Override // a.fmo
    public final void e() {
        Arrays.fill(this.e, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            x36 x36Var = (x36) obj;
            if (this.f40201a.equals(x36Var.f40201a) && Arrays.equals(this.c, x36Var.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // a.fmo
    public final androidx.media3.common.b f(int i) {
        return this.d[i];
    }

    @Override // a.fmo
    public final int g(int i) {
        return this.c[i];
    }

    @Override // a.fmo
    public final boolean h(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zC = c(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.b && !zC) {
            zC = (i2 == i || c(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zC) {
            return false;
        }
        long[] jArr = this.e;
        jArr[i] = Math.max(jArr[i], vtt0.a(jElapsedRealtime, j));
        return true;
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.c) + (System.identityHashCode(this.f40201a) * 31);
        this.f = iHashCode;
        return iHashCode;
    }

    @Override // a.fmo
    public final int l(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // a.fmo
    public final int length() {
        return this.c.length;
    }

    @Override // a.fmo
    public final ccs0 n() {
        return this.f40201a;
    }

    @Override // a.fmo
    public int p(long j, List list) {
        return list.size();
    }

    @Override // a.fmo
    public final int q() {
        return this.c[d()];
    }

    @Override // a.fmo
    public final androidx.media3.common.b r() {
        return this.d[d()];
    }

    @Override // a.fmo
    public void a() {
    }

    @Override // a.fmo
    public void b() {
    }

    @Override // a.fmo
    public void i(float f) {
    }

    @Override // a.fmo
    public final void o(boolean z) {
    }
}

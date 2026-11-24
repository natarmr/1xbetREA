package a;

import android.util.Pair;
import androidx.media3.common.Timeline$Window;

/* JADX INFO: loaded from: classes.dex */
public abstract class bmq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zlq0 f2849a = new zlq0();

    static {
        vtt0.H(0);
        vtt0.H(1);
        vtt0.H(2);
    }

    public int a(boolean z) {
        return p() ? -1 : 0;
    }

    public int b(Object obj) {
        return obj == g930.e ? 0 : -1;
    }

    public int c(boolean z) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i, amq0 amq0Var, Timeline$Window timeline$Window, int i2, boolean z) {
        int i3 = f(i, amq0Var, false).c;
        if (m(i3, timeline$Window, 0L).n != i) {
            return i + 1;
        }
        int iE = e(i3, i2, z);
        if (iE == -1) {
            return -1;
        }
        return m(iE, timeline$Window, 0L).m;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == c(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == c(z) ? a(z) : i + 1;
        }
        v4i0.e();
        return 0;
    }

    public boolean equals(Object obj) {
        int iC;
        if (this != obj) {
            if (obj instanceof bmq0) {
                bmq0 bmq0Var = (bmq0) obj;
                if (bmq0Var.o() == o() && bmq0Var.h() == h()) {
                    Timeline$Window timeline$Window = new Timeline$Window();
                    amq0 amq0Var = new amq0();
                    Timeline$Window timeline$Window2 = new Timeline$Window();
                    amq0 amq0Var2 = new amq0();
                    for (int i = 0; i < o(); i++) {
                        if (m(i, timeline$Window, 0L).equals(bmq0Var.m(i, timeline$Window2, 0L))) {
                        }
                    }
                    for (int i2 = 0; i2 < h(); i2++) {
                        if (f(i2, amq0Var, true).equals(bmq0Var.f(i2, amq0Var2, true))) {
                        }
                    }
                    int iA = a(true);
                    if (iA == bmq0Var.a(true) && (iC = c(true)) == bmq0Var.c(true)) {
                        while (iA != iC) {
                            int iE = e(iA, 0, true);
                            if (iE == bmq0Var.e(iA, 0, true)) {
                                iA = iE;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public amq0 f(int i, amq0 amq0Var, boolean z) {
        Integer num = z ? 0 : null;
        Object obj = z ? g930.e : null;
        uo uoVar = uo.c;
        amq0Var.h(num, obj, 0, -9223372036854775807L, 0L, true);
        return amq0Var;
    }

    public amq0 g(Object obj, amq0 amq0Var) {
        return f(b(obj), amq0Var, true);
    }

    public int h() {
        return 1;
    }

    public int hashCode() {
        Timeline$Window timeline$Window = new Timeline$Window();
        amq0 amq0Var = new amq0();
        int iO = o() + 217;
        for (int i = 0; i < o(); i++) {
            iO = (iO * 31) + m(i, timeline$Window, 0L).hashCode();
        }
        int iH = h() + (iO * 31);
        for (int i2 = 0; i2 < h(); i2++) {
            iH = (iH * 31) + f(i2, amq0Var, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            iH = (iH * 31) + iA;
            iA = e(iA, 0, true);
        }
        return iH;
    }

    public final Pair i(Timeline$Window timeline$Window, amq0 amq0Var, int i, long j) {
        Pair pairJ = j(timeline$Window, amq0Var, i, j, 0L);
        pairJ.getClass();
        return pairJ;
    }

    public final Pair j(Timeline$Window timeline$Window, amq0 amq0Var, int i, long j, long j2) {
        x0x.D(i, o());
        m(i, timeline$Window, j2);
        if (j == -9223372036854775807L) {
            j = timeline$Window.k;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = timeline$Window.m;
        f(i2, amq0Var, false);
        while (i2 < timeline$Window.n && amq0Var.e != j) {
            int i3 = i2 + 1;
            if (f(i3, amq0Var, false).e > j) {
                break;
            }
            i2 = i3;
        }
        f(i2, amq0Var, true);
        long jMin = j - amq0Var.e;
        long j3 = amq0Var.d;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = amq0Var.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int k(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == a(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == a(z) ? c(z) : i - 1;
        }
        v4i0.e();
        return 0;
    }

    public Object l(int i) {
        return g930.e;
    }

    public Timeline$Window m(int i, Timeline$Window timeline$Window, long j) {
        throw new IndexOutOfBoundsException();
    }

    public final void n(int i, Timeline$Window timeline$Window) {
        m(i, timeline$Window, 0L);
    }

    public int o() {
        return 1;
    }

    public final boolean p() {
        return o() == 0;
    }
}

package a;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class np extends x36 {
    public final rsj h;
    public final long i;
    public final long j;
    public final long k;
    public final short l;
    public final short m;
    public final float n;
    public final float o;
    public final b4x p;
    public final l9o0 q;
    public float r;
    public int s;
    public int t;
    public long u;
    public yaw v;

    public np(ccs0 ccs0Var, int[] iArr, rsj rsjVar, b4x b4xVar) {
        super(0, ccs0Var, iArr);
        this.h = rsjVar;
        this.i = 10000000L;
        this.j = 25000000L;
        this.k = 25000000L;
        this.l = (short) 1279;
        this.m = (short) 719;
        this.n = 0.7f;
        this.o = 0.75f;
        this.p = b4x.o(b4xVar);
        this.q = l9o0.f19665a;
        this.r = 1.0f;
        this.t = 0;
        this.u = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            u3x u3xVar = (u3x) arrayList.get(i);
            if (u3xVar != null) {
                u3xVar.b(new mp(j, jArr[i]));
            }
        }
    }

    public static long y(List list) {
        if (!list.isEmpty()) {
            yaw yawVar = (yaw) g8x.H(list);
            long j = yawVar.g;
            if (j != -9223372036854775807L) {
                long j2 = yawVar.h;
                if (j2 != -9223372036854775807L) {
                    return j2 - j;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // a.x36, a.fmo
    public final void a() {
        this.v = null;
    }

    @Override // a.x36, a.fmo
    public final void b() {
        this.u = -9223372036854775807L;
        this.v = null;
    }

    @Override // a.fmo
    public final int d() {
        return this.s;
    }

    @Override // a.x36, a.fmo
    public final void i(float f) {
        this.r = f;
    }

    @Override // a.fmo
    public final Object j() {
        return null;
    }

    @Override // a.fmo
    public final void m(long j, long j2, long j3, List list, am30[] am30VarArr) {
        long jY;
        this.q.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = this.s;
        int i2 = 0;
        if (i >= am30VarArr.length || !am30VarArr[i].next()) {
            int length = am30VarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    jY = y(list);
                    break;
                }
                am30 am30Var = am30VarArr[i3];
                if (am30Var.next()) {
                    jY = am30Var.b() - am30Var.a();
                    break;
                }
                i3++;
            }
        } else {
            am30 am30Var2 = am30VarArr[this.s];
            jY = am30Var2.b() - am30Var2.a();
        }
        long jX = x();
        int i4 = this.t;
        if (i4 == 0) {
            this.t = 1;
            this.s = w(jElapsedRealtime, jX);
            return;
        }
        int i5 = this.s;
        if (!list.isEmpty()) {
            androidx.media3.common.b bVar = ((yaw) g8x.H(list)).d;
            while (true) {
                if (i2 >= this.b) {
                    i2 = -1;
                    break;
                } else if (this.d[i2] == bVar) {
                    break;
                } else {
                    i2++;
                }
            }
        } else {
            i2 = -1;
            break;
        }
        if (i2 != -1) {
            i4 = ((yaw) g8x.H(list)).e;
            i5 = i2;
        }
        int iW = w(jElapsedRealtime, jX);
        if (iW != i5 && !c(i5, jElapsedRealtime)) {
            long jMin = this.i;
            if (j3 != -9223372036854775807L) {
                jMin = Math.min((long) ((jY != -9223372036854775807L ? j3 - jY : j3) * this.o), jMin);
            }
            if ((iW < i5 && j2 < jMin) || (iW > i5 && j2 >= this.j)) {
                iW = i5;
            }
        }
        if (iW != i5) {
            i4 = 3;
        }
        this.t = i4;
        this.s = iW;
    }

    @Override // a.x36, a.fmo
    public final int p(long j, List list) {
        int i;
        int i2;
        this.q.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.u;
        if (j2 != -9223372036854775807L && jElapsedRealtime - j2 < 1000 && (list.isEmpty() || ((yaw) g8x.H(list)).equals(this.v))) {
            return list.size();
        }
        this.u = jElapsedRealtime;
        this.v = list.isEmpty() ? null : (yaw) g8x.H(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jA = vtt0.A(this.r, ((yaw) list.get(size - 1)).g - j);
        long j3 = this.k;
        if (jA >= j3) {
            y(list);
            androidx.media3.common.b bVar = this.d[w(jElapsedRealtime, x())];
            for (int i3 = 0; i3 < size; i3++) {
                yaw yawVar = (yaw) list.get(i3);
                androidx.media3.common.b bVar2 = yawVar.d;
                if (vtt0.A(this.r, yawVar.g - j) >= j3 && bVar2.k < bVar.k && (i = bVar2.x) != -1 && i <= this.m && (i2 = bVar2.w) != -1 && i2 <= this.l && i < bVar.x) {
                    return i3;
                }
            }
        }
        return size;
    }

    @Override // a.fmo
    public final int s() {
        return this.t;
    }

    public final int w(long j, long j2) {
        int i = 0;
        for (int i2 = 0; i2 < this.b; i2++) {
            if (j == Long.MIN_VALUE || !c(i2, j)) {
                if (this.d[i2].k <= j2) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }

    public final long x() {
        long jA = (long) (((long) (this.h.a() * this.n)) / this.r);
        b4x b4xVar = this.p;
        if (b4xVar.isEmpty()) {
            return jA;
        }
        int i = 1;
        while (i < b4xVar.size() - 1 && ((mp) b4xVar.get(i)).f22153a < jA) {
            i++;
        }
        mp mpVar = (mp) b4xVar.get(i - 1);
        mp mpVar2 = (mp) b4xVar.get(i);
        long j = mpVar.f22153a;
        float f = (jA - j) / (mpVar2.f22153a - j);
        long j2 = mpVar.b;
        return j2 + ((long) (f * (mpVar2.b - j2)));
    }
}

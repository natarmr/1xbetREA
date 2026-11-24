package a;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: loaded from: classes.dex */
public final class ueu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xm30 f35548a;
    public final zeu0 b;
    public final short c;
    public boolean d;
    public long g;
    public boolean i;
    public boolean l;
    public boolean m;
    public int e = 0;
    public long f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public float j = 1.0f;
    public l9o0 k = l9o0.f19665a;

    /* JADX WARN: Type inference failed for: r2v1, types: [int, short] */
    public ueu0(Context context, xm30 xm30Var, long j) {
        this.f35548a = xm30Var;
        this.c = (int) j;
        this.b = new zeu0(context);
    }

    public final int a(long j, long j2, long j3, long j4, boolean z, boolean z2, long j5, long j6, br8 br8Var) {
        long j7;
        boolean z3;
        long j8;
        long j9;
        long j10;
        long j11;
        float f;
        float f2;
        br8Var.b = -9223372036854775807L;
        br8Var.c = -9223372036854775807L;
        boolean z4 = this.d;
        if (z4 && this.f == -9223372036854775807L) {
            this.f = j2;
        }
        long jM = (long) ((j - j2) / ((double) this.j));
        if (z4) {
            this.k.getClass();
            jM -= vtt0.M(SystemClock.elapsedRealtime()) - j3;
        }
        br8Var.b = jM;
        if (!z || z2) {
            if (this.l) {
                if (this.h == -9223372036854775807L || this.i) {
                    int i = this.e;
                    if (i != 0) {
                        if (i == 1) {
                            j7 = -9223372036854775807L;
                        } else if (i == 2) {
                            j7 = -9223372036854775807L;
                            if (j2 < j4) {
                                z3 = false;
                            }
                        } else {
                            if (i != 3) {
                                v4i0.e();
                                return 0;
                            }
                            this.k.getClass();
                            j7 = -9223372036854775807L;
                            long jM2 = vtt0.M(SystemClock.elapsedRealtime()) - this.g;
                            if (this.d) {
                                long j12 = this.f;
                                if (j12 == -9223372036854775807L || j12 == j2 || jM >= -30000 || jM2 <= 100000) {
                                }
                            }
                            z3 = false;
                        }
                        z3 = true;
                    } else {
                        j7 = -9223372036854775807L;
                        z3 = this.d;
                    }
                } else {
                    z3 = false;
                    j7 = -9223372036854775807L;
                }
                if (z3) {
                    return 0;
                }
                if (!this.d || j2 == this.f) {
                    return 5;
                }
                this.k.getClass();
                long jNanoTime = System.nanoTime();
                zeu0 zeu0Var = this.b;
                long j13 = (br8Var.b * 1000) + jNanoTime;
                long j14 = zeu0Var.n;
                if (j != j14) {
                    zeu0Var.o = zeu0Var.l;
                    zeu0Var.p = zeu0Var.m;
                    zeu0Var.q = j14;
                    zeu0Var.j = zeu0Var.k;
                }
                long j15 = zeu0Var.o;
                if (j15 != -1) {
                    if (j5 != j7) {
                        f = (j6 - j15) * j5;
                        f2 = zeu0Var.h;
                    } else {
                        f = (j - zeu0Var.q) * 1000;
                        f2 = zeu0Var.h;
                    }
                    long j16 = zeu0Var.p + ((long) (f / f2));
                    if (Math.abs(j13 - j16) <= 20000000) {
                        j13 = j16;
                    } else {
                        zeu0Var.b();
                    }
                }
                zeu0Var.l = j6;
                zeu0Var.m = j13;
                zeu0Var.n = j;
                weu0 weu0Var = zeu0Var.c;
                if (weu0Var != null) {
                    long j17 = weu0Var.c;
                    long j18 = zeu0Var.c.d;
                    if (j17 != j7 && j18 != j7) {
                        long j19 = (((j13 - j17) / j18) * j18) + j17;
                        if (j13 <= j19) {
                            j8 = j19 - j18;
                        } else {
                            j19 += j18;
                            j8 = j19;
                        }
                        long j20 = j19 - j13;
                        long j21 = j13 - j8;
                        long jAbs = Math.abs(j20 - j21);
                        if (jAbs < j18 / 2) {
                            j10 = j18;
                            long j22 = j10 / 4;
                            j9 = j8;
                            if (jAbs < j22) {
                                j11 = zeu0Var.j;
                                if (j11 != 0) {
                                    zeu0Var.k = j11;
                                } else {
                                    if (j20 < j21) {
                                        j22 = -j22;
                                    }
                                    zeu0Var.k = j22;
                                    j11 = j22;
                                }
                            } else {
                                j11 = 0;
                                zeu0Var.k = 0L;
                            }
                        } else {
                            j9 = j8;
                            j10 = j18;
                            j11 = zeu0Var.j;
                            zeu0Var.k = j11;
                        }
                        if (j20 + j11 >= j21) {
                            j19 = j9;
                        }
                        j13 = j19 - ((j10 * 80) / 100);
                    }
                }
                br8Var.c = j13;
                long j23 = (j13 - jNanoTime) / 1000;
                br8Var.b = j23;
                boolean z5 = (this.h == j7 || this.i) ? false : true;
                if (this.f35548a.R0(j23, j2, z2, z5)) {
                    return 4;
                }
                long j24 = br8Var.b;
                if (j24 >= -30000 || z2) {
                    return j24 > 50000 ? 5 : 1;
                }
                return z5 ? 3 : 2;
            }
            if (this.f35548a.R0(jM, j2, z2, true)) {
                return 4;
            }
            if (!this.d || br8Var.b >= 30000) {
                this.m = true;
                return 5;
            }
        }
        return 3;
    }

    public final boolean b(boolean z) {
        if (z && (this.e == 3 || (this.m && !this.l))) {
            this.h = -9223372036854775807L;
            return true;
        }
        if (this.h == -9223372036854775807L) {
            return false;
        }
        this.k.getClass();
        if (SystemClock.elapsedRealtime() < this.h) {
            return true;
        }
        this.h = -9223372036854775807L;
        return false;
    }

    public final void c(boolean z) {
        long jElapsedRealtime;
        this.i = z;
        long j = this.c;
        if (j > 0) {
            this.k.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        } else {
            jElapsedRealtime = -9223372036854775807L;
        }
        this.h = jElapsedRealtime;
    }

    public final void d() {
        this.d = true;
        this.k.getClass();
        this.g = vtt0.M(SystemClock.elapsedRealtime());
        zeu0 zeu0Var = this.b;
        zeu0Var.d = true;
        zeu0Var.b();
        if (!zeu0Var.b) {
            DisplayManager displayManager = (DisplayManager) zeu0Var.f44270a.getSystemService(CommonConstant.ReqAccessTokenParam.DISPLAY_LABEL);
            weu0 yeu0Var = null;
            if (displayManager != null) {
                try {
                    Choreographer choreographer = Choreographer.getInstance();
                    yeu0Var = Build.VERSION.SDK_INT >= 33 ? new yeu0(choreographer, displayManager) : new xeu0(choreographer, displayManager);
                } catch (RuntimeException e) {
                    f1t0.h0("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
                }
            }
            zeu0Var.c = yeu0Var;
            zeu0Var.b = true;
        }
        weu0 weu0Var = zeu0Var.c;
        if (weu0Var != null) {
            weu0Var.a();
        }
        zeu0Var.c(false);
    }

    public final void e(int i) {
        if (i == 0) {
            this.e = 1;
        } else if (i == 1) {
            this.e = 0;
        } else {
            if (i != 2) {
                v4i0.e();
                return;
            }
            this.e = Math.min(this.e, 2);
        }
        this.b.b();
    }

    public final void f(Surface surface) {
        this.l = surface != null;
        this.m = false;
        zeu0 zeu0Var = this.b;
        if (zeu0Var.e != surface) {
            zeu0Var.a();
            zeu0Var.e = surface;
            zeu0Var.c(true);
        }
        this.e = Math.min(this.e, 1);
    }

    public final void g(float f) {
        x0x.A(f > 0.0f);
        if (f == this.j) {
            return;
        }
        this.j = f;
        zeu0 zeu0Var = this.b;
        zeu0Var.h = f;
        zeu0Var.c(false);
    }
}

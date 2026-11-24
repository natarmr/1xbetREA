package a;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class o44 {
    public boolean A;
    public long B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bbw0 f24614a;
    public final l9o0 b;
    public final long[] c;
    public final AudioTrack d;
    public final int e;
    public final long f;
    public final boolean g;
    public final g44 h;
    public float i;
    public long j;
    public long k;
    public long l;
    public Method m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public int s;
    public int t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;

    public o44(bbw0 bbw0Var, l9o0 l9o0Var, AudioTrack audioTrack, int i, int i2, int i3) {
        this.f24614a = bbw0Var;
        this.b = l9o0Var;
        this.d = audioTrack;
        try {
            this.m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.c = new long[10];
        this.z = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.h = new g44(audioTrack, bbw0Var);
        int sampleRate = audioTrack.getSampleRate();
        this.e = sampleRate;
        boolean zI = vtt0.I(i);
        this.g = zI;
        this.f = zI ? vtt0.R(sampleRate, i3 / i2) : -9223372036854775807L;
        this.q = 0L;
        this.r = 0L;
        this.A = false;
        this.B = 0L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.o = 0L;
        this.n = 0L;
        this.i = 1.0f;
        this.j = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    public final long a() {
        long j;
        if (this.u != -9223372036854775807L) {
            return Math.min(this.x, c());
        }
        this.b.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.p >= 5) {
            AudioTrack audioTrack = this.d;
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                if (Build.VERSION.SDK_INT > 29) {
                    j = this.q;
                    if (j > playbackHeadPosition) {
                        if (this.A) {
                            this.B += j;
                            this.A = false;
                        } else {
                            this.r++;
                        }
                    }
                    this.q = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.q <= 0 || playState != 3) {
                    this.v = -9223372036854775807L;
                    j = this.q;
                    if (j > playbackHeadPosition) {
                        if (this.A) {
                            this.B += j;
                            this.A = false;
                        } else {
                            this.r++;
                        }
                    }
                    this.q = playbackHeadPosition;
                } else if (this.v == -9223372036854775807L) {
                    this.v = jElapsedRealtime;
                }
            }
            this.p = jElapsedRealtime;
        }
        return this.q + this.B + (this.r << 32);
    }

    public final long b(long j) {
        long jY;
        int i = this.t;
        int i2 = this.e;
        if (i == 0) {
            jY = this.u != -9223372036854775807L ? vtt0.R(i2, c()) : vtt0.R(i2, a());
        } else {
            jY = vtt0.y(this.i, j + this.k);
        }
        long jMax = Math.max(0L, jY - this.n);
        return this.u != -9223372036854775807L ? Math.min(vtt0.R(i2, this.x), jMax) : jMax;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.w;
        }
        this.b.getClass();
        return this.w + vtt0.T(vtt0.y(this.i, vtt0.M(SystemClock.elapsedRealtime()) - this.u), this.e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j) {
        long j2 = this.j;
        if (j2 == -9223372036854775807L || j < j2) {
            return;
        }
        long jA = vtt0.A(this.i, j - j2);
        this.b.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - vtt0.Y(jA);
        this.j = -9223372036854775807L;
        vg00 vg00Var = ((l44) this.f24614a.b).i;
        vg00Var.getClass();
        if (Thread.currentThread() == vg00Var.f37360a) {
            vg00Var.e(-1, new i44(jCurrentTimeMillis));
        }
    }

    public final void e() {
        this.k = 0L;
        this.t = 0;
        this.s = 0;
        this.l = 0L;
        this.y = -9223372036854775807L;
        this.z = -9223372036854775807L;
    }
}

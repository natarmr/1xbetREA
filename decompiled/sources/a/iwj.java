package a;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class iwj implements ff60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ef60 f15493a;
    public final long b;
    public final long c;
    public final orm0 d;
    public byte e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;

    public iwj(orm0 orm0Var, long j, long j2, long j3, long j4, boolean z) {
        x0x.A(j >= 0 && j2 > j);
        this.d = orm0Var;
        this.b = j;
        this.c = j2;
        if (j3 == j2 - j || z) {
            this.f = j4;
            this.e = (byte) 4;
        } else {
            this.e = (byte) 0;
        }
        this.f15493a = new ef60();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c2  */
    @Override // a.ff60
    public final long d(guo guoVar) throws IOException {
        long j;
        long j2;
        byte b = this.e;
        long j3 = this.c;
        ef60 ef60Var = this.f15493a;
        if (b == 0) {
            long position = guoVar.getPosition();
            this.g = position;
            this.e = (byte) 1;
            long j4 = j3 - 65307;
            if (j4 > position) {
                return j4;
            }
        } else if (b != 1) {
            if (b == 2) {
                if (this.i == this.j) {
                    j2 = -1;
                } else {
                    long position2 = guoVar.getPosition();
                    if (ef60Var.b(guoVar, this.j)) {
                        ef60Var.a(guoVar, false);
                        guoVar.g();
                        long j5 = this.h;
                        long j6 = ef60Var.b;
                        long j7 = j5 - j6;
                        j = 2;
                        int i = ef60Var.d + ef60Var.e;
                        if (0 > j7 || j7 >= 72000) {
                            if (j7 < 0) {
                                this.j = position2;
                                this.l = j6;
                            } else {
                                this.i = guoVar.getPosition() + ((long) i);
                                this.k = ef60Var.b;
                            }
                            long j8 = this.j;
                            long j9 = this.i;
                            if (j8 - j9 < 100000) {
                                this.j = j9;
                                j2 = j9;
                            } else {
                                long position3 = guoVar.getPosition() - (((long) i) * (j7 <= 0 ? 2L : 1L));
                                long j10 = this.j;
                                long j11 = this.i;
                                j2 = vtt0.j((((j10 - j11) * j7) / (this.l - this.k)) + position3, j11, j10 - 1);
                            }
                        } else {
                            j2 = -1;
                        }
                    } else {
                        j2 = this.i;
                        if (j2 == position2) {
                            ohq.l("No ogg page can be found.");
                            return 0L;
                        }
                    }
                    if (j2 != -1) {
                        return j2;
                    }
                    this.e = (byte) 3;
                }
                j = 2;
                if (j2 != -1) {
                    return j2;
                }
                this.e = (byte) 3;
            } else {
                if (b != 3) {
                    if (b == 4) {
                        return -1L;
                    }
                    v4i0.e();
                    return 0L;
                }
                j = 2;
            }
            while (true) {
                ef60Var.b(guoVar, -1L);
                ef60Var.a(guoVar, false);
                if (ef60Var.b > this.h) {
                    guoVar.g();
                    this.e = (byte) 4;
                    return -(this.k + j);
                }
                guoVar.m(ef60Var.d + ef60Var.e);
                this.i = guoVar.getPosition();
                this.k = ef60Var.b;
            }
        }
        ef60Var.f7707a = (short) 0;
        ef60Var.b = 0L;
        ef60Var.c = (short) 0;
        ef60Var.d = 0;
        ef60Var.e = 0;
        if (!ef60Var.b(guoVar, -1L)) {
            c99.f();
            return 0L;
        }
        ef60Var.a(guoVar, false);
        guoVar.m(ef60Var.d + ef60Var.e);
        long j12 = ef60Var.b;
        while ((ef60Var.f7707a & 4) != 4 && ef60Var.b(guoVar, -1L) && guoVar.getPosition() < j3 && ef60Var.a(guoVar, true)) {
            try {
                guoVar.m(ef60Var.d + ef60Var.e);
                j12 = ef60Var.b;
            } catch (EOFException unused) {
            }
        }
        this.f = j12;
        this.e = (byte) 4;
        return this.g;
    }

    @Override // a.ff60
    public final fvh0 i() {
        if (this.f != 0) {
            return new hwj(this);
        }
        return null;
    }

    @Override // a.ff60
    public final void j(long j) {
        this.h = vtt0.j(j, 0L, this.f - 1);
        this.e = (byte) 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }
}

package a;

import android.os.SystemClock;
import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public final class afu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fhj f797a;
    public final ueu0 b;
    public final br8 c = new br8();
    public final tyc d = new tyc((byte) 7);
    public final tyc e = new tyc((byte) 7);
    public final z55 f;
    public final veu0 g;
    public final fiq h;
    public long i;
    public long j;
    public long k;
    public qfu0 l;
    public long m;

    public afu0(fhj fhjVar, ueu0 ueu0Var, veu0 veu0Var, fiq fiqVar) {
        this.f797a = fhjVar;
        this.b = ueu0Var;
        this.g = veu0Var;
        this.h = fiqVar;
        z55 z55Var = new z55();
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        z55Var.b = 0;
        z55Var.c = -1;
        z55Var.d = 0;
        z55Var.f = new long[iHighestOneBit];
        z55Var.e = iHighestOneBit - 1;
        this.f = z55Var;
        this.i = -9223372036854775807L;
        this.l = qfu0.d;
        this.j = -9223372036854775807L;
        this.k = -9223372036854775807L;
    }

    public final void a(long j, long j2) {
        final fhj fhjVar = this.f797a;
        czj czjVar = (czj) fhjVar.b;
        while (true) {
            z55 z55Var = this.f;
            int i = z55Var.d;
            if (i == 0) {
                return;
            }
            if (i == 0) {
                itt0.a();
                return;
            }
            long j3 = ((long[]) z55Var.f)[z55Var.b];
            Long l = (Long) this.e.Y(j3);
            ueu0 ueu0Var = this.b;
            if (l != null && l.longValue() != this.m) {
                this.m = l.longValue();
                ueu0Var.e(2);
            }
            fiq fiqVar = this.h;
            fiqVar.b(1000 * j3);
            long j4 = this.m;
            long jA = fiqVar.a();
            long j5 = fiqVar.h;
            ueu0 ueu0Var2 = this.b;
            br8 br8Var = this.c;
            int iA = ueu0Var2.a(j3, j, j2, j4, false, false, jA, j5, br8Var);
            if (iA != 5 && iA != 4) {
                this.g.a(j3, br8Var.b);
            }
            final byte b = 0;
            final byte b2 = 1;
            if (iA == 0 || iA == 1) {
                this.j = j3;
                boolean z = iA == 0;
                long jN = z55Var.n();
                qfu0 qfu0Var = (qfu0) this.d.Y(jN);
                if (qfu0Var != null && !qfu0Var.equals(qfu0.d) && !qfu0Var.equals(this.l)) {
                    this.l = qfu0Var;
                    awq awqVar = new awq();
                    awqVar.v = qfu0Var.f28655a;
                    awqVar.w = qfu0Var.b;
                    awqVar.o = mg40.n("video/raw");
                    fhjVar.f9543a = new androidx.media3.common.b(awqVar);
                    czjVar.j.execute(new a4e(fhjVar, qfu0Var, (byte) 21));
                }
                long jNanoTime = z ? System.nanoTime() : br8Var.c;
                b2 = ueu0Var.e == 3 ? (byte) 0 : (byte) 1;
                ueu0Var.e = 3;
                ueu0Var.k.getClass();
                ueu0Var.g = vtt0.M(SystemClock.elapsedRealtime());
                if (b2 != 0 && czjVar.f != null) {
                    czjVar.j.execute(new Runnable() { // from class: a.bzj
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = b;
                            fhj fhjVar2 = fhjVar;
                            switch (b3) {
                                case 0:
                                    ((czj) fhjVar2.b).i.b();
                                    break;
                                default:
                                    ((czj) fhjVar2.b).i.c();
                                    break;
                            }
                        }
                    });
                }
                androidx.media3.common.b bVar = (androidx.media3.common.b) fhjVar.f9543a;
                czjVar.k.d(jN, jNanoTime, bVar == null ? new androidx.media3.common.b(new awq()) : bVar, null);
                tm30 tm30Var = (tm30) czjVar.d.remove();
                tm30Var.c.P0(tm30Var.f34175a, tm30Var.b, jNanoTime);
            } else if (iA == 2 || iA == 3) {
                this.j = j3;
                z55Var.n();
                czjVar.j.execute(new Runnable() { // from class: a.bzj
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        fhj fhjVar2 = fhjVar;
                        switch (b3) {
                            case 0:
                                ((czj) fhjVar2.b).i.b();
                                break;
                            default:
                                ((czj) fhjVar2.b).i.c();
                                break;
                        }
                    }
                });
                tm30 tm30Var2 = (tm30) czjVar.d.remove();
                xm30 xm30Var = tm30Var2.c;
                dm30 dm30Var = tm30Var2.f34175a;
                int i2 = tm30Var2.b;
                Trace.beginSection("dropVideoBuffer");
                dm30Var.k(i2);
                Trace.endSection();
                xm30Var.U0(0, 1);
            } else {
                if (iA != 4) {
                    if (iA == 5) {
                        return;
                    }
                    jf4.n(String.valueOf(iA));
                    return;
                }
                this.j = j3;
            }
        }
    }
}

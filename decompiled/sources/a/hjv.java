package a;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class hjv implements emk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f13179a;
    public final zae0 b;
    public final Inflater c;
    public final e8x d;
    public final CRC32 e;

    public hjv(u99 u99Var) {
        u99Var.getClass();
        zae0 zae0Var = new zae0(u99Var);
        this.b = zae0Var;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.d = new e8x(zae0Var, inflater);
        this.e = new CRC32();
    }

    public static void a(int i, int i2, String str) throws IOException {
        if (i2 == i) {
            return;
        }
        StringBuilder sbT = brm0.t(str, ": actual 0x");
        sbT.append(StringsKt.b0(8, cy2.K(i2)));
        sbT.append(" != expected 0x");
        sbT.append(StringsKt.b0(8, cy2.K(i)));
        throw new IOException(sbT.toString());
    }

    @Override // a.emk0
    public final long Y(f99 f99Var, long j) throws IOException {
        byte b;
        hjv hjvVar = this;
        zae0 zae0Var = hjvVar.b;
        f99 f99Var2 = zae0Var.b;
        f99Var.getClass();
        if (j < 0) {
            c99.s(h97.h(j, "byteCount < 0: "));
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        byte b2 = hjvVar.f13179a;
        CRC32 crc32 = hjvVar.e;
        if (b2 == 0) {
            zae0Var.h0(10L);
            byte bN = f99Var2.n(3L);
            boolean z = ((bN >> 1) & 1) == 1;
            if (z) {
                hjvVar.c(f99Var2, 0L, 10L);
            }
            a(8075, zae0Var.readShort(), "ID1ID2");
            zae0Var.skip(8L);
            if (((bN >> 2) & 1) == 1) {
                zae0Var.h0(2L);
                if (z) {
                    c(f99Var2, 0L, 2L);
                }
                long J = f99Var2.J() & 65535;
                zae0Var.h0(J);
                if (z) {
                    c(f99Var2, 0L, J);
                }
                zae0Var.skip(J);
            }
            if (((bN >> 3) & 1) == 1) {
                long jA = zae0Var.a((byte) 0, 0L, Long.MAX_VALUE);
                if (jA == -1) {
                    c99.f();
                    return 0L;
                }
                if (z) {
                    c(f99Var2, 0L, jA + 1);
                }
                zae0Var.skip(jA + 1);
            }
            if (((bN >> 4) & 1) == 1) {
                long jA2 = zae0Var.a((byte) 0, 0L, Long.MAX_VALUE);
                if (jA2 == -1) {
                    c99.f();
                    return 0L;
                }
                if (z) {
                    hjvVar = this;
                    hjvVar.c(f99Var2, 0L, jA2 + 1);
                } else {
                    hjvVar = this;
                }
                zae0Var.skip(jA2 + 1);
            } else {
                hjvVar = this;
            }
            if (z) {
                a(zae0Var.l(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            hjvVar.f13179a = (byte) 1;
            b2 = 1;
        }
        if (b2 == 1) {
            long j2 = f99Var.b;
            long jY = hjvVar.d.Y(f99Var, j);
            if (jY != -1) {
                hjvVar.c(f99Var, j2, jY);
                return jY;
            }
            b = 2;
            hjvVar.f13179a = (byte) 2;
            b2 = 2;
        } else {
            b = 2;
        }
        if (b2 == b) {
            a(zae0Var.e(), (int) crc32.getValue(), "CRC");
            a(zae0Var.e(), (int) hjvVar.c.getBytesWritten(), "ISIZE");
            hjvVar.f13179a = (byte) 3;
            if (!zae0Var.v0()) {
                ohq.l("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    public final void c(f99 f99Var, long j, long j2) {
        uvh0 uvh0Var = f99Var.f9145a;
        uvh0Var.getClass();
        while (true) {
            long j3 = uvh0Var.c - uvh0Var.b;
            if (j < j3) {
                break;
            }
            j -= j3;
            uvh0Var = uvh0Var.f;
            uvh0Var.getClass();
        }
        while (j2 > 0) {
            int i = (int) (((long) uvh0Var.b) + j);
            int iMin = (int) Math.min(uvh0Var.c - i, j2);
            this.e.update(uvh0Var.f36348a, i, iMin);
            j2 -= (long) iMin;
            uvh0Var = uvh0Var.f;
            uvh0Var.getClass();
            j = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    @Override // a.emk0
    public final fmq0 h() {
        return this.b.f44063a.h();
    }
}

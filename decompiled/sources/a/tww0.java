package a;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class tww0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteArrayInputStream f34671a;
    public qbu0 b;
    public final byte[] c = new byte[8];
    public final owp0 d = new owp0((byte) 24);

    public tww0(ByteArrayInputStream byteArrayInputStream) {
        this.f34671a = byteArrayInputStream;
    }

    public final long a() {
        q((byte) -128);
        n();
        long jL = l();
        if (jL < 0) {
            v4i0.p("the maximum supported array length is 9223372036854775807");
            return 0L;
        }
        if (jL > 0) {
            ((ArrayDeque) this.d.b).push(Long.valueOf(jL));
        }
        return jL;
    }

    public final long c() {
        boolean z;
        e();
        byte b = this.b.f28456a;
        if (b == 0) {
            z = true;
        } else {
            if (b != 32) {
                jf4.n(twn.m((b >> 5) & 7, "expected major type 0 or 1 but found "));
                return 0L;
            }
            z = false;
        }
        long jL = l();
        if (jL >= 0) {
            return z ? jL : ~jL;
        }
        v4i0.p("the maximum supported unsigned/negative integer is 9223372036854775807");
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f34671a.close();
        this.d.l();
    }

    public final long d() {
        q((byte) -96);
        n();
        long jL = l();
        if (jL < 0 || jL > 4611686018427387903L) {
            v4i0.p("the maximum supported map length is 4611686018427387903L");
            return 0L;
        }
        if (jL > 0) {
            ((ArrayDeque) this.d.b).push(Long.valueOf(jL + jL));
        }
        return jL;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cb  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008d, code lost:
    
        if (r2 != (-2)) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a.qbu0 e() {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.tww0.e():a.qbu0");
    }

    public final boolean k() {
        q((byte) -32);
        if (this.b.b > 24) {
            jf4.n("expected simple value");
            return false;
        }
        int iL = (int) l();
        if (iL == 20) {
            return false;
        }
        if (iL == 21) {
            return true;
        }
        jf4.n("expected FALSE or TRUE");
        return false;
    }

    public final long l() throws IOException {
        qbu0 qbu0Var = this.b;
        byte b = qbu0Var.b;
        if (b < 24) {
            long j = b;
            this.b = null;
            return j;
        }
        if (b == 24) {
            int i = this.f34671a.read();
            if (i != -1) {
                this.b = null;
                return ((long) i) & 255;
            }
            c99.f();
            return 0L;
        }
        byte[] bArr = this.c;
        if (b == 25) {
            r(bArr, 2);
            return ((((long) bArr[0]) & 255) << 8) | (((long) bArr[1]) & 255);
        }
        if (b == 26) {
            r(bArr, 4);
            return ((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16) | ((((long) bArr[2]) & 255) << 8) | (((long) bArr[3]) & 255);
        }
        if (b != 27) {
            ohq.l(f140.j(b, "invalid additional information ", (qbu0Var.f28456a >> 5) & 7, " for major type "));
            return 0L;
        }
        r(bArr, 8);
        long j2 = bArr[0];
        long j3 = bArr[1];
        long j4 = bArr[2];
        long j5 = bArr[3];
        return (((long) bArr[7]) & 255) | ((j3 & 255) << 48) | ((j2 & 255) << 56) | ((j4 & 255) << 40) | ((j5 & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8);
    }

    public final void n() {
        e();
        byte b = this.b.b;
        if (b != 31) {
            return;
        }
        jf4.n(twn.m(b, "expected definite length but found "));
    }

    public final void q(byte b) {
        e();
        byte b2 = this.b.f28456a;
        if (b2 == b) {
            return;
        }
        jf4.n(f140.j((b >> 5) & 7, "expected major type ", (b2 >> 5) & 7, " but found "));
    }

    public final void r(byte[] bArr, int i) throws IOException {
        int i2 = 0;
        while (i2 != i) {
            int i3 = this.f34671a.read(bArr, i2, i - i2);
            if (i3 == -1) {
                c99.f();
                return;
            }
            i2 += i3;
        }
        this.b = null;
    }

    public final byte[] v() {
        n();
        long jL = l();
        if (jL < 0 || jL > 2147483647L) {
            v4i0.p("the maximum supported byte/text string length is 2147483647 bytes");
            return null;
        }
        if (this.f34671a.available() < jL) {
            c99.f();
            return null;
        }
        int i = (int) jL;
        byte[] bArr = new byte[i];
        r(bArr, i);
        return bArr;
    }
}

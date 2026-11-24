package a;

import android.gov.nist.core.Separators;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class gko {
    public static final Charset d = StandardCharsets.US_ASCII;
    public static final String[] e = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] f = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f11453a;
    public final int b;
    public final byte[] c;

    /* JADX WARN: Multi-variable type inference failed */
    public gko(byte[] bArr, int i, int i2) {
        this.f11453a = i;
        this.b = i2;
        this.c = bArr;
    }

    public static gko a(long j, ByteOrder byteOrder) {
        return b(new long[]{j}, byteOrder);
    }

    public static gko b(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j : jArr) {
            byteBufferWrap.putInt((int) j);
        }
        return new gko(byteBufferWrap.array(), 4, jArr.length);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(Separators.LPAREN);
        sb.append(e[this.f11453a]);
        sb.append(", data length:");
        return rz4.j(this.c.length, Separators.RPAREN, sb);
    }
}

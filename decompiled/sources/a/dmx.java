package a;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dmx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f6339a;
    public static final byte[] b;

    static {
        Charset.forName("US-ASCII");
        f6339a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        int length = bArr.length;
        try {
            if (length < 0) {
                throw new znx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            int i = (0 - 0) + length;
            if (i < 0) {
                throw new znx("Failed to parse the message.");
            }
            if (i > Integer.MAX_VALUE) {
                throw new znx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        } catch (znx e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }
}

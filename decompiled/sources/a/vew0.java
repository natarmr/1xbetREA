package a;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vew0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f37305a;

    static {
        byte[] bArr = new byte[0];
        f37305a = bArr;
        ByteBuffer.wrap(bArr);
        int i = 0 + 0;
        try {
            if (i < 0) {
                throw new zew0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            }
            if (i > Integer.MAX_VALUE) {
                throw new zew0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        } catch (zew0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }
}

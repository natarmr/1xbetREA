package a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public final class ux40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f36424a = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);
    public long b = 0;
    public long c = 0;
    public int d = 0;

    public final void a() {
        ByteBuffer byteBuffer = this.f36424a;
        byteBuffer.flip();
        while (byteBuffer.remaining() >= 16) {
            b(byteBuffer);
        }
        byteBuffer.compact();
    }

    public final void b(ByteBuffer byteBuffer) {
        long j = byteBuffer.getLong();
        long j2 = byteBuffer.getLong();
        long jRotateLeft = (Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.b;
        this.b = jRotateLeft;
        long jRotateLeft2 = Long.rotateLeft(jRotateLeft, 27);
        long j3 = this.c;
        this.b = ((jRotateLeft2 + j3) * 5) + 1390208809;
        long jRotateLeft3 = (Long.rotateLeft(j2 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ j3;
        this.c = jRotateLeft3;
        this.c = ((Long.rotateLeft(jRotateLeft3, 31) + this.b) * 5) + 944331445;
        this.d += 16;
    }

    public final ux40 c(byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr, 0, bArr.length).order(ByteOrder.LITTLE_ENDIAN);
        int iRemaining = byteBufferOrder.remaining();
        ByteBuffer byteBuffer = this.f36424a;
        if (iRemaining <= byteBuffer.remaining()) {
            byteBuffer.put(byteBufferOrder);
            if (byteBuffer.remaining() < 8) {
                a();
            }
            return this;
        }
        int iPosition = 16 - byteBuffer.position();
        for (int i = 0; i < iPosition; i++) {
            byteBuffer.put(byteBufferOrder.get());
        }
        a();
        while (byteBufferOrder.remaining() >= 16) {
            b(byteBufferOrder);
        }
        byteBuffer.put(byteBufferOrder);
        return this;
    }
}

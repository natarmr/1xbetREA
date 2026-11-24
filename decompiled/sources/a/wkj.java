package a;

import android.gov.nist.core.Separators;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class wkj extends syx {
    public androidx.media3.common.b e;
    public final pef f;
    public ByteBuffer g;
    public boolean h;
    public long i;
    public ByteBuffer j;
    public final byte k;

    static {
        hn30.a("media3.decoder");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public wkj(int i) {
        super((byte) 1);
        this.f = new pef();
        this.k = i;
    }

    public void v() {
        this.b = 0;
        ByteBuffer byteBuffer = this.g;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.j;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.h = false;
    }

    public final ByteBuffer w(int i) {
        byte b = this.k;
        if (b == 1) {
            return ByteBuffer.allocate(i);
        }
        if (b == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.g;
        throw new vkj(ohs0.m("Buffer too small (", byteBuffer == null ? 0 : byteBuffer.capacity(), " < ", Separators.RPAREN, i));
    }

    public final void x(int i) {
        ByteBuffer byteBuffer = this.g;
        if (byteBuffer == null) {
            this.g = w(i);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (iCapacity >= i2) {
            this.g = byteBuffer;
            return;
        }
        ByteBuffer byteBufferW = w(i2);
        byteBufferW.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferW.put(byteBuffer);
        }
        this.g = byteBufferW;
    }

    public final void y() {
        ByteBuffer byteBuffer = this.g;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.j;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}

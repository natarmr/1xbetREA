package a;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class wf9 implements emk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f39059a;
    public final int b;

    public wf9(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        this.f39059a = byteBufferSlice;
        this.b = byteBufferSlice.capacity();
    }

    @Override // a.emk0
    public final long Y(f99 f99Var, long j) {
        ByteBuffer byteBuffer = this.f39059a;
        int iPosition = byteBuffer.position();
        int i = this.b;
        if (iPosition == i) {
            return -1L;
        }
        int iPosition2 = (int) (((long) byteBuffer.position()) + j);
        if (iPosition2 <= i) {
            i = iPosition2;
        }
        byteBuffer.limit(i);
        return f99Var.write(byteBuffer);
    }

    @Override // a.emk0
    public final fmq0 h() {
        return fmq0.d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

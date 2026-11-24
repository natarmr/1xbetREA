package a;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ra6 extends wkj {
    public long l;
    public int m;
    public byte n;

    public final boolean A() {
        return this.m > 0;
    }

    @Override // a.wkj
    public final void v() {
        super.v();
        this.m = 0;
    }

    public final boolean z(wkj wkjVar) {
        ByteBuffer byteBuffer;
        x0x.A(!wkjVar.m(1073741824));
        x0x.A(!wkjVar.m(268435456));
        x0x.A(!wkjVar.m(4));
        if (A()) {
            if (this.m >= this.n) {
                return false;
            }
            ByteBuffer byteBuffer2 = wkjVar.g;
            if (byteBuffer2 != null && (byteBuffer = this.g) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.m;
        this.m = i + 1;
        if (i == 0) {
            this.i = wkjVar.i;
            if (wkjVar.m(1)) {
                this.b = 1;
            }
        }
        ByteBuffer byteBuffer3 = wkjVar.g;
        if (byteBuffer3 != null) {
            x(byteBuffer3.remaining());
            this.g.put(byteBuffer3);
        }
        this.l = wkjVar.i;
        return true;
    }
}

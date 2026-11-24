package a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class wtb extends rv5 {
    public t3x i;
    public t3x j;

    /* JADX WARN: Code duplicated, block: B:33:0x0077  */
    /* JADX WARN: Code duplicated, block: B:34:0x0080  */
    /* JADX WARN: Code duplicated, block: B:36:0x0088  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:40:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00df  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:63:0x0107  */
    /* JADX WARN: Code duplicated, block: B:65:0x0117  */
    @Override // a.u34
    public final void d(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder;
        ByteOrder byteOrder;
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        t3x t3xVar = this.j;
        t3xVar.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferL = l(((iLimit - iPosition) / this.b.d) * this.c.d);
        while (iPosition < iLimit) {
            for (int i5 = 0; i5 < t3xVar.b; i5++) {
                int iQ = (vtt0.q(this.b.c) * t3xVar.a(i5)) + iPosition;
                int i6 = this.b.c;
                if (i6 == 2) {
                    byteBufferL.putShort(byteBuffer.getShort(iQ));
                } else if (i6 == 3) {
                    byteBufferL.put(byteBuffer.get(iQ));
                } else if (i6 == 4) {
                    byteBufferL.putFloat(byteBuffer.getFloat(iQ));
                } else if (i6 == 21) {
                    byteOrderOrder = byteBuffer.order();
                    byteOrder = ByteOrder.BIG_ENDIAN;
                    if (byteOrderOrder == byteOrder) {
                        i = iQ;
                    } else {
                        i = iQ + 2;
                    }
                    byte b = byteBuffer.get(i);
                    byte b2 = byteBuffer.get(iQ + 1);
                    if (byteBuffer.order() == byteOrder) {
                        iQ += 2;
                    }
                    i2 = ((((b << 24) & (-16777216)) | ((b2 << 16) & 16711680)) | ((byteBuffer.get(iQ) << 8) & 65280)) >> 8;
                    if ((i2 & (-16777216)) != 0 || (i2 & (-8388608)) == -8388608) {
                        z = true;
                    } else {
                        z = false;
                    }
                    x0x.y("Value out of range of 24-bit integer: %s", Integer.toHexString(i2), z);
                    x0x.A(byteBufferL.remaining() >= 3);
                    if (byteBufferL.order() == byteOrder) {
                        i3 = (i2 & 16711680) >> 16;
                    } else {
                        i3 = i2 & 255;
                    }
                    byte b3 = (byte) i3;
                    byte b4 = (byte) ((i2 & 65280) >> 8);
                    if (byteBufferL.order() == byteOrder) {
                        i4 = i2 & 255;
                    } else {
                        i4 = (i2 & 16711680) >> 16;
                    }
                    byteBufferL.put(b3).put(b4).put((byte) i4);
                } else if (i6 == 22) {
                    byteBufferL.putInt(byteBuffer.getInt(iQ));
                } else if (i6 == 268435456) {
                    byteBufferL.putShort(byteBuffer.getShort(iQ));
                } else if (i6 == 1342177280) {
                    byteOrderOrder = byteBuffer.order();
                    byteOrder = ByteOrder.BIG_ENDIAN;
                    if (byteOrderOrder == byteOrder) {
                        i = iQ;
                    } else {
                        i = iQ + 2;
                    }
                    byte b5 = byteBuffer.get(i);
                    byte b6 = byteBuffer.get(iQ + 1);
                    if (byteBuffer.order() == byteOrder) {
                        iQ += 2;
                    }
                    i2 = ((((b5 << 24) & (-16777216)) | ((b6 << 16) & 16711680)) | ((byteBuffer.get(iQ) << 8) & 65280)) >> 8;
                    if ((i2 & (-16777216)) != 0) {
                        z = true;
                    } else {
                        z = true;
                    }
                    x0x.y("Value out of range of 24-bit integer: %s", Integer.toHexString(i2), z);
                    x0x.A(byteBufferL.remaining() >= 3);
                    if (byteBufferL.order() == byteOrder) {
                        i3 = (i2 & 16711680) >> 16;
                    } else {
                        i3 = i2 & 255;
                    }
                    byte b7 = (byte) i3;
                    byte b8 = (byte) ((i2 & 65280) >> 8);
                    if (byteBufferL.order() == byteOrder) {
                        i4 = i2 & 255;
                    } else {
                        i4 = (i2 & 16711680) >> 16;
                    }
                    byteBufferL.put(b7).put(b8).put((byte) i4);
                } else if (i6 != 1610612736) {
                    if (i6 != 1879048192) {
                        if (i6 == 1895825408) {
                            byteBufferL.putFloat(byteBuffer.getFloat(iQ));
                        } else if (i6 != 1912602624) {
                            hny.s(this.b.c, "Unexpected encoding: ");
                            return;
                        }
                    }
                    byteBufferL.putDouble(byteBuffer.getDouble(iQ));
                } else {
                    byteBufferL.putInt(byteBuffer.getInt(iQ));
                }
            }
            iPosition += this.b.d;
        }
        byteBuffer.position(iLimit);
        byteBufferL.flip();
    }

    @Override // a.rv5
    public final q34 h(q34 q34Var) throws t34 {
        int i = q34Var.c;
        t3x t3xVar = this.i;
        if (t3xVar == null) {
            return q34.e;
        }
        int i2 = q34Var.b;
        if (!vtt0.I(i)) {
            throw new t34(q34Var);
        }
        int i3 = t3xVar.b;
        boolean z = i2 != i3;
        int i4 = 0;
        while (i4 < i3) {
            int iA = t3xVar.a(i4);
            if (iA >= i2) {
                throw new t34("Channel map (" + t3xVar + ") trying to access non-existent input channel.", q34Var);
            }
            z |= iA != i4;
            i4++;
        }
        return z ? new q34(q34Var.f28032a, i3, i) : q34.e;
    }

    @Override // a.rv5
    public final void i() {
        this.j = this.i;
    }

    @Override // a.rv5
    public final void k() {
        this.j = null;
        this.i = null;
    }
}

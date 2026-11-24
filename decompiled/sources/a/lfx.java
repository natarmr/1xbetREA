package a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lfx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f19979a;
    public final boolean b;

    /* JADX WARN: Multi-variable type inference failed */
    public lfx(byte[] bArr, int i, byte b) throws InvalidKeyException {
        switch (b) {
            case 1:
                if (bArr.length != 32) {
                    throw new InvalidKeyException("The key length in bytes must be 32.");
                }
                this.f19979a = xww0.d(bArr);
                this.b = i;
                return;
            default:
                if (bArr.length != 32) {
                    throw new InvalidKeyException("The key length in bytes must be 32.");
                }
                this.f19979a = kbb.c(bArr);
                this.b = i;
                return;
        }
    }

    public ByteBuffer a(byte[] bArr, int i) {
        int[] iArrB = b(kbb.c(bArr), i);
        int[] iArr = (int[]) iArrB.clone();
        kbb.b(iArr);
        for (int i2 = 0; i2 < iArrB.length; i2++) {
            iArrB[i2] = iArrB[i2] + iArr[i2];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrB, 0, 16);
        return byteBufferOrder;
    }

    public abstract int[] b(int[] iArr, int i);

    public abstract int c();

    public void d(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (bArr.length != c()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + c());
        }
        int iRemaining = byteBuffer2.remaining();
        int i = iRemaining / 64;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer byteBufferA = a(bArr, (this.b ? 1 : 0) + i3);
            if (i3 == i) {
                nia0.h0(byteBuffer, byteBuffer2, byteBufferA, iRemaining % 64);
            } else {
                nia0.h0(byteBuffer, byteBuffer2, byteBufferA, 64);
            }
        }
    }

    public abstract int e();

    public ByteBuffer f(byte[] bArr, int i) {
        int[] iArrH = h(xww0.d(bArr), i);
        int[] iArr = (int[]) iArrH.clone();
        xww0.b(iArr);
        for (int i2 = 0; i2 < iArrH.length; i2++) {
            iArrH[i2] = iArrH[i2] + iArr[i2];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrH, 0, 16);
        return byteBufferOrder;
    }

    public void g(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (bArr.length != e()) {
            throw new GeneralSecurityException(twn.m(e(), "The nonce length (in bytes) must be "));
        }
        int iRemaining = byteBuffer2.remaining();
        int i = iRemaining / 64;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer byteBufferF = f(bArr, (this.b ? 1 : 0) + i3);
            if (i3 == i) {
                egm0.y(byteBuffer, byteBuffer2, byteBufferF, iRemaining % 64);
            } else {
                egm0.y(byteBuffer, byteBuffer2, byteBufferF, 64);
            }
        }
    }

    public abstract int[] h(int[] iArr, int i);
}

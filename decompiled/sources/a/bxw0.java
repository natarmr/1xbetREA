package a;

/* JADX INFO: loaded from: classes2.dex */
public final class bxw0 extends lfx {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bxw0(byte[] bArr, int i, byte b) {
        super(bArr, i, (byte) 1);
        this.c = b;
    }

    @Override // a.lfx
    public final int e() {
        switch (this.c) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }

    @Override // a.lfx
    public final int[] h(int[] iArr, int i) {
        byte b = this.c;
        int[] iArr2 = this.f19979a;
        switch (b) {
            case 0:
                if (iArr.length != 3) {
                    jf4.l("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length << 5)});
                    return null;
                }
                int[] iArr3 = new int[16];
                int[] iArr4 = xww0.f41630a;
                System.arraycopy(iArr4, 0, iArr3, 0, iArr4.length);
                System.arraycopy(iArr2, 0, iArr3, iArr4.length, 8);
                iArr3[12] = i;
                System.arraycopy(iArr, 0, iArr3, 13, iArr.length);
                return iArr3;
            default:
                if (iArr.length != 6) {
                    jf4.l("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length << 5)});
                    return null;
                }
                int[] iArr5 = new int[16];
                int[] iArrE = xww0.e(iArr2, iArr);
                int[] iArr6 = xww0.f41630a;
                System.arraycopy(iArr6, 0, iArr5, 0, iArr6.length);
                System.arraycopy(iArrE, 0, iArr5, iArr6.length, 8);
                iArr5[12] = i;
                iArr5[13] = 0;
                iArr5[14] = iArr[4];
                iArr5[15] = iArr[5];
                return iArr5;
        }
    }
}

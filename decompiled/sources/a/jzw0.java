package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class jzw0 extends kyw0 {
    public final byte[] d;

    public jzw0(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.d = bArr;
    }

    @Override // a.kyw0
    public final byte[] G() {
        return this.d;
    }
}

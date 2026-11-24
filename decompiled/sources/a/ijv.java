package a;

import android.util.Size;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ijv {
    public static final byte[] e = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14896a = -1;
    public int b = -1;
    public boolean c = false;
    public Serializable d;

    /* JADX WARN: Multi-variable type inference failed */
    public ijv(a1... a1VarArr) {
        this.d = a1VarArr;
    }

    public Size a(w0x w0xVar) {
        int iS = w0xVar.s(0);
        Size size = (Size) w0xVar.e(w0x.o0, null);
        int i = this.b;
        int i2 = this.f14896a;
        if (size != null) {
            int iH = hp4.H(hp4.K(iS), i2, 1 == i);
            if (iH == 90 || iH == 270) {
                return new Size(size.getHeight(), size.getWidth());
            }
        }
        return size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [byte[], java.io.Serializable] */
    public void b(byte[] bArr, int i, int i2) {
        if (this.c) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.d;
            int length = bArr2.length;
            int i4 = this.f14896a + i3;
            Object obj = bArr2;
            if (length < i4) {
                ?? CopyOf = Arrays.copyOf(bArr2, i4 * 2);
                this.d = CopyOf;
                obj = CopyOf;
            }
            System.arraycopy(bArr, i, obj, this.f14896a, i3);
            this.f14896a += i3;
        }
    }
}

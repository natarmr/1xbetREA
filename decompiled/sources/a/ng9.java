package a;

import java.io.OutputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ng9 extends OutputStream {
    public static final byte[] e = new byte[0];
    public int b;
    public int d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f23473a = new ArrayList();
    public byte[] c = new byte[128];

    public final void a(int i) {
        this.f23473a.add(new nh00(this.c));
        int length = this.b + this.c.length;
        this.b = length;
        this.c = new byte[Math.max(128, Math.max(i, length >>> 1))];
        this.d = 0;
    }

    public final void c() {
        int i = this.d;
        byte[] bArr = this.c;
        int length = bArr.length;
        ArrayList arrayList = this.f23473a;
        if (i >= length) {
            arrayList.add(new nh00(bArr));
            this.c = e;
        } else if (i > 0) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            arrayList.add(new nh00(bArr2));
        }
        this.b += this.d;
        this.d = 0;
    }

    public final synchronized pg9 d() {
        ArrayList arrayList;
        c();
        arrayList = this.f23473a;
        return arrayList.isEmpty() ? pg9.f26941a : pg9.b(arrayList.iterator(), arrayList.size());
    }

    public final String toString() {
        int i;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i = this.b + this.d;
        }
        return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        try {
            byte[] bArr2 = this.c;
            int length = bArr2.length;
            int i3 = this.d;
            if (i2 <= length - i3) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.d += i2;
            } else {
                int length2 = bArr2.length - i3;
                System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                a(i4);
                System.arraycopy(bArr, i + length2, this.c, 0, i4);
                this.d = i4;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        try {
            if (this.d == this.c.length) {
                a(1);
            }
            byte[] bArr = this.c;
            int i2 = this.d;
            this.d = i2 + 1;
            bArr[i2] = (byte) i;
        } catch (Throwable th) {
            throw th;
        }
    }
}

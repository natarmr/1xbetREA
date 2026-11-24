package a;

import android.util.LongSparseArray;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t340 implements ixg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w3c0 f33248a;
    public final w3c0 b;
    public final hsj c = new hsj();
    public final wkj d = new wkj(1);
    public final LongSparseArray e = new LongSparseArray();
    public final int f;
    public byte[] g;
    public long h;
    public boolean i;
    public boolean j;

    public t340(w3c0 w3c0Var, w3c0 w3c0Var2, androidx.media3.common.b bVar) {
        this.f33248a = w3c0Var;
        this.b = w3c0Var2;
        int i = bVar.r;
        this.f = i != -1 ? i + 2 : 18;
        this.h = -9223372036854775807L;
    }

    @Override // a.ixg0
    public final int a() {
        return this.f33248a.a();
    }

    @Override // a.ixg0
    public final int b(hsj hsjVar, wkj wkjVar, int i) {
        byte[] bArr;
        boolean z;
        int length;
        int length2;
        int iB = this.f33248a.b(hsjVar, wkjVar, i);
        if (iB == -4) {
            int i2 = 4;
            if (!wkjVar.m(4) && (i & 4) == 0) {
                boolean z2 = true;
                if ((i & 1) == 0 && !this.i) {
                    long j = wkjVar.i;
                    boolean z3 = this.j;
                    byte[] bArr2 = null;
                    LongSparseArray longSparseArray = this.e;
                    if (z3) {
                        break;
                    }
                    while (true) {
                        wkj wkjVar2 = this.d;
                        wkjVar2.v();
                        w3c0 w3c0Var = this.b;
                        hsj hsjVar2 = this.c;
                        int iB2 = w3c0Var.b(hsjVar2, wkjVar2, 0);
                        if (iB2 != -3) {
                            if (iB2 != -5) {
                                if (wkjVar2.m(i2)) {
                                    this.j = z2;
                                } else {
                                    long j2 = wkjVar2.i;
                                    long j3 = this.h;
                                    if (j3 != -9223372036854775807L && j2 < j3) {
                                        this.i = z2;
                                        longSparseArray.clear();
                                        this.g = bArr2;
                                    }
                                    this.h = j2;
                                    ByteBuffer byteBuffer = wkjVar2.g;
                                    if (this.i || byteBuffer == null) {
                                        z = z2;
                                    } else {
                                        wkjVar2.y();
                                        androidx.media3.common.b bVar = (androidx.media3.common.b) hsjVar2.b;
                                        if (bVar != null) {
                                            List list = bVar.s;
                                            length = 0;
                                            for (int i3 = 0; i3 < list.size(); i3++) {
                                                length += ((byte[]) list.get(i3)).length;
                                            }
                                        } else {
                                            length = 0;
                                        }
                                        byte[] bArr3 = new byte[byteBuffer.remaining() + length];
                                        if (bVar != null) {
                                            List list2 = bVar.s;
                                            int i4 = 0;
                                            length2 = 0;
                                            while (i4 < list2.size()) {
                                                byte[] bArr4 = (byte[]) list2.get(i4);
                                                System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
                                                length2 += bArr4.length;
                                                i4++;
                                                z2 = z2;
                                            }
                                        } else {
                                            length2 = 0;
                                        }
                                        z = z2;
                                        byteBuffer.get(bArr3, length2, byteBuffer.remaining());
                                        longSparseArray.put(j2, bArr3);
                                        while (longSparseArray.size() > this.f) {
                                            longSparseArray.removeAt(0);
                                        }
                                    }
                                    if (j2 > j) {
                                        break;
                                    }
                                    z2 = z;
                                    i2 = 4;
                                    bArr2 = null;
                                }
                            }
                        }
                        break;
                        break;
                    }
                    long j4 = wkjVar.i;
                    int size = longSparseArray.size() - 1;
                    while (true) {
                        if (size < 0) {
                            bArr = null;
                            break;
                        }
                        if (longSparseArray.keyAt(size) <= j4) {
                            bArr = (byte[]) longSparseArray.valueAt(size);
                            break;
                        }
                        size--;
                    }
                    if (bArr != null) {
                        this.g = bArr;
                    }
                    byte[] bArr5 = this.g;
                    if (bArr5 != null) {
                        int length3 = bArr5.length;
                        ByteBuffer byteBuffer2 = wkjVar.j;
                        if (byteBuffer2 == null || byteBuffer2.capacity() < length3) {
                            wkjVar.j = ByteBuffer.allocate(length3);
                        } else {
                            wkjVar.j.clear();
                        }
                        wkjVar.j.put(bArr5);
                        wkjVar.b(268435456);
                        return iB;
                    }
                }
            }
        }
        return iB;
    }

    @Override // a.ixg0
    public final void c() {
        this.f33248a.c();
        if (this.i) {
            return;
        }
        this.b.c();
    }

    @Override // a.ixg0
    public final int d(long j) {
        return this.f33248a.d(j);
    }

    @Override // a.ixg0
    public final boolean isReady() {
        return this.f33248a.isReady();
    }
}

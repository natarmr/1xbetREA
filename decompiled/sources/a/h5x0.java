package a;

import java.util.Arrays;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class h5x0 implements Comparable {
    public static final /* synthetic */ long c = defpackage.a.f0a.objectFieldOffset(h5x0.class.getDeclaredField("b"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12503a;
    public volatile Object b;

    public /* synthetic */ h5x0(String str, byte[] bArr) {
        this.f12503a = str;
        this.b = bArr;
    }

    public final /* synthetic */ void a(byte[] bArr) {
        byte[][] bArr2;
        h5x0 h5x0Var;
        int i = 0;
        while (true) {
            Object obj = this.b;
            if (!(obj instanceof byte[])) {
                byte[][] bArr3 = (byte[][]) obj;
                while (true) {
                    int length = bArr3.length;
                    if (i >= length) {
                        bArr2 = (byte[][]) Arrays.copyOf(bArr3, length + 1);
                        bArr2[length] = bArr;
                        break;
                    } else if (Arrays.equals(bArr, bArr3[i])) {
                        return;
                    } else {
                        i++;
                    }
                }
            } else {
                byte[] bArr4 = (byte[]) obj;
                if (Arrays.equals(bArr, bArr4)) {
                    return;
                }
                i = 1;
                bArr2 = new byte[][]{bArr4, bArr};
            }
            byte[][] bArr5 = bArr2;
            while (true) {
                Unsafe unsafe = defpackage.a.f0a;
                long j = c;
                h5x0Var = this;
                if (unsafe.compareAndSwapObject(h5x0Var, j, obj, bArr5)) {
                    return;
                }
                if (unsafe.getObjectVolatile(h5x0Var, j) != obj) {
                    break;
                } else {
                    this = h5x0Var;
                }
            }
            this = h5x0Var;
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.f12503a.compareTo((String) obj);
    }
}

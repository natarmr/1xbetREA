package a;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class s68 {
    public InputStream d;
    public boolean e;
    public long f;
    public int g;
    public int h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f31691a = new byte[4160];
    public final int[] b = new int[1040];
    public final edu c = new edu((byte) 21);
    public int i = 0;

    public static void a(s68 s68Var, boolean z) {
        if (s68Var.e) {
            int i = ((s68Var.h << 2) + ((s68Var.g + 7) >> 3)) - 8;
            int i2 = s68Var.i;
            if (i > i2) {
                v4i0.l("Read after end");
            } else {
                if (!z || i == i2) {
                    return;
                }
                v4i0.l("Unused bytes after end");
            }
        }
    }

    public static void b(s68 s68Var) {
        int i = s68Var.g;
        if (i >= 32) {
            int[] iArr = s68Var.b;
            int i2 = s68Var.h;
            s68Var.h = i2 + 1;
            s68Var.f = (((long) iArr[i2]) << 32) | (s68Var.f >>> 32);
            s68Var.g = i - 32;
        }
    }

    public static int c(s68 s68Var) {
        return (s68Var.e ? (s68Var.i + 3) >> 2 : 1024) - s68Var.h;
    }

    public static int d(s68 s68Var, int i) {
        b(s68Var);
        long j = s68Var.f;
        int i2 = s68Var.g;
        int i3 = ((int) (j >>> i2)) & ((1 << i) - 1);
        s68Var.g = i2 + i;
        return i3;
    }

    public static void e(s68 s68Var) {
        int i = s68Var.h;
        byte[] bArr = s68Var.f31691a;
        if (i <= 1015) {
            return;
        }
        if (s68Var.e) {
            if (c(s68Var) >= -2) {
                return;
            }
            v4i0.l("No more input");
            return;
        }
        int i2 = i << 2;
        int i3 = 4096 - i2;
        System.arraycopy(bArr, i2, bArr, 0, i3);
        s68Var.h = 0;
        while (i3 < 4096) {
            try {
                int i4 = s68Var.d.read(bArr, i3, 4096 - i3);
                if (i4 <= 0) {
                    s68Var.e = true;
                    s68Var.i = i3;
                    i3 += 3;
                    break;
                }
                i3 += i4;
            } catch (IOException e) {
                throw new s89("Failed to read input", e);
            }
        }
        edu eduVar = s68Var.c;
        int i5 = i3 >> 2;
        for (int i6 = 0; i6 < i5; i6++) {
            int[] iArr = (int[]) eduVar.b;
            byte[] bArr2 = (byte[]) eduVar.c;
            int i7 = i6 * 4;
            iArr[i6] = ((bArr2[i7 + 3] & 255) << 24) | (bArr2[i7] & 255) | ((bArr2[i7 + 1] & 255) << 8) | ((bArr2[i7 + 2] & 255) << 16);
        }
    }
}

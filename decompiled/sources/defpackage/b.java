package defpackage;

import a.bvb;
import a.mm40;
import java.io.ByteArrayOutputStream;
import kotlin.collections.CollectionsKt;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static final String a(byte[] bArr) {
        char[] cArrH0 = CollectionsKt.H0(CollectionsKt.r0(CollectionsKt.r0(CollectionsKt.q0(CollectionsKt.o0(new bvb('A', 'Z'), new bvb('a', 'z')), new bvb('0', '9')), '+'), '/'));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2 += 3) {
            int i3 = ((bArr[i2] & 255) << 16) & 16777215;
            int i4 = i2 + 1;
            if (i4 < bArr.length) {
                i3 |= (bArr[i4] & 255) << 8;
            } else {
                i++;
            }
            int i5 = i2 + 2;
            if (i5 < bArr.length) {
                i3 |= bArr[i5] & 255;
            } else {
                i++;
            }
            int i6 = 4 - i;
            for (int i7 = 0; i7 < i6; i7++) {
                byteArrayOutputStream.write(cArrH0[(16515072 & i3) >> 18]);
                i3 <<= 6;
            }
        }
        for (int i8 = 0; i8 < i; i8++) {
            byteArrayOutputStream.write(61);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return new String(byteArray, Charsets.UTF_8);
    }

    public static final byte[] b(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        str.getClass();
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        int[] iArr = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i5 = 0;
        while (i5 < bytes.length) {
            int i6 = iArr[bytes[i5]];
            if (i6 != -1) {
                int i7 = (i6 & 255) << 18;
                int i8 = i5 + 1;
                if (i8 >= bytes.length || (i4 = iArr[bytes[i8]]) == -1) {
                    i = 0;
                } else {
                    i7 |= (i4 & 255) << 12;
                    i = 1;
                }
                int i9 = i5 + 2;
                if (i9 < bytes.length && (i3 = iArr[bytes[i9]]) != -1) {
                    i7 |= (i3 & 255) << 6;
                    i++;
                }
                int i10 = i5 + 3;
                if (i10 < bytes.length && (i2 = iArr[bytes[i10]]) != -1) {
                    i7 |= i2 & 255;
                    i++;
                }
                while (i > 0) {
                    byteArrayOutputStream.write((char) ((16711680 & i7) >> 16));
                    i7 <<= 8;
                    i--;
                }
                i5 += 4;
            } else {
                i5++;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public static final byte[] c(byte[] bArr) {
        bArr.getClass();
        char[] cArrH0 = CollectionsKt.H0(CollectionsKt.r0(CollectionsKt.r0(CollectionsKt.q0(CollectionsKt.o0(new bvb('A', 'Z'), new bvb('a', 'z')), new bvb('0', '9')), '+'), '/'));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2 += 3) {
            int i3 = ((bArr[i2] & 255) << 16) & 16777215;
            int i4 = i2 + 1;
            if (i4 < bArr.length) {
                i3 |= (bArr[i4] & 255) << 8;
            } else {
                i++;
            }
            int i5 = i2 + 2;
            if (i5 < bArr.length) {
                i3 |= bArr[i5] & 255;
            } else {
                i++;
            }
            int i6 = 4 - i;
            for (int i7 = 0; i7 < i6; i7++) {
                byteArrayOutputStream.write(cArrH0[(16515072 & i3) >> 18]);
                i3 <<= 6;
            }
        }
        for (int i8 = 0; i8 < i; i8++) {
            byteArrayOutputStream.write(61);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public static mm40 d(mm40 mm40Var, boolean z) {
        mm40Var.getClass();
        return mm40Var.e(new d(z));
    }
}

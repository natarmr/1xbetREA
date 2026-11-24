package a;

/* JADX INFO: loaded from: classes5.dex */
public final class oiv {
    public static final short[] c = {6554, 16384, 26214, Short.MAX_VALUE};
    public static final short[] d = {3277, 11469, 21299, Short.MAX_VALUE};
    public static final short[] e = {29128, 26215, 23832, 21846, 20165, 18725, 17476, 16384};
    public static final short[] f = {18431, 20479, 22527, 24575, 26623, 28671, 30719, Short.MAX_VALUE};
    public static final short[] g = {8, 7, 6, 6, 5, 5, 5, 5, 4, 4, 4, 4, 4, 4, 4, 4, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public niv f25330a = new niv();
    public miv b = new miv();

    public static void a(short[] sArr) {
        short sK0;
        int i;
        short sK1;
        int i2;
        for (int i3 = 0; i3 < 8; i3++) {
            short s = sArr[i3];
            if (s < 0) {
                short s2 = s == Short.MIN_VALUE ? Short.MAX_VALUE : (short) (-s);
                if (s2 < 11059) {
                    i2 = s2 << 1;
                } else {
                    if (s2 < 20070) {
                        i2 = s2 + 11059;
                    } else {
                        sK1 = obb.k0(((short) (s2 >> 2)) + 26112);
                    }
                    sArr[i3] = (short) (-sK1);
                }
                sK1 = (short) i2;
                sArr[i3] = (short) (-sK1);
            } else {
                if (s < 11059) {
                    i = s << 1;
                } else {
                    if (s < 20070) {
                        i = s + 11059;
                    } else {
                        sK0 = obb.k0(((short) (s >> 2)) + 26112);
                    }
                    sArr[i3] = sK0;
                }
                sK0 = (short) i;
                sArr[i3] = sK0;
            }
        }
    }

    public static void b(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i = 0; i < 8; i++) {
            short sK0 = obb.k0(((short) (sArr[i] >> 2)) + ((short) (sArr2[i] >> 2)));
            sArr3[i] = sK0;
            sArr3[i] = obb.k0(sK0 + ((short) (sArr[i] >> 1)));
        }
    }

    public static void c(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i = 0; i < 8; i++) {
            sArr3[i] = obb.k0(((short) (sArr[i] >> 1)) + ((short) (sArr2[i] >> 1)));
        }
    }

    public static void d(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i = 0; i < 8; i++) {
            short sK0 = obb.k0(((short) (sArr[i] >> 2)) + ((short) (sArr2[i] >> 2)));
            sArr3[i] = sK0;
            sArr3[i] = obb.k0(sK0 + ((short) (sArr2[i] >> 1)));
        }
    }

    public static void e(short[] sArr, short[] sArr2) {
        i(sArr, sArr2, 0, (short) 0, (short) -32, (short) 13107);
        i(sArr, sArr2, 1, (short) 0, (short) -32, (short) 13107);
        i(sArr, sArr2, 2, (short) 2048, (short) -16, (short) 13107);
        i(sArr, sArr2, 3, (short) -2560, (short) -16, (short) 13107);
        i(sArr, sArr2, 4, (short) 94, (short) -8, (short) 19223);
        i(sArr, sArr2, 5, (short) -1792, (short) -8, (short) 17476);
        i(sArr, sArr2, 6, (short) -341, (short) -4, (short) 31454);
        i(sArr, sArr2, 7, (short) -1144, (short) -4, (short) 29708);
    }

    public static void f(niv nivVar, short[] sArr, int i, short[] sArr2, int i2) {
        short[] sArr3 = nivVar.e;
        while (i != 0) {
            i--;
            short sK0 = sArr2[i2];
            short sK1 = sK0;
            for (int i3 = 0; i3 < 8; i3++) {
                short s = sArr3[i3];
                short s2 = sArr[i3];
                sArr3[i3] = sK1;
                sK1 = obb.k0(obb.i0(s2, sK0) + s);
                sK0 = obb.k0(obb.i0(s2, s) + sK0);
            }
            sArr2[i2] = sK0;
            i2++;
        }
    }

    public static void g(miv mivVar, short[] sArr, int i, short[] sArr2, short[] sArr3, int i2) {
        short[] sArr4 = mivVar.e;
        while (i != 0) {
            i--;
            short sK0 = sArr2[i2];
            for (int i3 = 7; -1 < i3; i3--) {
                short s = sArr[i3];
                sK0 = obb.k0(sK0 - obb.i0(s, sArr4[i3]));
                sArr4[i3 + 1] = obb.k0(obb.i0(s, sK0) + sArr4[i3]);
            }
            sArr3[i2] = sK0;
            sArr4[0] = sK0;
            i2++;
        }
    }

    public static void h(int i, int i2, int i3, int i4, short[] sArr, int i5) {
        short s;
        short s2 = (short) i;
        short s3 = sArr[i5];
        short sK0 = (short) (obb.k0(obb.k0(((s2 == Short.MIN_VALUE && s3 == Short.MIN_VALUE) ? Short.MAX_VALUE : (short) ((s2 * s3) >> 15)) + ((short) i2)) + 256) >> 9);
        if (sK0 > i3) {
            s = (short) (i3 - i4);
        } else {
            s = sK0 < i4 ? (short) 0 : (short) (sK0 - i4);
        }
        sArr[i5] = s;
    }

    public static void i(short[] sArr, short[] sArr2, int i, short s, short s2, short s3) {
        short sI0 = obb.i0(s3, obb.k0(((short) (obb.k0(sArr[i] + s2) << 10)) - ((short) (s << 1))));
        sArr2[i] = obb.k0(sI0 + sI0);
    }
}

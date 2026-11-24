package a;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jl60 implements rae0 {
    public static float d(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = i;
        float f3 = f2 / i2;
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f6 = iArr2[i4] * f3;
            float f7 = i5;
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }

    public static void e(int i, p68 p68Var, int[] iArr) throws o660 {
        int length = iArr.length;
        int i2 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int i3 = p68Var.b;
        if (i >= i3) {
            throw o660.a();
        }
        boolean z = !p68Var.d(i);
        while (i < i3) {
            if (p68Var.d(i) != z) {
                iArr[i2] = iArr[i2] + 1;
            } else {
                i2++;
                if (i2 == length) {
                    break;
                }
                iArr[i2] = 1;
                z = !z;
            }
            i++;
        }
        if (i2 != length) {
            if (i2 != length - 1 || i != i3) {
                throw o660.a();
            }
        }
    }

    public static void f(int i, p68 p68Var, int[] iArr) throws o660 {
        int length = iArr.length;
        boolean zD = p68Var.d(i);
        while (i > 0 && length >= 0) {
            i--;
            if (p68Var.d(i) != zD) {
                length--;
                zD = !zD;
            }
        }
        if (length >= 0) {
            throw o660.a();
        }
        e(i + 1, p68Var, iArr);
    }

    @Override // a.rae0
    public i0g0 a(chf0 chf0Var, Map map) throws o660 {
        try {
            return c(chf0Var, map);
        } catch (o660 e) {
            if (map == null || !map.containsKey(gkj.d) || !((mjq) ((nhf0) chf0Var.b).f23530a).i()) {
                throw e;
            }
            mjq mjqVarJ = ((mjq) ((nhf0) chf0Var.b).f23530a).j();
            i0g0 i0g0VarC = c(new chf0((Object) new nhf0(mjqVarJ), (byte) 12), map);
            Map map2 = i0g0VarC.e;
            a3g0 a3g0Var = a3g0.f170a;
            int iIntValue = SubsamplingScaleImageView.ORIENTATION_270;
            if (map2 != null && map2.containsKey(a3g0Var)) {
                iIntValue = (((Integer) map2.get(a3g0Var)).intValue() + SubsamplingScaleImageView.ORIENTATION_270) % 360;
            }
            i0g0VarC.b(a3g0Var, Integer.valueOf(iIntValue));
            d3g0[] d3g0VarArr = i0g0VarC.c;
            if (d3g0VarArr != null) {
                int i = mjqVarJ.c;
                for (int i2 = 0; i2 < d3g0VarArr.length; i2++) {
                    d3g0 d3g0Var = d3g0VarArr[i2];
                    d3g0VarArr[i2] = new d3g0((i - d3g0Var.b) - 1.0f, d3g0Var.f5402a);
                }
            }
            return i0g0VarC;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x019f  */
    /* JADX WARN: Code duplicated, block: B:102:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:111:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:113:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:115:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:117:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:118:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:121:0x01d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x01db  */
    /* JADX WARN: Code duplicated, block: B:124:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:126:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:128:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:131:0x01f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:132:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:134:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:136:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:138:0x0200  */
    /* JADX WARN: Code duplicated, block: B:139:0x0203  */
    /* JADX WARN: Code duplicated, block: B:141:0x020a  */
    /* JADX WARN: Code duplicated, block: B:143:0x020e  */
    /* JADX WARN: Code duplicated, block: B:145:0x0214  */
    /* JADX WARN: Code duplicated, block: B:146:0x0218  */
    /* JADX WARN: Code duplicated, block: B:147:0x021e  */
    /* JADX WARN: Code duplicated, block: B:148:0x0223  */
    /* JADX WARN: Code duplicated, block: B:149:0x0225  */
    /* JADX WARN: Code duplicated, block: B:152:0x022d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:153:0x022f  */
    /* JADX WARN: Code duplicated, block: B:154:0x0231  */
    /* JADX WARN: Code duplicated, block: B:200:0x0242 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0232 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ed A[LOOP:4: B:49:0x00eb->B:50:0x00ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:55:0x0102  */
    /* JADX WARN: Code duplicated, block: B:57:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0108  */
    /* JADX WARN: Code duplicated, block: B:59:0x010f  */
    /* JADX WARN: Code duplicated, block: B:62:0x011c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0120  */
    /* JADX WARN: Code duplicated, block: B:65:0x0127  */
    /* JADX WARN: Code duplicated, block: B:66:0x012e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x0130  */
    /* JADX WARN: Code duplicated, block: B:69:0x0134  */
    /* JADX WARN: Code duplicated, block: B:70:0x0137 A[FALL_THROUGH, PHI: r24 r25
  0x0137: PHI (r24v13 int) = (r24v5 int), (r24v5 int), (r24v5 int), (r24v5 int), (r24v15 int), (r24v15 int), (r24v15 int), (r24v15 int) binds: [B:102:0x01a3, B:110:0x01b9, B:114:0x01c5, B:113:0x01c1, B:69:0x0134, B:77:0x014c, B:81:0x0158, B:80:0x0154] A[DONT_GENERATE, DONT_INLINE]
  0x0137: PHI (r25v9 int) = (r25v1 int), (r25v6 int), (r25v6 int), (r25v6 int), (r25v1 int), (r25v12 int), (r25v12 int), (r25v12 int) binds: [B:102:0x01a3, B:110:0x01b9, B:114:0x01c5, B:113:0x01c1, B:69:0x0134, B:77:0x014c, B:81:0x0158, B:80:0x0154] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x013a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0140  */
    /* JADX WARN: Code duplicated, block: B:74:0x0143  */
    /* JADX WARN: Code duplicated, block: B:76:0x014a  */
    /* JADX WARN: Code duplicated, block: B:78:0x014e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0154  */
    /* JADX WARN: Code duplicated, block: B:81:0x0158  */
    /* JADX WARN: Code duplicated, block: B:82:0x015e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0160 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:84:0x0162 A[PHI: r24
  0x0162: PHI (r24v12 int) = (r24v5 int), (r24v15 int) binds: [B:118:0x01d3, B:83:0x0160] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x0169 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x016b A[PHI: r24
  0x016b: PHI (r24v11 int) = (r24v5 int), (r24v15 int) binds: [B:121:0x01d8, B:86:0x0169] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0170 A[PHI: r24
  0x0170: PHI (r24v10 int) = (r24v5 int), (r24v5 int), (r24v15 int), (r24v15 int) binds: [B:120:0x01d6, B:121:0x01d8, B:85:0x0167, B:86:0x0169] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x0174  */
    /* JADX WARN: Code duplicated, block: B:91:0x0179 A[PHI: r24
  0x0179: PHI (r24v9 int) = (r24v5 int), (r24v15 int) binds: [B:102:0x01a3, B:69:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:92:0x017e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0180 A[PHI: r24
  0x0180: PHI (r24v8 int) = (r24v5 int), (r24v15 int) binds: [B:102:0x01a3, B:69:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:94:0x0185 A[PHI: r24
  0x0185: PHI (r24v7 int) = (r24v5 int), (r24v15 int) binds: [B:101:0x01a1, B:68:0x0132] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x018a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x018c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x018e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0195  */
    /* JADX WARN: Code duplicated, block: B:99:0x019d A[DONT_INVERT] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public a.i0g0 b(int r30, a.p68 r31, java.util.Map r32) throws a.bwq, a.q9c, a.o660 {
        /*
            Method dump skipped, instruction units count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.jl60.b(int, a.p68, java.util.Map):a.i0g0");
    }

    public final i0g0 c(chf0 chf0Var, Map map) throws o660 {
        int i;
        chf0 chf0Var2 = chf0Var;
        Map map2 = map;
        mjq mjqVar = (mjq) ((nhf0) chf0Var2.b).f23530a;
        int i2 = mjqVar.b;
        int i3 = mjqVar.c;
        p68 p68Var = new p68(i2);
        int i4 = 1;
        boolean z = map2 != null && map2.containsKey(gkj.d);
        int iMax = Math.max(1, i3 >> (z ? 8 : 5));
        int i5 = z ? i3 : 15;
        int i6 = i3 / 2;
        int i7 = 0;
        while (i7 < i5) {
            int i8 = i7 + 1;
            int i9 = i8 / 2;
            if ((i7 & 1) != 0) {
                i9 = -i9;
            }
            int i10 = (i9 * iMax) + i6;
            if (i10 < 0 || i10 >= i3) {
                break;
            }
            try {
                p68Var = chf0Var2.y(p68Var, i10);
                int i11 = 0;
                while (i11 < 2) {
                    if (i11 == i4) {
                        p68Var.i();
                        if (map2 != null) {
                            Object obj = gkj.j;
                            if (map2.containsKey(obj)) {
                                EnumMap enumMap = new EnumMap(gkj.class);
                                enumMap.putAll(map2);
                                enumMap.remove(obj);
                                map2 = enumMap;
                            }
                        }
                    }
                    try {
                        i0g0 i0g0VarB = b(i10, p68Var, map2);
                        if (i11 == i4) {
                            try {
                                i0g0VarB.b(a3g0.f170a, 180);
                                d3g0[] d3g0VarArr = i0g0VarB.c;
                                if (d3g0VarArr != null) {
                                    i = i4;
                                    float f = i2;
                                    try {
                                        d3g0 d3g0Var = d3g0VarArr[0];
                                        try {
                                            d3g0VarArr[0] = new d3g0((f - d3g0Var.f5402a) - 1.0f, d3g0Var.b);
                                            d3g0 d3g0Var2 = d3g0VarArr[i];
                                            d3g0VarArr[i] = new d3g0((f - d3g0Var2.f5402a) - 1.0f, d3g0Var2.b);
                                        } catch (sae0 unused) {
                                            continue;
                                            i11++;
                                            map2 = map2;
                                            i4 = i;
                                        }
                                    } catch (sae0 unused2) {
                                    }
                                }
                            } catch (sae0 unused3) {
                                i = i4;
                            }
                        }
                        return i0g0VarB;
                    } catch (sae0 unused4) {
                        i = i4;
                    }
                }
            } catch (o660 unused5) {
            }
            chf0Var2 = chf0Var;
            i7 = i8;
            i4 = i4;
        }
        throw o660.a();
    }

    @Override // a.rae0
    public void reset() {
    }
}

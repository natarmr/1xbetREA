package a;

import com.appsflyer.share.attribution.RequestError;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class p640 implements p2h0 {
    public static final int[] j = new int[0];
    public static final Unsafe k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f26437a;
    public final Object[] b;
    public final y3 c;
    public final int[] d;
    public final int e;
    public final em50 f;
    public final cd00 g;
    public final aet0 h;
    public final yo20 i;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new cft0((byte) 1));
        } catch (Throwable unused) {
            unsafe = null;
        }
        k = unsafe;
    }

    public p640(int[] iArr, Object[] objArr, y3 y3Var, int[] iArr2, int i, em50 em50Var, cd00 cd00Var, aet0 aet0Var, wso wsoVar, yo20 yo20Var) {
        this.f26437a = iArr;
        this.b = objArr;
        this.d = iArr2;
        this.e = i;
        this.f = em50Var;
        this.g = cd00Var;
        this.h = aet0Var;
        this.c = y3Var;
        this.i = yo20Var;
    }

    public static boolean m(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof kjt) {
            return ((kjt) obj).m();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:185:0x037f  */
    public static p640 q(y9e0 y9e0Var, em50 em50Var, cd00 cd00Var, aet0 aet0Var, wso wsoVar, yo20 yo20Var) {
        int i;
        int iCharAt;
        int iCharAt2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        char cCharAt;
        int i6;
        char cCharAt2;
        int i7;
        char cCharAt3;
        int i8;
        char cCharAt4;
        int i9;
        int i10;
        int i11;
        char cCharAt5;
        int i12;
        char cCharAt6;
        int i13;
        int i14;
        int i15;
        Object[] objArr;
        int i16;
        int i17;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i18;
        int i19;
        int iObjectFieldOffset3;
        Field fieldT;
        char cCharAt7;
        int i20;
        Field fieldT2;
        Field fieldT3;
        int i21;
        char cCharAt8;
        int i22;
        int i23;
        char cCharAt9;
        int i24;
        char cCharAt10;
        int i25;
        char cCharAt11;
        if (!(y9e0Var instanceof y9e0)) {
            hny.b();
            return null;
        }
        String str = y9e0Var.b;
        int length = str.length();
        char c = 55296;
        if (str.charAt(0) >= 55296) {
            int i26 = 1;
            while (true) {
                i = i26 + 1;
                if (str.charAt(i26) < 55296) {
                    break;
                }
                i26 = i;
            }
        } else {
            i = 1;
        }
        int i27 = i + 1;
        int iCharAt3 = str.charAt(i);
        if (iCharAt3 >= 55296) {
            int i28 = iCharAt3 & 8191;
            int i29 = 13;
            while (true) {
                i25 = i27 + 1;
                cCharAt11 = str.charAt(i27);
                if (cCharAt11 < 55296) {
                    break;
                }
                i28 |= (cCharAt11 & 8191) << i29;
                i29 += 13;
                i27 = i25;
            }
            iCharAt3 = i28 | (cCharAt11 << i29);
            i27 = i25;
        }
        if (iCharAt3 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            i3 = 0;
            i4 = 0;
            iArr = j;
            i2 = 0;
        } else {
            int i30 = i27 + 1;
            int iCharAt4 = str.charAt(i27);
            if (iCharAt4 >= 55296) {
                int i31 = iCharAt4 & 8191;
                int i32 = 13;
                while (true) {
                    i12 = i30 + 1;
                    cCharAt6 = str.charAt(i30);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i31 |= (cCharAt6 & 8191) << i32;
                    i32 += 13;
                    i30 = i12;
                }
                iCharAt4 = i31 | (cCharAt6 << i32);
                i30 = i12;
            }
            int i33 = i30 + 1;
            int iCharAt5 = str.charAt(i30);
            if (iCharAt5 >= 55296) {
                int i34 = iCharAt5 & 8191;
                int i35 = 13;
                while (true) {
                    i11 = i33 + 1;
                    cCharAt5 = str.charAt(i33);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i34 |= (cCharAt5 & 8191) << i35;
                    i35 += 13;
                    i33 = i11;
                }
                iCharAt5 = i34 | (cCharAt5 << i35);
                i33 = i11;
            }
            int i36 = i33 + 1;
            if (str.charAt(i33) >= 55296) {
                while (true) {
                    i10 = i36 + 1;
                    if (str.charAt(i36) < 55296) {
                        break;
                    }
                    i36 = i10;
                }
                i36 = i10;
            }
            int i37 = i36 + 1;
            if (str.charAt(i36) >= 55296) {
                while (true) {
                    i9 = i37 + 1;
                    if (str.charAt(i37) < 55296) {
                        break;
                    }
                    i37 = i9;
                }
                i37 = i9;
            }
            int i38 = i37 + 1;
            iCharAt = str.charAt(i37);
            if (iCharAt >= 55296) {
                int i39 = iCharAt & 8191;
                int i40 = 13;
                while (true) {
                    i8 = i38 + 1;
                    cCharAt4 = str.charAt(i38);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt4 & 8191) << i40;
                    i40 += 13;
                    i38 = i8;
                }
                iCharAt = i39 | (cCharAt4 << i40);
                i38 = i8;
            }
            int i41 = i38 + 1;
            iCharAt2 = str.charAt(i38);
            if (iCharAt2 >= 55296) {
                int i42 = iCharAt2 & 8191;
                int i43 = 13;
                while (true) {
                    i7 = i41 + 1;
                    cCharAt3 = str.charAt(i41);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt3 & 8191) << i43;
                    i43 += 13;
                    i41 = i7;
                }
                iCharAt2 = i42 | (cCharAt3 << i43);
                i41 = i7;
            }
            int i44 = i41 + 1;
            int iCharAt6 = str.charAt(i41);
            if (iCharAt6 >= 55296) {
                int i45 = iCharAt6 & 8191;
                int i46 = 13;
                while (true) {
                    i6 = i44 + 1;
                    cCharAt2 = str.charAt(i44);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt2 & 8191) << i46;
                    i46 += 13;
                    i44 = i6;
                }
                iCharAt6 = i45 | (cCharAt2 << i46);
                i44 = i6;
            }
            int i47 = i44 + 1;
            int iCharAt7 = str.charAt(i44);
            if (iCharAt7 >= 55296) {
                int i48 = iCharAt7 & 8191;
                int i49 = 13;
                while (true) {
                    i5 = i47 + 1;
                    cCharAt = str.charAt(i47);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i48 |= (cCharAt & 8191) << i49;
                    i49 += 13;
                    i47 = i5;
                }
                iCharAt7 = i48 | (cCharAt << i49);
                i47 = i5;
            }
            int i50 = (iCharAt4 * 2) + iCharAt5;
            i2 = iCharAt4;
            i27 = i47;
            iArr = new int[iCharAt7 + iCharAt2 + iCharAt6];
            i3 = i50;
            i4 = iCharAt7;
        }
        Object[] objArr2 = y9e0Var.c;
        Class<?> cls = y9e0Var.f42242a.getClass();
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr3 = new Object[iCharAt * 2];
        int i51 = iCharAt2 + i4;
        int i52 = i4;
        int i53 = 0;
        int i54 = 0;
        while (i27 < length) {
            int i55 = i27 + 1;
            int iCharAt8 = str.charAt(i27);
            if (iCharAt8 >= c) {
                int i56 = iCharAt8 & 8191;
                int i57 = i55;
                int i58 = 13;
                while (true) {
                    i24 = i57 + 1;
                    cCharAt10 = str.charAt(i57);
                    if (cCharAt10 < c) {
                        break;
                    }
                    i56 |= (cCharAt10 & 8191) << i58;
                    i58 += 13;
                    i57 = i24;
                }
                iCharAt8 = i56 | (cCharAt10 << i58);
                i13 = i24;
            } else {
                i13 = i55;
            }
            int i59 = i13 + 1;
            int iCharAt9 = str.charAt(i13);
            if (iCharAt9 >= c) {
                int i60 = iCharAt9 & 8191;
                int i61 = i59;
                int i62 = 13;
                while (true) {
                    i23 = i61 + 1;
                    cCharAt9 = str.charAt(i61);
                    i14 = length;
                    if (cCharAt9 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt9 & 8191) << i62;
                    i62 += 13;
                    i61 = i23;
                    length = i14;
                }
                iCharAt9 = i60 | (cCharAt9 << i62);
                i15 = i23;
            } else {
                i14 = length;
                i15 = i59;
            }
            int i63 = iCharAt9 & 255;
            int[] iArr3 = iArr2;
            if ((iCharAt9 & 1024) != 0) {
                iArr[i54] = i53;
                i54++;
            }
            Unsafe unsafe = k;
            int i64 = iCharAt8;
            if (i63 >= 51) {
                int i65 = i15 + 1;
                int iCharAt10 = str.charAt(i15);
                if (iCharAt10 >= 55296) {
                    int i66 = iCharAt10 & 8191;
                    int i67 = i65;
                    int i68 = 13;
                    while (true) {
                        i21 = i67 + 1;
                        cCharAt8 = str.charAt(i67);
                        i22 = i66;
                        if (cCharAt8 < 55296) {
                            break;
                        }
                        i66 = i22 | ((cCharAt8 & 8191) << i68);
                        i68 += 13;
                        i67 = i21;
                    }
                    iCharAt10 = i22 | (cCharAt8 << i68);
                    i20 = i21;
                } else {
                    i20 = i65;
                }
                int i69 = iCharAt10;
                int i70 = i63 - 51;
                int i71 = i20;
                if (i70 == 9 || i70 == 17) {
                    objArr3[f140.b(i53, 3, 2, 1)] = objArr2[i3];
                    i3++;
                } else if (i70 == 12 && (hne.b(y9e0Var.a(), 1) || (iCharAt9 & 2048) != 0)) {
                    objArr3[f140.b(i53, 3, 2, 1)] = objArr2[i3];
                    i3++;
                }
                int i72 = i69 * 2;
                Object obj = objArr2[i72];
                if (obj instanceof Field) {
                    fieldT2 = (Field) obj;
                } else {
                    fieldT2 = t(cls, (String) obj);
                    objArr2[i72] = fieldT2;
                }
                Object[] objArr4 = objArr3;
                i16 = i51;
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldT2);
                int i73 = i72 + 1;
                Object obj2 = objArr2[i73];
                if (obj2 instanceof Field) {
                    fieldT3 = (Field) obj2;
                } else {
                    fieldT3 = t(cls, (String) obj2);
                    objArr2[i73] = fieldT3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldT3);
                objArr = objArr4;
                i18 = i71;
                i19 = 0;
            } else {
                i2 = i2;
                objArr = objArr3;
                i16 = i51;
                int i74 = i3 + 1;
                Field fieldT4 = t(cls, (String) objArr2[i3]);
                if (i63 == 9 || i63 == 17) {
                    i17 = i74;
                    objArr = objArr;
                    objArr[f140.b(i53, 3, 2, 1)] = fieldT4.getType();
                } else {
                    if (i63 == 27 || i63 == 49) {
                        objArr = objArr;
                        i3 += 2;
                        objArr[f140.b(i53, 3, 2, 1)] = objArr2[i74];
                    } else if (i63 == 12 || i63 == 30 || i63 == 44) {
                        i17 = i74;
                        if (y9e0Var.a() == 1 || (iCharAt9 & 2048) != 0) {
                            objArr = objArr;
                            i3 += 2;
                            objArr[f140.b(i53, 3, 2, 1)] = objArr2[i17];
                        } else {
                            objArr = objArr;
                        }
                    } else if (i63 == 50) {
                        i52++;
                        iArr[i52] = i53;
                        int i75 = (i53 / 3) * 2;
                        int i76 = i3 + 2;
                        objArr[i75] = objArr2[i74];
                        if ((iCharAt9 & 2048) != 0) {
                            objArr[i75 + 1] = objArr2[i76];
                            i3 += 3;
                        } else {
                            i3 = i76;
                        }
                    } else {
                        i17 = i74;
                        objArr = objArr;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldT4);
                    if ((iCharAt9 & 4096) != 0 || i63 > 17) {
                        iObjectFieldOffset2 = 1048575;
                        i18 = i15;
                        i19 = 0;
                    } else {
                        int i77 = i15 + 1;
                        int iCharAt11 = str.charAt(i15);
                        if (iCharAt11 >= 55296) {
                            int i78 = iCharAt11 & 8191;
                            int i79 = 13;
                            while (true) {
                                i18 = i77 + 1;
                                cCharAt7 = str.charAt(i77);
                                if (cCharAt7 < 55296) {
                                    break;
                                }
                                i78 |= (cCharAt7 & 8191) << i79;
                                i79 += 13;
                                i77 = i18;
                            }
                            iCharAt11 = i78 | (cCharAt7 << i79);
                        } else {
                            i18 = i77;
                        }
                        int i80 = (iCharAt11 / 32) + (i2 * 2);
                        Object obj3 = objArr2[i80];
                        if (obj3 instanceof Field) {
                            fieldT = (Field) obj3;
                        } else {
                            fieldT = t(cls, (String) obj3);
                            objArr2[i80] = fieldT;
                        }
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldT);
                        i19 = iCharAt11 % 32;
                    }
                    if (i63 >= 18 && i63 <= 49) {
                        iArr[i16] = iObjectFieldOffset;
                        i16++;
                    }
                    iObjectFieldOffset3 = iObjectFieldOffset;
                }
                i3 = i17;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldT4);
                if ((iCharAt9 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i18 = i15;
                    i19 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i18 = i15;
                    i19 = 0;
                }
                if (i63 >= 18) {
                    iArr[i16] = iObjectFieldOffset;
                    i16++;
                }
                iObjectFieldOffset3 = iObjectFieldOffset;
            }
            int i81 = i53 + 1;
            iArr3[i53] = i64;
            int i82 = i53 + 2;
            String str2 = str;
            iArr3[i81] = ((iCharAt9 & 256) != 0 ? 268435456 : 0) | ((iCharAt9 & 512) != 0 ? 536870912 : 0) | ((iCharAt9 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i63 << 20) | iObjectFieldOffset3;
            i53 += 3;
            iArr3[i82] = (i19 << 20) | iObjectFieldOffset2;
            iArr2 = iArr3;
            objArr3 = objArr;
            i27 = i18;
            length = i14;
            i51 = i16;
            str = str2;
            i2 = i2;
            c = 55296;
        }
        return new p640(iArr2, objArr3, y9e0Var.f42242a, iArr, i4, em50Var, cd00Var, aet0Var, wsoVar, yo20Var);
    }

    public static int r(Object obj, long j2) {
        return ((Integer) ift0.j(obj, j2)).intValue();
    }

    public static long s(Object obj, long j2) {
        return ((Long) ift0.j(obj, j2)).longValue();
    }

    public static Field t(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbT = kng0.t("Field ", str, " for ");
            sbT.append(cls.getName());
            sbT.append(" not found. Known fields are ");
            sbT.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbT.toString());
        }
    }

    public static int v(int i) {
        return (i & 267386880) >>> 20;
    }

    @Override // a.p2h0
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (!m(obj)) {
            e9d0.i(obj, "Mutating immutable message: ");
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f26437a;
            if (i >= iArr.length) {
                x2h0.j(this.h, obj, obj2);
                return;
            }
            int iW = w(i);
            long j2 = iW & 1048575;
            int i2 = iArr[i];
            switch (v(iW)) {
                case 0:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        gft0 gft0Var = ift0.c;
                        gft0Var.g(obj3, j2, gft0Var.c(obj2, j2));
                        u(i, obj3);
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 1:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        gft0 gft0Var2 = ift0.c;
                        gft0Var2.h(obj3, j2, gft0Var2.d(obj2, j2));
                        u(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 2:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        ift0.c.b.putLong(obj3, j2, ift0.i(obj2, j2));
                        u(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 3:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        ift0.c.b.putLong(obj3, j2, ift0.i(obj2, j2));
                        u(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 4:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        ift0.o(obj3, ift0.h(obj2, j2), j2);
                        u(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 5:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        ift0.c.b.putLong(obj3, j2, ift0.i(obj2, j2));
                        u(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 6:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        ift0.o(obj3, ift0.h(obj2, j2), j2);
                        u(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 7:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        gft0 gft0Var3 = ift0.c;
                        gft0Var3.e(obj3, j2, gft0Var3.a(obj2, j2));
                        u(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 8:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        ift0.p(obj3, j2, ift0.j(obj2, j2));
                        u(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 9:
                    obj3 = obj;
                    o(i, obj3, obj2);
                    continue;
                    i += 3;
                    obj = obj3;
                    break;
                case 10:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        ift0.p(obj3, j2, ift0.j(obj2, j2));
                        u(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 11:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        ift0.o(obj3, ift0.h(obj2, j2), j2);
                        u(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 12:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        ift0.o(obj3, ift0.h(obj2, j2), j2);
                        u(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 13:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        ift0.o(obj3, ift0.h(obj2, j2), j2);
                        u(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 14:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        ift0.c.b.putLong(obj3, j2, ift0.i(obj2, j2));
                        u(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 15:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        ift0.o(obj3, ift0.h(obj2, j2), j2);
                        u(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 16:
                    if (k(i, obj2)) {
                        obj3 = obj;
                        ift0.c.b.putLong(obj3, j2, ift0.i(obj2, j2));
                        u(i, obj3);
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 17:
                    o(i, obj, obj2);
                    break;
                case 18:
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.g.b(obj, j2, obj2);
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Class cls = x2h0.f40168a;
                    Object objJ = ift0.j(obj, j2);
                    Object objJ2 = ift0.j(obj2, j2);
                    this.i.getClass();
                    vo20 vo20VarD = (vo20) objJ;
                    vo20 vo20Var = (vo20) objJ2;
                    if (!vo20Var.isEmpty()) {
                        if (!vo20VarD.f37745a) {
                            vo20VarD = vo20VarD.d();
                        }
                        vo20VarD.b();
                        if (!vo20Var.isEmpty()) {
                            vo20VarD.putAll(vo20Var);
                        }
                    }
                    ift0.p(obj, j2, vo20VarD);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (n(i2, i, obj2)) {
                        ift0.p(obj, j2, ift0.j(obj2, j2));
                        ift0.o(obj, i2, iArr[i + 2] & 1048575);
                    }
                    break;
                case 60:
                    p(i, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (n(i2, i, obj2)) {
                        ift0.p(obj, j2, ift0.j(obj2, j2));
                        ift0.o(obj, i2, iArr[i + 2] & 1048575);
                    }
                    break;
                case 68:
                    p(i, obj, obj2);
                    break;
            }
            obj3 = obj;
            i += 3;
            obj = obj3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f A[SYNTHETIC] */
    @Override // a.p2h0
    public final void b(Object obj) {
        if (m(obj)) {
            if (obj instanceof kjt) {
                kjt kjtVar = (kjt) obj;
                kjtVar.q(Integer.MAX_VALUE);
                kjtVar.memoizedHashCode = 0;
                kjtVar.n();
            }
            int[] iArr = this.f26437a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iW = w(i);
                long j2 = 1048575 & iW;
                int iV = v(iW);
                Unsafe unsafe = k;
                if (iV != 9) {
                    if (iV != 60 && iV != 68) {
                        switch (iV) {
                            case 17:
                                if (k(i, obj)) {
                                    j(i).b(unsafe.getObject(obj, j2));
                                }
                                break;
                            case 18:
                            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.g.a(obj, j2);
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                Object object = unsafe.getObject(obj, j2);
                                if (object != null) {
                                    this.i.getClass();
                                    ((vo20) object).f37745a = false;
                                    unsafe.putObject(obj, j2, object);
                                }
                                break;
                        }
                    } else if (n(iArr[i], i, obj)) {
                        j(i).b(unsafe.getObject(obj, j2));
                    }
                } else if (k(i, obj)) {
                    j(i).b(unsafe.getObject(obj, j2));
                }
            }
            this.h.getClass();
            xdt0 xdt0Var = ((kjt) obj).unknownFields;
            if (xdt0Var.e) {
                xdt0Var.e = false;
            }
        }
    }

    @Override // a.p2h0
    public final boolean c(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.e) {
            int i6 = this.d[i5];
            int[] iArr = this.f26437a;
            int i7 = iArr[i6];
            int iW = w(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = k.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                int i11 = i4;
                i = i3;
                i2 = i11;
            }
            if ((268435456 & iW) == 0 || l(obj, i6, i, i2, i10)) {
                int iV = v(iW);
                if (iV != 9 && iV != 17) {
                    if (iV != 27) {
                        if (iV == 60 || iV == 68) {
                            if (!n(i7, i6, obj) || j(i6).c(ift0.j(obj, iW & 1048575))) {
                                i5++;
                                i3 = i;
                                i4 = i2;
                            }
                        } else if (iV != 49) {
                            if (iV != 50) {
                                continue;
                            } else {
                                Object objJ = ift0.j(obj, iW & 1048575);
                                this.i.getClass();
                                vo20 vo20Var = (vo20) objJ;
                                if (vo20Var.isEmpty()) {
                                    continue;
                                } else {
                                    if (((dov0) ((po20) this.b[(i6 / 3) * 2]).f27312a.c).f6430a != gov0.MESSAGE) {
                                        continue;
                                    } else {
                                        p2h0 p2h0VarA = null;
                                        for (Object obj2 : vo20Var.values()) {
                                            if (p2h0VarA == null) {
                                                p2h0VarA = b5d0.c.a(obj2.getClass());
                                            }
                                            if (!p2h0VarA.c(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i5++;
                            i3 = i;
                            i4 = i2;
                        }
                    }
                    List list = (List) ift0.j(obj, iW & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        p2h0 p2h0VarJ = j(i6);
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            if (p2h0VarJ.c(list.get(i12))) {
                            }
                        }
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                } else if (!l(obj, i6, i, i2, i10) || j(i6).c(ift0.j(obj, iW & 1048575))) {
                    i5++;
                    i3 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        return true;
    }

    @Override // a.p2h0
    public final kjt d() {
        this.f.getClass();
        return (kjt) ((kjt) this.c).j(4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:130:0x0322  */
    /* JADX WARN: Code duplicated, block: B:135:0x032f  */
    /* JADX WARN: Code duplicated, block: B:136:0x0341  */
    /* JADX WARN: Code duplicated, block: B:137:0x0352  */
    /* JADX WARN: Code duplicated, block: B:139:0x035b  */
    /* JADX WARN: Code duplicated, block: B:141:0x0364  */
    /* JADX WARN: Code duplicated, block: B:143:0x0368  */
    /* JADX WARN: Code duplicated, block: B:144:0x0372  */
    /* JADX WARN: Code duplicated, block: B:145:0x037e  */
    /* JADX WARN: Code duplicated, block: B:146:0x038a  */
    /* JADX WARN: Code duplicated, block: B:148:0x038e  */
    /* JADX WARN: Code duplicated, block: B:150:0x039b  */
    /* JADX WARN: Code duplicated, block: B:151:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:152:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:153:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:155:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:156:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:157:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:158:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:159:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:160:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:161:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:162:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:163:0x0405  */
    /* JADX WARN: Code duplicated, block: B:164:0x040c  */
    /* JADX WARN: Code duplicated, block: B:220:0x05bc A[PHI: r19 r24
  0x05bc: PHI (r19v35 int) = 
  (r19v21 int)
  (r19v22 int)
  (r19v23 int)
  (r19v27 int)
  (r19v29 int)
  (r19v30 int)
  (r19v31 int)
  (r19v34 int)
  (r19v36 int)
 binds: [B:288:0x07a2, B:284:0x0784, B:280:0x0766, B:254:0x06bc, B:240:0x0650, B:236:0x0634, B:232:0x0618, B:225:0x05dc, B:219:0x05ba] A[DONT_GENERATE, DONT_INLINE]
  0x05bc: PHI (r24v19 int) = 
  (r24v2 int)
  (r24v3 int)
  (r24v4 int)
  (r24v8 int)
  (r24v10 int)
  (r24v11 int)
  (r24v12 int)
  (r24v16 int)
  (r24v20 int)
 binds: [B:288:0x07a2, B:284:0x0784, B:280:0x0766, B:254:0x06bc, B:240:0x0650, B:236:0x0634, B:232:0x0618, B:225:0x05dc, B:219:0x05ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:364:0x032b A[SYNTHETIC] */
    @Override // a.p2h0
    public final int e(kjt kjtVar) {
        int i;
        int iC;
        int iC2;
        int iC3;
        int iE;
        int iC4;
        int iA;
        int iC5;
        int iC6;
        int iB;
        int iC7;
        int i2;
        int iC8;
        int size;
        int i3;
        int iC9;
        int iC10;
        int size2;
        int iC11;
        int iG;
        int iX;
        int iE2;
        int size3;
        int iD;
        int i4;
        dov0 dov0Var;
        int iC12;
        int iE3;
        int size4;
        int iD2;
        int iC13;
        int iC14;
        int iC15;
        int iE4;
        int iC16;
        int iA2;
        int iC17;
        int iB2;
        p640 p640Var = this;
        kjt kjtVar2 = kjtVar;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int iX2 = 0;
        while (true) {
            int[] iArr = p640Var.f26437a;
            if (i7 >= iArr.length) {
                p640Var.h.getClass();
                return kjtVar2.unknownFields.a() + iX2;
            }
            int iW = p640Var.w(i7);
            int iV = v(iW);
            int i9 = iArr[i7];
            int i10 = iArr[i7 + 2];
            int i11 = i10 & i5;
            int i12 = 1;
            Unsafe unsafe = k;
            if (iV <= 17) {
                if (i11 != i6) {
                    i8 = i11 == i5 ? 0 : unsafe.getInt(kjtVar2, i11);
                    i6 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            long j2 = iW & i5;
            if (iV >= hrp.b.f13542a) {
                byte b = hrp.c.f13542a;
            }
            char c = '?';
            switch (iV) {
                case 0:
                    if (p640Var.l(kjtVar2, i7, i6, i8, i)) {
                        iC = qyc.c(i9) + 8;
                        iX2 += iC;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 1:
                    if (p640Var.l(kjtVar2, i7, i6, i8, i)) {
                        iC2 = qyc.c(i9);
                        iC6 = iC2 + 4;
                        iX2 += iC6;
                    }
                    p640Var = this;
                    kjtVar2 = kjtVar;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 2:
                    if (p640Var.l(kjtVar2, i7, i6, i8, i)) {
                        long j3 = unsafe.getLong(kjtVar2, j2);
                        iC3 = qyc.c(i9);
                        iE = qyc.e(j3);
                        iX2 += iE + iC3;
                    }
                    p640Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 3:
                    if (p640Var.l(kjtVar2, i7, i6, i8, i)) {
                        long j4 = unsafe.getLong(kjtVar2, j2);
                        iC3 = qyc.c(i9);
                        iE = qyc.e(j4);
                        iX2 += iE + iC3;
                    }
                    p640Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 4:
                    if (p640Var.l(kjtVar2, i7, i6, i8, i)) {
                        int i13 = unsafe.getInt(kjtVar2, j2);
                        iC4 = qyc.c(i9);
                        iA = qyc.a(i13);
                        iX2 += iA + iC4;
                    }
                    p640Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 5:
                    if (p640Var.l(kjtVar2, i7, i6, i8, i)) {
                        iC5 = qyc.c(i9);
                        iC6 = iC5 + 8;
                        iX2 += iC6;
                    }
                    p640Var = this;
                    kjtVar2 = kjtVar;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 6:
                    if (p640Var.l(kjtVar2, i7, i6, i8, i)) {
                        iC2 = qyc.c(i9);
                        iC6 = iC2 + 4;
                        iX2 += iC6;
                    }
                    p640Var = this;
                    kjtVar2 = kjtVar;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 7:
                    if (p640Var.l(kjtVar2, i7, i6, i8, i)) {
                        iC6 = qyc.c(i9) + 1;
                        iX2 += iC6;
                    }
                    p640Var = this;
                    kjtVar2 = kjtVar;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 8:
                    if (p640Var.l(kjtVar2, i7, i6, i8, i)) {
                        Object object = unsafe.getObject(kjtVar2, j2);
                        if (object instanceof lg9) {
                            int iC18 = qyc.c(i9);
                            int size5 = ((lg9) object).size();
                            iB = f140.x(size5, size5, iC18, iX2);
                        } else {
                            iB = qyc.b((String) object) + qyc.c(i9) + iX2;
                        }
                        iX2 = iB;
                    }
                    p640Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 9:
                    if (p640Var.l(kjtVar2, i7, i6, i8, i)) {
                        Object object2 = unsafe.getObject(kjtVar2, j2);
                        p2h0 p2h0VarJ = p640Var.j(i7);
                        Class cls = x2h0.f40168a;
                        int iC19 = qyc.c(i9);
                        int iG2 = ((y3) object2).g(p2h0VarJ);
                        iX2 = f140.x(iG2, iG2, iC19, iX2);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 10:
                    if (p640Var.l(kjtVar2, i7, i6, i8, i)) {
                        lg9 lg9Var = (lg9) unsafe.getObject(kjtVar2, j2);
                        int iC20 = qyc.c(i9);
                        int size6 = lg9Var.size();
                        iX2 = f140.x(size6, size6, iC20, iX2);
                    }
                    p640Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 11:
                    if (p640Var.l(kjtVar2, i7, i6, i8, i)) {
                        int i14 = unsafe.getInt(kjtVar2, j2);
                        iC4 = qyc.c(i9);
                        iA = qyc.d(i14);
                        iX2 += iA + iC4;
                    }
                    p640Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 12:
                    if (p640Var.l(kjtVar2, i7, i6, i8, i)) {
                        int i15 = unsafe.getInt(kjtVar2, j2);
                        iC4 = qyc.c(i9);
                        iA = qyc.a(i15);
                        iX2 += iA + iC4;
                    }
                    p640Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 13:
                    if (p640Var.l(kjtVar2, i7, i6, i8, i)) {
                        iC2 = qyc.c(i9);
                        iC6 = iC2 + 4;
                        iX2 += iC6;
                    }
                    p640Var = this;
                    kjtVar2 = kjtVar;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 14:
                    if (p640Var.l(kjtVar2, i7, i6, i8, i)) {
                        iC5 = qyc.c(i9);
                        iC6 = iC5 + 8;
                        iX2 += iC6;
                    }
                    p640Var = this;
                    kjtVar2 = kjtVar;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 15:
                    if (p640Var.l(kjtVar2, i7, i6, i8, i)) {
                        int i16 = unsafe.getInt(kjtVar2, j2);
                        iC4 = qyc.c(i9);
                        iA = qyc.d((i16 >> 31) ^ (i16 << 1));
                        iX2 += iA + iC4;
                    }
                    p640Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 16:
                    if (p640Var.l(kjtVar2, i7, i6, i8, i)) {
                        long j5 = unsafe.getLong(kjtVar2, j2);
                        iC3 = qyc.c(i9);
                        iE = qyc.e((j5 >> 63) ^ (j5 << 1));
                        iX2 += iE + iC3;
                    }
                    p640Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 17:
                    if (p640Var.l(kjtVar2, i7, i6, i8, i)) {
                        iC = ((y3) unsafe.getObject(kjtVar2, j2)).g(p640Var.j(i7)) + (qyc.c(i9) * 2);
                        iX2 += iC;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 18:
                    iC7 = x2h0.c(i9, (List) unsafe.getObject(kjtVar2, j2));
                    iX2 += iC7;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    iC7 = x2h0.b(i9, (List) unsafe.getObject(kjtVar2, j2));
                    iX2 += iC7;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 20:
                    i6 = i6;
                    i2 = 0;
                    List list = (List) unsafe.getObject(kjtVar2, j2);
                    Class cls2 = x2h0.f40168a;
                    if (list.size() == 0) {
                        iC8 = i2;
                    } else {
                        iC8 = (qyc.c(i9) * list.size()) + x2h0.e(list);
                    }
                    iX2 += iC8;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 21:
                    i6 = i6;
                    i2 = 0;
                    List list2 = (List) unsafe.getObject(kjtVar2, j2);
                    Class cls3 = x2h0.f40168a;
                    size = list2.size();
                    if (size == 0) {
                        iC8 = i2;
                    } else {
                        i3 = x2h0.i(list2);
                        iC9 = qyc.c(i9);
                        iC8 = (iC9 * size) + i3;
                    }
                    iX2 += iC8;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 22:
                    i6 = i6;
                    i2 = 0;
                    List list3 = (List) unsafe.getObject(kjtVar2, j2);
                    Class cls4 = x2h0.f40168a;
                    size = list3.size();
                    if (size == 0) {
                        iC8 = i2;
                    } else {
                        i3 = x2h0.d(list3);
                        iC9 = qyc.c(i9);
                        iC8 = (iC9 * size) + i3;
                    }
                    iX2 += iC8;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 23:
                    iC7 = x2h0.c(i9, (List) unsafe.getObject(kjtVar2, j2));
                    iX2 += iC7;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 24:
                    iC7 = x2h0.b(i9, (List) unsafe.getObject(kjtVar2, j2));
                    iX2 += iC7;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    i6 = i6;
                    List list4 = (List) unsafe.getObject(kjtVar2, j2);
                    Class cls5 = x2h0.f40168a;
                    int size7 = list4.size();
                    iX2 += size7 == 0 ? 0 : (qyc.c(i9) + 1) * size7;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    i6 = i6;
                    i2 = 0;
                    List list5 = (List) unsafe.getObject(kjtVar2, j2);
                    Class cls6 = x2h0.f40168a;
                    int size8 = list5.size();
                    if (size8 == 0) {
                        iC8 = i2;
                    } else {
                        iC8 = qyc.c(i9) * size8;
                        if (list5 instanceof sez) {
                            sez sezVar = (sez) list5;
                            for (int i17 = 0; i17 < size8; i17++) {
                                Object objX = sezVar.x(i17);
                                if (objX instanceof lg9) {
                                    int size9 = ((lg9) objX).size();
                                    iC8 = qyc.d(size9) + size9 + iC8;
                                } else {
                                    iC8 = qyc.b((String) objX) + iC8;
                                }
                            }
                        } else {
                            for (int i18 = 0; i18 < size8; i18++) {
                                Object obj = list5.get(i18);
                                if (obj instanceof lg9) {
                                    int size10 = ((lg9) obj).size();
                                    iC8 = qyc.d(size10) + size10 + iC8;
                                } else {
                                    iC8 = qyc.b((String) obj) + iC8;
                                }
                            }
                        }
                    }
                    iX2 += iC8;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    i6 = i6;
                    List list6 = (List) unsafe.getObject(kjtVar2, j2);
                    p2h0 p2h0VarJ2 = p640Var.j(i7);
                    Class cls7 = x2h0.f40168a;
                    int size11 = list6.size();
                    if (size11 == 0) {
                        iC10 = 0;
                    } else {
                        iC10 = qyc.c(i9) * size11;
                        for (int i19 = 0; i19 < size11; i19++) {
                            int iG3 = ((y3) list6.get(i19)).g(p2h0VarJ2);
                            iC10 += qyc.d(iG3) + iG3;
                        }
                    }
                    iX2 += iC10;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    i6 = i6;
                    i2 = 0;
                    List list7 = (List) unsafe.getObject(kjtVar2, j2);
                    Class cls8 = x2h0.f40168a;
                    int size12 = list7.size();
                    if (size12 == 0) {
                        iC8 = i2;
                    } else {
                        iC8 = qyc.c(i9) * size12;
                        for (int i20 = 0; i20 < list7.size(); i20++) {
                            int size13 = ((lg9) list7.get(i20)).size();
                            iC8 += qyc.d(size13) + size13;
                        }
                    }
                    iX2 += iC8;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                    i6 = i6;
                    i2 = 0;
                    List list8 = (List) unsafe.getObject(kjtVar2, j2);
                    Class cls9 = x2h0.f40168a;
                    size = list8.size();
                    if (size == 0) {
                        iC8 = i2;
                    } else {
                        i3 = x2h0.h(list8);
                        iC9 = qyc.c(i9);
                        iC8 = (iC9 * size) + i3;
                    }
                    iX2 += iC8;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                    i6 = i6;
                    i2 = 0;
                    List list9 = (List) unsafe.getObject(kjtVar2, j2);
                    Class cls10 = x2h0.f40168a;
                    size = list9.size();
                    if (size == 0) {
                        iC8 = i2;
                    } else {
                        i3 = x2h0.a(list9);
                        iC9 = qyc.c(i9);
                        iC8 = (iC9 * size) + i3;
                    }
                    iX2 += iC8;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                    iC7 = x2h0.b(i9, (List) unsafe.getObject(kjtVar2, j2));
                    iX2 += iC7;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 32:
                    iC7 = x2h0.c(i9, (List) unsafe.getObject(kjtVar2, j2));
                    iX2 += iC7;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 33:
                    i6 = i6;
                    i2 = 0;
                    List list10 = (List) unsafe.getObject(kjtVar2, j2);
                    Class cls11 = x2h0.f40168a;
                    size = list10.size();
                    if (size == 0) {
                        iC8 = i2;
                    } else {
                        i3 = x2h0.f(list10);
                        iC9 = qyc.c(i9);
                        iC8 = (iC9 * size) + i3;
                    }
                    iX2 += iC8;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 34:
                    i6 = i6;
                    i2 = 0;
                    List list11 = (List) unsafe.getObject(kjtVar2, j2);
                    Class cls12 = x2h0.f40168a;
                    size = list11.size();
                    if (size == 0) {
                        iC8 = i2;
                    } else {
                        i3 = x2h0.g(list11);
                        iC9 = qyc.c(i9);
                        iC8 = (iC9 * size) + i3;
                    }
                    iX2 += iC8;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 35:
                    i6 = i6;
                    List list12 = (List) unsafe.getObject(kjtVar2, j2);
                    Class cls13 = x2h0.f40168a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iC11 = qyc.c(i9);
                        iX2 = f140.x(size2, iC11, size2, iX2);
                    }
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 36:
                    i6 = i6;
                    List list13 = (List) unsafe.getObject(kjtVar2, j2);
                    Class cls14 = x2h0.f40168a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iC11 = qyc.c(i9);
                        iX2 = f140.x(size2, iC11, size2, iX2);
                    }
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 37:
                    i6 = i6;
                    size2 = x2h0.e((List) unsafe.getObject(kjtVar2, j2));
                    if (size2 > 0) {
                        iC11 = qyc.c(i9);
                        iX2 = f140.x(size2, iC11, size2, iX2);
                    }
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 38:
                    i6 = i6;
                    size2 = x2h0.i((List) unsafe.getObject(kjtVar2, j2));
                    if (size2 > 0) {
                        iC11 = qyc.c(i9);
                        iX2 = f140.x(size2, iC11, size2, iX2);
                    }
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 39:
                    i6 = i6;
                    size2 = x2h0.d((List) unsafe.getObject(kjtVar2, j2));
                    if (size2 > 0) {
                        iC11 = qyc.c(i9);
                        iX2 = f140.x(size2, iC11, size2, iX2);
                    }
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 40:
                    i6 = i6;
                    List list14 = (List) unsafe.getObject(kjtVar2, j2);
                    Class cls15 = x2h0.f40168a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iC11 = qyc.c(i9);
                        iX2 = f140.x(size2, iC11, size2, iX2);
                    }
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 41:
                    i6 = i6;
                    List list15 = (List) unsafe.getObject(kjtVar2, j2);
                    Class cls16 = x2h0.f40168a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iC11 = qyc.c(i9);
                        iX2 = f140.x(size2, iC11, size2, iX2);
                    }
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 42:
                    i6 = i6;
                    List list16 = (List) unsafe.getObject(kjtVar2, j2);
                    Class cls17 = x2h0.f40168a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iC11 = qyc.c(i9);
                        iX2 = f140.x(size2, iC11, size2, iX2);
                    }
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 43:
                    i6 = i6;
                    size2 = x2h0.h((List) unsafe.getObject(kjtVar2, j2));
                    if (size2 > 0) {
                        iC11 = qyc.c(i9);
                        iX2 = f140.x(size2, iC11, size2, iX2);
                    }
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 44:
                    i6 = i6;
                    size2 = x2h0.a((List) unsafe.getObject(kjtVar2, j2));
                    if (size2 > 0) {
                        iC11 = qyc.c(i9);
                        iX2 = f140.x(size2, iC11, size2, iX2);
                    }
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 45:
                    i6 = i6;
                    List list17 = (List) unsafe.getObject(kjtVar2, j2);
                    Class cls18 = x2h0.f40168a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iC11 = qyc.c(i9);
                        iX2 = f140.x(size2, iC11, size2, iX2);
                    }
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 46:
                    i6 = i6;
                    List list18 = (List) unsafe.getObject(kjtVar2, j2);
                    Class cls19 = x2h0.f40168a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iC11 = qyc.c(i9);
                        iX2 = f140.x(size2, iC11, size2, iX2);
                    }
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 47:
                    i6 = i6;
                    size2 = x2h0.f((List) unsafe.getObject(kjtVar2, j2));
                    if (size2 > 0) {
                        iC11 = qyc.c(i9);
                        iX2 = f140.x(size2, iC11, size2, iX2);
                    }
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 48:
                    i6 = i6;
                    size2 = x2h0.g((List) unsafe.getObject(kjtVar2, j2));
                    if (size2 > 0) {
                        iC11 = qyc.c(i9);
                        iX2 = f140.x(size2, iC11, size2, iX2);
                    }
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 49:
                    i6 = i6;
                    List list19 = (List) unsafe.getObject(kjtVar2, j2);
                    p2h0 p2h0VarJ3 = p640Var.j(i7);
                    Class cls20 = x2h0.f40168a;
                    int size14 = list19.size();
                    if (size14 == 0) {
                        iG = 0;
                    } else {
                        iG = 0;
                        for (int i21 = 0; i21 < size14; i21++) {
                            iG += ((y3) list19.get(i21)).g(p2h0VarJ3) + (qyc.c(i9) * 2);
                        }
                    }
                    iX2 += iG;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Object object3 = unsafe.getObject(kjtVar2, j2);
                    Object obj2 = p640Var.b[(i7 / 3) * 2];
                    p640Var.i.getClass();
                    vo20 vo20Var = (vo20) object3;
                    po20 po20Var = (po20) obj2;
                    if (vo20Var.isEmpty()) {
                        iX = 0;
                    } else {
                        iX = 0;
                        for (Map.Entry entry : vo20Var.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            po20Var.getClass();
                            int iC21 = qyc.c(i9);
                            yuu yuuVar = po20Var.f27312a;
                            char c2 = c;
                            dov0 dov0Var2 = (dov0) yuuVar.b;
                            int i22 = drp.c;
                            int iC22 = qyc.c(i12);
                            int i23 = i12;
                            unv0 unv0Var = dov0.e;
                            if (dov0Var2 == unv0Var) {
                                iC22 *= 2;
                            }
                            int i24 = i6;
                            switch (dov0Var2.ordinal()) {
                                case 0:
                                    ((Double) key).getClass();
                                    iE2 = 8;
                                    i4 = iE2 + iC22;
                                    dov0Var = (dov0) yuuVar.c;
                                    iC12 = qyc.c(2);
                                    if (dov0Var == unv0Var) {
                                        iC12 *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i25 = iE3 + iC12 + i4;
                                            iX = f140.x(i25, i25, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i26 = iE3 + iC12 + i4;
                                            iX = f140.x(i26, i26, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i27 = iE3 + iC12 + i4;
                                            iX = f140.x(i27, i27, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i28 = iE3 + iC12 + i4;
                                            iX = f140.x(i28, i28, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = qyc.a(((Integer) value).intValue());
                                            int i29 = iE3 + iC12 + i4;
                                            iX = f140.x(i29, i29, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i210 = iE3 + iC12 + i4;
                                            iX = f140.x(i210, i210, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i211 = iE3 + iC12 + i4;
                                            iX = f140.x(i211, i211, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i212 = iE3 + iC12 + i4;
                                            iX = f140.x(i212, i212, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = qyc.b((String) value);
                                            }
                                            int i213 = iE3 + iC12 + i4;
                                            iX = f140.x(i213, i213, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((kjt) ((y3) value)).g(null);
                                            int i214 = iE3 + iC12 + i4;
                                            iX = f140.x(i214, i214, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 10:
                                            size4 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size4);
                                            iE3 = size4 + iD2;
                                            int i215 = iE3 + iC12 + i4;
                                            iX = f140.x(i215, i215, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = qyc.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i216 = iE3 + iC12 + i4;
                                            iX = f140.x(i216, i216, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 12:
                                            iE3 = qyc.d(((Integer) value).intValue());
                                            int i217 = iE3 + iC12 + i4;
                                            iX = f140.x(i217, i217, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE3 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE3 = qyc.a(((Integer) value).intValue());
                                            }
                                            int i218 = iE3 + iC12 + i4;
                                            iX = f140.x(i218, i218, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i219 = iE3 + iC12 + i4;
                                            iX = f140.x(i219, i219, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i2110 = iE3 + iC12 + i4;
                                            iX = f140.x(i2110, i2110, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 16:
                                            int iIntValue = ((Integer) value).intValue();
                                            iE3 = qyc.d((iIntValue >> 31) ^ (iIntValue << 1));
                                            int i2111 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111, i2111, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue = ((Long) value).longValue();
                                            iE3 = qyc.e((jLongValue << i23) ^ (jLongValue >> c2));
                                            int i2112 = iE3 + iC12 + i4;
                                            iX = f140.x(i2112, i2112, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 1:
                                    ((Float) key).getClass();
                                    iE2 = 4;
                                    i4 = iE2 + iC22;
                                    dov0Var = (dov0) yuuVar.c;
                                    iC12 = qyc.c(2);
                                    if (dov0Var == unv0Var) {
                                        iC12 *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i2113 = iE3 + iC12 + i4;
                                            iX = f140.x(i2113, i2113, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i2114 = iE3 + iC12 + i4;
                                            iX = f140.x(i2114, i2114, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i2115 = iE3 + iC12 + i4;
                                            iX = f140.x(i2115, i2115, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i2116 = iE3 + iC12 + i4;
                                            iX = f140.x(i2116, i2116, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = qyc.a(((Integer) value).intValue());
                                            int i2117 = iE3 + iC12 + i4;
                                            iX = f140.x(i2117, i2117, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i2118 = iE3 + iC12 + i4;
                                            iX = f140.x(i2118, i2118, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i2119 = iE3 + iC12 + i4;
                                            iX = f140.x(i2119, i2119, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i21110 = iE3 + iC12 + i4;
                                            iX = f140.x(i21110, i21110, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = qyc.b((String) value);
                                            }
                                            int i21111 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111, i21111, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((kjt) ((y3) value)).g(null);
                                            int i21112 = iE3 + iC12 + i4;
                                            iX = f140.x(i21112, i21112, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 10:
                                            size4 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size4);
                                            iE3 = size4 + iD2;
                                            int i21113 = iE3 + iC12 + i4;
                                            iX = f140.x(i21113, i21113, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = qyc.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i21114 = iE3 + iC12 + i4;
                                            iX = f140.x(i21114, i21114, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 12:
                                            iE3 = qyc.d(((Integer) value).intValue());
                                            int i21115 = iE3 + iC12 + i4;
                                            iX = f140.x(i21115, i21115, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE3 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE3 = qyc.a(((Integer) value).intValue());
                                            }
                                            int i21116 = iE3 + iC12 + i4;
                                            iX = f140.x(i21116, i21116, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i21117 = iE3 + iC12 + i4;
                                            iX = f140.x(i21117, i21117, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i21118 = iE3 + iC12 + i4;
                                            iX = f140.x(i21118, i21118, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 16:
                                            int iIntValue2 = ((Integer) value).intValue();
                                            iE3 = qyc.d((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                                            int i21119 = iE3 + iC12 + i4;
                                            iX = f140.x(i21119, i21119, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue2 = ((Long) value).longValue();
                                            iE3 = qyc.e((jLongValue2 << i23) ^ (jLongValue2 >> c2));
                                            int i211110 = iE3 + iC12 + i4;
                                            iX = f140.x(i211110, i211110, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 2:
                                    iE2 = qyc.e(((Long) key).longValue());
                                    i4 = iE2 + iC22;
                                    dov0Var = (dov0) yuuVar.c;
                                    iC12 = qyc.c(2);
                                    if (dov0Var == unv0Var) {
                                        iC12 *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i211111 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111, i211111, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i211112 = iE3 + iC12 + i4;
                                            iX = f140.x(i211112, i211112, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i211113 = iE3 + iC12 + i4;
                                            iX = f140.x(i211113, i211113, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i211114 = iE3 + iC12 + i4;
                                            iX = f140.x(i211114, i211114, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = qyc.a(((Integer) value).intValue());
                                            int i211115 = iE3 + iC12 + i4;
                                            iX = f140.x(i211115, i211115, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i211116 = iE3 + iC12 + i4;
                                            iX = f140.x(i211116, i211116, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i211117 = iE3 + iC12 + i4;
                                            iX = f140.x(i211117, i211117, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i211118 = iE3 + iC12 + i4;
                                            iX = f140.x(i211118, i211118, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = qyc.b((String) value);
                                            }
                                            int i211119 = iE3 + iC12 + i4;
                                            iX = f140.x(i211119, i211119, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((kjt) ((y3) value)).g(null);
                                            int i2111110 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111110, i2111110, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 10:
                                            size4 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size4);
                                            iE3 = size4 + iD2;
                                            int i2111111 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111, i2111111, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = qyc.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i2111112 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111112, i2111112, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 12:
                                            iE3 = qyc.d(((Integer) value).intValue());
                                            int i2111113 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111113, i2111113, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE3 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE3 = qyc.a(((Integer) value).intValue());
                                            }
                                            int i2111114 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111114, i2111114, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i2111115 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111115, i2111115, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i2111116 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111116, i2111116, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 16:
                                            int iIntValue3 = ((Integer) value).intValue();
                                            iE3 = qyc.d((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                                            int i2111117 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111117, i2111117, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue3 = ((Long) value).longValue();
                                            iE3 = qyc.e((jLongValue3 << i23) ^ (jLongValue3 >> c2));
                                            int i2111118 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111118, i2111118, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 3:
                                    iE2 = qyc.e(((Long) key).longValue());
                                    i4 = iE2 + iC22;
                                    dov0Var = (dov0) yuuVar.c;
                                    iC12 = qyc.c(2);
                                    if (dov0Var == unv0Var) {
                                        iC12 *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i2111119 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111119, i2111119, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i21111110 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111110, i21111110, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i21111111 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111, i21111111, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i21111112 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111112, i21111112, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = qyc.a(((Integer) value).intValue());
                                            int i21111113 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111113, i21111113, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i21111114 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111114, i21111114, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i21111115 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111115, i21111115, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i21111116 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111116, i21111116, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = qyc.b((String) value);
                                            }
                                            int i21111117 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111117, i21111117, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((kjt) ((y3) value)).g(null);
                                            int i21111118 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111118, i21111118, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 10:
                                            size4 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size4);
                                            iE3 = size4 + iD2;
                                            int i21111119 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111119, i21111119, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = qyc.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i211111110 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111110, i211111110, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 12:
                                            iE3 = qyc.d(((Integer) value).intValue());
                                            int i211111111 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111, i211111111, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE3 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE3 = qyc.a(((Integer) value).intValue());
                                            }
                                            int i211111112 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111112, i211111112, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i211111113 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111113, i211111113, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i211111114 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111114, i211111114, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 16:
                                            int iIntValue4 = ((Integer) value).intValue();
                                            iE3 = qyc.d((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                                            int i211111115 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111115, i211111115, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue4 = ((Long) value).longValue();
                                            iE3 = qyc.e((jLongValue4 << i23) ^ (jLongValue4 >> c2));
                                            int i211111116 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111116, i211111116, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 4:
                                    iE2 = qyc.a(((Integer) key).intValue());
                                    i4 = iE2 + iC22;
                                    dov0Var = (dov0) yuuVar.c;
                                    iC12 = qyc.c(2);
                                    if (dov0Var == unv0Var) {
                                        iC12 *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i211111117 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111117, i211111117, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i211111118 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111118, i211111118, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i211111119 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111119, i211111119, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i2111111110 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111110, i2111111110, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = qyc.a(((Integer) value).intValue());
                                            int i2111111111 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111, i2111111111, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i2111111112 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111112, i2111111112, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i2111111113 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111113, i2111111113, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i2111111114 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111114, i2111111114, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = qyc.b((String) value);
                                            }
                                            int i2111111115 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111115, i2111111115, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((kjt) ((y3) value)).g(null);
                                            int i2111111116 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111116, i2111111116, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 10:
                                            size4 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size4);
                                            iE3 = size4 + iD2;
                                            int i2111111117 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111117, i2111111117, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = qyc.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i2111111118 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111118, i2111111118, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 12:
                                            iE3 = qyc.d(((Integer) value).intValue());
                                            int i2111111119 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111119, i2111111119, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE3 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE3 = qyc.a(((Integer) value).intValue());
                                            }
                                            int i21111111110 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111110, i21111111110, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i21111111111 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111, i21111111111, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i21111111112 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111112, i21111111112, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 16:
                                            int iIntValue5 = ((Integer) value).intValue();
                                            iE3 = qyc.d((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                                            int i21111111113 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111113, i21111111113, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue5 = ((Long) value).longValue();
                                            iE3 = qyc.e((jLongValue5 << i23) ^ (jLongValue5 >> c2));
                                            int i21111111114 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111114, i21111111114, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 5:
                                    ((Long) key).getClass();
                                    iE2 = 8;
                                    i4 = iE2 + iC22;
                                    dov0Var = (dov0) yuuVar.c;
                                    iC12 = qyc.c(2);
                                    if (dov0Var == unv0Var) {
                                        iC12 *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i21111111115 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111115, i21111111115, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i21111111116 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111116, i21111111116, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i21111111117 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111117, i21111111117, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i21111111118 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111118, i21111111118, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = qyc.a(((Integer) value).intValue());
                                            int i21111111119 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111119, i21111111119, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i211111111110 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111110, i211111111110, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i211111111111 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111, i211111111111, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i211111111112 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111112, i211111111112, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = qyc.b((String) value);
                                            }
                                            int i211111111113 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111113, i211111111113, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((kjt) ((y3) value)).g(null);
                                            int i211111111114 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111114, i211111111114, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 10:
                                            size4 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size4);
                                            iE3 = size4 + iD2;
                                            int i211111111115 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111115, i211111111115, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = qyc.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i211111111116 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111116, i211111111116, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 12:
                                            iE3 = qyc.d(((Integer) value).intValue());
                                            int i211111111117 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111117, i211111111117, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE3 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE3 = qyc.a(((Integer) value).intValue());
                                            }
                                            int i211111111118 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111118, i211111111118, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i211111111119 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111119, i211111111119, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i2111111111110 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111110, i2111111111110, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 16:
                                            int iIntValue6 = ((Integer) value).intValue();
                                            iE3 = qyc.d((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                                            int i2111111111111 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111, i2111111111111, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue6 = ((Long) value).longValue();
                                            iE3 = qyc.e((jLongValue6 << i23) ^ (jLongValue6 >> c2));
                                            int i2111111111112 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111112, i2111111111112, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 6:
                                    ((Integer) key).getClass();
                                    iE2 = 4;
                                    i4 = iE2 + iC22;
                                    dov0Var = (dov0) yuuVar.c;
                                    iC12 = qyc.c(2);
                                    if (dov0Var == unv0Var) {
                                        iC12 *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i2111111111113 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111113, i2111111111113, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i2111111111114 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111114, i2111111111114, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i2111111111115 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111115, i2111111111115, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i2111111111116 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111116, i2111111111116, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = qyc.a(((Integer) value).intValue());
                                            int i2111111111117 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111117, i2111111111117, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i2111111111118 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111118, i2111111111118, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i2111111111119 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111119, i2111111111119, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i21111111111110 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111110, i21111111111110, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = qyc.b((String) value);
                                            }
                                            int i21111111111111 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111, i21111111111111, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((kjt) ((y3) value)).g(null);
                                            int i21111111111112 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111112, i21111111111112, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 10:
                                            size4 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size4);
                                            iE3 = size4 + iD2;
                                            int i21111111111113 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111113, i21111111111113, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = qyc.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i21111111111114 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111114, i21111111111114, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 12:
                                            iE3 = qyc.d(((Integer) value).intValue());
                                            int i21111111111115 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111115, i21111111111115, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE3 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE3 = qyc.a(((Integer) value).intValue());
                                            }
                                            int i21111111111116 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111116, i21111111111116, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i21111111111117 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111117, i21111111111117, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i21111111111118 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111118, i21111111111118, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 16:
                                            int iIntValue7 = ((Integer) value).intValue();
                                            iE3 = qyc.d((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                                            int i21111111111119 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111119, i21111111111119, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue7 = ((Long) value).longValue();
                                            iE3 = qyc.e((jLongValue7 << i23) ^ (jLongValue7 >> c2));
                                            int i211111111111110 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111110, i211111111111110, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 7:
                                    ((Boolean) key).getClass();
                                    iE2 = i23;
                                    i4 = iE2 + iC22;
                                    dov0Var = (dov0) yuuVar.c;
                                    iC12 = qyc.c(2);
                                    if (dov0Var == unv0Var) {
                                        iC12 *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i211111111111111 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111, i211111111111111, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i211111111111112 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111112, i211111111111112, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i211111111111113 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111113, i211111111111113, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i211111111111114 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111114, i211111111111114, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = qyc.a(((Integer) value).intValue());
                                            int i211111111111115 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111115, i211111111111115, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i211111111111116 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111116, i211111111111116, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i211111111111117 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111117, i211111111111117, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i211111111111118 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111118, i211111111111118, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = qyc.b((String) value);
                                            }
                                            int i211111111111119 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111119, i211111111111119, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((kjt) ((y3) value)).g(null);
                                            int i2111111111111110 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111110, i2111111111111110, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 10:
                                            size4 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size4);
                                            iE3 = size4 + iD2;
                                            int i2111111111111111 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111, i2111111111111111, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = qyc.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i2111111111111112 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111112, i2111111111111112, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 12:
                                            iE3 = qyc.d(((Integer) value).intValue());
                                            int i2111111111111113 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111113, i2111111111111113, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE3 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE3 = qyc.a(((Integer) value).intValue());
                                            }
                                            int i2111111111111114 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111114, i2111111111111114, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i2111111111111115 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111115, i2111111111111115, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i2111111111111116 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111116, i2111111111111116, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 16:
                                            int iIntValue8 = ((Integer) value).intValue();
                                            iE3 = qyc.d((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                                            int i2111111111111117 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111117, i2111111111111117, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue8 = ((Long) value).longValue();
                                            iE3 = qyc.e((jLongValue8 << i23) ^ (jLongValue8 >> c2));
                                            int i2111111111111118 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111118, i2111111111111118, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 8:
                                    if (key instanceof lg9) {
                                        size3 = ((lg9) key).size();
                                        iD = qyc.d(size3);
                                        iE2 = size3 + iD;
                                    } else {
                                        iE2 = qyc.b((String) key);
                                    }
                                    i4 = iE2 + iC22;
                                    dov0Var = (dov0) yuuVar.c;
                                    iC12 = qyc.c(2);
                                    if (dov0Var == unv0Var) {
                                        iC12 *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i2111111111111119 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111119, i2111111111111119, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i21111111111111110 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111110, i21111111111111110, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i21111111111111111 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111, i21111111111111111, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i21111111111111112 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111112, i21111111111111112, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = qyc.a(((Integer) value).intValue());
                                            int i21111111111111113 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111113, i21111111111111113, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i21111111111111114 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111114, i21111111111111114, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i21111111111111115 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111115, i21111111111111115, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i21111111111111116 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111116, i21111111111111116, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = qyc.b((String) value);
                                            }
                                            int i21111111111111117 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111117, i21111111111111117, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((kjt) ((y3) value)).g(null);
                                            int i21111111111111118 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111118, i21111111111111118, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 10:
                                            size4 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size4);
                                            iE3 = size4 + iD2;
                                            int i21111111111111119 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111119, i21111111111111119, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = qyc.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i211111111111111110 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111110, i211111111111111110, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 12:
                                            iE3 = qyc.d(((Integer) value).intValue());
                                            int i211111111111111111 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111, i211111111111111111, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE3 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE3 = qyc.a(((Integer) value).intValue());
                                            }
                                            int i211111111111111112 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111112, i211111111111111112, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i211111111111111113 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111113, i211111111111111113, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i211111111111111114 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111114, i211111111111111114, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 16:
                                            int iIntValue9 = ((Integer) value).intValue();
                                            iE3 = qyc.d((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                                            int i211111111111111115 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111115, i211111111111111115, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue9 = ((Long) value).longValue();
                                            iE3 = qyc.e((jLongValue9 << i23) ^ (jLongValue9 >> c2));
                                            int i211111111111111116 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111116, i211111111111111116, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 9:
                                    iE2 = ((kjt) ((y3) key)).g(null);
                                    i4 = iE2 + iC22;
                                    dov0Var = (dov0) yuuVar.c;
                                    iC12 = qyc.c(2);
                                    if (dov0Var == unv0Var) {
                                        iC12 *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i211111111111111117 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111117, i211111111111111117, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i211111111111111118 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111118, i211111111111111118, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i211111111111111119 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111119, i211111111111111119, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i2111111111111111110 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111110, i2111111111111111110, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = qyc.a(((Integer) value).intValue());
                                            int i2111111111111111111 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111, i2111111111111111111, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i2111111111111111112 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111112, i2111111111111111112, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i2111111111111111113 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111113, i2111111111111111113, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i2111111111111111114 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111114, i2111111111111111114, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = qyc.b((String) value);
                                            }
                                            int i2111111111111111115 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111115, i2111111111111111115, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((kjt) ((y3) value)).g(null);
                                            int i2111111111111111116 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111116, i2111111111111111116, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 10:
                                            size4 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size4);
                                            iE3 = size4 + iD2;
                                            int i2111111111111111117 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111117, i2111111111111111117, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = qyc.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i2111111111111111118 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111118, i2111111111111111118, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 12:
                                            iE3 = qyc.d(((Integer) value).intValue());
                                            int i2111111111111111119 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111119, i2111111111111111119, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE3 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE3 = qyc.a(((Integer) value).intValue());
                                            }
                                            int i21111111111111111110 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111110, i21111111111111111110, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i21111111111111111111 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111, i21111111111111111111, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i21111111111111111112 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111112, i21111111111111111112, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 16:
                                            int iIntValue10 = ((Integer) value).intValue();
                                            iE3 = qyc.d((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                                            int i21111111111111111113 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111113, i21111111111111111113, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue10 = ((Long) value).longValue();
                                            iE3 = qyc.e((jLongValue10 << i23) ^ (jLongValue10 >> c2));
                                            int i21111111111111111114 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111114, i21111111111111111114, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 10:
                                    size3 = ((kjt) ((y3) key)).g(null);
                                    iD = qyc.d(size3);
                                    iE2 = size3 + iD;
                                    i4 = iE2 + iC22;
                                    dov0Var = (dov0) yuuVar.c;
                                    iC12 = qyc.c(2);
                                    if (dov0Var == unv0Var) {
                                        iC12 *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i21111111111111111115 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111115, i21111111111111111115, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i21111111111111111116 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111116, i21111111111111111116, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i21111111111111111117 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111117, i21111111111111111117, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i21111111111111111118 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111118, i21111111111111111118, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = qyc.a(((Integer) value).intValue());
                                            int i21111111111111111119 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111119, i21111111111111111119, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i211111111111111111110 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111110, i211111111111111111110, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i211111111111111111111 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111, i211111111111111111111, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i211111111111111111112 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111112, i211111111111111111112, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = qyc.b((String) value);
                                            }
                                            int i211111111111111111113 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111113, i211111111111111111113, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((kjt) ((y3) value)).g(null);
                                            int i211111111111111111114 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111114, i211111111111111111114, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 10:
                                            size4 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size4);
                                            iE3 = size4 + iD2;
                                            int i211111111111111111115 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111115, i211111111111111111115, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = qyc.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i211111111111111111116 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111116, i211111111111111111116, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 12:
                                            iE3 = qyc.d(((Integer) value).intValue());
                                            int i211111111111111111117 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111117, i211111111111111111117, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE3 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE3 = qyc.a(((Integer) value).intValue());
                                            }
                                            int i211111111111111111118 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111118, i211111111111111111118, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i211111111111111111119 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111119, i211111111111111111119, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i2111111111111111111110 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111110, i2111111111111111111110, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 16:
                                            int iIntValue11 = ((Integer) value).intValue();
                                            iE3 = qyc.d((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                                            int i2111111111111111111111 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111, i2111111111111111111111, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue11 = ((Long) value).longValue();
                                            iE3 = qyc.e((jLongValue11 << i23) ^ (jLongValue11 >> c2));
                                            int i2111111111111111111112 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111112, i2111111111111111111112, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 11:
                                    if (key instanceof lg9) {
                                        size3 = ((lg9) key).size();
                                        iD = qyc.d(size3);
                                    } else {
                                        size3 = ((byte[]) key).length;
                                        iD = qyc.d(size3);
                                    }
                                    iE2 = size3 + iD;
                                    i4 = iE2 + iC22;
                                    dov0Var = (dov0) yuuVar.c;
                                    iC12 = qyc.c(2);
                                    if (dov0Var == unv0Var) {
                                        iC12 *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i2111111111111111111113 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111113, i2111111111111111111113, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i2111111111111111111114 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111114, i2111111111111111111114, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i2111111111111111111115 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111115, i2111111111111111111115, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i2111111111111111111116 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111116, i2111111111111111111116, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = qyc.a(((Integer) value).intValue());
                                            int i2111111111111111111117 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111117, i2111111111111111111117, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i2111111111111111111118 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111118, i2111111111111111111118, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i2111111111111111111119 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111119, i2111111111111111111119, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i21111111111111111111110 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111110, i21111111111111111111110, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = qyc.b((String) value);
                                            }
                                            int i21111111111111111111111 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111111, i21111111111111111111111, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((kjt) ((y3) value)).g(null);
                                            int i21111111111111111111112 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111112, i21111111111111111111112, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 10:
                                            size4 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size4);
                                            iE3 = size4 + iD2;
                                            int i21111111111111111111113 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111113, i21111111111111111111113, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = qyc.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i21111111111111111111114 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111114, i21111111111111111111114, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 12:
                                            iE3 = qyc.d(((Integer) value).intValue());
                                            int i21111111111111111111115 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111115, i21111111111111111111115, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE3 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE3 = qyc.a(((Integer) value).intValue());
                                            }
                                            int i21111111111111111111116 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111116, i21111111111111111111116, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i21111111111111111111117 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111117, i21111111111111111111117, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i21111111111111111111118 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111118, i21111111111111111111118, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 16:
                                            int iIntValue12 = ((Integer) value).intValue();
                                            iE3 = qyc.d((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                                            int i21111111111111111111119 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111119, i21111111111111111111119, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue12 = ((Long) value).longValue();
                                            iE3 = qyc.e((jLongValue12 << i23) ^ (jLongValue12 >> c2));
                                            int i211111111111111111111110 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111110, i211111111111111111111110, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 12:
                                    iE2 = qyc.d(((Integer) key).intValue());
                                    i4 = iE2 + iC22;
                                    dov0Var = (dov0) yuuVar.c;
                                    iC12 = qyc.c(2);
                                    if (dov0Var == unv0Var) {
                                        iC12 *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i211111111111111111111111 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111111, i211111111111111111111111, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i211111111111111111111112 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111112, i211111111111111111111112, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i211111111111111111111113 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111113, i211111111111111111111113, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i211111111111111111111114 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111114, i211111111111111111111114, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = qyc.a(((Integer) value).intValue());
                                            int i211111111111111111111115 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111115, i211111111111111111111115, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i211111111111111111111116 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111116, i211111111111111111111116, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i211111111111111111111117 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111117, i211111111111111111111117, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i211111111111111111111118 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111118, i211111111111111111111118, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = qyc.b((String) value);
                                            }
                                            int i211111111111111111111119 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111119, i211111111111111111111119, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((kjt) ((y3) value)).g(null);
                                            int i2111111111111111111111110 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111110, i2111111111111111111111110, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 10:
                                            size4 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size4);
                                            iE3 = size4 + iD2;
                                            int i2111111111111111111111111 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111111, i2111111111111111111111111, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = qyc.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i2111111111111111111111112 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111112, i2111111111111111111111112, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 12:
                                            iE3 = qyc.d(((Integer) value).intValue());
                                            int i2111111111111111111111113 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111113, i2111111111111111111111113, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE3 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE3 = qyc.a(((Integer) value).intValue());
                                            }
                                            int i2111111111111111111111114 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111114, i2111111111111111111111114, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i2111111111111111111111115 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111115, i2111111111111111111111115, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i2111111111111111111111116 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111116, i2111111111111111111111116, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 16:
                                            int iIntValue13 = ((Integer) value).intValue();
                                            iE3 = qyc.d((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                                            int i2111111111111111111111117 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111117, i2111111111111111111111117, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue13 = ((Long) value).longValue();
                                            iE3 = qyc.e((jLongValue13 << i23) ^ (jLongValue13 >> c2));
                                            int i2111111111111111111111118 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111118, i2111111111111111111111118, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 13:
                                    iE2 = key instanceof ts3 ? qyc.a(((ts3) key).f34442a) : qyc.a(((Integer) key).intValue());
                                    i4 = iE2 + iC22;
                                    dov0Var = (dov0) yuuVar.c;
                                    iC12 = qyc.c(2);
                                    if (dov0Var == unv0Var) {
                                        iC12 *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i2111111111111111111111119 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111119, i2111111111111111111111119, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i21111111111111111111111110 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111111110, i21111111111111111111111110, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i21111111111111111111111111 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111111111, i21111111111111111111111111, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i21111111111111111111111112 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111111112, i21111111111111111111111112, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = qyc.a(((Integer) value).intValue());
                                            int i21111111111111111111111113 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111111113, i21111111111111111111111113, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i21111111111111111111111114 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111111114, i21111111111111111111111114, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i21111111111111111111111115 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111111115, i21111111111111111111111115, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i21111111111111111111111116 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111111116, i21111111111111111111111116, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = qyc.b((String) value);
                                            }
                                            int i21111111111111111111111117 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111111117, i21111111111111111111111117, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((kjt) ((y3) value)).g(null);
                                            int i21111111111111111111111118 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111111118, i21111111111111111111111118, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 10:
                                            size4 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size4);
                                            iE3 = size4 + iD2;
                                            int i21111111111111111111111119 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111111119, i21111111111111111111111119, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = qyc.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i211111111111111111111111110 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111111110, i211111111111111111111111110, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 12:
                                            iE3 = qyc.d(((Integer) value).intValue());
                                            int i211111111111111111111111111 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111111111, i211111111111111111111111111, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE3 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE3 = qyc.a(((Integer) value).intValue());
                                            }
                                            int i211111111111111111111111112 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111111112, i211111111111111111111111112, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i211111111111111111111111113 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111111113, i211111111111111111111111113, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i211111111111111111111111114 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111111114, i211111111111111111111111114, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 16:
                                            int iIntValue14 = ((Integer) value).intValue();
                                            iE3 = qyc.d((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                                            int i211111111111111111111111115 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111111115, i211111111111111111111111115, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue14 = ((Long) value).longValue();
                                            iE3 = qyc.e((jLongValue14 << i23) ^ (jLongValue14 >> c2));
                                            int i211111111111111111111111116 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111111116, i211111111111111111111111116, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 14:
                                    ((Integer) key).getClass();
                                    iE2 = 4;
                                    i4 = iE2 + iC22;
                                    dov0Var = (dov0) yuuVar.c;
                                    iC12 = qyc.c(2);
                                    if (dov0Var == unv0Var) {
                                        iC12 *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i211111111111111111111111117 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111111117, i211111111111111111111111117, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i211111111111111111111111118 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111111118, i211111111111111111111111118, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i211111111111111111111111119 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111111119, i211111111111111111111111119, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i2111111111111111111111111110 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111111110, i2111111111111111111111111110, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = qyc.a(((Integer) value).intValue());
                                            int i2111111111111111111111111111 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111111111, i2111111111111111111111111111, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i2111111111111111111111111112 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111111112, i2111111111111111111111111112, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i2111111111111111111111111113 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111111113, i2111111111111111111111111113, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i2111111111111111111111111114 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111111114, i2111111111111111111111111114, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = qyc.b((String) value);
                                            }
                                            int i2111111111111111111111111115 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111111115, i2111111111111111111111111115, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((kjt) ((y3) value)).g(null);
                                            int i2111111111111111111111111116 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111111116, i2111111111111111111111111116, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 10:
                                            size4 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size4);
                                            iE3 = size4 + iD2;
                                            int i2111111111111111111111111117 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111111117, i2111111111111111111111111117, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = qyc.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i2111111111111111111111111118 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111111118, i2111111111111111111111111118, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 12:
                                            iE3 = qyc.d(((Integer) value).intValue());
                                            int i2111111111111111111111111119 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111111119, i2111111111111111111111111119, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE3 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE3 = qyc.a(((Integer) value).intValue());
                                            }
                                            int i21111111111111111111111111110 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111111111110, i21111111111111111111111111110, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i21111111111111111111111111111 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111111111111, i21111111111111111111111111111, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i21111111111111111111111111112 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111111111112, i21111111111111111111111111112, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 16:
                                            int iIntValue15 = ((Integer) value).intValue();
                                            iE3 = qyc.d((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                                            int i21111111111111111111111111113 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111111111113, i21111111111111111111111111113, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue15 = ((Long) value).longValue();
                                            iE3 = qyc.e((jLongValue15 << i23) ^ (jLongValue15 >> c2));
                                            int i21111111111111111111111111114 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111111111114, i21111111111111111111111111114, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 15:
                                    ((Long) key).getClass();
                                    iE2 = 8;
                                    i4 = iE2 + iC22;
                                    dov0Var = (dov0) yuuVar.c;
                                    iC12 = qyc.c(2);
                                    if (dov0Var == unv0Var) {
                                        iC12 *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i21111111111111111111111111115 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111111111115, i21111111111111111111111111115, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i21111111111111111111111111116 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111111111116, i21111111111111111111111111116, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i21111111111111111111111111117 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111111111117, i21111111111111111111111111117, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i21111111111111111111111111118 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111111111118, i21111111111111111111111111118, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = qyc.a(((Integer) value).intValue());
                                            int i21111111111111111111111111119 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111111111119, i21111111111111111111111111119, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i211111111111111111111111111110 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111111111110, i211111111111111111111111111110, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i211111111111111111111111111111 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111111111111, i211111111111111111111111111111, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i211111111111111111111111111112 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111111111112, i211111111111111111111111111112, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = qyc.b((String) value);
                                            }
                                            int i211111111111111111111111111113 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111111111113, i211111111111111111111111111113, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((kjt) ((y3) value)).g(null);
                                            int i211111111111111111111111111114 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111111111114, i211111111111111111111111111114, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 10:
                                            size4 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size4);
                                            iE3 = size4 + iD2;
                                            int i211111111111111111111111111115 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111111111115, i211111111111111111111111111115, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = qyc.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i211111111111111111111111111116 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111111111116, i211111111111111111111111111116, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 12:
                                            iE3 = qyc.d(((Integer) value).intValue());
                                            int i211111111111111111111111111117 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111111111117, i211111111111111111111111111117, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE3 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE3 = qyc.a(((Integer) value).intValue());
                                            }
                                            int i211111111111111111111111111118 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111111111118, i211111111111111111111111111118, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i211111111111111111111111111119 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111111111119, i211111111111111111111111111119, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i2111111111111111111111111111110 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111111111110, i2111111111111111111111111111110, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 16:
                                            int iIntValue16 = ((Integer) value).intValue();
                                            iE3 = qyc.d((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                                            int i2111111111111111111111111111111 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111111111111, i2111111111111111111111111111111, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue16 = ((Long) value).longValue();
                                            iE3 = qyc.e((jLongValue16 << i23) ^ (jLongValue16 >> c2));
                                            int i2111111111111111111111111111112 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111111111112, i2111111111111111111111111111112, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 16:
                                    int iIntValue17 = ((Integer) key).intValue();
                                    iE2 = qyc.d((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                                    i4 = iE2 + iC22;
                                    dov0Var = (dov0) yuuVar.c;
                                    iC12 = qyc.c(2);
                                    if (dov0Var == unv0Var) {
                                        iC12 *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i2111111111111111111111111111113 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111111111113, i2111111111111111111111111111113, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i2111111111111111111111111111114 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111111111114, i2111111111111111111111111111114, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i2111111111111111111111111111115 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111111111115, i2111111111111111111111111111115, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i2111111111111111111111111111116 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111111111116, i2111111111111111111111111111116, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = qyc.a(((Integer) value).intValue());
                                            int i2111111111111111111111111111117 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111111111117, i2111111111111111111111111111117, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i2111111111111111111111111111118 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111111111118, i2111111111111111111111111111118, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i2111111111111111111111111111119 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111111111119, i2111111111111111111111111111119, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i21111111111111111111111111111110 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111111111111110, i21111111111111111111111111111110, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = qyc.b((String) value);
                                            }
                                            int i21111111111111111111111111111111 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111111111111111, i21111111111111111111111111111111, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((kjt) ((y3) value)).g(null);
                                            int i21111111111111111111111111111112 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111111111111112, i21111111111111111111111111111112, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 10:
                                            size4 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size4);
                                            iE3 = size4 + iD2;
                                            int i21111111111111111111111111111113 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111111111111113, i21111111111111111111111111111113, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = qyc.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i21111111111111111111111111111114 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111111111111114, i21111111111111111111111111111114, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 12:
                                            iE3 = qyc.d(((Integer) value).intValue());
                                            int i21111111111111111111111111111115 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111111111111115, i21111111111111111111111111111115, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE3 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE3 = qyc.a(((Integer) value).intValue());
                                            }
                                            int i21111111111111111111111111111116 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111111111111116, i21111111111111111111111111111116, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i21111111111111111111111111111117 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111111111111117, i21111111111111111111111111111117, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i21111111111111111111111111111118 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111111111111118, i21111111111111111111111111111118, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 16:
                                            int iIntValue18 = ((Integer) value).intValue();
                                            iE3 = qyc.d((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                                            int i21111111111111111111111111111119 = iE3 + iC12 + i4;
                                            iX = f140.x(i21111111111111111111111111111119, i21111111111111111111111111111119, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue17 = ((Long) value).longValue();
                                            iE3 = qyc.e((jLongValue17 << i23) ^ (jLongValue17 >> c2));
                                            int i211111111111111111111111111111110 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111111111111110, i211111111111111111111111111111110, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 17:
                                    long jLongValue18 = ((Long) key).longValue();
                                    iE2 = qyc.e((jLongValue18 << i23) ^ (jLongValue18 >> c2));
                                    i4 = iE2 + iC22;
                                    dov0Var = (dov0) yuuVar.c;
                                    iC12 = qyc.c(2);
                                    if (dov0Var == unv0Var) {
                                        iC12 *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i211111111111111111111111111111111 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111111111111111, i211111111111111111111111111111111, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i211111111111111111111111111111112 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111111111111112, i211111111111111111111111111111112, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i211111111111111111111111111111113 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111111111111113, i211111111111111111111111111111113, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = qyc.e(((Long) value).longValue());
                                            int i211111111111111111111111111111114 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111111111111114, i211111111111111111111111111111114, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = qyc.a(((Integer) value).intValue());
                                            int i211111111111111111111111111111115 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111111111111115, i211111111111111111111111111111115, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i211111111111111111111111111111116 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111111111111116, i211111111111111111111111111111116, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i211111111111111111111111111111117 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111111111111117, i211111111111111111111111111111117, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i211111111111111111111111111111118 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111111111111118, i211111111111111111111111111111118, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = qyc.b((String) value);
                                            }
                                            int i211111111111111111111111111111119 = iE3 + iC12 + i4;
                                            iX = f140.x(i211111111111111111111111111111119, i211111111111111111111111111111119, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((kjt) ((y3) value)).g(null);
                                            int i2111111111111111111111111111111110 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111111111111110, i2111111111111111111111111111111110, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 10:
                                            size4 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size4);
                                            iE3 = size4 + iD2;
                                            int i2111111111111111111111111111111111 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111111111111111, i2111111111111111111111111111111111, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size4 = ((lg9) value).size();
                                                iD2 = qyc.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = qyc.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i2111111111111111111111111111111112 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111111111111112, i2111111111111111111111111111111112, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 12:
                                            iE3 = qyc.d(((Integer) value).intValue());
                                            int i2111111111111111111111111111111113 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111111111111113, i2111111111111111111111111111111113, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE3 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE3 = qyc.a(((Integer) value).intValue());
                                            }
                                            int i2111111111111111111111111111111114 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111111111111114, i2111111111111111111111111111111114, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i2111111111111111111111111111111115 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111111111111115, i2111111111111111111111111111111115, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i2111111111111111111111111111111116 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111111111111116, i2111111111111111111111111111111116, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 16:
                                            int iIntValue19 = ((Integer) value).intValue();
                                            iE3 = qyc.d((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                                            int i2111111111111111111111111111111117 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111111111111117, i2111111111111111111111111111111117, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue19 = ((Long) value).longValue();
                                            iE3 = qyc.e((jLongValue19 << i23) ^ (jLongValue19 >> c2));
                                            int i2111111111111111111111111111111118 = iE3 + iC12 + i4;
                                            iX = f140.x(i2111111111111111111111111111111118, i2111111111111111111111111111111118, iC21, iX);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                default:
                                    itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                    return 0;
                            }
                        }
                    }
                    i6 = i6;
                    iX2 += iX;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 51:
                    if (p640Var.n(i9, i7, kjtVar2)) {
                        iC13 = qyc.c(i9);
                        iC17 = iC13 + 8;
                        iX2 += iC17;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 52:
                    if (p640Var.n(i9, i7, kjtVar2)) {
                        iC14 = qyc.c(i9);
                        iC17 = iC14 + 4;
                        iX2 += iC17;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 53:
                    if (p640Var.n(i9, i7, kjtVar2)) {
                        long jS = s(kjtVar2, j2);
                        iC15 = qyc.c(i9);
                        iE4 = qyc.e(jS);
                        iX2 += iE4 + iC15;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 54:
                    if (p640Var.n(i9, i7, kjtVar2)) {
                        long jS2 = s(kjtVar2, j2);
                        iC15 = qyc.c(i9);
                        iE4 = qyc.e(jS2);
                        iX2 += iE4 + iC15;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 55:
                    if (p640Var.n(i9, i7, kjtVar2)) {
                        int iR = r(kjtVar2, j2);
                        iC16 = qyc.c(i9);
                        iA2 = qyc.a(iR);
                        iC17 = iA2 + iC16;
                        iX2 += iC17;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 56:
                    if (p640Var.n(i9, i7, kjtVar2)) {
                        iC13 = qyc.c(i9);
                        iC17 = iC13 + 8;
                        iX2 += iC17;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 57:
                    if (p640Var.n(i9, i7, kjtVar2)) {
                        iC14 = qyc.c(i9);
                        iC17 = iC14 + 4;
                        iX2 += iC17;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 58:
                    if (p640Var.n(i9, i7, kjtVar2)) {
                        iC17 = qyc.c(i9) + 1;
                        iX2 += iC17;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 59:
                    if (p640Var.n(i9, i7, kjtVar2)) {
                        Object object4 = unsafe.getObject(kjtVar2, j2);
                        if (object4 instanceof lg9) {
                            int iC23 = qyc.c(i9);
                            int size15 = ((lg9) object4).size();
                            iB2 = f140.x(size15, size15, iC23, iX2);
                        } else {
                            iB2 = qyc.b((String) object4) + qyc.c(i9) + iX2;
                        }
                        iX2 = iB2;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 60:
                    if (p640Var.n(i9, i7, kjtVar2)) {
                        Object object5 = unsafe.getObject(kjtVar2, j2);
                        p2h0 p2h0VarJ4 = p640Var.j(i7);
                        Class cls21 = x2h0.f40168a;
                        int iC24 = qyc.c(i9);
                        int iG4 = ((y3) object5).g(p2h0VarJ4);
                        iX2 = f140.x(iG4, iG4, iC24, iX2);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 61:
                    if (p640Var.n(i9, i7, kjtVar2)) {
                        lg9 lg9Var2 = (lg9) unsafe.getObject(kjtVar2, j2);
                        int iC25 = qyc.c(i9);
                        int size16 = lg9Var2.size();
                        iX2 = f140.x(size16, size16, iC25, iX2);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 62:
                    if (p640Var.n(i9, i7, kjtVar2)) {
                        int iR2 = r(kjtVar2, j2);
                        iC16 = qyc.c(i9);
                        iA2 = qyc.d(iR2);
                        iC17 = iA2 + iC16;
                        iX2 += iC17;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 63:
                    if (p640Var.n(i9, i7, kjtVar2)) {
                        int iR3 = r(kjtVar2, j2);
                        iC16 = qyc.c(i9);
                        iA2 = qyc.a(iR3);
                        iC17 = iA2 + iC16;
                        iX2 += iC17;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 64:
                    if (p640Var.n(i9, i7, kjtVar2)) {
                        iC14 = qyc.c(i9);
                        iC17 = iC14 + 4;
                        iX2 += iC17;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 65:
                    if (p640Var.n(i9, i7, kjtVar2)) {
                        iC13 = qyc.c(i9);
                        iC17 = iC13 + 8;
                        iX2 += iC17;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 66:
                    if (p640Var.n(i9, i7, kjtVar2)) {
                        int iR4 = r(kjtVar2, j2);
                        iC16 = qyc.c(i9);
                        iA2 = qyc.d((iR4 >> 31) ^ (iR4 << 1));
                        iC17 = iA2 + iC16;
                        iX2 += iC17;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 67:
                    if (p640Var.n(i9, i7, kjtVar2)) {
                        long jS3 = s(kjtVar2, j2);
                        iC15 = qyc.c(i9);
                        iE4 = qyc.e((jS3 << 1) ^ (jS3 >> 63));
                        iX2 += iE4 + iC15;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 68:
                    if (p640Var.n(i9, i7, kjtVar2)) {
                        iC17 = ((y3) unsafe.getObject(kjtVar2, j2)).g(p640Var.j(i7)) + (qyc.c(i9) * 2);
                        iX2 += iC17;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                default:
                    i7 += 3;
                    i5 = 1048575;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    @Override // a.p2h0
    public final boolean f(kjt kjtVar, kjt kjtVar2) {
        int[] iArr = this.f26437a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zK = true;
            if (i < length) {
                int iW = w(i);
                long j2 = iW & 1048575;
                switch (v(iW)) {
                    case 0:
                        if (!i(kjtVar, kjtVar2, i)) {
                            zK = false;
                        } else {
                            gft0 gft0Var = ift0.c;
                            if (Double.doubleToLongBits(gft0Var.c(kjtVar, j2)) != Double.doubleToLongBits(gft0Var.c(kjtVar2, j2))) {
                                zK = false;
                            }
                        }
                        break;
                    case 1:
                        if (!i(kjtVar, kjtVar2, i)) {
                            zK = false;
                        } else {
                            gft0 gft0Var2 = ift0.c;
                            if (Float.floatToIntBits(gft0Var2.d(kjtVar, j2)) != Float.floatToIntBits(gft0Var2.d(kjtVar2, j2))) {
                                zK = false;
                            }
                        }
                        break;
                    case 2:
                        if (!i(kjtVar, kjtVar2, i) || ift0.i(kjtVar, j2) != ift0.i(kjtVar2, j2)) {
                            zK = false;
                        }
                        break;
                    case 3:
                        if (!i(kjtVar, kjtVar2, i) || ift0.i(kjtVar, j2) != ift0.i(kjtVar2, j2)) {
                            zK = false;
                        }
                        break;
                    case 4:
                        if (!i(kjtVar, kjtVar2, i) || ift0.h(kjtVar, j2) != ift0.h(kjtVar2, j2)) {
                            zK = false;
                        }
                        break;
                    case 5:
                        if (!i(kjtVar, kjtVar2, i) || ift0.i(kjtVar, j2) != ift0.i(kjtVar2, j2)) {
                            zK = false;
                        }
                        break;
                    case 6:
                        if (!i(kjtVar, kjtVar2, i) || ift0.h(kjtVar, j2) != ift0.h(kjtVar2, j2)) {
                            zK = false;
                        }
                        break;
                    case 7:
                        if (!i(kjtVar, kjtVar2, i)) {
                            zK = false;
                        } else {
                            gft0 gft0Var3 = ift0.c;
                            if (gft0Var3.a(kjtVar, j2) != gft0Var3.a(kjtVar2, j2)) {
                                zK = false;
                            }
                        }
                        break;
                    case 8:
                        if (!i(kjtVar, kjtVar2, i) || !x2h0.k(ift0.j(kjtVar, j2), ift0.j(kjtVar2, j2))) {
                            zK = false;
                        }
                        break;
                    case 9:
                        if (!i(kjtVar, kjtVar2, i) || !x2h0.k(ift0.j(kjtVar, j2), ift0.j(kjtVar2, j2))) {
                            zK = false;
                        }
                        break;
                    case 10:
                        if (!i(kjtVar, kjtVar2, i) || !x2h0.k(ift0.j(kjtVar, j2), ift0.j(kjtVar2, j2))) {
                            zK = false;
                        }
                        break;
                    case 11:
                        if (!i(kjtVar, kjtVar2, i) || ift0.h(kjtVar, j2) != ift0.h(kjtVar2, j2)) {
                            zK = false;
                        }
                        break;
                    case 12:
                        if (!i(kjtVar, kjtVar2, i) || ift0.h(kjtVar, j2) != ift0.h(kjtVar2, j2)) {
                            zK = false;
                        }
                        break;
                    case 13:
                        if (!i(kjtVar, kjtVar2, i) || ift0.h(kjtVar, j2) != ift0.h(kjtVar2, j2)) {
                            zK = false;
                        }
                        break;
                    case 14:
                        if (!i(kjtVar, kjtVar2, i) || ift0.i(kjtVar, j2) != ift0.i(kjtVar2, j2)) {
                            zK = false;
                        }
                        break;
                    case 15:
                        if (!i(kjtVar, kjtVar2, i) || ift0.h(kjtVar, j2) != ift0.h(kjtVar2, j2)) {
                            zK = false;
                        }
                        break;
                    case 16:
                        if (!i(kjtVar, kjtVar2, i) || ift0.i(kjtVar, j2) != ift0.i(kjtVar2, j2)) {
                            zK = false;
                        }
                        break;
                    case 17:
                        if (!i(kjtVar, kjtVar2, i) || !x2h0.k(ift0.j(kjtVar, j2), ift0.j(kjtVar2, j2))) {
                            zK = false;
                        }
                        break;
                    case 18:
                    case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    case AvailableCode.HMS_IS_SPOOF /* 29 */:
                    case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                    case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        zK = x2h0.k(ift0.j(kjtVar, j2), ift0.j(kjtVar2, j2));
                        break;
                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                        zK = x2h0.k(ift0.j(kjtVar, j2), ift0.j(kjtVar2, j2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j3 = iArr[i + 2] & 1048575;
                        if (ift0.h(kjtVar, j3) != ift0.h(kjtVar2, j3) || !x2h0.k(ift0.j(kjtVar, j2), ift0.j(kjtVar2, j2))) {
                            zK = false;
                        }
                        break;
                }
                if (zK) {
                    i += 3;
                }
            } else {
                this.h.getClass();
                if (kjtVar.unknownFields.equals(kjtVar2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:120:0x0334  */
    /* JADX WARN: Code duplicated, block: B:125:0x0341  */
    /* JADX WARN: Code duplicated, block: B:126:0x0355  */
    /* JADX WARN: Code duplicated, block: B:127:0x0366  */
    /* JADX WARN: Code duplicated, block: B:129:0x036f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0378  */
    /* JADX WARN: Code duplicated, block: B:133:0x037c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0386  */
    /* JADX WARN: Code duplicated, block: B:135:0x0392  */
    /* JADX WARN: Code duplicated, block: B:136:0x039e  */
    /* JADX WARN: Code duplicated, block: B:138:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:140:0x03af  */
    /* JADX WARN: Code duplicated, block: B:141:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:142:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:143:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:145:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:146:0x03de  */
    /* JADX WARN: Code duplicated, block: B:147:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:148:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:149:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:150:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:151:0x0404  */
    /* JADX WARN: Code duplicated, block: B:152:0x040f  */
    /* JADX WARN: Code duplicated, block: B:153:0x041a  */
    /* JADX WARN: Code duplicated, block: B:154:0x0421  */
    /* JADX WARN: Code duplicated, block: B:16:0x0052 A[PHI: r3 r4
  0x0052: PHI (r3v79 int) = 
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v36 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
 binds: [B:15:0x004f, B:256:0x07d3, B:257:0x07d5, B:230:0x072f, B:231:0x0731, B:157:0x0449, B:73:0x01c5, B:74:0x01c7, B:70:0x01a8, B:71:0x01aa, B:68:0x0198, B:61:0x016f, B:58:0x015c, B:59:0x015e, B:55:0x0149, B:56:0x014b, B:52:0x012f, B:53:0x0131, B:46:0x010d, B:50:0x0121, B:49:0x0117, B:43:0x00fa, B:44:0x00fc, B:40:0x00e6, B:41:0x00e8, B:38:0x00d6, B:34:0x00c0, B:31:0x00ae, B:32:0x00b0, B:28:0x009b, B:29:0x009d, B:26:0x0087, B:21:0x006b, B:18:0x0059, B:19:0x005b] A[DONT_GENERATE, DONT_INLINE]
  0x0052: PHI (r4v101 int) = 
  (r4v2 int)
  (r4v2 int)
  (r4v2 int)
  (r4v2 int)
  (r4v2 int)
  (r4v68 int)
  (r4v2 int)
  (r4v2 int)
  (r4v2 int)
  (r4v2 int)
  (r4v2 int)
  (r4v2 int)
  (r4v2 int)
  (r4v2 int)
  (r4v2 int)
  (r4v2 int)
  (r4v2 int)
  (r4v2 int)
  (r4v2 int)
  (r4v2 int)
  (r4v2 int)
  (r4v2 int)
  (r4v2 int)
  (r4v2 int)
  (r4v2 int)
  (r4v2 int)
  (r4v2 int)
  (r4v2 int)
  (r4v2 int)
  (r4v2 int)
  (r4v2 int)
  (r4v2 int)
  (r4v2 int)
  (r4v2 int)
  (r4v2 int)
 binds: [B:15:0x004f, B:256:0x07d3, B:257:0x07d5, B:230:0x072f, B:231:0x0731, B:157:0x0449, B:73:0x01c5, B:74:0x01c7, B:70:0x01a8, B:71:0x01aa, B:68:0x0198, B:61:0x016f, B:58:0x015c, B:59:0x015e, B:55:0x0149, B:56:0x014b, B:52:0x012f, B:53:0x0131, B:46:0x010d, B:50:0x0121, B:49:0x0117, B:43:0x00fa, B:44:0x00fc, B:40:0x00e6, B:41:0x00e8, B:38:0x00d6, B:34:0x00c0, B:31:0x00ae, B:32:0x00b0, B:28:0x009b, B:29:0x009d, B:26:0x0087, B:21:0x006b, B:18:0x0059, B:19:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:236:0x075a  */
    /* JADX WARN: Code duplicated, block: B:293:0x033d A[SYNTHETIC] */
    @Override // a.p2h0
    public final void g(Object obj, prc prcVar) throws l52 {
        int i;
        int i2;
        int i3;
        int iE;
        int size;
        int iD;
        int iG;
        int i4;
        int iC;
        int iE2;
        int size2;
        int iD2;
        boolean z;
        p640 p640Var = this;
        prcVar.getClass();
        qyc qycVar = (qyc) prcVar.b;
        int[] iArr = p640Var.f26437a;
        int length = iArr.length;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            int iW = p640Var.w(i7);
            int i9 = iArr[i7];
            int iV = v(iW);
            Unsafe unsafe = k;
            if (iV <= 17) {
                int i10 = iArr[i7 + 2];
                int i11 = i10 & i5;
                if (i11 != i6) {
                    i8 = i11 == i5 ? 0 : unsafe.getInt(obj, i11);
                    i6 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            long j2 = iW & i5;
            int i12 = 2;
            switch (iV) {
                case 0:
                    if (p640Var.l(obj, i7, i6, i8, i)) {
                        long jDoubleToRawLongBits = Double.doubleToRawLongBits(ift0.c.c(obj, j2));
                        qycVar.m(i9, 1);
                        qycVar.j(jDoubleToRawLongBits);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 1:
                    if (p640Var.l(obj, i7, i6, i8, i)) {
                        int iFloatToRawIntBits = Float.floatToRawIntBits(ift0.c.d(obj, j2));
                        qycVar.m(i9, 5);
                        qycVar.i(iFloatToRawIntBits);
                    }
                    p640Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 2:
                    if (p640Var.l(obj, i7, i6, i8, i)) {
                        long j3 = unsafe.getLong(obj, j2);
                        qycVar.m(i9, 0);
                        qycVar.o(j3);
                    }
                    p640Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 3:
                    if (p640Var.l(obj, i7, i6, i8, i)) {
                        long j4 = unsafe.getLong(obj, j2);
                        qycVar.m(i9, 0);
                        qycVar.o(j4);
                    }
                    p640Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 4:
                    if (p640Var.l(obj, i7, i6, i8, i)) {
                        int i13 = unsafe.getInt(obj, j2);
                        qycVar.m(i9, 0);
                        qycVar.k(i13);
                    }
                    p640Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 5:
                    if (p640Var.l(obj, i7, i6, i8, i)) {
                        long j5 = unsafe.getLong(obj, j2);
                        qycVar.m(i9, 1);
                        qycVar.j(j5);
                    }
                    p640Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 6:
                    if (p640Var.l(obj, i7, i6, i8, i)) {
                        int i14 = unsafe.getInt(obj, j2);
                        qycVar.m(i9, 5);
                        qycVar.i(i14);
                    }
                    p640Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 7:
                    if (p640Var.l(obj, i7, i6, i8, i)) {
                        boolean zA = ift0.c.a(obj, j2);
                        qycVar.m(i9, 0);
                        qycVar.f(zA ? (byte) 1 : (byte) 0);
                    }
                    p640Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 8:
                    if (p640Var.l(obj, i7, i6, i8, i)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            qycVar.m(i9, 2);
                            qycVar.l((String) object);
                        } else {
                            qycVar.m(i9, 2);
                            qycVar.h((lg9) object);
                        }
                    }
                    p640Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 9:
                    if (p640Var.l(obj, i7, i6, i8, i)) {
                        prcVar.r(i9, unsafe.getObject(obj, j2), p640Var.j(i7));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 10:
                    if (p640Var.l(obj, i7, i6, i8, i)) {
                        lg9 lg9Var = (lg9) unsafe.getObject(obj, j2);
                        qycVar.m(i9, 2);
                        qycVar.h(lg9Var);
                    }
                    p640Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 11:
                    if (p640Var.l(obj, i7, i6, i8, i)) {
                        int i15 = unsafe.getInt(obj, j2);
                        qycVar.m(i9, 0);
                        qycVar.n(i15);
                    }
                    p640Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 12:
                    if (p640Var.l(obj, i7, i6, i8, i)) {
                        int i16 = unsafe.getInt(obj, j2);
                        qycVar.m(i9, 0);
                        qycVar.k(i16);
                    }
                    p640Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 13:
                    if (p640Var.l(obj, i7, i6, i8, i)) {
                        int i17 = unsafe.getInt(obj, j2);
                        qycVar.m(i9, 5);
                        qycVar.i(i17);
                    }
                    p640Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 14:
                    if (p640Var.l(obj, i7, i6, i8, i)) {
                        long j6 = unsafe.getLong(obj, j2);
                        qycVar.m(i9, 1);
                        qycVar.j(j6);
                    }
                    p640Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 15:
                    if (p640Var.l(obj, i7, i6, i8, i)) {
                        int i18 = unsafe.getInt(obj, j2);
                        qycVar.m(i9, 0);
                        qycVar.n((i18 >> 31) ^ (i18 << 1));
                    }
                    p640Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 16:
                    if (p640Var.l(obj, i7, i6, i8, i)) {
                        long j7 = unsafe.getLong(obj, j2);
                        qycVar.m(i9, 0);
                        qycVar.o((j7 >> 63) ^ (j7 << 1));
                    }
                    p640Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 17:
                    if (p640Var.l(obj, i7, i6, i8, i)) {
                        prcVar.q(i9, unsafe.getObject(obj, j2), p640Var.j(i7));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 18:
                    x2h0.m(iArr[i7], (List) unsafe.getObject(obj, j2), prcVar, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    x2h0.q(iArr[i7], (List) unsafe.getObject(obj, j2), prcVar, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 20:
                    x2h0.s(iArr[i7], (List) unsafe.getObject(obj, j2), prcVar, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 21:
                    x2h0.y(iArr[i7], (List) unsafe.getObject(obj, j2), prcVar, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 22:
                    x2h0.r(iArr[i7], (List) unsafe.getObject(obj, j2), prcVar, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 23:
                    x2h0.p(iArr[i7], (List) unsafe.getObject(obj, j2), prcVar, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 24:
                    x2h0.o(iArr[i7], (List) unsafe.getObject(obj, j2), prcVar, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    x2h0.l(iArr[i7], (List) unsafe.getObject(obj, j2), prcVar, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    i2 = i6;
                    i3 = i8;
                    int i19 = iArr[i7];
                    List list = (List) unsafe.getObject(obj, j2);
                    Class cls = x2h0.f40168a;
                    if (list != null && !list.isEmpty()) {
                        if (list instanceof sez) {
                            sez sezVar = (sez) list;
                            for (int i20 = 0; i20 < list.size(); i20++) {
                                Object objX = sezVar.x(i20);
                                if (objX instanceof String) {
                                    qycVar.m(i19, 2);
                                    qycVar.l((String) objX);
                                } else {
                                    qycVar.m(i19, 2);
                                    qycVar.h((lg9) objX);
                                }
                            }
                        } else {
                            for (int i21 = 0; i21 < list.size(); i21++) {
                                String str = (String) list.get(i21);
                                qycVar.m(i19, 2);
                                qycVar.l(str);
                            }
                        }
                    }
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    i2 = i6;
                    i3 = i8;
                    int i22 = iArr[i7];
                    List list2 = (List) unsafe.getObject(obj, j2);
                    p2h0 p2h0VarJ = p640Var.j(i7);
                    Class cls2 = x2h0.f40168a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i23 = 0; i23 < list2.size(); i23++) {
                            prcVar.r(i22, list2.get(i23), p2h0VarJ);
                        }
                    }
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    i2 = i6;
                    i3 = i8;
                    int i24 = iArr[i7];
                    List list3 = (List) unsafe.getObject(obj, j2);
                    Class cls3 = x2h0.f40168a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i25 = 0; i25 < list3.size(); i25++) {
                            lg9 lg9Var2 = (lg9) list3.get(i25);
                            qycVar.m(i24, 2);
                            qycVar.h(lg9Var2);
                        }
                    }
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                    x2h0.x(iArr[i7], (List) unsafe.getObject(obj, j2), prcVar, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                    x2h0.n(iArr[i7], (List) unsafe.getObject(obj, j2), prcVar, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                    x2h0.t(iArr[i7], (List) unsafe.getObject(obj, j2), prcVar, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 32:
                    x2h0.u(iArr[i7], (List) unsafe.getObject(obj, j2), prcVar, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 33:
                    x2h0.v(iArr[i7], (List) unsafe.getObject(obj, j2), prcVar, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 34:
                    x2h0.w(iArr[i7], (List) unsafe.getObject(obj, j2), prcVar, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 35:
                    i2 = i6;
                    i3 = i8;
                    x2h0.m(iArr[i7], (List) unsafe.getObject(obj, j2), prcVar, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 36:
                    i2 = i6;
                    i3 = i8;
                    x2h0.q(iArr[i7], (List) unsafe.getObject(obj, j2), prcVar, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 37:
                    i2 = i6;
                    i3 = i8;
                    x2h0.s(iArr[i7], (List) unsafe.getObject(obj, j2), prcVar, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 38:
                    i2 = i6;
                    i3 = i8;
                    x2h0.y(iArr[i7], (List) unsafe.getObject(obj, j2), prcVar, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 39:
                    i2 = i6;
                    i3 = i8;
                    x2h0.r(iArr[i7], (List) unsafe.getObject(obj, j2), prcVar, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 40:
                    i2 = i6;
                    i3 = i8;
                    x2h0.p(iArr[i7], (List) unsafe.getObject(obj, j2), prcVar, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 41:
                    i2 = i6;
                    i3 = i8;
                    x2h0.o(iArr[i7], (List) unsafe.getObject(obj, j2), prcVar, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 42:
                    i2 = i6;
                    i3 = i8;
                    x2h0.l(iArr[i7], (List) unsafe.getObject(obj, j2), prcVar, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 43:
                    i2 = i6;
                    i3 = i8;
                    x2h0.x(iArr[i7], (List) unsafe.getObject(obj, j2), prcVar, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 44:
                    i2 = i6;
                    i3 = i8;
                    x2h0.n(iArr[i7], (List) unsafe.getObject(obj, j2), prcVar, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 45:
                    i2 = i6;
                    i3 = i8;
                    x2h0.t(iArr[i7], (List) unsafe.getObject(obj, j2), prcVar, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 46:
                    i2 = i6;
                    i3 = i8;
                    x2h0.u(iArr[i7], (List) unsafe.getObject(obj, j2), prcVar, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 47:
                    i2 = i6;
                    i3 = i8;
                    x2h0.v(iArr[i7], (List) unsafe.getObject(obj, j2), prcVar, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 48:
                    i2 = i6;
                    i3 = i8;
                    x2h0.w(iArr[i7], (List) unsafe.getObject(obj, j2), prcVar, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 49:
                    i2 = i6;
                    i3 = i8;
                    int i26 = iArr[i7];
                    List list4 = (List) unsafe.getObject(obj, j2);
                    p2h0 p2h0VarJ2 = p640Var.j(i7);
                    Class cls4 = x2h0.f40168a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i27 = 0; i27 < list4.size(); i27++) {
                            prcVar.q(i26, list4.get(i27), p2h0VarJ2);
                        }
                    }
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Object object2 = unsafe.getObject(obj, j2);
                    if (object2 != null) {
                        Object obj2 = p640Var.b[(i7 / 3) * 2];
                        p640Var.i.getClass();
                        yuu yuuVar = ((po20) obj2).f27312a;
                        dov0 dov0Var = (dov0) yuuVar.c;
                        dov0 dov0Var2 = (dov0) yuuVar.b;
                        for (Map.Entry entry : ((vo20) object2).entrySet()) {
                            qycVar.m(i9, i12);
                            Object key = entry.getKey();
                            int i28 = i12;
                            Object value = entry.getValue();
                            int i29 = drp.c;
                            int iC2 = qyc.c(1);
                            int i30 = i6;
                            unv0 unv0Var = dov0.e;
                            if (dov0Var2 == unv0Var) {
                                iC2 *= 2;
                            }
                            int i31 = i8;
                            switch (dov0Var2.ordinal()) {
                                case 0:
                                    ((Double) key).getClass();
                                    iE = 8;
                                    i4 = iE + iC2;
                                    iC = qyc.c(i28);
                                    if (dov0Var == unv0Var) {
                                        iC *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key2 = entry.getKey();
                                            Object value2 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key2);
                                            drp.b(qycVar, dov0Var, i28, value2);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key3 = entry.getKey();
                                            Object value3 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key3);
                                            drp.b(qycVar, dov0Var, i28, value3);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key4 = entry.getKey();
                                            Object value4 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key4);
                                            drp.b(qycVar, dov0Var, i28, value4);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key5 = entry.getKey();
                                            Object value5 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key5);
                                            drp.b(qycVar, dov0Var, i28, value5);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = qyc.a(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key6 = entry.getKey();
                                            Object value6 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key6);
                                            drp.b(qycVar, dov0Var, i28, value6);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key7 = entry.getKey();
                                            Object value7 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key7);
                                            drp.b(qycVar, dov0Var, i28, value7);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key8 = entry.getKey();
                                            Object value8 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key8);
                                            drp.b(qycVar, dov0Var, i28, value8);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key9 = entry.getKey();
                                            Object value9 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key9);
                                            drp.b(qycVar, dov0Var, i28, value9);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = qyc.b((String) value);
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key10 = entry.getKey();
                                            Object value10 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key10);
                                            drp.b(qycVar, dov0Var, i28, value10);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((kjt) ((y3) value)).g(null);
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11 = entry.getKey();
                                            Object value11 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11);
                                            drp.b(qycVar, dov0Var, i28, value11);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 10:
                                            size2 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size2);
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key12 = entry.getKey();
                                            Object value12 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key12);
                                            drp.b(qycVar, dov0Var, i28, value12);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = qyc.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key13 = entry.getKey();
                                            Object value13 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key13);
                                            drp.b(qycVar, dov0Var, i28, value13);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 12:
                                            iE2 = qyc.d(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key14 = entry.getKey();
                                            Object value14 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key14);
                                            drp.b(qycVar, dov0Var, i28, value14);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE2 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE2 = qyc.a(((Integer) value).intValue());
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key15 = entry.getKey();
                                            Object value15 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key15);
                                            drp.b(qycVar, dov0Var, i28, value15);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key16 = entry.getKey();
                                            Object value16 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key16);
                                            drp.b(qycVar, dov0Var, i28, value16);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key17 = entry.getKey();
                                            Object value17 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key17);
                                            drp.b(qycVar, dov0Var, i28, value17);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 16:
                                            int iIntValue = ((Integer) value).intValue();
                                            iE2 = qyc.d((iIntValue >> 31) ^ (iIntValue << 1));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key18 = entry.getKey();
                                            Object value18 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key18);
                                            drp.b(qycVar, dov0Var, i28, value18);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue = ((Long) value).longValue();
                                            iE2 = qyc.e((jLongValue << 1) ^ (jLongValue >> 63));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key19 = entry.getKey();
                                            Object value19 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key19);
                                            drp.b(qycVar, dov0Var, i28, value19);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 1:
                                    ((Float) key).getClass();
                                    iE = 4;
                                    i4 = iE + iC2;
                                    iC = qyc.c(i28);
                                    if (dov0Var == unv0Var) {
                                        iC *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key110 = entry.getKey();
                                            Object value110 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key110);
                                            drp.b(qycVar, dov0Var, i28, value110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111 = entry.getKey();
                                            Object value111 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111);
                                            drp.b(qycVar, dov0Var, i28, value111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key112 = entry.getKey();
                                            Object value112 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key112);
                                            drp.b(qycVar, dov0Var, i28, value112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key113 = entry.getKey();
                                            Object value113 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key113);
                                            drp.b(qycVar, dov0Var, i28, value113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = qyc.a(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key114 = entry.getKey();
                                            Object value114 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key114);
                                            drp.b(qycVar, dov0Var, i28, value114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key115 = entry.getKey();
                                            Object value115 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key115);
                                            drp.b(qycVar, dov0Var, i28, value115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key116 = entry.getKey();
                                            Object value116 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key116);
                                            drp.b(qycVar, dov0Var, i28, value116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key117 = entry.getKey();
                                            Object value117 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key117);
                                            drp.b(qycVar, dov0Var, i28, value117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = qyc.b((String) value);
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key118 = entry.getKey();
                                            Object value118 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key118);
                                            drp.b(qycVar, dov0Var, i28, value118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((kjt) ((y3) value)).g(null);
                                            qycVar.n(iE2 + iC + i4);
                                            Object key119 = entry.getKey();
                                            Object value119 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key119);
                                            drp.b(qycVar, dov0Var, i28, value119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 10:
                                            size2 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size2);
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1110 = entry.getKey();
                                            Object value1110 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1110);
                                            drp.b(qycVar, dov0Var, i28, value1110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = qyc.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111 = entry.getKey();
                                            Object value1111 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111);
                                            drp.b(qycVar, dov0Var, i28, value1111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 12:
                                            iE2 = qyc.d(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1112 = entry.getKey();
                                            Object value1112 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1112);
                                            drp.b(qycVar, dov0Var, i28, value1112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE2 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE2 = qyc.a(((Integer) value).intValue());
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1113 = entry.getKey();
                                            Object value1113 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1113);
                                            drp.b(qycVar, dov0Var, i28, value1113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1114 = entry.getKey();
                                            Object value1114 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1114);
                                            drp.b(qycVar, dov0Var, i28, value1114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1115 = entry.getKey();
                                            Object value1115 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1115);
                                            drp.b(qycVar, dov0Var, i28, value1115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 16:
                                            int iIntValue2 = ((Integer) value).intValue();
                                            iE2 = qyc.d((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1116 = entry.getKey();
                                            Object value1116 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1116);
                                            drp.b(qycVar, dov0Var, i28, value1116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue2 = ((Long) value).longValue();
                                            iE2 = qyc.e((jLongValue2 << 1) ^ (jLongValue2 >> 63));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1117 = entry.getKey();
                                            Object value1117 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1117);
                                            drp.b(qycVar, dov0Var, i28, value1117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 2:
                                    iE = qyc.e(((Long) key).longValue());
                                    i4 = iE + iC2;
                                    iC = qyc.c(i28);
                                    if (dov0Var == unv0Var) {
                                        iC *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1118 = entry.getKey();
                                            Object value1118 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1118);
                                            drp.b(qycVar, dov0Var, i28, value1118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1119 = entry.getKey();
                                            Object value1119 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1119);
                                            drp.b(qycVar, dov0Var, i28, value1119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11110 = entry.getKey();
                                            Object value11110 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11110);
                                            drp.b(qycVar, dov0Var, i28, value11110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111 = entry.getKey();
                                            Object value11111 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111);
                                            drp.b(qycVar, dov0Var, i28, value11111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = qyc.a(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11112 = entry.getKey();
                                            Object value11112 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11112);
                                            drp.b(qycVar, dov0Var, i28, value11112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11113 = entry.getKey();
                                            Object value11113 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11113);
                                            drp.b(qycVar, dov0Var, i28, value11113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11114 = entry.getKey();
                                            Object value11114 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11114);
                                            drp.b(qycVar, dov0Var, i28, value11114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11115 = entry.getKey();
                                            Object value11115 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11115);
                                            drp.b(qycVar, dov0Var, i28, value11115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = qyc.b((String) value);
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11116 = entry.getKey();
                                            Object value11116 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11116);
                                            drp.b(qycVar, dov0Var, i28, value11116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((kjt) ((y3) value)).g(null);
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11117 = entry.getKey();
                                            Object value11117 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11117);
                                            drp.b(qycVar, dov0Var, i28, value11117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 10:
                                            size2 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size2);
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11118 = entry.getKey();
                                            Object value11118 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11118);
                                            drp.b(qycVar, dov0Var, i28, value11118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = qyc.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11119 = entry.getKey();
                                            Object value11119 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11119);
                                            drp.b(qycVar, dov0Var, i28, value11119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 12:
                                            iE2 = qyc.d(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111110 = entry.getKey();
                                            Object value111110 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111110);
                                            drp.b(qycVar, dov0Var, i28, value111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE2 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE2 = qyc.a(((Integer) value).intValue());
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111 = entry.getKey();
                                            Object value111111 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111);
                                            drp.b(qycVar, dov0Var, i28, value111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111112 = entry.getKey();
                                            Object value111112 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111112);
                                            drp.b(qycVar, dov0Var, i28, value111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111113 = entry.getKey();
                                            Object value111113 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111113);
                                            drp.b(qycVar, dov0Var, i28, value111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 16:
                                            int iIntValue3 = ((Integer) value).intValue();
                                            iE2 = qyc.d((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111114 = entry.getKey();
                                            Object value111114 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111114);
                                            drp.b(qycVar, dov0Var, i28, value111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue3 = ((Long) value).longValue();
                                            iE2 = qyc.e((jLongValue3 << 1) ^ (jLongValue3 >> 63));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111115 = entry.getKey();
                                            Object value111115 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111115);
                                            drp.b(qycVar, dov0Var, i28, value111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 3:
                                    iE = qyc.e(((Long) key).longValue());
                                    i4 = iE + iC2;
                                    iC = qyc.c(i28);
                                    if (dov0Var == unv0Var) {
                                        iC *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111116 = entry.getKey();
                                            Object value111116 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111116);
                                            drp.b(qycVar, dov0Var, i28, value111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111117 = entry.getKey();
                                            Object value111117 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111117);
                                            drp.b(qycVar, dov0Var, i28, value111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111118 = entry.getKey();
                                            Object value111118 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111118);
                                            drp.b(qycVar, dov0Var, i28, value111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111119 = entry.getKey();
                                            Object value111119 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111119);
                                            drp.b(qycVar, dov0Var, i28, value111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = qyc.a(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111110 = entry.getKey();
                                            Object value1111110 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111110);
                                            drp.b(qycVar, dov0Var, i28, value1111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111 = entry.getKey();
                                            Object value1111111 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111);
                                            drp.b(qycVar, dov0Var, i28, value1111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111112 = entry.getKey();
                                            Object value1111112 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111112);
                                            drp.b(qycVar, dov0Var, i28, value1111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111113 = entry.getKey();
                                            Object value1111113 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111113);
                                            drp.b(qycVar, dov0Var, i28, value1111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = qyc.b((String) value);
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111114 = entry.getKey();
                                            Object value1111114 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111114);
                                            drp.b(qycVar, dov0Var, i28, value1111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((kjt) ((y3) value)).g(null);
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111115 = entry.getKey();
                                            Object value1111115 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111115);
                                            drp.b(qycVar, dov0Var, i28, value1111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 10:
                                            size2 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size2);
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111116 = entry.getKey();
                                            Object value1111116 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111116);
                                            drp.b(qycVar, dov0Var, i28, value1111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = qyc.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111117 = entry.getKey();
                                            Object value1111117 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111117);
                                            drp.b(qycVar, dov0Var, i28, value1111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 12:
                                            iE2 = qyc.d(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111118 = entry.getKey();
                                            Object value1111118 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111118);
                                            drp.b(qycVar, dov0Var, i28, value1111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE2 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE2 = qyc.a(((Integer) value).intValue());
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111119 = entry.getKey();
                                            Object value1111119 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111119);
                                            drp.b(qycVar, dov0Var, i28, value1111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111110 = entry.getKey();
                                            Object value11111110 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111110);
                                            drp.b(qycVar, dov0Var, i28, value11111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111 = entry.getKey();
                                            Object value11111111 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111);
                                            drp.b(qycVar, dov0Var, i28, value11111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 16:
                                            int iIntValue4 = ((Integer) value).intValue();
                                            iE2 = qyc.d((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111112 = entry.getKey();
                                            Object value11111112 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111112);
                                            drp.b(qycVar, dov0Var, i28, value11111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue4 = ((Long) value).longValue();
                                            iE2 = qyc.e((jLongValue4 << 1) ^ (jLongValue4 >> 63));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111113 = entry.getKey();
                                            Object value11111113 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111113);
                                            drp.b(qycVar, dov0Var, i28, value11111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 4:
                                    iE = qyc.a(((Integer) key).intValue());
                                    i4 = iE + iC2;
                                    iC = qyc.c(i28);
                                    if (dov0Var == unv0Var) {
                                        iC *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111114 = entry.getKey();
                                            Object value11111114 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111114);
                                            drp.b(qycVar, dov0Var, i28, value11111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111115 = entry.getKey();
                                            Object value11111115 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111115);
                                            drp.b(qycVar, dov0Var, i28, value11111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111116 = entry.getKey();
                                            Object value11111116 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111116);
                                            drp.b(qycVar, dov0Var, i28, value11111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111117 = entry.getKey();
                                            Object value11111117 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111117);
                                            drp.b(qycVar, dov0Var, i28, value11111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = qyc.a(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111118 = entry.getKey();
                                            Object value11111118 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111118);
                                            drp.b(qycVar, dov0Var, i28, value11111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111119 = entry.getKey();
                                            Object value11111119 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111119);
                                            drp.b(qycVar, dov0Var, i28, value11111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111110 = entry.getKey();
                                            Object value111111110 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111110);
                                            drp.b(qycVar, dov0Var, i28, value111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111 = entry.getKey();
                                            Object value111111111 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111);
                                            drp.b(qycVar, dov0Var, i28, value111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = qyc.b((String) value);
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111112 = entry.getKey();
                                            Object value111111112 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111112);
                                            drp.b(qycVar, dov0Var, i28, value111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((kjt) ((y3) value)).g(null);
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111113 = entry.getKey();
                                            Object value111111113 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111113);
                                            drp.b(qycVar, dov0Var, i28, value111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 10:
                                            size2 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size2);
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111114 = entry.getKey();
                                            Object value111111114 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111114);
                                            drp.b(qycVar, dov0Var, i28, value111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = qyc.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111115 = entry.getKey();
                                            Object value111111115 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111115);
                                            drp.b(qycVar, dov0Var, i28, value111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 12:
                                            iE2 = qyc.d(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111116 = entry.getKey();
                                            Object value111111116 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111116);
                                            drp.b(qycVar, dov0Var, i28, value111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE2 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE2 = qyc.a(((Integer) value).intValue());
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111117 = entry.getKey();
                                            Object value111111117 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111117);
                                            drp.b(qycVar, dov0Var, i28, value111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111118 = entry.getKey();
                                            Object value111111118 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111118);
                                            drp.b(qycVar, dov0Var, i28, value111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111119 = entry.getKey();
                                            Object value111111119 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111119);
                                            drp.b(qycVar, dov0Var, i28, value111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 16:
                                            int iIntValue5 = ((Integer) value).intValue();
                                            iE2 = qyc.d((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111110 = entry.getKey();
                                            Object value1111111110 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111110);
                                            drp.b(qycVar, dov0Var, i28, value1111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue5 = ((Long) value).longValue();
                                            iE2 = qyc.e((jLongValue5 << 1) ^ (jLongValue5 >> 63));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111 = entry.getKey();
                                            Object value1111111111 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111);
                                            drp.b(qycVar, dov0Var, i28, value1111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 5:
                                    ((Long) key).getClass();
                                    iE = 8;
                                    i4 = iE + iC2;
                                    iC = qyc.c(i28);
                                    if (dov0Var == unv0Var) {
                                        iC *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111112 = entry.getKey();
                                            Object value1111111112 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111112);
                                            drp.b(qycVar, dov0Var, i28, value1111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111113 = entry.getKey();
                                            Object value1111111113 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111113);
                                            drp.b(qycVar, dov0Var, i28, value1111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111114 = entry.getKey();
                                            Object value1111111114 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111114);
                                            drp.b(qycVar, dov0Var, i28, value1111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111115 = entry.getKey();
                                            Object value1111111115 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111115);
                                            drp.b(qycVar, dov0Var, i28, value1111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = qyc.a(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111116 = entry.getKey();
                                            Object value1111111116 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111116);
                                            drp.b(qycVar, dov0Var, i28, value1111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111117 = entry.getKey();
                                            Object value1111111117 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111117);
                                            drp.b(qycVar, dov0Var, i28, value1111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111118 = entry.getKey();
                                            Object value1111111118 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111118);
                                            drp.b(qycVar, dov0Var, i28, value1111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111119 = entry.getKey();
                                            Object value1111111119 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111119);
                                            drp.b(qycVar, dov0Var, i28, value1111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = qyc.b((String) value);
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111110 = entry.getKey();
                                            Object value11111111110 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111110);
                                            drp.b(qycVar, dov0Var, i28, value11111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((kjt) ((y3) value)).g(null);
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111 = entry.getKey();
                                            Object value11111111111 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111);
                                            drp.b(qycVar, dov0Var, i28, value11111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 10:
                                            size2 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size2);
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111112 = entry.getKey();
                                            Object value11111111112 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111112);
                                            drp.b(qycVar, dov0Var, i28, value11111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = qyc.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111113 = entry.getKey();
                                            Object value11111111113 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111113);
                                            drp.b(qycVar, dov0Var, i28, value11111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 12:
                                            iE2 = qyc.d(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111114 = entry.getKey();
                                            Object value11111111114 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111114);
                                            drp.b(qycVar, dov0Var, i28, value11111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE2 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE2 = qyc.a(((Integer) value).intValue());
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111115 = entry.getKey();
                                            Object value11111111115 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111115);
                                            drp.b(qycVar, dov0Var, i28, value11111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111116 = entry.getKey();
                                            Object value11111111116 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111116);
                                            drp.b(qycVar, dov0Var, i28, value11111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111117 = entry.getKey();
                                            Object value11111111117 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111117);
                                            drp.b(qycVar, dov0Var, i28, value11111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 16:
                                            int iIntValue6 = ((Integer) value).intValue();
                                            iE2 = qyc.d((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111118 = entry.getKey();
                                            Object value11111111118 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111118);
                                            drp.b(qycVar, dov0Var, i28, value11111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue6 = ((Long) value).longValue();
                                            iE2 = qyc.e((jLongValue6 << 1) ^ (jLongValue6 >> 63));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111119 = entry.getKey();
                                            Object value11111111119 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111119);
                                            drp.b(qycVar, dov0Var, i28, value11111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 6:
                                    ((Integer) key).getClass();
                                    iE = 4;
                                    i4 = iE + iC2;
                                    iC = qyc.c(i28);
                                    if (dov0Var == unv0Var) {
                                        iC *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111110 = entry.getKey();
                                            Object value111111111110 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111110);
                                            drp.b(qycVar, dov0Var, i28, value111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111 = entry.getKey();
                                            Object value111111111111 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111);
                                            drp.b(qycVar, dov0Var, i28, value111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111112 = entry.getKey();
                                            Object value111111111112 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111112);
                                            drp.b(qycVar, dov0Var, i28, value111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111113 = entry.getKey();
                                            Object value111111111113 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111113);
                                            drp.b(qycVar, dov0Var, i28, value111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = qyc.a(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111114 = entry.getKey();
                                            Object value111111111114 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111114);
                                            drp.b(qycVar, dov0Var, i28, value111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111115 = entry.getKey();
                                            Object value111111111115 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111115);
                                            drp.b(qycVar, dov0Var, i28, value111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111116 = entry.getKey();
                                            Object value111111111116 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111116);
                                            drp.b(qycVar, dov0Var, i28, value111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111117 = entry.getKey();
                                            Object value111111111117 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111117);
                                            drp.b(qycVar, dov0Var, i28, value111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = qyc.b((String) value);
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111118 = entry.getKey();
                                            Object value111111111118 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111118);
                                            drp.b(qycVar, dov0Var, i28, value111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((kjt) ((y3) value)).g(null);
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111119 = entry.getKey();
                                            Object value111111111119 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111119);
                                            drp.b(qycVar, dov0Var, i28, value111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 10:
                                            size2 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size2);
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111110 = entry.getKey();
                                            Object value1111111111110 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111110);
                                            drp.b(qycVar, dov0Var, i28, value1111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = qyc.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111 = entry.getKey();
                                            Object value1111111111111 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 12:
                                            iE2 = qyc.d(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111112 = entry.getKey();
                                            Object value1111111111112 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111112);
                                            drp.b(qycVar, dov0Var, i28, value1111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE2 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE2 = qyc.a(((Integer) value).intValue());
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111113 = entry.getKey();
                                            Object value1111111111113 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111113);
                                            drp.b(qycVar, dov0Var, i28, value1111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111114 = entry.getKey();
                                            Object value1111111111114 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111114);
                                            drp.b(qycVar, dov0Var, i28, value1111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111115 = entry.getKey();
                                            Object value1111111111115 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111115);
                                            drp.b(qycVar, dov0Var, i28, value1111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 16:
                                            int iIntValue7 = ((Integer) value).intValue();
                                            iE2 = qyc.d((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111116 = entry.getKey();
                                            Object value1111111111116 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111116);
                                            drp.b(qycVar, dov0Var, i28, value1111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue7 = ((Long) value).longValue();
                                            iE2 = qyc.e((jLongValue7 << 1) ^ (jLongValue7 >> 63));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111117 = entry.getKey();
                                            Object value1111111111117 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111117);
                                            drp.b(qycVar, dov0Var, i28, value1111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 7:
                                    ((Boolean) key).getClass();
                                    iE = 1;
                                    i4 = iE + iC2;
                                    iC = qyc.c(i28);
                                    if (dov0Var == unv0Var) {
                                        iC *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111118 = entry.getKey();
                                            Object value1111111111118 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111118);
                                            drp.b(qycVar, dov0Var, i28, value1111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111119 = entry.getKey();
                                            Object value1111111111119 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111119);
                                            drp.b(qycVar, dov0Var, i28, value1111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111110 = entry.getKey();
                                            Object value11111111111110 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111110);
                                            drp.b(qycVar, dov0Var, i28, value11111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111 = entry.getKey();
                                            Object value11111111111111 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = qyc.a(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111112 = entry.getKey();
                                            Object value11111111111112 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111112);
                                            drp.b(qycVar, dov0Var, i28, value11111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111113 = entry.getKey();
                                            Object value11111111111113 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111113);
                                            drp.b(qycVar, dov0Var, i28, value11111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111114 = entry.getKey();
                                            Object value11111111111114 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111114);
                                            drp.b(qycVar, dov0Var, i28, value11111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111115 = entry.getKey();
                                            Object value11111111111115 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111115);
                                            drp.b(qycVar, dov0Var, i28, value11111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = qyc.b((String) value);
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111116 = entry.getKey();
                                            Object value11111111111116 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111116);
                                            drp.b(qycVar, dov0Var, i28, value11111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((kjt) ((y3) value)).g(null);
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111117 = entry.getKey();
                                            Object value11111111111117 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111117);
                                            drp.b(qycVar, dov0Var, i28, value11111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 10:
                                            size2 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size2);
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111118 = entry.getKey();
                                            Object value11111111111118 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111118);
                                            drp.b(qycVar, dov0Var, i28, value11111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = qyc.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111119 = entry.getKey();
                                            Object value11111111111119 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111119);
                                            drp.b(qycVar, dov0Var, i28, value11111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 12:
                                            iE2 = qyc.d(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111110 = entry.getKey();
                                            Object value111111111111110 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111110);
                                            drp.b(qycVar, dov0Var, i28, value111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE2 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE2 = qyc.a(((Integer) value).intValue());
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111 = entry.getKey();
                                            Object value111111111111111 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111112 = entry.getKey();
                                            Object value111111111111112 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111112);
                                            drp.b(qycVar, dov0Var, i28, value111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111113 = entry.getKey();
                                            Object value111111111111113 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111113);
                                            drp.b(qycVar, dov0Var, i28, value111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 16:
                                            int iIntValue8 = ((Integer) value).intValue();
                                            iE2 = qyc.d((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111114 = entry.getKey();
                                            Object value111111111111114 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111114);
                                            drp.b(qycVar, dov0Var, i28, value111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue8 = ((Long) value).longValue();
                                            iE2 = qyc.e((jLongValue8 << 1) ^ (jLongValue8 >> 63));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111115 = entry.getKey();
                                            Object value111111111111115 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111115);
                                            drp.b(qycVar, dov0Var, i28, value111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 8:
                                    if (key instanceof lg9) {
                                        size = ((lg9) key).size();
                                        iD = qyc.d(size);
                                        iE = size + iD;
                                    } else {
                                        iE = qyc.b((String) key);
                                    }
                                    i4 = iE + iC2;
                                    iC = qyc.c(i28);
                                    if (dov0Var == unv0Var) {
                                        iC *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111116 = entry.getKey();
                                            Object value111111111111116 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111116);
                                            drp.b(qycVar, dov0Var, i28, value111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111117 = entry.getKey();
                                            Object value111111111111117 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111117);
                                            drp.b(qycVar, dov0Var, i28, value111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111118 = entry.getKey();
                                            Object value111111111111118 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111118);
                                            drp.b(qycVar, dov0Var, i28, value111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111119 = entry.getKey();
                                            Object value111111111111119 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111119);
                                            drp.b(qycVar, dov0Var, i28, value111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = qyc.a(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111110 = entry.getKey();
                                            Object value1111111111111110 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111110);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111 = entry.getKey();
                                            Object value1111111111111111 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111112 = entry.getKey();
                                            Object value1111111111111112 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111112);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111113 = entry.getKey();
                                            Object value1111111111111113 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111113);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = qyc.b((String) value);
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111114 = entry.getKey();
                                            Object value1111111111111114 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111114);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((kjt) ((y3) value)).g(null);
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111115 = entry.getKey();
                                            Object value1111111111111115 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111115);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 10:
                                            size2 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size2);
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111116 = entry.getKey();
                                            Object value1111111111111116 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111116);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = qyc.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111117 = entry.getKey();
                                            Object value1111111111111117 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111117);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 12:
                                            iE2 = qyc.d(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111118 = entry.getKey();
                                            Object value1111111111111118 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111118);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE2 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE2 = qyc.a(((Integer) value).intValue());
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111119 = entry.getKey();
                                            Object value1111111111111119 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111119);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111110 = entry.getKey();
                                            Object value11111111111111110 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111110);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111 = entry.getKey();
                                            Object value11111111111111111 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 16:
                                            int iIntValue9 = ((Integer) value).intValue();
                                            iE2 = qyc.d((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111112 = entry.getKey();
                                            Object value11111111111111112 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111112);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue9 = ((Long) value).longValue();
                                            iE2 = qyc.e((jLongValue9 << 1) ^ (jLongValue9 >> 63));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111113 = entry.getKey();
                                            Object value11111111111111113 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111113);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 9:
                                    iG = ((kjt) ((y3) key)).g(null);
                                    iE = iG;
                                    i4 = iE + iC2;
                                    iC = qyc.c(i28);
                                    if (dov0Var == unv0Var) {
                                        iC *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111114 = entry.getKey();
                                            Object value11111111111111114 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111114);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111115 = entry.getKey();
                                            Object value11111111111111115 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111115);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111116 = entry.getKey();
                                            Object value11111111111111116 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111116);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111117 = entry.getKey();
                                            Object value11111111111111117 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111117);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = qyc.a(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111118 = entry.getKey();
                                            Object value11111111111111118 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111118);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111119 = entry.getKey();
                                            Object value11111111111111119 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111119);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111110 = entry.getKey();
                                            Object value111111111111111110 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111110);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111 = entry.getKey();
                                            Object value111111111111111111 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = qyc.b((String) value);
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111112 = entry.getKey();
                                            Object value111111111111111112 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111112);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((kjt) ((y3) value)).g(null);
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111113 = entry.getKey();
                                            Object value111111111111111113 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111113);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 10:
                                            size2 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size2);
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111114 = entry.getKey();
                                            Object value111111111111111114 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111114);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = qyc.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111115 = entry.getKey();
                                            Object value111111111111111115 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111115);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 12:
                                            iE2 = qyc.d(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111116 = entry.getKey();
                                            Object value111111111111111116 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111116);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE2 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE2 = qyc.a(((Integer) value).intValue());
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111117 = entry.getKey();
                                            Object value111111111111111117 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111117);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111118 = entry.getKey();
                                            Object value111111111111111118 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111118);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111119 = entry.getKey();
                                            Object value111111111111111119 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111119);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 16:
                                            int iIntValue10 = ((Integer) value).intValue();
                                            iE2 = qyc.d((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111110 = entry.getKey();
                                            Object value1111111111111111110 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111110);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue10 = ((Long) value).longValue();
                                            iE2 = qyc.e((jLongValue10 << 1) ^ (jLongValue10 >> 63));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111 = entry.getKey();
                                            Object value1111111111111111111 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 10:
                                    int iG2 = ((kjt) ((y3) key)).g(null);
                                    iG = qyc.d(iG2) + iG2;
                                    iE = iG;
                                    i4 = iE + iC2;
                                    iC = qyc.c(i28);
                                    if (dov0Var == unv0Var) {
                                        iC *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111112 = entry.getKey();
                                            Object value1111111111111111112 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111112);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111113 = entry.getKey();
                                            Object value1111111111111111113 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111113);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111114 = entry.getKey();
                                            Object value1111111111111111114 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111114);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111115 = entry.getKey();
                                            Object value1111111111111111115 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111115);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = qyc.a(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111116 = entry.getKey();
                                            Object value1111111111111111116 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111116);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111117 = entry.getKey();
                                            Object value1111111111111111117 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111117);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111118 = entry.getKey();
                                            Object value1111111111111111118 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111118);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111119 = entry.getKey();
                                            Object value1111111111111111119 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111119);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = qyc.b((String) value);
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111110 = entry.getKey();
                                            Object value11111111111111111110 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111110);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((kjt) ((y3) value)).g(null);
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111 = entry.getKey();
                                            Object value11111111111111111111 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 10:
                                            size2 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size2);
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111112 = entry.getKey();
                                            Object value11111111111111111112 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111112);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = qyc.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111113 = entry.getKey();
                                            Object value11111111111111111113 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111113);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 12:
                                            iE2 = qyc.d(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111114 = entry.getKey();
                                            Object value11111111111111111114 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111114);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE2 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE2 = qyc.a(((Integer) value).intValue());
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111115 = entry.getKey();
                                            Object value11111111111111111115 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111115);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111116 = entry.getKey();
                                            Object value11111111111111111116 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111116);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111117 = entry.getKey();
                                            Object value11111111111111111117 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111117);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 16:
                                            int iIntValue11 = ((Integer) value).intValue();
                                            iE2 = qyc.d((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111118 = entry.getKey();
                                            Object value11111111111111111118 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111118);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue11 = ((Long) value).longValue();
                                            iE2 = qyc.e((jLongValue11 << 1) ^ (jLongValue11 >> 63));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111119 = entry.getKey();
                                            Object value11111111111111111119 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111119);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 11:
                                    if (key instanceof lg9) {
                                        size = ((lg9) key).size();
                                        iD = qyc.d(size);
                                    } else {
                                        size = ((byte[]) key).length;
                                        iD = qyc.d(size);
                                    }
                                    iE = size + iD;
                                    i4 = iE + iC2;
                                    iC = qyc.c(i28);
                                    if (dov0Var == unv0Var) {
                                        iC *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111110 = entry.getKey();
                                            Object value111111111111111111110 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111110);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111112 = entry.getKey();
                                            Object value111111111111111111112 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111112);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111113 = entry.getKey();
                                            Object value111111111111111111113 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111113);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = qyc.a(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111114 = entry.getKey();
                                            Object value111111111111111111114 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111114);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111115 = entry.getKey();
                                            Object value111111111111111111115 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111115);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111116 = entry.getKey();
                                            Object value111111111111111111116 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111116);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111117 = entry.getKey();
                                            Object value111111111111111111117 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111117);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = qyc.b((String) value);
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111118 = entry.getKey();
                                            Object value111111111111111111118 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111118);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((kjt) ((y3) value)).g(null);
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111119 = entry.getKey();
                                            Object value111111111111111111119 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111119);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 10:
                                            size2 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size2);
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111110 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111110);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = qyc.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111111);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 12:
                                            iE2 = qyc.d(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111112 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111112);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE2 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE2 = qyc.a(((Integer) value).intValue());
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111113 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111113);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111114 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111114);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111115 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111115);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 16:
                                            int iIntValue12 = ((Integer) value).intValue();
                                            iE2 = qyc.d((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111116 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111116);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue12 = ((Long) value).longValue();
                                            iE2 = qyc.e((jLongValue12 << 1) ^ (jLongValue12 >> 63));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111117 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111117);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 12:
                                    iE = qyc.d(((Integer) key).intValue());
                                    i4 = iE + iC2;
                                    iC = qyc.c(i28);
                                    if (dov0Var == unv0Var) {
                                        iC *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111118 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111118);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111119 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111119);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111110 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111110);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111111);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = qyc.a(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111112 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111112);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111113 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111113);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111114 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111114);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111115 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111115);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = qyc.b((String) value);
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111116 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111116);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((kjt) ((y3) value)).g(null);
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111117 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111117);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 10:
                                            size2 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size2);
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111118 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111118);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = qyc.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111119 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111119);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 12:
                                            iE2 = qyc.d(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111110 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111110);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE2 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE2 = qyc.a(((Integer) value).intValue());
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111111);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111112 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111112);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111113 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111113);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 16:
                                            int iIntValue13 = ((Integer) value).intValue();
                                            iE2 = qyc.d((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111114 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111114);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue13 = ((Long) value).longValue();
                                            iE2 = qyc.e((jLongValue13 << 1) ^ (jLongValue13 >> 63));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111115 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111115);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 13:
                                    iE = key instanceof ts3 ? qyc.a(((ts3) key).f34442a) : qyc.a(((Integer) key).intValue());
                                    i4 = iE + iC2;
                                    iC = qyc.c(i28);
                                    if (dov0Var == unv0Var) {
                                        iC *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111116 = entry.getKey();
                                            Object value111111111111111111111116 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111116);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111117 = entry.getKey();
                                            Object value111111111111111111111117 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111117);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111118 = entry.getKey();
                                            Object value111111111111111111111118 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111118);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111119 = entry.getKey();
                                            Object value111111111111111111111119 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111119);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = qyc.a(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111111110 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111111110);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111111 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111111111);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111111112 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111111112);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111111113 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111111113);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = qyc.b((String) value);
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111111114 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111111114);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((kjt) ((y3) value)).g(null);
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111111115 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111111115);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 10:
                                            size2 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size2);
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111111116 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111111116);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = qyc.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111111117 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111111117);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 12:
                                            iE2 = qyc.d(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111111118 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111111118);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE2 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE2 = qyc.a(((Integer) value).intValue());
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111111119 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111111119);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111111110 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111111110);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111111 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111111111);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 16:
                                            int iIntValue14 = ((Integer) value).intValue();
                                            iE2 = qyc.d((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111111112 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111111112);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue14 = ((Long) value).longValue();
                                            iE2 = qyc.e((jLongValue14 << 1) ^ (jLongValue14 >> 63));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111111113 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111111113);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 14:
                                    ((Integer) key).getClass();
                                    iE = 4;
                                    i4 = iE + iC2;
                                    iC = qyc.c(i28);
                                    if (dov0Var == unv0Var) {
                                        iC *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111111114 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111111114);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111111115 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111111115);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111111116 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111111116);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111111117 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111111117);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = qyc.a(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111111118 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111111118);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111111119 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111111119);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111111110 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111111110);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111111 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111111111);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = qyc.b((String) value);
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111111112 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111111112);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((kjt) ((y3) value)).g(null);
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111111113 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111111113);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 10:
                                            size2 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size2);
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111111114 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111111114);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = qyc.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111111115 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111111115);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 12:
                                            iE2 = qyc.d(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111111116 = entry.getKey();
                                            Object value111111111111111111111111116 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111111116);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE2 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE2 = qyc.a(((Integer) value).intValue());
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111111117 = entry.getKey();
                                            Object value111111111111111111111111117 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111111117);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111111118 = entry.getKey();
                                            Object value111111111111111111111111118 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111111118);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111111119 = entry.getKey();
                                            Object value111111111111111111111111119 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111111119);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 16:
                                            int iIntValue15 = ((Integer) value).intValue();
                                            iE2 = qyc.d((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111111111110 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111111111110);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue15 = ((Long) value).longValue();
                                            iE2 = qyc.e((jLongValue15 << 1) ^ (jLongValue15 >> 63));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111111111 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111111111111);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 15:
                                    ((Long) key).getClass();
                                    iE = 8;
                                    i4 = iE + iC2;
                                    iC = qyc.c(i28);
                                    if (dov0Var == unv0Var) {
                                        iC *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111111111112 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111111111112);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111111111113 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111111111113);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111111111114 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111111111114);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111111111115 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111111111115);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = qyc.a(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111111111116 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111111111116);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111111111117 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111111111117);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111111111118 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111111111118);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111111111119 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111111111119);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = qyc.b((String) value);
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111111111110 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111111111110);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((kjt) ((y3) value)).g(null);
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111111111 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111111111111);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 10:
                                            size2 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size2);
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111111111112 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111111111112);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = qyc.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111111111113 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111111111113);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 12:
                                            iE2 = qyc.d(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111111111114 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111111111114);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE2 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE2 = qyc.a(((Integer) value).intValue());
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111111111115 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111111111115);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111111111116 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111111111116);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111111111117 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111111111117);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 16:
                                            int iIntValue16 = ((Integer) value).intValue();
                                            iE2 = qyc.d((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111111111118 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111111111118);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue16 = ((Long) value).longValue();
                                            iE2 = qyc.e((jLongValue16 << 1) ^ (jLongValue16 >> 63));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111111111119 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111111111119);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 16:
                                    int iIntValue17 = ((Integer) key).intValue();
                                    iG = qyc.d((iIntValue17 << 1) ^ (iIntValue17 >> 31));
                                    iE = iG;
                                    i4 = iE + iC2;
                                    iC = qyc.c(i28);
                                    if (dov0Var == unv0Var) {
                                        iC *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111111111110 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111111111110);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111111111 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111111111111);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111111111112 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111111111112);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111111111113 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111111111113);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = qyc.a(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111111111114 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111111111114);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111111111115 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111111111115);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111111111116 = entry.getKey();
                                            Object value111111111111111111111111111116 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111111111116);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111111111117 = entry.getKey();
                                            Object value111111111111111111111111111117 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111111111117);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = qyc.b((String) value);
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111111111118 = entry.getKey();
                                            Object value111111111111111111111111111118 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111111111118);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((kjt) ((y3) value)).g(null);
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111111111119 = entry.getKey();
                                            Object value111111111111111111111111111119 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111111111119);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 10:
                                            size2 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size2);
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111111111111110 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111111111111110);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = qyc.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111111111111 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111111111111111);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 12:
                                            iE2 = qyc.d(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111111111111112 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111111111111112);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE2 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE2 = qyc.a(((Integer) value).intValue());
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111111111111113 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111111111111113);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111111111111114 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111111111111114);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111111111111115 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111111111111115);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 16:
                                            int iIntValue18 = ((Integer) value).intValue();
                                            iE2 = qyc.d((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111111111111116 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111111111111116);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue17 = ((Long) value).longValue();
                                            iE2 = qyc.e((jLongValue17 << 1) ^ (jLongValue17 >> 63));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111111111111117 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111111111111117);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 17:
                                    long jLongValue18 = ((Long) key).longValue();
                                    iG = qyc.e((jLongValue18 << 1) ^ (jLongValue18 >> 63));
                                    iE = iG;
                                    i4 = iE + iC2;
                                    iC = qyc.c(i28);
                                    if (dov0Var == unv0Var) {
                                        iC *= 2;
                                    }
                                    switch (dov0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111111111111118 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111111111111118);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111111111111119 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key1111111111111111111111111111119);
                                            drp.b(qycVar, dov0Var, i28, value1111111111111111111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111111111111110 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111111111111110);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = qyc.e(((Long) value).longValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111111111111 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111111111111111);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = qyc.a(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111111111111112 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111111111111112);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111111111111113 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111111111111113);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111111111111114 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111111111111114);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111111111111115 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111111111111115);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = qyc.b((String) value);
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111111111111116 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111111111111116);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((kjt) ((y3) value)).g(null);
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111111111111117 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111111111111117);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 10:
                                            size2 = ((kjt) ((y3) value)).g(null);
                                            iD2 = qyc.d(size2);
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111111111111118 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111111111111118);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof lg9) {
                                                size2 = ((lg9) value).size();
                                                iD2 = qyc.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = qyc.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111111111111119 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key11111111111111111111111111111119);
                                            drp.b(qycVar, dov0Var, i28, value11111111111111111111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 12:
                                            iE2 = qyc.d(((Integer) value).intValue());
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111111111111110 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111111111111110);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 13:
                                            if (value instanceof ts3) {
                                                iE2 = qyc.a(((ts3) value).f34442a);
                                            } else {
                                                iE2 = qyc.a(((Integer) value).intValue());
                                            }
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111111111111 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111111111111111);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111111111111112 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111111111111112);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111111111111113 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111111111111113);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 16:
                                            int iIntValue19 = ((Integer) value).intValue();
                                            iE2 = qyc.d((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111111111111114 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111111111111114);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue19 = ((Long) value).longValue();
                                            iE2 = qyc.e((jLongValue19 << 1) ^ (jLongValue19 >> 63));
                                            qycVar.n(iE2 + iC + i4);
                                            Object key111111111111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111111111111115 = entry.getValue();
                                            drp.b(qycVar, dov0Var2, 1, key111111111111111111111111111111115);
                                            drp.b(qycVar, dov0Var, i28, value111111111111111111111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                default:
                                    itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                                    break;
                            }
                        }
                    }
                    i2 = i6;
                    i3 = i8;
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 51:
                    if (p640Var.n(i9, i7, obj)) {
                        long jDoubleToRawLongBits2 = Double.doubleToRawLongBits(((Double) ift0.j(obj, j2)).doubleValue());
                        qycVar.m(i9, 1);
                        qycVar.j(jDoubleToRawLongBits2);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 52:
                    if (p640Var.n(i9, i7, obj)) {
                        int iFloatToRawIntBits2 = Float.floatToRawIntBits(((Float) ift0.j(obj, j2)).floatValue());
                        qycVar.m(i9, 5);
                        qycVar.i(iFloatToRawIntBits2);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 53:
                    if (p640Var.n(i9, i7, obj)) {
                        long jS = s(obj, j2);
                        qycVar.m(i9, 0);
                        qycVar.o(jS);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 54:
                    if (p640Var.n(i9, i7, obj)) {
                        long jS2 = s(obj, j2);
                        qycVar.m(i9, 0);
                        qycVar.o(jS2);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 55:
                    if (p640Var.n(i9, i7, obj)) {
                        int iR = r(obj, j2);
                        qycVar.m(i9, 0);
                        qycVar.k(iR);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 56:
                    if (p640Var.n(i9, i7, obj)) {
                        long jS3 = s(obj, j2);
                        qycVar.m(i9, 1);
                        qycVar.j(jS3);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 57:
                    if (p640Var.n(i9, i7, obj)) {
                        int iR2 = r(obj, j2);
                        qycVar.m(i9, 5);
                        qycVar.i(iR2);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 58:
                    if (p640Var.n(i9, i7, obj)) {
                        boolean zBooleanValue = ((Boolean) ift0.j(obj, j2)).booleanValue();
                        qycVar.m(i9, 0);
                        qycVar.f(zBooleanValue ? (byte) 1 : (byte) 0);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 59:
                    if (p640Var.n(i9, i7, obj)) {
                        Object object3 = unsafe.getObject(obj, j2);
                        if (object3 instanceof String) {
                            qycVar.m(i9, 2);
                            qycVar.l((String) object3);
                        } else {
                            qycVar.m(i9, 2);
                            qycVar.h((lg9) object3);
                        }
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 60:
                    if (p640Var.n(i9, i7, obj)) {
                        prcVar.r(i9, unsafe.getObject(obj, j2), p640Var.j(i7));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 61:
                    if (p640Var.n(i9, i7, obj)) {
                        lg9 lg9Var3 = (lg9) unsafe.getObject(obj, j2);
                        qycVar.m(i9, 2);
                        qycVar.h(lg9Var3);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 62:
                    if (p640Var.n(i9, i7, obj)) {
                        int iR3 = r(obj, j2);
                        qycVar.m(i9, 0);
                        qycVar.n(iR3);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 63:
                    if (p640Var.n(i9, i7, obj)) {
                        int iR4 = r(obj, j2);
                        qycVar.m(i9, 0);
                        qycVar.k(iR4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 64:
                    if (p640Var.n(i9, i7, obj)) {
                        int iR5 = r(obj, j2);
                        qycVar.m(i9, 5);
                        qycVar.i(iR5);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 65:
                    if (p640Var.n(i9, i7, obj)) {
                        long jS4 = s(obj, j2);
                        qycVar.m(i9, 1);
                        qycVar.j(jS4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 66:
                    z = false;
                    if (p640Var.n(i9, i7, obj)) {
                        int iR6 = r(obj, j2);
                        qycVar.m(i9, 0);
                        qycVar.n((iR6 >> 31) ^ (iR6 << 1));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 67:
                    if (p640Var.n(i9, i7, obj)) {
                        long jS5 = s(obj, j2);
                        z = false;
                        qycVar.m(i9, 0);
                        qycVar.o((jS5 >> 63) ^ (jS5 << 1));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 68:
                    if (p640Var.n(i9, i7, obj)) {
                        prcVar.q(i9, unsafe.getObject(obj, j2), p640Var.j(i7));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                default:
                    i7 += 3;
                    i5 = 1048575;
                    break;
            }
            return;
        }
        p640Var.h.getClass();
        ((kjt) obj).unknownFields.b(prcVar);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d7 A[PHI: r3
  0x00d7: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x01f0, B:41:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // a.p2h0
    public final int h(kjt kjtVar) {
        int i;
        int iA;
        int i2;
        int[] iArr = this.f26437a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iW = w(i4);
            int i5 = iArr[i4];
            long j2 = 1048575 & iW;
            int i6 = 1237;
            int iHashCode = 37;
            switch (v(iW)) {
                case 0:
                    i = i3 * 53;
                    iA = dmx.a(Double.doubleToLongBits(ift0.c.c(kjtVar, j2)));
                    i3 = iA + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iA = Float.floatToIntBits(ift0.c.d(kjtVar, j2));
                    i3 = iA + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iA = dmx.a(ift0.i(kjtVar, j2));
                    i3 = iA + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iA = dmx.a(ift0.i(kjtVar, j2));
                    i3 = iA + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iA = ift0.h(kjtVar, j2);
                    i3 = iA + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iA = dmx.a(ift0.i(kjtVar, j2));
                    i3 = iA + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iA = ift0.h(kjtVar, j2);
                    i3 = iA + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zA = ift0.c.a(kjtVar, j2);
                    Charset charset = dmx.f6339a;
                    if (zA) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iA = ((String) ift0.j(kjtVar, j2)).hashCode();
                    i3 = iA + i;
                    break;
                case 9:
                    Object objJ = ift0.j(kjtVar, j2);
                    if (objJ != null) {
                        iHashCode = objJ.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iA = ift0.j(kjtVar, j2).hashCode();
                    i3 = iA + i;
                    break;
                case 11:
                    i = i3 * 53;
                    iA = ift0.h(kjtVar, j2);
                    i3 = iA + i;
                    break;
                case 12:
                    i = i3 * 53;
                    iA = ift0.h(kjtVar, j2);
                    i3 = iA + i;
                    break;
                case 13:
                    i = i3 * 53;
                    iA = ift0.h(kjtVar, j2);
                    i3 = iA + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iA = dmx.a(ift0.i(kjtVar, j2));
                    i3 = iA + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iA = ift0.h(kjtVar, j2);
                    i3 = iA + i;
                    break;
                case 16:
                    i = i3 * 53;
                    iA = dmx.a(ift0.i(kjtVar, j2));
                    i3 = iA + i;
                    break;
                case 17:
                    Object objJ2 = ift0.j(kjtVar, j2);
                    if (objJ2 != null) {
                        iHashCode = objJ2.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 18:
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i3 * 53;
                    iA = ift0.j(kjtVar, j2).hashCode();
                    i3 = iA + i;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    i = i3 * 53;
                    iA = ift0.j(kjtVar, j2).hashCode();
                    i3 = iA + i;
                    break;
                case 51:
                    if (n(i5, i4, kjtVar)) {
                        i = i3 * 53;
                        iA = dmx.a(Double.doubleToLongBits(((Double) ift0.j(kjtVar, j2)).doubleValue()));
                        i3 = iA + i;
                    }
                    break;
                case 52:
                    if (n(i5, i4, kjtVar)) {
                        i = i3 * 53;
                        iA = Float.floatToIntBits(((Float) ift0.j(kjtVar, j2)).floatValue());
                        i3 = iA + i;
                    }
                    break;
                case 53:
                    if (n(i5, i4, kjtVar)) {
                        i = i3 * 53;
                        iA = dmx.a(s(kjtVar, j2));
                        i3 = iA + i;
                    }
                    break;
                case 54:
                    if (n(i5, i4, kjtVar)) {
                        i = i3 * 53;
                        iA = dmx.a(s(kjtVar, j2));
                        i3 = iA + i;
                    }
                    break;
                case 55:
                    if (n(i5, i4, kjtVar)) {
                        i = i3 * 53;
                        iA = r(kjtVar, j2);
                        i3 = iA + i;
                    }
                    break;
                case 56:
                    if (n(i5, i4, kjtVar)) {
                        i = i3 * 53;
                        iA = dmx.a(s(kjtVar, j2));
                        i3 = iA + i;
                    }
                    break;
                case 57:
                    if (n(i5, i4, kjtVar)) {
                        i = i3 * 53;
                        iA = r(kjtVar, j2);
                        i3 = iA + i;
                    }
                    break;
                case 58:
                    if (n(i5, i4, kjtVar)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) ift0.j(kjtVar, j2)).booleanValue();
                        Charset charset2 = dmx.f6339a;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (n(i5, i4, kjtVar)) {
                        i = i3 * 53;
                        iA = ((String) ift0.j(kjtVar, j2)).hashCode();
                        i3 = iA + i;
                    }
                    break;
                case 60:
                    if (n(i5, i4, kjtVar)) {
                        i = i3 * 53;
                        iA = ift0.j(kjtVar, j2).hashCode();
                        i3 = iA + i;
                    }
                    break;
                case 61:
                    if (n(i5, i4, kjtVar)) {
                        i = i3 * 53;
                        iA = ift0.j(kjtVar, j2).hashCode();
                        i3 = iA + i;
                    }
                    break;
                case 62:
                    if (n(i5, i4, kjtVar)) {
                        i = i3 * 53;
                        iA = r(kjtVar, j2);
                        i3 = iA + i;
                    }
                    break;
                case 63:
                    if (n(i5, i4, kjtVar)) {
                        i = i3 * 53;
                        iA = r(kjtVar, j2);
                        i3 = iA + i;
                    }
                    break;
                case 64:
                    if (n(i5, i4, kjtVar)) {
                        i = i3 * 53;
                        iA = r(kjtVar, j2);
                        i3 = iA + i;
                    }
                    break;
                case 65:
                    if (n(i5, i4, kjtVar)) {
                        i = i3 * 53;
                        iA = dmx.a(s(kjtVar, j2));
                        i3 = iA + i;
                    }
                    break;
                case 66:
                    if (n(i5, i4, kjtVar)) {
                        i = i3 * 53;
                        iA = r(kjtVar, j2);
                        i3 = iA + i;
                    }
                    break;
                case 67:
                    if (n(i5, i4, kjtVar)) {
                        i = i3 * 53;
                        iA = dmx.a(s(kjtVar, j2));
                        i3 = iA + i;
                    }
                    break;
                case 68:
                    if (n(i5, i4, kjtVar)) {
                        i = i3 * 53;
                        iA = ift0.j(kjtVar, j2).hashCode();
                        i3 = iA + i;
                    }
                    break;
            }
        }
        this.h.getClass();
        return kjtVar.unknownFields.hashCode() + (i3 * 53);
    }

    public final boolean i(kjt kjtVar, kjt kjtVar2, int i) {
        return k(i, kjtVar) == k(i, kjtVar2);
    }

    public final p2h0 j(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        p2h0 p2h0Var = (p2h0) objArr[i2];
        if (p2h0Var != null) {
            return p2h0Var;
        }
        p2h0 p2h0VarA = b5d0.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = p2h0VarA;
        return p2h0VarA;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x00f1 A[RETURN] */
    public final boolean k(int i, Object obj) {
        int i2 = this.f26437a[i + 2];
        long j2 = i2 & 1048575;
        if (j2 != 1048575) {
            if (((1 << (i2 >>> 20)) & ift0.h(obj, j2)) != 0) {
                return true;
            }
            return false;
        }
        int iW = w(i);
        long j3 = iW & 1048575;
        switch (v(iW)) {
            case 0:
                if (Double.doubleToRawLongBits(ift0.c.c(obj, j3)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(ift0.c.d(obj, j3)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (ift0.i(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (ift0.i(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (ift0.h(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (ift0.i(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (ift0.h(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 7:
                return ift0.c.a(obj, j3);
            case 8:
                Object objJ = ift0.j(obj, j3);
                if (objJ instanceof String) {
                    return !((String) objJ).isEmpty();
                }
                if (objJ instanceof lg9) {
                    return !lg9.c.equals(objJ);
                }
                e9d0.o();
                return false;
            case 9:
                if (ift0.j(obj, j3) != null) {
                    return true;
                }
                return false;
            case 10:
                return !lg9.c.equals(ift0.j(obj, j3));
            case 11:
                if (ift0.h(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (ift0.h(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (ift0.h(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (ift0.i(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (ift0.h(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (ift0.i(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (ift0.j(obj, j3) != null) {
                    return true;
                }
                return false;
            default:
                e9d0.o();
                return false;
        }
    }

    public final boolean l(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return k(i, obj);
        }
        return (i3 & i4) != 0;
    }

    public final boolean n(int i, int i2, Object obj) {
        return ift0.h(obj, (long) (this.f26437a[i2 + 2] & 1048575)) == i;
    }

    public final void o(int i, Object obj, Object obj2) {
        if (k(i, obj2)) {
            long jW = w(i) & 1048575;
            Unsafe unsafe = k;
            Object object = unsafe.getObject(obj2, jW);
            if (object == null) {
                hny.i(this.f26437a[i], obj2);
                return;
            }
            p2h0 p2h0VarJ = j(i);
            if (!k(i, obj)) {
                if (m(object)) {
                    kjt kjtVarD = p2h0VarJ.d();
                    p2h0VarJ.a(kjtVarD, object);
                    unsafe.putObject(obj, jW, kjtVarD);
                } else {
                    unsafe.putObject(obj, jW, object);
                }
                u(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jW);
            if (!m(object2)) {
                kjt kjtVarD2 = p2h0VarJ.d();
                p2h0VarJ.a(kjtVarD2, object2);
                unsafe.putObject(obj, jW, kjtVarD2);
                object2 = kjtVarD2;
            }
            p2h0VarJ.a(object2, object);
        }
    }

    public final void p(int i, Object obj, Object obj2) {
        int[] iArr = this.f26437a;
        int i2 = iArr[i];
        if (n(i2, i, obj2)) {
            long jW = w(i) & 1048575;
            Unsafe unsafe = k;
            Object object = unsafe.getObject(obj2, jW);
            if (object == null) {
                hny.i(iArr[i], obj2);
                return;
            }
            p2h0 p2h0VarJ = j(i);
            if (!n(i2, i, obj)) {
                if (m(object)) {
                    kjt kjtVarD = p2h0VarJ.d();
                    p2h0VarJ.a(kjtVarD, object);
                    unsafe.putObject(obj, jW, kjtVarD);
                } else {
                    unsafe.putObject(obj, jW, object);
                }
                ift0.o(obj, i2, iArr[i + 2] & 1048575);
                return;
            }
            Object object2 = unsafe.getObject(obj, jW);
            if (!m(object2)) {
                kjt kjtVarD2 = p2h0VarJ.d();
                p2h0VarJ.a(kjtVarD2, object2);
                unsafe.putObject(obj, jW, kjtVarD2);
                object2 = kjtVarD2;
            }
            p2h0VarJ.a(object2, object);
        }
    }

    public final void u(int i, Object obj) {
        int i2 = this.f26437a[i + 2];
        long j2 = 1048575 & i2;
        if (j2 == 1048575) {
            return;
        }
        ift0.o(obj, (1 << (i2 >>> 20)) | ift0.h(obj, j2), j2);
    }

    public final int w(int i) {
        return this.f26437a[i + 1];
    }
}

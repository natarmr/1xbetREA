package a;

import com.appsflyer.share.attribution.RequestError;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class o640 implements o2h0 {
    public static final int[] o = new int[0];
    public static final Unsafe p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f24717a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final x3 e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final dm50 k;
    public final dd00 l;
    public final zdt0 m;
    public final xo20 n;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new cft0((byte) 0));
        } catch (Throwable unused) {
            unsafe = null;
        }
        p = unsafe;
    }

    public o640(int[] iArr, Object[] objArr, int i, int i2, x3 x3Var, boolean z, int[] iArr2, int i3, int i4, dm50 dm50Var, dd00 dd00Var, zdt0 zdt0Var, vso vsoVar, xo20 xo20Var) {
        this.f24717a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = x3Var instanceof jjt;
        this.g = z;
        this.h = iArr2;
        this.i = i3;
        this.j = i4;
        this.k = dm50Var;
        this.l = dd00Var;
        this.m = zdt0Var;
        this.e = x3Var;
        this.n = xo20Var;
    }

    public static int A(Object obj, long j) {
        return ((Integer) hft0.j(obj, j)).intValue();
    }

    public static long B(Object obj, long j) {
        return ((Long) hft0.j(obj, j)).longValue();
    }

    public static Field J(Class cls, String str) {
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

    public static int P(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void R(int i, Object obj, psc pscVar) throws l52 {
        if (!(obj instanceof String)) {
            pscVar.p(i, (og9) obj);
            return;
        }
        String str = (String) obj;
        ryc rycVar = (ryc) pscVar.b;
        rycVar.p(i, 2);
        int i2 = rycVar.c;
        byte[] bArr = rycVar.b;
        int i3 = rycVar.d;
        try {
            int i4 = ryc.i(str.length() * 3);
            int i5 = ryc.i(str.length());
            if (i5 != i4) {
                rycVar.q(ptt0.a(str));
                int i6 = rycVar.d;
                rycVar.d = ptt0.f27581a.g(str, bArr, i6, i2 - i6);
                return;
            }
            int i7 = i3 + i5;
            rycVar.d = i7;
            int iG = ptt0.f27581a.g(str, bArr, i7, i2 - i7);
            rycVar.d = i3;
            rycVar.q((iG - i3) - i5);
            rycVar.d = iG;
        } catch (mtt0 e) {
            rycVar.d = i3;
            ryc.e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = str.getBytes(cmx.f4629a);
            try {
                rycVar.q(bytes.length);
                rycVar.l(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e2) {
                throw new l52(e2);
            }
        } catch (IndexOutOfBoundsException e3) {
            throw new l52(e3);
        }
    }

    public static void l(Object obj) {
        if (r(obj)) {
            return;
        }
        e9d0.i(obj, "Mutating immutable message: ");
    }

    public static boolean r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof jjt) {
            return ((jjt) obj).o();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:156:0x0321  */
    /* JADX WARN: Code duplicated, block: B:178:0x03a8  */
    public static o640 y(x9e0 x9e0Var, dm50 dm50Var, dd00 dd00Var, zdt0 zdt0Var, vso vsoVar, xo20 xo20Var) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        char cCharAt;
        int i6;
        char cCharAt2;
        int i7;
        char cCharAt3;
        int i8;
        char cCharAt4;
        int i9;
        char cCharAt5;
        int i10;
        char cCharAt6;
        int i11;
        char cCharAt7;
        int i12;
        char cCharAt8;
        int i13;
        int i14;
        Object[] objArr;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i15;
        int i16;
        int i17;
        Field fieldJ;
        int i18;
        char cCharAt9;
        int i19;
        Field fieldJ2;
        Field fieldJ3;
        int i20;
        char cCharAt10;
        int i21;
        int i22;
        char cCharAt11;
        int i23;
        int i24;
        char cCharAt12;
        int i25;
        int i26;
        char cCharAt13;
        if (!(x9e0Var instanceof x9e0)) {
            hny.b();
            return null;
        }
        int i27 = 0;
        boolean z = (x9e0Var.d & 1) != 1;
        String str = x9e0Var.b;
        int length = str.length();
        if (str.charAt(0) >= 55296) {
            int i28 = 1;
            while (true) {
                i = i28 + 1;
                if (str.charAt(i28) < 55296) {
                    break;
                }
                i28 = i;
            }
        } else {
            i = 1;
        }
        int i29 = i + 1;
        int iCharAt4 = str.charAt(i);
        if (iCharAt4 >= 55296) {
            int i30 = iCharAt4 & 8191;
            int i31 = 13;
            while (true) {
                i26 = i29 + 1;
                cCharAt13 = str.charAt(i29);
                if (cCharAt13 < 55296) {
                    break;
                }
                i30 |= (cCharAt13 & 8191) << i31;
                i31 += 13;
                i29 = i26;
            }
            iCharAt4 = i30 | (cCharAt13 << i31);
            i29 = i26;
        }
        if (iCharAt4 == 0) {
            i4 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i2 = 0;
            iCharAt3 = 0;
            iArr = o;
            i3 = 0;
        } else {
            int i32 = i29 + 1;
            int iCharAt5 = str.charAt(i29);
            if (iCharAt5 >= 55296) {
                int i33 = iCharAt5 & 8191;
                int i34 = 13;
                while (true) {
                    i12 = i32 + 1;
                    cCharAt8 = str.charAt(i32);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i33 |= (cCharAt8 & 8191) << i34;
                    i34 += 13;
                    i32 = i12;
                }
                iCharAt5 = i33 | (cCharAt8 << i34);
                i32 = i12;
            }
            int i35 = i32 + 1;
            int iCharAt6 = str.charAt(i32);
            if (iCharAt6 >= 55296) {
                int i36 = iCharAt6 & 8191;
                int i37 = 13;
                while (true) {
                    i11 = i35 + 1;
                    cCharAt7 = str.charAt(i35);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i36 |= (cCharAt7 & 8191) << i37;
                    i37 += 13;
                    i35 = i11;
                }
                iCharAt6 = i36 | (cCharAt7 << i37);
                i35 = i11;
            }
            int i38 = i35 + 1;
            int iCharAt7 = str.charAt(i35);
            if (iCharAt7 >= 55296) {
                int i39 = iCharAt7 & 8191;
                int i40 = 13;
                while (true) {
                    i10 = i38 + 1;
                    cCharAt6 = str.charAt(i38);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt6 & 8191) << i40;
                    i40 += 13;
                    i38 = i10;
                }
                iCharAt7 = i39 | (cCharAt6 << i40);
                i38 = i10;
            }
            int i41 = i38 + 1;
            int iCharAt8 = str.charAt(i38);
            if (iCharAt8 >= 55296) {
                int i42 = iCharAt8 & 8191;
                int i43 = 13;
                while (true) {
                    i9 = i41 + 1;
                    cCharAt5 = str.charAt(i41);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt5 & 8191) << i43;
                    i43 += 13;
                    i41 = i9;
                }
                iCharAt8 = i42 | (cCharAt5 << i43);
                i41 = i9;
            }
            int i44 = i41 + 1;
            iCharAt = str.charAt(i41);
            if (iCharAt >= 55296) {
                int i45 = iCharAt & 8191;
                int i46 = 13;
                while (true) {
                    i8 = i44 + 1;
                    cCharAt4 = str.charAt(i44);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt4 & 8191) << i46;
                    i46 += 13;
                    i44 = i8;
                }
                iCharAt = i45 | (cCharAt4 << i46);
                i44 = i8;
            }
            int i47 = i44 + 1;
            iCharAt2 = str.charAt(i44);
            if (iCharAt2 >= 55296) {
                int i48 = iCharAt2 & 8191;
                int i49 = 13;
                while (true) {
                    i7 = i47 + 1;
                    cCharAt3 = str.charAt(i47);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt3 & 8191) << i49;
                    i49 += 13;
                    i47 = i7;
                }
                iCharAt2 = i48 | (cCharAt3 << i49);
                i47 = i7;
            }
            int i50 = i47 + 1;
            int iCharAt9 = str.charAt(i47);
            if (iCharAt9 >= 55296) {
                int i51 = iCharAt9 & 8191;
                int i52 = 13;
                while (true) {
                    i6 = i50 + 1;
                    cCharAt2 = str.charAt(i50);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt2 & 8191) << i52;
                    i52 += 13;
                    i50 = i6;
                }
                iCharAt9 = i51 | (cCharAt2 << i52);
                i50 = i6;
            }
            int i53 = i50 + 1;
            iCharAt3 = str.charAt(i50);
            if (iCharAt3 >= 55296) {
                int i54 = iCharAt3 & 8191;
                int i55 = i53;
                int i56 = 13;
                while (true) {
                    i5 = i55 + 1;
                    cCharAt = str.charAt(i55);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i54 |= (cCharAt & 8191) << i56;
                    i56 += 13;
                    i55 = i5;
                }
                iCharAt3 = i54 | (cCharAt << i56);
                i53 = i5;
            }
            int[] iArr2 = new int[iCharAt3 + iCharAt2 + iCharAt9];
            i2 = (iCharAt5 * 2) + iCharAt6;
            i3 = iCharAt7;
            i4 = iCharAt8;
            iArr = iArr2;
            i27 = iCharAt5;
            i29 = i53;
        }
        Object[] objArr2 = x9e0Var.c;
        Class<?> cls = x9e0Var.f40506a.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        int i57 = i27;
        Object[] objArr3 = new Object[iCharAt * 2];
        int i58 = iCharAt2 + iCharAt3;
        int i59 = i58;
        int i60 = iCharAt3;
        int i61 = 0;
        int i62 = 0;
        while (i29 < length) {
            int i63 = i29 + 1;
            int iCharAt10 = str.charAt(i29);
            int i64 = length;
            if (iCharAt10 >= 55296) {
                int i65 = iCharAt10 & 8191;
                int i66 = i63;
                int i67 = 13;
                while (true) {
                    i24 = i66 + 1;
                    cCharAt12 = str.charAt(i66);
                    i25 = i65;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i65 = i25 | ((cCharAt12 & 8191) << i67);
                    i67 += 13;
                    i66 = i24;
                }
                iCharAt10 = i25 | (cCharAt12 << i67);
                i13 = i24;
            } else {
                i13 = i63;
            }
            int i68 = i13 + 1;
            int iCharAt11 = str.charAt(i13);
            int i69 = iCharAt10;
            if (iCharAt11 >= 55296) {
                int i70 = iCharAt11 & 8191;
                int i71 = i68;
                int i72 = 13;
                while (true) {
                    i22 = i71 + 1;
                    cCharAt11 = str.charAt(i71);
                    i23 = i70;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i70 = i23 | ((cCharAt11 & 8191) << i72);
                    i72 += 13;
                    i71 = i22;
                }
                iCharAt11 = i23 | (cCharAt11 << i72);
                i14 = i22;
            } else {
                i14 = i68;
            }
            int[] iArr4 = iArr3;
            int i73 = iCharAt11 & 255;
            int i74 = i3;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i62] = i61;
                i62++;
            }
            Unsafe unsafe = p;
            int i75 = i4;
            if (i73 >= 51) {
                int i76 = i14 + 1;
                int iCharAt12 = str.charAt(i14);
                if (iCharAt12 >= 55296) {
                    int i77 = iCharAt12 & 8191;
                    int i78 = i76;
                    int i79 = 13;
                    while (true) {
                        i20 = i78 + 1;
                        cCharAt10 = str.charAt(i78);
                        i21 = i77;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i77 = i21 | ((cCharAt10 & 8191) << i79);
                        i79 += 13;
                        i78 = i20;
                    }
                    iCharAt12 = i21 | (cCharAt10 << i79);
                    i19 = i20;
                } else {
                    i19 = i76;
                }
                int i80 = iCharAt12;
                int i81 = i73 - 51;
                int i82 = i19;
                if (i81 == 9 || i81 == 17) {
                    objArr = objArr2;
                    objArr3[f140.b(i61, 3, 2, 1)] = objArr[i2];
                    i2++;
                } else if (i81 != 12 || z) {
                    objArr = objArr2;
                } else {
                    objArr = objArr2;
                    objArr3[f140.b(i61, 3, 2, 1)] = objArr[i2];
                    i2++;
                }
                int i83 = i80 * 2;
                Object obj = objArr[i83];
                if (obj instanceof Field) {
                    fieldJ2 = (Field) obj;
                } else {
                    fieldJ2 = J(cls, (String) obj);
                    objArr[i83] = fieldJ2;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldJ2);
                int i84 = i83 + 1;
                Object obj2 = objArr[i84];
                if (obj2 instanceof Field) {
                    fieldJ3 = (Field) obj2;
                } else {
                    fieldJ3 = J(cls, (String) obj2);
                    objArr[i84] = fieldJ3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldJ3);
                i17 = iObjectFieldOffset3;
                z = z;
                iArr = iArr;
                i15 = i82;
                i16 = 0;
            } else {
                objArr = objArr2;
                int i85 = i2 + 1;
                Field fieldJ4 = J(cls, (String) objArr[i2]);
                if (i73 == 9 || i73 == 17) {
                    objArr3[f140.b(i61, 3, 2, 1)] = fieldJ4.getType();
                } else {
                    if (i73 == 27 || i73 == 49) {
                        z = z;
                        iArr = iArr;
                        i2 += 2;
                        objArr3[f140.b(i61, 3, 2, 1)] = objArr[i85];
                    } else if (i73 == 12 || i73 == 30 || i73 == 44) {
                        if (!z) {
                            z = z;
                            iArr = iArr;
                            i2 += 2;
                            objArr3[f140.b(i61, 3, 2, 1)] = objArr[i85];
                        }
                    } else if (i73 == 50) {
                        int i86 = i60 + 1;
                        iArr[i60] = i61;
                        int i87 = (i61 / 3) * 2;
                        int i88 = i2 + 2;
                        objArr3[i87] = objArr[i85];
                        if ((iCharAt11 & 2048) != 0) {
                            objArr3[i87 + 1] = objArr[i88];
                            i2 += 3;
                            z = z;
                            iArr = iArr;
                            i60 = i86;
                        } else {
                            z = z;
                            i2 = i88;
                            i60 = i86;
                            iArr = iArr;
                        }
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldJ4);
                    if ((iCharAt11 & 4096) == 4096 || i73 > 17) {
                        iObjectFieldOffset2 = 1048575;
                        i15 = i14;
                        i16 = 0;
                    } else {
                        i15 = i14 + 1;
                        int iCharAt13 = str.charAt(i14);
                        if (iCharAt13 >= 55296) {
                            int i89 = iCharAt13 & 8191;
                            int i90 = 13;
                            while (true) {
                                i18 = i15 + 1;
                                cCharAt9 = str.charAt(i15);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i89 |= (cCharAt9 & 8191) << i90;
                                i90 += 13;
                                i15 = i18;
                            }
                            iCharAt13 = i89 | (cCharAt9 << i90);
                            i15 = i18;
                        }
                        int i91 = (iCharAt13 / 32) + (i57 * 2);
                        Object obj3 = objArr[i91];
                        if (obj3 instanceof Field) {
                            fieldJ = (Field) obj3;
                        } else {
                            fieldJ = J(cls, (String) obj3);
                            objArr[i91] = fieldJ;
                        }
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldJ);
                        i16 = iCharAt13 % 32;
                    }
                    if (i73 >= 18 && i73 <= 49) {
                        iArr[i59] = iObjectFieldOffset;
                        i59++;
                    }
                    i17 = iObjectFieldOffset;
                }
                i2 = i85;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldJ4);
                if ((iCharAt11 & 4096) == 4096) {
                    iObjectFieldOffset2 = 1048575;
                    i15 = i14;
                    i16 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i15 = i14;
                    i16 = 0;
                }
                if (i73 >= 18) {
                    iArr[i59] = iObjectFieldOffset;
                    i59++;
                }
                i17 = iObjectFieldOffset;
            }
            int i92 = i61 + 1;
            iArr4[i61] = i69;
            int i93 = i61 + 2;
            String str2 = str;
            iArr4[i92] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i73 << 20) | i17;
            i61 += 3;
            iArr4[i93] = (i16 << 20) | iObjectFieldOffset2;
            i29 = i15;
            z = z;
            iArr3 = iArr4;
            length = i64;
            str = str2;
            i3 = i74;
            iArr = iArr;
            i4 = i75;
            objArr2 = objArr;
        }
        return new o640(iArr3, objArr3, i3, i4, x9e0Var.f40506a, z, iArr, iCharAt3, i58, dm50Var, dd00Var, zdt0Var, vsoVar, xo20Var);
    }

    public static long z(int i) {
        return i & 1048575;
    }

    public final void C(Object obj, int i, long j) {
        Object objO = o(i);
        Unsafe unsafe = p;
        Object object = unsafe.getObject(obj, j);
        this.n.getClass();
        if (!((uo20) object).f35991a) {
            uo20 uo20VarD = uo20.b.d();
            xo20.b(uo20VarD, object);
            unsafe.putObject(obj, j, uo20VarD);
        }
        rw2.w(objO);
        throw null;
    }

    public final int D(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, vw3 vw3Var) throws ynx {
        int i9;
        long j2 = this.f24717a[i8 + 2] & 1048575;
        Unsafe unsafe = p;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(b34.V(bArr, i))));
                int i10 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i10;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(b34.U(bArr, i))));
                int i11 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iD0 = b34.d0(bArr, i, vw3Var);
                unsafe.putObject(obj, j, Long.valueOf(vw3Var.b));
                unsafe.putInt(obj, j2, i4);
                return iD0;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int iB0 = b34.b0(bArr, i, vw3Var);
                unsafe.putObject(obj, j, Integer.valueOf(vw3Var.f38129a));
                unsafe.putInt(obj, j2, i4);
                return iB0;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(b34.V(bArr, i)));
                int i12 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i12;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(b34.U(bArr, i)));
                int i13 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i13;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iD1 = b34.d0(bArr, i, vw3Var);
                unsafe.putObject(obj, j, Boolean.valueOf(vw3Var.b != 0));
                unsafe.putInt(obj, j2, i4);
                return iD1;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iB1 = b34.b0(bArr, i, vw3Var);
                int i14 = vw3Var.f38129a;
                if (i14 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0) {
                        if (!ptt0.f27581a.n(bArr, iB1, iB1 + i14)) {
                            throw ynx.b();
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, iB1, i14, cmx.f4629a));
                    iB1 += i14;
                }
                unsafe.putInt(obj, j2, i4);
                return iB1;
            case 60:
                i9 = i;
                if (i5 == 2) {
                    Object objX = x(i4, i8, obj);
                    int iO0 = b34.o0(objX, p(i8), bArr, i9, i2, vw3Var);
                    O(obj, i4, i8, objX);
                    return iO0;
                }
                return i9;
            case 61:
                i9 = i;
                if (i5 == 2) {
                    int iT = b34.T(bArr, i9, vw3Var);
                    unsafe.putObject(obj, j, vw3Var.c);
                    unsafe.putInt(obj, j2, i4);
                    return iT;
                }
                return i9;
            case 63:
                i9 = i;
                if (i5 == 0) {
                    int iB2 = b34.b0(bArr, i9, vw3Var);
                    int i15 = vw3Var.f38129a;
                    n(i8);
                    unsafe.putObject(obj, j, Integer.valueOf(i15));
                    unsafe.putInt(obj, j2, i4);
                    return iB2;
                }
                return i9;
            case 66:
                i9 = i;
                if (i5 == 0) {
                    int iB3 = b34.b0(bArr, i9, vw3Var);
                    unsafe.putObject(obj, j, Integer.valueOf(oyc.b(vw3Var.f38129a)));
                    unsafe.putInt(obj, j2, i4);
                    return iB3;
                }
                return i9;
            case 67:
                i9 = i;
                if (i5 == 0) {
                    int iD2 = b34.d0(bArr, i9, vw3Var);
                    unsafe.putObject(obj, j, Long.valueOf(oyc.c(vw3Var.b)));
                    unsafe.putInt(obj, j2, i4);
                    return iD2;
                }
                return i9;
            case 68:
                if (i5 == 3) {
                    Object objX2 = x(i4, i8, obj);
                    int iE = ((o640) p(i8)).E(objX2, bArr, i, i2, (i3 & (-8)) | 4, vw3Var);
                    vw3Var.c = objX2;
                    O(obj, i4, i8, objX2);
                    return iE;
                }
            default:
                return i;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    public final int E(Object obj, byte[] bArr, int i, int i2, int i3, vw3 vw3Var) throws ynx {
        o640 o640Var;
        Unsafe unsafe;
        Object obj2;
        Object obj3;
        int i4;
        int iM;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Unsafe unsafe2;
        int i10;
        byte[] bArr2;
        Unsafe unsafe3;
        Object obj4;
        Object obj5;
        Unsafe unsafe4;
        Object obj6;
        int i11;
        Unsafe unsafe5;
        Object obj7;
        int i12;
        int i13;
        o640 o640Var2 = this;
        Object obj8 = obj;
        byte[] bArr3 = bArr;
        i2 = i2;
        vw3 vw3Var2 = vw3Var;
        l(obj8);
        int i14 = 0;
        int iZ = i;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = -1;
        int i19 = 1048575;
        while (true) {
            Unsafe unsafe6 = p;
            if (iZ < i2) {
                int iA0 = iZ + 1;
                int i20 = bArr3[iZ];
                if (i20 < 0) {
                    iA0 = b34.a0(i20, bArr3, iA0, vw3Var2);
                    i20 = vw3Var2.f38129a;
                }
                int i21 = i20;
                int i22 = (i21 == true ? 1 : 0) >>> 3;
                int i23 = i15;
                int i24 = (i21 == true ? 1 : 0) & 7;
                int i25 = o640Var2.d;
                int i26 = o640Var2.c;
                if (i22 > i18) {
                    int i27 = i23 / 3;
                    if (i22 < i26 || i22 > i25) {
                        iM = -1;
                    } else {
                        iM = o640Var2.M(i22, i27);
                    }
                } else if (i22 < i26 || i22 > i25) {
                    iM = -1;
                } else {
                    iM = o640Var2.M(i22, i14);
                }
                int i28 = iM;
                if (i28 == -1) {
                    o640Var = o640Var2;
                    i5 = i22;
                    iZ = iA0;
                    i6 = i17;
                    i7 = i14;
                    obj3 = obj8;
                    unsafe = unsafe6;
                    i8 = i21 == true ? 1 : 0;
                    obj2 = null;
                    i9 = i7;
                } else {
                    int[] iArr = o640Var2.f24717a;
                    int i29 = iArr[i28 + 1];
                    int iP = P(i29);
                    long j = i29 & 1048575;
                    i5 = i22;
                    if (iP <= 17) {
                        int i30 = iArr[i28 + 2];
                        int i31 = 1 << (i30 >>> 20);
                        int i32 = i30 & 1048575;
                        if (i32 != i19) {
                            if (i19 != 1048575) {
                                unsafe6.putInt(obj8, i19, i17);
                            }
                            i17 = unsafe6.getInt(obj8, i32);
                        } else {
                            i32 = i19;
                        }
                        i6 = i17;
                        switch (iP) {
                            case 0:
                                unsafe2 = unsafe6;
                                i10 = iA0;
                                bArr2 = bArr;
                                if (i24 == 1) {
                                    hft0.c.g(obj8, j, Double.longBitsToDouble(b34.V(bArr2, i10)));
                                    i17 = i6 | i31;
                                    obj8 = obj8;
                                    iZ = i10 + 8;
                                    bArr3 = bArr2;
                                    i15 = i28;
                                    i19 = i32;
                                    i16 = i21 == true ? 1 : 0;
                                    i18 = i5;
                                    i14 = 0;
                                } else {
                                    obj4 = obj8;
                                    o640Var = o640Var2;
                                    obj3 = obj4;
                                    iZ = i10;
                                    i19 = i32;
                                    i8 = i21 == true ? 1 : 0;
                                    obj2 = null;
                                    i7 = 0;
                                    unsafe = unsafe2;
                                    i9 = i28;
                                }
                                break;
                            case 1:
                                unsafe2 = unsafe6;
                                i10 = iA0;
                                bArr2 = bArr;
                                if (i24 == 5) {
                                    hft0.c.h(obj8, j, Float.intBitsToFloat(b34.U(bArr2, i10)));
                                    iZ = i10 + 4;
                                    i17 = i6 | i31;
                                    bArr3 = bArr2;
                                    i15 = i28;
                                    i19 = i32;
                                    i16 = i21 == true ? 1 : 0;
                                    i18 = i5;
                                    i14 = 0;
                                } else {
                                    obj4 = obj8;
                                    o640Var = o640Var2;
                                    obj3 = obj4;
                                    iZ = i10;
                                    i19 = i32;
                                    i8 = i21 == true ? 1 : 0;
                                    obj2 = null;
                                    i7 = 0;
                                    unsafe = unsafe2;
                                    i9 = i28;
                                }
                                break;
                            case 2:
                            case 3:
                                unsafe3 = unsafe6;
                                i10 = iA0;
                                if (i24 == 0) {
                                    int iD0 = b34.d0(bArr, i10, vw3Var2);
                                    unsafe3.putLong(obj8, j, vw3Var2.b);
                                    i17 = i6 | i31;
                                    i2 = i2;
                                    bArr3 = bArr;
                                    iZ = iD0;
                                    i15 = i28;
                                    i19 = i32;
                                    i16 = i21 == true ? 1 : 0;
                                    i18 = i5;
                                    i14 = 0;
                                } else {
                                    unsafe2 = unsafe3;
                                    obj4 = obj8;
                                    o640Var = o640Var2;
                                    obj3 = obj4;
                                    iZ = i10;
                                    i19 = i32;
                                    i8 = i21 == true ? 1 : 0;
                                    obj2 = null;
                                    i7 = 0;
                                    unsafe = unsafe2;
                                    i9 = i28;
                                }
                                break;
                            case 4:
                            case 11:
                                unsafe3 = unsafe6;
                                i10 = iA0;
                                bArr2 = bArr;
                                if (i24 == 0) {
                                    int iB0 = b34.b0(bArr2, i10, vw3Var2);
                                    unsafe3.putInt(obj8, j, vw3Var2.f38129a);
                                    i17 = i6 | i31;
                                    iZ = iB0;
                                    bArr3 = bArr2;
                                    i15 = i28;
                                    i19 = i32;
                                    i16 = i21 == true ? 1 : 0;
                                    i18 = i5;
                                    i14 = 0;
                                } else {
                                    unsafe2 = unsafe3;
                                    obj4 = obj8;
                                    o640Var = o640Var2;
                                    obj3 = obj4;
                                    iZ = i10;
                                    i19 = i32;
                                    i8 = i21 == true ? 1 : 0;
                                    obj2 = null;
                                    i7 = 0;
                                    unsafe = unsafe2;
                                    i9 = i28;
                                }
                                break;
                            case 5:
                            case 14:
                                obj5 = obj8;
                                unsafe4 = unsafe6;
                                i10 = iA0;
                                bArr2 = bArr;
                                if (i24 == 1) {
                                    obj8 = obj5;
                                    unsafe4.putLong(obj8, j, b34.V(bArr2, i10));
                                    iZ = i10 + 8;
                                    i17 = i6 | i31;
                                    bArr3 = bArr2;
                                    i15 = i28;
                                    i19 = i32;
                                    i16 = i21 == true ? 1 : 0;
                                    i18 = i5;
                                    i14 = 0;
                                } else {
                                    unsafe2 = unsafe4;
                                    obj4 = obj5;
                                    o640Var = o640Var2;
                                    obj3 = obj4;
                                    iZ = i10;
                                    i19 = i32;
                                    i8 = i21 == true ? 1 : 0;
                                    obj2 = null;
                                    i7 = 0;
                                    unsafe = unsafe2;
                                    i9 = i28;
                                }
                                break;
                            case 6:
                            case 13:
                                obj5 = obj8;
                                unsafe4 = unsafe6;
                                i10 = iA0;
                                bArr2 = bArr;
                                if (i24 == 5) {
                                    unsafe4.putInt(obj5, j, b34.U(bArr2, i10));
                                    iZ = i10 + 4;
                                    obj6 = obj5;
                                    i17 = i6 | i31;
                                    obj8 = obj6;
                                    bArr3 = bArr2;
                                    i15 = i28;
                                    i19 = i32;
                                    i16 = i21 == true ? 1 : 0;
                                    i18 = i5;
                                    i14 = 0;
                                } else {
                                    unsafe2 = unsafe4;
                                    obj4 = obj5;
                                    o640Var = o640Var2;
                                    obj3 = obj4;
                                    iZ = i10;
                                    i19 = i32;
                                    i8 = i21 == true ? 1 : 0;
                                    obj2 = null;
                                    i7 = 0;
                                    unsafe = unsafe2;
                                    i9 = i28;
                                }
                                break;
                            case 7:
                                obj5 = obj8;
                                unsafe4 = unsafe6;
                                i10 = iA0;
                                bArr2 = bArr;
                                if (i24 == 0) {
                                    iZ = b34.d0(bArr2, i10, vw3Var2);
                                    hft0.c.e(obj5, j, vw3Var2.b != 0);
                                    obj6 = obj5;
                                    i17 = i6 | i31;
                                    obj8 = obj6;
                                    bArr3 = bArr2;
                                    i15 = i28;
                                    i19 = i32;
                                    i16 = i21 == true ? 1 : 0;
                                    i18 = i5;
                                    i14 = 0;
                                } else {
                                    unsafe2 = unsafe4;
                                    obj4 = obj5;
                                    o640Var = o640Var2;
                                    obj3 = obj4;
                                    iZ = i10;
                                    i19 = i32;
                                    i8 = i21 == true ? 1 : 0;
                                    obj2 = null;
                                    i7 = 0;
                                    unsafe = unsafe2;
                                    i9 = i28;
                                }
                                break;
                            case 8:
                                obj5 = obj8;
                                unsafe4 = unsafe6;
                                i10 = iA0;
                                bArr2 = bArr;
                                if (i24 == 2) {
                                    iZ = (536870912 & i29) == 0 ? b34.X(bArr2, i10, vw3Var2) : b34.Y(bArr2, i10, vw3Var2);
                                    unsafe4.putObject(obj5, j, vw3Var2.c);
                                    obj6 = obj5;
                                    i17 = i6 | i31;
                                    obj8 = obj6;
                                    bArr3 = bArr2;
                                    i15 = i28;
                                    i19 = i32;
                                    i16 = i21 == true ? 1 : 0;
                                    i18 = i5;
                                    i14 = 0;
                                } else {
                                    unsafe2 = unsafe4;
                                    obj4 = obj5;
                                    o640Var = o640Var2;
                                    obj3 = obj4;
                                    iZ = i10;
                                    i19 = i32;
                                    i8 = i21 == true ? 1 : 0;
                                    obj2 = null;
                                    i7 = 0;
                                    unsafe = unsafe2;
                                    i9 = i28;
                                }
                                break;
                            case 9:
                                obj5 = obj8;
                                int i33 = iA0;
                                unsafe4 = unsafe6;
                                bArr2 = bArr;
                                if (i24 == 2) {
                                    Object objW = o640Var2.w(i28, obj5);
                                    int iO0 = b34.o0(objW, o640Var2.p(i28), bArr2, i33, i2, vw3Var2);
                                    o640Var2.N(i28, obj5, objW);
                                    obj6 = obj5;
                                    i17 = i6 | i31;
                                    iZ = iO0;
                                    obj8 = obj6;
                                    bArr3 = bArr2;
                                    i15 = i28;
                                    i19 = i32;
                                    i16 = i21 == true ? 1 : 0;
                                    i18 = i5;
                                    i14 = 0;
                                } else {
                                    i10 = i33;
                                    unsafe2 = unsafe4;
                                    obj4 = obj5;
                                    o640Var = o640Var2;
                                    obj3 = obj4;
                                    iZ = i10;
                                    i19 = i32;
                                    i8 = i21 == true ? 1 : 0;
                                    obj2 = null;
                                    i7 = 0;
                                    unsafe = unsafe2;
                                    i9 = i28;
                                }
                                break;
                            case 10:
                                obj5 = obj8;
                                i11 = iA0;
                                unsafe5 = unsafe6;
                                bArr2 = bArr;
                                if (i24 == 2) {
                                    iZ = b34.T(bArr2, i11, vw3Var2);
                                    unsafe5.putObject(obj5, j, vw3Var2.c);
                                    obj6 = obj5;
                                    i17 = i6 | i31;
                                    obj8 = obj6;
                                    bArr3 = bArr2;
                                    i15 = i28;
                                    i19 = i32;
                                    i16 = i21 == true ? 1 : 0;
                                    i18 = i5;
                                    i14 = 0;
                                } else {
                                    i10 = i11;
                                    obj4 = obj5;
                                    unsafe2 = unsafe5;
                                    o640Var = o640Var2;
                                    obj3 = obj4;
                                    iZ = i10;
                                    i19 = i32;
                                    i8 = i21 == true ? 1 : 0;
                                    obj2 = null;
                                    i7 = 0;
                                    unsafe = unsafe2;
                                    i9 = i28;
                                }
                                break;
                            case 12:
                                obj5 = obj8;
                                i11 = iA0;
                                unsafe5 = unsafe6;
                                bArr2 = bArr;
                                if (i24 == 0) {
                                    iZ = b34.b0(bArr2, i11, vw3Var2);
                                    int i34 = vw3Var2.f38129a;
                                    o640Var2.n(i28);
                                    unsafe5.putInt(obj5, j, i34);
                                    obj6 = obj5;
                                    i17 = i6 | i31;
                                    obj8 = obj6;
                                    bArr3 = bArr2;
                                    i15 = i28;
                                    i19 = i32;
                                    i16 = i21 == true ? 1 : 0;
                                    i18 = i5;
                                    i14 = 0;
                                } else {
                                    i10 = i11;
                                    obj4 = obj5;
                                    unsafe2 = unsafe5;
                                    o640Var = o640Var2;
                                    obj3 = obj4;
                                    iZ = i10;
                                    i19 = i32;
                                    i8 = i21 == true ? 1 : 0;
                                    obj2 = null;
                                    i7 = 0;
                                    unsafe = unsafe2;
                                    i9 = i28;
                                }
                                break;
                            case 15:
                                obj5 = obj8;
                                i11 = iA0;
                                unsafe5 = unsafe6;
                                bArr2 = bArr;
                                if (i24 == 0) {
                                    iZ = b34.b0(bArr2, i11, vw3Var2);
                                    unsafe5.putInt(obj5, j, oyc.b(vw3Var2.f38129a));
                                    obj6 = obj5;
                                    i17 = i6 | i31;
                                    obj8 = obj6;
                                    bArr3 = bArr2;
                                    i15 = i28;
                                    i19 = i32;
                                    i16 = i21 == true ? 1 : 0;
                                    i18 = i5;
                                    i14 = 0;
                                } else {
                                    i10 = i11;
                                    obj4 = obj5;
                                    unsafe2 = unsafe5;
                                    o640Var = o640Var2;
                                    obj3 = obj4;
                                    iZ = i10;
                                    i19 = i32;
                                    i8 = i21 == true ? 1 : 0;
                                    obj2 = null;
                                    i7 = 0;
                                    unsafe = unsafe2;
                                    i9 = i28;
                                }
                                break;
                            case 16:
                                int i35 = iA0;
                                if (i24 == 0) {
                                    int iD1 = b34.d0(bArr, i35, vw3Var2);
                                    unsafe6.putLong(obj8, j, oyc.c(vw3Var2.b));
                                    i2 = i2;
                                    bArr3 = bArr;
                                    i15 = i28;
                                    i16 = i21 == true ? 1 : 0;
                                    i18 = i5;
                                    i14 = 0;
                                    i17 = i6 | i31;
                                    iZ = iD1;
                                    i19 = i32;
                                } else {
                                    obj5 = obj8;
                                    i10 = i35;
                                    unsafe2 = unsafe6;
                                    obj4 = obj5;
                                    o640Var = o640Var2;
                                    obj3 = obj4;
                                    iZ = i10;
                                    i19 = i32;
                                    i8 = i21 == true ? 1 : 0;
                                    obj2 = null;
                                    i7 = 0;
                                    unsafe = unsafe2;
                                    i9 = i28;
                                }
                                break;
                            case 17:
                                if (i24 == 3) {
                                    Object objW2 = o640Var2.w(i28, obj8);
                                    iZ = ((o640) o640Var2.p(i28)).E(objW2, bArr, iA0, i2, (i5 << 3) | 4, vw3Var2);
                                    bArr2 = bArr;
                                    vw3Var2.c = objW2;
                                    o640Var2.N(i28, obj8, objW2);
                                    i17 = i6 | i31;
                                    bArr3 = bArr2;
                                    i15 = i28;
                                    i19 = i32;
                                    i16 = i21 == true ? 1 : 0;
                                    i18 = i5;
                                    i14 = 0;
                                } else {
                                    obj4 = obj8;
                                    unsafe2 = unsafe6;
                                    i10 = iA0;
                                    o640Var = o640Var2;
                                    obj3 = obj4;
                                    iZ = i10;
                                    i19 = i32;
                                    i8 = i21 == true ? 1 : 0;
                                    obj2 = null;
                                    i7 = 0;
                                    unsafe = unsafe2;
                                    i9 = i28;
                                }
                                break;
                            default:
                                obj4 = obj8;
                                unsafe2 = unsafe6;
                                i10 = iA0;
                                o640Var = o640Var2;
                                obj3 = obj4;
                                iZ = i10;
                                i19 = i32;
                                i8 = i21 == true ? 1 : 0;
                                obj2 = null;
                                i7 = 0;
                                unsafe = unsafe2;
                                i9 = i28;
                                break;
                        }
                    } else {
                        Object obj9 = obj8;
                        int i36 = i19;
                        int i37 = iA0;
                        if (iP != 27) {
                            i8 = i21 == true ? 1 : 0;
                            if (iP <= 49) {
                                int i38 = i17;
                                unsafe = unsafe6;
                                obj2 = null;
                                i7 = 0;
                                int iF = o640Var2.F(obj, bArr, i37, i2, i8 == true ? 1 : 0, i24, i28, i29, iP, j, vw3Var);
                                i8 = i8 == true ? 1 : 0;
                                i9 = i28;
                                if (iF != i37) {
                                    bArr3 = bArr;
                                    i17 = i38;
                                    i2 = i2;
                                    vw3Var2 = vw3Var;
                                    i16 = i8 == true ? 1 : 0;
                                    i14 = 0;
                                    i19 = i36;
                                    i18 = i5;
                                    obj8 = obj;
                                    iZ = iF;
                                    i15 = i9;
                                } else {
                                    i6 = i38;
                                    obj3 = obj;
                                    iZ = iF;
                                    i19 = i36;
                                    o640Var = o640Var2;
                                }
                            } else {
                                obj7 = obj;
                                unsafe = unsafe6;
                                i13 = i37;
                                i12 = i17;
                                i9 = i28;
                                obj2 = null;
                                i7 = 0;
                                if (iP == 50) {
                                    if (i24 == 2) {
                                        o640Var2.C(obj7, i9, j);
                                        throw null;
                                    }
                                    i6 = i12;
                                    o640Var = o640Var2;
                                    obj3 = obj7;
                                    iZ = i13;
                                    i19 = i36;
                                } else {
                                    int iD = o640Var2.D(obj7, bArr, i13, i2, i8 == true ? 1 : 0, i5, i24, i29, iP, j, i9, vw3Var);
                                    obj3 = obj7;
                                    i8 = i8 == true ? 1 : 0;
                                    o640Var = o640Var2;
                                    if (iD != i13) {
                                        bArr3 = bArr;
                                        i2 = i2;
                                        vw3Var2 = vw3Var;
                                        o640Var2 = o640Var;
                                        iZ = iD;
                                        i15 = i9;
                                        i14 = 0;
                                        i19 = i36;
                                        i18 = i5;
                                        i16 = i8 == true ? 1 : 0;
                                        obj8 = obj3;
                                        i17 = i12;
                                    } else {
                                        i6 = i12;
                                        iZ = iD;
                                        i19 = i36;
                                    }
                                }
                            }
                        } else if (i24 == 2) {
                            zlx zlxVarN = (zlx) unsafe6.getObject(obj9, j);
                            if (!((m4) zlxVarN).f21141a) {
                                int size = zlxVarN.size();
                                zlxVarN = zlxVarN.n(size == 0 ? 10 : size * 2);
                                unsafe6.putObject(obj9, j, zlxVarN);
                            }
                            bArr3 = bArr;
                            iZ = b34.W(o640Var2.p(i28), i21 == true ? 1 : 0, bArr3, i37, i2, zlxVarN, vw3Var2);
                            i2 = i2;
                            vw3Var2 = vw3Var;
                            i16 = i21 == true ? 1 : 0;
                            i15 = i28;
                            i19 = i36;
                            i18 = i5;
                            i14 = 0;
                            obj8 = obj;
                        } else {
                            obj7 = obj;
                            unsafe = unsafe6;
                            i12 = i17;
                            i13 = i37;
                            i8 = i21 == true ? 1 : 0;
                            obj2 = null;
                            i7 = 0;
                            i9 = i28;
                            i6 = i12;
                            o640Var = o640Var2;
                            obj3 = obj7;
                            iZ = i13;
                            i19 = i36;
                        }
                    }
                }
                if (i8 != i3 || i3 == 0) {
                    jjt jjtVar = (jjt) obj3;
                    wdt0 wdt0VarC = jjtVar.unknownFields;
                    if (wdt0VarC == wdt0.f) {
                        wdt0VarC = wdt0.c();
                        jjtVar.unknownFields = wdt0VarC;
                    }
                    int i39 = i8;
                    vw3Var2 = vw3Var;
                    iZ = b34.Z(i39 == true ? 1 : 0, bArr, iZ, i2, wdt0VarC, vw3Var);
                    i2 = i2;
                    i16 = i39 == true ? 1 : 0;
                    o640Var2 = o640Var;
                    obj8 = obj3;
                    i15 = i9;
                    i14 = i7;
                    i18 = i5;
                    i17 = i6;
                    bArr3 = bArr;
                } else {
                    i2 = i2;
                    i16 = i8;
                    i4 = i6;
                }
            } else {
                o640Var = o640Var2;
                int i40 = i17;
                unsafe = unsafe6;
                obj2 = null;
                obj3 = obj8;
                i4 = i40;
            }
        }
        if (i19 != 1048575) {
            unsafe.putInt(obj3, i19, i4);
        }
        for (int i41 = o640Var.i; i41 < o640Var.j; i41++) {
            o640Var.m(o640Var.h[i41], obj3, obj2);
        }
        if (i3 == 0) {
            if (iZ != i2) {
                throw ynx.g();
            }
        } else if (iZ > i2 || i16 != i3) {
            throw ynx.g();
        }
        return iZ;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int F(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, long j, int i6, long j2, vw3 vw3Var) throws ynx {
        int iC0;
        Unsafe unsafe = p;
        zlx zlxVarN = (zlx) unsafe.getObject(obj, j2);
        if (!((m4) zlxVarN).f21141a) {
            int size = zlxVarN.size();
            zlxVarN = zlxVarN.n(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j2, zlxVarN);
        }
        zlx zlxVar = zlxVarN;
        switch (i6) {
            case 18:
            case 35:
                if (i4 == 2) {
                    gbl gblVar = (gbl) zlxVar;
                    int iB0 = b34.b0(bArr, i, vw3Var);
                    int i7 = vw3Var.f38129a + iB0;
                    while (iB0 < i7) {
                        gblVar.c(Double.longBitsToDouble(b34.V(bArr, iB0)));
                        iB0 += 8;
                    }
                    if (iB0 == i7) {
                        return iB0;
                    }
                    throw ynx.h();
                }
                if (i4 == 1) {
                    gbl gblVar2 = (gbl) zlxVar;
                    gblVar2.c(Double.longBitsToDouble(b34.V(bArr, i)));
                    i += 8;
                    while (i < i2) {
                        int iB1 = b34.b0(bArr, i, vw3Var);
                        if (i3 == vw3Var.f38129a) {
                            gblVar2.c(Double.longBitsToDouble(b34.V(bArr, iB1)));
                            i = iB1 + 8;
                        }
                    }
                }
                return i;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 36:
                if (i4 == 2) {
                    alq alqVar = (alq) zlxVar;
                    int iB2 = b34.b0(bArr, i, vw3Var);
                    int i8 = vw3Var.f38129a + iB2;
                    while (iB2 < i8) {
                        alqVar.c(Float.intBitsToFloat(b34.U(bArr, iB2)));
                        iB2 += 4;
                    }
                    if (iB2 == i8) {
                        return iB2;
                    }
                    throw ynx.h();
                }
                if (i4 == 5) {
                    alq alqVar2 = (alq) zlxVar;
                    alqVar2.c(Float.intBitsToFloat(b34.U(bArr, i)));
                    int i9 = i + 4;
                    while (i9 < i2) {
                        int iB3 = b34.b0(bArr, i9, vw3Var);
                        if (i3 != vw3Var.f38129a) {
                            return i9;
                        }
                        alqVar2.c(Float.intBitsToFloat(b34.U(bArr, iB3)));
                        i9 = iB3 + 4;
                    }
                    return i9;
                }
                return i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i4 == 2) {
                    x610 x610Var = (x610) zlxVar;
                    int iB4 = b34.b0(bArr, i, vw3Var);
                    int i10 = vw3Var.f38129a + iB4;
                    while (iB4 < i10) {
                        iB4 = b34.d0(bArr, iB4, vw3Var);
                        x610Var.c(vw3Var.b);
                    }
                    if (iB4 == i10) {
                        return iB4;
                    }
                    throw ynx.h();
                }
                if (i4 == 0) {
                    x610 x610Var2 = (x610) zlxVar;
                    int iD0 = b34.d0(bArr, i, vw3Var);
                    x610Var2.c(vw3Var.b);
                    while (iD0 < i2) {
                        int iB5 = b34.b0(bArr, iD0, vw3Var);
                        if (i3 != vw3Var.f38129a) {
                            return iD0;
                        }
                        iD0 = b34.d0(bArr, iB5, vw3Var);
                        x610Var2.c(vw3Var.b);
                    }
                    return iD0;
                }
                return i;
            case 22:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case 39:
            case 43:
                if (i4 != 2) {
                    if (i4 == 0) {
                        return b34.c0(i3, bArr, i, i2, zlxVar, vw3Var);
                    }
                    return i;
                }
                tjx tjxVar = (tjx) zlxVar;
                int iB6 = b34.b0(bArr, i, vw3Var);
                int i11 = vw3Var.f38129a + iB6;
                while (iB6 < i11) {
                    iB6 = b34.b0(bArr, iB6, vw3Var);
                    tjxVar.c(vw3Var.f38129a);
                }
                if (iB6 == i11) {
                    return iB6;
                }
                throw ynx.h();
            case 23:
            case 32:
            case 40:
            case 46:
                if (i4 == 2) {
                    x610 x610Var3 = (x610) zlxVar;
                    int iB7 = b34.b0(bArr, i, vw3Var);
                    int i12 = vw3Var.f38129a + iB7;
                    while (iB7 < i12) {
                        x610Var3.c(b34.V(bArr, iB7));
                        iB7 += 8;
                    }
                    if (iB7 == i12) {
                        return iB7;
                    }
                    throw ynx.h();
                }
                if (i4 == 1) {
                    x610 x610Var4 = (x610) zlxVar;
                    x610Var4.c(b34.V(bArr, i));
                    int i13 = i + 8;
                    while (i13 < i2) {
                        int iB8 = b34.b0(bArr, i13, vw3Var);
                        if (i3 != vw3Var.f38129a) {
                            return i13;
                        }
                        x610Var4.c(b34.V(bArr, iB8));
                        i13 = iB8 + 8;
                    }
                    return i13;
                }
                return i;
            case 24:
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
            case 41:
            case 45:
                if (i4 == 2) {
                    tjx tjxVar2 = (tjx) zlxVar;
                    int iB9 = b34.b0(bArr, i, vw3Var);
                    int i14 = vw3Var.f38129a + iB9;
                    while (iB9 < i14) {
                        tjxVar2.c(b34.U(bArr, iB9));
                        iB9 += 4;
                    }
                    if (iB9 == i14) {
                        return iB9;
                    }
                    throw ynx.h();
                }
                if (i4 == 5) {
                    tjx tjxVar3 = (tjx) zlxVar;
                    tjxVar3.c(b34.U(bArr, i));
                    int i15 = i + 4;
                    while (i15 < i2) {
                        int iB10 = b34.b0(bArr, i15, vw3Var);
                        if (i3 != vw3Var.f38129a) {
                            return i15;
                        }
                        tjxVar3.c(b34.U(bArr, iB10));
                        i15 = iB10 + 4;
                    }
                    return i15;
                }
                return i;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            case 42:
                if (i4 == 2) {
                    mm8 mm8Var = (mm8) zlxVar;
                    int iB11 = b34.b0(bArr, i, vw3Var);
                    int i16 = vw3Var.f38129a + iB11;
                    while (iB11 < i16) {
                        iB11 = b34.d0(bArr, iB11, vw3Var);
                        mm8Var.c(vw3Var.b != 0);
                    }
                    if (iB11 == i16) {
                        return iB11;
                    }
                    throw ynx.h();
                }
                if (i4 == 0) {
                    mm8 mm8Var2 = (mm8) zlxVar;
                    int iD1 = b34.d0(bArr, i, vw3Var);
                    mm8Var2.c(vw3Var.b != 0);
                    while (iD1 < i2) {
                        int iB12 = b34.b0(bArr, iD1, vw3Var);
                        if (i3 != vw3Var.f38129a) {
                            return iD1;
                        }
                        iD1 = b34.d0(bArr, iB12, vw3Var);
                        mm8Var2.c(vw3Var.b != 0);
                    }
                    return iD1;
                }
                return i;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                if (i4 == 2) {
                    if ((j & 536870912) == 0) {
                        int iB13 = b34.b0(bArr, i, vw3Var);
                        int i17 = vw3Var.f38129a;
                        if (i17 < 0) {
                            throw ynx.f();
                        }
                        if (i17 == 0) {
                            zlxVar.add("");
                        } else {
                            zlxVar.add(new String(bArr, iB13, i17, cmx.f4629a));
                            iB13 += i17;
                        }
                        while (iB13 < i2) {
                            int iB14 = b34.b0(bArr, iB13, vw3Var);
                            if (i3 != vw3Var.f38129a) {
                                return iB13;
                            }
                            iB13 = b34.b0(bArr, iB14, vw3Var);
                            int i18 = vw3Var.f38129a;
                            if (i18 < 0) {
                                throw ynx.f();
                            }
                            if (i18 == 0) {
                                zlxVar.add("");
                            } else {
                                zlxVar.add(new String(bArr, iB13, i18, cmx.f4629a));
                                iB13 += i18;
                            }
                        }
                        return iB13;
                    }
                    int iB15 = b34.b0(bArr, i, vw3Var);
                    int i19 = vw3Var.f38129a;
                    if (i19 < 0) {
                        throw ynx.f();
                    }
                    if (i19 == 0) {
                        zlxVar.add("");
                    } else {
                        int i20 = iB15 + i19;
                        if (!ptt0.f27581a.n(bArr, iB15, i20)) {
                            throw ynx.b();
                        }
                        zlxVar.add(new String(bArr, iB15, i19, cmx.f4629a));
                        iB15 = i20;
                    }
                    while (iB15 < i2) {
                        int iB16 = b34.b0(bArr, iB15, vw3Var);
                        if (i3 != vw3Var.f38129a) {
                            return iB15;
                        }
                        iB15 = b34.b0(bArr, iB16, vw3Var);
                        int i21 = vw3Var.f38129a;
                        if (i21 < 0) {
                            throw ynx.f();
                        }
                        if (i21 == 0) {
                            zlxVar.add("");
                        } else {
                            int i22 = iB15 + i21;
                            if (!ptt0.f27581a.n(bArr, iB15, i22)) {
                                throw ynx.b();
                            }
                            zlxVar.add(new String(bArr, iB15, i21, cmx.f4629a));
                            iB15 = i22;
                        }
                    }
                    return iB15;
                }
                return i;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                if (i4 == 2) {
                    return b34.W(p(i5), i3, bArr, i, i2, zlxVar, vw3Var);
                }
                return i;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                if (i4 == 2) {
                    int iB17 = b34.b0(bArr, i, vw3Var);
                    int i23 = vw3Var.f38129a;
                    if (i23 < 0) {
                        throw ynx.f();
                    }
                    if (i23 > bArr.length - iB17) {
                        throw ynx.h();
                    }
                    if (i23 == 0) {
                        zlxVar.add(og9.b);
                    } else {
                        zlxVar.add(og9.f(bArr, iB17, i23));
                        iB17 += i23;
                    }
                    while (iB17 < i2) {
                        int iB18 = b34.b0(bArr, iB17, vw3Var);
                        if (i3 != vw3Var.f38129a) {
                            return iB17;
                        }
                        iB17 = b34.b0(bArr, iB18, vw3Var);
                        int i24 = vw3Var.f38129a;
                        if (i24 < 0) {
                            throw ynx.f();
                        }
                        if (i24 > bArr.length - iB17) {
                            throw ynx.h();
                        }
                        if (i24 == 0) {
                            zlxVar.add(og9.b);
                        } else {
                            zlxVar.add(og9.f(bArr, iB17, i24));
                            iB17 += i24;
                        }
                    }
                    return iB17;
                }
                return i;
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
            case 44:
                if (i4 != 2) {
                    if (i4 == 0) {
                        iC0 = b34.c0(i3, bArr, i, i2, zlxVar, vw3Var);
                    }
                    return i;
                }
                tjx tjxVar4 = (tjx) zlxVar;
                iC0 = b34.b0(bArr, i, vw3Var);
                int i25 = vw3Var.f38129a + iC0;
                while (iC0 < i25) {
                    iC0 = b34.b0(bArr, iC0, vw3Var);
                    tjxVar4.c(vw3Var.f38129a);
                }
                if (iC0 != i25) {
                    throw ynx.h();
                }
                n(i5);
                Class cls = w2h0.f38448a;
                return iC0;
            case 33:
            case 47:
                if (i4 == 2) {
                    tjx tjxVar5 = (tjx) zlxVar;
                    int iB19 = b34.b0(bArr, i, vw3Var);
                    int i26 = vw3Var.f38129a + iB19;
                    while (iB19 < i26) {
                        iB19 = b34.b0(bArr, iB19, vw3Var);
                        tjxVar5.c(oyc.b(vw3Var.f38129a));
                    }
                    if (iB19 == i26) {
                        return iB19;
                    }
                    throw ynx.h();
                }
                if (i4 == 0) {
                    tjx tjxVar6 = (tjx) zlxVar;
                    int iB20 = b34.b0(bArr, i, vw3Var);
                    tjxVar6.c(oyc.b(vw3Var.f38129a));
                    while (iB20 < i2) {
                        int iB21 = b34.b0(bArr, iB20, vw3Var);
                        if (i3 != vw3Var.f38129a) {
                            return iB20;
                        }
                        iB20 = b34.b0(bArr, iB21, vw3Var);
                        tjxVar6.c(oyc.b(vw3Var.f38129a));
                    }
                    return iB20;
                }
                return i;
            case 34:
            case 48:
                if (i4 == 2) {
                    x610 x610Var5 = (x610) zlxVar;
                    int iB22 = b34.b0(bArr, i, vw3Var);
                    int i27 = vw3Var.f38129a + iB22;
                    while (iB22 < i27) {
                        iB22 = b34.d0(bArr, iB22, vw3Var);
                        x610Var5.c(oyc.c(vw3Var.b));
                    }
                    if (iB22 == i27) {
                        return iB22;
                    }
                    throw ynx.h();
                }
                if (i4 == 0) {
                    x610 x610Var6 = (x610) zlxVar;
                    int iD2 = b34.d0(bArr, i, vw3Var);
                    x610Var6.c(oyc.c(vw3Var.b));
                    while (iD2 < i2) {
                        int iB23 = b34.b0(bArr, iD2, vw3Var);
                        if (i3 != vw3Var.f38129a) {
                            return iD2;
                        }
                        iD2 = b34.d0(bArr, iB23, vw3Var);
                        x610Var6.c(oyc.c(vw3Var.b));
                    }
                    return iD2;
                }
                return i;
            case 49:
                if (i4 == 3) {
                    o2h0 o2h0VarP = p(i5);
                    int i28 = (i3 & (-8)) | 4;
                    Object objD = o2h0VarP.d();
                    o640 o640Var = (o640) o2h0VarP;
                    int iE = o640Var.E(objD, bArr, i, i2, i28, vw3Var);
                    vw3Var.c = objD;
                    o2h0VarP.b(objD);
                    vw3Var.c = objD;
                    zlxVar.add(objD);
                    while (iE < i2) {
                        int iB24 = b34.b0(bArr, iE, vw3Var);
                        if (i3 != vw3Var.f38129a) {
                            return iE;
                        }
                        Object objD2 = o2h0VarP.d();
                        iE = o640Var.E(objD2, bArr, iB24, i2, i28, vw3Var);
                        vw3Var.c = objD2;
                        o2h0VarP.b(objD2);
                        vw3Var.c = objD2;
                        zlxVar.add(objD2);
                    }
                    return iE;
                }
                return i;
            default:
                return i;
        }
    }

    public final void G(Object obj, long j, hu5 hu5Var, o2h0 o2h0Var, qso qsoVar) throws vnx {
        int iC;
        List listC = this.l.c(obj, j);
        oyc oycVar = (oyc) hu5Var.e;
        int i = hu5Var.b;
        if ((i & 7) != 3) {
            throw ynx.d();
        }
        do {
            Object objD = o2h0Var.d();
            hu5Var.h(objD, o2h0Var, qsoVar);
            o2h0Var.b(objD);
            listC.add(objD);
            if (oycVar.e() || hu5Var.d != 0) {
                return;
            } else {
                iC = oycVar.C();
            }
        } while (iC == i);
        hu5Var.d = iC;
    }

    public final void H(Object obj, int i, hu5 hu5Var, o2h0 o2h0Var, qso qsoVar) throws ynx {
        int iC;
        List listC = this.l.c(obj, i & 1048575);
        oyc oycVar = (oyc) hu5Var.e;
        int i2 = hu5Var.b;
        if ((i2 & 7) != 2) {
            throw ynx.d();
        }
        do {
            Object objD = o2h0Var.d();
            hu5Var.j(objD, o2h0Var, qsoVar);
            o2h0Var.b(objD);
            listC.add(objD);
            if (oycVar.e() || hu5Var.d != 0) {
                return;
            } else {
                iC = oycVar.C();
            }
        } while (iC == i2);
        hu5Var.d = iC;
    }

    public final void I(int i, hu5 hu5Var, Object obj) throws xnx, vnx {
        if ((536870912 & i) != 0) {
            hu5Var.W(2);
            hft0.q(obj, i & 1048575, ((oyc) hu5Var.e).B());
        } else if (!this.f) {
            hft0.q(obj, i & 1048575, hu5Var.o());
        } else {
            hu5Var.W(2);
            hft0.q(obj, i & 1048575, ((oyc) hu5Var.e).A());
        }
    }

    public final void K(int i, Object obj) {
        int i2 = this.f24717a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        hft0.o(obj, (1 << (i2 >>> 20)) | hft0.h(obj, j), j);
    }

    public final void L(int i, int i2, Object obj) {
        hft0.o(obj, i, this.f24717a[i2 + 2] & 1048575);
    }

    public final int M(int i, int i2) {
        int[] iArr = this.f24717a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final void N(int i, Object obj, Object obj2) {
        p.putObject(obj, Q(i) & 1048575, obj2);
        K(i, obj);
    }

    public final void O(Object obj, int i, int i2, Object obj2) {
        p.putObject(obj, Q(i2) & 1048575, obj2);
        L(i, i2, obj);
    }

    public final int Q(int i) {
        return this.f24717a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // a.o2h0
    public final void a(Object obj, Object obj2) {
        Object obj3;
        l(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f24717a;
            if (i >= iArr.length) {
                w2h0.w(this.m, obj, obj2);
                return;
            }
            int iQ = Q(i);
            long j = 1048575 & iQ;
            int i2 = iArr[i];
            switch (P(iQ)) {
                case 0:
                    if (!q(i, obj2)) {
                        obj3 = obj;
                    } else {
                        gft0 gft0Var = hft0.c;
                        obj3 = obj;
                        gft0Var.g(obj3, j, gft0Var.c(obj2, j));
                        K(i, obj3);
                    }
                    break;
                case 1:
                    if (q(i, obj2)) {
                        gft0 gft0Var2 = hft0.c;
                        gft0Var2.h(obj, j, gft0Var2.d(obj2, j));
                        K(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (q(i, obj2)) {
                        hft0.p(obj, j, hft0.i(obj2, j));
                        K(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (q(i, obj2)) {
                        hft0.p(obj, j, hft0.i(obj2, j));
                        K(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (q(i, obj2)) {
                        hft0.o(obj, hft0.h(obj2, j), j);
                        K(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (q(i, obj2)) {
                        hft0.p(obj, j, hft0.i(obj2, j));
                        K(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (q(i, obj2)) {
                        hft0.o(obj, hft0.h(obj2, j), j);
                        K(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (q(i, obj2)) {
                        gft0 gft0Var3 = hft0.c;
                        gft0Var3.e(obj, j, gft0Var3.a(obj2, j));
                        K(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (q(i, obj2)) {
                        hft0.q(obj, j, hft0.j(obj2, j));
                        K(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    u(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (q(i, obj2)) {
                        hft0.q(obj, j, hft0.j(obj2, j));
                        K(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (q(i, obj2)) {
                        hft0.o(obj, hft0.h(obj2, j), j);
                        K(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (q(i, obj2)) {
                        hft0.o(obj, hft0.h(obj2, j), j);
                        K(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (q(i, obj2)) {
                        hft0.o(obj, hft0.h(obj2, j), j);
                        K(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (q(i, obj2)) {
                        hft0.p(obj, j, hft0.i(obj2, j));
                        K(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (q(i, obj2)) {
                        hft0.o(obj, hft0.h(obj2, j), j);
                        K(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (q(i, obj2)) {
                        hft0.p(obj, j, hft0.i(obj2, j));
                        K(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    u(i, obj, obj2);
                    obj3 = obj;
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
                    this.l.b(obj, j, obj2);
                    obj3 = obj;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Class cls = w2h0.f38448a;
                    Object objJ = hft0.j(obj, j);
                    Object objJ2 = hft0.j(obj2, j);
                    this.n.getClass();
                    hft0.q(obj, j, xo20.b(objJ, objJ2));
                    obj3 = obj;
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
                    if (s(i2, i, obj2)) {
                        hft0.q(obj, j, hft0.j(obj2, j));
                        L(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    v(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (s(i2, i, obj2)) {
                        hft0.q(obj, j, hft0.j(obj2, j));
                        L(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    v(i, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i += 3;
            obj = obj3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0051  */
    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    /* JADX WARN: Code duplicated, block: B:29:0x0062 A[SYNTHETIC] */
    @Override // a.o2h0
    public final void b(Object obj) {
        if (r(obj)) {
            if (obj instanceof jjt) {
                jjt jjtVar = (jjt) obj;
                jjtVar.v(Integer.MAX_VALUE);
                jjtVar.memoizedHashCode = 0;
                jjtVar.p();
            }
            int length = this.f24717a.length;
            for (int i = 0; i < length; i += 3) {
                int iQ = Q(i);
                long j = 1048575 & iQ;
                int iP = P(iQ);
                Unsafe unsafe = p;
                if (iP != 9) {
                    switch (iP) {
                        case 17:
                            if (q(i, obj)) {
                                p(i).b(unsafe.getObject(obj, j));
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
                            this.l.a(obj, j);
                            break;
                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                this.n.getClass();
                                ((uo20) object).f35991a = false;
                                unsafe.putObject(obj, j, object);
                            }
                            break;
                    }
                } else if (q(i, obj)) {
                    p(i).b(unsafe.getObject(obj, j));
                }
            }
            this.m.getClass();
            ((jjt) obj).unknownFields.e = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d2  */
    @Override // a.o2h0
    public final boolean c(Object obj) {
        int iP;
        int i = 1048575;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean zQ = true;
            if (i2 >= this.i) {
                return true;
            }
            int i4 = this.h[i2];
            int[] iArr = this.f24717a;
            int i5 = iArr[i4];
            int iQ = Q(i4);
            int i6 = iArr[i4 + 2];
            int i7 = i6 & 1048575;
            int i8 = 1 << (i6 >>> 20);
            if (i7 != i) {
                if (i7 != 1048575) {
                    i3 = p.getInt(obj, i7);
                }
                i = i7;
            }
            if ((268435456 & iQ) == 0) {
                iP = P(iQ);
                if (iP != 9 || iP == 17) {
                    if (i == 1048575) {
                        zQ = q(i4, obj);
                    } else if ((i8 & i3) == 0) {
                        zQ = false;
                    }
                    if (!zQ || p(i4).c(hft0.j(obj, iQ & 1048575))) {
                        i2++;
                    }
                } else {
                    if (iP != 27) {
                        if (iP == 60 || iP == 68) {
                            if (!s(i5, i4, obj) || p(i4).c(hft0.j(obj, iQ & 1048575))) {
                            }
                        } else if (iP != 49) {
                            if (iP != 50) {
                                continue;
                            } else {
                                Object objJ = hft0.j(obj, iQ & 1048575);
                                this.n.getClass();
                                if (!((uo20) objJ).isEmpty()) {
                                    rw2.w(o(i4));
                                    throw null;
                                }
                            }
                        }
                        i2++;
                    }
                    List list = (List) hft0.j(obj, iQ & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        o2h0 o2h0VarP = p(i4);
                        for (int i9 = 0; i9 < list.size(); i9++) {
                            if (o2h0VarP.c(list.get(i9))) {
                            }
                        }
                    }
                    i2++;
                }
            } else {
                if (i == 1048575 ? q(i4, obj) : (i3 & i8) != 0) {
                    iP = P(iQ);
                    if (iP != 9) {
                    }
                    if (i == 1048575) {
                        zQ = q(i4, obj);
                    } else if ((i8 & i3) == 0) {
                        zQ = false;
                    }
                    if (!zQ) {
                        continue;
                    }
                    i2++;
                }
            }
            return false;
        }
    }

    @Override // a.o2h0
    public final Object d() {
        this.k.getClass();
        return ((jjt) this.e).r();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:191:0x0767 A[PHI: r9
  0x0767: PHI (r9v49 boolean) = 
  (r9v5 boolean)
  (r9v5 boolean)
  (r9v6 boolean)
  (r9v6 boolean)
  (r9v7 boolean)
  (r9v8 boolean)
  (r9v10 boolean)
  (r9v11 boolean)
  (r9v12 boolean)
  (r9v14 boolean)
  (r9v15 boolean)
  (r9v16 boolean)
  (r9v17 boolean)
  (r9v18 boolean)
  (r9v19 boolean)
  (r9v20 boolean)
  (r9v21 boolean)
  (r9v22 boolean)
  (r9v23 boolean)
  (r9v24 boolean)
  (r9v25 boolean)
  (r9v26 boolean)
  (r9v27 boolean)
  (r9v28 boolean)
  (r9v44 boolean)
  (r9v45 boolean)
  (r9v45 boolean)
  (r9v46 boolean)
  (r9v48 boolean)
  (r9v50 boolean)
 binds: [B:313:0x0b39, B:314:0x0b3b, B:310:0x0b29, B:311:0x0b2b, B:308:0x0b24, B:307:0x0b17, B:285:0x0aa9, B:283:0x0a9a, B:273:0x0a64, B:271:0x0a4e, B:265:0x0a2d, B:264:0x0a1f, B:263:0x0a11, B:262:0x0a03, B:261:0x09f5, B:260:0x09e7, B:259:0x09d9, B:258:0x09cb, B:254:0x0992, B:253:0x0984, B:252:0x0976, B:251:0x0968, B:250:0x095a, B:249:0x094c, B:220:0x0816, B:217:0x0803, B:218:0x0805, B:215:0x07f1, B:193:0x076e, B:190:0x075c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // a.o2h0
    public final void e(Object obj, psc pscVar) throws l52 {
        int i;
        boolean z;
        char c;
        boolean z2;
        boolean z3;
        int i2;
        pscVar.getClass();
        ryc rycVar = (ryc) pscVar.b;
        zdt0 zdt0Var = this.m;
        xo20 xo20Var = this.n;
        int i3 = 1048575;
        boolean z4 = true;
        boolean z5 = this.g;
        int[] iArr = this.f24717a;
        if (z5) {
            int length = iArr.length;
            int i4 = 0;
            while (i4 < length) {
                int iQ = Q(i4);
                int i5 = iArr[i4];
                switch (P(iQ)) {
                    case 0:
                        i2 = i3;
                        if (q(i4, obj)) {
                            long jDoubleToRawLongBits = Double.doubleToRawLongBits(hft0.c.c(obj, iQ & i2));
                            rycVar.p(i5, 1);
                            rycVar.n(jDoubleToRawLongBits);
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 1:
                        i2 = i3;
                        if (q(i4, obj)) {
                            int iFloatToRawIntBits = Float.floatToRawIntBits(hft0.c.d(obj, iQ & i2));
                            rycVar.p(i5, 5);
                            rycVar.m(iFloatToRawIntBits);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 2:
                        i2 = i3;
                        if (q(i4, obj)) {
                            long jI = hft0.i(obj, iQ & i2);
                            rycVar.p(i5, 0);
                            rycVar.r(jI);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 3:
                        i2 = i3;
                        if (q(i4, obj)) {
                            long jI2 = hft0.i(obj, iQ & i2);
                            rycVar.p(i5, 0);
                            rycVar.r(jI2);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 4:
                        i2 = i3;
                        if (q(i4, obj)) {
                            int iH = hft0.h(obj, iQ & i2);
                            rycVar.p(i5, 0);
                            rycVar.o(iH);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 5:
                        i2 = i3;
                        if (q(i4, obj)) {
                            long jI3 = hft0.i(obj, iQ & i2);
                            rycVar.p(i5, 1);
                            rycVar.n(jI3);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 6:
                        i2 = i3;
                        if (q(i4, obj)) {
                            int iH2 = hft0.h(obj, iQ & i2);
                            rycVar.p(i5, 5);
                            rycVar.m(iH2);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 7:
                        i2 = i3;
                        if (q(i4, obj)) {
                            boolean zA = hft0.c.a(obj, iQ & i2);
                            rycVar.p(i5, 0);
                            rycVar.k(zA ? (byte) 1 : (byte) 0);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 8:
                        i2 = i3;
                        if (q(i4, obj)) {
                            R(i5, hft0.j(obj, iQ & i2), pscVar);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 9:
                        i2 = i3;
                        if (q(i4, obj)) {
                            pscVar.r(i5, hft0.j(obj, iQ & i2), p(i4));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 10:
                        i2 = i3;
                        if (q(i4, obj)) {
                            pscVar.p(i5, (og9) hft0.j(obj, iQ & i2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 11:
                        i2 = i3;
                        if (q(i4, obj)) {
                            int iH3 = hft0.h(obj, iQ & i2);
                            rycVar.p(i5, 0);
                            rycVar.q(iH3);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 12:
                        i2 = i3;
                        if (q(i4, obj)) {
                            int iH4 = hft0.h(obj, iQ & i2);
                            rycVar.p(i5, 0);
                            rycVar.o(iH4);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 13:
                        i2 = i3;
                        if (q(i4, obj)) {
                            int iH5 = hft0.h(obj, iQ & i2);
                            rycVar.p(i5, 5);
                            rycVar.m(iH5);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 14:
                        i2 = i3;
                        if (q(i4, obj)) {
                            long jI4 = hft0.i(obj, iQ & i2);
                            rycVar.p(i5, 1);
                            rycVar.n(jI4);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 15:
                        i2 = i3;
                        if (q(i4, obj)) {
                            int iH6 = hft0.h(obj, iQ & i2);
                            rycVar.p(i5, 0);
                            rycVar.q((iH6 >> 31) ^ (iH6 << 1));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 16:
                        i2 = i3;
                        if (q(i4, obj)) {
                            long jI5 = hft0.i(obj, iQ & i2);
                            rycVar.p(i5, 0);
                            rycVar.r((jI5 << 1) ^ (jI5 >> 63));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 17:
                        i2 = i3;
                        if (q(i4, obj)) {
                            pscVar.q(i5, hft0.j(obj, iQ & i2), p(i4));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 18:
                        i2 = i3;
                        w2h0.A(iArr[i4], (List) hft0.j(obj, iQ & i2), pscVar, false);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                        i2 = i3;
                        w2h0.E(iArr[i4], (List) hft0.j(obj, iQ & i2), pscVar, false);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 20:
                        i2 = i3;
                        w2h0.H(iArr[i4], (List) hft0.j(obj, iQ & i2), pscVar, false);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 21:
                        i2 = i3;
                        w2h0.P(iArr[i4], (List) hft0.j(obj, iQ & i2), pscVar, false);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 22:
                        i2 = i3;
                        w2h0.G(iArr[i4], (List) hft0.j(obj, iQ & i2), pscVar, false);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 23:
                        i2 = i3;
                        w2h0.D(iArr[i4], (List) hft0.j(obj, iQ & i2), pscVar, false);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 24:
                        i2 = i3;
                        w2h0.C(iArr[i4], (List) hft0.j(obj, iQ & i2), pscVar, false);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        i2 = i3;
                        w2h0.y(iArr[i4], (List) hft0.j(obj, iQ & i2), pscVar, false);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        i2 = i3;
                        w2h0.N(iArr[i4], (List) hft0.j(obj, iQ & i2), pscVar);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        i2 = i3;
                        w2h0.I(iArr[i4], (List) hft0.j(obj, iQ & i2), pscVar, p(i4));
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        i2 = i3;
                        w2h0.z(iArr[i4], (List) hft0.j(obj, iQ & i2), pscVar);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case AvailableCode.HMS_IS_SPOOF /* 29 */:
                        i2 = i3;
                        w2h0.O(iArr[i4], (List) hft0.j(obj, iQ & i2), pscVar, false);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                        i2 = i3;
                        w2h0.B(iArr[i4], (List) hft0.j(obj, iQ & i2), pscVar, false);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                        i2 = i3;
                        w2h0.J(iArr[i4], (List) hft0.j(obj, iQ & i2), pscVar, false);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 32:
                        i2 = i3;
                        w2h0.K(iArr[i4], (List) hft0.j(obj, iQ & i2), pscVar, false);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 33:
                        i2 = i3;
                        w2h0.L(iArr[i4], (List) hft0.j(obj, iQ & i2), pscVar, false);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 34:
                        i2 = i3;
                        w2h0.M(iArr[i4], (List) hft0.j(obj, iQ & i2), pscVar, false);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 35:
                        i2 = i3;
                        w2h0.A(iArr[i4], (List) hft0.j(obj, iQ & i2), pscVar, true);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 36:
                        i2 = i3;
                        w2h0.E(iArr[i4], (List) hft0.j(obj, iQ & i2), pscVar, true);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 37:
                        i2 = i3;
                        w2h0.H(iArr[i4], (List) hft0.j(obj, iQ & i2), pscVar, true);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 38:
                        i2 = i3;
                        w2h0.P(iArr[i4], (List) hft0.j(obj, iQ & i2), pscVar, true);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 39:
                        i2 = i3;
                        w2h0.G(iArr[i4], (List) hft0.j(obj, iQ & i2), pscVar, true);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 40:
                        i2 = i3;
                        w2h0.D(iArr[i4], (List) hft0.j(obj, iQ & i2), pscVar, true);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 41:
                        i2 = i3;
                        w2h0.C(iArr[i4], (List) hft0.j(obj, iQ & i2), pscVar, true);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 42:
                        i2 = i3;
                        w2h0.y(iArr[i4], (List) hft0.j(obj, iQ & i2), pscVar, true);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 43:
                        i2 = i3;
                        w2h0.O(iArr[i4], (List) hft0.j(obj, iQ & i2), pscVar, true);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 44:
                        i2 = i3;
                        w2h0.B(iArr[i4], (List) hft0.j(obj, iQ & i2), pscVar, true);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 45:
                        i2 = i3;
                        w2h0.J(iArr[i4], (List) hft0.j(obj, iQ & i2), pscVar, true);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 46:
                        i2 = i3;
                        w2h0.K(iArr[i4], (List) hft0.j(obj, iQ & i2), pscVar, true);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 47:
                        i2 = i3;
                        w2h0.L(iArr[i4], (List) hft0.j(obj, iQ & i2), pscVar, true);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 48:
                        i2 = i3;
                        w2h0.M(iArr[i4], (List) hft0.j(obj, iQ & i2), pscVar, true);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 49:
                        i2 = i3;
                        w2h0.F(iArr[i4], (List) hft0.j(obj, iQ & i2), pscVar, p(i4));
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                        i2 = i3;
                        if (hft0.j(obj, iQ & i2) != null) {
                            Object objO = o(i4);
                            xo20Var.getClass();
                            rw2.w(objO);
                            throw null;
                        }
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                        break;
                    case 51:
                        i2 = i3;
                        if (s(i5, i4, obj)) {
                            long jDoubleToRawLongBits2 = Double.doubleToRawLongBits(((Double) hft0.j(obj, iQ & i2)).doubleValue());
                            rycVar.p(i5, 1);
                            rycVar.n(jDoubleToRawLongBits2);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 52:
                        i2 = i3;
                        if (s(i5, i4, obj)) {
                            int iFloatToRawIntBits2 = Float.floatToRawIntBits(((Float) hft0.j(obj, iQ & i2)).floatValue());
                            rycVar.p(i5, 5);
                            rycVar.m(iFloatToRawIntBits2);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 53:
                        i2 = i3;
                        if (s(i5, i4, obj)) {
                            long jB = B(obj, iQ & i2);
                            rycVar.p(i5, 0);
                            rycVar.r(jB);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 54:
                        i2 = i3;
                        if (s(i5, i4, obj)) {
                            long jB2 = B(obj, iQ & i2);
                            rycVar.p(i5, 0);
                            rycVar.r(jB2);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 55:
                        i2 = i3;
                        if (s(i5, i4, obj)) {
                            int iA = A(obj, iQ & i2);
                            rycVar.p(i5, 0);
                            rycVar.o(iA);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 56:
                        i2 = i3;
                        if (s(i5, i4, obj)) {
                            long jB3 = B(obj, iQ & i2);
                            rycVar.p(i5, 1);
                            rycVar.n(jB3);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 57:
                        i2 = i3;
                        if (s(i5, i4, obj)) {
                            int iA2 = A(obj, iQ & i2);
                            rycVar.p(i5, 5);
                            rycVar.m(iA2);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 58:
                        i2 = i3;
                        if (s(i5, i4, obj)) {
                            boolean zBooleanValue = ((Boolean) hft0.j(obj, iQ & i2)).booleanValue();
                            rycVar.p(i5, 0);
                            rycVar.k(zBooleanValue ? (byte) 1 : (byte) 0);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 59:
                        i2 = i3;
                        if (s(i5, i4, obj)) {
                            R(i5, hft0.j(obj, iQ & i2), pscVar);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 60:
                        i2 = i3;
                        if (s(i5, i4, obj)) {
                            pscVar.r(i5, hft0.j(obj, iQ & i2), p(i4));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 61:
                        i2 = i3;
                        if (s(i5, i4, obj)) {
                            pscVar.p(i5, (og9) hft0.j(obj, iQ & i2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 62:
                        i2 = i3;
                        if (s(i5, i4, obj)) {
                            int iA3 = A(obj, iQ & i2);
                            rycVar.p(i5, 0);
                            rycVar.q(iA3);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 63:
                        i2 = i3;
                        if (s(i5, i4, obj)) {
                            int iA4 = A(obj, iQ & i2);
                            rycVar.p(i5, 0);
                            rycVar.o(iA4);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 64:
                        i2 = i3;
                        if (s(i5, i4, obj)) {
                            int iA5 = A(obj, iQ & i2);
                            rycVar.p(i5, 5);
                            rycVar.m(iA5);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 65:
                        i2 = i3;
                        if (s(i5, i4, obj)) {
                            long jB4 = B(obj, iQ & i2);
                            rycVar.p(i5, 1);
                            rycVar.n(jB4);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 66:
                        i2 = i3;
                        if (s(i5, i4, obj)) {
                            int iA6 = A(obj, iQ & i2);
                            rycVar.p(i5, 0);
                            rycVar.q((iA6 >> 31) ^ (iA6 << 1));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 67:
                        i2 = i3;
                        if (s(i5, i4, obj)) {
                            long jB5 = B(obj, iQ & i2);
                            rycVar.p(i5, 0);
                            rycVar.r((jB5 << 1) ^ (jB5 >> 63));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 68:
                        if (s(i5, i4, obj)) {
                            i2 = i3;
                            pscVar.q(i5, hft0.j(obj, iQ & i3), p(i4));
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                }
                i2 = i3;
                i4 += 3;
                i3 = i2;
            }
            zdt0Var.getClass();
            ((jjt) obj).unknownFields.e(pscVar);
            return;
        }
        int length2 = iArr.length;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1048575;
        while (i6 < length2) {
            int iQ2 = Q(i6);
            int i9 = iArr[i6];
            int iP = P(iQ2);
            boolean z6 = z4;
            Unsafe unsafe = p;
            if (iP <= 17) {
                int i10 = iArr[i6 + 2];
                int i11 = i10 & 1048575;
                if (i11 != i8) {
                    i7 = unsafe.getInt(obj, i11);
                    i8 = i11;
                }
                i = (z6 ? 1 : 0) << (i10 >>> 20);
            } else {
                i = 0;
            }
            long j = iQ2 & 1048575;
            switch (iP) {
                case 0:
                    z = false;
                    c = 5;
                    if ((i & i7) != 0) {
                        long jDoubleToRawLongBits3 = Double.doubleToRawLongBits(hft0.c.c(obj, j));
                        z2 = true;
                        rycVar.p(i9, 1);
                        rycVar.n(jDoubleToRawLongBits3);
                    } else {
                        z2 = true;
                    }
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 1:
                    z = false;
                    if ((i & i7) != 0) {
                        int iFloatToRawIntBits3 = Float.floatToRawIntBits(hft0.c.d(obj, j));
                        c = 5;
                        rycVar.p(i9, 5);
                        rycVar.m(iFloatToRawIntBits3);
                    } else {
                        c = 5;
                    }
                    z2 = true;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 2:
                    z = false;
                    if ((i & i7) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        rycVar.p(i9, 0);
                        rycVar.r(j2);
                    }
                    z2 = true;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 3:
                    z = false;
                    if ((i & i7) != 0) {
                        long j3 = unsafe.getLong(obj, j);
                        rycVar.p(i9, 0);
                        rycVar.r(j3);
                    }
                    z2 = true;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 4:
                    if ((i & i7) != 0) {
                        int i12 = unsafe.getInt(obj, j);
                        z = false;
                        rycVar.p(i9, 0);
                        rycVar.o(i12);
                    } else {
                        z = false;
                    }
                    z2 = true;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 5:
                    if ((i & i7) != 0) {
                        long j4 = unsafe.getLong(obj, j);
                        rycVar.p(i9, 1);
                        rycVar.n(j4);
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 6:
                    if ((i & i7) != 0) {
                        int i13 = unsafe.getInt(obj, j);
                        rycVar.p(i9, 5);
                        rycVar.m(i13);
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 7:
                    if ((i & i7) != 0) {
                        boolean zA2 = hft0.c.a(obj, j);
                        rycVar.p(i9, 0);
                        rycVar.k(zA2 ? (byte) 1 : (byte) 0);
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 8:
                    if ((i & i7) != 0) {
                        R(i9, unsafe.getObject(obj, j), pscVar);
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 9:
                    if ((i & i7) != 0) {
                        pscVar.r(i9, unsafe.getObject(obj, j), p(i6));
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 10:
                    if ((i & i7) != 0) {
                        pscVar.p(i9, (og9) unsafe.getObject(obj, j));
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 11:
                    z = false;
                    if ((i & i7) != 0) {
                        int i14 = unsafe.getInt(obj, j);
                        rycVar.p(i9, 0);
                        rycVar.q(i14);
                        z2 = true;
                        z = false;
                    } else {
                        z2 = true;
                    }
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 12:
                    if ((i & i7) != 0) {
                        int i15 = unsafe.getInt(obj, j);
                        z = false;
                        rycVar.p(i9, 0);
                        rycVar.o(i15);
                        z2 = true;
                        c = 5;
                        i6 += 3;
                        zdt0Var = zdt0Var;
                        length2 = length2;
                        z4 = z2;
                        xo20Var = xo20Var;
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 13:
                    if ((i & i7) != 0) {
                        int i16 = unsafe.getInt(obj, j);
                        rycVar.p(i9, 5);
                        rycVar.m(i16);
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 14:
                    if ((i & i7) != 0) {
                        long j5 = unsafe.getLong(obj, j);
                        rycVar.p(i9, 1);
                        rycVar.n(j5);
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 15:
                    z = false;
                    if ((i & i7) != 0) {
                        int i17 = unsafe.getInt(obj, j);
                        rycVar.p(i9, 0);
                        rycVar.q((i17 >> 31) ^ (i17 << 1));
                        z2 = true;
                        z = false;
                    } else {
                        z2 = true;
                    }
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 16:
                    if ((i & i7) != 0) {
                        long j6 = unsafe.getLong(obj, j);
                        z = false;
                        rycVar.p(i9, 0);
                        rycVar.r((j6 >> 63) ^ (j6 << 1));
                        z2 = true;
                        c = 5;
                        i6 += 3;
                        zdt0Var = zdt0Var;
                        length2 = length2;
                        z4 = z2;
                        xo20Var = xo20Var;
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 17:
                    if ((i & i7) != 0) {
                        pscVar.q(i9, unsafe.getObject(obj, j), p(i6));
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 18:
                    z = false;
                    w2h0.A(iArr[i6], (List) unsafe.getObject(obj, j), pscVar, false);
                    z2 = true;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    z = false;
                    w2h0.E(iArr[i6], (List) unsafe.getObject(obj, j), pscVar, false);
                    z2 = true;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 20:
                    z = false;
                    w2h0.H(iArr[i6], (List) unsafe.getObject(obj, j), pscVar, false);
                    z2 = true;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 21:
                    z = false;
                    w2h0.P(iArr[i6], (List) unsafe.getObject(obj, j), pscVar, false);
                    z2 = true;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 22:
                    z = false;
                    w2h0.G(iArr[i6], (List) unsafe.getObject(obj, j), pscVar, false);
                    z2 = true;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 23:
                    z = false;
                    w2h0.D(iArr[i6], (List) unsafe.getObject(obj, j), pscVar, false);
                    z2 = true;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 24:
                    z = false;
                    w2h0.C(iArr[i6], (List) unsafe.getObject(obj, j), pscVar, false);
                    z2 = true;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    z = false;
                    w2h0.y(iArr[i6], (List) unsafe.getObject(obj, j), pscVar, false);
                    z2 = true;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    w2h0.N(iArr[i6], (List) unsafe.getObject(obj, j), pscVar);
                    z2 = true;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    w2h0.I(iArr[i6], (List) unsafe.getObject(obj, j), pscVar, p(i6));
                    z2 = true;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    w2h0.z(iArr[i6], (List) unsafe.getObject(obj, j), pscVar);
                    z2 = true;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                    z = false;
                    w2h0.O(iArr[i6], (List) unsafe.getObject(obj, j), pscVar, false);
                    z2 = true;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                    z = false;
                    w2h0.B(iArr[i6], (List) unsafe.getObject(obj, j), pscVar, false);
                    z2 = true;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                    z = false;
                    w2h0.J(iArr[i6], (List) unsafe.getObject(obj, j), pscVar, false);
                    z2 = true;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 32:
                    z = false;
                    w2h0.K(iArr[i6], (List) unsafe.getObject(obj, j), pscVar, false);
                    z2 = true;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 33:
                    z = false;
                    w2h0.L(iArr[i6], (List) unsafe.getObject(obj, j), pscVar, false);
                    z2 = true;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 34:
                    z = false;
                    w2h0.M(iArr[i6], (List) unsafe.getObject(obj, j), pscVar, false);
                    z2 = true;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 35:
                    z3 = z6 ? 1 : 0;
                    w2h0.A(iArr[i6], (List) unsafe.getObject(obj, j), pscVar, z3);
                    z2 = z3;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 36:
                    z3 = z6 ? 1 : 0;
                    w2h0.E(iArr[i6], (List) unsafe.getObject(obj, j), pscVar, z3);
                    z2 = z3;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 37:
                    z3 = z6 ? 1 : 0;
                    w2h0.H(iArr[i6], (List) unsafe.getObject(obj, j), pscVar, z3);
                    z2 = z3;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 38:
                    z3 = z6 ? 1 : 0;
                    w2h0.P(iArr[i6], (List) unsafe.getObject(obj, j), pscVar, z3);
                    z2 = z3;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 39:
                    z3 = z6 ? 1 : 0;
                    w2h0.G(iArr[i6], (List) unsafe.getObject(obj, j), pscVar, z3);
                    z2 = z3;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 40:
                    z3 = z6 ? 1 : 0;
                    w2h0.D(iArr[i6], (List) unsafe.getObject(obj, j), pscVar, z3);
                    z2 = z3;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 41:
                    z3 = z6 ? 1 : 0;
                    w2h0.C(iArr[i6], (List) unsafe.getObject(obj, j), pscVar, z3);
                    z2 = z3;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 42:
                    z3 = z6 ? 1 : 0;
                    w2h0.y(iArr[i6], (List) unsafe.getObject(obj, j), pscVar, z3);
                    z2 = z3;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 43:
                    z3 = z6 ? 1 : 0;
                    w2h0.O(iArr[i6], (List) unsafe.getObject(obj, j), pscVar, z3);
                    z2 = z3;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 44:
                    z3 = z6 ? 1 : 0;
                    w2h0.B(iArr[i6], (List) unsafe.getObject(obj, j), pscVar, z3);
                    z2 = z3;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 45:
                    z3 = z6 ? 1 : 0;
                    w2h0.J(iArr[i6], (List) unsafe.getObject(obj, j), pscVar, z3);
                    z2 = z3;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 46:
                    z3 = z6 ? 1 : 0;
                    w2h0.K(iArr[i6], (List) unsafe.getObject(obj, j), pscVar, z3);
                    z2 = z3;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 47:
                    z3 = z6 ? 1 : 0;
                    w2h0.L(iArr[i6], (List) unsafe.getObject(obj, j), pscVar, z3);
                    z2 = z3;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 48:
                    z3 = true;
                    w2h0.M(iArr[i6], (List) unsafe.getObject(obj, j), pscVar, true);
                    z2 = z3;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 49:
                    w2h0.F(iArr[i6], (List) unsafe.getObject(obj, j), pscVar, p(i6));
                    z2 = true;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    if (unsafe.getObject(obj, j) != null) {
                        Object objO2 = o(i6);
                        xo20Var.getClass();
                        rw2.w(objO2);
                        throw null;
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 51:
                    if (s(i9, i6, obj)) {
                        long jDoubleToRawLongBits4 = Double.doubleToRawLongBits(((Double) hft0.j(obj, j)).doubleValue());
                        rycVar.p(i9, 1);
                        rycVar.n(jDoubleToRawLongBits4);
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 52:
                    if (s(i9, i6, obj)) {
                        int iFloatToRawIntBits4 = Float.floatToRawIntBits(((Float) hft0.j(obj, j)).floatValue());
                        rycVar.p(i9, 5);
                        rycVar.m(iFloatToRawIntBits4);
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 53:
                    z = false;
                    if (s(i9, i6, obj)) {
                        long jB6 = B(obj, j);
                        rycVar.p(i9, 0);
                        rycVar.r(jB6);
                        z2 = true;
                        z = false;
                    } else {
                        z2 = true;
                    }
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 54:
                    z = false;
                    if (s(i9, i6, obj)) {
                        long jB7 = B(obj, j);
                        rycVar.p(i9, 0);
                        rycVar.r(jB7);
                    }
                    z2 = true;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 55:
                    if (s(i9, i6, obj)) {
                        int iA7 = A(obj, j);
                        z = false;
                        rycVar.p(i9, 0);
                        rycVar.o(iA7);
                        z2 = true;
                        c = 5;
                        i6 += 3;
                        zdt0Var = zdt0Var;
                        length2 = length2;
                        z4 = z2;
                        xo20Var = xo20Var;
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 56:
                    if (s(i9, i6, obj)) {
                        long jB8 = B(obj, j);
                        rycVar.p(i9, 1);
                        rycVar.n(jB8);
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 57:
                    if (s(i9, i6, obj)) {
                        int iA8 = A(obj, j);
                        rycVar.p(i9, 5);
                        rycVar.m(iA8);
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 58:
                    if (s(i9, i6, obj)) {
                        boolean zBooleanValue2 = ((Boolean) hft0.j(obj, j)).booleanValue();
                        rycVar.p(i9, 0);
                        rycVar.k(zBooleanValue2 ? (byte) 1 : (byte) 0);
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 59:
                    if (s(i9, i6, obj)) {
                        R(i9, unsafe.getObject(obj, j), pscVar);
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 60:
                    if (s(i9, i6, obj)) {
                        pscVar.r(i9, unsafe.getObject(obj, j), p(i6));
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 61:
                    if (s(i9, i6, obj)) {
                        pscVar.p(i9, (og9) unsafe.getObject(obj, j));
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 62:
                    z = false;
                    if (s(i9, i6, obj)) {
                        int iA9 = A(obj, j);
                        rycVar.p(i9, 0);
                        rycVar.q(iA9);
                        z2 = true;
                        z = false;
                    } else {
                        z2 = true;
                    }
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 63:
                    if (s(i9, i6, obj)) {
                        int iA10 = A(obj, j);
                        z = false;
                        rycVar.p(i9, 0);
                        rycVar.o(iA10);
                        z2 = true;
                        c = 5;
                        i6 += 3;
                        zdt0Var = zdt0Var;
                        length2 = length2;
                        z4 = z2;
                        xo20Var = xo20Var;
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 64:
                    if (s(i9, i6, obj)) {
                        int iA11 = A(obj, j);
                        rycVar.p(i9, 5);
                        rycVar.m(iA11);
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 65:
                    if (s(i9, i6, obj)) {
                        long jB9 = B(obj, j);
                        rycVar.p(i9, z6 ? 1 : 0);
                        rycVar.n(jB9);
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 66:
                    z = false;
                    if (s(i9, i6, obj)) {
                        int iA12 = A(obj, j);
                        rycVar.p(i9, 0);
                        rycVar.q((iA12 >> 31) ^ (iA12 << 1));
                        z2 = z6 ? 1 : 0;
                        z = false;
                    } else {
                        z2 = z6 ? 1 : 0;
                    }
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 67:
                    if (s(i9, i6, obj)) {
                        long jB10 = B(obj, j);
                        long j7 = (jB10 >> 63) ^ (jB10 << (z6 ? 1L : 0L));
                        z = false;
                        rycVar.p(i9, 0);
                        rycVar.r(j7);
                        z2 = z6 ? 1 : 0;
                        c = 5;
                        i6 += 3;
                        zdt0Var = zdt0Var;
                        length2 = length2;
                        z4 = z2;
                        xo20Var = xo20Var;
                    }
                    z2 = z6 ? 1 : 0;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                case 68:
                    if (s(i9, i6, obj)) {
                        pscVar.q(i9, unsafe.getObject(obj, j), p(i6));
                    }
                    z2 = z6 ? 1 : 0;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
                default:
                    z2 = z6 ? 1 : 0;
                    z = false;
                    c = 5;
                    i6 += 3;
                    zdt0Var = zdt0Var;
                    length2 = length2;
                    z4 = z2;
                    xo20Var = xo20Var;
                    break;
            }
        }
        zdt0Var.getClass();
        ((jjt) obj).unknownFields.e(pscVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:224:0x05b3 A[PHI: r7
  0x05b3: PHI (r7v3 int) = 
  (r7v2 int)
  (r7v2 int)
  (r7v2 int)
  (r7v2 int)
  (r7v2 int)
  (r7v2 int)
  (r7v2 int)
  (r7v2 int)
  (r7v2 int)
  (r7v2 int)
  (r7v2 int)
  (r7v8 int)
  (r7v2 int)
  (r7v2 int)
  (r7v2 int)
  (r7v2 int)
  (r7v2 int)
  (r7v2 int)
  (r7v2 int)
  (r7v2 int)
  (r7v2 int)
  (r7v2 int)
  (r7v2 int)
  (r7v2 int)
  (r7v2 int)
  (r7v9 int)
  (r7v2 int)
  (r7v10 int)
  (r7v2 int)
  (r7v2 int)
  (r7v2 int)
  (r7v2 int)
  (r7v2 int)
  (r7v2 int)
  (r7v2 int)
  (r7v2 int)
  (r7v2 int)
  (r7v14 int)
  (r7v2 int)
  (r7v15 int)
  (r7v2 int)
  (r7v2 int)
  (r7v2 int)
  (r7v2 int)
  (r7v2 int)
  (r7v2 int)
  (r7v2 int)
  (r7v2 int)
  (r7v21 int)
  (r7v2 int)
 binds: [B:218:0x059a, B:387:0x09b5, B:384:0x099b, B:381:0x098b, B:378:0x0979, B:375:0x0967, B:372:0x0961, B:369:0x095b, B:366:0x0944, B:363:0x092b, B:360:0x0917, B:351:0x08be, B:336:0x082d, B:333:0x081b, B:330:0x0809, B:327:0x07f7, B:324:0x07e5, B:321:0x07d3, B:318:0x07c2, B:315:0x07b1, B:312:0x079e, B:309:0x078d, B:306:0x077c, B:303:0x076b, B:300:0x075a, B:298:0x074a, B:296:0x0744, B:294:0x0737, B:287:0x0701, B:285:0x06fd, B:282:0x06f5, B:279:0x06e1, B:276:0x06cd, B:273:0x06b9, B:270:0x06ad, B:267:0x06a1, B:262:0x0690, B:259:0x067c, B:255:0x0664, B:253:0x065a, B:251:0x0644, B:248:0x0632, B:245:0x061f, B:242:0x060c, B:239:0x0600, B:236:0x05f1, B:232:0x05d8, B:228:0x05bd, B:223:0x05b2, B:221:0x05a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:237:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:240:0x0602  */
    /* JADX WARN: Code duplicated, block: B:27:0x0091  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    @Override // a.o2h0
    public final int f(jjt jjtVar) {
        zdt0 zdt0Var;
        int i;
        int iH;
        int iJ;
        int iF;
        int iG;
        int iH2;
        int iB;
        int iA;
        int iH3;
        int i2;
        int iH4;
        int iJ2;
        int iG2;
        int iH5;
        int iE;
        int iH6;
        int iJ3;
        int iD;
        int iH7;
        int iG3;
        int iH8;
        int size;
        int iH9;
        int iB2;
        int iG4;
        int iH10;
        int iE2;
        zdt0 zdt0Var2 = this.m;
        xo20 xo20Var = this.n;
        int i3 = 1048575;
        Unsafe unsafe = p;
        int i4 = 1;
        boolean z = this.g;
        int[] iArr = this.f24717a;
        if (!z) {
            int i5 = 1048575;
            int i6 = 0;
            int iA2 = 0;
            int i7 = 0;
            while (i6 < iArr.length) {
                int iQ = Q(i6);
                int i8 = iArr[i6];
                int iP = P(iQ);
                if (iP <= 17) {
                    int i9 = iArr[i6 + 2];
                    int i10 = i9 & 1048575;
                    i = 1 << (i9 >>> 20);
                    zdt0Var = zdt0Var2;
                    if (i10 != i5) {
                        i7 = unsafe.getInt(jjtVar, i10);
                        i5 = i10;
                    }
                } else {
                    zdt0Var = zdt0Var2;
                    i = 0;
                }
                long j = iQ & 1048575;
                switch (iP) {
                    case 0:
                        if ((i7 & i) != 0) {
                            iA2 = f140.a(i8, 8, iA2);
                        }
                        break;
                    case 1:
                        if ((i7 & i) != 0) {
                            iA2 = f140.a(i8, 4, iA2);
                        }
                        break;
                    case 2:
                        if ((i7 & i) != 0) {
                            long j2 = unsafe.getLong(jjtVar, j);
                            iH = ryc.h(i8);
                            iJ = ryc.j(j2);
                            iF = iJ + iH;
                            iA2 += iF;
                        }
                        break;
                    case 3:
                        if ((i7 & i) != 0) {
                            long j3 = unsafe.getLong(jjtVar, j);
                            iH = ryc.h(i8);
                            iJ = ryc.j(j3);
                            iF = iJ + iH;
                            iA2 += iF;
                        }
                        break;
                    case 4:
                        if ((i7 & i) != 0) {
                            iF = ryc.f(unsafe.getInt(jjtVar, j)) + ryc.h(i8);
                            iA2 += iF;
                        }
                        break;
                    case 5:
                        if ((i7 & i) != 0) {
                            iF = ryc.d(i8);
                            iA2 += iF;
                        }
                        break;
                    case 6:
                        if ((i7 & i) != 0) {
                            iF = ryc.c(i8);
                            iA2 += iF;
                        }
                        break;
                    case 7:
                        if ((i7 & i) != 0) {
                            iA2 = f140.a(i8, 1, iA2);
                        }
                        break;
                    case 8:
                        if ((i7 & i) != 0) {
                            Object object = unsafe.getObject(jjtVar, j);
                            if (object instanceof og9) {
                                int iH11 = ryc.h(i8);
                                int size2 = ((og9) object).size();
                                iG = f140.y(size2, size2, iH11, iA2);
                            } else {
                                iG = ryc.g((String) object) + ryc.h(i8) + iA2;
                            }
                            iA2 = iG;
                        }
                        break;
                    case 9:
                        if ((i7 & i) != 0) {
                            Object object2 = unsafe.getObject(jjtVar, j);
                            o2h0 o2h0VarP = p(i6);
                            Class cls = w2h0.f38448a;
                            iH2 = ryc.h(i8);
                            iB = ((x3) object2).b(o2h0VarP);
                            iA2 = f140.y(iB, iB, iH2, iA2);
                        }
                        break;
                    case 10:
                        if ((i7 & i) != 0) {
                            iA = ryc.a(i8, (og9) unsafe.getObject(jjtVar, j));
                            iA2 += iA;
                        }
                        break;
                    case 11:
                        if ((i7 & i) != 0) {
                            int i11 = unsafe.getInt(jjtVar, j);
                            iH3 = ryc.h(i8);
                            i2 = ryc.i(i11);
                            iA = i2 + iH3;
                            iA2 += iA;
                        }
                        break;
                    case 12:
                        if ((i7 & i) != 0) {
                            int i12 = unsafe.getInt(jjtVar, j);
                            iH3 = ryc.h(i8);
                            i2 = ryc.f(i12);
                            iA = i2 + iH3;
                            iA2 += iA;
                        }
                        break;
                    case 13:
                        if ((i7 & i) != 0) {
                            iA2 = f140.a(i8, 4, iA2);
                        }
                        break;
                    case 14:
                        if ((i7 & i) != 0) {
                            iA2 = f140.a(i8, 8, iA2);
                        }
                        break;
                    case 15:
                        if ((i7 & i) != 0) {
                            int i13 = unsafe.getInt(jjtVar, j);
                            iH3 = ryc.h(i8);
                            i2 = ryc.i((i13 >> 31) ^ (i13 << 1));
                            iA = i2 + iH3;
                            iA2 += iA;
                        }
                        break;
                    case 16:
                        if ((i7 & i) != 0) {
                            long j4 = unsafe.getLong(jjtVar, j);
                            iH4 = ryc.h(i8);
                            iJ2 = ryc.j((j4 >> 63) ^ (j4 << 1));
                            iA = iJ2 + iH4;
                            iA2 += iA;
                        }
                        break;
                    case 17:
                        if ((i7 & i) != 0) {
                            iA = ryc.e(i8, (x3) unsafe.getObject(jjtVar, j), p(i6));
                            iA2 += iA;
                        }
                        break;
                    case 18:
                        iA = w2h0.f(i8, (List) unsafe.getObject(jjtVar, j));
                        iA2 += iA;
                        break;
                    case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                        iA = w2h0.d(i8, (List) unsafe.getObject(jjtVar, j));
                        iA2 += iA;
                        break;
                    case 20:
                        iA = w2h0.j(i8, (List) unsafe.getObject(jjtVar, j));
                        iA2 += iA;
                        break;
                    case 21:
                        iA = w2h0.t(i8, (List) unsafe.getObject(jjtVar, j));
                        iA2 += iA;
                        break;
                    case 22:
                        iA = w2h0.h(i8, (List) unsafe.getObject(jjtVar, j));
                        iA2 += iA;
                        break;
                    case 23:
                        iA = w2h0.f(i8, (List) unsafe.getObject(jjtVar, j));
                        iA2 += iA;
                        break;
                    case 24:
                        iA = w2h0.d(i8, (List) unsafe.getObject(jjtVar, j));
                        iA2 += iA;
                        break;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        List list = (List) unsafe.getObject(jjtVar, j);
                        Class cls2 = w2h0.f38448a;
                        int size3 = list.size();
                        iA2 += size3 == 0 ? 0 : (ryc.h(i8) + 1) * size3;
                        break;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        iA = w2h0.q(i8, (List) unsafe.getObject(jjtVar, j));
                        iA2 += iA;
                        break;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        iA = w2h0.l(i8, (List) unsafe.getObject(jjtVar, j), p(i6));
                        iA2 += iA;
                        break;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        iA = w2h0.a(i8, (List) unsafe.getObject(jjtVar, j));
                        iA2 += iA;
                        break;
                    case AvailableCode.HMS_IS_SPOOF /* 29 */:
                        iA = w2h0.r(i8, (List) unsafe.getObject(jjtVar, j));
                        iA2 += iA;
                        break;
                    case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                        iA = w2h0.b(i8, (List) unsafe.getObject(jjtVar, j));
                        iA2 += iA;
                        break;
                    case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                        iA = w2h0.d(i8, (List) unsafe.getObject(jjtVar, j));
                        iA2 += iA;
                        break;
                    case 32:
                        iA = w2h0.f(i8, (List) unsafe.getObject(jjtVar, j));
                        iA2 += iA;
                        break;
                    case 33:
                        iA = w2h0.m(i8, (List) unsafe.getObject(jjtVar, j));
                        iA2 += iA;
                        break;
                    case 34:
                        iA = w2h0.o(i8, (List) unsafe.getObject(jjtVar, j));
                        iA2 += iA;
                        break;
                    case 35:
                        iG2 = w2h0.g((List) unsafe.getObject(jjtVar, j));
                        if (iG2 > 0) {
                            iH5 = ryc.h(i8);
                            iA2 = f140.y(iG2, iH5, iG2, iA2);
                        }
                        break;
                    case 36:
                        iG2 = w2h0.e((List) unsafe.getObject(jjtVar, j));
                        if (iG2 > 0) {
                            iH5 = ryc.h(i8);
                            iA2 = f140.y(iG2, iH5, iG2, iA2);
                        }
                        break;
                    case 37:
                        iG2 = w2h0.k((List) unsafe.getObject(jjtVar, j));
                        if (iG2 > 0) {
                            iH5 = ryc.h(i8);
                            iA2 = f140.y(iG2, iH5, iG2, iA2);
                        }
                        break;
                    case 38:
                        iG2 = w2h0.u((List) unsafe.getObject(jjtVar, j));
                        if (iG2 > 0) {
                            iH5 = ryc.h(i8);
                            iA2 = f140.y(iG2, iH5, iG2, iA2);
                        }
                        break;
                    case 39:
                        iG2 = w2h0.i((List) unsafe.getObject(jjtVar, j));
                        if (iG2 > 0) {
                            iH5 = ryc.h(i8);
                            iA2 = f140.y(iG2, iH5, iG2, iA2);
                        }
                        break;
                    case 40:
                        iG2 = w2h0.g((List) unsafe.getObject(jjtVar, j));
                        if (iG2 > 0) {
                            iH5 = ryc.h(i8);
                            iA2 = f140.y(iG2, iH5, iG2, iA2);
                        }
                        break;
                    case 41:
                        iG2 = w2h0.e((List) unsafe.getObject(jjtVar, j));
                        if (iG2 > 0) {
                            iH5 = ryc.h(i8);
                            iA2 = f140.y(iG2, iH5, iG2, iA2);
                        }
                        break;
                    case 42:
                        List list2 = (List) unsafe.getObject(jjtVar, j);
                        Class cls3 = w2h0.f38448a;
                        iG2 = list2.size();
                        if (iG2 > 0) {
                            iH5 = ryc.h(i8);
                            iA2 = f140.y(iG2, iH5, iG2, iA2);
                        }
                        break;
                    case 43:
                        iG2 = w2h0.s((List) unsafe.getObject(jjtVar, j));
                        if (iG2 > 0) {
                            iH5 = ryc.h(i8);
                            iA2 = f140.y(iG2, iH5, iG2, iA2);
                        }
                        break;
                    case 44:
                        iG2 = w2h0.c((List) unsafe.getObject(jjtVar, j));
                        if (iG2 > 0) {
                            iH5 = ryc.h(i8);
                            iA2 = f140.y(iG2, iH5, iG2, iA2);
                        }
                        break;
                    case 45:
                        iG2 = w2h0.e((List) unsafe.getObject(jjtVar, j));
                        if (iG2 > 0) {
                            iH5 = ryc.h(i8);
                            iA2 = f140.y(iG2, iH5, iG2, iA2);
                        }
                        break;
                    case 46:
                        iG2 = w2h0.g((List) unsafe.getObject(jjtVar, j));
                        if (iG2 > 0) {
                            iH5 = ryc.h(i8);
                            iA2 = f140.y(iG2, iH5, iG2, iA2);
                        }
                        break;
                    case 47:
                        iG2 = w2h0.n((List) unsafe.getObject(jjtVar, j));
                        if (iG2 > 0) {
                            iH5 = ryc.h(i8);
                            iA2 = f140.y(iG2, iH5, iG2, iA2);
                        }
                        break;
                    case 48:
                        iG2 = w2h0.p((List) unsafe.getObject(jjtVar, j));
                        if (iG2 > 0) {
                            iH5 = ryc.h(i8);
                            iA2 = f140.y(iG2, iH5, iG2, iA2);
                        }
                        break;
                    case 49:
                        List list3 = (List) unsafe.getObject(jjtVar, j);
                        o2h0 o2h0VarP2 = p(i6);
                        Class cls4 = w2h0.f38448a;
                        int size4 = list3.size();
                        if (size4 == 0) {
                            iE = 0;
                        } else {
                            iE = 0;
                            for (int i14 = 0; i14 < size4; i14++) {
                                iE += ryc.e(i8, (x3) list3.get(i14), o2h0VarP2);
                            }
                        }
                        iA2 += iE;
                        break;
                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                        Object object3 = unsafe.getObject(jjtVar, j);
                        Object objO = o(i6);
                        xo20Var.getClass();
                        xo20.a(object3, objO);
                        break;
                    case 51:
                        if (s(i8, i6, jjtVar)) {
                            iA2 = f140.a(i8, 8, iA2);
                        }
                        break;
                    case 52:
                        if (s(i8, i6, jjtVar)) {
                            iA2 = f140.a(i8, 4, iA2);
                        }
                        break;
                    case 53:
                        if (s(i8, i6, jjtVar)) {
                            long jB = B(jjtVar, j);
                            iH4 = ryc.h(i8);
                            iJ2 = ryc.j(jB);
                            iA = iJ2 + iH4;
                            iA2 += iA;
                        }
                        break;
                    case 54:
                        if (s(i8, i6, jjtVar)) {
                            long jB2 = B(jjtVar, j);
                            iH4 = ryc.h(i8);
                            iJ2 = ryc.j(jB2);
                            iA = iJ2 + iH4;
                            iA2 += iA;
                        }
                        break;
                    case 55:
                        if (s(i8, i6, jjtVar)) {
                            int iA3 = A(jjtVar, j);
                            iH3 = ryc.h(i8);
                            i2 = ryc.f(iA3);
                            iA = i2 + iH3;
                            iA2 += iA;
                        }
                        break;
                    case 56:
                        if (s(i8, i6, jjtVar)) {
                            iA = ryc.d(i8);
                            iA2 += iA;
                        }
                        break;
                    case 57:
                        if (s(i8, i6, jjtVar)) {
                            iA = ryc.c(i8);
                            iA2 += iA;
                        }
                        break;
                    case 58:
                        if (s(i8, i6, jjtVar)) {
                            iA2 = f140.a(i8, 1, iA2);
                        }
                        break;
                    case 59:
                        if (s(i8, i6, jjtVar)) {
                            Object object4 = unsafe.getObject(jjtVar, j);
                            if (object4 instanceof og9) {
                                int iH12 = ryc.h(i8);
                                int size5 = ((og9) object4).size();
                                iG = f140.y(size5, size5, iH12, iA2);
                            } else {
                                iG = ryc.g((String) object4) + ryc.h(i8) + iA2;
                            }
                            iA2 = iG;
                        }
                        break;
                    case 60:
                        if (s(i8, i6, jjtVar)) {
                            Object object5 = unsafe.getObject(jjtVar, j);
                            o2h0 o2h0VarP3 = p(i6);
                            Class cls5 = w2h0.f38448a;
                            iH2 = ryc.h(i8);
                            iB = ((x3) object5).b(o2h0VarP3);
                            iA2 = f140.y(iB, iB, iH2, iA2);
                        }
                        break;
                    case 61:
                        if (s(i8, i6, jjtVar)) {
                            iA = ryc.a(i8, (og9) unsafe.getObject(jjtVar, j));
                            iA2 += iA;
                        }
                        break;
                    case 62:
                        if (s(i8, i6, jjtVar)) {
                            int iA4 = A(jjtVar, j);
                            iH3 = ryc.h(i8);
                            i2 = ryc.i(iA4);
                            iA = i2 + iH3;
                            iA2 += iA;
                        }
                        break;
                    case 63:
                        if (s(i8, i6, jjtVar)) {
                            int iA5 = A(jjtVar, j);
                            iH3 = ryc.h(i8);
                            i2 = ryc.f(iA5);
                            iA = i2 + iH3;
                            iA2 += iA;
                        }
                        break;
                    case 64:
                        if (s(i8, i6, jjtVar)) {
                            iA2 = f140.a(i8, 4, iA2);
                        }
                        break;
                    case 65:
                        if (s(i8, i6, jjtVar)) {
                            iA2 = f140.a(i8, 8, iA2);
                        }
                        break;
                    case 66:
                        if (s(i8, i6, jjtVar)) {
                            int iA6 = A(jjtVar, j);
                            iH3 = ryc.h(i8);
                            i2 = ryc.i((iA6 >> 31) ^ (iA6 << 1));
                            iA = i2 + iH3;
                            iA2 += iA;
                        }
                        break;
                    case 67:
                        if (s(i8, i6, jjtVar)) {
                            long jB3 = B(jjtVar, j);
                            iH4 = ryc.h(i8);
                            iJ2 = ryc.j((jB3 >> 63) ^ (jB3 << 1));
                            iA = iJ2 + iH4;
                            iA2 += iA;
                        }
                        break;
                    case 68:
                        if (s(i8, i6, jjtVar)) {
                            iA = ryc.e(i8, (x3) unsafe.getObject(jjtVar, j), p(i6));
                            iA2 += iA;
                        }
                        break;
                    default:
                        break;
                }
                i6 += 3;
                zdt0Var2 = zdt0Var;
            }
            zdt0Var2.getClass();
            return jjtVar.unknownFields.b() + iA2;
        }
        int i15 = 0;
        int iA7 = 0;
        while (i15 < iArr.length) {
            int iQ2 = Q(i15);
            int iP2 = P(iQ2);
            int i16 = iArr[i15];
            int i17 = i3;
            long j5 = iQ2 & i3;
            if (iP2 >= grp.b.f11791a && iP2 <= grp.c.f11791a) {
                int i18 = iArr[i15 + 2];
            }
            switch (iP2) {
                case 0:
                    if (q(i15, jjtVar)) {
                        iA7 = f140.a(i16, 8, iA7);
                    }
                    break;
                case 1:
                    if (q(i15, jjtVar)) {
                        iA7 = f140.a(i16, 4, iA7);
                    }
                    break;
                case 2:
                    if (q(i15, jjtVar)) {
                        long jI = hft0.i(jjtVar, j5);
                        iH6 = ryc.h(i16);
                        iJ3 = ryc.j(jI);
                        iA7 += iJ3 + iH6;
                    }
                    break;
                case 3:
                    if (q(i15, jjtVar)) {
                        long jI2 = hft0.i(jjtVar, j5);
                        iH6 = ryc.h(i16);
                        iJ3 = ryc.j(jI2);
                        iA7 += iJ3 + iH6;
                    }
                    break;
                case 4:
                    if (q(i15, jjtVar)) {
                        int iH13 = hft0.h(jjtVar, j5);
                        iH6 = ryc.h(i16);
                        iJ3 = ryc.f(iH13);
                        iA7 += iJ3 + iH6;
                    }
                    break;
                case 5:
                    if (q(i15, jjtVar)) {
                        iD = ryc.d(i16);
                        iA7 += iD;
                    }
                    break;
                case 6:
                    if (q(i15, jjtVar)) {
                        iD = ryc.c(i16);
                        iA7 += iD;
                    }
                    break;
                case 7:
                    int i19 = i4;
                    if (q(i15, jjtVar)) {
                        iA7 = f140.a(i16, i19, iA7);
                    }
                    break;
                case 8:
                    if (q(i15, jjtVar)) {
                        Object objJ = hft0.j(jjtVar, j5);
                        if (objJ instanceof og9) {
                            iH8 = ryc.h(i16);
                            size = ((og9) objJ).size();
                            iA7 = f140.y(size, size, iH8, iA7);
                        } else {
                            iH7 = ryc.h(i16);
                            iG3 = ryc.g((String) objJ);
                            iA7 = iG3 + iH7 + iA7;
                        }
                    }
                    break;
                case 9:
                    if (q(i15, jjtVar)) {
                        Object objJ2 = hft0.j(jjtVar, j5);
                        o2h0 o2h0VarP4 = p(i15);
                        Class cls6 = w2h0.f38448a;
                        iH9 = ryc.h(i16);
                        iB2 = ((x3) objJ2).b(o2h0VarP4);
                        iA7 = f140.y(iB2, iB2, iH9, iA7);
                    }
                    break;
                case 10:
                    if (q(i15, jjtVar)) {
                        iD = ryc.a(i16, (og9) hft0.j(jjtVar, j5));
                        iA7 += iD;
                    }
                    break;
                case 11:
                    if (q(i15, jjtVar)) {
                        int iH14 = hft0.h(jjtVar, j5);
                        iH6 = ryc.h(i16);
                        iJ3 = ryc.i(iH14);
                        iA7 += iJ3 + iH6;
                    }
                    break;
                case 12:
                    if (q(i15, jjtVar)) {
                        int iH15 = hft0.h(jjtVar, j5);
                        iH6 = ryc.h(i16);
                        iJ3 = ryc.f(iH15);
                        iA7 += iJ3 + iH6;
                    }
                    break;
                case 13:
                    if (q(i15, jjtVar)) {
                        iA7 = f140.a(i16, 4, iA7);
                    }
                    break;
                case 14:
                    if (q(i15, jjtVar)) {
                        iA7 = f140.a(i16, 8, iA7);
                    }
                    break;
                case 15:
                    if (q(i15, jjtVar)) {
                        int iH16 = hft0.h(jjtVar, j5);
                        iH6 = ryc.h(i16);
                        iJ3 = ryc.i((iH16 >> 31) ^ (iH16 << 1));
                        iA7 += iJ3 + iH6;
                    }
                    break;
                case 16:
                    int i20 = i4;
                    if (q(i15, jjtVar)) {
                        long jI3 = hft0.i(jjtVar, j5);
                        iH6 = ryc.h(i16);
                        iJ3 = ryc.j((jI3 >> 63) ^ (jI3 << i20));
                        iA7 += iJ3 + iH6;
                    }
                    break;
                case 17:
                    if (q(i15, jjtVar)) {
                        iD = ryc.e(i16, (x3) hft0.j(jjtVar, j5), p(i15));
                        iA7 += iD;
                    }
                    break;
                case 18:
                    iD = w2h0.f(i16, (List) hft0.j(jjtVar, j5));
                    iA7 += iD;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    iD = w2h0.d(i16, (List) hft0.j(jjtVar, j5));
                    iA7 += iD;
                    break;
                case 20:
                    iD = w2h0.j(i16, (List) hft0.j(jjtVar, j5));
                    iA7 += iD;
                    break;
                case 21:
                    iD = w2h0.t(i16, (List) hft0.j(jjtVar, j5));
                    iA7 += iD;
                    break;
                case 22:
                    iD = w2h0.h(i16, (List) hft0.j(jjtVar, j5));
                    iA7 += iD;
                    break;
                case 23:
                    iD = w2h0.f(i16, (List) hft0.j(jjtVar, j5));
                    iA7 += iD;
                    break;
                case 24:
                    iD = w2h0.d(i16, (List) hft0.j(jjtVar, j5));
                    iA7 += iD;
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    List list4 = (List) hft0.j(jjtVar, j5);
                    Class cls7 = w2h0.f38448a;
                    int size6 = list4.size();
                    iD = size6 == 0 ? 0 : (ryc.h(i16) + 1) * size6;
                    iA7 += iD;
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    iD = w2h0.q(i16, (List) hft0.j(jjtVar, j5));
                    iA7 += iD;
                    break;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    iD = w2h0.l(i16, (List) hft0.j(jjtVar, j5), p(i15));
                    iA7 += iD;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    iD = w2h0.a(i16, (List) hft0.j(jjtVar, j5));
                    iA7 += iD;
                    break;
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                    iD = w2h0.r(i16, (List) hft0.j(jjtVar, j5));
                    iA7 += iD;
                    break;
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                    iD = w2h0.b(i16, (List) hft0.j(jjtVar, j5));
                    iA7 += iD;
                    break;
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                    iD = w2h0.d(i16, (List) hft0.j(jjtVar, j5));
                    iA7 += iD;
                    break;
                case 32:
                    iD = w2h0.f(i16, (List) hft0.j(jjtVar, j5));
                    iA7 += iD;
                    break;
                case 33:
                    iD = w2h0.m(i16, (List) hft0.j(jjtVar, j5));
                    iA7 += iD;
                    break;
                case 34:
                    iD = w2h0.o(i16, (List) hft0.j(jjtVar, j5));
                    iA7 += iD;
                    break;
                case 35:
                    iG4 = w2h0.g((List) unsafe.getObject(jjtVar, j5));
                    if (iG4 > 0) {
                        iH10 = ryc.h(i16);
                        iA7 = f140.y(iG4, iH10, iG4, iA7);
                    }
                    break;
                case 36:
                    iG4 = w2h0.e((List) unsafe.getObject(jjtVar, j5));
                    if (iG4 > 0) {
                        iH10 = ryc.h(i16);
                        iA7 = f140.y(iG4, iH10, iG4, iA7);
                    }
                    break;
                case 37:
                    iG4 = w2h0.k((List) unsafe.getObject(jjtVar, j5));
                    if (iG4 > 0) {
                        iH10 = ryc.h(i16);
                        iA7 = f140.y(iG4, iH10, iG4, iA7);
                    }
                    break;
                case 38:
                    iG4 = w2h0.u((List) unsafe.getObject(jjtVar, j5));
                    if (iG4 > 0) {
                        iH10 = ryc.h(i16);
                        iA7 = f140.y(iG4, iH10, iG4, iA7);
                    }
                    break;
                case 39:
                    iG4 = w2h0.i((List) unsafe.getObject(jjtVar, j5));
                    if (iG4 > 0) {
                        iH10 = ryc.h(i16);
                        iA7 = f140.y(iG4, iH10, iG4, iA7);
                    }
                    break;
                case 40:
                    iG4 = w2h0.g((List) unsafe.getObject(jjtVar, j5));
                    if (iG4 > 0) {
                        iH10 = ryc.h(i16);
                        iA7 = f140.y(iG4, iH10, iG4, iA7);
                    }
                    break;
                case 41:
                    iG4 = w2h0.e((List) unsafe.getObject(jjtVar, j5));
                    if (iG4 > 0) {
                        iH10 = ryc.h(i16);
                        iA7 = f140.y(iG4, iH10, iG4, iA7);
                    }
                    break;
                case 42:
                    List list5 = (List) unsafe.getObject(jjtVar, j5);
                    Class cls8 = w2h0.f38448a;
                    iG4 = list5.size();
                    if (iG4 > 0) {
                        iH10 = ryc.h(i16);
                        iA7 = f140.y(iG4, iH10, iG4, iA7);
                    }
                    break;
                case 43:
                    iG4 = w2h0.s((List) unsafe.getObject(jjtVar, j5));
                    if (iG4 > 0) {
                        iH10 = ryc.h(i16);
                        iA7 = f140.y(iG4, iH10, iG4, iA7);
                    }
                    break;
                case 44:
                    iG4 = w2h0.c((List) unsafe.getObject(jjtVar, j5));
                    if (iG4 > 0) {
                        iH10 = ryc.h(i16);
                        iA7 = f140.y(iG4, iH10, iG4, iA7);
                    }
                    break;
                case 45:
                    iG4 = w2h0.e((List) unsafe.getObject(jjtVar, j5));
                    if (iG4 > 0) {
                        iH10 = ryc.h(i16);
                        iA7 = f140.y(iG4, iH10, iG4, iA7);
                    }
                    break;
                case 46:
                    iG4 = w2h0.g((List) unsafe.getObject(jjtVar, j5));
                    if (iG4 > 0) {
                        iH10 = ryc.h(i16);
                        iA7 = f140.y(iG4, iH10, iG4, iA7);
                    }
                    break;
                case 47:
                    iG4 = w2h0.n((List) unsafe.getObject(jjtVar, j5));
                    if (iG4 > 0) {
                        iH10 = ryc.h(i16);
                        iA7 = f140.y(iG4, iH10, iG4, iA7);
                    }
                    break;
                case 48:
                    iG4 = w2h0.p((List) unsafe.getObject(jjtVar, j5));
                    if (iG4 > 0) {
                        iH10 = ryc.h(i16);
                        iA7 = f140.y(iG4, iH10, iG4, iA7);
                    }
                    break;
                case 49:
                    List list6 = (List) hft0.j(jjtVar, j5);
                    o2h0 o2h0VarP5 = p(i15);
                    Class cls9 = w2h0.f38448a;
                    int size7 = list6.size();
                    if (size7 == 0) {
                        iE2 = 0;
                    } else {
                        int i21 = 0;
                        iE2 = 0;
                        while (i21 < size7) {
                            iE2 = ryc.e(i16, (x3) list6.get(i21), o2h0VarP5) + iE2;
                            i21++;
                            i4 = i4;
                        }
                    }
                    iA7 = iE2 + iA7;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Object objJ3 = hft0.j(jjtVar, j5);
                    Object objO2 = o(i15);
                    xo20Var.getClass();
                    xo20.a(objJ3, objO2);
                    break;
                case 51:
                    if (s(i16, i15, jjtVar)) {
                        iA7 = f140.a(i16, 8, iA7);
                    }
                    break;
                case 52:
                    if (s(i16, i15, jjtVar)) {
                        iA7 = f140.a(i16, 4, iA7);
                    }
                    break;
                case 53:
                    if (s(i16, i15, jjtVar)) {
                        long jB4 = B(jjtVar, j5);
                        iH6 = ryc.h(i16);
                        iJ3 = ryc.j(jB4);
                        iA7 += iJ3 + iH6;
                    }
                    break;
                case 54:
                    if (s(i16, i15, jjtVar)) {
                        long jB5 = B(jjtVar, j5);
                        iH6 = ryc.h(i16);
                        iJ3 = ryc.j(jB5);
                        iA7 += iJ3 + iH6;
                    }
                    break;
                case 55:
                    if (s(i16, i15, jjtVar)) {
                        int iA8 = A(jjtVar, j5);
                        iH6 = ryc.h(i16);
                        iJ3 = ryc.f(iA8);
                        iA7 += iJ3 + iH6;
                    }
                    break;
                case 56:
                    if (s(i16, i15, jjtVar)) {
                        iD = ryc.d(i16);
                        iA7 += iD;
                    }
                    break;
                case 57:
                    if (s(i16, i15, jjtVar)) {
                        iD = ryc.c(i16);
                        iA7 += iD;
                    }
                    break;
                case 58:
                    if (s(i16, i15, jjtVar)) {
                        iA7 = f140.a(i16, i4, iA7);
                    }
                    break;
                case 59:
                    if (s(i16, i15, jjtVar)) {
                        Object objJ4 = hft0.j(jjtVar, j5);
                        if (objJ4 instanceof og9) {
                            iH8 = ryc.h(i16);
                            size = ((og9) objJ4).size();
                            iA7 = f140.y(size, size, iH8, iA7);
                        } else {
                            iH7 = ryc.h(i16);
                            iG3 = ryc.g((String) objJ4);
                            iA7 = iG3 + iH7 + iA7;
                        }
                    }
                    break;
                case 60:
                    if (s(i16, i15, jjtVar)) {
                        Object objJ5 = hft0.j(jjtVar, j5);
                        o2h0 o2h0VarP6 = p(i15);
                        Class cls10 = w2h0.f38448a;
                        iH9 = ryc.h(i16);
                        iB2 = ((x3) objJ5).b(o2h0VarP6);
                        iA7 = f140.y(iB2, iB2, iH9, iA7);
                    }
                    break;
                case 61:
                    if (s(i16, i15, jjtVar)) {
                        iD = ryc.a(i16, (og9) hft0.j(jjtVar, j5));
                        iA7 += iD;
                    }
                    break;
                case 62:
                    if (s(i16, i15, jjtVar)) {
                        int iA9 = A(jjtVar, j5);
                        iH6 = ryc.h(i16);
                        iJ3 = ryc.i(iA9);
                        iA7 += iJ3 + iH6;
                    }
                    break;
                case 63:
                    if (s(i16, i15, jjtVar)) {
                        int iA10 = A(jjtVar, j5);
                        iH6 = ryc.h(i16);
                        iJ3 = ryc.f(iA10);
                        iA7 += iJ3 + iH6;
                    }
                    break;
                case 64:
                    if (s(i16, i15, jjtVar)) {
                        iA7 = f140.a(i16, 4, iA7);
                    }
                    break;
                case 65:
                    if (s(i16, i15, jjtVar)) {
                        iA7 = f140.a(i16, 8, iA7);
                    }
                    break;
                case 66:
                    if (s(i16, i15, jjtVar)) {
                        int iA11 = A(jjtVar, j5);
                        iH6 = ryc.h(i16);
                        iJ3 = ryc.i((iA11 >> 31) ^ (iA11 << 1));
                        iA7 += iJ3 + iH6;
                    }
                    break;
                case 67:
                    if (s(i16, i15, jjtVar)) {
                        long jB6 = B(jjtVar, j5);
                        iH6 = ryc.h(i16);
                        iJ3 = ryc.j((jB6 >> 63) ^ (jB6 << i4));
                        iA7 += iJ3 + iH6;
                    }
                    break;
                case 68:
                    if (s(i16, i15, jjtVar)) {
                        iD = ryc.e(i16, (x3) hft0.j(jjtVar, j5), p(i15));
                        iA7 += iD;
                    }
                    break;
            }
            i15 += 3;
            i3 = i17;
            i4 = 1;
        }
        zdt0Var2.getClass();
        return jjtVar.unknownFields.b() + iA7;
    }

    /* JADX WARN: Code duplicated, block: B:150:0x063c A[Catch: all -> 0x046a, TryCatch #5 {all -> 0x046a, blocks: (B:148:0x0637, B:150:0x063c, B:151:0x0641, B:118:0x045e, B:123:0x0472, B:124:0x048e, B:125:0x04ab, B:126:0x04c8, B:127:0x04e7, B:128:0x0503, B:129:0x0518, B:130:0x0533, B:131:0x0540, B:132:0x055e, B:133:0x057b, B:134:0x0598, B:135:0x05b4, B:136:0x05d0, B:137:0x05ec, B:138:0x060a, B:142:0x0628), top: B:179:0x0637 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x0649 A[LOOP:2: B:153:0x0647->B:154:0x0649, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:162:0x0663 A[LOOP:3: B:161:0x0661->B:162:0x0663, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:164:0x066d  */
    /* JADX WARN: Code duplicated, block: B:195:0x0647 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:? A[RETURN, SYNTHETIC] */
    @Override // a.o2h0
    public final void g(Object obj, hu5 hu5Var, qso qsoVar) throws Throwable {
        o640 o640Var;
        zdt0 zdt0Var;
        int[] iArr;
        hu5 hu5Var2;
        o640 o640Var2 = this;
        Object obj2 = obj;
        hu5 hu5Var3 = hu5Var;
        qso qsoVar2 = qsoVar;
        qsoVar2.getClass();
        l(obj2);
        zdt0 zdt0Var2 = o640Var2.m;
        int[] iArr2 = o640Var2.h;
        int i = o640Var2.j;
        int i2 = o640Var2.i;
        wdt0 wdt0VarA = null;
        while (true) {
            try {
                int iE = hu5Var3.e();
                int iM = (iE < o640Var2.c || iE > o640Var2.d) ? -1 : o640Var2.M(iE, 0);
                if (iM >= 0) {
                    int iQ = o640Var2.Q(iM);
                    try {
                        int iP = P(iQ);
                        dd00 dd00Var = o640Var2.l;
                        switch (iP) {
                            case 0:
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var = o640Var2;
                                long jZ = z(iQ);
                                hu5Var2.W(1);
                                Object obj3 = obj2;
                                try {
                                    hft0.c.g(obj3, jZ, ((oyc) hu5Var2.e).p());
                                    obj2 = obj3;
                                    o640Var.K(iM, obj2);
                                } catch (vnx unused) {
                                    obj2 = obj3;
                                    try {
                                        zdt0Var.getClass();
                                        if (wdt0VarA == null) {
                                            wdt0VarA = zdt0.a(obj2);
                                        }
                                        if (!zdt0.b(wdt0VarA, hu5Var2)) {
                                            while (i2 < i) {
                                                o640Var.m(iArr[i2], obj2, wdt0VarA);
                                                i2++;
                                            }
                                            if (wdt0VarA == null) {
                                                return;
                                            }
                                            ((jjt) obj2).unknownFields = wdt0VarA;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        while (i2 < i) {
                                            o640Var.m(iArr[i2], obj2, wdt0VarA);
                                            i2++;
                                        }
                                        if (wdt0VarA != null) {
                                            zdt0Var.getClass();
                                            ((jjt) obj2).unknownFields = wdt0VarA;
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    obj2 = obj3;
                                    while (i2 < i) {
                                        o640Var.m(iArr[i2], obj2, wdt0VarA);
                                        i2++;
                                    }
                                    if (wdt0VarA != null) {
                                        zdt0Var.getClass();
                                        ((jjt) obj2).unknownFields = wdt0VarA;
                                    }
                                    throw th;
                                }
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 1:
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var = o640Var2;
                                long jZ2 = z(iQ);
                                hu5Var2.W(5);
                                hft0.c.h(obj2, jZ2, ((oyc) hu5Var2.e).t());
                                o640Var.K(iM, obj2);
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 2:
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var = o640Var2;
                                long jZ3 = z(iQ);
                                hu5Var2.W(0);
                                hft0.p(obj2, jZ3, ((oyc) hu5Var2.e).v());
                                o640Var.K(iM, obj2);
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 3:
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var = o640Var2;
                                long jZ4 = z(iQ);
                                hu5Var2.W(0);
                                hft0.p(obj2, jZ4, ((oyc) hu5Var2.e).E());
                                o640Var.K(iM, obj2);
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 4:
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var = o640Var2;
                                long jZ5 = z(iQ);
                                hu5Var2.W(0);
                                hft0.o(obj2, ((oyc) hu5Var2.e).u(), jZ5);
                                o640Var.K(iM, obj2);
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 5:
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var = o640Var2;
                                long jZ6 = z(iQ);
                                hu5Var2.W(1);
                                hft0.p(obj2, jZ6, ((oyc) hu5Var2.e).s());
                                o640Var.K(iM, obj2);
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 6:
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var = o640Var2;
                                long jZ7 = z(iQ);
                                hu5Var2.W(5);
                                hft0.o(obj2, ((oyc) hu5Var2.e).r(), jZ7);
                                o640Var.K(iM, obj2);
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 7:
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var = o640Var2;
                                long jZ8 = z(iQ);
                                hu5Var2.W(0);
                                hft0.c.e(obj2, jZ8, ((oyc) hu5Var2.e).m());
                                o640Var.K(iM, obj2);
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 8:
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var = o640Var2;
                                o640Var.I(iQ, hu5Var2, obj2);
                                o640Var.K(iM, obj2);
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 9:
                                hu5Var2 = hu5Var3;
                                qso qsoVar3 = qsoVar2;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var = o640Var2;
                                x3 x3Var = (x3) o640Var.w(iM, obj2);
                                o2h0 o2h0VarP = o640Var.p(iM);
                                hu5Var2.W(2);
                                hu5Var2.j(x3Var, o2h0VarP, qsoVar3);
                                o640Var.N(iM, obj2, x3Var);
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 10:
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var = o640Var2;
                                hft0.q(obj2, z(iQ), hu5Var2.o());
                                o640Var.K(iM, obj2);
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 11:
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var = o640Var2;
                                long jZ9 = z(iQ);
                                hu5Var2.W(0);
                                hft0.o(obj2, ((oyc) hu5Var2.e).D(), jZ9);
                                o640Var.K(iM, obj2);
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 12:
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var = o640Var2;
                                hu5Var2.W(0);
                                int iQ2 = ((oyc) hu5Var2.e).q();
                                o640Var.n(iM);
                                hft0.o(obj2, iQ2, z(iQ));
                                o640Var.K(iM, obj2);
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 13:
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var = o640Var2;
                                long jZ10 = z(iQ);
                                hu5Var2.W(5);
                                hft0.o(obj2, ((oyc) hu5Var2.e).w(), jZ10);
                                o640Var.K(iM, obj2);
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 14:
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var = o640Var2;
                                long jZ11 = z(iQ);
                                hu5Var2.W(1);
                                hft0.p(obj2, jZ11, ((oyc) hu5Var2.e).x());
                                o640Var.K(iM, obj2);
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 15:
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var = o640Var2;
                                long jZ12 = z(iQ);
                                hu5Var2.W(0);
                                hft0.o(obj2, ((oyc) hu5Var2.e).y(), jZ12);
                                o640Var.K(iM, obj2);
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 16:
                                hu5Var2 = hu5Var3;
                                o640Var = o640Var2;
                                long jZ13 = z(iQ);
                                hu5Var2.W(0);
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                try {
                                    hft0.p(obj2, jZ13, ((oyc) hu5Var2.e).z());
                                    o640Var.K(iM, obj2);
                                } catch (vnx unused2) {
                                    zdt0Var.getClass();
                                    if (wdt0VarA == null) {
                                        wdt0VarA = zdt0.a(obj2);
                                    }
                                    if (!zdt0.b(wdt0VarA, hu5Var2)) {
                                        while (i2 < i) {
                                            o640Var.m(iArr[i2], obj2, wdt0VarA);
                                            i2++;
                                        }
                                        if (wdt0VarA == null) {
                                            return;
                                        }
                                        ((jjt) obj2).unknownFields = wdt0VarA;
                                    }
                                }
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 17:
                                hu5Var2 = hu5Var3;
                                qso qsoVar4 = qsoVar2;
                                o640Var = o640Var2;
                                x3 x3Var2 = (x3) o640Var.w(iM, obj2);
                                o2h0 o2h0VarP2 = o640Var.p(iM);
                                hu5Var2.W(3);
                                hu5Var2.h(x3Var2, o2h0VarP2, qsoVar4);
                                o640Var.N(iM, obj2, x3Var2);
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 18:
                                hu5Var2 = hu5Var3;
                                o640Var = o640Var2;
                                hu5Var2.s(dd00Var.c(obj2, z(iQ)));
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                hu5Var2 = hu5Var3;
                                o640Var = o640Var2;
                                hu5Var2.B(dd00Var.c(obj2, z(iQ)));
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 20:
                                hu5Var2 = hu5Var3;
                                o640Var = o640Var2;
                                hu5Var2.F(dd00Var.c(obj2, z(iQ)));
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 21:
                                hu5Var2 = hu5Var3;
                                o640Var = o640Var2;
                                hu5Var2.T(dd00Var.c(obj2, iQ & 1048575));
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 22:
                                hu5Var2 = hu5Var3;
                                o640Var = o640Var2;
                                hu5Var2.D(dd00Var.c(obj2, iQ & 1048575));
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 23:
                                hu5Var2 = hu5Var3;
                                o640Var = o640Var2;
                                hu5Var2.z(dd00Var.c(obj2, iQ & 1048575));
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 24:
                                hu5Var2 = hu5Var3;
                                o640Var = o640Var2;
                                hu5Var2.x(dd00Var.c(obj2, iQ & 1048575));
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                                hu5Var2 = hu5Var3;
                                o640Var = o640Var2;
                                hu5Var2.m(dd00Var.c(obj2, iQ & 1048575));
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                                hu5Var2 = hu5Var3;
                                o640Var = o640Var2;
                                if ((536870912 & iQ) != 0) {
                                    try {
                                        hu5Var2.P(dd00Var.c(obj2, iQ & 1048575), true);
                                    } catch (vnx unused3) {
                                        zdt0Var = zdt0Var2;
                                        iArr = iArr2;
                                        zdt0Var.getClass();
                                        if (wdt0VarA == null) {
                                            wdt0VarA = zdt0.a(obj2);
                                        }
                                        if (!zdt0.b(wdt0VarA, hu5Var2)) {
                                            while (i2 < i) {
                                                o640Var.m(iArr[i2], obj2, wdt0VarA);
                                                i2++;
                                            }
                                            if (wdt0VarA == null) {
                                                return;
                                            }
                                            ((jjt) obj2).unknownFields = wdt0VarA;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        zdt0Var = zdt0Var2;
                                        iArr = iArr2;
                                        while (i2 < i) {
                                            o640Var.m(iArr[i2], obj2, wdt0VarA);
                                            i2++;
                                        }
                                        if (wdt0VarA != null) {
                                            zdt0Var.getClass();
                                            ((jjt) obj2).unknownFields = wdt0VarA;
                                        }
                                        throw th;
                                    }
                                } else {
                                    hu5Var2.P(dd00Var.c(obj2, iQ & 1048575), false);
                                }
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                                try {
                                    try {
                                        o640Var2.H(obj2, iQ, hu5Var3, o640Var2.p(iM), qsoVar);
                                        hu5Var2 = hu5Var3;
                                        o640Var = o640Var2;
                                        zdt0Var = zdt0Var2;
                                        iArr = iArr2;
                                    } catch (vnx unused4) {
                                        hu5Var2 = hu5Var3;
                                        o640Var = o640Var2;
                                        zdt0Var = zdt0Var2;
                                        iArr = iArr2;
                                        zdt0Var.getClass();
                                        if (wdt0VarA == null) {
                                            wdt0VarA = zdt0.a(obj2);
                                        }
                                        if (!zdt0.b(wdt0VarA, hu5Var2)) {
                                            while (i2 < i) {
                                                o640Var.m(iArr[i2], obj2, wdt0VarA);
                                                i2++;
                                            }
                                            if (wdt0VarA == null) {
                                                return;
                                            }
                                            ((jjt) obj2).unknownFields = wdt0VarA;
                                        }
                                    }
                                } catch (vnx unused5) {
                                    o640Var = o640Var2;
                                    hu5Var2 = hu5Var3;
                                    zdt0Var = zdt0Var2;
                                    iArr = iArr2;
                                    zdt0Var.getClass();
                                    if (wdt0VarA == null) {
                                        wdt0VarA = zdt0.a(obj2);
                                    }
                                    if (!zdt0.b(wdt0VarA, hu5Var2)) {
                                        while (i2 < i) {
                                            o640Var.m(iArr[i2], obj2, wdt0VarA);
                                            i2++;
                                        }
                                        if (wdt0VarA == null) {
                                            return;
                                        }
                                        ((jjt) obj2).unknownFields = wdt0VarA;
                                    }
                                    o640Var2 = o640Var;
                                    zdt0Var2 = zdt0Var;
                                    hu5Var3 = hu5Var2;
                                    iArr2 = iArr;
                                    qsoVar2 = qsoVar;
                                    break;
                                }
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                                hu5Var3.q(dd00Var.c(obj2, iQ & 1048575));
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                                hu5Var3.R(dd00Var.c(obj2, iQ & 1048575));
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                                hu5Var3.u(dd00Var.c(obj2, iQ & 1048575));
                                o640Var2.n(iM);
                                Class cls = w2h0.f38448a;
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                                hu5Var3.H(dd00Var.c(obj2, iQ & 1048575));
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 32:
                                hu5Var3.J(dd00Var.c(obj2, iQ & 1048575));
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 33:
                                hu5Var3.L(dd00Var.c(obj2, iQ & 1048575));
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 34:
                                hu5Var3.N(dd00Var.c(obj2, iQ & 1048575));
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 35:
                                hu5Var3.s(dd00Var.c(obj2, iQ & 1048575));
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 36:
                                hu5Var3.B(dd00Var.c(obj2, iQ & 1048575));
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 37:
                                hu5Var3.F(dd00Var.c(obj2, iQ & 1048575));
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 38:
                                hu5Var3.T(dd00Var.c(obj2, iQ & 1048575));
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 39:
                                hu5Var3.D(dd00Var.c(obj2, iQ & 1048575));
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 40:
                                hu5Var3.z(dd00Var.c(obj2, iQ & 1048575));
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 41:
                                hu5Var3.x(dd00Var.c(obj2, iQ & 1048575));
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 42:
                                hu5Var3.m(dd00Var.c(obj2, iQ & 1048575));
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 43:
                                hu5Var3.R(dd00Var.c(obj2, iQ & 1048575));
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 44:
                                hu5Var3.u(dd00Var.c(obj2, iQ & 1048575));
                                o640Var2.n(iM);
                                Class cls2 = w2h0.f38448a;
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 45:
                                hu5Var3.H(dd00Var.c(obj2, iQ & 1048575));
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 46:
                                hu5Var3.J(dd00Var.c(obj2, iQ & 1048575));
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 47:
                                hu5Var3.L(dd00Var.c(obj2, iQ & 1048575));
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 48:
                                hu5Var3.N(dd00Var.c(obj2, iQ & 1048575));
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 49:
                                hu5 hu5Var4 = hu5Var3;
                                try {
                                    o640Var2.G(obj2, iQ & 1048575, hu5Var4, o640Var2.p(iM), qsoVar);
                                    hu5Var3 = hu5Var4;
                                    o640Var = o640Var2;
                                    hu5Var2 = hu5Var3;
                                    zdt0Var = zdt0Var2;
                                    iArr = iArr2;
                                } catch (vnx unused6) {
                                    o640Var = o640Var2;
                                    hu5Var2 = hu5Var4;
                                    zdt0Var = zdt0Var2;
                                    iArr = iArr2;
                                    zdt0Var.getClass();
                                    if (wdt0VarA == null) {
                                        wdt0VarA = zdt0.a(obj2);
                                    }
                                    if (!zdt0.b(wdt0VarA, hu5Var2)) {
                                        while (i2 < i) {
                                            o640Var.m(iArr[i2], obj2, wdt0VarA);
                                            i2++;
                                        }
                                        if (wdt0VarA == null) {
                                            return;
                                        }
                                        ((jjt) obj2).unknownFields = wdt0VarA;
                                    }
                                }
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                o640Var2.t(iM, obj2, o640Var2.o(iM));
                                throw null;
                            case 51:
                                hu5Var3.W(1);
                                hft0.q(obj2, iQ & 1048575, Double.valueOf(((oyc) hu5Var3.e).p()));
                                o640Var2.L(iE, iM, obj2);
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 52:
                                hu5Var3.W(5);
                                hft0.q(obj2, iQ & 1048575, Float.valueOf(((oyc) hu5Var3.e).t()));
                                o640Var2.L(iE, iM, obj2);
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 53:
                                hu5Var3.W(0);
                                hft0.q(obj2, iQ & 1048575, Long.valueOf(((oyc) hu5Var3.e).v()));
                                o640Var2.L(iE, iM, obj2);
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 54:
                                hu5Var3.W(0);
                                hft0.q(obj2, iQ & 1048575, Long.valueOf(((oyc) hu5Var3.e).E()));
                                o640Var2.L(iE, iM, obj2);
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 55:
                                hu5Var3.W(0);
                                hft0.q(obj2, iQ & 1048575, Integer.valueOf(((oyc) hu5Var3.e).u()));
                                o640Var2.L(iE, iM, obj2);
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 56:
                                hu5Var3.W(1);
                                hft0.q(obj2, iQ & 1048575, Long.valueOf(((oyc) hu5Var3.e).s()));
                                o640Var2.L(iE, iM, obj2);
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 57:
                                hu5Var3.W(5);
                                hft0.q(obj2, iQ & 1048575, Integer.valueOf(((oyc) hu5Var3.e).r()));
                                o640Var2.L(iE, iM, obj2);
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 58:
                                hu5Var3.W(0);
                                hft0.q(obj2, iQ & 1048575, Boolean.valueOf(((oyc) hu5Var3.e).m()));
                                o640Var2.L(iE, iM, obj2);
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 59:
                                o640Var2.I(iQ, hu5Var3, obj2);
                                o640Var2.L(iE, iM, obj2);
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 60:
                                x3 x3Var3 = (x3) o640Var2.x(iE, iM, obj2);
                                o2h0 o2h0VarP3 = o640Var2.p(iM);
                                hu5Var3.W(2);
                                hu5Var3.j(x3Var3, o2h0VarP3, qsoVar2);
                                o640Var2.O(obj2, iE, iM, x3Var3);
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 61:
                                hft0.q(obj2, iQ & 1048575, hu5Var3.o());
                                o640Var2.L(iE, iM, obj2);
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 62:
                                hu5Var3.W(0);
                                hft0.q(obj2, iQ & 1048575, Integer.valueOf(((oyc) hu5Var3.e).D()));
                                o640Var2.L(iE, iM, obj2);
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 63:
                                hu5Var3.W(0);
                                int iQ3 = ((oyc) hu5Var3.e).q();
                                o640Var2.n(iM);
                                hft0.q(obj2, iQ & 1048575, Integer.valueOf(iQ3));
                                o640Var2.L(iE, iM, obj2);
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 64:
                                hu5Var3.W(5);
                                hft0.q(obj2, iQ & 1048575, Integer.valueOf(((oyc) hu5Var3.e).w()));
                                o640Var2.L(iE, iM, obj2);
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 65:
                                hu5Var3.W(1);
                                hft0.q(obj2, iQ & 1048575, Long.valueOf(((oyc) hu5Var3.e).x()));
                                o640Var2.L(iE, iM, obj2);
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 66:
                                hu5Var3.W(0);
                                hft0.q(obj2, iQ & 1048575, Integer.valueOf(((oyc) hu5Var3.e).y()));
                                o640Var2.L(iE, iM, obj2);
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 67:
                                hu5Var3.W(0);
                                hft0.q(obj2, iQ & 1048575, Long.valueOf(((oyc) hu5Var3.e).z()));
                                o640Var2.L(iE, iM, obj2);
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            case 68:
                                x3 x3Var4 = (x3) o640Var2.x(iE, iM, obj2);
                                o2h0 o2h0VarP4 = o640Var2.p(iM);
                                hu5Var3.W(3);
                                hu5Var3.h(x3Var4, o2h0VarP4, qsoVar2);
                                o640Var2.O(obj2, iE, iM, x3Var4);
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                            default:
                                if (wdt0VarA == null) {
                                    try {
                                        zdt0Var2.getClass();
                                        wdt0VarA = zdt0.a(obj2);
                                    } catch (vnx unused7) {
                                        o640Var = o640Var2;
                                        hu5Var2 = hu5Var3;
                                        zdt0Var = zdt0Var2;
                                        iArr = iArr2;
                                        zdt0Var.getClass();
                                        if (wdt0VarA == null) {
                                            wdt0VarA = zdt0.a(obj2);
                                        }
                                        if (!zdt0.b(wdt0VarA, hu5Var2)) {
                                            while (i2 < i) {
                                                o640Var.m(iArr[i2], obj2, wdt0VarA);
                                                i2++;
                                            }
                                            if (wdt0VarA == null) {
                                                return;
                                            }
                                            ((jjt) obj2).unknownFields = wdt0VarA;
                                        }
                                    }
                                }
                                zdt0Var2.getClass();
                                if (!zdt0.b(wdt0VarA, hu5Var3)) {
                                    while (i2 < i) {
                                        o640Var2.m(iArr2[i2], obj2, wdt0VarA);
                                        i2++;
                                    }
                                    if (wdt0VarA == null) {
                                        return;
                                    }
                                }
                                o640Var = o640Var2;
                                hu5Var2 = hu5Var3;
                                zdt0Var = zdt0Var2;
                                iArr = iArr2;
                                o640Var2 = o640Var;
                                zdt0Var2 = zdt0Var;
                                hu5Var3 = hu5Var2;
                                iArr2 = iArr;
                                qsoVar2 = qsoVar;
                                break;
                        }
                    } catch (vnx unused8) {
                        o640Var = o640Var2;
                        hu5Var2 = hu5Var3;
                        zdt0Var = zdt0Var2;
                        iArr = iArr2;
                    }
                } else if (iE == Integer.MAX_VALUE) {
                    while (i2 < i) {
                        o640Var2.m(iArr2[i2], obj2, wdt0VarA);
                        i2++;
                    }
                    if (wdt0VarA == null) {
                        return;
                    } else {
                        zdt0Var2.getClass();
                    }
                } else {
                    zdt0Var2.getClass();
                    if (wdt0VarA == null) {
                        wdt0VarA = zdt0.a(obj2);
                    }
                    if (!zdt0.b(wdt0VarA, hu5Var3)) {
                        while (i2 < i) {
                            o640Var2.m(iArr2[i2], obj2, wdt0VarA);
                            i2++;
                        }
                        if (wdt0VarA == null) {
                            return;
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                o640Var = o640Var2;
            }
        }
        ((jjt) obj2).unknownFields = wdt0VarA;
    }

    @Override // a.o2h0
    public final void h(Object obj, byte[] bArr, int i, int i2, vw3 vw3Var) throws ynx {
        int i3;
        int iM;
        Object obj2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Object obj3;
        Object obj4;
        Object obj5;
        int i9;
        int i10;
        int i11;
        o640 o640Var = this;
        Object obj6 = obj;
        byte[] bArr2 = bArr;
        int i12 = i2;
        vw3 vw3Var2 = vw3Var;
        if (!o640Var.g) {
            E(obj6, bArr, i, i12, 0, vw3Var);
            return;
        }
        l(obj6);
        int iZ = i;
        int i13 = -1;
        int i14 = 0;
        int i15 = 1048575;
        int i16 = 0;
        while (true) {
            Unsafe unsafe = p;
            if (iZ >= i12) {
                Object obj7 = obj6;
                int i17 = i12;
                int i18 = i15;
                int i19 = i16;
                if (i18 != 1048575) {
                    unsafe.putInt(obj7, i18, i19);
                }
                if (iZ != i17) {
                    throw ynx.g();
                }
                return;
            }
            int iA0 = iZ + 1;
            int i20 = bArr2[iZ];
            if (i20 < 0) {
                iA0 = b34.a0(i20, bArr2, iA0, vw3Var2);
                i20 = vw3Var2.f38129a;
            }
            i13 = i20 >>> 3;
            int i21 = i20 & 7;
            int i22 = o640Var.d;
            int i23 = o640Var.c;
            if (i13 > i13) {
                iM = (i13 < i23 || i13 > i22) ? -1 : o640Var.M(i13, i14 / 3);
                i3 = 0;
            } else if (i13 < i23 || i13 > i22) {
                i3 = 0;
                iM = -1;
            } else {
                i3 = 0;
                iM = o640Var.M(i13, 0);
            }
            int i24 = iM;
            if (i24 == -1) {
                int i25 = iA0;
                obj2 = obj6;
                i4 = i25;
                i5 = i20;
                i6 = i13;
                i7 = i3;
            } else {
                int[] iArr = o640Var.f24717a;
                int i26 = iArr[i24 + 1];
                int iP = P(i26);
                int i27 = i20;
                long j = i26 & 1048575;
                if (iP <= 17) {
                    int i28 = iArr[i24 + 2];
                    int i29 = 1 << (i28 >>> 20);
                    int i30 = i28 & 1048575;
                    int i31 = 1048575;
                    if (i30 != i15) {
                        if (i15 != 1048575) {
                            unsafe.putInt(obj6, i15, i16);
                            i31 = 1048575;
                        }
                        if (i30 != i31) {
                            i16 = unsafe.getInt(obj6, i30);
                        }
                        i15 = i30;
                    }
                    switch (iP) {
                        case 0:
                            i8 = iA0;
                            if (i21 != 1) {
                                obj4 = obj6;
                                i5 = i27 == true ? 1 : 0;
                                obj2 = obj4;
                                i4 = i8;
                                i6 = i13;
                                i7 = i24;
                            } else {
                                hft0.c.g(obj6, j, Double.longBitsToDouble(b34.V(bArr2, i8)));
                                i16 |= i29;
                                obj6 = obj6;
                                iZ = i8 + 8;
                                i12 = i2;
                                i14 = i24;
                            }
                            break;
                        case 1:
                            i8 = iA0;
                            if (i21 != 5) {
                                obj4 = obj6;
                                i5 = i27 == true ? 1 : 0;
                                obj2 = obj4;
                                i4 = i8;
                                i6 = i13;
                                i7 = i24;
                            } else {
                                hft0.c.h(obj6, j, Float.intBitsToFloat(b34.U(bArr2, i8)));
                                iZ = i8 + 4;
                                i16 |= i29;
                                i12 = i2;
                                i14 = i24;
                            }
                            break;
                        case 2:
                        case 3:
                            i8 = iA0;
                            if (i21 != 0) {
                                obj4 = obj6;
                                i5 = i27 == true ? 1 : 0;
                                obj2 = obj4;
                                i4 = i8;
                                i6 = i13;
                                i7 = i24;
                            } else {
                                int iD0 = b34.d0(bArr2, i8, vw3Var2);
                                unsafe.putLong(obj6, j, vw3Var2.b);
                                i16 |= i29;
                                iZ = iD0;
                                i13 = i13;
                                i14 = i24;
                                i12 = i2;
                            }
                            break;
                        case 4:
                        case 11:
                            i8 = iA0;
                            if (i21 != 0) {
                                obj4 = obj6;
                                i5 = i27 == true ? 1 : 0;
                                obj2 = obj4;
                                i4 = i8;
                                i6 = i13;
                                i7 = i24;
                            } else {
                                int iB0 = b34.b0(bArr2, i8, vw3Var2);
                                unsafe.putInt(obj6, j, vw3Var2.f38129a);
                                i16 |= i29;
                                i12 = i2;
                                iZ = iB0;
                                i14 = i24;
                            }
                            break;
                        case 5:
                        case 14:
                            obj3 = obj6;
                            i31 = i31;
                            i8 = iA0;
                            if (i21 != 1) {
                                obj4 = obj3;
                                i5 = i27 == true ? 1 : 0;
                                obj2 = obj4;
                                i4 = i8;
                                i6 = i13;
                                i7 = i24;
                            } else {
                                obj6 = obj3;
                                unsafe.putLong(obj6, j, b34.V(bArr2, i8));
                                iZ = i8 + 8;
                                i16 |= i29;
                                i12 = i2;
                                i14 = i24;
                            }
                            break;
                        case 6:
                        case 13:
                            obj3 = obj6;
                            i31 = i31;
                            i8 = iA0;
                            if (i21 != 5) {
                                obj4 = obj3;
                                i5 = i27 == true ? 1 : 0;
                                obj2 = obj4;
                                i4 = i8;
                                i6 = i13;
                                i7 = i24;
                            } else {
                                unsafe.putInt(obj3, j, b34.U(bArr2, i8));
                                iZ = i8 + 4;
                                i16 |= i29;
                                i12 = i2;
                                obj6 = obj3;
                                i14 = i24;
                            }
                            break;
                        case 7:
                            obj3 = obj6;
                            i31 = i31;
                            i8 = iA0;
                            if (i21 != 0) {
                                obj4 = obj3;
                                i5 = i27 == true ? 1 : 0;
                                obj2 = obj4;
                                i4 = i8;
                                i6 = i13;
                                i7 = i24;
                            } else {
                                iZ = b34.d0(bArr2, i8, vw3Var2);
                                hft0.c.e(obj3, j, vw3Var2.b != 0);
                                i16 |= i29;
                                i12 = i2;
                                obj6 = obj3;
                                i14 = i24;
                            }
                            break;
                        case 8:
                            obj3 = obj6;
                            i31 = i31;
                            i8 = iA0;
                            if (i21 != 2) {
                                obj4 = obj3;
                                i5 = i27 == true ? 1 : 0;
                                obj2 = obj4;
                                i4 = i8;
                                i6 = i13;
                                i7 = i24;
                            } else {
                                iZ = (i26 & 536870912) == 0 ? b34.X(bArr2, i8, vw3Var2) : b34.Y(bArr2, i8, vw3Var2);
                                unsafe.putObject(obj3, j, vw3Var2.c);
                                i16 |= i29;
                                i12 = i2;
                                obj6 = obj3;
                                i14 = i24;
                            }
                            break;
                        case 9:
                            obj3 = obj6;
                            if (i21 != 2) {
                                i8 = iA0;
                                obj4 = obj3;
                                i5 = i27 == true ? 1 : 0;
                                obj2 = obj4;
                                i4 = i8;
                                i6 = i13;
                                i7 = i24;
                            } else {
                                Object objW = o640Var.w(i24, obj3);
                                int iO0 = b34.o0(objW, o640Var.p(i24), bArr2, iA0, i12, vw3Var2);
                                o640Var.N(i24, obj3, objW);
                                i16 |= i29;
                                i12 = i2;
                                iZ = iO0;
                                obj6 = obj3;
                                i14 = i24;
                            }
                            break;
                        case 10:
                            obj3 = obj6;
                            if (i21 != 2) {
                                i8 = iA0;
                                obj4 = obj3;
                                i5 = i27 == true ? 1 : 0;
                                obj2 = obj4;
                                i4 = i8;
                                i6 = i13;
                                i7 = i24;
                            } else {
                                iZ = b34.T(bArr2, iA0, vw3Var2);
                                unsafe.putObject(obj3, j, vw3Var2.c);
                                i16 |= i29;
                                obj6 = obj3;
                                i14 = i24;
                            }
                            break;
                        case 12:
                            obj3 = obj6;
                            if (i21 != 0) {
                                i8 = iA0;
                                obj4 = obj3;
                                i5 = i27 == true ? 1 : 0;
                                obj2 = obj4;
                                i4 = i8;
                                i6 = i13;
                                i7 = i24;
                            } else {
                                iZ = b34.b0(bArr2, iA0, vw3Var2);
                                unsafe.putInt(obj3, j, vw3Var2.f38129a);
                                i16 |= i29;
                                obj6 = obj3;
                                i14 = i24;
                            }
                            break;
                        case 15:
                            obj3 = obj6;
                            if (i21 != 0) {
                                i8 = iA0;
                                obj4 = obj3;
                                i5 = i27 == true ? 1 : 0;
                                obj2 = obj4;
                                i4 = i8;
                                i6 = i13;
                                i7 = i24;
                            } else {
                                iZ = b34.b0(bArr2, iA0, vw3Var2);
                                unsafe.putInt(obj3, j, oyc.b(vw3Var2.f38129a));
                                i16 |= i29;
                                obj6 = obj3;
                                i14 = i24;
                            }
                            break;
                        case 16:
                            if (i21 != 0) {
                                i31 = i31;
                                obj4 = obj6;
                                i8 = iA0;
                                i5 = i27 == true ? 1 : 0;
                                obj2 = obj4;
                                i4 = i8;
                                i6 = i13;
                                i7 = i24;
                            } else {
                                int iD1 = b34.d0(bArr2, iA0, vw3Var2);
                                unsafe.putLong(obj6, j, oyc.c(vw3Var2.b));
                                i16 |= i29;
                                iZ = iD1;
                                i14 = i24;
                            }
                            break;
                        default:
                            obj4 = obj6;
                            i31 = i31;
                            i8 = iA0;
                            i5 = i27 == true ? 1 : 0;
                            obj2 = obj4;
                            i4 = i8;
                            i6 = i13;
                            i7 = i24;
                            break;
                    }
                } else {
                    Object obj8 = obj6;
                    int i32 = iA0;
                    if (iP != 27) {
                        i5 = i27 == true ? 1 : 0;
                        if (iP <= 49) {
                            i10 = i15;
                            i11 = i16;
                            i6 = i13;
                            int iF = o640Var.F(obj, bArr, i32, i2, i5 == true ? 1 : 0, i21, i24, i26, iP, j, vw3Var);
                            obj6 = obj;
                            i7 = i24;
                            if (iF != i32) {
                                bArr2 = bArr;
                                i12 = i2;
                                vw3Var2 = vw3Var;
                                iZ = iF;
                                i14 = i7;
                                i15 = i10;
                                i13 = i6;
                                i16 = i11;
                            } else {
                                obj2 = obj6;
                                i4 = iF;
                                i15 = i10;
                                i16 = i11;
                            }
                        } else {
                            i9 = i32;
                            i10 = i15;
                            obj5 = obj;
                            i6 = i13;
                            i7 = i24;
                            i11 = i16;
                            if (iP != 50) {
                                int iD = o640Var.D(obj5, bArr, i9, i2, i5 == true ? 1 : 0, i6, i21, i26, iP, j, i7, vw3Var);
                                obj2 = obj5;
                                if (iD != i9) {
                                    o640Var = this;
                                    i12 = i2;
                                    vw3Var2 = vw3Var;
                                    obj6 = obj2;
                                    iZ = iD;
                                    i14 = i7;
                                    i15 = i10;
                                    i13 = i6;
                                    i16 = i11;
                                    bArr2 = bArr;
                                } else {
                                    i4 = iD;
                                    i15 = i10;
                                    i16 = i11;
                                }
                            } else if (i21 == 2) {
                                o640Var.C(obj5, i7, j);
                                throw null;
                            }
                        }
                    } else if (i21 == 2) {
                        zlx zlxVarN = (zlx) unsafe.getObject(obj8, j);
                        if (!((m4) zlxVarN).f21141a) {
                            int size = zlxVarN.size();
                            zlxVarN = zlxVarN.n(size == 0 ? 10 : size * 2);
                            unsafe.putObject(obj8, j, zlxVarN);
                        }
                        iZ = b34.W(o640Var.p(i24), i27 == true ? 1 : 0, bArr2, i32, i2, zlxVarN, vw3Var2);
                        obj6 = obj;
                        bArr2 = bArr;
                        i12 = i2;
                        vw3Var2 = vw3Var;
                        i14 = i24;
                    } else {
                        obj5 = obj;
                        i5 = i27 == true ? 1 : 0;
                        i9 = i32;
                        i10 = i15;
                        i11 = i16;
                        i6 = i13;
                        i7 = i24;
                    }
                    obj2 = obj5;
                    i4 = i9;
                    i15 = i10;
                    i16 = i11;
                }
            }
            jjt jjtVar = (jjt) obj2;
            wdt0 wdt0VarC = jjtVar.unknownFields;
            if (wdt0VarC == wdt0.f) {
                wdt0VarC = wdt0.c();
                jjtVar.unknownFields = wdt0VarC;
            }
            bArr2 = bArr;
            vw3Var2 = vw3Var;
            iZ = b34.Z(i5 == true ? 1 : 0, bArr, i4, i2, wdt0VarC, vw3Var);
            i12 = i2;
            obj6 = obj2;
            i14 = i7;
            i13 = i6;
            o640Var = this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d7 A[PHI: r3
  0x00d7: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x01f0, B:41:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // a.o2h0
    public final int i(jjt jjtVar) {
        int i;
        int iB;
        int i2;
        int[] iArr = this.f24717a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iQ = Q(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iQ;
            int i6 = 1237;
            int iHashCode = 37;
            switch (P(iQ)) {
                case 0:
                    i = i3 * 53;
                    iB = cmx.b(Double.doubleToLongBits(hft0.c.c(jjtVar, j)));
                    i3 = iB + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iB = Float.floatToIntBits(hft0.c.d(jjtVar, j));
                    i3 = iB + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iB = cmx.b(hft0.i(jjtVar, j));
                    i3 = iB + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iB = cmx.b(hft0.i(jjtVar, j));
                    i3 = iB + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iB = hft0.h(jjtVar, j);
                    i3 = iB + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iB = cmx.b(hft0.i(jjtVar, j));
                    i3 = iB + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iB = hft0.h(jjtVar, j);
                    i3 = iB + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zA = hft0.c.a(jjtVar, j);
                    Charset charset = cmx.f4629a;
                    if (zA) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iB = ((String) hft0.j(jjtVar, j)).hashCode();
                    i3 = iB + i;
                    break;
                case 9:
                    Object objJ = hft0.j(jjtVar, j);
                    if (objJ != null) {
                        iHashCode = objJ.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iB = hft0.j(jjtVar, j).hashCode();
                    i3 = iB + i;
                    break;
                case 11:
                    i = i3 * 53;
                    iB = hft0.h(jjtVar, j);
                    i3 = iB + i;
                    break;
                case 12:
                    i = i3 * 53;
                    iB = hft0.h(jjtVar, j);
                    i3 = iB + i;
                    break;
                case 13:
                    i = i3 * 53;
                    iB = hft0.h(jjtVar, j);
                    i3 = iB + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iB = cmx.b(hft0.i(jjtVar, j));
                    i3 = iB + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iB = hft0.h(jjtVar, j);
                    i3 = iB + i;
                    break;
                case 16:
                    i = i3 * 53;
                    iB = cmx.b(hft0.i(jjtVar, j));
                    i3 = iB + i;
                    break;
                case 17:
                    Object objJ2 = hft0.j(jjtVar, j);
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
                    iB = hft0.j(jjtVar, j).hashCode();
                    i3 = iB + i;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    i = i3 * 53;
                    iB = hft0.j(jjtVar, j).hashCode();
                    i3 = iB + i;
                    break;
                case 51:
                    if (s(i5, i4, jjtVar)) {
                        i = i3 * 53;
                        iB = cmx.b(Double.doubleToLongBits(((Double) hft0.j(jjtVar, j)).doubleValue()));
                        i3 = iB + i;
                    }
                    break;
                case 52:
                    if (s(i5, i4, jjtVar)) {
                        i = i3 * 53;
                        iB = Float.floatToIntBits(((Float) hft0.j(jjtVar, j)).floatValue());
                        i3 = iB + i;
                    }
                    break;
                case 53:
                    if (s(i5, i4, jjtVar)) {
                        i = i3 * 53;
                        iB = cmx.b(B(jjtVar, j));
                        i3 = iB + i;
                    }
                    break;
                case 54:
                    if (s(i5, i4, jjtVar)) {
                        i = i3 * 53;
                        iB = cmx.b(B(jjtVar, j));
                        i3 = iB + i;
                    }
                    break;
                case 55:
                    if (s(i5, i4, jjtVar)) {
                        i = i3 * 53;
                        iB = A(jjtVar, j);
                        i3 = iB + i;
                    }
                    break;
                case 56:
                    if (s(i5, i4, jjtVar)) {
                        i = i3 * 53;
                        iB = cmx.b(B(jjtVar, j));
                        i3 = iB + i;
                    }
                    break;
                case 57:
                    if (s(i5, i4, jjtVar)) {
                        i = i3 * 53;
                        iB = A(jjtVar, j);
                        i3 = iB + i;
                    }
                    break;
                case 58:
                    if (s(i5, i4, jjtVar)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) hft0.j(jjtVar, j)).booleanValue();
                        Charset charset2 = cmx.f4629a;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (s(i5, i4, jjtVar)) {
                        i = i3 * 53;
                        iB = ((String) hft0.j(jjtVar, j)).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 60:
                    if (s(i5, i4, jjtVar)) {
                        i = i3 * 53;
                        iB = hft0.j(jjtVar, j).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 61:
                    if (s(i5, i4, jjtVar)) {
                        i = i3 * 53;
                        iB = hft0.j(jjtVar, j).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 62:
                    if (s(i5, i4, jjtVar)) {
                        i = i3 * 53;
                        iB = A(jjtVar, j);
                        i3 = iB + i;
                    }
                    break;
                case 63:
                    if (s(i5, i4, jjtVar)) {
                        i = i3 * 53;
                        iB = A(jjtVar, j);
                        i3 = iB + i;
                    }
                    break;
                case 64:
                    if (s(i5, i4, jjtVar)) {
                        i = i3 * 53;
                        iB = A(jjtVar, j);
                        i3 = iB + i;
                    }
                    break;
                case 65:
                    if (s(i5, i4, jjtVar)) {
                        i = i3 * 53;
                        iB = cmx.b(B(jjtVar, j));
                        i3 = iB + i;
                    }
                    break;
                case 66:
                    if (s(i5, i4, jjtVar)) {
                        i = i3 * 53;
                        iB = A(jjtVar, j);
                        i3 = iB + i;
                    }
                    break;
                case 67:
                    if (s(i5, i4, jjtVar)) {
                        i = i3 * 53;
                        iB = cmx.b(B(jjtVar, j));
                        i3 = iB + i;
                    }
                    break;
                case 68:
                    if (s(i5, i4, jjtVar)) {
                        i = i3 * 53;
                        iB = hft0.j(jjtVar, j).hashCode();
                        i3 = iB + i;
                    }
                    break;
            }
        }
        this.m.getClass();
        return jjtVar.unknownFields.hashCode() + (i3 * 53);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    @Override // a.o2h0
    public final boolean j(jjt jjtVar, jjt jjtVar2) {
        int[] iArr = this.f24717a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zX = true;
            if (i < length) {
                int iQ = Q(i);
                long j = iQ & 1048575;
                switch (P(iQ)) {
                    case 0:
                        if (!k(jjtVar, jjtVar2, i)) {
                            zX = false;
                        } else {
                            gft0 gft0Var = hft0.c;
                            if (Double.doubleToLongBits(gft0Var.c(jjtVar, j)) != Double.doubleToLongBits(gft0Var.c(jjtVar2, j))) {
                                zX = false;
                            }
                        }
                        break;
                    case 1:
                        if (!k(jjtVar, jjtVar2, i)) {
                            zX = false;
                        } else {
                            gft0 gft0Var2 = hft0.c;
                            if (Float.floatToIntBits(gft0Var2.d(jjtVar, j)) != Float.floatToIntBits(gft0Var2.d(jjtVar2, j))) {
                                zX = false;
                            }
                        }
                        break;
                    case 2:
                        if (!k(jjtVar, jjtVar2, i) || hft0.i(jjtVar, j) != hft0.i(jjtVar2, j)) {
                            zX = false;
                        }
                        break;
                    case 3:
                        if (!k(jjtVar, jjtVar2, i) || hft0.i(jjtVar, j) != hft0.i(jjtVar2, j)) {
                            zX = false;
                        }
                        break;
                    case 4:
                        if (!k(jjtVar, jjtVar2, i) || hft0.h(jjtVar, j) != hft0.h(jjtVar2, j)) {
                            zX = false;
                        }
                        break;
                    case 5:
                        if (!k(jjtVar, jjtVar2, i) || hft0.i(jjtVar, j) != hft0.i(jjtVar2, j)) {
                            zX = false;
                        }
                        break;
                    case 6:
                        if (!k(jjtVar, jjtVar2, i) || hft0.h(jjtVar, j) != hft0.h(jjtVar2, j)) {
                            zX = false;
                        }
                        break;
                    case 7:
                        if (!k(jjtVar, jjtVar2, i)) {
                            zX = false;
                        } else {
                            gft0 gft0Var3 = hft0.c;
                            if (gft0Var3.a(jjtVar, j) != gft0Var3.a(jjtVar2, j)) {
                                zX = false;
                            }
                        }
                        break;
                    case 8:
                        if (!k(jjtVar, jjtVar2, i) || !w2h0.x(hft0.j(jjtVar, j), hft0.j(jjtVar2, j))) {
                            zX = false;
                        }
                        break;
                    case 9:
                        if (!k(jjtVar, jjtVar2, i) || !w2h0.x(hft0.j(jjtVar, j), hft0.j(jjtVar2, j))) {
                            zX = false;
                        }
                        break;
                    case 10:
                        if (!k(jjtVar, jjtVar2, i) || !w2h0.x(hft0.j(jjtVar, j), hft0.j(jjtVar2, j))) {
                            zX = false;
                        }
                        break;
                    case 11:
                        if (!k(jjtVar, jjtVar2, i) || hft0.h(jjtVar, j) != hft0.h(jjtVar2, j)) {
                            zX = false;
                        }
                        break;
                    case 12:
                        if (!k(jjtVar, jjtVar2, i) || hft0.h(jjtVar, j) != hft0.h(jjtVar2, j)) {
                            zX = false;
                        }
                        break;
                    case 13:
                        if (!k(jjtVar, jjtVar2, i) || hft0.h(jjtVar, j) != hft0.h(jjtVar2, j)) {
                            zX = false;
                        }
                        break;
                    case 14:
                        if (!k(jjtVar, jjtVar2, i) || hft0.i(jjtVar, j) != hft0.i(jjtVar2, j)) {
                            zX = false;
                        }
                        break;
                    case 15:
                        if (!k(jjtVar, jjtVar2, i) || hft0.h(jjtVar, j) != hft0.h(jjtVar2, j)) {
                            zX = false;
                        }
                        break;
                    case 16:
                        if (!k(jjtVar, jjtVar2, i) || hft0.i(jjtVar, j) != hft0.i(jjtVar2, j)) {
                            zX = false;
                        }
                        break;
                    case 17:
                        if (!k(jjtVar, jjtVar2, i) || !w2h0.x(hft0.j(jjtVar, j), hft0.j(jjtVar2, j))) {
                            zX = false;
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
                        zX = w2h0.x(hft0.j(jjtVar, j), hft0.j(jjtVar2, j));
                        break;
                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                        zX = w2h0.x(hft0.j(jjtVar, j), hft0.j(jjtVar2, j));
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
                        long j2 = iArr[i + 2] & 1048575;
                        if (hft0.h(jjtVar, j2) != hft0.h(jjtVar2, j2) || !w2h0.x(hft0.j(jjtVar, j), hft0.j(jjtVar2, j))) {
                            zX = false;
                        }
                        break;
                }
                if (zX) {
                    i += 3;
                }
            } else {
                this.m.getClass();
                if (jjtVar.unknownFields.equals(jjtVar2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean k(jjt jjtVar, jjt jjtVar2, int i) {
        return q(i, jjtVar) == q(i, jjtVar2);
    }

    public final void m(int i, Object obj, Object obj2) {
        int i2 = this.f24717a[i];
        if (hft0.j(obj, Q(i) & 1048575) == null) {
            return;
        }
        n(i);
    }

    public final void n(int i) {
        if (this.b[f140.b(i, 3, 2, 1)] == null) {
            return;
        }
        hny.b();
    }

    public final Object o(int i) {
        return this.b[(i / 3) * 2];
    }

    public final o2h0 p(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        o2h0 o2h0Var = (o2h0) objArr[i2];
        if (o2h0Var != null) {
            return o2h0Var;
        }
        o2h0 o2h0VarA = z4d0.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = o2h0VarA;
        return o2h0VarA;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x00f1 A[RETURN] */
    public final boolean q(int i, Object obj) {
        int i2 = this.f24717a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & hft0.h(obj, j)) != 0) {
                return true;
            }
            return false;
        }
        int iQ = Q(i);
        long j2 = iQ & 1048575;
        switch (P(iQ)) {
            case 0:
                if (Double.doubleToRawLongBits(hft0.c.c(obj, j2)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(hft0.c.d(obj, j2)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (hft0.i(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (hft0.i(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (hft0.h(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (hft0.i(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (hft0.h(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 7:
                return hft0.c.a(obj, j2);
            case 8:
                Object objJ = hft0.j(obj, j2);
                if (objJ instanceof String) {
                    return !((String) objJ).isEmpty();
                }
                if (objJ instanceof og9) {
                    return !og9.b.equals(objJ);
                }
                e9d0.o();
                return false;
            case 9:
                if (hft0.j(obj, j2) != null) {
                    return true;
                }
                return false;
            case 10:
                return !og9.b.equals(hft0.j(obj, j2));
            case 11:
                if (hft0.h(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (hft0.h(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (hft0.h(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (hft0.i(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (hft0.h(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (hft0.i(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (hft0.j(obj, j2) != null) {
                    return true;
                }
                return false;
            default:
                e9d0.o();
                return false;
        }
    }

    public final boolean s(int i, int i2, Object obj) {
        return hft0.h(obj, (long) (this.f24717a[i2 + 2] & 1048575)) == i;
    }

    public final void t(int i, Object obj, Object obj2) {
        long jQ = Q(i) & 1048575;
        Object objJ = hft0.j(obj, jQ);
        xo20 xo20Var = this.n;
        if (objJ != null) {
            xo20Var.getClass();
            if (!((uo20) objJ).f35991a) {
                Object objD = uo20.b.d();
                xo20.b(objD, objJ);
                hft0.q(obj, jQ, objD);
                objJ = objD;
            }
        } else {
            xo20Var.getClass();
            objJ = uo20.b.d();
            hft0.q(obj, jQ, objJ);
        }
        xo20Var.getClass();
        rw2.w(obj2);
        throw null;
    }

    public final void u(int i, Object obj, Object obj2) {
        if (q(i, obj2)) {
            long jQ = Q(i) & 1048575;
            Unsafe unsafe = p;
            Object object = unsafe.getObject(obj2, jQ);
            if (object == null) {
                hny.i(this.f24717a[i], obj2);
                return;
            }
            o2h0 o2h0VarP = p(i);
            if (!q(i, obj)) {
                if (r(object)) {
                    Object objD = o2h0VarP.d();
                    o2h0VarP.a(objD, object);
                    unsafe.putObject(obj, jQ, objD);
                } else {
                    unsafe.putObject(obj, jQ, object);
                }
                K(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jQ);
            if (!r(object2)) {
                Object objD2 = o2h0VarP.d();
                o2h0VarP.a(objD2, object2);
                unsafe.putObject(obj, jQ, objD2);
                object2 = objD2;
            }
            o2h0VarP.a(object2, object);
        }
    }

    public final void v(int i, Object obj, Object obj2) {
        int[] iArr = this.f24717a;
        int i2 = iArr[i];
        if (s(i2, i, obj2)) {
            long jQ = Q(i) & 1048575;
            Unsafe unsafe = p;
            Object object = unsafe.getObject(obj2, jQ);
            if (object == null) {
                hny.i(iArr[i], obj2);
                return;
            }
            o2h0 o2h0VarP = p(i);
            if (!s(i2, i, obj)) {
                if (r(object)) {
                    Object objD = o2h0VarP.d();
                    o2h0VarP.a(objD, object);
                    unsafe.putObject(obj, jQ, objD);
                } else {
                    unsafe.putObject(obj, jQ, object);
                }
                L(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jQ);
            if (!r(object2)) {
                Object objD2 = o2h0VarP.d();
                o2h0VarP.a(objD2, object2);
                unsafe.putObject(obj, jQ, objD2);
                object2 = objD2;
            }
            o2h0VarP.a(object2, object);
        }
    }

    public final Object w(int i, Object obj) {
        o2h0 o2h0VarP = p(i);
        long jQ = Q(i) & 1048575;
        if (!q(i, obj)) {
            return o2h0VarP.d();
        }
        Object object = p.getObject(obj, jQ);
        if (r(object)) {
            return object;
        }
        Object objD = o2h0VarP.d();
        if (object != null) {
            o2h0VarP.a(objD, object);
        }
        return objD;
    }

    public final Object x(int i, int i2, Object obj) {
        o2h0 o2h0VarP = p(i2);
        if (!s(i, i2, obj)) {
            return o2h0VarP.d();
        }
        Object object = p.getObject(obj, Q(i2) & 1048575);
        if (r(object)) {
            return object;
        }
        Object objD = o2h0VarP.d();
        if (object != null) {
            o2h0VarP.a(objD, object);
        }
        return objD;
    }
}

package a;

import com.appsflyer.share.attribution.RequestError;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class q640 implements q2h0 {
    public static final int[] n = new int[0];
    public static final Unsafe o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f28183a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final a4 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final fm50 j;
    public final ed00 k;
    public final bet0 l;
    public final zo20 m;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new cft0((byte) 2));
        } catch (Throwable unused) {
            unsafe = null;
        }
        o = unsafe;
    }

    public q640(int[] iArr, Object[] objArr, int i, int i2, a4 a4Var, int[] iArr2, int i3, int i4, fm50 fm50Var, ed00 ed00Var, bet0 bet0Var, xso xsoVar, zo20 zo20Var) {
        this.f28183a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = a4Var instanceof mjt;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = fm50Var;
        this.k = ed00Var;
        this.l = bet0Var;
        this.e = a4Var;
        this.m = zo20Var;
    }

    public static Field F(Class cls, String str) {
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

    public static int I(int i) {
        return (i & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof mjt) {
            return ((mjt) obj).g();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:170:0x035c  */
    /* JADX WARN: Code duplicated, block: B:185:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:188:0x03bb  */
    public static q640 w(z9e0 z9e0Var, fm50 fm50Var, ed00 ed00Var, bet0 bet0Var, xso xsoVar, zo20 zo20Var) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int i11;
        char cCharAt4;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        int i14;
        char cCharAt7;
        int i15;
        char cCharAt8;
        int i16;
        int i17;
        int i18;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i19;
        int i20;
        int i21;
        int iObjectFieldOffset3;
        Field fieldF;
        int i22;
        char cCharAt9;
        int i23;
        int i24;
        Field fieldF2;
        Field fieldF3;
        int i25;
        char cCharAt10;
        int i26;
        int i27;
        char cCharAt11;
        int i28;
        char cCharAt12;
        int i29;
        char cCharAt13;
        if (!(z9e0Var instanceof z9e0)) {
            hny.b();
            return null;
        }
        String str = z9e0Var.b;
        int length = str.length();
        int i30 = 55296;
        if (str.charAt(0) >= 55296) {
            int i31 = 1;
            while (true) {
                i = i31 + 1;
                if (str.charAt(i31) < 55296) {
                    break;
                }
                i31 = i;
            }
        } else {
            i = 1;
        }
        int i32 = i + 1;
        int iCharAt2 = str.charAt(i);
        if (iCharAt2 >= 55296) {
            int i33 = iCharAt2 & 8191;
            int i34 = 13;
            while (true) {
                i29 = i32 + 1;
                cCharAt13 = str.charAt(i32);
                if (cCharAt13 < 55296) {
                    break;
                }
                i33 |= (cCharAt13 & 8191) << i34;
                i34 += 13;
                i32 = i29;
            }
            iCharAt2 = i33 | (cCharAt13 << i34);
            i32 = i29;
        }
        if (iCharAt2 == 0) {
            i3 = 0;
            i6 = 0;
            iCharAt = 0;
            i2 = 0;
            i5 = 0;
            i7 = 0;
            iArr = n;
            i4 = 0;
        } else {
            int i35 = i32 + 1;
            int iCharAt3 = str.charAt(i32);
            if (iCharAt3 >= 55296) {
                int i36 = iCharAt3 & 8191;
                int i37 = 13;
                while (true) {
                    i15 = i35 + 1;
                    cCharAt8 = str.charAt(i35);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i36 |= (cCharAt8 & 8191) << i37;
                    i37 += 13;
                    i35 = i15;
                }
                iCharAt3 = i36 | (cCharAt8 << i37);
                i35 = i15;
            }
            int i38 = i35 + 1;
            int iCharAt4 = str.charAt(i35);
            if (iCharAt4 >= 55296) {
                int i39 = iCharAt4 & 8191;
                int i40 = 13;
                while (true) {
                    i14 = i38 + 1;
                    cCharAt7 = str.charAt(i38);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt7 & 8191) << i40;
                    i40 += 13;
                    i38 = i14;
                }
                iCharAt4 = i39 | (cCharAt7 << i40);
                i38 = i14;
            }
            int i41 = i38 + 1;
            int iCharAt5 = str.charAt(i38);
            if (iCharAt5 >= 55296) {
                int i42 = iCharAt5 & 8191;
                int i43 = 13;
                while (true) {
                    i13 = i41 + 1;
                    cCharAt6 = str.charAt(i41);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt6 & 8191) << i43;
                    i43 += 13;
                    i41 = i13;
                }
                iCharAt5 = i42 | (cCharAt6 << i43);
                i41 = i13;
            }
            int i44 = i41 + 1;
            int iCharAt6 = str.charAt(i41);
            if (iCharAt6 >= 55296) {
                int i45 = iCharAt6 & 8191;
                int i46 = 13;
                while (true) {
                    i12 = i44 + 1;
                    cCharAt5 = str.charAt(i44);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt5 & 8191) << i46;
                    i46 += 13;
                    i44 = i12;
                }
                iCharAt6 = i45 | (cCharAt5 << i46);
                i44 = i12;
            }
            int i47 = i44 + 1;
            iCharAt = str.charAt(i44);
            if (iCharAt >= 55296) {
                int i48 = iCharAt & 8191;
                int i49 = 13;
                while (true) {
                    i11 = i47 + 1;
                    cCharAt4 = str.charAt(i47);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt4 & 8191) << i49;
                    i49 += 13;
                    i47 = i11;
                }
                iCharAt = i48 | (cCharAt4 << i49);
                i47 = i11;
            }
            int i50 = i47 + 1;
            int iCharAt7 = str.charAt(i47);
            if (iCharAt7 >= 55296) {
                int i51 = iCharAt7 & 8191;
                int i52 = 13;
                while (true) {
                    i10 = i50 + 1;
                    cCharAt3 = str.charAt(i50);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt3 & 8191) << i52;
                    i52 += 13;
                    i50 = i10;
                }
                iCharAt7 = i51 | (cCharAt3 << i52);
                i50 = i10;
            }
            int i53 = i50 + 1;
            int iCharAt8 = str.charAt(i50);
            if (iCharAt8 >= 55296) {
                int i54 = iCharAt8 & 8191;
                int i55 = 13;
                while (true) {
                    i9 = i53 + 1;
                    cCharAt2 = str.charAt(i53);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt2 & 8191) << i55;
                    i55 += 13;
                    i53 = i9;
                }
                iCharAt8 = i54 | (cCharAt2 << i55);
                i53 = i9;
            }
            int i56 = i53 + 1;
            int iCharAt9 = str.charAt(i53);
            if (iCharAt9 >= 55296) {
                int i57 = iCharAt9 & 8191;
                int i58 = 13;
                while (true) {
                    i8 = i56 + 1;
                    cCharAt = str.charAt(i56);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i57 |= (cCharAt & 8191) << i58;
                    i58 += 13;
                    i56 = i8;
                }
                iCharAt9 = i57 | (cCharAt << i58);
                i56 = i8;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i59 = (iCharAt3 * 2) + iCharAt4;
            int i60 = iCharAt7;
            i2 = iCharAt5;
            i3 = i60;
            i4 = iCharAt3;
            i32 = i56;
            iArr = iArr2;
            i5 = iCharAt6;
            i6 = i59;
            i7 = iCharAt9;
        }
        Object[] objArr = z9e0Var.c;
        Class<?> cls = z9e0Var.f44013a.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[iCharAt * 2];
        int i61 = i7 + i3;
        int i62 = i61;
        int i63 = i7;
        int i64 = 0;
        int i65 = 0;
        while (i32 < length) {
            int i66 = i32 + 1;
            int iCharAt10 = str.charAt(i32);
            if (iCharAt10 >= i30) {
                int i67 = iCharAt10 & 8191;
                int i68 = i66;
                int i69 = 13;
                while (true) {
                    i28 = i68 + 1;
                    cCharAt12 = str.charAt(i68);
                    i16 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i67 |= (cCharAt12 & 8191) << i69;
                    i69 += 13;
                    i68 = i28;
                    length = i16;
                }
                iCharAt10 = i67 | (cCharAt12 << i69);
                i17 = i28;
            } else {
                i16 = length;
                i17 = i66;
            }
            int i70 = i17 + 1;
            int iCharAt11 = str.charAt(i17);
            int i71 = iCharAt10;
            char c = 55296;
            if (iCharAt11 >= 55296) {
                int i72 = iCharAt11 & 8191;
                int i73 = 13;
                while (true) {
                    i27 = i70 + 1;
                    cCharAt11 = str.charAt(i70);
                    if (cCharAt11 < c) {
                        break;
                    }
                    i72 |= (cCharAt11 & 8191) << i73;
                    i73 += 13;
                    i70 = i27;
                    c = 55296;
                }
                iCharAt11 = i72 | (cCharAt11 << i73);
                i70 = i27;
            }
            int i74 = iCharAt11 & 255;
            int i75 = i4;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i65] = i64;
                i65++;
            }
            Unsafe unsafe = o;
            int[] iArr4 = iArr3;
            if (i74 >= 51) {
                int i76 = i70 + 1;
                int iCharAt12 = str.charAt(i70);
                if (iCharAt12 >= 55296) {
                    int i77 = iCharAt12 & 8191;
                    int i78 = i76;
                    int i79 = 13;
                    while (true) {
                        i25 = i78 + 1;
                        cCharAt10 = str.charAt(i78);
                        i26 = i77;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i77 = i26 | ((cCharAt10 & 8191) << i79);
                        i79 += 13;
                        i78 = i25;
                    }
                    iCharAt12 = i26 | (cCharAt10 << i79);
                    i24 = i25;
                } else {
                    i24 = i76;
                }
                int i80 = iCharAt12;
                int i81 = i74 - 51;
                int i82 = i24;
                if (i81 == 9 || i81 == 17) {
                    objArr2[f140.b(i64, 3, 2, 1)] = objArr[i6];
                    i6++;
                } else if (i81 == 12 && (hne.b(z9e0Var.a(), 1) || (iCharAt11 & 2048) != 0)) {
                    objArr2[f140.b(i64, 3, 2, 1)] = objArr[i6];
                    i6++;
                }
                int i83 = i80 * 2;
                Object obj = objArr[i83];
                if (obj instanceof Field) {
                    fieldF2 = (Field) obj;
                } else {
                    fieldF2 = F(cls, (String) obj);
                    objArr[i83] = fieldF2;
                }
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldF2);
                int i84 = i83 + 1;
                Object obj2 = objArr[i84];
                if (obj2 instanceof Field) {
                    fieldF3 = (Field) obj2;
                } else {
                    fieldF3 = F(cls, (String) obj2);
                    objArr[i84] = fieldF3;
                }
                str = str;
                i64 = i64;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldF3);
                i21 = i6;
                objArr2 = objArr2;
                i19 = i82;
                i20 = 0;
            } else {
                i61 = i61;
                int i85 = i6 + 1;
                Field fieldF4 = F(cls, (String) objArr[i6]);
                if (i74 == 9 || i74 == 17) {
                    objArr2 = objArr2;
                    objArr2[f140.b(i64, 3, 2, 1)] = fieldF4.getType();
                } else {
                    if (i74 == 27 || i74 == 49) {
                        objArr2 = objArr2;
                        i23 = i6 + 2;
                        objArr2[f140.b(i64, 3, 2, 1)] = objArr[i85];
                    } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                        int i86 = i6;
                        if (z9e0Var.a() == 1 || (iCharAt11 & 2048) != 0) {
                            objArr2 = objArr2;
                            i23 = i86 + 2;
                            objArr2[f140.b(i64, 3, 2, 1)] = objArr[i85];
                        } else {
                            objArr2 = objArr2;
                        }
                    } else {
                        if (i74 == 50) {
                            int i87 = i63 + 1;
                            iArr[i63] = i64;
                            int i88 = (i64 / 3) * 2;
                            int i89 = i6 + 2;
                            objArr2[i88] = objArr[i85];
                            if ((iCharAt11 & 2048) != 0) {
                                i18 = i6 + 3;
                                objArr2[i88 + 1] = objArr[i89];
                            } else {
                                i18 = i89;
                            }
                            i63 = i87;
                        } else {
                            objArr2 = objArr2;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                        if ((iCharAt11 & 4096) != 0 || i74 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i19 = i70;
                            i20 = 0;
                        } else {
                            i19 = i70 + 1;
                            int iCharAt13 = str.charAt(i70);
                            if (iCharAt13 >= 55296) {
                                int i90 = iCharAt13 & 8191;
                                int i91 = 13;
                                while (true) {
                                    i22 = i19 + 1;
                                    cCharAt9 = str.charAt(i19);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i90 |= (cCharAt9 & 8191) << i91;
                                    i91 += 13;
                                    i19 = i22;
                                }
                                iCharAt13 = i90 | (cCharAt9 << i91);
                                i19 = i22;
                            }
                            int i92 = (iCharAt13 / 32) + (i75 * 2);
                            Object obj3 = objArr[i92];
                            if (obj3 instanceof Field) {
                                fieldF = (Field) obj3;
                            } else {
                                fieldF = F(cls, (String) obj3);
                                objArr[i92] = fieldF;
                            }
                            int i93 = iCharAt13;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldF);
                            i20 = i93 % 32;
                        }
                        if (i74 >= 18 && i74 <= 49) {
                            iArr[i62] = iObjectFieldOffset;
                            i62++;
                        }
                        i21 = i18;
                        iObjectFieldOffset3 = iObjectFieldOffset;
                    }
                    i18 = i23;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                    if ((iCharAt11 & 4096) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i19 = i70;
                        i20 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i19 = i70;
                        i20 = 0;
                    }
                    if (i74 >= 18) {
                        iArr[i62] = iObjectFieldOffset;
                        i62++;
                    }
                    i21 = i18;
                    iObjectFieldOffset3 = iObjectFieldOffset;
                }
                i18 = i85;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                if ((iCharAt11 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i19 = i70;
                    i20 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i19 = i70;
                    i20 = 0;
                }
                if (i74 >= 18) {
                    iArr[i62] = iObjectFieldOffset;
                    i62++;
                }
                i21 = i18;
                iObjectFieldOffset3 = iObjectFieldOffset;
            }
            int i94 = i64 + 1;
            iArr4[i64] = i71;
            int i95 = i64 + 2;
            int i96 = i64;
            iArr4[i94] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i74 << 20) | iObjectFieldOffset3;
            iArr4[i95] = (i20 << 20) | iObjectFieldOffset2;
            i64 = i96 + 3;
            i32 = i19;
            objArr2 = objArr2;
            length = i16;
            str = str;
            iArr3 = iArr4;
            i61 = i61;
            i30 = 55296;
            i6 = i21;
            i4 = i75;
        }
        return new q640(iArr3, objArr2, i2, i5, z9e0Var.f44013a, iArr, i7, i61, fm50Var, ed00Var, bet0Var, xsoVar, zo20Var);
    }

    public static long x(int i) {
        return i & 1048575;
    }

    public static int y(Object obj, long j) {
        return ((Integer) jft0.h(obj, j)).intValue();
    }

    public static long z(Object obj, long j) {
        return ((Long) jft0.h(obj, j)).longValue();
    }

    public final int A(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        int[] iArr = this.f28183a;
        int length = (iArr.length / 3) - 1;
        int i2 = 0;
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

    public final void B(Object obj, long j, hu5 hu5Var, q2h0 q2h0Var, tso tsoVar) throws xnx {
        int iC;
        this.k.getClass();
        bmx bmxVarA = ed00.a(obj, j);
        oyc oycVar = (oyc) hu5Var.e;
        int i = hu5Var.b;
        if ((i & 7) != 3) {
            throw box.b();
        }
        do {
            mjt mjtVarD = q2h0Var.d();
            hu5Var.i(mjtVarD, q2h0Var, tsoVar);
            q2h0Var.b(mjtVarD);
            ((f5d0) bmxVarA).add(mjtVarD);
            if (oycVar.e() || hu5Var.d != 0) {
                return;
            } else {
                iC = oycVar.C();
            }
        } while (iC == i);
        hu5Var.d = iC;
    }

    public final void C(Object obj, int i, hu5 hu5Var, q2h0 q2h0Var, tso tsoVar) throws box {
        int iC;
        this.k.getClass();
        bmx bmxVarA = ed00.a(obj, i & 1048575);
        oyc oycVar = (oyc) hu5Var.e;
        int i2 = hu5Var.b;
        if ((i2 & 7) != 2) {
            throw box.b();
        }
        do {
            mjt mjtVarD = q2h0Var.d();
            hu5Var.k(mjtVarD, q2h0Var, tsoVar);
            q2h0Var.b(mjtVarD);
            ((f5d0) bmxVarA).add(mjtVarD);
            if (oycVar.e() || hu5Var.d != 0) {
                return;
            } else {
                iC = oycVar.C();
            }
        } while (iC == i2);
        hu5Var.d = iC;
    }

    public final void D(int i, hu5 hu5Var, Object obj) throws xnx, vnx {
        if ((536870912 & i) != 0) {
            hu5Var.W(2);
            jft0.o(obj, i & 1048575, ((oyc) hu5Var.e).B());
        } else if (!this.f) {
            jft0.o(obj, i & 1048575, hu5Var.n());
        } else {
            hu5Var.W(2);
            jft0.o(obj, i & 1048575, ((oyc) hu5Var.e).A());
        }
    }

    public final void E(int i, hu5 hu5Var, Object obj) throws xnx, vnx {
        boolean z = (536870912 & i) != 0;
        ed00 ed00Var = this.k;
        if (z) {
            ed00Var.getClass();
            hu5Var.O(ed00.a(obj, i & 1048575), true);
        } else {
            ed00Var.getClass();
            hu5Var.O(ed00.a(obj, i & 1048575), false);
        }
    }

    public final void G(int i, Object obj) {
        int i2 = this.f28183a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        jft0.m(obj, (1 << (i2 >>> 20)) | jft0.f(obj, j), j);
    }

    public final void H(int i, int i2, Object obj) {
        jft0.m(obj, i, this.f28183a[i2 + 2] & 1048575);
    }

    public final int J(int i) {
        return this.f28183a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // a.q2h0
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (!p(obj)) {
            e9d0.i(obj, "Mutating immutable message: ");
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f28183a;
            if (i >= iArr.length) {
                y2h0.k(this.l, obj, obj2);
                return;
            }
            int iJ = J(i);
            long j = 1048575 & iJ;
            int i2 = iArr[i];
            switch (I(iJ)) {
                case 0:
                    if (!n(i, obj2)) {
                        obj3 = obj;
                    } else {
                        gft0 gft0Var = jft0.c;
                        obj3 = obj;
                        gft0Var.g(obj3, j, gft0Var.c(obj2, j));
                        G(i, obj3);
                    }
                    break;
                case 1:
                    if (n(i, obj2)) {
                        gft0 gft0Var2 = jft0.c;
                        gft0Var2.h(obj, j, gft0Var2.d(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (n(i, obj2)) {
                        jft0.n(obj, j, jft0.g(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (n(i, obj2)) {
                        jft0.n(obj, j, jft0.g(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (n(i, obj2)) {
                        jft0.m(obj, jft0.f(obj2, j), j);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (n(i, obj2)) {
                        jft0.n(obj, j, jft0.g(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (n(i, obj2)) {
                        jft0.m(obj, jft0.f(obj2, j), j);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (n(i, obj2)) {
                        gft0 gft0Var3 = jft0.c;
                        gft0Var3.e(obj, j, gft0Var3.a(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (n(i, obj2)) {
                        jft0.o(obj, j, jft0.h(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    s(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (n(i, obj2)) {
                        jft0.o(obj, j, jft0.h(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (n(i, obj2)) {
                        jft0.m(obj, jft0.f(obj2, j), j);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (n(i, obj2)) {
                        jft0.m(obj, jft0.f(obj2, j), j);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (n(i, obj2)) {
                        jft0.m(obj, jft0.f(obj2, j), j);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (n(i, obj2)) {
                        jft0.n(obj, j, jft0.g(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (n(i, obj2)) {
                        jft0.m(obj, jft0.f(obj2, j), j);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (n(i, obj2)) {
                        jft0.n(obj, j, jft0.g(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    s(i, obj, obj2);
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
                    this.k.getClass();
                    bmx bmxVarE = (bmx) jft0.h(obj, j);
                    bmx bmxVar = (bmx) jft0.h(obj2, j);
                    int i3 = ((f5d0) bmxVarE).c;
                    int i4 = ((f5d0) bmxVar).c;
                    if (i3 > 0 && i4 > 0) {
                        if (!((f5d0) bmxVarE).f8958a) {
                            bmxVarE = ((f5d0) bmxVarE).e(i4 + i3);
                        }
                        ((f5d0) bmxVarE).addAll(bmxVar);
                    }
                    if (i3 > 0) {
                        bmxVar = bmxVarE;
                    }
                    jft0.o(obj, j, bmxVar);
                    obj3 = obj;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Class cls = y2h0.f41904a;
                    Object objH = jft0.h(obj, j);
                    Object objH2 = jft0.h(obj2, j);
                    this.m.getClass();
                    jft0.o(obj, j, zo20.a(objH, objH2));
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
                    if (q(i2, i, obj2)) {
                        jft0.o(obj, j, jft0.h(obj2, j));
                        H(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    t(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (q(i2, i, obj2)) {
                        jft0.o(obj, j, jft0.h(obj2, j));
                        H(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    t(i, obj, obj2);
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

    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x008d A[SYNTHETIC] */
    @Override // a.q2h0
    public final void b(Object obj) {
        if (p(obj)) {
            if (obj instanceof mjt) {
                mjt mjtVar = (mjt) obj;
                mjtVar.k(Integer.MAX_VALUE);
                mjtVar.memoizedHashCode = 0;
                mjtVar.h();
            }
            int[] iArr = this.f28183a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iJ = J(i);
                long j = 1048575 & iJ;
                int I = I(iJ);
                Unsafe unsafe = o;
                if (I != 9) {
                    if (I != 60 && I != 68) {
                        switch (I) {
                            case 17:
                                if (n(i, obj)) {
                                    m(i).b(unsafe.getObject(obj, j));
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
                                this.k.getClass();
                                f5d0 f5d0Var = (f5d0) ((bmx) jft0.h(obj, j));
                                if (f5d0Var.f8958a) {
                                    f5d0Var.f8958a = false;
                                }
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.m.getClass();
                                    ((wo20) object).f39471a = false;
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (q(iArr[i], i, obj)) {
                        m(i).b(unsafe.getObject(obj, j));
                    }
                } else if (n(i, obj)) {
                    m(i).b(unsafe.getObject(obj, j));
                }
            }
            this.l.getClass();
            ydt0 ydt0Var = ((mjt) obj).unknownFields;
            if (ydt0Var.e) {
                ydt0Var.e = false;
            }
        }
    }

    @Override // a.q2h0
    public final boolean c(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.h) {
            int i6 = this.g[i5];
            int[] iArr = this.f28183a;
            int i7 = iArr[i6];
            int iJ = J(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = o.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                int i11 = i4;
                i = i3;
                i2 = i11;
            }
            if ((268435456 & iJ) == 0 || o(obj, i6, i, i2, i10)) {
                int I = I(iJ);
                if (I != 9 && I != 17) {
                    if (I != 27) {
                        if (I == 60 || I == 68) {
                            if (!q(i7, i6, obj) || m(i6).c(jft0.h(obj, iJ & 1048575))) {
                                i5++;
                                i3 = i;
                                i4 = i2;
                            }
                        } else if (I != 49) {
                            if (I != 50) {
                                continue;
                            } else {
                                Object objH = jft0.h(obj, iJ & 1048575);
                                this.m.getClass();
                                wo20 wo20Var = (wo20) objH;
                                if (wo20Var.isEmpty()) {
                                    continue;
                                } else {
                                    if (((fov0) ((qo20) this.b[(i6 / 3) * 2]).f29051a.c).f9903a != iov0.MESSAGE) {
                                        continue;
                                    } else {
                                        q2h0 q2h0VarA = null;
                                        for (Object obj2 : wo20Var.values()) {
                                            if (q2h0VarA == null) {
                                                q2h0VarA = c5d0.c.a(obj2.getClass());
                                            }
                                            if (!q2h0VarA.c(obj2)) {
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
                    List list = (List) jft0.h(obj, iJ & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        q2h0 q2h0VarM = m(i6);
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            if (q2h0VarM.c(list.get(i12))) {
                            }
                        }
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                } else if (!o(obj, i6, i, i2, i10) || m(i6).c(jft0.h(obj, iJ & 1048575))) {
                    i5++;
                    i3 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        return true;
    }

    @Override // a.q2h0
    public final mjt d() {
        this.j.getClass();
        return ((mjt) this.e).i();
    }

    /* JADX WARN: Code duplicated, block: B:88:0x01ce  */
    @Override // a.q2h0
    public final int e(mjt mjtVar) {
        int i;
        int iH;
        int iH2;
        int iH3;
        int iJ;
        int iH4;
        int iJ2;
        int iH5;
        int iH6;
        int iH7;
        int iA;
        int i2;
        int iF;
        int iH8;
        int iA2;
        int iC;
        int iH9;
        int size;
        int i3;
        int iH10;
        int iH11;
        int size2;
        int iH12;
        int i4;
        int iA3;
        int iH13;
        int iH14;
        int iJ3;
        int iH15;
        int iJ4;
        int i5;
        q640 q640Var = this;
        mjt mjtVar2 = mjtVar;
        int i6 = 0;
        int i7 = 0;
        int iF2 = 0;
        int i8 = 1048575;
        while (true) {
            int[] iArr = q640Var.f28183a;
            if (i6 >= iArr.length) {
                q640Var.l.getClass();
                return mjtVar2.unknownFields.b() + iF2;
            }
            int iJ5 = q640Var.J(i6);
            int I = I(iJ5);
            int i9 = iArr[i6];
            int i10 = iArr[i6 + 2];
            int i11 = i10 & 1048575;
            Unsafe unsafe = o;
            if (I <= 17) {
                if (i11 != i8) {
                    i7 = i11 == 1048575 ? 0 : unsafe.getInt(mjtVar2, i11);
                    i8 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            long j = iJ5 & 1048575;
            if (I >= irp.b.f15270a) {
                byte b = irp.c.f15270a;
            }
            switch (I) {
                case 0:
                    if (q640Var.o(mjtVar2, i6, i8, i7, i)) {
                        iH = syc.h(i9);
                        iC = iH + 8;
                        iF2 += iC;
                    }
                    break;
                case 1:
                    if (q640Var.o(mjtVar2, i6, i8, i7, i)) {
                        iH2 = syc.h(i9);
                        iH6 = iH2 + 4;
                        iF2 += iH6;
                    }
                    q640Var = this;
                    mjtVar2 = mjtVar;
                    break;
                case 2:
                    if (q640Var.o(mjtVar2, i6, i8, i7, i)) {
                        long j2 = unsafe.getLong(mjtVar2, j);
                        iH3 = syc.h(i9);
                        iJ = syc.j(j2);
                        iF2 += iJ + iH3;
                    }
                    q640Var = this;
                    break;
                case 3:
                    if (q640Var.o(mjtVar2, i6, i8, i7, i)) {
                        long j3 = unsafe.getLong(mjtVar2, j);
                        iH3 = syc.h(i9);
                        iJ = syc.j(j3);
                        iF2 += iJ + iH3;
                    }
                    q640Var = this;
                    break;
                case 4:
                    if (q640Var.o(mjtVar2, i6, i8, i7, i)) {
                        int i12 = unsafe.getInt(mjtVar2, j);
                        iH4 = syc.h(i9);
                        iJ2 = syc.j(i12);
                        iF = iJ2 + iH4;
                        iF2 += iF;
                    }
                    q640Var = this;
                    break;
                case 5:
                    if (q640Var.o(mjtVar2, i6, i8, i7, i)) {
                        iH5 = syc.h(i9);
                        iH6 = iH5 + 8;
                        iF2 += iH6;
                    }
                    q640Var = this;
                    mjtVar2 = mjtVar;
                    break;
                case 6:
                    if (q640Var.o(mjtVar2, i6, i8, i7, i)) {
                        iH2 = syc.h(i9);
                        iH6 = iH2 + 4;
                        iF2 += iH6;
                    }
                    q640Var = this;
                    mjtVar2 = mjtVar;
                    break;
                case 7:
                    if (q640Var.o(mjtVar2, i6, i8, i7, i)) {
                        iH6 = syc.h(i9) + 1;
                        iF2 += iH6;
                    }
                    q640Var = this;
                    mjtVar2 = mjtVar;
                    break;
                case 8:
                    if (q640Var.o(mjtVar2, i6, i8, i7, i)) {
                        Object object = unsafe.getObject(mjtVar2, j);
                        iF2 = (object instanceof mg9 ? syc.f(i9, (mg9) object) : syc.g((String) object) + syc.h(i9)) + iF2;
                    }
                    q640Var = this;
                    break;
                case 9:
                    if (q640Var.o(mjtVar2, i6, i8, i7, i)) {
                        Object object2 = unsafe.getObject(mjtVar2, j);
                        q2h0 q2h0VarM = q640Var.m(i6);
                        Class cls = y2h0.f41904a;
                        iH7 = syc.h(i9);
                        iA = ((a4) object2).a(q2h0VarM);
                        i2 = syc.i(iA);
                        i5 = i2 + iA + iH7;
                        iF2 += i5;
                    }
                    break;
                case 10:
                    if (q640Var.o(mjtVar2, i6, i8, i7, i)) {
                        iF = syc.f(i9, (mg9) unsafe.getObject(mjtVar2, j));
                        iF2 += iF;
                    }
                    q640Var = this;
                    break;
                case 11:
                    if (q640Var.o(mjtVar2, i6, i8, i7, i)) {
                        int i13 = unsafe.getInt(mjtVar2, j);
                        iH4 = syc.h(i9);
                        iJ2 = syc.i(i13);
                        iF = iJ2 + iH4;
                        iF2 += iF;
                    }
                    q640Var = this;
                    break;
                case 12:
                    if (q640Var.o(mjtVar2, i6, i8, i7, i)) {
                        int i14 = unsafe.getInt(mjtVar2, j);
                        iH4 = syc.h(i9);
                        iJ2 = syc.j(i14);
                        iF = iJ2 + iH4;
                        iF2 += iF;
                    }
                    q640Var = this;
                    break;
                case 13:
                    if (q640Var.o(mjtVar2, i6, i8, i7, i)) {
                        iH2 = syc.h(i9);
                        iH6 = iH2 + 4;
                        iF2 += iH6;
                    }
                    q640Var = this;
                    mjtVar2 = mjtVar;
                    break;
                case 14:
                    if (q640Var.o(mjtVar2, i6, i8, i7, i)) {
                        iH5 = syc.h(i9);
                        iH6 = iH5 + 8;
                        iF2 += iH6;
                    }
                    q640Var = this;
                    mjtVar2 = mjtVar;
                    break;
                case 15:
                    if (q640Var.o(mjtVar2, i6, i8, i7, i)) {
                        int i15 = unsafe.getInt(mjtVar2, j);
                        iH4 = syc.h(i9);
                        iJ2 = syc.i((i15 >> 31) ^ (i15 << 1));
                        iF = iJ2 + iH4;
                        iF2 += iF;
                    }
                    q640Var = this;
                    break;
                case 16:
                    if (q640Var.o(mjtVar2, i6, i8, i7, i)) {
                        long j4 = unsafe.getLong(mjtVar2, j);
                        iH3 = syc.h(i9);
                        iJ = syc.j((j4 << 1) ^ (j4 >> 63));
                        iF2 += iJ + iH3;
                    }
                    q640Var = this;
                    break;
                case 17:
                    if (q640Var.o(mjtVar2, i6, i8, i7, i)) {
                        a4 a4Var = (a4) unsafe.getObject(mjtVar2, j);
                        q2h0 q2h0VarM2 = q640Var.m(i6);
                        iH8 = syc.h(i9) * 2;
                        iA2 = a4Var.a(q2h0VarM2);
                        iC = iA2 + iH8;
                        iF2 += iC;
                    }
                    break;
                case 18:
                    iC = y2h0.c(i9, (List) unsafe.getObject(mjtVar2, j));
                    iF2 += iC;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    iC = y2h0.b(i9, (List) unsafe.getObject(mjtVar2, j));
                    iF2 += iC;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(mjtVar2, j);
                    Class cls2 = y2h0.f41904a;
                    if (list.size() == 0) {
                        iH9 = 0;
                    } else {
                        iH9 = (syc.h(i9) * list.size()) + y2h0.e(list);
                    }
                    iF2 += iH9;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(mjtVar2, j);
                    Class cls3 = y2h0.f41904a;
                    size = list2.size();
                    if (size == 0) {
                        iH9 = 0;
                    } else {
                        i3 = y2h0.i(list2);
                        iH10 = syc.h(i9);
                        iH9 = (iH10 * size) + i3;
                    }
                    iF2 += iH9;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(mjtVar2, j);
                    Class cls4 = y2h0.f41904a;
                    size = list3.size();
                    if (size == 0) {
                        iH9 = 0;
                    } else {
                        i3 = y2h0.d(list3);
                        iH10 = syc.h(i9);
                        iH9 = (iH10 * size) + i3;
                    }
                    iF2 += iH9;
                    break;
                case 23:
                    iC = y2h0.c(i9, (List) unsafe.getObject(mjtVar2, j));
                    iF2 += iC;
                    break;
                case 24:
                    iC = y2h0.b(i9, (List) unsafe.getObject(mjtVar2, j));
                    iF2 += iC;
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    List list4 = (List) unsafe.getObject(mjtVar2, j);
                    Class cls5 = y2h0.f41904a;
                    int size3 = list4.size();
                    iF2 += size3 == 0 ? 0 : (syc.h(i9) + 1) * size3;
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    List list5 = (List) unsafe.getObject(mjtVar2, j);
                    Class cls6 = y2h0.f41904a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iH9 = 0;
                    } else {
                        iH9 = syc.h(i9) * size4;
                        for (int i16 = 0; i16 < size4; i16++) {
                            Object obj = list5.get(i16);
                            if (obj instanceof mg9) {
                                int size5 = ((mg9) obj).size();
                                iH9 = syc.i(size5) + size5 + iH9;
                            } else {
                                iH9 = syc.g((String) obj) + iH9;
                            }
                        }
                    }
                    iF2 += iH9;
                    break;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    List list6 = (List) unsafe.getObject(mjtVar2, j);
                    q2h0 q2h0VarM3 = q640Var.m(i6);
                    Class cls7 = y2h0.f41904a;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iH11 = 0;
                    } else {
                        iH11 = syc.h(i9) * size6;
                        for (int i17 = 0; i17 < size6; i17++) {
                            int iA4 = ((a4) list6.get(i17)).a(q2h0VarM3);
                            iH11 += syc.i(iA4) + iA4;
                        }
                    }
                    iF2 += iH11;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    List list7 = (List) unsafe.getObject(mjtVar2, j);
                    Class cls8 = y2h0.f41904a;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        iH9 = 0;
                    } else {
                        iH9 = syc.h(i9) * size7;
                        for (int i18 = 0; i18 < list7.size(); i18++) {
                            int size8 = ((mg9) list7.get(i18)).size();
                            iH9 += syc.i(size8) + size8;
                        }
                    }
                    iF2 += iH9;
                    break;
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                    List list8 = (List) unsafe.getObject(mjtVar2, j);
                    Class cls9 = y2h0.f41904a;
                    size = list8.size();
                    if (size == 0) {
                        iH9 = 0;
                    } else {
                        i3 = y2h0.h(list8);
                        iH10 = syc.h(i9);
                        iH9 = (iH10 * size) + i3;
                    }
                    iF2 += iH9;
                    break;
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                    List list9 = (List) unsafe.getObject(mjtVar2, j);
                    Class cls10 = y2h0.f41904a;
                    size = list9.size();
                    if (size == 0) {
                        iH9 = 0;
                    } else {
                        i3 = y2h0.a(list9);
                        iH10 = syc.h(i9);
                        iH9 = (iH10 * size) + i3;
                    }
                    iF2 += iH9;
                    break;
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                    iC = y2h0.b(i9, (List) unsafe.getObject(mjtVar2, j));
                    iF2 += iC;
                    break;
                case 32:
                    iC = y2h0.c(i9, (List) unsafe.getObject(mjtVar2, j));
                    iF2 += iC;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(mjtVar2, j);
                    Class cls11 = y2h0.f41904a;
                    size = list10.size();
                    if (size == 0) {
                        iH9 = 0;
                    } else {
                        i3 = y2h0.f(list10);
                        iH10 = syc.h(i9);
                        iH9 = (iH10 * size) + i3;
                    }
                    iF2 += iH9;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(mjtVar2, j);
                    Class cls12 = y2h0.f41904a;
                    size = list11.size();
                    if (size == 0) {
                        iH9 = 0;
                    } else {
                        i3 = y2h0.g(list11);
                        iH10 = syc.h(i9);
                        iH9 = (iH10 * size) + i3;
                    }
                    iF2 += iH9;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(mjtVar2, j);
                    Class cls13 = y2h0.f41904a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iH12 = syc.h(i9);
                        i4 = syc.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(mjtVar2, j);
                    Class cls14 = y2h0.f41904a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iH12 = syc.h(i9);
                        i4 = syc.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 37:
                    size2 = y2h0.e((List) unsafe.getObject(mjtVar2, j));
                    if (size2 > 0) {
                        iH12 = syc.h(i9);
                        i4 = syc.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 38:
                    size2 = y2h0.i((List) unsafe.getObject(mjtVar2, j));
                    if (size2 > 0) {
                        iH12 = syc.h(i9);
                        i4 = syc.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 39:
                    size2 = y2h0.d((List) unsafe.getObject(mjtVar2, j));
                    if (size2 > 0) {
                        iH12 = syc.h(i9);
                        i4 = syc.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(mjtVar2, j);
                    Class cls15 = y2h0.f41904a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iH12 = syc.h(i9);
                        i4 = syc.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(mjtVar2, j);
                    Class cls16 = y2h0.f41904a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iH12 = syc.h(i9);
                        i4 = syc.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(mjtVar2, j);
                    Class cls17 = y2h0.f41904a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iH12 = syc.h(i9);
                        i4 = syc.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 43:
                    size2 = y2h0.h((List) unsafe.getObject(mjtVar2, j));
                    if (size2 > 0) {
                        iH12 = syc.h(i9);
                        i4 = syc.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 44:
                    size2 = y2h0.a((List) unsafe.getObject(mjtVar2, j));
                    if (size2 > 0) {
                        iH12 = syc.h(i9);
                        i4 = syc.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(mjtVar2, j);
                    Class cls18 = y2h0.f41904a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iH12 = syc.h(i9);
                        i4 = syc.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(mjtVar2, j);
                    Class cls19 = y2h0.f41904a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iH12 = syc.h(i9);
                        i4 = syc.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 47:
                    size2 = y2h0.f((List) unsafe.getObject(mjtVar2, j));
                    if (size2 > 0) {
                        iH12 = syc.h(i9);
                        i4 = syc.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 48:
                    size2 = y2h0.g((List) unsafe.getObject(mjtVar2, j));
                    if (size2 > 0) {
                        iH12 = syc.h(i9);
                        i4 = syc.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(mjtVar2, j);
                    q2h0 q2h0VarM4 = q640Var.m(i6);
                    Class cls20 = y2h0.f41904a;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        iA3 = 0;
                    } else {
                        iA3 = 0;
                        for (int i19 = 0; i19 < size9; i19++) {
                            iA3 += ((a4) list19.get(i19)).a(q2h0VarM4) + (syc.h(i9) * 2);
                        }
                    }
                    iF2 += iA3;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Object object3 = unsafe.getObject(mjtVar2, j);
                    Object obj2 = q640Var.b[(i6 / 3) * 2];
                    q640Var.m.getClass();
                    wo20 wo20Var = (wo20) object3;
                    qo20 qo20Var = (qo20) obj2;
                    if (wo20Var.isEmpty()) {
                        iH9 = 0;
                    } else {
                        iH9 = 0;
                        for (Map.Entry entry : wo20Var.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            qo20Var.getClass();
                            int iH16 = syc.h(i9);
                            int iA5 = qo20.a(qo20Var.f29051a, key, value);
                            iH9 += syc.i(iA5) + iA5 + iH16;
                        }
                    }
                    iF2 += iH9;
                    break;
                case 51:
                    if (q640Var.q(i9, i6, mjtVar2)) {
                        iH = syc.h(i9);
                        iC = iH + 8;
                        iF2 += iC;
                    }
                    break;
                case 52:
                    if (q640Var.q(i9, i6, mjtVar2)) {
                        iH13 = syc.h(i9);
                        iC = iH13 + 4;
                        iF2 += iC;
                    }
                    break;
                case 53:
                    if (q640Var.q(i9, i6, mjtVar2)) {
                        long jZ = z(mjtVar2, j);
                        iH14 = syc.h(i9);
                        iJ3 = syc.j(jZ);
                        i5 = iJ3 + iH14;
                        iF2 += i5;
                    }
                    break;
                case 54:
                    if (q640Var.q(i9, i6, mjtVar2)) {
                        long jZ2 = z(mjtVar2, j);
                        iH14 = syc.h(i9);
                        iJ3 = syc.j(jZ2);
                        i5 = iJ3 + iH14;
                        iF2 += i5;
                    }
                    break;
                case 55:
                    if (q640Var.q(i9, i6, mjtVar2)) {
                        int iY = y(mjtVar2, j);
                        iH15 = syc.h(i9);
                        iJ4 = syc.j(iY);
                        iC = iJ4 + iH15;
                        iF2 += iC;
                    }
                    break;
                case 56:
                    if (q640Var.q(i9, i6, mjtVar2)) {
                        iH = syc.h(i9);
                        iC = iH + 8;
                        iF2 += iC;
                    }
                    break;
                case 57:
                    if (q640Var.q(i9, i6, mjtVar2)) {
                        iH13 = syc.h(i9);
                        iC = iH13 + 4;
                        iF2 += iC;
                    }
                    break;
                case 58:
                    if (q640Var.q(i9, i6, mjtVar2)) {
                        iC = syc.h(i9) + 1;
                        iF2 += iC;
                    }
                    break;
                case 59:
                    if (q640Var.q(i9, i6, mjtVar2)) {
                        Object object4 = unsafe.getObject(mjtVar2, j);
                        iF2 = (object4 instanceof mg9 ? syc.f(i9, (mg9) object4) : syc.g((String) object4) + syc.h(i9)) + iF2;
                    }
                    break;
                case 60:
                    if (q640Var.q(i9, i6, mjtVar2)) {
                        Object object5 = unsafe.getObject(mjtVar2, j);
                        q2h0 q2h0VarM5 = q640Var.m(i6);
                        Class cls21 = y2h0.f41904a;
                        iH7 = syc.h(i9);
                        iA = ((a4) object5).a(q2h0VarM5);
                        i2 = syc.i(iA);
                        i5 = i2 + iA + iH7;
                        iF2 += i5;
                    }
                    break;
                case 61:
                    if (q640Var.q(i9, i6, mjtVar2)) {
                        iC = syc.f(i9, (mg9) unsafe.getObject(mjtVar2, j));
                        iF2 += iC;
                    }
                    break;
                case 62:
                    if (q640Var.q(i9, i6, mjtVar2)) {
                        int iY2 = y(mjtVar2, j);
                        iH15 = syc.h(i9);
                        iJ4 = syc.i(iY2);
                        iC = iJ4 + iH15;
                        iF2 += iC;
                    }
                    break;
                case 63:
                    if (q640Var.q(i9, i6, mjtVar2)) {
                        int iY3 = y(mjtVar2, j);
                        iH15 = syc.h(i9);
                        iJ4 = syc.j(iY3);
                        iC = iJ4 + iH15;
                        iF2 += iC;
                    }
                    break;
                case 64:
                    if (q640Var.q(i9, i6, mjtVar2)) {
                        iH13 = syc.h(i9);
                        iC = iH13 + 4;
                        iF2 += iC;
                    }
                    break;
                case 65:
                    if (q640Var.q(i9, i6, mjtVar2)) {
                        iH = syc.h(i9);
                        iC = iH + 8;
                        iF2 += iC;
                    }
                    break;
                case 66:
                    if (q640Var.q(i9, i6, mjtVar2)) {
                        int iY4 = y(mjtVar2, j);
                        iH15 = syc.h(i9);
                        iJ4 = syc.i((iY4 >> 31) ^ (iY4 << 1));
                        iC = iJ4 + iH15;
                        iF2 += iC;
                    }
                    break;
                case 67:
                    if (q640Var.q(i9, i6, mjtVar2)) {
                        long jZ3 = z(mjtVar2, j);
                        iH14 = syc.h(i9);
                        iJ3 = syc.j((jZ3 << 1) ^ (jZ3 >> 63));
                        i5 = iJ3 + iH14;
                        iF2 += i5;
                    }
                    break;
                case 68:
                    if (q640Var.q(i9, i6, mjtVar2)) {
                        a4 a4Var2 = (a4) unsafe.getObject(mjtVar2, j);
                        q2h0 q2h0VarM6 = q640Var.m(i6);
                        iH8 = syc.h(i9) * 2;
                        iA2 = a4Var2.a(q2h0VarM6);
                        iC = iA2 + iH8;
                        iF2 += iC;
                    }
                    break;
            }
            i6 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:160:0x082a A[Catch: all -> 0x0500, TryCatch #0 {all -> 0x0500, blocks: (B:158:0x0825, B:160:0x082a, B:161:0x082f, B:114:0x04fb, B:117:0x0503, B:118:0x051b, B:119:0x0533, B:120:0x054b, B:121:0x0563, B:122:0x057b, B:123:0x0593, B:124:0x05ab, B:125:0x05c3, B:126:0x05eb, B:127:0x060b, B:128:0x062b, B:129:0x064c, B:130:0x066d, B:131:0x0690, B:132:0x06b0, B:133:0x06c9, B:134:0x06f1, B:135:0x0702, B:136:0x0724, B:137:0x0745, B:138:0x0766, B:139:0x0786, B:140:0x07a6, B:141:0x07c5, B:142:0x07e7, B:148:0x0809), top: B:179:0x0825 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x0839 A[LOOP:2: B:164:0x0837->B:165:0x0839, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:171:0x0850 A[LOOP:3: B:170:0x084e->B:171:0x0850, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:173:0x085a  */
    /* JADX WARN: Code duplicated, block: B:208:0x0835 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:? A[RETURN, SYNTHETIC] */
    @Override // a.q2h0
    public final void f(Object obj, hu5 hu5Var, tso tsoVar) throws Throwable {
        int[] iArr;
        int i;
        int i2;
        hu5 hu5Var2;
        tso tsoVar2;
        int i3;
        q640 q640Var = this;
        Object obj2 = obj;
        hu5 hu5Var3 = hu5Var;
        tso tsoVar3 = tsoVar;
        tsoVar3.getClass();
        if (!p(obj2)) {
            e9d0.i(obj2, "Mutating immutable message: ");
            return;
        }
        bet0 bet0Var = q640Var.l;
        int[] iArr2 = q640Var.g;
        int i4 = q640Var.i;
        int i5 = q640Var.h;
        ydt0 ydt0VarA = null;
        while (true) {
            try {
                int iE = hu5Var3.e();
                int iA = q640Var.A(iE);
                if (iA >= 0) {
                    int iJ = q640Var.J(iA);
                    try {
                        try {
                            int I = I(iJ);
                            Unsafe unsafe = o;
                            ed00 ed00Var = q640Var.k;
                            switch (I) {
                                case 0:
                                    iArr = iArr2;
                                    i2 = i4;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    long jX = x(iJ);
                                    hu5Var2.W(1);
                                    try {
                                        try {
                                            jft0.c.g(obj, jX, ((oyc) hu5Var2.e).p());
                                            obj2 = obj;
                                            q640Var.G(iA, obj2);
                                        } catch (xnx unused) {
                                            obj2 = obj;
                                            try {
                                                bet0Var.getClass();
                                                if (ydt0VarA == null) {
                                                    ydt0VarA = bet0.a(obj2);
                                                }
                                                if (!bet0.b(0, hu5Var2, ydt0VarA)) {
                                                    i3 = i2;
                                                    while (i5 < i3) {
                                                        q640Var.k(iArr[i5], obj2, ydt0VarA);
                                                        i5++;
                                                    }
                                                    if (ydt0VarA == null) {
                                                        return;
                                                    }
                                                    ((mjt) obj2).unknownFields = ydt0VarA;
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                i = i2;
                                                while (i5 < i) {
                                                    q640Var.k(iArr[i5], obj2, ydt0VarA);
                                                    i5++;
                                                }
                                                if (ydt0VarA != null) {
                                                    bet0Var.getClass();
                                                    ((mjt) obj2).unknownFields = ydt0VarA;
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            obj2 = obj;
                                            i = i2;
                                            while (i5 < i) {
                                                q640Var.k(iArr[i5], obj2, ydt0VarA);
                                                i5++;
                                            }
                                            if (ydt0VarA != null) {
                                                bet0Var.getClass();
                                                ((mjt) obj2).unknownFields = ydt0VarA;
                                            }
                                            throw th;
                                        }
                                    } catch (xnx unused2) {
                                        obj2 = obj;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        obj2 = obj;
                                    }
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 1:
                                    iArr = iArr2;
                                    i2 = i4;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    long jX2 = x(iJ);
                                    hu5Var2.W(5);
                                    jft0.c.h(obj2, jX2, ((oyc) hu5Var2.e).t());
                                    q640Var.G(iA, obj2);
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 2:
                                    iArr = iArr2;
                                    i2 = i4;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    long jX3 = x(iJ);
                                    hu5Var2.W(0);
                                    jft0.n(obj2, jX3, ((oyc) hu5Var2.e).v());
                                    q640Var.G(iA, obj2);
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 3:
                                    iArr = iArr2;
                                    i2 = i4;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    long jX4 = x(iJ);
                                    hu5Var2.W(0);
                                    jft0.n(obj2, jX4, ((oyc) hu5Var2.e).E());
                                    q640Var.G(iA, obj2);
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 4:
                                    iArr = iArr2;
                                    i2 = i4;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    long jX5 = x(iJ);
                                    hu5Var2.W(0);
                                    jft0.m(obj2, ((oyc) hu5Var2.e).u(), jX5);
                                    q640Var.G(iA, obj2);
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 5:
                                    iArr = iArr2;
                                    i2 = i4;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    long jX6 = x(iJ);
                                    hu5Var2.W(1);
                                    jft0.n(obj2, jX6, ((oyc) hu5Var2.e).s());
                                    q640Var.G(iA, obj2);
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 6:
                                    iArr = iArr2;
                                    i2 = i4;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    long jX7 = x(iJ);
                                    hu5Var2.W(5);
                                    jft0.m(obj2, ((oyc) hu5Var2.e).r(), jX7);
                                    q640Var.G(iA, obj2);
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 7:
                                    iArr = iArr2;
                                    i2 = i4;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    long jX8 = x(iJ);
                                    hu5Var2.W(0);
                                    jft0.c.e(obj2, jX8, ((oyc) hu5Var2.e).m());
                                    q640Var.G(iA, obj2);
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 8:
                                    iArr = iArr2;
                                    i2 = i4;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    q640Var.D(iJ, hu5Var2, obj2);
                                    q640Var.G(iA, obj2);
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 9:
                                    q640Var = q640Var;
                                    iArr = iArr2;
                                    i2 = i4;
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    a4 a4Var = (a4) q640Var.u(iA, obj2);
                                    q2h0 q2h0VarM = q640Var.m(iA);
                                    hu5Var2.W(2);
                                    hu5Var2.k(a4Var, q2h0VarM, tsoVar2);
                                    unsafe.putObject(obj2, q640Var.J(iA) & 1048575, a4Var);
                                    q640Var.G(iA, obj2);
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 10:
                                    iArr = iArr2;
                                    i2 = i4;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    jft0.o(obj2, x(iJ), hu5Var2.n());
                                    q640Var.G(iA, obj2);
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 11:
                                    iArr = iArr2;
                                    i2 = i4;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    long jX9 = x(iJ);
                                    hu5Var2.W(0);
                                    jft0.m(obj2, ((oyc) hu5Var2.e).D(), jX9);
                                    q640Var.G(iA, obj2);
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 12:
                                    iArr = iArr2;
                                    i2 = i4;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    hu5Var2.W(0);
                                    int iQ = ((oyc) hu5Var2.e).q();
                                    q640Var.l(iA);
                                    jft0.m(obj2, iQ, x(iJ));
                                    q640Var.G(iA, obj2);
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 13:
                                    iArr = iArr2;
                                    i2 = i4;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    long jX10 = x(iJ);
                                    hu5Var2.W(5);
                                    jft0.m(obj2, ((oyc) hu5Var2.e).w(), jX10);
                                    q640Var.G(iA, obj2);
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 14:
                                    iArr = iArr2;
                                    i2 = i4;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    long jX11 = x(iJ);
                                    hu5Var2.W(1);
                                    jft0.n(obj2, jX11, ((oyc) hu5Var2.e).x());
                                    q640Var.G(iA, obj2);
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 15:
                                    iArr = iArr2;
                                    i2 = i4;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    long jX12 = x(iJ);
                                    hu5Var2.W(0);
                                    jft0.m(obj2, ((oyc) hu5Var2.e).y(), jX12);
                                    q640Var.G(iA, obj2);
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 16:
                                    iArr = iArr2;
                                    i2 = i4;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    long jX13 = x(iJ);
                                    hu5Var2.W(0);
                                    jft0.n(obj2, jX13, ((oyc) hu5Var2.e).z());
                                    q640Var.G(iA, obj2);
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 17:
                                    q640Var = q640Var;
                                    iArr = iArr2;
                                    i2 = i4;
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    a4 a4Var2 = (a4) q640Var.u(iA, obj2);
                                    q2h0 q2h0VarM2 = q640Var.m(iA);
                                    hu5Var2.W(3);
                                    hu5Var2.i(a4Var2, q2h0VarM2, tsoVar2);
                                    unsafe.putObject(obj2, q640Var.J(iA) & 1048575, a4Var2);
                                    q640Var.G(iA, obj2);
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 18:
                                    iArr = iArr2;
                                    i2 = i4;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    long jX14 = x(iJ);
                                    ed00Var.getClass();
                                    hu5Var2.r(ed00.a(obj2, jX14));
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    long jX15 = x(iJ);
                                    ed00Var.getClass();
                                    hu5Var2.A(ed00.a(obj2, jX15));
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 20:
                                    iArr = iArr2;
                                    i2 = i4;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    long jX16 = x(iJ);
                                    ed00Var.getClass();
                                    hu5Var2.E(ed00.a(obj2, jX16));
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 21:
                                    iArr = iArr2;
                                    i2 = i4;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    long jX17 = x(iJ);
                                    ed00Var.getClass();
                                    hu5Var2.S(ed00.a(obj2, jX17));
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 22:
                                    iArr = iArr2;
                                    i2 = i4;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    long jX18 = x(iJ);
                                    ed00Var.getClass();
                                    hu5Var2.C(ed00.a(obj2, jX18));
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 23:
                                    iArr = iArr2;
                                    i2 = i4;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    long jX19 = x(iJ);
                                    ed00Var.getClass();
                                    hu5Var2.y(ed00.a(obj2, jX19));
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 24:
                                    iArr = iArr2;
                                    i2 = i4;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    long jX20 = x(iJ);
                                    ed00Var.getClass();
                                    hu5Var2.w(ed00.a(obj2, jX20));
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    long jX21 = x(iJ);
                                    ed00Var.getClass();
                                    hu5Var2.l(ed00.a(obj2, jX21));
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    try {
                                        q640Var.E(iJ, hu5Var2, obj2);
                                    } catch (xnx unused3) {
                                        bet0Var.getClass();
                                        if (ydt0VarA == null) {
                                            ydt0VarA = bet0.a(obj2);
                                        }
                                        if (!bet0.b(0, hu5Var2, ydt0VarA)) {
                                            i3 = i2;
                                            while (i5 < i3) {
                                                q640Var.k(iArr[i5], obj2, ydt0VarA);
                                                i5++;
                                            }
                                            if (ydt0VarA == null) {
                                                return;
                                            }
                                            ((mjt) obj2).unknownFields = ydt0VarA;
                                        }
                                    }
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    try {
                                        q640Var.C(obj2, iJ, hu5Var3, q640Var.m(iA), tsoVar);
                                        hu5Var2 = hu5Var3;
                                        tsoVar2 = tsoVar;
                                        q640Var = q640Var;
                                    } catch (xnx unused4) {
                                        hu5Var2 = hu5Var3;
                                        tsoVar2 = tsoVar;
                                        q640Var = q640Var;
                                        bet0Var.getClass();
                                        if (ydt0VarA == null) {
                                            ydt0VarA = bet0.a(obj2);
                                        }
                                        if (!bet0.b(0, hu5Var2, ydt0VarA)) {
                                            i3 = i2;
                                            while (i5 < i3) {
                                                q640Var.k(iArr[i5], obj2, ydt0VarA);
                                                i5++;
                                            }
                                            if (ydt0VarA == null) {
                                                return;
                                            }
                                            ((mjt) obj2).unknownFields = ydt0VarA;
                                        }
                                    }
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX22 = x(iJ);
                                    ed00Var.getClass();
                                    hu5Var3.p(ed00.a(obj2, jX22));
                                    tsoVar2 = tsoVar;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX23 = x(iJ);
                                    ed00Var.getClass();
                                    hu5Var3.Q(ed00.a(obj2, jX23));
                                    tsoVar2 = tsoVar;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX24 = x(iJ);
                                    ed00Var.getClass();
                                    bmx bmxVarA = ed00.a(obj2, jX24);
                                    hu5Var3.t(bmxVarA);
                                    q640Var.l(iA);
                                    y2h0.j(obj2, iE, bmxVarA, ydt0VarA, bet0Var);
                                    tsoVar2 = tsoVar;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX25 = x(iJ);
                                    ed00Var.getClass();
                                    hu5Var3.G(ed00.a(obj2, jX25));
                                    tsoVar2 = tsoVar;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 32:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX26 = x(iJ);
                                    ed00Var.getClass();
                                    hu5Var3.I(ed00.a(obj2, jX26));
                                    tsoVar2 = tsoVar;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 33:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX27 = x(iJ);
                                    ed00Var.getClass();
                                    hu5Var3.K(ed00.a(obj2, jX27));
                                    tsoVar2 = tsoVar;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 34:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX28 = x(iJ);
                                    ed00Var.getClass();
                                    hu5Var3.M(ed00.a(obj2, jX28));
                                    tsoVar2 = tsoVar;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 35:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX29 = x(iJ);
                                    ed00Var.getClass();
                                    hu5Var3.r(ed00.a(obj2, jX29));
                                    tsoVar2 = tsoVar;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 36:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX30 = x(iJ);
                                    ed00Var.getClass();
                                    hu5Var3.A(ed00.a(obj2, jX30));
                                    tsoVar2 = tsoVar;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 37:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX31 = x(iJ);
                                    ed00Var.getClass();
                                    hu5Var3.E(ed00.a(obj2, jX31));
                                    tsoVar2 = tsoVar;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 38:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX32 = x(iJ);
                                    ed00Var.getClass();
                                    hu5Var3.S(ed00.a(obj2, jX32));
                                    tsoVar2 = tsoVar;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 39:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX33 = x(iJ);
                                    ed00Var.getClass();
                                    hu5Var3.C(ed00.a(obj2, jX33));
                                    tsoVar2 = tsoVar;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 40:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX34 = x(iJ);
                                    ed00Var.getClass();
                                    hu5Var3.y(ed00.a(obj2, jX34));
                                    tsoVar2 = tsoVar;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 41:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX35 = x(iJ);
                                    ed00Var.getClass();
                                    hu5Var3.w(ed00.a(obj2, jX35));
                                    tsoVar2 = tsoVar;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 42:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX36 = x(iJ);
                                    ed00Var.getClass();
                                    hu5Var3.l(ed00.a(obj2, jX36));
                                    tsoVar2 = tsoVar;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 43:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX37 = x(iJ);
                                    ed00Var.getClass();
                                    hu5Var3.Q(ed00.a(obj2, jX37));
                                    tsoVar2 = tsoVar;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 44:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX38 = x(iJ);
                                    ed00Var.getClass();
                                    bmx bmxVarA2 = ed00.a(obj2, jX38);
                                    hu5Var3.t(bmxVarA2);
                                    q640Var.l(iA);
                                    y2h0.j(obj2, iE, bmxVarA2, ydt0VarA, bet0Var);
                                    tsoVar2 = tsoVar;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 45:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX39 = x(iJ);
                                    ed00Var.getClass();
                                    hu5Var3.G(ed00.a(obj2, jX39));
                                    tsoVar2 = tsoVar;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 46:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX40 = x(iJ);
                                    ed00Var.getClass();
                                    hu5Var3.I(ed00.a(obj2, jX40));
                                    tsoVar2 = tsoVar;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 47:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX41 = x(iJ);
                                    ed00Var.getClass();
                                    hu5Var3.K(ed00.a(obj2, jX41));
                                    tsoVar2 = tsoVar;
                                    q640Var = q640Var;
                                    hu5Var2 = hu5Var3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 48:
                                    iArr = iArr2;
                                    i2 = i4;
                                    try {
                                        long jX42 = x(iJ);
                                        ed00Var.getClass();
                                        hu5Var3.M(ed00.a(obj2, jX42));
                                        tsoVar2 = tsoVar;
                                        q640Var = q640Var;
                                        hu5Var2 = hu5Var3;
                                    } catch (xnx unused5) {
                                        tsoVar2 = tsoVar;
                                        q640Var = q640Var;
                                        hu5Var2 = hu5Var3;
                                        bet0Var.getClass();
                                        if (ydt0VarA == null) {
                                            ydt0VarA = bet0.a(obj2);
                                        }
                                        if (!bet0.b(0, hu5Var2, ydt0VarA)) {
                                            i3 = i2;
                                            while (i5 < i3) {
                                                q640Var.k(iArr[i5], obj2, ydt0VarA);
                                                i5++;
                                            }
                                            if (ydt0VarA == null) {
                                                return;
                                            }
                                            ((mjt) obj2).unknownFields = ydt0VarA;
                                        }
                                    }
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 49:
                                    iArr = iArr2;
                                    i2 = i4;
                                    obj2 = obj;
                                    try {
                                        q640Var.B(obj2, x(iJ), hu5Var, q640Var.m(iA), tsoVar);
                                        hu5Var3 = hu5Var;
                                        tsoVar2 = tsoVar;
                                        q640Var = q640Var;
                                        hu5Var2 = hu5Var3;
                                    } catch (xnx unused6) {
                                        tsoVar2 = tsoVar;
                                        q640Var = q640Var;
                                        hu5Var2 = hu5Var;
                                        bet0Var.getClass();
                                        if (ydt0VarA == null) {
                                            ydt0VarA = bet0.a(obj2);
                                        }
                                        if (!bet0.b(0, hu5Var2, ydt0VarA)) {
                                            i3 = i2;
                                            while (i5 < i3) {
                                                q640Var.k(iArr[i5], obj2, ydt0VarA);
                                                i5++;
                                            }
                                            if (ydt0VarA == null) {
                                                return;
                                            }
                                            ((mjt) obj2).unknownFields = ydt0VarA;
                                        }
                                    }
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    try {
                                        q640Var.r(obj2, iA, q640Var.b[(iA / 3) * 2], tsoVar3, hu5Var3);
                                        obj2 = obj;
                                        hu5Var2 = hu5Var;
                                        tsoVar2 = tsoVar;
                                        q640Var = q640Var;
                                    } catch (xnx unused7) {
                                        obj2 = obj;
                                        hu5Var2 = hu5Var;
                                        tsoVar2 = tsoVar;
                                        q640Var = q640Var;
                                        bet0Var.getClass();
                                        if (ydt0VarA == null) {
                                            ydt0VarA = bet0.a(obj2);
                                        }
                                        if (!bet0.b(0, hu5Var2, ydt0VarA)) {
                                            i3 = i2;
                                            while (i5 < i3) {
                                                q640Var.k(iArr[i5], obj2, ydt0VarA);
                                                i5++;
                                            }
                                            if (ydt0VarA == null) {
                                                return;
                                            }
                                            ((mjt) obj2).unknownFields = ydt0VarA;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        obj2 = obj;
                                        q640Var = q640Var;
                                        i = i2;
                                        while (i5 < i) {
                                            q640Var.k(iArr[i5], obj2, ydt0VarA);
                                            i5++;
                                        }
                                        if (ydt0VarA != null) {
                                            bet0Var.getClass();
                                            ((mjt) obj2).unknownFields = ydt0VarA;
                                        }
                                        throw th;
                                    }
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 51:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX43 = x(iJ);
                                    hu5Var3.W(1);
                                    jft0.o(obj2, jX43, Double.valueOf(((oyc) hu5Var3.e).p()));
                                    q640Var.H(iE, iA, obj2);
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 52:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX44 = x(iJ);
                                    hu5Var3.W(5);
                                    jft0.o(obj2, jX44, Float.valueOf(((oyc) hu5Var3.e).t()));
                                    q640Var.H(iE, iA, obj2);
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 53:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX45 = x(iJ);
                                    hu5Var3.W(0);
                                    jft0.o(obj2, jX45, Long.valueOf(((oyc) hu5Var3.e).v()));
                                    q640Var.H(iE, iA, obj2);
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 54:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX46 = x(iJ);
                                    hu5Var3.W(0);
                                    jft0.o(obj2, jX46, Long.valueOf(((oyc) hu5Var3.e).E()));
                                    q640Var.H(iE, iA, obj2);
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 55:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX47 = x(iJ);
                                    hu5Var3.W(0);
                                    jft0.o(obj2, jX47, Integer.valueOf(((oyc) hu5Var3.e).u()));
                                    q640Var.H(iE, iA, obj2);
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 56:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX48 = x(iJ);
                                    hu5Var3.W(1);
                                    jft0.o(obj2, jX48, Long.valueOf(((oyc) hu5Var3.e).s()));
                                    q640Var.H(iE, iA, obj2);
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 57:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX49 = x(iJ);
                                    hu5Var3.W(5);
                                    jft0.o(obj2, jX49, Integer.valueOf(((oyc) hu5Var3.e).r()));
                                    q640Var.H(iE, iA, obj2);
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 58:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX50 = x(iJ);
                                    hu5Var3.W(0);
                                    jft0.o(obj2, jX50, Boolean.valueOf(((oyc) hu5Var3.e).m()));
                                    q640Var.H(iE, iA, obj2);
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 59:
                                    iArr = iArr2;
                                    i2 = i4;
                                    q640Var.D(iJ, hu5Var3, obj2);
                                    q640Var.H(iE, iA, obj2);
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 60:
                                    iArr = iArr2;
                                    i2 = i4;
                                    a4 a4Var3 = (a4) q640Var.v(iE, iA, obj2);
                                    q2h0 q2h0VarM3 = q640Var.m(iA);
                                    hu5Var3.W(2);
                                    hu5Var3.k(a4Var3, q2h0VarM3, tsoVar3);
                                    unsafe.putObject(obj2, q640Var.J(iA) & 1048575, a4Var3);
                                    q640Var.H(iE, iA, obj2);
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 61:
                                    iArr = iArr2;
                                    i2 = i4;
                                    jft0.o(obj2, x(iJ), hu5Var3.n());
                                    q640Var.H(iE, iA, obj2);
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 62:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX51 = x(iJ);
                                    hu5Var3.W(0);
                                    jft0.o(obj2, jX51, Integer.valueOf(((oyc) hu5Var3.e).D()));
                                    q640Var.H(iE, iA, obj2);
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 63:
                                    iArr = iArr2;
                                    i2 = i4;
                                    hu5Var3.W(0);
                                    int iQ2 = ((oyc) hu5Var3.e).q();
                                    q640Var.l(iA);
                                    jft0.o(obj2, x(iJ), Integer.valueOf(iQ2));
                                    q640Var.H(iE, iA, obj2);
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 64:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX52 = x(iJ);
                                    hu5Var3.W(5);
                                    jft0.o(obj2, jX52, Integer.valueOf(((oyc) hu5Var3.e).w()));
                                    q640Var.H(iE, iA, obj2);
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 65:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX53 = x(iJ);
                                    hu5Var3.W(1);
                                    jft0.o(obj2, jX53, Long.valueOf(((oyc) hu5Var3.e).x()));
                                    q640Var.H(iE, iA, obj2);
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 66:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX54 = x(iJ);
                                    hu5Var3.W(0);
                                    jft0.o(obj2, jX54, Integer.valueOf(((oyc) hu5Var3.e).y()));
                                    q640Var.H(iE, iA, obj2);
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 67:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX55 = x(iJ);
                                    hu5Var3.W(0);
                                    jft0.o(obj2, jX55, Long.valueOf(((oyc) hu5Var3.e).z()));
                                    q640Var.H(iE, iA, obj2);
                                    hu5Var2 = hu5Var3;
                                    tsoVar2 = tsoVar3;
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                case 68:
                                    try {
                                        a4 a4Var4 = (a4) q640Var.v(iE, iA, obj2);
                                        q2h0 q2h0VarM4 = q640Var.m(iA);
                                        hu5Var3.W(3);
                                        hu5Var3.i(a4Var4, q2h0VarM4, tsoVar3);
                                        iArr = iArr2;
                                        i2 = i4;
                                        try {
                                            try {
                                                unsafe.putObject(obj2, q640Var.J(iA) & 1048575, a4Var4);
                                                q640Var.H(iE, iA, obj2);
                                                hu5Var2 = hu5Var3;
                                                tsoVar2 = tsoVar3;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                q640Var = q640Var;
                                                i = i2;
                                                while (i5 < i) {
                                                    q640Var.k(iArr[i5], obj2, ydt0VarA);
                                                    i5++;
                                                }
                                                if (ydt0VarA != null) {
                                                    bet0Var.getClass();
                                                    ((mjt) obj2).unknownFields = ydt0VarA;
                                                }
                                                throw th;
                                            }
                                        } catch (xnx unused8) {
                                            hu5Var2 = hu5Var3;
                                            tsoVar2 = tsoVar3;
                                            bet0Var.getClass();
                                            if (ydt0VarA == null) {
                                                ydt0VarA = bet0.a(obj2);
                                            }
                                            if (!bet0.b(0, hu5Var2, ydt0VarA)) {
                                                i3 = i2;
                                                while (i5 < i3) {
                                                    q640Var.k(iArr[i5], obj2, ydt0VarA);
                                                    i5++;
                                                }
                                                if (ydt0VarA == null) {
                                                    return;
                                                }
                                                ((mjt) obj2).unknownFields = ydt0VarA;
                                            }
                                        }
                                    } catch (xnx unused9) {
                                        iArr = iArr2;
                                        i2 = i4;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        iArr = iArr2;
                                        i2 = i4;
                                    }
                                    hu5Var3 = hu5Var2;
                                    tsoVar3 = tsoVar2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    q640Var = q640Var;
                                    break;
                                default:
                                    if (ydt0VarA == null) {
                                        bet0Var.getClass();
                                        ydt0VarA = bet0.a(obj2);
                                    }
                                    bet0Var.getClass();
                                    if (bet0.b(0, hu5Var3, ydt0VarA)) {
                                        iArr = iArr2;
                                        i2 = i4;
                                        hu5Var2 = hu5Var3;
                                        tsoVar2 = tsoVar3;
                                        hu5Var3 = hu5Var2;
                                        tsoVar3 = tsoVar2;
                                        iArr2 = iArr;
                                        i4 = i2;
                                        q640Var = q640Var;
                                    } else {
                                        while (i5 < i4) {
                                            q640Var.k(iArr2[i5], obj2, ydt0VarA);
                                            i5++;
                                        }
                                        if (ydt0VarA == null) {
                                            return;
                                        }
                                    }
                                    break;
                            }
                        } catch (xnx unused10) {
                            iArr = iArr2;
                            i2 = i4;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        q640Var = q640Var;
                        iArr = iArr2;
                        i2 = i4;
                    }
                } else if (iE == Integer.MAX_VALUE) {
                    while (i5 < i4) {
                        q640Var.k(iArr2[i5], obj2, ydt0VarA);
                        i5++;
                    }
                    if (ydt0VarA == null) {
                        return;
                    } else {
                        bet0Var.getClass();
                    }
                } else {
                    bet0Var.getClass();
                    if (ydt0VarA == null) {
                        ydt0VarA = bet0.a(obj2);
                    }
                    if (!bet0.b(0, hu5Var3, ydt0VarA)) {
                        while (i5 < i4) {
                            q640Var.k(iArr2[i5], obj2, ydt0VarA);
                            i5++;
                        }
                        if (ydt0VarA == null) {
                            return;
                        }
                    }
                }
            } catch (Throwable th8) {
                th = th8;
                q640Var = q640Var;
                iArr = iArr2;
                i = i4;
            }
        }
        ((mjt) obj2).unknownFields = ydt0VarA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.q2h0
    public final void g(Object obj, yqc yqcVar) throws IOException {
        int i;
        int i2;
        boolean z;
        q640 q640Var = this;
        yqcVar.getClass();
        syc sycVar = (syc) yqcVar.b;
        int[] iArr = q640Var.f28183a;
        int length = iArr.length;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int iJ = q640Var.J(i5);
            int i7 = iArr[i5];
            int I = I(iJ);
            Unsafe unsafe = o;
            if (I <= 17) {
                int i8 = iArr[i5 + 2];
                i = 1;
                int i9 = i8 & i3;
                if (i9 != i4) {
                    i6 = i9 == i3 ? 0 : unsafe.getInt(obj, i9);
                    i4 = i9;
                }
                i2 = 1 << (i8 >>> 20);
            } else {
                i = 1;
                i2 = 0;
            }
            long j = iJ & i3;
            switch (I) {
                case 0:
                    if (q640Var.o(obj, i5, i4, i6, i2)) {
                        sycVar.t(i7, Double.doubleToRawLongBits(jft0.c.c(obj, j)));
                    }
                    break;
                case 1:
                    if (q640Var.o(obj, i5, i4, i6, i2)) {
                        sycVar.r(i7, Float.floatToRawIntBits(jft0.c.d(obj, j)));
                    }
                    q640Var = this;
                    break;
                case 2:
                    if (q640Var.o(obj, i5, i4, i6, i2)) {
                        sycVar.E(i7, unsafe.getLong(obj, j));
                    }
                    q640Var = this;
                    break;
                case 3:
                    if (q640Var.o(obj, i5, i4, i6, i2)) {
                        sycVar.E(i7, unsafe.getLong(obj, j));
                    }
                    q640Var = this;
                    break;
                case 4:
                    if (q640Var.o(obj, i5, i4, i6, i2)) {
                        sycVar.v(i7, unsafe.getInt(obj, j));
                    }
                    q640Var = this;
                    break;
                case 5:
                    if (q640Var.o(obj, i5, i4, i6, i2)) {
                        sycVar.t(i7, unsafe.getLong(obj, j));
                    }
                    q640Var = this;
                    break;
                case 6:
                    if (q640Var.o(obj, i5, i4, i6, i2)) {
                        sycVar.r(i7, unsafe.getInt(obj, j));
                    }
                    q640Var = this;
                    break;
                case 7:
                    if (q640Var.o(obj, i5, i4, i6, i2)) {
                        sycVar.o(i7, jft0.c.a(obj, j));
                    }
                    q640Var = this;
                    break;
                case 8:
                    if (q640Var.o(obj, i5, i4, i6, i2)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            sycVar.z(i7, (String) object);
                        } else {
                            sycVar.p(i7, (mg9) object);
                        }
                    }
                    q640Var = this;
                    break;
                case 9:
                    if (q640Var.o(obj, i5, i4, i6, i2)) {
                        sycVar.y(i7, (a4) unsafe.getObject(obj, j), q640Var.m(i5));
                    }
                    break;
                case 10:
                    if (q640Var.o(obj, i5, i4, i6, i2)) {
                        sycVar.p(i7, (mg9) unsafe.getObject(obj, j));
                    }
                    q640Var = this;
                    break;
                case 11:
                    if (q640Var.o(obj, i5, i4, i6, i2)) {
                        sycVar.C(i7, unsafe.getInt(obj, j));
                    }
                    q640Var = this;
                    break;
                case 12:
                    if (q640Var.o(obj, i5, i4, i6, i2)) {
                        sycVar.v(i7, unsafe.getInt(obj, j));
                    }
                    q640Var = this;
                    break;
                case 13:
                    if (q640Var.o(obj, i5, i4, i6, i2)) {
                        sycVar.r(i7, unsafe.getInt(obj, j));
                    }
                    q640Var = this;
                    break;
                case 14:
                    if (q640Var.o(obj, i5, i4, i6, i2)) {
                        sycVar.t(i7, unsafe.getLong(obj, j));
                    }
                    q640Var = this;
                    break;
                case 15:
                    if (q640Var.o(obj, i5, i4, i6, i2)) {
                        int i10 = unsafe.getInt(obj, j);
                        sycVar.C(i7, (i10 >> 31) ^ (i10 << 1));
                    }
                    q640Var = this;
                    break;
                case 16:
                    if (q640Var.o(obj, i5, i4, i6, i2)) {
                        long j2 = unsafe.getLong(obj, j);
                        sycVar.E(i7, (j2 >> 63) ^ (j2 << 1));
                    }
                    q640Var = this;
                    break;
                case 17:
                    if (q640Var.o(obj, i5, i4, i6, i2)) {
                        yqcVar.A(i7, unsafe.getObject(obj, j), q640Var.m(i5));
                    }
                    break;
                case 18:
                    y2h0.n(iArr[i5], (List) unsafe.getObject(obj, j), yqcVar, false);
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    y2h0.r(iArr[i5], (List) unsafe.getObject(obj, j), yqcVar, false);
                    break;
                case 20:
                    y2h0.t(iArr[i5], (List) unsafe.getObject(obj, j), yqcVar, false);
                    break;
                case 21:
                    y2h0.z(iArr[i5], (List) unsafe.getObject(obj, j), yqcVar, false);
                    break;
                case 22:
                    y2h0.s(iArr[i5], (List) unsafe.getObject(obj, j), yqcVar, false);
                    break;
                case 23:
                    y2h0.q(iArr[i5], (List) unsafe.getObject(obj, j), yqcVar, false);
                    break;
                case 24:
                    y2h0.p(iArr[i5], (List) unsafe.getObject(obj, j), yqcVar, false);
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    y2h0.m(iArr[i5], (List) unsafe.getObject(obj, j), yqcVar, false);
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    int i11 = iArr[i5];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = y2h0.f41904a;
                    if (list != null && !list.isEmpty()) {
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            sycVar.z(i11, (String) list.get(i12));
                        }
                    }
                    break;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    int i13 = iArr[i5];
                    List list2 = (List) unsafe.getObject(obj, j);
                    q2h0 q2h0VarM = q640Var.m(i5);
                    Class cls2 = y2h0.f41904a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i14 = 0; i14 < list2.size(); i14++) {
                            sycVar.y(i13, (a4) list2.get(i14), q2h0VarM);
                        }
                    }
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    int i15 = iArr[i5];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = y2h0.f41904a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i16 = 0; i16 < list3.size(); i16++) {
                            sycVar.p(i15, (mg9) list3.get(i16));
                        }
                    }
                    break;
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                    z = false;
                    y2h0.y(iArr[i5], (List) unsafe.getObject(obj, j), yqcVar, false);
                    break;
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                    z = false;
                    y2h0.o(iArr[i5], (List) unsafe.getObject(obj, j), yqcVar, false);
                    break;
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                    z = false;
                    y2h0.u(iArr[i5], (List) unsafe.getObject(obj, j), yqcVar, false);
                    break;
                case 32:
                    z = false;
                    y2h0.v(iArr[i5], (List) unsafe.getObject(obj, j), yqcVar, false);
                    break;
                case 33:
                    z = false;
                    y2h0.w(iArr[i5], (List) unsafe.getObject(obj, j), yqcVar, false);
                    break;
                case 34:
                    z = false;
                    y2h0.x(iArr[i5], (List) unsafe.getObject(obj, j), yqcVar, false);
                    break;
                case 35:
                    y2h0.n(iArr[i5], (List) unsafe.getObject(obj, j), yqcVar, i);
                    break;
                case 36:
                    y2h0.r(iArr[i5], (List) unsafe.getObject(obj, j), yqcVar, i);
                    break;
                case 37:
                    y2h0.t(iArr[i5], (List) unsafe.getObject(obj, j), yqcVar, i);
                    break;
                case 38:
                    y2h0.z(iArr[i5], (List) unsafe.getObject(obj, j), yqcVar, i);
                    break;
                case 39:
                    y2h0.s(iArr[i5], (List) unsafe.getObject(obj, j), yqcVar, i);
                    break;
                case 40:
                    y2h0.q(iArr[i5], (List) unsafe.getObject(obj, j), yqcVar, i);
                    break;
                case 41:
                    y2h0.p(iArr[i5], (List) unsafe.getObject(obj, j), yqcVar, i);
                    break;
                case 42:
                    y2h0.m(iArr[i5], (List) unsafe.getObject(obj, j), yqcVar, i);
                    break;
                case 43:
                    y2h0.y(iArr[i5], (List) unsafe.getObject(obj, j), yqcVar, i);
                    break;
                case 44:
                    y2h0.o(iArr[i5], (List) unsafe.getObject(obj, j), yqcVar, i);
                    break;
                case 45:
                    y2h0.u(iArr[i5], (List) unsafe.getObject(obj, j), yqcVar, i);
                    break;
                case 46:
                    y2h0.v(iArr[i5], (List) unsafe.getObject(obj, j), yqcVar, i);
                    break;
                case 47:
                    y2h0.w(iArr[i5], (List) unsafe.getObject(obj, j), yqcVar, i);
                    break;
                case 48:
                    y2h0.x(iArr[i5], (List) unsafe.getObject(obj, j), yqcVar, true);
                    break;
                case 49:
                    int i17 = iArr[i5];
                    List list4 = (List) unsafe.getObject(obj, j);
                    q2h0 q2h0VarM2 = q640Var.m(i5);
                    Class cls4 = y2h0.f41904a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i18 = 0; i18 < list4.size(); i18++) {
                            yqcVar.A(i17, list4.get(i18), q2h0VarM2);
                        }
                    }
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        int i19 = 2;
                        Object obj2 = q640Var.b[(i5 / 3) * 2];
                        q640Var.m.getClass();
                        nvu nvuVar = ((qo20) obj2).f29051a;
                        for (Map.Entry entry : ((wo20) object2).entrySet()) {
                            sycVar.B(i7, i19);
                            sycVar.D(qo20.a(nvuVar, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            frp.b(sycVar, (fov0) nvuVar.b, i, key);
                            i19 = 2;
                            frp.b(sycVar, (fov0) nvuVar.c, 2, value);
                            i = 1;
                        }
                    }
                    break;
                case 51:
                    if (q640Var.q(i7, i5, obj)) {
                        sycVar.t(i7, Double.doubleToRawLongBits(((Double) jft0.h(obj, j)).doubleValue()));
                    }
                    break;
                case 52:
                    if (q640Var.q(i7, i5, obj)) {
                        sycVar.r(i7, Float.floatToRawIntBits(((Float) jft0.h(obj, j)).floatValue()));
                    }
                    break;
                case 53:
                    if (q640Var.q(i7, i5, obj)) {
                        sycVar.E(i7, z(obj, j));
                    }
                    break;
                case 54:
                    if (q640Var.q(i7, i5, obj)) {
                        sycVar.E(i7, z(obj, j));
                    }
                    break;
                case 55:
                    if (q640Var.q(i7, i5, obj)) {
                        sycVar.v(i7, y(obj, j));
                    }
                    break;
                case 56:
                    if (q640Var.q(i7, i5, obj)) {
                        sycVar.t(i7, z(obj, j));
                    }
                    break;
                case 57:
                    if (q640Var.q(i7, i5, obj)) {
                        sycVar.r(i7, y(obj, j));
                    }
                    break;
                case 58:
                    if (q640Var.q(i7, i5, obj)) {
                        sycVar.o(i7, ((Boolean) jft0.h(obj, j)).booleanValue());
                    }
                    break;
                case 59:
                    if (q640Var.q(i7, i5, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            sycVar.z(i7, (String) object3);
                        } else {
                            sycVar.p(i7, (mg9) object3);
                        }
                    }
                    break;
                case 60:
                    if (q640Var.q(i7, i5, obj)) {
                        sycVar.y(i7, (a4) unsafe.getObject(obj, j), q640Var.m(i5));
                    }
                    break;
                case 61:
                    if (q640Var.q(i7, i5, obj)) {
                        sycVar.p(i7, (mg9) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (q640Var.q(i7, i5, obj)) {
                        sycVar.C(i7, y(obj, j));
                    }
                    break;
                case 63:
                    if (q640Var.q(i7, i5, obj)) {
                        sycVar.v(i7, y(obj, j));
                    }
                    break;
                case 64:
                    if (q640Var.q(i7, i5, obj)) {
                        sycVar.r(i7, y(obj, j));
                    }
                    break;
                case 65:
                    if (q640Var.q(i7, i5, obj)) {
                        sycVar.t(i7, z(obj, j));
                    }
                    break;
                case 66:
                    if (q640Var.q(i7, i5, obj)) {
                        int iY = y(obj, j);
                        sycVar.C(i7, (iY >> 31) ^ (iY << 1));
                    }
                    break;
                case 67:
                    if (q640Var.q(i7, i5, obj)) {
                        long jZ = z(obj, j);
                        sycVar.E(i7, (jZ << i) ^ (jZ >> 63));
                    }
                    break;
                case 68:
                    if (q640Var.q(i7, i5, obj)) {
                        yqcVar.A(i7, unsafe.getObject(obj, j), q640Var.m(i5));
                    }
                    break;
                default:
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
        q640Var.l.getClass();
        ((mjt) obj).unknownFields.d(yqcVar);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d7 A[PHI: r3
  0x00d7: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x01f0, B:41:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // a.q2h0
    public final int h(mjt mjtVar) {
        int i;
        int iB;
        int i2;
        int[] iArr = this.f28183a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iJ = J(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iJ;
            int i6 = 1237;
            int iHashCode = 37;
            switch (I(iJ)) {
                case 0:
                    i = i3 * 53;
                    iB = fmx.b(Double.doubleToLongBits(jft0.c.c(mjtVar, j)));
                    i3 = iB + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iB = Float.floatToIntBits(jft0.c.d(mjtVar, j));
                    i3 = iB + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iB = fmx.b(jft0.g(mjtVar, j));
                    i3 = iB + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iB = fmx.b(jft0.g(mjtVar, j));
                    i3 = iB + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iB = jft0.f(mjtVar, j);
                    i3 = iB + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iB = fmx.b(jft0.g(mjtVar, j));
                    i3 = iB + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iB = jft0.f(mjtVar, j);
                    i3 = iB + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zA = jft0.c.a(mjtVar, j);
                    Charset charset = fmx.f9806a;
                    if (zA) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iB = ((String) jft0.h(mjtVar, j)).hashCode();
                    i3 = iB + i;
                    break;
                case 9:
                    Object objH = jft0.h(mjtVar, j);
                    if (objH != null) {
                        iHashCode = objH.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iB = jft0.h(mjtVar, j).hashCode();
                    i3 = iB + i;
                    break;
                case 11:
                    i = i3 * 53;
                    iB = jft0.f(mjtVar, j);
                    i3 = iB + i;
                    break;
                case 12:
                    i = i3 * 53;
                    iB = jft0.f(mjtVar, j);
                    i3 = iB + i;
                    break;
                case 13:
                    i = i3 * 53;
                    iB = jft0.f(mjtVar, j);
                    i3 = iB + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iB = fmx.b(jft0.g(mjtVar, j));
                    i3 = iB + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iB = jft0.f(mjtVar, j);
                    i3 = iB + i;
                    break;
                case 16:
                    i = i3 * 53;
                    iB = fmx.b(jft0.g(mjtVar, j));
                    i3 = iB + i;
                    break;
                case 17:
                    Object objH2 = jft0.h(mjtVar, j);
                    if (objH2 != null) {
                        iHashCode = objH2.hashCode();
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
                    iB = jft0.h(mjtVar, j).hashCode();
                    i3 = iB + i;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    i = i3 * 53;
                    iB = jft0.h(mjtVar, j).hashCode();
                    i3 = iB + i;
                    break;
                case 51:
                    if (q(i5, i4, mjtVar)) {
                        i = i3 * 53;
                        iB = fmx.b(Double.doubleToLongBits(((Double) jft0.h(mjtVar, j)).doubleValue()));
                        i3 = iB + i;
                    }
                    break;
                case 52:
                    if (q(i5, i4, mjtVar)) {
                        i = i3 * 53;
                        iB = Float.floatToIntBits(((Float) jft0.h(mjtVar, j)).floatValue());
                        i3 = iB + i;
                    }
                    break;
                case 53:
                    if (q(i5, i4, mjtVar)) {
                        i = i3 * 53;
                        iB = fmx.b(z(mjtVar, j));
                        i3 = iB + i;
                    }
                    break;
                case 54:
                    if (q(i5, i4, mjtVar)) {
                        i = i3 * 53;
                        iB = fmx.b(z(mjtVar, j));
                        i3 = iB + i;
                    }
                    break;
                case 55:
                    if (q(i5, i4, mjtVar)) {
                        i = i3 * 53;
                        iB = y(mjtVar, j);
                        i3 = iB + i;
                    }
                    break;
                case 56:
                    if (q(i5, i4, mjtVar)) {
                        i = i3 * 53;
                        iB = fmx.b(z(mjtVar, j));
                        i3 = iB + i;
                    }
                    break;
                case 57:
                    if (q(i5, i4, mjtVar)) {
                        i = i3 * 53;
                        iB = y(mjtVar, j);
                        i3 = iB + i;
                    }
                    break;
                case 58:
                    if (q(i5, i4, mjtVar)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) jft0.h(mjtVar, j)).booleanValue();
                        Charset charset2 = fmx.f9806a;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (q(i5, i4, mjtVar)) {
                        i = i3 * 53;
                        iB = ((String) jft0.h(mjtVar, j)).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 60:
                    if (q(i5, i4, mjtVar)) {
                        i = i3 * 53;
                        iB = jft0.h(mjtVar, j).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 61:
                    if (q(i5, i4, mjtVar)) {
                        i = i3 * 53;
                        iB = jft0.h(mjtVar, j).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 62:
                    if (q(i5, i4, mjtVar)) {
                        i = i3 * 53;
                        iB = y(mjtVar, j);
                        i3 = iB + i;
                    }
                    break;
                case 63:
                    if (q(i5, i4, mjtVar)) {
                        i = i3 * 53;
                        iB = y(mjtVar, j);
                        i3 = iB + i;
                    }
                    break;
                case 64:
                    if (q(i5, i4, mjtVar)) {
                        i = i3 * 53;
                        iB = y(mjtVar, j);
                        i3 = iB + i;
                    }
                    break;
                case 65:
                    if (q(i5, i4, mjtVar)) {
                        i = i3 * 53;
                        iB = fmx.b(z(mjtVar, j));
                        i3 = iB + i;
                    }
                    break;
                case 66:
                    if (q(i5, i4, mjtVar)) {
                        i = i3 * 53;
                        iB = y(mjtVar, j);
                        i3 = iB + i;
                    }
                    break;
                case 67:
                    if (q(i5, i4, mjtVar)) {
                        i = i3 * 53;
                        iB = fmx.b(z(mjtVar, j));
                        i3 = iB + i;
                    }
                    break;
                case 68:
                    if (q(i5, i4, mjtVar)) {
                        i = i3 * 53;
                        iB = jft0.h(mjtVar, j).hashCode();
                        i3 = iB + i;
                    }
                    break;
            }
        }
        this.l.getClass();
        return mjtVar.unknownFields.hashCode() + (i3 * 53);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    @Override // a.q2h0
    public final boolean i(mjt mjtVar, mjt mjtVar2) {
        int[] iArr = this.f28183a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zL = true;
            if (i < length) {
                int iJ = J(i);
                long j = iJ & 1048575;
                switch (I(iJ)) {
                    case 0:
                        if (!j(mjtVar, mjtVar2, i)) {
                            zL = false;
                        } else {
                            gft0 gft0Var = jft0.c;
                            if (Double.doubleToLongBits(gft0Var.c(mjtVar, j)) != Double.doubleToLongBits(gft0Var.c(mjtVar2, j))) {
                                zL = false;
                            }
                        }
                        break;
                    case 1:
                        if (!j(mjtVar, mjtVar2, i)) {
                            zL = false;
                        } else {
                            gft0 gft0Var2 = jft0.c;
                            if (Float.floatToIntBits(gft0Var2.d(mjtVar, j)) != Float.floatToIntBits(gft0Var2.d(mjtVar2, j))) {
                                zL = false;
                            }
                        }
                        break;
                    case 2:
                        if (!j(mjtVar, mjtVar2, i) || jft0.g(mjtVar, j) != jft0.g(mjtVar2, j)) {
                            zL = false;
                        }
                        break;
                    case 3:
                        if (!j(mjtVar, mjtVar2, i) || jft0.g(mjtVar, j) != jft0.g(mjtVar2, j)) {
                            zL = false;
                        }
                        break;
                    case 4:
                        if (!j(mjtVar, mjtVar2, i) || jft0.f(mjtVar, j) != jft0.f(mjtVar2, j)) {
                            zL = false;
                        }
                        break;
                    case 5:
                        if (!j(mjtVar, mjtVar2, i) || jft0.g(mjtVar, j) != jft0.g(mjtVar2, j)) {
                            zL = false;
                        }
                        break;
                    case 6:
                        if (!j(mjtVar, mjtVar2, i) || jft0.f(mjtVar, j) != jft0.f(mjtVar2, j)) {
                            zL = false;
                        }
                        break;
                    case 7:
                        if (!j(mjtVar, mjtVar2, i)) {
                            zL = false;
                        } else {
                            gft0 gft0Var3 = jft0.c;
                            if (gft0Var3.a(mjtVar, j) != gft0Var3.a(mjtVar2, j)) {
                                zL = false;
                            }
                        }
                        break;
                    case 8:
                        if (!j(mjtVar, mjtVar2, i) || !y2h0.l(jft0.h(mjtVar, j), jft0.h(mjtVar2, j))) {
                            zL = false;
                        }
                        break;
                    case 9:
                        if (!j(mjtVar, mjtVar2, i) || !y2h0.l(jft0.h(mjtVar, j), jft0.h(mjtVar2, j))) {
                            zL = false;
                        }
                        break;
                    case 10:
                        if (!j(mjtVar, mjtVar2, i) || !y2h0.l(jft0.h(mjtVar, j), jft0.h(mjtVar2, j))) {
                            zL = false;
                        }
                        break;
                    case 11:
                        if (!j(mjtVar, mjtVar2, i) || jft0.f(mjtVar, j) != jft0.f(mjtVar2, j)) {
                            zL = false;
                        }
                        break;
                    case 12:
                        if (!j(mjtVar, mjtVar2, i) || jft0.f(mjtVar, j) != jft0.f(mjtVar2, j)) {
                            zL = false;
                        }
                        break;
                    case 13:
                        if (!j(mjtVar, mjtVar2, i) || jft0.f(mjtVar, j) != jft0.f(mjtVar2, j)) {
                            zL = false;
                        }
                        break;
                    case 14:
                        if (!j(mjtVar, mjtVar2, i) || jft0.g(mjtVar, j) != jft0.g(mjtVar2, j)) {
                            zL = false;
                        }
                        break;
                    case 15:
                        if (!j(mjtVar, mjtVar2, i) || jft0.f(mjtVar, j) != jft0.f(mjtVar2, j)) {
                            zL = false;
                        }
                        break;
                    case 16:
                        if (!j(mjtVar, mjtVar2, i) || jft0.g(mjtVar, j) != jft0.g(mjtVar2, j)) {
                            zL = false;
                        }
                        break;
                    case 17:
                        if (!j(mjtVar, mjtVar2, i) || !y2h0.l(jft0.h(mjtVar, j), jft0.h(mjtVar2, j))) {
                            zL = false;
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
                        zL = y2h0.l(jft0.h(mjtVar, j), jft0.h(mjtVar2, j));
                        break;
                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                        zL = y2h0.l(jft0.h(mjtVar, j), jft0.h(mjtVar2, j));
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
                        if (jft0.f(mjtVar, j2) != jft0.f(mjtVar2, j2) || !y2h0.l(jft0.h(mjtVar, j), jft0.h(mjtVar2, j))) {
                            zL = false;
                        }
                        break;
                }
                if (zL) {
                    i += 3;
                }
            } else {
                this.l.getClass();
                if (mjtVar.unknownFields.equals(mjtVar2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j(mjt mjtVar, mjt mjtVar2, int i) {
        return n(i, mjtVar) == n(i, mjtVar2);
    }

    public final void k(int i, Object obj, Object obj2) {
        int i2 = this.f28183a[i];
        if (jft0.h(obj, J(i) & 1048575) == null) {
            return;
        }
        l(i);
    }

    public final void l(int i) {
        if (this.b[f140.b(i, 3, 2, 1)] == null) {
            return;
        }
        hny.b();
    }

    public final q2h0 m(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        q2h0 q2h0Var = (q2h0) objArr[i2];
        if (q2h0Var != null) {
            return q2h0Var;
        }
        q2h0 q2h0VarA = c5d0.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = q2h0VarA;
        return q2h0VarA;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x00f1 A[RETURN] */
    public final boolean n(int i, Object obj) {
        int i2 = this.f28183a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & jft0.f(obj, j)) != 0) {
                return true;
            }
            return false;
        }
        int iJ = J(i);
        long j2 = iJ & 1048575;
        switch (I(iJ)) {
            case 0:
                if (Double.doubleToRawLongBits(jft0.c.c(obj, j2)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(jft0.c.d(obj, j2)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (jft0.g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (jft0.g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (jft0.f(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (jft0.g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (jft0.f(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 7:
                return jft0.c.a(obj, j2);
            case 8:
                Object objH = jft0.h(obj, j2);
                if (objH instanceof String) {
                    return !((String) objH).isEmpty();
                }
                if (objH instanceof mg9) {
                    return !mg9.c.equals(objH);
                }
                e9d0.o();
                return false;
            case 9:
                if (jft0.h(obj, j2) != null) {
                    return true;
                }
                return false;
            case 10:
                return !mg9.c.equals(jft0.h(obj, j2));
            case 11:
                if (jft0.f(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (jft0.f(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (jft0.f(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (jft0.g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (jft0.f(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (jft0.g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (jft0.h(obj, j2) != null) {
                    return true;
                }
                return false;
            default:
                e9d0.o();
                return false;
        }
    }

    public final boolean o(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return n(i, obj);
        }
        return (i3 & i4) != 0;
    }

    public final boolean q(int i, int i2, Object obj) {
        return jft0.f(obj, (long) (this.f28183a[i2 + 2] & 1048575)) == i;
    }

    public final void r(Object obj, int i, Object obj2, tso tsoVar, hu5 hu5Var) throws xnx, vnx {
        long J = J(i) & 1048575;
        Object objH = jft0.h(obj, J);
        zo20 zo20Var = this.m;
        if (objH == null) {
            zo20Var.getClass();
            objH = wo20.b.b();
            jft0.o(obj, J, objH);
        } else {
            zo20Var.getClass();
            if (!((wo20) objH).f39471a) {
                Object objB = wo20.b.b();
                zo20.a(objB, objH);
                jft0.o(obj, J, objB);
                objH = objB;
            }
        }
        zo20Var.getClass();
        wo20 wo20Var = (wo20) objH;
        nvu nvuVar = ((qo20) obj2).f29051a;
        hu5Var.W(2);
        oyc oycVar = (oyc) hu5Var.e;
        int iK = oycVar.k(oycVar.D());
        Object obj3 = nvuVar.d;
        Object objV = "";
        Object objV2 = obj3;
        while (true) {
            try {
                int iE = hu5Var.e();
                if (iE == Integer.MAX_VALUE || oycVar.e()) {
                    break;
                }
                if (iE == 1) {
                    objV = hu5Var.v((fov0) nvuVar.b, null, null);
                } else if (iE != 2) {
                    try {
                        if (!hu5Var.a0()) {
                            throw new box("Unable to parse map entry.");
                        }
                    } catch (xnx unused) {
                        if (!hu5Var.a0()) {
                            throw new box("Unable to parse map entry.");
                        }
                    }
                } else {
                    objV2 = hu5Var.v((fov0) nvuVar.c, obj3.getClass(), tsoVar);
                }
            } catch (Throwable th) {
                oycVar.j(iK);
                throw th;
            }
        }
        wo20Var.put(objV, objV2);
        oycVar.j(iK);
    }

    public final void s(int i, Object obj, Object obj2) {
        if (n(i, obj2)) {
            long J = J(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, J);
            if (object == null) {
                hny.i(this.f28183a[i], obj2);
                return;
            }
            q2h0 q2h0VarM = m(i);
            if (!n(i, obj)) {
                if (p(object)) {
                    mjt mjtVarD = q2h0VarM.d();
                    q2h0VarM.a(mjtVarD, object);
                    unsafe.putObject(obj, J, mjtVarD);
                } else {
                    unsafe.putObject(obj, J, object);
                }
                G(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!p(object2)) {
                mjt mjtVarD2 = q2h0VarM.d();
                q2h0VarM.a(mjtVarD2, object2);
                unsafe.putObject(obj, J, mjtVarD2);
                object2 = mjtVarD2;
            }
            q2h0VarM.a(object2, object);
        }
    }

    public final void t(int i, Object obj, Object obj2) {
        int[] iArr = this.f28183a;
        int i2 = iArr[i];
        if (q(i2, i, obj2)) {
            long J = J(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, J);
            if (object == null) {
                hny.i(iArr[i], obj2);
                return;
            }
            q2h0 q2h0VarM = m(i);
            if (!q(i2, i, obj)) {
                if (p(object)) {
                    mjt mjtVarD = q2h0VarM.d();
                    q2h0VarM.a(mjtVarD, object);
                    unsafe.putObject(obj, J, mjtVarD);
                } else {
                    unsafe.putObject(obj, J, object);
                }
                H(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!p(object2)) {
                mjt mjtVarD2 = q2h0VarM.d();
                q2h0VarM.a(mjtVarD2, object2);
                unsafe.putObject(obj, J, mjtVarD2);
                object2 = mjtVarD2;
            }
            q2h0VarM.a(object2, object);
        }
    }

    public final Object u(int i, Object obj) {
        q2h0 q2h0VarM = m(i);
        long J = J(i) & 1048575;
        if (!n(i, obj)) {
            return q2h0VarM.d();
        }
        Object object = o.getObject(obj, J);
        if (p(object)) {
            return object;
        }
        mjt mjtVarD = q2h0VarM.d();
        if (object != null) {
            q2h0VarM.a(mjtVarD, object);
        }
        return mjtVarD;
    }

    public final Object v(int i, int i2, Object obj) {
        q2h0 q2h0VarM = m(i2);
        if (!q(i, i2, obj)) {
            return q2h0VarM.d();
        }
        Object object = o.getObject(obj, J(i2) & 1048575);
        if (p(object)) {
            return object;
        }
        mjt mjtVarD = q2h0VarM.d();
        if (object != null) {
            q2h0VarM.a(mjtVarD, object);
        }
        return mjtVarD;
    }
}

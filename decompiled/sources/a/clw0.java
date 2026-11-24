package a;

import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class clw0 {
    public static final clw0 b = new clw0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f4580a = new ConcurrentHashMap();

    public clw0() {
        byte[] bArr = lkw0.f20222a;
    }

    /* JADX WARN: Code duplicated, block: B:141:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:143:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:146:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:147:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:184:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:199:0x03f6  */
    public final dlw0 a(Class cls) {
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        char cCharAt;
        int i10;
        int i11;
        char cCharAt2;
        int i12;
        char cCharAt3;
        int i13;
        char cCharAt4;
        int i14;
        char cCharAt5;
        int i15;
        char cCharAt6;
        int i16;
        char cCharAt7;
        dlw0 vkw0Var;
        int[] iArr2;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int iObjectFieldOffset;
        int i22;
        int i23;
        int iObjectFieldOffset2;
        int i24;
        Field fieldO;
        int i25;
        char cCharAt8;
        int i26;
        int i27;
        int i28;
        Object obj;
        Field fieldO2;
        int i29;
        Object obj2;
        Field fieldO3;
        int i30;
        char cCharAt9;
        int i31;
        char cCharAt10;
        int i32;
        int i33;
        char cCharAt11;
        int i34;
        char cCharAt12;
        ConcurrentHashMap concurrentHashMap = this.f4580a;
        Object obj3 = concurrentHashMap.get(cls);
        if (obj3 != null) {
            return (dlw0) obj3;
        }
        jkw0.class.isAssignableFrom(cls);
        if (!jkw0.class.isAssignableFrom(cls)) {
            jf4.o("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            elw0 elw0Var = (elw0) jkw0.g(cls.asSubclass(jkw0.class)).h(3);
            int i35 = 0;
            if ((elw0Var.d & 2) == 2) {
                vkw0Var = new zkw0(elw0Var.f8022a);
            } else {
                uxs0 uxs0Var = tkw0.f34117a[hne.E(elw0Var.a())] != 1 ? ekw0.f7972a : null;
                Unsafe unsafe = vkw0.k;
                if (unsafe == null) {
                    itt0.k("Lite gencode is primarily intended for Android use and uses sun.misc.Unsafe which is not available in the current environment. To run in this environment, you may need to switch to standard gencode.");
                    return null;
                }
                if (!(elw0Var instanceof elw0)) {
                    hny.b();
                    return null;
                }
                String str = elw0Var.b;
                int length = str.length();
                if (str.charAt(0) >= 55296) {
                    int i36 = 1;
                    while (true) {
                        i = i36 + 1;
                        if (str.charAt(i36) < 55296) {
                            break;
                        }
                        i36 = i;
                    }
                } else {
                    i = 1;
                }
                int i37 = i + 1;
                int iCharAt = str.charAt(i);
                if (iCharAt >= 55296) {
                    int i38 = iCharAt & 8191;
                    int i39 = 13;
                    while (true) {
                        i34 = i37 + 1;
                        cCharAt12 = str.charAt(i37);
                        if (cCharAt12 < 55296) {
                            break;
                        }
                        i38 |= (cCharAt12 & 8191) << i39;
                        i39 += 13;
                        i37 = i34;
                    }
                    iCharAt = i38 | (cCharAt12 << i39);
                    i37 = i34;
                }
                if (iCharAt == 0) {
                    i5 = 0;
                    i6 = 0;
                    i7 = 0;
                    i8 = 0;
                    i3 = 0;
                    iArr = vkw0.j;
                    i4 = 0;
                } else {
                    int i40 = i37 + 1;
                    int iCharAt2 = str.charAt(i37);
                    if (iCharAt2 >= 55296) {
                        int i41 = iCharAt2 & 8191;
                        int i42 = 13;
                        while (true) {
                            i16 = i40 + 1;
                            cCharAt7 = str.charAt(i40);
                            if (cCharAt7 < 55296) {
                                break;
                            }
                            i41 |= (cCharAt7 & 8191) << i42;
                            i42 += 13;
                            i40 = i16;
                        }
                        iCharAt2 = i41 | (cCharAt7 << i42);
                        i40 = i16;
                    }
                    int i43 = i40 + 1;
                    int iCharAt3 = str.charAt(i40);
                    if (iCharAt3 >= 55296) {
                        int i44 = iCharAt3 & 8191;
                        int i45 = 13;
                        while (true) {
                            i15 = i43 + 1;
                            cCharAt6 = str.charAt(i43);
                            if (cCharAt6 < 55296) {
                                break;
                            }
                            i44 |= (cCharAt6 & 8191) << i45;
                            i45 += 13;
                            i43 = i15;
                        }
                        iCharAt3 = i44 | (cCharAt6 << i45);
                        i43 = i15;
                    }
                    int i46 = i43 + 1;
                    int iCharAt4 = str.charAt(i43);
                    if (iCharAt4 >= 55296) {
                        int i47 = iCharAt4 & 8191;
                        int i48 = 13;
                        while (true) {
                            i14 = i46 + 1;
                            cCharAt5 = str.charAt(i46);
                            if (cCharAt5 < 55296) {
                                break;
                            }
                            i47 |= (cCharAt5 & 8191) << i48;
                            i48 += 13;
                            i46 = i14;
                        }
                        iCharAt4 = i47 | (cCharAt5 << i48);
                        i46 = i14;
                    }
                    int i49 = i46 + 1;
                    int iCharAt5 = str.charAt(i46);
                    if (iCharAt5 >= 55296) {
                        int i50 = iCharAt5 & 8191;
                        int i51 = 13;
                        while (true) {
                            i13 = i49 + 1;
                            cCharAt4 = str.charAt(i49);
                            if (cCharAt4 < 55296) {
                                break;
                            }
                            i50 |= (cCharAt4 & 8191) << i51;
                            i51 += 13;
                            i49 = i13;
                        }
                        iCharAt5 = i50 | (cCharAt4 << i51);
                        i49 = i13;
                    }
                    int i52 = i49 + 1;
                    int iCharAt6 = str.charAt(i49);
                    if (iCharAt6 >= 55296) {
                        int i53 = iCharAt6 & 8191;
                        int i54 = 13;
                        while (true) {
                            i12 = i52 + 1;
                            cCharAt3 = str.charAt(i52);
                            if (cCharAt3 < 55296) {
                                break;
                            }
                            i53 |= (cCharAt3 & 8191) << i54;
                            i54 += 13;
                            i52 = i12;
                        }
                        iCharAt6 = i53 | (cCharAt3 << i54);
                        i52 = i12;
                    }
                    int i55 = i52 + 1;
                    int iCharAt7 = str.charAt(i52);
                    if (iCharAt7 >= 55296) {
                        int i56 = iCharAt7 & 8191;
                        int i57 = i55;
                        int i58 = 13;
                        while (true) {
                            i11 = i57 + 1;
                            cCharAt2 = str.charAt(i57);
                            if (cCharAt2 < 55296) {
                                break;
                            }
                            i56 |= (cCharAt2 & 8191) << i58;
                            i58 += 13;
                            i57 = i11;
                        }
                        iCharAt7 = i56 | (cCharAt2 << i58);
                        i2 = i11;
                    } else {
                        i2 = i55;
                    }
                    int i59 = i2 + 1;
                    if (str.charAt(i2) >= 55296) {
                        do {
                            i10 = i59;
                            i59 = i10 + 1;
                        } while (str.charAt(i10) >= 55296);
                    }
                    int i60 = i59;
                    int i61 = i60 + 1;
                    int iCharAt8 = str.charAt(i60);
                    if (iCharAt8 >= 55296) {
                        int i62 = iCharAt8 & 8191;
                        int i63 = i61;
                        int i64 = 13;
                        while (true) {
                            i9 = i63 + 1;
                            cCharAt = str.charAt(i63);
                            if (cCharAt < 55296) {
                                break;
                            }
                            i62 |= (cCharAt & 8191) << i64;
                            i64 += 13;
                            i63 = i9;
                        }
                        iCharAt8 = i62 | (cCharAt << i64);
                        i61 = i9;
                    }
                    i3 = (iCharAt2 << 1) + iCharAt3;
                    i4 = iCharAt6;
                    iArr = new int[iCharAt8 + iCharAt7 + iCharAt2];
                    i5 = iCharAt4;
                    i6 = iCharAt5;
                    i7 = iCharAt7;
                    i8 = iCharAt8;
                    i35 = iCharAt2;
                    i37 = i61;
                }
                int i65 = 1;
                Object[] objArr = elw0Var.c;
                Class<?> cls2 = elw0Var.f8022a.getClass();
                int[] iArr3 = new int[i4 * 3];
                Object[] objArr2 = new Object[i4 << 1];
                int i66 = i7 + i8;
                int i67 = i66;
                int i68 = i8;
                int i69 = 0;
                int i70 = 0;
                while (i37 < length) {
                    int i71 = i37 + 1;
                    int iCharAt9 = str.charAt(i37);
                    int i72 = length;
                    if (iCharAt9 >= 55296) {
                        int i73 = iCharAt9 & 8191;
                        int i74 = i71;
                        int i75 = 13;
                        while (true) {
                            i33 = i74 + 1;
                            cCharAt11 = str.charAt(i74);
                            iArr2 = iArr3;
                            if (cCharAt11 < 55296) {
                                break;
                            }
                            i73 |= (cCharAt11 & 8191) << i75;
                            i75 += 13;
                            i74 = i33;
                            iArr3 = iArr2;
                        }
                        iCharAt9 = i73 | (cCharAt11 << i75);
                        i17 = i33;
                    } else {
                        iArr2 = iArr3;
                        i17 = i71;
                    }
                    int i76 = i17 + 1;
                    int iCharAt10 = str.charAt(i17);
                    if (iCharAt10 >= 55296) {
                        int i77 = iCharAt10 & 8191;
                        int i78 = i76;
                        int i79 = 13;
                        while (true) {
                            i31 = i78 + 1;
                            cCharAt10 = str.charAt(i78);
                            i32 = i77;
                            if (cCharAt10 < 55296) {
                                break;
                            }
                            i77 = i32 | ((cCharAt10 & 8191) << i79);
                            i79 += 13;
                            i78 = i31;
                        }
                        iCharAt10 = i32 | (cCharAt10 << i79);
                        i18 = i31;
                    } else {
                        i18 = i76;
                    }
                    int i80 = i35;
                    int i81 = iCharAt10 & 255;
                    int i82 = iCharAt9;
                    if ((iCharAt10 & 1024) != 0) {
                        iArr[i70] = i69;
                        i70++;
                    }
                    Object[] objArr3 = objArr2;
                    if (i81 >= 51) {
                        i37 = i18 + 1;
                        int iCharAt11 = str.charAt(i18);
                        char c = 55296;
                        if (iCharAt11 >= 55296) {
                            int i83 = iCharAt11 & 8191;
                            int i84 = 13;
                            while (true) {
                                i30 = i37 + 1;
                                cCharAt9 = str.charAt(i37);
                                if (cCharAt9 < c) {
                                    break;
                                }
                                i83 |= (cCharAt9 & 8191) << i84;
                                i84 += 13;
                                i37 = i30;
                                c = 55296;
                            }
                            iCharAt11 = i83 | (cCharAt9 << i84);
                            i37 = i30;
                        }
                        int i85 = i81 - 51;
                        int i86 = iCharAt11;
                        if (i85 == 9 || i85 == 17) {
                            int i87 = i65;
                            i27 = i3 + 1;
                            objArr3[((i69 / 3) << i87) + i87] = objArr[i3];
                        } else {
                            if (i85 == 12) {
                                int i88 = i65;
                                if (hne.b(elw0Var.a(), i88) || (iCharAt10 & 2048) != 0) {
                                    i27 = i3 + 1;
                                    objArr3[((i69 / 3) << i88) + i88] = objArr[i3];
                                }
                            }
                            i28 = i86 << 1;
                            obj = objArr[i28];
                            if (obj instanceof Field) {
                                fieldO2 = (Field) obj;
                            } else {
                                fieldO2 = vkw0.o(cls2, (String) obj);
                                objArr[i28] = fieldO2;
                                iArr[i67] = i69;
                                i67++;
                            }
                            i19 = i5;
                            int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldO2);
                            i29 = i28 + 1;
                            obj2 = objArr[i29];
                            if (obj2 instanceof Field) {
                                fieldO3 = (Field) obj2;
                            } else {
                                fieldO3 = vkw0.o(cls2, (String) obj2);
                                objArr[i29] = fieldO3;
                            }
                            i23 = i3;
                            i24 = 0;
                            i65 = 1;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldO3);
                            i22 = iObjectFieldOffset3;
                        }
                        i3 = i27;
                        i28 = i86 << 1;
                        obj = objArr[i28];
                        if (obj instanceof Field) {
                            fieldO2 = (Field) obj;
                        } else {
                            fieldO2 = vkw0.o(cls2, (String) obj);
                            objArr[i28] = fieldO2;
                            iArr[i67] = i69;
                            i67++;
                        }
                        i19 = i5;
                        int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldO2);
                        i29 = i28 + 1;
                        obj2 = objArr[i29];
                        if (obj2 instanceof Field) {
                            fieldO3 = (Field) obj2;
                        } else {
                            fieldO3 = vkw0.o(cls2, (String) obj2);
                            objArr[i29] = fieldO3;
                        }
                        i23 = i3;
                        i24 = 0;
                        i65 = 1;
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldO3);
                        i22 = iObjectFieldOffset4;
                    } else {
                        i19 = i5;
                        int i89 = i3 + 1;
                        Field fieldO4 = vkw0.o(cls2, (String) objArr[i3]);
                        if (i81 == 9 || i81 == 17) {
                            i20 = i89;
                            objArr3[((i69 / 3) << 1) + 1] = fieldO4.getType();
                        } else {
                            if (i81 == 27 || i81 == 49) {
                                i26 = i3 + 2;
                                objArr3[((i69 / 3) << 1) + 1] = objArr[i89];
                            } else if (i81 == 12 || i81 == 30 || i81 == 44) {
                                i20 = i89;
                                if (elw0Var.a() == 1 || (iCharAt10 & 2048) != 0) {
                                    i26 = i3 + 2;
                                    objArr3[((i69 / 3) << 1) + 1] = objArr[i20];
                                }
                                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO4);
                                if ((iCharAt10 & 4096) != 0 || i81 > 17) {
                                    i65 = 1;
                                    int i90 = i21;
                                    i37 = i18;
                                    i22 = iObjectFieldOffset;
                                    i23 = i90;
                                    iObjectFieldOffset2 = 1048575;
                                    i24 = 0;
                                } else {
                                    int i91 = i18 + 1;
                                    int iCharAt12 = str.charAt(i18);
                                    if (iCharAt12 >= 55296) {
                                        int i92 = iCharAt12 & 8191;
                                        int i93 = 13;
                                        while (true) {
                                            i25 = i91 + 1;
                                            cCharAt8 = str.charAt(i91);
                                            if (cCharAt8 < 55296) {
                                                break;
                                            }
                                            i92 |= (cCharAt8 & 8191) << i93;
                                            i93 += 13;
                                            i91 = i25;
                                        }
                                        iCharAt12 = i92 | (cCharAt8 << i93);
                                        i91 = i25;
                                    }
                                    i65 = 1;
                                    int i94 = (iCharAt12 / 32) + (i80 << 1);
                                    Object obj4 = objArr[i94];
                                    if (obj4 instanceof Field) {
                                        fieldO = (Field) obj4;
                                    } else {
                                        fieldO = vkw0.o(cls2, (String) obj4);
                                        objArr[i94] = fieldO;
                                    }
                                    i24 = iCharAt12 % 32;
                                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldO);
                                    i22 = iObjectFieldOffset;
                                    i23 = i21;
                                    i37 = i91;
                                }
                            } else if (i81 == 50) {
                                int i95 = i68 + 1;
                                iArr[i68] = i69;
                                int i96 = (i69 / 3) << 1;
                                i20 = i3 + 2;
                                objArr3[i96] = objArr[i89];
                                if ((iCharAt10 & 2048) != 0) {
                                    i21 = i3 + 3;
                                    objArr3[i96 + 1] = objArr[i20];
                                    i68 = i95;
                                } else {
                                    i68 = i95;
                                }
                                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO4);
                                if ((iCharAt10 & 4096) != 0) {
                                    i65 = 1;
                                    int i97 = i21;
                                    i37 = i18;
                                    i22 = iObjectFieldOffset;
                                    i23 = i97;
                                    iObjectFieldOffset2 = 1048575;
                                    i24 = 0;
                                } else {
                                    i65 = 1;
                                    int i98 = i21;
                                    i37 = i18;
                                    i22 = iObjectFieldOffset;
                                    i23 = i98;
                                    iObjectFieldOffset2 = 1048575;
                                    i24 = 0;
                                }
                            } else {
                                i20 = i89;
                            }
                            i21 = i26;
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO4);
                            if ((iCharAt10 & 4096) != 0) {
                                i65 = 1;
                                int i99 = i21;
                                i37 = i18;
                                i22 = iObjectFieldOffset;
                                i23 = i99;
                                iObjectFieldOffset2 = 1048575;
                                i24 = 0;
                            } else {
                                i65 = 1;
                                int i910 = i21;
                                i37 = i18;
                                i22 = iObjectFieldOffset;
                                i23 = i910;
                                iObjectFieldOffset2 = 1048575;
                                i24 = 0;
                            }
                        }
                        i21 = i20;
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO4);
                        if ((iCharAt10 & 4096) != 0) {
                            i65 = 1;
                            int i911 = i21;
                            i37 = i18;
                            i22 = iObjectFieldOffset;
                            i23 = i911;
                            iObjectFieldOffset2 = 1048575;
                            i24 = 0;
                        } else {
                            i65 = 1;
                            int i912 = i21;
                            i37 = i18;
                            i22 = iObjectFieldOffset;
                            i23 = i912;
                            iObjectFieldOffset2 = 1048575;
                            i24 = 0;
                        }
                    }
                    int i100 = i69 + 1;
                    iArr2[i69] = i82;
                    int i101 = i69 + 2;
                    Unsafe unsafe2 = unsafe;
                    iArr2[i100] = ((iCharAt10 & 512) != 0 ? 536870912 : 0) | ((iCharAt10 & 256) != 0 ? 268435456 : 0) | ((iCharAt10 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i81 << 20) | i22;
                    i69 += 3;
                    iArr2[i101] = (i24 << 20) | iObjectFieldOffset2;
                    i3 = i23;
                    i35 = i80;
                    length = i72;
                    iArr3 = iArr2;
                    unsafe = unsafe2;
                    str = str;
                    objArr2 = objArr3;
                    i5 = i19;
                }
                vkw0Var = new vkw0(iArr3, objArr2, i5, i6, elw0Var.f8022a, iArr, i8, i66, uxs0Var);
            }
            byte[] bArr = lkw0.f20222a;
            dlw0 dlw0Var = (dlw0) concurrentHashMap.putIfAbsent(cls, vkw0Var);
            return dlw0Var != null ? dlw0Var : vkw0Var;
        } catch (Exception e) {
            e9d0.m("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }
}

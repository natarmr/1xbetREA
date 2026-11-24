package a;

import com.appsflyer.share.attribution.RequestError;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class vkw0 implements dlw0 {
    public static final int[] j = new int[0];
    public static final Unsafe k = mlw0.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f37597a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final ojw0 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;

    public vkw0(int[] iArr, Object[] objArr, int i, int i2, ojw0 ojw0Var, int[] iArr2, int i3, int i4, uxs0 uxs0Var) {
        this.f37597a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = ojw0Var instanceof jkw0;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.e = ojw0Var;
    }

    public static void G(Object obj) {
        if (H(obj)) {
            return;
        }
        jf4.o("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    public static boolean H(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof jkw0) {
            return ((jkw0) obj).s();
        }
        return true;
    }

    public static int k(Object obj, long j2) {
        return ((Integer) mlw0.m(obj, j2)).intValue();
    }

    public static Field o(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbN = b1j.n("Field ", str, " for ", name, " not found. Known fields are ");
            sbN.append(string);
            throw new RuntimeException(sbN.toString(), e);
        }
    }

    public static long v(Object obj, long j2) {
        return ((Long) mlw0.m(obj, j2)).longValue();
    }

    public final boolean A(int i, int i2, Object obj) {
        return mlw0.h(obj, (long) (this.f37597a[i2 + 2] & 1048575)) == i;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00f6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f7 A[RETURN] */
    public final boolean B(int i, Object obj) {
        int i2 = this.f37597a[i + 2];
        long j2 = i2 & 1048575;
        if (j2 != 1048575) {
            if (((1 << (i2 >>> 20)) & mlw0.h(obj, j2)) != 0) {
                return true;
            }
            return false;
        }
        int iZ = z(i);
        long j3 = iZ & 1048575;
        switch ((iZ & 267386880) >>> 20) {
            case 0:
                if (Double.doubleToRawLongBits(mlw0.c.k(obj, j3)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(mlw0.c.p(obj, j3)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (mlw0.k(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (mlw0.k(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (mlw0.h(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (mlw0.k(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (mlw0.h(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 7:
                return mlw0.c.s(obj, j3);
            case 8:
                Object objM = mlw0.m(obj, j3);
                if (objM instanceof String) {
                    if (((String) objM).isEmpty()) {
                        return false;
                    }
                    return true;
                }
                if (!(objM instanceof sjw0)) {
                    e9d0.o();
                    return false;
                }
                if (sjw0.b.equals(objM)) {
                    return false;
                }
                return true;
            case 9:
                if (mlw0.m(obj, j3) != null) {
                    return true;
                }
                return false;
            case 10:
                if (sjw0.b.equals(mlw0.m(obj, j3))) {
                    return false;
                }
                return true;
            case 11:
                if (mlw0.h(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (mlw0.h(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (mlw0.h(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (mlw0.k(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (mlw0.h(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (mlw0.k(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (mlw0.m(obj, j3) != null) {
                    return true;
                }
                return false;
            default:
                e9d0.o();
                return false;
        }
    }

    public final boolean C(jkw0 jkw0Var, jkw0 jkw0Var2, int i) {
        return B(i, jkw0Var) == B(i, jkw0Var2);
    }

    public final void D(int i) {
        if (this.b[((i / 3) << 1) + 1] == null) {
            return;
        }
        hny.b();
    }

    public final dlw0 E(int i) {
        int i2 = (i / 3) << 1;
        Object[] objArr = this.b;
        dlw0 dlw0Var = (dlw0) objArr[i2];
        if (dlw0Var != null) {
            return dlw0Var;
        }
        dlw0 dlw0VarA = clw0.b.a((Class) objArr[i2 + 1]);
        objArr[i2] = dlw0VarA;
        return dlw0VarA;
    }

    public final Object F(int i) {
        return this.b[(i / 3) << 1];
    }

    @Override // a.dlw0
    public final boolean a(Object obj) {
        int i;
        int i2;
        vkw0 vkw0Var;
        Object obj2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < this.h) {
            int i6 = this.g[i4];
            int iZ = this.z(i6);
            int[] iArr = this.f37597a;
            int i7 = iArr[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i5 = k.getInt(obj, i8);
                }
                i2 = i5;
                i = i8;
            } else {
                i = i3;
                i2 = i5;
            }
            if ((268435456 & iZ) != 0) {
                vkw0Var = this;
                obj2 = obj;
                if (!vkw0Var.t(obj2, i6, i, i2, i9)) {
                }
                return false;
            }
            vkw0Var = this;
            obj2 = obj;
            int i10 = (267386880 & iZ) >>> 20;
            if (i10 == 9 || i10 == 17) {
                if (vkw0Var.t(obj2, i6, i, i2, i9) && !vkw0Var.E(i6).a(mlw0.m(obj2, iZ & 1048575))) {
                    return false;
                }
                i4++;
                this = vkw0Var;
                obj = obj2;
                i3 = i;
                i5 = i2;
            } else {
                if (i10 != 27) {
                    if (i10 == 60 || i10 == 68) {
                        if (vkw0Var.A(iArr[i6], i6, obj2) && !vkw0Var.E(i6).a(mlw0.m(obj2, iZ & 1048575))) {
                            return false;
                        }
                    } else if (i10 != 49) {
                        if (i10 == 50 && !((ukw0) mlw0.m(obj2, iZ & 1048575)).isEmpty()) {
                            if (vkw0Var.F(i6) == null) {
                                throw new NoSuchMethodError();
                            }
                            hny.b();
                            return false;
                        }
                    }
                    i4++;
                    this = vkw0Var;
                    obj = obj2;
                    i3 = i;
                    i5 = i2;
                }
                List list = (List) mlw0.m(obj2, iZ & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    dlw0 dlw0VarE = vkw0Var.E(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!dlw0VarE.a(list.get(i11))) {
                            return false;
                        }
                    }
                }
                i4++;
                this = vkw0Var;
                obj = obj2;
                i3 = i;
                i5 = i2;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084 A[SYNTHETIC] */
    @Override // a.dlw0
    public final void b(Object obj) {
        if (H(obj)) {
            if (obj instanceof jkw0) {
                jkw0 jkw0Var = (jkw0) obj;
                jkw0Var.j(Integer.MAX_VALUE);
                jkw0Var.zza = 0;
                jkw0Var.r();
            }
            int[] iArr = this.f37597a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iZ = z(i);
                long j2 = 1048575 & iZ;
                int i2 = (iZ & 267386880) >>> 20;
                Unsafe unsafe = k;
                if (i2 != 9) {
                    if (i2 != 60 && i2 != 68) {
                        switch (i2) {
                            case 17:
                                if (B(i, obj)) {
                                    E(i).b(unsafe.getObject(obj, j2));
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
                                blw0 blw0Var = (blw0) ((mkw0) mlw0.m(obj, j2));
                                if (blw0Var.f2814a) {
                                    blw0Var.f2814a = false;
                                }
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                Object object = unsafe.getObject(obj, j2);
                                if (object != null) {
                                    ((ukw0) object).f35848a = false;
                                    unsafe.putObject(obj, j2, object);
                                }
                                break;
                        }
                    } else if (A(iArr[i], i, obj)) {
                        E(i).b(unsafe.getObject(obj, j2));
                    }
                } else if (B(i, obj)) {
                    E(i).b(unsafe.getObject(obj, j2));
                }
            }
            klw0 klw0Var = ((jkw0) obj).zzb;
            if (klw0Var.e) {
                klw0Var.e = false;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // a.dlw0
    public final void c(Object obj, zlt0 zlt0Var) {
        boolean z;
        int i;
        boolean z2;
        vkw0 vkw0Var = this;
        p4 p4Var = (p4) zlt0Var.b;
        int[] iArr = vkw0Var.f37597a;
        int length = iArr.length;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int iZ = vkw0Var.z(i4);
            int i6 = iArr[i4];
            int i7 = (267386880 & iZ) >>> 20;
            Unsafe unsafe = k;
            if (i7 <= 17) {
                int i8 = iArr[i4 + 2];
                z = true;
                int i9 = i8 & i2;
                if (i9 != i3) {
                    i5 = i9 == i2 ? 0 : unsafe.getInt(obj, i9);
                    i3 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                z = true;
                i = 0;
            }
            long j2 = iZ & i2;
            switch (i7) {
                case 0:
                    if (vkw0Var.t(obj, i4, i3, i5, i)) {
                        p4Var.S0(i6, Double.doubleToRawLongBits(mlw0.c.k(obj, j2)));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 1:
                    if (vkw0Var.t(obj, i4, i3, i5, i)) {
                        p4Var.R0(i6, Float.floatToRawIntBits(mlw0.c.p(obj, j2)));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 2:
                    if (vkw0Var.t(obj, i4, i3, i5, i)) {
                        p4Var.b1(i6, unsafe.getLong(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 3:
                    if (vkw0Var.t(obj, i4, i3, i5, i)) {
                        p4Var.b1(i6, unsafe.getLong(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 4:
                    if (vkw0Var.t(obj, i4, i3, i5, i)) {
                        p4Var.a1(i6, unsafe.getInt(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 5:
                    if (vkw0Var.t(obj, i4, i3, i5, i)) {
                        p4Var.S0(i6, unsafe.getLong(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 6:
                    if (vkw0Var.t(obj, i4, i3, i5, i)) {
                        p4Var.R0(i6, unsafe.getInt(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 7:
                    if (vkw0Var.t(obj, i4, i3, i5, i)) {
                        p4Var.V0(i6, mlw0.c.s(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 8:
                    if (vkw0Var.t(obj, i4, i3, i5, i)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            p4Var.U0(i6, (String) object);
                        } else {
                            p4Var.T0(i6, (sjw0) object);
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 9:
                    if (vkw0Var.t(obj, i4, i3, i5, i)) {
                        zlt0Var.q(i6, unsafe.getObject(obj, j2), vkw0Var.E(i4));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 10:
                    if (vkw0Var.t(obj, i4, i3, i5, i)) {
                        p4Var.T0(i6, (sjw0) unsafe.getObject(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 11:
                    if (vkw0Var.t(obj, i4, i3, i5, i)) {
                        p4Var.k1(i6, unsafe.getInt(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 12:
                    if (vkw0Var.t(obj, i4, i3, i5, i)) {
                        p4Var.a1(i6, unsafe.getInt(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 13:
                    if (vkw0Var.t(obj, i4, i3, i5, i)) {
                        p4Var.R0(i6, unsafe.getInt(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 14:
                    if (vkw0Var.t(obj, i4, i3, i5, i)) {
                        p4Var.S0(i6, unsafe.getLong(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 15:
                    if (vkw0Var.t(obj, i4, i3, i5, i)) {
                        p4Var.k1(i6, p4.l1(unsafe.getInt(obj, j2)));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 16:
                    if (vkw0Var.t(obj, i4, i3, i5, i)) {
                        p4Var.b1(i6, p4.j1(unsafe.getLong(obj, j2)));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 17:
                    if (vkw0Var.t(obj, i4, i3, i5, i)) {
                        Object object2 = unsafe.getObject(obj, j2);
                        p4Var.h1(i6, 3);
                        vkw0Var.E(i4).c((ojw0) object2, zlt0Var);
                        p4Var.h1(i6, 4);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 18:
                    jiq0.F0(iArr[i4], (List) unsafe.getObject(obj, j2), zlt0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    jiq0.N0(iArr[i4], (List) unsafe.getObject(obj, j2), zlt0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 20:
                    jiq0.R0(iArr[i4], (List) unsafe.getObject(obj, j2), zlt0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 21:
                    jiq0.Z0(iArr[i4], (List) unsafe.getObject(obj, j2), zlt0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 22:
                    jiq0.P0(iArr[i4], (List) unsafe.getObject(obj, j2), zlt0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 23:
                    jiq0.L0(iArr[i4], (List) unsafe.getObject(obj, j2), zlt0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 24:
                    jiq0.J0(iArr[i4], (List) unsafe.getObject(obj, j2), zlt0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    jiq0.B0(iArr[i4], (List) unsafe.getObject(obj, j2), zlt0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    int i10 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j2);
                    if (list != null && !list.isEmpty()) {
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            p4Var.U0(i10, (String) list.get(i11));
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    int i12 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j2);
                    dlw0 dlw0VarE = vkw0Var.E(i4);
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i13 = 0; i13 < list2.size(); i13++) {
                            zlt0Var.q(i12, list2.get(i13), dlw0VarE);
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    int i14 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j2);
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i15 = 0; i15 < list3.size(); i15++) {
                            p4Var.T0(i14, (sjw0) list3.get(i15));
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                    z2 = false;
                    jiq0.Y0(iArr[i4], (List) unsafe.getObject(obj, j2), zlt0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                    z2 = false;
                    jiq0.H0(iArr[i4], (List) unsafe.getObject(obj, j2), zlt0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                    z2 = false;
                    jiq0.T0(iArr[i4], (List) unsafe.getObject(obj, j2), zlt0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 32:
                    z2 = false;
                    jiq0.V0(iArr[i4], (List) unsafe.getObject(obj, j2), zlt0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 33:
                    z2 = false;
                    jiq0.W0(iArr[i4], (List) unsafe.getObject(obj, j2), zlt0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 34:
                    z2 = false;
                    jiq0.X0(iArr[i4], (List) unsafe.getObject(obj, j2), zlt0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 35:
                    jiq0.F0(iArr[i4], (List) unsafe.getObject(obj, j2), zlt0Var, z);
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 36:
                    jiq0.N0(iArr[i4], (List) unsafe.getObject(obj, j2), zlt0Var, z);
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 37:
                    jiq0.R0(iArr[i4], (List) unsafe.getObject(obj, j2), zlt0Var, z);
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 38:
                    jiq0.Z0(iArr[i4], (List) unsafe.getObject(obj, j2), zlt0Var, z);
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 39:
                    jiq0.P0(iArr[i4], (List) unsafe.getObject(obj, j2), zlt0Var, z);
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 40:
                    jiq0.L0(iArr[i4], (List) unsafe.getObject(obj, j2), zlt0Var, z);
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 41:
                    jiq0.J0(iArr[i4], (List) unsafe.getObject(obj, j2), zlt0Var, z);
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 42:
                    jiq0.B0(iArr[i4], (List) unsafe.getObject(obj, j2), zlt0Var, z);
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 43:
                    jiq0.Y0(iArr[i4], (List) unsafe.getObject(obj, j2), zlt0Var, z);
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 44:
                    jiq0.H0(iArr[i4], (List) unsafe.getObject(obj, j2), zlt0Var, z);
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 45:
                    jiq0.T0(iArr[i4], (List) unsafe.getObject(obj, j2), zlt0Var, z);
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 46:
                    jiq0.V0(iArr[i4], (List) unsafe.getObject(obj, j2), zlt0Var, z);
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 47:
                    jiq0.W0(iArr[i4], (List) unsafe.getObject(obj, j2), zlt0Var, z);
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 48:
                    jiq0.X0(iArr[i4], (List) unsafe.getObject(obj, j2), zlt0Var, z);
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 49:
                    int i16 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j2);
                    dlw0 dlw0VarE2 = vkw0Var.E(i4);
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i17 = 0; i17 < list4.size(); i17++) {
                            ojw0 ojw0Var = (ojw0) list4.get(i17);
                            p4Var.h1(i16, 3);
                            dlw0VarE2.c(ojw0Var, zlt0Var);
                            p4Var.h1(i16, 4);
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    if (unsafe.getObject(obj, j2) != null) {
                        if (vkw0Var.F(i4) == null) {
                            throw new NoSuchMethodError();
                        }
                        hny.b();
                        return;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 51:
                    if (vkw0Var.A(i6, i4, obj)) {
                        p4Var.S0(i6, Double.doubleToRawLongBits(((Double) mlw0.m(obj, j2)).doubleValue()));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 52:
                    if (vkw0Var.A(i6, i4, obj)) {
                        p4Var.R0(i6, Float.floatToRawIntBits(((Float) mlw0.m(obj, j2)).floatValue()));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 53:
                    if (vkw0Var.A(i6, i4, obj)) {
                        p4Var.b1(i6, v(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 54:
                    if (vkw0Var.A(i6, i4, obj)) {
                        p4Var.b1(i6, v(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 55:
                    if (vkw0Var.A(i6, i4, obj)) {
                        p4Var.a1(i6, k(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 56:
                    if (vkw0Var.A(i6, i4, obj)) {
                        p4Var.S0(i6, v(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 57:
                    if (vkw0Var.A(i6, i4, obj)) {
                        p4Var.R0(i6, k(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 58:
                    if (vkw0Var.A(i6, i4, obj)) {
                        p4Var.V0(i6, ((Boolean) mlw0.m(obj, j2)).booleanValue());
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 59:
                    if (vkw0Var.A(i6, i4, obj)) {
                        Object object3 = unsafe.getObject(obj, j2);
                        if (object3 instanceof String) {
                            p4Var.U0(i6, (String) object3);
                        } else {
                            p4Var.T0(i6, (sjw0) object3);
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 60:
                    if (vkw0Var.A(i6, i4, obj)) {
                        zlt0Var.q(i6, unsafe.getObject(obj, j2), vkw0Var.E(i4));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 61:
                    if (vkw0Var.A(i6, i4, obj)) {
                        p4Var.T0(i6, (sjw0) unsafe.getObject(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 62:
                    if (vkw0Var.A(i6, i4, obj)) {
                        p4Var.k1(i6, k(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 63:
                    if (vkw0Var.A(i6, i4, obj)) {
                        p4Var.a1(i6, k(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 64:
                    if (vkw0Var.A(i6, i4, obj)) {
                        p4Var.R0(i6, k(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 65:
                    if (vkw0Var.A(i6, i4, obj)) {
                        p4Var.S0(i6, v(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 66:
                    if (vkw0Var.A(i6, i4, obj)) {
                        p4Var.k1(i6, p4.l1(k(obj, j2)));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 67:
                    if (vkw0Var.A(i6, i4, obj)) {
                        p4Var.b1(i6, p4.j1(v(obj, j2)));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                case 68:
                    if (vkw0Var.A(i6, i4, obj)) {
                        Object object4 = unsafe.getObject(obj, j2);
                        p4Var.h1(i6, 3);
                        vkw0Var.E(i4).c((ojw0) object4, zlt0Var);
                        p4Var.h1(i6, 4);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
                default:
                    i4 += 3;
                    i2 = 1048575;
                    vkw0Var = this;
                    break;
            }
        }
        ((jkw0) obj).zzb.d(zlt0Var);
    }

    /* JADX WARN: Code duplicated, block: B:135:0x05d0 A[LOOP:5: B:134:0x05ce->B:135:0x05d0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:137:0x05da  */
    @Override // a.dlw0
    public final void d(Object obj, hu5 hu5Var, dkw0 dkw0Var) {
        int[] iArr = this.g;
        int i = this.i;
        int i2 = this.h;
        byte[] bArr = lkw0.f20222a;
        dkw0Var.getClass();
        G(obj);
        klw0 klw0VarN = null;
        while (true) {
            try {
                int iJ0 = hu5Var.J0();
                int iJ = (iJ0 < this.c || iJ0 > this.d) ? -1 : j(iJ0, 0);
                if (iJ >= 0) {
                    int iZ = z(iJ);
                    boolean z = true;
                    switch ((267386880 & iZ) >>> 20) {
                        case 0:
                            hu5Var.G0(1);
                            mlw0.c.m(obj, iZ & 1048575, ((tdw0) hu5Var.e).l());
                            x(iJ, obj);
                            continue;
                        case 1:
                            hu5Var.G0(5);
                            mlw0.c.n(obj, iZ & 1048575, ((tdw0) hu5Var.e).p());
                            x(iJ, obj);
                            continue;
                        case 2:
                            hu5Var.G0(0);
                            mlw0.b(obj, iZ & 1048575, ((tdw0) hu5Var.e).K());
                            x(iJ, obj);
                            continue;
                        case 3:
                            hu5Var.G0(0);
                            mlw0.b(obj, iZ & 1048575, ((tdw0) hu5Var.e).S());
                            x(iJ, obj);
                            continue;
                        case 4:
                            hu5Var.G0(0);
                            mlw0.a(obj, ((tdw0) hu5Var.e).A(), iZ & 1048575);
                            x(iJ, obj);
                            continue;
                        case 5:
                            hu5Var.G0(1);
                            mlw0.b(obj, iZ & 1048575, ((tdw0) hu5Var.e).I());
                            x(iJ, obj);
                            continue;
                        case 6:
                            hu5Var.G0(5);
                            mlw0.a(obj, ((tdw0) hu5Var.e).z(), iZ & 1048575);
                            x(iJ, obj);
                            continue;
                        case 7:
                            hu5Var.G0(0);
                            mlw0.c.o(obj, iZ & 1048575, ((tdw0) hu5Var.e).d0());
                            x(iJ, obj);
                            continue;
                        case 8:
                            p(iZ, hu5Var, obj);
                            x(iJ, obj);
                            continue;
                        case 9:
                            Object obj2 = (ojw0) n(iJ, obj);
                            dlw0 dlw0VarE = E(iJ);
                            hu5Var.G0(2);
                            hu5Var.N0(obj2, dlw0VarE, dkw0Var);
                            u(iJ, obj, obj2);
                            continue;
                        case 10:
                            mlw0.c(obj, iZ & 1048575, hu5Var.Z0());
                            x(iJ, obj);
                            continue;
                        case 11:
                            hu5Var.G0(0);
                            mlw0.a(obj, ((tdw0) hu5Var.e).H(), iZ & 1048575);
                            x(iJ, obj);
                            continue;
                        case 12:
                            hu5Var.G0(0);
                            int iW = ((tdw0) hu5Var.e).w();
                            D(iJ);
                            mlw0.a(obj, iW, iZ & 1048575);
                            x(iJ, obj);
                            continue;
                        case 13:
                            hu5Var.G0(5);
                            mlw0.a(obj, ((tdw0) hu5Var.e).C(), iZ & 1048575);
                            x(iJ, obj);
                            continue;
                        case 14:
                            hu5Var.G0(1);
                            mlw0.b(obj, iZ & 1048575, ((tdw0) hu5Var.e).N());
                            x(iJ, obj);
                            continue;
                        case 15:
                            hu5Var.G0(0);
                            mlw0.a(obj, ((tdw0) hu5Var.e).E(), iZ & 1048575);
                            x(iJ, obj);
                            continue;
                        case 16:
                            hu5Var.G0(0);
                            mlw0.b(obj, iZ & 1048575, ((tdw0) hu5Var.e).P());
                            x(iJ, obj);
                            continue;
                        case 17:
                            Object obj3 = (ojw0) n(iJ, obj);
                            dlw0 dlw0VarE2 = E(iJ);
                            hu5Var.G0(3);
                            hu5Var.L0(obj3, dlw0VarE2, dkw0Var);
                            u(iJ, obj, obj3);
                            continue;
                        case 18:
                            hu5Var.K0(iom0.y(obj, iZ & 1048575));
                            continue;
                        case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                            hu5Var.Q0(iom0.y(obj, iZ & 1048575));
                            continue;
                        case 20:
                            hu5Var.S0(iom0.y(obj, iZ & 1048575));
                            continue;
                        case 21:
                            hu5Var.c1(iom0.y(obj, iZ & 1048575));
                            continue;
                        case 22:
                            hu5Var.R0(iom0.y(obj, iZ & 1048575));
                            continue;
                        case 23:
                            hu5Var.P0(iom0.y(obj, iZ & 1048575));
                            continue;
                        case 24:
                            hu5Var.O0(iom0.y(obj, iZ & 1048575));
                            continue;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                            hu5Var.C0(iom0.y(obj, iZ & 1048575));
                            continue;
                        case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                            if ((536870912 & iZ) == 0) {
                                z = false;
                            }
                            if (!z) {
                                hu5Var.X0(iom0.y(obj, iZ & 1048575));
                                continue;
                            } else {
                                hu5Var.Y0(iom0.y(obj, iZ & 1048575));
                            }
                            break;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                            hu5Var.I0(iom0.y(obj, iZ & 1048575), E(iJ), dkw0Var);
                            continue;
                        case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                            hu5Var.H0(iom0.y(obj, iZ & 1048575));
                            continue;
                        case AvailableCode.HMS_IS_SPOOF /* 29 */:
                            hu5Var.a1(iom0.y(obj, iZ & 1048575));
                            continue;
                        case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                            hu5Var.M0(iom0.y(obj, iZ & 1048575));
                            D(iJ);
                            continue;
                        case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                            hu5Var.T0(iom0.y(obj, iZ & 1048575));
                            continue;
                        case 32:
                            hu5Var.U0(iom0.y(obj, iZ & 1048575));
                            continue;
                        case 33:
                            hu5Var.V0(iom0.y(obj, iZ & 1048575));
                            continue;
                        case 34:
                            hu5Var.W0(iom0.y(obj, iZ & 1048575));
                            continue;
                        case 35:
                            hu5Var.K0(iom0.y(obj, iZ & 1048575));
                            continue;
                        case 36:
                            hu5Var.Q0(iom0.y(obj, iZ & 1048575));
                            continue;
                        case 37:
                            hu5Var.S0(iom0.y(obj, iZ & 1048575));
                            continue;
                        case 38:
                            hu5Var.c1(iom0.y(obj, iZ & 1048575));
                            continue;
                        case 39:
                            hu5Var.R0(iom0.y(obj, iZ & 1048575));
                            continue;
                        case 40:
                            hu5Var.P0(iom0.y(obj, iZ & 1048575));
                            continue;
                        case 41:
                            hu5Var.O0(iom0.y(obj, iZ & 1048575));
                            continue;
                        case 42:
                            hu5Var.C0(iom0.y(obj, iZ & 1048575));
                            continue;
                        case 43:
                            hu5Var.a1(iom0.y(obj, iZ & 1048575));
                            continue;
                        case 44:
                            hu5Var.M0(iom0.y(obj, iZ & 1048575));
                            D(iJ);
                            continue;
                        case 45:
                            hu5Var.T0(iom0.y(obj, iZ & 1048575));
                            continue;
                        case 46:
                            hu5Var.U0(iom0.y(obj, iZ & 1048575));
                            continue;
                        case 47:
                            hu5Var.V0(iom0.y(obj, iZ & 1048575));
                            continue;
                        case 48:
                            hu5Var.W0(iom0.y(obj, iZ & 1048575));
                            continue;
                        case 49:
                            hu5Var.D0(iom0.y(obj, iZ & 1048575), E(iJ), dkw0Var);
                            continue;
                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                            Object objF = F(iJ);
                            long jZ = z(iJ) & 1048575;
                            Object objM = mlw0.m(obj, jZ);
                            if (objM == null) {
                                objM = ukw0.b.b();
                                mlw0.c(obj, jZ, objM);
                            } else if (!((ukw0) objM).f35848a) {
                                ukw0 ukw0VarB = ukw0.b.b();
                                ipm0.w(ukw0VarB, objM);
                                mlw0.c(obj, jZ, ukw0VarB);
                                objM = ukw0VarB;
                            }
                            ipm0.x(objM);
                            if (objF != null) {
                                throw new ClassCastException();
                            }
                            throw new NoSuchMethodError();
                        case 51:
                            hu5Var.G0(1);
                            mlw0.c(obj, iZ & 1048575, Double.valueOf(((tdw0) hu5Var.e).l()));
                            w(iJ0, iJ, obj);
                            continue;
                        case 52:
                            hu5Var.G0(5);
                            mlw0.c(obj, iZ & 1048575, Float.valueOf(((tdw0) hu5Var.e).p()));
                            w(iJ0, iJ, obj);
                            continue;
                        case 53:
                            hu5Var.G0(0);
                            mlw0.c(obj, iZ & 1048575, Long.valueOf(((tdw0) hu5Var.e).K()));
                            w(iJ0, iJ, obj);
                            continue;
                        case 54:
                            hu5Var.G0(0);
                            mlw0.c(obj, iZ & 1048575, Long.valueOf(((tdw0) hu5Var.e).S()));
                            w(iJ0, iJ, obj);
                            continue;
                        case 55:
                            hu5Var.G0(0);
                            mlw0.c(obj, iZ & 1048575, Integer.valueOf(((tdw0) hu5Var.e).A()));
                            w(iJ0, iJ, obj);
                            continue;
                        case 56:
                            hu5Var.G0(1);
                            mlw0.c(obj, iZ & 1048575, Long.valueOf(((tdw0) hu5Var.e).I()));
                            w(iJ0, iJ, obj);
                            continue;
                        case 57:
                            hu5Var.G0(5);
                            mlw0.c(obj, iZ & 1048575, Integer.valueOf(((tdw0) hu5Var.e).z()));
                            w(iJ0, iJ, obj);
                            continue;
                        case 58:
                            hu5Var.G0(0);
                            mlw0.c(obj, iZ & 1048575, Boolean.valueOf(((tdw0) hu5Var.e).d0()));
                            w(iJ0, iJ, obj);
                            continue;
                        case 59:
                            p(iZ, hu5Var, obj);
                            w(iJ0, iJ, obj);
                            continue;
                        case 60:
                            Object obj4 = (ojw0) m(iJ0, iJ, obj);
                            dlw0 dlw0VarE3 = E(iJ);
                            hu5Var.G0(2);
                            hu5Var.N0(obj4, dlw0VarE3, dkw0Var);
                            q(obj, iJ0, iJ, obj4);
                            continue;
                        case 61:
                            mlw0.c(obj, iZ & 1048575, hu5Var.Z0());
                            w(iJ0, iJ, obj);
                            continue;
                        case 62:
                            hu5Var.G0(0);
                            mlw0.c(obj, iZ & 1048575, Integer.valueOf(((tdw0) hu5Var.e).H()));
                            w(iJ0, iJ, obj);
                            continue;
                        case 63:
                            hu5Var.G0(0);
                            int iW2 = ((tdw0) hu5Var.e).w();
                            D(iJ);
                            mlw0.c(obj, iZ & 1048575, Integer.valueOf(iW2));
                            w(iJ0, iJ, obj);
                            continue;
                        case 64:
                            hu5Var.G0(5);
                            mlw0.c(obj, iZ & 1048575, Integer.valueOf(((tdw0) hu5Var.e).C()));
                            w(iJ0, iJ, obj);
                            continue;
                        case 65:
                            hu5Var.G0(1);
                            mlw0.c(obj, iZ & 1048575, Long.valueOf(((tdw0) hu5Var.e).N()));
                            w(iJ0, iJ, obj);
                            continue;
                        case 66:
                            hu5Var.G0(0);
                            mlw0.c(obj, iZ & 1048575, Integer.valueOf(((tdw0) hu5Var.e).E()));
                            w(iJ0, iJ, obj);
                            continue;
                        case 67:
                            hu5Var.G0(0);
                            mlw0.c(obj, iZ & 1048575, Long.valueOf(((tdw0) hu5Var.e).P()));
                            w(iJ0, iJ, obj);
                            continue;
                        case 68:
                            Object obj5 = (ojw0) m(iJ0, iJ, obj);
                            dlw0 dlw0VarE4 = E(iJ);
                            hu5Var.G0(3);
                            hu5Var.L0(obj5, dlw0VarE4, dkw0Var);
                            q(obj, iJ0, iJ, obj5);
                            continue;
                        default:
                            if (klw0VarN == null) {
                                try {
                                    klw0VarN = qek0.n(obj);
                                } catch (skw0 unused) {
                                    if (klw0VarN == null) {
                                        klw0VarN = qek0.n(obj);
                                    }
                                    if (!qek0.l(0, hu5Var, klw0VarN)) {
                                        while (i2 < i) {
                                            r(obj, iArr[i2], klw0VarN);
                                            i2++;
                                        }
                                        if (klw0VarN != null) {
                                            ((jkw0) obj).zzb = klw0VarN;
                                            return;
                                        }
                                        return;
                                    }
                                }
                                break;
                            }
                            if (!qek0.l(0, hu5Var, klw0VarN)) {
                                while (i2 < i) {
                                    r(obj, iArr[i2], klw0VarN);
                                    i2++;
                                }
                                if (klw0VarN != null) {
                                    ((jkw0) obj).zzb = klw0VarN;
                                    return;
                                }
                                return;
                            }
                            break;
                            break;
                    }
                    while (i2 < i) {
                        r(obj, iArr[i2], klw0VarN);
                        i2++;
                    }
                    if (klw0VarN != null) {
                        ((jkw0) obj).zzb = klw0VarN;
                    }
                    throw th;
                }
                if (iJ0 == Integer.MAX_VALUE) {
                    while (i2 < i) {
                        r(obj, iArr[i2], klw0VarN);
                        i2++;
                    }
                    if (klw0VarN != null) {
                        ((jkw0) obj).zzb = klw0VarN;
                        return;
                    }
                    return;
                }
                if (klw0VarN == null) {
                    klw0VarN = qek0.n(obj);
                }
                if (!qek0.l(0, hu5Var, klw0VarN)) {
                    while (i2 < i) {
                        r(obj, iArr[i2], klw0VarN);
                        i2++;
                    }
                    if (klw0VarN != null) {
                        ((jkw0) obj).zzb = klw0VarN;
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                while (i2 < i) {
                    r(obj, iArr[i2], klw0VarN);
                    i2++;
                }
                if (klw0VarN != null) {
                    ((jkw0) obj).zzb = klw0VarN;
                }
                throw th;
            }
        }
    }

    @Override // a.dlw0
    public final int e(jkw0 jkw0Var) {
        int i;
        int iB;
        int length = this.f37597a.length;
        int iHashCode = 0;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int iZ = z(i2);
            int i3 = (267386880 & iZ) >>> 20;
            if (i3 <= 50 || i3 >= 69) {
                long j2 = 1048575 & iZ;
                int iHashCode2 = 37;
                switch (i3) {
                    case 0:
                        i = iHashCode * 53;
                        iB = lkw0.b(Double.doubleToLongBits(mlw0.c.k(jkw0Var, j2)));
                        iHashCode = i + iB;
                        break;
                    case 1:
                        i = iHashCode * 53;
                        iB = Float.floatToIntBits(mlw0.c.p(jkw0Var, j2));
                        iHashCode = i + iB;
                        break;
                    case 2:
                        i = iHashCode * 53;
                        iB = lkw0.b(mlw0.k(jkw0Var, j2));
                        iHashCode = i + iB;
                        break;
                    case 3:
                        i = iHashCode * 53;
                        iB = lkw0.b(mlw0.k(jkw0Var, j2));
                        iHashCode = i + iB;
                        break;
                    case 4:
                        i = iHashCode * 53;
                        iB = mlw0.h(jkw0Var, j2);
                        iHashCode = i + iB;
                        break;
                    case 5:
                        i = iHashCode * 53;
                        iB = lkw0.b(mlw0.k(jkw0Var, j2));
                        iHashCode = i + iB;
                        break;
                    case 6:
                        i = iHashCode * 53;
                        iB = mlw0.h(jkw0Var, j2);
                        iHashCode = i + iB;
                        break;
                    case 7:
                        int i4 = iHashCode * 53;
                        boolean zS = mlw0.c.s(jkw0Var, j2);
                        byte[] bArr = lkw0.f20222a;
                        iHashCode = i4 + (zS ? 1231 : 1237);
                        break;
                    case 8:
                        i = iHashCode * 53;
                        iB = ((String) mlw0.m(jkw0Var, j2)).hashCode();
                        iHashCode = i + iB;
                        break;
                    case 9:
                        Object objM = mlw0.m(jkw0Var, j2);
                        if (objM != null) {
                            iHashCode2 = objM.hashCode();
                        }
                        iHashCode = (iHashCode * 53) + iHashCode2;
                        break;
                    case 10:
                        i = iHashCode * 53;
                        iB = mlw0.m(jkw0Var, j2).hashCode();
                        iHashCode = i + iB;
                        break;
                    case 11:
                        i = iHashCode * 53;
                        iB = mlw0.h(jkw0Var, j2);
                        iHashCode = i + iB;
                        break;
                    case 12:
                        i = iHashCode * 53;
                        iB = mlw0.h(jkw0Var, j2);
                        iHashCode = i + iB;
                        break;
                    case 13:
                        i = iHashCode * 53;
                        iB = mlw0.h(jkw0Var, j2);
                        iHashCode = i + iB;
                        break;
                    case 14:
                        i = iHashCode * 53;
                        iB = lkw0.b(mlw0.k(jkw0Var, j2));
                        iHashCode = i + iB;
                        break;
                    case 15:
                        i = iHashCode * 53;
                        iB = mlw0.h(jkw0Var, j2);
                        iHashCode = i + iB;
                        break;
                    case 16:
                        i = iHashCode * 53;
                        iB = lkw0.b(mlw0.k(jkw0Var, j2));
                        iHashCode = i + iB;
                        break;
                    case 17:
                        Object objM2 = mlw0.m(jkw0Var, j2);
                        if (objM2 != null) {
                            iHashCode2 = objM2.hashCode();
                        }
                        iHashCode = (iHashCode * 53) + iHashCode2;
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
                        i = iHashCode * 53;
                        iB = mlw0.m(jkw0Var, j2).hashCode();
                        iHashCode = i + iB;
                        break;
                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                        i = iHashCode * 53;
                        iB = mlw0.m(jkw0Var, j2).hashCode();
                        iHashCode = i + iB;
                        break;
                }
            }
        }
        int i5 = this.i;
        while (true) {
            int[] iArr = this.g;
            if (i5 >= iArr.length) {
                return jkw0Var.zzb.hashCode() + (iHashCode * 53);
            }
            int i6 = iArr[i5];
            if (!A(0, i6, jkw0Var)) {
                iHashCode = mlw0.m(jkw0Var, z(i6) & 1048575).hashCode() + (iHashCode * 53);
            }
            i5++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:148:0x0378  */
    /* JADX WARN: Code duplicated, block: B:226:0x0570  */
    /* JADX WARN: Code duplicated, block: B:230:0x0580  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b0  */
    @Override // a.dlw0
    public final int f(jkw0 jkw0Var) {
        int i;
        int iI1;
        int iE1;
        int iI2;
        int iE2;
        int iI3;
        int iD1;
        int iI4;
        int iB;
        int iI5;
        int iA0;
        int iI6;
        int size;
        int iU0;
        int iI7;
        int iI8;
        int size2;
        int iI9;
        int iI10;
        int iI11;
        int iA1;
        int iI12;
        int iE3;
        int iI13;
        int iE4;
        int iK;
        jkw0 jkw0Var2 = jkw0Var;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int iC = 0;
        while (true) {
            int[] iArr = this.f37597a;
            if (i3 >= iArr.length) {
                return jkw0Var2.zzb.a() + iC;
            }
            int iZ = z(i3);
            int i5 = (267386880 & iZ) >>> 20;
            int i6 = iArr[i3];
            int i7 = iArr[i3 + 2];
            int i8 = i7 & 1048575;
            Unsafe unsafe = k;
            if (i5 <= 17) {
                if (i8 != i2) {
                    i4 = i8 == 1048575 ? 0 : unsafe.getInt(jkw0Var2, i8);
                    i2 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j2 = iZ & 1048575;
            if (i5 >= fkw0.b.f9714a) {
                byte b = fkw0.c.f9714a;
            }
            int iI14 = 8;
            switch (i5) {
                case 0:
                    if (t(jkw0Var2, i3, i2, i4, i)) {
                        iC = ohs0.C(i6 << 3, 8, iC);
                    }
                    i3 += 3;
                    break;
                case 1:
                    if (t(jkw0Var2, i3, i2, i4, i)) {
                        iC = ohs0.C(i6 << 3, 4, iC);
                    }
                    jkw0Var2 = jkw0Var;
                    i3 += 3;
                    break;
                case 2:
                    if (t(jkw0Var2, i3, i2, i4, i)) {
                        long j3 = unsafe.getLong(jkw0Var2, j2);
                        iI1 = p4.i1(i6 << 3);
                        iE1 = p4.e1(j3);
                        iA0 = iE1 + iI1;
                        iC += iA0;
                    }
                    i3 += 3;
                    break;
                case 3:
                    if (t(jkw0Var2, i3, i2, i4, i)) {
                        long j4 = unsafe.getLong(jkw0Var2, j2);
                        iI1 = p4.i1(i6 << 3);
                        iE1 = p4.e1(j4);
                        iA0 = iE1 + iI1;
                        iC += iA0;
                    }
                    i3 += 3;
                    break;
                case 4:
                    if (t(jkw0Var2, i3, i2, i4, i)) {
                        int i9 = unsafe.getInt(jkw0Var2, j2);
                        iI2 = p4.i1(i6 << 3);
                        iE2 = p4.e1(i9);
                        iD1 = iE2 + iI2;
                        iC += iD1;
                    }
                    i3 += 3;
                    break;
                case 5:
                    if (t(jkw0Var2, i3, i2, i4, i)) {
                        iC = ohs0.C(i6 << 3, 8, iC);
                    }
                    jkw0Var2 = jkw0Var;
                    i3 += 3;
                    break;
                case 6:
                    if (t(jkw0Var2, i3, i2, i4, i)) {
                        iC = ohs0.C(i6 << 3, 4, iC);
                    }
                    jkw0Var2 = jkw0Var;
                    i3 += 3;
                    break;
                case 7:
                    if (t(jkw0Var2, i3, i2, i4, i)) {
                        iC = ohs0.C(i6 << 3, 1, iC);
                    }
                    jkw0Var2 = jkw0Var;
                    i3 += 3;
                    break;
                case 8:
                    if (t(jkw0Var2, i3, i2, i4, i)) {
                        Object object = unsafe.getObject(jkw0Var2, j2);
                        if (object instanceof sjw0) {
                            iD1 = p4.d1(i6, (sjw0) object);
                            iC += iD1;
                        } else {
                            int iI15 = p4.i1(i6 << 3);
                            int iV = yqm0.v((String) object);
                            iI3 = p4.i1(iV) + iV + iI15;
                            iC += iI3;
                        }
                    }
                    i3 += 3;
                    break;
                case 9:
                    if (t(jkw0Var2, i3, i2, i4, i)) {
                        Object object2 = unsafe.getObject(jkw0Var2, j2);
                        dlw0 dlw0VarE = E(i3);
                        iI4 = p4.i1(i6 << 3);
                        iB = ((ojw0) object2).b(dlw0VarE);
                        iI5 = p4.i1(iB);
                        iI3 = iI5 + iB + iI4;
                        iC += iI3;
                    }
                    i3 += 3;
                    break;
                case 10:
                    if (t(jkw0Var2, i3, i2, i4, i)) {
                        iD1 = p4.d1(i6, (sjw0) unsafe.getObject(jkw0Var2, j2));
                        iC += iD1;
                    }
                    i3 += 3;
                    break;
                case 11:
                    if (t(jkw0Var2, i3, i2, i4, i)) {
                        iC = ohs0.C(unsafe.getInt(jkw0Var2, j2), p4.i1(i6 << 3), iC);
                    }
                    i3 += 3;
                    break;
                case 12:
                    if (t(jkw0Var2, i3, i2, i4, i)) {
                        int i10 = unsafe.getInt(jkw0Var2, j2);
                        iI2 = p4.i1(i6 << 3);
                        iE2 = p4.e1(i10);
                        iD1 = iE2 + iI2;
                        iC += iD1;
                    }
                    i3 += 3;
                    break;
                case 13:
                    if (t(jkw0Var2, i3, i2, i4, i)) {
                        iC = ohs0.C(i6 << 3, 4, iC);
                    }
                    jkw0Var2 = jkw0Var;
                    i3 += 3;
                    break;
                case 14:
                    if (t(jkw0Var2, i3, i2, i4, i)) {
                        iC = ohs0.C(i6 << 3, 8, iC);
                    }
                    jkw0Var2 = jkw0Var;
                    i3 += 3;
                    break;
                case 15:
                    if (t(jkw0Var2, i3, i2, i4, i)) {
                        int i11 = unsafe.getInt(jkw0Var2, j2);
                        iI2 = p4.i1(i6 << 3);
                        iE2 = p4.i1(p4.l1(i11));
                        iD1 = iE2 + iI2;
                        iC += iD1;
                    }
                    i3 += 3;
                    break;
                case 16:
                    if (t(jkw0Var2, i3, i2, i4, i)) {
                        long j5 = unsafe.getLong(jkw0Var2, j2);
                        iI1 = p4.i1(i6 << 3);
                        iE1 = p4.e1(p4.j1(j5));
                        iA0 = iE1 + iI1;
                        iC += iA0;
                    }
                    i3 += 3;
                    break;
                case 17:
                    if (t(jkw0Var2, i3, i2, i4, i)) {
                        iA0 = jiq0.A0(i6, (ojw0) unsafe.getObject(jkw0Var2, j2), E(i3));
                        iC += iA0;
                    }
                    i3 += 3;
                    break;
                case 18:
                    iA0 = jiq0.I0(i6, (List) unsafe.getObject(jkw0Var2, j2));
                    iC += iA0;
                    i3 += 3;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    iA0 = jiq0.G0(i6, (List) unsafe.getObject(jkw0Var2, j2));
                    iC += iA0;
                    i3 += 3;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(jkw0Var2, j2);
                    if (list.size() == 0) {
                        iI6 = 0;
                    } else {
                        iI6 = (p4.i1(i6 << 3) * list.size()) + jiq0.M0(list);
                    }
                    iC += iI6;
                    i3 += 3;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(jkw0Var2, j2);
                    size = list2.size();
                    if (size == 0) {
                        iI6 = 0;
                    } else {
                        iU0 = jiq0.U0(list2);
                        iI7 = p4.i1(i6 << 3);
                        iI6 = (iI7 * size) + iU0;
                    }
                    iC += iI6;
                    i3 += 3;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(jkw0Var2, j2);
                    size = list3.size();
                    if (size == 0) {
                        iI6 = 0;
                    } else {
                        iU0 = jiq0.K0(list3);
                        iI7 = p4.i1(i6 << 3);
                        iI6 = (iI7 * size) + iU0;
                    }
                    iC += iI6;
                    i3 += 3;
                    break;
                case 23:
                    iA0 = jiq0.I0(i6, (List) unsafe.getObject(jkw0Var2, j2));
                    iC += iA0;
                    i3 += 3;
                    break;
                case 24:
                    iA0 = jiq0.G0(i6, (List) unsafe.getObject(jkw0Var2, j2));
                    iC += iA0;
                    i3 += 3;
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    int size3 = ((List) unsafe.getObject(jkw0Var2, j2)).size();
                    iC += size3 == 0 ? 0 : (p4.i1(i6 << 3) + 1) * size3;
                    i3 += 3;
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    List list4 = (List) unsafe.getObject(jkw0Var2, j2);
                    int size4 = list4.size();
                    if (size4 == 0) {
                        iI6 = 0;
                    } else {
                        iI6 = p4.i1(i6 << 3) * size4;
                        for (int i12 = 0; i12 < size4; i12++) {
                            Object obj = list4.get(i12);
                            int iE = obj instanceof sjw0 ? ((sjw0) obj).e() : yqm0.v((String) obj);
                            iI6 = ohs0.C(iE, iE, iI6);
                        }
                    }
                    iC += iI6;
                    i3 += 3;
                    break;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    List list5 = (List) unsafe.getObject(jkw0Var2, j2);
                    dlw0 dlw0VarE2 = E(i3);
                    int size5 = list5.size();
                    if (size5 == 0) {
                        iI8 = 0;
                    } else {
                        iI8 = p4.i1(i6 << 3) * size5;
                        for (int i13 = 0; i13 < size5; i13++) {
                            int iB2 = ((ojw0) list5.get(i13)).b(dlw0VarE2);
                            iI8 = ohs0.C(iB2, iB2, iI8);
                        }
                    }
                    iC += iI8;
                    i3 += 3;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    List list6 = (List) unsafe.getObject(jkw0Var2, j2);
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iI6 = 0;
                    } else {
                        iI6 = p4.i1(i6 << 3) * size6;
                        for (int i14 = 0; i14 < list6.size(); i14++) {
                            int iE5 = ((sjw0) list6.get(i14)).e();
                            iI6 = ohs0.C(iE5, iE5, iI6);
                        }
                    }
                    iC += iI6;
                    i3 += 3;
                    break;
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                    List list7 = (List) unsafe.getObject(jkw0Var2, j2);
                    size = list7.size();
                    if (size == 0) {
                        iI6 = 0;
                    } else {
                        iU0 = jiq0.S0(list7);
                        iI7 = p4.i1(i6 << 3);
                        iI6 = (iI7 * size) + iU0;
                    }
                    iC += iI6;
                    i3 += 3;
                    break;
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                    List list8 = (List) unsafe.getObject(jkw0Var2, j2);
                    size = list8.size();
                    if (size == 0) {
                        iI6 = 0;
                    } else {
                        iU0 = jiq0.E0(list8);
                        iI7 = p4.i1(i6 << 3);
                        iI6 = (iI7 * size) + iU0;
                    }
                    iC += iI6;
                    i3 += 3;
                    break;
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                    iA0 = jiq0.G0(i6, (List) unsafe.getObject(jkw0Var2, j2));
                    iC += iA0;
                    i3 += 3;
                    break;
                case 32:
                    iA0 = jiq0.I0(i6, (List) unsafe.getObject(jkw0Var2, j2));
                    iC += iA0;
                    i3 += 3;
                    break;
                case 33:
                    List list9 = (List) unsafe.getObject(jkw0Var2, j2);
                    size = list9.size();
                    if (size == 0) {
                        iI6 = 0;
                    } else {
                        iU0 = jiq0.O0(list9);
                        iI7 = p4.i1(i6 << 3);
                        iI6 = (iI7 * size) + iU0;
                    }
                    iC += iI6;
                    i3 += 3;
                    break;
                case 34:
                    List list10 = (List) unsafe.getObject(jkw0Var2, j2);
                    size = list10.size();
                    if (size == 0) {
                        iI6 = 0;
                    } else {
                        iU0 = jiq0.Q0(list10);
                        iI7 = p4.i1(i6 << 3);
                        iI6 = (iI7 * size) + iU0;
                    }
                    iC += iI6;
                    i3 += 3;
                    break;
                case 35:
                    size2 = ((List) unsafe.getObject(jkw0Var2, j2)).size() << 3;
                    if (size2 > 0) {
                        iI9 = p4.i1(i6 << 3);
                        iI10 = p4.i1(size2);
                        iI11 = iI10 + iI9 + size2;
                        iC += iI11;
                    }
                    i3 += 3;
                    break;
                case 36:
                    size2 = ((List) unsafe.getObject(jkw0Var2, j2)).size() << 2;
                    if (size2 > 0) {
                        iI9 = p4.i1(i6 << 3);
                        iI10 = p4.i1(size2);
                        iI11 = iI10 + iI9 + size2;
                        iC += iI11;
                    }
                    i3 += 3;
                    break;
                case 37:
                    size2 = jiq0.M0((List) unsafe.getObject(jkw0Var2, j2));
                    if (size2 > 0) {
                        iI9 = p4.i1(i6 << 3);
                        iI10 = p4.i1(size2);
                        iI11 = iI10 + iI9 + size2;
                        iC += iI11;
                    }
                    i3 += 3;
                    break;
                case 38:
                    size2 = jiq0.U0((List) unsafe.getObject(jkw0Var2, j2));
                    if (size2 > 0) {
                        iI9 = p4.i1(i6 << 3);
                        iI10 = p4.i1(size2);
                        iI11 = iI10 + iI9 + size2;
                        iC += iI11;
                    }
                    i3 += 3;
                    break;
                case 39:
                    size2 = jiq0.K0((List) unsafe.getObject(jkw0Var2, j2));
                    if (size2 > 0) {
                        iI9 = p4.i1(i6 << 3);
                        iI10 = p4.i1(size2);
                        iI11 = iI10 + iI9 + size2;
                        iC += iI11;
                    }
                    i3 += 3;
                    break;
                case 40:
                    size2 = ((List) unsafe.getObject(jkw0Var2, j2)).size() << 3;
                    if (size2 > 0) {
                        iI9 = p4.i1(i6 << 3);
                        iI10 = p4.i1(size2);
                        iI11 = iI10 + iI9 + size2;
                        iC += iI11;
                    }
                    i3 += 3;
                    break;
                case 41:
                    size2 = ((List) unsafe.getObject(jkw0Var2, j2)).size() << 2;
                    if (size2 > 0) {
                        iI9 = p4.i1(i6 << 3);
                        iI10 = p4.i1(size2);
                        iI11 = iI10 + iI9 + size2;
                        iC += iI11;
                    }
                    i3 += 3;
                    break;
                case 42:
                    size2 = ((List) unsafe.getObject(jkw0Var2, j2)).size();
                    if (size2 > 0) {
                        iI9 = p4.i1(i6 << 3);
                        iI10 = p4.i1(size2);
                        iI11 = iI10 + iI9 + size2;
                        iC += iI11;
                    }
                    i3 += 3;
                    break;
                case 43:
                    size2 = jiq0.S0((List) unsafe.getObject(jkw0Var2, j2));
                    if (size2 > 0) {
                        iI9 = p4.i1(i6 << 3);
                        iI10 = p4.i1(size2);
                        iI11 = iI10 + iI9 + size2;
                        iC += iI11;
                    }
                    i3 += 3;
                    break;
                case 44:
                    size2 = jiq0.E0((List) unsafe.getObject(jkw0Var2, j2));
                    if (size2 > 0) {
                        iI9 = p4.i1(i6 << 3);
                        iI10 = p4.i1(size2);
                        iI11 = iI10 + iI9 + size2;
                        iC += iI11;
                    }
                    i3 += 3;
                    break;
                case 45:
                    size2 = ((List) unsafe.getObject(jkw0Var2, j2)).size() << 2;
                    if (size2 > 0) {
                        iI9 = p4.i1(i6 << 3);
                        iI10 = p4.i1(size2);
                        iI11 = iI10 + iI9 + size2;
                        iC += iI11;
                    }
                    i3 += 3;
                    break;
                case 46:
                    size2 = ((List) unsafe.getObject(jkw0Var2, j2)).size() << 3;
                    if (size2 > 0) {
                        iI9 = p4.i1(i6 << 3);
                        iI10 = p4.i1(size2);
                        iI11 = iI10 + iI9 + size2;
                        iC += iI11;
                    }
                    i3 += 3;
                    break;
                case 47:
                    size2 = jiq0.O0((List) unsafe.getObject(jkw0Var2, j2));
                    if (size2 > 0) {
                        iI9 = p4.i1(i6 << 3);
                        iI10 = p4.i1(size2);
                        iI11 = iI10 + iI9 + size2;
                        iC += iI11;
                    }
                    i3 += 3;
                    break;
                case 48:
                    size2 = jiq0.Q0((List) unsafe.getObject(jkw0Var2, j2));
                    if (size2 > 0) {
                        iI9 = p4.i1(i6 << 3);
                        iI10 = p4.i1(size2);
                        iI11 = iI10 + iI9 + size2;
                        iC += iI11;
                    }
                    i3 += 3;
                    break;
                case 49:
                    List list11 = (List) unsafe.getObject(jkw0Var2, j2);
                    dlw0 dlw0VarE3 = E(i3);
                    int size7 = list11.size();
                    if (size7 == 0) {
                        iA1 = 0;
                    } else {
                        iA1 = 0;
                        for (int i15 = 0; i15 < size7; i15++) {
                            iA1 += jiq0.A0(i6, (ojw0) list11.get(i15), dlw0VarE3);
                        }
                    }
                    iC += iA1;
                    i3 += 3;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    ukw0 ukw0Var = (ukw0) unsafe.getObject(jkw0Var2, j2);
                    if (F(i3) != null) {
                        hny.b();
                        return 0;
                    }
                    if (ukw0Var.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = ukw0Var.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw new NoSuchMethodError();
                        }
                    }
                    i3 += 3;
                    break;
                case 51:
                    if (A(i6, i3, jkw0Var2)) {
                        iK = i6 << 3;
                        iC = ohs0.C(iK, iI14, iC);
                    }
                    i3 += 3;
                    break;
                case 52:
                    if (A(i6, i3, jkw0Var2)) {
                        iC = ohs0.C(i6 << 3, 4, iC);
                    }
                    i3 += 3;
                    break;
                case 53:
                    if (A(i6, i3, jkw0Var2)) {
                        long jV = v(jkw0Var2, j2);
                        iI12 = p4.i1(i6 << 3);
                        iE3 = p4.e1(jV);
                        iA0 = iE3 + iI12;
                        iC += iA0;
                    }
                    i3 += 3;
                    break;
                case 54:
                    if (A(i6, i3, jkw0Var2)) {
                        long jV2 = v(jkw0Var2, j2);
                        iI12 = p4.i1(i6 << 3);
                        iE3 = p4.e1(jV2);
                        iA0 = iE3 + iI12;
                        iC += iA0;
                    }
                    i3 += 3;
                    break;
                case 55:
                    if (A(i6, i3, jkw0Var2)) {
                        int iK2 = k(jkw0Var2, j2);
                        iI13 = p4.i1(i6 << 3);
                        iE4 = p4.e1(iK2);
                        iA0 = iE4 + iI13;
                        iC += iA0;
                    }
                    i3 += 3;
                    break;
                case 56:
                    if (A(i6, i3, jkw0Var2)) {
                        iK = i6 << 3;
                        iC = ohs0.C(iK, iI14, iC);
                    }
                    i3 += 3;
                    break;
                case 57:
                    if (A(i6, i3, jkw0Var2)) {
                        iC = ohs0.C(i6 << 3, 4, iC);
                    }
                    i3 += 3;
                    break;
                case 58:
                    if (A(i6, i3, jkw0Var2)) {
                        iC = ohs0.C(i6 << 3, 1, iC);
                    }
                    i3 += 3;
                    break;
                case 59:
                    if (A(i6, i3, jkw0Var2)) {
                        Object object3 = unsafe.getObject(jkw0Var2, j2);
                        if (object3 instanceof sjw0) {
                            iA0 = p4.d1(i6, (sjw0) object3);
                            iC += iA0;
                        } else {
                            int iI16 = p4.i1(i6 << 3);
                            int iV2 = yqm0.v((String) object3);
                            iI11 = p4.i1(iV2) + iV2 + iI16;
                            iC += iI11;
                        }
                    }
                    i3 += 3;
                    break;
                case 60:
                    if (A(i6, i3, jkw0Var2)) {
                        Object object4 = unsafe.getObject(jkw0Var2, j2);
                        dlw0 dlw0VarE4 = E(i3);
                        iI4 = p4.i1(i6 << 3);
                        iB = ((ojw0) object4).b(dlw0VarE4);
                        iI5 = p4.i1(iB);
                        iI3 = iI5 + iB + iI4;
                        iC += iI3;
                    }
                    i3 += 3;
                    break;
                case 61:
                    if (A(i6, i3, jkw0Var2)) {
                        iA0 = p4.d1(i6, (sjw0) unsafe.getObject(jkw0Var2, j2));
                        iC += iA0;
                    }
                    i3 += 3;
                    break;
                case 62:
                    if (A(i6, i3, jkw0Var2)) {
                        iK = k(jkw0Var2, j2);
                        iI14 = p4.i1(i6 << 3);
                        iC = ohs0.C(iK, iI14, iC);
                    }
                    i3 += 3;
                    break;
                case 63:
                    if (A(i6, i3, jkw0Var2)) {
                        int iK3 = k(jkw0Var2, j2);
                        iI13 = p4.i1(i6 << 3);
                        iE4 = p4.e1(iK3);
                        iA0 = iE4 + iI13;
                        iC += iA0;
                    }
                    i3 += 3;
                    break;
                case 64:
                    if (A(i6, i3, jkw0Var2)) {
                        iC = ohs0.C(i6 << 3, 4, iC);
                    }
                    i3 += 3;
                    break;
                case 65:
                    if (A(i6, i3, jkw0Var2)) {
                        iK = i6 << 3;
                        iC = ohs0.C(iK, iI14, iC);
                    }
                    i3 += 3;
                    break;
                case 66:
                    if (A(i6, i3, jkw0Var2)) {
                        int iK4 = k(jkw0Var2, j2);
                        iI13 = p4.i1(i6 << 3);
                        iE4 = p4.i1(p4.l1(iK4));
                        iA0 = iE4 + iI13;
                        iC += iA0;
                    }
                    i3 += 3;
                    break;
                case 67:
                    if (A(i6, i3, jkw0Var2)) {
                        long jV3 = v(jkw0Var2, j2);
                        iI12 = p4.i1(i6 << 3);
                        iE3 = p4.e1(p4.j1(jV3));
                        iA0 = iE3 + iI12;
                        iC += iA0;
                    }
                    i3 += 3;
                    break;
                case 68:
                    if (A(i6, i3, jkw0Var2)) {
                        iA0 = jiq0.A0(i6, (ojw0) unsafe.getObject(jkw0Var2, j2), E(i3));
                        iC += iA0;
                    }
                    i3 += 3;
                    break;
                default:
                    i3 += 3;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    @Override // a.dlw0
    public final boolean g(jkw0 jkw0Var, jkw0 jkw0Var2) {
        int[] iArr = this.f37597a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zD0 = true;
            if (i < length) {
                int iZ = z(i);
                int i2 = (267386880 & iZ) >>> 20;
                if (i2 <= 50 || i2 >= 69) {
                    long j2 = iZ & 1048575;
                    switch (i2) {
                        case 0:
                            if (!C(jkw0Var, jkw0Var2, i)) {
                                zD0 = false;
                            } else {
                                gft0 gft0Var = mlw0.c;
                                if (Double.doubleToLongBits(gft0Var.k(jkw0Var, j2)) != Double.doubleToLongBits(gft0Var.k(jkw0Var2, j2))) {
                                    zD0 = false;
                                }
                            }
                            break;
                        case 1:
                            if (!C(jkw0Var, jkw0Var2, i)) {
                                zD0 = false;
                            } else {
                                gft0 gft0Var2 = mlw0.c;
                                if (Float.floatToIntBits(gft0Var2.p(jkw0Var, j2)) != Float.floatToIntBits(gft0Var2.p(jkw0Var2, j2))) {
                                    zD0 = false;
                                }
                            }
                            break;
                        case 2:
                            if (!C(jkw0Var, jkw0Var2, i) || mlw0.k(jkw0Var, j2) != mlw0.k(jkw0Var2, j2)) {
                                zD0 = false;
                            }
                            break;
                        case 3:
                            if (!C(jkw0Var, jkw0Var2, i) || mlw0.k(jkw0Var, j2) != mlw0.k(jkw0Var2, j2)) {
                                zD0 = false;
                            }
                            break;
                        case 4:
                            if (!C(jkw0Var, jkw0Var2, i) || mlw0.h(jkw0Var, j2) != mlw0.h(jkw0Var2, j2)) {
                                zD0 = false;
                            }
                            break;
                        case 5:
                            if (!C(jkw0Var, jkw0Var2, i) || mlw0.k(jkw0Var, j2) != mlw0.k(jkw0Var2, j2)) {
                                zD0 = false;
                            }
                            break;
                        case 6:
                            if (!C(jkw0Var, jkw0Var2, i) || mlw0.h(jkw0Var, j2) != mlw0.h(jkw0Var2, j2)) {
                                zD0 = false;
                            }
                            break;
                        case 7:
                            if (!C(jkw0Var, jkw0Var2, i)) {
                                zD0 = false;
                            } else {
                                gft0 gft0Var3 = mlw0.c;
                                if (gft0Var3.s(jkw0Var, j2) != gft0Var3.s(jkw0Var2, j2)) {
                                    zD0 = false;
                                }
                            }
                            break;
                        case 8:
                            if (!C(jkw0Var, jkw0Var2, i) || !jiq0.D0(mlw0.m(jkw0Var, j2), mlw0.m(jkw0Var2, j2))) {
                                zD0 = false;
                            }
                            break;
                        case 9:
                            if (!C(jkw0Var, jkw0Var2, i) || !jiq0.D0(mlw0.m(jkw0Var, j2), mlw0.m(jkw0Var2, j2))) {
                                zD0 = false;
                            }
                            break;
                        case 10:
                            if (!C(jkw0Var, jkw0Var2, i) || !jiq0.D0(mlw0.m(jkw0Var, j2), mlw0.m(jkw0Var2, j2))) {
                                zD0 = false;
                            }
                            break;
                        case 11:
                            if (!C(jkw0Var, jkw0Var2, i) || mlw0.h(jkw0Var, j2) != mlw0.h(jkw0Var2, j2)) {
                                zD0 = false;
                            }
                            break;
                        case 12:
                            if (!C(jkw0Var, jkw0Var2, i) || mlw0.h(jkw0Var, j2) != mlw0.h(jkw0Var2, j2)) {
                                zD0 = false;
                            }
                            break;
                        case 13:
                            if (!C(jkw0Var, jkw0Var2, i) || mlw0.h(jkw0Var, j2) != mlw0.h(jkw0Var2, j2)) {
                                zD0 = false;
                            }
                            break;
                        case 14:
                            if (!C(jkw0Var, jkw0Var2, i) || mlw0.k(jkw0Var, j2) != mlw0.k(jkw0Var2, j2)) {
                                zD0 = false;
                            }
                            break;
                        case 15:
                            if (!C(jkw0Var, jkw0Var2, i) || mlw0.h(jkw0Var, j2) != mlw0.h(jkw0Var2, j2)) {
                                zD0 = false;
                            }
                            break;
                        case 16:
                            if (!C(jkw0Var, jkw0Var2, i) || mlw0.k(jkw0Var, j2) != mlw0.k(jkw0Var2, j2)) {
                                zD0 = false;
                            }
                            break;
                        case 17:
                            if (!C(jkw0Var, jkw0Var2, i) || !jiq0.D0(mlw0.m(jkw0Var, j2), mlw0.m(jkw0Var2, j2))) {
                                zD0 = false;
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
                            zD0 = jiq0.D0(mlw0.m(jkw0Var, j2), mlw0.m(jkw0Var2, j2));
                            break;
                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                            zD0 = jiq0.D0(mlw0.m(jkw0Var, j2), mlw0.m(jkw0Var2, j2));
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
                            long j3 = 1048575 & iArr[i + 2];
                            if (mlw0.h(jkw0Var, j3) != mlw0.h(jkw0Var2, j3) || !jiq0.D0(mlw0.m(jkw0Var, j2), mlw0.m(jkw0Var2, j2))) {
                                zD0 = false;
                            }
                            break;
                    }
                    if (!zD0) {
                    }
                }
                i += 3;
            } else {
                int i3 = this.i;
                while (true) {
                    int[] iArr2 = this.g;
                    if (i3 < iArr2.length) {
                        int i4 = iArr2[i3];
                        long j4 = iArr[i4 + 2] & 1048575;
                        if (mlw0.h(jkw0Var, j4) != mlw0.h(jkw0Var2, j4)) {
                            return false;
                        }
                        if (!A(0, i4, jkw0Var)) {
                            long jZ = z(i4) & 1048575;
                            if (!jiq0.D0(mlw0.m(jkw0Var, jZ), mlw0.m(jkw0Var2, jZ))) {
                            }
                        }
                        i3++;
                    } else if (jkw0Var.zzb.equals(jkw0Var2.zzb)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // a.dlw0
    public final void h(Object obj, byte[] bArr, int i, int i2, mdw0 mdw0Var) {
        l(obj, bArr, i, i2, 0, mdw0Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    @Override // a.dlw0
    public final void i(Object obj, Object obj2) {
        Object obj3;
        G(obj);
        byte[] bArr = lkw0.f20222a;
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f37597a;
            if (i >= iArr.length) {
                jiq0.C0(obj, obj2);
                return;
            }
            int iZ = z(i);
            long j2 = 1048575 & iZ;
            int i2 = iArr[i];
            switch ((iZ & 267386880) >>> 20) {
                case 0:
                    if (!B(i, obj2)) {
                        obj3 = obj;
                    } else {
                        gft0 gft0Var = mlw0.c;
                        obj3 = obj;
                        gft0Var.m(obj3, j2, gft0Var.k(obj2, j2));
                        x(i, obj3);
                    }
                    break;
                case 1:
                    if (B(i, obj2)) {
                        gft0 gft0Var2 = mlw0.c;
                        gft0Var2.n(obj, j2, gft0Var2.p(obj2, j2));
                        x(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (B(i, obj2)) {
                        mlw0.b(obj, j2, mlw0.k(obj2, j2));
                        x(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (B(i, obj2)) {
                        mlw0.b(obj, j2, mlw0.k(obj2, j2));
                        x(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (B(i, obj2)) {
                        mlw0.a(obj, mlw0.h(obj2, j2), j2);
                        x(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (B(i, obj2)) {
                        mlw0.b(obj, j2, mlw0.k(obj2, j2));
                        x(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (B(i, obj2)) {
                        mlw0.a(obj, mlw0.h(obj2, j2), j2);
                        x(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (B(i, obj2)) {
                        gft0 gft0Var3 = mlw0.c;
                        gft0Var3.o(obj, j2, gft0Var3.s(obj2, j2));
                        x(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (B(i, obj2)) {
                        mlw0.c(obj, j2, mlw0.m(obj2, j2));
                        x(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    s(obj, obj2, i);
                    obj3 = obj;
                    break;
                case 10:
                    if (B(i, obj2)) {
                        mlw0.c(obj, j2, mlw0.m(obj2, j2));
                        x(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (B(i, obj2)) {
                        mlw0.a(obj, mlw0.h(obj2, j2), j2);
                        x(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (B(i, obj2)) {
                        mlw0.a(obj, mlw0.h(obj2, j2), j2);
                        x(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (B(i, obj2)) {
                        mlw0.a(obj, mlw0.h(obj2, j2), j2);
                        x(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (B(i, obj2)) {
                        mlw0.b(obj, j2, mlw0.k(obj2, j2));
                        x(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (B(i, obj2)) {
                        mlw0.a(obj, mlw0.h(obj2, j2), j2);
                        x(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (B(i, obj2)) {
                        mlw0.b(obj, j2, mlw0.k(obj2, j2));
                        x(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    s(obj, obj2, i);
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
                    mkw0 mkw0VarC = (mkw0) mlw0.m(obj, j2);
                    mkw0 mkw0Var = (mkw0) mlw0.m(obj2, j2);
                    int i3 = ((blw0) mkw0VarC).c;
                    int i4 = ((blw0) mkw0Var).c;
                    if (i3 > 0 && i4 > 0) {
                        if (!((blw0) mkw0VarC).f2814a) {
                            mkw0VarC = ((blw0) mkw0VarC).c(i4 + i3);
                        }
                        ((blw0) mkw0VarC).addAll(mkw0Var);
                    }
                    if (i3 > 0) {
                        mkw0Var = mkw0VarC;
                    }
                    mlw0.c(obj, j2, mkw0Var);
                    obj3 = obj;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    mlw0.c(obj, j2, ipm0.w(mlw0.m(obj, j2), mlw0.m(obj2, j2)));
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
                    if (A(i2, i, obj2)) {
                        mlw0.c(obj, j2, mlw0.m(obj2, j2));
                        w(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    y(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (A(i2, i, obj2)) {
                        mlw0.c(obj, j2, mlw0.m(obj2, j2));
                        w(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    y(i, obj, obj2);
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

    public final int j(int i, int i2) {
        int[] iArr = this.f37597a;
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

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 25561. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int l(java.lang.Object r33, byte[] r34, int r35, int r36, int r37, a.mdw0 r38) {
        /*
            Method dump skipped, instruction units count: 2556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.vkw0.l(java.lang.Object, byte[], int, int, int, a.mdw0):int");
    }

    public final Object m(int i, int i2, Object obj) {
        dlw0 dlw0VarE = E(i2);
        if (!A(i, i2, obj)) {
            return dlw0VarE.zza();
        }
        Object object = k.getObject(obj, z(i2) & 1048575);
        if (H(object)) {
            return object;
        }
        jkw0 jkw0VarZza = dlw0VarE.zza();
        if (object != null) {
            dlw0VarE.i(jkw0VarZza, object);
        }
        return jkw0VarZza;
    }

    public final Object n(int i, Object obj) {
        dlw0 dlw0VarE = E(i);
        long jZ = z(i) & 1048575;
        if (!B(i, obj)) {
            return dlw0VarE.zza();
        }
        Object object = k.getObject(obj, jZ);
        if (H(object)) {
            return object;
        }
        jkw0 jkw0VarZza = dlw0VarE.zza();
        if (object != null) {
            dlw0VarE.i(jkw0VarZza, object);
        }
        return jkw0VarZza;
    }

    public final void p(int i, hu5 hu5Var, Object obj) {
        if ((536870912 & i) != 0) {
            hu5Var.G0(2);
            mlw0.c(obj, i & 1048575, ((tdw0) hu5Var.e).Y());
        } else if (!this.f) {
            mlw0.c(obj, i & 1048575, hu5Var.Z0());
        } else {
            hu5Var.G0(2);
            mlw0.c(obj, i & 1048575, ((tdw0) hu5Var.e).W());
        }
    }

    public final void q(Object obj, int i, int i2, Object obj2) {
        k.putObject(obj, z(i2) & 1048575, obj2);
        w(i, i2, obj);
    }

    public final void r(Object obj, int i, Object obj2) {
        int i2 = this.f37597a[i];
        if (mlw0.m(obj, z(i) & 1048575) == null) {
            return;
        }
        D(i);
    }

    public final void s(Object obj, Object obj2, int i) {
        if (B(i, obj2)) {
            long jZ = z(i) & 1048575;
            Unsafe unsafe = k;
            Object object = unsafe.getObject(obj2, jZ);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f37597a[i] + " is present but null: " + String.valueOf(obj2));
            }
            dlw0 dlw0VarE = E(i);
            if (!B(i, obj)) {
                if (H(object)) {
                    jkw0 jkw0VarZza = dlw0VarE.zza();
                    dlw0VarE.i(jkw0VarZza, object);
                    unsafe.putObject(obj, jZ, jkw0VarZza);
                } else {
                    unsafe.putObject(obj, jZ, object);
                }
                x(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jZ);
            if (!H(object2)) {
                jkw0 jkw0VarZza2 = dlw0VarE.zza();
                dlw0VarE.i(jkw0VarZza2, object2);
                unsafe.putObject(obj, jZ, jkw0VarZza2);
                object2 = jkw0VarZza2;
            }
            dlw0VarE.i(object2, object);
        }
    }

    public final boolean t(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return B(i, obj);
        }
        return (i3 & i4) != 0;
    }

    public final void u(int i, Object obj, Object obj2) {
        k.putObject(obj, z(i) & 1048575, obj2);
        x(i, obj);
    }

    public final void w(int i, int i2, Object obj) {
        mlw0.a(obj, i, this.f37597a[i2 + 2] & 1048575);
    }

    public final void x(int i, Object obj) {
        int i2 = this.f37597a[i + 2];
        long j2 = 1048575 & i2;
        if (j2 == 1048575) {
            return;
        }
        mlw0.a(obj, (1 << (i2 >>> 20)) | mlw0.h(obj, j2), j2);
    }

    public final void y(int i, Object obj, Object obj2) {
        int[] iArr = this.f37597a;
        int i2 = iArr[i];
        if (A(i2, i, obj2)) {
            long jZ = z(i) & 1048575;
            Unsafe unsafe = k;
            Object object = unsafe.getObject(obj2, jZ);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + String.valueOf(obj2));
            }
            dlw0 dlw0VarE = E(i);
            if (!A(i2, i, obj)) {
                if (H(object)) {
                    jkw0 jkw0VarZza = dlw0VarE.zza();
                    dlw0VarE.i(jkw0VarZza, object);
                    unsafe.putObject(obj, jZ, jkw0VarZza);
                } else {
                    unsafe.putObject(obj, jZ, object);
                }
                w(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jZ);
            if (!H(object2)) {
                jkw0 jkw0VarZza2 = dlw0VarE.zza();
                dlw0VarE.i(jkw0VarZza2, object2);
                unsafe.putObject(obj, jZ, jkw0VarZza2);
                object2 = jkw0VarZza2;
            }
            dlw0VarE.i(object2, object);
        }
    }

    public final int z(int i) {
        return this.f37597a[i + 1];
    }

    @Override // a.dlw0
    public final jkw0 zza() {
        return ((jkw0) this.e).p();
    }
}

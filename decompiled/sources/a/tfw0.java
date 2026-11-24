package a;

import com.appsflyer.share.attribution.RequestError;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class tfw0 implements egw0 {
    public static final int[] k = new int[0];
    public static final Unsafe l = pgw0.k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f33886a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final jdw0 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final pek0 j;

    public tfw0(int[] iArr, Object[] objArr, int i, int i2, jdw0 jdw0Var, int[] iArr2, int i3, int i4, pek0 pek0Var, bzs0 bzs0Var) {
        this.f33886a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = jdw0Var instanceof mew0;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = pek0Var;
        this.e = jdw0Var;
    }

    public static int j(int i) {
        return (i >>> 20) & 255;
    }

    public static boolean k(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof mew0) {
            return ((mew0) obj).e();
        }
        return true;
    }

    public static void l(Object obj) {
        if (k(obj)) {
            return;
        }
        jf4.o("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    public static int m(Object obj, long j) {
        return ((Integer) pgw0.h(obj, j)).intValue();
    }

    public static long n(Object obj, long j) {
        return ((Long) pgw0.h(obj, j)).longValue();
    }

    public static final int v(byte[] bArr, int i, int i2, ugw0 ugw0Var, Class cls, mdw0 mdw0Var) throws zew0 {
        ugw0 ugw0Var2 = ugw0.c;
        switch (ugw0Var.ordinal()) {
            case 0:
                int i3 = i + 8;
                mdw0Var.c = Double.valueOf(Double.longBitsToDouble(hfm0.N(bArr, i)));
                return i3;
            case 1:
                int i4 = i + 4;
                mdw0Var.c = Float.valueOf(Float.intBitsToFloat(hfm0.M(bArr, i)));
                return i4;
            case 2:
            case 3:
                int iL = hfm0.L(bArr, i, mdw0Var);
                mdw0Var.c = Long.valueOf(mdw0Var.b);
                return iL;
            case 4:
            case 12:
            case 13:
                int iJ = hfm0.J(bArr, i, mdw0Var);
                mdw0Var.c = Integer.valueOf(mdw0Var.f21617a);
                return iJ;
            case 5:
            case 15:
                int i5 = i + 8;
                mdw0Var.c = Long.valueOf(hfm0.N(bArr, i));
                return i5;
            case 6:
            case 14:
                int i6 = i + 4;
                mdw0Var.c = Integer.valueOf(hfm0.M(bArr, i));
                return i6;
            case 7:
                int iL2 = hfm0.L(bArr, i, mdw0Var);
                mdw0Var.c = Boolean.valueOf(mdw0Var.b != 0);
                return iL2;
            case 8:
                return hfm0.O(bArr, i, mdw0Var);
            case 9:
            default:
                itt0.k("unsupported field type.");
                return 0;
            case 10:
                egw0 egw0VarA = agw0.c.a(cls);
                mew0 mew0VarZza = egw0VarA.zza();
                int iQ = hfm0.Q(mew0VarZza, egw0VarA, bArr, i, i2, mdw0Var);
                egw0VarA.h(mew0VarZza);
                mdw0Var.c = mew0VarZza;
                return iQ;
            case 11:
                return hfm0.P(bArr, i, mdw0Var);
            case 16:
                int iJ2 = hfm0.J(bArr, i, mdw0Var);
                mdw0Var.c = Integer.valueOf(tdw0.j(mdw0Var.f21617a));
                return iJ2;
            case 17:
                int iL3 = hfm0.L(bArr, i, mdw0Var);
                mdw0Var.c = Long.valueOf(tdw0.k(mdw0Var.b));
                return iL3;
        }
    }

    public static Field x(Class cls, String str) {
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
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            f140.v(sb, "Field ", str, " for ", name);
            e9d0.m(axq.n(sb, " not found. Known fields are ", string), e);
            return null;
        }
    }

    public final egw0 A(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        egw0 egw0Var = (egw0) objArr[i3];
        if (egw0Var != null) {
            return egw0Var;
        }
        egw0 egw0VarA = agw0.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = egw0VarA;
        return egw0VarA;
    }

    public final Object B(int i) {
        int i2 = i / 3;
        return this.b[i2 + i2];
    }

    public final edw0 C(int i) {
        int i2 = i / 3;
        return (edw0) this.b[i2 + i2 + 1];
    }

    public final Object D(int i, Object obj) {
        egw0 egw0VarA = A(i);
        int i2 = i(i) & 1048575;
        if (!q(i, obj)) {
            return egw0VarA.zza();
        }
        Object object = l.getObject(obj, i2);
        if (k(object)) {
            return object;
        }
        mew0 mew0VarZza = egw0VarA.zza();
        if (object != null) {
            egw0VarA.g(mew0VarZza, object);
        }
        return mew0VarZza;
    }

    public final void E(int i, Object obj, Object obj2) {
        l.putObject(obj, i(i) & 1048575, obj2);
        r(i, obj);
    }

    public final Object F(int i, int i2, Object obj) {
        egw0 egw0VarA = A(i2);
        if (!s(i, i2, obj)) {
            return egw0VarA.zza();
        }
        Object object = l.getObject(obj, i(i2) & 1048575);
        if (k(object)) {
            return object;
        }
        mew0 mew0VarZza = egw0VarA.zza();
        if (object != null) {
            egw0VarA.g(mew0VarZza, object);
        }
        return mew0VarZza;
    }

    public final void G(Object obj, int i, int i2, Object obj2) {
        l.putObject(obj, i(i2) & 1048575, obj2);
        t(i, i2, obj);
    }

    public final Object H(Object obj, int i, Object obj2, pek0 pek0Var, Object obj3) {
        edw0 edw0VarC;
        int i2 = this.f33886a[i];
        Object objH = pgw0.h(obj, i(i) & 1048575);
        if (objH == null || (edw0VarC = C(i)) == null) {
            return obj2;
        }
        mpt0 mpt0Var = ((gfw0) B(i)).f11226a;
        Iterator it = ((ifw0) objH).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!edw0VarC.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    pek0Var.getClass();
                    obj2 = pek0.o(obj3);
                }
                int iB = gfw0.b(mpt0Var, entry.getKey(), entry.getValue());
                pdw0 pdw0Var = qdw0.b;
                byte[] bArr = new byte[iB];
                boolean z = aew0.b;
                vdw0 vdw0Var = new vdw0(bArr, iB);
                try {
                    gfw0.a(vdw0Var, mpt0Var, entry.getKey(), entry.getValue());
                    if (vdw0Var.x() > 0) {
                        jf4.n("Did not write as much data as expected.");
                        return null;
                    }
                    if (vdw0Var.x() < 0) {
                        jf4.n("Wrote more data than expected.");
                        return null;
                    }
                    pdw0 pdw0Var2 = new pdw0(bArr);
                    pek0Var.getClass();
                    ((mgw0) obj2).d((i2 << 3) | 2, pdw0Var2);
                    it.remove();
                } catch (IOException e) {
                    ohq.p(e);
                    return null;
                }
            }
        }
        return obj2;
    }

    public final void I(int i, hu5 hu5Var, Object obj) {
        tdw0 tdw0Var = (tdw0) hu5Var.e;
        long j = i & 1048575;
        if ((536870912 & i) != 0) {
            hu5Var.u0(2);
            pgw0.i(obj, j, tdw0Var.M());
        } else if (!this.f) {
            pgw0.i(obj, j, hu5Var.b1());
        } else {
            hu5Var.u0(2);
            pgw0.i(obj, j, tdw0Var.L());
        }
    }

    /* JADX WARN: Code duplicated, block: B:187:0x048d  */
    /* JADX WARN: Code duplicated, block: B:219:0x057d  */
    /* JADX WARN: Code duplicated, block: B:222:0x058b  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d2  */
    @Override // a.egw0
    public final int a(jdw0 jdw0Var) {
        int i;
        int iA;
        int iB;
        int iA2;
        int iB2;
        int iA3;
        int iB3;
        int i2;
        int iA4;
        int iZ;
        int i3;
        int iB4;
        int iA5;
        int size;
        int iS;
        int iA6;
        int iA7;
        int iA8;
        int size2;
        int iA9;
        int iB5;
        int iA10;
        int iB6;
        int iA11;
        int iB7;
        int iM;
        int iA12;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int iB8 = 0;
        while (true) {
            int[] iArr = this.f33886a;
            if (i6 >= iArr.length) {
                return ((mew0) jdw0Var).zzc.c() + iB8;
            }
            int i8 = i(i6);
            int iJ = j(i8);
            int i9 = iArr[i6];
            int i10 = iArr[i6 + 2];
            int i11 = i10 & i4;
            Unsafe unsafe = l;
            if (iJ <= 17) {
                if (i11 != i5) {
                    i7 = i11 == i4 ? 0 : unsafe.getInt(jdw0Var, i11);
                    i5 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            int i12 = i8 & i4;
            if (iJ >= gew0.b.f11176a) {
                byte b = gew0.c.f11176a;
            }
            long j = i12;
            switch (iJ) {
                case 0:
                    if (p(jdw0Var, i6, i5, i7, i)) {
                        iB8 = ohs0.b(i9 << 3, 8, iB8);
                    }
                    break;
                case 1:
                    if (p(jdw0Var, i6, i5, i7, i)) {
                        iB8 = ohs0.b(i9 << 3, 4, iB8);
                    }
                    break;
                case 2:
                    if (p(jdw0Var, i6, i5, i7, i)) {
                        long j2 = unsafe.getLong(jdw0Var, j);
                        iA = aew0.a(i9 << 3);
                        iB = aew0.b(j2);
                        iZ = iB + iA;
                        iB8 += iZ;
                    }
                    break;
                case 3:
                    if (p(jdw0Var, i6, i5, i7, i)) {
                        long j3 = unsafe.getLong(jdw0Var, j);
                        iA = aew0.a(i9 << 3);
                        iB = aew0.b(j3);
                        iZ = iB + iA;
                        iB8 += iZ;
                    }
                    break;
                case 4:
                    if (p(jdw0Var, i6, i5, i7, i)) {
                        long j4 = unsafe.getInt(jdw0Var, j);
                        iA = aew0.a(i9 << 3);
                        iB = aew0.b(j4);
                        iZ = iB + iA;
                        iB8 += iZ;
                    }
                    break;
                case 5:
                    if (p(jdw0Var, i6, i5, i7, i)) {
                        iB8 = ohs0.b(i9 << 3, 8, iB8);
                    }
                    break;
                case 6:
                    if (p(jdw0Var, i6, i5, i7, i)) {
                        iB8 = ohs0.b(i9 << 3, 4, iB8);
                    }
                    break;
                case 7:
                    if (p(jdw0Var, i6, i5, i7, i)) {
                        iB8 = ohs0.b(i9 << 3, 1, iB8);
                    }
                    break;
                case 8:
                    if (p(jdw0Var, i6, i5, i7, i)) {
                        int i13 = i9 << 3;
                        Object object = unsafe.getObject(jdw0Var, j);
                        if (object instanceof qdw0) {
                            iA2 = aew0.a(i13);
                            iB2 = ((qdw0) object).e();
                        } else {
                            iA2 = aew0.a(i13);
                            iB2 = sgw0.b((String) object);
                        }
                        iB8 = ohs0.c(iB2, iB2, iA2, iB8);
                    }
                    break;
                case 9:
                    if (p(jdw0Var, i6, i5, i7, i)) {
                        Object object2 = unsafe.getObject(jdw0Var, j);
                        egw0 egw0VarA = A(i6);
                        pek0 pek0Var = fgw0.f9515a;
                        iA3 = aew0.a(i9 << 3);
                        iB3 = ((jdw0) object2).b(egw0VarA);
                        iB8 = ohs0.c(iB3, iB3, iA3, iB8);
                    }
                    break;
                case 10:
                    if (p(jdw0Var, i6, i5, i7, i)) {
                        qdw0 qdw0Var = (qdw0) unsafe.getObject(jdw0Var, j);
                        iA2 = aew0.a(i9 << 3);
                        iB2 = qdw0Var.e();
                        iB8 = ohs0.c(iB2, iB2, iA2, iB8);
                    }
                    break;
                case 11:
                    if (p(jdw0Var, i6, i5, i7, i)) {
                        i2 = unsafe.getInt(jdw0Var, j);
                        iA4 = aew0.a(i9 << 3);
                        iB8 = ohs0.b(i2, iA4, iB8);
                    }
                    break;
                case 12:
                    if (p(jdw0Var, i6, i5, i7, i)) {
                        long j5 = unsafe.getInt(jdw0Var, j);
                        iA = aew0.a(i9 << 3);
                        iB = aew0.b(j5);
                        iZ = iB + iA;
                        iB8 += iZ;
                    }
                    break;
                case 13:
                    if (p(jdw0Var, i6, i5, i7, i)) {
                        iB8 = ohs0.b(i9 << 3, 4, iB8);
                    }
                    break;
                case 14:
                    if (p(jdw0Var, i6, i5, i7, i)) {
                        iB8 = ohs0.b(i9 << 3, 8, iB8);
                    }
                    break;
                case 15:
                    if (p(jdw0Var, i6, i5, i7, i)) {
                        int i14 = unsafe.getInt(jdw0Var, j);
                        iA4 = aew0.a(i9 << 3);
                        i2 = (i14 >> 31) ^ (i14 + i14);
                        iB8 = ohs0.b(i2, iA4, iB8);
                    }
                    break;
                case 16:
                    if (p(jdw0Var, i6, i5, i7, i)) {
                        long j6 = unsafe.getLong(jdw0Var, j);
                        iA = aew0.a(i9 << 3);
                        iB = aew0.b((j6 >> 63) ^ (j6 + j6));
                        iZ = iB + iA;
                        iB8 += iZ;
                    }
                    break;
                case 17:
                    if (p(jdw0Var, i6, i5, i7, i)) {
                        jdw0 jdw0Var2 = (jdw0) unsafe.getObject(jdw0Var, j);
                        egw0 egw0VarA2 = A(i6);
                        pek0 pek0Var2 = fgw0.f9515a;
                        int iA13 = aew0.a(i9 << 3);
                        i3 = iA13 + iA13;
                        iB4 = jdw0Var2.b(egw0VarA2);
                        iZ = iB4 + i3;
                        iB8 += iZ;
                    }
                    break;
                case 18:
                    iZ = fgw0.z(i9, (List) unsafe.getObject(jdw0Var, j));
                    iB8 += iZ;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    iZ = fgw0.y(i9, (List) unsafe.getObject(jdw0Var, j));
                    iB8 += iZ;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(jdw0Var, j);
                    pek0 pek0Var3 = fgw0.f9515a;
                    if (list.size() == 0) {
                        iA5 = 0;
                    } else {
                        iA5 = (aew0.a(i9 << 3) * list.size()) + fgw0.r(list);
                    }
                    iB8 += iA5;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(jdw0Var, j);
                    pek0 pek0Var4 = fgw0.f9515a;
                    size = list2.size();
                    if (size == 0) {
                        iA7 = 0;
                    } else {
                        iS = fgw0.s(list2);
                        iA6 = aew0.a(i9 << 3);
                        iA7 = (iA6 * size) + iS;
                    }
                    iB8 += iA7;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(jdw0Var, j);
                    pek0 pek0Var5 = fgw0.f9515a;
                    size = list3.size();
                    if (size == 0) {
                        iA7 = 0;
                    } else {
                        iS = fgw0.v(list3);
                        iA6 = aew0.a(i9 << 3);
                        iA7 = (iA6 * size) + iS;
                    }
                    iB8 += iA7;
                    break;
                case 23:
                    iZ = fgw0.z(i9, (List) unsafe.getObject(jdw0Var, j));
                    iB8 += iZ;
                    break;
                case 24:
                    iZ = fgw0.y(i9, (List) unsafe.getObject(jdw0Var, j));
                    iB8 += iZ;
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    List list4 = (List) unsafe.getObject(jdw0Var, j);
                    pek0 pek0Var6 = fgw0.f9515a;
                    int size3 = list4.size();
                    if (size3 == 0) {
                        iA5 = 0;
                    } else {
                        iA5 = (aew0.a(i9 << 3) + 1) * size3;
                    }
                    iB8 += iA5;
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    List list5 = (List) unsafe.getObject(jdw0Var, j);
                    pek0 pek0Var7 = fgw0.f9515a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iA7 = 0;
                    } else {
                        iA7 = aew0.a(i9 << 3) * size4;
                        for (int i15 = 0; i15 < size4; i15++) {
                            Object obj = list5.get(i15);
                            int iE = obj instanceof qdw0 ? ((qdw0) obj).e() : sgw0.b((String) obj);
                            iA7 = ohs0.b(iE, iE, iA7);
                        }
                    }
                    iB8 += iA7;
                    break;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    List list6 = (List) unsafe.getObject(jdw0Var, j);
                    egw0 egw0VarA3 = A(i6);
                    pek0 pek0Var8 = fgw0.f9515a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        iA8 = 0;
                    } else {
                        iA8 = aew0.a(i9 << 3) * size5;
                        for (int i16 = 0; i16 < size5; i16++) {
                            int iB9 = ((jdw0) list6.get(i16)).b(egw0VarA3);
                            iA8 = ohs0.b(iB9, iB9, iA8);
                        }
                    }
                    iB8 += iA8;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    List list7 = (List) unsafe.getObject(jdw0Var, j);
                    pek0 pek0Var9 = fgw0.f9515a;
                    int size6 = list7.size();
                    if (size6 == 0) {
                        iA7 = 0;
                    } else {
                        iA7 = aew0.a(i9 << 3) * size6;
                        for (int i17 = 0; i17 < list7.size(); i17++) {
                            int iE2 = ((qdw0) list7.get(i17)).e();
                            iA7 = ohs0.b(iE2, iE2, iA7);
                        }
                    }
                    iB8 += iA7;
                    break;
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                    List list8 = (List) unsafe.getObject(jdw0Var, j);
                    pek0 pek0Var10 = fgw0.f9515a;
                    size = list8.size();
                    if (size == 0) {
                        iA7 = 0;
                    } else {
                        iS = fgw0.w(list8);
                        iA6 = aew0.a(i9 << 3);
                        iA7 = (iA6 * size) + iS;
                    }
                    iB8 += iA7;
                    break;
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                    List list9 = (List) unsafe.getObject(jdw0Var, j);
                    pek0 pek0Var11 = fgw0.f9515a;
                    size = list9.size();
                    if (size == 0) {
                        iA7 = 0;
                    } else {
                        iS = fgw0.u(list9);
                        iA6 = aew0.a(i9 << 3);
                        iA7 = (iA6 * size) + iS;
                    }
                    iB8 += iA7;
                    break;
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                    iZ = fgw0.y(i9, (List) unsafe.getObject(jdw0Var, j));
                    iB8 += iZ;
                    break;
                case 32:
                    iZ = fgw0.z(i9, (List) unsafe.getObject(jdw0Var, j));
                    iB8 += iZ;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(jdw0Var, j);
                    pek0 pek0Var12 = fgw0.f9515a;
                    size = list10.size();
                    if (size == 0) {
                        iA7 = 0;
                    } else {
                        iS = fgw0.x(list10);
                        iA6 = aew0.a(i9 << 3);
                        iA7 = (iA6 * size) + iS;
                    }
                    iB8 += iA7;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(jdw0Var, j);
                    pek0 pek0Var13 = fgw0.f9515a;
                    size = list11.size();
                    if (size == 0) {
                        iA7 = 0;
                    } else {
                        iS = fgw0.t(list11);
                        iA6 = aew0.a(i9 << 3);
                        iA7 = (iA6 * size) + iS;
                    }
                    iB8 += iA7;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(jdw0Var, j);
                    pek0 pek0Var14 = fgw0.f9515a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iA9 = aew0.a(i9 << 3);
                        iB8 = ohs0.c(size2, iA9, size2, iB8);
                    }
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(jdw0Var, j);
                    pek0 pek0Var15 = fgw0.f9515a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iA9 = aew0.a(i9 << 3);
                        iB8 = ohs0.c(size2, iA9, size2, iB8);
                    }
                    break;
                case 37:
                    size2 = fgw0.r((List) unsafe.getObject(jdw0Var, j));
                    if (size2 > 0) {
                        iA9 = aew0.a(i9 << 3);
                        iB8 = ohs0.c(size2, iA9, size2, iB8);
                    }
                    break;
                case 38:
                    size2 = fgw0.s((List) unsafe.getObject(jdw0Var, j));
                    if (size2 > 0) {
                        iA9 = aew0.a(i9 << 3);
                        iB8 = ohs0.c(size2, iA9, size2, iB8);
                    }
                    break;
                case 39:
                    size2 = fgw0.v((List) unsafe.getObject(jdw0Var, j));
                    if (size2 > 0) {
                        iA9 = aew0.a(i9 << 3);
                        iB8 = ohs0.c(size2, iA9, size2, iB8);
                    }
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(jdw0Var, j);
                    pek0 pek0Var16 = fgw0.f9515a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iA9 = aew0.a(i9 << 3);
                        iB8 = ohs0.c(size2, iA9, size2, iB8);
                    }
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(jdw0Var, j);
                    pek0 pek0Var17 = fgw0.f9515a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iA9 = aew0.a(i9 << 3);
                        iB8 = ohs0.c(size2, iA9, size2, iB8);
                    }
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(jdw0Var, j);
                    pek0 pek0Var18 = fgw0.f9515a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iA9 = aew0.a(i9 << 3);
                        iB8 = ohs0.c(size2, iA9, size2, iB8);
                    }
                    break;
                case 43:
                    size2 = fgw0.w((List) unsafe.getObject(jdw0Var, j));
                    if (size2 > 0) {
                        iA9 = aew0.a(i9 << 3);
                        iB8 = ohs0.c(size2, iA9, size2, iB8);
                    }
                    break;
                case 44:
                    size2 = fgw0.u((List) unsafe.getObject(jdw0Var, j));
                    if (size2 > 0) {
                        iA9 = aew0.a(i9 << 3);
                        iB8 = ohs0.c(size2, iA9, size2, iB8);
                    }
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(jdw0Var, j);
                    pek0 pek0Var19 = fgw0.f9515a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iA9 = aew0.a(i9 << 3);
                        iB8 = ohs0.c(size2, iA9, size2, iB8);
                    }
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(jdw0Var, j);
                    pek0 pek0Var20 = fgw0.f9515a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iA9 = aew0.a(i9 << 3);
                        iB8 = ohs0.c(size2, iA9, size2, iB8);
                    }
                    break;
                case 47:
                    size2 = fgw0.x((List) unsafe.getObject(jdw0Var, j));
                    if (size2 > 0) {
                        iA9 = aew0.a(i9 << 3);
                        iB8 = ohs0.c(size2, iA9, size2, iB8);
                    }
                    break;
                case 48:
                    size2 = fgw0.t((List) unsafe.getObject(jdw0Var, j));
                    if (size2 > 0) {
                        iA9 = aew0.a(i9 << 3);
                        iB8 = ohs0.c(size2, iA9, size2, iB8);
                    }
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(jdw0Var, j);
                    egw0 egw0VarA4 = A(i6);
                    pek0 pek0Var21 = fgw0.f9515a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        iB5 = 0;
                    } else {
                        iB5 = 0;
                        for (int i18 = 0; i18 < size7; i18++) {
                            jdw0 jdw0Var3 = (jdw0) list19.get(i18);
                            int iA14 = aew0.a(i9 << 3);
                            iB5 += jdw0Var3.b(egw0VarA4) + iA14 + iA14;
                        }
                    }
                    iB8 += iB5;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    ifw0 ifw0Var = (ifw0) unsafe.getObject(jdw0Var, j);
                    gfw0 gfw0Var = (gfw0) B(i6);
                    if (ifw0Var.isEmpty()) {
                        iA7 = 0;
                    } else {
                        iA7 = 0;
                        for (Map.Entry entry : ifw0Var.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            mpt0 mpt0Var = gfw0Var.f11226a;
                            int iA15 = aew0.a(i9 << 3);
                            int iB10 = gfw0.b(mpt0Var, key, value);
                            iA7 = ohs0.c(iB10, iB10, iA15, iA7);
                        }
                    }
                    iB8 += iA7;
                    break;
                case 51:
                    if (s(i9, i6, jdw0Var)) {
                        iB8 = ohs0.b(i9 << 3, 8, iB8);
                    }
                    break;
                case 52:
                    if (s(i9, i6, jdw0Var)) {
                        iB8 = ohs0.b(i9 << 3, 4, iB8);
                    }
                    break;
                case 53:
                    if (s(i9, i6, jdw0Var)) {
                        long jN = n(jdw0Var, j);
                        iA10 = aew0.a(i9 << 3);
                        iB6 = aew0.b(jN);
                        iB8 += iB6 + iA10;
                    }
                    break;
                case 54:
                    if (s(i9, i6, jdw0Var)) {
                        long jN2 = n(jdw0Var, j);
                        iA10 = aew0.a(i9 << 3);
                        iB6 = aew0.b(jN2);
                        iB8 += iB6 + iA10;
                    }
                    break;
                case 55:
                    if (s(i9, i6, jdw0Var)) {
                        long jM = m(jdw0Var, j);
                        iA10 = aew0.a(i9 << 3);
                        iB6 = aew0.b(jM);
                        iB8 += iB6 + iA10;
                    }
                    break;
                case 56:
                    if (s(i9, i6, jdw0Var)) {
                        iB8 = ohs0.b(i9 << 3, 8, iB8);
                    }
                    break;
                case 57:
                    if (s(i9, i6, jdw0Var)) {
                        iB8 = ohs0.b(i9 << 3, 4, iB8);
                    }
                    break;
                case 58:
                    if (s(i9, i6, jdw0Var)) {
                        iB8 = ohs0.b(i9 << 3, 1, iB8);
                    }
                    break;
                case 59:
                    if (s(i9, i6, jdw0Var)) {
                        int i19 = i9 << 3;
                        Object object3 = unsafe.getObject(jdw0Var, j);
                        if (object3 instanceof qdw0) {
                            iA11 = aew0.a(i19);
                            iB7 = ((qdw0) object3).e();
                        } else {
                            iA11 = aew0.a(i19);
                            iB7 = sgw0.b((String) object3);
                        }
                        iB8 = ohs0.c(iB7, iB7, iA11, iB8);
                    }
                    break;
                case 60:
                    if (s(i9, i6, jdw0Var)) {
                        Object object4 = unsafe.getObject(jdw0Var, j);
                        egw0 egw0VarA5 = A(i6);
                        pek0 pek0Var22 = fgw0.f9515a;
                        iA3 = aew0.a(i9 << 3);
                        iB3 = ((jdw0) object4).b(egw0VarA5);
                        iB8 = ohs0.c(iB3, iB3, iA3, iB8);
                    }
                    break;
                case 61:
                    if (s(i9, i6, jdw0Var)) {
                        qdw0 qdw0Var2 = (qdw0) unsafe.getObject(jdw0Var, j);
                        iA11 = aew0.a(i9 << 3);
                        iB7 = qdw0Var2.e();
                        iB8 = ohs0.c(iB7, iB7, iA11, iB8);
                    }
                    break;
                case 62:
                    if (s(i9, i6, jdw0Var)) {
                        iM = m(jdw0Var, j);
                        iA12 = aew0.a(i9 << 3);
                        iB8 = ohs0.b(iM, iA12, iB8);
                    }
                    break;
                case 63:
                    if (s(i9, i6, jdw0Var)) {
                        long jM2 = m(jdw0Var, j);
                        iA10 = aew0.a(i9 << 3);
                        iB6 = aew0.b(jM2);
                        iB8 += iB6 + iA10;
                    }
                    break;
                case 64:
                    if (s(i9, i6, jdw0Var)) {
                        iB8 = ohs0.b(i9 << 3, 4, iB8);
                    }
                    break;
                case 65:
                    if (s(i9, i6, jdw0Var)) {
                        iB8 = ohs0.b(i9 << 3, 8, iB8);
                    }
                    break;
                case 66:
                    if (s(i9, i6, jdw0Var)) {
                        int iM2 = m(jdw0Var, j);
                        iA12 = aew0.a(i9 << 3);
                        iM = (iM2 >> 31) ^ (iM2 + iM2);
                        iB8 = ohs0.b(iM, iA12, iB8);
                    }
                    break;
                case 67:
                    if (s(i9, i6, jdw0Var)) {
                        long jN3 = n(jdw0Var, j);
                        iA10 = aew0.a(i9 << 3);
                        iB6 = aew0.b((jN3 >> 63) ^ (jN3 + jN3));
                        iB8 += iB6 + iA10;
                    }
                    break;
                case 68:
                    if (s(i9, i6, jdw0Var)) {
                        jdw0 jdw0Var4 = (jdw0) unsafe.getObject(jdw0Var, j);
                        egw0 egw0VarA6 = A(i6);
                        pek0 pek0Var23 = fgw0.f9515a;
                        int iA16 = aew0.a(i9 << 3);
                        i3 = iA16 + iA16;
                        iB4 = jdw0Var4.b(egw0VarA6);
                        iZ = iB4 + i3;
                        iB8 += iZ;
                    }
                    break;
            }
            i6 += 3;
            i4 = 1048575;
        }
    }

    @Override // a.egw0
    public final void b(Object obj, byte[] bArr, int i, int i2, mdw0 mdw0Var) {
        w(obj, bArr, i, i2, 0, mdw0Var);
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x01d1 A[SYNTHETIC] */
    @Override // a.egw0
    public final boolean c(mew0 mew0Var, mew0 mew0Var2) {
        boolean zA;
        int i = 0;
        while (true) {
            int[] iArr = this.f33886a;
            if (i < iArr.length) {
                int i2 = i(i);
                int iJ = j(i2);
                if (iJ <= 50 || iJ >= 69) {
                    long j = i2 & 1048575;
                    switch (iJ) {
                        case 0:
                            if (o(mew0Var, mew0Var2, i)) {
                                gft0 gft0Var = pgw0.c;
                                if (Double.doubleToLongBits(gft0Var.v(mew0Var, j)) != Double.doubleToLongBits(gft0Var.v(mew0Var2, j))) {
                                }
                            }
                            break;
                        case 1:
                            if (o(mew0Var, mew0Var2, i)) {
                                gft0 gft0Var2 = pgw0.c;
                                if (Float.floatToIntBits(gft0Var2.t(mew0Var, j)) != Float.floatToIntBits(gft0Var2.t(mew0Var2, j))) {
                                }
                            }
                            break;
                        case 2:
                            if (!o(mew0Var, mew0Var2, i) || pgw0.f(mew0Var, j) != pgw0.f(mew0Var2, j)) {
                            }
                            break;
                        case 3:
                            if (!o(mew0Var, mew0Var2, i) || pgw0.f(mew0Var, j) != pgw0.f(mew0Var2, j)) {
                            }
                            break;
                        case 4:
                            if (!o(mew0Var, mew0Var2, i) || pgw0.d(mew0Var, j) != pgw0.d(mew0Var2, j)) {
                            }
                            break;
                        case 5:
                            if (!o(mew0Var, mew0Var2, i) || pgw0.f(mew0Var, j) != pgw0.f(mew0Var2, j)) {
                            }
                            break;
                        case 6:
                            if (!o(mew0Var, mew0Var2, i) || pgw0.d(mew0Var, j) != pgw0.d(mew0Var2, j)) {
                            }
                            break;
                        case 7:
                            if (o(mew0Var, mew0Var2, i)) {
                                gft0 gft0Var3 = pgw0.c;
                                if (gft0Var3.q(mew0Var, j) != gft0Var3.q(mew0Var2, j)) {
                                }
                            }
                            break;
                        case 8:
                            if (!o(mew0Var, mew0Var2, i) || !fgw0.a(pgw0.h(mew0Var, j), pgw0.h(mew0Var2, j))) {
                            }
                            break;
                        case 9:
                            if (!o(mew0Var, mew0Var2, i) || !fgw0.a(pgw0.h(mew0Var, j), pgw0.h(mew0Var2, j))) {
                            }
                            break;
                        case 10:
                            if (!o(mew0Var, mew0Var2, i) || !fgw0.a(pgw0.h(mew0Var, j), pgw0.h(mew0Var2, j))) {
                            }
                            break;
                        case 11:
                            if (!o(mew0Var, mew0Var2, i) || pgw0.d(mew0Var, j) != pgw0.d(mew0Var2, j)) {
                            }
                            break;
                        case 12:
                            if (!o(mew0Var, mew0Var2, i) || pgw0.d(mew0Var, j) != pgw0.d(mew0Var2, j)) {
                            }
                            break;
                        case 13:
                            if (!o(mew0Var, mew0Var2, i) || pgw0.d(mew0Var, j) != pgw0.d(mew0Var2, j)) {
                            }
                            break;
                        case 14:
                            if (!o(mew0Var, mew0Var2, i) || pgw0.f(mew0Var, j) != pgw0.f(mew0Var2, j)) {
                            }
                            break;
                        case 15:
                            if (!o(mew0Var, mew0Var2, i) || pgw0.d(mew0Var, j) != pgw0.d(mew0Var2, j)) {
                            }
                            break;
                        case 16:
                            if (!o(mew0Var, mew0Var2, i) || pgw0.f(mew0Var, j) != pgw0.f(mew0Var2, j)) {
                            }
                            break;
                        case 17:
                            if (!o(mew0Var, mew0Var2, i) || !fgw0.a(pgw0.h(mew0Var, j), pgw0.h(mew0Var2, j))) {
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
                            zA = fgw0.a(pgw0.h(mew0Var, j), pgw0.h(mew0Var2, j));
                            if (zA) {
                            }
                            break;
                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                            zA = fgw0.a(pgw0.h(mew0Var, j), pgw0.h(mew0Var2, j));
                            if (zA) {
                            }
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
                            if (pgw0.d(mew0Var, j2) == pgw0.d(mew0Var2, j2) && fgw0.a(pgw0.h(mew0Var, j), pgw0.h(mew0Var2, j))) {
                            }
                            break;
                        default:
                            continue;
                    }
                }
                i += 3;
            } else {
                int i3 = this.i;
                while (true) {
                    int[] iArr2 = this.g;
                    if (i3 < iArr2.length) {
                        int i4 = iArr2[i3];
                        long j3 = iArr[i4 + 2] & 1048575;
                        if (pgw0.d(mew0Var, j3) != pgw0.d(mew0Var2, j3)) {
                            return false;
                        }
                        if (!s(0, i4, mew0Var)) {
                            long jI = i(i4) & 1048575;
                            if (!fgw0.a(pgw0.h(mew0Var, jI), pgw0.h(mew0Var2, jI))) {
                            }
                        }
                        i3++;
                    } else if (mew0Var.zzc.equals(mew0Var2.zzc)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // a.egw0
    public final int d(mew0 mew0Var) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int i3;
        int i4;
        int iHashCode = 0;
        for (int i5 = 0; i5 < this.f33886a.length; i5 += 3) {
            int i6 = i(i5);
            int iJ = j(i6);
            if (iJ <= 50 || iJ >= 69) {
                long j = i6 & 1048575;
                int iHashCode2 = 37;
                switch (iJ) {
                    case 0:
                        i = iHashCode * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(pgw0.c.v(mew0Var, j));
                        byte[] bArr = vew0.f37305a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 1:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(pgw0.c.t(mew0Var, j));
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 2:
                        i = iHashCode * 53;
                        jDoubleToLongBits = pgw0.f(mew0Var, j);
                        byte[] bArr2 = vew0.f37305a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 3:
                        i = iHashCode * 53;
                        jDoubleToLongBits = pgw0.f(mew0Var, j);
                        byte[] bArr3 = vew0.f37305a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 4:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = pgw0.d(mew0Var, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 5:
                        i = iHashCode * 53;
                        jDoubleToLongBits = pgw0.f(mew0Var, j);
                        byte[] bArr4 = vew0.f37305a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 6:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = pgw0.d(mew0Var, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 7:
                        i = iHashCode * 53;
                        boolean zQ = pgw0.c.q(mew0Var, j);
                        byte[] bArr5 = vew0.f37305a;
                        i3 = zQ ? 1231 : 1237;
                        iHashCode = i + i3;
                        break;
                    case 8:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = ((String) pgw0.h(mew0Var, j)).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 9:
                        i4 = iHashCode * 53;
                        Object objH = pgw0.h(mew0Var, j);
                        if (objH != null) {
                            iHashCode2 = objH.hashCode();
                        }
                        iHashCode = i4 + iHashCode2;
                        break;
                    case 10:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = pgw0.h(mew0Var, j).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 11:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = pgw0.d(mew0Var, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 12:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = pgw0.d(mew0Var, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 13:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = pgw0.d(mew0Var, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 14:
                        i = iHashCode * 53;
                        jDoubleToLongBits = pgw0.f(mew0Var, j);
                        byte[] bArr6 = vew0.f37305a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 15:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = pgw0.d(mew0Var, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 16:
                        i = iHashCode * 53;
                        jDoubleToLongBits = pgw0.f(mew0Var, j);
                        byte[] bArr7 = vew0.f37305a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 17:
                        i4 = iHashCode * 53;
                        Object objH2 = pgw0.h(mew0Var, j);
                        if (objH2 != null) {
                            iHashCode2 = objH2.hashCode();
                        }
                        iHashCode = i4 + iHashCode2;
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
                        i2 = iHashCode * 53;
                        iFloatToIntBits = pgw0.h(mew0Var, j).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = pgw0.h(mew0Var, j).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                }
            }
        }
        int i7 = this.i;
        while (true) {
            int[] iArr = this.g;
            if (i7 >= iArr.length) {
                return mew0Var.zzc.hashCode() + (iHashCode * 53);
            }
            int i8 = iArr[i7];
            if (!s(0, i8, mew0Var)) {
                iHashCode = pgw0.h(mew0Var, i(i8) & 1048575).hashCode() + (iHashCode * 53);
            }
            i7++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:207:0x07c0 A[LOOP:3: B:206:0x07be->B:207:0x07c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:209:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:211:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:217:0x07ed A[LOOP:1: B:216:0x07eb->B:217:0x07ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:219:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:222:0x07ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:0x07bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:? A[RETURN, SYNTHETIC] */
    @Override // a.egw0
    public final void e(Object obj, hu5 hu5Var, bew0 bew0Var) throws Throwable {
        Object obj2;
        Object objH;
        Object objH2;
        tfw0 tfw0Var;
        pek0 pek0Var;
        Object obj3;
        tfw0 tfw0Var2;
        Object objO;
        Object obj4;
        tfw0 tfw0Var3 = this;
        tdw0 tdw0Var = (tdw0) hu5Var.e;
        int[] iArr = tfw0Var3.g;
        int i = tfw0Var3.i;
        int i2 = tfw0Var3.h;
        bew0Var.getClass();
        l(obj);
        pek0 pek0Var2 = tfw0Var3.j;
        Object objO2 = null;
        while (true) {
            try {
                int iF0 = hu5Var.F0();
                int iU = (iF0 < tfw0Var3.c || iF0 > tfw0Var3.d) ? -1 : tfw0Var3.u(iF0, 0);
                if (iU >= 0) {
                    int i3 = tfw0Var3.i(iU);
                    try {
                        try {
                            switch (j(i3)) {
                                case 0:
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    tfw0 tfw0Var4 = tfw0Var3;
                                    int i4 = i3 & 1048575;
                                    try {
                                        hu5Var.u0(1);
                                        tfw0Var = tfw0Var4;
                                        pgw0.c.w(obj, i4, tdw0Var.v());
                                        tfw0Var.r(iU, obj);
                                        tfw0Var3 = tfw0Var;
                                        pek0Var2 = pek0Var;
                                        objO2 = obj2;
                                    } catch (Throwable th) {
                                        th = th;
                                        pek0Var2 = pek0Var;
                                        objO2 = obj2;
                                        objH = objO2;
                                        while (i2 < i) {
                                            objH = H(obj, iArr[i2], objH, pek0Var2, obj);
                                            i2++;
                                        }
                                        if (objH != null) {
                                            pek0Var2.getClass();
                                            ((mew0) obj).zzc = (mgw0) objH;
                                        }
                                        throw th;
                                    }
                                    break;
                                case 1:
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    tfw0Var2 = tfw0Var3;
                                    hu5Var.u0(5);
                                    pgw0.c.u(obj, i3 & 1048575, tdw0Var.y());
                                    tfw0Var2.r(iU, obj);
                                    tfw0Var = tfw0Var2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 2:
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    tfw0Var2 = tfw0Var3;
                                    hu5Var.u0(0);
                                    pgw0.g(obj, i3 & 1048575, tdw0Var.D());
                                    tfw0Var2.r(iU, obj);
                                    tfw0Var = tfw0Var2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 3:
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    tfw0Var2 = tfw0Var3;
                                    hu5Var.u0(0);
                                    pgw0.g(obj, i3 & 1048575, tdw0Var.B());
                                    tfw0Var2.r(iU, obj);
                                    tfw0Var = tfw0Var2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 4:
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    tfw0Var2 = tfw0Var3;
                                    hu5Var.u0(0);
                                    pgw0.e(obj, tdw0Var.E(), i3 & 1048575);
                                    tfw0Var2.r(iU, obj);
                                    tfw0Var = tfw0Var2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 5:
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    tfw0Var2 = tfw0Var3;
                                    hu5Var.u0(1);
                                    pgw0.g(obj, i3 & 1048575, tdw0Var.G());
                                    tfw0Var2.r(iU, obj);
                                    tfw0Var = tfw0Var2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 6:
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    tfw0Var2 = tfw0Var3;
                                    hu5Var.u0(5);
                                    pgw0.e(obj, tdw0Var.H(), i3 & 1048575);
                                    tfw0Var2.r(iU, obj);
                                    tfw0Var = tfw0Var2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 7:
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    tfw0Var2 = tfw0Var3;
                                    hu5Var.u0(0);
                                    pgw0.c.r(obj, i3 & 1048575, tdw0Var.J());
                                    tfw0Var2.r(iU, obj);
                                    tfw0Var = tfw0Var2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 8:
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    tfw0Var2 = tfw0Var3;
                                    tfw0Var2.I(i3, hu5Var, obj);
                                    tfw0Var2.r(iU, obj);
                                    tfw0Var = tfw0Var2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 9:
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    tfw0Var2 = tfw0Var3;
                                    jdw0 jdw0Var = (jdw0) tfw0Var2.D(iU, obj);
                                    egw0 egw0VarA = tfw0Var2.A(iU);
                                    hu5Var.u0(2);
                                    hu5Var.v0(jdw0Var, egw0VarA, bew0Var);
                                    tfw0Var2.E(iU, obj, jdw0Var);
                                    tfw0Var = tfw0Var2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 10:
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    tfw0Var2 = tfw0Var3;
                                    pgw0.i(obj, i3 & 1048575, hu5Var.b1());
                                    tfw0Var2.r(iU, obj);
                                    tfw0Var = tfw0Var2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 11:
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    tfw0Var2 = tfw0Var3;
                                    hu5Var.u0(0);
                                    pgw0.e(obj, tdw0Var.R(), i3 & 1048575);
                                    tfw0Var2.r(iU, obj);
                                    tfw0Var = tfw0Var2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 12:
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    tfw0Var2 = tfw0Var3;
                                    hu5Var.u0(0);
                                    int iT = tdw0Var.T();
                                    edw0 edw0VarC = tfw0Var2.C(iU);
                                    if (edw0VarC != null && !edw0VarC.a(iT)) {
                                        pek0 pek0Var3 = fgw0.f9515a;
                                        if (obj2 == null) {
                                            pek0Var.getClass();
                                            objO = pek0.o(obj);
                                        } else {
                                            objO = obj2;
                                        }
                                        pek0Var.getClass();
                                        ((mgw0) objO).d(iF0 << 3, Long.valueOf(iT));
                                        tfw0Var3 = tfw0Var2;
                                        objO2 = objO;
                                        pek0Var2 = pek0Var;
                                    }
                                    pgw0.e(obj, iT, i3 & 1048575);
                                    tfw0Var2.r(iU, obj);
                                    tfw0Var = tfw0Var2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 13:
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    tfw0Var2 = tfw0Var3;
                                    hu5Var.u0(5);
                                    pgw0.e(obj, tdw0Var.V(), i3 & 1048575);
                                    tfw0Var2.r(iU, obj);
                                    tfw0Var = tfw0Var2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 14:
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    tfw0Var2 = tfw0Var3;
                                    hu5Var.u0(1);
                                    pgw0.g(obj, i3 & 1048575, tdw0Var.X());
                                    tfw0Var2.r(iU, obj);
                                    tfw0Var = tfw0Var2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 15:
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    tfw0Var2 = tfw0Var3;
                                    hu5Var.u0(0);
                                    pgw0.e(obj, tdw0Var.Z(), i3 & 1048575);
                                    tfw0Var2.r(iU, obj);
                                    tfw0Var = tfw0Var2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 16:
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    tfw0Var2 = tfw0Var3;
                                    hu5Var.u0(0);
                                    pgw0.g(obj, i3 & 1048575, tdw0Var.a0());
                                    tfw0Var2.r(iU, obj);
                                    tfw0Var = tfw0Var2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 17:
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    tfw0Var2 = tfw0Var3;
                                    obj3 = obj;
                                    try {
                                        jdw0 jdw0Var2 = (jdw0) tfw0Var2.D(iU, obj3);
                                        egw0 egw0VarA2 = tfw0Var2.A(iU);
                                        hu5Var.u0(3);
                                        hu5Var.w0(jdw0Var2, egw0VarA2, bew0Var);
                                        tfw0Var2.E(iU, obj3, jdw0Var2);
                                        tfw0Var = tfw0Var2;
                                        tfw0Var3 = tfw0Var;
                                        pek0Var2 = pek0Var;
                                        objO2 = obj2;
                                    } catch (yew0 unused) {
                                        tfw0Var = tfw0Var2;
                                        objO2 = obj2;
                                        if (objO2 == null) {
                                            try {
                                                pek0Var.getClass();
                                                objO2 = pek0.o(obj3);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                pek0Var2 = pek0Var;
                                                objH = objO2;
                                                while (i2 < i) {
                                                    objH = H(obj, iArr[i2], objH, pek0Var2, obj);
                                                    i2++;
                                                }
                                                if (objH != null) {
                                                    pek0Var2.getClass();
                                                    ((mew0) obj).zzc = (mgw0) objH;
                                                }
                                                throw th;
                                            }
                                        }
                                        pek0Var.getClass();
                                        if (!pek0.p(0, hu5Var, objO2)) {
                                            objH2 = objO2;
                                            while (i2 < i) {
                                                objH2 = tfw0Var.H(obj3, iArr[i2], objH2, pek0Var, obj);
                                                i2++;
                                                tfw0Var = this;
                                                obj3 = obj;
                                            }
                                            pek0Var2 = pek0Var;
                                            if (objH2 != null) {
                                                pek0Var2.getClass();
                                                ((mew0) obj).zzc = (mgw0) objH2;
                                            }
                                        }
                                        tfw0Var3 = this;
                                        pek0Var2 = pek0Var;
                                    }
                                    break;
                                case 18:
                                    tfw0Var = tfw0Var3;
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    hu5Var.d1(uxs0.e(obj, i3 & 1048575));
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                    tfw0Var = tfw0Var3;
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    hu5Var.e1(uxs0.e(obj, i3 & 1048575));
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 20:
                                    tfw0Var = tfw0Var3;
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    hu5Var.e0(uxs0.e(obj, i3 & 1048575));
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 21:
                                    tfw0Var = tfw0Var3;
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    hu5Var.f1(uxs0.e(obj, i3 & 1048575));
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 22:
                                    tfw0Var = tfw0Var3;
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    hu5Var.f0(uxs0.e(obj, i3 & 1048575));
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 23:
                                    tfw0Var = tfw0Var3;
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    hu5Var.g0(uxs0.e(obj, i3 & 1048575));
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 24:
                                    tfw0Var = tfw0Var3;
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    hu5Var.h0(uxs0.e(obj, i3 & 1048575));
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                                    tfw0Var = tfw0Var3;
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    hu5Var.i0(uxs0.e(obj, i3 & 1048575));
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                                    tfw0Var = tfw0Var3;
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    if ((536870912 & i3) != 0) {
                                        hu5Var.j0(uxs0.e(obj, i3 & 1048575), true);
                                    } else {
                                        hu5Var.j0(uxs0.e(obj, i3 & 1048575), false);
                                    }
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                                    tfw0Var = tfw0Var3;
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    hu5Var.k0(uxs0.e(obj, i3 & 1048575), tfw0Var.A(iU), bew0Var);
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                                    tfw0Var = tfw0Var3;
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    hu5Var.m0(uxs0.e(obj, i3 & 1048575));
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                                    tfw0Var = tfw0Var3;
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    obj3 = obj;
                                    try {
                                        try {
                                            hu5Var.n0(uxs0.e(obj3, i3 & 1048575));
                                            tfw0Var3 = tfw0Var;
                                            pek0Var2 = pek0Var;
                                            objO2 = obj2;
                                        } catch (yew0 unused2) {
                                            objO2 = obj2;
                                            if (objO2 == null) {
                                                pek0Var.getClass();
                                                objO2 = pek0.o(obj3);
                                            }
                                            pek0Var.getClass();
                                            if (!pek0.p(0, hu5Var, objO2)) {
                                                objH2 = objO2;
                                                while (i2 < i) {
                                                    objH2 = tfw0Var.H(obj3, iArr[i2], objH2, pek0Var, obj);
                                                    i2++;
                                                    tfw0Var = this;
                                                    obj3 = obj;
                                                }
                                                pek0Var2 = pek0Var;
                                                if (objH2 != null) {
                                                    pek0Var2.getClass();
                                                    ((mew0) obj).zzc = (mgw0) objH2;
                                                }
                                            }
                                            tfw0Var3 = this;
                                            pek0Var2 = pek0Var;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        pek0Var2 = pek0Var;
                                        objO2 = obj2;
                                        objH = objO2;
                                        while (i2 < i) {
                                            objH = H(obj, iArr[i2], objH, pek0Var2, obj);
                                            i2++;
                                        }
                                        if (objH != null) {
                                            pek0Var2.getClass();
                                            ((mew0) obj).zzc = (mgw0) objH;
                                        }
                                        throw th;
                                    }
                                    break;
                                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                                    tfw0Var = tfw0Var3;
                                    pek0Var = pek0Var2;
                                    obj3 = obj;
                                    Object obj5 = objO2;
                                    try {
                                        xew0 xew0VarE = uxs0.e(obj3, i3 & 1048575);
                                        hu5Var.o0(xew0VarE);
                                        try {
                                            objO2 = fgw0.c(obj3, iF0, xew0VarE, tfw0Var.C(iU), obj5, pek0Var);
                                            pek0Var = pek0Var;
                                            tfw0Var3 = tfw0Var;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            obj2 = obj5;
                                            pek0Var = pek0Var;
                                            pek0Var2 = pek0Var;
                                            objO2 = obj2;
                                            objH = objO2;
                                            while (i2 < i) {
                                                objH = H(obj, iArr[i2], objH, pek0Var2, obj);
                                                i2++;
                                            }
                                            if (objH != null) {
                                                pek0Var2.getClass();
                                                ((mew0) obj).zzc = (mgw0) objH;
                                            }
                                            throw th;
                                        }
                                    } catch (yew0 unused3) {
                                        obj2 = obj5;
                                        objO2 = obj2;
                                        if (objO2 == null) {
                                            pek0Var.getClass();
                                            objO2 = pek0.o(obj3);
                                        }
                                        pek0Var.getClass();
                                        if (!pek0.p(0, hu5Var, objO2)) {
                                            objH2 = objO2;
                                            while (i2 < i) {
                                                objH2 = tfw0Var.H(obj3, iArr[i2], objH2, pek0Var, obj);
                                                i2++;
                                                tfw0Var = this;
                                                obj3 = obj;
                                            }
                                            pek0Var2 = pek0Var;
                                            if (objH2 != null) {
                                                pek0Var2.getClass();
                                                ((mew0) obj).zzc = (mgw0) objH2;
                                            }
                                        }
                                        tfw0Var3 = this;
                                        break;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        obj2 = obj5;
                                    }
                                    pek0Var2 = pek0Var;
                                    break;
                                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                                    tfw0Var = tfw0Var3;
                                    hu5Var.p0(uxs0.e(obj, i3 & 1048575));
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 32:
                                    tfw0Var = tfw0Var3;
                                    hu5Var.q0(uxs0.e(obj, i3 & 1048575));
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 33:
                                    tfw0Var = tfw0Var3;
                                    hu5Var.r0(uxs0.e(obj, i3 & 1048575));
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 34:
                                    tfw0Var = tfw0Var3;
                                    hu5Var.s0(uxs0.e(obj, i3 & 1048575));
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 35:
                                    tfw0Var = tfw0Var3;
                                    hu5Var.d1(uxs0.e(obj, i3 & 1048575));
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 36:
                                    tfw0Var = tfw0Var3;
                                    hu5Var.e1(uxs0.e(obj, i3 & 1048575));
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 37:
                                    tfw0Var = tfw0Var3;
                                    hu5Var.e0(uxs0.e(obj, i3 & 1048575));
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 38:
                                    tfw0Var = tfw0Var3;
                                    hu5Var.f1(uxs0.e(obj, i3 & 1048575));
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 39:
                                    tfw0Var = tfw0Var3;
                                    hu5Var.f0(uxs0.e(obj, i3 & 1048575));
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 40:
                                    tfw0Var = tfw0Var3;
                                    hu5Var.g0(uxs0.e(obj, i3 & 1048575));
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 41:
                                    tfw0Var = tfw0Var3;
                                    hu5Var.h0(uxs0.e(obj, i3 & 1048575));
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 42:
                                    tfw0Var = tfw0Var3;
                                    hu5Var.i0(uxs0.e(obj, i3 & 1048575));
                                    obj2 = objO2;
                                    pek0Var = pek0Var2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 43:
                                    tfw0Var = tfw0Var3;
                                    obj3 = obj;
                                    try {
                                        hu5Var.n0(uxs0.e(obj3, i3 & 1048575));
                                        obj2 = objO2;
                                        pek0Var = pek0Var2;
                                        tfw0Var3 = tfw0Var;
                                        pek0Var2 = pek0Var;
                                        objO2 = obj2;
                                    } catch (yew0 unused4) {
                                        obj2 = objO2;
                                        pek0Var = pek0Var2;
                                        objO2 = obj2;
                                        if (objO2 == null) {
                                            pek0Var.getClass();
                                            objO2 = pek0.o(obj3);
                                        }
                                        pek0Var.getClass();
                                        if (!pek0.p(0, hu5Var, objO2)) {
                                            objH2 = objO2;
                                            while (i2 < i) {
                                                objH2 = tfw0Var.H(obj3, iArr[i2], objH2, pek0Var, obj);
                                                i2++;
                                                tfw0Var = this;
                                                obj3 = obj;
                                            }
                                            pek0Var2 = pek0Var;
                                            if (objH2 != null) {
                                                pek0Var2.getClass();
                                                ((mew0) obj).zzc = (mgw0) objH2;
                                            }
                                        }
                                        tfw0Var3 = this;
                                        pek0Var2 = pek0Var;
                                    }
                                    break;
                                case 44:
                                    pek0Var = pek0Var2;
                                    try {
                                        xew0 xew0VarE2 = uxs0.e(obj, i3 & 1048575);
                                        hu5Var.o0(xew0VarE2);
                                        edw0 edw0VarC2 = tfw0Var3.C(iU);
                                        tfw0Var = tfw0Var3;
                                        obj3 = obj;
                                        Object obj6 = objO2;
                                        try {
                                            try {
                                                objO2 = fgw0.c(obj3, iF0, xew0VarE2, edw0VarC2, obj6, pek0Var);
                                                pek0Var2 = pek0Var;
                                                tfw0Var3 = tfw0Var;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                objO2 = obj6;
                                                pek0Var2 = pek0Var;
                                                obj2 = objO2;
                                                objO2 = obj2;
                                                objH = objO2;
                                                while (i2 < i) {
                                                    objH = H(obj, iArr[i2], objH, pek0Var2, obj);
                                                    i2++;
                                                }
                                                if (objH != null) {
                                                    pek0Var2.getClass();
                                                    ((mew0) obj).zzc = (mgw0) objH;
                                                }
                                                throw th;
                                            }
                                        } catch (yew0 unused5) {
                                            obj2 = obj6;
                                            pek0Var = pek0Var;
                                            objO2 = obj2;
                                            if (objO2 == null) {
                                                pek0Var.getClass();
                                                objO2 = pek0.o(obj3);
                                            }
                                            pek0Var.getClass();
                                            if (!pek0.p(0, hu5Var, objO2)) {
                                                objH2 = objO2;
                                                while (i2 < i) {
                                                    objH2 = tfw0Var.H(obj3, iArr[i2], objH2, pek0Var, obj);
                                                    i2++;
                                                    tfw0Var = this;
                                                    obj3 = obj;
                                                }
                                                pek0Var2 = pek0Var;
                                                if (objH2 != null) {
                                                    pek0Var2.getClass();
                                                    ((mew0) obj).zzc = (mgw0) objH2;
                                                }
                                            }
                                            tfw0Var3 = this;
                                            pek0Var2 = pek0Var;
                                            break;
                                        }
                                    } catch (yew0 unused6) {
                                        tfw0Var = tfw0Var3;
                                        obj3 = obj;
                                        obj2 = objO2;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        pek0Var2 = pek0Var;
                                    }
                                    break;
                                case 45:
                                    pek0Var = pek0Var2;
                                    obj4 = obj;
                                    hu5Var.p0(uxs0.e(obj4, i3 & 1048575));
                                    tfw0Var = tfw0Var3;
                                    obj2 = objO2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 46:
                                    pek0Var = pek0Var2;
                                    obj4 = obj;
                                    hu5Var.q0(uxs0.e(obj4, i3 & 1048575));
                                    tfw0Var = tfw0Var3;
                                    obj2 = objO2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 47:
                                    pek0Var = pek0Var2;
                                    obj4 = obj;
                                    hu5Var.r0(uxs0.e(obj4, i3 & 1048575));
                                    tfw0Var = tfw0Var3;
                                    obj2 = objO2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 48:
                                    pek0Var = pek0Var2;
                                    obj4 = obj;
                                    hu5Var.s0(uxs0.e(obj4, i3 & 1048575));
                                    tfw0Var = tfw0Var3;
                                    obj2 = objO2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 49:
                                    pek0Var = pek0Var2;
                                    obj4 = obj;
                                    hu5Var.l0(uxs0.e(obj4, i3 & 1048575), tfw0Var3.A(iU), bew0Var);
                                    tfw0Var = tfw0Var3;
                                    obj2 = objO2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                    pek0Var = pek0Var2;
                                    obj4 = obj;
                                    Object objB = tfw0Var3.B(iU);
                                    long jI = tfw0Var3.i(iU) & 1048575;
                                    Object objH3 = pgw0.h(obj4, jI);
                                    if (objH3 == null) {
                                        objH3 = ifw0.b.a();
                                        pgw0.i(obj4, jI, objH3);
                                    } else if (!((ifw0) objH3).f14707a) {
                                        Object objA = ifw0.b.a();
                                        kys0.h(objA, objH3);
                                        pgw0.i(obj4, jI, objA);
                                        objH3 = objA;
                                    }
                                    hu5Var.t0((ifw0) objH3, ((gfw0) objB).f11226a, bew0Var);
                                    tfw0Var = tfw0Var3;
                                    obj2 = objO2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 51:
                                    pek0Var = pek0Var2;
                                    obj4 = obj;
                                    hu5Var.u0(1);
                                    pgw0.i(obj4, i3 & 1048575, Double.valueOf(tdw0Var.v()));
                                    tfw0Var3.t(iF0, iU, obj4);
                                    tfw0Var = tfw0Var3;
                                    obj2 = objO2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 52:
                                    pek0Var = pek0Var2;
                                    obj4 = obj;
                                    hu5Var.u0(5);
                                    pgw0.i(obj4, i3 & 1048575, Float.valueOf(tdw0Var.y()));
                                    tfw0Var3.t(iF0, iU, obj4);
                                    tfw0Var = tfw0Var3;
                                    obj2 = objO2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 53:
                                    pek0Var = pek0Var2;
                                    obj4 = obj;
                                    hu5Var.u0(0);
                                    pgw0.i(obj4, i3 & 1048575, Long.valueOf(tdw0Var.D()));
                                    tfw0Var3.t(iF0, iU, obj4);
                                    tfw0Var = tfw0Var3;
                                    obj2 = objO2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 54:
                                    pek0Var = pek0Var2;
                                    obj4 = obj;
                                    hu5Var.u0(0);
                                    pgw0.i(obj4, i3 & 1048575, Long.valueOf(tdw0Var.B()));
                                    tfw0Var3.t(iF0, iU, obj4);
                                    tfw0Var = tfw0Var3;
                                    obj2 = objO2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 55:
                                    pek0Var = pek0Var2;
                                    obj4 = obj;
                                    hu5Var.u0(0);
                                    pgw0.i(obj4, i3 & 1048575, Integer.valueOf(tdw0Var.E()));
                                    tfw0Var3.t(iF0, iU, obj4);
                                    tfw0Var = tfw0Var3;
                                    obj2 = objO2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 56:
                                    pek0Var = pek0Var2;
                                    obj4 = obj;
                                    hu5Var.u0(1);
                                    pgw0.i(obj4, i3 & 1048575, Long.valueOf(tdw0Var.G()));
                                    tfw0Var3.t(iF0, iU, obj4);
                                    tfw0Var = tfw0Var3;
                                    obj2 = objO2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 57:
                                    pek0Var = pek0Var2;
                                    obj4 = obj;
                                    hu5Var.u0(5);
                                    pgw0.i(obj4, i3 & 1048575, Integer.valueOf(tdw0Var.H()));
                                    tfw0Var3.t(iF0, iU, obj4);
                                    tfw0Var = tfw0Var3;
                                    obj2 = objO2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 58:
                                    pek0Var = pek0Var2;
                                    obj4 = obj;
                                    hu5Var.u0(0);
                                    pgw0.i(obj4, i3 & 1048575, Boolean.valueOf(tdw0Var.J()));
                                    tfw0Var3.t(iF0, iU, obj4);
                                    tfw0Var = tfw0Var3;
                                    obj2 = objO2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 59:
                                    pek0Var = pek0Var2;
                                    obj4 = obj;
                                    tfw0Var3.I(i3, hu5Var, obj4);
                                    tfw0Var3.t(iF0, iU, obj4);
                                    tfw0Var = tfw0Var3;
                                    obj2 = objO2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 60:
                                    pek0Var = pek0Var2;
                                    obj4 = obj;
                                    jdw0 jdw0Var3 = (jdw0) tfw0Var3.F(iF0, iU, obj4);
                                    egw0 egw0VarA3 = tfw0Var3.A(iU);
                                    hu5Var.u0(2);
                                    hu5Var.v0(jdw0Var3, egw0VarA3, bew0Var);
                                    tfw0Var3.G(obj4, iF0, iU, jdw0Var3);
                                    tfw0Var = tfw0Var3;
                                    obj2 = objO2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 61:
                                    pek0Var = pek0Var2;
                                    obj4 = obj;
                                    pgw0.i(obj4, i3 & 1048575, hu5Var.b1());
                                    tfw0Var3.t(iF0, iU, obj4);
                                    tfw0Var = tfw0Var3;
                                    obj2 = objO2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 62:
                                    pek0Var = pek0Var2;
                                    obj4 = obj;
                                    hu5Var.u0(0);
                                    pgw0.i(obj4, i3 & 1048575, Integer.valueOf(tdw0Var.R()));
                                    tfw0Var3.t(iF0, iU, obj4);
                                    tfw0Var = tfw0Var3;
                                    obj2 = objO2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 63:
                                    pek0Var = pek0Var2;
                                    obj4 = obj;
                                    hu5Var.u0(0);
                                    int iT2 = tdw0Var.T();
                                    edw0 edw0VarC3 = tfw0Var3.C(iU);
                                    if (edw0VarC3 != null && !edw0VarC3.a(iT2)) {
                                        pek0 pek0Var4 = fgw0.f9515a;
                                        if (objO2 == null) {
                                            pek0Var.getClass();
                                            objO = pek0.o(obj4);
                                        } else {
                                            objO = objO2;
                                        }
                                        pek0Var.getClass();
                                        ((mgw0) objO).d(iF0 << 3, Long.valueOf(iT2));
                                        objO2 = objO;
                                        pek0Var2 = pek0Var;
                                    }
                                    pgw0.i(obj4, i3 & 1048575, Integer.valueOf(iT2));
                                    tfw0Var3.t(iF0, iU, obj4);
                                    tfw0Var = tfw0Var3;
                                    obj2 = objO2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 64:
                                    pek0Var = pek0Var2;
                                    obj4 = obj;
                                    hu5Var.u0(5);
                                    pgw0.i(obj4, i3 & 1048575, Integer.valueOf(tdw0Var.V()));
                                    tfw0Var3.t(iF0, iU, obj4);
                                    tfw0Var = tfw0Var3;
                                    obj2 = objO2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 65:
                                    pek0Var = pek0Var2;
                                    obj4 = obj;
                                    hu5Var.u0(1);
                                    pgw0.i(obj4, i3 & 1048575, Long.valueOf(tdw0Var.X()));
                                    tfw0Var3.t(iF0, iU, obj4);
                                    tfw0Var = tfw0Var3;
                                    obj2 = objO2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 66:
                                    pek0Var = pek0Var2;
                                    obj4 = obj;
                                    hu5Var.u0(0);
                                    pgw0.i(obj4, i3 & 1048575, Integer.valueOf(tdw0Var.Z()));
                                    tfw0Var3.t(iF0, iU, obj4);
                                    tfw0Var = tfw0Var3;
                                    obj2 = objO2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 67:
                                    pek0Var = pek0Var2;
                                    obj4 = obj;
                                    hu5Var.u0(0);
                                    pgw0.i(obj4, i3 & 1048575, Long.valueOf(tdw0Var.a0()));
                                    tfw0Var3.t(iF0, iU, obj4);
                                    tfw0Var = tfw0Var3;
                                    obj2 = objO2;
                                    tfw0Var3 = tfw0Var;
                                    pek0Var2 = pek0Var;
                                    objO2 = obj2;
                                    break;
                                case 68:
                                    pek0Var = pek0Var2;
                                    obj4 = obj;
                                    try {
                                        jdw0 jdw0Var4 = (jdw0) tfw0Var3.F(iF0, iU, obj4);
                                        egw0 egw0VarA4 = tfw0Var3.A(iU);
                                        hu5Var.u0(3);
                                        hu5Var.w0(jdw0Var4, egw0VarA4, bew0Var);
                                        tfw0Var3.G(obj4, iF0, iU, jdw0Var4);
                                        tfw0Var = tfw0Var3;
                                        obj2 = objO2;
                                        tfw0Var3 = tfw0Var;
                                        pek0Var2 = pek0Var;
                                        objO2 = obj2;
                                    } catch (yew0 unused7) {
                                        tfw0Var = tfw0Var3;
                                        obj2 = objO2;
                                        obj3 = obj4;
                                        objO2 = obj2;
                                        if (objO2 == null) {
                                            pek0Var.getClass();
                                            objO2 = pek0.o(obj3);
                                        }
                                        pek0Var.getClass();
                                        if (!pek0.p(0, hu5Var, objO2)) {
                                            objH2 = objO2;
                                            while (i2 < i) {
                                                objH2 = tfw0Var.H(obj3, iArr[i2], objH2, pek0Var, obj);
                                                i2++;
                                                tfw0Var = this;
                                                obj3 = obj;
                                            }
                                            pek0Var2 = pek0Var;
                                            if (objH2 != null) {
                                                pek0Var2.getClass();
                                                ((mew0) obj).zzc = (mgw0) objH2;
                                            }
                                        }
                                        tfw0Var3 = this;
                                        pek0Var2 = pek0Var;
                                    } catch (Throwable th8) {
                                        th = th8;
                                        obj2 = objO2;
                                        pek0Var2 = pek0Var;
                                        objO2 = obj2;
                                        objH = objO2;
                                        while (i2 < i) {
                                            objH = H(obj, iArr[i2], objH, pek0Var2, obj);
                                            i2++;
                                        }
                                        if (objH != null) {
                                            pek0Var2.getClass();
                                            ((mew0) obj).zzc = (mgw0) objH;
                                        }
                                        throw th;
                                    }
                                    break;
                                default:
                                    if (objO2 == null) {
                                        pek0Var2.getClass();
                                        objO2 = pek0.o(obj);
                                    }
                                    try {
                                        pek0Var2.getClass();
                                        if (pek0.p(0, hu5Var, objO2)) {
                                            pek0Var = pek0Var2;
                                            pek0Var2 = pek0Var;
                                        } else {
                                            objH2 = objO2;
                                            while (i2 < i) {
                                                objH2 = tfw0Var3.H(obj, iArr[i2], objH2, pek0Var2, obj);
                                                i2++;
                                                pek0Var2 = pek0Var2;
                                            }
                                            pek0Var = pek0Var2;
                                            pek0Var2 = pek0Var;
                                        }
                                    } catch (yew0 unused8) {
                                        pek0Var = pek0Var2;
                                        tfw0Var = tfw0Var3;
                                        obj3 = obj;
                                        if (objO2 == null) {
                                            pek0Var.getClass();
                                            objO2 = pek0.o(obj3);
                                        }
                                        pek0Var.getClass();
                                        if (!pek0.p(0, hu5Var, objO2)) {
                                            objH2 = objO2;
                                            while (i2 < i) {
                                                objH2 = tfw0Var.H(obj3, iArr[i2], objH2, pek0Var, obj);
                                                i2++;
                                                tfw0Var = this;
                                                obj3 = obj;
                                            }
                                            pek0Var2 = pek0Var;
                                            if (objH2 != null) {
                                                pek0Var2.getClass();
                                                ((mew0) obj).zzc = (mgw0) objH2;
                                            }
                                        }
                                        tfw0Var3 = this;
                                    } catch (Throwable th9) {
                                        th = th9;
                                        pek0Var = pek0Var2;
                                        pek0Var2 = pek0Var;
                                        objH = objO2;
                                        while (i2 < i) {
                                            objH = H(obj, iArr[i2], objH, pek0Var2, obj);
                                            i2++;
                                        }
                                        if (objH != null) {
                                            pek0Var2.getClass();
                                            ((mew0) obj).zzc = (mgw0) objH;
                                        }
                                        throw th;
                                    }
                                    break;
                            }
                        } catch (yew0 unused9) {
                            tfw0Var = tfw0Var3;
                            obj2 = objO2;
                            pek0Var = pek0Var2;
                            obj3 = obj;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        obj2 = objO2;
                    }
                } else if (iF0 == Integer.MAX_VALUE) {
                    objH2 = objO2;
                    while (i2 < i) {
                        objH2 = tfw0Var3.H(obj, iArr[i2], objH2, pek0Var2, obj);
                        i2++;
                        tfw0Var3 = this;
                    }
                } else {
                    if (objO2 == null) {
                        pek0Var2.getClass();
                        objO2 = pek0.o(obj);
                    }
                    try {
                        pek0Var2.getClass();
                        if (pek0.p(0, hu5Var, objO2)) {
                            tfw0Var3 = this;
                        } else {
                            objH2 = objO2;
                            while (i2 < i) {
                                objH2 = H(obj, iArr[i2], objH2, pek0Var2, obj);
                                i2++;
                            }
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        objH = objO2;
                        while (i2 < i) {
                            objH = H(obj, iArr[i2], objH, pek0Var2, obj);
                            i2++;
                        }
                        if (objH != null) {
                            pek0Var2.getClass();
                            ((mew0) obj).zzc = (mgw0) objH;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th12) {
                th = th12;
            }
        }
        if (objH2 != null) {
            pek0Var2.getClass();
            ((mew0) obj).zzc = (mgw0) objH2;
        }
    }

    @Override // a.egw0
    public final void f(Object obj, owp0 owp0Var) {
        int i;
        aew0 aew0Var = (aew0) owp0Var.b;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.f33886a;
            if (i4 >= iArr.length) {
                ((mew0) obj).zzc.b(owp0Var);
                return;
            }
            int i6 = i(i4);
            int iJ = j(i6);
            int i7 = iArr[i4];
            Unsafe unsafe = l;
            if (iJ <= 17) {
                int i8 = iArr[i4 + 2];
                int i9 = i8 & i2;
                if (i9 != i3) {
                    i5 = i9 == i2 ? 0 : unsafe.getInt(obj, i9);
                    i3 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                i = 0;
            }
            long j = i6 & i2;
            switch (iJ) {
                case 0:
                    if (p(obj, i4, i3, i5, i)) {
                        aew0Var.i(i7, Double.doubleToRawLongBits(pgw0.c.v(obj, j)));
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if (p(obj, i4, i3, i5, i)) {
                        aew0Var.g(i7, Float.floatToRawIntBits(pgw0.c.t(obj, j)));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 2:
                    if (p(obj, i4, i3, i5, i)) {
                        aew0Var.h(i7, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 3:
                    if (p(obj, i4, i3, i5, i)) {
                        aew0Var.h(i7, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 4:
                    if (p(obj, i4, i3, i5, i)) {
                        aew0Var.e(i7, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 5:
                    if (p(obj, i4, i3, i5, i)) {
                        aew0Var.i(i7, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 6:
                    if (p(obj, i4, i3, i5, i)) {
                        aew0Var.g(i7, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 7:
                    if (p(obj, i4, i3, i5, i)) {
                        aew0Var.j(i7, pgw0.c.q(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 8:
                    if (p(obj, i4, i3, i5, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            aew0Var.k(i7, (String) object);
                        } else {
                            aew0Var.l(i7, (qdw0) object);
                        }
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 9:
                    if (p(obj, i4, i3, i5, i)) {
                        owp0Var.o(i7, unsafe.getObject(obj, j), A(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 10:
                    if (p(obj, i4, i3, i5, i)) {
                        aew0Var.l(i7, (qdw0) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 11:
                    if (p(obj, i4, i3, i5, i)) {
                        aew0Var.f(i7, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 12:
                    if (p(obj, i4, i3, i5, i)) {
                        aew0Var.e(i7, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 13:
                    if (p(obj, i4, i3, i5, i)) {
                        aew0Var.g(i7, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 14:
                    if (p(obj, i4, i3, i5, i)) {
                        aew0Var.i(i7, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 15:
                    if (p(obj, i4, i3, i5, i)) {
                        int i10 = unsafe.getInt(obj, j);
                        aew0Var.f(i7, (i10 >> 31) ^ (i10 + i10));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 16:
                    if (p(obj, i4, i3, i5, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        aew0Var.h(i7, (j2 >> 63) ^ (j2 + j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 17:
                    if (p(obj, i4, i3, i5, i)) {
                        Object object2 = unsafe.getObject(obj, j);
                        aew0Var.d(i7, 3);
                        A(i4).f((jdw0) object2, owp0Var);
                        aew0Var.d(i7, 4);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 18:
                    fgw0.d(iArr[i4], (List) unsafe.getObject(obj, j), owp0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    fgw0.e(iArr[i4], (List) unsafe.getObject(obj, j), owp0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 20:
                    fgw0.f(iArr[i4], (List) unsafe.getObject(obj, j), owp0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 21:
                    fgw0.g(iArr[i4], (List) unsafe.getObject(obj, j), owp0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    fgw0.k(iArr[i4], (List) unsafe.getObject(obj, j), owp0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 23:
                    fgw0.i(iArr[i4], (List) unsafe.getObject(obj, j), owp0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 24:
                    fgw0.n(iArr[i4], (List) unsafe.getObject(obj, j), owp0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    fgw0.q(iArr[i4], (List) unsafe.getObject(obj, j), owp0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    int i11 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j);
                    pek0 pek0Var = fgw0.f9515a;
                    if (list != null && !list.isEmpty()) {
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            aew0Var.k(i11, (String) list.get(i12));
                        }
                    }
                    break;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    int i13 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j);
                    egw0 egw0VarA = A(i4);
                    pek0 pek0Var2 = fgw0.f9515a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i14 = 0; i14 < list2.size(); i14++) {
                            owp0Var.o(i13, list2.get(i14), egw0VarA);
                        }
                    }
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    int i15 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j);
                    pek0 pek0Var3 = fgw0.f9515a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i16 = 0; i16 < list3.size(); i16++) {
                            aew0Var.l(i15, (qdw0) list3.get(i16));
                        }
                    }
                    break;
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                    fgw0.l(iArr[i4], (List) unsafe.getObject(obj, j), owp0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                    fgw0.p(iArr[i4], (List) unsafe.getObject(obj, j), owp0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                    fgw0.o(iArr[i4], (List) unsafe.getObject(obj, j), owp0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 32:
                    fgw0.j(iArr[i4], (List) unsafe.getObject(obj, j), owp0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 33:
                    fgw0.m(iArr[i4], (List) unsafe.getObject(obj, j), owp0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 34:
                    fgw0.h(iArr[i4], (List) unsafe.getObject(obj, j), owp0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 35:
                    fgw0.d(iArr[i4], (List) unsafe.getObject(obj, j), owp0Var, true);
                    break;
                case 36:
                    fgw0.e(iArr[i4], (List) unsafe.getObject(obj, j), owp0Var, true);
                    break;
                case 37:
                    fgw0.f(iArr[i4], (List) unsafe.getObject(obj, j), owp0Var, true);
                    break;
                case 38:
                    fgw0.g(iArr[i4], (List) unsafe.getObject(obj, j), owp0Var, true);
                    break;
                case 39:
                    fgw0.k(iArr[i4], (List) unsafe.getObject(obj, j), owp0Var, true);
                    break;
                case 40:
                    fgw0.i(iArr[i4], (List) unsafe.getObject(obj, j), owp0Var, true);
                    break;
                case 41:
                    fgw0.n(iArr[i4], (List) unsafe.getObject(obj, j), owp0Var, true);
                    break;
                case 42:
                    fgw0.q(iArr[i4], (List) unsafe.getObject(obj, j), owp0Var, true);
                    break;
                case 43:
                    fgw0.l(iArr[i4], (List) unsafe.getObject(obj, j), owp0Var, true);
                    break;
                case 44:
                    fgw0.p(iArr[i4], (List) unsafe.getObject(obj, j), owp0Var, true);
                    break;
                case 45:
                    fgw0.o(iArr[i4], (List) unsafe.getObject(obj, j), owp0Var, true);
                    break;
                case 46:
                    fgw0.j(iArr[i4], (List) unsafe.getObject(obj, j), owp0Var, true);
                    break;
                case 47:
                    fgw0.m(iArr[i4], (List) unsafe.getObject(obj, j), owp0Var, true);
                    break;
                case 48:
                    fgw0.h(iArr[i4], (List) unsafe.getObject(obj, j), owp0Var, true);
                    break;
                case 49:
                    int i17 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j);
                    egw0 egw0VarA2 = A(i4);
                    pek0 pek0Var4 = fgw0.f9515a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i18 = 0; i18 < list4.size(); i18++) {
                            jdw0 jdw0Var = (jdw0) list4.get(i18);
                            aew0Var.d(i17, 3);
                            egw0VarA2.f(jdw0Var, owp0Var);
                            aew0Var.d(i17, 4);
                        }
                    }
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Object object3 = unsafe.getObject(obj, j);
                    if (object3 != null) {
                        mpt0 mpt0Var = ((gfw0) B(i4)).f11226a;
                        for (Map.Entry entry : ((ifw0) object3).entrySet()) {
                            aew0Var.d(i7, 2);
                            aew0Var.r(gfw0.b(mpt0Var, entry.getKey(), entry.getValue()));
                            gfw0.a(aew0Var, mpt0Var, entry.getKey(), entry.getValue());
                        }
                    }
                    break;
                case 51:
                    if (s(i7, i4, obj)) {
                        aew0Var.i(i7, Double.doubleToRawLongBits(((Double) pgw0.h(obj, j)).doubleValue()));
                    }
                    break;
                case 52:
                    if (s(i7, i4, obj)) {
                        aew0Var.g(i7, Float.floatToRawIntBits(((Float) pgw0.h(obj, j)).floatValue()));
                    }
                    break;
                case 53:
                    if (s(i7, i4, obj)) {
                        aew0Var.h(i7, n(obj, j));
                    }
                    break;
                case 54:
                    if (s(i7, i4, obj)) {
                        aew0Var.h(i7, n(obj, j));
                    }
                    break;
                case 55:
                    if (s(i7, i4, obj)) {
                        aew0Var.e(i7, m(obj, j));
                    }
                    break;
                case 56:
                    if (s(i7, i4, obj)) {
                        aew0Var.i(i7, n(obj, j));
                    }
                    break;
                case 57:
                    if (s(i7, i4, obj)) {
                        aew0Var.g(i7, m(obj, j));
                    }
                    break;
                case 58:
                    if (s(i7, i4, obj)) {
                        aew0Var.j(i7, ((Boolean) pgw0.h(obj, j)).booleanValue());
                    }
                    break;
                case 59:
                    if (s(i7, i4, obj)) {
                        Object object4 = unsafe.getObject(obj, j);
                        if (object4 instanceof String) {
                            aew0Var.k(i7, (String) object4);
                        } else {
                            aew0Var.l(i7, (qdw0) object4);
                        }
                    }
                    break;
                case 60:
                    if (s(i7, i4, obj)) {
                        owp0Var.o(i7, unsafe.getObject(obj, j), A(i4));
                    }
                    break;
                case 61:
                    if (s(i7, i4, obj)) {
                        aew0Var.l(i7, (qdw0) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (s(i7, i4, obj)) {
                        aew0Var.f(i7, m(obj, j));
                    }
                    break;
                case 63:
                    if (s(i7, i4, obj)) {
                        aew0Var.e(i7, m(obj, j));
                    }
                    break;
                case 64:
                    if (s(i7, i4, obj)) {
                        aew0Var.g(i7, m(obj, j));
                    }
                    break;
                case 65:
                    if (s(i7, i4, obj)) {
                        aew0Var.i(i7, n(obj, j));
                    }
                    break;
                case 66:
                    if (s(i7, i4, obj)) {
                        int iM = m(obj, j);
                        aew0Var.f(i7, (iM >> 31) ^ (iM + iM));
                    }
                    break;
                case 67:
                    if (s(i7, i4, obj)) {
                        long jN = n(obj, j);
                        aew0Var.h(i7, (jN >> 63) ^ (jN + jN));
                    }
                    break;
                case 68:
                    if (s(i7, i4, obj)) {
                        Object object5 = unsafe.getObject(obj, j);
                        aew0Var.d(i7, 3);
                        A(i4).f((jdw0) object5, owp0Var);
                        aew0Var.d(i7, 4);
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // a.egw0
    public final void g(Object obj, Object obj2) {
        Object obj3;
        l(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f33886a;
            if (i >= iArr.length) {
                fgw0.b(obj, obj2);
                return;
            }
            int i2 = i(i);
            int i3 = 1048575 & i2;
            int iJ = j(i2);
            int i4 = iArr[i];
            long j = i3;
            switch (iJ) {
                case 0:
                    if (!q(i, obj2)) {
                        obj3 = obj;
                    } else {
                        gft0 gft0Var = pgw0.c;
                        obj3 = obj;
                        gft0Var.w(obj3, j, gft0Var.v(obj2, j));
                        r(i, obj3);
                    }
                    break;
                case 1:
                    if (q(i, obj2)) {
                        gft0 gft0Var2 = pgw0.c;
                        gft0Var2.u(obj, j, gft0Var2.t(obj2, j));
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (q(i, obj2)) {
                        pgw0.g(obj, j, pgw0.f(obj2, j));
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (q(i, obj2)) {
                        pgw0.g(obj, j, pgw0.f(obj2, j));
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (q(i, obj2)) {
                        pgw0.e(obj, pgw0.d(obj2, j), j);
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (q(i, obj2)) {
                        pgw0.g(obj, j, pgw0.f(obj2, j));
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (q(i, obj2)) {
                        pgw0.e(obj, pgw0.d(obj2, j), j);
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (q(i, obj2)) {
                        gft0 gft0Var3 = pgw0.c;
                        gft0Var3.r(obj, j, gft0Var3.q(obj2, j));
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (q(i, obj2)) {
                        pgw0.i(obj, j, pgw0.h(obj2, j));
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    y(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (q(i, obj2)) {
                        pgw0.i(obj, j, pgw0.h(obj2, j));
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (q(i, obj2)) {
                        pgw0.e(obj, pgw0.d(obj2, j), j);
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (q(i, obj2)) {
                        pgw0.e(obj, pgw0.d(obj2, j), j);
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (q(i, obj2)) {
                        pgw0.e(obj, pgw0.d(obj2, j), j);
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (q(i, obj2)) {
                        pgw0.g(obj, j, pgw0.f(obj2, j));
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (q(i, obj2)) {
                        pgw0.e(obj, pgw0.d(obj2, j), j);
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (q(i, obj2)) {
                        pgw0.g(obj, j, pgw0.f(obj2, j));
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    y(i, obj, obj2);
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
                    xew0 xew0VarZzg = (xew0) pgw0.h(obj, j);
                    xew0 xew0Var = (xew0) pgw0.h(obj2, j);
                    int size = xew0VarZzg.size();
                    int size2 = xew0Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!((kdw0) xew0VarZzg).f18126a) {
                            xew0VarZzg = xew0VarZzg.zzg(size2 + size);
                        }
                        xew0VarZzg.addAll(xew0Var);
                    }
                    if (size > 0) {
                        xew0Var = xew0VarZzg;
                    }
                    pgw0.i(obj, j, xew0Var);
                    obj3 = obj;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    pek0 pek0Var = fgw0.f9515a;
                    pgw0.i(obj, j, kys0.h(pgw0.h(obj, j), pgw0.h(obj2, j)));
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
                    if (s(i4, i, obj2)) {
                        pgw0.i(obj, j, pgw0.h(obj2, j));
                        t(i4, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    z(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (s(i4, i, obj2)) {
                        pgw0.i(obj, j, pgw0.h(obj2, j));
                        t(i4, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    z(i, obj, obj2);
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

    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080 A[SYNTHETIC] */
    @Override // a.egw0
    public final void h(Object obj) {
        if (!k(obj)) {
            return;
        }
        if (obj instanceof mew0) {
            mew0 mew0Var = (mew0) obj;
            mew0Var.j();
            mew0Var.zza = 0;
            mew0Var.f();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f33886a;
            if (i >= iArr.length) {
                this.j.getClass();
                mgw0 mgw0Var = ((mew0) obj).zzc;
                if (mgw0Var.e) {
                    mgw0Var.e = false;
                    return;
                }
                return;
            }
            int i2 = i(i);
            int i3 = 1048575 & i2;
            int iJ = j(i2);
            long j = i3;
            Unsafe unsafe = l;
            if (iJ != 9) {
                if (iJ != 60 && iJ != 68) {
                    switch (iJ) {
                        case 17:
                            if (q(i, obj)) {
                                A(i).h(unsafe.getObject(obj, j));
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
                            kdw0 kdw0Var = (kdw0) ((xew0) pgw0.h(obj, j));
                            if (kdw0Var.f18126a) {
                                kdw0Var.f18126a = false;
                            }
                            break;
                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((ifw0) object).f14707a = false;
                                unsafe.putObject(obj, j, object);
                            }
                            break;
                    }
                } else if (s(iArr[i], i, obj)) {
                    A(i).h(unsafe.getObject(obj, j));
                }
            } else if (q(i, obj)) {
                A(i).h(unsafe.getObject(obj, j));
            }
            i += 3;
        }
    }

    public final int i(int i) {
        return this.f33886a[i + 1];
    }

    public final boolean o(mew0 mew0Var, mew0 mew0Var2, int i) {
        return q(i, mew0Var) == q(i, mew0Var2);
    }

    public final boolean p(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return q(i, obj);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00f5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f6 A[RETURN] */
    public final boolean q(int i, Object obj) {
        int i2 = this.f33886a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & pgw0.d(obj, j)) != 0) {
                return true;
            }
            return false;
        }
        int i3 = i(i);
        long j2 = i3 & 1048575;
        switch (j(i3)) {
            case 0:
                if (Double.doubleToRawLongBits(pgw0.c.v(obj, j2)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(pgw0.c.t(obj, j2)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (pgw0.f(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (pgw0.f(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (pgw0.d(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (pgw0.f(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (pgw0.d(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 7:
                return pgw0.c.q(obj, j2);
            case 8:
                Object objH = pgw0.h(obj, j2);
                if (objH instanceof String) {
                    if (((String) objH).isEmpty()) {
                        return false;
                    }
                    return true;
                }
                if (!(objH instanceof qdw0)) {
                    e9d0.o();
                    return false;
                }
                if (qdw0.b.equals(objH)) {
                    return false;
                }
                return true;
            case 9:
                if (pgw0.h(obj, j2) != null) {
                    return true;
                }
                return false;
            case 10:
                if (qdw0.b.equals(pgw0.h(obj, j2))) {
                    return false;
                }
                return true;
            case 11:
                if (pgw0.d(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (pgw0.d(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (pgw0.d(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (pgw0.f(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (pgw0.d(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (pgw0.f(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (pgw0.h(obj, j2) != null) {
                    return true;
                }
                return false;
            default:
                e9d0.o();
                return false;
        }
    }

    public final void r(int i, Object obj) {
        int i2 = this.f33886a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        pgw0.e(obj, (1 << (i2 >>> 20)) | pgw0.d(obj, j), j);
    }

    public final boolean s(int i, int i2, Object obj) {
        return pgw0.d(obj, (long) (this.f33886a[i2 + 2] & 1048575)) == i;
    }

    public final void t(int i, int i2, Object obj) {
        pgw0.e(obj, i, this.f33886a[i2 + 2] & 1048575);
    }

    public final int u(int i, int i2) {
        int[] iArr = this.f33886a;
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
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 36741. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int w(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, a.mdw0 r42) {
        /*
            Method dump skipped, instruction units count: 3674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.tfw0.w(java.lang.Object, byte[], int, int, int, a.mdw0):int");
    }

    public final void y(int i, Object obj, Object obj2) {
        if (q(i, obj2)) {
            long jI = i(i) & 1048575;
            Unsafe unsafe = l;
            Object object = unsafe.getObject(obj2, jI);
            if (object == null) {
                int i2 = this.f33886a[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i2);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            egw0 egw0VarA = A(i);
            if (!q(i, obj)) {
                if (k(object)) {
                    mew0 mew0VarZza = egw0VarA.zza();
                    egw0VarA.g(mew0VarZza, object);
                    unsafe.putObject(obj, jI, mew0VarZza);
                } else {
                    unsafe.putObject(obj, jI, object);
                }
                r(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jI);
            if (!k(object2)) {
                mew0 mew0VarZza2 = egw0VarA.zza();
                egw0VarA.g(mew0VarZza2, object2);
                unsafe.putObject(obj, jI, mew0VarZza2);
                object2 = mew0VarZza2;
            }
            egw0VarA.g(object2, object);
        }
    }

    public final void z(int i, Object obj, Object obj2) {
        int[] iArr = this.f33886a;
        int i2 = iArr[i];
        if (s(i2, i, obj2)) {
            long jI = i(i) & 1048575;
            Unsafe unsafe = l;
            Object object = unsafe.getObject(obj2, jI);
            if (object == null) {
                int i3 = iArr[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            egw0 egw0VarA = A(i);
            if (!s(i2, i, obj)) {
                if (k(object)) {
                    mew0 mew0VarZza = egw0VarA.zza();
                    egw0VarA.g(mew0VarZza, object);
                    unsafe.putObject(obj, jI, mew0VarZza);
                } else {
                    unsafe.putObject(obj, jI, object);
                }
                t(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jI);
            if (!k(object2)) {
                mew0 mew0VarZza2 = egw0VarA.zza();
                egw0VarA.g(mew0VarZza2, object2);
                unsafe.putObject(obj, jI, mew0VarZza2);
                object2 = mew0VarZza2;
            }
            egw0VarA.g(object2, object);
        }
    }

    @Override // a.egw0
    public final mew0 zza() {
        return ((mew0) this.e).g();
    }

    @Override // a.egw0
    public final boolean zzl(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < this.h) {
            int i6 = this.g[i3];
            int i7 = this.i(i6);
            int[] iArr = this.f33886a;
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i4 = l.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i5;
                i2 = i4;
            }
            tfw0 tfw0Var = this;
            Object obj2 = obj;
            if ((268435456 & i7) == 0 || tfw0Var.p(obj2, i6, i, i2, i10)) {
                int iJ = j(i7);
                if (iJ != 9 && iJ != 17) {
                    if (iJ != 27) {
                        if (iJ == 60 || iJ == 68) {
                            if (!tfw0Var.s(iArr[i6], i6, obj2) || tfw0Var.A(i6).zzl(pgw0.h(obj2, i7 & 1048575))) {
                                i3++;
                                this = tfw0Var;
                                obj = obj2;
                                i5 = i;
                                i4 = i2;
                            }
                        } else if (iJ != 49) {
                            if (iJ != 50) {
                                continue;
                            } else {
                                ifw0 ifw0Var = (ifw0) pgw0.h(obj2, i7 & 1048575);
                                if (!ifw0Var.isEmpty() && ((ugw0) ((gfw0) tfw0Var.B(i6)).f11226a.c).f35647a == vgw0.i) {
                                    egw0 egw0VarA = null;
                                    for (Object obj3 : ifw0Var.values()) {
                                        if (egw0VarA == null) {
                                            egw0VarA = agw0.c.a(obj3.getClass());
                                        }
                                        if (!egw0VarA.zzl(obj3)) {
                                        }
                                    }
                                }
                            }
                            i3++;
                            this = tfw0Var;
                            obj = obj2;
                            i5 = i;
                            i4 = i2;
                        }
                    }
                    List list = (List) pgw0.h(obj2, i7 & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        egw0 egw0VarA2 = tfw0Var.A(i6);
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            if (egw0VarA2.zzl(list.get(i11))) {
                            }
                        }
                    }
                    i3++;
                    this = tfw0Var;
                    obj = obj2;
                    i5 = i;
                    i4 = i2;
                } else if (!tfw0Var.p(obj2, i6, i, i2, i10) || tfw0Var.A(i6).zzl(pgw0.h(obj2, i7 & 1048575))) {
                    i3++;
                    this = tfw0Var;
                    obj = obj2;
                    i5 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        return true;
    }
}

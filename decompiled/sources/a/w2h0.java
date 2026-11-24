package a;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w2h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f38448a;
    public static final zdt0 b;
    public static final zdt0 c;
    public static final zdt0 d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f38448a = cls;
        b = v(false);
        c = v(true);
        d = new zdt0();
    }

    public static void A(int i, List list, psc pscVar, boolean z) throws l52 {
        if (list == null || list.isEmpty()) {
            return;
        }
        ryc rycVar = (ryc) pscVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jDoubleToRawLongBits = Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue());
                rycVar.p(i, 1);
                rycVar.n(jDoubleToRawLongBits);
                i2++;
            }
            return;
        }
        rycVar.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        rycVar.q(i3);
        while (i2 < list.size()) {
            rycVar.n(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void B(int i, List list, psc pscVar, boolean z) throws l52 {
        if (list == null || list.isEmpty()) {
            return;
        }
        ryc rycVar = (ryc) pscVar.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                rycVar.p(i, 0);
                rycVar.o(iIntValue);
            }
            return;
        }
        rycVar.p(i, 2);
        int iF = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iF += ryc.f(((Integer) list.get(i3)).intValue());
        }
        rycVar.q(iF);
        for (int i4 = 0; i4 < list.size(); i4++) {
            rycVar.o(((Integer) list.get(i4)).intValue());
        }
    }

    public static void C(int i, List list, psc pscVar, boolean z) throws l52 {
        if (list == null || list.isEmpty()) {
            return;
        }
        ryc rycVar = (ryc) pscVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                rycVar.p(i, 5);
                rycVar.m(iIntValue);
                i2++;
            }
            return;
        }
        rycVar.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        rycVar.q(i3);
        while (i2 < list.size()) {
            rycVar.m(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void D(int i, List list, psc pscVar, boolean z) throws l52 {
        if (list == null || list.isEmpty()) {
            return;
        }
        ryc rycVar = (ryc) pscVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                rycVar.p(i, 1);
                rycVar.n(jLongValue);
                i2++;
            }
            return;
        }
        rycVar.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        rycVar.q(i3);
        while (i2 < list.size()) {
            rycVar.n(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void E(int i, List list, psc pscVar, boolean z) throws l52 {
        if (list == null || list.isEmpty()) {
            return;
        }
        ryc rycVar = (ryc) pscVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iFloatToRawIntBits = Float.floatToRawIntBits(((Float) list.get(i2)).floatValue());
                rycVar.p(i, 5);
                rycVar.m(iFloatToRawIntBits);
                i2++;
            }
            return;
        }
        rycVar.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        rycVar.q(i3);
        while (i2 < list.size()) {
            rycVar.m(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void F(int i, List list, psc pscVar, o2h0 o2h0Var) throws l52 {
        if (list == null || list.isEmpty()) {
            return;
        }
        pscVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            pscVar.q(i, list.get(i2), o2h0Var);
        }
    }

    public static void G(int i, List list, psc pscVar, boolean z) throws l52 {
        if (list == null || list.isEmpty()) {
            return;
        }
        ryc rycVar = (ryc) pscVar.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                rycVar.p(i, 0);
                rycVar.o(iIntValue);
            }
            return;
        }
        rycVar.p(i, 2);
        int iF = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iF += ryc.f(((Integer) list.get(i3)).intValue());
        }
        rycVar.q(iF);
        for (int i4 = 0; i4 < list.size(); i4++) {
            rycVar.o(((Integer) list.get(i4)).intValue());
        }
    }

    public static void H(int i, List list, psc pscVar, boolean z) throws l52 {
        if (list == null || list.isEmpty()) {
            return;
        }
        ryc rycVar = (ryc) pscVar.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                rycVar.p(i, 0);
                rycVar.r(jLongValue);
            }
            return;
        }
        rycVar.p(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += ryc.j(((Long) list.get(i3)).longValue());
        }
        rycVar.q(iJ);
        for (int i4 = 0; i4 < list.size(); i4++) {
            rycVar.r(((Long) list.get(i4)).longValue());
        }
    }

    public static void I(int i, List list, psc pscVar, o2h0 o2h0Var) throws l52 {
        if (list == null || list.isEmpty()) {
            return;
        }
        pscVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            pscVar.r(i, list.get(i2), o2h0Var);
        }
    }

    public static void J(int i, List list, psc pscVar, boolean z) throws l52 {
        if (list == null || list.isEmpty()) {
            return;
        }
        ryc rycVar = (ryc) pscVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                rycVar.p(i, 5);
                rycVar.m(iIntValue);
                i2++;
            }
            return;
        }
        rycVar.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        rycVar.q(i3);
        while (i2 < list.size()) {
            rycVar.m(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void K(int i, List list, psc pscVar, boolean z) throws l52 {
        if (list == null || list.isEmpty()) {
            return;
        }
        ryc rycVar = (ryc) pscVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                rycVar.p(i, 1);
                rycVar.n(jLongValue);
                i2++;
            }
            return;
        }
        rycVar.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        rycVar.q(i3);
        while (i2 < list.size()) {
            rycVar.n(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void L(int i, List list, psc pscVar, boolean z) throws l52 {
        if (list == null || list.isEmpty()) {
            return;
        }
        ryc rycVar = (ryc) pscVar.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                rycVar.p(i, 0);
                rycVar.q((iIntValue >> 31) ^ (iIntValue << 1));
            }
            return;
        }
        rycVar.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue2 = ((Integer) list.get(i4)).intValue();
            i3 += ryc.i((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        rycVar.q(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            int iIntValue3 = ((Integer) list.get(i5)).intValue();
            rycVar.q((iIntValue3 >> 31) ^ (iIntValue3 << 1));
        }
    }

    public static void M(int i, List list, psc pscVar, boolean z) throws l52 {
        if (list == null || list.isEmpty()) {
            return;
        }
        ryc rycVar = (ryc) pscVar.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                rycVar.p(i, 0);
                rycVar.r((jLongValue >> 63) ^ (jLongValue << 1));
            }
            return;
        }
        rycVar.p(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iJ += ryc.j((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        rycVar.q(iJ);
        for (int i4 = 0; i4 < list.size(); i4++) {
            long jLongValue3 = ((Long) list.get(i4)).longValue();
            rycVar.r((jLongValue3 >> 63) ^ (jLongValue3 << 1));
        }
    }

    public static void N(int i, List list, psc pscVar) throws l52 {
        if (list == null || list.isEmpty()) {
            return;
        }
        ryc rycVar = (ryc) pscVar.b;
        byte[] bArr = rycVar.b;
        int i2 = rycVar.c;
        if (!(list instanceof rez)) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                String str = (String) list.get(i3);
                rycVar.p(i, 2);
                int i4 = rycVar.d;
                try {
                    int i5 = ryc.i(str.length() * 3);
                    int i6 = ryc.i(str.length());
                    if (i6 == i5) {
                        int i7 = i4 + i6;
                        rycVar.d = i7;
                        int iG = ptt0.f27581a.g(str, bArr, i7, i2 - i7);
                        rycVar.d = i4;
                        rycVar.q((iG - i4) - i6);
                        rycVar.d = iG;
                    } else {
                        rycVar.q(ptt0.a(str));
                        int i8 = rycVar.d;
                        rycVar.d = ptt0.f27581a.g(str, bArr, i8, i2 - i8);
                    }
                } catch (mtt0 e) {
                    rycVar.d = i4;
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
            return;
        }
        rez rezVar = (rez) list;
        for (int i9 = 0; i9 < list.size(); i9++) {
            Object objX = rezVar.x(i9);
            if (objX instanceof String) {
                String str2 = (String) objX;
                rycVar.p(i, 2);
                int i10 = rycVar.d;
                try {
                    int i11 = ryc.i(str2.length() * 3);
                    int i12 = ryc.i(str2.length());
                    if (i12 == i11) {
                        int i13 = i10 + i12;
                        rycVar.d = i13;
                        int iG2 = ptt0.f27581a.g(str2, bArr, i13, i2 - i13);
                        rycVar.d = i10;
                        rycVar.q((iG2 - i10) - i12);
                        rycVar.d = iG2;
                    } else {
                        rycVar.q(ptt0.a(str2));
                        int i14 = rycVar.d;
                        rycVar.d = ptt0.f27581a.g(str2, bArr, i14, i2 - i14);
                    }
                } catch (mtt0 e4) {
                    rycVar.d = i10;
                    ryc.e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e4);
                    byte[] bytes2 = str2.getBytes(cmx.f4629a);
                    try {
                        rycVar.q(bytes2.length);
                        rycVar.l(bytes2, 0, bytes2.length);
                    } catch (IndexOutOfBoundsException e5) {
                        throw new l52(e5);
                    }
                } catch (IndexOutOfBoundsException e6) {
                    throw new l52(e6);
                }
            } else {
                og9 og9Var = (og9) objX;
                rycVar.p(i, 2);
                rycVar.q(og9Var.size());
                kg9 kg9Var = (kg9) og9Var;
                rycVar.l(kg9Var.d, kg9Var.i(), kg9Var.size());
            }
        }
    }

    public static void O(int i, List list, psc pscVar, boolean z) throws l52 {
        if (list == null || list.isEmpty()) {
            return;
        }
        ryc rycVar = (ryc) pscVar.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                rycVar.p(i, 0);
                rycVar.q(iIntValue);
            }
            return;
        }
        rycVar.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += ryc.i(((Integer) list.get(i4)).intValue());
        }
        rycVar.q(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            rycVar.q(((Integer) list.get(i5)).intValue());
        }
    }

    public static void P(int i, List list, psc pscVar, boolean z) throws l52 {
        if (list == null || list.isEmpty()) {
            return;
        }
        ryc rycVar = (ryc) pscVar.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                rycVar.p(i, 0);
                rycVar.r(jLongValue);
            }
            return;
        }
        rycVar.p(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += ryc.j(((Long) list.get(i3)).longValue());
        }
        rycVar.q(iJ);
        for (int i4 = 0; i4 < list.size(); i4++) {
            rycVar.r(((Long) list.get(i4)).longValue());
        }
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iH = ryc.h(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iH += ryc.b((og9) list.get(i2));
        }
        return iH;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (ryc.h(i) * size) + c(list);
    }

    public static int c(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof tjx) {
            tjx tjxVar = (tjx) list;
            if (size <= 0) {
                return 0;
            }
            tjxVar.e(0);
            throw null;
        }
        int iF = 0;
        for (int i = 0; i < size; i++) {
            iF += ryc.f(((Integer) list.get(i)).intValue());
        }
        return iF;
    }

    public static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return ryc.c(i) * size;
    }

    public static int e(List list) {
        return list.size() * 4;
    }

    public static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return ryc.d(i) * size;
    }

    public static int g(List list) {
        return list.size() * 8;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (ryc.h(i) * size) + i(list);
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof tjx) {
            tjx tjxVar = (tjx) list;
            if (size <= 0) {
                return 0;
            }
            tjxVar.e(0);
            throw null;
        }
        int iF = 0;
        for (int i = 0; i < size; i++) {
            iF += ryc.f(((Integer) list.get(i)).intValue());
        }
        return iF;
    }

    public static int j(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (ryc.h(i) * list.size()) + k(list);
    }

    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof x610) {
            x610 x610Var = (x610) list;
            if (size <= 0) {
                return 0;
            }
            x610Var.e(0);
            throw null;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += ryc.j(((Long) list.get(i)).longValue());
        }
        return iJ;
    }

    public static int l(int i, List list, o2h0 o2h0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iH = ryc.h(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            int iB = ((x3) list.get(i2)).b(o2h0Var);
            iH += ryc.i(iB) + iB;
        }
        return iH;
    }

    public static int m(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (ryc.h(i) * size) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof tjx) {
            tjx tjxVar = (tjx) list;
            if (size <= 0) {
                return 0;
            }
            tjxVar.e(0);
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int iIntValue = ((Integer) list.get(i2)).intValue();
            i += ryc.i((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return i;
    }

    public static int o(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (ryc.h(i) * size) + p(list);
    }

    public static int p(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof x610) {
            x610 x610Var = (x610) list;
            if (size <= 0) {
                return 0;
            }
            x610Var.e(0);
            throw null;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iJ += ryc.j((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iJ;
    }

    public static int q(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iH = ryc.h(i) * size;
        if (!(list instanceof rez)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof og9) {
                    int size2 = ((og9) obj).size();
                    iH = ryc.i(size2) + size2 + iH;
                } else {
                    iH = ryc.g((String) obj) + iH;
                }
                i2++;
            }
            return iH;
        }
        rez rezVar = (rez) list;
        while (i2 < size) {
            Object objX = rezVar.x(i2);
            if (objX instanceof og9) {
                int size3 = ((og9) objX).size();
                iH = ryc.i(size3) + size3 + iH;
            } else {
                iH = ryc.g((String) objX) + iH;
            }
            i2++;
        }
        return iH;
    }

    public static int r(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (ryc.h(i) * size) + s(list);
    }

    public static int s(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof tjx) {
            tjx tjxVar = (tjx) list;
            if (size <= 0) {
                return 0;
            }
            tjxVar.e(0);
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ryc.i(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int t(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (ryc.h(i) * size) + u(list);
    }

    public static int u(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof x610) {
            x610 x610Var = (x610) list;
            if (size <= 0) {
                return 0;
            }
            x610Var.e(0);
            throw null;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += ryc.j(((Long) list.get(i)).longValue());
        }
        return iJ;
    }

    public static zdt0 v(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (zdt0) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void w(zdt0 zdt0Var, Object obj, Object obj2) {
        zdt0Var.getClass();
        jjt jjtVar = (jjt) obj;
        wdt0 wdt0Var = jjtVar.unknownFields;
        wdt0 wdt0Var2 = ((jjt) obj2).unknownFields;
        wdt0 wdt0Var3 = wdt0.f;
        if (!wdt0Var3.equals(wdt0Var2)) {
            if (wdt0Var3.equals(wdt0Var)) {
                int i = wdt0Var.f38990a + wdt0Var2.f38990a;
                int[] iArrCopyOf = Arrays.copyOf(wdt0Var.b, i);
                System.arraycopy(wdt0Var2.b, 0, iArrCopyOf, wdt0Var.f38990a, wdt0Var2.f38990a);
                Object[] objArrCopyOf = Arrays.copyOf(wdt0Var.c, i);
                System.arraycopy(wdt0Var2.c, 0, objArrCopyOf, wdt0Var.f38990a, wdt0Var2.f38990a);
                wdt0Var = new wdt0(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                wdt0Var.getClass();
                if (!wdt0Var2.equals(wdt0Var3)) {
                    if (!wdt0Var.e) {
                        e9d0.b();
                        return;
                    }
                    int i2 = wdt0Var.f38990a + wdt0Var2.f38990a;
                    wdt0Var.a(i2);
                    System.arraycopy(wdt0Var2.b, 0, wdt0Var.b, wdt0Var.f38990a, wdt0Var2.f38990a);
                    System.arraycopy(wdt0Var2.c, 0, wdt0Var.c, wdt0Var.f38990a, wdt0Var2.f38990a);
                    wdt0Var.f38990a = i2;
                }
            }
        }
        jjtVar.unknownFields = wdt0Var;
    }

    public static boolean x(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void y(int i, List list, psc pscVar, boolean z) throws l52 {
        if (list == null || list.isEmpty()) {
            return;
        }
        ryc rycVar = (ryc) pscVar.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                rycVar.p(i, 0);
                rycVar.k(zBooleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        rycVar.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        rycVar.q(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            rycVar.k(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    public static void z(int i, List list, psc pscVar) throws l52 {
        if (list == null || list.isEmpty()) {
            return;
        }
        pscVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ryc rycVar = (ryc) pscVar.b;
            og9 og9Var = (og9) list.get(i2);
            rycVar.p(i, 2);
            rycVar.q(og9Var.size());
            kg9 kg9Var = (kg9) og9Var;
            rycVar.l(kg9Var.d, kg9Var.i(), kg9Var.size());
        }
    }
}

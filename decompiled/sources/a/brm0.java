package a;

import java.util.Date;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class brm0 {
    public static void A(Integer num, Long l, String str, String str2, StringBuilder sb) {
        sb.append(l);
        sb.append(str);
        sb.append(num);
        sb.append(str2);
    }

    public static void B(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
    }

    public static void C(String str, String str2, String str3, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(str2);
        sb.append(z);
        sb.append(str3);
    }

    public static boolean D(Integer num, String str, Pair pair) {
        return pair.equals(new Pair(num, str));
    }

    public static final boolean a(int i) {
        return !foq0.a();
    }

    public static final boolean b(int i) {
        Boolean bool;
        if (foq0.a()) {
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
            } catch (Exception unused) {
                foq0.f9895a.info("Conscrypt is not available or does not support checking for FIPS build.");
                bool = Boolean.FALSE;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ long c(int i) {
        if (i == 1) {
            return 1099511627776L;
        }
        if (i == 2) {
            return 1073741824L;
        }
        if (i == 3) {
            return 1048576L;
        }
        if (i == 4) {
            return 1024L;
        }
        if (i == 5) {
            return 1L;
        }
        throw null;
    }

    public static int d(double d, int i, int i2) {
        return (Double.hashCode(d) + i) * i2;
    }

    public static int e(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static int f(j83 j83Var, int i, int i2) {
        return (j83Var.hashCode() + i) * i2;
    }

    public static int g(y9q0 y9q0Var, int i, int i2) {
        return (y9q0Var.hashCode() + i) * i2;
    }

    public static int h(j1r0 j1r0Var, int i, int i2) {
        return (j1r0Var.hashCode() + i) * i2;
    }

    public static int i(Date date, int i, int i2) {
        return (date.hashCode() + i) * i2;
    }

    public static String j(int i, String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(i);
        sb.append(str3);
        return sb.toString();
    }

    public static String k(long j, String str, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String l(String str, int i, char c) {
        return str + i + c;
    }

    public static String m(StringBuilder sb, double d, String str, String str2) {
        sb.append(str);
        sb.append(d);
        sb.append(str2);
        return sb.toString();
    }

    public static String n(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static String o(StringBuilder sb, boolean z, char c) {
        sb.append(z);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder p(double d, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(d);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder q(int i, long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        sb.append(i);
        return sb;
    }

    public static StringBuilder r(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder s(String str, f2r0 f2r0Var, String str2, j1r0 j1r0Var, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(f2r0Var);
        sb.append(str2);
        sb.append(j1r0Var);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder t(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder u(String str, String str2, String str3, boolean z, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(z);
        sb.append(str4);
        return sb;
    }

    public static void v(int i, String str, String str2, StringBuilder sb, List list) {
        sb.append(list);
        sb.append(str);
        sb.append(i);
        sb.append(str2);
    }

    public static void w(int i, String str, String str2, StringBuilder sb, boolean z) {
        sb.append(i);
        sb.append(str);
        sb.append(z);
        sb.append(str2);
    }

    public static void x(fet fetVar, mm40 mm40Var, shd shdVar, int i, boolean z) {
        jpm0.o(fetVar, mm40Var, shdVar);
        fetVar.e0(i);
        fetVar.r(z);
    }

    public static void y(vln0 vln0Var, tln0 tln0Var, sln0 sln0Var, vln0 vln0Var2, tln0 tln0Var2) {
        urm0 urm0Var = wln0.e;
        sln0Var.a(y2m0.a(vln0Var, tln0Var, urm0Var));
        sln0Var.a(y2m0.a(vln0Var2, tln0Var2, urm0Var));
    }

    public static void z(Boolean bool, Integer num, String str, String str2, StringBuilder sb) {
        sb.append(num);
        sb.append(str);
        sb.append(bool);
        sb.append(str2);
    }
}

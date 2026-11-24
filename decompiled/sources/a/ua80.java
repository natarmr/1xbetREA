package a;

import androidx.fragment.app.Fragment;
import com.huawei.hms.support.log.HMSLog;
import java.util.Arrays;
import java.util.List;
import org.xplatform.uikit.components.dialog.DialogFields;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class ua80 {
    public static int a(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    public static int b(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static int c(q7d0 q7d0Var, String str, int i) {
        q7d0Var.getClass();
        return q7d0Var.a().getInt(str, i);
    }

    public static mm40 d(jm40 jm40Var, float f, fet fetVar, jm40 jm40Var2, float f2) {
        qxw.o(fetVar, o7k0.e(jm40Var, f));
        return o7k0.d(jm40Var2, f2);
    }

    public static String e(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String f(Integer num, String str, String str2, String str3, String str4) {
        return str + num + str2 + str3 + str4;
    }

    public static String g(Long l, String str, String str2, String str3, String str4) {
        return str + l + str2 + str3 + str4;
    }

    public static String h(String str, Integer num, String str2, Integer num2, String str3) {
        return str + num + str2 + num2 + str3;
    }

    public static String i(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String j(String str, String str2, String str3, boolean z, String str4) {
        return str + str2 + str3 + z + str4;
    }

    public static String k(String str, boolean z, String str2, String str3, String str4) {
        return str + z + str2 + str3 + str4;
    }

    public static String l(StringBuilder sb, Integer num, String str, Integer num2, String str2) {
        sb.append(num);
        sb.append(str);
        sb.append(num2);
        sb.append(str2);
        return sb.toString();
    }

    public static String m(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static String n(Object[] objArr, int i, lsm0 lsm0Var, int i2, boolean z) {
        String strA = lsm0Var.a(i2, Arrays.copyOf(objArr, i));
        strA.getClass();
        return z ? ohs0.n(strA, " *") : strA;
    }

    public static StringBuilder o(String str, String str2, String str3, List list, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(list);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    public static void p(int i, ugd ugdVar, jr8 jr8Var, fet fetVar, boolean z) {
        ugdVar.F(jr8Var, fetVar, Integer.valueOf(i));
        fetVar.r(z);
    }

    public static void q(int i, String str, String str2, StringBuilder sb, boolean z) {
        sb.append(z);
        sb.append(str);
        sb.append(i);
        sb.append(str2);
    }

    public static void r(Fragment fragment, ii iiVar, DialogFields dialogFields) {
        androidx.fragment.app.e eVarC = fragment.C();
        eVarC.getClass();
        iiVar.d(dialogFields, eVarC);
    }

    public static void s(Exception exc, StringBuilder sb, String str) {
        sb.append(exc.getMessage());
        HMSLog.e(str, sb.toString());
    }

    public static void t(String str, String str2, String str3, StringBuilder sb, List list) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(list);
    }

    public static void u(String str, String str2, StringBuilder sb, boolean z, boolean z2) {
        sb.append(z);
        sb.append(str);
        sb.append(z2);
        sb.append(str2);
    }

    public static void v(StringBuilder sb, long j, String str, int i) {
        sb.append(j);
        sb.append(str);
        sb.append(i);
    }

    public static void w(StringBuilder sb, Double d, String str, String str2, String str3) {
        sb.append(d);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static boolean x(vwb0 vwb0Var, String str, boolean z) {
        vwb0Var.getClass();
        return vwb0Var.b().getBoolean(str, z);
    }

    public static String y(Object[] objArr, int i, lsm0 lsm0Var, int i2, boolean z) {
        String strA = lsm0Var.a(i2, Arrays.copyOf(objArr, i));
        strA.getClass();
        return z ? ohs0.n(strA, " *") : strA;
    }
}

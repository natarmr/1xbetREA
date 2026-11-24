package a;

import android.view.View;
import androidx.fragment.app.Fragment;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class axq {
    public static int a(int i, int i2, BigDecimal bigDecimal) {
        return (bigDecimal.hashCode() + i) * i2;
    }

    public static int b(zmk0 zmk0Var, int i, int i2) {
        return (zmk0Var.hashCode() + i) * i2;
    }

    public static int c(v5l0 v5l0Var, int i, int i2) {
        return (v5l0Var.hashCode() + i) * i2;
    }

    public static ank0 d(ArrayList arrayList, zmk0 zmk0Var, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        arrayList.add(zmk0Var);
        arrayList2.addAll(arrayList3);
        return new ank0(arrayList4);
    }

    public static sln0 e(ArrayList arrayList, sln0 sln0Var) {
        arrayList.add(sln0Var);
        return new sln0();
    }

    public static Class f(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return p6t0Var.getClass();
    }

    public static String g() {
        String string = UUID.randomUUID().toString();
        string.getClass();
        return string;
    }

    public static String h(long j, String str, String str2) {
        return str + j + str2;
    }

    public static String i(String str, fus fusVar, String str2) {
        return str + fusVar + str2;
    }

    public static String j(String str, p5h0 p5h0Var, String str2) {
        return str + p5h0Var + str2;
    }

    public static String k(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String l(StringBuilder sb, double d, String str) {
        sb.append(d);
        sb.append(str);
        return sb.toString();
    }

    public static String m(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static String n(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder o(long j, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder p(Integer num, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(num);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder q(String str, String str2, String str3, boolean z, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(z);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    public static void r(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static void s(int i, String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(i);
    }

    public static void t(long j, ArrayList arrayList) {
        arrayList.add(new Long(j));
    }

    public static void u(bzu bzuVar, String str, String str2, String str3) {
        bzuVar.g(str);
        bzuVar.g(str2);
        bzuVar.g(str3);
    }

    public static void v(sln0 sln0Var, wln0 wln0Var, vln0 vln0Var, tln0 tln0Var, urm0 urm0Var) {
        sln0Var.a(wln0Var);
        sln0Var.a(y2m0.a(vln0Var, tln0Var, urm0Var));
    }

    public static void w(View view, cp cpVar, Function1 function1) {
        view.getClass();
        function1.invoke(cpVar.u());
    }

    public static void x(Integer num, String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(num);
        sb.append(str3);
    }

    public static boolean y(long j, List list) {
        return list.contains(new Long(j));
    }

    public static boolean z(q7d0 q7d0Var, String str, boolean z) {
        q7d0Var.getClass();
        return q7d0Var.a().getBoolean(str, z);
    }
}

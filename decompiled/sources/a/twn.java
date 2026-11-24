package a;

import com.google.firebase.perf.util.Timer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class twn {
    public static void A(boolean z, p7m0 p7m0Var, Object obj) {
        Boolean boolValueOf = Boolean.valueOf(z);
        p7m0Var.getClass();
        p7m0Var.o(obj, boolValueOf);
    }

    public static long B(fet fetVar, int i, fet fetVar2) {
        fetVar.e0(i);
        return afn0.p(fetVar2).m123getWhite0d7_KjU();
    }

    public static int a(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int b(int i, int i2, int i3, int i4) {
        return ((i - i2) * i3) + i4;
    }

    public static int c(int i, int i2, Object obj) {
        return (j0g0.b(obj) + i) * i2;
    }

    public static int d(uoy uoyVar, int i, int i2) {
        return (uoyVar.hashCode() + i) * i2;
    }

    public static int e(d280 d280Var, int i, int i2) {
        return (d280Var.hashCode() + i) * i2;
    }

    public static int f(ufp0 ufp0Var, int i, int i2) {
        return (ufp0Var.hashCode() + i) * i2;
    }

    public static int g(ArrayList arrayList, int i, int i2) {
        return (arrayList.hashCode() + i) * i2;
    }

    public static long h(fet fetVar, int i, fet fetVar2) {
        fetVar.e0(i);
        return afn0.p(fetVar2).m73getBlack400d7_KjU();
    }

    public static long i(fet fetVar, long j, float f, boolean z) {
        long jP = fbc.P(f, j, afn0.m(fetVar).getSecondary());
        fetVar.r(z);
        return jP;
    }

    public static ycl j(float f, fet fetVar) {
        ycl yclVar = new ycl(f);
        fetVar.o0(yclVar);
        return yclVar;
    }

    public static a4x k(lc00 lc00Var, Collection collection, lc00 lc00Var2) {
        lc00Var.addAll(collection);
        return dyb.o0(kotlin.collections.a.a(lc00Var2));
    }

    public static mm40 l(yx7 yx7Var, mm40 mm40Var) {
        return mm40Var.e(new ecu0(yx7Var));
    }

    public static String m(int i, String str) {
        return str + i;
    }

    public static String n(String str, bem bemVar, String str2) {
        return str + bemVar + str2;
    }

    public static String o(String str, jkm jkmVar, String str2) {
        return str + jkmVar + str2;
    }

    public static String p(String str, String str2, String str3) {
        return new Regex(str).replace(str2, str3);
    }

    public static String q(String str, String str2, String str3, StringBuilder sb, boolean z) {
        sb.append(z);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String r(List list, String str, String str2) {
        return str + list + str2;
    }

    public static ArrayList s(fet fetVar) {
        ArrayList arrayList = new ArrayList();
        fetVar.o0(arrayList);
        return arrayList;
    }

    public static ArrayList t(Object obj) {
        z1x.P(obj);
        return new ArrayList();
    }

    public static ArrayList u(List list) {
        list.getClass();
        return new ArrayList();
    }

    public static void v(int i, ugd ugdVar, fet fetVar, boolean z) {
        ugdVar.invoke(fetVar, Integer.valueOf(i));
        fetVar.r(z);
    }

    public static void w(int i, String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(i);
        sb.append(str3);
    }

    public static void x(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, xqp.b(i));
        map.put(str2, xqp.b(i2));
    }

    public static void y(Timer timer, ml50 ml50Var, ml50 ml50Var2) {
        ml50Var.m(timer.a());
        nl50.c(ml50Var2);
    }

    public static void z(StringBuilder sb, Long l, String str, List list, String str2) {
        sb.append(l);
        sb.append(str);
        sb.append(list);
        sb.append(str2);
    }
}

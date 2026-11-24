package a;

import com.huawei.hms.support.log.HMSLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.responsible_game.impl.navigation.ResponsibleGamblingScreens$ResponsibleGamblingFragmentScreen;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class rz4 {
    public static void A(StringBuilder sb, String str, boolean z, String str2) {
        sb.append(str);
        sb.append(z);
        sb.append(str2);
    }

    public static void B(List list, List list2, List list3, List list4, List list5) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
    }

    public static boolean C(int i, List list) {
        return list.contains(new Integer(i));
    }

    public static int a(a2m a2mVar, int i, int i2) {
        return (a2mVar.hashCode() + i) * i2;
    }

    public static int b(d2m d2mVar, int i, int i2) {
        return (d2mVar.hashCode() + i) * i2;
    }

    public static long c(fet fetVar, int i, fet fetVar2, boolean z) {
        fetVar.e0(i);
        long jM183getTextPrimary0d7_KjU = afn0.m(fetVar2).getTextPrimary();
        fetVar.r(z);
        return jM183getTextPrimary0d7_KjU;
    }

    public static bzu d(String str, String str2, String str3) {
        bzu bzuVar = new bzu((byte) 23);
        bzuVar.g(str);
        bzuVar.g(str2);
        bzuVar.g(str3);
        return bzuVar;
    }

    public static bzu e(String str, String str2, String str3, String str4) {
        bzu bzuVar = new bzu((byte) 23);
        bzuVar.g(str);
        bzuVar.g(str2);
        bzuVar.g(str3);
        bzuVar.g(str4);
        return bzuVar;
    }

    public static x7z f(fet fetVar, int i, float f, boolean z) {
        fetVar.e0(i);
        return new x7z(f, z);
    }

    public static y9v0 g(CopyOnWriteArrayList copyOnWriteArrayList, c8d c8dVar) {
        copyOnWriteArrayList.add(c8dVar);
        return new y9v0((byte) 15);
    }

    public static String h(int i, String str) {
        return str + i;
    }

    public static String i(int i, String str, String str2, String str3, boolean z) {
        return str + i + str2 + z + str3;
    }

    public static String j(int i, String str, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String k(imm immVar, String str, String str2) {
        return str + immVar + str2;
    }

    public static String l(String str, k4i k4iVar, String str2) {
        return str + k4iVar + str2;
    }

    public static String m(StringBuilder sb, a4x a4xVar, String str, boolean z, String str2) {
        sb.append(a4xVar);
        sb.append(str);
        sb.append(z);
        sb.append(str2);
        return sb.toString();
    }

    public static String n(StringBuilder sb, ArrayList arrayList, String str) {
        sb.append(arrayList);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder o(Long l, Long l2, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(l);
        sb.append(str2);
        sb.append(l2);
        sb.append(str3);
        return sb;
    }

    public static ListIterator p(wez wezVar, y9v0 y9v0Var, i1w0 i1w0Var, CopyOnWriteArrayList copyOnWriteArrayList, int i) {
        maz.a(wezVar, y9v0Var);
        return i1w0Var.c().d(copyOnWriteArrayList).listIterator(i);
    }

    public static Map q(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static void r(int i, String str, String str2) {
        HMSLog.i(str2, str + i);
    }

    public static void s(long j, String str, bzu bzuVar) {
        bzuVar.g(j + str);
    }

    public static void t(jm40 jm40Var, float f, fet fetVar, boolean z) {
        qxw.o(fetVar, o7k0.e(jm40Var, f));
        fetVar.r(z);
    }

    public static void u(lme0 lme0Var, k0w0 k0w0Var) {
        lme0Var.getClass();
        k0w0Var.h(new ResponsibleGamblingScreens$ResponsibleGamblingFragmentScreen());
    }

    public static void v(Long l, String str, String str2, String str3, StringBuilder sb) {
        sb.append(l);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void w(StringBuilder sb, double d, String str, int i) {
        sb.append(d);
        sb.append(str);
        sb.append(i);
    }

    public static void x(StringBuilder sb, double d, String str, boolean z) {
        sb.append(d);
        sb.append(str);
        sb.append(z);
    }

    public static void y(StringBuilder sb, Integer num, String str, Integer num2, String str2) {
        sb.append(num);
        sb.append(str);
        sb.append(num2);
        sb.append(str2);
    }

    public static void z(StringBuilder sb, String str, List list, String str2, boolean z) {
        sb.append(list);
        sb.append(str);
        sb.append(z);
        sb.append(str2);
    }
}

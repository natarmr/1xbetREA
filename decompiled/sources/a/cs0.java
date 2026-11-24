package a;

import android.os.Parcel;
import android.os.SystemClock;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class cs0 {
    public static void A(StringBuilder sb, Long l, String str, Long l2, String str2) {
        sb.append(l);
        sb.append(str);
        sb.append(l2);
        sb.append(str2);
    }

    public static void B(StringBuilder sb, String str, String str2, a4x a4xVar, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(a4xVar);
        sb.append(str3);
    }

    public static void C(Throwable th, String str, Throwable th2) {
        th.getClass();
        str.getClass();
        th2.printStackTrace();
    }

    public static long D(fet fetVar, int i, fet fetVar2, boolean z) {
        fetVar.e0(i);
        long jM98getGreen0d7_KjU = afn0.p(fetVar2).m98getGreen0d7_KjU();
        fetVar.r(z);
        return jM98getGreen0d7_KjU;
    }

    public static int a(m0x m0xVar, int i, int i2) {
        return (m0xVar.hashCode() + i) * i2;
    }

    public static int b(a4x a4xVar, int i, int i2) {
        return (a4xVar.hashCode() + i) * i2;
    }

    public static int c(sff0 sff0Var, int i, int i2) {
        return (sff0Var.hashCode() + i) * i2;
    }

    public static long d(long j) {
        Trace.endSection();
        return SystemClock.elapsedRealtimeNanos() - j;
    }

    public static long e(fet fetVar, int i, fet fetVar2, boolean z) {
        fetVar.e0(i);
        long primary = afn0.m(fetVar2).getPrimary();
        fetVar.r(z);
        return primary;
    }

    public static a4x f(lc00 lc00Var, lc00 lc00Var2, ArrayList arrayList) {
        lc00Var.addAll(arrayList);
        return dyb.o0(kotlin.collections.a.a(lc00Var2));
    }

    public static rsy g(String str) {
        xcx.c(str);
        return new rsy();
    }

    public static lc00 h(CopyOnWriteArrayList copyOnWriteArrayList, c8d c8dVar, c8d c8dVar2, i1w0 i1w0Var, CopyOnWriteArrayList copyOnWriteArrayList2) {
        copyOnWriteArrayList.add(c8dVar);
        maz.a(wez.b, new y9v0((byte) 15));
        return i1w0Var.c().d(copyOnWriteArrayList2);
    }

    public static k0w0 i(i1w0 i1w0Var, i1w0 i1w0Var2) {
        i1w0Var.getClass();
        return new k0w0(i1w0Var2);
    }

    public static String j(ql5 ql5Var, String str, String str2) {
        return str + ql5Var + str2;
    }

    public static String k(String str, xdk0 xdk0Var, String str2) {
        return str + xdk0Var + str2;
    }

    public static String l(String str, String str2, List list, String str3, List list2) {
        return str + list + str2 + list2 + str3;
    }

    public static String m(StringBuilder sb, mdm mdmVar, String str) {
        sb.append(mdmVar);
        sb.append(str);
        return sb.toString();
    }

    public static String n(StringBuilder sb, a4x a4xVar, String str) {
        sb.append(a4xVar);
        sb.append(str);
        return sb.toString();
    }

    public static String o(Object[] objArr, int i, Locale locale, String str, StringBuilder sb) {
        sb.append(String.format(locale, str, Arrays.copyOf(objArr, i)));
        return sb.toString();
    }

    public static StringBuilder p(long j, String str, String str2, List list) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        sb.append(list);
        return sb;
    }

    public static StringBuilder q(Integer num, Long l, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(l);
        sb.append(str2);
        sb.append(num);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder r(Integer num, String str, String str2, String str3, List list) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(list);
        sb.append(str2);
        sb.append(num);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder s(Long l, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(l);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    public static Iterator t(List list, Parcel parcel) {
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static List u(long j) {
        return kotlin.collections.a.c(new Long(j));
    }

    public static void v(int i, String str, String str2, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(z);
        sb.append(str2);
        sb.append(i);
    }

    public static void w(Integer num, Long l, String str, String str2, StringBuilder sb) {
        sb.append(num);
        sb.append(str);
        sb.append(l);
        sb.append(str2);
    }

    public static void x(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
    }

    public static void y(String str, String str2, String str3, StringBuilder sb, List list) {
        sb.append(str);
        sb.append(str2);
        sb.append(list);
        sb.append(str3);
    }

    public static void z(StringBuilder sb, Integer num, String str, List list, String str2) {
        sb.append(num);
        sb.append(str);
        sb.append(list);
        sb.append(str2);
    }
}

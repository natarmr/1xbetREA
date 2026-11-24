package a;

import android.gov.nist.javax.sip.header.NameMap;
import android.os.Bundle;
import android.util.Log;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class f140 {
    public static int a(int i, int i2, int i3) {
        return ryc.h(i) + i2 + i3;
    }

    public static int b(int i, int i2, int i3, int i4) {
        return ((i / i2) * i3) + i4;
    }

    public static int c(i4 i4Var, int i, int i2) {
        return (i4Var.hashCode() + i) * i2;
    }

    public static int d(mdm mdmVar, int i, int i2) {
        return (mdmVar.hashCode() + i) * i2;
    }

    public static int e(lpm lpmVar, int i, int i2) {
        return (lpmVar.hashCode() + i) * i2;
    }

    public static int f(n0x n0xVar, int i, int i2) {
        return (n0xVar.hashCode() + i) * i2;
    }

    public static int g(iz30 iz30Var, int i, int i2) {
        return (iz30Var.hashCode() + i) * i2;
    }

    public static int h(Bundle bundle, String str, String str2) {
        str.getClass();
        bundle.getClass();
        return bundle.getInt(str2);
    }

    public static String i(int i, String str) {
        return i + str;
    }

    public static String j(int i, String str, int i2, String str2) {
        return str + i + str2 + i2;
    }

    public static String k(Object obj, String str, String str2) {
        return str + obj + str2;
    }

    public static String l(String str, String str2, Class cls, String str3, Class cls2) {
        NameMap.putNameMap(str, str2);
        NameMap.putNameMap(str3, cls.getName());
        return cls2.getName();
    }

    public static String m(String str, String str2, String str3, a4x a4xVar, String str4) {
        return str + str2 + str3 + a4xVar + str4;
    }

    public static String n(StringBuilder sb, String str, boolean z, String str2) {
        sb.append(str);
        sb.append(z);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder o(long j, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(j);
        return sb;
    }

    public static StringBuilder p(c280 c280Var, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(c280Var);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder q(String str, String str2, String str3, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(z);
        sb.append(str2);
        sb.append(z2);
        sb.append(str3);
        return sb;
    }

    public static void r(String str, String str2, String str3) {
        Log.e(str3, str + str2);
    }

    public static void s(String str, String str2, String str3, StringBuilder sb, boolean z) {
        sb.append(z);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void t(StringBuilder sb, r040 r040Var, String str, int i, String str2) {
        sb.append(r040Var);
        sb.append(str);
        sb.append(i);
        sb.append(str2);
    }

    public static void u(StringBuilder sb, c280 c280Var, String str, c280 c280Var2, String str2) {
        sb.append(c280Var);
        sb.append(str);
        sb.append(c280Var2);
        sb.append(str2);
    }

    public static void v(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static boolean w(jge jgeVar, String str) {
        return Intrinsics.d(jgeVar.a().getKey(), str);
    }

    public static int x(int i, int i2, int i3, int i4) {
        return qyc.d(i) + i2 + i3 + i4;
    }

    public static int y(int i, int i2, int i3, int i4) {
        return ryc.i(i) + i2 + i3 + i4;
    }
}

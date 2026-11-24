package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class rw2 {
    public static /* synthetic */ int A(String str) {
        if (str == null) {
            hny.u("Name is null");
            return 0;
        }
        if (str.equals("INPUT")) {
            return 1;
        }
        if (str.equals("FULLSCREEN")) {
            return 2;
        }
        if (str.equals("ALERT")) {
            return 3;
        }
        if (str.equals("CUSTOM")) {
            return 4;
        }
        if (str.equals("SKIP")) {
            return 5;
        }
        jf4.o("No enum constant com.vk.api.sdk.exceptions.ApiErrorViewType.".concat(str));
        return 0;
    }

    public static float a(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static int b(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static int c(wui0 wui0Var, int i, int i2) {
        return (wui0Var.hashCode() + i) * i2;
    }

    public static mm40 d(mm40 mm40Var, fqj0 fqj0Var, fet fetVar, jm40 jm40Var, float f) {
        qxw.o(fetVar, xbc.c0(mm40Var, fqj0Var));
        return o7k0.e(jm40Var, f);
    }

    public static LayoutInflater e(ViewGroup viewGroup) {
        viewGroup.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        layoutInflaterFrom.getClass();
        return layoutInflaterFrom;
    }

    public static View f(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, ViewGroup viewGroup2, boolean z) {
        layoutInflater.getClass();
        viewGroup.getClass();
        return layoutInflater.inflate(i, viewGroup2, z);
    }

    public static ClassCastException g(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static ClassCastException h(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String i(float f, float f2, String str, String str2, String str3) {
        return str + f + str2 + f2 + str3;
    }

    public static String j(float f, String str, String str2) {
        return str + f + str2;
    }

    public static String k(int i, String str, String str2, String str3, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String l(String str, ijq ijqVar, String str2) {
        return str + ijqVar + str2;
    }

    public static String m(String str, String str2, String str3, StringBuilder sb, List list) {
        sb.append(str);
        sb.append(str2);
        sb.append(list);
        sb.append(str3);
        return sb.toString();
    }

    public static String n(StringBuilder sb, long j, String str, String str2) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
        return sb.toString();
    }

    public static String o(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String p(StringBuilder sb, boolean z, String str) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder q(String str, a4x a4xVar, String str2, a4x a4xVar2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(a4xVar);
        sb.append(str2);
        sb.append(a4xVar2);
        sb.append(str3);
        return sb;
    }

    public static HashMap r(Class cls, v04 v04Var) {
        HashMap map = new HashMap();
        map.put(cls, v04Var);
        return map;
    }

    public static void s(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
    }

    public static void t(int i, fet fetVar, int i2, shd shdVar) {
        fetVar.o0(Integer.valueOf(i));
        fetVar.b(Integer.valueOf(i2), shdVar);
    }

    public static void u(int i, String str, String str2) {
        f1t0.g0(str2, str + i);
    }

    public static void v(long j, String str, StringBuilder sb, boolean z) {
        sb.append(z);
        sb.append(str);
        sb.append(j);
    }

    public static /* synthetic */ void w(Object obj) {
        if (obj == null) {
            return;
        }
        hny.b();
    }

    public static void x(StringBuilder sb, String str, int i, String str2) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
    }

    public static boolean y(p6t0 p6t0Var, p6t0 p6t0Var2, p6t0 p6t0Var3, p6t0 p6t0Var4) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return Intrinsics.d(p6t0Var3, p6t0Var4);
    }

    public static float z(float f, float f2, float f3, float f4) {
        return ((f - f2) / f3) + f4;
    }
}

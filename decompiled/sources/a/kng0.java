package a;

import android.os.Bundle;
import android.os.Parcel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xml.sax.Attributes;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class kng0 {
    public static void A(StringBuilder sb, String str, long j, String str2) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
    }

    public static /* synthetic */ int B(String str) {
        if (str == null) {
            hny.u("Name is null");
            return 0;
        }
        if (str.equals("px")) {
            return 1;
        }
        if (str.equals("em")) {
            return 2;
        }
        if (str.equals("ex")) {
            return 3;
        }
        if (str.equals("in")) {
            return 4;
        }
        if (str.equals("cm")) {
            return 5;
        }
        if (str.equals("mm")) {
            return 6;
        }
        if (str.equals("pt")) {
            return 7;
        }
        if (str.equals("pc")) {
            return 8;
        }
        if (str.equals("percent")) {
            return 9;
        }
        jf4.o("No enum constant com.caverock.androidsvg.SVG.Unit.".concat(str));
        return 0;
    }

    public static int a(zdm0 zdm0Var, int i, int i2) {
        return (zdm0Var.hashCode() + i) * i2;
    }

    public static int b(Attributes attributes, int i) {
        return lsg0.a(attributes.getLocalName(i)).ordinal();
    }

    public static j83 c(StringBuilder sb, h83 h83Var, smk0 smk0Var, int i) {
        h83Var.a(smk0Var, i, sb.length());
        sb.length();
        return h83Var.h();
    }

    public static lxs0 d(qja qjaVar, s43 s43Var, fet fetVar) {
        lxs0 lxs0Var = new lxs0(qjaVar, s43Var);
        fetVar.o0(lxs0Var);
        return lxs0Var;
    }

    public static Integer e(int i, Integer num) {
        return Integer.valueOf(num.intValue() + i);
    }

    public static Object f(k9h0 k9h0Var, Bundle bundle, String str, Map map, String str2) {
        bundle.putString(str, k9h0Var.name());
        return map.get(str2);
    }

    public static String g(tre0 tre0Var, Class cls, StringBuilder sb) {
        sb.append(tre0Var.b(cls));
        return sb.toString();
    }

    public static String h(Integer num, String str, String str2, String str3, List list) {
        return str + num + str2 + list + str3;
    }

    public static String i(String str, d7a d7aVar, String str2) {
        return str + d7aVar + str2;
    }

    public static String j(String str, btk0 btk0Var, String str2, List list, String str3) {
        return str + btk0Var + str2 + list + str3;
    }

    public static String k(String str, String str2) {
        return str + str2;
    }

    public static String l(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String m(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String n(String str, String str2, StringBuilder sb, List list, List list2) {
        sb.append(list);
        sb.append(str);
        sb.append(list2);
        sb.append(str2);
        return sb.toString();
    }

    public static String o(StringBuilder sb, float f, String str) {
        sb.append(f);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder p(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(i);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder q(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder r(long j, String str, String str2, boolean z) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        sb.append(z);
        return sb;
    }

    public static StringBuilder s(Long l, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(l);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder t(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder u(String str, String str2, String str3, a4x a4xVar, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(a4xVar);
        sb.append(str4);
        return sb;
    }

    public static Iterator v(fet fetVar, mm40 mm40Var, shd shdVar, int i, List list) {
        jpm0.o(fetVar, mm40Var, shdVar);
        fetVar.e0(i);
        return list.iterator();
    }

    public static void w(int i, String str, String str2, String str3, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void x(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    public static void y(Parcel parcel, int i, Integer num) {
        parcel.writeInt(i);
        parcel.writeInt(num.intValue());
    }

    public static void z(StringBuilder sb, long j, String str, String str2) {
        sb.append(j);
        sb.append(str);
        sb.append(str2);
    }
}

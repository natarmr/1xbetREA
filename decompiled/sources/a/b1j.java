package a;

import android.gov.nist.core.StackLogger;
import androidx.compose.ui.platform.ComposeView;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class b1j {
    public static void A(StringBuilder sb, jwm jwmVar, String str, jwm jwmVar2, String str2) {
        sb.append(jwmVar);
        sb.append(str);
        sb.append(jwmVar2);
        sb.append(str2);
    }

    public static void B(List list, List list2, List list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
    }

    public static boolean C(hrj hrjVar, Locale locale, String str) {
        String lowerCase = hrjVar.toString().toLowerCase(locale);
        lowerCase.getClass();
        return Intrinsics.d(str, lowerCase);
    }

    public static boolean a(int i, int i2, int i3) {
        switch (i) {
            case 1:
                return ((i2 + i3) & 1) == 0;
            case 2:
                return (i2 & 1) == 0;
            case 3:
                return i3 % 3 == 0;
            case 4:
                return (i2 + i3) % 3 == 0;
            case 5:
                return (((i3 / 3) + (i2 / 2)) & 1) == 0;
            case 6:
                return (i2 * i3) % 6 == 0;
            case 7:
                return (i2 * i3) % 6 < 3;
            default:
                return ((((i2 * i3) % 3) + (i2 + i3)) & 1) == 0;
        }
    }

    public static /* synthetic */ byte b(int i) {
        byte b = 1;
        if (i != 1) {
            b = 2;
            if (i != 2) {
                b = 3;
                if (i != 3) {
                    if (i == 4) {
                        return (byte) 4;
                    }
                    throw null;
                }
            }
        }
        return b;
    }

    public static int c(dkk dkkVar, int i, int i2) {
        return (dkkVar.hashCode() + i) * i2;
    }

    public static int d(jwm jwmVar, int i, int i2) {
        return (jwmVar.hashCode() + i) * i2;
    }

    public static long e(fet fetVar, int i, fet fetVar2, boolean z) {
        fetVar.e0(i);
        long jM121getTransparent0d7_KjU = afn0.p(fetVar2).m121getTransparent0d7_KjU();
        fetVar.r(z);
        return jM121getTransparent0d7_KjU;
    }

    public static m460 f(int i, fet fetVar, boolean z) {
        fetVar.e0(i);
        fetVar.r(z);
        return new m460();
    }

    public static String g(int i, String str, String str2, Throwable th) {
        return str + i + str2 + th;
    }

    public static String h(int i, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String i(Class cls, String str) {
        return (str + cls).toString();
    }

    public static String j(String str, mdm mdmVar, String str2) {
        return str + mdmVar + str2;
    }

    public static String k(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String l(StringBuilder sb, jwm jwmVar, String str, jwm jwmVar2, String str2) {
        sb.append(jwmVar);
        sb.append(str);
        sb.append(jwmVar2);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder m(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder n(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static ListIterator o(i1w0 i1w0Var, CopyOnWriteArrayList copyOnWriteArrayList, int i) {
        return i1w0Var.c().d(copyOnWriteArrayList).listIterator(i);
    }

    public static ListIterator p(CopyOnWriteArrayList copyOnWriteArrayList, c8d c8dVar, i1w0 i1w0Var, CopyOnWriteArrayList copyOnWriteArrayList2, int i) {
        copyOnWriteArrayList.add(c8dVar);
        return i1w0Var.c().d(copyOnWriteArrayList2).listIterator(i);
    }

    public static CopyOnWriteArrayList q(i1w0 i1w0Var) {
        i1w0Var.getClass();
        return new CopyOnWriteArrayList();
    }

    public static void r(int i, s1p s1pVar, long j) {
        s1pVar.a(cui0.b(new i1p(i, (byte) 2)), j);
    }

    public static void s(akk akkVar, int i) {
        akkVar.setBackground(epv0.U(i, akkVar.getContext()));
    }

    public static void t(ComposeView composeView, ugd ugdVar) {
        pkd.i(composeView, new shd((byte) 15), ugdVar);
    }

    public static void u(Integer num, String str, String str2, String str3, StringBuilder sb) {
        sb.append(num);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void v(String str, s1p s1pVar, long j) {
        s1pVar.a(cui0.b(new j1p(str, (byte) 0)), j);
    }

    public static void w(String str, Integer num, kt2 kt2Var, String str2) {
        kt2Var.a(str2, wp20.b(new Pair(str, num)));
    }

    public static void x(String str, String str2, StackLogger stackLogger) {
        stackLogger.logDebug(str + str2);
    }

    public static void y(String str, String str2, StringBuilder sb, List list, List list2) {
        sb.append(list);
        sb.append(str);
        sb.append(list2);
        sb.append(str2);
    }

    public static void z(String str, Throwable th) {
        th.getClass();
        str.getClass();
        th.printStackTrace();
    }
}

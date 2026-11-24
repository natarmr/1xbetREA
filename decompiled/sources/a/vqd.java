package a;

import android.app.Application;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import java.util.List;
import java.util.Locale;
import kotlin.text.StringsKt;
import org.xplatform.cyber.game.counterstrike.impl.presentation.statistic.tablet.Cs2StatisticTabletView;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class vqd {
    public static boolean A(String str, Locale locale, String str2, boolean z) {
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        return StringsKt.O(lowerCase, str2, z);
    }

    public static /* synthetic */ String B(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static int a(int i, int i2, int i3, int i4) {
        return (i * i2) + i3 + i4;
    }

    public static int b(q4f q4fVar, int i, int i2) {
        return (q4fVar.hashCode() + i) * i2;
    }

    public static int c(u3i u3iVar, int i, int i2) {
        return (u3iVar.hashCode() + i) * i2;
    }

    public static int d(ViewGroup viewGroup, int i) {
        return viewGroup.getContext().getResources().getDimensionPixelSize(i);
    }

    public static h9b e(String str, String str2) {
        str.getClass();
        return new h9b(str2);
    }

    public static n5d0 f(k6i k6iVar, int i) {
        return n0k0.a(new r5i(k6iVar, i, (byte) 1));
    }

    public static n5d0 g(k6i k6iVar, db dbVar, int i) {
        return n0k0.a(new c7i(k6iVar, dbVar, i, (byte) 0));
    }

    public static n5d0 h(g8i g8iVar, int i) {
        return mbl.b(new f8i(g8iVar, i));
    }

    public static Application i(Fragment fragment) {
        Application application = fragment.n0().getApplication();
        application.getClass();
        return application;
    }

    public static Object j(fet fetVar, int i, boolean z, p4 p4Var) {
        fetVar.e0(i);
        fetVar.r(z);
        return p4Var.y0();
    }

    public static String k(int i, int i2, String str) {
        return str.substring(i2, str.length() - i);
    }

    public static String l(Integer num, String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(num);
        sb.append(str3);
        return sb.toString();
    }

    public static String m(String str, uid uidVar, String str2) {
        return str + uidVar + str2;
    }

    public static String n(String str, sjd sjdVar, String str2) {
        return str + sjdVar + str2;
    }

    public static String o(String str, StringBuilder sb) {
        return str + ((Object) sb);
    }

    public static String p(StringBuilder sb, String str, int i, String str2) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder q(int i, long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(j);
        return sb;
    }

    public static StringBuilder r(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder s(String str, double d, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(d);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static void t(int i, ugd ugdVar, y5d y5dVar, fet fetVar, boolean z) {
        ugdVar.F(y5dVar, fetVar, Integer.valueOf(i));
        fetVar.r(z);
    }

    public static void u(int i, fet fetVar, shd shdVar, fet fetVar2) {
        jpm0.o(fetVar, Integer.valueOf(i), shdVar);
        jpm0.n(fetVar2);
    }

    public static void v(StringBuilder sb, float f, String str, float f2, String str2) {
        sb.append(f);
        sb.append(str);
        sb.append(f2);
        sb.append(str2);
    }

    public static void w(StringBuilder sb, Double d, String str, Double d2, String str2) {
        sb.append(d);
        sb.append(str);
        sb.append(d2);
        sb.append(str2);
    }

    public static void x(StringBuilder sb, Float f, String str, Float f2, String str2) {
        sb.append(f);
        sb.append(str);
        sb.append(f2);
        sb.append(str2);
    }

    public static void y(StringBuilder sb, String str, List list, String str2, boolean z) {
        sb.append(z);
        sb.append(str);
        sb.append(list);
        sb.append(str2);
    }

    public static void z(Cs2StatisticTabletView cs2StatisticTabletView, ank0 ank0Var, TextView textView) {
        Context context = cs2StatisticTabletView.getContext();
        context.getClass();
        textView.setText(ank0Var.b(context));
    }
}

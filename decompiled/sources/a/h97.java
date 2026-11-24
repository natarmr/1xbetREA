package a;

import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import org.xplatform.statistic.stage.impl.champ_statistic_tour_net.presentation.view.bracket.BracketItemView;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class h97 {
    public static boolean A(wyu wyuVar, s9m0 s9m0Var) {
        uaq0 uaq0VarA = wyuVar.a();
        s9m0Var.getClass();
        return s9m0.j(uaq0VarA);
    }

    public static boolean B(Bundle bundle, String str, String str2) {
        str.getClass();
        bundle.getClass();
        return str.equals(str2);
    }

    public static /* synthetic */ String C(int i) {
        if (i == 1) {
            return "DECLARATION";
        }
        if (i == 2) {
            return "FAKE_OVERRIDE";
        }
        if (i != 3) {
            return i != 4 ? "null" : "SYNTHESIZED";
        }
        return "DELEGATION";
    }

    public static int a(imm immVar, int i, int i2) {
        return (immVar.hashCode() + i) * i2;
    }

    public static int b(mm40 mm40Var, fqj0 fqj0Var, fet fetVar, int i, int i2, int i3) {
        zq8.a(i, fetVar, xbc.c0(mm40Var, fqj0Var));
        return i2 + i3;
    }

    public static int c(l7m0 l7m0Var, int i, int i2) {
        return (l7m0Var.hashCode() + i) * i2;
    }

    public static int d(BracketItemView bracketItemView, int i) {
        return bracketItemView.getContext().getResources().getDimensionPixelSize(i);
    }

    public static mm40 e(zcl zclVar, zcl zclVar2, zcl zclVar3, zcl zclVar4, mm40 mm40Var) {
        return lgb.J(mm40Var, new ugg0(zclVar, zclVar2, zclVar3, zclVar4));
    }

    public static ch80 f(float f, float f2, float f3, float f4, fet fetVar) {
        return knm0.g(new lh80(f, f2, f3, f4), fetVar);
    }

    public static y9q0 g(fet fetVar) {
        afn0.v(fetVar).getClass();
        return g1t0.n();
    }

    public static String h(long j, String str) {
        return str + j;
    }

    public static String i(a4x a4xVar, String str, String str2) {
        return str + a4xVar + str2;
    }

    public static String j(Integer num, String str, String str2) {
        return str + num + str2;
    }

    public static String k(String str, ra10 ra10Var, String str2) {
        return str + ra10Var + str2;
    }

    public static StringBuilder l(int i, String str, String str2, String str3, boolean z) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(z);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder m(Integer num, Long l, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(num);
        sb.append(str2);
        sb.append(l);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder n(Integer num, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(num);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    public static Iterator o(fet fetVar, mm40 mm40Var, shd shdVar, int i, a4x a4xVar) {
        jpm0.o(fetVar, mm40Var, shdVar);
        fetVar.e0(i);
        return a4xVar.iterator();
    }

    public static void p(int i, ugd ugdVar, zhg0 zhg0Var, fet fetVar, boolean z) {
        ugdVar.F(zhg0Var, fetVar, Integer.valueOf(i));
        fetVar.r(z);
    }

    public static void q(int i, fet fetVar, Function2 function2, boolean z) {
        function2.invoke(fetVar, Integer.valueOf(i));
        fetVar.r(z);
    }

    public static void r(long j, s1p s1pVar, long j2) {
        s1pVar.a(cui0.b(new i1p((byte) 2, j)), j2);
    }

    public static void s(mm40 mm40Var, fqj0 fqj0Var, fet fetVar, boolean z) {
        qxw.o(fetVar, xbc.c0(mm40Var, fqj0Var));
        fetVar.r(z);
    }

    public static void t(ComposeView composeView, owp0 owp0Var, ugd ugdVar) {
        pkd.h(composeView, owp0Var, new shd((byte) 14), ugdVar);
    }

    public static void u(Boolean bool, Integer num, String str, String str2, StringBuilder sb) {
        sb.append(bool);
        sb.append(str);
        sb.append(num);
        sb.append(str2);
    }

    public static void v(Boolean bool, String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(bool);
        sb.append(str3);
    }

    public static void w(Long l, String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(l);
        sb.append(str3);
    }

    public static void x(String str, Long l, kt2 kt2Var, String str2) {
        kt2Var.a(str2, wp20.b(new Pair(str, l)));
    }

    public static void y(String str, String str2, String str3, StringBuilder sb, List list) {
        sb.append(list);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void z(StringBuilder sb, l7m0 l7m0Var, String str, l7m0 l7m0Var2, String str2) {
        sb.append(l7m0Var);
        sb.append(str);
        sb.append(l7m0Var2);
        sb.append(str2);
    }
}

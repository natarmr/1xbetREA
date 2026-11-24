package a;

import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen$Companion$invoke$1;

/* JADX INFO: loaded from: classes.dex */
public final class usd implements kotlin.coroutines.f, xyk {
    public /* synthetic */ usd(Object obj) {
    }

    public static String a(String str) {
        a4j a4jVar = (a4j) a4j.d.get(str);
        return a4jVar != null ? a4jVar.b : "aggregator_main";
    }

    public static float c(v500 v500Var, q500 q500Var) {
        float yChartMax = q500Var.getYChartMax();
        float yChartMin = q500Var.getYChartMin();
        u500 lineData = q500Var.getLineData();
        if (v500Var.p > 0.0f && v500Var.q < 0.0f) {
            return 0.0f;
        }
        if (lineData.f22495a > 0.0f) {
            yChartMax = 0.0f;
        }
        if (lineData.b < 0.0f) {
            yChartMin = 0.0f;
        }
        return v500Var.q >= 0.0f ? yChartMin : yChartMax;
    }

    public static void d(Fragment fragment) {
        fragment.getClass();
        n6r n6rVarK = fragment.K();
        n6rVarK.b();
        n6rVarK.c.a(new tvj(new yfg(fragment, (byte) 2), null, null, 59));
    }

    public static void e(androidx.fragment.app.e eVar, String str) {
        str.getClass();
        eVar.getClass();
        ebj ebjVar = new ebj();
        ebjVar.h2.x(ebjVar, ebj.j2[1], str);
        ebjVar.H0(eVar, "DataRetrievalErrorDialog");
    }

    public FragmentScreen$Companion$invoke$1 b() {
        return new FragmentScreen$Companion$invoke$1(null, new c99(this), true);
    }
}

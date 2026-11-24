package a;

import android.content.Context;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class y2e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hsd f41900a;
    public final double b;
    public final double c;
    public final x2e0 d;
    public final x2e0 e;

    public y2e0(Context context, g2e0 g2e0Var) {
        yk5 yk5Var = new yk5();
        double dNextDouble = new Random().nextDouble();
        double dNextDouble2 = new Random().nextDouble();
        hsd hsdVarE = hsd.e();
        this.d = null;
        this.e = null;
        boolean z = false;
        if (!(0.0d <= dNextDouble && dNextDouble < 1.0d)) {
            jf4.o("Sampling bucket ID should be in range [0.0, 1.0).");
            throw null;
        }
        if (0.0d <= dNextDouble2 && dNextDouble2 < 1.0d) {
            z = true;
        }
        if (!z) {
            jf4.o("Fragment sampling bucket ID should be in range [0.0, 1.0).");
            throw null;
        }
        this.b = dNextDouble;
        this.c = dNextDouble2;
        this.f41900a = hsdVarE;
        this.d = new x2e0(g2e0Var, yk5Var, hsdVarE, "Trace");
        this.e = new x2e0(g2e0Var, yk5Var, hsdVarE, "Network");
        gut0.a(context);
    }

    public static boolean a(amx amxVar) {
        return amxVar.size() > 0 && ((rd90) amxVar.get(0)).t() > 0 && ((rd90) amxVar.get(0)).s() == 2;
    }
}

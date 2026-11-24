package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class yf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xf1 f42519a;

    public /* synthetic */ yf1(xf1 xf1Var) {
        this.f42519a = xf1Var;
    }

    public ArrayList a(uaq0 uaq0Var) {
        List list = xf1.d;
        int i = 0;
        boolean zO = StringsKt.O(this.f42519a.c.c(), "ru", false);
        String strValueOf = String.valueOf(1);
        list.getClass();
        strValueOf.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            vf1 vf1Var = (vf1) obj;
            String strValueOf2 = String.valueOf(i2);
            String str = zO ? "/ru/" : "/en/";
            uaq0.f35345a.getClass();
            String str2 = "_l";
            if (!s9m0.j(uaq0Var)) {
                if (s9m0.i(uaq0Var)) {
                    str2 = "_d";
                } else if (s9m0.k(uaq0Var)) {
                    str2 = "_n";
                }
            }
            arrayList.add(new qf1(vf1Var, axq.n(b1j.n("static/img/android/instructions/onboarding_casino", Separators.SLASH.concat(strValueOf), "/gifts", str, strValueOf2), str2, ".png")));
            i = i2;
        }
        return arrayList;
    }
}

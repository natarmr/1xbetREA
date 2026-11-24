package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class xlu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v650 f41092a;

    public /* synthetic */ xlu(v650 v650Var) {
        this.f41092a = v650Var;
    }

    public ArrayList a(uaq0 uaq0Var) {
        List list = v650.d;
        int i = 0;
        boolean zO = StringsKt.O(this.f41092a.c.c(), "ru", false);
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
            t650 t650Var = (t650) obj;
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
            arrayList.add(new q650(t650Var, axq.n(b1j.n("static/img/android/instructions/onboarding_casino", Separators.SLASH.concat(strValueOf), "/casino", str, strValueOf2), str2, ".webp")));
            i = i2;
        }
        return arrayList;
    }
}

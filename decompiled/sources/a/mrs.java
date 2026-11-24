package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class mrs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lrs f22287a;

    public /* synthetic */ mrs(lrs lrsVar) {
        this.f22287a = lrsVar;
    }

    public ArrayList a(uaq0 uaq0Var) {
        List list = lrs.d;
        int i = 0;
        boolean zO = StringsKt.O(this.f22287a.c.c(), "ru", false);
        list.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            krs krsVar = (krs) obj;
            String strValueOf = String.valueOf(i2);
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
            arrayList.add(new jrs(krsVar, b1j.k("static/img/android/instructions/gamescreenadvanced", str, strValueOf, str2, ".png")));
            i = i2;
        }
        return arrayList;
    }
}

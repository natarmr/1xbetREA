package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class sdj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rdj0 f32038a;

    public /* synthetic */ sdj0(rdj0 rdj0Var) {
        this.f32038a = rdj0Var;
    }

    public ArrayList a(uaq0 uaq0Var) {
        List list = rdj0.d;
        int i = 0;
        boolean zO = StringsKt.O(this.f32038a.c.c(), "ru", false);
        list.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            qdj0 qdj0Var = (qdj0) obj;
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
            arrayList.add(new pdj0(qdj0Var, b1j.k("/static/img/android/instructions/onboarding_new_settings", str, strValueOf, str2, ".png")));
            i = i2;
        }
        return arrayList;
    }
}

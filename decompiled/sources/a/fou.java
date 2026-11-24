package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class fou {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final khb0 f9900a;

    public fou(khb0 khb0Var, byte b) {
        khb0Var.getClass();
        switch (b) {
            case 1:
                this.f9900a = khb0Var;
                break;
            default:
                this.f9900a = khb0Var;
                break;
        }
    }

    public ArrayList a(uaq0 uaq0Var) {
        khb0 khb0Var = this.f9900a;
        khb0Var.getClass();
        List list = khb0.d;
        int i = 0;
        boolean zO = StringsKt.O(khb0Var.c.c(), "ru", false);
        list.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            jhb0 jhb0Var = (jhb0) obj;
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
            arrayList.add(new bhb0(jhb0Var, b1j.k("static/img/android/instructions/mlpopu", str, strValueOf, str2, ".png")));
            i = i2;
        }
        return arrayList;
    }
}

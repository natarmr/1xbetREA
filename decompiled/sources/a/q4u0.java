package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class q4u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final iun f28120a = iun.f15405a;

    static {
        int i = y3d.h;
    }

    public static final List a(String str) {
        if (str == null) {
            return f28120a;
        }
        kd30 kd30Var = new kd30((byte) 6);
        ArrayList arrayList = (ArrayList) kd30Var.f18086a;
        if (arrayList == null) {
            arrayList = new ArrayList();
            kd30Var.f18086a = arrayList;
        } else {
            arrayList.clear();
        }
        kd30Var.R(str, arrayList);
        ArrayList arrayList2 = (ArrayList) kd30Var.f18086a;
        return arrayList2 != null ? arrayList2 : iun.f15405a;
    }
}

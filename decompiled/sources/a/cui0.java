package a;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class cui0 {
    public static yni0 a(Set set) {
        set.getClass();
        yni0 yni0Var = (yni0) set;
        jo20 jo20Var = yni0Var.f42943a;
        jo20Var.b();
        return jo20Var.i > 0 ? yni0Var : yni0.c;
    }

    public static Set b(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        setSingleton.getClass();
        return setSingleton;
    }
}

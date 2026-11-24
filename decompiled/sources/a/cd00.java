package a;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cd00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yc00 f4137a = new yc00();
    public static final ad00 b = new ad00();

    public void a(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) ift0.j(obj, j);
        if (list instanceof sez) {
            objUnmodifiableList = ((sez) list).d();
        } else {
            if (yc00.c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof sjx) && (list instanceof amx)) {
                n4 n4Var = (n4) ((amx) list);
                boolean z = n4Var.f22873a;
                if (z && z) {
                    n4Var.f22873a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        ift0.p(obj, j, objUnmodifiableList);
    }

    public abstract void b(Object obj, long j, Object obj2);
}

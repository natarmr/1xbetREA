package a;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dd00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zc00 f5871a = new zc00();
    public static final bd00 b = new bd00();

    public void a(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) hft0.j(obj, j);
        if (list instanceof rez) {
            objUnmodifiableList = ((rez) list).d();
        } else {
            if (zc00.c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof awb0) && (list instanceof zlx)) {
                m4 m4Var = (m4) ((zlx) list);
                if (m4Var.f21141a) {
                    m4Var.f21141a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        hft0.q(obj, j, objUnmodifiableList);
    }

    public void b(Object obj, long j, Object obj2) {
        List list = (List) hft0.j(obj2, j);
        List listD = zc00.d(obj, list.size(), j);
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        hft0.q(obj, j, list);
    }

    public List c(Object obj, long j) {
        return zc00.d(obj, 10, j);
    }
}

package a;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fqe0 extends dqe0 {
    public final Object[] b;

    public fqe0(g950 g950Var, Object[] objArr) {
        super(g950Var);
        this.b = objArr;
    }

    public final ArrayList a() {
        dqe0 nqe0Var;
        Object[] objArr = this.b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            obj.getClass();
            Class<?> cls = obj.getClass();
            List list = bqe0.f3025a;
            if (Enum.class.isAssignableFrom(cls)) {
                nqe0Var = new rqe0(null, (Enum) obj);
            } else if (obj instanceof Annotation) {
                nqe0Var = new eqe0(null, (Annotation) obj);
            } else if (obj instanceof Object[]) {
                nqe0Var = new fqe0(null, (Object[]) obj);
            } else {
                nqe0Var = obj instanceof Class ? new nqe0(null, (Class) obj) : new tqe0(null, obj);
            }
            arrayList.add(nqe0Var);
        }
        return arrayList;
    }
}

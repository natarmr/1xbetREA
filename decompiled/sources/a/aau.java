package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class aau {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ugf0 f548a;

    public /* synthetic */ aau(ugf0 ugf0Var) {
        this.f548a = ugf0Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003c  */
    /* JADX WARN: Code duplicated, block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x0040 A[RETURN] */
    public Object a(sys0 sys0Var, s77 s77Var, List list, bnn0 bnn0Var) {
        Object obj;
        Object obj2;
        Object obj3;
        wne wneVar;
        tnm0 tnm0Var = (tnm0) this.f548a.f35622a;
        List list2 = (List) tnm0Var.c(sys0Var).get(s77Var);
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        if (!sj3.n0(list, list2)) {
            tnm0Var.c(sys0Var).put(s77Var, list);
            qoj0 qoj0Var = tnm0Var.f34244a;
            obj = Unit.f46060a;
            Object objA = qoj0Var.a(obj, bnn0Var);
            if (objA == wne.f39444a) {
                obj3 = obj;
                obj = objA;
                obj2 = obj3;
            }
            wneVar = wne.f39444a;
            if (obj != wneVar) {
                obj = obj2;
            }
            if (obj == wneVar) {
                return obj;
            }
            return obj3;
        }
        obj = Unit.f46060a;
        obj2 = obj;
        obj3 = obj2;
        wneVar = wne.f39444a;
        if (obj != wneVar) {
            obj = obj2;
        }
        if (obj == wneVar) {
            return obj;
        }
        return obj3;
    }
}

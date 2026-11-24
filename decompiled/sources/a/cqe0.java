package a;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class cqe0 extends qqe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Annotation f4791a;

    public cqe0(Annotation annotation) {
        annotation.getClass();
        this.f4791a = annotation;
    }

    public final ArrayList b() throws IllegalAccessException, InvocationTargetException {
        dqe0 nqe0Var;
        Annotation annotation = this.f4791a;
        Method[] declaredMethods = azw.G(azw.F(annotation)).getDeclaredMethods();
        declaredMethods.getClass();
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object objInvoke = method.invoke(annotation, null);
            objInvoke.getClass();
            g950 g950VarE = g950.e(method.getName());
            Class<?> cls = objInvoke.getClass();
            List list = bqe0.f3025a;
            if (Enum.class.isAssignableFrom(cls)) {
                nqe0Var = new rqe0(g950VarE, (Enum) objInvoke);
            } else if (objInvoke instanceof Annotation) {
                nqe0Var = new eqe0(g950VarE, (Annotation) objInvoke);
            } else if (objInvoke instanceof Object[]) {
                nqe0Var = new fqe0(g950VarE, (Object[]) objInvoke);
            } else {
                nqe0Var = objInvoke instanceof Class ? new nqe0(g950VarE, (Class) objInvoke) : new tqe0(g950VarE, objInvoke);
            }
            arrayList.add(nqe0Var);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cqe0) {
            return this.f4791a == ((cqe0) obj).f4791a;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f4791a);
    }

    public final String toString() {
        return cqe0.class.getName() + ": " + this.f4791a;
    }
}

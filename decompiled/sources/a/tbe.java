package a;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tbe implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sgy f33659a;
    public final eto b;

    public tbe(sgy sgyVar, eto etoVar) {
        sgyVar.getClass();
        this.f33659a = sgyVar;
        this.b = etoVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        obj.getClass();
        method.getClass();
        boolean zD = Intrinsics.d(method.getName(), "accept");
        eto etoVar = this.b;
        if (zD && objArr != null && objArr.length == 1) {
            Object obj2 = objArr[0];
            sgy sgyVar = this.f33659a;
            sgyVar.getClass();
            if (sgyVar.r(obj2)) {
                obj2.getClass();
                etoVar.invoke(obj2);
                return Unit.f46060a;
            }
            throw new ClassCastException("Value cannot be cast to " + sgyVar.v());
        }
        if (Intrinsics.d(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(obj == objArr[0]);
        }
        if (Intrinsics.d(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            return Integer.valueOf(etoVar.hashCode());
        }
        if (Intrinsics.d(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
            return etoVar.toString();
        }
        throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
    }
}

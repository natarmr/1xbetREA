package a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class vv90 {
    public void a(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        th.getClass();
        th2.getClass();
        Method method = uv90.b;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public List b(Throwable th) {
        Object objInvoke;
        th.getClass();
        Method method = uv90.c;
        if (method == null || (objInvoke = method.invoke(th, null)) == null) {
            return iun.f15405a;
        }
        List listAsList = Arrays.asList((Throwable[]) objInvoke);
        listAsList.getClass();
        return listAsList;
    }
}

package a;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class w9g0 implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f38779a = new Object[0];
    public final /* synthetic */ Class b;
    public final /* synthetic */ y9g0 c;

    public w9g0(y9g0 y9g0Var, Class cls) {
        this.c = y9g0Var;
        this.b = cls;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x006a A[SYNTHETIC] */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        jii0 jii0VarA;
        Object obj2;
        Class cls = this.b;
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.f38779a;
        }
        Object[] objArr2 = objArr;
        gle0 gle0Var = ov90.b;
        if (gle0Var.f(method)) {
            return gle0Var.e(method, cls, obj, objArr2);
        }
        y9g0 y9g0Var = this.c;
        while (true) {
            Object objPutIfAbsent = y9g0Var.f42245a.get(method);
            if (!(objPutIfAbsent instanceof jii0)) {
                if (objPutIfAbsent != null) {
                    synchronized (objPutIfAbsent) {
                        obj2 = y9g0Var.f42245a.get(method);
                        if (obj2 == null) {
                            jii0VarA = (jii0) obj2;
                            break;
                        }
                    }
                } else {
                    Object obj3 = new Object();
                    synchronized (obj3) {
                        try {
                            objPutIfAbsent = y9g0Var.f42245a.putIfAbsent(method, obj3);
                            if (objPutIfAbsent != null) {
                                synchronized (objPutIfAbsent) {
                                    try {
                                        obj2 = y9g0Var.f42245a.get(method);
                                        if (obj2 == null) {
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                jii0VarA = (jii0) obj2;
                                break;
                            }
                            try {
                                jii0VarA = jii0.a(y9g0Var, cls, method);
                                y9g0Var.f42245a.put(method, jii0VarA);
                                break;
                            } catch (Throwable th2) {
                                y9g0Var.f42245a.remove(method);
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            } else {
                jii0VarA = (jii0) objPutIfAbsent;
                break;
            }
        }
        wtw wtwVar = (wtw) jii0VarA;
        return wtwVar.b(new jf60(wtwVar.f39763a, obj, objArr2, wtwVar.b, wtwVar.c), objArr2);
    }
}

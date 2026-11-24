package a;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zw5 implements yje, xne, Serializable {
    private final yje<Object> completion;

    public zw5(yje yjeVar) {
        this.completion = yjeVar;
    }

    public yje<Unit> create(yje<?> yjeVar) {
        yjeVar.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public xne getCallerFrame() {
        yje<Object> yjeVar = this.completion;
        if (yjeVar instanceof xne) {
            return (xne) yjeVar;
        }
        return null;
    }

    public final yje<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        pjj pjjVar = (pjj) getClass().getAnnotation(pjj.class);
        String str = null;
        if (pjjVar == null || pjjVar.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? pjjVar.l()[iIntValue] : -1;
        mn40.f22071a.getClass();
        ln40 ln40Var = mn40.c;
        ln40 ln40Var2 = mn40.b;
        if (ln40Var == null) {
            try {
                ln40 ln40Var3 = new ln40(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                mn40.c = ln40Var3;
                ln40Var = ln40Var3;
            } catch (Exception unused2) {
                mn40.c = ln40Var2;
                ln40Var = ln40Var2;
            }
        }
        if (ln40Var != ln40Var2 && (method = ln40Var.f20326a) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = ln40Var.b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = ln40Var.c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = pjjVar.c();
        } else {
            strC = str + '/' + pjjVar.c();
        }
        return new StackTraceElement(strC, pjjVar.m(), pjjVar.f(), i);
    }

    public Object invokeSuspend(Object obj) {
        z1x.P(obj);
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // a.yje
    public final void resumeWith(Object obj) {
        ?? r2 = this;
        while (true) {
            zw5 zw5Var = (zw5) r2;
            yje<Object> yjeVar = zw5Var.completion;
            yjeVar.getClass();
            try {
                obj = zw5Var.invokeSuspend(obj);
                if (obj == wne.f39444a) {
                    return;
                } else {
                    e0g0 e0g0Var = j0g0.b;
                }
            } catch (Throwable th) {
                e0g0 e0g0Var2 = j0g0.b;
                obj = new g0g0(th);
            }
            zw5Var.releaseIntercepted();
            if (!(yjeVar instanceof zw5)) {
                yjeVar.resumeWith(obj);
                return;
            }
            r2 = yjeVar;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public yje<Unit> create(Object obj, yje<?> yjeVar) {
        yjeVar.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}

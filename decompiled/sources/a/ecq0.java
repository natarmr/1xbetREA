package a;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ecq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pfw f7579a = new pfw("NO_THREAD_ELEMENTS", (byte) 6);
    public static final zgp0 b = new zgp0(25);
    public static final zgp0 c = new zgp0(26);
    public static final zgp0 d = new zgp0(27);

    public static final void a(CoroutineContext coroutineContext, Object obj) {
        if (obj == f7579a) {
            return;
        }
        if (!(obj instanceof lcq0)) {
            Object objFold = coroutineContext.fold(null, c);
            objFold.getClass();
            ((dcq0) objFold).k(obj);
            return;
        }
        lcq0 lcq0Var = (lcq0) obj;
        dcq0[] dcq0VarArr = lcq0Var.c;
        int length = dcq0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            dcq0 dcq0Var = dcq0VarArr[length];
            dcq0Var.getClass();
            dcq0Var.k(lcq0Var.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    public static final Object b(CoroutineContext coroutineContext) {
        Object objFold = coroutineContext.fold(0, b);
        objFold.getClass();
        return objFold;
    }

    public static final Object c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        if (obj == 0) {
            return f7579a;
        }
        return obj instanceof Integer ? coroutineContext.fold(new lcq0(((Number) obj).intValue(), coroutineContext), d) : ((dcq0) obj).n();
    }
}

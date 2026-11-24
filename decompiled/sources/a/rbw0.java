package a;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rbw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sbw0 f30210a;

    static {
        sbw0 sbw0Var;
        try {
            sbw0Var = xbw0.f40620a;
        } catch (NoClassDefFoundError unused) {
            sbw0Var = null;
        }
        if (sbw0Var == null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                String str = sbw0.f31958a[i];
                try {
                    sbw0Var = (sbw0) Class.forName(str).getConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    th = th;
                    sb.append('\n');
                    sb.append(str);
                    sb.append(": ");
                    if (th instanceof InvocationTargetException) {
                        th = th.getCause();
                    }
                    sb.append(th);
                }
            }
            throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
        }
        f30210a = sbw0Var;
    }
}

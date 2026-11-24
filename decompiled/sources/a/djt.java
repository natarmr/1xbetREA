package a;

/* JADX INFO: loaded from: classes2.dex */
public final class djt implements iq80 {
    static {
        if (rso.b == null) {
            synchronized (rso.class) {
                try {
                    if (rso.b == null) {
                        Class cls = nso.f24058a;
                        rso rsoVar = null;
                        if (cls != null) {
                            try {
                                rsoVar = (rso) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (rsoVar == null) {
                            rsoVar = rso.c;
                        }
                        rso.b = rsoVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}

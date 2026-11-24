package a;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class qso {
    public static volatile qso b;
    public static final qso c = new qso();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f29267a = Collections.EMPTY_MAP;

    public static qso a() {
        qso qsoVar;
        qso qsoVar2 = b;
        if (qsoVar2 != null) {
            return qsoVar2;
        }
        synchronized (qso.class) {
            try {
                qsoVar = b;
                if (qsoVar == null) {
                    Class cls = mso.f22329a;
                    qso qsoVar3 = null;
                    if (cls != null) {
                        try {
                            qsoVar3 = (qso) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    qsoVar = qsoVar3 != null ? qsoVar3 : c;
                    b = qsoVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qsoVar;
    }
}

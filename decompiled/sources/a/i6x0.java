package a;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class i6x0 {
    public static final i6x0 b = new i6x0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f14264a = new HashMap();

    public final synchronized void a(String str, fpw0 fpw0Var) {
        try {
            boolean zContainsKey = this.f14264a.containsKey(str);
            HashMap map = this.f14264a;
            if (!zContainsKey) {
                map.put(str, fpw0Var);
                return;
            }
            if (((fpw0) map.get(str)).equals(fpw0Var)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(this.f14264a.get(str)) + "), cannot insert " + String.valueOf(fpw0Var));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            a((String) entry.getKey(), (fpw0) entry.getValue());
        }
    }
}

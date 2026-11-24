package a;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hzw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y6x0 f13923a = new y6x0(zyw0.class, new vow0((byte) 24));
    public static final u6x0 b = new u6x0("type.googleapis.com/google.crypto.tink.AesSivKey", new qow0((byte) 24));
    public static final j5x0 c = new j5x0(uyw0.class, new cpw0((byte) 24));
    public static final e5x0 d = new e5x0("type.googleapis.com/google.crypto.tink.AesSivKey", new zow0((byte) 24));
    public static final Map e;

    static {
        HashMap map = new HashMap();
        map.put(drq.j, lpw0.e);
        map.put(drq.h, lpw0.c);
        map.put(drq.i, lpw0.f);
        e = Collections.unmodifiableMap(map);
    }

    public static drq a(lpw0 lpw0Var) throws GeneralSecurityException {
        drq drqVar = drq.i;
        if (lpw0Var == lpw0.e) {
            return drq.j;
        }
        if (lpw0Var == lpw0.c) {
            return drq.h;
        }
        if (lpw0Var == lpw0.f || lpw0Var == lpw0.d) {
            return drqVar;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(lpw0Var)));
    }
}

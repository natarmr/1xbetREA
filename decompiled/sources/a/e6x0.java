package a;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class e6x0 {
    public static final e6x0 b = new e6x0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f7309a = new ConcurrentHashMap();

    public final void a(zqw0 zqw0Var, Class cls) throws GeneralSecurityException {
        zqw0 zqw0Var2 = (zqw0) this.f7309a.putIfAbsent(cls, zqw0Var);
        if (zqw0Var2 == null || zqw0Var2.equals(zqw0Var)) {
            return;
        }
        hny.o("Different key creator for parameters class already inserted");
    }
}

package a;

import java.security.GeneralSecurityException;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class uow0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f36033a = new CopyOnWriteArrayList();

    public static i4x0 a(String str) throws GeneralSecurityException {
        for (i4x0 i4x0Var : f36033a) {
            i4x0Var.getClass();
            if (str.toLowerCase(Locale.US).startsWith("android-keystore://")) {
                return i4x0Var;
            }
        }
        throw new GeneralSecurityException(kng0.k("No KMS client does support: ", str));
    }
}

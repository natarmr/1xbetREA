package a;

import java.security.GeneralSecurityException;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rqy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f30954a = new CopyOnWriteArrayList();

    public static a03 a(String str) throws GeneralSecurityException {
        boolean zStartsWith;
        for (a03 a03Var : f30954a) {
            synchronized (a03Var) {
                zStartsWith = str.toLowerCase(Locale.US).startsWith("android-keystore://");
            }
            if (zStartsWith) {
                return a03Var;
            }
        }
        throw new GeneralSecurityException(kng0.k("No KMS client does support: ", str));
    }
}

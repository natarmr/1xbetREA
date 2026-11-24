package a;

import android.util.Base64;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qaw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SecureRandom f28418a = new SecureRandom();

    public static String a() {
        byte[] bArr = new byte[16];
        f28418a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
